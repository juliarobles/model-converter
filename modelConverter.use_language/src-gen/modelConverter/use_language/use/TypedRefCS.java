/**
 * generated by Xtext 2.25.0
 */
package modelConverter.use_language.use;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Ref CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelConverter.use_language.use.TypedRefCS#getOwnedMultiplicity <em>Owned Multiplicity</em>}</li>
 * </ul>
 *
 * @see modelConverter.use_language.use.UsePackage#getTypedRefCS()
 * @model
 * @generated
 */
public interface TypedRefCS extends EObject
{
  /**
   * Returns the value of the '<em><b>Owned Multiplicity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Multiplicity</em>' containment reference.
   * @see #setOwnedMultiplicity(MultiplicityCS)
   * @see modelConverter.use_language.use.UsePackage#getTypedRefCS_OwnedMultiplicity()
   * @model containment="true"
   * @generated
   */
  MultiplicityCS getOwnedMultiplicity();

  /**
   * Sets the value of the '{@link modelConverter.use_language.use.TypedRefCS#getOwnedMultiplicity <em>Owned Multiplicity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Multiplicity</em>' containment reference.
   * @see #getOwnedMultiplicity()
   * @generated
   */
  void setOwnedMultiplicity(MultiplicityCS value);

} // TypedRefCS
