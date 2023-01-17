/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.Sensor#getReadings <em>Readings</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Sensor#getMeasurementPeriodInSeconds <em>Measurement Period In Seconds</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Sensor#getTerms <em>Terms</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Sensor#getSensorType <em>Sensor Type</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends Device {
	/**
	 * Returns the value of the '<em><b>Readings</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.Reading}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.Reading#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readings</em>' reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getSensor_Readings()
	 * @see ca.mcgill.emf.examples.hal.Reading#getSensor
	 * @model opposite="sensor"
	 * @generated
	 */
	EList<Reading> getReadings();

	/**
	 * Returns the value of the '<em><b>Measurement Period In Seconds</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Period In Seconds</em>' attribute.
	 * @see #setMeasurementPeriodInSeconds(float)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getSensor_MeasurementPeriodInSeconds()
	 * @model default="1" unique="false"
	 * @generated
	 */
	float getMeasurementPeriodInSeconds();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.Sensor#getMeasurementPeriodInSeconds <em>Measurement Period In Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Period In Seconds</em>' attribute.
	 * @see #getMeasurementPeriodInSeconds()
	 * @generated
	 */
	void setMeasurementPeriodInSeconds(float value);

	/**
	 * Returns the value of the '<em><b>Terms</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.Term}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.Term#getLhsSensor <em>Lhs Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terms</em>' reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getSensor_Terms()
	 * @see ca.mcgill.emf.examples.hal.Term#getLhsSensor
	 * @model opposite="lhsSensor"
	 * @generated
	 */
	EList<Term> getTerms();

	/**
	 * Returns the value of the '<em><b>Sensor Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.SensorType#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Type</em>' reference.
	 * @see #setSensorType(SensorType)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getSensor_SensorType()
	 * @see ca.mcgill.emf.examples.hal.SensorType#getSensors
	 * @model opposite="sensors" required="true"
	 * @generated
	 */
	SensorType getSensorType();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.Sensor#getSensorType <em>Sensor Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Type</em>' reference.
	 * @see #getSensorType()
	 * @generated
	 */
	void setSensorType(SensorType value);

} // Sensor
