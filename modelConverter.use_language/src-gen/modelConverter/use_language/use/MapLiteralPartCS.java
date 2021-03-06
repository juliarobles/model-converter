/**
 * generated by Xtext 2.25.0
 */
package modelConverter.use_language.use;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Literal Part CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelConverter.use_language.use.MapLiteralPartCS#getOwnedKey <em>Owned Key</em>}</li>
 *   <li>{@link modelConverter.use_language.use.MapLiteralPartCS#getOwnedValue <em>Owned Value</em>}</li>
 * </ul>
 *
 * @see modelConverter.use_language.use.UsePackage#getMapLiteralPartCS()
 * @model
 * @generated
 */
public interface MapLiteralPartCS extends EObject
{
  /**
   * Returns the value of the '<em><b>Owned Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Key</em>' containment reference.
   * @see #setOwnedKey(ExpCS)
   * @see modelConverter.use_language.use.UsePackage#getMapLiteralPartCS_OwnedKey()
   * @model containment="true"
   * @generated
   */
  ExpCS getOwnedKey();

  /**
   * Sets the value of the '{@link modelConverter.use_language.use.MapLiteralPartCS#getOwnedKey <em>Owned Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Key</em>' containment reference.
   * @see #getOwnedKey()
   * @generated
   */
  void setOwnedKey(ExpCS value);

  /**
   * Returns the value of the '<em><b>Owned Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Value</em>' containment reference.
   * @see #setOwnedValue(ExpCS)
   * @see modelConverter.use_language.use.UsePackage#getMapLiteralPartCS_OwnedValue()
   * @model containment="true"
   * @generated
   */
  ExpCS getOwnedValue();

  /**
   * Sets the value of the '{@link modelConverter.use_language.use.MapLiteralPartCS#getOwnedValue <em>Owned Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Value</em>' containment reference.
   * @see #getOwnedValue()
   * @generated
   */
  void setOwnedValue(ExpCS value);

} // MapLiteralPartCS
