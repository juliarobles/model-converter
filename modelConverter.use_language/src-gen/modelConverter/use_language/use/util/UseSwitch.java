/**
 * generated by Xtext 2.25.0
 */
package modelConverter.use_language.use.util;

import modelConverter.use_language.use.AllClass;
import modelConverter.use_language.use.AllTypes;
import modelConverter.use_language.use.Association;
import modelConverter.use_language.use.AssociationClass;
import modelConverter.use_language.use.AssociationEnd;
import modelConverter.use_language.use.Attribute;
import modelConverter.use_language.use.AttributesBase;
import modelConverter.use_language.use.CollectionType;
import modelConverter.use_language.use.ConditionType;
import modelConverter.use_language.use.ConstrainsGeneral;
import modelConverter.use_language.use.ConstraintsBase;
import modelConverter.use_language.use.ContextCS;
import modelConverter.use_language.use.ContextsType;
import modelConverter.use_language.use.Generalization;
import modelConverter.use_language.use.InvariantContext;
import modelConverter.use_language.use.InvariantDefinition;
import modelConverter.use_language.use.ModelUSE;
import modelConverter.use_language.use.Multiplicity;
import modelConverter.use_language.use.OperationComplex;
import modelConverter.use_language.use.OperationConstraints;
import modelConverter.use_language.use.OperationContext;
import modelConverter.use_language.use.OperationDeclaration;
import modelConverter.use_language.use.OperationQuery;
import modelConverter.use_language.use.OperationType;
import modelConverter.use_language.use.OperationsBase;
import modelConverter.use_language.use.Parameter;
import modelConverter.use_language.use.Postcondition;
import modelConverter.use_language.use.Precondition;
import modelConverter.use_language.use.SimpleTypes;
import modelConverter.use_language.use.Type;
import modelConverter.use_language.use.UsePackage;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see modelConverter.use_language.use.UsePackage
 * @generated
 */
