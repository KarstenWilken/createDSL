package de.wilkenk.ba.generator

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import de.wilkenk.ba.create.Attribute
import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import de.wilkenk.ba.create.InitialAttributeDecision
import de.wilkenk.ba.create.InitAttribute
import de.wilkenk.ba.create.MathExpression
import de.wilkenk.ba.create.AttributeRef
import de.wilkenk.ba.create.AttributePart

class CreateGenerator extends AbstractGenerator {
	
	@Inject extension IQualifiedNameProvider
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		for (e:input.allContents.toIterable.filter(typeof(Attribute))) {
			fsa.generateFile(e.name+".java", e.compile)
		}
	}
	
	def compile(Attribute e) {
		'''
		package «e.eContainer.fullyQualifiedName»
		
		public class «e.name» {
			private «IF e.valueType.equalsIgnoreCase("Integer")»Integer
					«ELSEIF e.valueType.equalsIgnoreCase("String")»String
					«ENDIF» Integer value = «IF Integer.valueOf(e.intValue) != null»«e.intValue»«ENDIF»
			
				private Integer intValue = «IF Integer.valueOf(e.intValue) != null»«e.intValue» «e.intValue» «ELSE» «null» «ENDIF»;
				private String stringValue = «IF e.stringValue != null» «e.stringValue» «ELSE» «null» «ENDIF»;
			
			«IF e.initialValue != null»
				«compile(e.initialValue)»
			«ENDIF»
		}
			private Integer minValue = «IF Integer.valueOf(e.minValue)!=null»«e.minValue»«ELSE»«null»«ENDIF»
			private Integer maxValue = «IF Integer.valueOf(e.maxValue)!=null»«e.maxValue»«ELSE»«null»«ENDIF»
			
			private String category = «IF e.category != null»«e.category»«ELSE»«null»«ENDIF»
			private String description = «IF e.description != null»«e.description»«ELSE»«null»«ENDIF»
		'''
	}
	
	def compile(InitialAttributeDecision e) {
		'''
			«compile(e.type)»
		'''
	}
	
	def compile(InitAttribute e) {
		'''
			private Integer initValue = «IF Integer.valueOf(e.initValue) != null»«e.initValue» «ELSE» «null» «ENDIF»;
			private Integer getDiceEvent() {
				return 	«IF e.diceEvent != null» «e.diceEvent.compile» «ELSE» «null» «ENDIF» ;
			}
		'''
	}
	
	def compile(AttributeRef e) {
		'''
			«IF 	e.part == AttributePart.ATTR_NAME»«e.attribute.name»
			«ELSEIF	e.part == AttributePart.ATTR_VALUE»
				«IF e.attribute.stringValue != null»«e.attribute.stringValue»
				«ELSEIF Integer.valueOf(e.attribute.intValue) != null»«e.attribute.intValue»
				«ENDIF»
			«ELSEIF e.part == AttributePart.ATTR_MIN_VALUE»«e.attribute.minValue»
			«ELSEIF e.part == AttributePart.ATTR_MAX_VALUE»«e.attribute.maxValue»
			«ENDIF»
		'''
	}
	
//	TODO later
	def compile(MathExpression e) {
		
	}
}