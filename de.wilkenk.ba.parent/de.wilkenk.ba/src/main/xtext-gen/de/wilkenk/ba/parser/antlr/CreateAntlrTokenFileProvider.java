/*
 * generated by Xtext 2.10.0
 */
package de.wilkenk.ba.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class CreateAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("de/wilkenk/ba/parser/antlr/internal/InternalCreate.tokens");
	}
}