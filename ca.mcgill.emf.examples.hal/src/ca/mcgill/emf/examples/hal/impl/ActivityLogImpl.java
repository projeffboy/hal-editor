/**
 */
package ca.mcgill.emf.examples.hal.impl;

import ca.mcgill.emf.examples.hal.ActivityLog;
import ca.mcgill.emf.examples.hal.HalPackage;
import ca.mcgill.emf.examples.hal.IssuedCommand;
import ca.mcgill.emf.examples.hal.Reading;
import ca.mcgill.emf.examples.hal.TriggeredRule;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Log</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.ActivityLogImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.ActivityLogImpl#getReadings <em>Readings</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.ActivityLogImpl#getIssuedCommands <em>Issued Commands</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.ActivityLogImpl#getTriggeredRules <em>Triggered Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityLogImpl extends MinimalEObjectImpl.Container implements ActivityLog {
	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected Date timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReadings() <em>Readings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadings()
	 * @generated
	 * @ordered
	 */
	protected EList<Reading> readings;

	/**
	 * The cached value of the '{@link #getIssuedCommands() <em>Issued Commands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuedCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<IssuedCommand> issuedCommands;

	/**
	 * The cached value of the '{@link #getTriggeredRules() <em>Triggered Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggeredRules()
	 * @generated
	 * @ordered
	 */
	protected EList<TriggeredRule> triggeredRules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityLogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.ACTIVITY_LOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reading> getReadings() {
		if (readings == null) {
			readings = new EObjectContainmentEList<Reading>(Reading.class, this, HalPackage.ACTIVITY_LOG__READINGS);
		}
		return readings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IssuedCommand> getIssuedCommands() {
		if (issuedCommands == null) {
			issuedCommands = new EObjectContainmentEList<IssuedCommand>(IssuedCommand.class, this,
					HalPackage.ACTIVITY_LOG__ISSUED_COMMANDS);
		}
		return issuedCommands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TriggeredRule> getTriggeredRules() {
		if (triggeredRules == null) {
			triggeredRules = new EObjectContainmentEList<TriggeredRule>(TriggeredRule.class, this,
					HalPackage.ACTIVITY_LOG__TRIGGERED_RULES);
		}
		return triggeredRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HalPackage.ACTIVITY_LOG__READINGS:
			return ((InternalEList<?>) getReadings()).basicRemove(otherEnd, msgs);
		case HalPackage.ACTIVITY_LOG__ISSUED_COMMANDS:
			return ((InternalEList<?>) getIssuedCommands()).basicRemove(otherEnd, msgs);
		case HalPackage.ACTIVITY_LOG__TRIGGERED_RULES:
			return ((InternalEList<?>) getTriggeredRules()).basicRemove(otherEnd, msgs);
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
		case HalPackage.ACTIVITY_LOG__TIMESTAMP:
			return getTimestamp();
		case HalPackage.ACTIVITY_LOG__READINGS:
			return getReadings();
		case HalPackage.ACTIVITY_LOG__ISSUED_COMMANDS:
			return getIssuedCommands();
		case HalPackage.ACTIVITY_LOG__TRIGGERED_RULES:
			return getTriggeredRules();
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
		case HalPackage.ACTIVITY_LOG__READINGS:
			getReadings().clear();
			getReadings().addAll((Collection<? extends Reading>) newValue);
			return;
		case HalPackage.ACTIVITY_LOG__ISSUED_COMMANDS:
			getIssuedCommands().clear();
			getIssuedCommands().addAll((Collection<? extends IssuedCommand>) newValue);
			return;
		case HalPackage.ACTIVITY_LOG__TRIGGERED_RULES:
			getTriggeredRules().clear();
			getTriggeredRules().addAll((Collection<? extends TriggeredRule>) newValue);
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
		case HalPackage.ACTIVITY_LOG__READINGS:
			getReadings().clear();
			return;
		case HalPackage.ACTIVITY_LOG__ISSUED_COMMANDS:
			getIssuedCommands().clear();
			return;
		case HalPackage.ACTIVITY_LOG__TRIGGERED_RULES:
			getTriggeredRules().clear();
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
		case HalPackage.ACTIVITY_LOG__TIMESTAMP:
			return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
		case HalPackage.ACTIVITY_LOG__READINGS:
			return readings != null && !readings.isEmpty();
		case HalPackage.ACTIVITY_LOG__ISSUED_COMMANDS:
			return issuedCommands != null && !issuedCommands.isEmpty();
		case HalPackage.ACTIVITY_LOG__TRIGGERED_RULES:
			return triggeredRules != null && !triggeredRules.isEmpty();
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
		result.append(" (timestamp: ");
		result.append(timestamp);
		result.append(')');
		return result.toString();
	}

} //ActivityLogImpl
