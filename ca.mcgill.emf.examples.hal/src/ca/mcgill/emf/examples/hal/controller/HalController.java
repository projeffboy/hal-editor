package ca.mcgill.emf.examples.hal.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ca.mcgill.emf.examples.hal.*;
import ca.mcgill.emf.examples.hal.application.HalApplication;

public class HalController {

    public static String addRoom(String roomName) {
		if (isStringInvalid(roomName)) {
			return "Error: Room name must be specified.";
		}
		if (existsRoom(roomName)) {
			return "Error: Room with name " + roomName + " already exists.";
		}
		
		Home home = HalApplication.getHome();
        Room r = HalFactory.eINSTANCE.createRoom();
        r.setName(roomName);
		home.getRooms().add(r);
		
		HalApplication.save();
		
		return null;
	}
	
	public static String updateRoomName(String oldRoomName, String newRoomName) {
        if (isStringInvalid(newRoomName)) {
        	return "Error: Room name must be specified.";
        }
		if (!existsRoom(oldRoomName)) {
			return "Error: Room with name " + oldRoomName + " does not exist.";
		}
		if (oldRoomName.equals(newRoomName)) {
			return "Error: Both names are the same";
		}
		if (existsRoom(newRoomName)) {
			return "Error: Room with name " + newRoomName + " already exists.";
		}
		
		Room r = findRoom(oldRoomName);
		if (r != null) {			
			r.setName(newRoomName);
			Home home = HalApplication.getHome();
			home.getRooms().add(r);
			
			HalApplication.save();
		}
		
		return null;
	}
	
	public static ToRoom getRoom(String roomName) {
		ToRoom result = null;
		
		Room r = findRoom(roomName);
		if (r != null) {
			HashSet<String> sensorTypes = new HashSet<String>();
			HashSet<String> actuatorTypes = new HashSet<String>();
			
			ArrayList<ToSensor> sensors = new ArrayList<ToSensor>();
			for (Sensor s : getSensors(r)) {
				String type = s.getSensorType().getType();
				sensors.add(
					new ToSensor(s.getName(), s.isActive(), type, s.getMeasurementPeriodInSeconds())
				);
				sensorTypes.add(type);
			}
			
			ArrayList<ToActuator> actuators = new ArrayList<ToActuator>();
			for (Actuator a : getActuators(r)) {
				String type = a.getActuatorType().getType();
				actuators.add(new ToActuator(a.getName(), a.isActive(), a.getActuatorType().getType()));
				actuatorTypes.add(type);
			}
			
			result = new ToRoom(roomName, sensorTypes, actuatorTypes, sensors, actuators);
		}
		
		return result;
	}
	
	public static List<String> getRooms() {
		ArrayList<String> roomNames = new ArrayList<String>();
		Home home = HalApplication.getHome();
		
		for (Room r : home.getRooms()) {
			roomNames.add(r.getName());
		}
		
		return roomNames;
	}

	public static String deleteRoom(String roomName) {
		
		Home home = HalApplication.getHome();
		Room r = findRoom(roomName);

		// If r is not found, no error message is returned because the end result is the same:
		// The room with roomName does not exist
		if (r != null) {
			// Delete all devices from r
			while (!r.getDevices().isEmpty()) {
				Device d = r.getDevices().get(0);
				d.setRoom(null);
				if (d instanceof Sensor) {
					((Sensor)d).setSensorType(null);
				} else if (d instanceof Actuator) {
					((Actuator)d).setActuatorType(null);
				}
				r.getDevices().remove(d);
				home.getDevices().remove(d); // NOTE: account for readings and issued commands in the future
			}
			
			// Remove room
			home.getRooms().remove(r);
			
			HalApplication.save();
		}
		return null;
	}
	
	public static String addSensorType(String type) {
		return addDeviceType(type, true);
	}
	public static String addActuatorType(String type) {
		return addDeviceType(type, false);
	}
	
	
	public static String addSensor(
		String deviceName, String deviceType, boolean isActive, String roomName, float measurementPeriodInSeconds
	) {
		return addSensorHelper(deviceName, deviceType, isActive, roomName, true, measurementPeriodInSeconds);
	}
	
