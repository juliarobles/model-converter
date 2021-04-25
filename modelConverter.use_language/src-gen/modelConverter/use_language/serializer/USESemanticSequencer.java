/*
 * generated by Xtext 2.25.0
 */
package modelConverter.use_language.serializer;

import com.google.inject.Inject;
import java.util.Set;
import modelConverter.use_language.services.USEGrammarAccess;
import modelConverter.use_language.use.Association;
import modelConverter.use_language.use.AssociationClass;
import modelConverter.use_language.use.AssociationEnd;
import modelConverter.use_language.use.Attribute;
import modelConverter.use_language.use.AttributesBase;
import modelConverter.use_language.use.ConstrainsGeneral;
import modelConverter.use_language.use.ConstraintsBase;
import modelConverter.use_language.use.Generalization;
import modelConverter.use_language.use.InvariantContext;
import modelConverter.use_language.use.InvariantDefinition;
import modelConverter.use_language.use.Model;
import modelConverter.use_language.use.Multiplicity;
import modelConverter.use_language.use.OperationComplex;
import modelConverter.use_language.use.OperationConstraints;
import modelConverter.use_language.use.OperationContext;
import modelConverter.use_language.use.OperationDeclaration;
import modelConverter.use_language.use.OperationQuery;
import modelConverter.use_language.use.OperationsBase;
import modelConverter.use_language.use.Postcondition;
import modelConverter.use_language.use.Precondition;
import modelConverter.use_language.use.SimpleTypes;
import modelConverter.use_language.use.UsePackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class USESemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private USEGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == UsePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case UsePackage.ASSOCIATION:
				sequence_Association(context, (Association) semanticObject); 
				return; 
			case UsePackage.ASSOCIATION_CLASS:
				sequence_AssociationClass(context, (AssociationClass) semanticObject); 
				return; 
			case UsePackage.ASSOCIATION_END:
				sequence_AssociationEnd(context, (AssociationEnd) semanticObject); 
				return; 
			case UsePackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case UsePackage.ATTRIBUTES_BASE:
				sequence_AttributesBase(context, (AttributesBase) semanticObject); 
				return; 
			case UsePackage.CLASS:
				sequence_Class(context, (modelConverter.use_language.use.Class) semanticObject); 
				return; 
			case UsePackage.CONSTRAINS_GENERAL:
				sequence_ConstrainsGeneral(context, (ConstrainsGeneral) semanticObject); 
				return; 
			case UsePackage.CONSTRAINTS_BASE:
				sequence_ConstraintsBase(context, (ConstraintsBase) semanticObject); 
				return; 
			case UsePackage.ENUM:
				sequence_Enum(context, (modelConverter.use_language.use.Enum) semanticObject); 
				return; 
			case UsePackage.GENERALIZATION:
				sequence_Generalization(context, (Generalization) semanticObject); 
				return; 
			case UsePackage.INVARIANT_CONTEXT:
				sequence_InvariantContext(context, (InvariantContext) semanticObject); 
				return; 
			case UsePackage.INVARIANT_DEFINITION:
				sequence_InvariantDefinition(context, (InvariantDefinition) semanticObject); 
				return; 
			case UsePackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case UsePackage.MULTIPLICITY:
				sequence_Multiplicity(context, (Multiplicity) semanticObject); 
				return; 
			case UsePackage.OPERATION_COMPLEX:
				sequence_OperationComplex(context, (OperationComplex) semanticObject); 
				return; 
			case UsePackage.OPERATION_CONSTRAINTS:
				sequence_OperationConstraints(context, (OperationConstraints) semanticObject); 
				return; 
			case UsePackage.OPERATION_CONTEXT:
				sequence_OperationContext(context, (OperationContext) semanticObject); 
				return; 
			case UsePackage.OPERATION_DECLARATION:
				sequence_OperationDeclaration(context, (OperationDeclaration) semanticObject); 
				return; 
			case UsePackage.OPERATION_QUERY:
				sequence_OperationQuery(context, (OperationQuery) semanticObject); 
				return; 
			case UsePackage.OPERATIONS_BASE:
				sequence_OperationsBase(context, (OperationsBase) semanticObject); 
				return; 
			case UsePackage.PARAMETER:
				sequence_Parameter(context, (modelConverter.use_language.use.Parameter) semanticObject); 
				return; 
			case UsePackage.POSTCONDITION:
				sequence_Postcondition(context, (Postcondition) semanticObject); 
				return; 
			case UsePackage.PRECONDITION:
				sequence_Precondition(context, (Precondition) semanticObject); 
				return; 
			case UsePackage.SIMPLE_TYPES:
				sequence_SimpleTypes(context, (SimpleTypes) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Type returns AssociationClass
	 *     AllClass returns AssociationClass
	 *     AssociationClass returns AssociationClass
	 *
	 * Constraint:
	 *     (
	 *         abstract?='abstract'? 
	 *         name=ID 
	 *         generalization+=Generalization* 
	 *         associationEnds+=AssociationEnd+ 
	 *         attributes=AttributesBase? 
	 *         operations=OperationsBase? 
	 *         constraints=ConstraintsBase?
	 *     )
	 */
	protected void sequence_AssociationClass(ISerializationContext context, AssociationClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AssociationEnd returns AssociationEnd
	 *
	 * Constraint:
	 *     (type=[AllClass|ID] mul=Multiplicity role=ID? ordered?='ordered'?)
	 */
	protected void sequence_AssociationEnd(ISerializationContext context, AssociationEnd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Association
	 *     Association returns Association
	 *
	 * Constraint:
	 *     ((typeAssociation='association' | typeAssociation='aggregation' | typeAssociation='composition') name=ID associationEnds+=AssociationEnd+)
	 */
	protected void sequence_Association(ISerializationContext context, Association semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (name=ID type=SimpleTypes)
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UsePackage.Literals.ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UsePackage.Literals.ATTRIBUTE__NAME));
			if (transientValues.isValueTransient(semanticObject, UsePackage.Literals.ATTRIBUTE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UsePackage.Literals.ATTRIBUTE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAttributeAccess().getTypeSimpleTypesParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AttributesBase returns AttributesBase
	 *
	 * Constraint:
	 *     attributes+=Attribute+
	 */
	protected void sequence_AttributesBase(ISerializationContext context, AttributesBase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Class
	 *     AllClass returns Class
	 *     Class returns Class
	 *
	 * Constraint:
	 *     (
	 *         abstract?='abstract'? 
	 *         name=ID 
	 *         generalization+=Generalization* 
	 *         attributes=AttributesBase? 
	 *         operations=OperationsBase? 
	 *         constraints=ConstraintsBase?
	 *     )
	 */
	protected void sequence_Class(ISerializationContext context, modelConverter.use_language.use.Class semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConstrainsGeneral returns ConstrainsGeneral
	 *
	 * Constraint:
	 *     contexts+=ContextsType+
	 */
	protected void sequence_ConstrainsGeneral(ISerializationContext context, ConstrainsGeneral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConstraintsBase returns ConstraintsBase
	 *
	 * Constraint:
	 *     invariants+=InvariantDefinition+
	 */
	protected void sequence_ConstraintsBase(ISerializationContext context, ConstraintsBase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Enum returns Enum
	 *
	 * Constraint:
	 *     (name=ID? elements+=EnumElement+)
	 */
	protected void sequence_Enum(ISerializationContext context, modelConverter.use_language.use.Enum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Generalization returns Generalization
	 *
	 * Constraint:
	 *     general=[AllClass|ID]
	 */
	protected void sequence_Generalization(ISerializationContext context, Generalization semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UsePackage.Literals.GENERALIZATION__GENERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UsePackage.Literals.GENERALIZATION__GENERAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGeneralizationAccess().getGeneralAllClassIDTerminalRuleCall_0_0_1(), semanticObject.eGet(UsePackage.Literals.GENERALIZATION__GENERAL, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ContextsType returns InvariantContext
	 *     InvariantContext returns InvariantContext
	 *
	 * Constraint:
	 *     (variablename=ID? classname=[AllClass|ID] invariants+=InvariantDefinition*)
	 */
	protected void sequence_InvariantContext(ISerializationContext context, InvariantContext semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InvariantDefinition returns InvariantDefinition
	 *
	 * Constraint:
	 *     (name=ID? oclexpression=OCLExpression)
	 */
	protected void sequence_InvariantDefinition(ISerializationContext context, InvariantDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (name=ID enums+=Enum* packagedElement+=Type* constraints=ConstrainsGeneral?)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Multiplicity returns Multiplicity
	 *
	 * Constraint:
	 *     (
	 *         (minValue+='*' | minValue+=IntToString) 
	 *         (maxValue+='*' | maxValue+=IntToString)? 
	 *         ((minValue+='*' | minValue+=IntToString) (maxValue+='*' | maxValue+=IntToString)?)*
	 *     )
	 */
	protected void sequence_Multiplicity(ISerializationContext context, Multiplicity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OperationType returns OperationComplex
	 *     OperationComplex returns OperationComplex
	 *
	 * Constraint:
	 *     (operationDeclaration=OperationDeclaration operationbody=OCLExpression? conditions+=ConditionType*)
	 */
	protected void sequence_OperationComplex(ISerializationContext context, OperationComplex semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OperationConstraints returns OperationConstraints
	 *
	 * Constraint:
	 *     (operationDeclaration=OperationDeclaration conditions+=ConditionType+)
	 */
	protected void sequence_OperationConstraints(ISerializationContext context, OperationConstraints semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ContextsType returns OperationContext
	 *     OperationContext returns OperationContext
	 *
	 * Constraint:
	 *     (classname=[AllClass|ID] constrains=OperationConstraints)
	 */
	protected void sequence_OperationContext(ISerializationContext context, OperationContext semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UsePackage.Literals.CONTEXTS_TYPE__CLASSNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UsePackage.Literals.CONTEXTS_TYPE__CLASSNAME));
			if (transientValues.isValueTransient(semanticObject, UsePackage.Literals.OPERATION_CONTEXT__CONSTRAINS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UsePackage.Literals.OPERATION_CONTEXT__CONSTRAINS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOperationContextAccess().getClassnameAllClassIDTerminalRuleCall_1_0_1(), semanticObject.eGet(UsePackage.Literals.CONTEXTS_TYPE__CLASSNAME, false));
		feeder.accept(grammarAccess.getOperationContextAccess().getConstrainsOperationConstraintsParserRuleCall_2_0(), semanticObject.getConstrains());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     OperationDeclaration returns OperationDeclaration
	 *
	 * Constraint:
	 *     (name=ID parameters+=Parameter* returnType=SimpleTypes?)
	 */
	protected void sequence_OperationDeclaration(ISerializationContext context, OperationDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OperationType returns OperationQuery
	 *     OperationQuery returns OperationQuery
	 *
	 * Constraint:
	 *     (operationDeclaration=OperationDeclaration operationbody=OCLExpression conditions+=ConditionType*)
	 */
	protected void sequence_OperationQuery(ISerializationContext context, OperationQuery semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OperationsBase returns OperationsBase
	 *
	 * Constraint:
	 *     operations+=OperationType+
	 */
	protected void sequence_OperationsBase(ISerializationContext context, OperationsBase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (name=ID type=SimpleTypes)
	 */
	protected void sequence_Parameter(ISerializationContext context, modelConverter.use_language.use.Parameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UsePackage.Literals.PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UsePackage.Literals.PARAMETER__NAME));
			if (transientValues.isValueTransient(semanticObject, UsePackage.Literals.PARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UsePackage.Literals.PARAMETER__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getParameterAccess().getTypeSimpleTypesParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ConditionType returns Postcondition
	 *     Postcondition returns Postcondition
	 *
	 * Constraint:
	 *     (name=ID? oclexpression=OCLExpression)
	 */
	protected void sequence_Postcondition(ISerializationContext context, Postcondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConditionType returns Precondition
	 *     Precondition returns Precondition
	 *
	 * Constraint:
	 *     (name=ID? oclexpression=OCLExpression)
	 */
	protected void sequence_Precondition(ISerializationContext context, Precondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SimpleTypes returns SimpleTypes
	 *
	 * Constraint:
	 *     (defaultType=DefaultType | referended=[AllClass|ID])
	 */
	protected void sequence_SimpleTypes(ISerializationContext context, SimpleTypes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
