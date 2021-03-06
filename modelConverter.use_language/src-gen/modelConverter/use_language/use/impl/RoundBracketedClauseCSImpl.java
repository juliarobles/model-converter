/**
 * generated by Xtext 2.25.0
 */
package modelConverter.use_language.use.impl;

import java.util.Collection;

import modelConverter.use_language.use.NavigatingArgCS;
import modelConverter.use_language.use.RoundBracketedClauseCS;
import modelConverter.use_language.use.UsePackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Round Bracketed Clause CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modelConverter.use_language.use.impl.RoundBracketedClauseCSImpl#getOwnedArguments <em>Owned Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoundBracketedClauseCSImpl extends MinimalEObjectImpl.Container implements RoundBracketedClauseCS
{
  /**
   * The cached value of the '{@link #getOwnedArguments() <em>Owned Arguments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedArguments()
   * @generated
   * @ordered
   */
  protected EList<NavigatingArgCS> ownedArguments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RoundBracketedClauseCSImpl()
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
    return UsePackage.Literals.ROUND_BRACKETED_CLAUSE_CS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<NavigatingArgCS> getOwnedArguments()
  {
    if (ownedArguments == null)
    {
      ownedArguments = new EObjectContainmentEList<NavigatingArgCS>(NavigatingArgCS.class, this, UsePackage.ROUND_BRACKETED_CLAUSE_CS__OWNED_ARGUMENTS);
    }
    return ownedArguments;
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
      case UsePackage.ROUND_BRACKETED_CLAUSE_CS__OWNED_ARGUMENTS:
        return ((InternalEList<?>)getOwnedArguments()).basicRemove(otherEnd, msgs);
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
      case UsePackage.ROUND_BRACKETED_CLAUSE_CS__OWNED_ARGUMENTS:
        return getOwnedArguments();
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
      case UsePackage.ROUND_BRACKETED_CLAUSE_CS__OWNED_ARGUMENTS:
        getOwnedArguments().clear();
        getOwnedArguments().addAll((Collection<? extends NavigatingArgCS>)newValue);
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
      case UsePackage.ROUND_BRACKETED_CLAUSE_CS__OWNED_ARGUMENTS:
        getOwnedArguments().clear();
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
      case UsePackage.ROUND_BRACKETED_CLAUSE_CS__OWNED_ARGUMENTS:
        return ownedArguments != null && !ownedArguments.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RoundBracketedClauseCSImpl
