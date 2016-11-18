/**
 * generated by Xtext 2.10.0
 */
package de.wilkenk.ba.create.impl;

import de.wilkenk.ba.create.Consequence;
import de.wilkenk.ba.create.ConsequenceRef;
import de.wilkenk.ba.create.CreatePackage;
import de.wilkenk.ba.create.Raise;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.wilkenk.ba.create.impl.ConsequenceImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link de.wilkenk.ba.create.impl.ConsequenceImpl#getEffect <em>Effect</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsequenceImpl extends MinimalEObjectImpl.Container implements Consequence
{
  /**
   * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected static final ConsequenceRef TARGET_EDEFAULT = ConsequenceRef.ATTRIBUTE_REF;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected ConsequenceRef target = TARGET_EDEFAULT;

  /**
   * The cached value of the '{@link #getEffect() <em>Effect</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEffect()
   * @generated
   * @ordered
   */
  protected Raise effect;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConsequenceImpl()
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
    return CreatePackage.Literals.CONSEQUENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConsequenceRef getTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(ConsequenceRef newTarget)
  {
    ConsequenceRef oldTarget = target;
    target = newTarget == null ? TARGET_EDEFAULT : newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CreatePackage.CONSEQUENCE__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Raise getEffect()
  {
    if (effect != null && effect.eIsProxy())
    {
      InternalEObject oldEffect = (InternalEObject)effect;
      effect = (Raise)eResolveProxy(oldEffect);
      if (effect != oldEffect)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CreatePackage.CONSEQUENCE__EFFECT, oldEffect, effect));
      }
    }
    return effect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Raise basicGetEffect()
  {
    return effect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEffect(Raise newEffect)
  {
    Raise oldEffect = effect;
    effect = newEffect;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CreatePackage.CONSEQUENCE__EFFECT, oldEffect, effect));
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
      case CreatePackage.CONSEQUENCE__TARGET:
        return getTarget();
      case CreatePackage.CONSEQUENCE__EFFECT:
        if (resolve) return getEffect();
        return basicGetEffect();
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
      case CreatePackage.CONSEQUENCE__TARGET:
        setTarget((ConsequenceRef)newValue);
        return;
      case CreatePackage.CONSEQUENCE__EFFECT:
        setEffect((Raise)newValue);
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
      case CreatePackage.CONSEQUENCE__TARGET:
        setTarget(TARGET_EDEFAULT);
        return;
      case CreatePackage.CONSEQUENCE__EFFECT:
        setEffect((Raise)null);
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
      case CreatePackage.CONSEQUENCE__TARGET:
        return target != TARGET_EDEFAULT;
      case CreatePackage.CONSEQUENCE__EFFECT:
        return effect != null;
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
    result.append(" (target: ");
    result.append(target);
    result.append(')');
    return result.toString();
  }

} //ConsequenceImpl
