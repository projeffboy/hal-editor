package ca.mcgill.emf.examples.hal.application;

import org.eclipse.emf.ecore.resource.Resource;

import ca.mcgill.emf.examples.hal.*;
import ca.mcgill.emf.examples.hal.util.*;
import ca.mcgill.emf.examples.hal.view.RoomPage;

public class HalApplication {

	private static Home home;
	private static String filename = "data/data.hal";
	
	public static void main(String[] args) {
		HalPackage.eINSTANCE.eClass();
		//?
		ResourceHelper.INSTANCE.addResourceFactory("hal", new HalResourceFactoryImpl());
		
		// start UI
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomPage().setVisible(true);
            }
        });
	}
	
	
	public static Home getHome() {
		if(home == null) {
			home = load();
		}
		return home;
	}
	
	public static void save() {
		ResourceHelper.INSTANCE.saveResource(home, filename);
	}
	
	public static Home load() {
		Home home;
		try {
			Resource resource = ResourceHelper.INSTANCE.loadResource(filename);
	        home = (Home) resource.getContents().get(0);
	    } catch (RuntimeException e) {
			// model cannot be loaded - create an empty Home
			home = HalFactory.eINSTANCE.createHome();
			home.setAddress("221B Baker Street");
			// default sensor types
			SensorType sT1 = HalFactory.eINSTANCE.createSensorType();
			sT1.setType("Temperature Sensor");
			home.getDeviceTypes().add(sT1);
			SensorType sT2 = HalFactory.eINSTANCE.createSensorType();
			sT2.setType("Movement Sensor");
			home.getDeviceTypes().add(sT2);
			SensorType sT3 = HalFactory.eINSTANCE.createSensorType();
			sT3.setType("Light Sensor");
			home.getDeviceTypes().add(sT3);
			// default actuator types
			ActuatorType aT1 = HalFactory.eINSTANCE.createActuatorType();
			aT1.setType("Heater");
			home.getDeviceTypes().add(aT1);
			ActuatorType aT2 = HalFactory.eINSTANCE.createActuatorType();
			aT2.setType("Lock");
			home.getDeviceTypes().add(aT2);
			ActuatorType aT3 = HalFactory.eINSTANCE.createActuatorType();
			aT3.setType("Light Switch");
			home.getDeviceTypes().add(aT3);
		}
		return home;
	}
}