	public static String addSensor(String deviceName, String deviceType, boolean isActive, String roomName) {
		return addSensorHelper(deviceName, deviceType, isActive, roomName, false, 1);
	}
	
	public static String addActuator(String deviceName, String deviceType, boolean isActive, String roomName) {
		if (isStringInvalid(roomName)) {
			return "Error: Room name must be specified.";
		}
		if (isStringInvalid(deviceType)) {
			return "Error: Device type must be specified.";
		}
		if (isStringInvalid(deviceName)) {
			return "Error: Device name must be specified.";
		}
		if (existsDevice(deviceName)) {
			return "Error: Device with name " + deviceName + " already exists.";
		}
		if (!existsRoom(roomName)) {
			return "Error: Room with name " + roomName + " does not exist.";
		}
		if (!existsDeviceType(deviceType)) {
			return "Error: Device type " + deviceType + " does not exist";
		}

		Room r = findRoom(roomName);
		DeviceType dT = findDeviceType(deviceType);

		if (dT instanceof SensorType) {
			return "Error: Cannot assign sensor type to actuator";
		}

		if (r != null && dT != null) {
			Device d = HalFactory.eINSTANCE.createActuator();

			((Actuator)d).setActuatorType((ActuatorType)dT);
			d.setName(deviceName);
			d.setActive(isActive);
			d.setRoom(r);
			  
			Home home = HalApplication.getHome();
			home.getDevices().add(d);
			  
			HalApplication.save();			
		}

		return null;
	}
	
	public static String deleteDeviceType(String type) {
		if (isStringInvalid(type)) {
			return "Error: Device name must be specified.";
		}
		
		DeviceType dT = findDeviceType(type);
		if (dT != null) {
			if (dT instanceof SensorType) {
				SensorType sT = (SensorType)dT;
				if (sT.getSensors().size() > 0) {
					return "Error: There are still devices with this device type";
				}
			} else if (dT instanceof ActuatorType) {
				ActuatorType aT = (ActuatorType)dT;
				if (aT.getActuators().size() > 0) {
					return "Error: There are still devices with this device type";
				}
			}
			Home home = HalApplication.getHome();
			home.getDeviceTypes().remove(dT);
			
			HalApplication.save();	
		}
		
		return null;
	}
	
	public static String deleteDevice(String roomName, String deviceName) {
		if (isStringInvalid(roomName)) {
			return "Error: Room name must be specified.";
		}
		if (isStringInvalid(deviceName)) {
			return "Error: Device name must be specified.";
		}
		
		Room r = findRoom(roomName);
		if (r != null) {
			Device d = findDevice(r, deviceName);
			if (d != null) {
				Home home = HalApplication.getHome();
				
				if (d instanceof Sensor) {
					((Sensor)d).setSensorType(null);
					// TODO: clear readings if we add the functionality in the future
				} else if (d instanceof Actuator) {
					((Actuator)d).setActuatorType(null);
					// TODO: clear issued commands if we add the functionality in the future
				}
				r.getDevices().remove(d);
				home.getDevices().remove(d);
				
				HalApplication.save();
			}
		}
		
		return null;
	}
	
	
	// HELPER METHODS
	private static boolean isStringInvalid(String s) {
		return s == null || s.length() == 0;
	}
	
	private static boolean existsRoom(String roomName) {
		return findRoom(roomName) != null;
	}
	
	private static Room findRoom(String roomName) {
		Home home = HalApplication.getHome();
		for (Room r : home.getRooms()) {
			if (r.getName().equals(roomName)) {
				return r;
			}
		}
		return null;
	}
	
	private static boolean existsDeviceType(String type) {
		return findDeviceType(type) != null;
	}
	
	private static DeviceType findDeviceType(String type) {
		Home home = HalApplication.getHome();
		for (DeviceType dT : home.getDeviceTypes()) {
			if (dT.getType().equals(type)) {
				return dT;
			}
		}
		return null;
	}
	
	private static boolean existsDevice(String name) {
		return findDevice(name) != null;
	}
	
