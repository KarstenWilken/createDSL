/**
 * generated by Xtext 2.10.0
 */
package de.wilkenk.ba.create;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.wilkenk.ba.create.AttributeRef#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link de.wilkenk.ba.create.AttributeRef#getPart <em>Part</em>}</li>
 * </ul>
 *
 * @see de.wilkenk.ba.create.CreatePackage#getAttributeRef()
 * @model
 * @generated
 */
public interface AttributeRef extends MathExpression, ConditionTargets
{
  /**
   * Returns the value of the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' reference.
   * @see #setAttribute(Attribute)
   * @see de.wilkenk.ba.create.CreatePackage#getAttributeRef_Attribute()
   * @model
   * @generated
   */
  Attribute getAttribute();

  /**
   * Sets the value of the '{@link de.wilkenk.ba.create.AttributeRef#getAttribute <em>Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' reference.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(Attribute value);

  /**
   * Returns the value of the '<em><b>Part</b></em>' attribute.
   * The literals are from the enumeration {@link de.wilkenk.ba.create.AttributePart}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Part</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Part</em>' attribute.
   * @see de.wilkenk.ba.create.AttributePart
   * @see #setPart(AttributePart)
   * @see de.wilkenk.ba.create.CreatePackage#getAttributeRef_Part()
   * @model
   * @generated
   */
  AttributePart getPart();

  /**
   * Sets the value of the '{@link de.wilkenk.ba.create.AttributeRef#getPart <em>Part</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Part</em>' attribute.
   * @see de.wilkenk.ba.create.AttributePart
   * @see #getPart()
   * @generated
   */
  void setPart(AttributePart value);

} // AttributeRef
