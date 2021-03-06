/**
 * generated by Xtext 2.10.0
 */
package de.wilkenk.ba.create.impl;

import de.wilkenk.ba.create.CreatePackage;
import de.wilkenk.ba.create.InitAttribute;
import de.wilkenk.ba.create.MathExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Init Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.wilkenk.ba.create.impl.InitAttributeImpl#getInitValue <em>Init Value</em>}</li>
 *   <li>{@link de.wilkenk.ba.create.impl.InitAttributeImpl#getDiceEvent <em>Dice Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitAttributeImpl extends MinimalEObjectImpl.Container implements InitAttribute
{
  /**
   * The default value of the '{@link #getInitValue() <em>Init Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitValue()
   * @generated
   * @ordered
   */
  protected static final int INIT_VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getInitValue() <em>Init Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitValue()
   * @generated
   * @ordered
   */
  protected int initValue = INIT_VALUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getDiceEvent() <em>Dice Event</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiceEvent()
   * @generated
   * @ordered
   */
  protected MathExpression diceEvent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InitAttributeImpl()
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
    return CreatePackage.Literals.INIT_ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getInitValue()
  {
    return initValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitValue(int newInitValue)
  {
    int oldInitValue = initValue;
    initValue = newInitValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CreatePackage.INIT_ATTRIBUTE__INIT_VALUE, oldInitValue, initValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MathExpression getDiceEvent()
  {
    return diceEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDiceEvent(MathExpression newDiceEvent, NotificationChain msgs)
  {
    MathExpression oldDiceEvent = diceEvent;
    diceEvent = newDiceEvent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CreatePackage.INIT_ATTRIBUTE__DICE_EVENT, oldDiceEvent, newDiceEvent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDiceEvent(MathExpression newDiceEvent)
  {
    if (newDiceEvent != diceEvent)
    {
      NotificationChain msgs = null;
      if (diceEvent != null)
        msgs = ((InternalEObject)diceEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CreatePackage.INIT_ATTRIBUTE__DICE_EVENT, null, msgs);
      if (newDiceEvent != null)
        msgs = ((InternalEObject)newDiceEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CreatePackage.INIT_ATTRIBUTE__DICE_EVENT, null, msgs);
      msgs = basicSetDiceEvent(newDiceEvent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CreatePackage.INIT_ATTRIBUTE__DICE_EVENT, newDiceEvent, newDiceEvent));
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
      case CreatePackage.INIT_ATTRIBUTE__DICE_EVENT:
        return basicSetDiceEvent(null, msgs);
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
      case CreatePackage.INIT_ATTRIBUTE__INIT_VALUE:
        return getInitValue();
      case CreatePackage.INIT_ATTRIBUTE__DICE_EVENT:
        return getDiceEvent();
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
      case CreatePackage.INIT_ATTRIBUTE__INIT_VALUE:
        setInitValue((Integer)newValue);
        return;
      case CreatePackage.INIT_ATTRIBUTE__DICE_EVENT:
        setDiceEvent((MathExpression)newValue);
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
      case CreatePackage.INIT_ATTRIBUTE__INIT_VALUE:
        setInitValue(INIT_VALUE_EDEFAULT);
        return;
      case CreatePackage.INIT_ATTRIBUTE__DICE_EVENT:
        setDiceEvent((MathExpression)null);
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
      case CreatePackage.INIT_ATTRIBUTE__INIT_VALUE:
        return initValue != INIT_VALUE_EDEFAULT;
      case CreatePackage.INIT_ATTRIBUTE__DICE_EVENT:
        return diceEvent != null;
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
    result.append(" (initValue: ");
    result.append(initValue);
    result.append(')');
    return result.toString();
  }

} //InitAttributeImpl
