/**
 * generated by Xtext 2.25.0
 */
package modelConverter.use_language.use;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelConverter.use_language.use.AssociationEnd#getType <em>Type</em>}</li>
 *   <li>{@link modelConverter.use_language.use.AssociationEnd#getMul <em>Mul</em>}</li>
 *   <li>{@link modelConverter.use_language.use.AssociationEnd#getRole <em>Role</em>}</li>
 *   <li>{@link modelConverter.use_language.use.AssociationEnd#isOrdered <em>Ordered</em>}</li>
 * </ul>
 *
 * @see modelConverter.use_language.use.UsePackage#getAssociationEnd()
 * @model
 * @generated
 */
public interface AssociationEnd extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(AllClass)
   * @see modelConverter.use_language.use.UsePackage#getAssociationEnd_Type()
   * @model
   * @generated
   */
  AllClass getType();

  /**
   * Sets the value of the '{@link modelConverter.use_language.use.AssociationEnd#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(AllClass value);

  /**
   * Returns the value of the '<em><b>Mul</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mul</em>' containment reference.
   * @see #setMul(Multiplicity)
   * @see modelConverter.use_language.use.UsePackage#getAssociationEnd_Mul()
   * @model containment="true"
   * @generated
   */
  Multiplicity getMul();

  /**
   * Sets the value of the '{@link modelConverter.use_language.use.AssociationEnd#getMul <em>Mul</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mul</em>' containment reference.
   * @see #getMul()
   * @generated
   */
  void setMul(Multiplicity value);

  /**
   * Returns the value of the '<em><b>Role</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role</em>' attribute.
   * @see #setRole(String)
   * @see modelConverter.use_language.use.UsePackage#getAssociationEnd_Role()
   * @model
   * @generated
   */
  String getRole();

  /**
   * Sets the value of the '{@link modelConverter.use_language.use.AssociationEnd#getRole <em>Role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Role</em>' attribute.
   * @see #getRole()
   * @generated
   */
  void setRole(String value);

  /**
   * Returns the value of the '<em><b>Ordered</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ordered</em>' attribute.
   * @see #setOrdered(boolean)
   * @see modelConverter.use_language.use.UsePackage#getAssociationEnd_Ordered()
   * @model
   * @generated
   */
  boolean isOrdered();

  /**
   * Sets the value of the '{@link modelConverter.use_language.use.AssociationEnd#isOrdered <em>Ordered</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ordered</em>' attribute.
   * @see #isOrdered()
   * @generated
   */
  void setOrdered(boolean value);

} // AssociationEnd