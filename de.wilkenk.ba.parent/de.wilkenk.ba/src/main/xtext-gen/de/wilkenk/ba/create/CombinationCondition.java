/**
 * generated by Xtext 2.10.0
 */
package de.wilkenk.ba.create;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combination Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.wilkenk.ba.create.CombinationCondition#getName <em>Name</em>}</li>
 *   <li>{@link de.wilkenk.ba.create.CombinationCondition#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see de.wilkenk.ba.create.CreatePackage#getCombinationCondition()
 * @model
 * @generated
 */
public interface CombinationCondition extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.wilkenk.ba.create.CreatePackage#getCombinationCondition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.wilkenk.ba.create.CombinationCondition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(XExpression)
   * @see de.wilkenk.ba.create.CreatePackage#getCombinationCondition_Condition()
   * @model containment="true"
   * @generated
   */
  XExpression getCondition();

  /**
   * Sets the value of the '{@link de.wilkenk.ba.create.CombinationCondition#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(XExpression value);

} // CombinationCondition