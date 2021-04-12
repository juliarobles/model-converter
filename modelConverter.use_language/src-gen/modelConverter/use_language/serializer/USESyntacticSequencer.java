/*
 * generated by Xtext 2.25.0
 */
package modelConverter.use_language.serializer;

import com.google.inject.Inject;
import java.util.List;
import modelConverter.use_language.services.USEGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class USESyntacticSequencer extends AbstractSyntacticSequencer {

	protected USEGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Aggregation_AssociationBasic_Composition_AggregationKeyword_0_or_AssociationKeyword_0_or_CompositionKeyword_0;
	protected AbstractElementAlias match_AssociationClass_AttributesKeyword_6_0_q;
	protected AbstractElementAlias match_AssociationClass_LessThanSignKeyword_3_0_q;
	protected AbstractElementAlias match_AssociationClass_OperationsKeyword_7_0_q;
	protected AbstractElementAlias match_Class_AttributesKeyword_4_0_q;
	protected AbstractElementAlias match_Generalization_CommaKeyword_1_q;
	protected AbstractElementAlias match_OwnedLiteral_CommaKeyword_1_q;
	protected AbstractElementAlias match_OwnedParameter_CommaKeyword_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (USEGrammarAccess) access;
		match_Aggregation_AssociationBasic_Composition_AggregationKeyword_0_or_AssociationKeyword_0_or_CompositionKeyword_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAggregationAccess().getAggregationKeyword_0()), new TokenAlias(false, false, grammarAccess.getAssociationBasicAccess().getAssociationKeyword_0()), new TokenAlias(false, false, grammarAccess.getCompositionAccess().getCompositionKeyword_0()));
		match_AssociationClass_AttributesKeyword_6_0_q = new TokenAlias(false, true, grammarAccess.getAssociationClassAccess().getAttributesKeyword_6_0());
		match_AssociationClass_LessThanSignKeyword_3_0_q = new TokenAlias(false, true, grammarAccess.getAssociationClassAccess().getLessThanSignKeyword_3_0());
		match_AssociationClass_OperationsKeyword_7_0_q = new TokenAlias(false, true, grammarAccess.getAssociationClassAccess().getOperationsKeyword_7_0());
		match_Class_AttributesKeyword_4_0_q = new TokenAlias(false, true, grammarAccess.getClassAccess().getAttributesKeyword_4_0());
		match_Generalization_CommaKeyword_1_q = new TokenAlias(false, true, grammarAccess.getGeneralizationAccess().getCommaKeyword_1());
		match_OwnedLiteral_CommaKeyword_1_q = new TokenAlias(false, true, grammarAccess.getOwnedLiteralAccess().getCommaKeyword_1());
		match_OwnedParameter_CommaKeyword_1_q = new TokenAlias(false, true, grammarAccess.getOwnedParameterAccess().getCommaKeyword_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getDefaultTypeRule())
			return getDefaultTypeToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * DefaultType:
	 * 	'Integer' | 'String' | 'Real' | 'Boolean';
	 */
	protected String getDefaultTypeToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "Integer";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Aggregation_AssociationBasic_Composition_AggregationKeyword_0_or_AssociationKeyword_0_or_CompositionKeyword_0.equals(syntax))
				emit_Aggregation_AssociationBasic_Composition_AggregationKeyword_0_or_AssociationKeyword_0_or_CompositionKeyword_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_AssociationClass_AttributesKeyword_6_0_q.equals(syntax))
				emit_AssociationClass_AttributesKeyword_6_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_AssociationClass_LessThanSignKeyword_3_0_q.equals(syntax))
				emit_AssociationClass_LessThanSignKeyword_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_AssociationClass_OperationsKeyword_7_0_q.equals(syntax))
				emit_AssociationClass_OperationsKeyword_7_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Class_AttributesKeyword_4_0_q.equals(syntax))
				emit_Class_AttributesKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Generalization_CommaKeyword_1_q.equals(syntax))
				emit_Generalization_CommaKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_OwnedLiteral_CommaKeyword_1_q.equals(syntax))
				emit_OwnedLiteral_CommaKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_OwnedParameter_CommaKeyword_1_q.equals(syntax))
				emit_OwnedParameter_CommaKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'association' | 'aggregation' | 'composition'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) name=ID
	 */
	protected void emit_Aggregation_AssociationBasic_Composition_AggregationKeyword_0_or_AssociationKeyword_0_or_CompositionKeyword_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'attributes'?
	 *
	 * This ambiguous syntax occurs at:
	 *     memberEnds+=MemberEnd (ambiguity) 'operations' operations+=OperationType
	 *     memberEnds+=MemberEnd (ambiguity) 'operations'? 'end' (rule end)
	 *     memberEnds+=MemberEnd (ambiguity) 'operations'? constraints=ConstraintsBase
	 */
	protected void emit_AssociationClass_AttributesKeyword_6_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '<'?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) 'between' memberEnds+=MemberEnd
	 */
	protected void emit_AssociationClass_LessThanSignKeyword_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'operations'?
	 *
	 * This ambiguous syntax occurs at:
	 *     memberEnds+=MemberEnd 'attributes'? (ambiguity) 'end' (rule end)
	 *     memberEnds+=MemberEnd 'attributes'? (ambiguity) constraints=ConstraintsBase
	 *     ownedAttribute+=Attribute (ambiguity) 'end' (rule end)
	 *     ownedAttribute+=Attribute (ambiguity) constraints=ConstraintsBase
	 */
	protected void emit_AssociationClass_OperationsKeyword_7_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'attributes'?
	 *
	 * This ambiguous syntax occurs at:
	 *     generalization+=Generalization (ambiguity) 'end' (rule end)
	 *     generalization+=Generalization (ambiguity) constraints=ConstraintsBase
	 *     generalization+=Generalization (ambiguity) ownedOperation=OperationsBase
	 *     name=ID (ambiguity) 'end' (rule end)
	 *     name=ID (ambiguity) constraints=ConstraintsBase
	 *     name=ID (ambiguity) ownedOperation=OperationsBase
	 */
	protected void emit_Class_AttributesKeyword_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     general+=[AllClass|ID] (ambiguity) (rule end)
	 */
	protected void emit_Generalization_CommaKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) (rule end)
	 */
	protected void emit_OwnedLiteral_CommaKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     type=SimpleTypes (ambiguity) (rule end)
	 */
	protected void emit_OwnedParameter_CommaKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
