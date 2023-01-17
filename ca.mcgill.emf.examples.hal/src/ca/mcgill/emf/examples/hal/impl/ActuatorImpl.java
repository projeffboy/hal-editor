/**
 */
package ca.mcgill.emf.examples.hal.impl;

import ca.mcgill.emf.examples.hal.Actuator;
import ca.mcgill.emf.examples.hal.ActuatorType;
import ca.mcgill.emf.examples.hal.HalPackage;
import ca.mcgill.emf.examples.hal.IssuedCommand;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.ActuatorImpl#getActuatorType <em>Actuator Type</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.ActuatorImpl#getIssuedCommands <em>Issued Commands</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActuatorImpl extends DeviceImpl implements Actuator {
	/**
	 * The cached value of the '{@link #getActuatorType() <em>Actuator Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuatorType()
	 * @generated
	 * @ordered
	 */
	protected ActuatorType actuatorType;

	/**
	 * The cached value of the '{@link #getIssuedCommands() <em>Issued Commands</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuedCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<IssuedCommand> issuedCommands;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActuatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.ACTUATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActuatorType getActuatorType() {
		if (actuatorType != null && actuatorType.eIsProxy()) {
			InternalEObject oldActuatorType = (InternalEObject) actuatorType;
			actuatorType = (ActuatorType) eResolveProxy(oldActuatorType);
			if (actuatorType != oldActuatorType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.ACTUATOR__ACTUATOR_TYPE,
							oldActuatorType, actuatorType));
			}
		}
		return actuatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuatorType basicGetActuatorType() {
		return actuatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActuatorType(ActuatorType newActuatorType, NotificationChain msgs) {
		ActuatorType oldActuatorType = actuatorType;
		actuatorType = newActuatorType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					HalPackage.ACTUATOR__ACTUATOR_TYPE, oldActuatorType, newActuatorType);
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
	public void setActuatorType(ActuatorType newActuatorType) {
		if (newActuatorType != actuatorType) {
			NotificationChain msgs = null;
			if (actuatorType != null)
				msgs = ((InternalEObject) actuatorType).eInverseRemove(this, HalPackage.ACTUATOR_TYPE__ACTUATORS,
						ActuatorType.class, msgs);
			if (newActuatorType != null)
				msgs = ((InternalEObject) newActuatorType).eInverseAdd(this, HalPackage.ACTUATOR_TYPE__ACTUATORS,
						ActuatorType.class, msgs);
			msgs = basicSetActuatorType(newActuatorType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.ACTUATOR__ACTUATOR_TYPE, newActuatorType,
					newActuatorType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IssuedCommand> getIssuedCommands() {
		if (issuedCommands == null) {
			issuedCommands = new EObjectWithInverseResolvingEList<IssuedCommand>(IssuedCommand.class, this,
					HalPackage.ACTUATOR__ISSUED_COMMANDS, HalPackage.ISSUED_COMMAND__ACTUATOR);
		}
		return issuedCommands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HalPackage.ACTUATOR__ACTUATOR_TYPE:
			if (actuatorType != null)
				msgs = ((InternalEObject) actuatorType).eInverseRemove(this, HalPackage.ACTUATOR_TYPE__ACTUATORS,
						ActuatorType.class, msgs);
			return basicSetActuatorType((ActuatorType) otherEnd, msgs);
		case HalPackage.ACTUATOR__ISSUED_COMMANDS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIssuedCommands()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HalPackage.ACTUATOR__ACTUATOR_TYPE:
			return basicSetActuatorType(null, msgs);
		case HalPackage.ACTUATOR__ISSUED_COMMANDS:
			return ((InternalEList<?>) getIssuedCommands()).basicRemove(otherEnd, msgs);
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
		case HalPackage.ACTUATOR__ACTUATOR_TYPE:
			if (resolve)
				return getActuatorType();
			return basicGetActuatorType();
		case HalPackage.ACTUATOR__ISSUED_COMMANDS:
			return getIssuedCommands();
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
		case HalPackage.ACTUATOR__ACTUATOR_TYPE:
			setActuatorType((ActuatorType) newValue);
			return;
		case HalPackage.ACTUATOR__ISSUED_COMMANDS:
			getIssuedCommands().clear();
			getIssuedCommands().addAll((Collection<? extends IssuedCommand>) newValue);
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
		case HalPackage.ACTUATOR__ACTUATOR_TYPE:
			setActuatorType((ActuatorType) null);
			return;
		case HalPackage.ACTUATOR__ISSUED_COMMANDS:
			getIssuedCommands().clear();
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
		case HalPackage.ACTUATOR__ACTUATOR_TYPE:
			return actuatorType != null;
		case HalPackage.ACTUATOR__ISSUED_COMMANDS:
			return issuedCommands != null && !issuedCommands.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActuatorImpl
