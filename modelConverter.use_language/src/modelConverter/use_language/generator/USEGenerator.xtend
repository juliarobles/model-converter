/*
 * generated by Xtext 2.25.0
 */
package modelConverter.use_language.generator

import modelConverter.use_language.use.AttributesBase
import modelConverter.use_language.use.Class
import modelConverter.use_language.use.Enum
import modelConverter.use_language.use.Generalization
import modelConverter.use_language.use.Type
import modelConverter.use_language.use.AssociationClass
import modelConverter.use_language.use.Association
import modelConverter.use_language.use.AssociationEnd
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import com.google.common.collect.Iterables
import modelConverter.use_language.use.OperationsBase
import modelConverter.use_language.use.OperationQuery
import modelConverter.use_language.use.Parameter
import modelConverter.use_language.use.SimpleTypes
import modelConverter.use_language.use.OperationType
import modelConverter.use_language.use.Postcondition
import modelConverter.use_language.use.Precondition
import modelConverter.use_language.use.ContextsType
import modelConverter.use_language.use.InvariantDefinition
import modelConverter.use_language.use.InvariantContext
import modelConverter.use_language.use.OperationContext
import modelConverter.use_language.use.OperationConstraints
import org.eclipse.emf.common.util.BasicEList
import modelConverter.use_language.use.AllTypes
import modelConverter.use_language.use.CollectionType
import modelConverter.use_language.use.ModelUSE
import modelConverter.use_language.use.ExpCS
import modelConverter.use_language.use.OperationComplex
import modelConverter.use_language.use.CollectionLiteralExpCS
import modelConverter.use_language.use.IfExpCS
import modelConverter.use_language.use.InfixExpCS
import modelConverter.use_language.use.LambdaLiteralExpCS
import modelConverter.use_language.use.LetExpCS
import modelConverter.use_language.use.MapLiteralExpCS
import modelConverter.use_language.use.NameExpCS
import modelConverter.use_language.use.NestedExpCS
import modelConverter.use_language.use.PrefixExpCS
import modelConverter.use_language.use.PrimitiveLiteralExpCS
import modelConverter.use_language.use.SelfExpCS
import modelConverter.use_language.use.TupleLiteralExpCS
import modelConverter.use_language.use.TypeLiteralExpCS
import modelConverter.use_language.use.CollectionTypeCS
import modelConverter.use_language.use.CollectionLiteralPartCS
import modelConverter.use_language.use.TypedRefCS
import modelConverter.use_language.use.MultiplicityCS
import modelConverter.use_language.use.MultiplicityBoundsCS
import modelConverter.use_language.use.MultiplicityStringCS
import modelConverter.use_language.use.CollectionPatternCS
import modelConverter.use_language.use.MapTypeCS
import modelConverter.use_language.use.PrimitiveTypeRefCS
import modelConverter.use_language.use.TupleTypeCS
import modelConverter.use_language.use.TypeNameExpCS
import modelConverter.use_language.use.PatternExpCS
import modelConverter.use_language.use.IfThenExpCS
import modelConverter.use_language.use.LetVariableCS
import modelConverter.use_language.use.RoundBracketedClauseCS
import modelConverter.use_language.use.MapLiteralPartCS
import modelConverter.use_language.use.PathNameCS
import modelConverter.use_language.use.SquareBracketedClauseCS
import modelConverter.use_language.use.CurlyBracketedClauseCS
import modelConverter.use_language.use.NumberLiteralExpCS
import modelConverter.use_language.use.StringLiteralExpCS
import modelConverter.use_language.use.BooleanLiteralExpCS
import modelConverter.use_language.use.UnlimitedNaturalLiteralExpCS
import modelConverter.use_language.use.InvalidLiteralExpCS
import modelConverter.use_language.use.NullLiteralExpCS
import modelConverter.use_language.use.TupleLiteralPartCS
import modelConverter.use_language.use.TuplePartCS
import modelConverter.use_language.use.ShadowPartCS
import modelConverter.use_language.use.NavigatingArgCS
import modelConverter.use_language.use.VariableCS
import modelConverter.use_language.use.StateMachinesBase

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class USEGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (e : resource.allContents.toIterable.filter(ModelUSE)) {
			fsa.generateFile("modelConverter_" + e.getName + ".uml", e.compileModel);
		}
	}

	private def compileModel(ModelUSE e) '''
		<?xml version="1.0" encoding="UTF-8"?>
		<xmi:XMI xmi:version="20131001" xmlns:xmi="http://www.omg.org/spec/XMI/20131001" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:MagicDrawProfile="http://www.omg.org/spec/UML/20131001/MagicDrawProfile" xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore" xmlns:uml="http://www.eclipse.org/uml2/5.0.0/UML" xsi:schemaLocation="http://www.omg.org/spec/UML/20131001/MagicDrawProfile UML_Standard_Profile.MagicDraw_Profile.profile.uml#_nPVN7YtIEeuebcn5BqfCXQ">
		   <uml:Model xmi:id="�System.identityHashCode(e)�" name="�e.getName�">
			�FOR f : e.getEnums�
				�f.compileEnum�
			�ENDFOR�
			�FOR f : e.getPackagedElement�
				�IF (e.getConstraints !== null)�
					�f.compileType(e.getPackagedElement, e.getConstraints.getContexts)�
				�ELSE�
					�f.compileType(e.getPackagedElement, new BasicEList<ContextsType>())�
				�ENDIF�
			�ENDFOR�
			</uml:Model>
		</xmi:XMI>
	'''

	private def compileEnum(Enum e) '''
		�        �<packagedElement xmi:type="uml:Enumeration" xmi:id="�System.identityHashCode(e)�" name="�e.getName�">
		�FOR enumElement : e.getElements()�
		�               �<ownedLiteral xmi:id="�System.identityHashCode(e)�" name="�enumElement.replaceAll(",", "")�"/>
		�ENDFOR�
		�        �</packagedElement>
	'''

	private def compileType(Type e, EList<Type> elementos, EList<ContextsType> constrains) '''
		�IF (e instanceof Class)�
			�e.compileClass(elementos.filter(a | a instanceof Association || a instanceof AssociationClass), constrains.filter(a | a.getClassname == e))�
		�ELSEIF (e instanceof Association)�
			�e.compileAssociation�
		�ELSEIF (e instanceof AssociationClass)�
			�e.compileAssociationClass�
		�ENDIF�
	'''

	private def compileClass(Class e, Iterable<Type> associations, Iterable<ContextsType> constraints) '''
		<packagedElement xmi:type="uml:Class" xmi:id="�System.identityHashCode(e)�" �IF e.isAbstract� abstract="true"�ENDIF� name="�e.getName()�">
		�IF e.getConstraints !== null�
			�e.getConstraints.getInvariants().compileConstraintsBase(System.identityHashCode(e))�
		�ENDIF�
		�IF constraints !== null�
			�FOR invContext : constraints.filter(InvariantContext)�
				�invContext.getInvariants().compileConstraintsBase(System.identityHashCode(e))�
			�ENDFOR�
		�ENDIF�
		�FOR generalization : e.getGeneralization()�
			�generalization.compileGeneralization�
		�ENDFOR�
		�IF e.getAttributes !== null �
			�e.getAttributes.compileAttributesBase�
		�ENDIF�
		�FOR association : associations.filter(Association).filter(a | a.getAssociationEnds().map[type].contains(e))�
			�IF association.getAssociationEnds().map[type].toSet.length == association.getAssociationEnds().length�
				�compileAssociationEnd(e, association.getAssociationEnds(), System.identityHashCode(association), getTypeAssociation(association).toString(), false)�
			�ELSE�
				�compileAssociationEnd(e, association.getAssociationEnds(), System.identityHashCode(association), getTypeAssociation(association).toString(), true)�
			�ENDIF�
		�ENDFOR�
		�FOR association : associations.filter(AssociationClass).filter(a | a.getAssociationEnds().map[type].contains(e))�
			�IF association.getAssociationEnds().map[type].toSet.length == association.getAssociationEnds().length�
				�compileAssociationEnd(e, association.getAssociationEnds(), System.identityHashCode(association), "", false)�
			�ELSE�
				�compileAssociationEnd(e, association.getAssociationEnds(), System.identityHashCode(association), "", true)�
			�ENDIF�
		�ENDFOR�
		�IF e.getOperations !== null �
			�e.getOperations.compileOperationsBase(constraints.filter(OperationContext))�
		�ENDIF�
		�IF e.getStatemachines !== null �
			�e.getStatemachines.compileStateMachinesBase�
		�ENDIF�
		</packagedElement>
	'''

	private def compileStateMachinesBase(StateMachinesBase e) '''
		�FOR statemachine : e.getStatemachines()�
		
		�ENDFOR�
	'''

	private def compileAssociationEnd(Class e, Iterable<AssociationEnd> list, int id, String aggregation, Boolean reflexive) '''
		�FOR end : list�
			�IF reflexive || end.getType() != e �
			<ownedAttribute xmi:id="�System.identityHashCode(end)�" name="�end.getRole�" type="�System.identityHashCode(end.getType)�" association="�id�" �IF end == list.get(Iterables.size(list)-1)��aggregation��ENDIF�>
			�IF end.getMul !== null && end.getMul.getMinValue !== null && end.getMul.getMinValue.length > 0�
				<lowerValue xmi:type="�end.getMul.getMinValue.get(0).getTypeMul�" xmi:id="�System.identityHashCode(end.getType).toString() + id + "1"�" name="" value="�end.getMul.getMinValue.get(0)�"/>
				�IF end.getMul.getMaxValue !== null && end.getMul.getMaxValue.length > 0�
					<upperValue xmi:type="�end.getMul.getMaxValue.get(0).getTypeMul�" xmi:id="�System.identityHashCode(end.getType).toString() + id + "2"�" name="" value="�end.getMul.getMaxValue.get(0)�"/>
				�ELSE�
					<upperValue xmi:type="�end.getMul.getMinValue.get(0).getTypeMul�" xmi:id="�System.identityHashCode(end.getType).toString() + id + "2"�" name="" value="�end.getMul.getMinValue.get(0)�"/>
				�ENDIF�
			�ENDIF�
				</ownedAttribute>
			�ENDIF�
		�ENDFOR�
	'''

	private def getTypeMul(String s) '''�IF s.equals("*") �uml:LiteralUnlimitedNatural�ELSE�uml:LiteralInteger�ENDIF�'''

	private def getTypeAssociation(Association ab) '''�IF (ab.getTypeAssociation() == "aggregation")�aggregation="shared"�ELSEIF (ab.getTypeAssociation() == "composition")�aggregation="composite"�ENDIF�'''

	private def compileGeneralization(Generalization e) '''
		<generalization xmi:id="�System.identityHashCode(e)�" general="�System.identityHashCode(e.getGeneral())�"/>
	'''

	private def compileConstraintsBase(EList<InvariantDefinition> list, int idClass) '''
		�FOR inv : list�
			�inv.getOclexpression.compileOwnedRule(System.identityHashCode(inv).toString, inv.getName, "constrainedElement=\"" + idClass + "\"")�
		�ENDFOR�
	'''

	private def compileAttributesBase(AttributesBase e) '''
		�FOR attribute : e.getAttributes()�
			<ownedAttribute xmi:id="�System.identityHashCode(attribute)�" name="�attribute.getName�" �IF attribute.getDeriveOCL !== null�isDerived="true" �ENDIF��IF attribute.getType() !== null && attribute.getType() instanceof SimpleTypes && (attribute.getType() as SimpleTypes).getReferended() !== null�type="�System.identityHashCode((attribute.getType() as SimpleTypes).getReferended())�"�ELSEIF attribute.getType() !== null && attribute.getType() instanceof CollectionType && (attribute.getType() as CollectionType).getType !== null && (attribute.getType() as CollectionType).getType.length > 0 && ((attribute.getType() as CollectionType).getType.get(0)) instanceof SimpleTypes && ((attribute.getType() as CollectionType).getType.get(0) as SimpleTypes).getReferended !== null�type="�System.identityHashCode(((attribute.getType() as CollectionType).getType.get(0) as SimpleTypes).getReferended)�"�ENDIF��IF attribute.getType() !== null && attribute.getType() instanceof CollectionType��(attribute.getType() as CollectionType).getCollection.compileCollection��ENDIF�>
			�IF attribute.getType() !== null && attribute.getType() instanceof SimpleTypes && (attribute.getType() as SimpleTypes).getDefaultType !== null�
				�(attribute.getType() as SimpleTypes).getDefaultType.compileDefaultType�
			�ELSEIF attribute.getType() !== null && attribute.getType() instanceof CollectionType && (attribute.getType() as CollectionType).getType !== null && (attribute.getType() as CollectionType).getType.length > 0 && ((attribute.getType() as CollectionType).getType.get(0)) instanceof SimpleTypes && ((attribute.getType() as CollectionType).getType.get(0) as SimpleTypes).getDefaultType !== null�
				�((attribute.getType() as CollectionType).getType.get(0) as SimpleTypes).getDefaultType.compileDefaultType�
				<lowerValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="�System.identityHashCode(attribute) + "_01"�" name="" visibility="public"/>
				<upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="�System.identityHashCode(attribute) + "_02"�" name="" visibility="public" value="*"/>
			�ELSEIF attribute.getType() !== null && attribute.getType() instanceof CollectionType && (attribute.getType() as CollectionType).getType !== null && (attribute.getType() as CollectionType).getType.length > 0 && ((attribute.getType() as CollectionType).getType.get(0)) instanceof SimpleTypes && ((attribute.getType() as CollectionType).getType.get(0) as SimpleTypes).getReferended !== null�
				<lowerValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="�System.identityHashCode(attribute) + "_01"�" name="" visibility="public"/>
				<upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="�System.identityHashCode(attribute) + "_02"�" name="" visibility="public" value="*"/>	
			�ENDIF�
			�IF attribute.getDeriveOCL !== null�
				<defaultValue xmi:type="uml:LiteralString" xmi:id="�System.identityHashCode(attribute) + "_03"�" name="" visibility="public" value="�attribute.getDeriveOCL.compileExpCSToShow�"/>
			�ELSEIF attribute.getInitOCL !== null�
				<defaultValue xmi:type="uml:LiteralString" xmi:id="�System.identityHashCode(attribute) + "_03"�" name="" visibility="public" value="�attribute.getInitOCL.compileExpCSToShow�"/>
			�ENDIF�
			</ownedAttribute>
		�ENDFOR�
	'''

	private def compileCollection(String collection) '''�IF collection.equalsIgnoreCase("Sequence")� isOrdered="true" isUnique="false"�ELSEIF collection.equalsIgnoreCase("Bag")� isUnique="false"�ENDIF�'''

	private def compileOperationsBase(OperationsBase e, Iterable<OperationContext> conditions) '''
		�FOR op : e.getOperations()�
			�op.compileOperation(conditions.map[constrains].filter(c | c.getOperationDeclaration.getName.equals(op.getOperationDeclaration.getName) && ((c.getOperationDeclaration.getReturnType instanceof SimpleTypes && op.getOperationDeclaration.getReturnType instanceof SimpleTypes && ((c.getOperationDeclaration.getReturnType as SimpleTypes).getReferended == (op.getOperationDeclaration.getReturnType as SimpleTypes).getReferended || (c.getOperationDeclaration.getReturnType as SimpleTypes).getDefaultType == (op.getOperationDeclaration.getReturnType as SimpleTypes).getDefaultType)) || (c.getOperationDeclaration.getReturnType instanceof CollectionType && op.getOperationDeclaration.getReturnType instanceof CollectionType && (c.getOperationDeclaration.getReturnType as CollectionType).getType().length == (op.getOperationDeclaration.getReturnType as CollectionType).getType().length && (c.getOperationDeclaration.getReturnType as CollectionType).getCollection == (op.getOperationDeclaration.getReturnType as CollectionType).getCollection  && ((c.getOperationDeclaration.getReturnType as CollectionType).getType().length == 0 || (((c.getOperationDeclaration.getReturnType as CollectionType).getType().get(0) instanceof SimpleTypes && (op.getOperationDeclaration.getReturnType as CollectionType).getType().get(0) instanceof SimpleTypes &&(((c.getOperationDeclaration.getReturnType as CollectionType).getType().get(0) as SimpleTypes).getReferended == ((op.getOperationDeclaration.getReturnType as CollectionType).getType().get(0) as SimpleTypes).getReferended)|| ((c.getOperationDeclaration.getReturnType as CollectionType).getType().get(0) as SimpleTypes).getDefaultType == ((op.getOperationDeclaration.getReturnType as CollectionType).getType().get(0) as SimpleTypes).getDefaultType))|| ((c.getOperationDeclaration.getReturnType as CollectionType).getType().get(0) instanceof CollectionType && (op.getOperationDeclaration.getReturnType as CollectionType).getType().get(0) instanceof CollectionType &&((c.getOperationDeclaration.getReturnType as CollectionType).getType().get(0) as CollectionType).getCollection == ((op.getOperationDeclaration.getReturnType as CollectionType).getType().get(0) as CollectionType).getCollection))))))�
		�ENDFOR�
	'''

	private def compileOperation(OperationType op, Iterable<OperationConstraints> conditions) '''
		<ownedOperation xmi:id="�System.identityHashCode(op)�" name="�op.getOperationDeclaration.getName�" �IF (op instanceof OperationQuery && (op as OperationQuery).getOperationbody !== null)�bodyCondition="�System.identityHashCode(op).toString + System.identityHashCode((op as OperationQuery).getOperationbody)�"�ELSEIF (op instanceof OperationComplex && (op as OperationComplex).getOperationbody !== null)�bodyCondition="�System.identityHashCode(op).toString + System.identityHashCode((op as OperationComplex).getOperationbody)�"�ENDIF� postcondition="�FOR post : op.getConditions.filter(Postcondition)��System.identityHashCode(post)� �ENDFOR��FOR context : conditions��FOR post : context.getConditions.filter(Postcondition)��System.identityHashCode(post)� �ENDFOR��ENDFOR�" precondition="�FOR pre : op.getConditions.filter(Precondition)��System.identityHashCode(pre)� �ENDFOR��FOR context : conditions��FOR pre : context.getConditions.filter(Precondition)��System.identityHashCode(pre)� �ENDFOR��ENDFOR�" �IF (op instanceof OperationQuery)�isQuery="true"�ENDIF�>
			�IF (op instanceof OperationQuery && (op as OperationQuery).getOperationbody !== null)�
				�(op as OperationQuery).getOperationbody.compileOwnedRule(System.identityHashCode(op).toString + System.identityHashCode((op as OperationQuery).getOperationbody), "", "")�
			�ELSEIF (op instanceof OperationComplex && (op as OperationComplex).getOperationbody !== null)�
				�(op as OperationComplex).getOperationbody.compileOwnedRuleString(System.identityHashCode(op).toString + System.identityHashCode((op as OperationComplex).getOperationbody), "", "")�
			�ENDIF�
			�FOR cond : op.getConditions�
				�cond.getOclexpression.compileOwnedRule(System.identityHashCode(cond).toString, cond.getName, "")�
			�ENDFOR�
			�FOR context : conditions�
				�FOR cond : context.getConditions�
					�cond.getOclexpression.compileOwnedRule(System.identityHashCode(cond).toString, cond.getName, "")�
				�ENDFOR�
			�ENDFOR�
			�IF (op.getOperationDeclaration.getReturnType !== null)�
				�op.getOperationDeclaration.getReturnType.compileReturnType(System.identityHashCode(op))�
			�ENDIF�
			�FOR parameter : op.getOperationDeclaration.getParameters�
				�parameter.compileParameter�
			�ENDFOR�
		</ownedOperation>	
	'''

	private def compileOwnedRule(ExpCS e, String id, String name, String constrainedElement) '''
		<ownedRule xmi:id="�id�" name="�name�" �constrainedElement�>
			<specification xmi:type="uml:OpaqueExpression" xmi:id="�System.identityHashCode(e).toString + id�" name="�name�">
			   	<language>OCL2.0</language>
			   	  	<body>�e.compileExpCSToShow�</body>
			  	</specification>
		</ownedRule>
	'''
	
	private def compileExpCSToShow(ExpCS e)'''�(e.compileExpCS).toString().replaceAll(System.getProperty("line.separator"), "").replaceAll("<", "&lt;").replaceAll(">", "&gt;")�'''
	
	private def compileOwnedRuleString(String e, String id, String name, String constrainedElement) '''
		<ownedRule xmi:id="�id�" name="�name�" �constrainedElement�>
			<specification xmi:type="uml:OpaqueExpression" xmi:id="�System.identityHashCode(e).toString + id�" name="�name�">
			   	<language>OCL2.0</language>
			   	  	<body>�e.substring(1, e.length-1)�</body>
			  	</specification>
		</ownedRule>
	'''

	private def compileReturnType(AllTypes e, int idOp) '''
		<ownedParameter xmi:id="�System.identityHashCode(e).toString + idOp�" name="" �IF e !== null && e instanceof SimpleTypes && (e as SimpleTypes).getReferended() !== null�type="�System.identityHashCode((e as SimpleTypes).getReferended())�"�ELSEIF e !== null && e instanceof CollectionType && (e as CollectionType).getType !== null && (e as CollectionType).getType.length > 0 && ((e as CollectionType).getType.get(0)) instanceof SimpleTypes && ((e as CollectionType).getType.get(0) as SimpleTypes).getReferended !== null�type="�System.identityHashCode(((e as CollectionType).getType.get(0) as SimpleTypes).getReferended())�"�ENDIF� direction="return"�IF e !== null && e instanceof CollectionType��(e as CollectionType).getCollection.compileCollection��ENDIF�>
		�IF e !== null && e instanceof SimpleTypes && (e as SimpleTypes).getDefaultType !== null�
			�(e as SimpleTypes).getDefaultType.compileDefaultType�
		�ELSEIF e !== null && e instanceof CollectionType && (e as CollectionType).getType !== null && (e as CollectionType).getType.length > 0 && ((e as CollectionType).getType.get(0)) instanceof SimpleTypes && ((e as CollectionType).getType.get(0) as SimpleTypes).getDefaultType !== null�
			�((e as CollectionType).getType.get(0) as SimpleTypes).getDefaultType.compileDefaultType�
			<lowerValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="�System.identityHashCode(e).toString + idOp + "_01"�" name="" visibility="public"/>
			<upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="�System.identityHashCode(e).toString + idOp + "_02"�" name="" visibility="public" value="*"/>
		�ELSEIF e !== null && e instanceof CollectionType && (e as CollectionType).getType !== null && (e as CollectionType).getType.length > 0 && ((e as CollectionType).getType.get(0)) instanceof SimpleTypes && ((e as CollectionType).getType.get(0) as SimpleTypes).getReferended !== null�
			<lowerValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="�System.identityHashCode(e).toString + idOp + "_01"�" name="" visibility="public"/>
			<upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="�System.identityHashCode(e).toString + idOp + "_02"�" name="" visibility="public" value="*"/>
		�ENDIF�
		</ownedParameter>
	'''

	private def compileParameter(Parameter e) '''
		<ownedParameter xmi:id="�System.identityHashCode(e)�" name="�e.getName�" �IF e.getType() !== null && e.getType() instanceof SimpleTypes && (e.getType() as SimpleTypes).getReferended() !== null�type="�System.identityHashCode((e.getType() as SimpleTypes).getReferended())�"�ELSEIF e.getType() !== null && e.getType() instanceof CollectionType && (e.getType() as CollectionType).getType !== null && (e.getType() as CollectionType).getType.length > 0 && ((e.getType() as CollectionType).getType.get(0)) instanceof SimpleTypes && ((e.getType() as CollectionType).getType.get(0) as SimpleTypes).getReferended !== null�type="�System.identityHashCode(((e.getType() as CollectionType).getType.get(0) as SimpleTypes).getReferended)�"�ENDIF��IF e.getType() !== null && e.getType() instanceof CollectionType��(e.getType() as CollectionType).getCollection.compileCollection��ENDIF�>
		�IF e.getType() !== null && e.getType() instanceof SimpleTypes && (e.getType() as SimpleTypes).getDefaultType !== null�
			�(e.getType() as SimpleTypes).getDefaultType.compileDefaultType�
		�ELSEIF e.getType() !== null && e.getType() instanceof CollectionType && (e.getType() as CollectionType).getType !== null && (e.getType() as CollectionType).getType.length > 0 && ((e.getType() as CollectionType).getType.get(0)) instanceof SimpleTypes && ((e.getType() as CollectionType).getType.get(0) as SimpleTypes).getDefaultType !== null�
			�((e.getType() as CollectionType).getType.get(0) as SimpleTypes).getDefaultType.compileDefaultType�
			<lowerValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="�System.identityHashCode(e) + "_01"�" name="" visibility="public"/>
			<upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="�System.identityHashCode(e) + "_02"�" name="" visibility="public" value="*"/>
		�ELSEIF e.getType() !== null && e.getType() instanceof CollectionType && (e.getType() as CollectionType).getType !== null && (e.getType() as CollectionType).getType.length > 0 && ((e.getType() as CollectionType).getType.get(0)) instanceof SimpleTypes && ((e.getType() as CollectionType).getType.get(0) as SimpleTypes).getReferended !== null�
			<lowerValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="�System.identityHashCode(e) + "_01"�" name="" visibility="public"/>
			<upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="�System.identityHashCode(e) + "_02"�" name="" visibility="public" value="*"/>	
		�ENDIF�
		</ownedParameter>
	'''

	private def compileDefaultType(String e) '''
		�IF e.equalsIgnoreCase("String")�
			<type xmi:type="uml:PrimitiveType" href="pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String"/>
		�ELSEIF e.equalsIgnoreCase("Integer")�
			<type xmi:type="uml:PrimitiveType" href="pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer"/>
		�ELSEIF e.equalsIgnoreCase("Real")�
			<type xmi:type="uml:PrimitiveType" href="pathmap://UML_LIBRARIES/JavaPrimitiveTypes.library.uml#double"/>
		�ELSEIF e.equalsIgnoreCase("Boolean")�
			<type xmi:type="uml:PrimitiveType" href="pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Boolean"/>
		�ENDIF�
	'''

	private def compileAssociationClass(AssociationClass e) '''
		<packagedElement xmi:type="uml:AssociationClass" xmi:id="�System.identityHashCode(e)�" name="�e.getName�" memberEnd="�FOR end : e.getAssociationEnds()��System.identityHashCode(end)� �ENDFOR�"/>
	'''

	private def compileAssociation(Association e) '''
		<packagedElement xmi:type="uml:Association" xmi:id="�System.identityHashCode(e)�" name="�e.getName�" memberEnd="�FOR end : e.getAssociationEnds()��System.identityHashCode(end)� �ENDFOR�"/>
	'''

	private def compileExpCS(ExpCS e) '''
		�IF (e instanceof CollectionLiteralExpCS)�
			�e.compileCollectionLiteralExpCS�
		�ELSEIF (e instanceof IfExpCS)�
			�e.compileIfExpCS�
		�ELSEIF (e instanceof InfixExpCS)�
			�e.compileInfixExpCS�
		�ELSEIF (e instanceof LambdaLiteralExpCS)�
			�e.compileLambdaLiteralExpCS�
		�ELSEIF (e instanceof LetExpCS)�
			�e.compileLetExpCS�
		�ELSEIF (e instanceof MapLiteralExpCS)�
			�e.compileMapLiteralExpCS�
		�ELSEIF (e instanceof NameExpCS)�
			�e.compileNameExpCS�
		�ELSEIF (e instanceof NestedExpCS)�
			�e.compileNestedExpCS�
		�ELSEIF (e instanceof PrefixExpCS)�
			�e.compilePrefixExpCS�
		�ELSEIF (e instanceof PrimitiveLiteralExpCS)�
			�e.compilePrimitiveLiteralExpCS�
		�ELSEIF (e instanceof SelfExpCS)�
			�e.compileSelfExpCS�
		�ELSEIF (e instanceof TupleLiteralExpCS)�
			�e.compileTupleLiteralExpCS�
		�ELSEIF (e instanceof TypeLiteralExpCS)�
			�e.compileTypeLiteralExpCS�
		�ENDIF�
	'''

	private def compileTypedRefCS(TypedRefCS e) ''' 
		�IF (e instanceof CollectionPatternCS)�
			�e.compileCollectionPatternCS� �IF e.getOwnedMultiplicity !== null� �e.getOwnedMultiplicity.compileMultiplicityCS��ENDIF�
		�ELSEIF (e instanceof CollectionTypeCS)�
			�e.compileCollectionTypeCS� �IF e.getOwnedMultiplicity !== null� �e.getOwnedMultiplicity.compileMultiplicityCS��ENDIF�
		�ELSEIF (e instanceof MapTypeCS)�
			�e.compileMapTypeCS� �IF e.getOwnedMultiplicity !== null� �e.getOwnedMultiplicity.compileMultiplicityCS��ENDIF�
		�ELSEIF (e instanceof PrimitiveTypeRefCS)�
			�e.compilePrimitiveTypeRefCS� �IF e.getOwnedMultiplicity !== null� �e.getOwnedMultiplicity.compileMultiplicityCS��ENDIF�
		�ELSEIF (e instanceof TupleTypeCS)�
			�e.compileTupleTypeCS� �IF e.getOwnedMultiplicity !== null� �e.getOwnedMultiplicity.compileMultiplicityCS��ENDIF�
		�ELSEIF (e instanceof TypeNameExpCS)�
			�e.compileTypeNameExpCS� �IF e.getOwnedMultiplicity !== null� �e.getOwnedMultiplicity.compileMultiplicityCS��ENDIF�
		�ENDIF�
	'''
	
	private def compileMultiplicityCS(MultiplicityCS e) '''
		�IF (e instanceof MultiplicityBoundsCS)�
			[�e.getLowerBound��IF e.getUpperBound !== null�..�e.getUpperBound��ENDIF��IF e.symbol !== null � �e.symbol��ENDIF�]
		�ELSEIF (e instanceof MultiplicityStringCS)�
			[�e.getStringBounds��IF e.symbol !== null� �e.symbol��ENDIF�]
		�ENDIF�
	'''

	private def compileCollectionTypeCS(CollectionTypeCS e) '''�e.getName��IF e.getOwnedType !== null�(�e.getOwnedType.compileTypedRefCS��IF e.getOwnedCollectionMultiplicity !== null� �e.getOwnedCollectionMultiplicity.compileMultiplicityCS��ENDIF�)�ENDIF�'''

	private def compileCollectionLiteralExpCS(CollectionLiteralExpCS e) '''�e.getOwnedType.compileCollectionTypeCS�{�IF e.getOwnedParts.length > 0��e.getOwnedParts.get(0).compileCollectionLiteralPartCS��FOR part : e.getOwnedParts.subList(1, e.getOwnedParts.length)�, �part.compileCollectionLiteralPartCS��ENDFOR��ENDIF�}'''
	
	private def compileCollectionLiteralPartCS(CollectionLiteralPartCS e) ''' 
		�IF (e.getOwnedExpression instanceof ExpCS)�
			�(e.getOwnedExpression as ExpCS).compileExpCS��IF e.getOwnedLastExpression !== null�..�e.getOwnedLastExpression.compileExpCS��ENDIF�
		�ELSEIF (e.getOwnedExpression instanceof PatternExpCS)�
			�(e.getOwnedExpression as PatternExpCS).compilePatternExpCS�
		�ENDIF�
	'''
	
	private def compilePatternExpCS(PatternExpCS e) '''�IF e.getPatternVariableName !== null��e.getPatternVariableName��ENDIF� : �e.getOwnedPatternType.compileTypedRefCS�'''
	
	private def compileIfExpCS(IfExpCS e) ''' 
		�IF (e.getOwnedCondition instanceof ExpCS)�
			if �(e.getOwnedCondition as ExpCS).compileExpCS� then �e.getOwnedThenExpression.compileExpCS� �FOR i : e.getOwnedIfThenExpressions� �i.compileIfThenExpCS��ENDFOR� else �e.getOwnedElseExpression.compileExpCS� endif
		�ELSEIF (e.getOwnedCondition instanceof PatternExpCS)�
			if �(e.getOwnedCondition as PatternExpCS).compilePatternExpCS� then �e.getOwnedThenExpression.compileExpCS� �FOR i : e.getOwnedIfThenExpressions� �i.compileIfThenExpCS��ENDFOR� else �e.getOwnedElseExpression.compileExpCS� endif
		�ENDIF�
	'''
	
	private def compileIfThenExpCS(IfThenExpCS e) '''elseif �e.getOwnedCondition.compileExpCS� then �e.getOwnedThenExpression.compileExpCS�'''
	
	private def compileInfixExpCS(InfixExpCS e) '''�e.getOwnedLeft.compileExpCS��IF !e.getOperator.equals(".")� �ENDIF��e.getOperator��IF !e.getOperator.equals('.')� �ENDIF��e.getOwnedRight.compileExpCS�'''
	
	private def compileLambdaLiteralExpCS(LambdaLiteralExpCS e) '''Lambda { �e.getOwnedExpressionCS.compileExpCS� }'''
	
	private def compileLetExpCS(LetExpCS e) '''let �IF e.getOwnedVariables.length > 0��e.getOwnedVariables.get(0).compileLetVariableCS��FOR part : e.getOwnedVariables.subList(1, e.getOwnedVariables.length)�, �part.compileLetVariableCS��ENDFOR��ENDIF� in �e.getOwnedInExpression.compileExpCS�'''
	
	private def compileLetVariableCS(LetVariableCS e) '''�e.getName��IF e.getOwnedRoundBracketedClause !== null� �e.getOwnedRoundBracketedClause.compileRoundBracketedClauseCS��ENDIF��IF e.getOwnedType !== null� : �e.getOwnedType.compileTypedRefCS��ENDIF� = �e.getOwnedInitExpression.compileExpCS�'''
	
	private def compileRoundBracketedClauseCS(RoundBracketedClauseCS e) '''(�IF e.getOwnedArguments.length > 0��e.getOwnedArguments.get(0).compileNavigatingArgCS��FOR part : e.getOwnedArguments.subList(1, e.getOwnedArguments.length)��part.compileNavigatingArgCS��ENDFOR��ENDIF�)'''
	
	private def compileNavigatingArgCS(NavigatingArgCS e) '''�IF e.getPrefix !== null��e.getPrefix��ENDIF��IF e.getOwnedNameExpression !== null��e.getOwnedNameExpression.compileExpCS��ENDIF��IF e.getOwnedType !== null� �e.getSymbolT� �e.getOwnedType.compileTypedRefCS��ENDIF��IF e.getOwnedCoIterator !== null� �e.getSymbolCI� �e.getOwnedCoIterator.compileVariableCS��ENDIF��IF e.getOwnedInitExpression !== null� �e.getSymbolIE� �e.getOwnedInitExpression.compileExpCS��ENDIF�'''
	
	private def compileVariableCS(VariableCS e) '''�e.name��IF e.getOwnedType !== null� �e.getOwnedType.compileTypedRefCS��ENDIF�'''
	
	private def compileSquareBracketedClauseCS(SquareBracketedClauseCS e) '''[�IF e.getOwnedTerms.length > 0��e.getOwnedTerms.get(0).compileExpCS��FOR part : e.getOwnedTerms.subList(1, e.getOwnedTerms.length)�, �part.compileExpCS��ENDFOR��ENDIF�]'''
	
	private def compileCurlyBracketedClauseCS(CurlyBracketedClauseCS e) '''{�IF e.getOwnedParts.length > 0��e.getOwnedParts.get(0).compileShadowPartCS��FOR part : e.getOwnedParts.subList(1, e.getOwnedParts.length)�, �part.compileShadowPartCS��ENDFOR��ENDIF�}'''
	
	private def compileShadowPartCS(ShadowPartCS e) '''
		�IF (e.getOwnedInitExpression instanceof ExpCS)�
			�e.getReferredProperty� = �(e.getOwnedInitExpression as ExpCS).compileExpCS�
		�ELSEIF (e.getOwnedInitExpression instanceof PatternExpCS)�
			�e.getReferredProperty� = �(e.getOwnedInitExpression as PatternExpCS).compilePatternExpCS�
		�ELSEIF (e.getOwnedInitExpression instanceof StringLiteralExpCS)�
			�(e.getOwnedInitExpression as StringLiteralExpCS).compileStringLiteralExpCS�
		�ENDIF�
	'''
	
	private def compileMapLiteralExpCS(MapLiteralExpCS e) '''�e.getOwnedType.compileMapTypeCS� { �IF e.getOwnedParts.length > 0��e.getOwnedParts.get(0).compileMapLiteralPartCS��FOR part : e.getOwnedParts.subList(1, e.getOwnedParts.length)�, �part.compileMapLiteralPartCS��ENDFOR��ENDIF� }'''
	
	private def compileMapLiteralPartCS(MapLiteralPartCS e) '''�e.getOwnedKey.compileExpCS� <- �e.getOwnedValue.compileExpCS�'''
	
	private def compileNameExpCS(NameExpCS e) '''�e.getOwnedPathName.compilePathNameCS��FOR part : e.getOwnedSquareBracketedClauses��part.compileSquareBracketedClauseCS��ENDFOR��IF e.getOwnedRoundBracketedClause !== null��e.getOwnedRoundBracketedClause.compileRoundBracketedClauseCS��ENDIF��IF e.getOwnedCurlyBracketedClause !== null��e.getOwnedCurlyBracketedClause.compileCurlyBracketedClauseCS��ENDIF��IF e.isIsPre�@�ENDIF��IF e.isPre()�pre�ENDIF�'''
	
	private def compilePathNameCS(PathNameCS e) '''�IF e.getOwnedPathElements.length > 0��e.getOwnedPathElements.get(0)��FOR part : e.getOwnedPathElements.subList(1, e.getOwnedPathElements.length)� :: �part��ENDFOR��ENDIF�'''
	
	private def compileNestedExpCS(NestedExpCS e) '''(�e.getOwnedExpression.compileExpCS�)'''
	
	private def compilePrefixExpCS(PrefixExpCS e) '''�e.getName� �e.getOwnedRight.compileExpCS�'''
	
	private def compilePrimitiveLiteralExpCS(PrimitiveLiteralExpCS e) ''' 
		�IF (e instanceof NumberLiteralExpCS)�
			�e.compileNumberLiteralExpCS�
		�ELSEIF (e instanceof StringLiteralExpCS)�
			�e.compileStringLiteralExpCS�
		�ELSEIF (e instanceof BooleanLiteralExpCS)�
			�e.compileBooleanLiteralExpCS�
		�ELSEIF (e instanceof UnlimitedNaturalLiteralExpCS)�
			�e.compileUnlimitedNaturalLiteralExpCS�
		�ELSEIF (e instanceof InvalidLiteralExpCS)�
			�e.compileInvalidLiteralExpCS�
		�ELSEIF (e instanceof NullLiteralExpCS)�
			�e.compileNullLiteralExpCS�
		�ENDIF�
	'''
	
	private def compileNumberLiteralExpCS(NumberLiteralExpCS e) '''�e.getValue�'''
	
	private def compileStringLiteralExpCS(StringLiteralExpCS e) '''�FOR part : e.getSegments� �part��ENDFOR�'''
	
	private def compileBooleanLiteralExpCS(BooleanLiteralExpCS e) '''�e.getSymbol�'''
	
	private def compileUnlimitedNaturalLiteralExpCS(UnlimitedNaturalLiteralExpCS e) '''*'''
	
	private def compileInvalidLiteralExpCS(InvalidLiteralExpCS e) '''invalid'''
	
	private def compileNullLiteralExpCS(NullLiteralExpCS e) '''null'''
	
	private def compileSelfExpCS(SelfExpCS e) '''self'''
	
	private def compileTupleLiteralExpCS(TupleLiteralExpCS e) '''Tuple { �IF e.getOwnedParts.length > 0��e.getOwnedParts.get(0).compileTupleLiteralPartCS��FOR part : e.getOwnedParts.subList(1, e.getOwnedParts.length)�, �part.compileTupleLiteralPartCS��ENDFOR��ENDIF� }'''
	
	private def compileTupleLiteralPartCS(TupleLiteralPartCS e) '''�e.getName� �IF e.getOwnedType !== null�: �e.getOwnedType.compileTypedRefCS��ENDIF�= �e.getOwnedInitExpression.compileExpCS�'''
	
	private def compileTypeLiteralExpCS(TypeLiteralExpCS e) '''�e.getOwnedType.compileTypedRefCS�'''
	
	private def compileCollectionPatternCS(CollectionPatternCS e) '''�e.getOwnedType.compileCollectionTypeCS� { �IF e.getOwnedParts.length > 0��e.getOwnedParts.get(0).compilePatternExpCS��FOR part : e.getOwnedParts.subList(1, e.getOwnedParts.length)�, �part.compilePatternExpCS��ENDFOR� ++ �e.getRestVariableName��ENDIF�}'''
	
	private def compileMapTypeCS(MapTypeCS e) '''�e.getName� �IF e.getOwnedKeyType !== null && e.getOwnedValueType !== null�(�e.getOwnedKeyType.compileTypedRefCS�, �e.getOwnedValueType.compileTypedRefCS�)�ENDIF�'''
	
	private def compilePrimitiveTypeRefCS(PrimitiveTypeRefCS e) '''�e.getName�'''
	
	private def compileTupleTypeCS(TupleTypeCS e) '''�e.getName� �IF e.getOwnedParts.length > 0�(�e.getOwnedParts.get(0).compileTuplePartCS��FOR part : e.getOwnedParts.subList(1, e.getOwnedParts.length)�, �part.compileTuplePartCS��ENDFOR�)�ENDIF�'''
	
	private def compileTuplePartCS(TuplePartCS e) '''�e.getName� : �e.getOwnedType.compileTypedRefCS�'''
	
	private def compileTypeNameExpCS(TypeNameExpCS e) '''�e.getOwnedPathName.compilePathNameCS� �IF e.getOwnedCurlyBracketedClause !== null��e.getOwnedCurlyBracketedClause.compileCurlyBracketedClauseCS� �IF e.getOwnedPatternGuard !== null�{�e.getOwnedPatternGuard.compileExpCS�}�ENDIF��ENDIF�'''
	
}
