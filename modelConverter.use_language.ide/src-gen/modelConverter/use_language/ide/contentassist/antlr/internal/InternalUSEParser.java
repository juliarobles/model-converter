package modelConverter.use_language.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import modelConverter.use_language.services.USEGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUSEParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'operations'", "'*'", "'Integer'", "'String'", "'Real'", "'Boolean'", "'model'", "'..'", "','", "'enum'", "'{'", "'}'", "'class'", "'end'", "'<'", "'attributes'", "'associationclass'", "'between'", "'['", "']'", "'role'", "'association'", "'aggregation'", "'composition'", "':'", "'='", "'begin'", "'('", "')'", "'constraints'", "'context'", "'inv'", "'::'", "'pre'", "'post'", "'abstract'", "'ordered'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=7;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalUSEParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUSEParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUSEParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUSE.g"; }


    	private USEGrammarAccess grammarAccess;

    	public void setGrammarAccess(USEGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalUSE.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalUSE.g:54:1: ( ruleModel EOF )
            // InternalUSE.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalUSE.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalUSE.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalUSE.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalUSE.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalUSE.g:69:3: ( rule__Model__Group__0 )
            // InternalUSE.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleMultiplicity"
    // InternalUSE.g:78:1: entryRuleMultiplicity : ruleMultiplicity EOF ;
    public final void entryRuleMultiplicity() throws RecognitionException {
        try {
            // InternalUSE.g:79:1: ( ruleMultiplicity EOF )
            // InternalUSE.g:80:1: ruleMultiplicity EOF
            {
             before(grammarAccess.getMultiplicityRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplicity();

            state._fsp--;

             after(grammarAccess.getMultiplicityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplicity"


    // $ANTLR start "ruleMultiplicity"
    // InternalUSE.g:87:1: ruleMultiplicity : ( ( rule__Multiplicity__Group__0 ) ) ;
    public final void ruleMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:91:2: ( ( ( rule__Multiplicity__Group__0 ) ) )
            // InternalUSE.g:92:2: ( ( rule__Multiplicity__Group__0 ) )
            {
            // InternalUSE.g:92:2: ( ( rule__Multiplicity__Group__0 ) )
            // InternalUSE.g:93:3: ( rule__Multiplicity__Group__0 )
            {
             before(grammarAccess.getMultiplicityAccess().getGroup()); 
            // InternalUSE.g:94:3: ( rule__Multiplicity__Group__0 )
            // InternalUSE.g:94:4: rule__Multiplicity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicity"


    // $ANTLR start "entryRuleDefaultType"
    // InternalUSE.g:103:1: entryRuleDefaultType : ruleDefaultType EOF ;
    public final void entryRuleDefaultType() throws RecognitionException {
        try {
            // InternalUSE.g:104:1: ( ruleDefaultType EOF )
            // InternalUSE.g:105:1: ruleDefaultType EOF
            {
             before(grammarAccess.getDefaultTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDefaultType();

            state._fsp--;

             after(grammarAccess.getDefaultTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefaultType"


    // $ANTLR start "ruleDefaultType"
    // InternalUSE.g:112:1: ruleDefaultType : ( ( rule__DefaultType__Alternatives ) ) ;
    public final void ruleDefaultType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:116:2: ( ( ( rule__DefaultType__Alternatives ) ) )
            // InternalUSE.g:117:2: ( ( rule__DefaultType__Alternatives ) )
            {
            // InternalUSE.g:117:2: ( ( rule__DefaultType__Alternatives ) )
            // InternalUSE.g:118:3: ( rule__DefaultType__Alternatives )
            {
             before(grammarAccess.getDefaultTypeAccess().getAlternatives()); 
            // InternalUSE.g:119:3: ( rule__DefaultType__Alternatives )
            // InternalUSE.g:119:4: rule__DefaultType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DefaultType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDefaultTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefaultType"


    // $ANTLR start "entryRuleType"
    // InternalUSE.g:128:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalUSE.g:129:1: ( ruleType EOF )
            // InternalUSE.g:130:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalUSE.g:137:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:141:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalUSE.g:142:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalUSE.g:142:2: ( ( rule__Type__Alternatives ) )
            // InternalUSE.g:143:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalUSE.g:144:3: ( rule__Type__Alternatives )
            // InternalUSE.g:144:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleAssociationType"
    // InternalUSE.g:153:1: entryRuleAssociationType : ruleAssociationType EOF ;
    public final void entryRuleAssociationType() throws RecognitionException {
        try {
            // InternalUSE.g:154:1: ( ruleAssociationType EOF )
            // InternalUSE.g:155:1: ruleAssociationType EOF
            {
             before(grammarAccess.getAssociationTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleAssociationType();

            state._fsp--;

             after(grammarAccess.getAssociationTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssociationType"


    // $ANTLR start "ruleAssociationType"
    // InternalUSE.g:162:1: ruleAssociationType : ( ( rule__AssociationType__Alternatives ) ) ;
    public final void ruleAssociationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:166:2: ( ( ( rule__AssociationType__Alternatives ) ) )
            // InternalUSE.g:167:2: ( ( rule__AssociationType__Alternatives ) )
            {
            // InternalUSE.g:167:2: ( ( rule__AssociationType__Alternatives ) )
            // InternalUSE.g:168:3: ( rule__AssociationType__Alternatives )
            {
             before(grammarAccess.getAssociationTypeAccess().getAlternatives()); 
            // InternalUSE.g:169:3: ( rule__AssociationType__Alternatives )
            // InternalUSE.g:169:4: rule__AssociationType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AssociationType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAssociationTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssociationType"


    // $ANTLR start "entryRuleEnumeration"
    // InternalUSE.g:178:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // InternalUSE.g:179:1: ( ruleEnumeration EOF )
            // InternalUSE.g:180:1: ruleEnumeration EOF
            {
             before(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumeration();

            state._fsp--;

             after(grammarAccess.getEnumerationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalUSE.g:187:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:191:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // InternalUSE.g:192:2: ( ( rule__Enumeration__Group__0 ) )
            {
            // InternalUSE.g:192:2: ( ( rule__Enumeration__Group__0 ) )
            // InternalUSE.g:193:3: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // InternalUSE.g:194:3: ( rule__Enumeration__Group__0 )
            // InternalUSE.g:194:4: rule__Enumeration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleOwnedLiteral"
    // InternalUSE.g:203:1: entryRuleOwnedLiteral : ruleOwnedLiteral EOF ;
    public final void entryRuleOwnedLiteral() throws RecognitionException {
        try {
            // InternalUSE.g:204:1: ( ruleOwnedLiteral EOF )
            // InternalUSE.g:205:1: ruleOwnedLiteral EOF
            {
             before(grammarAccess.getOwnedLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleOwnedLiteral();

            state._fsp--;

             after(grammarAccess.getOwnedLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOwnedLiteral"


    // $ANTLR start "ruleOwnedLiteral"
    // InternalUSE.g:212:1: ruleOwnedLiteral : ( ( rule__OwnedLiteral__Group__0 ) ) ;
    public final void ruleOwnedLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:216:2: ( ( ( rule__OwnedLiteral__Group__0 ) ) )
            // InternalUSE.g:217:2: ( ( rule__OwnedLiteral__Group__0 ) )
            {
            // InternalUSE.g:217:2: ( ( rule__OwnedLiteral__Group__0 ) )
            // InternalUSE.g:218:3: ( rule__OwnedLiteral__Group__0 )
            {
             before(grammarAccess.getOwnedLiteralAccess().getGroup()); 
            // InternalUSE.g:219:3: ( rule__OwnedLiteral__Group__0 )
            // InternalUSE.g:219:4: rule__OwnedLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OwnedLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOwnedLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOwnedLiteral"


    // $ANTLR start "entryRuleClass"
    // InternalUSE.g:228:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalUSE.g:229:1: ( ruleClass EOF )
            // InternalUSE.g:230:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalUSE.g:237:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:241:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalUSE.g:242:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalUSE.g:242:2: ( ( rule__Class__Group__0 ) )
            // InternalUSE.g:243:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalUSE.g:244:3: ( rule__Class__Group__0 )
            // InternalUSE.g:244:4: rule__Class__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleAssociationClass"
    // InternalUSE.g:253:1: entryRuleAssociationClass : ruleAssociationClass EOF ;
    public final void entryRuleAssociationClass() throws RecognitionException {
        try {
            // InternalUSE.g:254:1: ( ruleAssociationClass EOF )
            // InternalUSE.g:255:1: ruleAssociationClass EOF
            {
             before(grammarAccess.getAssociationClassRule()); 
            pushFollow(FOLLOW_1);
            ruleAssociationClass();

            state._fsp--;

             after(grammarAccess.getAssociationClassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssociationClass"


    // $ANTLR start "ruleAssociationClass"
    // InternalUSE.g:262:1: ruleAssociationClass : ( ( rule__AssociationClass__Group__0 ) ) ;
    public final void ruleAssociationClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:266:2: ( ( ( rule__AssociationClass__Group__0 ) ) )
            // InternalUSE.g:267:2: ( ( rule__AssociationClass__Group__0 ) )
            {
            // InternalUSE.g:267:2: ( ( rule__AssociationClass__Group__0 ) )
            // InternalUSE.g:268:3: ( rule__AssociationClass__Group__0 )
            {
             before(grammarAccess.getAssociationClassAccess().getGroup()); 
            // InternalUSE.g:269:3: ( rule__AssociationClass__Group__0 )
            // InternalUSE.g:269:4: rule__AssociationClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssociationClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssociationClass"


    // $ANTLR start "entryRuleGeneralization"
    // InternalUSE.g:278:1: entryRuleGeneralization : ruleGeneralization EOF ;
    public final void entryRuleGeneralization() throws RecognitionException {
        try {
            // InternalUSE.g:279:1: ( ruleGeneralization EOF )
            // InternalUSE.g:280:1: ruleGeneralization EOF
            {
             before(grammarAccess.getGeneralizationRule()); 
            pushFollow(FOLLOW_1);
            ruleGeneralization();

            state._fsp--;

             after(grammarAccess.getGeneralizationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGeneralization"


    // $ANTLR start "ruleGeneralization"
    // InternalUSE.g:287:1: ruleGeneralization : ( ( rule__Generalization__Group__0 ) ) ;
    public final void ruleGeneralization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:291:2: ( ( ( rule__Generalization__Group__0 ) ) )
            // InternalUSE.g:292:2: ( ( rule__Generalization__Group__0 ) )
            {
            // InternalUSE.g:292:2: ( ( rule__Generalization__Group__0 ) )
            // InternalUSE.g:293:3: ( rule__Generalization__Group__0 )
            {
             before(grammarAccess.getGeneralizationAccess().getGroup()); 
            // InternalUSE.g:294:3: ( rule__Generalization__Group__0 )
            // InternalUSE.g:294:4: rule__Generalization__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Generalization__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeneralization"


    // $ANTLR start "entryRuleSimpleTypes"
    // InternalUSE.g:303:1: entryRuleSimpleTypes : ruleSimpleTypes EOF ;
    public final void entryRuleSimpleTypes() throws RecognitionException {
        try {
            // InternalUSE.g:304:1: ( ruleSimpleTypes EOF )
            // InternalUSE.g:305:1: ruleSimpleTypes EOF
            {
             before(grammarAccess.getSimpleTypesRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleTypes();

            state._fsp--;

             after(grammarAccess.getSimpleTypesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleTypes"


    // $ANTLR start "ruleSimpleTypes"
    // InternalUSE.g:312:1: ruleSimpleTypes : ( ( rule__SimpleTypes__Alternatives ) ) ;
    public final void ruleSimpleTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:316:2: ( ( ( rule__SimpleTypes__Alternatives ) ) )
            // InternalUSE.g:317:2: ( ( rule__SimpleTypes__Alternatives ) )
            {
            // InternalUSE.g:317:2: ( ( rule__SimpleTypes__Alternatives ) )
            // InternalUSE.g:318:3: ( rule__SimpleTypes__Alternatives )
            {
             before(grammarAccess.getSimpleTypesAccess().getAlternatives()); 
            // InternalUSE.g:319:3: ( rule__SimpleTypes__Alternatives )
            // InternalUSE.g:319:4: rule__SimpleTypes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SimpleTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSimpleTypesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleTypes"


    // $ANTLR start "entryRuleAssociation"
    // InternalUSE.g:328:1: entryRuleAssociation : ruleAssociation EOF ;
    public final void entryRuleAssociation() throws RecognitionException {
        try {
            // InternalUSE.g:329:1: ( ruleAssociation EOF )
            // InternalUSE.g:330:1: ruleAssociation EOF
            {
             before(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_1);
            ruleAssociation();

            state._fsp--;

             after(grammarAccess.getAssociationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // InternalUSE.g:337:1: ruleAssociation : ( ( rule__Association__Group__0 ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:341:2: ( ( ( rule__Association__Group__0 ) ) )
            // InternalUSE.g:342:2: ( ( rule__Association__Group__0 ) )
            {
            // InternalUSE.g:342:2: ( ( rule__Association__Group__0 ) )
            // InternalUSE.g:343:3: ( rule__Association__Group__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup()); 
            // InternalUSE.g:344:3: ( rule__Association__Group__0 )
            // InternalUSE.g:344:4: rule__Association__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Association__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleMemberEnd"
    // InternalUSE.g:353:1: entryRuleMemberEnd : ruleMemberEnd EOF ;
    public final void entryRuleMemberEnd() throws RecognitionException {
        try {
            // InternalUSE.g:354:1: ( ruleMemberEnd EOF )
            // InternalUSE.g:355:1: ruleMemberEnd EOF
            {
             before(grammarAccess.getMemberEndRule()); 
            pushFollow(FOLLOW_1);
            ruleMemberEnd();

            state._fsp--;

             after(grammarAccess.getMemberEndRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMemberEnd"


    // $ANTLR start "ruleMemberEnd"
    // InternalUSE.g:362:1: ruleMemberEnd : ( ( rule__MemberEnd__Group__0 ) ) ;
    public final void ruleMemberEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:366:2: ( ( ( rule__MemberEnd__Group__0 ) ) )
            // InternalUSE.g:367:2: ( ( rule__MemberEnd__Group__0 ) )
            {
            // InternalUSE.g:367:2: ( ( rule__MemberEnd__Group__0 ) )
            // InternalUSE.g:368:3: ( rule__MemberEnd__Group__0 )
            {
             before(grammarAccess.getMemberEndAccess().getGroup()); 
            // InternalUSE.g:369:3: ( rule__MemberEnd__Group__0 )
            // InternalUSE.g:369:4: rule__MemberEnd__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MemberEnd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMemberEndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMemberEnd"


    // $ANTLR start "entryRuleAssociationBasic"
    // InternalUSE.g:378:1: entryRuleAssociationBasic : ruleAssociationBasic EOF ;
    public final void entryRuleAssociationBasic() throws RecognitionException {
        try {
            // InternalUSE.g:379:1: ( ruleAssociationBasic EOF )
            // InternalUSE.g:380:1: ruleAssociationBasic EOF
            {
             before(grammarAccess.getAssociationBasicRule()); 
            pushFollow(FOLLOW_1);
            ruleAssociationBasic();

            state._fsp--;

             after(grammarAccess.getAssociationBasicRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssociationBasic"


    // $ANTLR start "ruleAssociationBasic"
    // InternalUSE.g:387:1: ruleAssociationBasic : ( ( rule__AssociationBasic__Group__0 ) ) ;
    public final void ruleAssociationBasic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:391:2: ( ( ( rule__AssociationBasic__Group__0 ) ) )
            // InternalUSE.g:392:2: ( ( rule__AssociationBasic__Group__0 ) )
            {
            // InternalUSE.g:392:2: ( ( rule__AssociationBasic__Group__0 ) )
            // InternalUSE.g:393:3: ( rule__AssociationBasic__Group__0 )
            {
             before(grammarAccess.getAssociationBasicAccess().getGroup()); 
            // InternalUSE.g:394:3: ( rule__AssociationBasic__Group__0 )
            // InternalUSE.g:394:4: rule__AssociationBasic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssociationBasic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationBasicAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssociationBasic"


    // $ANTLR start "entryRuleAggregation"
    // InternalUSE.g:403:1: entryRuleAggregation : ruleAggregation EOF ;
    public final void entryRuleAggregation() throws RecognitionException {
        try {
            // InternalUSE.g:404:1: ( ruleAggregation EOF )
            // InternalUSE.g:405:1: ruleAggregation EOF
            {
             before(grammarAccess.getAggregationRule()); 
            pushFollow(FOLLOW_1);
            ruleAggregation();

            state._fsp--;

             after(grammarAccess.getAggregationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAggregation"


    // $ANTLR start "ruleAggregation"
    // InternalUSE.g:412:1: ruleAggregation : ( ( rule__Aggregation__Group__0 ) ) ;
    public final void ruleAggregation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:416:2: ( ( ( rule__Aggregation__Group__0 ) ) )
            // InternalUSE.g:417:2: ( ( rule__Aggregation__Group__0 ) )
            {
            // InternalUSE.g:417:2: ( ( rule__Aggregation__Group__0 ) )
            // InternalUSE.g:418:3: ( rule__Aggregation__Group__0 )
            {
             before(grammarAccess.getAggregationAccess().getGroup()); 
            // InternalUSE.g:419:3: ( rule__Aggregation__Group__0 )
            // InternalUSE.g:419:4: rule__Aggregation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Aggregation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAggregationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAggregation"


    // $ANTLR start "entryRuleComposition"
    // InternalUSE.g:428:1: entryRuleComposition : ruleComposition EOF ;
    public final void entryRuleComposition() throws RecognitionException {
        try {
            // InternalUSE.g:429:1: ( ruleComposition EOF )
            // InternalUSE.g:430:1: ruleComposition EOF
            {
             before(grammarAccess.getCompositionRule()); 
            pushFollow(FOLLOW_1);
            ruleComposition();

            state._fsp--;

             after(grammarAccess.getCompositionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComposition"


    // $ANTLR start "ruleComposition"
    // InternalUSE.g:437:1: ruleComposition : ( ( rule__Composition__Group__0 ) ) ;
    public final void ruleComposition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:441:2: ( ( ( rule__Composition__Group__0 ) ) )
            // InternalUSE.g:442:2: ( ( rule__Composition__Group__0 ) )
            {
            // InternalUSE.g:442:2: ( ( rule__Composition__Group__0 ) )
            // InternalUSE.g:443:3: ( rule__Composition__Group__0 )
            {
             before(grammarAccess.getCompositionAccess().getGroup()); 
            // InternalUSE.g:444:3: ( rule__Composition__Group__0 )
            // InternalUSE.g:444:4: rule__Composition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComposition"


    // $ANTLR start "entryRuleAttribute"
    // InternalUSE.g:453:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalUSE.g:454:1: ( ruleAttribute EOF )
            // InternalUSE.g:455:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalUSE.g:462:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:466:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalUSE.g:467:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalUSE.g:467:2: ( ( rule__Attribute__Group__0 ) )
            // InternalUSE.g:468:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalUSE.g:469:3: ( rule__Attribute__Group__0 )
            // InternalUSE.g:469:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleOperationsBase"
    // InternalUSE.g:478:1: entryRuleOperationsBase : ruleOperationsBase EOF ;
    public final void entryRuleOperationsBase() throws RecognitionException {
        try {
            // InternalUSE.g:479:1: ( ruleOperationsBase EOF )
            // InternalUSE.g:480:1: ruleOperationsBase EOF
            {
             before(grammarAccess.getOperationsBaseRule()); 
            pushFollow(FOLLOW_1);
            ruleOperationsBase();

            state._fsp--;

             after(grammarAccess.getOperationsBaseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperationsBase"


    // $ANTLR start "ruleOperationsBase"
    // InternalUSE.g:487:1: ruleOperationsBase : ( 'operations' ) ;
    public final void ruleOperationsBase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:491:2: ( ( 'operations' ) )
            // InternalUSE.g:492:2: ( 'operations' )
            {
            // InternalUSE.g:492:2: ( 'operations' )
            // InternalUSE.g:493:3: 'operations'
            {
             before(grammarAccess.getOperationsBaseAccess().getOperationsKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getOperationsBaseAccess().getOperationsKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationsBase"


    // $ANTLR start "entryRuleOperationType"
    // InternalUSE.g:503:1: entryRuleOperationType : ruleOperationType EOF ;
    public final void entryRuleOperationType() throws RecognitionException {
        try {
            // InternalUSE.g:504:1: ( ruleOperationType EOF )
            // InternalUSE.g:505:1: ruleOperationType EOF
            {
             before(grammarAccess.getOperationTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleOperationType();

            state._fsp--;

             after(grammarAccess.getOperationTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperationType"


    // $ANTLR start "ruleOperationType"
    // InternalUSE.g:512:1: ruleOperationType : ( ( rule__OperationType__Alternatives ) ) ;
    public final void ruleOperationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:516:2: ( ( ( rule__OperationType__Alternatives ) ) )
            // InternalUSE.g:517:2: ( ( rule__OperationType__Alternatives ) )
            {
            // InternalUSE.g:517:2: ( ( rule__OperationType__Alternatives ) )
            // InternalUSE.g:518:3: ( rule__OperationType__Alternatives )
            {
             before(grammarAccess.getOperationTypeAccess().getAlternatives()); 
            // InternalUSE.g:519:3: ( rule__OperationType__Alternatives )
            // InternalUSE.g:519:4: rule__OperationType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OperationType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationType"


    // $ANTLR start "entryRuleOperationBasic"
    // InternalUSE.g:528:1: entryRuleOperationBasic : ruleOperationBasic EOF ;
    public final void entryRuleOperationBasic() throws RecognitionException {
        try {
            // InternalUSE.g:529:1: ( ruleOperationBasic EOF )
            // InternalUSE.g:530:1: ruleOperationBasic EOF
            {
             before(grammarAccess.getOperationBasicRule()); 
            pushFollow(FOLLOW_1);
            ruleOperationBasic();

            state._fsp--;

             after(grammarAccess.getOperationBasicRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperationBasic"


    // $ANTLR start "ruleOperationBasic"
    // InternalUSE.g:537:1: ruleOperationBasic : ( ( rule__OperationBasic__Group__0 ) ) ;
    public final void ruleOperationBasic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:541:2: ( ( ( rule__OperationBasic__Group__0 ) ) )
            // InternalUSE.g:542:2: ( ( rule__OperationBasic__Group__0 ) )
            {
            // InternalUSE.g:542:2: ( ( rule__OperationBasic__Group__0 ) )
            // InternalUSE.g:543:3: ( rule__OperationBasic__Group__0 )
            {
             before(grammarAccess.getOperationBasicAccess().getGroup()); 
            // InternalUSE.g:544:3: ( rule__OperationBasic__Group__0 )
            // InternalUSE.g:544:4: rule__OperationBasic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OperationBasic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationBasicAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationBasic"


    // $ANTLR start "entryRuleOperationComplex"
    // InternalUSE.g:553:1: entryRuleOperationComplex : ruleOperationComplex EOF ;
    public final void entryRuleOperationComplex() throws RecognitionException {
        try {
            // InternalUSE.g:554:1: ( ruleOperationComplex EOF )
            // InternalUSE.g:555:1: ruleOperationComplex EOF
            {
             before(grammarAccess.getOperationComplexRule()); 
            pushFollow(FOLLOW_1);
            ruleOperationComplex();

            state._fsp--;

             after(grammarAccess.getOperationComplexRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperationComplex"


    // $ANTLR start "ruleOperationComplex"
    // InternalUSE.g:562:1: ruleOperationComplex : ( ( rule__OperationComplex__Group__0 ) ) ;
    public final void ruleOperationComplex() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:566:2: ( ( ( rule__OperationComplex__Group__0 ) ) )
            // InternalUSE.g:567:2: ( ( rule__OperationComplex__Group__0 ) )
            {
            // InternalUSE.g:567:2: ( ( rule__OperationComplex__Group__0 ) )
            // InternalUSE.g:568:3: ( rule__OperationComplex__Group__0 )
            {
             before(grammarAccess.getOperationComplexAccess().getGroup()); 
            // InternalUSE.g:569:3: ( rule__OperationComplex__Group__0 )
            // InternalUSE.g:569:4: rule__OperationComplex__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OperationComplex__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationComplexAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationComplex"


    // $ANTLR start "entryRuleOperationDeclaration"
    // InternalUSE.g:578:1: entryRuleOperationDeclaration : ruleOperationDeclaration EOF ;
    public final void entryRuleOperationDeclaration() throws RecognitionException {
        try {
            // InternalUSE.g:579:1: ( ruleOperationDeclaration EOF )
            // InternalUSE.g:580:1: ruleOperationDeclaration EOF
            {
             before(grammarAccess.getOperationDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleOperationDeclaration();

            state._fsp--;

             after(grammarAccess.getOperationDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperationDeclaration"


    // $ANTLR start "ruleOperationDeclaration"
    // InternalUSE.g:587:1: ruleOperationDeclaration : ( ( rule__OperationDeclaration__Group__0 ) ) ;
    public final void ruleOperationDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:591:2: ( ( ( rule__OperationDeclaration__Group__0 ) ) )
            // InternalUSE.g:592:2: ( ( rule__OperationDeclaration__Group__0 ) )
            {
            // InternalUSE.g:592:2: ( ( rule__OperationDeclaration__Group__0 ) )
            // InternalUSE.g:593:3: ( rule__OperationDeclaration__Group__0 )
            {
             before(grammarAccess.getOperationDeclarationAccess().getGroup()); 
            // InternalUSE.g:594:3: ( rule__OperationDeclaration__Group__0 )
            // InternalUSE.g:594:4: rule__OperationDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OperationDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationDeclaration"


    // $ANTLR start "entryRuleOwnedParameter"
    // InternalUSE.g:603:1: entryRuleOwnedParameter : ruleOwnedParameter EOF ;
    public final void entryRuleOwnedParameter() throws RecognitionException {
        try {
            // InternalUSE.g:604:1: ( ruleOwnedParameter EOF )
            // InternalUSE.g:605:1: ruleOwnedParameter EOF
            {
             before(grammarAccess.getOwnedParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleOwnedParameter();

            state._fsp--;

             after(grammarAccess.getOwnedParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOwnedParameter"


    // $ANTLR start "ruleOwnedParameter"
    // InternalUSE.g:612:1: ruleOwnedParameter : ( ( rule__OwnedParameter__Group__0 ) ) ;
    public final void ruleOwnedParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:616:2: ( ( ( rule__OwnedParameter__Group__0 ) ) )
            // InternalUSE.g:617:2: ( ( rule__OwnedParameter__Group__0 ) )
            {
            // InternalUSE.g:617:2: ( ( rule__OwnedParameter__Group__0 ) )
            // InternalUSE.g:618:3: ( rule__OwnedParameter__Group__0 )
            {
             before(grammarAccess.getOwnedParameterAccess().getGroup()); 
            // InternalUSE.g:619:3: ( rule__OwnedParameter__Group__0 )
            // InternalUSE.g:619:4: rule__OwnedParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OwnedParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOwnedParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOwnedParameter"


    // $ANTLR start "entryRuleConstraintsBase"
    // InternalUSE.g:628:1: entryRuleConstraintsBase : ruleConstraintsBase EOF ;
    public final void entryRuleConstraintsBase() throws RecognitionException {
        try {
            // InternalUSE.g:629:1: ( ruleConstraintsBase EOF )
            // InternalUSE.g:630:1: ruleConstraintsBase EOF
            {
             before(grammarAccess.getConstraintsBaseRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraintsBase();

            state._fsp--;

             after(grammarAccess.getConstraintsBaseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstraintsBase"


    // $ANTLR start "ruleConstraintsBase"
    // InternalUSE.g:637:1: ruleConstraintsBase : ( ( rule__ConstraintsBase__Group__0 ) ) ;
    public final void ruleConstraintsBase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:641:2: ( ( ( rule__ConstraintsBase__Group__0 ) ) )
            // InternalUSE.g:642:2: ( ( rule__ConstraintsBase__Group__0 ) )
            {
            // InternalUSE.g:642:2: ( ( rule__ConstraintsBase__Group__0 ) )
            // InternalUSE.g:643:3: ( rule__ConstraintsBase__Group__0 )
            {
             before(grammarAccess.getConstraintsBaseAccess().getGroup()); 
            // InternalUSE.g:644:3: ( rule__ConstraintsBase__Group__0 )
            // InternalUSE.g:644:4: rule__ConstraintsBase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintsBase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintsBaseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraintsBase"


    // $ANTLR start "entryRuleConstrainsGeneral"
    // InternalUSE.g:653:1: entryRuleConstrainsGeneral : ruleConstrainsGeneral EOF ;
    public final void entryRuleConstrainsGeneral() throws RecognitionException {
        try {
            // InternalUSE.g:654:1: ( ruleConstrainsGeneral EOF )
            // InternalUSE.g:655:1: ruleConstrainsGeneral EOF
            {
             before(grammarAccess.getConstrainsGeneralRule()); 
            pushFollow(FOLLOW_1);
            ruleConstrainsGeneral();

            state._fsp--;

             after(grammarAccess.getConstrainsGeneralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstrainsGeneral"


    // $ANTLR start "ruleConstrainsGeneral"
    // InternalUSE.g:662:1: ruleConstrainsGeneral : ( ( rule__ConstrainsGeneral__Group__0 ) ) ;
    public final void ruleConstrainsGeneral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:666:2: ( ( ( rule__ConstrainsGeneral__Group__0 ) ) )
            // InternalUSE.g:667:2: ( ( rule__ConstrainsGeneral__Group__0 ) )
            {
            // InternalUSE.g:667:2: ( ( rule__ConstrainsGeneral__Group__0 ) )
            // InternalUSE.g:668:3: ( rule__ConstrainsGeneral__Group__0 )
            {
             before(grammarAccess.getConstrainsGeneralAccess().getGroup()); 
            // InternalUSE.g:669:3: ( rule__ConstrainsGeneral__Group__0 )
            // InternalUSE.g:669:4: rule__ConstrainsGeneral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConstrainsGeneral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstrainsGeneralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstrainsGeneral"


    // $ANTLR start "entryRuleContextsType"
    // InternalUSE.g:678:1: entryRuleContextsType : ruleContextsType EOF ;
    public final void entryRuleContextsType() throws RecognitionException {
        try {
            // InternalUSE.g:679:1: ( ruleContextsType EOF )
            // InternalUSE.g:680:1: ruleContextsType EOF
            {
             before(grammarAccess.getContextsTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleContextsType();

            state._fsp--;

             after(grammarAccess.getContextsTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContextsType"


    // $ANTLR start "ruleContextsType"
    // InternalUSE.g:687:1: ruleContextsType : ( ( rule__ContextsType__Alternatives ) ) ;
    public final void ruleContextsType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:691:2: ( ( ( rule__ContextsType__Alternatives ) ) )
            // InternalUSE.g:692:2: ( ( rule__ContextsType__Alternatives ) )
            {
            // InternalUSE.g:692:2: ( ( rule__ContextsType__Alternatives ) )
            // InternalUSE.g:693:3: ( rule__ContextsType__Alternatives )
            {
             before(grammarAccess.getContextsTypeAccess().getAlternatives()); 
            // InternalUSE.g:694:3: ( rule__ContextsType__Alternatives )
            // InternalUSE.g:694:4: rule__ContextsType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ContextsType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getContextsTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContextsType"


    // $ANTLR start "entryRuleInvariantContext"
    // InternalUSE.g:703:1: entryRuleInvariantContext : ruleInvariantContext EOF ;
    public final void entryRuleInvariantContext() throws RecognitionException {
        try {
            // InternalUSE.g:704:1: ( ruleInvariantContext EOF )
            // InternalUSE.g:705:1: ruleInvariantContext EOF
            {
             before(grammarAccess.getInvariantContextRule()); 
            pushFollow(FOLLOW_1);
            ruleInvariantContext();

            state._fsp--;

             after(grammarAccess.getInvariantContextRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInvariantContext"


    // $ANTLR start "ruleInvariantContext"
    // InternalUSE.g:712:1: ruleInvariantContext : ( ( rule__InvariantContext__Group__0 ) ) ;
    public final void ruleInvariantContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:716:2: ( ( ( rule__InvariantContext__Group__0 ) ) )
            // InternalUSE.g:717:2: ( ( rule__InvariantContext__Group__0 ) )
            {
            // InternalUSE.g:717:2: ( ( rule__InvariantContext__Group__0 ) )
            // InternalUSE.g:718:3: ( rule__InvariantContext__Group__0 )
            {
             before(grammarAccess.getInvariantContextAccess().getGroup()); 
            // InternalUSE.g:719:3: ( rule__InvariantContext__Group__0 )
            // InternalUSE.g:719:4: rule__InvariantContext__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InvariantContext__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInvariantContextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInvariantContext"


    // $ANTLR start "entryRuleInvariantDefinition"
    // InternalUSE.g:728:1: entryRuleInvariantDefinition : ruleInvariantDefinition EOF ;
    public final void entryRuleInvariantDefinition() throws RecognitionException {
        try {
            // InternalUSE.g:729:1: ( ruleInvariantDefinition EOF )
            // InternalUSE.g:730:1: ruleInvariantDefinition EOF
            {
             before(grammarAccess.getInvariantDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleInvariantDefinition();

            state._fsp--;

             after(grammarAccess.getInvariantDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInvariantDefinition"


    // $ANTLR start "ruleInvariantDefinition"
    // InternalUSE.g:737:1: ruleInvariantDefinition : ( ( rule__InvariantDefinition__Group__0 ) ) ;
    public final void ruleInvariantDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:741:2: ( ( ( rule__InvariantDefinition__Group__0 ) ) )
            // InternalUSE.g:742:2: ( ( rule__InvariantDefinition__Group__0 ) )
            {
            // InternalUSE.g:742:2: ( ( rule__InvariantDefinition__Group__0 ) )
            // InternalUSE.g:743:3: ( rule__InvariantDefinition__Group__0 )
            {
             before(grammarAccess.getInvariantDefinitionAccess().getGroup()); 
            // InternalUSE.g:744:3: ( rule__InvariantDefinition__Group__0 )
            // InternalUSE.g:744:4: rule__InvariantDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InvariantDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInvariantDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInvariantDefinition"


    // $ANTLR start "entryRuleOperationContext"
    // InternalUSE.g:753:1: entryRuleOperationContext : ruleOperationContext EOF ;
    public final void entryRuleOperationContext() throws RecognitionException {
        try {
            // InternalUSE.g:754:1: ( ruleOperationContext EOF )
            // InternalUSE.g:755:1: ruleOperationContext EOF
            {
             before(grammarAccess.getOperationContextRule()); 
            pushFollow(FOLLOW_1);
            ruleOperationContext();

            state._fsp--;

             after(grammarAccess.getOperationContextRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperationContext"


    // $ANTLR start "ruleOperationContext"
    // InternalUSE.g:762:1: ruleOperationContext : ( ( rule__OperationContext__Group__0 ) ) ;
    public final void ruleOperationContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:766:2: ( ( ( rule__OperationContext__Group__0 ) ) )
            // InternalUSE.g:767:2: ( ( rule__OperationContext__Group__0 ) )
            {
            // InternalUSE.g:767:2: ( ( rule__OperationContext__Group__0 ) )
            // InternalUSE.g:768:3: ( rule__OperationContext__Group__0 )
            {
             before(grammarAccess.getOperationContextAccess().getGroup()); 
            // InternalUSE.g:769:3: ( rule__OperationContext__Group__0 )
            // InternalUSE.g:769:4: rule__OperationContext__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OperationContext__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationContextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationContext"


    // $ANTLR start "entryRuleOperationConstraints"
    // InternalUSE.g:778:1: entryRuleOperationConstraints : ruleOperationConstraints EOF ;
    public final void entryRuleOperationConstraints() throws RecognitionException {
        try {
            // InternalUSE.g:779:1: ( ruleOperationConstraints EOF )
            // InternalUSE.g:780:1: ruleOperationConstraints EOF
            {
             before(grammarAccess.getOperationConstraintsRule()); 
            pushFollow(FOLLOW_1);
            ruleOperationConstraints();

            state._fsp--;

             after(grammarAccess.getOperationConstraintsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperationConstraints"


    // $ANTLR start "ruleOperationConstraints"
    // InternalUSE.g:787:1: ruleOperationConstraints : ( ( rule__OperationConstraints__Group__0 ) ) ;
    public final void ruleOperationConstraints() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:791:2: ( ( ( rule__OperationConstraints__Group__0 ) ) )
            // InternalUSE.g:792:2: ( ( rule__OperationConstraints__Group__0 ) )
            {
            // InternalUSE.g:792:2: ( ( rule__OperationConstraints__Group__0 ) )
            // InternalUSE.g:793:3: ( rule__OperationConstraints__Group__0 )
            {
             before(grammarAccess.getOperationConstraintsAccess().getGroup()); 
            // InternalUSE.g:794:3: ( rule__OperationConstraints__Group__0 )
            // InternalUSE.g:794:4: rule__OperationConstraints__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OperationConstraints__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationConstraintsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationConstraints"


    // $ANTLR start "entryRuleConditionType"
    // InternalUSE.g:803:1: entryRuleConditionType : ruleConditionType EOF ;
    public final void entryRuleConditionType() throws RecognitionException {
        try {
            // InternalUSE.g:804:1: ( ruleConditionType EOF )
            // InternalUSE.g:805:1: ruleConditionType EOF
            {
             before(grammarAccess.getConditionTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionType();

            state._fsp--;

             after(grammarAccess.getConditionTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditionType"


    // $ANTLR start "ruleConditionType"
    // InternalUSE.g:812:1: ruleConditionType : ( ( rule__ConditionType__Alternatives ) ) ;
    public final void ruleConditionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:816:2: ( ( ( rule__ConditionType__Alternatives ) ) )
            // InternalUSE.g:817:2: ( ( rule__ConditionType__Alternatives ) )
            {
            // InternalUSE.g:817:2: ( ( rule__ConditionType__Alternatives ) )
            // InternalUSE.g:818:3: ( rule__ConditionType__Alternatives )
            {
             before(grammarAccess.getConditionTypeAccess().getAlternatives()); 
            // InternalUSE.g:819:3: ( rule__ConditionType__Alternatives )
            // InternalUSE.g:819:4: rule__ConditionType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ConditionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionType"


    // $ANTLR start "entryRulePrecondition"
    // InternalUSE.g:828:1: entryRulePrecondition : rulePrecondition EOF ;
    public final void entryRulePrecondition() throws RecognitionException {
        try {
            // InternalUSE.g:829:1: ( rulePrecondition EOF )
            // InternalUSE.g:830:1: rulePrecondition EOF
            {
             before(grammarAccess.getPreconditionRule()); 
            pushFollow(FOLLOW_1);
            rulePrecondition();

            state._fsp--;

             after(grammarAccess.getPreconditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrecondition"


    // $ANTLR start "rulePrecondition"
    // InternalUSE.g:837:1: rulePrecondition : ( ( rule__Precondition__Group__0 ) ) ;
    public final void rulePrecondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:841:2: ( ( ( rule__Precondition__Group__0 ) ) )
            // InternalUSE.g:842:2: ( ( rule__Precondition__Group__0 ) )
            {
            // InternalUSE.g:842:2: ( ( rule__Precondition__Group__0 ) )
            // InternalUSE.g:843:3: ( rule__Precondition__Group__0 )
            {
             before(grammarAccess.getPreconditionAccess().getGroup()); 
            // InternalUSE.g:844:3: ( rule__Precondition__Group__0 )
            // InternalUSE.g:844:4: rule__Precondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Precondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPreconditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrecondition"


    // $ANTLR start "entryRulePostcondition"
    // InternalUSE.g:853:1: entryRulePostcondition : rulePostcondition EOF ;
    public final void entryRulePostcondition() throws RecognitionException {
        try {
            // InternalUSE.g:854:1: ( rulePostcondition EOF )
            // InternalUSE.g:855:1: rulePostcondition EOF
            {
             before(grammarAccess.getPostconditionRule()); 
            pushFollow(FOLLOW_1);
            rulePostcondition();

            state._fsp--;

             after(grammarAccess.getPostconditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePostcondition"


    // $ANTLR start "rulePostcondition"
    // InternalUSE.g:862:1: rulePostcondition : ( ( rule__Postcondition__Group__0 ) ) ;
    public final void rulePostcondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:866:2: ( ( ( rule__Postcondition__Group__0 ) ) )
            // InternalUSE.g:867:2: ( ( rule__Postcondition__Group__0 ) )
            {
            // InternalUSE.g:867:2: ( ( rule__Postcondition__Group__0 ) )
            // InternalUSE.g:868:3: ( rule__Postcondition__Group__0 )
            {
             before(grammarAccess.getPostconditionAccess().getGroup()); 
            // InternalUSE.g:869:3: ( rule__Postcondition__Group__0 )
            // InternalUSE.g:869:4: rule__Postcondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Postcondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPostconditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePostcondition"


    // $ANTLR start "entryRuleOCLExpression"
    // InternalUSE.g:878:1: entryRuleOCLExpression : ruleOCLExpression EOF ;
    public final void entryRuleOCLExpression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalUSE.g:882:1: ( ruleOCLExpression EOF )
            // InternalUSE.g:883:1: ruleOCLExpression EOF
            {
             before(grammarAccess.getOCLExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleOCLExpression();

            state._fsp--;

             after(grammarAccess.getOCLExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleOCLExpression"


    // $ANTLR start "ruleOCLExpression"
    // InternalUSE.g:893:1: ruleOCLExpression : ( RULE_STRING ) ;
    public final void ruleOCLExpression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:898:2: ( ( RULE_STRING ) )
            // InternalUSE.g:899:2: ( RULE_STRING )
            {
            // InternalUSE.g:899:2: ( RULE_STRING )
            // InternalUSE.g:900:3: RULE_STRING
            {
             before(grammarAccess.getOCLExpressionAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOCLExpressionAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleOCLExpression"


    // $ANTLR start "rule__Multiplicity__Alternatives_0"
    // InternalUSE.g:910:1: rule__Multiplicity__Alternatives_0 : ( ( '*' ) | ( RULE_INT ) );
    public final void rule__Multiplicity__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:914:1: ( ( '*' ) | ( RULE_INT ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_INT) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalUSE.g:915:2: ( '*' )
                    {
                    // InternalUSE.g:915:2: ( '*' )
                    // InternalUSE.g:916:3: '*'
                    {
                     before(grammarAccess.getMultiplicityAccess().getAsteriskKeyword_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getAsteriskKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:921:2: ( RULE_INT )
                    {
                    // InternalUSE.g:921:2: ( RULE_INT )
                    // InternalUSE.g:922:3: RULE_INT
                    {
                     before(grammarAccess.getMultiplicityAccess().getINTTerminalRuleCall_0_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getINTTerminalRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Alternatives_0"


    // $ANTLR start "rule__Multiplicity__Alternatives_1_1"
    // InternalUSE.g:931:1: rule__Multiplicity__Alternatives_1_1 : ( ( '*' ) | ( RULE_INT ) );
    public final void rule__Multiplicity__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:935:1: ( ( '*' ) | ( RULE_INT ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_INT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalUSE.g:936:2: ( '*' )
                    {
                    // InternalUSE.g:936:2: ( '*' )
                    // InternalUSE.g:937:3: '*'
                    {
                     before(grammarAccess.getMultiplicityAccess().getAsteriskKeyword_1_1_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getAsteriskKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:942:2: ( RULE_INT )
                    {
                    // InternalUSE.g:942:2: ( RULE_INT )
                    // InternalUSE.g:943:3: RULE_INT
                    {
                     before(grammarAccess.getMultiplicityAccess().getINTTerminalRuleCall_1_1_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getINTTerminalRuleCall_1_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Alternatives_1_1"


    // $ANTLR start "rule__Multiplicity__Alternatives_2_1"
    // InternalUSE.g:952:1: rule__Multiplicity__Alternatives_2_1 : ( ( '*' ) | ( RULE_INT ) );
    public final void rule__Multiplicity__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:956:1: ( ( '*' ) | ( RULE_INT ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_INT) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalUSE.g:957:2: ( '*' )
                    {
                    // InternalUSE.g:957:2: ( '*' )
                    // InternalUSE.g:958:3: '*'
                    {
                     before(grammarAccess.getMultiplicityAccess().getAsteriskKeyword_2_1_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getAsteriskKeyword_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:963:2: ( RULE_INT )
                    {
                    // InternalUSE.g:963:2: ( RULE_INT )
                    // InternalUSE.g:964:3: RULE_INT
                    {
                     before(grammarAccess.getMultiplicityAccess().getINTTerminalRuleCall_2_1_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getINTTerminalRuleCall_2_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Alternatives_2_1"


    // $ANTLR start "rule__Multiplicity__Alternatives_2_2_1"
    // InternalUSE.g:973:1: rule__Multiplicity__Alternatives_2_2_1 : ( ( '*' ) | ( RULE_INT ) );
    public final void rule__Multiplicity__Alternatives_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:977:1: ( ( '*' ) | ( RULE_INT ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_INT) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalUSE.g:978:2: ( '*' )
                    {
                    // InternalUSE.g:978:2: ( '*' )
                    // InternalUSE.g:979:3: '*'
                    {
                     before(grammarAccess.getMultiplicityAccess().getAsteriskKeyword_2_2_1_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getAsteriskKeyword_2_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:984:2: ( RULE_INT )
                    {
                    // InternalUSE.g:984:2: ( RULE_INT )
                    // InternalUSE.g:985:3: RULE_INT
                    {
                     before(grammarAccess.getMultiplicityAccess().getINTTerminalRuleCall_2_2_1_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getINTTerminalRuleCall_2_2_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Alternatives_2_2_1"


    // $ANTLR start "rule__DefaultType__Alternatives"
    // InternalUSE.g:994:1: rule__DefaultType__Alternatives : ( ( 'Integer' ) | ( 'String' ) | ( 'Real' ) | ( 'Boolean' ) );
    public final void rule__DefaultType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:998:1: ( ( 'Integer' ) | ( 'String' ) | ( 'Real' ) | ( 'Boolean' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            case 16:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalUSE.g:999:2: ( 'Integer' )
                    {
                    // InternalUSE.g:999:2: ( 'Integer' )
                    // InternalUSE.g:1000:3: 'Integer'
                    {
                     before(grammarAccess.getDefaultTypeAccess().getIntegerKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getDefaultTypeAccess().getIntegerKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:1005:2: ( 'String' )
                    {
                    // InternalUSE.g:1005:2: ( 'String' )
                    // InternalUSE.g:1006:3: 'String'
                    {
                     before(grammarAccess.getDefaultTypeAccess().getStringKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getDefaultTypeAccess().getStringKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUSE.g:1011:2: ( 'Real' )
                    {
                    // InternalUSE.g:1011:2: ( 'Real' )
                    // InternalUSE.g:1012:3: 'Real'
                    {
                     before(grammarAccess.getDefaultTypeAccess().getRealKeyword_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getDefaultTypeAccess().getRealKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUSE.g:1017:2: ( 'Boolean' )
                    {
                    // InternalUSE.g:1017:2: ( 'Boolean' )
                    // InternalUSE.g:1018:3: 'Boolean'
                    {
                     before(grammarAccess.getDefaultTypeAccess().getBooleanKeyword_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getDefaultTypeAccess().getBooleanKeyword_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultType__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalUSE.g:1027:1: rule__Type__Alternatives : ( ( ruleClass ) | ( ruleAssociationType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1031:1: ( ( ruleClass ) | ( ruleAssociationType ) )
            int alt6=2;
            switch ( input.LA(1) ) {
            case 46:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==23) ) {
                    alt6=1;
                }
                else if ( (LA6_1==27) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                alt6=1;
                }
                break;
            case 27:
            case 32:
            case 33:
            case 34:
                {
                alt6=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalUSE.g:1032:2: ( ruleClass )
                    {
                    // InternalUSE.g:1032:2: ( ruleClass )
                    // InternalUSE.g:1033:3: ruleClass
                    {
                     before(grammarAccess.getTypeAccess().getClassParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClass();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getClassParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:1038:2: ( ruleAssociationType )
                    {
                    // InternalUSE.g:1038:2: ( ruleAssociationType )
                    // InternalUSE.g:1039:3: ruleAssociationType
                    {
                     before(grammarAccess.getTypeAccess().getAssociationTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAssociationType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getAssociationTypeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__AssociationType__Alternatives"
    // InternalUSE.g:1048:1: rule__AssociationType__Alternatives : ( ( ruleAssociationBasic ) | ( ruleAssociationClass ) | ( ruleAggregation ) | ( ruleComposition ) );
    public final void rule__AssociationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1052:1: ( ( ruleAssociationBasic ) | ( ruleAssociationClass ) | ( ruleAggregation ) | ( ruleComposition ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt7=1;
                }
                break;
            case 27:
            case 46:
                {
                alt7=2;
                }
                break;
            case 33:
                {
                alt7=3;
                }
                break;
            case 34:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalUSE.g:1053:2: ( ruleAssociationBasic )
                    {
                    // InternalUSE.g:1053:2: ( ruleAssociationBasic )
                    // InternalUSE.g:1054:3: ruleAssociationBasic
                    {
                     before(grammarAccess.getAssociationTypeAccess().getAssociationBasicParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAssociationBasic();

                    state._fsp--;

                     after(grammarAccess.getAssociationTypeAccess().getAssociationBasicParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:1059:2: ( ruleAssociationClass )
                    {
                    // InternalUSE.g:1059:2: ( ruleAssociationClass )
                    // InternalUSE.g:1060:3: ruleAssociationClass
                    {
                     before(grammarAccess.getAssociationTypeAccess().getAssociationClassParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAssociationClass();

                    state._fsp--;

                     after(grammarAccess.getAssociationTypeAccess().getAssociationClassParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUSE.g:1065:2: ( ruleAggregation )
                    {
                    // InternalUSE.g:1065:2: ( ruleAggregation )
                    // InternalUSE.g:1066:3: ruleAggregation
                    {
                     before(grammarAccess.getAssociationTypeAccess().getAggregationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAggregation();

                    state._fsp--;

                     after(grammarAccess.getAssociationTypeAccess().getAggregationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUSE.g:1071:2: ( ruleComposition )
                    {
                    // InternalUSE.g:1071:2: ( ruleComposition )
                    // InternalUSE.g:1072:3: ruleComposition
                    {
                     before(grammarAccess.getAssociationTypeAccess().getCompositionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleComposition();

                    state._fsp--;

                     after(grammarAccess.getAssociationTypeAccess().getCompositionParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationType__Alternatives"


    // $ANTLR start "rule__SimpleTypes__Alternatives"
    // InternalUSE.g:1081:1: rule__SimpleTypes__Alternatives : ( ( ruleDefaultType ) | ( ( rule__SimpleTypes__ReferendedAssignment_1 ) ) );
    public final void rule__SimpleTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1085:1: ( ( ruleDefaultType ) | ( ( rule__SimpleTypes__ReferendedAssignment_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=13 && LA8_0<=16)) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalUSE.g:1086:2: ( ruleDefaultType )
                    {
                    // InternalUSE.g:1086:2: ( ruleDefaultType )
                    // InternalUSE.g:1087:3: ruleDefaultType
                    {
                     before(grammarAccess.getSimpleTypesAccess().getDefaultTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDefaultType();

                    state._fsp--;

                     after(grammarAccess.getSimpleTypesAccess().getDefaultTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:1092:2: ( ( rule__SimpleTypes__ReferendedAssignment_1 ) )
                    {
                    // InternalUSE.g:1092:2: ( ( rule__SimpleTypes__ReferendedAssignment_1 ) )
                    // InternalUSE.g:1093:3: ( rule__SimpleTypes__ReferendedAssignment_1 )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getReferendedAssignment_1()); 
                    // InternalUSE.g:1094:3: ( rule__SimpleTypes__ReferendedAssignment_1 )
                    // InternalUSE.g:1094:4: rule__SimpleTypes__ReferendedAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleTypes__ReferendedAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleTypesAccess().getReferendedAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypes__Alternatives"


    // $ANTLR start "rule__OperationType__Alternatives"
    // InternalUSE.g:1102:1: rule__OperationType__Alternatives : ( ( ruleOperationBasic ) | ( ruleOperationComplex ) );
    public final void rule__OperationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1106:1: ( ( ruleOperationBasic ) | ( ruleOperationComplex ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalUSE.g:1107:2: ( ruleOperationBasic )
                    {
                    // InternalUSE.g:1107:2: ( ruleOperationBasic )
                    // InternalUSE.g:1108:3: ruleOperationBasic
                    {
                     before(grammarAccess.getOperationTypeAccess().getOperationBasicParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOperationBasic();

                    state._fsp--;

                     after(grammarAccess.getOperationTypeAccess().getOperationBasicParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:1113:2: ( ruleOperationComplex )
                    {
                    // InternalUSE.g:1113:2: ( ruleOperationComplex )
                    // InternalUSE.g:1114:3: ruleOperationComplex
                    {
                     before(grammarAccess.getOperationTypeAccess().getOperationComplexParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOperationComplex();

                    state._fsp--;

                     after(grammarAccess.getOperationTypeAccess().getOperationComplexParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationType__Alternatives"


    // $ANTLR start "rule__ContextsType__Alternatives"
    // InternalUSE.g:1123:1: rule__ContextsType__Alternatives : ( ( ruleInvariantContext ) | ( ruleOperationContext ) );
    public final void rule__ContextsType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1127:1: ( ( ruleInvariantContext ) | ( ruleOperationContext ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==41) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==RULE_ID) ) {
                    int LA10_2 = input.LA(3);

                    if ( (LA10_2==43) ) {
                        alt10=2;
                    }
                    else if ( (LA10_2==EOF||LA10_2==35||(LA10_2>=41 && LA10_2<=42)) ) {
                        alt10=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalUSE.g:1128:2: ( ruleInvariantContext )
                    {
                    // InternalUSE.g:1128:2: ( ruleInvariantContext )
                    // InternalUSE.g:1129:3: ruleInvariantContext
                    {
                     before(grammarAccess.getContextsTypeAccess().getInvariantContextParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInvariantContext();

                    state._fsp--;

                     after(grammarAccess.getContextsTypeAccess().getInvariantContextParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:1134:2: ( ruleOperationContext )
                    {
                    // InternalUSE.g:1134:2: ( ruleOperationContext )
                    // InternalUSE.g:1135:3: ruleOperationContext
                    {
                     before(grammarAccess.getContextsTypeAccess().getOperationContextParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOperationContext();

                    state._fsp--;

                     after(grammarAccess.getContextsTypeAccess().getOperationContextParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextsType__Alternatives"


    // $ANTLR start "rule__ConditionType__Alternatives"
    // InternalUSE.g:1144:1: rule__ConditionType__Alternatives : ( ( rulePrecondition ) | ( rulePostcondition ) );
    public final void rule__ConditionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1148:1: ( ( rulePrecondition ) | ( rulePostcondition ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==44) ) {
                alt11=1;
            }
            else if ( (LA11_0==45) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalUSE.g:1149:2: ( rulePrecondition )
                    {
                    // InternalUSE.g:1149:2: ( rulePrecondition )
                    // InternalUSE.g:1150:3: rulePrecondition
                    {
                     before(grammarAccess.getConditionTypeAccess().getPreconditionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrecondition();

                    state._fsp--;

                     after(grammarAccess.getConditionTypeAccess().getPreconditionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:1155:2: ( rulePostcondition )
                    {
                    // InternalUSE.g:1155:2: ( rulePostcondition )
                    // InternalUSE.g:1156:3: rulePostcondition
                    {
                     before(grammarAccess.getConditionTypeAccess().getPostconditionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePostcondition();

                    state._fsp--;

                     after(grammarAccess.getConditionTypeAccess().getPostconditionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalUSE.g:1165:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1169:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalUSE.g:1170:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalUSE.g:1177:1: rule__Model__Group__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1181:1: ( ( 'model' ) )
            // InternalUSE.g:1182:1: ( 'model' )
            {
            // InternalUSE.g:1182:1: ( 'model' )
            // InternalUSE.g:1183:2: 'model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalUSE.g:1192:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1196:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalUSE.g:1197:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalUSE.g:1204:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1208:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalUSE.g:1209:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalUSE.g:1209:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalUSE.g:1210:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalUSE.g:1211:2: ( rule__Model__NameAssignment_1 )
            // InternalUSE.g:1211:3: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalUSE.g:1219:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1223:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalUSE.g:1224:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalUSE.g:1231:1: rule__Model__Group__2__Impl : ( ( rule__Model__PackagedElementAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1235:1: ( ( ( rule__Model__PackagedElementAssignment_2 )* ) )
            // InternalUSE.g:1236:1: ( ( rule__Model__PackagedElementAssignment_2 )* )
            {
            // InternalUSE.g:1236:1: ( ( rule__Model__PackagedElementAssignment_2 )* )
            // InternalUSE.g:1237:2: ( rule__Model__PackagedElementAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getPackagedElementAssignment_2()); 
            // InternalUSE.g:1238:2: ( rule__Model__PackagedElementAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalUSE.g:1238:3: rule__Model__PackagedElementAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__PackagedElementAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getPackagedElementAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalUSE.g:1246:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1250:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalUSE.g:1251:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalUSE.g:1258:1: rule__Model__Group__3__Impl : ( ( rule__Model__PackagedElementAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1262:1: ( ( ( rule__Model__PackagedElementAssignment_3 )* ) )
            // InternalUSE.g:1263:1: ( ( rule__Model__PackagedElementAssignment_3 )* )
            {
            // InternalUSE.g:1263:1: ( ( rule__Model__PackagedElementAssignment_3 )* )
            // InternalUSE.g:1264:2: ( rule__Model__PackagedElementAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getPackagedElementAssignment_3()); 
            // InternalUSE.g:1265:2: ( rule__Model__PackagedElementAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23||LA13_0==27||(LA13_0>=32 && LA13_0<=34)||LA13_0==46) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalUSE.g:1265:3: rule__Model__PackagedElementAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__PackagedElementAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getPackagedElementAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalUSE.g:1273:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1277:1: ( rule__Model__Group__4__Impl )
            // InternalUSE.g:1278:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalUSE.g:1284:1: rule__Model__Group__4__Impl : ( ( rule__Model__ConstraintsAssignment_4 )? ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1288:1: ( ( ( rule__Model__ConstraintsAssignment_4 )? ) )
            // InternalUSE.g:1289:1: ( ( rule__Model__ConstraintsAssignment_4 )? )
            {
            // InternalUSE.g:1289:1: ( ( rule__Model__ConstraintsAssignment_4 )? )
            // InternalUSE.g:1290:2: ( rule__Model__ConstraintsAssignment_4 )?
            {
             before(grammarAccess.getModelAccess().getConstraintsAssignment_4()); 
            // InternalUSE.g:1291:2: ( rule__Model__ConstraintsAssignment_4 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==40) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUSE.g:1291:3: rule__Model__ConstraintsAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ConstraintsAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getConstraintsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Multiplicity__Group__0"
    // InternalUSE.g:1300:1: rule__Multiplicity__Group__0 : rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1 ;
    public final void rule__Multiplicity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1304:1: ( rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1 )
            // InternalUSE.g:1305:2: rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Multiplicity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplicity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group__0"


    // $ANTLR start "rule__Multiplicity__Group__0__Impl"
    // InternalUSE.g:1312:1: rule__Multiplicity__Group__0__Impl : ( ( rule__Multiplicity__Alternatives_0 ) ) ;
    public final void rule__Multiplicity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1316:1: ( ( ( rule__Multiplicity__Alternatives_0 ) ) )
            // InternalUSE.g:1317:1: ( ( rule__Multiplicity__Alternatives_0 ) )
            {
            // InternalUSE.g:1317:1: ( ( rule__Multiplicity__Alternatives_0 ) )
            // InternalUSE.g:1318:2: ( rule__Multiplicity__Alternatives_0 )
            {
             before(grammarAccess.getMultiplicityAccess().getAlternatives_0()); 
            // InternalUSE.g:1319:2: ( rule__Multiplicity__Alternatives_0 )
            // InternalUSE.g:1319:3: rule__Multiplicity__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicity__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group__0__Impl"


    // $ANTLR start "rule__Multiplicity__Group__1"
    // InternalUSE.g:1327:1: rule__Multiplicity__Group__1 : rule__Multiplicity__Group__1__Impl rule__Multiplicity__Group__2 ;
    public final void rule__Multiplicity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1331:1: ( rule__Multiplicity__Group__1__Impl rule__Multiplicity__Group__2 )
            // InternalUSE.g:1332:2: rule__Multiplicity__Group__1__Impl rule__Multiplicity__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Multiplicity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplicity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group__1"


    // $ANTLR start "rule__Multiplicity__Group__1__Impl"
    // InternalUSE.g:1339:1: rule__Multiplicity__Group__1__Impl : ( ( rule__Multiplicity__Group_1__0 )? ) ;
    public final void rule__Multiplicity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1343:1: ( ( ( rule__Multiplicity__Group_1__0 )? ) )
            // InternalUSE.g:1344:1: ( ( rule__Multiplicity__Group_1__0 )? )
            {
            // InternalUSE.g:1344:1: ( ( rule__Multiplicity__Group_1__0 )? )
            // InternalUSE.g:1345:2: ( rule__Multiplicity__Group_1__0 )?
            {
             before(grammarAccess.getMultiplicityAccess().getGroup_1()); 
            // InternalUSE.g:1346:2: ( rule__Multiplicity__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalUSE.g:1346:3: rule__Multiplicity__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Multiplicity__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultiplicityAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group__1__Impl"


    // $ANTLR start "rule__Multiplicity__Group__2"
    // InternalUSE.g:1354:1: rule__Multiplicity__Group__2 : rule__Multiplicity__Group__2__Impl ;
    public final void rule__Multiplicity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1358:1: ( rule__Multiplicity__Group__2__Impl )
            // InternalUSE.g:1359:2: rule__Multiplicity__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicity__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group__2"


    // $ANTLR start "rule__Multiplicity__Group__2__Impl"
    // InternalUSE.g:1365:1: rule__Multiplicity__Group__2__Impl : ( ( rule__Multiplicity__Group_2__0 )* ) ;
    public final void rule__Multiplicity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1369:1: ( ( ( rule__Multiplicity__Group_2__0 )* ) )
            // InternalUSE.g:1370:1: ( ( rule__Multiplicity__Group_2__0 )* )
            {
            // InternalUSE.g:1370:1: ( ( rule__Multiplicity__Group_2__0 )* )
            // InternalUSE.g:1371:2: ( rule__Multiplicity__Group_2__0 )*
            {
             before(grammarAccess.getMultiplicityAccess().getGroup_2()); 
            // InternalUSE.g:1372:2: ( rule__Multiplicity__Group_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==19) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalUSE.g:1372:3: rule__Multiplicity__Group_2__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Multiplicity__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getMultiplicityAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group__2__Impl"


    // $ANTLR start "rule__Multiplicity__Group_1__0"
    // InternalUSE.g:1381:1: rule__Multiplicity__Group_1__0 : rule__Multiplicity__Group_1__0__Impl rule__Multiplicity__Group_1__1 ;
    public final void rule__Multiplicity__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1385:1: ( rule__Multiplicity__Group_1__0__Impl rule__Multiplicity__Group_1__1 )
            // InternalUSE.g:1386:2: rule__Multiplicity__Group_1__0__Impl rule__Multiplicity__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Multiplicity__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplicity__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_1__0"


    // $ANTLR start "rule__Multiplicity__Group_1__0__Impl"
    // InternalUSE.g:1393:1: rule__Multiplicity__Group_1__0__Impl : ( '..' ) ;
    public final void rule__Multiplicity__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1397:1: ( ( '..' ) )
            // InternalUSE.g:1398:1: ( '..' )
            {
            // InternalUSE.g:1398:1: ( '..' )
            // InternalUSE.g:1399:2: '..'
            {
             before(grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplicity__Group_1__1"
    // InternalUSE.g:1408:1: rule__Multiplicity__Group_1__1 : rule__Multiplicity__Group_1__1__Impl ;
    public final void rule__Multiplicity__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1412:1: ( rule__Multiplicity__Group_1__1__Impl )
            // InternalUSE.g:1413:2: rule__Multiplicity__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicity__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_1__1"


    // $ANTLR start "rule__Multiplicity__Group_1__1__Impl"
    // InternalUSE.g:1419:1: rule__Multiplicity__Group_1__1__Impl : ( ( rule__Multiplicity__Alternatives_1_1 ) ) ;
    public final void rule__Multiplicity__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1423:1: ( ( ( rule__Multiplicity__Alternatives_1_1 ) ) )
            // InternalUSE.g:1424:1: ( ( rule__Multiplicity__Alternatives_1_1 ) )
            {
            // InternalUSE.g:1424:1: ( ( rule__Multiplicity__Alternatives_1_1 ) )
            // InternalUSE.g:1425:2: ( rule__Multiplicity__Alternatives_1_1 )
            {
             before(grammarAccess.getMultiplicityAccess().getAlternatives_1_1()); 
            // InternalUSE.g:1426:2: ( rule__Multiplicity__Alternatives_1_1 )
            // InternalUSE.g:1426:3: rule__Multiplicity__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicity__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityAccess().getAlternatives_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplicity__Group_2__0"
    // InternalUSE.g:1435:1: rule__Multiplicity__Group_2__0 : rule__Multiplicity__Group_2__0__Impl rule__Multiplicity__Group_2__1 ;
    public final void rule__Multiplicity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1439:1: ( rule__Multiplicity__Group_2__0__Impl rule__Multiplicity__Group_2__1 )
            // InternalUSE.g:1440:2: rule__Multiplicity__Group_2__0__Impl rule__Multiplicity__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__Multiplicity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplicity__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_2__0"


    // $ANTLR start "rule__Multiplicity__Group_2__0__Impl"
    // InternalUSE.g:1447:1: rule__Multiplicity__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Multiplicity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1451:1: ( ( ',' ) )
            // InternalUSE.g:1452:1: ( ',' )
            {
            // InternalUSE.g:1452:1: ( ',' )
            // InternalUSE.g:1453:2: ','
            {
             before(grammarAccess.getMultiplicityAccess().getCommaKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMultiplicityAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_2__0__Impl"


    // $ANTLR start "rule__Multiplicity__Group_2__1"
    // InternalUSE.g:1462:1: rule__Multiplicity__Group_2__1 : rule__Multiplicity__Group_2__1__Impl rule__Multiplicity__Group_2__2 ;
    public final void rule__Multiplicity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1466:1: ( rule__Multiplicity__Group_2__1__Impl rule__Multiplicity__Group_2__2 )
            // InternalUSE.g:1467:2: rule__Multiplicity__Group_2__1__Impl rule__Multiplicity__Group_2__2
            {
            pushFollow(FOLLOW_10);
            rule__Multiplicity__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplicity__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_2__1"


    // $ANTLR start "rule__Multiplicity__Group_2__1__Impl"
    // InternalUSE.g:1474:1: rule__Multiplicity__Group_2__1__Impl : ( ( rule__Multiplicity__Alternatives_2_1 ) ) ;
    public final void rule__Multiplicity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1478:1: ( ( ( rule__Multiplicity__Alternatives_2_1 ) ) )
            // InternalUSE.g:1479:1: ( ( rule__Multiplicity__Alternatives_2_1 ) )
            {
            // InternalUSE.g:1479:1: ( ( rule__Multiplicity__Alternatives_2_1 ) )
            // InternalUSE.g:1480:2: ( rule__Multiplicity__Alternatives_2_1 )
            {
             before(grammarAccess.getMultiplicityAccess().getAlternatives_2_1()); 
            // InternalUSE.g:1481:2: ( rule__Multiplicity__Alternatives_2_1 )
            // InternalUSE.g:1481:3: rule__Multiplicity__Alternatives_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicity__Alternatives_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityAccess().getAlternatives_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_2__1__Impl"


    // $ANTLR start "rule__Multiplicity__Group_2__2"
    // InternalUSE.g:1489:1: rule__Multiplicity__Group_2__2 : rule__Multiplicity__Group_2__2__Impl ;
    public final void rule__Multiplicity__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1493:1: ( rule__Multiplicity__Group_2__2__Impl )
            // InternalUSE.g:1494:2: rule__Multiplicity__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicity__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_2__2"


    // $ANTLR start "rule__Multiplicity__Group_2__2__Impl"
    // InternalUSE.g:1500:1: rule__Multiplicity__Group_2__2__Impl : ( ( rule__Multiplicity__Group_2_2__0 )? ) ;
    public final void rule__Multiplicity__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1504:1: ( ( ( rule__Multiplicity__Group_2_2__0 )? ) )
            // InternalUSE.g:1505:1: ( ( rule__Multiplicity__Group_2_2__0 )? )
            {
            // InternalUSE.g:1505:1: ( ( rule__Multiplicity__Group_2_2__0 )? )
            // InternalUSE.g:1506:2: ( rule__Multiplicity__Group_2_2__0 )?
            {
             before(grammarAccess.getMultiplicityAccess().getGroup_2_2()); 
            // InternalUSE.g:1507:2: ( rule__Multiplicity__Group_2_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==18) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUSE.g:1507:3: rule__Multiplicity__Group_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Multiplicity__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultiplicityAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_2__2__Impl"


    // $ANTLR start "rule__Multiplicity__Group_2_2__0"
    // InternalUSE.g:1516:1: rule__Multiplicity__Group_2_2__0 : rule__Multiplicity__Group_2_2__0__Impl rule__Multiplicity__Group_2_2__1 ;
    public final void rule__Multiplicity__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1520:1: ( rule__Multiplicity__Group_2_2__0__Impl rule__Multiplicity__Group_2_2__1 )
            // InternalUSE.g:1521:2: rule__Multiplicity__Group_2_2__0__Impl rule__Multiplicity__Group_2_2__1
            {
            pushFollow(FOLLOW_9);
            rule__Multiplicity__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplicity__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_2_2__0"


    // $ANTLR start "rule__Multiplicity__Group_2_2__0__Impl"
    // InternalUSE.g:1528:1: rule__Multiplicity__Group_2_2__0__Impl : ( '..' ) ;
    public final void rule__Multiplicity__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1532:1: ( ( '..' ) )
            // InternalUSE.g:1533:1: ( '..' )
            {
            // InternalUSE.g:1533:1: ( '..' )
            // InternalUSE.g:1534:2: '..'
            {
             before(grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_2_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_2_2__0__Impl"


    // $ANTLR start "rule__Multiplicity__Group_2_2__1"
    // InternalUSE.g:1543:1: rule__Multiplicity__Group_2_2__1 : rule__Multiplicity__Group_2_2__1__Impl ;
    public final void rule__Multiplicity__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1547:1: ( rule__Multiplicity__Group_2_2__1__Impl )
            // InternalUSE.g:1548:2: rule__Multiplicity__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicity__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_2_2__1"


    // $ANTLR start "rule__Multiplicity__Group_2_2__1__Impl"
    // InternalUSE.g:1554:1: rule__Multiplicity__Group_2_2__1__Impl : ( ( rule__Multiplicity__Alternatives_2_2_1 ) ) ;
    public final void rule__Multiplicity__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1558:1: ( ( ( rule__Multiplicity__Alternatives_2_2_1 ) ) )
            // InternalUSE.g:1559:1: ( ( rule__Multiplicity__Alternatives_2_2_1 ) )
            {
            // InternalUSE.g:1559:1: ( ( rule__Multiplicity__Alternatives_2_2_1 ) )
            // InternalUSE.g:1560:2: ( rule__Multiplicity__Alternatives_2_2_1 )
            {
             before(grammarAccess.getMultiplicityAccess().getAlternatives_2_2_1()); 
            // InternalUSE.g:1561:2: ( rule__Multiplicity__Alternatives_2_2_1 )
            // InternalUSE.g:1561:3: rule__Multiplicity__Alternatives_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicity__Alternatives_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityAccess().getAlternatives_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_2_2__1__Impl"


    // $ANTLR start "rule__Enumeration__Group__0"
    // InternalUSE.g:1570:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1574:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // InternalUSE.g:1575:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Enumeration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__0"


    // $ANTLR start "rule__Enumeration__Group__0__Impl"
    // InternalUSE.g:1582:1: rule__Enumeration__Group__0__Impl : ( 'enum' ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1586:1: ( ( 'enum' ) )
            // InternalUSE.g:1587:1: ( 'enum' )
            {
            // InternalUSE.g:1587:1: ( 'enum' )
            // InternalUSE.g:1588:2: 'enum'
            {
             before(grammarAccess.getEnumerationAccess().getEnumKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getEnumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__0__Impl"


    // $ANTLR start "rule__Enumeration__Group__1"
    // InternalUSE.g:1597:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1601:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // InternalUSE.g:1602:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Enumeration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__1"


    // $ANTLR start "rule__Enumeration__Group__1__Impl"
    // InternalUSE.g:1609:1: rule__Enumeration__Group__1__Impl : ( ( rule__Enumeration__NameAssignment_1 )? ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1613:1: ( ( ( rule__Enumeration__NameAssignment_1 )? ) )
            // InternalUSE.g:1614:1: ( ( rule__Enumeration__NameAssignment_1 )? )
            {
            // InternalUSE.g:1614:1: ( ( rule__Enumeration__NameAssignment_1 )? )
            // InternalUSE.g:1615:2: ( rule__Enumeration__NameAssignment_1 )?
            {
             before(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 
            // InternalUSE.g:1616:2: ( rule__Enumeration__NameAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUSE.g:1616:3: rule__Enumeration__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Enumeration__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__1__Impl"


    // $ANTLR start "rule__Enumeration__Group__2"
    // InternalUSE.g:1624:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1628:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // InternalUSE.g:1629:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Enumeration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__2"


    // $ANTLR start "rule__Enumeration__Group__2__Impl"
    // InternalUSE.g:1636:1: rule__Enumeration__Group__2__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1640:1: ( ( '{' ) )
            // InternalUSE.g:1641:1: ( '{' )
            {
            // InternalUSE.g:1641:1: ( '{' )
            // InternalUSE.g:1642:2: '{'
            {
             before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__2__Impl"


    // $ANTLR start "rule__Enumeration__Group__3"
    // InternalUSE.g:1651:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1655:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // InternalUSE.g:1656:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Enumeration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__3"


    // $ANTLR start "rule__Enumeration__Group__3__Impl"
    // InternalUSE.g:1663:1: rule__Enumeration__Group__3__Impl : ( ( ( rule__Enumeration__OwnedLiteralAssignment_3 ) ) ( ( rule__Enumeration__OwnedLiteralAssignment_3 )* ) ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1667:1: ( ( ( ( rule__Enumeration__OwnedLiteralAssignment_3 ) ) ( ( rule__Enumeration__OwnedLiteralAssignment_3 )* ) ) )
            // InternalUSE.g:1668:1: ( ( ( rule__Enumeration__OwnedLiteralAssignment_3 ) ) ( ( rule__Enumeration__OwnedLiteralAssignment_3 )* ) )
            {
            // InternalUSE.g:1668:1: ( ( ( rule__Enumeration__OwnedLiteralAssignment_3 ) ) ( ( rule__Enumeration__OwnedLiteralAssignment_3 )* ) )
            // InternalUSE.g:1669:2: ( ( rule__Enumeration__OwnedLiteralAssignment_3 ) ) ( ( rule__Enumeration__OwnedLiteralAssignment_3 )* )
            {
            // InternalUSE.g:1669:2: ( ( rule__Enumeration__OwnedLiteralAssignment_3 ) )
            // InternalUSE.g:1670:3: ( rule__Enumeration__OwnedLiteralAssignment_3 )
            {
             before(grammarAccess.getEnumerationAccess().getOwnedLiteralAssignment_3()); 
            // InternalUSE.g:1671:3: ( rule__Enumeration__OwnedLiteralAssignment_3 )
            // InternalUSE.g:1671:4: rule__Enumeration__OwnedLiteralAssignment_3
            {
            pushFollow(FOLLOW_13);
            rule__Enumeration__OwnedLiteralAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getOwnedLiteralAssignment_3()); 

            }

            // InternalUSE.g:1674:2: ( ( rule__Enumeration__OwnedLiteralAssignment_3 )* )
            // InternalUSE.g:1675:3: ( rule__Enumeration__OwnedLiteralAssignment_3 )*
            {
             before(grammarAccess.getEnumerationAccess().getOwnedLiteralAssignment_3()); 
            // InternalUSE.g:1676:3: ( rule__Enumeration__OwnedLiteralAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalUSE.g:1676:4: rule__Enumeration__OwnedLiteralAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Enumeration__OwnedLiteralAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getEnumerationAccess().getOwnedLiteralAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__3__Impl"


    // $ANTLR start "rule__Enumeration__Group__4"
    // InternalUSE.g:1685:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1689:1: ( rule__Enumeration__Group__4__Impl )
            // InternalUSE.g:1690:2: rule__Enumeration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__4"


    // $ANTLR start "rule__Enumeration__Group__4__Impl"
    // InternalUSE.g:1696:1: rule__Enumeration__Group__4__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1700:1: ( ( '}' ) )
            // InternalUSE.g:1701:1: ( '}' )
            {
            // InternalUSE.g:1701:1: ( '}' )
            // InternalUSE.g:1702:2: '}'
            {
             before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__4__Impl"


    // $ANTLR start "rule__OwnedLiteral__Group__0"
    // InternalUSE.g:1712:1: rule__OwnedLiteral__Group__0 : rule__OwnedLiteral__Group__0__Impl rule__OwnedLiteral__Group__1 ;
    public final void rule__OwnedLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1716:1: ( rule__OwnedLiteral__Group__0__Impl rule__OwnedLiteral__Group__1 )
            // InternalUSE.g:1717:2: rule__OwnedLiteral__Group__0__Impl rule__OwnedLiteral__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__OwnedLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OwnedLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OwnedLiteral__Group__0"


    // $ANTLR start "rule__OwnedLiteral__Group__0__Impl"
    // InternalUSE.g:1724:1: rule__OwnedLiteral__Group__0__Impl : ( ( rule__OwnedLiteral__NameAssignment_0 ) ) ;
    public final void rule__OwnedLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1728:1: ( ( ( rule__OwnedLiteral__NameAssignment_0 ) ) )
            // InternalUSE.g:1729:1: ( ( rule__OwnedLiteral__NameAssignment_0 ) )
            {
            // InternalUSE.g:1729:1: ( ( rule__OwnedLiteral__NameAssignment_0 ) )
            // InternalUSE.g:1730:2: ( rule__OwnedLiteral__NameAssignment_0 )
            {
             before(grammarAccess.getOwnedLiteralAccess().getNameAssignment_0()); 
            // InternalUSE.g:1731:2: ( rule__OwnedLiteral__NameAssignment_0 )
            // InternalUSE.g:1731:3: rule__OwnedLiteral__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__OwnedLiteral__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOwnedLiteralAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OwnedLiteral__Group__0__Impl"


    // $ANTLR start "rule__OwnedLiteral__Group__1"
    // InternalUSE.g:1739:1: rule__OwnedLiteral__Group__1 : rule__OwnedLiteral__Group__1__Impl ;
    public final void rule__OwnedLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1743:1: ( rule__OwnedLiteral__Group__1__Impl )
            // InternalUSE.g:1744:2: rule__OwnedLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OwnedLiteral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OwnedLiteral__Group__1"


    // $ANTLR start "rule__OwnedLiteral__Group__1__Impl"
    // InternalUSE.g:1750:1: rule__OwnedLiteral__Group__1__Impl : ( ( ',' )? ) ;
    public final void rule__OwnedLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1754:1: ( ( ( ',' )? ) )
            // InternalUSE.g:1755:1: ( ( ',' )? )
            {
            // InternalUSE.g:1755:1: ( ( ',' )? )
            // InternalUSE.g:1756:2: ( ',' )?
            {
             before(grammarAccess.getOwnedLiteralAccess().getCommaKeyword_1()); 
            // InternalUSE.g:1757:2: ( ',' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==19) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUSE.g:1757:3: ','
                    {
                    match(input,19,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getOwnedLiteralAccess().getCommaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OwnedLiteral__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // InternalUSE.g:1766:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1770:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalUSE.g:1771:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // InternalUSE.g:1778:1: rule__Class__Group__0__Impl : ( ( rule__Class__AbstractAssignment_0 )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1782:1: ( ( ( rule__Class__AbstractAssignment_0 )? ) )
            // InternalUSE.g:1783:1: ( ( rule__Class__AbstractAssignment_0 )? )
            {
            // InternalUSE.g:1783:1: ( ( rule__Class__AbstractAssignment_0 )? )
            // InternalUSE.g:1784:2: ( rule__Class__AbstractAssignment_0 )?
            {
             before(grammarAccess.getClassAccess().getAbstractAssignment_0()); 
            // InternalUSE.g:1785:2: ( rule__Class__AbstractAssignment_0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==46) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUSE.g:1785:3: rule__Class__AbstractAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__AbstractAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getAbstractAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // InternalUSE.g:1793:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1797:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalUSE.g:1798:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // InternalUSE.g:1805:1: rule__Class__Group__1__Impl : ( 'class' ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1809:1: ( ( 'class' ) )
            // InternalUSE.g:1810:1: ( 'class' )
            {
            // InternalUSE.g:1810:1: ( 'class' )
            // InternalUSE.g:1811:2: 'class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getClassKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__2"
    // InternalUSE.g:1820:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1824:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalUSE.g:1825:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Class__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2"


    // $ANTLR start "rule__Class__Group__2__Impl"
    // InternalUSE.g:1832:1: rule__Class__Group__2__Impl : ( ( rule__Class__NameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1836:1: ( ( ( rule__Class__NameAssignment_2 ) ) )
            // InternalUSE.g:1837:1: ( ( rule__Class__NameAssignment_2 ) )
            {
            // InternalUSE.g:1837:1: ( ( rule__Class__NameAssignment_2 ) )
            // InternalUSE.g:1838:2: ( rule__Class__NameAssignment_2 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_2()); 
            // InternalUSE.g:1839:2: ( rule__Class__NameAssignment_2 )
            // InternalUSE.g:1839:3: rule__Class__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Class__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__3"
    // InternalUSE.g:1847:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1851:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalUSE.g:1852:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Class__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3"


    // $ANTLR start "rule__Class__Group__3__Impl"
    // InternalUSE.g:1859:1: rule__Class__Group__3__Impl : ( ( rule__Class__Group_3__0 )? ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1863:1: ( ( ( rule__Class__Group_3__0 )? ) )
            // InternalUSE.g:1864:1: ( ( rule__Class__Group_3__0 )? )
            {
            // InternalUSE.g:1864:1: ( ( rule__Class__Group_3__0 )? )
            // InternalUSE.g:1865:2: ( rule__Class__Group_3__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_3()); 
            // InternalUSE.g:1866:2: ( rule__Class__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==25) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUSE.g:1866:3: rule__Class__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3__Impl"


    // $ANTLR start "rule__Class__Group__4"
    // InternalUSE.g:1874:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1878:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalUSE.g:1879:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Class__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4"


    // $ANTLR start "rule__Class__Group__4__Impl"
    // InternalUSE.g:1886:1: rule__Class__Group__4__Impl : ( ( rule__Class__Group_4__0 )? ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1890:1: ( ( ( rule__Class__Group_4__0 )? ) )
            // InternalUSE.g:1891:1: ( ( rule__Class__Group_4__0 )? )
            {
            // InternalUSE.g:1891:1: ( ( rule__Class__Group_4__0 )? )
            // InternalUSE.g:1892:2: ( rule__Class__Group_4__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_4()); 
            // InternalUSE.g:1893:2: ( rule__Class__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==26) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalUSE.g:1893:3: rule__Class__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4__Impl"


    // $ANTLR start "rule__Class__Group__5"
    // InternalUSE.g:1901:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1905:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalUSE.g:1906:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Class__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5"


    // $ANTLR start "rule__Class__Group__5__Impl"
    // InternalUSE.g:1913:1: rule__Class__Group__5__Impl : ( ( rule__Class__OwnedOperationAssignment_5 )? ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1917:1: ( ( ( rule__Class__OwnedOperationAssignment_5 )? ) )
            // InternalUSE.g:1918:1: ( ( rule__Class__OwnedOperationAssignment_5 )? )
            {
            // InternalUSE.g:1918:1: ( ( rule__Class__OwnedOperationAssignment_5 )? )
            // InternalUSE.g:1919:2: ( rule__Class__OwnedOperationAssignment_5 )?
            {
             before(grammarAccess.getClassAccess().getOwnedOperationAssignment_5()); 
            // InternalUSE.g:1920:2: ( rule__Class__OwnedOperationAssignment_5 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==11) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUSE.g:1920:3: rule__Class__OwnedOperationAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__OwnedOperationAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getOwnedOperationAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5__Impl"


    // $ANTLR start "rule__Class__Group__6"
    // InternalUSE.g:1928:1: rule__Class__Group__6 : rule__Class__Group__6__Impl rule__Class__Group__7 ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1932:1: ( rule__Class__Group__6__Impl rule__Class__Group__7 )
            // InternalUSE.g:1933:2: rule__Class__Group__6__Impl rule__Class__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Class__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__6"


    // $ANTLR start "rule__Class__Group__6__Impl"
    // InternalUSE.g:1940:1: rule__Class__Group__6__Impl : ( ( rule__Class__ConstraintsAssignment_6 )? ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1944:1: ( ( ( rule__Class__ConstraintsAssignment_6 )? ) )
            // InternalUSE.g:1945:1: ( ( rule__Class__ConstraintsAssignment_6 )? )
            {
            // InternalUSE.g:1945:1: ( ( rule__Class__ConstraintsAssignment_6 )? )
            // InternalUSE.g:1946:2: ( rule__Class__ConstraintsAssignment_6 )?
            {
             before(grammarAccess.getClassAccess().getConstraintsAssignment_6()); 
            // InternalUSE.g:1947:2: ( rule__Class__ConstraintsAssignment_6 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==40) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUSE.g:1947:3: rule__Class__ConstraintsAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__ConstraintsAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getConstraintsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__6__Impl"


    // $ANTLR start "rule__Class__Group__7"
    // InternalUSE.g:1955:1: rule__Class__Group__7 : rule__Class__Group__7__Impl ;
    public final void rule__Class__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1959:1: ( rule__Class__Group__7__Impl )
            // InternalUSE.g:1960:2: rule__Class__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__7"


    // $ANTLR start "rule__Class__Group__7__Impl"
    // InternalUSE.g:1966:1: rule__Class__Group__7__Impl : ( 'end' ) ;
    public final void rule__Class__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1970:1: ( ( 'end' ) )
            // InternalUSE.g:1971:1: ( 'end' )
            {
            // InternalUSE.g:1971:1: ( 'end' )
            // InternalUSE.g:1972:2: 'end'
            {
             before(grammarAccess.getClassAccess().getEndKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getEndKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__7__Impl"


    // $ANTLR start "rule__Class__Group_3__0"
    // InternalUSE.g:1982:1: rule__Class__Group_3__0 : rule__Class__Group_3__0__Impl rule__Class__Group_3__1 ;
    public final void rule__Class__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1986:1: ( rule__Class__Group_3__0__Impl rule__Class__Group_3__1 )
            // InternalUSE.g:1987:2: rule__Class__Group_3__0__Impl rule__Class__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Class__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__0"


    // $ANTLR start "rule__Class__Group_3__0__Impl"
    // InternalUSE.g:1994:1: rule__Class__Group_3__0__Impl : ( '<' ) ;
    public final void rule__Class__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1998:1: ( ( '<' ) )
            // InternalUSE.g:1999:1: ( '<' )
            {
            // InternalUSE.g:1999:1: ( '<' )
            // InternalUSE.g:2000:2: '<'
            {
             before(grammarAccess.getClassAccess().getLessThanSignKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLessThanSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__0__Impl"


    // $ANTLR start "rule__Class__Group_3__1"
    // InternalUSE.g:2009:1: rule__Class__Group_3__1 : rule__Class__Group_3__1__Impl ;
    public final void rule__Class__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2013:1: ( rule__Class__Group_3__1__Impl )
            // InternalUSE.g:2014:2: rule__Class__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__1"


    // $ANTLR start "rule__Class__Group_3__1__Impl"
    // InternalUSE.g:2020:1: rule__Class__Group_3__1__Impl : ( ( ( rule__Class__GeneralizationAssignment_3_1 ) ) ( ( rule__Class__GeneralizationAssignment_3_1 )* ) ) ;
    public final void rule__Class__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2024:1: ( ( ( ( rule__Class__GeneralizationAssignment_3_1 ) ) ( ( rule__Class__GeneralizationAssignment_3_1 )* ) ) )
            // InternalUSE.g:2025:1: ( ( ( rule__Class__GeneralizationAssignment_3_1 ) ) ( ( rule__Class__GeneralizationAssignment_3_1 )* ) )
            {
            // InternalUSE.g:2025:1: ( ( ( rule__Class__GeneralizationAssignment_3_1 ) ) ( ( rule__Class__GeneralizationAssignment_3_1 )* ) )
            // InternalUSE.g:2026:2: ( ( rule__Class__GeneralizationAssignment_3_1 ) ) ( ( rule__Class__GeneralizationAssignment_3_1 )* )
            {
            // InternalUSE.g:2026:2: ( ( rule__Class__GeneralizationAssignment_3_1 ) )
            // InternalUSE.g:2027:3: ( rule__Class__GeneralizationAssignment_3_1 )
            {
             before(grammarAccess.getClassAccess().getGeneralizationAssignment_3_1()); 
            // InternalUSE.g:2028:3: ( rule__Class__GeneralizationAssignment_3_1 )
            // InternalUSE.g:2028:4: rule__Class__GeneralizationAssignment_3_1
            {
            pushFollow(FOLLOW_13);
            rule__Class__GeneralizationAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGeneralizationAssignment_3_1()); 

            }

            // InternalUSE.g:2031:2: ( ( rule__Class__GeneralizationAssignment_3_1 )* )
            // InternalUSE.g:2032:3: ( rule__Class__GeneralizationAssignment_3_1 )*
            {
             before(grammarAccess.getClassAccess().getGeneralizationAssignment_3_1()); 
            // InternalUSE.g:2033:3: ( rule__Class__GeneralizationAssignment_3_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalUSE.g:2033:4: rule__Class__GeneralizationAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Class__GeneralizationAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getGeneralizationAssignment_3_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__1__Impl"


    // $ANTLR start "rule__Class__Group_4__0"
    // InternalUSE.g:2043:1: rule__Class__Group_4__0 : rule__Class__Group_4__0__Impl rule__Class__Group_4__1 ;
    public final void rule__Class__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2047:1: ( rule__Class__Group_4__0__Impl rule__Class__Group_4__1 )
            // InternalUSE.g:2048:2: rule__Class__Group_4__0__Impl rule__Class__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Class__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__0"


    // $ANTLR start "rule__Class__Group_4__0__Impl"
    // InternalUSE.g:2055:1: rule__Class__Group_4__0__Impl : ( 'attributes' ) ;
    public final void rule__Class__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2059:1: ( ( 'attributes' ) )
            // InternalUSE.g:2060:1: ( 'attributes' )
            {
            // InternalUSE.g:2060:1: ( 'attributes' )
            // InternalUSE.g:2061:2: 'attributes'
            {
             before(grammarAccess.getClassAccess().getAttributesKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getAttributesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__0__Impl"


    // $ANTLR start "rule__Class__Group_4__1"
    // InternalUSE.g:2070:1: rule__Class__Group_4__1 : rule__Class__Group_4__1__Impl ;
    public final void rule__Class__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2074:1: ( rule__Class__Group_4__1__Impl )
            // InternalUSE.g:2075:2: rule__Class__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__1"


    // $ANTLR start "rule__Class__Group_4__1__Impl"
    // InternalUSE.g:2081:1: rule__Class__Group_4__1__Impl : ( ( rule__Class__OwnedAttributeAssignment_4_1 )* ) ;
    public final void rule__Class__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2085:1: ( ( ( rule__Class__OwnedAttributeAssignment_4_1 )* ) )
            // InternalUSE.g:2086:1: ( ( rule__Class__OwnedAttributeAssignment_4_1 )* )
            {
            // InternalUSE.g:2086:1: ( ( rule__Class__OwnedAttributeAssignment_4_1 )* )
            // InternalUSE.g:2087:2: ( rule__Class__OwnedAttributeAssignment_4_1 )*
            {
             before(grammarAccess.getClassAccess().getOwnedAttributeAssignment_4_1()); 
            // InternalUSE.g:2088:2: ( rule__Class__OwnedAttributeAssignment_4_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalUSE.g:2088:3: rule__Class__OwnedAttributeAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Class__OwnedAttributeAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getOwnedAttributeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__1__Impl"


    // $ANTLR start "rule__AssociationClass__Group__0"
    // InternalUSE.g:2097:1: rule__AssociationClass__Group__0 : rule__AssociationClass__Group__0__Impl rule__AssociationClass__Group__1 ;
    public final void rule__AssociationClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2101:1: ( rule__AssociationClass__Group__0__Impl rule__AssociationClass__Group__1 )
            // InternalUSE.g:2102:2: rule__AssociationClass__Group__0__Impl rule__AssociationClass__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__AssociationClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__Group__0"


    // $ANTLR start "rule__AssociationClass__Group__0__Impl"
    // InternalUSE.g:2109:1: rule__AssociationClass__Group__0__Impl : ( ( rule__AssociationClass__AbstractAssignment_0 )? ) ;
    public final void rule__AssociationClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2113:1: ( ( ( rule__AssociationClass__AbstractAssignment_0 )? ) )
            // InternalUSE.g:2114:1: ( ( rule__AssociationClass__AbstractAssignment_0 )? )
            {
            // InternalUSE.g:2114:1: ( ( rule__AssociationClass__AbstractAssignment_0 )? )
            // InternalUSE.g:2115:2: ( rule__AssociationClass__AbstractAssignment_0 )?
            {
             before(grammarAccess.getAssociationClassAccess().getAbstractAssignment_0()); 
            // InternalUSE.g:2116:2: ( rule__AssociationClass__AbstractAssignment_0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==46) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalUSE.g:2116:3: rule__AssociationClass__AbstractAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssociationClass__AbstractAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationClassAccess().getAbstractAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__Group__0__Impl"


    // $ANTLR start "rule__AssociationClass__Group__1"
    // InternalUSE.g:2124:1: rule__AssociationClass__Group__1 : rule__AssociationClass__Group__1__Impl rule__AssociationClass__Group__2 ;
    public final void rule__AssociationClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2128:1: ( rule__AssociationClass__Group__1__Impl rule__AssociationClass__Group__2 )
            // InternalUSE.g:2129:2: rule__AssociationClass__Group__1__Impl rule__AssociationClass__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__AssociationClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationClass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__Group__1"


    // $ANTLR start "rule__AssociationClass__Group__1__Impl"
    // InternalUSE.g:2136:1: rule__AssociationClass__Group__1__Impl : ( 'associationclass' ) ;
    public final void rule__AssociationClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2140:1: ( ( 'associationclass' ) )
            // InternalUSE.g:2141:1: ( 'associationclass' )
            {
            // InternalUSE.g:2141:1: ( 'associationclass' )
            // InternalUSE.g:2142:2: 'associationclass'
            {
             before(grammarAccess.getAssociationClassAccess().getAssociationclassKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAssociationClassAccess().getAssociationclassKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__Group__1__Impl"


    // $ANTLR start "rule__AssociationClass__Group__2"
    // InternalUSE.g:2151:1: rule__AssociationClass__Group__2 : rule__AssociationClass__Group__2__Impl rule__AssociationClass__Group__3 ;
    public final void rule__AssociationClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2155:1: ( rule__AssociationClass__Group__2__Impl rule__AssociationClass__Group__3 )
            // InternalUSE.g:2156:2: rule__AssociationClass__Group__2__Impl rule__AssociationClass__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__AssociationClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationClass__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__Group__2"


    // $ANTLR start "rule__AssociationClass__Group__2__Impl"
    // InternalUSE.g:2163:1: rule__AssociationClass__Group__2__Impl : ( ( rule__AssociationClass__NameAssignment_2 ) ) ;
    public final void rule__AssociationClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2167:1: ( ( ( rule__AssociationClass__NameAssignment_2 ) ) )
            // InternalUSE.g:2168:1: ( ( rule__AssociationClass__NameAssignment_2 ) )
            {
            // InternalUSE.g:2168:1: ( ( rule__AssociationClass__NameAssignment_2 ) )
            // InternalUSE.g:2169:2: ( rule__AssociationClass__NameAssignment_2 )
            {
             before(grammarAccess.getAssociationClassAccess().getNameAssignment_2()); 
            // InternalUSE.g:2170:2: ( rule__AssociationClass__NameAssignment_2 )
            // InternalUSE.g:2170:3: rule__AssociationClass__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AssociationClass__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssociationClassAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__Group__2__Impl"


    // $ANTLR start "rule__AssociationClass__Group__3"
    // InternalUSE.g:2178:1: rule__AssociationClass__Group__3 : rule__AssociationClass__Group__3__Impl rule__AssociationClass__Group__4 ;
    public final void rule__AssociationClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2182:1: ( rule__AssociationClass__Group__3__Impl rule__AssociationClass__Group__4 )
            // InternalUSE.g:2183:2: rule__AssociationClass__Group__3__Impl rule__AssociationClass__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__AssociationClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationClass__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__Group__3"


    // $ANTLR start "rule__AssociationClass__Group__3__Impl"
    // InternalUSE.g:2190:1: rule__AssociationClass__Group__3__Impl : ( ( rule__AssociationClass__Group_3__0 )? ) ;
    public final void rule__AssociationClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2194:1: ( ( ( rule__AssociationClass__Group_3__0 )? ) )
            // InternalUSE.g:2195:1: ( ( rule__AssociationClass__Group_3__0 )? )
            {
            // InternalUSE.g:2195:1: ( ( rule__AssociationClass__Group_3__0 )? )
            // InternalUSE.g:2196:2: ( rule__AssociationClass__Group_3__0 )?
            {
             before(grammarAccess.getAssociationClassAccess().getGroup_3()); 
            // InternalUSE.g:2197:2: ( rule__AssociationClass__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==25) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalUSE.g:2197:3: rule__AssociationClass__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssociationClass__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationClassAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__Group__3__Impl"


    // $ANTLR start "rule__AssociationClass__Group__4"
    // InternalUSE.g:2205:1: rule__AssociationClass__Group__4 : rule__AssociationClass__Group__4__Impl rule__AssociationClass__Group__5 ;
    public final void rule__AssociationClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2209:1: ( rule__AssociationClass__Group__4__Impl rule__AssociationClass__Group__5 )
            // InternalUSE.g:2210:2: rule__AssociationClass__Group__4__Impl rule__AssociationClass__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__AssociationClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationClass__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__Group__4"


    // $ANTLR start "rule__AssociationClass__Group__4__Impl"
    // InternalUSE.g:2217:1: rule__AssociationClass__Group__4__Impl : ( 'between' ) ;
    public final void rule__AssociationClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2221:1: ( ( 'between' ) )
            // InternalUSE.g:2222:1: ( 'between' )
            {
            // InternalUSE.g:2222:1: ( 'between' )
            // InternalUSE.g:2223:2: 'between'
            {
             before(grammarAccess.getAssociationClassAccess().getBetweenKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAssociationClassAccess().getBetweenKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__Group__4__Impl"


    // $ANTLR start "rule__AssociationClass__Group__5"
    // InternalUSE.g:2232:1: rule__AssociationClass__Group__5 : rule__AssociationClass__Group__5__Impl rule__AssociationClass__Group__6 ;
    public final void rule__AssociationClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2236:1: ( rule__AssociationClass__Group__5__Impl rule__AssociationClass__Group__6 )
            // InternalUSE.g:2237:2: rule__AssociationClass__Group__5__Impl rule__AssociationClass__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__AssociationClass__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationClass__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__Group__5"


    // $ANTLR start "rule__AssociationClass__Group__5__Impl"
    // InternalUSE.g:2244:1: rule__AssociationClass__Group__5__Impl : ( ( ( rule__AssociationClass__MemberEndsAssignment_5 ) ) ( ( rule__AssociationClass__MemberEndsAssignment_5 )* ) ) ;
    public final void rule__AssociationClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2248:1: ( ( ( ( rule__AssociationClass__MemberEndsAssignment_5 ) ) ( ( rule__AssociationClass__MemberEndsAssignment_5 )* ) ) )
            // InternalUSE.g:2249:1: ( ( ( rule__AssociationClass__MemberEndsAssignment_5 ) ) ( ( rule__AssociationClass__MemberEndsAssignment_5 )* ) )
            {
            // InternalUSE.g:2249:1: ( ( ( rule__AssociationClass__MemberEndsAssignment_5 ) ) ( ( rule__AssociationClass__MemberEndsAssignment_5 )* ) )
            // InternalUSE.g:2250:2: ( ( rule__AssociationClass__MemberEndsAssignment_5 ) ) ( ( rule__AssociationClass__MemberEndsAssignment_5 )* )
            {
            // InternalUSE.g:2250:2: ( ( rule__AssociationClass__MemberEndsAssignment_5 ) )
            // InternalUSE.g:2251:3: ( rule__AssociationClass__MemberEndsAssignment_5 )
            {
             before(grammarAccess.getAssociationClassAccess().getMemberEndsAssignment_5()); 
            // InternalUSE.g:2252:3: ( rule__AssociationClass__MemberEndsAssignment_5 )
            // InternalUSE.g:2252:4: rule__AssociationClass__MemberEndsAssignment_5
            {
            pushFollow(FOLLOW_13);
            rule__AssociationClass__MemberEndsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAssociationClassAccess().getMemberEndsAssignment_5()); 

            }

            // InternalUSE.g:2255:2: ( ( rule__AssociationClass__MemberEndsAssignment_5 )* )
            // InternalUSE.g:2256:3: ( rule__AssociationClass__MemberEndsAssignment_5 )*
            {
             before(grammarAccess.getAssociationClassAccess().getMemberEndsAssignment_5()); 
            // InternalUSE.g:2257:3: ( rule__AssociationClass__MemberEndsAssignment_5 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalUSE.g:2257:4: rule__AssociationClass__MemberEndsAssignment_5
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__AssociationClass__MemberEndsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getAssociationClassAccess().getMemberEndsAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__Group__5__Impl"


    // $ANTLR start "rule__AssociationClass__Group__6"
    // InternalUSE.g:2266:1: rule__AssociationClass__Group__6 : rule__AssociationClass__Group__6__Impl rule__AssociationClass__Group__7 ;
    public final void rule__AssociationClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2270:1: ( rule__AssociationClass__Group__6__Impl rule__AssociationClass__Group__7 )
            // InternalUSE.g:2271:2: rule__AssociationClass__Group__6__Impl rule__AssociationClass__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__AssociationClass__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationClass__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__Group__6"


    // $ANTLR start "rule__AssociationClass__Group__6__Impl"
    // InternalUSE.g:2278:1: rule__AssociationClass__Group__6__Impl : ( ( rule__AssociationClass__Group_6__0 )? ) ;
    public final void rule__AssociationClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2282:1: ( ( ( rule__AssociationClass__Group_6__0 )? ) )
            // InternalUSE.g:2283:1: ( ( rule__AssociationClass__Group_6__0 )? )
            {
            // InternalUSE.g:2283:1: ( ( rule__AssociationClass__Group_6__0 )? )
            // InternalUSE.g:2284:2: ( rule__AssociationClass__Group_6__0 )?
            {
             before(grammarAccess.getAssociationClassAccess().getGroup_6()); 
            // InternalUSE.g:2285:2: ( rule__AssociationClass__Group_6__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==26) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUSE.g:2285:3: rule__AssociationClass__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssociationClass__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationClassAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__Group__6__Impl"


    // $ANTLR start "rule__AssociationClass__Group__7"
    // InternalUSE.g:2293:1: rule__AssociationClass__Group__7 : rule__AssociationClass__Group__7__Impl rule__AssociationClass__Group__8 ;
    public final void rule__AssociationClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2297:1: ( rule__AssociationClass__Group__7__Impl rule__AssociationClass__Group__8 )
            // InternalUSE.g:2298:2: rule__AssociationClass__Group__7__Impl rule__AssociationClass__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__AssociationClass__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationClass__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__Group__7"


    // $ANTLR start "rule__AssociationClass__Group__7__Impl"
    // InternalUSE.g:2305:1: rule__AssociationClass__Group__7__Impl : ( ( rule__AssociationClass__Group_7__0 )? ) ;
    public final void rule__AssociationClass__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2309:1: ( ( ( rule__AssociationClass__Group_7__0 )? ) )
            // InternalUSE.g:2310:1: ( ( rule__AssociationClass__Group_7__0 )? )
            {
            // InternalUSE.g:2310:1: ( ( rule__AssociationClass__Group_7__0 )? )
            // InternalUSE.g:2311:2: ( rule__AssociationClass__Group_7__0 )?
            {
             before(grammarAccess.getAssociationClassAccess().getGroup_7()); 
            // InternalUSE.g:2312:2: ( rule__AssociationClass__Group_7__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==11) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalUSE.g:2312:3: rule__AssociationClass__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssociationClass__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationClassAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__Group__7__Impl"


    // $ANTLR start "rule__AssociationClass__Group__8"
    // InternalUSE.g:2320:1: rule__AssociationClass__Group__8 : rule__AssociationClass__Group__8__Impl rule__AssociationClass__Group__9 ;
    public final void rule__AssociationClass__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2324:1: ( rule__AssociationClass__Group__8__Impl rule__AssociationClass__Group__9 )
            // InternalUSE.g:2325:2: rule__AssociationClass__Group__8__Impl rule__AssociationClass__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__AssociationClass__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationClass__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__Group__8"


    // $ANTLR start "rule__AssociationClass__Group__8__Impl"
    // InternalUSE.g:2332:1: rule__AssociationClass__Group__8__Impl : ( ( rule__AssociationClass__ConstraintsAssignment_8 )? ) ;
    public final void rule__AssociationClass__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2336:1: ( ( ( rule__AssociationClass__ConstraintsAssignment_8 )? ) )
            // InternalUSE.g:2337:1: ( ( rule__AssociationClass__ConstraintsAssignment_8 )? )
            {
            // InternalUSE.g:2337:1: ( ( rule__AssociationClass__ConstraintsAssignment_8 )? )
            // InternalUSE.g:2338:2: ( rule__AssociationClass__ConstraintsAssignment_8 )?
            {
             before(grammarAccess.getAssociationClassAccess().getConstraintsAssignment_8()); 
            // InternalUSE.g:2339:2: ( rule__AssociationClass__ConstraintsAssignment_8 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==40) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalUSE.g:2339:3: rule__AssociationClass__ConstraintsAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssociationClass__ConstraintsAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationClassAccess().getConstraintsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__Group__8__Impl"


    // $ANTLR start "rule__AssociationClass__Group__9"
    // InternalUSE.g:2347:1: rule__AssociationClass__Group__9 : rule__AssociationClass__Group__9__Impl ;
    public final void rule__AssociationClass__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2351:1: ( rule__AssociationClass__Group__9__Impl )
            // InternalUSE.g:2352:2: rule__AssociationClass__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociationClass__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__Group__9"


    // $ANTLR start "rule__AssociationClass__Group__9__Impl"
    // InternalUSE.g:2358:1: rule__AssociationClass__Group__9__Impl : ( 'end' ) ;
    public final void rule__AssociationClass__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2362:1: ( ( 'end' ) )
            // InternalUSE.g:2363:1: ( 'end' )
            {
            // InternalUSE.g:2363:1: ( 'end' )
            // InternalUSE.g:2364:2: 'end'
            {
             before(grammarAccess.getAssociationClassAccess().getEndKeyword_9()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAssociationClassAccess().getEndKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__Group__9__Impl"


    // $ANTLR start "rule__AssociationClass__Group_3__0"
    // InternalUSE.g:2374:1: rule__AssociationClass__Group_3__0 : rule__AssociationClass__Group_3__0__Impl rule__AssociationClass__Group_3__1 ;
    public final void rule__AssociationClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2378:1: ( rule__AssociationClass__Group_3__0__Impl rule__AssociationClass__Group_3__1 )
            // InternalUSE.g:2379:2: rule__AssociationClass__Group_3__0__Impl rule__AssociationClass__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__AssociationClass__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationClass__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__Group_3__0"


    // $ANTLR start "rule__AssociationClass__Group_3__0__Impl"
    // InternalUSE.g:2386:1: rule__AssociationClass__Group_3__0__Impl : ( '<' ) ;
    public final void rule__AssociationClass__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2390:1: ( ( '<' ) )
            // InternalUSE.g:2391:1: ( '<' )
            {
            // InternalUSE.g:2391:1: ( '<' )
            // InternalUSE.g:2392:2: '<'
            {
             before(grammarAccess.getAssociationClassAccess().getLessThanSignKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAssociationClassAccess().getLessThanSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__Group_3__0__Impl"


    // $ANTLR start "rule__AssociationClass__Group_3__1"
    // InternalUSE.g:2401:1: rule__AssociationClass__Group_3__1 : rule__AssociationClass__Group_3__1__Impl ;
    public final void rule__AssociationClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2405:1: ( rule__AssociationClass__Group_3__1__Impl )
            // InternalUSE.g:2406:2: rule__AssociationClass__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociationClass__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__Group_3__1"


    // $ANTLR start "rule__AssociationClass__Group_3__1__Impl"
    // InternalUSE.g:2412:1: rule__AssociationClass__Group_3__1__Impl : ( ( rule__AssociationClass__GeneralizationAssignment_3_1 )* ) ;
    public final void rule__AssociationClass__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2416:1: ( ( ( rule__AssociationClass__GeneralizationAssignment_3_1 )* ) )
            // InternalUSE.g:2417:1: ( ( rule__AssociationClass__GeneralizationAssignment_3_1 )* )
            {
            // InternalUSE.g:2417:1: ( ( rule__AssociationClass__GeneralizationAssignment_3_1 )* )
            // InternalUSE.g:2418:2: ( rule__AssociationClass__GeneralizationAssignment_3_1 )*
            {
             before(grammarAccess.getAssociationClassAccess().getGeneralizationAssignment_3_1()); 
            // InternalUSE.g:2419:2: ( rule__AssociationClass__GeneralizationAssignment_3_1 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalUSE.g:2419:3: rule__AssociationClass__GeneralizationAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__AssociationClass__GeneralizationAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getAssociationClassAccess().getGeneralizationAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__Group_3__1__Impl"


    // $ANTLR start "rule__AssociationClass__Group_6__0"
    // InternalUSE.g:2428:1: rule__AssociationClass__Group_6__0 : rule__AssociationClass__Group_6__0__Impl rule__AssociationClass__Group_6__1 ;
    public final void rule__AssociationClass__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2432:1: ( rule__AssociationClass__Group_6__0__Impl rule__AssociationClass__Group_6__1 )
            // InternalUSE.g:2433:2: rule__AssociationClass__Group_6__0__Impl rule__AssociationClass__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__AssociationClass__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationClass__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__Group_6__0"


    // $ANTLR start "rule__AssociationClass__Group_6__0__Impl"
    // InternalUSE.g:2440:1: rule__AssociationClass__Group_6__0__Impl : ( 'attributes' ) ;
    public final void rule__AssociationClass__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2444:1: ( ( 'attributes' ) )
            // InternalUSE.g:2445:1: ( 'attributes' )
            {
            // InternalUSE.g:2445:1: ( 'attributes' )
            // InternalUSE.g:2446:2: 'attributes'
            {
             before(grammarAccess.getAssociationClassAccess().getAttributesKeyword_6_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAssociationClassAccess().getAttributesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__Group_6__0__Impl"


    // $ANTLR start "rule__AssociationClass__Group_6__1"
    // InternalUSE.g:2455:1: rule__AssociationClass__Group_6__1 : rule__AssociationClass__Group_6__1__Impl ;
    public final void rule__AssociationClass__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2459:1: ( rule__AssociationClass__Group_6__1__Impl )
            // InternalUSE.g:2460:2: rule__AssociationClass__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociationClass__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__Group_6__1"


    // $ANTLR start "rule__AssociationClass__Group_6__1__Impl"
    // InternalUSE.g:2466:1: rule__AssociationClass__Group_6__1__Impl : ( ( rule__AssociationClass__OwnedAttributeAssignment_6_1 )* ) ;
    public final void rule__AssociationClass__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2470:1: ( ( ( rule__AssociationClass__OwnedAttributeAssignment_6_1 )* ) )
            // InternalUSE.g:2471:1: ( ( rule__AssociationClass__OwnedAttributeAssignment_6_1 )* )
            {
            // InternalUSE.g:2471:1: ( ( rule__AssociationClass__OwnedAttributeAssignment_6_1 )* )
            // InternalUSE.g:2472:2: ( rule__AssociationClass__OwnedAttributeAssignment_6_1 )*
            {
             before(grammarAccess.getAssociationClassAccess().getOwnedAttributeAssignment_6_1()); 
            // InternalUSE.g:2473:2: ( rule__AssociationClass__OwnedAttributeAssignment_6_1 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalUSE.g:2473:3: rule__AssociationClass__OwnedAttributeAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__AssociationClass__OwnedAttributeAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getAssociationClassAccess().getOwnedAttributeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__Group_6__1__Impl"


    // $ANTLR start "rule__AssociationClass__Group_7__0"
    // InternalUSE.g:2482:1: rule__AssociationClass__Group_7__0 : rule__AssociationClass__Group_7__0__Impl rule__AssociationClass__Group_7__1 ;
    public final void rule__AssociationClass__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2486:1: ( rule__AssociationClass__Group_7__0__Impl rule__AssociationClass__Group_7__1 )
            // InternalUSE.g:2487:2: rule__AssociationClass__Group_7__0__Impl rule__AssociationClass__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__AssociationClass__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationClass__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__Group_7__0"


    // $ANTLR start "rule__AssociationClass__Group_7__0__Impl"
    // InternalUSE.g:2494:1: rule__AssociationClass__Group_7__0__Impl : ( 'operations' ) ;
    public final void rule__AssociationClass__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2498:1: ( ( 'operations' ) )
            // InternalUSE.g:2499:1: ( 'operations' )
            {
            // InternalUSE.g:2499:1: ( 'operations' )
            // InternalUSE.g:2500:2: 'operations'
            {
             before(grammarAccess.getAssociationClassAccess().getOperationsKeyword_7_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getAssociationClassAccess().getOperationsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__Group_7__0__Impl"


    // $ANTLR start "rule__AssociationClass__Group_7__1"
    // InternalUSE.g:2509:1: rule__AssociationClass__Group_7__1 : rule__AssociationClass__Group_7__1__Impl ;
    public final void rule__AssociationClass__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2513:1: ( rule__AssociationClass__Group_7__1__Impl )
            // InternalUSE.g:2514:2: rule__AssociationClass__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociationClass__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__Group_7__1"


    // $ANTLR start "rule__AssociationClass__Group_7__1__Impl"
    // InternalUSE.g:2520:1: rule__AssociationClass__Group_7__1__Impl : ( ( rule__AssociationClass__OperationsAssignment_7_1 )* ) ;
    public final void rule__AssociationClass__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2524:1: ( ( ( rule__AssociationClass__OperationsAssignment_7_1 )* ) )
            // InternalUSE.g:2525:1: ( ( rule__AssociationClass__OperationsAssignment_7_1 )* )
            {
            // InternalUSE.g:2525:1: ( ( rule__AssociationClass__OperationsAssignment_7_1 )* )
            // InternalUSE.g:2526:2: ( rule__AssociationClass__OperationsAssignment_7_1 )*
            {
             before(grammarAccess.getAssociationClassAccess().getOperationsAssignment_7_1()); 
            // InternalUSE.g:2527:2: ( rule__AssociationClass__OperationsAssignment_7_1 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalUSE.g:2527:3: rule__AssociationClass__OperationsAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__AssociationClass__OperationsAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getAssociationClassAccess().getOperationsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__Group_7__1__Impl"


    // $ANTLR start "rule__Generalization__Group__0"
    // InternalUSE.g:2536:1: rule__Generalization__Group__0 : rule__Generalization__Group__0__Impl rule__Generalization__Group__1 ;
    public final void rule__Generalization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2540:1: ( rule__Generalization__Group__0__Impl rule__Generalization__Group__1 )
            // InternalUSE.g:2541:2: rule__Generalization__Group__0__Impl rule__Generalization__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Generalization__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generalization__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__0"


    // $ANTLR start "rule__Generalization__Group__0__Impl"
    // InternalUSE.g:2548:1: rule__Generalization__Group__0__Impl : ( ( rule__Generalization__GeneralAssignment_0 ) ) ;
    public final void rule__Generalization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2552:1: ( ( ( rule__Generalization__GeneralAssignment_0 ) ) )
            // InternalUSE.g:2553:1: ( ( rule__Generalization__GeneralAssignment_0 ) )
            {
            // InternalUSE.g:2553:1: ( ( rule__Generalization__GeneralAssignment_0 ) )
            // InternalUSE.g:2554:2: ( rule__Generalization__GeneralAssignment_0 )
            {
             before(grammarAccess.getGeneralizationAccess().getGeneralAssignment_0()); 
            // InternalUSE.g:2555:2: ( rule__Generalization__GeneralAssignment_0 )
            // InternalUSE.g:2555:3: rule__Generalization__GeneralAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Generalization__GeneralAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationAccess().getGeneralAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__0__Impl"


    // $ANTLR start "rule__Generalization__Group__1"
    // InternalUSE.g:2563:1: rule__Generalization__Group__1 : rule__Generalization__Group__1__Impl ;
    public final void rule__Generalization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2567:1: ( rule__Generalization__Group__1__Impl )
            // InternalUSE.g:2568:2: rule__Generalization__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Generalization__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__1"


    // $ANTLR start "rule__Generalization__Group__1__Impl"
    // InternalUSE.g:2574:1: rule__Generalization__Group__1__Impl : ( ( ',' )? ) ;
    public final void rule__Generalization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2578:1: ( ( ( ',' )? ) )
            // InternalUSE.g:2579:1: ( ( ',' )? )
            {
            // InternalUSE.g:2579:1: ( ( ',' )? )
            // InternalUSE.g:2580:2: ( ',' )?
            {
             before(grammarAccess.getGeneralizationAccess().getCommaKeyword_1()); 
            // InternalUSE.g:2581:2: ( ',' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==19) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalUSE.g:2581:3: ','
                    {
                    match(input,19,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getGeneralizationAccess().getCommaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__1__Impl"


    // $ANTLR start "rule__Association__Group__0"
    // InternalUSE.g:2590:1: rule__Association__Group__0 : rule__Association__Group__0__Impl rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2594:1: ( rule__Association__Group__0__Impl rule__Association__Group__1 )
            // InternalUSE.g:2595:2: rule__Association__Group__0__Impl rule__Association__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Association__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__0"


    // $ANTLR start "rule__Association__Group__0__Impl"
    // InternalUSE.g:2602:1: rule__Association__Group__0__Impl : ( ( rule__Association__NameAssignment_0 ) ) ;
    public final void rule__Association__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2606:1: ( ( ( rule__Association__NameAssignment_0 ) ) )
            // InternalUSE.g:2607:1: ( ( rule__Association__NameAssignment_0 ) )
            {
            // InternalUSE.g:2607:1: ( ( rule__Association__NameAssignment_0 ) )
            // InternalUSE.g:2608:2: ( rule__Association__NameAssignment_0 )
            {
             before(grammarAccess.getAssociationAccess().getNameAssignment_0()); 
            // InternalUSE.g:2609:2: ( rule__Association__NameAssignment_0 )
            // InternalUSE.g:2609:3: rule__Association__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Association__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__0__Impl"


    // $ANTLR start "rule__Association__Group__1"
    // InternalUSE.g:2617:1: rule__Association__Group__1 : rule__Association__Group__1__Impl rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2621:1: ( rule__Association__Group__1__Impl rule__Association__Group__2 )
            // InternalUSE.g:2622:2: rule__Association__Group__1__Impl rule__Association__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Association__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__1"


    // $ANTLR start "rule__Association__Group__1__Impl"
    // InternalUSE.g:2629:1: rule__Association__Group__1__Impl : ( 'between' ) ;
    public final void rule__Association__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2633:1: ( ( 'between' ) )
            // InternalUSE.g:2634:1: ( 'between' )
            {
            // InternalUSE.g:2634:1: ( 'between' )
            // InternalUSE.g:2635:2: 'between'
            {
             before(grammarAccess.getAssociationAccess().getBetweenKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getBetweenKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__1__Impl"


    // $ANTLR start "rule__Association__Group__2"
    // InternalUSE.g:2644:1: rule__Association__Group__2 : rule__Association__Group__2__Impl ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2648:1: ( rule__Association__Group__2__Impl )
            // InternalUSE.g:2649:2: rule__Association__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Association__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__2"


    // $ANTLR start "rule__Association__Group__2__Impl"
    // InternalUSE.g:2655:1: rule__Association__Group__2__Impl : ( ( ( rule__Association__MemberEndsAssignment_2 ) ) ( ( rule__Association__MemberEndsAssignment_2 )* ) ) ;
    public final void rule__Association__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2659:1: ( ( ( ( rule__Association__MemberEndsAssignment_2 ) ) ( ( rule__Association__MemberEndsAssignment_2 )* ) ) )
            // InternalUSE.g:2660:1: ( ( ( rule__Association__MemberEndsAssignment_2 ) ) ( ( rule__Association__MemberEndsAssignment_2 )* ) )
            {
            // InternalUSE.g:2660:1: ( ( ( rule__Association__MemberEndsAssignment_2 ) ) ( ( rule__Association__MemberEndsAssignment_2 )* ) )
            // InternalUSE.g:2661:2: ( ( rule__Association__MemberEndsAssignment_2 ) ) ( ( rule__Association__MemberEndsAssignment_2 )* )
            {
            // InternalUSE.g:2661:2: ( ( rule__Association__MemberEndsAssignment_2 ) )
            // InternalUSE.g:2662:3: ( rule__Association__MemberEndsAssignment_2 )
            {
             before(grammarAccess.getAssociationAccess().getMemberEndsAssignment_2()); 
            // InternalUSE.g:2663:3: ( rule__Association__MemberEndsAssignment_2 )
            // InternalUSE.g:2663:4: rule__Association__MemberEndsAssignment_2
            {
            pushFollow(FOLLOW_13);
            rule__Association__MemberEndsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getMemberEndsAssignment_2()); 

            }

            // InternalUSE.g:2666:2: ( ( rule__Association__MemberEndsAssignment_2 )* )
            // InternalUSE.g:2667:3: ( rule__Association__MemberEndsAssignment_2 )*
            {
             before(grammarAccess.getAssociationAccess().getMemberEndsAssignment_2()); 
            // InternalUSE.g:2668:3: ( rule__Association__MemberEndsAssignment_2 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalUSE.g:2668:4: rule__Association__MemberEndsAssignment_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Association__MemberEndsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getAssociationAccess().getMemberEndsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__2__Impl"


    // $ANTLR start "rule__MemberEnd__Group__0"
    // InternalUSE.g:2678:1: rule__MemberEnd__Group__0 : rule__MemberEnd__Group__0__Impl rule__MemberEnd__Group__1 ;
    public final void rule__MemberEnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2682:1: ( rule__MemberEnd__Group__0__Impl rule__MemberEnd__Group__1 )
            // InternalUSE.g:2683:2: rule__MemberEnd__Group__0__Impl rule__MemberEnd__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__MemberEnd__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberEnd__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberEnd__Group__0"


    // $ANTLR start "rule__MemberEnd__Group__0__Impl"
    // InternalUSE.g:2690:1: rule__MemberEnd__Group__0__Impl : ( ( rule__MemberEnd__TypeAssignment_0 ) ) ;
    public final void rule__MemberEnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2694:1: ( ( ( rule__MemberEnd__TypeAssignment_0 ) ) )
            // InternalUSE.g:2695:1: ( ( rule__MemberEnd__TypeAssignment_0 ) )
            {
            // InternalUSE.g:2695:1: ( ( rule__MemberEnd__TypeAssignment_0 ) )
            // InternalUSE.g:2696:2: ( rule__MemberEnd__TypeAssignment_0 )
            {
             before(grammarAccess.getMemberEndAccess().getTypeAssignment_0()); 
            // InternalUSE.g:2697:2: ( rule__MemberEnd__TypeAssignment_0 )
            // InternalUSE.g:2697:3: rule__MemberEnd__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MemberEnd__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMemberEndAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberEnd__Group__0__Impl"


    // $ANTLR start "rule__MemberEnd__Group__1"
    // InternalUSE.g:2705:1: rule__MemberEnd__Group__1 : rule__MemberEnd__Group__1__Impl rule__MemberEnd__Group__2 ;
    public final void rule__MemberEnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2709:1: ( rule__MemberEnd__Group__1__Impl rule__MemberEnd__Group__2 )
            // InternalUSE.g:2710:2: rule__MemberEnd__Group__1__Impl rule__MemberEnd__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__MemberEnd__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberEnd__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberEnd__Group__1"


    // $ANTLR start "rule__MemberEnd__Group__1__Impl"
    // InternalUSE.g:2717:1: rule__MemberEnd__Group__1__Impl : ( '[' ) ;
    public final void rule__MemberEnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2721:1: ( ( '[' ) )
            // InternalUSE.g:2722:1: ( '[' )
            {
            // InternalUSE.g:2722:1: ( '[' )
            // InternalUSE.g:2723:2: '['
            {
             before(grammarAccess.getMemberEndAccess().getLeftSquareBracketKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMemberEndAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberEnd__Group__1__Impl"


    // $ANTLR start "rule__MemberEnd__Group__2"
    // InternalUSE.g:2732:1: rule__MemberEnd__Group__2 : rule__MemberEnd__Group__2__Impl rule__MemberEnd__Group__3 ;
    public final void rule__MemberEnd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2736:1: ( rule__MemberEnd__Group__2__Impl rule__MemberEnd__Group__3 )
            // InternalUSE.g:2737:2: rule__MemberEnd__Group__2__Impl rule__MemberEnd__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__MemberEnd__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberEnd__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberEnd__Group__2"


    // $ANTLR start "rule__MemberEnd__Group__2__Impl"
    // InternalUSE.g:2744:1: rule__MemberEnd__Group__2__Impl : ( ( rule__MemberEnd__MulAssignment_2 ) ) ;
    public final void rule__MemberEnd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2748:1: ( ( ( rule__MemberEnd__MulAssignment_2 ) ) )
            // InternalUSE.g:2749:1: ( ( rule__MemberEnd__MulAssignment_2 ) )
            {
            // InternalUSE.g:2749:1: ( ( rule__MemberEnd__MulAssignment_2 ) )
            // InternalUSE.g:2750:2: ( rule__MemberEnd__MulAssignment_2 )
            {
             before(grammarAccess.getMemberEndAccess().getMulAssignment_2()); 
            // InternalUSE.g:2751:2: ( rule__MemberEnd__MulAssignment_2 )
            // InternalUSE.g:2751:3: rule__MemberEnd__MulAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MemberEnd__MulAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMemberEndAccess().getMulAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberEnd__Group__2__Impl"


    // $ANTLR start "rule__MemberEnd__Group__3"
    // InternalUSE.g:2759:1: rule__MemberEnd__Group__3 : rule__MemberEnd__Group__3__Impl rule__MemberEnd__Group__4 ;
    public final void rule__MemberEnd__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2763:1: ( rule__MemberEnd__Group__3__Impl rule__MemberEnd__Group__4 )
            // InternalUSE.g:2764:2: rule__MemberEnd__Group__3__Impl rule__MemberEnd__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__MemberEnd__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberEnd__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberEnd__Group__3"


    // $ANTLR start "rule__MemberEnd__Group__3__Impl"
    // InternalUSE.g:2771:1: rule__MemberEnd__Group__3__Impl : ( ']' ) ;
    public final void rule__MemberEnd__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2775:1: ( ( ']' ) )
            // InternalUSE.g:2776:1: ( ']' )
            {
            // InternalUSE.g:2776:1: ( ']' )
            // InternalUSE.g:2777:2: ']'
            {
             before(grammarAccess.getMemberEndAccess().getRightSquareBracketKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMemberEndAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberEnd__Group__3__Impl"


    // $ANTLR start "rule__MemberEnd__Group__4"
    // InternalUSE.g:2786:1: rule__MemberEnd__Group__4 : rule__MemberEnd__Group__4__Impl rule__MemberEnd__Group__5 ;
    public final void rule__MemberEnd__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2790:1: ( rule__MemberEnd__Group__4__Impl rule__MemberEnd__Group__5 )
            // InternalUSE.g:2791:2: rule__MemberEnd__Group__4__Impl rule__MemberEnd__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__MemberEnd__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberEnd__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberEnd__Group__4"


    // $ANTLR start "rule__MemberEnd__Group__4__Impl"
    // InternalUSE.g:2798:1: rule__MemberEnd__Group__4__Impl : ( ( rule__MemberEnd__Group_4__0 )? ) ;
    public final void rule__MemberEnd__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2802:1: ( ( ( rule__MemberEnd__Group_4__0 )? ) )
            // InternalUSE.g:2803:1: ( ( rule__MemberEnd__Group_4__0 )? )
            {
            // InternalUSE.g:2803:1: ( ( rule__MemberEnd__Group_4__0 )? )
            // InternalUSE.g:2804:2: ( rule__MemberEnd__Group_4__0 )?
            {
             before(grammarAccess.getMemberEndAccess().getGroup_4()); 
            // InternalUSE.g:2805:2: ( rule__MemberEnd__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==31) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalUSE.g:2805:3: rule__MemberEnd__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MemberEnd__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMemberEndAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberEnd__Group__4__Impl"


    // $ANTLR start "rule__MemberEnd__Group__5"
    // InternalUSE.g:2813:1: rule__MemberEnd__Group__5 : rule__MemberEnd__Group__5__Impl ;
    public final void rule__MemberEnd__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2817:1: ( rule__MemberEnd__Group__5__Impl )
            // InternalUSE.g:2818:2: rule__MemberEnd__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemberEnd__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberEnd__Group__5"


    // $ANTLR start "rule__MemberEnd__Group__5__Impl"
    // InternalUSE.g:2824:1: rule__MemberEnd__Group__5__Impl : ( ( rule__MemberEnd__OrderedAssignment_5 )? ) ;
    public final void rule__MemberEnd__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2828:1: ( ( ( rule__MemberEnd__OrderedAssignment_5 )? ) )
            // InternalUSE.g:2829:1: ( ( rule__MemberEnd__OrderedAssignment_5 )? )
            {
            // InternalUSE.g:2829:1: ( ( rule__MemberEnd__OrderedAssignment_5 )? )
            // InternalUSE.g:2830:2: ( rule__MemberEnd__OrderedAssignment_5 )?
            {
             before(grammarAccess.getMemberEndAccess().getOrderedAssignment_5()); 
            // InternalUSE.g:2831:2: ( rule__MemberEnd__OrderedAssignment_5 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==47) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalUSE.g:2831:3: rule__MemberEnd__OrderedAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__MemberEnd__OrderedAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMemberEndAccess().getOrderedAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberEnd__Group__5__Impl"


    // $ANTLR start "rule__MemberEnd__Group_4__0"
    // InternalUSE.g:2840:1: rule__MemberEnd__Group_4__0 : rule__MemberEnd__Group_4__0__Impl rule__MemberEnd__Group_4__1 ;
    public final void rule__MemberEnd__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2844:1: ( rule__MemberEnd__Group_4__0__Impl rule__MemberEnd__Group_4__1 )
            // InternalUSE.g:2845:2: rule__MemberEnd__Group_4__0__Impl rule__MemberEnd__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__MemberEnd__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberEnd__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberEnd__Group_4__0"


    // $ANTLR start "rule__MemberEnd__Group_4__0__Impl"
    // InternalUSE.g:2852:1: rule__MemberEnd__Group_4__0__Impl : ( 'role' ) ;
    public final void rule__MemberEnd__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2856:1: ( ( 'role' ) )
            // InternalUSE.g:2857:1: ( 'role' )
            {
            // InternalUSE.g:2857:1: ( 'role' )
            // InternalUSE.g:2858:2: 'role'
            {
             before(grammarAccess.getMemberEndAccess().getRoleKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMemberEndAccess().getRoleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberEnd__Group_4__0__Impl"


    // $ANTLR start "rule__MemberEnd__Group_4__1"
    // InternalUSE.g:2867:1: rule__MemberEnd__Group_4__1 : rule__MemberEnd__Group_4__1__Impl ;
    public final void rule__MemberEnd__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2871:1: ( rule__MemberEnd__Group_4__1__Impl )
            // InternalUSE.g:2872:2: rule__MemberEnd__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemberEnd__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberEnd__Group_4__1"


    // $ANTLR start "rule__MemberEnd__Group_4__1__Impl"
    // InternalUSE.g:2878:1: rule__MemberEnd__Group_4__1__Impl : ( ( rule__MemberEnd__RoleAssignment_4_1 ) ) ;
    public final void rule__MemberEnd__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2882:1: ( ( ( rule__MemberEnd__RoleAssignment_4_1 ) ) )
            // InternalUSE.g:2883:1: ( ( rule__MemberEnd__RoleAssignment_4_1 ) )
            {
            // InternalUSE.g:2883:1: ( ( rule__MemberEnd__RoleAssignment_4_1 ) )
            // InternalUSE.g:2884:2: ( rule__MemberEnd__RoleAssignment_4_1 )
            {
             before(grammarAccess.getMemberEndAccess().getRoleAssignment_4_1()); 
            // InternalUSE.g:2885:2: ( rule__MemberEnd__RoleAssignment_4_1 )
            // InternalUSE.g:2885:3: rule__MemberEnd__RoleAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__MemberEnd__RoleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMemberEndAccess().getRoleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberEnd__Group_4__1__Impl"


    // $ANTLR start "rule__AssociationBasic__Group__0"
    // InternalUSE.g:2894:1: rule__AssociationBasic__Group__0 : rule__AssociationBasic__Group__0__Impl rule__AssociationBasic__Group__1 ;
    public final void rule__AssociationBasic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2898:1: ( rule__AssociationBasic__Group__0__Impl rule__AssociationBasic__Group__1 )
            // InternalUSE.g:2899:2: rule__AssociationBasic__Group__0__Impl rule__AssociationBasic__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AssociationBasic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationBasic__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationBasic__Group__0"


    // $ANTLR start "rule__AssociationBasic__Group__0__Impl"
    // InternalUSE.g:2906:1: rule__AssociationBasic__Group__0__Impl : ( 'association' ) ;
    public final void rule__AssociationBasic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2910:1: ( ( 'association' ) )
            // InternalUSE.g:2911:1: ( 'association' )
            {
            // InternalUSE.g:2911:1: ( 'association' )
            // InternalUSE.g:2912:2: 'association'
            {
             before(grammarAccess.getAssociationBasicAccess().getAssociationKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAssociationBasicAccess().getAssociationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationBasic__Group__0__Impl"


    // $ANTLR start "rule__AssociationBasic__Group__1"
    // InternalUSE.g:2921:1: rule__AssociationBasic__Group__1 : rule__AssociationBasic__Group__1__Impl rule__AssociationBasic__Group__2 ;
    public final void rule__AssociationBasic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2925:1: ( rule__AssociationBasic__Group__1__Impl rule__AssociationBasic__Group__2 )
            // InternalUSE.g:2926:2: rule__AssociationBasic__Group__1__Impl rule__AssociationBasic__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__AssociationBasic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationBasic__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationBasic__Group__1"


    // $ANTLR start "rule__AssociationBasic__Group__1__Impl"
    // InternalUSE.g:2933:1: rule__AssociationBasic__Group__1__Impl : ( ruleAssociation ) ;
    public final void rule__AssociationBasic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2937:1: ( ( ruleAssociation ) )
            // InternalUSE.g:2938:1: ( ruleAssociation )
            {
            // InternalUSE.g:2938:1: ( ruleAssociation )
            // InternalUSE.g:2939:2: ruleAssociation
            {
             before(grammarAccess.getAssociationBasicAccess().getAssociationParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleAssociation();

            state._fsp--;

             after(grammarAccess.getAssociationBasicAccess().getAssociationParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationBasic__Group__1__Impl"


    // $ANTLR start "rule__AssociationBasic__Group__2"
    // InternalUSE.g:2948:1: rule__AssociationBasic__Group__2 : rule__AssociationBasic__Group__2__Impl ;
    public final void rule__AssociationBasic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2952:1: ( rule__AssociationBasic__Group__2__Impl )
            // InternalUSE.g:2953:2: rule__AssociationBasic__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociationBasic__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationBasic__Group__2"


    // $ANTLR start "rule__AssociationBasic__Group__2__Impl"
    // InternalUSE.g:2959:1: rule__AssociationBasic__Group__2__Impl : ( 'end' ) ;
    public final void rule__AssociationBasic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2963:1: ( ( 'end' ) )
            // InternalUSE.g:2964:1: ( 'end' )
            {
            // InternalUSE.g:2964:1: ( 'end' )
            // InternalUSE.g:2965:2: 'end'
            {
             before(grammarAccess.getAssociationBasicAccess().getEndKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAssociationBasicAccess().getEndKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationBasic__Group__2__Impl"


    // $ANTLR start "rule__Aggregation__Group__0"
    // InternalUSE.g:2975:1: rule__Aggregation__Group__0 : rule__Aggregation__Group__0__Impl rule__Aggregation__Group__1 ;
    public final void rule__Aggregation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2979:1: ( rule__Aggregation__Group__0__Impl rule__Aggregation__Group__1 )
            // InternalUSE.g:2980:2: rule__Aggregation__Group__0__Impl rule__Aggregation__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Aggregation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aggregation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Group__0"


    // $ANTLR start "rule__Aggregation__Group__0__Impl"
    // InternalUSE.g:2987:1: rule__Aggregation__Group__0__Impl : ( 'aggregation' ) ;
    public final void rule__Aggregation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2991:1: ( ( 'aggregation' ) )
            // InternalUSE.g:2992:1: ( 'aggregation' )
            {
            // InternalUSE.g:2992:1: ( 'aggregation' )
            // InternalUSE.g:2993:2: 'aggregation'
            {
             before(grammarAccess.getAggregationAccess().getAggregationKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAggregationAccess().getAggregationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Group__0__Impl"


    // $ANTLR start "rule__Aggregation__Group__1"
    // InternalUSE.g:3002:1: rule__Aggregation__Group__1 : rule__Aggregation__Group__1__Impl rule__Aggregation__Group__2 ;
    public final void rule__Aggregation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3006:1: ( rule__Aggregation__Group__1__Impl rule__Aggregation__Group__2 )
            // InternalUSE.g:3007:2: rule__Aggregation__Group__1__Impl rule__Aggregation__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Aggregation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aggregation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Group__1"


    // $ANTLR start "rule__Aggregation__Group__1__Impl"
    // InternalUSE.g:3014:1: rule__Aggregation__Group__1__Impl : ( ruleAssociation ) ;
    public final void rule__Aggregation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3018:1: ( ( ruleAssociation ) )
            // InternalUSE.g:3019:1: ( ruleAssociation )
            {
            // InternalUSE.g:3019:1: ( ruleAssociation )
            // InternalUSE.g:3020:2: ruleAssociation
            {
             before(grammarAccess.getAggregationAccess().getAssociationParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleAssociation();

            state._fsp--;

             after(grammarAccess.getAggregationAccess().getAssociationParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Group__1__Impl"


    // $ANTLR start "rule__Aggregation__Group__2"
    // InternalUSE.g:3029:1: rule__Aggregation__Group__2 : rule__Aggregation__Group__2__Impl ;
    public final void rule__Aggregation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3033:1: ( rule__Aggregation__Group__2__Impl )
            // InternalUSE.g:3034:2: rule__Aggregation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Aggregation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Group__2"


    // $ANTLR start "rule__Aggregation__Group__2__Impl"
    // InternalUSE.g:3040:1: rule__Aggregation__Group__2__Impl : ( 'end' ) ;
    public final void rule__Aggregation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3044:1: ( ( 'end' ) )
            // InternalUSE.g:3045:1: ( 'end' )
            {
            // InternalUSE.g:3045:1: ( 'end' )
            // InternalUSE.g:3046:2: 'end'
            {
             before(grammarAccess.getAggregationAccess().getEndKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAggregationAccess().getEndKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Group__2__Impl"


    // $ANTLR start "rule__Composition__Group__0"
    // InternalUSE.g:3056:1: rule__Composition__Group__0 : rule__Composition__Group__0__Impl rule__Composition__Group__1 ;
    public final void rule__Composition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3060:1: ( rule__Composition__Group__0__Impl rule__Composition__Group__1 )
            // InternalUSE.g:3061:2: rule__Composition__Group__0__Impl rule__Composition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Composition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__0"


    // $ANTLR start "rule__Composition__Group__0__Impl"
    // InternalUSE.g:3068:1: rule__Composition__Group__0__Impl : ( 'composition' ) ;
    public final void rule__Composition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3072:1: ( ( 'composition' ) )
            // InternalUSE.g:3073:1: ( 'composition' )
            {
            // InternalUSE.g:3073:1: ( 'composition' )
            // InternalUSE.g:3074:2: 'composition'
            {
             before(grammarAccess.getCompositionAccess().getCompositionKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getCompositionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__0__Impl"


    // $ANTLR start "rule__Composition__Group__1"
    // InternalUSE.g:3083:1: rule__Composition__Group__1 : rule__Composition__Group__1__Impl rule__Composition__Group__2 ;
    public final void rule__Composition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3087:1: ( rule__Composition__Group__1__Impl rule__Composition__Group__2 )
            // InternalUSE.g:3088:2: rule__Composition__Group__1__Impl rule__Composition__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Composition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__1"


    // $ANTLR start "rule__Composition__Group__1__Impl"
    // InternalUSE.g:3095:1: rule__Composition__Group__1__Impl : ( ruleAssociation ) ;
    public final void rule__Composition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3099:1: ( ( ruleAssociation ) )
            // InternalUSE.g:3100:1: ( ruleAssociation )
            {
            // InternalUSE.g:3100:1: ( ruleAssociation )
            // InternalUSE.g:3101:2: ruleAssociation
            {
             before(grammarAccess.getCompositionAccess().getAssociationParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleAssociation();

            state._fsp--;

             after(grammarAccess.getCompositionAccess().getAssociationParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__1__Impl"


    // $ANTLR start "rule__Composition__Group__2"
    // InternalUSE.g:3110:1: rule__Composition__Group__2 : rule__Composition__Group__2__Impl ;
    public final void rule__Composition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3114:1: ( rule__Composition__Group__2__Impl )
            // InternalUSE.g:3115:2: rule__Composition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__2"


    // $ANTLR start "rule__Composition__Group__2__Impl"
    // InternalUSE.g:3121:1: rule__Composition__Group__2__Impl : ( 'end' ) ;
    public final void rule__Composition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3125:1: ( ( 'end' ) )
            // InternalUSE.g:3126:1: ( 'end' )
            {
            // InternalUSE.g:3126:1: ( 'end' )
            // InternalUSE.g:3127:2: 'end'
            {
             before(grammarAccess.getCompositionAccess().getEndKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getEndKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalUSE.g:3137:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3141:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalUSE.g:3142:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalUSE.g:3149:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3153:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalUSE.g:3154:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalUSE.g:3154:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalUSE.g:3155:2: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // InternalUSE.g:3156:2: ( rule__Attribute__NameAssignment_0 )
            // InternalUSE.g:3156:3: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalUSE.g:3164:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3168:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalUSE.g:3169:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalUSE.g:3176:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3180:1: ( ( ':' ) )
            // InternalUSE.g:3181:1: ( ':' )
            {
            // InternalUSE.g:3181:1: ( ':' )
            // InternalUSE.g:3182:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalUSE.g:3191:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3195:1: ( rule__Attribute__Group__2__Impl )
            // InternalUSE.g:3196:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalUSE.g:3202:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3206:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // InternalUSE.g:3207:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // InternalUSE.g:3207:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // InternalUSE.g:3208:2: ( rule__Attribute__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            // InternalUSE.g:3209:2: ( rule__Attribute__TypeAssignment_2 )
            // InternalUSE.g:3209:3: rule__Attribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__OperationBasic__Group__0"
    // InternalUSE.g:3218:1: rule__OperationBasic__Group__0 : rule__OperationBasic__Group__0__Impl rule__OperationBasic__Group__1 ;
    public final void rule__OperationBasic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3222:1: ( rule__OperationBasic__Group__0__Impl rule__OperationBasic__Group__1 )
            // InternalUSE.g:3223:2: rule__OperationBasic__Group__0__Impl rule__OperationBasic__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__OperationBasic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationBasic__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationBasic__Group__0"


    // $ANTLR start "rule__OperationBasic__Group__0__Impl"
    // InternalUSE.g:3230:1: rule__OperationBasic__Group__0__Impl : ( ruleOperationDeclaration ) ;
    public final void rule__OperationBasic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3234:1: ( ( ruleOperationDeclaration ) )
            // InternalUSE.g:3235:1: ( ruleOperationDeclaration )
            {
            // InternalUSE.g:3235:1: ( ruleOperationDeclaration )
            // InternalUSE.g:3236:2: ruleOperationDeclaration
            {
             before(grammarAccess.getOperationBasicAccess().getOperationDeclarationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationDeclaration();

            state._fsp--;

             after(grammarAccess.getOperationBasicAccess().getOperationDeclarationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationBasic__Group__0__Impl"


    // $ANTLR start "rule__OperationBasic__Group__1"
    // InternalUSE.g:3245:1: rule__OperationBasic__Group__1 : rule__OperationBasic__Group__1__Impl rule__OperationBasic__Group__2 ;
    public final void rule__OperationBasic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3249:1: ( rule__OperationBasic__Group__1__Impl rule__OperationBasic__Group__2 )
            // InternalUSE.g:3250:2: rule__OperationBasic__Group__1__Impl rule__OperationBasic__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__OperationBasic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationBasic__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationBasic__Group__1"


    // $ANTLR start "rule__OperationBasic__Group__1__Impl"
    // InternalUSE.g:3257:1: rule__OperationBasic__Group__1__Impl : ( ( rule__OperationBasic__Group_1__0 )? ) ;
    public final void rule__OperationBasic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3261:1: ( ( ( rule__OperationBasic__Group_1__0 )? ) )
            // InternalUSE.g:3262:1: ( ( rule__OperationBasic__Group_1__0 )? )
            {
            // InternalUSE.g:3262:1: ( ( rule__OperationBasic__Group_1__0 )? )
            // InternalUSE.g:3263:2: ( rule__OperationBasic__Group_1__0 )?
            {
             before(grammarAccess.getOperationBasicAccess().getGroup_1()); 
            // InternalUSE.g:3264:2: ( rule__OperationBasic__Group_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==36) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalUSE.g:3264:3: rule__OperationBasic__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OperationBasic__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationBasicAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationBasic__Group__1__Impl"


    // $ANTLR start "rule__OperationBasic__Group__2"
    // InternalUSE.g:3272:1: rule__OperationBasic__Group__2 : rule__OperationBasic__Group__2__Impl ;
    public final void rule__OperationBasic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3276:1: ( rule__OperationBasic__Group__2__Impl )
            // InternalUSE.g:3277:2: rule__OperationBasic__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationBasic__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationBasic__Group__2"


    // $ANTLR start "rule__OperationBasic__Group__2__Impl"
    // InternalUSE.g:3283:1: rule__OperationBasic__Group__2__Impl : ( ( rule__OperationBasic__ConditionsAssignment_2 )* ) ;
    public final void rule__OperationBasic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3287:1: ( ( ( rule__OperationBasic__ConditionsAssignment_2 )* ) )
            // InternalUSE.g:3288:1: ( ( rule__OperationBasic__ConditionsAssignment_2 )* )
            {
            // InternalUSE.g:3288:1: ( ( rule__OperationBasic__ConditionsAssignment_2 )* )
            // InternalUSE.g:3289:2: ( rule__OperationBasic__ConditionsAssignment_2 )*
            {
             before(grammarAccess.getOperationBasicAccess().getConditionsAssignment_2()); 
            // InternalUSE.g:3290:2: ( rule__OperationBasic__ConditionsAssignment_2 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=44 && LA42_0<=45)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalUSE.g:3290:3: rule__OperationBasic__ConditionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__OperationBasic__ConditionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getOperationBasicAccess().getConditionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationBasic__Group__2__Impl"


    // $ANTLR start "rule__OperationBasic__Group_1__0"
    // InternalUSE.g:3299:1: rule__OperationBasic__Group_1__0 : rule__OperationBasic__Group_1__0__Impl rule__OperationBasic__Group_1__1 ;
    public final void rule__OperationBasic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3303:1: ( rule__OperationBasic__Group_1__0__Impl rule__OperationBasic__Group_1__1 )
            // InternalUSE.g:3304:2: rule__OperationBasic__Group_1__0__Impl rule__OperationBasic__Group_1__1
            {
            pushFollow(FOLLOW_29);
            rule__OperationBasic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationBasic__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationBasic__Group_1__0"


    // $ANTLR start "rule__OperationBasic__Group_1__0__Impl"
    // InternalUSE.g:3311:1: rule__OperationBasic__Group_1__0__Impl : ( '=' ) ;
    public final void rule__OperationBasic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3315:1: ( ( '=' ) )
            // InternalUSE.g:3316:1: ( '=' )
            {
            // InternalUSE.g:3316:1: ( '=' )
            // InternalUSE.g:3317:2: '='
            {
             before(grammarAccess.getOperationBasicAccess().getEqualsSignKeyword_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getOperationBasicAccess().getEqualsSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationBasic__Group_1__0__Impl"


    // $ANTLR start "rule__OperationBasic__Group_1__1"
    // InternalUSE.g:3326:1: rule__OperationBasic__Group_1__1 : rule__OperationBasic__Group_1__1__Impl ;
    public final void rule__OperationBasic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3330:1: ( rule__OperationBasic__Group_1__1__Impl )
            // InternalUSE.g:3331:2: rule__OperationBasic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationBasic__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationBasic__Group_1__1"


    // $ANTLR start "rule__OperationBasic__Group_1__1__Impl"
    // InternalUSE.g:3337:1: rule__OperationBasic__Group_1__1__Impl : ( ( rule__OperationBasic__OclexpressionAssignment_1_1 ) ) ;
    public final void rule__OperationBasic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3341:1: ( ( ( rule__OperationBasic__OclexpressionAssignment_1_1 ) ) )
            // InternalUSE.g:3342:1: ( ( rule__OperationBasic__OclexpressionAssignment_1_1 ) )
            {
            // InternalUSE.g:3342:1: ( ( rule__OperationBasic__OclexpressionAssignment_1_1 ) )
            // InternalUSE.g:3343:2: ( rule__OperationBasic__OclexpressionAssignment_1_1 )
            {
             before(grammarAccess.getOperationBasicAccess().getOclexpressionAssignment_1_1()); 
            // InternalUSE.g:3344:2: ( rule__OperationBasic__OclexpressionAssignment_1_1 )
            // InternalUSE.g:3344:3: rule__OperationBasic__OclexpressionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OperationBasic__OclexpressionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationBasicAccess().getOclexpressionAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationBasic__Group_1__1__Impl"


    // $ANTLR start "rule__OperationComplex__Group__0"
    // InternalUSE.g:3353:1: rule__OperationComplex__Group__0 : rule__OperationComplex__Group__0__Impl rule__OperationComplex__Group__1 ;
    public final void rule__OperationComplex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3357:1: ( rule__OperationComplex__Group__0__Impl rule__OperationComplex__Group__1 )
            // InternalUSE.g:3358:2: rule__OperationComplex__Group__0__Impl rule__OperationComplex__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__OperationComplex__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationComplex__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationComplex__Group__0"


    // $ANTLR start "rule__OperationComplex__Group__0__Impl"
    // InternalUSE.g:3365:1: rule__OperationComplex__Group__0__Impl : ( ruleOperationDeclaration ) ;
    public final void rule__OperationComplex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3369:1: ( ( ruleOperationDeclaration ) )
            // InternalUSE.g:3370:1: ( ruleOperationDeclaration )
            {
            // InternalUSE.g:3370:1: ( ruleOperationDeclaration )
            // InternalUSE.g:3371:2: ruleOperationDeclaration
            {
             before(grammarAccess.getOperationComplexAccess().getOperationDeclarationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationDeclaration();

            state._fsp--;

             after(grammarAccess.getOperationComplexAccess().getOperationDeclarationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationComplex__Group__0__Impl"


    // $ANTLR start "rule__OperationComplex__Group__1"
    // InternalUSE.g:3380:1: rule__OperationComplex__Group__1 : rule__OperationComplex__Group__1__Impl rule__OperationComplex__Group__2 ;
    public final void rule__OperationComplex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3384:1: ( rule__OperationComplex__Group__1__Impl rule__OperationComplex__Group__2 )
            // InternalUSE.g:3385:2: rule__OperationComplex__Group__1__Impl rule__OperationComplex__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__OperationComplex__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationComplex__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationComplex__Group__1"


    // $ANTLR start "rule__OperationComplex__Group__1__Impl"
    // InternalUSE.g:3392:1: rule__OperationComplex__Group__1__Impl : ( 'begin' ) ;
    public final void rule__OperationComplex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3396:1: ( ( 'begin' ) )
            // InternalUSE.g:3397:1: ( 'begin' )
            {
            // InternalUSE.g:3397:1: ( 'begin' )
            // InternalUSE.g:3398:2: 'begin'
            {
             before(grammarAccess.getOperationComplexAccess().getBeginKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getOperationComplexAccess().getBeginKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationComplex__Group__1__Impl"


    // $ANTLR start "rule__OperationComplex__Group__2"
    // InternalUSE.g:3407:1: rule__OperationComplex__Group__2 : rule__OperationComplex__Group__2__Impl rule__OperationComplex__Group__3 ;
    public final void rule__OperationComplex__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3411:1: ( rule__OperationComplex__Group__2__Impl rule__OperationComplex__Group__3 )
            // InternalUSE.g:3412:2: rule__OperationComplex__Group__2__Impl rule__OperationComplex__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__OperationComplex__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationComplex__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationComplex__Group__2"


    // $ANTLR start "rule__OperationComplex__Group__2__Impl"
    // InternalUSE.g:3419:1: rule__OperationComplex__Group__2__Impl : ( ( rule__OperationComplex__OperationbodyAssignment_2 )? ) ;
    public final void rule__OperationComplex__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3423:1: ( ( ( rule__OperationComplex__OperationbodyAssignment_2 )? ) )
            // InternalUSE.g:3424:1: ( ( rule__OperationComplex__OperationbodyAssignment_2 )? )
            {
            // InternalUSE.g:3424:1: ( ( rule__OperationComplex__OperationbodyAssignment_2 )? )
            // InternalUSE.g:3425:2: ( rule__OperationComplex__OperationbodyAssignment_2 )?
            {
             before(grammarAccess.getOperationComplexAccess().getOperationbodyAssignment_2()); 
            // InternalUSE.g:3426:2: ( rule__OperationComplex__OperationbodyAssignment_2 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_STRING) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalUSE.g:3426:3: rule__OperationComplex__OperationbodyAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__OperationComplex__OperationbodyAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationComplexAccess().getOperationbodyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationComplex__Group__2__Impl"


    // $ANTLR start "rule__OperationComplex__Group__3"
    // InternalUSE.g:3434:1: rule__OperationComplex__Group__3 : rule__OperationComplex__Group__3__Impl rule__OperationComplex__Group__4 ;
    public final void rule__OperationComplex__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3438:1: ( rule__OperationComplex__Group__3__Impl rule__OperationComplex__Group__4 )
            // InternalUSE.g:3439:2: rule__OperationComplex__Group__3__Impl rule__OperationComplex__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__OperationComplex__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationComplex__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationComplex__Group__3"


    // $ANTLR start "rule__OperationComplex__Group__3__Impl"
    // InternalUSE.g:3446:1: rule__OperationComplex__Group__3__Impl : ( 'end' ) ;
    public final void rule__OperationComplex__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3450:1: ( ( 'end' ) )
            // InternalUSE.g:3451:1: ( 'end' )
            {
            // InternalUSE.g:3451:1: ( 'end' )
            // InternalUSE.g:3452:2: 'end'
            {
             before(grammarAccess.getOperationComplexAccess().getEndKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getOperationComplexAccess().getEndKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationComplex__Group__3__Impl"


    // $ANTLR start "rule__OperationComplex__Group__4"
    // InternalUSE.g:3461:1: rule__OperationComplex__Group__4 : rule__OperationComplex__Group__4__Impl ;
    public final void rule__OperationComplex__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3465:1: ( rule__OperationComplex__Group__4__Impl )
            // InternalUSE.g:3466:2: rule__OperationComplex__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationComplex__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationComplex__Group__4"


    // $ANTLR start "rule__OperationComplex__Group__4__Impl"
    // InternalUSE.g:3472:1: rule__OperationComplex__Group__4__Impl : ( ( rule__OperationComplex__ConditionsAssignment_4 )* ) ;
    public final void rule__OperationComplex__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3476:1: ( ( ( rule__OperationComplex__ConditionsAssignment_4 )* ) )
            // InternalUSE.g:3477:1: ( ( rule__OperationComplex__ConditionsAssignment_4 )* )
            {
            // InternalUSE.g:3477:1: ( ( rule__OperationComplex__ConditionsAssignment_4 )* )
            // InternalUSE.g:3478:2: ( rule__OperationComplex__ConditionsAssignment_4 )*
            {
             before(grammarAccess.getOperationComplexAccess().getConditionsAssignment_4()); 
            // InternalUSE.g:3479:2: ( rule__OperationComplex__ConditionsAssignment_4 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=44 && LA44_0<=45)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalUSE.g:3479:3: rule__OperationComplex__ConditionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__OperationComplex__ConditionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getOperationComplexAccess().getConditionsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationComplex__Group__4__Impl"


    // $ANTLR start "rule__OperationDeclaration__Group__0"
    // InternalUSE.g:3488:1: rule__OperationDeclaration__Group__0 : rule__OperationDeclaration__Group__0__Impl rule__OperationDeclaration__Group__1 ;
    public final void rule__OperationDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3492:1: ( rule__OperationDeclaration__Group__0__Impl rule__OperationDeclaration__Group__1 )
            // InternalUSE.g:3493:2: rule__OperationDeclaration__Group__0__Impl rule__OperationDeclaration__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__OperationDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__Group__0"


    // $ANTLR start "rule__OperationDeclaration__Group__0__Impl"
    // InternalUSE.g:3500:1: rule__OperationDeclaration__Group__0__Impl : ( ( rule__OperationDeclaration__NameAssignment_0 ) ) ;
    public final void rule__OperationDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3504:1: ( ( ( rule__OperationDeclaration__NameAssignment_0 ) ) )
            // InternalUSE.g:3505:1: ( ( rule__OperationDeclaration__NameAssignment_0 ) )
            {
            // InternalUSE.g:3505:1: ( ( rule__OperationDeclaration__NameAssignment_0 ) )
            // InternalUSE.g:3506:2: ( rule__OperationDeclaration__NameAssignment_0 )
            {
             before(grammarAccess.getOperationDeclarationAccess().getNameAssignment_0()); 
            // InternalUSE.g:3507:2: ( rule__OperationDeclaration__NameAssignment_0 )
            // InternalUSE.g:3507:3: rule__OperationDeclaration__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__OperationDeclaration__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOperationDeclarationAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__Group__0__Impl"


    // $ANTLR start "rule__OperationDeclaration__Group__1"
    // InternalUSE.g:3515:1: rule__OperationDeclaration__Group__1 : rule__OperationDeclaration__Group__1__Impl rule__OperationDeclaration__Group__2 ;
    public final void rule__OperationDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3519:1: ( rule__OperationDeclaration__Group__1__Impl rule__OperationDeclaration__Group__2 )
            // InternalUSE.g:3520:2: rule__OperationDeclaration__Group__1__Impl rule__OperationDeclaration__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__OperationDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__Group__1"


    // $ANTLR start "rule__OperationDeclaration__Group__1__Impl"
    // InternalUSE.g:3527:1: rule__OperationDeclaration__Group__1__Impl : ( '(' ) ;
    public final void rule__OperationDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3531:1: ( ( '(' ) )
            // InternalUSE.g:3532:1: ( '(' )
            {
            // InternalUSE.g:3532:1: ( '(' )
            // InternalUSE.g:3533:2: '('
            {
             before(grammarAccess.getOperationDeclarationAccess().getLeftParenthesisKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getOperationDeclarationAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__Group__1__Impl"


    // $ANTLR start "rule__OperationDeclaration__Group__2"
    // InternalUSE.g:3542:1: rule__OperationDeclaration__Group__2 : rule__OperationDeclaration__Group__2__Impl rule__OperationDeclaration__Group__3 ;
    public final void rule__OperationDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3546:1: ( rule__OperationDeclaration__Group__2__Impl rule__OperationDeclaration__Group__3 )
            // InternalUSE.g:3547:2: rule__OperationDeclaration__Group__2__Impl rule__OperationDeclaration__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__OperationDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__Group__2"


    // $ANTLR start "rule__OperationDeclaration__Group__2__Impl"
    // InternalUSE.g:3554:1: rule__OperationDeclaration__Group__2__Impl : ( ( rule__OperationDeclaration__OwnedParameterAssignment_2 )* ) ;
    public final void rule__OperationDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3558:1: ( ( ( rule__OperationDeclaration__OwnedParameterAssignment_2 )* ) )
            // InternalUSE.g:3559:1: ( ( rule__OperationDeclaration__OwnedParameterAssignment_2 )* )
            {
            // InternalUSE.g:3559:1: ( ( rule__OperationDeclaration__OwnedParameterAssignment_2 )* )
            // InternalUSE.g:3560:2: ( rule__OperationDeclaration__OwnedParameterAssignment_2 )*
            {
             before(grammarAccess.getOperationDeclarationAccess().getOwnedParameterAssignment_2()); 
            // InternalUSE.g:3561:2: ( rule__OperationDeclaration__OwnedParameterAssignment_2 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_ID) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalUSE.g:3561:3: rule__OperationDeclaration__OwnedParameterAssignment_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__OperationDeclaration__OwnedParameterAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getOperationDeclarationAccess().getOwnedParameterAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__Group__2__Impl"


    // $ANTLR start "rule__OperationDeclaration__Group__3"
    // InternalUSE.g:3569:1: rule__OperationDeclaration__Group__3 : rule__OperationDeclaration__Group__3__Impl rule__OperationDeclaration__Group__4 ;
    public final void rule__OperationDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3573:1: ( rule__OperationDeclaration__Group__3__Impl rule__OperationDeclaration__Group__4 )
            // InternalUSE.g:3574:2: rule__OperationDeclaration__Group__3__Impl rule__OperationDeclaration__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__OperationDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__Group__3"


    // $ANTLR start "rule__OperationDeclaration__Group__3__Impl"
    // InternalUSE.g:3581:1: rule__OperationDeclaration__Group__3__Impl : ( ')' ) ;
    public final void rule__OperationDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3585:1: ( ( ')' ) )
            // InternalUSE.g:3586:1: ( ')' )
            {
            // InternalUSE.g:3586:1: ( ')' )
            // InternalUSE.g:3587:2: ')'
            {
             before(grammarAccess.getOperationDeclarationAccess().getRightParenthesisKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getOperationDeclarationAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__Group__3__Impl"


    // $ANTLR start "rule__OperationDeclaration__Group__4"
    // InternalUSE.g:3596:1: rule__OperationDeclaration__Group__4 : rule__OperationDeclaration__Group__4__Impl ;
    public final void rule__OperationDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3600:1: ( rule__OperationDeclaration__Group__4__Impl )
            // InternalUSE.g:3601:2: rule__OperationDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationDeclaration__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__Group__4"


    // $ANTLR start "rule__OperationDeclaration__Group__4__Impl"
    // InternalUSE.g:3607:1: rule__OperationDeclaration__Group__4__Impl : ( ( rule__OperationDeclaration__Group_4__0 )? ) ;
    public final void rule__OperationDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3611:1: ( ( ( rule__OperationDeclaration__Group_4__0 )? ) )
            // InternalUSE.g:3612:1: ( ( rule__OperationDeclaration__Group_4__0 )? )
            {
            // InternalUSE.g:3612:1: ( ( rule__OperationDeclaration__Group_4__0 )? )
            // InternalUSE.g:3613:2: ( rule__OperationDeclaration__Group_4__0 )?
            {
             before(grammarAccess.getOperationDeclarationAccess().getGroup_4()); 
            // InternalUSE.g:3614:2: ( rule__OperationDeclaration__Group_4__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==35) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalUSE.g:3614:3: rule__OperationDeclaration__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OperationDeclaration__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationDeclarationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__Group__4__Impl"


    // $ANTLR start "rule__OperationDeclaration__Group_4__0"
    // InternalUSE.g:3623:1: rule__OperationDeclaration__Group_4__0 : rule__OperationDeclaration__Group_4__0__Impl rule__OperationDeclaration__Group_4__1 ;
    public final void rule__OperationDeclaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3627:1: ( rule__OperationDeclaration__Group_4__0__Impl rule__OperationDeclaration__Group_4__1 )
            // InternalUSE.g:3628:2: rule__OperationDeclaration__Group_4__0__Impl rule__OperationDeclaration__Group_4__1
            {
            pushFollow(FOLLOW_26);
            rule__OperationDeclaration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDeclaration__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__Group_4__0"


    // $ANTLR start "rule__OperationDeclaration__Group_4__0__Impl"
    // InternalUSE.g:3635:1: rule__OperationDeclaration__Group_4__0__Impl : ( ':' ) ;
    public final void rule__OperationDeclaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3639:1: ( ( ':' ) )
            // InternalUSE.g:3640:1: ( ':' )
            {
            // InternalUSE.g:3640:1: ( ':' )
            // InternalUSE.g:3641:2: ':'
            {
             before(grammarAccess.getOperationDeclarationAccess().getColonKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getOperationDeclarationAccess().getColonKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__Group_4__0__Impl"


    // $ANTLR start "rule__OperationDeclaration__Group_4__1"
    // InternalUSE.g:3650:1: rule__OperationDeclaration__Group_4__1 : rule__OperationDeclaration__Group_4__1__Impl ;
    public final void rule__OperationDeclaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3654:1: ( rule__OperationDeclaration__Group_4__1__Impl )
            // InternalUSE.g:3655:2: rule__OperationDeclaration__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationDeclaration__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__Group_4__1"


    // $ANTLR start "rule__OperationDeclaration__Group_4__1__Impl"
    // InternalUSE.g:3661:1: rule__OperationDeclaration__Group_4__1__Impl : ( ( rule__OperationDeclaration__ReturnTypeAssignment_4_1 ) ) ;
    public final void rule__OperationDeclaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3665:1: ( ( ( rule__OperationDeclaration__ReturnTypeAssignment_4_1 ) ) )
            // InternalUSE.g:3666:1: ( ( rule__OperationDeclaration__ReturnTypeAssignment_4_1 ) )
            {
            // InternalUSE.g:3666:1: ( ( rule__OperationDeclaration__ReturnTypeAssignment_4_1 ) )
            // InternalUSE.g:3667:2: ( rule__OperationDeclaration__ReturnTypeAssignment_4_1 )
            {
             before(grammarAccess.getOperationDeclarationAccess().getReturnTypeAssignment_4_1()); 
            // InternalUSE.g:3668:2: ( rule__OperationDeclaration__ReturnTypeAssignment_4_1 )
            // InternalUSE.g:3668:3: rule__OperationDeclaration__ReturnTypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__OperationDeclaration__ReturnTypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationDeclarationAccess().getReturnTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__Group_4__1__Impl"


    // $ANTLR start "rule__OwnedParameter__Group__0"
    // InternalUSE.g:3677:1: rule__OwnedParameter__Group__0 : rule__OwnedParameter__Group__0__Impl rule__OwnedParameter__Group__1 ;
    public final void rule__OwnedParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3681:1: ( rule__OwnedParameter__Group__0__Impl rule__OwnedParameter__Group__1 )
            // InternalUSE.g:3682:2: rule__OwnedParameter__Group__0__Impl rule__OwnedParameter__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__OwnedParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OwnedParameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OwnedParameter__Group__0"


    // $ANTLR start "rule__OwnedParameter__Group__0__Impl"
    // InternalUSE.g:3689:1: rule__OwnedParameter__Group__0__Impl : ( ruleAttribute ) ;
    public final void rule__OwnedParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3693:1: ( ( ruleAttribute ) )
            // InternalUSE.g:3694:1: ( ruleAttribute )
            {
            // InternalUSE.g:3694:1: ( ruleAttribute )
            // InternalUSE.g:3695:2: ruleAttribute
            {
             before(grammarAccess.getOwnedParameterAccess().getAttributeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getOwnedParameterAccess().getAttributeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OwnedParameter__Group__0__Impl"


    // $ANTLR start "rule__OwnedParameter__Group__1"
    // InternalUSE.g:3704:1: rule__OwnedParameter__Group__1 : rule__OwnedParameter__Group__1__Impl ;
    public final void rule__OwnedParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3708:1: ( rule__OwnedParameter__Group__1__Impl )
            // InternalUSE.g:3709:2: rule__OwnedParameter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OwnedParameter__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OwnedParameter__Group__1"


    // $ANTLR start "rule__OwnedParameter__Group__1__Impl"
    // InternalUSE.g:3715:1: rule__OwnedParameter__Group__1__Impl : ( ( ',' )? ) ;
    public final void rule__OwnedParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3719:1: ( ( ( ',' )? ) )
            // InternalUSE.g:3720:1: ( ( ',' )? )
            {
            // InternalUSE.g:3720:1: ( ( ',' )? )
            // InternalUSE.g:3721:2: ( ',' )?
            {
             before(grammarAccess.getOwnedParameterAccess().getCommaKeyword_1()); 
            // InternalUSE.g:3722:2: ( ',' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==19) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalUSE.g:3722:3: ','
                    {
                    match(input,19,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getOwnedParameterAccess().getCommaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OwnedParameter__Group__1__Impl"


    // $ANTLR start "rule__ConstraintsBase__Group__0"
    // InternalUSE.g:3731:1: rule__ConstraintsBase__Group__0 : rule__ConstraintsBase__Group__0__Impl rule__ConstraintsBase__Group__1 ;
    public final void rule__ConstraintsBase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3735:1: ( rule__ConstraintsBase__Group__0__Impl rule__ConstraintsBase__Group__1 )
            // InternalUSE.g:3736:2: rule__ConstraintsBase__Group__0__Impl rule__ConstraintsBase__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__ConstraintsBase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintsBase__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintsBase__Group__0"


    // $ANTLR start "rule__ConstraintsBase__Group__0__Impl"
    // InternalUSE.g:3743:1: rule__ConstraintsBase__Group__0__Impl : ( 'constraints' ) ;
    public final void rule__ConstraintsBase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3747:1: ( ( 'constraints' ) )
            // InternalUSE.g:3748:1: ( 'constraints' )
            {
            // InternalUSE.g:3748:1: ( 'constraints' )
            // InternalUSE.g:3749:2: 'constraints'
            {
             before(grammarAccess.getConstraintsBaseAccess().getConstraintsKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getConstraintsBaseAccess().getConstraintsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintsBase__Group__0__Impl"


    // $ANTLR start "rule__ConstraintsBase__Group__1"
    // InternalUSE.g:3758:1: rule__ConstraintsBase__Group__1 : rule__ConstraintsBase__Group__1__Impl ;
    public final void rule__ConstraintsBase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3762:1: ( rule__ConstraintsBase__Group__1__Impl )
            // InternalUSE.g:3763:2: rule__ConstraintsBase__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintsBase__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintsBase__Group__1"


    // $ANTLR start "rule__ConstraintsBase__Group__1__Impl"
    // InternalUSE.g:3769:1: rule__ConstraintsBase__Group__1__Impl : ( ( rule__ConstraintsBase__InvariantsAssignment_1 )* ) ;
    public final void rule__ConstraintsBase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3773:1: ( ( ( rule__ConstraintsBase__InvariantsAssignment_1 )* ) )
            // InternalUSE.g:3774:1: ( ( rule__ConstraintsBase__InvariantsAssignment_1 )* )
            {
            // InternalUSE.g:3774:1: ( ( rule__ConstraintsBase__InvariantsAssignment_1 )* )
            // InternalUSE.g:3775:2: ( rule__ConstraintsBase__InvariantsAssignment_1 )*
            {
             before(grammarAccess.getConstraintsBaseAccess().getInvariantsAssignment_1()); 
            // InternalUSE.g:3776:2: ( rule__ConstraintsBase__InvariantsAssignment_1 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==42) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalUSE.g:3776:3: rule__ConstraintsBase__InvariantsAssignment_1
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__ConstraintsBase__InvariantsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getConstraintsBaseAccess().getInvariantsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintsBase__Group__1__Impl"


    // $ANTLR start "rule__ConstrainsGeneral__Group__0"
    // InternalUSE.g:3785:1: rule__ConstrainsGeneral__Group__0 : rule__ConstrainsGeneral__Group__0__Impl rule__ConstrainsGeneral__Group__1 ;
    public final void rule__ConstrainsGeneral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3789:1: ( rule__ConstrainsGeneral__Group__0__Impl rule__ConstrainsGeneral__Group__1 )
            // InternalUSE.g:3790:2: rule__ConstrainsGeneral__Group__0__Impl rule__ConstrainsGeneral__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__ConstrainsGeneral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstrainsGeneral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstrainsGeneral__Group__0"


    // $ANTLR start "rule__ConstrainsGeneral__Group__0__Impl"
    // InternalUSE.g:3797:1: rule__ConstrainsGeneral__Group__0__Impl : ( 'constraints' ) ;
    public final void rule__ConstrainsGeneral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3801:1: ( ( 'constraints' ) )
            // InternalUSE.g:3802:1: ( 'constraints' )
            {
            // InternalUSE.g:3802:1: ( 'constraints' )
            // InternalUSE.g:3803:2: 'constraints'
            {
             before(grammarAccess.getConstrainsGeneralAccess().getConstraintsKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getConstrainsGeneralAccess().getConstraintsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstrainsGeneral__Group__0__Impl"


    // $ANTLR start "rule__ConstrainsGeneral__Group__1"
    // InternalUSE.g:3812:1: rule__ConstrainsGeneral__Group__1 : rule__ConstrainsGeneral__Group__1__Impl ;
    public final void rule__ConstrainsGeneral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3816:1: ( rule__ConstrainsGeneral__Group__1__Impl )
            // InternalUSE.g:3817:2: rule__ConstrainsGeneral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstrainsGeneral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstrainsGeneral__Group__1"


    // $ANTLR start "rule__ConstrainsGeneral__Group__1__Impl"
    // InternalUSE.g:3823:1: rule__ConstrainsGeneral__Group__1__Impl : ( ( rule__ConstrainsGeneral__ContextsAssignment_1 )* ) ;
    public final void rule__ConstrainsGeneral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3827:1: ( ( ( rule__ConstrainsGeneral__ContextsAssignment_1 )* ) )
            // InternalUSE.g:3828:1: ( ( rule__ConstrainsGeneral__ContextsAssignment_1 )* )
            {
            // InternalUSE.g:3828:1: ( ( rule__ConstrainsGeneral__ContextsAssignment_1 )* )
            // InternalUSE.g:3829:2: ( rule__ConstrainsGeneral__ContextsAssignment_1 )*
            {
             before(grammarAccess.getConstrainsGeneralAccess().getContextsAssignment_1()); 
            // InternalUSE.g:3830:2: ( rule__ConstrainsGeneral__ContextsAssignment_1 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==41) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalUSE.g:3830:3: rule__ConstrainsGeneral__ContextsAssignment_1
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__ConstrainsGeneral__ContextsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getConstrainsGeneralAccess().getContextsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstrainsGeneral__Group__1__Impl"


    // $ANTLR start "rule__InvariantContext__Group__0"
    // InternalUSE.g:3839:1: rule__InvariantContext__Group__0 : rule__InvariantContext__Group__0__Impl rule__InvariantContext__Group__1 ;
    public final void rule__InvariantContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3843:1: ( rule__InvariantContext__Group__0__Impl rule__InvariantContext__Group__1 )
            // InternalUSE.g:3844:2: rule__InvariantContext__Group__0__Impl rule__InvariantContext__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__InvariantContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InvariantContext__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvariantContext__Group__0"


    // $ANTLR start "rule__InvariantContext__Group__0__Impl"
    // InternalUSE.g:3851:1: rule__InvariantContext__Group__0__Impl : ( 'context' ) ;
    public final void rule__InvariantContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3855:1: ( ( 'context' ) )
            // InternalUSE.g:3856:1: ( 'context' )
            {
            // InternalUSE.g:3856:1: ( 'context' )
            // InternalUSE.g:3857:2: 'context'
            {
             before(grammarAccess.getInvariantContextAccess().getContextKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getInvariantContextAccess().getContextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvariantContext__Group__0__Impl"


    // $ANTLR start "rule__InvariantContext__Group__1"
    // InternalUSE.g:3866:1: rule__InvariantContext__Group__1 : rule__InvariantContext__Group__1__Impl rule__InvariantContext__Group__2 ;
    public final void rule__InvariantContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3870:1: ( rule__InvariantContext__Group__1__Impl rule__InvariantContext__Group__2 )
            // InternalUSE.g:3871:2: rule__InvariantContext__Group__1__Impl rule__InvariantContext__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__InvariantContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InvariantContext__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvariantContext__Group__1"


    // $ANTLR start "rule__InvariantContext__Group__1__Impl"
    // InternalUSE.g:3878:1: rule__InvariantContext__Group__1__Impl : ( ( rule__InvariantContext__Group_1__0 )? ) ;
    public final void rule__InvariantContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3882:1: ( ( ( rule__InvariantContext__Group_1__0 )? ) )
            // InternalUSE.g:3883:1: ( ( rule__InvariantContext__Group_1__0 )? )
            {
            // InternalUSE.g:3883:1: ( ( rule__InvariantContext__Group_1__0 )? )
            // InternalUSE.g:3884:2: ( rule__InvariantContext__Group_1__0 )?
            {
             before(grammarAccess.getInvariantContextAccess().getGroup_1()); 
            // InternalUSE.g:3885:2: ( rule__InvariantContext__Group_1__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==35) ) {
                    alt50=1;
                }
            }
            switch (alt50) {
                case 1 :
                    // InternalUSE.g:3885:3: rule__InvariantContext__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InvariantContext__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInvariantContextAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvariantContext__Group__1__Impl"


    // $ANTLR start "rule__InvariantContext__Group__2"
    // InternalUSE.g:3893:1: rule__InvariantContext__Group__2 : rule__InvariantContext__Group__2__Impl rule__InvariantContext__Group__3 ;
    public final void rule__InvariantContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3897:1: ( rule__InvariantContext__Group__2__Impl rule__InvariantContext__Group__3 )
            // InternalUSE.g:3898:2: rule__InvariantContext__Group__2__Impl rule__InvariantContext__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__InvariantContext__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InvariantContext__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvariantContext__Group__2"


    // $ANTLR start "rule__InvariantContext__Group__2__Impl"
    // InternalUSE.g:3905:1: rule__InvariantContext__Group__2__Impl : ( ( rule__InvariantContext__ClassnameAssignment_2 ) ) ;
    public final void rule__InvariantContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3909:1: ( ( ( rule__InvariantContext__ClassnameAssignment_2 ) ) )
            // InternalUSE.g:3910:1: ( ( rule__InvariantContext__ClassnameAssignment_2 ) )
            {
            // InternalUSE.g:3910:1: ( ( rule__InvariantContext__ClassnameAssignment_2 ) )
            // InternalUSE.g:3911:2: ( rule__InvariantContext__ClassnameAssignment_2 )
            {
             before(grammarAccess.getInvariantContextAccess().getClassnameAssignment_2()); 
            // InternalUSE.g:3912:2: ( rule__InvariantContext__ClassnameAssignment_2 )
            // InternalUSE.g:3912:3: rule__InvariantContext__ClassnameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__InvariantContext__ClassnameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInvariantContextAccess().getClassnameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvariantContext__Group__2__Impl"


    // $ANTLR start "rule__InvariantContext__Group__3"
    // InternalUSE.g:3920:1: rule__InvariantContext__Group__3 : rule__InvariantContext__Group__3__Impl ;
    public final void rule__InvariantContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3924:1: ( rule__InvariantContext__Group__3__Impl )
            // InternalUSE.g:3925:2: rule__InvariantContext__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InvariantContext__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvariantContext__Group__3"


    // $ANTLR start "rule__InvariantContext__Group__3__Impl"
    // InternalUSE.g:3931:1: rule__InvariantContext__Group__3__Impl : ( ( rule__InvariantContext__InvariantsAssignment_3 )* ) ;
    public final void rule__InvariantContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3935:1: ( ( ( rule__InvariantContext__InvariantsAssignment_3 )* ) )
            // InternalUSE.g:3936:1: ( ( rule__InvariantContext__InvariantsAssignment_3 )* )
            {
            // InternalUSE.g:3936:1: ( ( rule__InvariantContext__InvariantsAssignment_3 )* )
            // InternalUSE.g:3937:2: ( rule__InvariantContext__InvariantsAssignment_3 )*
            {
             before(grammarAccess.getInvariantContextAccess().getInvariantsAssignment_3()); 
            // InternalUSE.g:3938:2: ( rule__InvariantContext__InvariantsAssignment_3 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==42) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalUSE.g:3938:3: rule__InvariantContext__InvariantsAssignment_3
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__InvariantContext__InvariantsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

             after(grammarAccess.getInvariantContextAccess().getInvariantsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvariantContext__Group__3__Impl"


    // $ANTLR start "rule__InvariantContext__Group_1__0"
    // InternalUSE.g:3947:1: rule__InvariantContext__Group_1__0 : rule__InvariantContext__Group_1__0__Impl rule__InvariantContext__Group_1__1 ;
    public final void rule__InvariantContext__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3951:1: ( rule__InvariantContext__Group_1__0__Impl rule__InvariantContext__Group_1__1 )
            // InternalUSE.g:3952:2: rule__InvariantContext__Group_1__0__Impl rule__InvariantContext__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__InvariantContext__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InvariantContext__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvariantContext__Group_1__0"


    // $ANTLR start "rule__InvariantContext__Group_1__0__Impl"
    // InternalUSE.g:3959:1: rule__InvariantContext__Group_1__0__Impl : ( ( rule__InvariantContext__VariablenameAssignment_1_0 ) ) ;
    public final void rule__InvariantContext__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3963:1: ( ( ( rule__InvariantContext__VariablenameAssignment_1_0 ) ) )
            // InternalUSE.g:3964:1: ( ( rule__InvariantContext__VariablenameAssignment_1_0 ) )
            {
            // InternalUSE.g:3964:1: ( ( rule__InvariantContext__VariablenameAssignment_1_0 ) )
            // InternalUSE.g:3965:2: ( rule__InvariantContext__VariablenameAssignment_1_0 )
            {
             before(grammarAccess.getInvariantContextAccess().getVariablenameAssignment_1_0()); 
            // InternalUSE.g:3966:2: ( rule__InvariantContext__VariablenameAssignment_1_0 )
            // InternalUSE.g:3966:3: rule__InvariantContext__VariablenameAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__InvariantContext__VariablenameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getInvariantContextAccess().getVariablenameAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvariantContext__Group_1__0__Impl"


    // $ANTLR start "rule__InvariantContext__Group_1__1"
    // InternalUSE.g:3974:1: rule__InvariantContext__Group_1__1 : rule__InvariantContext__Group_1__1__Impl ;
    public final void rule__InvariantContext__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3978:1: ( rule__InvariantContext__Group_1__1__Impl )
            // InternalUSE.g:3979:2: rule__InvariantContext__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InvariantContext__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvariantContext__Group_1__1"


    // $ANTLR start "rule__InvariantContext__Group_1__1__Impl"
    // InternalUSE.g:3985:1: rule__InvariantContext__Group_1__1__Impl : ( ':' ) ;
    public final void rule__InvariantContext__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3989:1: ( ( ':' ) )
            // InternalUSE.g:3990:1: ( ':' )
            {
            // InternalUSE.g:3990:1: ( ':' )
            // InternalUSE.g:3991:2: ':'
            {
             before(grammarAccess.getInvariantContextAccess().getColonKeyword_1_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getInvariantContextAccess().getColonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvariantContext__Group_1__1__Impl"


    // $ANTLR start "rule__InvariantDefinition__Group__0"
    // InternalUSE.g:4001:1: rule__InvariantDefinition__Group__0 : rule__InvariantDefinition__Group__0__Impl rule__InvariantDefinition__Group__1 ;
    public final void rule__InvariantDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4005:1: ( rule__InvariantDefinition__Group__0__Impl rule__InvariantDefinition__Group__1 )
            // InternalUSE.g:4006:2: rule__InvariantDefinition__Group__0__Impl rule__InvariantDefinition__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__InvariantDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InvariantDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvariantDefinition__Group__0"


    // $ANTLR start "rule__InvariantDefinition__Group__0__Impl"
    // InternalUSE.g:4013:1: rule__InvariantDefinition__Group__0__Impl : ( 'inv' ) ;
    public final void rule__InvariantDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4017:1: ( ( 'inv' ) )
            // InternalUSE.g:4018:1: ( 'inv' )
            {
            // InternalUSE.g:4018:1: ( 'inv' )
            // InternalUSE.g:4019:2: 'inv'
            {
             before(grammarAccess.getInvariantDefinitionAccess().getInvKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getInvariantDefinitionAccess().getInvKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvariantDefinition__Group__0__Impl"


    // $ANTLR start "rule__InvariantDefinition__Group__1"
    // InternalUSE.g:4028:1: rule__InvariantDefinition__Group__1 : rule__InvariantDefinition__Group__1__Impl rule__InvariantDefinition__Group__2 ;
    public final void rule__InvariantDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4032:1: ( rule__InvariantDefinition__Group__1__Impl rule__InvariantDefinition__Group__2 )
            // InternalUSE.g:4033:2: rule__InvariantDefinition__Group__1__Impl rule__InvariantDefinition__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__InvariantDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InvariantDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvariantDefinition__Group__1"


    // $ANTLR start "rule__InvariantDefinition__Group__1__Impl"
    // InternalUSE.g:4040:1: rule__InvariantDefinition__Group__1__Impl : ( ( rule__InvariantDefinition__NameAssignment_1 )? ) ;
    public final void rule__InvariantDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4044:1: ( ( ( rule__InvariantDefinition__NameAssignment_1 )? ) )
            // InternalUSE.g:4045:1: ( ( rule__InvariantDefinition__NameAssignment_1 )? )
            {
            // InternalUSE.g:4045:1: ( ( rule__InvariantDefinition__NameAssignment_1 )? )
            // InternalUSE.g:4046:2: ( rule__InvariantDefinition__NameAssignment_1 )?
            {
             before(grammarAccess.getInvariantDefinitionAccess().getNameAssignment_1()); 
            // InternalUSE.g:4047:2: ( rule__InvariantDefinition__NameAssignment_1 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalUSE.g:4047:3: rule__InvariantDefinition__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__InvariantDefinition__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInvariantDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvariantDefinition__Group__1__Impl"


    // $ANTLR start "rule__InvariantDefinition__Group__2"
    // InternalUSE.g:4055:1: rule__InvariantDefinition__Group__2 : rule__InvariantDefinition__Group__2__Impl rule__InvariantDefinition__Group__3 ;
    public final void rule__InvariantDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4059:1: ( rule__InvariantDefinition__Group__2__Impl rule__InvariantDefinition__Group__3 )
            // InternalUSE.g:4060:2: rule__InvariantDefinition__Group__2__Impl rule__InvariantDefinition__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__InvariantDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InvariantDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvariantDefinition__Group__2"


    // $ANTLR start "rule__InvariantDefinition__Group__2__Impl"
    // InternalUSE.g:4067:1: rule__InvariantDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__InvariantDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4071:1: ( ( ':' ) )
            // InternalUSE.g:4072:1: ( ':' )
            {
            // InternalUSE.g:4072:1: ( ':' )
            // InternalUSE.g:4073:2: ':'
            {
             before(grammarAccess.getInvariantDefinitionAccess().getColonKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getInvariantDefinitionAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvariantDefinition__Group__2__Impl"


    // $ANTLR start "rule__InvariantDefinition__Group__3"
    // InternalUSE.g:4082:1: rule__InvariantDefinition__Group__3 : rule__InvariantDefinition__Group__3__Impl ;
    public final void rule__InvariantDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4086:1: ( rule__InvariantDefinition__Group__3__Impl )
            // InternalUSE.g:4087:2: rule__InvariantDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InvariantDefinition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvariantDefinition__Group__3"


    // $ANTLR start "rule__InvariantDefinition__Group__3__Impl"
    // InternalUSE.g:4093:1: rule__InvariantDefinition__Group__3__Impl : ( ( rule__InvariantDefinition__OclExpressionAssignment_3 ) ) ;
    public final void rule__InvariantDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4097:1: ( ( ( rule__InvariantDefinition__OclExpressionAssignment_3 ) ) )
            // InternalUSE.g:4098:1: ( ( rule__InvariantDefinition__OclExpressionAssignment_3 ) )
            {
            // InternalUSE.g:4098:1: ( ( rule__InvariantDefinition__OclExpressionAssignment_3 ) )
            // InternalUSE.g:4099:2: ( rule__InvariantDefinition__OclExpressionAssignment_3 )
            {
             before(grammarAccess.getInvariantDefinitionAccess().getOclExpressionAssignment_3()); 
            // InternalUSE.g:4100:2: ( rule__InvariantDefinition__OclExpressionAssignment_3 )
            // InternalUSE.g:4100:3: rule__InvariantDefinition__OclExpressionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__InvariantDefinition__OclExpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInvariantDefinitionAccess().getOclExpressionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvariantDefinition__Group__3__Impl"


    // $ANTLR start "rule__OperationContext__Group__0"
    // InternalUSE.g:4109:1: rule__OperationContext__Group__0 : rule__OperationContext__Group__0__Impl rule__OperationContext__Group__1 ;
    public final void rule__OperationContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4113:1: ( rule__OperationContext__Group__0__Impl rule__OperationContext__Group__1 )
            // InternalUSE.g:4114:2: rule__OperationContext__Group__0__Impl rule__OperationContext__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__OperationContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationContext__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationContext__Group__0"


    // $ANTLR start "rule__OperationContext__Group__0__Impl"
    // InternalUSE.g:4121:1: rule__OperationContext__Group__0__Impl : ( 'context' ) ;
    public final void rule__OperationContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4125:1: ( ( 'context' ) )
            // InternalUSE.g:4126:1: ( 'context' )
            {
            // InternalUSE.g:4126:1: ( 'context' )
            // InternalUSE.g:4127:2: 'context'
            {
             before(grammarAccess.getOperationContextAccess().getContextKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getOperationContextAccess().getContextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationContext__Group__0__Impl"


    // $ANTLR start "rule__OperationContext__Group__1"
    // InternalUSE.g:4136:1: rule__OperationContext__Group__1 : rule__OperationContext__Group__1__Impl rule__OperationContext__Group__2 ;
    public final void rule__OperationContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4140:1: ( rule__OperationContext__Group__1__Impl rule__OperationContext__Group__2 )
            // InternalUSE.g:4141:2: rule__OperationContext__Group__1__Impl rule__OperationContext__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__OperationContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationContext__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationContext__Group__1"


    // $ANTLR start "rule__OperationContext__Group__1__Impl"
    // InternalUSE.g:4148:1: rule__OperationContext__Group__1__Impl : ( ( rule__OperationContext__ClassnameAssignment_1 ) ) ;
    public final void rule__OperationContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4152:1: ( ( ( rule__OperationContext__ClassnameAssignment_1 ) ) )
            // InternalUSE.g:4153:1: ( ( rule__OperationContext__ClassnameAssignment_1 ) )
            {
            // InternalUSE.g:4153:1: ( ( rule__OperationContext__ClassnameAssignment_1 ) )
            // InternalUSE.g:4154:2: ( rule__OperationContext__ClassnameAssignment_1 )
            {
             before(grammarAccess.getOperationContextAccess().getClassnameAssignment_1()); 
            // InternalUSE.g:4155:2: ( rule__OperationContext__ClassnameAssignment_1 )
            // InternalUSE.g:4155:3: rule__OperationContext__ClassnameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OperationContext__ClassnameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationContextAccess().getClassnameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationContext__Group__1__Impl"


    // $ANTLR start "rule__OperationContext__Group__2"
    // InternalUSE.g:4163:1: rule__OperationContext__Group__2 : rule__OperationContext__Group__2__Impl ;
    public final void rule__OperationContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4167:1: ( rule__OperationContext__Group__2__Impl )
            // InternalUSE.g:4168:2: rule__OperationContext__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationContext__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationContext__Group__2"


    // $ANTLR start "rule__OperationContext__Group__2__Impl"
    // InternalUSE.g:4174:1: rule__OperationContext__Group__2__Impl : ( ( rule__OperationContext__ConstrainsAssignment_2 ) ) ;
    public final void rule__OperationContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4178:1: ( ( ( rule__OperationContext__ConstrainsAssignment_2 ) ) )
            // InternalUSE.g:4179:1: ( ( rule__OperationContext__ConstrainsAssignment_2 ) )
            {
            // InternalUSE.g:4179:1: ( ( rule__OperationContext__ConstrainsAssignment_2 ) )
            // InternalUSE.g:4180:2: ( rule__OperationContext__ConstrainsAssignment_2 )
            {
             before(grammarAccess.getOperationContextAccess().getConstrainsAssignment_2()); 
            // InternalUSE.g:4181:2: ( rule__OperationContext__ConstrainsAssignment_2 )
            // InternalUSE.g:4181:3: rule__OperationContext__ConstrainsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OperationContext__ConstrainsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOperationContextAccess().getConstrainsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationContext__Group__2__Impl"


    // $ANTLR start "rule__OperationConstraints__Group__0"
    // InternalUSE.g:4190:1: rule__OperationConstraints__Group__0 : rule__OperationConstraints__Group__0__Impl rule__OperationConstraints__Group__1 ;
    public final void rule__OperationConstraints__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4194:1: ( rule__OperationConstraints__Group__0__Impl rule__OperationConstraints__Group__1 )
            // InternalUSE.g:4195:2: rule__OperationConstraints__Group__0__Impl rule__OperationConstraints__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__OperationConstraints__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationConstraints__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationConstraints__Group__0"


    // $ANTLR start "rule__OperationConstraints__Group__0__Impl"
    // InternalUSE.g:4202:1: rule__OperationConstraints__Group__0__Impl : ( '::' ) ;
    public final void rule__OperationConstraints__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4206:1: ( ( '::' ) )
            // InternalUSE.g:4207:1: ( '::' )
            {
            // InternalUSE.g:4207:1: ( '::' )
            // InternalUSE.g:4208:2: '::'
            {
             before(grammarAccess.getOperationConstraintsAccess().getColonColonKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getOperationConstraintsAccess().getColonColonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationConstraints__Group__0__Impl"


    // $ANTLR start "rule__OperationConstraints__Group__1"
    // InternalUSE.g:4217:1: rule__OperationConstraints__Group__1 : rule__OperationConstraints__Group__1__Impl rule__OperationConstraints__Group__2 ;
    public final void rule__OperationConstraints__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4221:1: ( rule__OperationConstraints__Group__1__Impl rule__OperationConstraints__Group__2 )
            // InternalUSE.g:4222:2: rule__OperationConstraints__Group__1__Impl rule__OperationConstraints__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__OperationConstraints__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationConstraints__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationConstraints__Group__1"


    // $ANTLR start "rule__OperationConstraints__Group__1__Impl"
    // InternalUSE.g:4229:1: rule__OperationConstraints__Group__1__Impl : ( ruleOperationDeclaration ) ;
    public final void rule__OperationConstraints__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4233:1: ( ( ruleOperationDeclaration ) )
            // InternalUSE.g:4234:1: ( ruleOperationDeclaration )
            {
            // InternalUSE.g:4234:1: ( ruleOperationDeclaration )
            // InternalUSE.g:4235:2: ruleOperationDeclaration
            {
             before(grammarAccess.getOperationConstraintsAccess().getOperationDeclarationParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleOperationDeclaration();

            state._fsp--;

             after(grammarAccess.getOperationConstraintsAccess().getOperationDeclarationParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationConstraints__Group__1__Impl"


    // $ANTLR start "rule__OperationConstraints__Group__2"
    // InternalUSE.g:4244:1: rule__OperationConstraints__Group__2 : rule__OperationConstraints__Group__2__Impl ;
    public final void rule__OperationConstraints__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4248:1: ( rule__OperationConstraints__Group__2__Impl )
            // InternalUSE.g:4249:2: rule__OperationConstraints__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationConstraints__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationConstraints__Group__2"


    // $ANTLR start "rule__OperationConstraints__Group__2__Impl"
    // InternalUSE.g:4255:1: rule__OperationConstraints__Group__2__Impl : ( ( ( rule__OperationConstraints__ConditionsAssignment_2 ) ) ( ( rule__OperationConstraints__ConditionsAssignment_2 )* ) ) ;
    public final void rule__OperationConstraints__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4259:1: ( ( ( ( rule__OperationConstraints__ConditionsAssignment_2 ) ) ( ( rule__OperationConstraints__ConditionsAssignment_2 )* ) ) )
            // InternalUSE.g:4260:1: ( ( ( rule__OperationConstraints__ConditionsAssignment_2 ) ) ( ( rule__OperationConstraints__ConditionsAssignment_2 )* ) )
            {
            // InternalUSE.g:4260:1: ( ( ( rule__OperationConstraints__ConditionsAssignment_2 ) ) ( ( rule__OperationConstraints__ConditionsAssignment_2 )* ) )
            // InternalUSE.g:4261:2: ( ( rule__OperationConstraints__ConditionsAssignment_2 ) ) ( ( rule__OperationConstraints__ConditionsAssignment_2 )* )
            {
            // InternalUSE.g:4261:2: ( ( rule__OperationConstraints__ConditionsAssignment_2 ) )
            // InternalUSE.g:4262:3: ( rule__OperationConstraints__ConditionsAssignment_2 )
            {
             before(grammarAccess.getOperationConstraintsAccess().getConditionsAssignment_2()); 
            // InternalUSE.g:4263:3: ( rule__OperationConstraints__ConditionsAssignment_2 )
            // InternalUSE.g:4263:4: rule__OperationConstraints__ConditionsAssignment_2
            {
            pushFollow(FOLLOW_28);
            rule__OperationConstraints__ConditionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOperationConstraintsAccess().getConditionsAssignment_2()); 

            }

            // InternalUSE.g:4266:2: ( ( rule__OperationConstraints__ConditionsAssignment_2 )* )
            // InternalUSE.g:4267:3: ( rule__OperationConstraints__ConditionsAssignment_2 )*
            {
             before(grammarAccess.getOperationConstraintsAccess().getConditionsAssignment_2()); 
            // InternalUSE.g:4268:3: ( rule__OperationConstraints__ConditionsAssignment_2 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=44 && LA53_0<=45)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalUSE.g:4268:4: rule__OperationConstraints__ConditionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__OperationConstraints__ConditionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

             after(grammarAccess.getOperationConstraintsAccess().getConditionsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationConstraints__Group__2__Impl"


    // $ANTLR start "rule__Precondition__Group__0"
    // InternalUSE.g:4278:1: rule__Precondition__Group__0 : rule__Precondition__Group__0__Impl rule__Precondition__Group__1 ;
    public final void rule__Precondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4282:1: ( rule__Precondition__Group__0__Impl rule__Precondition__Group__1 )
            // InternalUSE.g:4283:2: rule__Precondition__Group__0__Impl rule__Precondition__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__Precondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Precondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group__0"


    // $ANTLR start "rule__Precondition__Group__0__Impl"
    // InternalUSE.g:4290:1: rule__Precondition__Group__0__Impl : ( 'pre' ) ;
    public final void rule__Precondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4294:1: ( ( 'pre' ) )
            // InternalUSE.g:4295:1: ( 'pre' )
            {
            // InternalUSE.g:4295:1: ( 'pre' )
            // InternalUSE.g:4296:2: 'pre'
            {
             before(grammarAccess.getPreconditionAccess().getPreKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getPreconditionAccess().getPreKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group__0__Impl"


    // $ANTLR start "rule__Precondition__Group__1"
    // InternalUSE.g:4305:1: rule__Precondition__Group__1 : rule__Precondition__Group__1__Impl rule__Precondition__Group__2 ;
    public final void rule__Precondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4309:1: ( rule__Precondition__Group__1__Impl rule__Precondition__Group__2 )
            // InternalUSE.g:4310:2: rule__Precondition__Group__1__Impl rule__Precondition__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__Precondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Precondition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group__1"


    // $ANTLR start "rule__Precondition__Group__1__Impl"
    // InternalUSE.g:4317:1: rule__Precondition__Group__1__Impl : ( ( rule__Precondition__NameAssignment_1 )? ) ;
    public final void rule__Precondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4321:1: ( ( ( rule__Precondition__NameAssignment_1 )? ) )
            // InternalUSE.g:4322:1: ( ( rule__Precondition__NameAssignment_1 )? )
            {
            // InternalUSE.g:4322:1: ( ( rule__Precondition__NameAssignment_1 )? )
            // InternalUSE.g:4323:2: ( rule__Precondition__NameAssignment_1 )?
            {
             before(grammarAccess.getPreconditionAccess().getNameAssignment_1()); 
            // InternalUSE.g:4324:2: ( rule__Precondition__NameAssignment_1 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalUSE.g:4324:3: rule__Precondition__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Precondition__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPreconditionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group__1__Impl"


    // $ANTLR start "rule__Precondition__Group__2"
    // InternalUSE.g:4332:1: rule__Precondition__Group__2 : rule__Precondition__Group__2__Impl rule__Precondition__Group__3 ;
    public final void rule__Precondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4336:1: ( rule__Precondition__Group__2__Impl rule__Precondition__Group__3 )
            // InternalUSE.g:4337:2: rule__Precondition__Group__2__Impl rule__Precondition__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Precondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Precondition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group__2"


    // $ANTLR start "rule__Precondition__Group__2__Impl"
    // InternalUSE.g:4344:1: rule__Precondition__Group__2__Impl : ( ':' ) ;
    public final void rule__Precondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4348:1: ( ( ':' ) )
            // InternalUSE.g:4349:1: ( ':' )
            {
            // InternalUSE.g:4349:1: ( ':' )
            // InternalUSE.g:4350:2: ':'
            {
             before(grammarAccess.getPreconditionAccess().getColonKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPreconditionAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group__2__Impl"


    // $ANTLR start "rule__Precondition__Group__3"
    // InternalUSE.g:4359:1: rule__Precondition__Group__3 : rule__Precondition__Group__3__Impl ;
    public final void rule__Precondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4363:1: ( rule__Precondition__Group__3__Impl )
            // InternalUSE.g:4364:2: rule__Precondition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Precondition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group__3"


    // $ANTLR start "rule__Precondition__Group__3__Impl"
    // InternalUSE.g:4370:1: rule__Precondition__Group__3__Impl : ( ( rule__Precondition__OclexpressionAssignment_3 ) ) ;
    public final void rule__Precondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4374:1: ( ( ( rule__Precondition__OclexpressionAssignment_3 ) ) )
            // InternalUSE.g:4375:1: ( ( rule__Precondition__OclexpressionAssignment_3 ) )
            {
            // InternalUSE.g:4375:1: ( ( rule__Precondition__OclexpressionAssignment_3 ) )
            // InternalUSE.g:4376:2: ( rule__Precondition__OclexpressionAssignment_3 )
            {
             before(grammarAccess.getPreconditionAccess().getOclexpressionAssignment_3()); 
            // InternalUSE.g:4377:2: ( rule__Precondition__OclexpressionAssignment_3 )
            // InternalUSE.g:4377:3: rule__Precondition__OclexpressionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Precondition__OclexpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPreconditionAccess().getOclexpressionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group__3__Impl"


    // $ANTLR start "rule__Postcondition__Group__0"
    // InternalUSE.g:4386:1: rule__Postcondition__Group__0 : rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1 ;
    public final void rule__Postcondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4390:1: ( rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1 )
            // InternalUSE.g:4391:2: rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__Postcondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Postcondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__Group__0"


    // $ANTLR start "rule__Postcondition__Group__0__Impl"
    // InternalUSE.g:4398:1: rule__Postcondition__Group__0__Impl : ( 'post' ) ;
    public final void rule__Postcondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4402:1: ( ( 'post' ) )
            // InternalUSE.g:4403:1: ( 'post' )
            {
            // InternalUSE.g:4403:1: ( 'post' )
            // InternalUSE.g:4404:2: 'post'
            {
             before(grammarAccess.getPostconditionAccess().getPostKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getPostconditionAccess().getPostKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__Group__0__Impl"


    // $ANTLR start "rule__Postcondition__Group__1"
    // InternalUSE.g:4413:1: rule__Postcondition__Group__1 : rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2 ;
    public final void rule__Postcondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4417:1: ( rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2 )
            // InternalUSE.g:4418:2: rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__Postcondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Postcondition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__Group__1"


    // $ANTLR start "rule__Postcondition__Group__1__Impl"
    // InternalUSE.g:4425:1: rule__Postcondition__Group__1__Impl : ( ( rule__Postcondition__NameAssignment_1 )? ) ;
    public final void rule__Postcondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4429:1: ( ( ( rule__Postcondition__NameAssignment_1 )? ) )
            // InternalUSE.g:4430:1: ( ( rule__Postcondition__NameAssignment_1 )? )
            {
            // InternalUSE.g:4430:1: ( ( rule__Postcondition__NameAssignment_1 )? )
            // InternalUSE.g:4431:2: ( rule__Postcondition__NameAssignment_1 )?
            {
             before(grammarAccess.getPostconditionAccess().getNameAssignment_1()); 
            // InternalUSE.g:4432:2: ( rule__Postcondition__NameAssignment_1 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalUSE.g:4432:3: rule__Postcondition__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Postcondition__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPostconditionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__Group__1__Impl"


    // $ANTLR start "rule__Postcondition__Group__2"
    // InternalUSE.g:4440:1: rule__Postcondition__Group__2 : rule__Postcondition__Group__2__Impl rule__Postcondition__Group__3 ;
    public final void rule__Postcondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4444:1: ( rule__Postcondition__Group__2__Impl rule__Postcondition__Group__3 )
            // InternalUSE.g:4445:2: rule__Postcondition__Group__2__Impl rule__Postcondition__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Postcondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Postcondition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__Group__2"


    // $ANTLR start "rule__Postcondition__Group__2__Impl"
    // InternalUSE.g:4452:1: rule__Postcondition__Group__2__Impl : ( ':' ) ;
    public final void rule__Postcondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4456:1: ( ( ':' ) )
            // InternalUSE.g:4457:1: ( ':' )
            {
            // InternalUSE.g:4457:1: ( ':' )
            // InternalUSE.g:4458:2: ':'
            {
             before(grammarAccess.getPostconditionAccess().getColonKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPostconditionAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__Group__2__Impl"


    // $ANTLR start "rule__Postcondition__Group__3"
    // InternalUSE.g:4467:1: rule__Postcondition__Group__3 : rule__Postcondition__Group__3__Impl ;
    public final void rule__Postcondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4471:1: ( rule__Postcondition__Group__3__Impl )
            // InternalUSE.g:4472:2: rule__Postcondition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Postcondition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__Group__3"


    // $ANTLR start "rule__Postcondition__Group__3__Impl"
    // InternalUSE.g:4478:1: rule__Postcondition__Group__3__Impl : ( ( rule__Postcondition__OclexpressionAssignment_3 ) ) ;
    public final void rule__Postcondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4482:1: ( ( ( rule__Postcondition__OclexpressionAssignment_3 ) ) )
            // InternalUSE.g:4483:1: ( ( rule__Postcondition__OclexpressionAssignment_3 ) )
            {
            // InternalUSE.g:4483:1: ( ( rule__Postcondition__OclexpressionAssignment_3 ) )
            // InternalUSE.g:4484:2: ( rule__Postcondition__OclexpressionAssignment_3 )
            {
             before(grammarAccess.getPostconditionAccess().getOclexpressionAssignment_3()); 
            // InternalUSE.g:4485:2: ( rule__Postcondition__OclexpressionAssignment_3 )
            // InternalUSE.g:4485:3: rule__Postcondition__OclexpressionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Postcondition__OclexpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPostconditionAccess().getOclexpressionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__Group__3__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalUSE.g:4494:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4498:1: ( ( RULE_ID ) )
            // InternalUSE.g:4499:2: ( RULE_ID )
            {
            // InternalUSE.g:4499:2: ( RULE_ID )
            // InternalUSE.g:4500:3: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__PackagedElementAssignment_2"
    // InternalUSE.g:4509:1: rule__Model__PackagedElementAssignment_2 : ( ruleEnumeration ) ;
    public final void rule__Model__PackagedElementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4513:1: ( ( ruleEnumeration ) )
            // InternalUSE.g:4514:2: ( ruleEnumeration )
            {
            // InternalUSE.g:4514:2: ( ruleEnumeration )
            // InternalUSE.g:4515:3: ruleEnumeration
            {
             before(grammarAccess.getModelAccess().getPackagedElementEnumerationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumeration();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPackagedElementEnumerationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PackagedElementAssignment_2"


    // $ANTLR start "rule__Model__PackagedElementAssignment_3"
    // InternalUSE.g:4524:1: rule__Model__PackagedElementAssignment_3 : ( ruleType ) ;
    public final void rule__Model__PackagedElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4528:1: ( ( ruleType ) )
            // InternalUSE.g:4529:2: ( ruleType )
            {
            // InternalUSE.g:4529:2: ( ruleType )
            // InternalUSE.g:4530:3: ruleType
            {
             before(grammarAccess.getModelAccess().getPackagedElementTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPackagedElementTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PackagedElementAssignment_3"


    // $ANTLR start "rule__Model__ConstraintsAssignment_4"
    // InternalUSE.g:4539:1: rule__Model__ConstraintsAssignment_4 : ( ruleConstrainsGeneral ) ;
    public final void rule__Model__ConstraintsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4543:1: ( ( ruleConstrainsGeneral ) )
            // InternalUSE.g:4544:2: ( ruleConstrainsGeneral )
            {
            // InternalUSE.g:4544:2: ( ruleConstrainsGeneral )
            // InternalUSE.g:4545:3: ruleConstrainsGeneral
            {
             before(grammarAccess.getModelAccess().getConstraintsConstrainsGeneralParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleConstrainsGeneral();

            state._fsp--;

             after(grammarAccess.getModelAccess().getConstraintsConstrainsGeneralParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ConstraintsAssignment_4"


    // $ANTLR start "rule__Enumeration__NameAssignment_1"
    // InternalUSE.g:4554:1: rule__Enumeration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enumeration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4558:1: ( ( RULE_ID ) )
            // InternalUSE.g:4559:2: ( RULE_ID )
            {
            // InternalUSE.g:4559:2: ( RULE_ID )
            // InternalUSE.g:4560:3: RULE_ID
            {
             before(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__NameAssignment_1"


    // $ANTLR start "rule__Enumeration__OwnedLiteralAssignment_3"
    // InternalUSE.g:4569:1: rule__Enumeration__OwnedLiteralAssignment_3 : ( ruleOwnedLiteral ) ;
    public final void rule__Enumeration__OwnedLiteralAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4573:1: ( ( ruleOwnedLiteral ) )
            // InternalUSE.g:4574:2: ( ruleOwnedLiteral )
            {
            // InternalUSE.g:4574:2: ( ruleOwnedLiteral )
            // InternalUSE.g:4575:3: ruleOwnedLiteral
            {
             before(grammarAccess.getEnumerationAccess().getOwnedLiteralOwnedLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOwnedLiteral();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getOwnedLiteralOwnedLiteralParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__OwnedLiteralAssignment_3"


    // $ANTLR start "rule__OwnedLiteral__NameAssignment_0"
    // InternalUSE.g:4584:1: rule__OwnedLiteral__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__OwnedLiteral__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4588:1: ( ( RULE_ID ) )
            // InternalUSE.g:4589:2: ( RULE_ID )
            {
            // InternalUSE.g:4589:2: ( RULE_ID )
            // InternalUSE.g:4590:3: RULE_ID
            {
             before(grammarAccess.getOwnedLiteralAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOwnedLiteralAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OwnedLiteral__NameAssignment_0"


    // $ANTLR start "rule__Class__AbstractAssignment_0"
    // InternalUSE.g:4599:1: rule__Class__AbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__Class__AbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4603:1: ( ( ( 'abstract' ) ) )
            // InternalUSE.g:4604:2: ( ( 'abstract' ) )
            {
            // InternalUSE.g:4604:2: ( ( 'abstract' ) )
            // InternalUSE.g:4605:3: ( 'abstract' )
            {
             before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_0_0()); 
            // InternalUSE.g:4606:3: ( 'abstract' )
            // InternalUSE.g:4607:4: 'abstract'
            {
             before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_0_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getAbstractAbstractKeyword_0_0()); 

            }

             after(grammarAccess.getClassAccess().getAbstractAbstractKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__AbstractAssignment_0"


    // $ANTLR start "rule__Class__NameAssignment_2"
    // InternalUSE.g:4618:1: rule__Class__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4622:1: ( ( RULE_ID ) )
            // InternalUSE.g:4623:2: ( RULE_ID )
            {
            // InternalUSE.g:4623:2: ( RULE_ID )
            // InternalUSE.g:4624:3: RULE_ID
            {
             before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__NameAssignment_2"


    // $ANTLR start "rule__Class__GeneralizationAssignment_3_1"
    // InternalUSE.g:4633:1: rule__Class__GeneralizationAssignment_3_1 : ( ruleGeneralization ) ;
    public final void rule__Class__GeneralizationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4637:1: ( ( ruleGeneralization ) )
            // InternalUSE.g:4638:2: ( ruleGeneralization )
            {
            // InternalUSE.g:4638:2: ( ruleGeneralization )
            // InternalUSE.g:4639:3: ruleGeneralization
            {
             before(grammarAccess.getClassAccess().getGeneralizationGeneralizationParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGeneralization();

            state._fsp--;

             after(grammarAccess.getClassAccess().getGeneralizationGeneralizationParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__GeneralizationAssignment_3_1"


    // $ANTLR start "rule__Class__OwnedAttributeAssignment_4_1"
    // InternalUSE.g:4648:1: rule__Class__OwnedAttributeAssignment_4_1 : ( ruleAttribute ) ;
    public final void rule__Class__OwnedAttributeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4652:1: ( ( ruleAttribute ) )
            // InternalUSE.g:4653:2: ( ruleAttribute )
            {
            // InternalUSE.g:4653:2: ( ruleAttribute )
            // InternalUSE.g:4654:3: ruleAttribute
            {
             before(grammarAccess.getClassAccess().getOwnedAttributeAttributeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getClassAccess().getOwnedAttributeAttributeParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__OwnedAttributeAssignment_4_1"


    // $ANTLR start "rule__Class__OwnedOperationAssignment_5"
    // InternalUSE.g:4663:1: rule__Class__OwnedOperationAssignment_5 : ( ruleOperationsBase ) ;
    public final void rule__Class__OwnedOperationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4667:1: ( ( ruleOperationsBase ) )
            // InternalUSE.g:4668:2: ( ruleOperationsBase )
            {
            // InternalUSE.g:4668:2: ( ruleOperationsBase )
            // InternalUSE.g:4669:3: ruleOperationsBase
            {
             before(grammarAccess.getClassAccess().getOwnedOperationOperationsBaseParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationsBase();

            state._fsp--;

             after(grammarAccess.getClassAccess().getOwnedOperationOperationsBaseParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__OwnedOperationAssignment_5"


    // $ANTLR start "rule__Class__ConstraintsAssignment_6"
    // InternalUSE.g:4678:1: rule__Class__ConstraintsAssignment_6 : ( ruleConstraintsBase ) ;
    public final void rule__Class__ConstraintsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4682:1: ( ( ruleConstraintsBase ) )
            // InternalUSE.g:4683:2: ( ruleConstraintsBase )
            {
            // InternalUSE.g:4683:2: ( ruleConstraintsBase )
            // InternalUSE.g:4684:3: ruleConstraintsBase
            {
             before(grammarAccess.getClassAccess().getConstraintsConstraintsBaseParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraintsBase();

            state._fsp--;

             after(grammarAccess.getClassAccess().getConstraintsConstraintsBaseParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__ConstraintsAssignment_6"


    // $ANTLR start "rule__AssociationClass__AbstractAssignment_0"
    // InternalUSE.g:4693:1: rule__AssociationClass__AbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__AssociationClass__AbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4697:1: ( ( ( 'abstract' ) ) )
            // InternalUSE.g:4698:2: ( ( 'abstract' ) )
            {
            // InternalUSE.g:4698:2: ( ( 'abstract' ) )
            // InternalUSE.g:4699:3: ( 'abstract' )
            {
             before(grammarAccess.getAssociationClassAccess().getAbstractAbstractKeyword_0_0()); 
            // InternalUSE.g:4700:3: ( 'abstract' )
            // InternalUSE.g:4701:4: 'abstract'
            {
             before(grammarAccess.getAssociationClassAccess().getAbstractAbstractKeyword_0_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getAssociationClassAccess().getAbstractAbstractKeyword_0_0()); 

            }

             after(grammarAccess.getAssociationClassAccess().getAbstractAbstractKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__AbstractAssignment_0"


    // $ANTLR start "rule__AssociationClass__NameAssignment_2"
    // InternalUSE.g:4712:1: rule__AssociationClass__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__AssociationClass__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4716:1: ( ( RULE_ID ) )
            // InternalUSE.g:4717:2: ( RULE_ID )
            {
            // InternalUSE.g:4717:2: ( RULE_ID )
            // InternalUSE.g:4718:3: RULE_ID
            {
             before(grammarAccess.getAssociationClassAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssociationClassAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__NameAssignment_2"


    // $ANTLR start "rule__AssociationClass__GeneralizationAssignment_3_1"
    // InternalUSE.g:4727:1: rule__AssociationClass__GeneralizationAssignment_3_1 : ( ruleGeneralization ) ;
    public final void rule__AssociationClass__GeneralizationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4731:1: ( ( ruleGeneralization ) )
            // InternalUSE.g:4732:2: ( ruleGeneralization )
            {
            // InternalUSE.g:4732:2: ( ruleGeneralization )
            // InternalUSE.g:4733:3: ruleGeneralization
            {
             before(grammarAccess.getAssociationClassAccess().getGeneralizationGeneralizationParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGeneralization();

            state._fsp--;

             after(grammarAccess.getAssociationClassAccess().getGeneralizationGeneralizationParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__GeneralizationAssignment_3_1"


    // $ANTLR start "rule__AssociationClass__MemberEndsAssignment_5"
    // InternalUSE.g:4742:1: rule__AssociationClass__MemberEndsAssignment_5 : ( ruleMemberEnd ) ;
    public final void rule__AssociationClass__MemberEndsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4746:1: ( ( ruleMemberEnd ) )
            // InternalUSE.g:4747:2: ( ruleMemberEnd )
            {
            // InternalUSE.g:4747:2: ( ruleMemberEnd )
            // InternalUSE.g:4748:3: ruleMemberEnd
            {
             before(grammarAccess.getAssociationClassAccess().getMemberEndsMemberEndParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleMemberEnd();

            state._fsp--;

             after(grammarAccess.getAssociationClassAccess().getMemberEndsMemberEndParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__MemberEndsAssignment_5"


    // $ANTLR start "rule__AssociationClass__OwnedAttributeAssignment_6_1"
    // InternalUSE.g:4757:1: rule__AssociationClass__OwnedAttributeAssignment_6_1 : ( ruleAttribute ) ;
    public final void rule__AssociationClass__OwnedAttributeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4761:1: ( ( ruleAttribute ) )
            // InternalUSE.g:4762:2: ( ruleAttribute )
            {
            // InternalUSE.g:4762:2: ( ruleAttribute )
            // InternalUSE.g:4763:3: ruleAttribute
            {
             before(grammarAccess.getAssociationClassAccess().getOwnedAttributeAttributeParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAssociationClassAccess().getOwnedAttributeAttributeParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__OwnedAttributeAssignment_6_1"


    // $ANTLR start "rule__AssociationClass__OperationsAssignment_7_1"
    // InternalUSE.g:4772:1: rule__AssociationClass__OperationsAssignment_7_1 : ( ruleOperationType ) ;
    public final void rule__AssociationClass__OperationsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4776:1: ( ( ruleOperationType ) )
            // InternalUSE.g:4777:2: ( ruleOperationType )
            {
            // InternalUSE.g:4777:2: ( ruleOperationType )
            // InternalUSE.g:4778:3: ruleOperationType
            {
             before(grammarAccess.getAssociationClassAccess().getOperationsOperationTypeParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationType();

            state._fsp--;

             after(grammarAccess.getAssociationClassAccess().getOperationsOperationTypeParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__OperationsAssignment_7_1"


    // $ANTLR start "rule__AssociationClass__ConstraintsAssignment_8"
    // InternalUSE.g:4787:1: rule__AssociationClass__ConstraintsAssignment_8 : ( ruleConstraintsBase ) ;
    public final void rule__AssociationClass__ConstraintsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4791:1: ( ( ruleConstraintsBase ) )
            // InternalUSE.g:4792:2: ( ruleConstraintsBase )
            {
            // InternalUSE.g:4792:2: ( ruleConstraintsBase )
            // InternalUSE.g:4793:3: ruleConstraintsBase
            {
             before(grammarAccess.getAssociationClassAccess().getConstraintsConstraintsBaseParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraintsBase();

            state._fsp--;

             after(grammarAccess.getAssociationClassAccess().getConstraintsConstraintsBaseParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationClass__ConstraintsAssignment_8"


    // $ANTLR start "rule__Generalization__GeneralAssignment_0"
    // InternalUSE.g:4802:1: rule__Generalization__GeneralAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Generalization__GeneralAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4806:1: ( ( ( RULE_ID ) ) )
            // InternalUSE.g:4807:2: ( ( RULE_ID ) )
            {
            // InternalUSE.g:4807:2: ( ( RULE_ID ) )
            // InternalUSE.g:4808:3: ( RULE_ID )
            {
             before(grammarAccess.getGeneralizationAccess().getGeneralAllClassCrossReference_0_0()); 
            // InternalUSE.g:4809:3: ( RULE_ID )
            // InternalUSE.g:4810:4: RULE_ID
            {
             before(grammarAccess.getGeneralizationAccess().getGeneralAllClassIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGeneralizationAccess().getGeneralAllClassIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getGeneralizationAccess().getGeneralAllClassCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__GeneralAssignment_0"


    // $ANTLR start "rule__SimpleTypes__ReferendedAssignment_1"
    // InternalUSE.g:4821:1: rule__SimpleTypes__ReferendedAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SimpleTypes__ReferendedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4825:1: ( ( ( RULE_ID ) ) )
            // InternalUSE.g:4826:2: ( ( RULE_ID ) )
            {
            // InternalUSE.g:4826:2: ( ( RULE_ID ) )
            // InternalUSE.g:4827:3: ( RULE_ID )
            {
             before(grammarAccess.getSimpleTypesAccess().getReferendedAllClassCrossReference_1_0()); 
            // InternalUSE.g:4828:3: ( RULE_ID )
            // InternalUSE.g:4829:4: RULE_ID
            {
             before(grammarAccess.getSimpleTypesAccess().getReferendedAllClassIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSimpleTypesAccess().getReferendedAllClassIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSimpleTypesAccess().getReferendedAllClassCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypes__ReferendedAssignment_1"


    // $ANTLR start "rule__Association__NameAssignment_0"
    // InternalUSE.g:4840:1: rule__Association__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Association__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4844:1: ( ( RULE_ID ) )
            // InternalUSE.g:4845:2: ( RULE_ID )
            {
            // InternalUSE.g:4845:2: ( RULE_ID )
            // InternalUSE.g:4846:3: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__NameAssignment_0"


    // $ANTLR start "rule__Association__MemberEndsAssignment_2"
    // InternalUSE.g:4855:1: rule__Association__MemberEndsAssignment_2 : ( ruleMemberEnd ) ;
    public final void rule__Association__MemberEndsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4859:1: ( ( ruleMemberEnd ) )
            // InternalUSE.g:4860:2: ( ruleMemberEnd )
            {
            // InternalUSE.g:4860:2: ( ruleMemberEnd )
            // InternalUSE.g:4861:3: ruleMemberEnd
            {
             before(grammarAccess.getAssociationAccess().getMemberEndsMemberEndParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMemberEnd();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getMemberEndsMemberEndParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__MemberEndsAssignment_2"


    // $ANTLR start "rule__MemberEnd__TypeAssignment_0"
    // InternalUSE.g:4870:1: rule__MemberEnd__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__MemberEnd__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4874:1: ( ( ( RULE_ID ) ) )
            // InternalUSE.g:4875:2: ( ( RULE_ID ) )
            {
            // InternalUSE.g:4875:2: ( ( RULE_ID ) )
            // InternalUSE.g:4876:3: ( RULE_ID )
            {
             before(grammarAccess.getMemberEndAccess().getTypeAllClassCrossReference_0_0()); 
            // InternalUSE.g:4877:3: ( RULE_ID )
            // InternalUSE.g:4878:4: RULE_ID
            {
             before(grammarAccess.getMemberEndAccess().getTypeAllClassIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemberEndAccess().getTypeAllClassIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getMemberEndAccess().getTypeAllClassCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberEnd__TypeAssignment_0"


    // $ANTLR start "rule__MemberEnd__MulAssignment_2"
    // InternalUSE.g:4889:1: rule__MemberEnd__MulAssignment_2 : ( ruleMultiplicity ) ;
    public final void rule__MemberEnd__MulAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4893:1: ( ( ruleMultiplicity ) )
            // InternalUSE.g:4894:2: ( ruleMultiplicity )
            {
            // InternalUSE.g:4894:2: ( ruleMultiplicity )
            // InternalUSE.g:4895:3: ruleMultiplicity
            {
             before(grammarAccess.getMemberEndAccess().getMulMultiplicityParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicity();

            state._fsp--;

             after(grammarAccess.getMemberEndAccess().getMulMultiplicityParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberEnd__MulAssignment_2"


    // $ANTLR start "rule__MemberEnd__RoleAssignment_4_1"
    // InternalUSE.g:4904:1: rule__MemberEnd__RoleAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__MemberEnd__RoleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4908:1: ( ( RULE_ID ) )
            // InternalUSE.g:4909:2: ( RULE_ID )
            {
            // InternalUSE.g:4909:2: ( RULE_ID )
            // InternalUSE.g:4910:3: RULE_ID
            {
             before(grammarAccess.getMemberEndAccess().getRoleIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemberEndAccess().getRoleIDTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberEnd__RoleAssignment_4_1"


    // $ANTLR start "rule__MemberEnd__OrderedAssignment_5"
    // InternalUSE.g:4919:1: rule__MemberEnd__OrderedAssignment_5 : ( ( 'ordered' ) ) ;
    public final void rule__MemberEnd__OrderedAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4923:1: ( ( ( 'ordered' ) ) )
            // InternalUSE.g:4924:2: ( ( 'ordered' ) )
            {
            // InternalUSE.g:4924:2: ( ( 'ordered' ) )
            // InternalUSE.g:4925:3: ( 'ordered' )
            {
             before(grammarAccess.getMemberEndAccess().getOrderedOrderedKeyword_5_0()); 
            // InternalUSE.g:4926:3: ( 'ordered' )
            // InternalUSE.g:4927:4: 'ordered'
            {
             before(grammarAccess.getMemberEndAccess().getOrderedOrderedKeyword_5_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getMemberEndAccess().getOrderedOrderedKeyword_5_0()); 

            }

             after(grammarAccess.getMemberEndAccess().getOrderedOrderedKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberEnd__OrderedAssignment_5"


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // InternalUSE.g:4938:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4942:1: ( ( RULE_ID ) )
            // InternalUSE.g:4943:2: ( RULE_ID )
            {
            // InternalUSE.g:4943:2: ( RULE_ID )
            // InternalUSE.g:4944:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_0"


    // $ANTLR start "rule__Attribute__TypeAssignment_2"
    // InternalUSE.g:4953:1: rule__Attribute__TypeAssignment_2 : ( ruleSimpleTypes ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4957:1: ( ( ruleSimpleTypes ) )
            // InternalUSE.g:4958:2: ( ruleSimpleTypes )
            {
            // InternalUSE.g:4958:2: ( ruleSimpleTypes )
            // InternalUSE.g:4959:3: ruleSimpleTypes
            {
             before(grammarAccess.getAttributeAccess().getTypeSimpleTypesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleTypes();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeSimpleTypesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_2"


    // $ANTLR start "rule__OperationBasic__OclexpressionAssignment_1_1"
    // InternalUSE.g:4968:1: rule__OperationBasic__OclexpressionAssignment_1_1 : ( ruleOCLExpression ) ;
    public final void rule__OperationBasic__OclexpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4972:1: ( ( ruleOCLExpression ) )
            // InternalUSE.g:4973:2: ( ruleOCLExpression )
            {
            // InternalUSE.g:4973:2: ( ruleOCLExpression )
            // InternalUSE.g:4974:3: ruleOCLExpression
            {
             before(grammarAccess.getOperationBasicAccess().getOclexpressionOCLExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOCLExpression();

            state._fsp--;

             after(grammarAccess.getOperationBasicAccess().getOclexpressionOCLExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationBasic__OclexpressionAssignment_1_1"


    // $ANTLR start "rule__OperationBasic__ConditionsAssignment_2"
    // InternalUSE.g:4983:1: rule__OperationBasic__ConditionsAssignment_2 : ( ruleConditionType ) ;
    public final void rule__OperationBasic__ConditionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4987:1: ( ( ruleConditionType ) )
            // InternalUSE.g:4988:2: ( ruleConditionType )
            {
            // InternalUSE.g:4988:2: ( ruleConditionType )
            // InternalUSE.g:4989:3: ruleConditionType
            {
             before(grammarAccess.getOperationBasicAccess().getConditionsConditionTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionType();

            state._fsp--;

             after(grammarAccess.getOperationBasicAccess().getConditionsConditionTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationBasic__ConditionsAssignment_2"


    // $ANTLR start "rule__OperationComplex__OperationbodyAssignment_2"
    // InternalUSE.g:4998:1: rule__OperationComplex__OperationbodyAssignment_2 : ( ruleOCLExpression ) ;
    public final void rule__OperationComplex__OperationbodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5002:1: ( ( ruleOCLExpression ) )
            // InternalUSE.g:5003:2: ( ruleOCLExpression )
            {
            // InternalUSE.g:5003:2: ( ruleOCLExpression )
            // InternalUSE.g:5004:3: ruleOCLExpression
            {
             before(grammarAccess.getOperationComplexAccess().getOperationbodyOCLExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOCLExpression();

            state._fsp--;

             after(grammarAccess.getOperationComplexAccess().getOperationbodyOCLExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationComplex__OperationbodyAssignment_2"


    // $ANTLR start "rule__OperationComplex__ConditionsAssignment_4"
    // InternalUSE.g:5013:1: rule__OperationComplex__ConditionsAssignment_4 : ( ruleConditionType ) ;
    public final void rule__OperationComplex__ConditionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5017:1: ( ( ruleConditionType ) )
            // InternalUSE.g:5018:2: ( ruleConditionType )
            {
            // InternalUSE.g:5018:2: ( ruleConditionType )
            // InternalUSE.g:5019:3: ruleConditionType
            {
             before(grammarAccess.getOperationComplexAccess().getConditionsConditionTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionType();

            state._fsp--;

             after(grammarAccess.getOperationComplexAccess().getConditionsConditionTypeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationComplex__ConditionsAssignment_4"


    // $ANTLR start "rule__OperationDeclaration__NameAssignment_0"
    // InternalUSE.g:5028:1: rule__OperationDeclaration__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__OperationDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5032:1: ( ( RULE_ID ) )
            // InternalUSE.g:5033:2: ( RULE_ID )
            {
            // InternalUSE.g:5033:2: ( RULE_ID )
            // InternalUSE.g:5034:3: RULE_ID
            {
             before(grammarAccess.getOperationDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOperationDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__NameAssignment_0"


    // $ANTLR start "rule__OperationDeclaration__OwnedParameterAssignment_2"
    // InternalUSE.g:5043:1: rule__OperationDeclaration__OwnedParameterAssignment_2 : ( ruleOwnedParameter ) ;
    public final void rule__OperationDeclaration__OwnedParameterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5047:1: ( ( ruleOwnedParameter ) )
            // InternalUSE.g:5048:2: ( ruleOwnedParameter )
            {
            // InternalUSE.g:5048:2: ( ruleOwnedParameter )
            // InternalUSE.g:5049:3: ruleOwnedParameter
            {
             before(grammarAccess.getOperationDeclarationAccess().getOwnedParameterOwnedParameterParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOwnedParameter();

            state._fsp--;

             after(grammarAccess.getOperationDeclarationAccess().getOwnedParameterOwnedParameterParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__OwnedParameterAssignment_2"


    // $ANTLR start "rule__OperationDeclaration__ReturnTypeAssignment_4_1"
    // InternalUSE.g:5058:1: rule__OperationDeclaration__ReturnTypeAssignment_4_1 : ( ruleSimpleTypes ) ;
    public final void rule__OperationDeclaration__ReturnTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5062:1: ( ( ruleSimpleTypes ) )
            // InternalUSE.g:5063:2: ( ruleSimpleTypes )
            {
            // InternalUSE.g:5063:2: ( ruleSimpleTypes )
            // InternalUSE.g:5064:3: ruleSimpleTypes
            {
             before(grammarAccess.getOperationDeclarationAccess().getReturnTypeSimpleTypesParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleTypes();

            state._fsp--;

             after(grammarAccess.getOperationDeclarationAccess().getReturnTypeSimpleTypesParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationDeclaration__ReturnTypeAssignment_4_1"


    // $ANTLR start "rule__ConstraintsBase__InvariantsAssignment_1"
    // InternalUSE.g:5073:1: rule__ConstraintsBase__InvariantsAssignment_1 : ( ruleInvariantDefinition ) ;
    public final void rule__ConstraintsBase__InvariantsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5077:1: ( ( ruleInvariantDefinition ) )
            // InternalUSE.g:5078:2: ( ruleInvariantDefinition )
            {
            // InternalUSE.g:5078:2: ( ruleInvariantDefinition )
            // InternalUSE.g:5079:3: ruleInvariantDefinition
            {
             before(grammarAccess.getConstraintsBaseAccess().getInvariantsInvariantDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInvariantDefinition();

            state._fsp--;

             after(grammarAccess.getConstraintsBaseAccess().getInvariantsInvariantDefinitionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintsBase__InvariantsAssignment_1"


    // $ANTLR start "rule__ConstrainsGeneral__ContextsAssignment_1"
    // InternalUSE.g:5088:1: rule__ConstrainsGeneral__ContextsAssignment_1 : ( ruleContextsType ) ;
    public final void rule__ConstrainsGeneral__ContextsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5092:1: ( ( ruleContextsType ) )
            // InternalUSE.g:5093:2: ( ruleContextsType )
            {
            // InternalUSE.g:5093:2: ( ruleContextsType )
            // InternalUSE.g:5094:3: ruleContextsType
            {
             before(grammarAccess.getConstrainsGeneralAccess().getContextsContextsTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContextsType();

            state._fsp--;

             after(grammarAccess.getConstrainsGeneralAccess().getContextsContextsTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstrainsGeneral__ContextsAssignment_1"


    // $ANTLR start "rule__InvariantContext__VariablenameAssignment_1_0"
    // InternalUSE.g:5103:1: rule__InvariantContext__VariablenameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__InvariantContext__VariablenameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5107:1: ( ( RULE_ID ) )
            // InternalUSE.g:5108:2: ( RULE_ID )
            {
            // InternalUSE.g:5108:2: ( RULE_ID )
            // InternalUSE.g:5109:3: RULE_ID
            {
             before(grammarAccess.getInvariantContextAccess().getVariablenameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInvariantContextAccess().getVariablenameIDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvariantContext__VariablenameAssignment_1_0"


    // $ANTLR start "rule__InvariantContext__ClassnameAssignment_2"
    // InternalUSE.g:5118:1: rule__InvariantContext__ClassnameAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__InvariantContext__ClassnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5122:1: ( ( ( RULE_ID ) ) )
            // InternalUSE.g:5123:2: ( ( RULE_ID ) )
            {
            // InternalUSE.g:5123:2: ( ( RULE_ID ) )
            // InternalUSE.g:5124:3: ( RULE_ID )
            {
             before(grammarAccess.getInvariantContextAccess().getClassnameAllClassCrossReference_2_0()); 
            // InternalUSE.g:5125:3: ( RULE_ID )
            // InternalUSE.g:5126:4: RULE_ID
            {
             before(grammarAccess.getInvariantContextAccess().getClassnameAllClassIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInvariantContextAccess().getClassnameAllClassIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getInvariantContextAccess().getClassnameAllClassCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvariantContext__ClassnameAssignment_2"


    // $ANTLR start "rule__InvariantContext__InvariantsAssignment_3"
    // InternalUSE.g:5137:1: rule__InvariantContext__InvariantsAssignment_3 : ( ruleInvariantDefinition ) ;
    public final void rule__InvariantContext__InvariantsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5141:1: ( ( ruleInvariantDefinition ) )
            // InternalUSE.g:5142:2: ( ruleInvariantDefinition )
            {
            // InternalUSE.g:5142:2: ( ruleInvariantDefinition )
            // InternalUSE.g:5143:3: ruleInvariantDefinition
            {
             before(grammarAccess.getInvariantContextAccess().getInvariantsInvariantDefinitionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInvariantDefinition();

            state._fsp--;

             after(grammarAccess.getInvariantContextAccess().getInvariantsInvariantDefinitionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvariantContext__InvariantsAssignment_3"


    // $ANTLR start "rule__InvariantDefinition__NameAssignment_1"
    // InternalUSE.g:5152:1: rule__InvariantDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InvariantDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5156:1: ( ( RULE_ID ) )
            // InternalUSE.g:5157:2: ( RULE_ID )
            {
            // InternalUSE.g:5157:2: ( RULE_ID )
            // InternalUSE.g:5158:3: RULE_ID
            {
             before(grammarAccess.getInvariantDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInvariantDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvariantDefinition__NameAssignment_1"


    // $ANTLR start "rule__InvariantDefinition__OclExpressionAssignment_3"
    // InternalUSE.g:5167:1: rule__InvariantDefinition__OclExpressionAssignment_3 : ( ruleOCLExpression ) ;
    public final void rule__InvariantDefinition__OclExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5171:1: ( ( ruleOCLExpression ) )
            // InternalUSE.g:5172:2: ( ruleOCLExpression )
            {
            // InternalUSE.g:5172:2: ( ruleOCLExpression )
            // InternalUSE.g:5173:3: ruleOCLExpression
            {
             before(grammarAccess.getInvariantDefinitionAccess().getOclExpressionOCLExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOCLExpression();

            state._fsp--;

             after(grammarAccess.getInvariantDefinitionAccess().getOclExpressionOCLExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvariantDefinition__OclExpressionAssignment_3"


    // $ANTLR start "rule__OperationContext__ClassnameAssignment_1"
    // InternalUSE.g:5182:1: rule__OperationContext__ClassnameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__OperationContext__ClassnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5186:1: ( ( ( RULE_ID ) ) )
            // InternalUSE.g:5187:2: ( ( RULE_ID ) )
            {
            // InternalUSE.g:5187:2: ( ( RULE_ID ) )
            // InternalUSE.g:5188:3: ( RULE_ID )
            {
             before(grammarAccess.getOperationContextAccess().getClassnameAllClassCrossReference_1_0()); 
            // InternalUSE.g:5189:3: ( RULE_ID )
            // InternalUSE.g:5190:4: RULE_ID
            {
             before(grammarAccess.getOperationContextAccess().getClassnameAllClassIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOperationContextAccess().getClassnameAllClassIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getOperationContextAccess().getClassnameAllClassCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationContext__ClassnameAssignment_1"


    // $ANTLR start "rule__OperationContext__ConstrainsAssignment_2"
    // InternalUSE.g:5201:1: rule__OperationContext__ConstrainsAssignment_2 : ( ruleOperationConstraints ) ;
    public final void rule__OperationContext__ConstrainsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5205:1: ( ( ruleOperationConstraints ) )
            // InternalUSE.g:5206:2: ( ruleOperationConstraints )
            {
            // InternalUSE.g:5206:2: ( ruleOperationConstraints )
            // InternalUSE.g:5207:3: ruleOperationConstraints
            {
             before(grammarAccess.getOperationContextAccess().getConstrainsOperationConstraintsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationConstraints();

            state._fsp--;

             after(grammarAccess.getOperationContextAccess().getConstrainsOperationConstraintsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationContext__ConstrainsAssignment_2"


    // $ANTLR start "rule__OperationConstraints__ConditionsAssignment_2"
    // InternalUSE.g:5216:1: rule__OperationConstraints__ConditionsAssignment_2 : ( ruleConditionType ) ;
    public final void rule__OperationConstraints__ConditionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5220:1: ( ( ruleConditionType ) )
            // InternalUSE.g:5221:2: ( ruleConditionType )
            {
            // InternalUSE.g:5221:2: ( ruleConditionType )
            // InternalUSE.g:5222:3: ruleConditionType
            {
             before(grammarAccess.getOperationConstraintsAccess().getConditionsConditionTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionType();

            state._fsp--;

             after(grammarAccess.getOperationConstraintsAccess().getConditionsConditionTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationConstraints__ConditionsAssignment_2"


    // $ANTLR start "rule__Precondition__NameAssignment_1"
    // InternalUSE.g:5231:1: rule__Precondition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Precondition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5235:1: ( ( RULE_ID ) )
            // InternalUSE.g:5236:2: ( RULE_ID )
            {
            // InternalUSE.g:5236:2: ( RULE_ID )
            // InternalUSE.g:5237:3: RULE_ID
            {
             before(grammarAccess.getPreconditionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPreconditionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__NameAssignment_1"


    // $ANTLR start "rule__Precondition__OclexpressionAssignment_3"
    // InternalUSE.g:5246:1: rule__Precondition__OclexpressionAssignment_3 : ( ruleOCLExpression ) ;
    public final void rule__Precondition__OclexpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5250:1: ( ( ruleOCLExpression ) )
            // InternalUSE.g:5251:2: ( ruleOCLExpression )
            {
            // InternalUSE.g:5251:2: ( ruleOCLExpression )
            // InternalUSE.g:5252:3: ruleOCLExpression
            {
             before(grammarAccess.getPreconditionAccess().getOclexpressionOCLExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOCLExpression();

            state._fsp--;

             after(grammarAccess.getPreconditionAccess().getOclexpressionOCLExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__OclexpressionAssignment_3"


    // $ANTLR start "rule__Postcondition__NameAssignment_1"
    // InternalUSE.g:5261:1: rule__Postcondition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Postcondition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5265:1: ( ( RULE_ID ) )
            // InternalUSE.g:5266:2: ( RULE_ID )
            {
            // InternalUSE.g:5266:2: ( RULE_ID )
            // InternalUSE.g:5267:3: RULE_ID
            {
             before(grammarAccess.getPostconditionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPostconditionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__NameAssignment_1"


    // $ANTLR start "rule__Postcondition__OclexpressionAssignment_3"
    // InternalUSE.g:5276:1: rule__Postcondition__OclexpressionAssignment_3 : ( ruleOCLExpression ) ;
    public final void rule__Postcondition__OclexpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5280:1: ( ( ruleOCLExpression ) )
            // InternalUSE.g:5281:2: ( ruleOCLExpression )
            {
            // InternalUSE.g:5281:2: ( ruleOCLExpression )
            // InternalUSE.g:5282:3: ruleOCLExpression
            {
             before(grammarAccess.getPostconditionAccess().getOclexpressionOCLExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOCLExpression();

            state._fsp--;

             after(grammarAccess.getPostconditionAccess().getOclexpressionOCLExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__OclexpressionAssignment_3"

    // Delegated rules


    protected DFA9 dfa9 = new DFA9(this);
    static final String dfa_1s = "\24\uffff";
    static final String dfa_2s = "\4\uffff\1\7\11\uffff\5\7\1\uffff";
    static final String dfa_3s = "\1\6\1\46\1\6\1\43\3\6\2\uffff\13\6";
    static final String dfa_4s = "\1\6\1\46\1\47\1\43\1\55\2\20\2\uffff\5\47\5\55\1\47";
    static final String dfa_5s = "\7\uffff\1\1\1\2\13\uffff";
    static final String dfa_6s = "\24\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2",
            "\1\3\40\uffff\1\4",
            "\1\5",
            "\1\7\21\uffff\1\7\12\uffff\1\6\1\7\1\10\2\uffff\1\7\3\uffff\2\7",
            "\1\15\6\uffff\1\11\1\12\1\13\1\14",
            "\1\22\6\uffff\1\16\1\17\1\20\1\21",
            "",
            "",
            "\1\3\14\uffff\1\23\23\uffff\1\4",
            "\1\3\14\uffff\1\23\23\uffff\1\4",
            "\1\3\14\uffff\1\23\23\uffff\1\4",
            "\1\3\14\uffff\1\23\23\uffff\1\4",
            "\1\3\14\uffff\1\23\23\uffff\1\4",
            "\1\7\21\uffff\1\7\13\uffff\1\7\1\10\2\uffff\1\7\3\uffff\2\7",
            "\1\7\21\uffff\1\7\13\uffff\1\7\1\10\2\uffff\1\7\3\uffff\2\7",
            "\1\7\21\uffff\1\7\13\uffff\1\7\1\10\2\uffff\1\7\3\uffff\2\7",
            "\1\7\21\uffff\1\7\13\uffff\1\7\1\10\2\uffff\1\7\3\uffff\2\7",
            "\1\7\21\uffff\1\7\13\uffff\1\7\1\10\2\uffff\1\7\3\uffff\2\7",
            "\1\3\40\uffff\1\4"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1102:1: rule__OperationType__Alternatives : ( ( ruleOperationBasic ) | ( ruleOperationComplex ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000410708900000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000400708800002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000400000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000010007000800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000010005000800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000800080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000000001E040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000301000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000800000040L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000000L});

}