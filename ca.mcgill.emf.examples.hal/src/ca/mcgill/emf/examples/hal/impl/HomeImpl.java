/**
 */
package ca.mcgill.emf.examples.hal.impl;

import ca.mcgill.emf.examples.hal.ActivityLog;
import ca.mcgill.emf.examples.hal.Device;
import ca.mcgill.emf.examples.hal.DeviceType;
import ca.mcgill.emf.examples.hal.HalPackage;
import ca.mcgill.emf.examples.hal.Home;
import ca.mcgill.emf.examples.hal.Room;
import ca.mcgill.emf.examples.hal.Rule;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Home</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.HomeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.HomeImpl#getRooms <em>Rooms</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.HomeImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.HomeImpl#getActivityLog <em>Activity Log</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.HomeImpl#getDeviceTypes <em>Device Types</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.HomeImpl#getDevices <em>Devices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HomeImpl extends MinimalEObjectImpl.Container implements Home {
	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRooms() <em>Rooms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> rooms;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> rules;

	/**
	 * The cached value of the '{@link #getActivityLog() <em>Activity Log</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityLog()
	 * @generated
	 * @ordered
	 */
	protected ActivityLog activityLog;

	/**
	 * The cached value of the '{@link #getDeviceTypes() <em>Device Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceType> deviceTypes;

	/**
	 * The cached value of the '{@link #getDevices() <em>Devices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> devices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HomeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.HOME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.HOME__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Room> getRooms() {
		if (rooms == null) {
			rooms = new EObjectContainmentEList<Room>(Room.class, this, HalPackage.HOME__ROOMS);
		}
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Rule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<Rule>(Rule.class, this, HalPackage.HOME__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityLog getActivityLog() {
		return activityLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivityLog(ActivityLog newActivityLog, NotificationChain msgs) {
		ActivityLog oldActivityLog = activityLog;
		activityLog = newActivityLog;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					HalPackage.HOME__ACTIVITY_LOG, oldActivityLog, newActivityLog);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivityLog(ActivityLog newActivityLog) {
		if (newActivityLog != activityLog) {
			NotificationChain msgs = null;
			if (activityLog != null)
				msgs = ((InternalEObject) activityLog).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - HalPackage.HOME__ACTIVITY_LOG, null, msgs);
			if (newActivityLog != null)
				msgs = ((InternalEObject) newActivityLog).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - HalPackage.HOME__ACTIVITY_LOG, null, msgs);
			msgs = basicSetActivityLog(newActivityLog, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.HOME__ACTIVITY_LOG, newActivityLog,
					newActivityLog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceType> getDeviceTypes() {
		if (deviceTypes == null) {
			deviceTypes = new EObjectContainmentEList<DeviceType>(DeviceType.class, this,
					HalPackage.HOME__DEVICE_TYPES);
		}
		return deviceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Device> getDevices() {
		if (devices == null) {
			devices = new EObjectContainmentEList<Device>(Device.class, this, HalPackage.HOME__DEVICES);
		}
		return devices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HalPackage.HOME__ROOMS:
			return ((InternalEList<?>) getRooms()).basicRemove(otherEnd, msgs);
		case HalPackage.HOME__RULES:
			return ((InternalEList<?>) getRules()).basicRemove(otherEnd, msgs);
		case HalPackage.HOME__ACTIVITY_LOG:
			return basicSetActivityLog(null, msgs);
		case HalPackage.HOME__DEVICE_TYPES:
			return ((InternalEList<?>) getDeviceTypes()).basicRemove(otherEnd, msgs);
		case HalPackage.HOME__DEVICES:
			return ((InternalEList<?>) getDevices()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HalPackage.HOME__ADDRESS:
			return getAddress();
		case HalPackage.HOME__ROOMS:
			return getRooms();
		case HalPackage.HOME__RULES:
			return getRules();
		case HalPackage.HOME__ACTIVITY_LOG:
			return getActivityLog();
		case HalPackage.HOME__DEVICE_TYPES:
			return getDeviceTypes();
		case HalPackage.HOME__DEVICES:
			return getDevices();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case HalPackage.HOME__ADDRESS:
			setAddress((String) newValue);
			return;
		case HalPackage.HOME__ROOMS:
			getRooms().clear();
			getRooms().addAll((Collection<? extends Room>) newValue);
			return;
		case HalPackage.HOME__RULES:
			getRules().clear();
			getRules().addAll((Collection<? extends Rule>) newValue);
			return;
		case HalPackage.HOME__ACTIVITY_LOG:
			setActivityLog((ActivityLog) newValue);
			return;
		case HalPackage.HOME__DEVICE_TYPES:
			getDeviceTypes().clear();
			getDeviceTypes().addAll((Collection<? extends DeviceType>) newValue);
			return;
		case HalPackage.HOME__DEVICES:
			getDevices().clear();
			getDevices().addAll((Collection<? extends Device>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case HalPackage.HOME__ADDRESS:
			setAddress(ADDRESS_EDEFAULT);
			return;
		case HalPackage.HOME__ROOMS:
			getRooms().clear();
			return;
		case HalPackage.HOME__RULES:
			getRules().clear();
			return;
		case HalPackage.HOME__ACTIVITY_LOG:
			setActivityLog((ActivityLog) null);
			return;
		case HalPackage.HOME__DEVICE_TYPES:
			getDeviceTypes().clear();
			return;
		case HalPackage.HOME__DEVICES:
			getDevices().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case HalPackage.HOME__ADDRESS:
			return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
		case HalPackage.HOME__ROOMS:
			return rooms != null && !rooms.isEmpty();
		case HalPackage.HOME__RULES:
			return rules != null && !rules.isEmpty();
		case HalPackage.HOME__ACTIVITY_LOG:
			return activityLog != null;
		case HalPackage.HOME__DEVICE_TYPES:
			return deviceTypes != null && !deviceTypes.isEmpty();
		case HalPackage.HOME__DEVICES:
			return devices != null && !devices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (address: ");
		result.append(address);
		result.append(')');
		return result.toString();
	}

} //HomeImpl
