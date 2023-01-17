/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.Actuator#getActuatorType <em>Actuator Type</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Actuator#getIssuedCommands <em>Issued Commands</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getActuator()
 * @model
 * @generated
 */
public interface Actuator extends Device {
	/**
	 * Returns the value of the '<em><b>Actuator Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.ActuatorType#getActuators <em>Actuators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuator Type</em>' reference.
	 * @see #setActuatorType(ActuatorType)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getActuator_ActuatorType()
	 * @see ca.mcgill.emf.examples.hal.ActuatorType#getActuators
	 * @model opposite="actuators" required="true"
	 * @generated
	 */
	ActuatorType getActuatorType();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.Actuator#getActuatorType <em>Actuator Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuator Type</em>' reference.
	 * @see #getActuatorType()
	 * @generated
	 */
	void setActuatorType(ActuatorType value);

	/**
	 * Returns the value of the '<em><b>Issued Commands</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.IssuedCommand}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.IssuedCommand#getActuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issued Commands</em>' reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getActuator_IssuedCommands()
	 * @see ca.mcgill.emf.examples.hal.IssuedCommand#getActuator
	 * @model opposite="actuator"
	 * @generated
	 */
	EList<IssuedCommand> getIssuedCommands();

} // Actuator
