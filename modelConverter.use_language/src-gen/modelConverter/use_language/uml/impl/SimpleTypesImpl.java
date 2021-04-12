/**
 * generated by Xtext 2.25.0
 */
package modelConverter.use_language.uml.impl;

import modelConverter.use_language.uml.AllClass;
import modelConverter.use_language.uml.SimpleTypes;
import modelConverter.use_language.uml.UmlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Types</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modelConverter.use_language.uml.impl.SimpleTypesImpl#getReferended <em>Referended</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleTypesImpl extends MinimalEObjectImpl.Container implements SimpleTypes
{
  /**
   * The cached value of the '{@link #getReferended() <em>Referended</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferended()
   * @generated
   * @ordered
   */
  protected AllClass referended;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimpleTypesImpl()
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
    return UmlPackage.Literals.SIMPLE_TYPES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AllClass getReferended()
  {
    if (referended != null && referended.eIsProxy())
    {
      InternalEObject oldReferended = (InternalEObject)referended;
      referended = (AllClass)eResolveProxy(oldReferended);
      if (referended != oldReferended)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.SIMPLE_TYPES__REFERENDED, oldReferended, referended));
      }
    }
    return referended;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AllClass basicGetReferended()
  {
    return referended;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setReferended(AllClass newReferended)
  {
    AllClass oldReferended = referended;
    referended = newReferended;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.SIMPLE_TYPES__REFERENDED, oldReferended, referended));
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
      case UmlPackage.SIMPLE_TYPES__REFERENDED:
        if (resolve) return getReferended();
        return basicGetReferended();
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
      case UmlPackage.SIMPLE_TYPES__REFERENDED:
        setReferended((AllClass)newValue);
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
      case UmlPackage.SIMPLE_TYPES__REFERENDED:
        setReferended((AllClass)null);
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
      case UmlPackage.SIMPLE_TYPES__REFERENDED:
        return referended != null;
    }
    return super.eIsSet(featureID);
  }

} //SimpleTypesImpl
