/**
 * generated by Xtext 2.10.0
 */
package de.wilkenk.ba.create;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.wilkenk.ba.create.Multiplication#getLeft <em>Left</em>}</li>
 *   <li>{@link de.wilkenk.ba.create.Multiplication#getOp <em>Op</em>}</li>
 *   <li>{@link de.wilkenk.ba.create.Multiplication#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see de.wilkenk.ba.create.CreatePackage#getMultiplication()
 * @model
 * @generated
 */
public interface Multiplication extends MathExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(MathExpression)
   * @see de.wilkenk.ba.create.CreatePackage#getMultiplication_Left()
   * @model containment="true"
   * @generated
   */
  MathExpression getLeft();

  /**
   * Sets the value of the '{@link de.wilkenk.ba.create.Multiplication#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(MathExpression value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see de.wilkenk.ba.create.CreatePackage#getMultiplication_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link de.wilkenk.ba.create.Multiplication#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(MathExpression)
   * @see de.wilkenk.ba.create.CreatePackage#getMultiplication_Right()
   * @model containment="true"
   * @generated
   */
  MathExpression getRight();

  /**
   * Sets the value of the '{@link de.wilkenk.ba.create.Multiplication#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(MathExpression value);

} // Multiplication
