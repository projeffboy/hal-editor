/**
 */
package ca.mcgill.emf.examples.hal;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issued Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.IssuedCommand#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.IssuedCommand#getCommand <em>Command</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.IssuedCommand#getActuator <em>Actuator</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getIssuedCommand()
 * @model
 * @generated
 */
public interface IssuedCommand extends EObject {
	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getIssuedCommand_Timestamp()
	 * @model changeable="false"
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Returns the value of the '<em><b>Command</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.Command#getIssuedCommands <em>Issued Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' reference.
	 * @see #setCommand(Command)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getIssuedCommand_Command()
	 * @see ca.mcgill.emf.examples.hal.Command#getIssuedCommands
	 * @model opposite="issuedCommands" required="true"
	 * @generated
	 */
	Command getCommand();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.IssuedCommand#getCommand <em>Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' reference.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(Command value);

	/**
	 * Returns the value of the '<em><b>Actuator</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.Actuator#getIssuedCommands <em>Issued Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuator</em>' reference.
	 * @see #setActuator(Actuator)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getIssuedCommand_Actuator()
	 * @see ca.mcgill.emf.examples.hal.Actuator#getIssuedCommands
	 * @model opposite="issuedCommands" required="true"
	 * @generated
	 */
	Actuator getActuator();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.IssuedCommand#getActuator <em>Actuator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuator</em>' reference.
	 * @see #getActuator()
	 * @generated
	 */
	void setActuator(Actuator value);

} // IssuedCommand
