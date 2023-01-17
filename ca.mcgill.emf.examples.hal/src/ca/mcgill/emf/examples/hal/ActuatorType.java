/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.ActuatorType#getActuators <em>Actuators</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.ActuatorType#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getActuatorType()
 * @model
 * @generated
 */
public interface ActuatorType extends DeviceType {
	/**
	 * Returns the value of the '<em><b>Actuators</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.Actuator}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.Actuator#getActuatorType <em>Actuator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuators</em>' reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getActuatorType_Actuators()
	 * @see ca.mcgill.emf.examples.hal.Actuator#getActuatorType
	 * @model opposite="actuatorType"
	 * @generated
	 */
	EList<Actuator> getActuators();

	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getActuatorType_Commands()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getCommands();

} // ActuatorType
