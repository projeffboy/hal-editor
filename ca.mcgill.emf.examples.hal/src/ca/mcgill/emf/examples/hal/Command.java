/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.Command#getName <em>Name</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Command#getActions <em>Actions</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Command#getIssuedCommands <em>Issued Commands</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getCommand_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.Command#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.Action}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.Action#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getCommand_Actions()
	 * @see ca.mcgill.emf.examples.hal.Action#getCommands
	 * @model opposite="commands"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Issued Commands</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.IssuedCommand}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.IssuedCommand#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issued Commands</em>' reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getCommand_IssuedCommands()
	 * @see ca.mcgill.emf.examples.hal.IssuedCommand#getCommand
	 * @model opposite="command"
	 * @generated
	 */
	EList<IssuedCommand> getIssuedCommands();

} // Command
