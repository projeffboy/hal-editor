/**
 */
package ca.mcgill.emf.examples.hal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.Term#getComparisonOperator <em>Comparison Operator</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Term#getRhsValue <em>Rhs Value</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Term#getLhsSensor <em>Lhs Sensor</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getTerm()
 * @model
 * @generated
 */
public interface Term extends Expression {
	/**
	 * Returns the value of the '<em><b>Comparison Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.mcgill.emf.examples.hal.ComparisonOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison Operator</em>' attribute.
	 * @see ca.mcgill.emf.examples.hal.ComparisonOperator
	 * @see #setComparisonOperator(ComparisonOperator)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getTerm_ComparisonOperator()
	 * @model unique="false"
	 * @generated
	 */
	ComparisonOperator getComparisonOperator();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.Term#getComparisonOperator <em>Comparison Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison Operator</em>' attribute.
	 * @see ca.mcgill.emf.examples.hal.ComparisonOperator
	 * @see #getComparisonOperator()
	 * @generated
	 */
	void setComparisonOperator(ComparisonOperator value);

	/**
	 * Returns the value of the '<em><b>Rhs Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs Value</em>' attribute.
	 * @see #setRhsValue(String)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getTerm_RhsValue()
	 * @model unique="false"
	 * @generated
	 */
	String getRhsValue();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.Term#getRhsValue <em>Rhs Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs Value</em>' attribute.
	 * @see #getRhsValue()
	 * @generated
	 */
	void setRhsValue(String value);

	/**
	 * Returns the value of the '<em><b>Lhs Sensor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.Sensor#getTerms <em>Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs Sensor</em>' reference.
	 * @see #setLhsSensor(Sensor)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getTerm_LhsSensor()
	 * @see ca.mcgill.emf.examples.hal.Sensor#getTerms
	 * @model opposite="terms" required="true"
	 * @generated
	 */
	Sensor getLhsSensor();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.Term#getLhsSensor <em>Lhs Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs Sensor</em>' reference.
	 * @see #getLhsSensor()
	 * @generated
	 */
	void setLhsSensor(Sensor value);

} // Term
