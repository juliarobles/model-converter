/**
 * generated by Xtext 2.25.0
 */
package modelConverter.use_language.uml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelConverter.use_language.uml.Generalization#getGeneral <em>General</em>}</li>
 * </ul>
 *
 * @see modelConverter.use_language.uml.UmlPackage#getGeneralization()
 * @model
 * @generated
 */
public interface Generalization extends EObject
{
  /**
   * Returns the value of the '<em><b>General</b></em>' reference list.
   * The list contents are of type {@link modelConverter.use_language.uml.AllClass}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>General</em>' reference list.
   * @see modelConverter.use_language.uml.UmlPackage#getGeneralization_General()
   * @model
   * @generated
   */
  EList<AllClass> getGeneral();

} // Generalization