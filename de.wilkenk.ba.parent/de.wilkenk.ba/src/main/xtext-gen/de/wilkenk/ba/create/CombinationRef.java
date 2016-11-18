/**
 * generated by Xtext 2.10.0
 */
package de.wilkenk.ba.create;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combination Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.wilkenk.ba.create.CombinationRef#getCombination <em>Combination</em>}</li>
 *   <li>{@link de.wilkenk.ba.create.CombinationRef#getPart <em>Part</em>}</li>
 * </ul>
 *
 * @see de.wilkenk.ba.create.CreatePackage#getCombinationRef()
 * @model
 * @generated
 */
public interface CombinationRef extends ConditionTargets
{
  /**
   * Returns the value of the '<em><b>Combination</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Combination</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Combination</em>' reference.
   * @see #setCombination(Combination)
   * @see de.wilkenk.ba.create.CreatePackage#getCombinationRef_Combination()
   * @model
   * @generated
   */
  Combination getCombination();

  /**
   * Sets the value of the '{@link de.wilkenk.ba.create.CombinationRef#getCombination <em>Combination</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Combination</em>' reference.
   * @see #getCombination()
   * @generated
   */
  void setCombination(Combination value);

  /**
   * Returns the value of the '<em><b>Part</b></em>' attribute.
   * The literals are from the enumeration {@link de.wilkenk.ba.create.CombinationPart}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Part</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Part</em>' attribute.
   * @see de.wilkenk.ba.create.CombinationPart
   * @see #setPart(CombinationPart)
   * @see de.wilkenk.ba.create.CreatePackage#getCombinationRef_Part()
   * @model
   * @generated
   */
  CombinationPart getPart();

  /**
   * Sets the value of the '{@link de.wilkenk.ba.create.CombinationRef#getPart <em>Part</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Part</em>' attribute.
   * @see de.wilkenk.ba.create.CombinationPart
   * @see #getPart()
   * @generated
   */
  void setPart(CombinationPart value);

} // CombinationRef
