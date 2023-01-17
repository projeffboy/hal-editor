/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Home</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.Home#getAddress <em>Address</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Home#getRooms <em>Rooms</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Home#getRules <em>Rules</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Home#getActivityLog <em>Activity Log</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Home#getDeviceTypes <em>Device Types</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Home#getDevices <em>Devices</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getHome()
 * @model
 * @generated
 */
public interface Home extends EObject {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getHome_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.Home#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.Room}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' containment reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getHome_Rooms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Room> getRooms();

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.Rule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getHome_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getRules();

	/**
	 * Returns the value of the '<em><b>Activity Log</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Log</em>' containment reference.
	 * @see #setActivityLog(ActivityLog)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getHome_ActivityLog()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ActivityLog getActivityLog();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.Home#getActivityLog <em>Activity Log</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Log</em>' containment reference.
	 * @see #getActivityLog()
	 * @generated
	 */
	void setActivityLog(ActivityLog value);

	/**
	 * Returns the value of the '<em><b>Device Types</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.DeviceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Types</em>' containment reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getHome_DeviceTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeviceType> getDeviceTypes();

	/**
	 * Returns the value of the '<em><b>Devices</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.Device}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devices</em>' containment reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getHome_Devices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Device> getDevices();

} // Home
