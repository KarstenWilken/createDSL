/**
 * generated by Xtext 2.10.0
 */
package de.wilkenk.ba.create;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Init Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.wilkenk.ba.create.InitAttribute#getInitValue <em>Init Value</em>}</li>
 *   <li>{@link de.wilkenk.ba.create.InitAttribute#getDiceRef <em>Dice Ref</em>}</li>
 * </ul>
 *
 * @see de.wilkenk.ba.create.CreatePackage#getInitAttribute()
 * @model
 * @generated
 */
public interface InitAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Init Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init Value</em>' attribute.
   * @see #setInitValue(int)
   * @see de.wilkenk.ba.create.CreatePackage#getInitAttribute_InitValue()
   * @model
   * @generated
   */
  int getInitValue();

  /**
   * Sets the value of the '{@link de.wilkenk.ba.create.InitAttribute#getInitValue <em>Init Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init Value</em>' attribute.
   * @see #getInitValue()
   * @generated
   */
  void setInitValue(int value);

  /**
   * Returns the value of the '<em><b>Dice Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dice Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dice Ref</em>' containment reference.
   * @see #setDiceRef(DiceRef)
   * @see de.wilkenk.ba.create.CreatePackage#getInitAttribute_DiceRef()
   * @model containment="true"
   * @generated
   */
  DiceRef getDiceRef();

  /**
   * Sets the value of the '{@link de.wilkenk.ba.create.InitAttribute#getDiceRef <em>Dice Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dice Ref</em>' containment reference.
   * @see #getDiceRef()
   * @generated
   */
  void setDiceRef(DiceRef value);

} // InitAttribute
