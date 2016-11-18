/**
 * generated by Xtext 2.10.0
 */
package de.wilkenk.ba.create.impl;

import de.wilkenk.ba.create.Combination;
import de.wilkenk.ba.create.CreatePackage;
import de.wilkenk.ba.create.DeleteCombination;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delete Combination</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.wilkenk.ba.create.impl.DeleteCombinationImpl#getDelete <em>Delete</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeleteCombinationImpl extends CombinationRaiseTypeImpl implements DeleteCombination
{
  /**
   * The cached value of the '{@link #getDelete() <em>Delete</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelete()
   * @generated
   * @ordered
   */
  protected Combination delete;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeleteCombinationImpl()
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
    return CreatePackage.Literals.DELETE_COMBINATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Combination getDelete()
  {
    return delete;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDelete(Combination newDelete, NotificationChain msgs)
  {
    Combination oldDelete = delete;
    delete = newDelete;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CreatePackage.DELETE_COMBINATION__DELETE, oldDelete, newDelete);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDelete(Combination newDelete)
  {
    if (newDelete != delete)
    {
      NotificationChain msgs = null;
      if (delete != null)
        msgs = ((InternalEObject)delete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CreatePackage.DELETE_COMBINATION__DELETE, null, msgs);
      if (newDelete != null)
        msgs = ((InternalEObject)newDelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CreatePackage.DELETE_COMBINATION__DELETE, null, msgs);
      msgs = basicSetDelete(newDelete, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CreatePackage.DELETE_COMBINATION__DELETE, newDelete, newDelete));
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
      case CreatePackage.DELETE_COMBINATION__DELETE:
        return basicSetDelete(null, msgs);
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
      case CreatePackage.DELETE_COMBINATION__DELETE:
        return getDelete();
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
      case CreatePackage.DELETE_COMBINATION__DELETE:
        setDelete((Combination)newValue);
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
      case CreatePackage.DELETE_COMBINATION__DELETE:
        setDelete((Combination)null);
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
      case CreatePackage.DELETE_COMBINATION__DELETE:
        return delete != null;
    }
    return super.eIsSet(featureID);
  }

} //DeleteCombinationImpl
