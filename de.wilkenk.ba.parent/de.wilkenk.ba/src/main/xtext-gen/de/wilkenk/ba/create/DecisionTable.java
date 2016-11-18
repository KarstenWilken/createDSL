/**
 * generated by Xtext 2.10.0
 */
package de.wilkenk.ba.create;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.wilkenk.ba.create.DecisionTable#getNumberConditionRows <em>Number Condition Rows</em>}</li>
 *   <li>{@link de.wilkenk.ba.create.DecisionTable#getNumberConsequenceRows <em>Number Consequence Rows</em>}</li>
 *   <li>{@link de.wilkenk.ba.create.DecisionTable#getRows <em>Rows</em>}</li>
 * </ul>
 *
 * @see de.wilkenk.ba.create.CreatePackage#getDecisionTable()
 * @model
 * @generated
 */
public interface DecisionTable extends Entity
{
  /**
   * Returns the value of the '<em><b>Number Condition Rows</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number Condition Rows</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number Condition Rows</em>' attribute.
   * @see #setNumberConditionRows(int)
   * @see de.wilkenk.ba.create.CreatePackage#getDecisionTable_NumberConditionRows()
   * @model
   * @generated
   */
  int getNumberConditionRows();

  /**
   * Sets the value of the '{@link de.wilkenk.ba.create.DecisionTable#getNumberConditionRows <em>Number Condition Rows</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number Condition Rows</em>' attribute.
   * @see #getNumberConditionRows()
   * @generated
   */
  void setNumberConditionRows(int value);

  /**
   * Returns the value of the '<em><b>Number Consequence Rows</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number Consequence Rows</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number Consequence Rows</em>' attribute.
   * @see #setNumberConsequenceRows(int)
   * @see de.wilkenk.ba.create.CreatePackage#getDecisionTable_NumberConsequenceRows()
   * @model
   * @generated
   */
  int getNumberConsequenceRows();

  /**
   * Sets the value of the '{@link de.wilkenk.ba.create.DecisionTable#getNumberConsequenceRows <em>Number Consequence Rows</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number Consequence Rows</em>' attribute.
   * @see #getNumberConsequenceRows()
   * @generated
   */
  void setNumberConsequenceRows(int value);

  /**
   * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
   * The list contents are of type {@link de.wilkenk.ba.create.Row}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rows</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rows</em>' containment reference list.
   * @see de.wilkenk.ba.create.CreatePackage#getDecisionTable_Rows()
   * @model containment="true"
   * @generated
   */
  EList<Row> getRows();

} // DecisionTable
