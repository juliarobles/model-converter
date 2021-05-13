/**
 * generated by Xtext 2.25.0
 */
package modelConverter.use_language.use;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelConverter.use_language.use.ConditionType#getName <em>Name</em>}</li>
 *   <li>{@link modelConverter.use_language.use.ConditionType#getOclexpression <em>Oclexpression</em>}</li>
 * </ul>
 *
 * @see modelConverter.use_language.use.UsePackage#getConditionType()
 * @model
 * @generated
 */
public interface ConditionType extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see modelConverter.use_language.use.UsePackage#getConditionType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link modelConverter.use_language.use.ConditionType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Oclexpression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Oclexpression</em>' containment reference.
   * @see #setOclexpression(ContextCS)
   * @see modelConverter.use_language.use.UsePackage#getConditionType_Oclexpression()
   * @model containment="true"
   * @generated
   */
  ContextCS getOclexpression();

  /**
   * Sets the value of the '{@link modelConverter.use_language.use.ConditionType#getOclexpression <em>Oclexpression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Oclexpression</em>' containment reference.
   * @see #getOclexpression()
   * @generated
   */
  void setOclexpression(ContextCS value);

} // ConditionType
