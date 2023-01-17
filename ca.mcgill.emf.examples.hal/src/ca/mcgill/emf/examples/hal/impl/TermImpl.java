/**
 */
package ca.mcgill.emf.examples.hal.impl;

import ca.mcgill.emf.examples.hal.ComparisonOperator;
import ca.mcgill.emf.examples.hal.HalPackage;
import ca.mcgill.emf.examples.hal.Sensor;
import ca.mcgill.emf.examples.hal.Term;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.TermImpl#getComparisonOperator <em>Comparison Operator</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.TermImpl#getRhsValue <em>Rhs Value</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.TermImpl#getLhsSensor <em>Lhs Sensor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TermImpl extends ExpressionImpl implements Term {
	/**
	 * The default value of the '{@link #getComparisonOperator() <em>Comparison Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonOperator()
	 * @generated
	 * @ordered
	 */
	protected static final ComparisonOperator COMPARISON_OPERATOR_EDEFAULT = ComparisonOperator.EQUAL;

	/**
	 * The cached value of the '{@link #getComparisonOperator() <em>Comparison Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonOperator()
	 * @generated
	 * @ordered
	 */
	protected ComparisonOperator comparisonOperator = COMPARISON_OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getRhsValue() <em>Rhs Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhsValue()
	 * @generated
	 * @ordered
	 */
	protected static final String RHS_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRhsValue() <em>Rhs Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhsValue()
	 * @generated
	 * @ordered
	 */
	protected String rhsValue = RHS_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLhsSensor() <em>Lhs Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLhsSensor()
	 * @generated
	 * @ordered
	 */
	protected Sensor lhsSensor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComparisonOperator getComparisonOperator() {
		return comparisonOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComparisonOperator(ComparisonOperator newComparisonOperator) {
		ComparisonOperator oldComparisonOperator = comparisonOperator;
		comparisonOperator = newComparisonOperator == null ? COMPARISON_OPERATOR_EDEFAULT : newComparisonOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.TERM__COMPARISON_OPERATOR,
					oldComparisonOperator, comparisonOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRhsValue() {
		return rhsValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRhsValue(String newRhsValue) {
		String oldRhsValue = rhsValue;
		rhsValue = newRhsValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.TERM__RHS_VALUE, oldRhsValue, rhsValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sensor getLhsSensor() {
		if (lhsSensor != null && lhsSensor.eIsProxy()) {
			InternalEObject oldLhsSensor = (InternalEObject) lhsSensor;
			lhsSensor = (Sensor) eResolveProxy(oldLhsSensor);
			if (lhsSensor != oldLhsSensor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.TERM__LHS_SENSOR, oldLhsSensor,
							lhsSensor));
			}
		}
		return lhsSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor basicGetLhsSensor() {
		return lhsSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLhsSensor(Sensor newLhsSensor, NotificationChain msgs) {
		Sensor oldLhsSensor = lhsSensor;
		lhsSensor = newLhsSensor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HalPackage.TERM__LHS_SENSOR,
					oldLhsSensor, newLhsSensor);
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
	public void setLhsSensor(Sensor newLhsSensor) {
		if (newLhsSensor != lhsSensor) {
			NotificationChain msgs = null;
			if (lhsSensor != null)
				msgs = ((InternalEObject) lhsSensor).eInverseRemove(this, HalPackage.SENSOR__TERMS, Sensor.class, msgs);
			if (newLhsSensor != null)
				msgs = ((InternalEObject) newLhsSensor).eInverseAdd(this, HalPackage.SENSOR__TERMS, Sensor.class, msgs);
			msgs = basicSetLhsSensor(newLhsSensor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.TERM__LHS_SENSOR, newLhsSensor,
					newLhsSensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HalPackage.TERM__LHS_SENSOR:
			if (lhsSensor != null)
				msgs = ((InternalEObject) lhsSensor).eInverseRemove(this, HalPackage.SENSOR__TERMS, Sensor.class, msgs);
			return basicSetLhsSensor((Sensor) otherEnd, msgs);
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
		case HalPackage.TERM__LHS_SENSOR:
			return basicSetLhsSensor(null, msgs);
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
		case HalPackage.TERM__COMPARISON_OPERATOR:
			return getComparisonOperator();
		case HalPackage.TERM__RHS_VALUE:
			return getRhsValue();
		case HalPackage.TERM__LHS_SENSOR:
			if (resolve)
				return getLhsSensor();
			return basicGetLhsSensor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case HalPackage.TERM__COMPARISON_OPERATOR:
			setComparisonOperator((ComparisonOperator) newValue);
			return;
		case HalPackage.TERM__RHS_VALUE:
			setRhsValue((String) newValue);
			return;
		case HalPackage.TERM__LHS_SENSOR:
			setLhsSensor((Sensor) newValue);
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
		case HalPackage.TERM__COMPARISON_OPERATOR:
			setComparisonOperator(COMPARISON_OPERATOR_EDEFAULT);
			return;
		case HalPackage.TERM__RHS_VALUE:
			setRhsValue(RHS_VALUE_EDEFAULT);
			return;
		case HalPackage.TERM__LHS_SENSOR:
			setLhsSensor((Sensor) null);
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
		case HalPackage.TERM__COMPARISON_OPERATOR:
			return comparisonOperator != COMPARISON_OPERATOR_EDEFAULT;
		case HalPackage.TERM__RHS_VALUE:
			return RHS_VALUE_EDEFAULT == null ? rhsValue != null : !RHS_VALUE_EDEFAULT.equals(rhsValue);
		case HalPackage.TERM__LHS_SENSOR:
			return lhsSensor != null;
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
		result.append(" (comparisonOperator: ");
		result.append(comparisonOperator);
		result.append(", rhsValue: ");
		result.append(rhsValue);
		result.append(')');
		return result.toString();
	}

} //TermImpl
