/**
 * generated by Xtext 2.25.0
 */
package modelConverter.use_language.uml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelConverter.use_language.uml.Enumeration#getName <em>Name</em>}</li>
 *   <li>{@link modelConverter.use_language.uml.Enumeration#getOwnedLiteral <em>Owned Literal</em>}</li>
 * </ul>
 *
 * @see modelConverter.use_language.uml.UmlPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see modelConverter.use_language.uml.UmlPackage#getEnumeration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link modelConverter.use_language.uml.Enumeration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Owned Literal</b></em>' containment reference list.
   * The list contents are of type {@link modelConverter.use_language.uml.OwnedLiteral}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Literal</em>' containment reference list.
   * @see modelConverter.use_language.uml.UmlPackage#getEnumeration_OwnedLiteral()
   * @model containment="true"
   * @generated
   */
  EList<OwnedLiteral> getOwnedLiteral();

} // Enumeration