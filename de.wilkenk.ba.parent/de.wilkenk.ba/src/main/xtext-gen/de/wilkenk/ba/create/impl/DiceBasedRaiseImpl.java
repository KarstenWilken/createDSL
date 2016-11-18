/**
 * generated by Xtext 2.10.0
 */
package de.wilkenk.ba.create.impl;

import de.wilkenk.ba.create.CreatePackage;
import de.wilkenk.ba.create.Dice;
import de.wilkenk.ba.create.DiceBasedRaise;
import de.wilkenk.ba.create.DiceRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dice Based Raise</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.wilkenk.ba.create.impl.DiceBasedRaiseImpl#getDiceToUse <em>Dice To Use</em>}</li>
 *   <li>{@link de.wilkenk.ba.create.impl.DiceBasedRaiseImpl#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiceBasedRaiseImpl extends AttributeRaiseTypeImpl implements DiceBasedRaise
{
  /**
   * The cached value of the '{@link #getDiceToUse() <em>Dice To Use</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiceToUse()
   * @generated
   * @ordered
   */
  protected Dice diceToUse;

  /**
   * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResult()
   * @generated
   * @ordered
   */
  protected DiceRef result;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DiceBasedRaiseImpl()
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
    return CreatePackage.Literals.DICE_BASED_RAISE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dice getDiceToUse()
  {
    if (diceToUse != null && diceToUse.eIsProxy())
    {
      InternalEObject oldDiceToUse = (InternalEObject)diceToUse;
      diceToUse = (Dice)eResolveProxy(oldDiceToUse);
      if (diceToUse != oldDiceToUse)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CreatePackage.DICE_BASED_RAISE__DICE_TO_USE, oldDiceToUse, diceToUse));
      }
    }
    return diceToUse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dice basicGetDiceToUse()
  {
    return diceToUse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDiceToUse(Dice newDiceToUse)
  {
    Dice oldDiceToUse = diceToUse;
    diceToUse = newDiceToUse;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CreatePackage.DICE_BASED_RAISE__DICE_TO_USE, oldDiceToUse, diceToUse));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiceRef getResult()
  {
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResult(DiceRef newResult, NotificationChain msgs)
  {
    DiceRef oldResult = result;
    result = newResult;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CreatePackage.DICE_BASED_RAISE__RESULT, oldResult, newResult);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResult(DiceRef newResult)
  {
    if (newResult != result)
    {
      NotificationChain msgs = null;
      if (result != null)
        msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CreatePackage.DICE_BASED_RAISE__RESULT, null, msgs);
      if (newResult != null)
        msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CreatePackage.DICE_BASED_RAISE__RESULT, null, msgs);
      msgs = basicSetResult(newResult, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CreatePackage.DICE_BASED_RAISE__RESULT, newResult, newResult));
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
      case CreatePackage.DICE_BASED_RAISE__RESULT:
        return basicSetResult(null, msgs);
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
      case CreatePackage.DICE_BASED_RAISE__DICE_TO_USE:
        if (resolve) return getDiceToUse();
        return basicGetDiceToUse();
      case CreatePackage.DICE_BASED_RAISE__RESULT:
        return getResult();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CreatePackage.DICE_BASED_RAISE__DICE_TO_USE:
        setDiceToUse((Dice)newValue);
        return;
      case CreatePackage.DICE_BASED_RAISE__RESULT:
        setResult((DiceRef)newValue);
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
      case CreatePackage.DICE_BASED_RAISE__DICE_TO_USE:
        setDiceToUse((Dice)null);
        return;
      case CreatePackage.DICE_BASED_RAISE__RESULT:
        setResult((DiceRef)null);
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
      case CreatePackage.DICE_BASED_RAISE__DICE_TO_USE:
        return diceToUse != null;
      case CreatePackage.DICE_BASED_RAISE__RESULT:
        return result != null;
    }
    return super.eIsSet(featureID);
  }

} //DiceBasedRaiseImpl