/*
* generated by Xtext
*/
package org.wesnoth.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.wesnoth.services.WMLGrammarAccess;

public class WMLParser extends AbstractContentAssistParser {
	
	@Inject
	private WMLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.wesnoth.ui.contentassist.antlr.internal.InternalWMLParser createParser() {
		org.wesnoth.ui.contentassist.antlr.internal.InternalWMLParser result = new org.wesnoth.ui.contentassist.antlr.internal.InternalWMLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getWMLRootAccess().getAlternatives(), "rule__WMLRoot__Alternatives");
					put(grammarAccess.getWMLTagAccess().getAlternatives_4(), "rule__WMLTag__Alternatives_4");
					put(grammarAccess.getWMLKeyAccess().getEolAlternatives_4_0(), "rule__WMLKey__EolAlternatives_4_0");
					put(grammarAccess.getWMLKeyValueAccess().getAlternatives(), "rule__WMLKeyValue__Alternatives");
					put(grammarAccess.getWMLMacroCallAccess().getAlternatives_4(), "rule__WMLMacroCall__Alternatives_4");
					put(grammarAccess.getWMLMacroCallAccess().getParamsAlternatives_4_0_0(), "rule__WMLMacroCall__ParamsAlternatives_4_0_0");
					put(grammarAccess.getWMLMacroDefineAccess().getAlternatives_1(), "rule__WMLMacroDefine__Alternatives_1");
					put(grammarAccess.getWMLPreprocIFAccess().getNameAlternatives_0_0(), "rule__WMLPreprocIF__NameAlternatives_0_0");
					put(grammarAccess.getWMLPreprocIFAccess().getAlternatives_1(), "rule__WMLPreprocIF__Alternatives_1");
					put(grammarAccess.getWMLValueAccess().getValueAlternatives_0(), "rule__WMLValue__ValueAlternatives_0");
					put(grammarAccess.getMacroTokensAccess().getValAlternatives_0(), "rule__MacroTokens__ValAlternatives_0");
					put(grammarAccess.getWMLTagAccess().getGroup(), "rule__WMLTag__Group__0");
					put(grammarAccess.getWMLKeyAccess().getGroup(), "rule__WMLKey__Group__0");
					put(grammarAccess.getWMLKeyAccess().getGroup_3(), "rule__WMLKey__Group_3__0");
					put(grammarAccess.getWMLMacroCallAccess().getGroup(), "rule__WMLMacroCall__Group__0");
					put(grammarAccess.getWMLArrayCallAccess().getGroup(), "rule__WMLArrayCall__Group__0");
					put(grammarAccess.getWMLMacroDefineAccess().getGroup(), "rule__WMLMacroDefine__Group__0");
					put(grammarAccess.getWMLPreprocIFAccess().getGroup(), "rule__WMLPreprocIF__Group__0");
					put(grammarAccess.getTSTRINGAccess().getGroup(), "rule__TSTRING__Group__0");
					put(grammarAccess.getWMLRootAccess().getTagsAssignment_0(), "rule__WMLRoot__TagsAssignment_0");
					put(grammarAccess.getWMLRootAccess().getMacroCallsAssignment_1(), "rule__WMLRoot__MacroCallsAssignment_1");
					put(grammarAccess.getWMLRootAccess().getMacroDefinesAssignment_2(), "rule__WMLRoot__MacroDefinesAssignment_2");
					put(grammarAccess.getWMLRootAccess().getTextdomainsAssignment_3(), "rule__WMLRoot__TextdomainsAssignment_3");
					put(grammarAccess.getWMLRootAccess().getIfDefsAssignment_4(), "rule__WMLRoot__IfDefsAssignment_4");
					put(grammarAccess.getWMLTagAccess().getPlusAssignment_1(), "rule__WMLTag__PlusAssignment_1");
					put(grammarAccess.getWMLTagAccess().getNameAssignment_2(), "rule__WMLTag__NameAssignment_2");
					put(grammarAccess.getWMLTagAccess().getTagsAssignment_4_0(), "rule__WMLTag__TagsAssignment_4_0");
					put(grammarAccess.getWMLTagAccess().getKeysAssignment_4_1(), "rule__WMLTag__KeysAssignment_4_1");
					put(grammarAccess.getWMLTagAccess().getMacroCallsAssignment_4_2(), "rule__WMLTag__MacroCallsAssignment_4_2");
					put(grammarAccess.getWMLTagAccess().getMacroDefinesAssignment_4_3(), "rule__WMLTag__MacroDefinesAssignment_4_3");
					put(grammarAccess.getWMLTagAccess().getTextdomainsAssignment_4_4(), "rule__WMLTag__TextdomainsAssignment_4_4");
					put(grammarAccess.getWMLTagAccess().getIfDefsAssignment_4_5(), "rule__WMLTag__IfDefsAssignment_4_5");
					put(grammarAccess.getWMLTagAccess().getEndNameAssignment_6(), "rule__WMLTag__EndNameAssignment_6");
					put(grammarAccess.getWMLKeyAccess().getNameAssignment_0(), "rule__WMLKey__NameAssignment_0");
					put(grammarAccess.getWMLKeyAccess().getValueAssignment_2(), "rule__WMLKey__ValueAssignment_2");
					put(grammarAccess.getWMLKeyAccess().getValueAssignment_3_3(), "rule__WMLKey__ValueAssignment_3_3");
					put(grammarAccess.getWMLKeyAccess().getEolAssignment_4(), "rule__WMLKey__EolAssignment_4");
					put(grammarAccess.getWMLMacroCallAccess().getPointAssignment_1(), "rule__WMLMacroCall__PointAssignment_1");
					put(grammarAccess.getWMLMacroCallAccess().getRelativeAssignment_2(), "rule__WMLMacroCall__RelativeAssignment_2");
					put(grammarAccess.getWMLMacroCallAccess().getNameAssignment_3(), "rule__WMLMacroCall__NameAssignment_3");
					put(grammarAccess.getWMLMacroCallAccess().getParamsAssignment_4_0(), "rule__WMLMacroCall__ParamsAssignment_4_0");
					put(grammarAccess.getWMLMacroCallAccess().getExtraMacrosAssignment_4_1(), "rule__WMLMacroCall__ExtraMacrosAssignment_4_1");
					put(grammarAccess.getWMLLuaCodeAccess().getValueAssignment(), "rule__WMLLuaCode__ValueAssignment");
					put(grammarAccess.getWMLArrayCallAccess().getValueAssignment_1(), "rule__WMLArrayCall__ValueAssignment_1");
					put(grammarAccess.getWMLMacroDefineAccess().getNameAssignment_0(), "rule__WMLMacroDefine__NameAssignment_0");
					put(grammarAccess.getWMLMacroDefineAccess().getTagsAssignment_1_0(), "rule__WMLMacroDefine__TagsAssignment_1_0");
					put(grammarAccess.getWMLMacroDefineAccess().getKeysAssignment_1_1(), "rule__WMLMacroDefine__KeysAssignment_1_1");
					put(grammarAccess.getWMLMacroDefineAccess().getMacroCallsAssignment_1_2(), "rule__WMLMacroDefine__MacroCallsAssignment_1_2");
					put(grammarAccess.getWMLMacroDefineAccess().getMacroDefinesAssignment_1_3(), "rule__WMLMacroDefine__MacroDefinesAssignment_1_3");
					put(grammarAccess.getWMLMacroDefineAccess().getTextdomainsAssignment_1_4(), "rule__WMLMacroDefine__TextdomainsAssignment_1_4");
					put(grammarAccess.getWMLMacroDefineAccess().getValuesAssignment_1_5(), "rule__WMLMacroDefine__ValuesAssignment_1_5");
					put(grammarAccess.getWMLMacroDefineAccess().getIfDefsAssignment_1_6(), "rule__WMLMacroDefine__IfDefsAssignment_1_6");
					put(grammarAccess.getWMLPreprocIFAccess().getNameAssignment_0(), "rule__WMLPreprocIF__NameAssignment_0");
					put(grammarAccess.getWMLPreprocIFAccess().getTagsAssignment_1_0(), "rule__WMLPreprocIF__TagsAssignment_1_0");
					put(grammarAccess.getWMLPreprocIFAccess().getKeysAssignment_1_1(), "rule__WMLPreprocIF__KeysAssignment_1_1");
					put(grammarAccess.getWMLPreprocIFAccess().getMacroCallsAssignment_1_2(), "rule__WMLPreprocIF__MacroCallsAssignment_1_2");
					put(grammarAccess.getWMLPreprocIFAccess().getMacroDefinesAssignment_1_3(), "rule__WMLPreprocIF__MacroDefinesAssignment_1_3");
					put(grammarAccess.getWMLPreprocIFAccess().getTextdomainsAssignment_1_4(), "rule__WMLPreprocIF__TextdomainsAssignment_1_4");
					put(grammarAccess.getWMLPreprocIFAccess().getValuesAssignment_1_5(), "rule__WMLPreprocIF__ValuesAssignment_1_5");
					put(grammarAccess.getWMLPreprocIFAccess().getIfDefsAssignment_1_6(), "rule__WMLPreprocIF__IfDefsAssignment_1_6");
					put(grammarAccess.getWMLPreprocIFAccess().getElsesAssignment_1_7(), "rule__WMLPreprocIF__ElsesAssignment_1_7");
					put(grammarAccess.getWMLTextdomainAccess().getNameAssignment(), "rule__WMLTextdomain__NameAssignment");
					put(grammarAccess.getWMLValueAccess().getValueAssignment(), "rule__WMLValue__ValueAssignment");
					put(grammarAccess.getMacroTokensAccess().getValAssignment(), "rule__MacroTokens__ValAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.wesnoth.ui.contentassist.antlr.internal.InternalWMLParser typedParser = (org.wesnoth.ui.contentassist.antlr.internal.InternalWMLParser) parser;
			typedParser.entryRuleWMLRoot();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_EOL", "RULE_WS", "RULE_SL_COMMENT" };
	}
	
	public WMLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(WMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
