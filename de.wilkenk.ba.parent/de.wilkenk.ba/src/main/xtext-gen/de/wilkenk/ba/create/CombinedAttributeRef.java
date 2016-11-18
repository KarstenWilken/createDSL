/**
 * generated by Xtext 2.10.0
 */
package de.wilkenk.ba.create;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combined Attribute Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.wilkenk.ba.create.CombinedAttributeRef#getCombinedAttribute <em>Combined Attribute</em>}</li>
 *   <li>{@link de.wilkenk.ba.create.CombinedAttributeRef#getPart <em>Part</em>}</li>
 * </ul>
 *
 * @see de.wilkenk.ba.create.CreatePackage#getCombinedAttributeRef()
 * @model
 * @generated
 */
public interface CombinedAttributeRef extends ConditionTargets
{
  /**
   * Returns the value of the '<em><b>Combined Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Combined Attribute</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Combined Attribute</em>' reference.
   * @see #setCombinedAttribute(CombinedAttribute)
   * @see de.wilkenk.ba.create.CreatePackage#getCombinedAttributeRef_CombinedAttribute()
   * @model
   * @generated
   */
  CombinedAttribute getCombinedAttribute();

  /**
   * Sets the value of the '{@link de.wilkenk.ba.create.CombinedAttributeRef#getCombinedAttribute <em>Combined Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Combined Attribute</em>' reference.
   * @see #getCombinedAttribute()
   * @generated
   */
  void setCombinedAttribute(CombinedAttribute value);

  /**
   * Returns the value of the '<em><b>Part</b></em>' attribute.
   * The literals are from the enumeration {@link de.wilkenk.ba.create.CombinedAttributePart}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Part</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Part</em>' attribute.
   * @see de.wilkenk.ba.create.CombinedAttributePart
   * @see #setPart(CombinedAttributePart)
   * @see de.wilkenk.ba.create.CreatePackage#getCombinedAttributeRef_Part()
   * @model
   * @generated
   */
  CombinedAttributePart getPart();

  /**
   * Sets the value of the '{@link de.wilkenk.ba.create.CombinedAttributeRef#getPart <em>Part</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Part</em>' attribute.
   * @see de.wilkenk.ba.create.CombinedAttributePart
   * @see #getPart()
   * @generated
   */
  void setPart(CombinedAttributePart value);

} // CombinedAttributeRef