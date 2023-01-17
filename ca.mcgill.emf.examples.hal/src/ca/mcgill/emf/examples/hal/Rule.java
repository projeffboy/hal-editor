/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.Rule#getName <em>Name</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Rule#isActive <em>Active</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Rule#getPassword <em>Password</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Rule#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Rule#getAction <em>Action</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Rule#getTriggeredRules <em>Triggered Rules</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getRule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.Rule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(boolean)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getRule_Active()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.Rule#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getRule_Password()
	 * @model unique="false"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.Rule#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' containment reference.
	 * @see #setPrecondition(Precondition)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getRule_Precondition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Precondition getPrecondition();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.Rule#getPrecondition <em>Precondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition</em>' containment reference.
	 * @see #getPrecondition()
	 * @generated
	 */
	void setPrecondition(Precondition value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(Action)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getRule_Action()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.Rule#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Triggered Rules</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.TriggeredRule}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.TriggeredRule#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggered Rules</em>' reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getRule_TriggeredRules()
	 * @see ca.mcgill.emf.examples.hal.TriggeredRule#getRule
	 * @model opposite="rule"
	 * @generated
	 */
	EList<TriggeredRule> getTriggeredRules();

} // Rule