public class UseSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static UsePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = UsePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case UsePackage.MODEL_USE:
      {
        ModelUSE modelUSE = (ModelUSE)theEObject;
        T result = caseModelUSE(modelUSE);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UsePackage.MULTIPLICITY:
      {
        Multiplicity multiplicity = (Multiplicity)theEObject;
        T result = caseMultiplicity(multiplicity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UsePackage.ALL_TYPES:
      {
        AllTypes allTypes = (AllTypes)theEObject;
        T result = caseAllTypes(allTypes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UsePackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UsePackage.COLLECTION_TYPE:
      {
        CollectionType collectionType = (CollectionType)theEObject;
        T result = caseCollectionType(collectionType);
        if (result == null) result = caseAllTypes(collectionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UsePackage.ALL_CLASS:
      {
        AllClass allClass = (AllClass)theEObject;
        T result = caseAllClass(allClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UsePackage.SIMPLE_TYPES:
      {
        SimpleTypes simpleTypes = (SimpleTypes)theEObject;
        T result = caseSimpleTypes(simpleTypes);
        if (result == null) result = caseAllTypes(simpleTypes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UsePackage.ENUM:
      {
        modelConverter.use_language.use.Enum enum_ = (modelConverter.use_language.use.Enum)theEObject;
        T result = caseEnum(enum_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UsePackage.CLASS:
      {
        modelConverter.use_language.use.Class class_ = (modelConverter.use_language.use.Class)theEObject;
        T result = caseClass(class_);
        if (result == null) result = caseType(class_);
        if (result == null) result = caseAllClass(class_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UsePackage.GENERALIZATION:
      {
        Generalization generalization = (Generalization)theEObject;
        T result = caseGeneralization(generalization);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UsePackage.ASSOCIATION:
      {
        Association association = (Association)theEObject;
        T result = caseAssociation(association);
        if (result == null) result = caseType(association);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UsePackage.ASSOCIATION_END:
      {
        AssociationEnd associationEnd = (AssociationEnd)theEObject;
        T result = caseAssociationEnd(associationEnd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UsePackage.ASSOCIATION_CLASS:
      {
        AssociationClass associationClass = (AssociationClass)theEObject;
        T result = caseAssociationClass(associationClass);
        if (result == null) result = caseType(associationClass);
        if (result == null) result = caseAllClass(associationClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UsePackage.ATTRIBUTES_BASE:
      {
        AttributesBase attributesBase = (AttributesBase)theEObject;
        T result = caseAttributesBase(attributesBase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UsePackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UsePackage.OPERATIONS_BASE:
      {
        OperationsBase operationsBase = (OperationsBase)theEObject;
        T result = caseOperationsBase(operationsBase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UsePackage.OPERATION_TYPE:
      {
        OperationType operationType = (OperationType)theEObject;
        T result = caseOperationType(operationType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UsePackage.OPERATION_QUERY:
      {
        OperationQuery operationQuery = (OperationQuery)theEObject;
        T result = caseOperationQuery(operationQuery);
        if (result == null) result = caseOperationType(operationQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UsePackage.OPERATION_COMPLEX:
      {
        OperationComplex operationComplex = (OperationComplex)theEObject;
        T result = caseOperationComplex(operationComplex);
        if (result == null) result = caseOperationType(operationComplex);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UsePackage.OPERATION_DECLARATION:
      {
        OperationDeclaration operationDeclaration = (OperationDeclaration)theEObject;
        T result = caseOperationDeclaration(operationDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UsePackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UsePackage.CONSTRAINTS_BASE:
      {
        ConstraintsBase constraintsBase = (ConstraintsBase)theEObject;
        T result = caseConstraintsBase(constraintsBase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UsePackage.CONSTRAINS_GENERAL:
      {
        ConstrainsGeneral constrainsGeneral = (ConstrainsGeneral)theEObject;
        T result = caseConstrainsGeneral(constrainsGeneral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UsePackage.CONTEXTS_TYPE:
      {
        ContextsType contextsType = (ContextsType)theEObject;
        T result = caseContextsType(contextsType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UsePackage.INVARIANT_CONTEXT:
      {
        InvariantContext invariantContext = (InvariantContext)theEObject;
        T result = caseInvariantContext(invariantContext);
        if (result == null) result = caseContextsType(invariantContext);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UsePackage.INVARIANT_DEFINITION:
      {
        InvariantDefinition invariantDefinition = (InvariantDefinition)theEObject;
        T result = caseInvariantDefinition(invariantDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UsePackage.OPERATION_CONTEXT:
      {
        OperationContext operationContext = (OperationContext)theEObject;
        T result = caseOperationContext(operationContext);
        if (result == null) result = caseContextsType(operationContext);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UsePackage.OPERATION_CONSTRAINTS:
      {
        OperationConstraints operationConstraints = (OperationConstraints)theEObject;
        T result = caseOperationConstraints(operationConstraints);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UsePackage.CONDITION_TYPE:
      {
        ConditionType conditionType = (ConditionType)theEObject;
        T result = caseConditionType(conditionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UsePackage.PRECONDITION:
      {
        Precondition precondition = (Precondition)theEObject;
        T result = casePrecondition(precondition);
        if (result == null) result = caseConditionType(precondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UsePackage.POSTCONDITION:
      {
        Postcondition postcondition = (Postcondition)theEObject;
        T result = casePostcondition(postcondition);
        if (result == null) result = caseConditionType(postcondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UsePackage.CONTEXT_CS:
      {
        ContextCS contextCS = (ContextCS)theEObject;
        T result = caseContextCS(contextCS);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model USE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model USE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelUSE(ModelUSE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiplicity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplicity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplicity(Multiplicity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>All Types</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>All Types</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAllTypes(AllTypes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Collection Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Collection Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCollectionType(CollectionType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>All Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>All Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAllClass(AllClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Types</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Types</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleTypes(SimpleTypes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnum(modelConverter.use_language.use.Enum object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClass(modelConverter.use_language.use.Class object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Generalization</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Generalization</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeneralization(Generalization object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Association</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssociation(Association object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Association End</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Association End</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssociationEnd(AssociationEnd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Association Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Association Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssociationClass(AssociationClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attributes Base</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attributes Base</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributesBase(AttributesBase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operations Base</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operations Base</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperationsBase(OperationsBase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperationType(OperationType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperationQuery(OperationQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation Complex</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation Complex</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperationComplex(OperationComplex object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperationDeclaration(OperationDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constraints Base</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constraints Base</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstraintsBase(ConstraintsBase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constrains General</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constrains General</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstrainsGeneral(ConstrainsGeneral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Contexts Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Contexts Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContextsType(ContextsType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Invariant Context</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Invariant Context</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInvariantContext(InvariantContext object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Invariant Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Invariant Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInvariantDefinition(InvariantDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation Context</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation Context</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperationContext(OperationContext object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation Constraints</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation Constraints</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperationConstraints(OperationConstraints object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionType(ConditionType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Precondition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Precondition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrecondition(Precondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Postcondition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Postcondition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePostcondition(Postcondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context CS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context CS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContextCS(ContextCS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //UseSwitch
