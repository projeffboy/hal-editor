package ca.mcgill.emf.examples.hal.controller;

public abstract class ToDevice {
	private String name;
	private boolean active;
	private String deviceType;
	
	public ToDevice(String name, boolean active, String deviceType) {
		this.name = name;
		this.active = active;
		this.deviceType = deviceType;
	}
	
	public String getName() {
		return name;
	}

	public boolean isActive() {
		return active;
	}
	
	public String deviceType() {
		return deviceType;
	}
}
