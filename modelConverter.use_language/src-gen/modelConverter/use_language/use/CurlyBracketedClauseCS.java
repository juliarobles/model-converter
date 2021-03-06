/**
 * generated by Xtext 2.25.0
 */
package modelConverter.use_language.use;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Curly Bracketed Clause CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelConverter.use_language.use.CurlyBracketedClauseCS#getOwnedParts <em>Owned Parts</em>}</li>
 * </ul>
 *
 * @see modelConverter.use_language.use.UsePackage#getCurlyBracketedClauseCS()
 * @model
 * @generated
 */
public interface CurlyBracketedClauseCS extends EObject
{
  /**
   * Returns the value of the '<em><b>Owned Parts</b></em>' containment reference list.
   * The list contents are of type {@link modelConverter.use_language.use.ShadowPartCS}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Parts</em>' containment reference list.
   * @see modelConverter.use_language.use.UsePackage#getCurlyBracketedClauseCS_OwnedParts()
   * @model containment="true"
   * @generated
   */
  EList<ShadowPartCS> getOwnedParts();

} // CurlyBracketedClauseCS
