/**
 * generated by Xtext 2.10.0
 */
package de.wilkenk.ba.create.impl;

import de.wilkenk.ba.create.CreatePackage;
import de.wilkenk.ba.create.DecisionTable;
import de.wilkenk.ba.create.Row;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.wilkenk.ba.create.impl.DecisionTableImpl#getNumberConditionRows <em>Number Condition Rows</em>}</li>
 *   <li>{@link de.wilkenk.ba.create.impl.DecisionTableImpl#getNumberConsequenceRows <em>Number Consequence Rows</em>}</li>
 *   <li>{@link de.wilkenk.ba.create.impl.DecisionTableImpl#getRows <em>Rows</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecisionTableImpl extends EntityImpl implements DecisionTable
{
  /**
   * The default value of the '{@link #getNumberConditionRows() <em>Number Condition Rows</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberConditionRows()
   * @generated
   * @ordered
   */
  protected static final int NUMBER_CONDITION_ROWS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNumberConditionRows() <em>Number Condition Rows</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberConditionRows()
   * @generated
   * @ordered
   */
  protected int numberConditionRows = NUMBER_CONDITION_ROWS_EDEFAULT;

  /**
   * The default value of the '{@link #getNumberConsequenceRows() <em>Number Consequence Rows</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberConsequenceRows()
   * @generated
   * @ordered
   */
  protected static final int NUMBER_CONSEQUENCE_ROWS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNumberConsequenceRows() <em>Number Consequence Rows</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberConsequenceRows()
   * @generated
   * @ordered
   */
  protected int numberConsequenceRows = NUMBER_CONSEQUENCE_ROWS_EDEFAULT;

  /**
   * The cached value of the '{@link #getRows() <em>Rows</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRows()
   * @generated
   * @ordered
   */
  protected EList<Row> rows;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DecisionTableImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CreatePackage.Literals.DECISION_TABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNumberConditionRows()
  {
    return numberConditionRows;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumberConditionRows(int newNumberConditionRows)
  {
    int oldNumberConditionRows = numberConditionRows;
    numberConditionRows = newNumberConditionRows;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CreatePackage.DECISION_TABLE__NUMBER_CONDITION_ROWS, oldNumberConditionRows, numberConditionRows));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNumberConsequenceRows()
  {
    return numberConsequenceRows;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumberConsequenceRows(int newNumberConsequenceRows)
  {
    int oldNumberConsequenceRows = numberConsequenceRows;
    numberConsequenceRows = newNumberConsequenceRows;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CreatePackage.DECISION_TABLE__NUMBER_CONSEQUENCE_ROWS, oldNumberConsequenceRows, numberConsequenceRows));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Row> getRows()
  {
    if (rows == null)
    {
      rows = new EObjectContainmentEList<Row>(Row.class, this, CreatePackage.DECISION_TABLE__ROWS);
    }
    return rows;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CreatePackage.DECISION_TABLE__ROWS:
        return ((InternalEList<?>)getRows()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CreatePackage.DECISION_TABLE__NUMBER_CONDITION_ROWS:
        return getNumberConditionRows();
      case CreatePackage.DECISION_TABLE__NUMBER_CONSEQUENCE_ROWS:
        return getNumberConsequenceRows();
      case CreatePackage.DECISION_TABLE__ROWS:
        return getRows();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CreatePackage.DECISION_TABLE__NUMBER_CONDITION_ROWS:
        setNumberConditionRows((Integer)newValue);
        return;
      case CreatePackage.DECISION_TABLE__NUMBER_CONSEQUENCE_ROWS:
        setNumberConsequenceRows((Integer)newValue);
        return;
      case CreatePackage.DECISION_TABLE__ROWS:
        getRows().clear();
        getRows().addAll((Collection<? extends Row>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CreatePackage.DECISION_TABLE__NUMBER_CONDITION_ROWS:
        setNumberConditionRows(NUMBER_CONDITION_ROWS_EDEFAULT);
        return;
      case CreatePackage.DECISION_TABLE__NUMBER_CONSEQUENCE_ROWS:
        setNumberConsequenceRows(NUMBER_CONSEQUENCE_ROWS_EDEFAULT);
        return;
      case CreatePackage.DECISION_TABLE__ROWS:
        getRows().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CreatePackage.DECISION_TABLE__NUMBER_CONDITION_ROWS:
        return numberConditionRows != NUMBER_CONDITION_ROWS_EDEFAULT;
      case CreatePackage.DECISION_TABLE__NUMBER_CONSEQUENCE_ROWS:
        return numberConsequenceRows != NUMBER_CONSEQUENCE_ROWS_EDEFAULT;
      case CreatePackage.DECISION_TABLE__ROWS:
        return rows != null && !rows.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (numberConditionRows: ");
    result.append(numberConditionRows);
    result.append(", numberConsequenceRows: ");
    result.append(numberConsequenceRows);
    result.append(')');
    return result.toString();
  }

} //DecisionTableImpl
