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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_INT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "'Integer'", "'String'", "'Real'", "'Boolean'", "'association'", "'aggregation'", "'composition'", "'model'", "'..'", "','", "'enum'", "'{'", "'}'", "'class'", "'end'", "'<'", "'between'", "'['", "']'", "'role'", "'associationclass'", "'attributes'", "':'", "'operations'", "'='", "'begin'", "'('", "')'", "'constraints'", "'context'", "'inv'", "'::'", "'pre'", "'post'", "'abstract'", "'ordered'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=6;
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
    public static final int T__48=48;
    public static final int T__49=49;
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


    // $ANTLR start "entryRuleIntToString"
    // InternalUSE.g:103:1: entryRuleIntToString : ruleIntToString EOF ;
    public final void entryRuleIntToString() throws RecognitionException {
        try {
            // InternalUSE.g:104:1: ( ruleIntToString EOF )
            // InternalUSE.g:105:1: ruleIntToString EOF
            {
             before(grammarAccess.getIntToStringRule()); 
            pushFollow(FOLLOW_1);
            ruleIntToString();

            state._fsp--;

             after(grammarAccess.getIntToStringRule()); 
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
    // $ANTLR end "entryRuleIntToString"


    // $ANTLR start "ruleIntToString"
    // InternalUSE.g:112:1: ruleIntToString : ( ( ( rule__IntToString__Alternatives ) ) ( ( rule__IntToString__Alternatives )* ) ) ;
    public final void ruleIntToString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:116:2: ( ( ( ( rule__IntToString__Alternatives ) ) ( ( rule__IntToString__Alternatives )* ) ) )
            // InternalUSE.g:117:2: ( ( ( rule__IntToString__Alternatives ) ) ( ( rule__IntToString__Alternatives )* ) )
            {
            // InternalUSE.g:117:2: ( ( ( rule__IntToString__Alternatives ) ) ( ( rule__IntToString__Alternatives )* ) )
            // InternalUSE.g:118:3: ( ( rule__IntToString__Alternatives ) ) ( ( rule__IntToString__Alternatives )* )
            {
            // InternalUSE.g:118:3: ( ( rule__IntToString__Alternatives ) )
            // InternalUSE.g:119:4: ( rule__IntToString__Alternatives )
            {
             before(grammarAccess.getIntToStringAccess().getAlternatives()); 
            // InternalUSE.g:120:4: ( rule__IntToString__Alternatives )
            // InternalUSE.g:120:5: rule__IntToString__Alternatives
            {
            pushFollow(FOLLOW_3);
            rule__IntToString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIntToStringAccess().getAlternatives()); 

            }

            // InternalUSE.g:123:3: ( ( rule__IntToString__Alternatives )* )
            // InternalUSE.g:124:4: ( rule__IntToString__Alternatives )*
            {
             before(grammarAccess.getIntToStringAccess().getAlternatives()); 
            // InternalUSE.g:125:4: ( rule__IntToString__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=21)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUSE.g:125:5: rule__IntToString__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__IntToString__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getIntToStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleIntToString"


    // $ANTLR start "entryRuleDefaultType"
    // InternalUSE.g:135:1: entryRuleDefaultType : ruleDefaultType EOF ;
    public final void entryRuleDefaultType() throws RecognitionException {
        try {
            // InternalUSE.g:136:1: ( ruleDefaultType EOF )
            // InternalUSE.g:137:1: ruleDefaultType EOF
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
    // InternalUSE.g:144:1: ruleDefaultType : ( ( rule__DefaultType__Alternatives ) ) ;
    public final void ruleDefaultType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:148:2: ( ( ( rule__DefaultType__Alternatives ) ) )
            // InternalUSE.g:149:2: ( ( rule__DefaultType__Alternatives ) )
            {
            // InternalUSE.g:149:2: ( ( rule__DefaultType__Alternatives ) )
            // InternalUSE.g:150:3: ( rule__DefaultType__Alternatives )
            {
             before(grammarAccess.getDefaultTypeAccess().getAlternatives()); 
            // InternalUSE.g:151:3: ( rule__DefaultType__Alternatives )
            // InternalUSE.g:151:4: rule__DefaultType__Alternatives
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
    // InternalUSE.g:160:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalUSE.g:161:1: ( ruleType EOF )
            // InternalUSE.g:162:1: ruleType EOF
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
    // InternalUSE.g:169:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:173:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalUSE.g:174:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalUSE.g:174:2: ( ( rule__Type__Alternatives ) )
            // InternalUSE.g:175:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalUSE.g:176:3: ( rule__Type__Alternatives )
            // InternalUSE.g:176:4: rule__Type__Alternatives
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


    // $ANTLR start "entryRuleEnum"
    // InternalUSE.g:185:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // InternalUSE.g:186:1: ( ruleEnum EOF )
            // InternalUSE.g:187:1: ruleEnum EOF
            {
             before(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_1);
            ruleEnum();

            state._fsp--;

             after(grammarAccess.getEnumRule()); 
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
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // InternalUSE.g:194:1: ruleEnum : ( ( rule__Enum__Group__0 ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:198:2: ( ( ( rule__Enum__Group__0 ) ) )
            // InternalUSE.g:199:2: ( ( rule__Enum__Group__0 ) )
            {
            // InternalUSE.g:199:2: ( ( rule__Enum__Group__0 ) )
            // InternalUSE.g:200:3: ( rule__Enum__Group__0 )
            {
             before(grammarAccess.getEnumAccess().getGroup()); 
            // InternalUSE.g:201:3: ( rule__Enum__Group__0 )
            // InternalUSE.g:201:4: rule__Enum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Enum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getGroup()); 

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
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleEnumElement"
    // InternalUSE.g:210:1: entryRuleEnumElement : ruleEnumElement EOF ;
    public final void entryRuleEnumElement() throws RecognitionException {
        try {
            // InternalUSE.g:211:1: ( ruleEnumElement EOF )
            // InternalUSE.g:212:1: ruleEnumElement EOF
            {
             before(grammarAccess.getEnumElementRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumElement();

            state._fsp--;

             after(grammarAccess.getEnumElementRule()); 
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
    // $ANTLR end "entryRuleEnumElement"


    // $ANTLR start "ruleEnumElement"
    // InternalUSE.g:219:1: ruleEnumElement : ( ( rule__EnumElement__Group__0 ) ) ;
    public final void ruleEnumElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:223:2: ( ( ( rule__EnumElement__Group__0 ) ) )
            // InternalUSE.g:224:2: ( ( rule__EnumElement__Group__0 ) )
            {
            // InternalUSE.g:224:2: ( ( rule__EnumElement__Group__0 ) )
            // InternalUSE.g:225:3: ( rule__EnumElement__Group__0 )
            {
             before(grammarAccess.getEnumElementAccess().getGroup()); 
            // InternalUSE.g:226:3: ( rule__EnumElement__Group__0 )
            // InternalUSE.g:226:4: rule__EnumElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumElementAccess().getGroup()); 

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
    // $ANTLR end "ruleEnumElement"


    // $ANTLR start "entryRuleClass"
    // InternalUSE.g:235:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalUSE.g:236:1: ( ruleClass EOF )
            // InternalUSE.g:237:1: ruleClass EOF
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
    // InternalUSE.g:244:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:248:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalUSE.g:249:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalUSE.g:249:2: ( ( rule__Class__Group__0 ) )
            // InternalUSE.g:250:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalUSE.g:251:3: ( rule__Class__Group__0 )
            // InternalUSE.g:251:4: rule__Class__Group__0
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


    // $ANTLR start "entryRuleGeneralization"
    // InternalUSE.g:260:1: entryRuleGeneralization : ruleGeneralization EOF ;
    public final void entryRuleGeneralization() throws RecognitionException {
        try {
            // InternalUSE.g:261:1: ( ruleGeneralization EOF )
            // InternalUSE.g:262:1: ruleGeneralization EOF
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
    // InternalUSE.g:269:1: ruleGeneralization : ( ( rule__Generalization__Group__0 ) ) ;
    public final void ruleGeneralization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:273:2: ( ( ( rule__Generalization__Group__0 ) ) )
            // InternalUSE.g:274:2: ( ( rule__Generalization__Group__0 ) )
            {
            // InternalUSE.g:274:2: ( ( rule__Generalization__Group__0 ) )
            // InternalUSE.g:275:3: ( rule__Generalization__Group__0 )
            {
             before(grammarAccess.getGeneralizationAccess().getGroup()); 
            // InternalUSE.g:276:3: ( rule__Generalization__Group__0 )
            // InternalUSE.g:276:4: rule__Generalization__Group__0
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
    // InternalUSE.g:285:1: entryRuleSimpleTypes : ruleSimpleTypes EOF ;
    public final void entryRuleSimpleTypes() throws RecognitionException {
        try {
            // InternalUSE.g:286:1: ( ruleSimpleTypes EOF )
            // InternalUSE.g:287:1: ruleSimpleTypes EOF
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
    // InternalUSE.g:294:1: ruleSimpleTypes : ( ( rule__SimpleTypes__Alternatives ) ) ;
    public final void ruleSimpleTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:298:2: ( ( ( rule__SimpleTypes__Alternatives ) ) )
            // InternalUSE.g:299:2: ( ( rule__SimpleTypes__Alternatives ) )
            {
            // InternalUSE.g:299:2: ( ( rule__SimpleTypes__Alternatives ) )
            // InternalUSE.g:300:3: ( rule__SimpleTypes__Alternatives )
            {
             before(grammarAccess.getSimpleTypesAccess().getAlternatives()); 
            // InternalUSE.g:301:3: ( rule__SimpleTypes__Alternatives )
            // InternalUSE.g:301:4: rule__SimpleTypes__Alternatives
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
    // InternalUSE.g:310:1: entryRuleAssociation : ruleAssociation EOF ;
    public final void entryRuleAssociation() throws RecognitionException {
        try {
            // InternalUSE.g:311:1: ( ruleAssociation EOF )
            // InternalUSE.g:312:1: ruleAssociation EOF
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
    // InternalUSE.g:319:1: ruleAssociation : ( ( rule__Association__Group__0 ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:323:2: ( ( ( rule__Association__Group__0 ) ) )
            // InternalUSE.g:324:2: ( ( rule__Association__Group__0 ) )
            {
            // InternalUSE.g:324:2: ( ( rule__Association__Group__0 ) )
            // InternalUSE.g:325:3: ( rule__Association__Group__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup()); 
            // InternalUSE.g:326:3: ( rule__Association__Group__0 )
            // InternalUSE.g:326:4: rule__Association__Group__0
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


    // $ANTLR start "entryRuleAssociationEnd"
    // InternalUSE.g:335:1: entryRuleAssociationEnd : ruleAssociationEnd EOF ;
    public final void entryRuleAssociationEnd() throws RecognitionException {
        try {
            // InternalUSE.g:336:1: ( ruleAssociationEnd EOF )
            // InternalUSE.g:337:1: ruleAssociationEnd EOF
            {
             before(grammarAccess.getAssociationEndRule()); 
            pushFollow(FOLLOW_1);
            ruleAssociationEnd();

            state._fsp--;

             after(grammarAccess.getAssociationEndRule()); 
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
    // $ANTLR end "entryRuleAssociationEnd"


    // $ANTLR start "ruleAssociationEnd"
    // InternalUSE.g:344:1: ruleAssociationEnd : ( ( rule__AssociationEnd__Group__0 ) ) ;
    public final void ruleAssociationEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:348:2: ( ( ( rule__AssociationEnd__Group__0 ) ) )
            // InternalUSE.g:349:2: ( ( rule__AssociationEnd__Group__0 ) )
            {
            // InternalUSE.g:349:2: ( ( rule__AssociationEnd__Group__0 ) )
            // InternalUSE.g:350:3: ( rule__AssociationEnd__Group__0 )
            {
             before(grammarAccess.getAssociationEndAccess().getGroup()); 
            // InternalUSE.g:351:3: ( rule__AssociationEnd__Group__0 )
            // InternalUSE.g:351:4: rule__AssociationEnd__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationEndAccess().getGroup()); 

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
    // $ANTLR end "ruleAssociationEnd"


    // $ANTLR start "entryRuleAssociationClass"
    // InternalUSE.g:360:1: entryRuleAssociationClass : ruleAssociationClass EOF ;
    public final void entryRuleAssociationClass() throws RecognitionException {
        try {
            // InternalUSE.g:361:1: ( ruleAssociationClass EOF )
            // InternalUSE.g:362:1: ruleAssociationClass EOF
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
    // InternalUSE.g:369:1: ruleAssociationClass : ( ( rule__AssociationClass__Group__0 ) ) ;
    public final void ruleAssociationClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:373:2: ( ( ( rule__AssociationClass__Group__0 ) ) )
            // InternalUSE.g:374:2: ( ( rule__AssociationClass__Group__0 ) )
            {
            // InternalUSE.g:374:2: ( ( rule__AssociationClass__Group__0 ) )
            // InternalUSE.g:375:3: ( rule__AssociationClass__Group__0 )
            {
             before(grammarAccess.getAssociationClassAccess().getGroup()); 
            // InternalUSE.g:376:3: ( rule__AssociationClass__Group__0 )
            // InternalUSE.g:376:4: rule__AssociationClass__Group__0
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


    // $ANTLR start "entryRuleAttributesBase"
    // InternalUSE.g:385:1: entryRuleAttributesBase : ruleAttributesBase EOF ;
    public final void entryRuleAttributesBase() throws RecognitionException {
        try {
            // InternalUSE.g:386:1: ( ruleAttributesBase EOF )
            // InternalUSE.g:387:1: ruleAttributesBase EOF
            {
             before(grammarAccess.getAttributesBaseRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributesBase();

            state._fsp--;

             after(grammarAccess.getAttributesBaseRule()); 
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
    // $ANTLR end "entryRuleAttributesBase"


    // $ANTLR start "ruleAttributesBase"
    // InternalUSE.g:394:1: ruleAttributesBase : ( ( rule__AttributesBase__Group__0 ) ) ;
    public final void ruleAttributesBase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:398:2: ( ( ( rule__AttributesBase__Group__0 ) ) )
            // InternalUSE.g:399:2: ( ( rule__AttributesBase__Group__0 ) )
            {
            // InternalUSE.g:399:2: ( ( rule__AttributesBase__Group__0 ) )
            // InternalUSE.g:400:3: ( rule__AttributesBase__Group__0 )
            {
             before(grammarAccess.getAttributesBaseAccess().getGroup()); 
            // InternalUSE.g:401:3: ( rule__AttributesBase__Group__0 )
            // InternalUSE.g:401:4: rule__AttributesBase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributesBase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributesBaseAccess().getGroup()); 

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
    // $ANTLR end "ruleAttributesBase"


    // $ANTLR start "entryRuleAttribute"
    // InternalUSE.g:410:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalUSE.g:411:1: ( ruleAttribute EOF )
            // InternalUSE.g:412:1: ruleAttribute EOF
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
    // InternalUSE.g:419:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:423:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalUSE.g:424:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalUSE.g:424:2: ( ( rule__Attribute__Group__0 ) )
            // InternalUSE.g:425:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalUSE.g:426:3: ( rule__Attribute__Group__0 )
            // InternalUSE.g:426:4: rule__Attribute__Group__0
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
    // InternalUSE.g:435:1: entryRuleOperationsBase : ruleOperationsBase EOF ;
    public final void entryRuleOperationsBase() throws RecognitionException {
        try {
            // InternalUSE.g:436:1: ( ruleOperationsBase EOF )
            // InternalUSE.g:437:1: ruleOperationsBase EOF
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
    // InternalUSE.g:444:1: ruleOperationsBase : ( ( rule__OperationsBase__Group__0 ) ) ;
    public final void ruleOperationsBase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:448:2: ( ( ( rule__OperationsBase__Group__0 ) ) )
            // InternalUSE.g:449:2: ( ( rule__OperationsBase__Group__0 ) )
            {
            // InternalUSE.g:449:2: ( ( rule__OperationsBase__Group__0 ) )
            // InternalUSE.g:450:3: ( rule__OperationsBase__Group__0 )
            {
             before(grammarAccess.getOperationsBaseAccess().getGroup()); 
            // InternalUSE.g:451:3: ( rule__OperationsBase__Group__0 )
            // InternalUSE.g:451:4: rule__OperationsBase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OperationsBase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationsBaseAccess().getGroup()); 

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
    // InternalUSE.g:460:1: entryRuleOperationType : ruleOperationType EOF ;
    public final void entryRuleOperationType() throws RecognitionException {
        try {
            // InternalUSE.g:461:1: ( ruleOperationType EOF )
            // InternalUSE.g:462:1: ruleOperationType EOF
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
    // InternalUSE.g:469:1: ruleOperationType : ( ( rule__OperationType__Alternatives ) ) ;
    public final void ruleOperationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:473:2: ( ( ( rule__OperationType__Alternatives ) ) )
            // InternalUSE.g:474:2: ( ( rule__OperationType__Alternatives ) )
            {
            // InternalUSE.g:474:2: ( ( rule__OperationType__Alternatives ) )
            // InternalUSE.g:475:3: ( rule__OperationType__Alternatives )
            {
             before(grammarAccess.getOperationTypeAccess().getAlternatives()); 
            // InternalUSE.g:476:3: ( rule__OperationType__Alternatives )
            // InternalUSE.g:476:4: rule__OperationType__Alternatives
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


    // $ANTLR start "entryRuleOperationQuery"
    // InternalUSE.g:485:1: entryRuleOperationQuery : ruleOperationQuery EOF ;
    public final void entryRuleOperationQuery() throws RecognitionException {
        try {
            // InternalUSE.g:486:1: ( ruleOperationQuery EOF )
            // InternalUSE.g:487:1: ruleOperationQuery EOF
            {
             before(grammarAccess.getOperationQueryRule()); 
            pushFollow(FOLLOW_1);
            ruleOperationQuery();

            state._fsp--;

             after(grammarAccess.getOperationQueryRule()); 
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
    // $ANTLR end "entryRuleOperationQuery"


    // $ANTLR start "ruleOperationQuery"
    // InternalUSE.g:494:1: ruleOperationQuery : ( ( rule__OperationQuery__Group__0 ) ) ;
    public final void ruleOperationQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:498:2: ( ( ( rule__OperationQuery__Group__0 ) ) )
            // InternalUSE.g:499:2: ( ( rule__OperationQuery__Group__0 ) )
            {
            // InternalUSE.g:499:2: ( ( rule__OperationQuery__Group__0 ) )
            // InternalUSE.g:500:3: ( rule__OperationQuery__Group__0 )
            {
             before(grammarAccess.getOperationQueryAccess().getGroup()); 
            // InternalUSE.g:501:3: ( rule__OperationQuery__Group__0 )
            // InternalUSE.g:501:4: rule__OperationQuery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OperationQuery__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationQueryAccess().getGroup()); 

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
    // $ANTLR end "ruleOperationQuery"


    // $ANTLR start "entryRuleOperationComplex"
    // InternalUSE.g:510:1: entryRuleOperationComplex : ruleOperationComplex EOF ;
    public final void entryRuleOperationComplex() throws RecognitionException {
        try {
            // InternalUSE.g:511:1: ( ruleOperationComplex EOF )
            // InternalUSE.g:512:1: ruleOperationComplex EOF
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
    // InternalUSE.g:519:1: ruleOperationComplex : ( ( rule__OperationComplex__Group__0 ) ) ;
    public final void ruleOperationComplex() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:523:2: ( ( ( rule__OperationComplex__Group__0 ) ) )
            // InternalUSE.g:524:2: ( ( rule__OperationComplex__Group__0 ) )
            {
            // InternalUSE.g:524:2: ( ( rule__OperationComplex__Group__0 ) )
            // InternalUSE.g:525:3: ( rule__OperationComplex__Group__0 )
            {
             before(grammarAccess.getOperationComplexAccess().getGroup()); 
            // InternalUSE.g:526:3: ( rule__OperationComplex__Group__0 )
            // InternalUSE.g:526:4: rule__OperationComplex__Group__0
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
    // InternalUSE.g:535:1: entryRuleOperationDeclaration : ruleOperationDeclaration EOF ;
    public final void entryRuleOperationDeclaration() throws RecognitionException {
        try {
            // InternalUSE.g:536:1: ( ruleOperationDeclaration EOF )
            // InternalUSE.g:537:1: ruleOperationDeclaration EOF
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
    // InternalUSE.g:544:1: ruleOperationDeclaration : ( ( rule__OperationDeclaration__Group__0 ) ) ;
    public final void ruleOperationDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:548:2: ( ( ( rule__OperationDeclaration__Group__0 ) ) )
            // InternalUSE.g:549:2: ( ( rule__OperationDeclaration__Group__0 ) )
            {
            // InternalUSE.g:549:2: ( ( rule__OperationDeclaration__Group__0 ) )
            // InternalUSE.g:550:3: ( rule__OperationDeclaration__Group__0 )
            {
             before(grammarAccess.getOperationDeclarationAccess().getGroup()); 
            // InternalUSE.g:551:3: ( rule__OperationDeclaration__Group__0 )
            // InternalUSE.g:551:4: rule__OperationDeclaration__Group__0
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


    // $ANTLR start "entryRuleParameter"
    // InternalUSE.g:560:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalUSE.g:561:1: ( ruleParameter EOF )
            // InternalUSE.g:562:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalUSE.g:569:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:573:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalUSE.g:574:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalUSE.g:574:2: ( ( rule__Parameter__Group__0 ) )
            // InternalUSE.g:575:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalUSE.g:576:3: ( rule__Parameter__Group__0 )
            // InternalUSE.g:576:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleConstraintsBase"
    // InternalUSE.g:585:1: entryRuleConstraintsBase : ruleConstraintsBase EOF ;
    public final void entryRuleConstraintsBase() throws RecognitionException {
        try {
            // InternalUSE.g:586:1: ( ruleConstraintsBase EOF )
            // InternalUSE.g:587:1: ruleConstraintsBase EOF
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
    // InternalUSE.g:594:1: ruleConstraintsBase : ( ( rule__ConstraintsBase__Group__0 ) ) ;
    public final void ruleConstraintsBase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:598:2: ( ( ( rule__ConstraintsBase__Group__0 ) ) )
            // InternalUSE.g:599:2: ( ( rule__ConstraintsBase__Group__0 ) )
            {
            // InternalUSE.g:599:2: ( ( rule__ConstraintsBase__Group__0 ) )
            // InternalUSE.g:600:3: ( rule__ConstraintsBase__Group__0 )
            {
             before(grammarAccess.getConstraintsBaseAccess().getGroup()); 
            // InternalUSE.g:601:3: ( rule__ConstraintsBase__Group__0 )
            // InternalUSE.g:601:4: rule__ConstraintsBase__Group__0
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
    // InternalUSE.g:610:1: entryRuleConstrainsGeneral : ruleConstrainsGeneral EOF ;
    public final void entryRuleConstrainsGeneral() throws RecognitionException {
        try {
            // InternalUSE.g:611:1: ( ruleConstrainsGeneral EOF )
            // InternalUSE.g:612:1: ruleConstrainsGeneral EOF
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
    // InternalUSE.g:619:1: ruleConstrainsGeneral : ( ( rule__ConstrainsGeneral__Group__0 ) ) ;
    public final void ruleConstrainsGeneral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:623:2: ( ( ( rule__ConstrainsGeneral__Group__0 ) ) )
            // InternalUSE.g:624:2: ( ( rule__ConstrainsGeneral__Group__0 ) )
            {
            // InternalUSE.g:624:2: ( ( rule__ConstrainsGeneral__Group__0 ) )
            // InternalUSE.g:625:3: ( rule__ConstrainsGeneral__Group__0 )
            {
             before(grammarAccess.getConstrainsGeneralAccess().getGroup()); 
            // InternalUSE.g:626:3: ( rule__ConstrainsGeneral__Group__0 )
            // InternalUSE.g:626:4: rule__ConstrainsGeneral__Group__0
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
    // InternalUSE.g:635:1: entryRuleContextsType : ruleContextsType EOF ;
    public final void entryRuleContextsType() throws RecognitionException {
        try {
            // InternalUSE.g:636:1: ( ruleContextsType EOF )
            // InternalUSE.g:637:1: ruleContextsType EOF
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
    // InternalUSE.g:644:1: ruleContextsType : ( ( rule__ContextsType__Alternatives ) ) ;
    public final void ruleContextsType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:648:2: ( ( ( rule__ContextsType__Alternatives ) ) )
            // InternalUSE.g:649:2: ( ( rule__ContextsType__Alternatives ) )
            {
            // InternalUSE.g:649:2: ( ( rule__ContextsType__Alternatives ) )
            // InternalUSE.g:650:3: ( rule__ContextsType__Alternatives )
            {
             before(grammarAccess.getContextsTypeAccess().getAlternatives()); 
            // InternalUSE.g:651:3: ( rule__ContextsType__Alternatives )
            // InternalUSE.g:651:4: rule__ContextsType__Alternatives
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
    // InternalUSE.g:660:1: entryRuleInvariantContext : ruleInvariantContext EOF ;
    public final void entryRuleInvariantContext() throws RecognitionException {
        try {
            // InternalUSE.g:661:1: ( ruleInvariantContext EOF )
            // InternalUSE.g:662:1: ruleInvariantContext EOF
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
    // InternalUSE.g:669:1: ruleInvariantContext : ( ( rule__InvariantContext__Group__0 ) ) ;
    public final void ruleInvariantContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:673:2: ( ( ( rule__InvariantContext__Group__0 ) ) )
            // InternalUSE.g:674:2: ( ( rule__InvariantContext__Group__0 ) )
            {
            // InternalUSE.g:674:2: ( ( rule__InvariantContext__Group__0 ) )
            // InternalUSE.g:675:3: ( rule__InvariantContext__Group__0 )
            {
             before(grammarAccess.getInvariantContextAccess().getGroup()); 
            // InternalUSE.g:676:3: ( rule__InvariantContext__Group__0 )
            // InternalUSE.g:676:4: rule__InvariantContext__Group__0
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
    // InternalUSE.g:685:1: entryRuleInvariantDefinition : ruleInvariantDefinition EOF ;
    public final void entryRuleInvariantDefinition() throws RecognitionException {
        try {
            // InternalUSE.g:686:1: ( ruleInvariantDefinition EOF )
            // InternalUSE.g:687:1: ruleInvariantDefinition EOF
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
    // InternalUSE.g:694:1: ruleInvariantDefinition : ( ( rule__InvariantDefinition__Group__0 ) ) ;
    public final void ruleInvariantDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:698:2: ( ( ( rule__InvariantDefinition__Group__0 ) ) )
            // InternalUSE.g:699:2: ( ( rule__InvariantDefinition__Group__0 ) )
            {
            // InternalUSE.g:699:2: ( ( rule__InvariantDefinition__Group__0 ) )
            // InternalUSE.g:700:3: ( rule__InvariantDefinition__Group__0 )
            {
             before(grammarAccess.getInvariantDefinitionAccess().getGroup()); 
            // InternalUSE.g:701:3: ( rule__InvariantDefinition__Group__0 )
            // InternalUSE.g:701:4: rule__InvariantDefinition__Group__0
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
    // InternalUSE.g:710:1: entryRuleOperationContext : ruleOperationContext EOF ;
    public final void entryRuleOperationContext() throws RecognitionException {
        try {
            // InternalUSE.g:711:1: ( ruleOperationContext EOF )
            // InternalUSE.g:712:1: ruleOperationContext EOF
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
    // InternalUSE.g:719:1: ruleOperationContext : ( ( rule__OperationContext__Group__0 ) ) ;
    public final void ruleOperationContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:723:2: ( ( ( rule__OperationContext__Group__0 ) ) )
            // InternalUSE.g:724:2: ( ( rule__OperationContext__Group__0 ) )
            {
            // InternalUSE.g:724:2: ( ( rule__OperationContext__Group__0 ) )
            // InternalUSE.g:725:3: ( rule__OperationContext__Group__0 )
            {
             before(grammarAccess.getOperationContextAccess().getGroup()); 
            // InternalUSE.g:726:3: ( rule__OperationContext__Group__0 )
            // InternalUSE.g:726:4: rule__OperationContext__Group__0
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
    // InternalUSE.g:735:1: entryRuleOperationConstraints : ruleOperationConstraints EOF ;
    public final void entryRuleOperationConstraints() throws RecognitionException {
        try {
            // InternalUSE.g:736:1: ( ruleOperationConstraints EOF )
            // InternalUSE.g:737:1: ruleOperationConstraints EOF
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
    // InternalUSE.g:744:1: ruleOperationConstraints : ( ( rule__OperationConstraints__Group__0 ) ) ;
    public final void ruleOperationConstraints() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:748:2: ( ( ( rule__OperationConstraints__Group__0 ) ) )
            // InternalUSE.g:749:2: ( ( rule__OperationConstraints__Group__0 ) )
            {
            // InternalUSE.g:749:2: ( ( rule__OperationConstraints__Group__0 ) )
            // InternalUSE.g:750:3: ( rule__OperationConstraints__Group__0 )
            {
             before(grammarAccess.getOperationConstraintsAccess().getGroup()); 
            // InternalUSE.g:751:3: ( rule__OperationConstraints__Group__0 )
            // InternalUSE.g:751:4: rule__OperationConstraints__Group__0
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
    // InternalUSE.g:760:1: entryRuleConditionType : ruleConditionType EOF ;
    public final void entryRuleConditionType() throws RecognitionException {
        try {
            // InternalUSE.g:761:1: ( ruleConditionType EOF )
            // InternalUSE.g:762:1: ruleConditionType EOF
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
    // InternalUSE.g:769:1: ruleConditionType : ( ( rule__ConditionType__Alternatives ) ) ;
    public final void ruleConditionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:773:2: ( ( ( rule__ConditionType__Alternatives ) ) )
            // InternalUSE.g:774:2: ( ( rule__ConditionType__Alternatives ) )
            {
            // InternalUSE.g:774:2: ( ( rule__ConditionType__Alternatives ) )
            // InternalUSE.g:775:3: ( rule__ConditionType__Alternatives )
            {
             before(grammarAccess.getConditionTypeAccess().getAlternatives()); 
            // InternalUSE.g:776:3: ( rule__ConditionType__Alternatives )
            // InternalUSE.g:776:4: rule__ConditionType__Alternatives
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
    // InternalUSE.g:785:1: entryRulePrecondition : rulePrecondition EOF ;
    public final void entryRulePrecondition() throws RecognitionException {
        try {
            // InternalUSE.g:786:1: ( rulePrecondition EOF )
            // InternalUSE.g:787:1: rulePrecondition EOF
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
    // InternalUSE.g:794:1: rulePrecondition : ( ( rule__Precondition__Group__0 ) ) ;
    public final void rulePrecondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:798:2: ( ( ( rule__Precondition__Group__0 ) ) )
            // InternalUSE.g:799:2: ( ( rule__Precondition__Group__0 ) )
            {
            // InternalUSE.g:799:2: ( ( rule__Precondition__Group__0 ) )
            // InternalUSE.g:800:3: ( rule__Precondition__Group__0 )
            {
             before(grammarAccess.getPreconditionAccess().getGroup()); 
            // InternalUSE.g:801:3: ( rule__Precondition__Group__0 )
            // InternalUSE.g:801:4: rule__Precondition__Group__0
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
    // InternalUSE.g:810:1: entryRulePostcondition : rulePostcondition EOF ;
    public final void entryRulePostcondition() throws RecognitionException {
        try {
            // InternalUSE.g:811:1: ( rulePostcondition EOF )
            // InternalUSE.g:812:1: rulePostcondition EOF
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
    // InternalUSE.g:819:1: rulePostcondition : ( ( rule__Postcondition__Group__0 ) ) ;
    public final void rulePostcondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:823:2: ( ( ( rule__Postcondition__Group__0 ) ) )
            // InternalUSE.g:824:2: ( ( rule__Postcondition__Group__0 ) )
            {
            // InternalUSE.g:824:2: ( ( rule__Postcondition__Group__0 ) )
            // InternalUSE.g:825:3: ( rule__Postcondition__Group__0 )
            {
             before(grammarAccess.getPostconditionAccess().getGroup()); 
            // InternalUSE.g:826:3: ( rule__Postcondition__Group__0 )
            // InternalUSE.g:826:4: rule__Postcondition__Group__0
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
    // InternalUSE.g:835:1: entryRuleOCLExpression : ruleOCLExpression EOF ;
    public final void entryRuleOCLExpression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalUSE.g:839:1: ( ruleOCLExpression EOF )
            // InternalUSE.g:840:1: ruleOCLExpression EOF
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
    // InternalUSE.g:850:1: ruleOCLExpression : ( RULE_STRING ) ;
    public final void ruleOCLExpression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:855:2: ( ( RULE_STRING ) )
            // InternalUSE.g:856:2: ( RULE_STRING )
            {
            // InternalUSE.g:856:2: ( RULE_STRING )
            // InternalUSE.g:857:3: RULE_STRING
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


    // $ANTLR start "rule__Multiplicity__MinValueAlternatives_0_0"
    // InternalUSE.g:867:1: rule__Multiplicity__MinValueAlternatives_0_0 : ( ( '*' ) | ( ruleIntToString ) );
    public final void rule__Multiplicity__MinValueAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:871:1: ( ( '*' ) | ( ruleIntToString ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=12 && LA2_0<=21)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalUSE.g:872:2: ( '*' )
                    {
                    // InternalUSE.g:872:2: ( '*' )
                    // InternalUSE.g:873:3: '*'
                    {
                     before(grammarAccess.getMultiplicityAccess().getMinValueAsteriskKeyword_0_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getMinValueAsteriskKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:878:2: ( ruleIntToString )
                    {
                    // InternalUSE.g:878:2: ( ruleIntToString )
                    // InternalUSE.g:879:3: ruleIntToString
                    {
                     before(grammarAccess.getMultiplicityAccess().getMinValueIntToStringParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntToString();

                    state._fsp--;

                     after(grammarAccess.getMultiplicityAccess().getMinValueIntToStringParserRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__Multiplicity__MinValueAlternatives_0_0"


    // $ANTLR start "rule__Multiplicity__MaxValueAlternatives_1_1_0"
    // InternalUSE.g:888:1: rule__Multiplicity__MaxValueAlternatives_1_1_0 : ( ( '*' ) | ( ruleIntToString ) );
    public final void rule__Multiplicity__MaxValueAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:892:1: ( ( '*' ) | ( ruleIntToString ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=12 && LA3_0<=21)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalUSE.g:893:2: ( '*' )
                    {
                    // InternalUSE.g:893:2: ( '*' )
                    // InternalUSE.g:894:3: '*'
                    {
                     before(grammarAccess.getMultiplicityAccess().getMaxValueAsteriskKeyword_1_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getMaxValueAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:899:2: ( ruleIntToString )
                    {
                    // InternalUSE.g:899:2: ( ruleIntToString )
                    // InternalUSE.g:900:3: ruleIntToString
                    {
                     before(grammarAccess.getMultiplicityAccess().getMaxValueIntToStringParserRuleCall_1_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntToString();

                    state._fsp--;

                     after(grammarAccess.getMultiplicityAccess().getMaxValueIntToStringParserRuleCall_1_1_0_1()); 

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
    // $ANTLR end "rule__Multiplicity__MaxValueAlternatives_1_1_0"


    // $ANTLR start "rule__Multiplicity__MinValueAlternatives_2_1_0"
    // InternalUSE.g:909:1: rule__Multiplicity__MinValueAlternatives_2_1_0 : ( ( '*' ) | ( ruleIntToString ) );
    public final void rule__Multiplicity__MinValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:913:1: ( ( '*' ) | ( ruleIntToString ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=12 && LA4_0<=21)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalUSE.g:914:2: ( '*' )
                    {
                    // InternalUSE.g:914:2: ( '*' )
                    // InternalUSE.g:915:3: '*'
                    {
                     before(grammarAccess.getMultiplicityAccess().getMinValueAsteriskKeyword_2_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getMinValueAsteriskKeyword_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:920:2: ( ruleIntToString )
                    {
                    // InternalUSE.g:920:2: ( ruleIntToString )
                    // InternalUSE.g:921:3: ruleIntToString
                    {
                     before(grammarAccess.getMultiplicityAccess().getMinValueIntToStringParserRuleCall_2_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntToString();

                    state._fsp--;

                     after(grammarAccess.getMultiplicityAccess().getMinValueIntToStringParserRuleCall_2_1_0_1()); 

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
    // $ANTLR end "rule__Multiplicity__MinValueAlternatives_2_1_0"


    // $ANTLR start "rule__Multiplicity__MaxValueAlternatives_2_2_1_0"
    // InternalUSE.g:930:1: rule__Multiplicity__MaxValueAlternatives_2_2_1_0 : ( ( '*' ) | ( ruleIntToString ) );
    public final void rule__Multiplicity__MaxValueAlternatives_2_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:934:1: ( ( '*' ) | ( ruleIntToString ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=12 && LA5_0<=21)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalUSE.g:935:2: ( '*' )
                    {
                    // InternalUSE.g:935:2: ( '*' )
                    // InternalUSE.g:936:3: '*'
                    {
                     before(grammarAccess.getMultiplicityAccess().getMaxValueAsteriskKeyword_2_2_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getMaxValueAsteriskKeyword_2_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:941:2: ( ruleIntToString )
                    {
                    // InternalUSE.g:941:2: ( ruleIntToString )
                    // InternalUSE.g:942:3: ruleIntToString
                    {
                     before(grammarAccess.getMultiplicityAccess().getMaxValueIntToStringParserRuleCall_2_2_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntToString();

                    state._fsp--;

                     after(grammarAccess.getMultiplicityAccess().getMaxValueIntToStringParserRuleCall_2_2_1_0_1()); 

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
    // $ANTLR end "rule__Multiplicity__MaxValueAlternatives_2_2_1_0"


    // $ANTLR start "rule__IntToString__Alternatives"
    // InternalUSE.g:951:1: rule__IntToString__Alternatives : ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) | ( '8' ) | ( '9' ) );
    public final void rule__IntToString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:955:1: ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) | ( '8' ) | ( '9' ) )
            int alt6=10;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt6=1;
                }
                break;
            case 13:
                {
                alt6=2;
                }
                break;
            case 14:
                {
                alt6=3;
                }
                break;
            case 15:
                {
                alt6=4;
                }
                break;
            case 16:
                {
                alt6=5;
                }
                break;
            case 17:
                {
                alt6=6;
                }
                break;
            case 18:
                {
                alt6=7;
                }
                break;
            case 19:
                {
                alt6=8;
                }
                break;
            case 20:
                {
                alt6=9;
                }
                break;
            case 21:
                {
                alt6=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalUSE.g:956:2: ( '0' )
                    {
                    // InternalUSE.g:956:2: ( '0' )
                    // InternalUSE.g:957:3: '0'
                    {
                     before(grammarAccess.getIntToStringAccess().getDigitZeroKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getIntToStringAccess().getDigitZeroKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:962:2: ( '1' )
                    {
                    // InternalUSE.g:962:2: ( '1' )
                    // InternalUSE.g:963:3: '1'
                    {
                     before(grammarAccess.getIntToStringAccess().getDigitOneKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getIntToStringAccess().getDigitOneKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUSE.g:968:2: ( '2' )
                    {
                    // InternalUSE.g:968:2: ( '2' )
                    // InternalUSE.g:969:3: '2'
                    {
                     before(grammarAccess.getIntToStringAccess().getDigitTwoKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getIntToStringAccess().getDigitTwoKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUSE.g:974:2: ( '3' )
                    {
                    // InternalUSE.g:974:2: ( '3' )
                    // InternalUSE.g:975:3: '3'
                    {
                     before(grammarAccess.getIntToStringAccess().getDigitThreeKeyword_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getIntToStringAccess().getDigitThreeKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUSE.g:980:2: ( '4' )
                    {
                    // InternalUSE.g:980:2: ( '4' )
                    // InternalUSE.g:981:3: '4'
                    {
                     before(grammarAccess.getIntToStringAccess().getDigitFourKeyword_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getIntToStringAccess().getDigitFourKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalUSE.g:986:2: ( '5' )
                    {
                    // InternalUSE.g:986:2: ( '5' )
                    // InternalUSE.g:987:3: '5'
                    {
                     before(grammarAccess.getIntToStringAccess().getDigitFiveKeyword_5()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getIntToStringAccess().getDigitFiveKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalUSE.g:992:2: ( '6' )
                    {
                    // InternalUSE.g:992:2: ( '6' )
                    // InternalUSE.g:993:3: '6'
                    {
                     before(grammarAccess.getIntToStringAccess().getDigitSixKeyword_6()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getIntToStringAccess().getDigitSixKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalUSE.g:998:2: ( '7' )
                    {
                    // InternalUSE.g:998:2: ( '7' )
                    // InternalUSE.g:999:3: '7'
                    {
                     before(grammarAccess.getIntToStringAccess().getDigitSevenKeyword_7()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getIntToStringAccess().getDigitSevenKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalUSE.g:1004:2: ( '8' )
                    {
                    // InternalUSE.g:1004:2: ( '8' )
                    // InternalUSE.g:1005:3: '8'
                    {
                     before(grammarAccess.getIntToStringAccess().getDigitEightKeyword_8()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getIntToStringAccess().getDigitEightKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalUSE.g:1010:2: ( '9' )
                    {
                    // InternalUSE.g:1010:2: ( '9' )
                    // InternalUSE.g:1011:3: '9'
                    {
                     before(grammarAccess.getIntToStringAccess().getDigitNineKeyword_9()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getIntToStringAccess().getDigitNineKeyword_9()); 

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
    // $ANTLR end "rule__IntToString__Alternatives"


    // $ANTLR start "rule__DefaultType__Alternatives"
    // InternalUSE.g:1020:1: rule__DefaultType__Alternatives : ( ( 'Integer' ) | ( 'String' ) | ( 'Real' ) | ( 'Boolean' ) );
    public final void rule__DefaultType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1024:1: ( ( 'Integer' ) | ( 'String' ) | ( 'Real' ) | ( 'Boolean' ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt7=1;
                }
                break;
            case 23:
                {
                alt7=2;
                }
                break;
            case 24:
                {
                alt7=3;
                }
                break;
            case 25:
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
                    // InternalUSE.g:1025:2: ( 'Integer' )
                    {
                    // InternalUSE.g:1025:2: ( 'Integer' )
                    // InternalUSE.g:1026:3: 'Integer'
                    {
                     before(grammarAccess.getDefaultTypeAccess().getIntegerKeyword_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getDefaultTypeAccess().getIntegerKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:1031:2: ( 'String' )
                    {
                    // InternalUSE.g:1031:2: ( 'String' )
                    // InternalUSE.g:1032:3: 'String'
                    {
                     before(grammarAccess.getDefaultTypeAccess().getStringKeyword_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getDefaultTypeAccess().getStringKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUSE.g:1037:2: ( 'Real' )
                    {
                    // InternalUSE.g:1037:2: ( 'Real' )
                    // InternalUSE.g:1038:3: 'Real'
                    {
                     before(grammarAccess.getDefaultTypeAccess().getRealKeyword_2()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getDefaultTypeAccess().getRealKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUSE.g:1043:2: ( 'Boolean' )
                    {
                    // InternalUSE.g:1043:2: ( 'Boolean' )
                    // InternalUSE.g:1044:3: 'Boolean'
                    {
                     before(grammarAccess.getDefaultTypeAccess().getBooleanKeyword_3()); 
                    match(input,25,FOLLOW_2); 
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
    // InternalUSE.g:1053:1: rule__Type__Alternatives : ( ( ruleClass ) | ( ruleAssociation ) | ( ruleAssociationClass ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1057:1: ( ( ruleClass ) | ( ruleAssociation ) | ( ruleAssociationClass ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==35) ) {
                    alt8=1;
                }
                else if ( (LA8_1==42) ) {
                    alt8=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case 35:
                {
                alt8=1;
                }
                break;
            case 26:
            case 27:
            case 28:
                {
                alt8=2;
                }
                break;
            case 42:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalUSE.g:1058:2: ( ruleClass )
                    {
                    // InternalUSE.g:1058:2: ( ruleClass )
                    // InternalUSE.g:1059:3: ruleClass
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
                    // InternalUSE.g:1064:2: ( ruleAssociation )
                    {
                    // InternalUSE.g:1064:2: ( ruleAssociation )
                    // InternalUSE.g:1065:3: ruleAssociation
                    {
                     before(grammarAccess.getTypeAccess().getAssociationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAssociation();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getAssociationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUSE.g:1070:2: ( ruleAssociationClass )
                    {
                    // InternalUSE.g:1070:2: ( ruleAssociationClass )
                    // InternalUSE.g:1071:3: ruleAssociationClass
                    {
                     before(grammarAccess.getTypeAccess().getAssociationClassParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAssociationClass();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getAssociationClassParserRuleCall_2()); 

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


    // $ANTLR start "rule__SimpleTypes__Alternatives"
    // InternalUSE.g:1080:1: rule__SimpleTypes__Alternatives : ( ( ( rule__SimpleTypes__DefaultTypeAssignment_0 ) ) | ( ( rule__SimpleTypes__ReferendedAssignment_1 ) ) );
    public final void rule__SimpleTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1084:1: ( ( ( rule__SimpleTypes__DefaultTypeAssignment_0 ) ) | ( ( rule__SimpleTypes__ReferendedAssignment_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=22 && LA9_0<=25)) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalUSE.g:1085:2: ( ( rule__SimpleTypes__DefaultTypeAssignment_0 ) )
                    {
                    // InternalUSE.g:1085:2: ( ( rule__SimpleTypes__DefaultTypeAssignment_0 ) )
                    // InternalUSE.g:1086:3: ( rule__SimpleTypes__DefaultTypeAssignment_0 )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getDefaultTypeAssignment_0()); 
                    // InternalUSE.g:1087:3: ( rule__SimpleTypes__DefaultTypeAssignment_0 )
                    // InternalUSE.g:1087:4: rule__SimpleTypes__DefaultTypeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleTypes__DefaultTypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleTypesAccess().getDefaultTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:1091:2: ( ( rule__SimpleTypes__ReferendedAssignment_1 ) )
                    {
                    // InternalUSE.g:1091:2: ( ( rule__SimpleTypes__ReferendedAssignment_1 ) )
                    // InternalUSE.g:1092:3: ( rule__SimpleTypes__ReferendedAssignment_1 )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getReferendedAssignment_1()); 
                    // InternalUSE.g:1093:3: ( rule__SimpleTypes__ReferendedAssignment_1 )
                    // InternalUSE.g:1093:4: rule__SimpleTypes__ReferendedAssignment_1
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


    // $ANTLR start "rule__Association__TypeAssociationAlternatives_0_0"
    // InternalUSE.g:1101:1: rule__Association__TypeAssociationAlternatives_0_0 : ( ( 'association' ) | ( 'aggregation' ) | ( 'composition' ) );
    public final void rule__Association__TypeAssociationAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1105:1: ( ( 'association' ) | ( 'aggregation' ) | ( 'composition' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt10=1;
                }
                break;
            case 27:
                {
                alt10=2;
                }
                break;
            case 28:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalUSE.g:1106:2: ( 'association' )
                    {
                    // InternalUSE.g:1106:2: ( 'association' )
                    // InternalUSE.g:1107:3: 'association'
                    {
                     before(grammarAccess.getAssociationAccess().getTypeAssociationAssociationKeyword_0_0_0()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getAssociationAccess().getTypeAssociationAssociationKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:1112:2: ( 'aggregation' )
                    {
                    // InternalUSE.g:1112:2: ( 'aggregation' )
                    // InternalUSE.g:1113:3: 'aggregation'
                    {
                     before(grammarAccess.getAssociationAccess().getTypeAssociationAggregationKeyword_0_0_1()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getAssociationAccess().getTypeAssociationAggregationKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUSE.g:1118:2: ( 'composition' )
                    {
                    // InternalUSE.g:1118:2: ( 'composition' )
                    // InternalUSE.g:1119:3: 'composition'
                    {
                     before(grammarAccess.getAssociationAccess().getTypeAssociationCompositionKeyword_0_0_2()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getAssociationAccess().getTypeAssociationCompositionKeyword_0_0_2()); 

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
    // $ANTLR end "rule__Association__TypeAssociationAlternatives_0_0"


    // $ANTLR start "rule__OperationType__Alternatives"
    // InternalUSE.g:1128:1: rule__OperationType__Alternatives : ( ( ruleOperationComplex ) | ( ruleOperationQuery ) );
    public final void rule__OperationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1132:1: ( ( ruleOperationComplex ) | ( ruleOperationQuery ) )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalUSE.g:1133:2: ( ruleOperationComplex )
                    {
                    // InternalUSE.g:1133:2: ( ruleOperationComplex )
                    // InternalUSE.g:1134:3: ruleOperationComplex
                    {
                     before(grammarAccess.getOperationTypeAccess().getOperationComplexParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOperationComplex();

                    state._fsp--;

                     after(grammarAccess.getOperationTypeAccess().getOperationComplexParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:1139:2: ( ruleOperationQuery )
                    {
                    // InternalUSE.g:1139:2: ( ruleOperationQuery )
                    // InternalUSE.g:1140:3: ruleOperationQuery
                    {
                     before(grammarAccess.getOperationTypeAccess().getOperationQueryParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOperationQuery();

                    state._fsp--;

                     after(grammarAccess.getOperationTypeAccess().getOperationQueryParserRuleCall_1()); 

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
    // InternalUSE.g:1149:1: rule__ContextsType__Alternatives : ( ( ruleInvariantContext ) | ( ruleOperationContext ) );
    public final void rule__ContextsType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1153:1: ( ( ruleInvariantContext ) | ( ruleOperationContext ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==51) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==RULE_ID) ) {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2==EOF||LA12_2==44||(LA12_2>=51 && LA12_2<=52)) ) {
                        alt12=1;
                    }
                    else if ( (LA12_2==53) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalUSE.g:1154:2: ( ruleInvariantContext )
                    {
                    // InternalUSE.g:1154:2: ( ruleInvariantContext )
                    // InternalUSE.g:1155:3: ruleInvariantContext
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
                    // InternalUSE.g:1160:2: ( ruleOperationContext )
                    {
                    // InternalUSE.g:1160:2: ( ruleOperationContext )
                    // InternalUSE.g:1161:3: ruleOperationContext
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
    // InternalUSE.g:1170:1: rule__ConditionType__Alternatives : ( ( rulePrecondition ) | ( rulePostcondition ) );
    public final void rule__ConditionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1174:1: ( ( rulePrecondition ) | ( rulePostcondition ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==54) ) {
                alt13=1;
            }
            else if ( (LA13_0==55) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalUSE.g:1175:2: ( rulePrecondition )
                    {
                    // InternalUSE.g:1175:2: ( rulePrecondition )
                    // InternalUSE.g:1176:3: rulePrecondition
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
                    // InternalUSE.g:1181:2: ( rulePostcondition )
                    {
                    // InternalUSE.g:1181:2: ( rulePostcondition )
                    // InternalUSE.g:1182:3: rulePostcondition
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
    // InternalUSE.g:1191:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1195:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalUSE.g:1196:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalUSE.g:1203:1: rule__Model__Group__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1207:1: ( ( 'model' ) )
            // InternalUSE.g:1208:1: ( 'model' )
            {
            // InternalUSE.g:1208:1: ( 'model' )
            // InternalUSE.g:1209:2: 'model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalUSE.g:1218:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1222:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalUSE.g:1223:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalUSE.g:1230:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1234:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalUSE.g:1235:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalUSE.g:1235:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalUSE.g:1236:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalUSE.g:1237:2: ( rule__Model__NameAssignment_1 )
            // InternalUSE.g:1237:3: rule__Model__NameAssignment_1
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
    // InternalUSE.g:1245:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1249:1: ( rule__Model__Group__2__Impl )
            // InternalUSE.g:1250:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__2__Impl();

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
    // InternalUSE.g:1256:1: rule__Model__Group__2__Impl : ( ( rule__Model__Group_2__0 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1260:1: ( ( ( rule__Model__Group_2__0 ) ) )
            // InternalUSE.g:1261:1: ( ( rule__Model__Group_2__0 ) )
            {
            // InternalUSE.g:1261:1: ( ( rule__Model__Group_2__0 ) )
            // InternalUSE.g:1262:2: ( rule__Model__Group_2__0 )
            {
             before(grammarAccess.getModelAccess().getGroup_2()); 
            // InternalUSE.g:1263:2: ( rule__Model__Group_2__0 )
            // InternalUSE.g:1263:3: rule__Model__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup_2()); 

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


    // $ANTLR start "rule__Model__Group_2__0"
    // InternalUSE.g:1272:1: rule__Model__Group_2__0 : rule__Model__Group_2__0__Impl rule__Model__Group_2__1 ;
    public final void rule__Model__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1276:1: ( rule__Model__Group_2__0__Impl rule__Model__Group_2__1 )
            // InternalUSE.g:1277:2: rule__Model__Group_2__0__Impl rule__Model__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_2__1();

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
    // $ANTLR end "rule__Model__Group_2__0"


    // $ANTLR start "rule__Model__Group_2__0__Impl"
    // InternalUSE.g:1284:1: rule__Model__Group_2__0__Impl : ( ( rule__Model__EnumsAssignment_2_0 )* ) ;
    public final void rule__Model__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1288:1: ( ( ( rule__Model__EnumsAssignment_2_0 )* ) )
            // InternalUSE.g:1289:1: ( ( rule__Model__EnumsAssignment_2_0 )* )
            {
            // InternalUSE.g:1289:1: ( ( rule__Model__EnumsAssignment_2_0 )* )
            // InternalUSE.g:1290:2: ( rule__Model__EnumsAssignment_2_0 )*
            {
             before(grammarAccess.getModelAccess().getEnumsAssignment_2_0()); 
            // InternalUSE.g:1291:2: ( rule__Model__EnumsAssignment_2_0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==32) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalUSE.g:1291:3: rule__Model__EnumsAssignment_2_0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__EnumsAssignment_2_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getEnumsAssignment_2_0()); 

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
    // $ANTLR end "rule__Model__Group_2__0__Impl"


    // $ANTLR start "rule__Model__Group_2__1"
    // InternalUSE.g:1299:1: rule__Model__Group_2__1 : rule__Model__Group_2__1__Impl rule__Model__Group_2__2 ;
    public final void rule__Model__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1303:1: ( rule__Model__Group_2__1__Impl rule__Model__Group_2__2 )
            // InternalUSE.g:1304:2: rule__Model__Group_2__1__Impl rule__Model__Group_2__2
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_2__2();

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
    // $ANTLR end "rule__Model__Group_2__1"


    // $ANTLR start "rule__Model__Group_2__1__Impl"
    // InternalUSE.g:1311:1: rule__Model__Group_2__1__Impl : ( ( rule__Model__PackagedElementAssignment_2_1 )* ) ;
    public final void rule__Model__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1315:1: ( ( ( rule__Model__PackagedElementAssignment_2_1 )* ) )
            // InternalUSE.g:1316:1: ( ( rule__Model__PackagedElementAssignment_2_1 )* )
            {
            // InternalUSE.g:1316:1: ( ( rule__Model__PackagedElementAssignment_2_1 )* )
            // InternalUSE.g:1317:2: ( rule__Model__PackagedElementAssignment_2_1 )*
            {
             before(grammarAccess.getModelAccess().getPackagedElementAssignment_2_1()); 
            // InternalUSE.g:1318:2: ( rule__Model__PackagedElementAssignment_2_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=26 && LA15_0<=28)||LA15_0==35||LA15_0==42||LA15_0==56) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalUSE.g:1318:3: rule__Model__PackagedElementAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Model__PackagedElementAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getPackagedElementAssignment_2_1()); 

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
    // $ANTLR end "rule__Model__Group_2__1__Impl"


    // $ANTLR start "rule__Model__Group_2__2"
    // InternalUSE.g:1326:1: rule__Model__Group_2__2 : rule__Model__Group_2__2__Impl ;
    public final void rule__Model__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1330:1: ( rule__Model__Group_2__2__Impl )
            // InternalUSE.g:1331:2: rule__Model__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_2__2__Impl();

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
    // $ANTLR end "rule__Model__Group_2__2"


    // $ANTLR start "rule__Model__Group_2__2__Impl"
    // InternalUSE.g:1337:1: rule__Model__Group_2__2__Impl : ( ( rule__Model__ConstraintsAssignment_2_2 )? ) ;
    public final void rule__Model__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1341:1: ( ( ( rule__Model__ConstraintsAssignment_2_2 )? ) )
            // InternalUSE.g:1342:1: ( ( rule__Model__ConstraintsAssignment_2_2 )? )
            {
            // InternalUSE.g:1342:1: ( ( rule__Model__ConstraintsAssignment_2_2 )? )
            // InternalUSE.g:1343:2: ( rule__Model__ConstraintsAssignment_2_2 )?
            {
             before(grammarAccess.getModelAccess().getConstraintsAssignment_2_2()); 
            // InternalUSE.g:1344:2: ( rule__Model__ConstraintsAssignment_2_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==50) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalUSE.g:1344:3: rule__Model__ConstraintsAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ConstraintsAssignment_2_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getConstraintsAssignment_2_2()); 

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
    // $ANTLR end "rule__Model__Group_2__2__Impl"


    // $ANTLR start "rule__Multiplicity__Group__0"
    // InternalUSE.g:1353:1: rule__Multiplicity__Group__0 : rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1 ;
    public final void rule__Multiplicity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1357:1: ( rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1 )
            // InternalUSE.g:1358:2: rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalUSE.g:1365:1: rule__Multiplicity__Group__0__Impl : ( ( rule__Multiplicity__MinValueAssignment_0 ) ) ;
    public final void rule__Multiplicity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1369:1: ( ( ( rule__Multiplicity__MinValueAssignment_0 ) ) )
            // InternalUSE.g:1370:1: ( ( rule__Multiplicity__MinValueAssignment_0 ) )
            {
            // InternalUSE.g:1370:1: ( ( rule__Multiplicity__MinValueAssignment_0 ) )
            // InternalUSE.g:1371:2: ( rule__Multiplicity__MinValueAssignment_0 )
            {
             before(grammarAccess.getMultiplicityAccess().getMinValueAssignment_0()); 
            // InternalUSE.g:1372:2: ( rule__Multiplicity__MinValueAssignment_0 )
            // InternalUSE.g:1372:3: rule__Multiplicity__MinValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicity__MinValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityAccess().getMinValueAssignment_0()); 

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
    // InternalUSE.g:1380:1: rule__Multiplicity__Group__1 : rule__Multiplicity__Group__1__Impl rule__Multiplicity__Group__2 ;
    public final void rule__Multiplicity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1384:1: ( rule__Multiplicity__Group__1__Impl rule__Multiplicity__Group__2 )
            // InternalUSE.g:1385:2: rule__Multiplicity__Group__1__Impl rule__Multiplicity__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalUSE.g:1392:1: rule__Multiplicity__Group__1__Impl : ( ( rule__Multiplicity__Group_1__0 )? ) ;
    public final void rule__Multiplicity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1396:1: ( ( ( rule__Multiplicity__Group_1__0 )? ) )
            // InternalUSE.g:1397:1: ( ( rule__Multiplicity__Group_1__0 )? )
            {
            // InternalUSE.g:1397:1: ( ( rule__Multiplicity__Group_1__0 )? )
            // InternalUSE.g:1398:2: ( rule__Multiplicity__Group_1__0 )?
            {
             before(grammarAccess.getMultiplicityAccess().getGroup_1()); 
            // InternalUSE.g:1399:2: ( rule__Multiplicity__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUSE.g:1399:3: rule__Multiplicity__Group_1__0
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
    // InternalUSE.g:1407:1: rule__Multiplicity__Group__2 : rule__Multiplicity__Group__2__Impl ;
    public final void rule__Multiplicity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1411:1: ( rule__Multiplicity__Group__2__Impl )
            // InternalUSE.g:1412:2: rule__Multiplicity__Group__2__Impl
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
    // InternalUSE.g:1418:1: rule__Multiplicity__Group__2__Impl : ( ( rule__Multiplicity__Group_2__0 )* ) ;
    public final void rule__Multiplicity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1422:1: ( ( ( rule__Multiplicity__Group_2__0 )* ) )
            // InternalUSE.g:1423:1: ( ( rule__Multiplicity__Group_2__0 )* )
            {
            // InternalUSE.g:1423:1: ( ( rule__Multiplicity__Group_2__0 )* )
            // InternalUSE.g:1424:2: ( rule__Multiplicity__Group_2__0 )*
            {
             before(grammarAccess.getMultiplicityAccess().getGroup_2()); 
            // InternalUSE.g:1425:2: ( rule__Multiplicity__Group_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==31) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalUSE.g:1425:3: rule__Multiplicity__Group_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Multiplicity__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalUSE.g:1434:1: rule__Multiplicity__Group_1__0 : rule__Multiplicity__Group_1__0__Impl rule__Multiplicity__Group_1__1 ;
    public final void rule__Multiplicity__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1438:1: ( rule__Multiplicity__Group_1__0__Impl rule__Multiplicity__Group_1__1 )
            // InternalUSE.g:1439:2: rule__Multiplicity__Group_1__0__Impl rule__Multiplicity__Group_1__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalUSE.g:1446:1: rule__Multiplicity__Group_1__0__Impl : ( '..' ) ;
    public final void rule__Multiplicity__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1450:1: ( ( '..' ) )
            // InternalUSE.g:1451:1: ( '..' )
            {
            // InternalUSE.g:1451:1: ( '..' )
            // InternalUSE.g:1452:2: '..'
            {
             before(grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalUSE.g:1461:1: rule__Multiplicity__Group_1__1 : rule__Multiplicity__Group_1__1__Impl ;
    public final void rule__Multiplicity__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1465:1: ( rule__Multiplicity__Group_1__1__Impl )
            // InternalUSE.g:1466:2: rule__Multiplicity__Group_1__1__Impl
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
    // InternalUSE.g:1472:1: rule__Multiplicity__Group_1__1__Impl : ( ( rule__Multiplicity__MaxValueAssignment_1_1 ) ) ;
    public final void rule__Multiplicity__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1476:1: ( ( ( rule__Multiplicity__MaxValueAssignment_1_1 ) ) )
            // InternalUSE.g:1477:1: ( ( rule__Multiplicity__MaxValueAssignment_1_1 ) )
            {
            // InternalUSE.g:1477:1: ( ( rule__Multiplicity__MaxValueAssignment_1_1 ) )
            // InternalUSE.g:1478:2: ( rule__Multiplicity__MaxValueAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicityAccess().getMaxValueAssignment_1_1()); 
            // InternalUSE.g:1479:2: ( rule__Multiplicity__MaxValueAssignment_1_1 )
            // InternalUSE.g:1479:3: rule__Multiplicity__MaxValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicity__MaxValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityAccess().getMaxValueAssignment_1_1()); 

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
    // InternalUSE.g:1488:1: rule__Multiplicity__Group_2__0 : rule__Multiplicity__Group_2__0__Impl rule__Multiplicity__Group_2__1 ;
    public final void rule__Multiplicity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1492:1: ( rule__Multiplicity__Group_2__0__Impl rule__Multiplicity__Group_2__1 )
            // InternalUSE.g:1493:2: rule__Multiplicity__Group_2__0__Impl rule__Multiplicity__Group_2__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalUSE.g:1500:1: rule__Multiplicity__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Multiplicity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1504:1: ( ( ',' ) )
            // InternalUSE.g:1505:1: ( ',' )
            {
            // InternalUSE.g:1505:1: ( ',' )
            // InternalUSE.g:1506:2: ','
            {
             before(grammarAccess.getMultiplicityAccess().getCommaKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalUSE.g:1515:1: rule__Multiplicity__Group_2__1 : rule__Multiplicity__Group_2__1__Impl rule__Multiplicity__Group_2__2 ;
    public final void rule__Multiplicity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1519:1: ( rule__Multiplicity__Group_2__1__Impl rule__Multiplicity__Group_2__2 )
            // InternalUSE.g:1520:2: rule__Multiplicity__Group_2__1__Impl rule__Multiplicity__Group_2__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalUSE.g:1527:1: rule__Multiplicity__Group_2__1__Impl : ( ( rule__Multiplicity__MinValueAssignment_2_1 ) ) ;
    public final void rule__Multiplicity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1531:1: ( ( ( rule__Multiplicity__MinValueAssignment_2_1 ) ) )
            // InternalUSE.g:1532:1: ( ( rule__Multiplicity__MinValueAssignment_2_1 ) )
            {
            // InternalUSE.g:1532:1: ( ( rule__Multiplicity__MinValueAssignment_2_1 ) )
            // InternalUSE.g:1533:2: ( rule__Multiplicity__MinValueAssignment_2_1 )
            {
             before(grammarAccess.getMultiplicityAccess().getMinValueAssignment_2_1()); 
            // InternalUSE.g:1534:2: ( rule__Multiplicity__MinValueAssignment_2_1 )
            // InternalUSE.g:1534:3: rule__Multiplicity__MinValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicity__MinValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityAccess().getMinValueAssignment_2_1()); 

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
    // InternalUSE.g:1542:1: rule__Multiplicity__Group_2__2 : rule__Multiplicity__Group_2__2__Impl ;
    public final void rule__Multiplicity__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1546:1: ( rule__Multiplicity__Group_2__2__Impl )
            // InternalUSE.g:1547:2: rule__Multiplicity__Group_2__2__Impl
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
    // InternalUSE.g:1553:1: rule__Multiplicity__Group_2__2__Impl : ( ( rule__Multiplicity__Group_2_2__0 )? ) ;
    public final void rule__Multiplicity__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1557:1: ( ( ( rule__Multiplicity__Group_2_2__0 )? ) )
            // InternalUSE.g:1558:1: ( ( rule__Multiplicity__Group_2_2__0 )? )
            {
            // InternalUSE.g:1558:1: ( ( rule__Multiplicity__Group_2_2__0 )? )
            // InternalUSE.g:1559:2: ( rule__Multiplicity__Group_2_2__0 )?
            {
             before(grammarAccess.getMultiplicityAccess().getGroup_2_2()); 
            // InternalUSE.g:1560:2: ( rule__Multiplicity__Group_2_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUSE.g:1560:3: rule__Multiplicity__Group_2_2__0
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
    // InternalUSE.g:1569:1: rule__Multiplicity__Group_2_2__0 : rule__Multiplicity__Group_2_2__0__Impl rule__Multiplicity__Group_2_2__1 ;
    public final void rule__Multiplicity__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1573:1: ( rule__Multiplicity__Group_2_2__0__Impl rule__Multiplicity__Group_2_2__1 )
            // InternalUSE.g:1574:2: rule__Multiplicity__Group_2_2__0__Impl rule__Multiplicity__Group_2_2__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalUSE.g:1581:1: rule__Multiplicity__Group_2_2__0__Impl : ( '..' ) ;
    public final void rule__Multiplicity__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1585:1: ( ( '..' ) )
            // InternalUSE.g:1586:1: ( '..' )
            {
            // InternalUSE.g:1586:1: ( '..' )
            // InternalUSE.g:1587:2: '..'
            {
             before(grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_2_2_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalUSE.g:1596:1: rule__Multiplicity__Group_2_2__1 : rule__Multiplicity__Group_2_2__1__Impl ;
    public final void rule__Multiplicity__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1600:1: ( rule__Multiplicity__Group_2_2__1__Impl )
            // InternalUSE.g:1601:2: rule__Multiplicity__Group_2_2__1__Impl
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
    // InternalUSE.g:1607:1: rule__Multiplicity__Group_2_2__1__Impl : ( ( rule__Multiplicity__MaxValueAssignment_2_2_1 ) ) ;
    public final void rule__Multiplicity__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1611:1: ( ( ( rule__Multiplicity__MaxValueAssignment_2_2_1 ) ) )
            // InternalUSE.g:1612:1: ( ( rule__Multiplicity__MaxValueAssignment_2_2_1 ) )
            {
            // InternalUSE.g:1612:1: ( ( rule__Multiplicity__MaxValueAssignment_2_2_1 ) )
            // InternalUSE.g:1613:2: ( rule__Multiplicity__MaxValueAssignment_2_2_1 )
            {
             before(grammarAccess.getMultiplicityAccess().getMaxValueAssignment_2_2_1()); 
            // InternalUSE.g:1614:2: ( rule__Multiplicity__MaxValueAssignment_2_2_1 )
            // InternalUSE.g:1614:3: rule__Multiplicity__MaxValueAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicity__MaxValueAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityAccess().getMaxValueAssignment_2_2_1()); 

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


    // $ANTLR start "rule__Enum__Group__0"
    // InternalUSE.g:1623:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1627:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // InternalUSE.g:1628:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Enum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enum__Group__1();

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
    // $ANTLR end "rule__Enum__Group__0"


    // $ANTLR start "rule__Enum__Group__0__Impl"
    // InternalUSE.g:1635:1: rule__Enum__Group__0__Impl : ( 'enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1639:1: ( ( 'enum' ) )
            // InternalUSE.g:1640:1: ( 'enum' )
            {
            // InternalUSE.g:1640:1: ( 'enum' )
            // InternalUSE.g:1641:2: 'enum'
            {
             before(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEnumAccess().getEnumKeyword_0()); 

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
    // $ANTLR end "rule__Enum__Group__0__Impl"


    // $ANTLR start "rule__Enum__Group__1"
    // InternalUSE.g:1650:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1654:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // InternalUSE.g:1655:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Enum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enum__Group__2();

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
    // $ANTLR end "rule__Enum__Group__1"


    // $ANTLR start "rule__Enum__Group__1__Impl"
    // InternalUSE.g:1662:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__NameAssignment_1 )? ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1666:1: ( ( ( rule__Enum__NameAssignment_1 )? ) )
            // InternalUSE.g:1667:1: ( ( rule__Enum__NameAssignment_1 )? )
            {
            // InternalUSE.g:1667:1: ( ( rule__Enum__NameAssignment_1 )? )
            // InternalUSE.g:1668:2: ( rule__Enum__NameAssignment_1 )?
            {
             before(grammarAccess.getEnumAccess().getNameAssignment_1()); 
            // InternalUSE.g:1669:2: ( rule__Enum__NameAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUSE.g:1669:3: rule__Enum__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Enum__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Enum__Group__1__Impl"


    // $ANTLR start "rule__Enum__Group__2"
    // InternalUSE.g:1677:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1681:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // InternalUSE.g:1682:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Enum__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enum__Group__3();

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
    // $ANTLR end "rule__Enum__Group__2"


    // $ANTLR start "rule__Enum__Group__2__Impl"
    // InternalUSE.g:1689:1: rule__Enum__Group__2__Impl : ( '{' ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1693:1: ( ( '{' ) )
            // InternalUSE.g:1694:1: ( '{' )
            {
            // InternalUSE.g:1694:1: ( '{' )
            // InternalUSE.g:1695:2: '{'
            {
             before(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Enum__Group__2__Impl"


    // $ANTLR start "rule__Enum__Group__3"
    // InternalUSE.g:1704:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl rule__Enum__Group__4 ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1708:1: ( rule__Enum__Group__3__Impl rule__Enum__Group__4 )
            // InternalUSE.g:1709:2: rule__Enum__Group__3__Impl rule__Enum__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Enum__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enum__Group__4();

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
    // $ANTLR end "rule__Enum__Group__3"


    // $ANTLR start "rule__Enum__Group__3__Impl"
    // InternalUSE.g:1716:1: rule__Enum__Group__3__Impl : ( ( ( rule__Enum__ElementsAssignment_3 ) ) ( ( rule__Enum__ElementsAssignment_3 )* ) ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1720:1: ( ( ( ( rule__Enum__ElementsAssignment_3 ) ) ( ( rule__Enum__ElementsAssignment_3 )* ) ) )
            // InternalUSE.g:1721:1: ( ( ( rule__Enum__ElementsAssignment_3 ) ) ( ( rule__Enum__ElementsAssignment_3 )* ) )
            {
            // InternalUSE.g:1721:1: ( ( ( rule__Enum__ElementsAssignment_3 ) ) ( ( rule__Enum__ElementsAssignment_3 )* ) )
            // InternalUSE.g:1722:2: ( ( rule__Enum__ElementsAssignment_3 ) ) ( ( rule__Enum__ElementsAssignment_3 )* )
            {
            // InternalUSE.g:1722:2: ( ( rule__Enum__ElementsAssignment_3 ) )
            // InternalUSE.g:1723:3: ( rule__Enum__ElementsAssignment_3 )
            {
             before(grammarAccess.getEnumAccess().getElementsAssignment_3()); 
            // InternalUSE.g:1724:3: ( rule__Enum__ElementsAssignment_3 )
            // InternalUSE.g:1724:4: rule__Enum__ElementsAssignment_3
            {
            pushFollow(FOLLOW_14);
            rule__Enum__ElementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getElementsAssignment_3()); 

            }

            // InternalUSE.g:1727:2: ( ( rule__Enum__ElementsAssignment_3 )* )
            // InternalUSE.g:1728:3: ( rule__Enum__ElementsAssignment_3 )*
            {
             before(grammarAccess.getEnumAccess().getElementsAssignment_3()); 
            // InternalUSE.g:1729:3: ( rule__Enum__ElementsAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalUSE.g:1729:4: rule__Enum__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Enum__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getEnumAccess().getElementsAssignment_3()); 

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
    // $ANTLR end "rule__Enum__Group__3__Impl"


    // $ANTLR start "rule__Enum__Group__4"
    // InternalUSE.g:1738:1: rule__Enum__Group__4 : rule__Enum__Group__4__Impl ;
    public final void rule__Enum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1742:1: ( rule__Enum__Group__4__Impl )
            // InternalUSE.g:1743:2: rule__Enum__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enum__Group__4__Impl();

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
    // $ANTLR end "rule__Enum__Group__4"


    // $ANTLR start "rule__Enum__Group__4__Impl"
    // InternalUSE.g:1749:1: rule__Enum__Group__4__Impl : ( '}' ) ;
    public final void rule__Enum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1753:1: ( ( '}' ) )
            // InternalUSE.g:1754:1: ( '}' )
            {
            // InternalUSE.g:1754:1: ( '}' )
            // InternalUSE.g:1755:2: '}'
            {
             before(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Enum__Group__4__Impl"


    // $ANTLR start "rule__EnumElement__Group__0"
    // InternalUSE.g:1765:1: rule__EnumElement__Group__0 : rule__EnumElement__Group__0__Impl rule__EnumElement__Group__1 ;
    public final void rule__EnumElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1769:1: ( rule__EnumElement__Group__0__Impl rule__EnumElement__Group__1 )
            // InternalUSE.g:1770:2: rule__EnumElement__Group__0__Impl rule__EnumElement__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__EnumElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumElement__Group__1();

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
    // $ANTLR end "rule__EnumElement__Group__0"


    // $ANTLR start "rule__EnumElement__Group__0__Impl"
    // InternalUSE.g:1777:1: rule__EnumElement__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__EnumElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1781:1: ( ( RULE_ID ) )
            // InternalUSE.g:1782:1: ( RULE_ID )
            {
            // InternalUSE.g:1782:1: ( RULE_ID )
            // InternalUSE.g:1783:2: RULE_ID
            {
             before(grammarAccess.getEnumElementAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumElementAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__EnumElement__Group__0__Impl"


    // $ANTLR start "rule__EnumElement__Group__1"
    // InternalUSE.g:1792:1: rule__EnumElement__Group__1 : rule__EnumElement__Group__1__Impl ;
    public final void rule__EnumElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1796:1: ( rule__EnumElement__Group__1__Impl )
            // InternalUSE.g:1797:2: rule__EnumElement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumElement__Group__1__Impl();

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
    // $ANTLR end "rule__EnumElement__Group__1"


    // $ANTLR start "rule__EnumElement__Group__1__Impl"
    // InternalUSE.g:1803:1: rule__EnumElement__Group__1__Impl : ( ( ',' )? ) ;
    public final void rule__EnumElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1807:1: ( ( ( ',' )? ) )
            // InternalUSE.g:1808:1: ( ( ',' )? )
            {
            // InternalUSE.g:1808:1: ( ( ',' )? )
            // InternalUSE.g:1809:2: ( ',' )?
            {
             before(grammarAccess.getEnumElementAccess().getCommaKeyword_1()); 
            // InternalUSE.g:1810:2: ( ',' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUSE.g:1810:3: ','
                    {
                    match(input,31,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEnumElementAccess().getCommaKeyword_1()); 

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
    // $ANTLR end "rule__EnumElement__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // InternalUSE.g:1819:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1823:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalUSE.g:1824:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalUSE.g:1831:1: rule__Class__Group__0__Impl : ( ( rule__Class__AbstractAssignment_0 )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1835:1: ( ( ( rule__Class__AbstractAssignment_0 )? ) )
            // InternalUSE.g:1836:1: ( ( rule__Class__AbstractAssignment_0 )? )
            {
            // InternalUSE.g:1836:1: ( ( rule__Class__AbstractAssignment_0 )? )
            // InternalUSE.g:1837:2: ( rule__Class__AbstractAssignment_0 )?
            {
             before(grammarAccess.getClassAccess().getAbstractAssignment_0()); 
            // InternalUSE.g:1838:2: ( rule__Class__AbstractAssignment_0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==56) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalUSE.g:1838:3: rule__Class__AbstractAssignment_0
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
    // InternalUSE.g:1846:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1850:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalUSE.g:1851:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalUSE.g:1858:1: rule__Class__Group__1__Impl : ( 'class' ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1862:1: ( ( 'class' ) )
            // InternalUSE.g:1863:1: ( 'class' )
            {
            // InternalUSE.g:1863:1: ( 'class' )
            // InternalUSE.g:1864:2: 'class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalUSE.g:1873:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1877:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalUSE.g:1878:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalUSE.g:1885:1: rule__Class__Group__2__Impl : ( ( rule__Class__NameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1889:1: ( ( ( rule__Class__NameAssignment_2 ) ) )
            // InternalUSE.g:1890:1: ( ( rule__Class__NameAssignment_2 ) )
            {
            // InternalUSE.g:1890:1: ( ( rule__Class__NameAssignment_2 ) )
            // InternalUSE.g:1891:2: ( rule__Class__NameAssignment_2 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_2()); 
            // InternalUSE.g:1892:2: ( rule__Class__NameAssignment_2 )
            // InternalUSE.g:1892:3: rule__Class__NameAssignment_2
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
    // InternalUSE.g:1900:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1904:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalUSE.g:1905:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalUSE.g:1912:1: rule__Class__Group__3__Impl : ( ( rule__Class__Group_3__0 )? ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1916:1: ( ( ( rule__Class__Group_3__0 )? ) )
            // InternalUSE.g:1917:1: ( ( rule__Class__Group_3__0 )? )
            {
            // InternalUSE.g:1917:1: ( ( rule__Class__Group_3__0 )? )
            // InternalUSE.g:1918:2: ( rule__Class__Group_3__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_3()); 
            // InternalUSE.g:1919:2: ( rule__Class__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==37) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUSE.g:1919:3: rule__Class__Group_3__0
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
    // InternalUSE.g:1927:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1931:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalUSE.g:1932:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalUSE.g:1939:1: rule__Class__Group__4__Impl : ( ( rule__Class__AttributesAssignment_4 )? ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1943:1: ( ( ( rule__Class__AttributesAssignment_4 )? ) )
            // InternalUSE.g:1944:1: ( ( rule__Class__AttributesAssignment_4 )? )
            {
            // InternalUSE.g:1944:1: ( ( rule__Class__AttributesAssignment_4 )? )
            // InternalUSE.g:1945:2: ( rule__Class__AttributesAssignment_4 )?
            {
             before(grammarAccess.getClassAccess().getAttributesAssignment_4()); 
            // InternalUSE.g:1946:2: ( rule__Class__AttributesAssignment_4 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==43) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUSE.g:1946:3: rule__Class__AttributesAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__AttributesAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getAttributesAssignment_4()); 

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
    // InternalUSE.g:1954:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1958:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalUSE.g:1959:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_17);
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
    // InternalUSE.g:1966:1: rule__Class__Group__5__Impl : ( ( rule__Class__OperationsAssignment_5 )? ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1970:1: ( ( ( rule__Class__OperationsAssignment_5 )? ) )
            // InternalUSE.g:1971:1: ( ( rule__Class__OperationsAssignment_5 )? )
            {
            // InternalUSE.g:1971:1: ( ( rule__Class__OperationsAssignment_5 )? )
            // InternalUSE.g:1972:2: ( rule__Class__OperationsAssignment_5 )?
            {
             before(grammarAccess.getClassAccess().getOperationsAssignment_5()); 
            // InternalUSE.g:1973:2: ( rule__Class__OperationsAssignment_5 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==45) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalUSE.g:1973:3: rule__Class__OperationsAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__OperationsAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getOperationsAssignment_5()); 

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
    // InternalUSE.g:1981:1: rule__Class__Group__6 : rule__Class__Group__6__Impl rule__Class__Group__7 ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1985:1: ( rule__Class__Group__6__Impl rule__Class__Group__7 )
            // InternalUSE.g:1986:2: rule__Class__Group__6__Impl rule__Class__Group__7
            {
            pushFollow(FOLLOW_17);
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
    // InternalUSE.g:1993:1: rule__Class__Group__6__Impl : ( ( rule__Class__ConstraintsAssignment_6 )? ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1997:1: ( ( ( rule__Class__ConstraintsAssignment_6 )? ) )
            // InternalUSE.g:1998:1: ( ( rule__Class__ConstraintsAssignment_6 )? )
            {
            // InternalUSE.g:1998:1: ( ( rule__Class__ConstraintsAssignment_6 )? )
            // InternalUSE.g:1999:2: ( rule__Class__ConstraintsAssignment_6 )?
            {
             before(grammarAccess.getClassAccess().getConstraintsAssignment_6()); 
            // InternalUSE.g:2000:2: ( rule__Class__ConstraintsAssignment_6 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==50) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUSE.g:2000:3: rule__Class__ConstraintsAssignment_6
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
    // InternalUSE.g:2008:1: rule__Class__Group__7 : rule__Class__Group__7__Impl ;
    public final void rule__Class__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2012:1: ( rule__Class__Group__7__Impl )
            // InternalUSE.g:2013:2: rule__Class__Group__7__Impl
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
    // InternalUSE.g:2019:1: rule__Class__Group__7__Impl : ( 'end' ) ;
    public final void rule__Class__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2023:1: ( ( 'end' ) )
            // InternalUSE.g:2024:1: ( 'end' )
            {
            // InternalUSE.g:2024:1: ( 'end' )
            // InternalUSE.g:2025:2: 'end'
            {
             before(grammarAccess.getClassAccess().getEndKeyword_7()); 
            match(input,36,FOLLOW_2); 
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
    // InternalUSE.g:2035:1: rule__Class__Group_3__0 : rule__Class__Group_3__0__Impl rule__Class__Group_3__1 ;
    public final void rule__Class__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2039:1: ( rule__Class__Group_3__0__Impl rule__Class__Group_3__1 )
            // InternalUSE.g:2040:2: rule__Class__Group_3__0__Impl rule__Class__Group_3__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalUSE.g:2047:1: rule__Class__Group_3__0__Impl : ( '<' ) ;
    public final void rule__Class__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2051:1: ( ( '<' ) )
            // InternalUSE.g:2052:1: ( '<' )
            {
            // InternalUSE.g:2052:1: ( '<' )
            // InternalUSE.g:2053:2: '<'
            {
             before(grammarAccess.getClassAccess().getLessThanSignKeyword_3_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalUSE.g:2062:1: rule__Class__Group_3__1 : rule__Class__Group_3__1__Impl ;
    public final void rule__Class__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2066:1: ( rule__Class__Group_3__1__Impl )
            // InternalUSE.g:2067:2: rule__Class__Group_3__1__Impl
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
    // InternalUSE.g:2073:1: rule__Class__Group_3__1__Impl : ( ( ( rule__Class__GeneralizationAssignment_3_1 ) ) ( ( rule__Class__GeneralizationAssignment_3_1 )* ) ) ;
    public final void rule__Class__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2077:1: ( ( ( ( rule__Class__GeneralizationAssignment_3_1 ) ) ( ( rule__Class__GeneralizationAssignment_3_1 )* ) ) )
            // InternalUSE.g:2078:1: ( ( ( rule__Class__GeneralizationAssignment_3_1 ) ) ( ( rule__Class__GeneralizationAssignment_3_1 )* ) )
            {
            // InternalUSE.g:2078:1: ( ( ( rule__Class__GeneralizationAssignment_3_1 ) ) ( ( rule__Class__GeneralizationAssignment_3_1 )* ) )
            // InternalUSE.g:2079:2: ( ( rule__Class__GeneralizationAssignment_3_1 ) ) ( ( rule__Class__GeneralizationAssignment_3_1 )* )
            {
            // InternalUSE.g:2079:2: ( ( rule__Class__GeneralizationAssignment_3_1 ) )
            // InternalUSE.g:2080:3: ( rule__Class__GeneralizationAssignment_3_1 )
            {
             before(grammarAccess.getClassAccess().getGeneralizationAssignment_3_1()); 
            // InternalUSE.g:2081:3: ( rule__Class__GeneralizationAssignment_3_1 )
            // InternalUSE.g:2081:4: rule__Class__GeneralizationAssignment_3_1
            {
            pushFollow(FOLLOW_14);
            rule__Class__GeneralizationAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGeneralizationAssignment_3_1()); 

            }

            // InternalUSE.g:2084:2: ( ( rule__Class__GeneralizationAssignment_3_1 )* )
            // InternalUSE.g:2085:3: ( rule__Class__GeneralizationAssignment_3_1 )*
            {
             before(grammarAccess.getClassAccess().getGeneralizationAssignment_3_1()); 
            // InternalUSE.g:2086:3: ( rule__Class__GeneralizationAssignment_3_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalUSE.g:2086:4: rule__Class__GeneralizationAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Class__GeneralizationAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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


    // $ANTLR start "rule__Generalization__Group__0"
    // InternalUSE.g:2096:1: rule__Generalization__Group__0 : rule__Generalization__Group__0__Impl rule__Generalization__Group__1 ;
    public final void rule__Generalization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2100:1: ( rule__Generalization__Group__0__Impl rule__Generalization__Group__1 )
            // InternalUSE.g:2101:2: rule__Generalization__Group__0__Impl rule__Generalization__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalUSE.g:2108:1: rule__Generalization__Group__0__Impl : ( ( rule__Generalization__GeneralAssignment_0 ) ) ;
    public final void rule__Generalization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2112:1: ( ( ( rule__Generalization__GeneralAssignment_0 ) ) )
            // InternalUSE.g:2113:1: ( ( rule__Generalization__GeneralAssignment_0 ) )
            {
            // InternalUSE.g:2113:1: ( ( rule__Generalization__GeneralAssignment_0 ) )
            // InternalUSE.g:2114:2: ( rule__Generalization__GeneralAssignment_0 )
            {
             before(grammarAccess.getGeneralizationAccess().getGeneralAssignment_0()); 
            // InternalUSE.g:2115:2: ( rule__Generalization__GeneralAssignment_0 )
            // InternalUSE.g:2115:3: rule__Generalization__GeneralAssignment_0
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
    // InternalUSE.g:2123:1: rule__Generalization__Group__1 : rule__Generalization__Group__1__Impl ;
    public final void rule__Generalization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2127:1: ( rule__Generalization__Group__1__Impl )
            // InternalUSE.g:2128:2: rule__Generalization__Group__1__Impl
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
    // InternalUSE.g:2134:1: rule__Generalization__Group__1__Impl : ( ( ',' )? ) ;
    public final void rule__Generalization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2138:1: ( ( ( ',' )? ) )
            // InternalUSE.g:2139:1: ( ( ',' )? )
            {
            // InternalUSE.g:2139:1: ( ( ',' )? )
            // InternalUSE.g:2140:2: ( ',' )?
            {
             before(grammarAccess.getGeneralizationAccess().getCommaKeyword_1()); 
            // InternalUSE.g:2141:2: ( ',' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==31) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalUSE.g:2141:3: ','
                    {
                    match(input,31,FOLLOW_2); 

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
    // InternalUSE.g:2150:1: rule__Association__Group__0 : rule__Association__Group__0__Impl rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2154:1: ( rule__Association__Group__0__Impl rule__Association__Group__1 )
            // InternalUSE.g:2155:2: rule__Association__Group__0__Impl rule__Association__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalUSE.g:2162:1: rule__Association__Group__0__Impl : ( ( rule__Association__TypeAssociationAssignment_0 ) ) ;
    public final void rule__Association__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2166:1: ( ( ( rule__Association__TypeAssociationAssignment_0 ) ) )
            // InternalUSE.g:2167:1: ( ( rule__Association__TypeAssociationAssignment_0 ) )
            {
            // InternalUSE.g:2167:1: ( ( rule__Association__TypeAssociationAssignment_0 ) )
            // InternalUSE.g:2168:2: ( rule__Association__TypeAssociationAssignment_0 )
            {
             before(grammarAccess.getAssociationAccess().getTypeAssociationAssignment_0()); 
            // InternalUSE.g:2169:2: ( rule__Association__TypeAssociationAssignment_0 )
            // InternalUSE.g:2169:3: rule__Association__TypeAssociationAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Association__TypeAssociationAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getTypeAssociationAssignment_0()); 

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
    // InternalUSE.g:2177:1: rule__Association__Group__1 : rule__Association__Group__1__Impl rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2181:1: ( rule__Association__Group__1__Impl rule__Association__Group__2 )
            // InternalUSE.g:2182:2: rule__Association__Group__1__Impl rule__Association__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalUSE.g:2189:1: rule__Association__Group__1__Impl : ( ( rule__Association__NameAssignment_1 ) ) ;
    public final void rule__Association__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2193:1: ( ( ( rule__Association__NameAssignment_1 ) ) )
            // InternalUSE.g:2194:1: ( ( rule__Association__NameAssignment_1 ) )
            {
            // InternalUSE.g:2194:1: ( ( rule__Association__NameAssignment_1 ) )
            // InternalUSE.g:2195:2: ( rule__Association__NameAssignment_1 )
            {
             before(grammarAccess.getAssociationAccess().getNameAssignment_1()); 
            // InternalUSE.g:2196:2: ( rule__Association__NameAssignment_1 )
            // InternalUSE.g:2196:3: rule__Association__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Association__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getNameAssignment_1()); 

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
    // InternalUSE.g:2204:1: rule__Association__Group__2 : rule__Association__Group__2__Impl rule__Association__Group__3 ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2208:1: ( rule__Association__Group__2__Impl rule__Association__Group__3 )
            // InternalUSE.g:2209:2: rule__Association__Group__2__Impl rule__Association__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Association__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__3();

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
    // InternalUSE.g:2216:1: rule__Association__Group__2__Impl : ( 'between' ) ;
    public final void rule__Association__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2220:1: ( ( 'between' ) )
            // InternalUSE.g:2221:1: ( 'between' )
            {
            // InternalUSE.g:2221:1: ( 'between' )
            // InternalUSE.g:2222:2: 'between'
            {
             before(grammarAccess.getAssociationAccess().getBetweenKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getBetweenKeyword_2()); 

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


    // $ANTLR start "rule__Association__Group__3"
    // InternalUSE.g:2231:1: rule__Association__Group__3 : rule__Association__Group__3__Impl rule__Association__Group__4 ;
    public final void rule__Association__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2235:1: ( rule__Association__Group__3__Impl rule__Association__Group__4 )
            // InternalUSE.g:2236:2: rule__Association__Group__3__Impl rule__Association__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Association__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__4();

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
    // $ANTLR end "rule__Association__Group__3"


    // $ANTLR start "rule__Association__Group__3__Impl"
    // InternalUSE.g:2243:1: rule__Association__Group__3__Impl : ( ( ( rule__Association__AssociationEndsAssignment_3 ) ) ( ( rule__Association__AssociationEndsAssignment_3 )* ) ) ;
    public final void rule__Association__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2247:1: ( ( ( ( rule__Association__AssociationEndsAssignment_3 ) ) ( ( rule__Association__AssociationEndsAssignment_3 )* ) ) )
            // InternalUSE.g:2248:1: ( ( ( rule__Association__AssociationEndsAssignment_3 ) ) ( ( rule__Association__AssociationEndsAssignment_3 )* ) )
            {
            // InternalUSE.g:2248:1: ( ( ( rule__Association__AssociationEndsAssignment_3 ) ) ( ( rule__Association__AssociationEndsAssignment_3 )* ) )
            // InternalUSE.g:2249:2: ( ( rule__Association__AssociationEndsAssignment_3 ) ) ( ( rule__Association__AssociationEndsAssignment_3 )* )
            {
            // InternalUSE.g:2249:2: ( ( rule__Association__AssociationEndsAssignment_3 ) )
            // InternalUSE.g:2250:3: ( rule__Association__AssociationEndsAssignment_3 )
            {
             before(grammarAccess.getAssociationAccess().getAssociationEndsAssignment_3()); 
            // InternalUSE.g:2251:3: ( rule__Association__AssociationEndsAssignment_3 )
            // InternalUSE.g:2251:4: rule__Association__AssociationEndsAssignment_3
            {
            pushFollow(FOLLOW_14);
            rule__Association__AssociationEndsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getAssociationEndsAssignment_3()); 

            }

            // InternalUSE.g:2254:2: ( ( rule__Association__AssociationEndsAssignment_3 )* )
            // InternalUSE.g:2255:3: ( rule__Association__AssociationEndsAssignment_3 )*
            {
             before(grammarAccess.getAssociationAccess().getAssociationEndsAssignment_3()); 
            // InternalUSE.g:2256:3: ( rule__Association__AssociationEndsAssignment_3 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalUSE.g:2256:4: rule__Association__AssociationEndsAssignment_3
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Association__AssociationEndsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getAssociationAccess().getAssociationEndsAssignment_3()); 

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
    // $ANTLR end "rule__Association__Group__3__Impl"


    // $ANTLR start "rule__Association__Group__4"
    // InternalUSE.g:2265:1: rule__Association__Group__4 : rule__Association__Group__4__Impl ;
    public final void rule__Association__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2269:1: ( rule__Association__Group__4__Impl )
            // InternalUSE.g:2270:2: rule__Association__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Association__Group__4__Impl();

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
    // $ANTLR end "rule__Association__Group__4"


    // $ANTLR start "rule__Association__Group__4__Impl"
    // InternalUSE.g:2276:1: rule__Association__Group__4__Impl : ( 'end' ) ;
    public final void rule__Association__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2280:1: ( ( 'end' ) )
            // InternalUSE.g:2281:1: ( 'end' )
            {
            // InternalUSE.g:2281:1: ( 'end' )
            // InternalUSE.g:2282:2: 'end'
            {
             before(grammarAccess.getAssociationAccess().getEndKeyword_4()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getEndKeyword_4()); 

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
    // $ANTLR end "rule__Association__Group__4__Impl"


    // $ANTLR start "rule__AssociationEnd__Group__0"
    // InternalUSE.g:2292:1: rule__AssociationEnd__Group__0 : rule__AssociationEnd__Group__0__Impl rule__AssociationEnd__Group__1 ;
    public final void rule__AssociationEnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2296:1: ( rule__AssociationEnd__Group__0__Impl rule__AssociationEnd__Group__1 )
            // InternalUSE.g:2297:2: rule__AssociationEnd__Group__0__Impl rule__AssociationEnd__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__AssociationEnd__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group__1();

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
    // $ANTLR end "rule__AssociationEnd__Group__0"


    // $ANTLR start "rule__AssociationEnd__Group__0__Impl"
    // InternalUSE.g:2304:1: rule__AssociationEnd__Group__0__Impl : ( ( rule__AssociationEnd__TypeAssignment_0 ) ) ;
    public final void rule__AssociationEnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2308:1: ( ( ( rule__AssociationEnd__TypeAssignment_0 ) ) )
            // InternalUSE.g:2309:1: ( ( rule__AssociationEnd__TypeAssignment_0 ) )
            {
            // InternalUSE.g:2309:1: ( ( rule__AssociationEnd__TypeAssignment_0 ) )
            // InternalUSE.g:2310:2: ( rule__AssociationEnd__TypeAssignment_0 )
            {
             before(grammarAccess.getAssociationEndAccess().getTypeAssignment_0()); 
            // InternalUSE.g:2311:2: ( rule__AssociationEnd__TypeAssignment_0 )
            // InternalUSE.g:2311:3: rule__AssociationEnd__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AssociationEnd__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationEndAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__AssociationEnd__Group__0__Impl"


    // $ANTLR start "rule__AssociationEnd__Group__1"
    // InternalUSE.g:2319:1: rule__AssociationEnd__Group__1 : rule__AssociationEnd__Group__1__Impl rule__AssociationEnd__Group__2 ;
    public final void rule__AssociationEnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2323:1: ( rule__AssociationEnd__Group__1__Impl rule__AssociationEnd__Group__2 )
            // InternalUSE.g:2324:2: rule__AssociationEnd__Group__1__Impl rule__AssociationEnd__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__AssociationEnd__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group__2();

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
    // $ANTLR end "rule__AssociationEnd__Group__1"


    // $ANTLR start "rule__AssociationEnd__Group__1__Impl"
    // InternalUSE.g:2331:1: rule__AssociationEnd__Group__1__Impl : ( '[' ) ;
    public final void rule__AssociationEnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2335:1: ( ( '[' ) )
            // InternalUSE.g:2336:1: ( '[' )
            {
            // InternalUSE.g:2336:1: ( '[' )
            // InternalUSE.g:2337:2: '['
            {
             before(grammarAccess.getAssociationEndAccess().getLeftSquareBracketKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAssociationEndAccess().getLeftSquareBracketKeyword_1()); 

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
    // $ANTLR end "rule__AssociationEnd__Group__1__Impl"


    // $ANTLR start "rule__AssociationEnd__Group__2"
    // InternalUSE.g:2346:1: rule__AssociationEnd__Group__2 : rule__AssociationEnd__Group__2__Impl rule__AssociationEnd__Group__3 ;
    public final void rule__AssociationEnd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2350:1: ( rule__AssociationEnd__Group__2__Impl rule__AssociationEnd__Group__3 )
            // InternalUSE.g:2351:2: rule__AssociationEnd__Group__2__Impl rule__AssociationEnd__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__AssociationEnd__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group__3();

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
    // $ANTLR end "rule__AssociationEnd__Group__2"


    // $ANTLR start "rule__AssociationEnd__Group__2__Impl"
    // InternalUSE.g:2358:1: rule__AssociationEnd__Group__2__Impl : ( ( rule__AssociationEnd__MulAssignment_2 ) ) ;
    public final void rule__AssociationEnd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2362:1: ( ( ( rule__AssociationEnd__MulAssignment_2 ) ) )
            // InternalUSE.g:2363:1: ( ( rule__AssociationEnd__MulAssignment_2 ) )
            {
            // InternalUSE.g:2363:1: ( ( rule__AssociationEnd__MulAssignment_2 ) )
            // InternalUSE.g:2364:2: ( rule__AssociationEnd__MulAssignment_2 )
            {
             before(grammarAccess.getAssociationEndAccess().getMulAssignment_2()); 
            // InternalUSE.g:2365:2: ( rule__AssociationEnd__MulAssignment_2 )
            // InternalUSE.g:2365:3: rule__AssociationEnd__MulAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AssociationEnd__MulAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssociationEndAccess().getMulAssignment_2()); 

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
    // $ANTLR end "rule__AssociationEnd__Group__2__Impl"


    // $ANTLR start "rule__AssociationEnd__Group__3"
    // InternalUSE.g:2373:1: rule__AssociationEnd__Group__3 : rule__AssociationEnd__Group__3__Impl rule__AssociationEnd__Group__4 ;
    public final void rule__AssociationEnd__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2377:1: ( rule__AssociationEnd__Group__3__Impl rule__AssociationEnd__Group__4 )
            // InternalUSE.g:2378:2: rule__AssociationEnd__Group__3__Impl rule__AssociationEnd__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__AssociationEnd__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group__4();

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
    // $ANTLR end "rule__AssociationEnd__Group__3"


    // $ANTLR start "rule__AssociationEnd__Group__3__Impl"
    // InternalUSE.g:2385:1: rule__AssociationEnd__Group__3__Impl : ( ']' ) ;
    public final void rule__AssociationEnd__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2389:1: ( ( ']' ) )
            // InternalUSE.g:2390:1: ( ']' )
            {
            // InternalUSE.g:2390:1: ( ']' )
            // InternalUSE.g:2391:2: ']'
            {
             before(grammarAccess.getAssociationEndAccess().getRightSquareBracketKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAssociationEndAccess().getRightSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__AssociationEnd__Group__3__Impl"


    // $ANTLR start "rule__AssociationEnd__Group__4"
    // InternalUSE.g:2400:1: rule__AssociationEnd__Group__4 : rule__AssociationEnd__Group__4__Impl rule__AssociationEnd__Group__5 ;
    public final void rule__AssociationEnd__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2404:1: ( rule__AssociationEnd__Group__4__Impl rule__AssociationEnd__Group__5 )
            // InternalUSE.g:2405:2: rule__AssociationEnd__Group__4__Impl rule__AssociationEnd__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__AssociationEnd__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group__5();

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
    // $ANTLR end "rule__AssociationEnd__Group__4"


    // $ANTLR start "rule__AssociationEnd__Group__4__Impl"
    // InternalUSE.g:2412:1: rule__AssociationEnd__Group__4__Impl : ( ( rule__AssociationEnd__Group_4__0 )? ) ;
    public final void rule__AssociationEnd__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2416:1: ( ( ( rule__AssociationEnd__Group_4__0 )? ) )
            // InternalUSE.g:2417:1: ( ( rule__AssociationEnd__Group_4__0 )? )
            {
            // InternalUSE.g:2417:1: ( ( rule__AssociationEnd__Group_4__0 )? )
            // InternalUSE.g:2418:2: ( rule__AssociationEnd__Group_4__0 )?
            {
             before(grammarAccess.getAssociationEndAccess().getGroup_4()); 
            // InternalUSE.g:2419:2: ( rule__AssociationEnd__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==41) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUSE.g:2419:3: rule__AssociationEnd__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssociationEnd__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationEndAccess().getGroup_4()); 

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
    // $ANTLR end "rule__AssociationEnd__Group__4__Impl"


    // $ANTLR start "rule__AssociationEnd__Group__5"
    // InternalUSE.g:2427:1: rule__AssociationEnd__Group__5 : rule__AssociationEnd__Group__5__Impl ;
    public final void rule__AssociationEnd__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2431:1: ( rule__AssociationEnd__Group__5__Impl )
            // InternalUSE.g:2432:2: rule__AssociationEnd__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group__5__Impl();

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
    // $ANTLR end "rule__AssociationEnd__Group__5"


    // $ANTLR start "rule__AssociationEnd__Group__5__Impl"
    // InternalUSE.g:2438:1: rule__AssociationEnd__Group__5__Impl : ( ( rule__AssociationEnd__OrderedAssignment_5 )? ) ;
    public final void rule__AssociationEnd__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2442:1: ( ( ( rule__AssociationEnd__OrderedAssignment_5 )? ) )
            // InternalUSE.g:2443:1: ( ( rule__AssociationEnd__OrderedAssignment_5 )? )
            {
            // InternalUSE.g:2443:1: ( ( rule__AssociationEnd__OrderedAssignment_5 )? )
            // InternalUSE.g:2444:2: ( rule__AssociationEnd__OrderedAssignment_5 )?
            {
             before(grammarAccess.getAssociationEndAccess().getOrderedAssignment_5()); 
            // InternalUSE.g:2445:2: ( rule__AssociationEnd__OrderedAssignment_5 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==57) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalUSE.g:2445:3: rule__AssociationEnd__OrderedAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssociationEnd__OrderedAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationEndAccess().getOrderedAssignment_5()); 

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
    // $ANTLR end "rule__AssociationEnd__Group__5__Impl"


    // $ANTLR start "rule__AssociationEnd__Group_4__0"
    // InternalUSE.g:2454:1: rule__AssociationEnd__Group_4__0 : rule__AssociationEnd__Group_4__0__Impl rule__AssociationEnd__Group_4__1 ;
    public final void rule__AssociationEnd__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2458:1: ( rule__AssociationEnd__Group_4__0__Impl rule__AssociationEnd__Group_4__1 )
            // InternalUSE.g:2459:2: rule__AssociationEnd__Group_4__0__Impl rule__AssociationEnd__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__AssociationEnd__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group_4__1();

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
    // $ANTLR end "rule__AssociationEnd__Group_4__0"


    // $ANTLR start "rule__AssociationEnd__Group_4__0__Impl"
    // InternalUSE.g:2466:1: rule__AssociationEnd__Group_4__0__Impl : ( 'role' ) ;
    public final void rule__AssociationEnd__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2470:1: ( ( 'role' ) )
            // InternalUSE.g:2471:1: ( 'role' )
            {
            // InternalUSE.g:2471:1: ( 'role' )
            // InternalUSE.g:2472:2: 'role'
            {
             before(grammarAccess.getAssociationEndAccess().getRoleKeyword_4_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAssociationEndAccess().getRoleKeyword_4_0()); 

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
    // $ANTLR end "rule__AssociationEnd__Group_4__0__Impl"


    // $ANTLR start "rule__AssociationEnd__Group_4__1"
    // InternalUSE.g:2481:1: rule__AssociationEnd__Group_4__1 : rule__AssociationEnd__Group_4__1__Impl ;
    public final void rule__AssociationEnd__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2485:1: ( rule__AssociationEnd__Group_4__1__Impl )
            // InternalUSE.g:2486:2: rule__AssociationEnd__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group_4__1__Impl();

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
    // $ANTLR end "rule__AssociationEnd__Group_4__1"


    // $ANTLR start "rule__AssociationEnd__Group_4__1__Impl"
    // InternalUSE.g:2492:1: rule__AssociationEnd__Group_4__1__Impl : ( ( rule__AssociationEnd__RoleAssignment_4_1 ) ) ;
    public final void rule__AssociationEnd__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2496:1: ( ( ( rule__AssociationEnd__RoleAssignment_4_1 ) ) )
            // InternalUSE.g:2497:1: ( ( rule__AssociationEnd__RoleAssignment_4_1 ) )
            {
            // InternalUSE.g:2497:1: ( ( rule__AssociationEnd__RoleAssignment_4_1 ) )
            // InternalUSE.g:2498:2: ( rule__AssociationEnd__RoleAssignment_4_1 )
            {
             before(grammarAccess.getAssociationEndAccess().getRoleAssignment_4_1()); 
            // InternalUSE.g:2499:2: ( rule__AssociationEnd__RoleAssignment_4_1 )
            // InternalUSE.g:2499:3: rule__AssociationEnd__RoleAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__AssociationEnd__RoleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationEndAccess().getRoleAssignment_4_1()); 

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
    // $ANTLR end "rule__AssociationEnd__Group_4__1__Impl"


    // $ANTLR start "rule__AssociationClass__Group__0"
    // InternalUSE.g:2508:1: rule__AssociationClass__Group__0 : rule__AssociationClass__Group__0__Impl rule__AssociationClass__Group__1 ;
    public final void rule__AssociationClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2512:1: ( rule__AssociationClass__Group__0__Impl rule__AssociationClass__Group__1 )
            // InternalUSE.g:2513:2: rule__AssociationClass__Group__0__Impl rule__AssociationClass__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalUSE.g:2520:1: rule__AssociationClass__Group__0__Impl : ( ( rule__AssociationClass__AbstractAssignment_0 )? ) ;
    public final void rule__AssociationClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2524:1: ( ( ( rule__AssociationClass__AbstractAssignment_0 )? ) )
            // InternalUSE.g:2525:1: ( ( rule__AssociationClass__AbstractAssignment_0 )? )
            {
            // InternalUSE.g:2525:1: ( ( rule__AssociationClass__AbstractAssignment_0 )? )
            // InternalUSE.g:2526:2: ( rule__AssociationClass__AbstractAssignment_0 )?
            {
             before(grammarAccess.getAssociationClassAccess().getAbstractAssignment_0()); 
            // InternalUSE.g:2527:2: ( rule__AssociationClass__AbstractAssignment_0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==56) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalUSE.g:2527:3: rule__AssociationClass__AbstractAssignment_0
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
    // InternalUSE.g:2535:1: rule__AssociationClass__Group__1 : rule__AssociationClass__Group__1__Impl rule__AssociationClass__Group__2 ;
    public final void rule__AssociationClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2539:1: ( rule__AssociationClass__Group__1__Impl rule__AssociationClass__Group__2 )
            // InternalUSE.g:2540:2: rule__AssociationClass__Group__1__Impl rule__AssociationClass__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalUSE.g:2547:1: rule__AssociationClass__Group__1__Impl : ( 'associationclass' ) ;
    public final void rule__AssociationClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2551:1: ( ( 'associationclass' ) )
            // InternalUSE.g:2552:1: ( 'associationclass' )
            {
            // InternalUSE.g:2552:1: ( 'associationclass' )
            // InternalUSE.g:2553:2: 'associationclass'
            {
             before(grammarAccess.getAssociationClassAccess().getAssociationclassKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalUSE.g:2562:1: rule__AssociationClass__Group__2 : rule__AssociationClass__Group__2__Impl rule__AssociationClass__Group__3 ;
    public final void rule__AssociationClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2566:1: ( rule__AssociationClass__Group__2__Impl rule__AssociationClass__Group__3 )
            // InternalUSE.g:2567:2: rule__AssociationClass__Group__2__Impl rule__AssociationClass__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalUSE.g:2574:1: rule__AssociationClass__Group__2__Impl : ( ( rule__AssociationClass__NameAssignment_2 ) ) ;
    public final void rule__AssociationClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2578:1: ( ( ( rule__AssociationClass__NameAssignment_2 ) ) )
            // InternalUSE.g:2579:1: ( ( rule__AssociationClass__NameAssignment_2 ) )
            {
            // InternalUSE.g:2579:1: ( ( rule__AssociationClass__NameAssignment_2 ) )
            // InternalUSE.g:2580:2: ( rule__AssociationClass__NameAssignment_2 )
            {
             before(grammarAccess.getAssociationClassAccess().getNameAssignment_2()); 
            // InternalUSE.g:2581:2: ( rule__AssociationClass__NameAssignment_2 )
            // InternalUSE.g:2581:3: rule__AssociationClass__NameAssignment_2
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
    // InternalUSE.g:2589:1: rule__AssociationClass__Group__3 : rule__AssociationClass__Group__3__Impl rule__AssociationClass__Group__4 ;
    public final void rule__AssociationClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2593:1: ( rule__AssociationClass__Group__3__Impl rule__AssociationClass__Group__4 )
            // InternalUSE.g:2594:2: rule__AssociationClass__Group__3__Impl rule__AssociationClass__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalUSE.g:2601:1: rule__AssociationClass__Group__3__Impl : ( ( rule__AssociationClass__Group_3__0 )? ) ;
    public final void rule__AssociationClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2605:1: ( ( ( rule__AssociationClass__Group_3__0 )? ) )
            // InternalUSE.g:2606:1: ( ( rule__AssociationClass__Group_3__0 )? )
            {
            // InternalUSE.g:2606:1: ( ( rule__AssociationClass__Group_3__0 )? )
            // InternalUSE.g:2607:2: ( rule__AssociationClass__Group_3__0 )?
            {
             before(grammarAccess.getAssociationClassAccess().getGroup_3()); 
            // InternalUSE.g:2608:2: ( rule__AssociationClass__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==37) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalUSE.g:2608:3: rule__AssociationClass__Group_3__0
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
    // InternalUSE.g:2616:1: rule__AssociationClass__Group__4 : rule__AssociationClass__Group__4__Impl rule__AssociationClass__Group__5 ;
    public final void rule__AssociationClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2620:1: ( rule__AssociationClass__Group__4__Impl rule__AssociationClass__Group__5 )
            // InternalUSE.g:2621:2: rule__AssociationClass__Group__4__Impl rule__AssociationClass__Group__5
            {
            pushFollow(FOLLOW_4);
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
    // InternalUSE.g:2628:1: rule__AssociationClass__Group__4__Impl : ( 'between' ) ;
    public final void rule__AssociationClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2632:1: ( ( 'between' ) )
            // InternalUSE.g:2633:1: ( 'between' )
            {
            // InternalUSE.g:2633:1: ( 'between' )
            // InternalUSE.g:2634:2: 'between'
            {
             before(grammarAccess.getAssociationClassAccess().getBetweenKeyword_4()); 
            match(input,38,FOLLOW_2); 
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
    // InternalUSE.g:2643:1: rule__AssociationClass__Group__5 : rule__AssociationClass__Group__5__Impl rule__AssociationClass__Group__6 ;
    public final void rule__AssociationClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2647:1: ( rule__AssociationClass__Group__5__Impl rule__AssociationClass__Group__6 )
            // InternalUSE.g:2648:2: rule__AssociationClass__Group__5__Impl rule__AssociationClass__Group__6
            {
            pushFollow(FOLLOW_25);
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
    // InternalUSE.g:2655:1: rule__AssociationClass__Group__5__Impl : ( ( ( rule__AssociationClass__AssociationEndsAssignment_5 ) ) ( ( rule__AssociationClass__AssociationEndsAssignment_5 )* ) ) ;
    public final void rule__AssociationClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2659:1: ( ( ( ( rule__AssociationClass__AssociationEndsAssignment_5 ) ) ( ( rule__AssociationClass__AssociationEndsAssignment_5 )* ) ) )
            // InternalUSE.g:2660:1: ( ( ( rule__AssociationClass__AssociationEndsAssignment_5 ) ) ( ( rule__AssociationClass__AssociationEndsAssignment_5 )* ) )
            {
            // InternalUSE.g:2660:1: ( ( ( rule__AssociationClass__AssociationEndsAssignment_5 ) ) ( ( rule__AssociationClass__AssociationEndsAssignment_5 )* ) )
            // InternalUSE.g:2661:2: ( ( rule__AssociationClass__AssociationEndsAssignment_5 ) ) ( ( rule__AssociationClass__AssociationEndsAssignment_5 )* )
            {
            // InternalUSE.g:2661:2: ( ( rule__AssociationClass__AssociationEndsAssignment_5 ) )
            // InternalUSE.g:2662:3: ( rule__AssociationClass__AssociationEndsAssignment_5 )
            {
             before(grammarAccess.getAssociationClassAccess().getAssociationEndsAssignment_5()); 
            // InternalUSE.g:2663:3: ( rule__AssociationClass__AssociationEndsAssignment_5 )
            // InternalUSE.g:2663:4: rule__AssociationClass__AssociationEndsAssignment_5
            {
            pushFollow(FOLLOW_14);
            rule__AssociationClass__AssociationEndsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAssociationClassAccess().getAssociationEndsAssignment_5()); 

            }

            // InternalUSE.g:2666:2: ( ( rule__AssociationClass__AssociationEndsAssignment_5 )* )
            // InternalUSE.g:2667:3: ( rule__AssociationClass__AssociationEndsAssignment_5 )*
            {
             before(grammarAccess.getAssociationClassAccess().getAssociationEndsAssignment_5()); 
            // InternalUSE.g:2668:3: ( rule__AssociationClass__AssociationEndsAssignment_5 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalUSE.g:2668:4: rule__AssociationClass__AssociationEndsAssignment_5
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__AssociationClass__AssociationEndsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getAssociationClassAccess().getAssociationEndsAssignment_5()); 

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
    // InternalUSE.g:2677:1: rule__AssociationClass__Group__6 : rule__AssociationClass__Group__6__Impl rule__AssociationClass__Group__7 ;
    public final void rule__AssociationClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2681:1: ( rule__AssociationClass__Group__6__Impl rule__AssociationClass__Group__7 )
            // InternalUSE.g:2682:2: rule__AssociationClass__Group__6__Impl rule__AssociationClass__Group__7
            {
            pushFollow(FOLLOW_25);
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
    // InternalUSE.g:2689:1: rule__AssociationClass__Group__6__Impl : ( ( rule__AssociationClass__AttributesAssignment_6 )? ) ;
    public final void rule__AssociationClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2693:1: ( ( ( rule__AssociationClass__AttributesAssignment_6 )? ) )
            // InternalUSE.g:2694:1: ( ( rule__AssociationClass__AttributesAssignment_6 )? )
            {
            // InternalUSE.g:2694:1: ( ( rule__AssociationClass__AttributesAssignment_6 )? )
            // InternalUSE.g:2695:2: ( rule__AssociationClass__AttributesAssignment_6 )?
            {
             before(grammarAccess.getAssociationClassAccess().getAttributesAssignment_6()); 
            // InternalUSE.g:2696:2: ( rule__AssociationClass__AttributesAssignment_6 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==43) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalUSE.g:2696:3: rule__AssociationClass__AttributesAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssociationClass__AttributesAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationClassAccess().getAttributesAssignment_6()); 

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
    // InternalUSE.g:2704:1: rule__AssociationClass__Group__7 : rule__AssociationClass__Group__7__Impl rule__AssociationClass__Group__8 ;
    public final void rule__AssociationClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2708:1: ( rule__AssociationClass__Group__7__Impl rule__AssociationClass__Group__8 )
            // InternalUSE.g:2709:2: rule__AssociationClass__Group__7__Impl rule__AssociationClass__Group__8
            {
            pushFollow(FOLLOW_25);
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
    // InternalUSE.g:2716:1: rule__AssociationClass__Group__7__Impl : ( ( rule__AssociationClass__OperationsAssignment_7 )? ) ;
    public final void rule__AssociationClass__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2720:1: ( ( ( rule__AssociationClass__OperationsAssignment_7 )? ) )
            // InternalUSE.g:2721:1: ( ( rule__AssociationClass__OperationsAssignment_7 )? )
            {
            // InternalUSE.g:2721:1: ( ( rule__AssociationClass__OperationsAssignment_7 )? )
            // InternalUSE.g:2722:2: ( rule__AssociationClass__OperationsAssignment_7 )?
            {
             before(grammarAccess.getAssociationClassAccess().getOperationsAssignment_7()); 
            // InternalUSE.g:2723:2: ( rule__AssociationClass__OperationsAssignment_7 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==45) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalUSE.g:2723:3: rule__AssociationClass__OperationsAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssociationClass__OperationsAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationClassAccess().getOperationsAssignment_7()); 

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
    // InternalUSE.g:2731:1: rule__AssociationClass__Group__8 : rule__AssociationClass__Group__8__Impl rule__AssociationClass__Group__9 ;
    public final void rule__AssociationClass__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2735:1: ( rule__AssociationClass__Group__8__Impl rule__AssociationClass__Group__9 )
            // InternalUSE.g:2736:2: rule__AssociationClass__Group__8__Impl rule__AssociationClass__Group__9
            {
            pushFollow(FOLLOW_25);
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
    // InternalUSE.g:2743:1: rule__AssociationClass__Group__8__Impl : ( ( rule__AssociationClass__ConstraintsAssignment_8 )? ) ;
    public final void rule__AssociationClass__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2747:1: ( ( ( rule__AssociationClass__ConstraintsAssignment_8 )? ) )
            // InternalUSE.g:2748:1: ( ( rule__AssociationClass__ConstraintsAssignment_8 )? )
            {
            // InternalUSE.g:2748:1: ( ( rule__AssociationClass__ConstraintsAssignment_8 )? )
            // InternalUSE.g:2749:2: ( rule__AssociationClass__ConstraintsAssignment_8 )?
            {
             before(grammarAccess.getAssociationClassAccess().getConstraintsAssignment_8()); 
            // InternalUSE.g:2750:2: ( rule__AssociationClass__ConstraintsAssignment_8 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==50) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalUSE.g:2750:3: rule__AssociationClass__ConstraintsAssignment_8
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
    // InternalUSE.g:2758:1: rule__AssociationClass__Group__9 : rule__AssociationClass__Group__9__Impl ;
    public final void rule__AssociationClass__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2762:1: ( rule__AssociationClass__Group__9__Impl )
            // InternalUSE.g:2763:2: rule__AssociationClass__Group__9__Impl
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
    // InternalUSE.g:2769:1: rule__AssociationClass__Group__9__Impl : ( 'end' ) ;
    public final void rule__AssociationClass__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2773:1: ( ( 'end' ) )
            // InternalUSE.g:2774:1: ( 'end' )
            {
            // InternalUSE.g:2774:1: ( 'end' )
            // InternalUSE.g:2775:2: 'end'
            {
             before(grammarAccess.getAssociationClassAccess().getEndKeyword_9()); 
            match(input,36,FOLLOW_2); 
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
    // InternalUSE.g:2785:1: rule__AssociationClass__Group_3__0 : rule__AssociationClass__Group_3__0__Impl rule__AssociationClass__Group_3__1 ;
    public final void rule__AssociationClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2789:1: ( rule__AssociationClass__Group_3__0__Impl rule__AssociationClass__Group_3__1 )
            // InternalUSE.g:2790:2: rule__AssociationClass__Group_3__0__Impl rule__AssociationClass__Group_3__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalUSE.g:2797:1: rule__AssociationClass__Group_3__0__Impl : ( '<' ) ;
    public final void rule__AssociationClass__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2801:1: ( ( '<' ) )
            // InternalUSE.g:2802:1: ( '<' )
            {
            // InternalUSE.g:2802:1: ( '<' )
            // InternalUSE.g:2803:2: '<'
            {
             before(grammarAccess.getAssociationClassAccess().getLessThanSignKeyword_3_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalUSE.g:2812:1: rule__AssociationClass__Group_3__1 : rule__AssociationClass__Group_3__1__Impl ;
    public final void rule__AssociationClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2816:1: ( rule__AssociationClass__Group_3__1__Impl )
            // InternalUSE.g:2817:2: rule__AssociationClass__Group_3__1__Impl
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
    // InternalUSE.g:2823:1: rule__AssociationClass__Group_3__1__Impl : ( ( ( rule__AssociationClass__GeneralizationAssignment_3_1 ) ) ( ( rule__AssociationClass__GeneralizationAssignment_3_1 )* ) ) ;
    public final void rule__AssociationClass__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2827:1: ( ( ( ( rule__AssociationClass__GeneralizationAssignment_3_1 ) ) ( ( rule__AssociationClass__GeneralizationAssignment_3_1 )* ) ) )
            // InternalUSE.g:2828:1: ( ( ( rule__AssociationClass__GeneralizationAssignment_3_1 ) ) ( ( rule__AssociationClass__GeneralizationAssignment_3_1 )* ) )
            {
            // InternalUSE.g:2828:1: ( ( ( rule__AssociationClass__GeneralizationAssignment_3_1 ) ) ( ( rule__AssociationClass__GeneralizationAssignment_3_1 )* ) )
            // InternalUSE.g:2829:2: ( ( rule__AssociationClass__GeneralizationAssignment_3_1 ) ) ( ( rule__AssociationClass__GeneralizationAssignment_3_1 )* )
            {
            // InternalUSE.g:2829:2: ( ( rule__AssociationClass__GeneralizationAssignment_3_1 ) )
            // InternalUSE.g:2830:3: ( rule__AssociationClass__GeneralizationAssignment_3_1 )
            {
             before(grammarAccess.getAssociationClassAccess().getGeneralizationAssignment_3_1()); 
            // InternalUSE.g:2831:3: ( rule__AssociationClass__GeneralizationAssignment_3_1 )
            // InternalUSE.g:2831:4: rule__AssociationClass__GeneralizationAssignment_3_1
            {
            pushFollow(FOLLOW_14);
            rule__AssociationClass__GeneralizationAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationClassAccess().getGeneralizationAssignment_3_1()); 

            }

            // InternalUSE.g:2834:2: ( ( rule__AssociationClass__GeneralizationAssignment_3_1 )* )
            // InternalUSE.g:2835:3: ( rule__AssociationClass__GeneralizationAssignment_3_1 )*
            {
             before(grammarAccess.getAssociationClassAccess().getGeneralizationAssignment_3_1()); 
            // InternalUSE.g:2836:3: ( rule__AssociationClass__GeneralizationAssignment_3_1 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalUSE.g:2836:4: rule__AssociationClass__GeneralizationAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__AssociationClass__GeneralizationAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getAssociationClassAccess().getGeneralizationAssignment_3_1()); 

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
    // $ANTLR end "rule__AssociationClass__Group_3__1__Impl"


    // $ANTLR start "rule__AttributesBase__Group__0"
    // InternalUSE.g:2846:1: rule__AttributesBase__Group__0 : rule__AttributesBase__Group__0__Impl rule__AttributesBase__Group__1 ;
    public final void rule__AttributesBase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2850:1: ( rule__AttributesBase__Group__0__Impl rule__AttributesBase__Group__1 )
            // InternalUSE.g:2851:2: rule__AttributesBase__Group__0__Impl rule__AttributesBase__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__AttributesBase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributesBase__Group__1();

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
    // $ANTLR end "rule__AttributesBase__Group__0"


    // $ANTLR start "rule__AttributesBase__Group__0__Impl"
    // InternalUSE.g:2858:1: rule__AttributesBase__Group__0__Impl : ( 'attributes' ) ;
    public final void rule__AttributesBase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2862:1: ( ( 'attributes' ) )
            // InternalUSE.g:2863:1: ( 'attributes' )
            {
            // InternalUSE.g:2863:1: ( 'attributes' )
            // InternalUSE.g:2864:2: 'attributes'
            {
             before(grammarAccess.getAttributesBaseAccess().getAttributesKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getAttributesBaseAccess().getAttributesKeyword_0()); 

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
    // $ANTLR end "rule__AttributesBase__Group__0__Impl"


    // $ANTLR start "rule__AttributesBase__Group__1"
    // InternalUSE.g:2873:1: rule__AttributesBase__Group__1 : rule__AttributesBase__Group__1__Impl ;
    public final void rule__AttributesBase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2877:1: ( rule__AttributesBase__Group__1__Impl )
            // InternalUSE.g:2878:2: rule__AttributesBase__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributesBase__Group__1__Impl();

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
    // $ANTLR end "rule__AttributesBase__Group__1"


    // $ANTLR start "rule__AttributesBase__Group__1__Impl"
    // InternalUSE.g:2884:1: rule__AttributesBase__Group__1__Impl : ( ( rule__AttributesBase__AttributesAssignment_1 )* ) ;
    public final void rule__AttributesBase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2888:1: ( ( ( rule__AttributesBase__AttributesAssignment_1 )* ) )
            // InternalUSE.g:2889:1: ( ( rule__AttributesBase__AttributesAssignment_1 )* )
            {
            // InternalUSE.g:2889:1: ( ( rule__AttributesBase__AttributesAssignment_1 )* )
            // InternalUSE.g:2890:2: ( rule__AttributesBase__AttributesAssignment_1 )*
            {
             before(grammarAccess.getAttributesBaseAccess().getAttributesAssignment_1()); 
            // InternalUSE.g:2891:2: ( rule__AttributesBase__AttributesAssignment_1 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalUSE.g:2891:3: rule__AttributesBase__AttributesAssignment_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__AttributesBase__AttributesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getAttributesBaseAccess().getAttributesAssignment_1()); 

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
    // $ANTLR end "rule__AttributesBase__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalUSE.g:2900:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2904:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalUSE.g:2905:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalUSE.g:2912:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2916:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalUSE.g:2917:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalUSE.g:2917:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalUSE.g:2918:2: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // InternalUSE.g:2919:2: ( rule__Attribute__NameAssignment_0 )
            // InternalUSE.g:2919:3: rule__Attribute__NameAssignment_0
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
    // InternalUSE.g:2927:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2931:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalUSE.g:2932:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalUSE.g:2939:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2943:1: ( ( ':' ) )
            // InternalUSE.g:2944:1: ( ':' )
            {
            // InternalUSE.g:2944:1: ( ':' )
            // InternalUSE.g:2945:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalUSE.g:2954:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2958:1: ( rule__Attribute__Group__2__Impl )
            // InternalUSE.g:2959:2: rule__Attribute__Group__2__Impl
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
    // InternalUSE.g:2965:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2969:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // InternalUSE.g:2970:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // InternalUSE.g:2970:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // InternalUSE.g:2971:2: ( rule__Attribute__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            // InternalUSE.g:2972:2: ( rule__Attribute__TypeAssignment_2 )
            // InternalUSE.g:2972:3: rule__Attribute__TypeAssignment_2
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


    // $ANTLR start "rule__OperationsBase__Group__0"
    // InternalUSE.g:2981:1: rule__OperationsBase__Group__0 : rule__OperationsBase__Group__0__Impl rule__OperationsBase__Group__1 ;
    public final void rule__OperationsBase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2985:1: ( rule__OperationsBase__Group__0__Impl rule__OperationsBase__Group__1 )
            // InternalUSE.g:2986:2: rule__OperationsBase__Group__0__Impl rule__OperationsBase__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__OperationsBase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationsBase__Group__1();

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
    // $ANTLR end "rule__OperationsBase__Group__0"


    // $ANTLR start "rule__OperationsBase__Group__0__Impl"
    // InternalUSE.g:2993:1: rule__OperationsBase__Group__0__Impl : ( 'operations' ) ;
    public final void rule__OperationsBase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2997:1: ( ( 'operations' ) )
            // InternalUSE.g:2998:1: ( 'operations' )
            {
            // InternalUSE.g:2998:1: ( 'operations' )
            // InternalUSE.g:2999:2: 'operations'
            {
             before(grammarAccess.getOperationsBaseAccess().getOperationsKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getOperationsBaseAccess().getOperationsKeyword_0()); 

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
    // $ANTLR end "rule__OperationsBase__Group__0__Impl"


    // $ANTLR start "rule__OperationsBase__Group__1"
    // InternalUSE.g:3008:1: rule__OperationsBase__Group__1 : rule__OperationsBase__Group__1__Impl ;
    public final void rule__OperationsBase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3012:1: ( rule__OperationsBase__Group__1__Impl )
            // InternalUSE.g:3013:2: rule__OperationsBase__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationsBase__Group__1__Impl();

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
    // $ANTLR end "rule__OperationsBase__Group__1"


    // $ANTLR start "rule__OperationsBase__Group__1__Impl"
    // InternalUSE.g:3019:1: rule__OperationsBase__Group__1__Impl : ( ( rule__OperationsBase__OperationsAssignment_1 )* ) ;
    public final void rule__OperationsBase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3023:1: ( ( ( rule__OperationsBase__OperationsAssignment_1 )* ) )
            // InternalUSE.g:3024:1: ( ( rule__OperationsBase__OperationsAssignment_1 )* )
            {
            // InternalUSE.g:3024:1: ( ( rule__OperationsBase__OperationsAssignment_1 )* )
            // InternalUSE.g:3025:2: ( rule__OperationsBase__OperationsAssignment_1 )*
            {
             before(grammarAccess.getOperationsBaseAccess().getOperationsAssignment_1()); 
            // InternalUSE.g:3026:2: ( rule__OperationsBase__OperationsAssignment_1 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalUSE.g:3026:3: rule__OperationsBase__OperationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__OperationsBase__OperationsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getOperationsBaseAccess().getOperationsAssignment_1()); 

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
    // $ANTLR end "rule__OperationsBase__Group__1__Impl"


    // $ANTLR start "rule__OperationQuery__Group__0"
    // InternalUSE.g:3035:1: rule__OperationQuery__Group__0 : rule__OperationQuery__Group__0__Impl rule__OperationQuery__Group__1 ;
    public final void rule__OperationQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3039:1: ( rule__OperationQuery__Group__0__Impl rule__OperationQuery__Group__1 )
            // InternalUSE.g:3040:2: rule__OperationQuery__Group__0__Impl rule__OperationQuery__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__OperationQuery__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationQuery__Group__1();

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
    // $ANTLR end "rule__OperationQuery__Group__0"


    // $ANTLR start "rule__OperationQuery__Group__0__Impl"
    // InternalUSE.g:3047:1: rule__OperationQuery__Group__0__Impl : ( ( rule__OperationQuery__OperationDeclarationAssignment_0 ) ) ;
    public final void rule__OperationQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3051:1: ( ( ( rule__OperationQuery__OperationDeclarationAssignment_0 ) ) )
            // InternalUSE.g:3052:1: ( ( rule__OperationQuery__OperationDeclarationAssignment_0 ) )
            {
            // InternalUSE.g:3052:1: ( ( rule__OperationQuery__OperationDeclarationAssignment_0 ) )
            // InternalUSE.g:3053:2: ( rule__OperationQuery__OperationDeclarationAssignment_0 )
            {
             before(grammarAccess.getOperationQueryAccess().getOperationDeclarationAssignment_0()); 
            // InternalUSE.g:3054:2: ( rule__OperationQuery__OperationDeclarationAssignment_0 )
            // InternalUSE.g:3054:3: rule__OperationQuery__OperationDeclarationAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__OperationQuery__OperationDeclarationAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOperationQueryAccess().getOperationDeclarationAssignment_0()); 

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
    // $ANTLR end "rule__OperationQuery__Group__0__Impl"


    // $ANTLR start "rule__OperationQuery__Group__1"
    // InternalUSE.g:3062:1: rule__OperationQuery__Group__1 : rule__OperationQuery__Group__1__Impl rule__OperationQuery__Group__2 ;
    public final void rule__OperationQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3066:1: ( rule__OperationQuery__Group__1__Impl rule__OperationQuery__Group__2 )
            // InternalUSE.g:3067:2: rule__OperationQuery__Group__1__Impl rule__OperationQuery__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__OperationQuery__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationQuery__Group__2();

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
    // $ANTLR end "rule__OperationQuery__Group__1"


    // $ANTLR start "rule__OperationQuery__Group__1__Impl"
    // InternalUSE.g:3074:1: rule__OperationQuery__Group__1__Impl : ( '=' ) ;
    public final void rule__OperationQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3078:1: ( ( '=' ) )
            // InternalUSE.g:3079:1: ( '=' )
            {
            // InternalUSE.g:3079:1: ( '=' )
            // InternalUSE.g:3080:2: '='
            {
             before(grammarAccess.getOperationQueryAccess().getEqualsSignKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getOperationQueryAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__OperationQuery__Group__1__Impl"


    // $ANTLR start "rule__OperationQuery__Group__2"
    // InternalUSE.g:3089:1: rule__OperationQuery__Group__2 : rule__OperationQuery__Group__2__Impl rule__OperationQuery__Group__3 ;
    public final void rule__OperationQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3093:1: ( rule__OperationQuery__Group__2__Impl rule__OperationQuery__Group__3 )
            // InternalUSE.g:3094:2: rule__OperationQuery__Group__2__Impl rule__OperationQuery__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__OperationQuery__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationQuery__Group__3();

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
    // $ANTLR end "rule__OperationQuery__Group__2"


    // $ANTLR start "rule__OperationQuery__Group__2__Impl"
    // InternalUSE.g:3101:1: rule__OperationQuery__Group__2__Impl : ( ( rule__OperationQuery__OperationbodyAssignment_2 ) ) ;
    public final void rule__OperationQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3105:1: ( ( ( rule__OperationQuery__OperationbodyAssignment_2 ) ) )
            // InternalUSE.g:3106:1: ( ( rule__OperationQuery__OperationbodyAssignment_2 ) )
            {
            // InternalUSE.g:3106:1: ( ( rule__OperationQuery__OperationbodyAssignment_2 ) )
            // InternalUSE.g:3107:2: ( rule__OperationQuery__OperationbodyAssignment_2 )
            {
             before(grammarAccess.getOperationQueryAccess().getOperationbodyAssignment_2()); 
            // InternalUSE.g:3108:2: ( rule__OperationQuery__OperationbodyAssignment_2 )
            // InternalUSE.g:3108:3: rule__OperationQuery__OperationbodyAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OperationQuery__OperationbodyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOperationQueryAccess().getOperationbodyAssignment_2()); 

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
    // $ANTLR end "rule__OperationQuery__Group__2__Impl"


    // $ANTLR start "rule__OperationQuery__Group__3"
    // InternalUSE.g:3116:1: rule__OperationQuery__Group__3 : rule__OperationQuery__Group__3__Impl ;
    public final void rule__OperationQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3120:1: ( rule__OperationQuery__Group__3__Impl )
            // InternalUSE.g:3121:2: rule__OperationQuery__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationQuery__Group__3__Impl();

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
    // $ANTLR end "rule__OperationQuery__Group__3"


    // $ANTLR start "rule__OperationQuery__Group__3__Impl"
    // InternalUSE.g:3127:1: rule__OperationQuery__Group__3__Impl : ( ( rule__OperationQuery__ConditionsAssignment_3 )* ) ;
    public final void rule__OperationQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3131:1: ( ( ( rule__OperationQuery__ConditionsAssignment_3 )* ) )
            // InternalUSE.g:3132:1: ( ( rule__OperationQuery__ConditionsAssignment_3 )* )
            {
            // InternalUSE.g:3132:1: ( ( rule__OperationQuery__ConditionsAssignment_3 )* )
            // InternalUSE.g:3133:2: ( rule__OperationQuery__ConditionsAssignment_3 )*
            {
             before(grammarAccess.getOperationQueryAccess().getConditionsAssignment_3()); 
            // InternalUSE.g:3134:2: ( rule__OperationQuery__ConditionsAssignment_3 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=54 && LA42_0<=55)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalUSE.g:3134:3: rule__OperationQuery__ConditionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__OperationQuery__ConditionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getOperationQueryAccess().getConditionsAssignment_3()); 

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
    // $ANTLR end "rule__OperationQuery__Group__3__Impl"


    // $ANTLR start "rule__OperationComplex__Group__0"
    // InternalUSE.g:3143:1: rule__OperationComplex__Group__0 : rule__OperationComplex__Group__0__Impl rule__OperationComplex__Group__1 ;
    public final void rule__OperationComplex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3147:1: ( rule__OperationComplex__Group__0__Impl rule__OperationComplex__Group__1 )
            // InternalUSE.g:3148:2: rule__OperationComplex__Group__0__Impl rule__OperationComplex__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalUSE.g:3155:1: rule__OperationComplex__Group__0__Impl : ( ( rule__OperationComplex__OperationDeclarationAssignment_0 ) ) ;
    public final void rule__OperationComplex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3159:1: ( ( ( rule__OperationComplex__OperationDeclarationAssignment_0 ) ) )
            // InternalUSE.g:3160:1: ( ( rule__OperationComplex__OperationDeclarationAssignment_0 ) )
            {
            // InternalUSE.g:3160:1: ( ( rule__OperationComplex__OperationDeclarationAssignment_0 ) )
            // InternalUSE.g:3161:2: ( rule__OperationComplex__OperationDeclarationAssignment_0 )
            {
             before(grammarAccess.getOperationComplexAccess().getOperationDeclarationAssignment_0()); 
            // InternalUSE.g:3162:2: ( rule__OperationComplex__OperationDeclarationAssignment_0 )
            // InternalUSE.g:3162:3: rule__OperationComplex__OperationDeclarationAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__OperationComplex__OperationDeclarationAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOperationComplexAccess().getOperationDeclarationAssignment_0()); 

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
    // InternalUSE.g:3170:1: rule__OperationComplex__Group__1 : rule__OperationComplex__Group__1__Impl rule__OperationComplex__Group__2 ;
    public final void rule__OperationComplex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3174:1: ( rule__OperationComplex__Group__1__Impl rule__OperationComplex__Group__2 )
            // InternalUSE.g:3175:2: rule__OperationComplex__Group__1__Impl rule__OperationComplex__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalUSE.g:3182:1: rule__OperationComplex__Group__1__Impl : ( ( rule__OperationComplex__Group_1__0 )? ) ;
    public final void rule__OperationComplex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3186:1: ( ( ( rule__OperationComplex__Group_1__0 )? ) )
            // InternalUSE.g:3187:1: ( ( rule__OperationComplex__Group_1__0 )? )
            {
            // InternalUSE.g:3187:1: ( ( rule__OperationComplex__Group_1__0 )? )
            // InternalUSE.g:3188:2: ( rule__OperationComplex__Group_1__0 )?
            {
             before(grammarAccess.getOperationComplexAccess().getGroup_1()); 
            // InternalUSE.g:3189:2: ( rule__OperationComplex__Group_1__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==47) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalUSE.g:3189:3: rule__OperationComplex__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OperationComplex__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationComplexAccess().getGroup_1()); 

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
    // InternalUSE.g:3197:1: rule__OperationComplex__Group__2 : rule__OperationComplex__Group__2__Impl ;
    public final void rule__OperationComplex__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3201:1: ( rule__OperationComplex__Group__2__Impl )
            // InternalUSE.g:3202:2: rule__OperationComplex__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationComplex__Group__2__Impl();

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
    // InternalUSE.g:3208:1: rule__OperationComplex__Group__2__Impl : ( ( rule__OperationComplex__ConditionsAssignment_2 )* ) ;
    public final void rule__OperationComplex__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3212:1: ( ( ( rule__OperationComplex__ConditionsAssignment_2 )* ) )
            // InternalUSE.g:3213:1: ( ( rule__OperationComplex__ConditionsAssignment_2 )* )
            {
            // InternalUSE.g:3213:1: ( ( rule__OperationComplex__ConditionsAssignment_2 )* )
            // InternalUSE.g:3214:2: ( rule__OperationComplex__ConditionsAssignment_2 )*
            {
             before(grammarAccess.getOperationComplexAccess().getConditionsAssignment_2()); 
            // InternalUSE.g:3215:2: ( rule__OperationComplex__ConditionsAssignment_2 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=54 && LA44_0<=55)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalUSE.g:3215:3: rule__OperationComplex__ConditionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__OperationComplex__ConditionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getOperationComplexAccess().getConditionsAssignment_2()); 

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


    // $ANTLR start "rule__OperationComplex__Group_1__0"
    // InternalUSE.g:3224:1: rule__OperationComplex__Group_1__0 : rule__OperationComplex__Group_1__0__Impl rule__OperationComplex__Group_1__1 ;
    public final void rule__OperationComplex__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3228:1: ( rule__OperationComplex__Group_1__0__Impl rule__OperationComplex__Group_1__1 )
            // InternalUSE.g:3229:2: rule__OperationComplex__Group_1__0__Impl rule__OperationComplex__Group_1__1
            {
            pushFollow(FOLLOW_33);
            rule__OperationComplex__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationComplex__Group_1__1();

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
    // $ANTLR end "rule__OperationComplex__Group_1__0"


    // $ANTLR start "rule__OperationComplex__Group_1__0__Impl"
    // InternalUSE.g:3236:1: rule__OperationComplex__Group_1__0__Impl : ( 'begin' ) ;
    public final void rule__OperationComplex__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3240:1: ( ( 'begin' ) )
            // InternalUSE.g:3241:1: ( 'begin' )
            {
            // InternalUSE.g:3241:1: ( 'begin' )
            // InternalUSE.g:3242:2: 'begin'
            {
             before(grammarAccess.getOperationComplexAccess().getBeginKeyword_1_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getOperationComplexAccess().getBeginKeyword_1_0()); 

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
    // $ANTLR end "rule__OperationComplex__Group_1__0__Impl"


    // $ANTLR start "rule__OperationComplex__Group_1__1"
    // InternalUSE.g:3251:1: rule__OperationComplex__Group_1__1 : rule__OperationComplex__Group_1__1__Impl rule__OperationComplex__Group_1__2 ;
    public final void rule__OperationComplex__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3255:1: ( rule__OperationComplex__Group_1__1__Impl rule__OperationComplex__Group_1__2 )
            // InternalUSE.g:3256:2: rule__OperationComplex__Group_1__1__Impl rule__OperationComplex__Group_1__2
            {
            pushFollow(FOLLOW_33);
            rule__OperationComplex__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationComplex__Group_1__2();

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
    // $ANTLR end "rule__OperationComplex__Group_1__1"


    // $ANTLR start "rule__OperationComplex__Group_1__1__Impl"
    // InternalUSE.g:3263:1: rule__OperationComplex__Group_1__1__Impl : ( ( rule__OperationComplex__OperationbodyAssignment_1_1 )? ) ;
    public final void rule__OperationComplex__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3267:1: ( ( ( rule__OperationComplex__OperationbodyAssignment_1_1 )? ) )
            // InternalUSE.g:3268:1: ( ( rule__OperationComplex__OperationbodyAssignment_1_1 )? )
            {
            // InternalUSE.g:3268:1: ( ( rule__OperationComplex__OperationbodyAssignment_1_1 )? )
            // InternalUSE.g:3269:2: ( rule__OperationComplex__OperationbodyAssignment_1_1 )?
            {
             before(grammarAccess.getOperationComplexAccess().getOperationbodyAssignment_1_1()); 
            // InternalUSE.g:3270:2: ( rule__OperationComplex__OperationbodyAssignment_1_1 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_STRING) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalUSE.g:3270:3: rule__OperationComplex__OperationbodyAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__OperationComplex__OperationbodyAssignment_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationComplexAccess().getOperationbodyAssignment_1_1()); 

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
    // $ANTLR end "rule__OperationComplex__Group_1__1__Impl"


    // $ANTLR start "rule__OperationComplex__Group_1__2"
    // InternalUSE.g:3278:1: rule__OperationComplex__Group_1__2 : rule__OperationComplex__Group_1__2__Impl ;
    public final void rule__OperationComplex__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3282:1: ( rule__OperationComplex__Group_1__2__Impl )
            // InternalUSE.g:3283:2: rule__OperationComplex__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationComplex__Group_1__2__Impl();

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
    // $ANTLR end "rule__OperationComplex__Group_1__2"


    // $ANTLR start "rule__OperationComplex__Group_1__2__Impl"
    // InternalUSE.g:3289:1: rule__OperationComplex__Group_1__2__Impl : ( 'end' ) ;
    public final void rule__OperationComplex__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3293:1: ( ( 'end' ) )
            // InternalUSE.g:3294:1: ( 'end' )
            {
            // InternalUSE.g:3294:1: ( 'end' )
            // InternalUSE.g:3295:2: 'end'
            {
             before(grammarAccess.getOperationComplexAccess().getEndKeyword_1_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getOperationComplexAccess().getEndKeyword_1_2()); 

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
    // $ANTLR end "rule__OperationComplex__Group_1__2__Impl"


    // $ANTLR start "rule__OperationDeclaration__Group__0"
    // InternalUSE.g:3305:1: rule__OperationDeclaration__Group__0 : rule__OperationDeclaration__Group__0__Impl rule__OperationDeclaration__Group__1 ;
    public final void rule__OperationDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3309:1: ( rule__OperationDeclaration__Group__0__Impl rule__OperationDeclaration__Group__1 )
            // InternalUSE.g:3310:2: rule__OperationDeclaration__Group__0__Impl rule__OperationDeclaration__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalUSE.g:3317:1: rule__OperationDeclaration__Group__0__Impl : ( ( rule__OperationDeclaration__NameAssignment_0 ) ) ;
    public final void rule__OperationDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3321:1: ( ( ( rule__OperationDeclaration__NameAssignment_0 ) ) )
            // InternalUSE.g:3322:1: ( ( rule__OperationDeclaration__NameAssignment_0 ) )
            {
            // InternalUSE.g:3322:1: ( ( rule__OperationDeclaration__NameAssignment_0 ) )
            // InternalUSE.g:3323:2: ( rule__OperationDeclaration__NameAssignment_0 )
            {
             before(grammarAccess.getOperationDeclarationAccess().getNameAssignment_0()); 
            // InternalUSE.g:3324:2: ( rule__OperationDeclaration__NameAssignment_0 )
            // InternalUSE.g:3324:3: rule__OperationDeclaration__NameAssignment_0
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
    // InternalUSE.g:3332:1: rule__OperationDeclaration__Group__1 : rule__OperationDeclaration__Group__1__Impl rule__OperationDeclaration__Group__2 ;
    public final void rule__OperationDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3336:1: ( rule__OperationDeclaration__Group__1__Impl rule__OperationDeclaration__Group__2 )
            // InternalUSE.g:3337:2: rule__OperationDeclaration__Group__1__Impl rule__OperationDeclaration__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalUSE.g:3344:1: rule__OperationDeclaration__Group__1__Impl : ( '(' ) ;
    public final void rule__OperationDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3348:1: ( ( '(' ) )
            // InternalUSE.g:3349:1: ( '(' )
            {
            // InternalUSE.g:3349:1: ( '(' )
            // InternalUSE.g:3350:2: '('
            {
             before(grammarAccess.getOperationDeclarationAccess().getLeftParenthesisKeyword_1()); 
            match(input,48,FOLLOW_2); 
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
    // InternalUSE.g:3359:1: rule__OperationDeclaration__Group__2 : rule__OperationDeclaration__Group__2__Impl rule__OperationDeclaration__Group__3 ;
    public final void rule__OperationDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3363:1: ( rule__OperationDeclaration__Group__2__Impl rule__OperationDeclaration__Group__3 )
            // InternalUSE.g:3364:2: rule__OperationDeclaration__Group__2__Impl rule__OperationDeclaration__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalUSE.g:3371:1: rule__OperationDeclaration__Group__2__Impl : ( ( rule__OperationDeclaration__ParametersAssignment_2 )* ) ;
    public final void rule__OperationDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3375:1: ( ( ( rule__OperationDeclaration__ParametersAssignment_2 )* ) )
            // InternalUSE.g:3376:1: ( ( rule__OperationDeclaration__ParametersAssignment_2 )* )
            {
            // InternalUSE.g:3376:1: ( ( rule__OperationDeclaration__ParametersAssignment_2 )* )
            // InternalUSE.g:3377:2: ( rule__OperationDeclaration__ParametersAssignment_2 )*
            {
             before(grammarAccess.getOperationDeclarationAccess().getParametersAssignment_2()); 
            // InternalUSE.g:3378:2: ( rule__OperationDeclaration__ParametersAssignment_2 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ID) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalUSE.g:3378:3: rule__OperationDeclaration__ParametersAssignment_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__OperationDeclaration__ParametersAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getOperationDeclarationAccess().getParametersAssignment_2()); 

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
    // InternalUSE.g:3386:1: rule__OperationDeclaration__Group__3 : rule__OperationDeclaration__Group__3__Impl rule__OperationDeclaration__Group__4 ;
    public final void rule__OperationDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3390:1: ( rule__OperationDeclaration__Group__3__Impl rule__OperationDeclaration__Group__4 )
            // InternalUSE.g:3391:2: rule__OperationDeclaration__Group__3__Impl rule__OperationDeclaration__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalUSE.g:3398:1: rule__OperationDeclaration__Group__3__Impl : ( ')' ) ;
    public final void rule__OperationDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3402:1: ( ( ')' ) )
            // InternalUSE.g:3403:1: ( ')' )
            {
            // InternalUSE.g:3403:1: ( ')' )
            // InternalUSE.g:3404:2: ')'
            {
             before(grammarAccess.getOperationDeclarationAccess().getRightParenthesisKeyword_3()); 
            match(input,49,FOLLOW_2); 
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
    // InternalUSE.g:3413:1: rule__OperationDeclaration__Group__4 : rule__OperationDeclaration__Group__4__Impl ;
    public final void rule__OperationDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3417:1: ( rule__OperationDeclaration__Group__4__Impl )
            // InternalUSE.g:3418:2: rule__OperationDeclaration__Group__4__Impl
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
    // InternalUSE.g:3424:1: rule__OperationDeclaration__Group__4__Impl : ( ( rule__OperationDeclaration__Group_4__0 )? ) ;
    public final void rule__OperationDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3428:1: ( ( ( rule__OperationDeclaration__Group_4__0 )? ) )
            // InternalUSE.g:3429:1: ( ( rule__OperationDeclaration__Group_4__0 )? )
            {
            // InternalUSE.g:3429:1: ( ( rule__OperationDeclaration__Group_4__0 )? )
            // InternalUSE.g:3430:2: ( rule__OperationDeclaration__Group_4__0 )?
            {
             before(grammarAccess.getOperationDeclarationAccess().getGroup_4()); 
            // InternalUSE.g:3431:2: ( rule__OperationDeclaration__Group_4__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==44) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalUSE.g:3431:3: rule__OperationDeclaration__Group_4__0
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
    // InternalUSE.g:3440:1: rule__OperationDeclaration__Group_4__0 : rule__OperationDeclaration__Group_4__0__Impl rule__OperationDeclaration__Group_4__1 ;
    public final void rule__OperationDeclaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3444:1: ( rule__OperationDeclaration__Group_4__0__Impl rule__OperationDeclaration__Group_4__1 )
            // InternalUSE.g:3445:2: rule__OperationDeclaration__Group_4__0__Impl rule__OperationDeclaration__Group_4__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalUSE.g:3452:1: rule__OperationDeclaration__Group_4__0__Impl : ( ':' ) ;
    public final void rule__OperationDeclaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3456:1: ( ( ':' ) )
            // InternalUSE.g:3457:1: ( ':' )
            {
            // InternalUSE.g:3457:1: ( ':' )
            // InternalUSE.g:3458:2: ':'
            {
             before(grammarAccess.getOperationDeclarationAccess().getColonKeyword_4_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalUSE.g:3467:1: rule__OperationDeclaration__Group_4__1 : rule__OperationDeclaration__Group_4__1__Impl ;
    public final void rule__OperationDeclaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3471:1: ( rule__OperationDeclaration__Group_4__1__Impl )
            // InternalUSE.g:3472:2: rule__OperationDeclaration__Group_4__1__Impl
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
    // InternalUSE.g:3478:1: rule__OperationDeclaration__Group_4__1__Impl : ( ( rule__OperationDeclaration__ReturnTypeAssignment_4_1 ) ) ;
    public final void rule__OperationDeclaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3482:1: ( ( ( rule__OperationDeclaration__ReturnTypeAssignment_4_1 ) ) )
            // InternalUSE.g:3483:1: ( ( rule__OperationDeclaration__ReturnTypeAssignment_4_1 ) )
            {
            // InternalUSE.g:3483:1: ( ( rule__OperationDeclaration__ReturnTypeAssignment_4_1 ) )
            // InternalUSE.g:3484:2: ( rule__OperationDeclaration__ReturnTypeAssignment_4_1 )
            {
             before(grammarAccess.getOperationDeclarationAccess().getReturnTypeAssignment_4_1()); 
            // InternalUSE.g:3485:2: ( rule__OperationDeclaration__ReturnTypeAssignment_4_1 )
            // InternalUSE.g:3485:3: rule__OperationDeclaration__ReturnTypeAssignment_4_1
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


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalUSE.g:3494:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3498:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalUSE.g:3499:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

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
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalUSE.g:3506:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3510:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // InternalUSE.g:3511:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // InternalUSE.g:3511:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // InternalUSE.g:3512:2: ( rule__Parameter__NameAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            // InternalUSE.g:3513:2: ( rule__Parameter__NameAssignment_0 )
            // InternalUSE.g:3513:3: rule__Parameter__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalUSE.g:3521:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3525:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalUSE.g:3526:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

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
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalUSE.g:3533:1: rule__Parameter__Group__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3537:1: ( ( ':' ) )
            // InternalUSE.g:3538:1: ( ':' )
            {
            // InternalUSE.g:3538:1: ( ':' )
            // InternalUSE.g:3539:2: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalUSE.g:3548:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3552:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalUSE.g:3553:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3();

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
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalUSE.g:3560:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__TypeAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3564:1: ( ( ( rule__Parameter__TypeAssignment_2 ) ) )
            // InternalUSE.g:3565:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            {
            // InternalUSE.g:3565:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            // InternalUSE.g:3566:2: ( rule__Parameter__TypeAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_2()); 
            // InternalUSE.g:3567:2: ( rule__Parameter__TypeAssignment_2 )
            // InternalUSE.g:3567:3: rule__Parameter__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // InternalUSE.g:3575:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3579:1: ( rule__Parameter__Group__3__Impl )
            // InternalUSE.g:3580:2: rule__Parameter__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3__Impl();

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
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // InternalUSE.g:3586:1: rule__Parameter__Group__3__Impl : ( ( ',' )? ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3590:1: ( ( ( ',' )? ) )
            // InternalUSE.g:3591:1: ( ( ',' )? )
            {
            // InternalUSE.g:3591:1: ( ( ',' )? )
            // InternalUSE.g:3592:2: ( ',' )?
            {
             before(grammarAccess.getParameterAccess().getCommaKeyword_3()); 
            // InternalUSE.g:3593:2: ( ',' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==31) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalUSE.g:3593:3: ','
                    {
                    match(input,31,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__ConstraintsBase__Group__0"
    // InternalUSE.g:3602:1: rule__ConstraintsBase__Group__0 : rule__ConstraintsBase__Group__0__Impl rule__ConstraintsBase__Group__1 ;
    public final void rule__ConstraintsBase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3606:1: ( rule__ConstraintsBase__Group__0__Impl rule__ConstraintsBase__Group__1 )
            // InternalUSE.g:3607:2: rule__ConstraintsBase__Group__0__Impl rule__ConstraintsBase__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalUSE.g:3614:1: rule__ConstraintsBase__Group__0__Impl : ( 'constraints' ) ;
    public final void rule__ConstraintsBase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3618:1: ( ( 'constraints' ) )
            // InternalUSE.g:3619:1: ( 'constraints' )
            {
            // InternalUSE.g:3619:1: ( 'constraints' )
            // InternalUSE.g:3620:2: 'constraints'
            {
             before(grammarAccess.getConstraintsBaseAccess().getConstraintsKeyword_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalUSE.g:3629:1: rule__ConstraintsBase__Group__1 : rule__ConstraintsBase__Group__1__Impl ;
    public final void rule__ConstraintsBase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3633:1: ( rule__ConstraintsBase__Group__1__Impl )
            // InternalUSE.g:3634:2: rule__ConstraintsBase__Group__1__Impl
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
    // InternalUSE.g:3640:1: rule__ConstraintsBase__Group__1__Impl : ( ( rule__ConstraintsBase__InvariantsAssignment_1 )* ) ;
    public final void rule__ConstraintsBase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3644:1: ( ( ( rule__ConstraintsBase__InvariantsAssignment_1 )* ) )
            // InternalUSE.g:3645:1: ( ( rule__ConstraintsBase__InvariantsAssignment_1 )* )
            {
            // InternalUSE.g:3645:1: ( ( rule__ConstraintsBase__InvariantsAssignment_1 )* )
            // InternalUSE.g:3646:2: ( rule__ConstraintsBase__InvariantsAssignment_1 )*
            {
             before(grammarAccess.getConstraintsBaseAccess().getInvariantsAssignment_1()); 
            // InternalUSE.g:3647:2: ( rule__ConstraintsBase__InvariantsAssignment_1 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==52) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalUSE.g:3647:3: rule__ConstraintsBase__InvariantsAssignment_1
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__ConstraintsBase__InvariantsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalUSE.g:3656:1: rule__ConstrainsGeneral__Group__0 : rule__ConstrainsGeneral__Group__0__Impl rule__ConstrainsGeneral__Group__1 ;
    public final void rule__ConstrainsGeneral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3660:1: ( rule__ConstrainsGeneral__Group__0__Impl rule__ConstrainsGeneral__Group__1 )
            // InternalUSE.g:3661:2: rule__ConstrainsGeneral__Group__0__Impl rule__ConstrainsGeneral__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalUSE.g:3668:1: rule__ConstrainsGeneral__Group__0__Impl : ( 'constraints' ) ;
    public final void rule__ConstrainsGeneral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3672:1: ( ( 'constraints' ) )
            // InternalUSE.g:3673:1: ( 'constraints' )
            {
            // InternalUSE.g:3673:1: ( 'constraints' )
            // InternalUSE.g:3674:2: 'constraints'
            {
             before(grammarAccess.getConstrainsGeneralAccess().getConstraintsKeyword_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalUSE.g:3683:1: rule__ConstrainsGeneral__Group__1 : rule__ConstrainsGeneral__Group__1__Impl ;
    public final void rule__ConstrainsGeneral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3687:1: ( rule__ConstrainsGeneral__Group__1__Impl )
            // InternalUSE.g:3688:2: rule__ConstrainsGeneral__Group__1__Impl
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
    // InternalUSE.g:3694:1: rule__ConstrainsGeneral__Group__1__Impl : ( ( rule__ConstrainsGeneral__ContextsAssignment_1 )* ) ;
    public final void rule__ConstrainsGeneral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3698:1: ( ( ( rule__ConstrainsGeneral__ContextsAssignment_1 )* ) )
            // InternalUSE.g:3699:1: ( ( rule__ConstrainsGeneral__ContextsAssignment_1 )* )
            {
            // InternalUSE.g:3699:1: ( ( rule__ConstrainsGeneral__ContextsAssignment_1 )* )
            // InternalUSE.g:3700:2: ( rule__ConstrainsGeneral__ContextsAssignment_1 )*
            {
             before(grammarAccess.getConstrainsGeneralAccess().getContextsAssignment_1()); 
            // InternalUSE.g:3701:2: ( rule__ConstrainsGeneral__ContextsAssignment_1 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==51) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalUSE.g:3701:3: rule__ConstrainsGeneral__ContextsAssignment_1
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__ConstrainsGeneral__ContextsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // InternalUSE.g:3710:1: rule__InvariantContext__Group__0 : rule__InvariantContext__Group__0__Impl rule__InvariantContext__Group__1 ;
    public final void rule__InvariantContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3714:1: ( rule__InvariantContext__Group__0__Impl rule__InvariantContext__Group__1 )
            // InternalUSE.g:3715:2: rule__InvariantContext__Group__0__Impl rule__InvariantContext__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalUSE.g:3722:1: rule__InvariantContext__Group__0__Impl : ( 'context' ) ;
    public final void rule__InvariantContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3726:1: ( ( 'context' ) )
            // InternalUSE.g:3727:1: ( 'context' )
            {
            // InternalUSE.g:3727:1: ( 'context' )
            // InternalUSE.g:3728:2: 'context'
            {
             before(grammarAccess.getInvariantContextAccess().getContextKeyword_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalUSE.g:3737:1: rule__InvariantContext__Group__1 : rule__InvariantContext__Group__1__Impl rule__InvariantContext__Group__2 ;
    public final void rule__InvariantContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3741:1: ( rule__InvariantContext__Group__1__Impl rule__InvariantContext__Group__2 )
            // InternalUSE.g:3742:2: rule__InvariantContext__Group__1__Impl rule__InvariantContext__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalUSE.g:3749:1: rule__InvariantContext__Group__1__Impl : ( ( rule__InvariantContext__Group_1__0 )? ) ;
    public final void rule__InvariantContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3753:1: ( ( ( rule__InvariantContext__Group_1__0 )? ) )
            // InternalUSE.g:3754:1: ( ( rule__InvariantContext__Group_1__0 )? )
            {
            // InternalUSE.g:3754:1: ( ( rule__InvariantContext__Group_1__0 )? )
            // InternalUSE.g:3755:2: ( rule__InvariantContext__Group_1__0 )?
            {
             before(grammarAccess.getInvariantContextAccess().getGroup_1()); 
            // InternalUSE.g:3756:2: ( rule__InvariantContext__Group_1__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==44) ) {
                    alt51=1;
                }
            }
            switch (alt51) {
                case 1 :
                    // InternalUSE.g:3756:3: rule__InvariantContext__Group_1__0
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
    // InternalUSE.g:3764:1: rule__InvariantContext__Group__2 : rule__InvariantContext__Group__2__Impl rule__InvariantContext__Group__3 ;
    public final void rule__InvariantContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3768:1: ( rule__InvariantContext__Group__2__Impl rule__InvariantContext__Group__3 )
            // InternalUSE.g:3769:2: rule__InvariantContext__Group__2__Impl rule__InvariantContext__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalUSE.g:3776:1: rule__InvariantContext__Group__2__Impl : ( ( rule__InvariantContext__ClassnameAssignment_2 ) ) ;
    public final void rule__InvariantContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3780:1: ( ( ( rule__InvariantContext__ClassnameAssignment_2 ) ) )
            // InternalUSE.g:3781:1: ( ( rule__InvariantContext__ClassnameAssignment_2 ) )
            {
            // InternalUSE.g:3781:1: ( ( rule__InvariantContext__ClassnameAssignment_2 ) )
            // InternalUSE.g:3782:2: ( rule__InvariantContext__ClassnameAssignment_2 )
            {
             before(grammarAccess.getInvariantContextAccess().getClassnameAssignment_2()); 
            // InternalUSE.g:3783:2: ( rule__InvariantContext__ClassnameAssignment_2 )
            // InternalUSE.g:3783:3: rule__InvariantContext__ClassnameAssignment_2
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
    // InternalUSE.g:3791:1: rule__InvariantContext__Group__3 : rule__InvariantContext__Group__3__Impl ;
    public final void rule__InvariantContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3795:1: ( rule__InvariantContext__Group__3__Impl )
            // InternalUSE.g:3796:2: rule__InvariantContext__Group__3__Impl
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
    // InternalUSE.g:3802:1: rule__InvariantContext__Group__3__Impl : ( ( rule__InvariantContext__InvariantsAssignment_3 )* ) ;
    public final void rule__InvariantContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3806:1: ( ( ( rule__InvariantContext__InvariantsAssignment_3 )* ) )
            // InternalUSE.g:3807:1: ( ( rule__InvariantContext__InvariantsAssignment_3 )* )
            {
            // InternalUSE.g:3807:1: ( ( rule__InvariantContext__InvariantsAssignment_3 )* )
            // InternalUSE.g:3808:2: ( rule__InvariantContext__InvariantsAssignment_3 )*
            {
             before(grammarAccess.getInvariantContextAccess().getInvariantsAssignment_3()); 
            // InternalUSE.g:3809:2: ( rule__InvariantContext__InvariantsAssignment_3 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==52) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalUSE.g:3809:3: rule__InvariantContext__InvariantsAssignment_3
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__InvariantContext__InvariantsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
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
    // InternalUSE.g:3818:1: rule__InvariantContext__Group_1__0 : rule__InvariantContext__Group_1__0__Impl rule__InvariantContext__Group_1__1 ;
    public final void rule__InvariantContext__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3822:1: ( rule__InvariantContext__Group_1__0__Impl rule__InvariantContext__Group_1__1 )
            // InternalUSE.g:3823:2: rule__InvariantContext__Group_1__0__Impl rule__InvariantContext__Group_1__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalUSE.g:3830:1: rule__InvariantContext__Group_1__0__Impl : ( ( rule__InvariantContext__VariablenameAssignment_1_0 ) ) ;
    public final void rule__InvariantContext__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3834:1: ( ( ( rule__InvariantContext__VariablenameAssignment_1_0 ) ) )
            // InternalUSE.g:3835:1: ( ( rule__InvariantContext__VariablenameAssignment_1_0 ) )
            {
            // InternalUSE.g:3835:1: ( ( rule__InvariantContext__VariablenameAssignment_1_0 ) )
            // InternalUSE.g:3836:2: ( rule__InvariantContext__VariablenameAssignment_1_0 )
            {
             before(grammarAccess.getInvariantContextAccess().getVariablenameAssignment_1_0()); 
            // InternalUSE.g:3837:2: ( rule__InvariantContext__VariablenameAssignment_1_0 )
            // InternalUSE.g:3837:3: rule__InvariantContext__VariablenameAssignment_1_0
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
    // InternalUSE.g:3845:1: rule__InvariantContext__Group_1__1 : rule__InvariantContext__Group_1__1__Impl ;
    public final void rule__InvariantContext__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3849:1: ( rule__InvariantContext__Group_1__1__Impl )
            // InternalUSE.g:3850:2: rule__InvariantContext__Group_1__1__Impl
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
    // InternalUSE.g:3856:1: rule__InvariantContext__Group_1__1__Impl : ( ':' ) ;
    public final void rule__InvariantContext__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3860:1: ( ( ':' ) )
            // InternalUSE.g:3861:1: ( ':' )
            {
            // InternalUSE.g:3861:1: ( ':' )
            // InternalUSE.g:3862:2: ':'
            {
             before(grammarAccess.getInvariantContextAccess().getColonKeyword_1_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalUSE.g:3872:1: rule__InvariantDefinition__Group__0 : rule__InvariantDefinition__Group__0__Impl rule__InvariantDefinition__Group__1 ;
    public final void rule__InvariantDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3876:1: ( rule__InvariantDefinition__Group__0__Impl rule__InvariantDefinition__Group__1 )
            // InternalUSE.g:3877:2: rule__InvariantDefinition__Group__0__Impl rule__InvariantDefinition__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalUSE.g:3884:1: rule__InvariantDefinition__Group__0__Impl : ( 'inv' ) ;
    public final void rule__InvariantDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3888:1: ( ( 'inv' ) )
            // InternalUSE.g:3889:1: ( 'inv' )
            {
            // InternalUSE.g:3889:1: ( 'inv' )
            // InternalUSE.g:3890:2: 'inv'
            {
             before(grammarAccess.getInvariantDefinitionAccess().getInvKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalUSE.g:3899:1: rule__InvariantDefinition__Group__1 : rule__InvariantDefinition__Group__1__Impl rule__InvariantDefinition__Group__2 ;
    public final void rule__InvariantDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3903:1: ( rule__InvariantDefinition__Group__1__Impl rule__InvariantDefinition__Group__2 )
            // InternalUSE.g:3904:2: rule__InvariantDefinition__Group__1__Impl rule__InvariantDefinition__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalUSE.g:3911:1: rule__InvariantDefinition__Group__1__Impl : ( ( rule__InvariantDefinition__NameAssignment_1 )? ) ;
    public final void rule__InvariantDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3915:1: ( ( ( rule__InvariantDefinition__NameAssignment_1 )? ) )
            // InternalUSE.g:3916:1: ( ( rule__InvariantDefinition__NameAssignment_1 )? )
            {
            // InternalUSE.g:3916:1: ( ( rule__InvariantDefinition__NameAssignment_1 )? )
            // InternalUSE.g:3917:2: ( rule__InvariantDefinition__NameAssignment_1 )?
            {
             before(grammarAccess.getInvariantDefinitionAccess().getNameAssignment_1()); 
            // InternalUSE.g:3918:2: ( rule__InvariantDefinition__NameAssignment_1 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalUSE.g:3918:3: rule__InvariantDefinition__NameAssignment_1
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
    // InternalUSE.g:3926:1: rule__InvariantDefinition__Group__2 : rule__InvariantDefinition__Group__2__Impl rule__InvariantDefinition__Group__3 ;
    public final void rule__InvariantDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3930:1: ( rule__InvariantDefinition__Group__2__Impl rule__InvariantDefinition__Group__3 )
            // InternalUSE.g:3931:2: rule__InvariantDefinition__Group__2__Impl rule__InvariantDefinition__Group__3
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
    // InternalUSE.g:3938:1: rule__InvariantDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__InvariantDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3942:1: ( ( ':' ) )
            // InternalUSE.g:3943:1: ( ':' )
            {
            // InternalUSE.g:3943:1: ( ':' )
            // InternalUSE.g:3944:2: ':'
            {
             before(grammarAccess.getInvariantDefinitionAccess().getColonKeyword_2()); 
            match(input,44,FOLLOW_2); 
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
    // InternalUSE.g:3953:1: rule__InvariantDefinition__Group__3 : rule__InvariantDefinition__Group__3__Impl ;
    public final void rule__InvariantDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3957:1: ( rule__InvariantDefinition__Group__3__Impl )
            // InternalUSE.g:3958:2: rule__InvariantDefinition__Group__3__Impl
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
    // InternalUSE.g:3964:1: rule__InvariantDefinition__Group__3__Impl : ( ( rule__InvariantDefinition__OclexpressionAssignment_3 ) ) ;
    public final void rule__InvariantDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3968:1: ( ( ( rule__InvariantDefinition__OclexpressionAssignment_3 ) ) )
            // InternalUSE.g:3969:1: ( ( rule__InvariantDefinition__OclexpressionAssignment_3 ) )
            {
            // InternalUSE.g:3969:1: ( ( rule__InvariantDefinition__OclexpressionAssignment_3 ) )
            // InternalUSE.g:3970:2: ( rule__InvariantDefinition__OclexpressionAssignment_3 )
            {
             before(grammarAccess.getInvariantDefinitionAccess().getOclexpressionAssignment_3()); 
            // InternalUSE.g:3971:2: ( rule__InvariantDefinition__OclexpressionAssignment_3 )
            // InternalUSE.g:3971:3: rule__InvariantDefinition__OclexpressionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__InvariantDefinition__OclexpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInvariantDefinitionAccess().getOclexpressionAssignment_3()); 

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
    // InternalUSE.g:3980:1: rule__OperationContext__Group__0 : rule__OperationContext__Group__0__Impl rule__OperationContext__Group__1 ;
    public final void rule__OperationContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3984:1: ( rule__OperationContext__Group__0__Impl rule__OperationContext__Group__1 )
            // InternalUSE.g:3985:2: rule__OperationContext__Group__0__Impl rule__OperationContext__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalUSE.g:3992:1: rule__OperationContext__Group__0__Impl : ( 'context' ) ;
    public final void rule__OperationContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3996:1: ( ( 'context' ) )
            // InternalUSE.g:3997:1: ( 'context' )
            {
            // InternalUSE.g:3997:1: ( 'context' )
            // InternalUSE.g:3998:2: 'context'
            {
             before(grammarAccess.getOperationContextAccess().getContextKeyword_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalUSE.g:4007:1: rule__OperationContext__Group__1 : rule__OperationContext__Group__1__Impl rule__OperationContext__Group__2 ;
    public final void rule__OperationContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4011:1: ( rule__OperationContext__Group__1__Impl rule__OperationContext__Group__2 )
            // InternalUSE.g:4012:2: rule__OperationContext__Group__1__Impl rule__OperationContext__Group__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalUSE.g:4019:1: rule__OperationContext__Group__1__Impl : ( ( rule__OperationContext__ClassnameAssignment_1 ) ) ;
    public final void rule__OperationContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4023:1: ( ( ( rule__OperationContext__ClassnameAssignment_1 ) ) )
            // InternalUSE.g:4024:1: ( ( rule__OperationContext__ClassnameAssignment_1 ) )
            {
            // InternalUSE.g:4024:1: ( ( rule__OperationContext__ClassnameAssignment_1 ) )
            // InternalUSE.g:4025:2: ( rule__OperationContext__ClassnameAssignment_1 )
            {
             before(grammarAccess.getOperationContextAccess().getClassnameAssignment_1()); 
            // InternalUSE.g:4026:2: ( rule__OperationContext__ClassnameAssignment_1 )
            // InternalUSE.g:4026:3: rule__OperationContext__ClassnameAssignment_1
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
    // InternalUSE.g:4034:1: rule__OperationContext__Group__2 : rule__OperationContext__Group__2__Impl ;
    public final void rule__OperationContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4038:1: ( rule__OperationContext__Group__2__Impl )
            // InternalUSE.g:4039:2: rule__OperationContext__Group__2__Impl
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
    // InternalUSE.g:4045:1: rule__OperationContext__Group__2__Impl : ( ( rule__OperationContext__ConstrainsAssignment_2 ) ) ;
    public final void rule__OperationContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4049:1: ( ( ( rule__OperationContext__ConstrainsAssignment_2 ) ) )
            // InternalUSE.g:4050:1: ( ( rule__OperationContext__ConstrainsAssignment_2 ) )
            {
            // InternalUSE.g:4050:1: ( ( rule__OperationContext__ConstrainsAssignment_2 ) )
            // InternalUSE.g:4051:2: ( rule__OperationContext__ConstrainsAssignment_2 )
            {
             before(grammarAccess.getOperationContextAccess().getConstrainsAssignment_2()); 
            // InternalUSE.g:4052:2: ( rule__OperationContext__ConstrainsAssignment_2 )
            // InternalUSE.g:4052:3: rule__OperationContext__ConstrainsAssignment_2
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
    // InternalUSE.g:4061:1: rule__OperationConstraints__Group__0 : rule__OperationConstraints__Group__0__Impl rule__OperationConstraints__Group__1 ;
    public final void rule__OperationConstraints__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4065:1: ( rule__OperationConstraints__Group__0__Impl rule__OperationConstraints__Group__1 )
            // InternalUSE.g:4066:2: rule__OperationConstraints__Group__0__Impl rule__OperationConstraints__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalUSE.g:4073:1: rule__OperationConstraints__Group__0__Impl : ( '::' ) ;
    public final void rule__OperationConstraints__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4077:1: ( ( '::' ) )
            // InternalUSE.g:4078:1: ( '::' )
            {
            // InternalUSE.g:4078:1: ( '::' )
            // InternalUSE.g:4079:2: '::'
            {
             before(grammarAccess.getOperationConstraintsAccess().getColonColonKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalUSE.g:4088:1: rule__OperationConstraints__Group__1 : rule__OperationConstraints__Group__1__Impl rule__OperationConstraints__Group__2 ;
    public final void rule__OperationConstraints__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4092:1: ( rule__OperationConstraints__Group__1__Impl rule__OperationConstraints__Group__2 )
            // InternalUSE.g:4093:2: rule__OperationConstraints__Group__1__Impl rule__OperationConstraints__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalUSE.g:4100:1: rule__OperationConstraints__Group__1__Impl : ( ( rule__OperationConstraints__OperationDeclarationAssignment_1 ) ) ;
    public final void rule__OperationConstraints__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4104:1: ( ( ( rule__OperationConstraints__OperationDeclarationAssignment_1 ) ) )
            // InternalUSE.g:4105:1: ( ( rule__OperationConstraints__OperationDeclarationAssignment_1 ) )
            {
            // InternalUSE.g:4105:1: ( ( rule__OperationConstraints__OperationDeclarationAssignment_1 ) )
            // InternalUSE.g:4106:2: ( rule__OperationConstraints__OperationDeclarationAssignment_1 )
            {
             before(grammarAccess.getOperationConstraintsAccess().getOperationDeclarationAssignment_1()); 
            // InternalUSE.g:4107:2: ( rule__OperationConstraints__OperationDeclarationAssignment_1 )
            // InternalUSE.g:4107:3: rule__OperationConstraints__OperationDeclarationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OperationConstraints__OperationDeclarationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationConstraintsAccess().getOperationDeclarationAssignment_1()); 

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
    // InternalUSE.g:4115:1: rule__OperationConstraints__Group__2 : rule__OperationConstraints__Group__2__Impl ;
    public final void rule__OperationConstraints__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4119:1: ( rule__OperationConstraints__Group__2__Impl )
            // InternalUSE.g:4120:2: rule__OperationConstraints__Group__2__Impl
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
    // InternalUSE.g:4126:1: rule__OperationConstraints__Group__2__Impl : ( ( ( rule__OperationConstraints__ConditionsAssignment_2 ) ) ( ( rule__OperationConstraints__ConditionsAssignment_2 )* ) ) ;
    public final void rule__OperationConstraints__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4130:1: ( ( ( ( rule__OperationConstraints__ConditionsAssignment_2 ) ) ( ( rule__OperationConstraints__ConditionsAssignment_2 )* ) ) )
            // InternalUSE.g:4131:1: ( ( ( rule__OperationConstraints__ConditionsAssignment_2 ) ) ( ( rule__OperationConstraints__ConditionsAssignment_2 )* ) )
            {
            // InternalUSE.g:4131:1: ( ( ( rule__OperationConstraints__ConditionsAssignment_2 ) ) ( ( rule__OperationConstraints__ConditionsAssignment_2 )* ) )
            // InternalUSE.g:4132:2: ( ( rule__OperationConstraints__ConditionsAssignment_2 ) ) ( ( rule__OperationConstraints__ConditionsAssignment_2 )* )
            {
            // InternalUSE.g:4132:2: ( ( rule__OperationConstraints__ConditionsAssignment_2 ) )
            // InternalUSE.g:4133:3: ( rule__OperationConstraints__ConditionsAssignment_2 )
            {
             before(grammarAccess.getOperationConstraintsAccess().getConditionsAssignment_2()); 
            // InternalUSE.g:4134:3: ( rule__OperationConstraints__ConditionsAssignment_2 )
            // InternalUSE.g:4134:4: rule__OperationConstraints__ConditionsAssignment_2
            {
            pushFollow(FOLLOW_31);
            rule__OperationConstraints__ConditionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOperationConstraintsAccess().getConditionsAssignment_2()); 

            }

            // InternalUSE.g:4137:2: ( ( rule__OperationConstraints__ConditionsAssignment_2 )* )
            // InternalUSE.g:4138:3: ( rule__OperationConstraints__ConditionsAssignment_2 )*
            {
             before(grammarAccess.getOperationConstraintsAccess().getConditionsAssignment_2()); 
            // InternalUSE.g:4139:3: ( rule__OperationConstraints__ConditionsAssignment_2 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=54 && LA54_0<=55)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalUSE.g:4139:4: rule__OperationConstraints__ConditionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__OperationConstraints__ConditionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
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
    // InternalUSE.g:4149:1: rule__Precondition__Group__0 : rule__Precondition__Group__0__Impl rule__Precondition__Group__1 ;
    public final void rule__Precondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4153:1: ( rule__Precondition__Group__0__Impl rule__Precondition__Group__1 )
            // InternalUSE.g:4154:2: rule__Precondition__Group__0__Impl rule__Precondition__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalUSE.g:4161:1: rule__Precondition__Group__0__Impl : ( 'pre' ) ;
    public final void rule__Precondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4165:1: ( ( 'pre' ) )
            // InternalUSE.g:4166:1: ( 'pre' )
            {
            // InternalUSE.g:4166:1: ( 'pre' )
            // InternalUSE.g:4167:2: 'pre'
            {
             before(grammarAccess.getPreconditionAccess().getPreKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalUSE.g:4176:1: rule__Precondition__Group__1 : rule__Precondition__Group__1__Impl rule__Precondition__Group__2 ;
    public final void rule__Precondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4180:1: ( rule__Precondition__Group__1__Impl rule__Precondition__Group__2 )
            // InternalUSE.g:4181:2: rule__Precondition__Group__1__Impl rule__Precondition__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalUSE.g:4188:1: rule__Precondition__Group__1__Impl : ( ( rule__Precondition__NameAssignment_1 )? ) ;
    public final void rule__Precondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4192:1: ( ( ( rule__Precondition__NameAssignment_1 )? ) )
            // InternalUSE.g:4193:1: ( ( rule__Precondition__NameAssignment_1 )? )
            {
            // InternalUSE.g:4193:1: ( ( rule__Precondition__NameAssignment_1 )? )
            // InternalUSE.g:4194:2: ( rule__Precondition__NameAssignment_1 )?
            {
             before(grammarAccess.getPreconditionAccess().getNameAssignment_1()); 
            // InternalUSE.g:4195:2: ( rule__Precondition__NameAssignment_1 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalUSE.g:4195:3: rule__Precondition__NameAssignment_1
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
    // InternalUSE.g:4203:1: rule__Precondition__Group__2 : rule__Precondition__Group__2__Impl rule__Precondition__Group__3 ;
    public final void rule__Precondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4207:1: ( rule__Precondition__Group__2__Impl rule__Precondition__Group__3 )
            // InternalUSE.g:4208:2: rule__Precondition__Group__2__Impl rule__Precondition__Group__3
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
    // InternalUSE.g:4215:1: rule__Precondition__Group__2__Impl : ( ':' ) ;
    public final void rule__Precondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4219:1: ( ( ':' ) )
            // InternalUSE.g:4220:1: ( ':' )
            {
            // InternalUSE.g:4220:1: ( ':' )
            // InternalUSE.g:4221:2: ':'
            {
             before(grammarAccess.getPreconditionAccess().getColonKeyword_2()); 
            match(input,44,FOLLOW_2); 
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
    // InternalUSE.g:4230:1: rule__Precondition__Group__3 : rule__Precondition__Group__3__Impl ;
    public final void rule__Precondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4234:1: ( rule__Precondition__Group__3__Impl )
            // InternalUSE.g:4235:2: rule__Precondition__Group__3__Impl
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
    // InternalUSE.g:4241:1: rule__Precondition__Group__3__Impl : ( ( rule__Precondition__OclexpressionAssignment_3 ) ) ;
    public final void rule__Precondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4245:1: ( ( ( rule__Precondition__OclexpressionAssignment_3 ) ) )
            // InternalUSE.g:4246:1: ( ( rule__Precondition__OclexpressionAssignment_3 ) )
            {
            // InternalUSE.g:4246:1: ( ( rule__Precondition__OclexpressionAssignment_3 ) )
            // InternalUSE.g:4247:2: ( rule__Precondition__OclexpressionAssignment_3 )
            {
             before(grammarAccess.getPreconditionAccess().getOclexpressionAssignment_3()); 
            // InternalUSE.g:4248:2: ( rule__Precondition__OclexpressionAssignment_3 )
            // InternalUSE.g:4248:3: rule__Precondition__OclexpressionAssignment_3
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
    // InternalUSE.g:4257:1: rule__Postcondition__Group__0 : rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1 ;
    public final void rule__Postcondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4261:1: ( rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1 )
            // InternalUSE.g:4262:2: rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalUSE.g:4269:1: rule__Postcondition__Group__0__Impl : ( 'post' ) ;
    public final void rule__Postcondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4273:1: ( ( 'post' ) )
            // InternalUSE.g:4274:1: ( 'post' )
            {
            // InternalUSE.g:4274:1: ( 'post' )
            // InternalUSE.g:4275:2: 'post'
            {
             before(grammarAccess.getPostconditionAccess().getPostKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalUSE.g:4284:1: rule__Postcondition__Group__1 : rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2 ;
    public final void rule__Postcondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4288:1: ( rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2 )
            // InternalUSE.g:4289:2: rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalUSE.g:4296:1: rule__Postcondition__Group__1__Impl : ( ( rule__Postcondition__NameAssignment_1 )? ) ;
    public final void rule__Postcondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4300:1: ( ( ( rule__Postcondition__NameAssignment_1 )? ) )
            // InternalUSE.g:4301:1: ( ( rule__Postcondition__NameAssignment_1 )? )
            {
            // InternalUSE.g:4301:1: ( ( rule__Postcondition__NameAssignment_1 )? )
            // InternalUSE.g:4302:2: ( rule__Postcondition__NameAssignment_1 )?
            {
             before(grammarAccess.getPostconditionAccess().getNameAssignment_1()); 
            // InternalUSE.g:4303:2: ( rule__Postcondition__NameAssignment_1 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalUSE.g:4303:3: rule__Postcondition__NameAssignment_1
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
    // InternalUSE.g:4311:1: rule__Postcondition__Group__2 : rule__Postcondition__Group__2__Impl rule__Postcondition__Group__3 ;
    public final void rule__Postcondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4315:1: ( rule__Postcondition__Group__2__Impl rule__Postcondition__Group__3 )
            // InternalUSE.g:4316:2: rule__Postcondition__Group__2__Impl rule__Postcondition__Group__3
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
    // InternalUSE.g:4323:1: rule__Postcondition__Group__2__Impl : ( ':' ) ;
    public final void rule__Postcondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4327:1: ( ( ':' ) )
            // InternalUSE.g:4328:1: ( ':' )
            {
            // InternalUSE.g:4328:1: ( ':' )
            // InternalUSE.g:4329:2: ':'
            {
             before(grammarAccess.getPostconditionAccess().getColonKeyword_2()); 
            match(input,44,FOLLOW_2); 
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
    // InternalUSE.g:4338:1: rule__Postcondition__Group__3 : rule__Postcondition__Group__3__Impl ;
    public final void rule__Postcondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4342:1: ( rule__Postcondition__Group__3__Impl )
            // InternalUSE.g:4343:2: rule__Postcondition__Group__3__Impl
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
    // InternalUSE.g:4349:1: rule__Postcondition__Group__3__Impl : ( ( rule__Postcondition__OclexpressionAssignment_3 ) ) ;
    public final void rule__Postcondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4353:1: ( ( ( rule__Postcondition__OclexpressionAssignment_3 ) ) )
            // InternalUSE.g:4354:1: ( ( rule__Postcondition__OclexpressionAssignment_3 ) )
            {
            // InternalUSE.g:4354:1: ( ( rule__Postcondition__OclexpressionAssignment_3 ) )
            // InternalUSE.g:4355:2: ( rule__Postcondition__OclexpressionAssignment_3 )
            {
             before(grammarAccess.getPostconditionAccess().getOclexpressionAssignment_3()); 
            // InternalUSE.g:4356:2: ( rule__Postcondition__OclexpressionAssignment_3 )
            // InternalUSE.g:4356:3: rule__Postcondition__OclexpressionAssignment_3
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
    // InternalUSE.g:4365:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4369:1: ( ( RULE_ID ) )
            // InternalUSE.g:4370:2: ( RULE_ID )
            {
            // InternalUSE.g:4370:2: ( RULE_ID )
            // InternalUSE.g:4371:3: RULE_ID
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


    // $ANTLR start "rule__Model__EnumsAssignment_2_0"
    // InternalUSE.g:4380:1: rule__Model__EnumsAssignment_2_0 : ( ruleEnum ) ;
    public final void rule__Model__EnumsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4384:1: ( ( ruleEnum ) )
            // InternalUSE.g:4385:2: ( ruleEnum )
            {
            // InternalUSE.g:4385:2: ( ruleEnum )
            // InternalUSE.g:4386:3: ruleEnum
            {
             before(grammarAccess.getModelAccess().getEnumsEnumParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEnum();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEnumsEnumParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Model__EnumsAssignment_2_0"


    // $ANTLR start "rule__Model__PackagedElementAssignment_2_1"
    // InternalUSE.g:4395:1: rule__Model__PackagedElementAssignment_2_1 : ( ruleType ) ;
    public final void rule__Model__PackagedElementAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4399:1: ( ( ruleType ) )
            // InternalUSE.g:4400:2: ( ruleType )
            {
            // InternalUSE.g:4400:2: ( ruleType )
            // InternalUSE.g:4401:3: ruleType
            {
             before(grammarAccess.getModelAccess().getPackagedElementTypeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPackagedElementTypeParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Model__PackagedElementAssignment_2_1"


    // $ANTLR start "rule__Model__ConstraintsAssignment_2_2"
    // InternalUSE.g:4410:1: rule__Model__ConstraintsAssignment_2_2 : ( ruleConstrainsGeneral ) ;
    public final void rule__Model__ConstraintsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4414:1: ( ( ruleConstrainsGeneral ) )
            // InternalUSE.g:4415:2: ( ruleConstrainsGeneral )
            {
            // InternalUSE.g:4415:2: ( ruleConstrainsGeneral )
            // InternalUSE.g:4416:3: ruleConstrainsGeneral
            {
             before(grammarAccess.getModelAccess().getConstraintsConstrainsGeneralParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConstrainsGeneral();

            state._fsp--;

             after(grammarAccess.getModelAccess().getConstraintsConstrainsGeneralParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__Model__ConstraintsAssignment_2_2"


    // $ANTLR start "rule__Multiplicity__MinValueAssignment_0"
    // InternalUSE.g:4425:1: rule__Multiplicity__MinValueAssignment_0 : ( ( rule__Multiplicity__MinValueAlternatives_0_0 ) ) ;
    public final void rule__Multiplicity__MinValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4429:1: ( ( ( rule__Multiplicity__MinValueAlternatives_0_0 ) ) )
            // InternalUSE.g:4430:2: ( ( rule__Multiplicity__MinValueAlternatives_0_0 ) )
            {
            // InternalUSE.g:4430:2: ( ( rule__Multiplicity__MinValueAlternatives_0_0 ) )
            // InternalUSE.g:4431:3: ( rule__Multiplicity__MinValueAlternatives_0_0 )
            {
             before(grammarAccess.getMultiplicityAccess().getMinValueAlternatives_0_0()); 
            // InternalUSE.g:4432:3: ( rule__Multiplicity__MinValueAlternatives_0_0 )
            // InternalUSE.g:4432:4: rule__Multiplicity__MinValueAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicity__MinValueAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityAccess().getMinValueAlternatives_0_0()); 

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
    // $ANTLR end "rule__Multiplicity__MinValueAssignment_0"


    // $ANTLR start "rule__Multiplicity__MaxValueAssignment_1_1"
    // InternalUSE.g:4440:1: rule__Multiplicity__MaxValueAssignment_1_1 : ( ( rule__Multiplicity__MaxValueAlternatives_1_1_0 ) ) ;
    public final void rule__Multiplicity__MaxValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4444:1: ( ( ( rule__Multiplicity__MaxValueAlternatives_1_1_0 ) ) )
            // InternalUSE.g:4445:2: ( ( rule__Multiplicity__MaxValueAlternatives_1_1_0 ) )
            {
            // InternalUSE.g:4445:2: ( ( rule__Multiplicity__MaxValueAlternatives_1_1_0 ) )
            // InternalUSE.g:4446:3: ( rule__Multiplicity__MaxValueAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultiplicityAccess().getMaxValueAlternatives_1_1_0()); 
            // InternalUSE.g:4447:3: ( rule__Multiplicity__MaxValueAlternatives_1_1_0 )
            // InternalUSE.g:4447:4: rule__Multiplicity__MaxValueAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicity__MaxValueAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityAccess().getMaxValueAlternatives_1_1_0()); 

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
    // $ANTLR end "rule__Multiplicity__MaxValueAssignment_1_1"


    // $ANTLR start "rule__Multiplicity__MinValueAssignment_2_1"
    // InternalUSE.g:4455:1: rule__Multiplicity__MinValueAssignment_2_1 : ( ( rule__Multiplicity__MinValueAlternatives_2_1_0 ) ) ;
    public final void rule__Multiplicity__MinValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4459:1: ( ( ( rule__Multiplicity__MinValueAlternatives_2_1_0 ) ) )
            // InternalUSE.g:4460:2: ( ( rule__Multiplicity__MinValueAlternatives_2_1_0 ) )
            {
            // InternalUSE.g:4460:2: ( ( rule__Multiplicity__MinValueAlternatives_2_1_0 ) )
            // InternalUSE.g:4461:3: ( rule__Multiplicity__MinValueAlternatives_2_1_0 )
            {
             before(grammarAccess.getMultiplicityAccess().getMinValueAlternatives_2_1_0()); 
            // InternalUSE.g:4462:3: ( rule__Multiplicity__MinValueAlternatives_2_1_0 )
            // InternalUSE.g:4462:4: rule__Multiplicity__MinValueAlternatives_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicity__MinValueAlternatives_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityAccess().getMinValueAlternatives_2_1_0()); 

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
    // $ANTLR end "rule__Multiplicity__MinValueAssignment_2_1"


    // $ANTLR start "rule__Multiplicity__MaxValueAssignment_2_2_1"
    // InternalUSE.g:4470:1: rule__Multiplicity__MaxValueAssignment_2_2_1 : ( ( rule__Multiplicity__MaxValueAlternatives_2_2_1_0 ) ) ;
    public final void rule__Multiplicity__MaxValueAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4474:1: ( ( ( rule__Multiplicity__MaxValueAlternatives_2_2_1_0 ) ) )
            // InternalUSE.g:4475:2: ( ( rule__Multiplicity__MaxValueAlternatives_2_2_1_0 ) )
            {
            // InternalUSE.g:4475:2: ( ( rule__Multiplicity__MaxValueAlternatives_2_2_1_0 ) )
            // InternalUSE.g:4476:3: ( rule__Multiplicity__MaxValueAlternatives_2_2_1_0 )
            {
             before(grammarAccess.getMultiplicityAccess().getMaxValueAlternatives_2_2_1_0()); 
            // InternalUSE.g:4477:3: ( rule__Multiplicity__MaxValueAlternatives_2_2_1_0 )
            // InternalUSE.g:4477:4: rule__Multiplicity__MaxValueAlternatives_2_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicity__MaxValueAlternatives_2_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityAccess().getMaxValueAlternatives_2_2_1_0()); 

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
    // $ANTLR end "rule__Multiplicity__MaxValueAssignment_2_2_1"


    // $ANTLR start "rule__Enum__NameAssignment_1"
    // InternalUSE.g:4485:1: rule__Enum__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4489:1: ( ( RULE_ID ) )
            // InternalUSE.g:4490:2: ( RULE_ID )
            {
            // InternalUSE.g:4490:2: ( RULE_ID )
            // InternalUSE.g:4491:3: RULE_ID
            {
             before(grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Enum__NameAssignment_1"


    // $ANTLR start "rule__Enum__ElementsAssignment_3"
    // InternalUSE.g:4500:1: rule__Enum__ElementsAssignment_3 : ( ruleEnumElement ) ;
    public final void rule__Enum__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4504:1: ( ( ruleEnumElement ) )
            // InternalUSE.g:4505:2: ( ruleEnumElement )
            {
            // InternalUSE.g:4505:2: ( ruleEnumElement )
            // InternalUSE.g:4506:3: ruleEnumElement
            {
             before(grammarAccess.getEnumAccess().getElementsEnumElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumElement();

            state._fsp--;

             after(grammarAccess.getEnumAccess().getElementsEnumElementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Enum__ElementsAssignment_3"


    // $ANTLR start "rule__Class__AbstractAssignment_0"
    // InternalUSE.g:4515:1: rule__Class__AbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__Class__AbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4519:1: ( ( ( 'abstract' ) ) )
            // InternalUSE.g:4520:2: ( ( 'abstract' ) )
            {
            // InternalUSE.g:4520:2: ( ( 'abstract' ) )
            // InternalUSE.g:4521:3: ( 'abstract' )
            {
             before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_0_0()); 
            // InternalUSE.g:4522:3: ( 'abstract' )
            // InternalUSE.g:4523:4: 'abstract'
            {
             before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_0_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalUSE.g:4534:1: rule__Class__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4538:1: ( ( RULE_ID ) )
            // InternalUSE.g:4539:2: ( RULE_ID )
            {
            // InternalUSE.g:4539:2: ( RULE_ID )
            // InternalUSE.g:4540:3: RULE_ID
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
    // InternalUSE.g:4549:1: rule__Class__GeneralizationAssignment_3_1 : ( ruleGeneralization ) ;
    public final void rule__Class__GeneralizationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4553:1: ( ( ruleGeneralization ) )
            // InternalUSE.g:4554:2: ( ruleGeneralization )
            {
            // InternalUSE.g:4554:2: ( ruleGeneralization )
            // InternalUSE.g:4555:3: ruleGeneralization
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


    // $ANTLR start "rule__Class__AttributesAssignment_4"
    // InternalUSE.g:4564:1: rule__Class__AttributesAssignment_4 : ( ruleAttributesBase ) ;
    public final void rule__Class__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4568:1: ( ( ruleAttributesBase ) )
            // InternalUSE.g:4569:2: ( ruleAttributesBase )
            {
            // InternalUSE.g:4569:2: ( ruleAttributesBase )
            // InternalUSE.g:4570:3: ruleAttributesBase
            {
             before(grammarAccess.getClassAccess().getAttributesAttributesBaseParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributesBase();

            state._fsp--;

             after(grammarAccess.getClassAccess().getAttributesAttributesBaseParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Class__AttributesAssignment_4"


    // $ANTLR start "rule__Class__OperationsAssignment_5"
    // InternalUSE.g:4579:1: rule__Class__OperationsAssignment_5 : ( ruleOperationsBase ) ;
    public final void rule__Class__OperationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4583:1: ( ( ruleOperationsBase ) )
            // InternalUSE.g:4584:2: ( ruleOperationsBase )
            {
            // InternalUSE.g:4584:2: ( ruleOperationsBase )
            // InternalUSE.g:4585:3: ruleOperationsBase
            {
             before(grammarAccess.getClassAccess().getOperationsOperationsBaseParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationsBase();

            state._fsp--;

             after(grammarAccess.getClassAccess().getOperationsOperationsBaseParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Class__OperationsAssignment_5"


    // $ANTLR start "rule__Class__ConstraintsAssignment_6"
    // InternalUSE.g:4594:1: rule__Class__ConstraintsAssignment_6 : ( ruleConstraintsBase ) ;
    public final void rule__Class__ConstraintsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4598:1: ( ( ruleConstraintsBase ) )
            // InternalUSE.g:4599:2: ( ruleConstraintsBase )
            {
            // InternalUSE.g:4599:2: ( ruleConstraintsBase )
            // InternalUSE.g:4600:3: ruleConstraintsBase
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


    // $ANTLR start "rule__Generalization__GeneralAssignment_0"
    // InternalUSE.g:4609:1: rule__Generalization__GeneralAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Generalization__GeneralAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4613:1: ( ( ( RULE_ID ) ) )
            // InternalUSE.g:4614:2: ( ( RULE_ID ) )
            {
            // InternalUSE.g:4614:2: ( ( RULE_ID ) )
            // InternalUSE.g:4615:3: ( RULE_ID )
            {
             before(grammarAccess.getGeneralizationAccess().getGeneralAllClassCrossReference_0_0()); 
            // InternalUSE.g:4616:3: ( RULE_ID )
            // InternalUSE.g:4617:4: RULE_ID
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


    // $ANTLR start "rule__SimpleTypes__DefaultTypeAssignment_0"
    // InternalUSE.g:4628:1: rule__SimpleTypes__DefaultTypeAssignment_0 : ( ruleDefaultType ) ;
    public final void rule__SimpleTypes__DefaultTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4632:1: ( ( ruleDefaultType ) )
            // InternalUSE.g:4633:2: ( ruleDefaultType )
            {
            // InternalUSE.g:4633:2: ( ruleDefaultType )
            // InternalUSE.g:4634:3: ruleDefaultType
            {
             before(grammarAccess.getSimpleTypesAccess().getDefaultTypeDefaultTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDefaultType();

            state._fsp--;

             after(grammarAccess.getSimpleTypesAccess().getDefaultTypeDefaultTypeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__SimpleTypes__DefaultTypeAssignment_0"


    // $ANTLR start "rule__SimpleTypes__ReferendedAssignment_1"
    // InternalUSE.g:4643:1: rule__SimpleTypes__ReferendedAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SimpleTypes__ReferendedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4647:1: ( ( ( RULE_ID ) ) )
            // InternalUSE.g:4648:2: ( ( RULE_ID ) )
            {
            // InternalUSE.g:4648:2: ( ( RULE_ID ) )
            // InternalUSE.g:4649:3: ( RULE_ID )
            {
             before(grammarAccess.getSimpleTypesAccess().getReferendedAllClassCrossReference_1_0()); 
            // InternalUSE.g:4650:3: ( RULE_ID )
            // InternalUSE.g:4651:4: RULE_ID
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


    // $ANTLR start "rule__Association__TypeAssociationAssignment_0"
    // InternalUSE.g:4662:1: rule__Association__TypeAssociationAssignment_0 : ( ( rule__Association__TypeAssociationAlternatives_0_0 ) ) ;
    public final void rule__Association__TypeAssociationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4666:1: ( ( ( rule__Association__TypeAssociationAlternatives_0_0 ) ) )
            // InternalUSE.g:4667:2: ( ( rule__Association__TypeAssociationAlternatives_0_0 ) )
            {
            // InternalUSE.g:4667:2: ( ( rule__Association__TypeAssociationAlternatives_0_0 ) )
            // InternalUSE.g:4668:3: ( rule__Association__TypeAssociationAlternatives_0_0 )
            {
             before(grammarAccess.getAssociationAccess().getTypeAssociationAlternatives_0_0()); 
            // InternalUSE.g:4669:3: ( rule__Association__TypeAssociationAlternatives_0_0 )
            // InternalUSE.g:4669:4: rule__Association__TypeAssociationAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Association__TypeAssociationAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getTypeAssociationAlternatives_0_0()); 

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
    // $ANTLR end "rule__Association__TypeAssociationAssignment_0"


    // $ANTLR start "rule__Association__NameAssignment_1"
    // InternalUSE.g:4677:1: rule__Association__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Association__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4681:1: ( ( RULE_ID ) )
            // InternalUSE.g:4682:2: ( RULE_ID )
            {
            // InternalUSE.g:4682:2: ( RULE_ID )
            // InternalUSE.g:4683:3: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Association__NameAssignment_1"


    // $ANTLR start "rule__Association__AssociationEndsAssignment_3"
    // InternalUSE.g:4692:1: rule__Association__AssociationEndsAssignment_3 : ( ruleAssociationEnd ) ;
    public final void rule__Association__AssociationEndsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4696:1: ( ( ruleAssociationEnd ) )
            // InternalUSE.g:4697:2: ( ruleAssociationEnd )
            {
            // InternalUSE.g:4697:2: ( ruleAssociationEnd )
            // InternalUSE.g:4698:3: ruleAssociationEnd
            {
             before(grammarAccess.getAssociationAccess().getAssociationEndsAssociationEndParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAssociationEnd();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getAssociationEndsAssociationEndParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Association__AssociationEndsAssignment_3"


    // $ANTLR start "rule__AssociationEnd__TypeAssignment_0"
    // InternalUSE.g:4707:1: rule__AssociationEnd__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AssociationEnd__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4711:1: ( ( ( RULE_ID ) ) )
            // InternalUSE.g:4712:2: ( ( RULE_ID ) )
            {
            // InternalUSE.g:4712:2: ( ( RULE_ID ) )
            // InternalUSE.g:4713:3: ( RULE_ID )
            {
             before(grammarAccess.getAssociationEndAccess().getTypeAllClassCrossReference_0_0()); 
            // InternalUSE.g:4714:3: ( RULE_ID )
            // InternalUSE.g:4715:4: RULE_ID
            {
             before(grammarAccess.getAssociationEndAccess().getTypeAllClassIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssociationEndAccess().getTypeAllClassIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAssociationEndAccess().getTypeAllClassCrossReference_0_0()); 

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
    // $ANTLR end "rule__AssociationEnd__TypeAssignment_0"


    // $ANTLR start "rule__AssociationEnd__MulAssignment_2"
    // InternalUSE.g:4726:1: rule__AssociationEnd__MulAssignment_2 : ( ruleMultiplicity ) ;
    public final void rule__AssociationEnd__MulAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4730:1: ( ( ruleMultiplicity ) )
            // InternalUSE.g:4731:2: ( ruleMultiplicity )
            {
            // InternalUSE.g:4731:2: ( ruleMultiplicity )
            // InternalUSE.g:4732:3: ruleMultiplicity
            {
             before(grammarAccess.getAssociationEndAccess().getMulMultiplicityParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicity();

            state._fsp--;

             after(grammarAccess.getAssociationEndAccess().getMulMultiplicityParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__AssociationEnd__MulAssignment_2"


    // $ANTLR start "rule__AssociationEnd__RoleAssignment_4_1"
    // InternalUSE.g:4741:1: rule__AssociationEnd__RoleAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__AssociationEnd__RoleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4745:1: ( ( RULE_ID ) )
            // InternalUSE.g:4746:2: ( RULE_ID )
            {
            // InternalUSE.g:4746:2: ( RULE_ID )
            // InternalUSE.g:4747:3: RULE_ID
            {
             before(grammarAccess.getAssociationEndAccess().getRoleIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssociationEndAccess().getRoleIDTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__AssociationEnd__RoleAssignment_4_1"


    // $ANTLR start "rule__AssociationEnd__OrderedAssignment_5"
    // InternalUSE.g:4756:1: rule__AssociationEnd__OrderedAssignment_5 : ( ( 'ordered' ) ) ;
    public final void rule__AssociationEnd__OrderedAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4760:1: ( ( ( 'ordered' ) ) )
            // InternalUSE.g:4761:2: ( ( 'ordered' ) )
            {
            // InternalUSE.g:4761:2: ( ( 'ordered' ) )
            // InternalUSE.g:4762:3: ( 'ordered' )
            {
             before(grammarAccess.getAssociationEndAccess().getOrderedOrderedKeyword_5_0()); 
            // InternalUSE.g:4763:3: ( 'ordered' )
            // InternalUSE.g:4764:4: 'ordered'
            {
             before(grammarAccess.getAssociationEndAccess().getOrderedOrderedKeyword_5_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getAssociationEndAccess().getOrderedOrderedKeyword_5_0()); 

            }

             after(grammarAccess.getAssociationEndAccess().getOrderedOrderedKeyword_5_0()); 

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
    // $ANTLR end "rule__AssociationEnd__OrderedAssignment_5"


    // $ANTLR start "rule__AssociationClass__AbstractAssignment_0"
    // InternalUSE.g:4775:1: rule__AssociationClass__AbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__AssociationClass__AbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4779:1: ( ( ( 'abstract' ) ) )
            // InternalUSE.g:4780:2: ( ( 'abstract' ) )
            {
            // InternalUSE.g:4780:2: ( ( 'abstract' ) )
            // InternalUSE.g:4781:3: ( 'abstract' )
            {
             before(grammarAccess.getAssociationClassAccess().getAbstractAbstractKeyword_0_0()); 
            // InternalUSE.g:4782:3: ( 'abstract' )
            // InternalUSE.g:4783:4: 'abstract'
            {
             before(grammarAccess.getAssociationClassAccess().getAbstractAbstractKeyword_0_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalUSE.g:4794:1: rule__AssociationClass__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__AssociationClass__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4798:1: ( ( RULE_ID ) )
            // InternalUSE.g:4799:2: ( RULE_ID )
            {
            // InternalUSE.g:4799:2: ( RULE_ID )
            // InternalUSE.g:4800:3: RULE_ID
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
    // InternalUSE.g:4809:1: rule__AssociationClass__GeneralizationAssignment_3_1 : ( ruleGeneralization ) ;
    public final void rule__AssociationClass__GeneralizationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4813:1: ( ( ruleGeneralization ) )
            // InternalUSE.g:4814:2: ( ruleGeneralization )
            {
            // InternalUSE.g:4814:2: ( ruleGeneralization )
            // InternalUSE.g:4815:3: ruleGeneralization
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


    // $ANTLR start "rule__AssociationClass__AssociationEndsAssignment_5"
    // InternalUSE.g:4824:1: rule__AssociationClass__AssociationEndsAssignment_5 : ( ruleAssociationEnd ) ;
    public final void rule__AssociationClass__AssociationEndsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4828:1: ( ( ruleAssociationEnd ) )
            // InternalUSE.g:4829:2: ( ruleAssociationEnd )
            {
            // InternalUSE.g:4829:2: ( ruleAssociationEnd )
            // InternalUSE.g:4830:3: ruleAssociationEnd
            {
             before(grammarAccess.getAssociationClassAccess().getAssociationEndsAssociationEndParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAssociationEnd();

            state._fsp--;

             after(grammarAccess.getAssociationClassAccess().getAssociationEndsAssociationEndParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__AssociationClass__AssociationEndsAssignment_5"


    // $ANTLR start "rule__AssociationClass__AttributesAssignment_6"
    // InternalUSE.g:4839:1: rule__AssociationClass__AttributesAssignment_6 : ( ruleAttributesBase ) ;
    public final void rule__AssociationClass__AttributesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4843:1: ( ( ruleAttributesBase ) )
            // InternalUSE.g:4844:2: ( ruleAttributesBase )
            {
            // InternalUSE.g:4844:2: ( ruleAttributesBase )
            // InternalUSE.g:4845:3: ruleAttributesBase
            {
             before(grammarAccess.getAssociationClassAccess().getAttributesAttributesBaseParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributesBase();

            state._fsp--;

             after(grammarAccess.getAssociationClassAccess().getAttributesAttributesBaseParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__AssociationClass__AttributesAssignment_6"


    // $ANTLR start "rule__AssociationClass__OperationsAssignment_7"
    // InternalUSE.g:4854:1: rule__AssociationClass__OperationsAssignment_7 : ( ruleOperationsBase ) ;
    public final void rule__AssociationClass__OperationsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4858:1: ( ( ruleOperationsBase ) )
            // InternalUSE.g:4859:2: ( ruleOperationsBase )
            {
            // InternalUSE.g:4859:2: ( ruleOperationsBase )
            // InternalUSE.g:4860:3: ruleOperationsBase
            {
             before(grammarAccess.getAssociationClassAccess().getOperationsOperationsBaseParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationsBase();

            state._fsp--;

             after(grammarAccess.getAssociationClassAccess().getOperationsOperationsBaseParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__AssociationClass__OperationsAssignment_7"


    // $ANTLR start "rule__AssociationClass__ConstraintsAssignment_8"
    // InternalUSE.g:4869:1: rule__AssociationClass__ConstraintsAssignment_8 : ( ruleConstraintsBase ) ;
    public final void rule__AssociationClass__ConstraintsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4873:1: ( ( ruleConstraintsBase ) )
            // InternalUSE.g:4874:2: ( ruleConstraintsBase )
            {
            // InternalUSE.g:4874:2: ( ruleConstraintsBase )
            // InternalUSE.g:4875:3: ruleConstraintsBase
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


    // $ANTLR start "rule__AttributesBase__AttributesAssignment_1"
    // InternalUSE.g:4884:1: rule__AttributesBase__AttributesAssignment_1 : ( ruleAttribute ) ;
    public final void rule__AttributesBase__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4888:1: ( ( ruleAttribute ) )
            // InternalUSE.g:4889:2: ( ruleAttribute )
            {
            // InternalUSE.g:4889:2: ( ruleAttribute )
            // InternalUSE.g:4890:3: ruleAttribute
            {
             before(grammarAccess.getAttributesBaseAccess().getAttributesAttributeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributesBaseAccess().getAttributesAttributeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__AttributesBase__AttributesAssignment_1"


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // InternalUSE.g:4899:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4903:1: ( ( RULE_ID ) )
            // InternalUSE.g:4904:2: ( RULE_ID )
            {
            // InternalUSE.g:4904:2: ( RULE_ID )
            // InternalUSE.g:4905:3: RULE_ID
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
    // InternalUSE.g:4914:1: rule__Attribute__TypeAssignment_2 : ( ruleSimpleTypes ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4918:1: ( ( ruleSimpleTypes ) )
            // InternalUSE.g:4919:2: ( ruleSimpleTypes )
            {
            // InternalUSE.g:4919:2: ( ruleSimpleTypes )
            // InternalUSE.g:4920:3: ruleSimpleTypes
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


    // $ANTLR start "rule__OperationsBase__OperationsAssignment_1"
    // InternalUSE.g:4929:1: rule__OperationsBase__OperationsAssignment_1 : ( ruleOperationType ) ;
    public final void rule__OperationsBase__OperationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4933:1: ( ( ruleOperationType ) )
            // InternalUSE.g:4934:2: ( ruleOperationType )
            {
            // InternalUSE.g:4934:2: ( ruleOperationType )
            // InternalUSE.g:4935:3: ruleOperationType
            {
             before(grammarAccess.getOperationsBaseAccess().getOperationsOperationTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationType();

            state._fsp--;

             after(grammarAccess.getOperationsBaseAccess().getOperationsOperationTypeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__OperationsBase__OperationsAssignment_1"


    // $ANTLR start "rule__OperationQuery__OperationDeclarationAssignment_0"
    // InternalUSE.g:4944:1: rule__OperationQuery__OperationDeclarationAssignment_0 : ( ruleOperationDeclaration ) ;
    public final void rule__OperationQuery__OperationDeclarationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4948:1: ( ( ruleOperationDeclaration ) )
            // InternalUSE.g:4949:2: ( ruleOperationDeclaration )
            {
            // InternalUSE.g:4949:2: ( ruleOperationDeclaration )
            // InternalUSE.g:4950:3: ruleOperationDeclaration
            {
             before(grammarAccess.getOperationQueryAccess().getOperationDeclarationOperationDeclarationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationDeclaration();

            state._fsp--;

             after(grammarAccess.getOperationQueryAccess().getOperationDeclarationOperationDeclarationParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__OperationQuery__OperationDeclarationAssignment_0"


    // $ANTLR start "rule__OperationQuery__OperationbodyAssignment_2"
    // InternalUSE.g:4959:1: rule__OperationQuery__OperationbodyAssignment_2 : ( ruleOCLExpression ) ;
    public final void rule__OperationQuery__OperationbodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4963:1: ( ( ruleOCLExpression ) )
            // InternalUSE.g:4964:2: ( ruleOCLExpression )
            {
            // InternalUSE.g:4964:2: ( ruleOCLExpression )
            // InternalUSE.g:4965:3: ruleOCLExpression
            {
             before(grammarAccess.getOperationQueryAccess().getOperationbodyOCLExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOCLExpression();

            state._fsp--;

             after(grammarAccess.getOperationQueryAccess().getOperationbodyOCLExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__OperationQuery__OperationbodyAssignment_2"


    // $ANTLR start "rule__OperationQuery__ConditionsAssignment_3"
    // InternalUSE.g:4974:1: rule__OperationQuery__ConditionsAssignment_3 : ( ruleConditionType ) ;
    public final void rule__OperationQuery__ConditionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4978:1: ( ( ruleConditionType ) )
            // InternalUSE.g:4979:2: ( ruleConditionType )
            {
            // InternalUSE.g:4979:2: ( ruleConditionType )
            // InternalUSE.g:4980:3: ruleConditionType
            {
             before(grammarAccess.getOperationQueryAccess().getConditionsConditionTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionType();

            state._fsp--;

             after(grammarAccess.getOperationQueryAccess().getConditionsConditionTypeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__OperationQuery__ConditionsAssignment_3"


    // $ANTLR start "rule__OperationComplex__OperationDeclarationAssignment_0"
    // InternalUSE.g:4989:1: rule__OperationComplex__OperationDeclarationAssignment_0 : ( ruleOperationDeclaration ) ;
    public final void rule__OperationComplex__OperationDeclarationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4993:1: ( ( ruleOperationDeclaration ) )
            // InternalUSE.g:4994:2: ( ruleOperationDeclaration )
            {
            // InternalUSE.g:4994:2: ( ruleOperationDeclaration )
            // InternalUSE.g:4995:3: ruleOperationDeclaration
            {
             before(grammarAccess.getOperationComplexAccess().getOperationDeclarationOperationDeclarationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationDeclaration();

            state._fsp--;

             after(grammarAccess.getOperationComplexAccess().getOperationDeclarationOperationDeclarationParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__OperationComplex__OperationDeclarationAssignment_0"


    // $ANTLR start "rule__OperationComplex__OperationbodyAssignment_1_1"
    // InternalUSE.g:5004:1: rule__OperationComplex__OperationbodyAssignment_1_1 : ( ruleOCLExpression ) ;
    public final void rule__OperationComplex__OperationbodyAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5008:1: ( ( ruleOCLExpression ) )
            // InternalUSE.g:5009:2: ( ruleOCLExpression )
            {
            // InternalUSE.g:5009:2: ( ruleOCLExpression )
            // InternalUSE.g:5010:3: ruleOCLExpression
            {
             before(grammarAccess.getOperationComplexAccess().getOperationbodyOCLExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOCLExpression();

            state._fsp--;

             after(grammarAccess.getOperationComplexAccess().getOperationbodyOCLExpressionParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__OperationComplex__OperationbodyAssignment_1_1"


    // $ANTLR start "rule__OperationComplex__ConditionsAssignment_2"
    // InternalUSE.g:5019:1: rule__OperationComplex__ConditionsAssignment_2 : ( ruleConditionType ) ;
    public final void rule__OperationComplex__ConditionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5023:1: ( ( ruleConditionType ) )
            // InternalUSE.g:5024:2: ( ruleConditionType )
            {
            // InternalUSE.g:5024:2: ( ruleConditionType )
            // InternalUSE.g:5025:3: ruleConditionType
            {
             before(grammarAccess.getOperationComplexAccess().getConditionsConditionTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionType();

            state._fsp--;

             after(grammarAccess.getOperationComplexAccess().getConditionsConditionTypeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__OperationComplex__ConditionsAssignment_2"


    // $ANTLR start "rule__OperationDeclaration__NameAssignment_0"
    // InternalUSE.g:5034:1: rule__OperationDeclaration__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__OperationDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5038:1: ( ( RULE_ID ) )
            // InternalUSE.g:5039:2: ( RULE_ID )
            {
            // InternalUSE.g:5039:2: ( RULE_ID )
            // InternalUSE.g:5040:3: RULE_ID
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


    // $ANTLR start "rule__OperationDeclaration__ParametersAssignment_2"
    // InternalUSE.g:5049:1: rule__OperationDeclaration__ParametersAssignment_2 : ( ruleParameter ) ;
    public final void rule__OperationDeclaration__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5053:1: ( ( ruleParameter ) )
            // InternalUSE.g:5054:2: ( ruleParameter )
            {
            // InternalUSE.g:5054:2: ( ruleParameter )
            // InternalUSE.g:5055:3: ruleParameter
            {
             before(grammarAccess.getOperationDeclarationAccess().getParametersParameterParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getOperationDeclarationAccess().getParametersParameterParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__OperationDeclaration__ParametersAssignment_2"


    // $ANTLR start "rule__OperationDeclaration__ReturnTypeAssignment_4_1"
    // InternalUSE.g:5064:1: rule__OperationDeclaration__ReturnTypeAssignment_4_1 : ( ruleSimpleTypes ) ;
    public final void rule__OperationDeclaration__ReturnTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5068:1: ( ( ruleSimpleTypes ) )
            // InternalUSE.g:5069:2: ( ruleSimpleTypes )
            {
            // InternalUSE.g:5069:2: ( ruleSimpleTypes )
            // InternalUSE.g:5070:3: ruleSimpleTypes
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


    // $ANTLR start "rule__Parameter__NameAssignment_0"
    // InternalUSE.g:5079:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5083:1: ( ( RULE_ID ) )
            // InternalUSE.g:5084:2: ( RULE_ID )
            {
            // InternalUSE.g:5084:2: ( RULE_ID )
            // InternalUSE.g:5085:3: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Parameter__NameAssignment_0"


    // $ANTLR start "rule__Parameter__TypeAssignment_2"
    // InternalUSE.g:5094:1: rule__Parameter__TypeAssignment_2 : ( ruleSimpleTypes ) ;
    public final void rule__Parameter__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5098:1: ( ( ruleSimpleTypes ) )
            // InternalUSE.g:5099:2: ( ruleSimpleTypes )
            {
            // InternalUSE.g:5099:2: ( ruleSimpleTypes )
            // InternalUSE.g:5100:3: ruleSimpleTypes
            {
             before(grammarAccess.getParameterAccess().getTypeSimpleTypesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleTypes();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeSimpleTypesParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Parameter__TypeAssignment_2"


    // $ANTLR start "rule__ConstraintsBase__InvariantsAssignment_1"
    // InternalUSE.g:5109:1: rule__ConstraintsBase__InvariantsAssignment_1 : ( ruleInvariantDefinition ) ;
    public final void rule__ConstraintsBase__InvariantsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5113:1: ( ( ruleInvariantDefinition ) )
            // InternalUSE.g:5114:2: ( ruleInvariantDefinition )
            {
            // InternalUSE.g:5114:2: ( ruleInvariantDefinition )
            // InternalUSE.g:5115:3: ruleInvariantDefinition
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
    // InternalUSE.g:5124:1: rule__ConstrainsGeneral__ContextsAssignment_1 : ( ruleContextsType ) ;
    public final void rule__ConstrainsGeneral__ContextsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5128:1: ( ( ruleContextsType ) )
            // InternalUSE.g:5129:2: ( ruleContextsType )
            {
            // InternalUSE.g:5129:2: ( ruleContextsType )
            // InternalUSE.g:5130:3: ruleContextsType
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
    // InternalUSE.g:5139:1: rule__InvariantContext__VariablenameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__InvariantContext__VariablenameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5143:1: ( ( RULE_ID ) )
            // InternalUSE.g:5144:2: ( RULE_ID )
            {
            // InternalUSE.g:5144:2: ( RULE_ID )
            // InternalUSE.g:5145:3: RULE_ID
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
    // InternalUSE.g:5154:1: rule__InvariantContext__ClassnameAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__InvariantContext__ClassnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5158:1: ( ( ( RULE_ID ) ) )
            // InternalUSE.g:5159:2: ( ( RULE_ID ) )
            {
            // InternalUSE.g:5159:2: ( ( RULE_ID ) )
            // InternalUSE.g:5160:3: ( RULE_ID )
            {
             before(grammarAccess.getInvariantContextAccess().getClassnameAllClassCrossReference_2_0()); 
            // InternalUSE.g:5161:3: ( RULE_ID )
            // InternalUSE.g:5162:4: RULE_ID
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
    // InternalUSE.g:5173:1: rule__InvariantContext__InvariantsAssignment_3 : ( ruleInvariantDefinition ) ;
    public final void rule__InvariantContext__InvariantsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5177:1: ( ( ruleInvariantDefinition ) )
            // InternalUSE.g:5178:2: ( ruleInvariantDefinition )
            {
            // InternalUSE.g:5178:2: ( ruleInvariantDefinition )
            // InternalUSE.g:5179:3: ruleInvariantDefinition
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
    // InternalUSE.g:5188:1: rule__InvariantDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InvariantDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5192:1: ( ( RULE_ID ) )
            // InternalUSE.g:5193:2: ( RULE_ID )
            {
            // InternalUSE.g:5193:2: ( RULE_ID )
            // InternalUSE.g:5194:3: RULE_ID
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


    // $ANTLR start "rule__InvariantDefinition__OclexpressionAssignment_3"
    // InternalUSE.g:5203:1: rule__InvariantDefinition__OclexpressionAssignment_3 : ( ruleOCLExpression ) ;
    public final void rule__InvariantDefinition__OclexpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5207:1: ( ( ruleOCLExpression ) )
            // InternalUSE.g:5208:2: ( ruleOCLExpression )
            {
            // InternalUSE.g:5208:2: ( ruleOCLExpression )
            // InternalUSE.g:5209:3: ruleOCLExpression
            {
             before(grammarAccess.getInvariantDefinitionAccess().getOclexpressionOCLExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOCLExpression();

            state._fsp--;

             after(grammarAccess.getInvariantDefinitionAccess().getOclexpressionOCLExpressionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__InvariantDefinition__OclexpressionAssignment_3"


    // $ANTLR start "rule__OperationContext__ClassnameAssignment_1"
    // InternalUSE.g:5218:1: rule__OperationContext__ClassnameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__OperationContext__ClassnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5222:1: ( ( ( RULE_ID ) ) )
            // InternalUSE.g:5223:2: ( ( RULE_ID ) )
            {
            // InternalUSE.g:5223:2: ( ( RULE_ID ) )
            // InternalUSE.g:5224:3: ( RULE_ID )
            {
             before(grammarAccess.getOperationContextAccess().getClassnameAllClassCrossReference_1_0()); 
            // InternalUSE.g:5225:3: ( RULE_ID )
            // InternalUSE.g:5226:4: RULE_ID
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
    // InternalUSE.g:5237:1: rule__OperationContext__ConstrainsAssignment_2 : ( ruleOperationConstraints ) ;
    public final void rule__OperationContext__ConstrainsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5241:1: ( ( ruleOperationConstraints ) )
            // InternalUSE.g:5242:2: ( ruleOperationConstraints )
            {
            // InternalUSE.g:5242:2: ( ruleOperationConstraints )
            // InternalUSE.g:5243:3: ruleOperationConstraints
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


    // $ANTLR start "rule__OperationConstraints__OperationDeclarationAssignment_1"
    // InternalUSE.g:5252:1: rule__OperationConstraints__OperationDeclarationAssignment_1 : ( ruleOperationDeclaration ) ;
    public final void rule__OperationConstraints__OperationDeclarationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5256:1: ( ( ruleOperationDeclaration ) )
            // InternalUSE.g:5257:2: ( ruleOperationDeclaration )
            {
            // InternalUSE.g:5257:2: ( ruleOperationDeclaration )
            // InternalUSE.g:5258:3: ruleOperationDeclaration
            {
             before(grammarAccess.getOperationConstraintsAccess().getOperationDeclarationOperationDeclarationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationDeclaration();

            state._fsp--;

             after(grammarAccess.getOperationConstraintsAccess().getOperationDeclarationOperationDeclarationParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__OperationConstraints__OperationDeclarationAssignment_1"


    // $ANTLR start "rule__OperationConstraints__ConditionsAssignment_2"
    // InternalUSE.g:5267:1: rule__OperationConstraints__ConditionsAssignment_2 : ( ruleConditionType ) ;
    public final void rule__OperationConstraints__ConditionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5271:1: ( ( ruleConditionType ) )
            // InternalUSE.g:5272:2: ( ruleConditionType )
            {
            // InternalUSE.g:5272:2: ( ruleConditionType )
            // InternalUSE.g:5273:3: ruleConditionType
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
    // InternalUSE.g:5282:1: rule__Precondition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Precondition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5286:1: ( ( RULE_ID ) )
            // InternalUSE.g:5287:2: ( RULE_ID )
            {
            // InternalUSE.g:5287:2: ( RULE_ID )
            // InternalUSE.g:5288:3: RULE_ID
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
    // InternalUSE.g:5297:1: rule__Precondition__OclexpressionAssignment_3 : ( ruleOCLExpression ) ;
    public final void rule__Precondition__OclexpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5301:1: ( ( ruleOCLExpression ) )
            // InternalUSE.g:5302:2: ( ruleOCLExpression )
            {
            // InternalUSE.g:5302:2: ( ruleOCLExpression )
            // InternalUSE.g:5303:3: ruleOCLExpression
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
    // InternalUSE.g:5312:1: rule__Postcondition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Postcondition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5316:1: ( ( RULE_ID ) )
            // InternalUSE.g:5317:2: ( RULE_ID )
            {
            // InternalUSE.g:5317:2: ( RULE_ID )
            // InternalUSE.g:5318:3: RULE_ID
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
    // InternalUSE.g:5327:1: rule__Postcondition__OclexpressionAssignment_3 : ( ruleOCLExpression ) ;
    public final void rule__Postcondition__OclexpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5331:1: ( ( ruleOCLExpression ) )
            // InternalUSE.g:5332:2: ( ruleOCLExpression )
            {
            // InternalUSE.g:5332:2: ( ruleOCLExpression )
            // InternalUSE.g:5333:3: ruleOCLExpression
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


    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\24\uffff";
    static final String dfa_2s = "\4\uffff\1\7\11\uffff\5\7\1\uffff";
    static final String dfa_3s = "\1\5\1\60\1\5\1\54\3\5\2\uffff\13\5";
    static final String dfa_4s = "\1\5\1\60\1\61\1\54\1\67\2\31\2\uffff\5\61\5\67\1\61";
    static final String dfa_5s = "\7\uffff\1\1\1\2\13\uffff";
    static final String dfa_6s = "\24\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2",
            "\1\3\53\uffff\1\4",
            "\1\5",
            "\1\7\36\uffff\1\7\7\uffff\1\6\1\uffff\1\10\1\7\2\uffff\1\7\3\uffff\2\7",
            "\1\15\20\uffff\1\11\1\12\1\13\1\14",
            "\1\22\20\uffff\1\16\1\17\1\20\1\21",
            "",
            "",
            "\1\3\31\uffff\1\23\21\uffff\1\4",
            "\1\3\31\uffff\1\23\21\uffff\1\4",
            "\1\3\31\uffff\1\23\21\uffff\1\4",
            "\1\3\31\uffff\1\23\21\uffff\1\4",
            "\1\3\31\uffff\1\23\21\uffff\1\4",
            "\1\7\36\uffff\1\7\11\uffff\1\10\1\7\2\uffff\1\7\3\uffff\2\7",
            "\1\7\36\uffff\1\7\11\uffff\1\10\1\7\2\uffff\1\7\3\uffff\2\7",
            "\1\7\36\uffff\1\7\11\uffff\1\10\1\7\2\uffff\1\7\3\uffff\2\7",
            "\1\7\36\uffff\1\7\11\uffff\1\10\1\7\2\uffff\1\7\3\uffff\2\7",
            "\1\7\36\uffff\1\7\11\uffff\1\10\1\7\2\uffff\1\7\3\uffff\2\7",
            "\1\3\53\uffff\1\4"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1128:1: rule__OperationType__Alternatives : ( ( ruleOperationComplex ) | ( ruleOperationQuery ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000003FF002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x010404091C000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x010004081C000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000003FF800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0100000800000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0004283000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0200020000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x010004081C000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0004281000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000003C00020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00C0800000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0002000000000020L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0020000000000000L});

}