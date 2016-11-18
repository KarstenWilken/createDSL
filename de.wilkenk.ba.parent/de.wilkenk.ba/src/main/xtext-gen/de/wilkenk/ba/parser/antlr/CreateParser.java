/*
 * generated by Xtext 2.10.0
 */
package de.wilkenk.ba.parser.antlr;

import com.google.inject.Inject;
import de.wilkenk.ba.parser.antlr.internal.InternalCreateParser;
import de.wilkenk.ba.services.CreateGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class CreateParser extends AbstractAntlrParser {

	@Inject
	private CreateGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalCreateParser createParser(XtextTokenStream stream) {
		return new InternalCreateParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Domainmodel";
	}

	public CreateGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CreateGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
