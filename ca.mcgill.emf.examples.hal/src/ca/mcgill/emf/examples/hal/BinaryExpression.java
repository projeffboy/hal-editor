/**
 */
package ca.mcgill.emf.examples.hal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.BinaryExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.BinaryExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.BinaryExpression#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getBinaryExpression()
 * @model
 * @generated
 */
public interface BinaryExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.mcgill.emf.examples.hal.BinaryLogicalOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see ca.mcgill.emf.examples.hal.BinaryLogicalOperator
	 * @see #setOperator(BinaryLogicalOperator)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getBinaryExpression_Operator()
	 * @model unique="false"
	 * @generated
	 */
	BinaryLogicalOperator getOperator();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.BinaryExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see ca.mcgill.emf.examples.hal.BinaryLogicalOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BinaryLogicalOperator value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Expression)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getBinaryExpression_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLeft();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.BinaryExpression#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Expression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Expression)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getBinaryExpression_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRight();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.BinaryExpression#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Expression value);

} // BinaryExpression
