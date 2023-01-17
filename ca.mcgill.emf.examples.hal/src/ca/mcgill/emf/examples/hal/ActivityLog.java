/**
 */
package ca.mcgill.emf.examples.hal;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Log</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.ActivityLog#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.ActivityLog#getReadings <em>Readings</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.ActivityLog#getIssuedCommands <em>Issued Commands</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.ActivityLog#getTriggeredRules <em>Triggered Rules</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getActivityLog()
 * @model
 * @generated
 */
public interface ActivityLog extends EObject {
	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getActivityLog_Timestamp()
	 * @model changeable="false"
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Returns the value of the '<em><b>Readings</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.Reading}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readings</em>' containment reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getActivityLog_Readings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reading> getReadings();

	/**
	 * Returns the value of the '<em><b>Issued Commands</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.IssuedCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issued Commands</em>' containment reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getActivityLog_IssuedCommands()
	 * @model containment="true"
	 * @generated
	 */
	EList<IssuedCommand> getIssuedCommands();

	/**
	 * Returns the value of the '<em><b>Triggered Rules</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.TriggeredRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggered Rules</em>' containment reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getActivityLog_TriggeredRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<TriggeredRule> getTriggeredRules();

} // ActivityLog
