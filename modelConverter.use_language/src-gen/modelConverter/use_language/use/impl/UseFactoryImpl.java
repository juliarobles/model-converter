/**
 * generated by Xtext 2.25.0
 */
package modelConverter.use_language.use.impl;

import modelConverter.use_language.use.AllClass;
import modelConverter.use_language.use.AllClassAndEnum;
import modelConverter.use_language.use.AllTypes;
import modelConverter.use_language.use.Association;
import modelConverter.use_language.use.AssociationClass;
import modelConverter.use_language.use.AssociationEnd;
import modelConverter.use_language.use.Attribute;
import modelConverter.use_language.use.AttributesBase;
import modelConverter.use_language.use.BooleanLiteralExpCS;
import modelConverter.use_language.use.CollectionLiteralExpCS;
import modelConverter.use_language.use.CollectionLiteralPartCS;
import modelConverter.use_language.use.CollectionPatternCS;
import modelConverter.use_language.use.CollectionType;
import modelConverter.use_language.use.CollectionTypeCS;
import modelConverter.use_language.use.ConditionType;
import modelConverter.use_language.use.ConstrainsGeneral;
import modelConverter.use_language.use.ConstraintsBase;
import modelConverter.use_language.use.ContextsType;
import modelConverter.use_language.use.CurlyBracketedClauseCS;
import modelConverter.use_language.use.ExpCS;
import modelConverter.use_language.use.Generalization;
import modelConverter.use_language.use.IfExpCS;
import modelConverter.use_language.use.IfThenExpCS;
import modelConverter.use_language.use.InfixExpCS;
import modelConverter.use_language.use.InvalidLiteralExpCS;
import modelConverter.use_language.use.InvariantContext;
import modelConverter.use_language.use.InvariantDefinition;
import modelConverter.use_language.use.LambdaLiteralExpCS;
import modelConverter.use_language.use.LetExpCS;
import modelConverter.use_language.use.LetVariableCS;
import modelConverter.use_language.use.MapLiteralExpCS;
import modelConverter.use_language.use.MapLiteralPartCS;
import modelConverter.use_language.use.MapTypeCS;
import modelConverter.use_language.use.ModelUSE;
import modelConverter.use_language.use.Multiplicity;
import modelConverter.use_language.use.MultiplicityBoundsCS;
import modelConverter.use_language.use.MultiplicityCS;
import modelConverter.use_language.use.MultiplicityStringCS;
import modelConverter.use_language.use.NameExpCS;
import modelConverter.use_language.use.NavigatingArgCS;
import modelConverter.use_language.use.NestedExpCS;
import modelConverter.use_language.use.NullLiteralExpCS;
import modelConverter.use_language.use.NumberLiteralExpCS;
import modelConverter.use_language.use.OperationComplex;
import modelConverter.use_language.use.OperationConstraints;
import modelConverter.use_language.use.OperationContext;
import modelConverter.use_language.use.OperationDeclaration;
import modelConverter.use_language.use.OperationQuery;
import modelConverter.use_language.use.OperationType;
import modelConverter.use_language.use.OperationsBase;
import modelConverter.use_language.use.Parameter;
import modelConverter.use_language.use.PathNameCS;
import modelConverter.use_language.use.PatternExpCS;
import modelConverter.use_language.use.Postcondition;
import modelConverter.use_language.use.Precondition;
import modelConverter.use_language.use.PrefixExpCS;
import modelConverter.use_language.use.PrimitiveLiteralExpCS;
import modelConverter.use_language.use.PrimitiveTypeRefCS;
import modelConverter.use_language.use.RoundBracketedClauseCS;
import modelConverter.use_language.use.SelfExpCS;
import modelConverter.use_language.use.ShadowPartCS;
import modelConverter.use_language.use.SimpleTypes;
import modelConverter.use_language.use.SquareBracketedClauseCS;
import modelConverter.use_language.use.State;
import modelConverter.use_language.use.StateMachine;
import modelConverter.use_language.use.StateMachinesBase;
import modelConverter.use_language.use.StringLiteralExpCS;
import modelConverter.use_language.use.Transition;
import modelConverter.use_language.use.TupleLiteralExpCS;
import modelConverter.use_language.use.TupleLiteralPartCS;
import modelConverter.use_language.use.TuplePartCS;
import modelConverter.use_language.use.TupleTypeCS;
import modelConverter.use_language.use.Type;
import modelConverter.use_language.use.TypeLiteralExpCS;
import modelConverter.use_language.use.TypeNameExpCS;
import modelConverter.use_language.use.TypedRefCS;
import modelConverter.use_language.use.UnlimitedNaturalLiteralExpCS;
import modelConverter.use_language.use.UseFactory;
import modelConverter.use_language.use.UsePackage;
import modelConverter.use_language.use.VariableCS;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UseFactoryImpl extends EFactoryImpl implements UseFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UseFactory init()
  {
    try
    {
      UseFactory theUseFactory = (UseFactory)EPackage.Registry.INSTANCE.getEFactory(UsePackage.eNS_URI);
      if (theUseFactory != null)
      {
        return theUseFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new UseFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case UsePackage.MODEL_USE: return createModelUSE();
      case UsePackage.MULTIPLICITY: return createMultiplicity();
      case UsePackage.ALL_TYPES: return createAllTypes();
      case UsePackage.TYPE: return createType();
      case UsePackage.COLLECTION_TYPE: return createCollectionType();
      case UsePackage.ALL_CLASS: return createAllClass();
      case UsePackage.ALL_CLASS_AND_ENUM: return createAllClassAndEnum();
      case UsePackage.SIMPLE_TYPES: return createSimpleTypes();
      case UsePackage.ENUM: return createEnum();
      case UsePackage.CLASS: return createClass();
      case UsePackage.GENERALIZATION: return createGeneralization();
      case UsePackage.ASSOCIATION: return createAssociation();
      case UsePackage.ASSOCIATION_END: return createAssociationEnd();
      case UsePackage.ASSOCIATION_CLASS: return createAssociationClass();
      case UsePackage.ATTRIBUTES_BASE: return createAttributesBase();
      case UsePackage.ATTRIBUTE: return createAttribute();
      case UsePackage.OPERATIONS_BASE: return createOperationsBase();
      case UsePackage.OPERATION_TYPE: return createOperationType();
      case UsePackage.OPERATION_QUERY: return createOperationQuery();
      case UsePackage.OPERATION_COMPLEX: return createOperationComplex();
      case UsePackage.OPERATION_DECLARATION: return createOperationDeclaration();
      case UsePackage.PARAMETER: return createParameter();
      case UsePackage.STATE_MACHINES_BASE: return createStateMachinesBase();
      case UsePackage.STATE_MACHINE: return createStateMachine();
      case UsePackage.STATE: return createState();
      case UsePackage.TRANSITION: return createTransition();
      case UsePackage.CONSTRAINTS_BASE: return createConstraintsBase();
      case UsePackage.CONSTRAINS_GENERAL: return createConstrainsGeneral();
      case UsePackage.CONTEXTS_TYPE: return createContextsType();
      case UsePackage.INVARIANT_CONTEXT: return createInvariantContext();
      case UsePackage.INVARIANT_DEFINITION: return createInvariantDefinition();
      case UsePackage.OPERATION_CONTEXT: return createOperationContext();
      case UsePackage.OPERATION_CONSTRAINTS: return createOperationConstraints();
      case UsePackage.CONDITION_TYPE: return createConditionType();
      case UsePackage.PRECONDITION: return createPrecondition();
      case UsePackage.POSTCONDITION: return createPostcondition();
      case UsePackage.PRIMITIVE_TYPE_REF_CS: return createPrimitiveTypeRefCS();
      case UsePackage.COLLECTION_TYPE_CS: return createCollectionTypeCS();
      case UsePackage.MAP_TYPE_CS: return createMapTypeCS();
      case UsePackage.TUPLE_TYPE_CS: return createTupleTypeCS();
      case UsePackage.TUPLE_PART_CS: return createTuplePartCS();
      case UsePackage.COLLECTION_PATTERN_CS: return createCollectionPatternCS();
      case UsePackage.PATTERN_EXP_CS: return createPatternExpCS();
      case UsePackage.TYPED_REF_CS: return createTypedRefCS();
      case UsePackage.TYPE_LITERAL_EXP_CS: return createTypeLiteralExpCS();
      case UsePackage.TYPE_NAME_EXP_CS: return createTypeNameExpCS();
      case UsePackage.CURLY_BRACKETED_CLAUSE_CS: return createCurlyBracketedClauseCS();
      case UsePackage.SHADOW_PART_CS: return createShadowPartCS();
      case UsePackage.STRING_LITERAL_EXP_CS: return createStringLiteralExpCS();
      case UsePackage.MULTIPLICITY_BOUNDS_CS: return createMultiplicityBoundsCS();
      case UsePackage.MULTIPLICITY_CS: return createMultiplicityCS();
      case UsePackage.MULTIPLICITY_STRING_CS: return createMultiplicityStringCS();
      case UsePackage.PATH_NAME_CS: return createPathNameCS();
      case UsePackage.EXP_CS: return createExpCS();
      case UsePackage.PRIMITIVE_LITERAL_EXP_CS: return createPrimitiveLiteralExpCS();
      case UsePackage.NAME_EXP_CS: return createNameExpCS();
      case UsePackage.SQUARE_BRACKETED_CLAUSE_CS: return createSquareBracketedClauseCS();
      case UsePackage.COLLECTION_LITERAL_EXP_CS: return createCollectionLiteralExpCS();
      case UsePackage.COLLECTION_LITERAL_PART_CS: return createCollectionLiteralPartCS();
      case UsePackage.LAMBDA_LITERAL_EXP_CS: return createLambdaLiteralExpCS();
      case UsePackage.MAP_LITERAL_EXP_CS: return createMapLiteralExpCS();
      case UsePackage.MAP_LITERAL_PART_CS: return createMapLiteralPartCS();
      case UsePackage.TUPLE_LITERAL_EXP_CS: return createTupleLiteralExpCS();
      case UsePackage.TUPLE_LITERAL_PART_CS: return createTupleLiteralPartCS();
      case UsePackage.NUMBER_LITERAL_EXP_CS: return createNumberLiteralExpCS();
      case UsePackage.BOOLEAN_LITERAL_EXP_CS: return createBooleanLiteralExpCS();
      case UsePackage.UNLIMITED_NATURAL_LITERAL_EXP_CS: return createUnlimitedNaturalLiteralExpCS();
      case UsePackage.INVALID_LITERAL_EXP_CS: return createInvalidLiteralExpCS();
      case UsePackage.NULL_LITERAL_EXP_CS: return createNullLiteralExpCS();
      case UsePackage.NESTED_EXP_CS: return createNestedExpCS();
      case UsePackage.SELF_EXP_CS: return createSelfExpCS();
      case UsePackage.IF_EXP_CS: return createIfExpCS();
      case UsePackage.IF_THEN_EXP_CS: return createIfThenExpCS();
      case UsePackage.LET_EXP_CS: return createLetExpCS();
      case UsePackage.LET_VARIABLE_CS: return createLetVariableCS();
      case UsePackage.ROUND_BRACKETED_CLAUSE_CS: return createRoundBracketedClauseCS();
      case UsePackage.NAVIGATING_ARG_CS: return createNavigatingArgCS();
      case UsePackage.VARIABLE_CS: return createVariableCS();
      case UsePackage.INFIX_EXP_CS: return createInfixExpCS();
      case UsePackage.PREFIX_EXP_CS: return createPrefixExpCS();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ModelUSE createModelUSE()
  {
    ModelUSEImpl modelUSE = new ModelUSEImpl();
    return modelUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Multiplicity createMultiplicity()
  {
    MultiplicityImpl multiplicity = new MultiplicityImpl();
    return multiplicity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AllTypes createAllTypes()
  {
    AllTypesImpl allTypes = new AllTypesImpl();
    return allTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CollectionType createCollectionType()
  {
    CollectionTypeImpl collectionType = new CollectionTypeImpl();
    return collectionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AllClass createAllClass()
  {
    AllClassImpl allClass = new AllClassImpl();
    return allClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AllClassAndEnum createAllClassAndEnum()
  {
    AllClassAndEnumImpl allClassAndEnum = new AllClassAndEnumImpl();
    return allClassAndEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SimpleTypes createSimpleTypes()
  {
    SimpleTypesImpl simpleTypes = new SimpleTypesImpl();
    return simpleTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public modelConverter.use_language.use.Enum createEnum()
  {
    EnumImpl enum_ = new EnumImpl();
    return enum_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public modelConverter.use_language.use.Class createClass()
  {
    ClassImpl class_ = new ClassImpl();
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Generalization createGeneralization()
  {
    GeneralizationImpl generalization = new GeneralizationImpl();
    return generalization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Association createAssociation()
  {
    AssociationImpl association = new AssociationImpl();
    return association;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AssociationEnd createAssociationEnd()
  {
    AssociationEndImpl associationEnd = new AssociationEndImpl();
    return associationEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AssociationClass createAssociationClass()
  {
    AssociationClassImpl associationClass = new AssociationClassImpl();
    return associationClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AttributesBase createAttributesBase()
  {
    AttributesBaseImpl attributesBase = new AttributesBaseImpl();
    return attributesBase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OperationsBase createOperationsBase()
  {
    OperationsBaseImpl operationsBase = new OperationsBaseImpl();
    return operationsBase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OperationType createOperationType()
  {
    OperationTypeImpl operationType = new OperationTypeImpl();
    return operationType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OperationQuery createOperationQuery()
  {
    OperationQueryImpl operationQuery = new OperationQueryImpl();
    return operationQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OperationComplex createOperationComplex()
  {
    OperationComplexImpl operationComplex = new OperationComplexImpl();
    return operationComplex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OperationDeclaration createOperationDeclaration()
  {
    OperationDeclarationImpl operationDeclaration = new OperationDeclarationImpl();
    return operationDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StateMachinesBase createStateMachinesBase()
  {
    StateMachinesBaseImpl stateMachinesBase = new StateMachinesBaseImpl();
    return stateMachinesBase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StateMachine createStateMachine()
  {
    StateMachineImpl stateMachine = new StateMachineImpl();
    return stateMachine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Transition createTransition()
  {
    TransitionImpl transition = new TransitionImpl();
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConstraintsBase createConstraintsBase()
  {
    ConstraintsBaseImpl constraintsBase = new ConstraintsBaseImpl();
    return constraintsBase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConstrainsGeneral createConstrainsGeneral()
  {
    ConstrainsGeneralImpl constrainsGeneral = new ConstrainsGeneralImpl();
    return constrainsGeneral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ContextsType createContextsType()
  {
    ContextsTypeImpl contextsType = new ContextsTypeImpl();
    return contextsType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InvariantContext createInvariantContext()
  {
    InvariantContextImpl invariantContext = new InvariantContextImpl();
    return invariantContext;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InvariantDefinition createInvariantDefinition()
  {
    InvariantDefinitionImpl invariantDefinition = new InvariantDefinitionImpl();
    return invariantDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OperationContext createOperationContext()
  {
    OperationContextImpl operationContext = new OperationContextImpl();
    return operationContext;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OperationConstraints createOperationConstraints()
  {
    OperationConstraintsImpl operationConstraints = new OperationConstraintsImpl();
    return operationConstraints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConditionType createConditionType()
  {
    ConditionTypeImpl conditionType = new ConditionTypeImpl();
    return conditionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Precondition createPrecondition()
  {
    PreconditionImpl precondition = new PreconditionImpl();
    return precondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Postcondition createPostcondition()
  {
    PostconditionImpl postcondition = new PostconditionImpl();
    return postcondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PrimitiveTypeRefCS createPrimitiveTypeRefCS()
  {
    PrimitiveTypeRefCSImpl primitiveTypeRefCS = new PrimitiveTypeRefCSImpl();
    return primitiveTypeRefCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CollectionTypeCS createCollectionTypeCS()
  {
    CollectionTypeCSImpl collectionTypeCS = new CollectionTypeCSImpl();
    return collectionTypeCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MapTypeCS createMapTypeCS()
  {
    MapTypeCSImpl mapTypeCS = new MapTypeCSImpl();
    return mapTypeCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TupleTypeCS createTupleTypeCS()
  {
    TupleTypeCSImpl tupleTypeCS = new TupleTypeCSImpl();
    return tupleTypeCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TuplePartCS createTuplePartCS()
  {
    TuplePartCSImpl tuplePartCS = new TuplePartCSImpl();
    return tuplePartCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CollectionPatternCS createCollectionPatternCS()
  {
    CollectionPatternCSImpl collectionPatternCS = new CollectionPatternCSImpl();
    return collectionPatternCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PatternExpCS createPatternExpCS()
  {
    PatternExpCSImpl patternExpCS = new PatternExpCSImpl();
    return patternExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypedRefCS createTypedRefCS()
  {
    TypedRefCSImpl typedRefCS = new TypedRefCSImpl();
    return typedRefCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypeLiteralExpCS createTypeLiteralExpCS()
  {
    TypeLiteralExpCSImpl typeLiteralExpCS = new TypeLiteralExpCSImpl();
    return typeLiteralExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypeNameExpCS createTypeNameExpCS()
  {
    TypeNameExpCSImpl typeNameExpCS = new TypeNameExpCSImpl();
    return typeNameExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CurlyBracketedClauseCS createCurlyBracketedClauseCS()
  {
    CurlyBracketedClauseCSImpl curlyBracketedClauseCS = new CurlyBracketedClauseCSImpl();
    return curlyBracketedClauseCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ShadowPartCS createShadowPartCS()
  {
    ShadowPartCSImpl shadowPartCS = new ShadowPartCSImpl();
    return shadowPartCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringLiteralExpCS createStringLiteralExpCS()
  {
    StringLiteralExpCSImpl stringLiteralExpCS = new StringLiteralExpCSImpl();
    return stringLiteralExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MultiplicityBoundsCS createMultiplicityBoundsCS()
  {
    MultiplicityBoundsCSImpl multiplicityBoundsCS = new MultiplicityBoundsCSImpl();
    return multiplicityBoundsCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MultiplicityCS createMultiplicityCS()
  {
    MultiplicityCSImpl multiplicityCS = new MultiplicityCSImpl();
    return multiplicityCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MultiplicityStringCS createMultiplicityStringCS()
  {
    MultiplicityStringCSImpl multiplicityStringCS = new MultiplicityStringCSImpl();
    return multiplicityStringCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PathNameCS createPathNameCS()
  {
    PathNameCSImpl pathNameCS = new PathNameCSImpl();
    return pathNameCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpCS createExpCS()
  {
    ExpCSImpl expCS = new ExpCSImpl();
    return expCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PrimitiveLiteralExpCS createPrimitiveLiteralExpCS()
  {
    PrimitiveLiteralExpCSImpl primitiveLiteralExpCS = new PrimitiveLiteralExpCSImpl();
    return primitiveLiteralExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NameExpCS createNameExpCS()
  {
    NameExpCSImpl nameExpCS = new NameExpCSImpl();
    return nameExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SquareBracketedClauseCS createSquareBracketedClauseCS()
  {
    SquareBracketedClauseCSImpl squareBracketedClauseCS = new SquareBracketedClauseCSImpl();
    return squareBracketedClauseCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CollectionLiteralExpCS createCollectionLiteralExpCS()
  {
    CollectionLiteralExpCSImpl collectionLiteralExpCS = new CollectionLiteralExpCSImpl();
    return collectionLiteralExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CollectionLiteralPartCS createCollectionLiteralPartCS()
  {
    CollectionLiteralPartCSImpl collectionLiteralPartCS = new CollectionLiteralPartCSImpl();
    return collectionLiteralPartCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LambdaLiteralExpCS createLambdaLiteralExpCS()
  {
    LambdaLiteralExpCSImpl lambdaLiteralExpCS = new LambdaLiteralExpCSImpl();
    return lambdaLiteralExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MapLiteralExpCS createMapLiteralExpCS()
  {
    MapLiteralExpCSImpl mapLiteralExpCS = new MapLiteralExpCSImpl();
    return mapLiteralExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MapLiteralPartCS createMapLiteralPartCS()
  {
    MapLiteralPartCSImpl mapLiteralPartCS = new MapLiteralPartCSImpl();
    return mapLiteralPartCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TupleLiteralExpCS createTupleLiteralExpCS()
  {
    TupleLiteralExpCSImpl tupleLiteralExpCS = new TupleLiteralExpCSImpl();
    return tupleLiteralExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TupleLiteralPartCS createTupleLiteralPartCS()
  {
    TupleLiteralPartCSImpl tupleLiteralPartCS = new TupleLiteralPartCSImpl();
    return tupleLiteralPartCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NumberLiteralExpCS createNumberLiteralExpCS()
  {
    NumberLiteralExpCSImpl numberLiteralExpCS = new NumberLiteralExpCSImpl();
    return numberLiteralExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BooleanLiteralExpCS createBooleanLiteralExpCS()
  {
    BooleanLiteralExpCSImpl booleanLiteralExpCS = new BooleanLiteralExpCSImpl();
    return booleanLiteralExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnlimitedNaturalLiteralExpCS createUnlimitedNaturalLiteralExpCS()
  {
    UnlimitedNaturalLiteralExpCSImpl unlimitedNaturalLiteralExpCS = new UnlimitedNaturalLiteralExpCSImpl();
    return unlimitedNaturalLiteralExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InvalidLiteralExpCS createInvalidLiteralExpCS()
  {
    InvalidLiteralExpCSImpl invalidLiteralExpCS = new InvalidLiteralExpCSImpl();
    return invalidLiteralExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NullLiteralExpCS createNullLiteralExpCS()
  {
    NullLiteralExpCSImpl nullLiteralExpCS = new NullLiteralExpCSImpl();
    return nullLiteralExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NestedExpCS createNestedExpCS()
  {
    NestedExpCSImpl nestedExpCS = new NestedExpCSImpl();
    return nestedExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SelfExpCS createSelfExpCS()
  {
    SelfExpCSImpl selfExpCS = new SelfExpCSImpl();
    return selfExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IfExpCS createIfExpCS()
  {
    IfExpCSImpl ifExpCS = new IfExpCSImpl();
    return ifExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IfThenExpCS createIfThenExpCS()
  {
    IfThenExpCSImpl ifThenExpCS = new IfThenExpCSImpl();
    return ifThenExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LetExpCS createLetExpCS()
  {
    LetExpCSImpl letExpCS = new LetExpCSImpl();
    return letExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LetVariableCS createLetVariableCS()
  {
    LetVariableCSImpl letVariableCS = new LetVariableCSImpl();
    return letVariableCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RoundBracketedClauseCS createRoundBracketedClauseCS()
  {
    RoundBracketedClauseCSImpl roundBracketedClauseCS = new RoundBracketedClauseCSImpl();
    return roundBracketedClauseCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NavigatingArgCS createNavigatingArgCS()
  {
    NavigatingArgCSImpl navigatingArgCS = new NavigatingArgCSImpl();
    return navigatingArgCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableCS createVariableCS()
  {
    VariableCSImpl variableCS = new VariableCSImpl();
    return variableCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InfixExpCS createInfixExpCS()
  {
    InfixExpCSImpl infixExpCS = new InfixExpCSImpl();
    return infixExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PrefixExpCS createPrefixExpCS()
  {
    PrefixExpCSImpl prefixExpCS = new PrefixExpCSImpl();
    return prefixExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UsePackage getUsePackage()
  {
    return (UsePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static UsePackage getPackage()
  {
    return UsePackage.eINSTANCE;
  }

} //UseFactoryImpl
