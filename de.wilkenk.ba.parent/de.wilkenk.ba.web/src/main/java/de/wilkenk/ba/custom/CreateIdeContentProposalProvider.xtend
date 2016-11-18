package de.wilkenk.ba.custom

import com.google.common.base.Predicate
import com.google.inject.Inject
import org.eclipse.emf.ecore.EClass
import org.eclipse.xtext.CrossReference
import org.eclipse.xtext.GrammarUtil
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.xbase.ide.contentassist.XbaseIdeContentProposalProvider
import org.eclipse.xtext.xtext.CurrentTypeFinder
import de.wilkenk.ba.create.CreatePackage

class CreateIdeContentProposalProvider extends XbaseIdeContentProposalProvider {
	
	@Inject extension CurrentTypeFinder
	
	static val FILTER = new MyFilter
	
	override protected getCrossrefFilter(CrossReference reference, ContentAssistContext context) {
		val type = findCurrentTypeAfter(reference)
		val ereference = GrammarUtil.getReference(reference, type as EClass)
		if (	CreatePackage.Literals.PROPERTY__ATTR_VALUE == ereference
			|| 	CreatePackage.Literals.PROPERTY__COMB_ATTR_VALUE == ereference
			||	CreatePackage.Literals.PROPERTY__COMB_VALUE == ereference
		) {
//			println("xxxx")
			return FILTER
		}
		super.getCrossrefFilter(reference, context)
	}
	
}

class MyFilter implements Predicate<IEObjectDescription> {
	
	override apply(IEObjectDescription input) {
		return input.name.segmentCount == 1
	}
	
}