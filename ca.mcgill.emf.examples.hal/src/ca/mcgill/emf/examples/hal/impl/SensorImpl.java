/**
 */
package ca.mcgill.emf.examples.hal.impl;

import ca.mcgill.emf.examples.hal.HalPackage;
import ca.mcgill.emf.examples.hal.Reading;
import ca.mcgill.emf.examples.hal.Sensor;
import ca.mcgill.emf.examples.hal.SensorType;
import ca.mcgill.emf.examples.hal.Term;

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
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.SensorImpl#getReadings <em>Readings</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.SensorImpl#getMeasurementPeriodInSeconds <em>Measurement Period In Seconds</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.SensorImpl#getTerms <em>Terms</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.SensorImpl#getSensorType <em>Sensor Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorImpl extends DeviceImpl implements Sensor {
	/**
	 * The cached value of the '{@link #getReadings() <em>Readings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadings()
	 * @generated
	 * @ordered
	 */
	protected EList<Reading> readings;

	/**
	 * The default value of the '{@link #getMeasurementPeriodInSeconds() <em>Measurement Period In Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementPeriodInSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final float MEASUREMENT_PERIOD_IN_SECONDS_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getMeasurementPeriodInSeconds() <em>Measurement Period In Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementPeriodInSeconds()
	 * @generated
	 * @ordered
	 */
	protected float measurementPeriodInSeconds = MEASUREMENT_PERIOD_IN_SECONDS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTerms() <em>Terms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerms()
	 * @generated
	 * @ordered
	 */
	protected EList<Term> terms;

	/**
	 * The cached value of the '{@link #getSensorType() <em>Sensor Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorType()
	 * @generated
	 * @ordered
	 */
	protected SensorType sensorType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reading> getReadings() {
		if (readings == null) {
			readings = new EObjectWithInverseResolvingEList<Reading>(Reading.class, this, HalPackage.SENSOR__READINGS,
					HalPackage.READING__SENSOR);
		}
		return readings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getMeasurementPeriodInSeconds() {
		return measurementPeriodInSeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeasurementPeriodInSeconds(float newMeasurementPeriodInSeconds) {
		float oldMeasurementPeriodInSeconds = measurementPeriodInSeconds;
		measurementPeriodInSeconds = newMeasurementPeriodInSeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.SENSOR__MEASUREMENT_PERIOD_IN_SECONDS,
					oldMeasurementPeriodInSeconds, measurementPeriodInSeconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Term> getTerms() {
		if (terms == null) {
			terms = new EObjectWithInverseResolvingEList<Term>(Term.class, this, HalPackage.SENSOR__TERMS,
					HalPackage.TERM__LHS_SENSOR);
		}
		return terms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SensorType getSensorType() {
		if (sensorType != null && sensorType.eIsProxy()) {
			InternalEObject oldSensorType = (InternalEObject) sensorType;
			sensorType = (SensorType) eResolveProxy(oldSensorType);
			if (sensorType != oldSensorType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.SENSOR__SENSOR_TYPE,
							oldSensorType, sensorType));
			}
		}
		return sensorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorType basicGetSensorType() {
		return sensorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSensorType(SensorType newSensorType, NotificationChain msgs) {
		SensorType oldSensorType = sensorType;
		sensorType = newSensorType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					HalPackage.SENSOR__SENSOR_TYPE, oldSensorType, newSensorType);
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
	public void setSensorType(SensorType newSensorType) {
		if (newSensorType != sensorType) {
			NotificationChain msgs = null;
			if (sensorType != null)
				msgs = ((InternalEObject) sensorType).eInverseRemove(this, HalPackage.SENSOR_TYPE__SENSORS,
						SensorType.class, msgs);
			if (newSensorType != null)
				msgs = ((InternalEObject) newSensorType).eInverseAdd(this, HalPackage.SENSOR_TYPE__SENSORS,
						SensorType.class, msgs);
			msgs = basicSetSensorType(newSensorType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.SENSOR__SENSOR_TYPE, newSensorType,
					newSensorType));
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
		case HalPackage.SENSOR__READINGS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getReadings()).basicAdd(otherEnd, msgs);
		case HalPackage.SENSOR__TERMS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTerms()).basicAdd(otherEnd, msgs);
		case HalPackage.SENSOR__SENSOR_TYPE:
			if (sensorType != null)
				msgs = ((InternalEObject) sensorType).eInverseRemove(this, HalPackage.SENSOR_TYPE__SENSORS,
						SensorType.class, msgs);
			return basicSetSensorType((SensorType) otherEnd, msgs);
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
		case HalPackage.SENSOR__READINGS:
			return ((InternalEList<?>) getReadings()).basicRemove(otherEnd, msgs);
		case HalPackage.SENSOR__TERMS:
			return ((InternalEList<?>) getTerms()).basicRemove(otherEnd, msgs);
		case HalPackage.SENSOR__SENSOR_TYPE:
			return basicSetSensorType(null, msgs);
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
		case HalPackage.SENSOR__READINGS:
			return getReadings();
		case HalPackage.SENSOR__MEASUREMENT_PERIOD_IN_SECONDS:
			return getMeasurementPeriodInSeconds();
		case HalPackage.SENSOR__TERMS:
			return getTerms();
		case HalPackage.SENSOR__SENSOR_TYPE:
			if (resolve)
				return getSensorType();
			return basicGetSensorType();
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
		case HalPackage.SENSOR__READINGS:
			getReadings().clear();
			getReadings().addAll((Collection<? extends Reading>) newValue);
			return;
		case HalPackage.SENSOR__MEASUREMENT_PERIOD_IN_SECONDS:
			setMeasurementPeriodInSeconds((Float) newValue);
			return;
		case HalPackage.SENSOR__TERMS:
			getTerms().clear();
			getTerms().addAll((Collection<? extends Term>) newValue);
			return;
		case HalPackage.SENSOR__SENSOR_TYPE:
			setSensorType((SensorType) newValue);
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
		case HalPackage.SENSOR__READINGS:
			getReadings().clear();
			return;
		case HalPackage.SENSOR__MEASUREMENT_PERIOD_IN_SECONDS:
			setMeasurementPeriodInSeconds(MEASUREMENT_PERIOD_IN_SECONDS_EDEFAULT);
			return;
		case HalPackage.SENSOR__TERMS:
			getTerms().clear();
			return;
		case HalPackage.SENSOR__SENSOR_TYPE:
			setSensorType((SensorType) null);
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
		case HalPackage.SENSOR__READINGS:
			return readings != null && !readings.isEmpty();
		case HalPackage.SENSOR__MEASUREMENT_PERIOD_IN_SECONDS:
			return measurementPeriodInSeconds != MEASUREMENT_PERIOD_IN_SECONDS_EDEFAULT;
		case HalPackage.SENSOR__TERMS:
			return terms != null && !terms.isEmpty();
		case HalPackage.SENSOR__SENSOR_TYPE:
			return sensorType != null;
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
		result.append(" (measurementPeriodInSeconds: ");
		result.append(measurementPeriodInSeconds);
		result.append(')');
		return result.toString();
	}

} //SensorImpl
