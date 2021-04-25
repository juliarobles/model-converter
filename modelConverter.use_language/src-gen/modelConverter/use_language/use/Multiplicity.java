/**
 * generated by Xtext 2.25.0
 */
package modelConverter.use_language.use;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelConverter.use_language.use.Multiplicity#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link modelConverter.use_language.use.Multiplicity#getMaxValue <em>Max Value</em>}</li>
 * </ul>
 *
 * @see modelConverter.use_language.use.UsePackage#getMultiplicity()
 * @model
 * @generated
 */
public interface Multiplicity extends EObject
{
  /**
   * Returns the value of the '<em><b>Min Value</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min Value</em>' attribute list.
   * @see modelConverter.use_language.use.UsePackage#getMultiplicity_MinValue()
   * @model unique="false"
   * @generated
   */
  EList<String> getMinValue();

  /**
   * Returns the value of the '<em><b>Max Value</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max Value</em>' attribute list.
   * @see modelConverter.use_language.use.UsePackage#getMultiplicity_MaxValue()
   * @model unique="false"
   * @generated
   */
  EList<String> getMaxValue();

} // Multiplicity