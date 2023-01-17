/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.Action#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Commands</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.Command}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.Command#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getAction_Commands()
	 * @see ca.mcgill.emf.examples.hal.Command#getActions
	 * @model opposite="actions" required="true"
	 * @generated
	 */
	EList<Command> getCommands();

} // Action