	private static Device findDevice(String name) {
		Home home = HalApplication.getHome();
		for (Device d : home.getDevices()) {
			if (d.getName().equals(name)) {
				return d;
			}
		}
		return null;
	}
	
	private static Device findDevice(Room room, String deviceName) {
		for (Device d : room.getDevices()) {
			if (d.getName().equals(deviceName)) {
				return d;
			}
		}
		return null;
	}
	
	private static String addDeviceType(String type, boolean sensorInsteadOfActuator) {
		if (isStringInvalid(type)) {
			return "Error: Device type name must be specified.";
		}
		if (existsDeviceType(type)) {
			return "Error: Device type \"" + type + "\" already exists.";
		}
		
		Home home = HalApplication.getHome();
        DeviceType deviceType;
        if (sensorInsteadOfActuator) {
        	deviceType = HalFactory.eINSTANCE.createSensorType();
        } else {
        	deviceType = HalFactory.eINSTANCE.createActuatorType();
        }
        deviceType.setType(type);
		home.getDeviceTypes().add(deviceType);
		
		HalApplication.save();
		
		return null;
	}
	
	public static Set<String> getSensorTypes() {
		Set<String> sensorTypes = new HashSet<String>();
		Home home = HalApplication.getHome();
		for (DeviceType dt : home.getDeviceTypes()) {
			if (dt instanceof SensorType) {
				sensorTypes.add(dt.getType());
			}
		}
		return sensorTypes;
	}
	
	public static Set<String> getActuatorTypes() {
		Set<String> actuatorTypes = new HashSet<String>();
		Home home = HalApplication.getHome();
		for (DeviceType dt : home.getDeviceTypes()) {
			if (dt instanceof ActuatorType) {
				actuatorTypes.add(dt.getType());
			}
		}
		return actuatorTypes;
	}
	
	private static String addSensorHelper(
		String deviceName,
		String deviceType,
		boolean isActive,
		String roomName,
		boolean periodSpecified,
		float measurementPeriodInSeconds
	) {
		if (isStringInvalid(roomName)) {
			return "Error: Room name must be specified.";
		}
		if (isStringInvalid(deviceType)) {
			return "Error: Device type must be specified.";
		}
		if (isStringInvalid(deviceName)) {
			return "Error: Device name must be specified.";
		}
		if (existsDevice(deviceName)) {
			return "Error: Device with name " + deviceName + " already exists.";
		}
		if (periodSpecified && measurementPeriodInSeconds <= 0) {
			return "Error: Period has to be greater than 0";
		}
		if (!existsRoom(roomName)) {
			return "Error: Room with name " + roomName + " does not exist.";
		}
		if (!existsDeviceType(deviceType)) {
			return "Error: Device type " + deviceType + " does not exist";
		}

		Room r = findRoom(roomName);
		DeviceType dT = findDeviceType(deviceType);

		if (dT instanceof ActuatorType) {
			return "Error: Cannot assign actuator type to sensor";
		}

		if (r != null) {
			Device d = HalFactory.eINSTANCE.createSensor();
		
			if (dT != null) {
				((Sensor)d).setSensorType((SensorType)dT);
				d.setName(deviceName);
				d.setActive(isActive);
				d.setRoom(r);
				if (periodSpecified) {
					((Sensor)d).setMeasurementPeriodInSeconds(measurementPeriodInSeconds);
				}
				Home home = HalApplication.getHome();
				home.getDevices().add(d);
				
				HalApplication.save();
			}
		}

		return null;
	}
	
	private static ArrayList<Sensor> getSensors(Room room) {
		ArrayList<Sensor> sensors = new ArrayList<Sensor>();
		for (Device d : room.getDevices()) {
			if (d instanceof Sensor) {
				sensors.add((Sensor)d);
			}
		}
		return sensors;
	}
	
	private static ArrayList<Actuator> getActuators(Room room) {
		ArrayList<Actuator> actuators = new ArrayList<Actuator>();
		for (Device d : room.getDevices()) {
			if (d instanceof Actuator) {
				actuators.add((Actuator)d);
			}
		}
		return actuators;
	}
}
