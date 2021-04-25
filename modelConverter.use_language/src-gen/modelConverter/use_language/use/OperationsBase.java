/**
 * generated by Xtext 2.25.0
 */
package modelConverter.use_language.use;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operations Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelConverter.use_language.use.OperationsBase#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see modelConverter.use_language.use.UsePackage#getOperationsBase()
 * @model
 * @generated
 */
public interface OperationsBase extends EObject
{
  /**
   * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
   * The list contents are of type {@link modelConverter.use_language.use.OperationType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operations</em>' containment reference list.
   * @see modelConverter.use_language.use.UsePackage#getOperationsBase_Operations()
   * @model containment="true"
   * @generated
   */
  EList<OperationType> getOperations();

} // OperationsBase
