package ca.mcgill.emf.examples.hal.controller;

public class ToSensor extends ToDevice {
	private float measurementPeriodInSeconds;

	public ToSensor(String name, boolean active, String deviceType, float measurementPeriodInSeconds) {
		super(name, active, deviceType);
		this.measurementPeriodInSeconds = measurementPeriodInSeconds;
	}

	public float getMeasurementPeriodInSeconds() {
		return measurementPeriodInSeconds;
	}
}
