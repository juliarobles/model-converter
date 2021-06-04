/**
 * generated by Xtext 2.25.0
 */
package modelConverter.use_language.use.impl;

import modelConverter.use_language.use.ExpCS;
import modelConverter.use_language.use.OperationDeclaration;
import modelConverter.use_language.use.State;
import modelConverter.use_language.use.Transition;
import modelConverter.use_language.use.UsePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modelConverter.use_language.use.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link modelConverter.use_language.use.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link modelConverter.use_language.use.impl.TransitionImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link modelConverter.use_language.use.impl.TransitionImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link modelConverter.use_language.use.impl.TransitionImpl#getPostcondition <em>Postcondition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition
{
  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected State source;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected State target;

  /**
   * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrecondition()
   * @generated
   * @ordered
   */
  protected ExpCS precondition;

  /**
   * The cached value of the '{@link #getOperation() <em>Operation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperation()
   * @generated
   * @ordered
   */
  protected OperationDeclaration operation;

  /**
   * The cached value of the '{@link #getPostcondition() <em>Postcondition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostcondition()
   * @generated
   * @ordered
   */
  protected ExpCS postcondition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransitionImpl()
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
    return UsePackage.Literals.TRANSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public State getSource()
  {
    if (source != null && source.eIsProxy())
    {
      InternalEObject oldSource = (InternalEObject)source;
      source = (State)eResolveProxy(oldSource);
      if (source != oldSource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UsePackage.TRANSITION__SOURCE, oldSource, source));
      }
    }
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSource(State newSource)
  {
    State oldSource = source;
    source = newSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UsePackage.TRANSITION__SOURCE, oldSource, source));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public State getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (State)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UsePackage.TRANSITION__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTarget(State newTarget)
  {
    State oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UsePackage.TRANSITION__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpCS getPrecondition()
  {
    return precondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrecondition(ExpCS newPrecondition, NotificationChain msgs)
  {
    ExpCS oldPrecondition = precondition;
    precondition = newPrecondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UsePackage.TRANSITION__PRECONDITION, oldPrecondition, newPrecondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPrecondition(ExpCS newPrecondition)
  {
    if (newPrecondition != precondition)
    {
      NotificationChain msgs = null;
      if (precondition != null)
        msgs = ((InternalEObject)precondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UsePackage.TRANSITION__PRECONDITION, null, msgs);
      if (newPrecondition != null)
        msgs = ((InternalEObject)newPrecondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UsePackage.TRANSITION__PRECONDITION, null, msgs);
      msgs = basicSetPrecondition(newPrecondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UsePackage.TRANSITION__PRECONDITION, newPrecondition, newPrecondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OperationDeclaration getOperation()
  {
    if (operation != null && operation.eIsProxy())
    {
      InternalEObject oldOperation = (InternalEObject)operation;
      operation = (OperationDeclaration)eResolveProxy(oldOperation);
      if (operation != oldOperation)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UsePackage.TRANSITION__OPERATION, oldOperation, operation));
      }
    }
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationDeclaration basicGetOperation()
  {
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOperation(OperationDeclaration newOperation)
  {
    OperationDeclaration oldOperation = operation;
    operation = newOperation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UsePackage.TRANSITION__OPERATION, oldOperation, operation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpCS getPostcondition()
  {
    return postcondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPostcondition(ExpCS newPostcondition, NotificationChain msgs)
  {
    ExpCS oldPostcondition = postcondition;
    postcondition = newPostcondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UsePackage.TRANSITION__POSTCONDITION, oldPostcondition, newPostcondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPostcondition(ExpCS newPostcondition)
  {
    if (newPostcondition != postcondition)
    {
      NotificationChain msgs = null;
      if (postcondition != null)
        msgs = ((InternalEObject)postcondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UsePackage.TRANSITION__POSTCONDITION, null, msgs);
      if (newPostcondition != null)
        msgs = ((InternalEObject)newPostcondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UsePackage.TRANSITION__POSTCONDITION, null, msgs);
      msgs = basicSetPostcondition(newPostcondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UsePackage.TRANSITION__POSTCONDITION, newPostcondition, newPostcondition));
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
      case UsePackage.TRANSITION__PRECONDITION:
        return basicSetPrecondition(null, msgs);
      case UsePackage.TRANSITION__POSTCONDITION:
        return basicSetPostcondition(null, msgs);
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
      case UsePackage.TRANSITION__SOURCE:
        if (resolve) return getSource();
        return basicGetSource();
      case UsePackage.TRANSITION__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case UsePackage.TRANSITION__PRECONDITION:
        return getPrecondition();
      case UsePackage.TRANSITION__OPERATION:
        if (resolve) return getOperation();
        return basicGetOperation();
      case UsePackage.TRANSITION__POSTCONDITION:
        return getPostcondition();
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
      case UsePackage.TRANSITION__SOURCE:
        setSource((State)newValue);
        return;
      case UsePackage.TRANSITION__TARGET:
        setTarget((State)newValue);
        return;
      case UsePackage.TRANSITION__PRECONDITION:
        setPrecondition((ExpCS)newValue);
        return;
      case UsePackage.TRANSITION__OPERATION:
        setOperation((OperationDeclaration)newValue);
        return;
      case UsePackage.TRANSITION__POSTCONDITION:
        setPostcondition((ExpCS)newValue);
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
      case UsePackage.TRANSITION__SOURCE:
        setSource((State)null);
        return;
      case UsePackage.TRANSITION__TARGET:
        setTarget((State)null);
        return;
      case UsePackage.TRANSITION__PRECONDITION:
        setPrecondition((ExpCS)null);
        return;
      case UsePackage.TRANSITION__OPERATION:
        setOperation((OperationDeclaration)null);
        return;
      case UsePackage.TRANSITION__POSTCONDITION:
        setPostcondition((ExpCS)null);
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
      case UsePackage.TRANSITION__SOURCE:
        return source != null;
      case UsePackage.TRANSITION__TARGET:
        return target != null;
      case UsePackage.TRANSITION__PRECONDITION:
        return precondition != null;
      case UsePackage.TRANSITION__OPERATION:
        return operation != null;
      case UsePackage.TRANSITION__POSTCONDITION:
        return postcondition != null;
    }
    return super.eIsSet(featureID);
  }

} //TransitionImpl