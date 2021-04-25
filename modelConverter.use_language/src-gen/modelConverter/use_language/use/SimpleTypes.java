/**
 * generated by Xtext 2.25.0
 */
package modelConverter.use_language.use;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelConverter.use_language.use.SimpleTypes#getDefaultType <em>Default Type</em>}</li>
 *   <li>{@link modelConverter.use_language.use.SimpleTypes#getReferended <em>Referended</em>}</li>
 * </ul>
 *
 * @see modelConverter.use_language.use.UsePackage#getSimpleTypes()
 * @model
 * @generated
 */
public interface SimpleTypes extends EObject
{
  /**
   * Returns the value of the '<em><b>Default Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Type</em>' attribute.
   * @see #setDefaultType(String)
   * @see modelConverter.use_language.use.UsePackage#getSimpleTypes_DefaultType()
   * @model
   * @generated
   */
  String getDefaultType();

  /**
   * Sets the value of the '{@link modelConverter.use_language.use.SimpleTypes#getDefaultType <em>Default Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Type</em>' attribute.
   * @see #getDefaultType()
   * @generated
   */
  void setDefaultType(String value);

  /**
   * Returns the value of the '<em><b>Referended</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Referended</em>' reference.
   * @see #setReferended(AllClass)
   * @see modelConverter.use_language.use.UsePackage#getSimpleTypes_Referended()
   * @model
   * @generated
   */
  AllClass getReferended();

  /**
   * Sets the value of the '{@link modelConverter.use_language.use.SimpleTypes#getReferended <em>Referended</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Referended</em>' reference.
   * @see #getReferended()
   * @generated
   */
  void setReferended(AllClass value);

} // SimpleTypes