package ca.mcgill.emf.examples.hal.controller;

import java.util.List;
import java.util.Set;

public class ToRoom {
	// for strict interpretation of MVC where view can't see model
	
	private String name;
	private Set<String> sensorTypes;
	private Set<String> actuatorTypes;
	private List<ToSensor> sensors;
	private List<ToActuator> actuators;

	public ToRoom(
		String name,
		Set<String> sensorTypes,
		Set<String> actuatorTypes,
		List<ToSensor> sensors,
		List<ToActuator> actuators
	) {
		super();
		this.name = name;
		this.sensorTypes = sensorTypes;
		this.actuatorTypes = actuatorTypes;
		this.sensors = sensors;
		this.actuators = actuators;
	}

	public String getName() {
		return name;
	}
	
	public Set<String> getSensorTypes() {
		return sensorTypes;
	}
	

	public Set<String> getActuatorTypes() {
		return actuatorTypes;
	}
	
	
	public List<ToSensor> getSensors() {
		return sensors;
	}

	public List<ToActuator> getActuators() {
		return actuators;
	}
}
