/**
 */
package ca.mcgill.emf.examples.hal;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Triggered Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.TriggeredRule#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.TriggeredRule#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getTriggeredRule()
 * @model
 * @generated
 */
public interface TriggeredRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getTriggeredRule_Timestamp()
	 * @model changeable="false"
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.Rule#getTriggeredRules <em>Triggered Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' reference.
	 * @see #setRule(Rule)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getTriggeredRule_Rule()
	 * @see ca.mcgill.emf.examples.hal.Rule#getTriggeredRules
	 * @model opposite="triggeredRules" required="true"
	 * @generated
	 */
	Rule getRule();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.TriggeredRule#getRule <em>Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(Rule value);

} // TriggeredRule
