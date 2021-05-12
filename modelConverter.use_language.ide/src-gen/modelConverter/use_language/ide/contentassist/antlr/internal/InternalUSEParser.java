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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_INT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "'Integer'", "'String'", "'Real'", "'Boolean'", "'Set'", "'Bag'", "'Sequence'", "'association'", "'aggregation'", "'composition'", "'model'", "'..'", "','", "'('", "')'", "'enum'", "'{'", "'}'", "'class'", "'end'", "'<'", "'between'", "'['", "']'", "'role'", "'associationclass'", "'attributes'", "':'", "'operations'", "'='", "'begin'", "'constraints'", "'context'", "'inv'", "'::'", "'pre'", "'post'", "'abstract'", "'ordered'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
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
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
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


    // $ANTLR start "entryRuleAllTypes"
    // InternalUSE.g:160:1: entryRuleAllTypes : ruleAllTypes EOF ;
    public final void entryRuleAllTypes() throws RecognitionException {
        try {
            // InternalUSE.g:161:1: ( ruleAllTypes EOF )
            // InternalUSE.g:162:1: ruleAllTypes EOF
            {
             before(grammarAccess.getAllTypesRule()); 
            pushFollow(FOLLOW_1);
            ruleAllTypes();

            state._fsp--;

             after(grammarAccess.getAllTypesRule()); 
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
    // $ANTLR end "entryRuleAllTypes"


    // $ANTLR start "ruleAllTypes"
    // InternalUSE.g:169:1: ruleAllTypes : ( ( rule__AllTypes__Alternatives ) ) ;
    public final void ruleAllTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:173:2: ( ( ( rule__AllTypes__Alternatives ) ) )
            // InternalUSE.g:174:2: ( ( rule__AllTypes__Alternatives ) )
            {
            // InternalUSE.g:174:2: ( ( rule__AllTypes__Alternatives ) )
            // InternalUSE.g:175:3: ( rule__AllTypes__Alternatives )
            {
             before(grammarAccess.getAllTypesAccess().getAlternatives()); 
            // InternalUSE.g:176:3: ( rule__AllTypes__Alternatives )
            // InternalUSE.g:176:4: rule__AllTypes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AllTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAllTypesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAllTypes"


    // $ANTLR start "entryRuleType"
    // InternalUSE.g:185:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalUSE.g:186:1: ( ruleType EOF )
            // InternalUSE.g:187:1: ruleType EOF
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
    // InternalUSE.g:194:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:198:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalUSE.g:199:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalUSE.g:199:2: ( ( rule__Type__Alternatives ) )
            // InternalUSE.g:200:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalUSE.g:201:3: ( rule__Type__Alternatives )
            // InternalUSE.g:201:4: rule__Type__Alternatives
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


    // $ANTLR start "entryRuleCollectionType"
    // InternalUSE.g:210:1: entryRuleCollectionType : ruleCollectionType EOF ;
    public final void entryRuleCollectionType() throws RecognitionException {
        try {
            // InternalUSE.g:211:1: ( ruleCollectionType EOF )
            // InternalUSE.g:212:1: ruleCollectionType EOF
            {
             before(grammarAccess.getCollectionTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleCollectionType();

            state._fsp--;

             after(grammarAccess.getCollectionTypeRule()); 
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
    // $ANTLR end "entryRuleCollectionType"


    // $ANTLR start "ruleCollectionType"
    // InternalUSE.g:219:1: ruleCollectionType : ( ( rule__CollectionType__Group__0 ) ) ;
    public final void ruleCollectionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:223:2: ( ( ( rule__CollectionType__Group__0 ) ) )
            // InternalUSE.g:224:2: ( ( rule__CollectionType__Group__0 ) )
            {
            // InternalUSE.g:224:2: ( ( rule__CollectionType__Group__0 ) )
            // InternalUSE.g:225:3: ( rule__CollectionType__Group__0 )
            {
             before(grammarAccess.getCollectionTypeAccess().getGroup()); 
            // InternalUSE.g:226:3: ( rule__CollectionType__Group__0 )
            // InternalUSE.g:226:4: rule__CollectionType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CollectionType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCollectionTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCollectionType"


    // $ANTLR start "entryRuleAllClass"
    // InternalUSE.g:235:1: entryRuleAllClass : ruleAllClass EOF ;
    public final void entryRuleAllClass() throws RecognitionException {
        try {
            // InternalUSE.g:236:1: ( ruleAllClass EOF )
            // InternalUSE.g:237:1: ruleAllClass EOF
            {
             before(grammarAccess.getAllClassRule()); 
            pushFollow(FOLLOW_1);
            ruleAllClass();

            state._fsp--;

             after(grammarAccess.getAllClassRule()); 
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
    // $ANTLR end "entryRuleAllClass"


    // $ANTLR start "ruleAllClass"
    // InternalUSE.g:244:1: ruleAllClass : ( ( rule__AllClass__Alternatives ) ) ;
    public final void ruleAllClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:248:2: ( ( ( rule__AllClass__Alternatives ) ) )
            // InternalUSE.g:249:2: ( ( rule__AllClass__Alternatives ) )
            {
            // InternalUSE.g:249:2: ( ( rule__AllClass__Alternatives ) )
            // InternalUSE.g:250:3: ( rule__AllClass__Alternatives )
            {
             before(grammarAccess.getAllClassAccess().getAlternatives()); 
            // InternalUSE.g:251:3: ( rule__AllClass__Alternatives )
            // InternalUSE.g:251:4: rule__AllClass__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AllClass__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAllClassAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAllClass"


    // $ANTLR start "entryRuleSimpleTypes"
    // InternalUSE.g:260:1: entryRuleSimpleTypes : ruleSimpleTypes EOF ;
    public final void entryRuleSimpleTypes() throws RecognitionException {
        try {
            // InternalUSE.g:261:1: ( ruleSimpleTypes EOF )
            // InternalUSE.g:262:1: ruleSimpleTypes EOF
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
    // InternalUSE.g:269:1: ruleSimpleTypes : ( ( rule__SimpleTypes__Alternatives ) ) ;
    public final void ruleSimpleTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:273:2: ( ( ( rule__SimpleTypes__Alternatives ) ) )
            // InternalUSE.g:274:2: ( ( rule__SimpleTypes__Alternatives ) )
            {
            // InternalUSE.g:274:2: ( ( rule__SimpleTypes__Alternatives ) )
            // InternalUSE.g:275:3: ( rule__SimpleTypes__Alternatives )
            {
             before(grammarAccess.getSimpleTypesAccess().getAlternatives()); 
            // InternalUSE.g:276:3: ( rule__SimpleTypes__Alternatives )
            // InternalUSE.g:276:4: rule__SimpleTypes__Alternatives
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


    // $ANTLR start "entryRuleEnum"
    // InternalUSE.g:285:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // InternalUSE.g:286:1: ( ruleEnum EOF )
            // InternalUSE.g:287:1: ruleEnum EOF
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
    // InternalUSE.g:294:1: ruleEnum : ( ( rule__Enum__Group__0 ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:298:2: ( ( ( rule__Enum__Group__0 ) ) )
            // InternalUSE.g:299:2: ( ( rule__Enum__Group__0 ) )
            {
            // InternalUSE.g:299:2: ( ( rule__Enum__Group__0 ) )
            // InternalUSE.g:300:3: ( rule__Enum__Group__0 )
            {
             before(grammarAccess.getEnumAccess().getGroup()); 
            // InternalUSE.g:301:3: ( rule__Enum__Group__0 )
            // InternalUSE.g:301:4: rule__Enum__Group__0
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
    // InternalUSE.g:310:1: entryRuleEnumElement : ruleEnumElement EOF ;
    public final void entryRuleEnumElement() throws RecognitionException {
        try {
            // InternalUSE.g:311:1: ( ruleEnumElement EOF )
            // InternalUSE.g:312:1: ruleEnumElement EOF
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
    // InternalUSE.g:319:1: ruleEnumElement : ( ( rule__EnumElement__Group__0 ) ) ;
    public final void ruleEnumElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:323:2: ( ( ( rule__EnumElement__Group__0 ) ) )
            // InternalUSE.g:324:2: ( ( rule__EnumElement__Group__0 ) )
            {
            // InternalUSE.g:324:2: ( ( rule__EnumElement__Group__0 ) )
            // InternalUSE.g:325:3: ( rule__EnumElement__Group__0 )
            {
             before(grammarAccess.getEnumElementAccess().getGroup()); 
            // InternalUSE.g:326:3: ( rule__EnumElement__Group__0 )
            // InternalUSE.g:326:4: rule__EnumElement__Group__0
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
    // InternalUSE.g:335:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalUSE.g:336:1: ( ruleClass EOF )
            // InternalUSE.g:337:1: ruleClass EOF
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
    // InternalUSE.g:344:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:348:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalUSE.g:349:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalUSE.g:349:2: ( ( rule__Class__Group__0 ) )
            // InternalUSE.g:350:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalUSE.g:351:3: ( rule__Class__Group__0 )
            // InternalUSE.g:351:4: rule__Class__Group__0
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
    // InternalUSE.g:360:1: entryRuleGeneralization : ruleGeneralization EOF ;
    public final void entryRuleGeneralization() throws RecognitionException {
        try {
            // InternalUSE.g:361:1: ( ruleGeneralization EOF )
            // InternalUSE.g:362:1: ruleGeneralization EOF
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
    // InternalUSE.g:369:1: ruleGeneralization : ( ( rule__Generalization__Group__0 ) ) ;
    public final void ruleGeneralization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:373:2: ( ( ( rule__Generalization__Group__0 ) ) )
            // InternalUSE.g:374:2: ( ( rule__Generalization__Group__0 ) )
            {
            // InternalUSE.g:374:2: ( ( rule__Generalization__Group__0 ) )
            // InternalUSE.g:375:3: ( rule__Generalization__Group__0 )
            {
             before(grammarAccess.getGeneralizationAccess().getGroup()); 
            // InternalUSE.g:376:3: ( rule__Generalization__Group__0 )
            // InternalUSE.g:376:4: rule__Generalization__Group__0
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


    // $ANTLR start "entryRuleAssociation"
    // InternalUSE.g:385:1: entryRuleAssociation : ruleAssociation EOF ;
    public final void entryRuleAssociation() throws RecognitionException {
        try {
            // InternalUSE.g:386:1: ( ruleAssociation EOF )
            // InternalUSE.g:387:1: ruleAssociation EOF
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
    // InternalUSE.g:394:1: ruleAssociation : ( ( rule__Association__Group__0 ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:398:2: ( ( ( rule__Association__Group__0 ) ) )
            // InternalUSE.g:399:2: ( ( rule__Association__Group__0 ) )
            {
            // InternalUSE.g:399:2: ( ( rule__Association__Group__0 ) )
            // InternalUSE.g:400:3: ( rule__Association__Group__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup()); 
            // InternalUSE.g:401:3: ( rule__Association__Group__0 )
            // InternalUSE.g:401:4: rule__Association__Group__0
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
    // InternalUSE.g:410:1: entryRuleAssociationEnd : ruleAssociationEnd EOF ;
    public final void entryRuleAssociationEnd() throws RecognitionException {
        try {
            // InternalUSE.g:411:1: ( ruleAssociationEnd EOF )
            // InternalUSE.g:412:1: ruleAssociationEnd EOF
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
    // InternalUSE.g:419:1: ruleAssociationEnd : ( ( rule__AssociationEnd__Group__0 ) ) ;
    public final void ruleAssociationEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:423:2: ( ( ( rule__AssociationEnd__Group__0 ) ) )
            // InternalUSE.g:424:2: ( ( rule__AssociationEnd__Group__0 ) )
            {
            // InternalUSE.g:424:2: ( ( rule__AssociationEnd__Group__0 ) )
            // InternalUSE.g:425:3: ( rule__AssociationEnd__Group__0 )
            {
             before(grammarAccess.getAssociationEndAccess().getGroup()); 
            // InternalUSE.g:426:3: ( rule__AssociationEnd__Group__0 )
            // InternalUSE.g:426:4: rule__AssociationEnd__Group__0
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
    // InternalUSE.g:435:1: entryRuleAssociationClass : ruleAssociationClass EOF ;
    public final void entryRuleAssociationClass() throws RecognitionException {
        try {
            // InternalUSE.g:436:1: ( ruleAssociationClass EOF )
            // InternalUSE.g:437:1: ruleAssociationClass EOF
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
    // InternalUSE.g:444:1: ruleAssociationClass : ( ( rule__AssociationClass__Group__0 ) ) ;
    public final void ruleAssociationClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:448:2: ( ( ( rule__AssociationClass__Group__0 ) ) )
            // InternalUSE.g:449:2: ( ( rule__AssociationClass__Group__0 ) )
            {
            // InternalUSE.g:449:2: ( ( rule__AssociationClass__Group__0 ) )
            // InternalUSE.g:450:3: ( rule__AssociationClass__Group__0 )
            {
             before(grammarAccess.getAssociationClassAccess().getGroup()); 
            // InternalUSE.g:451:3: ( rule__AssociationClass__Group__0 )
            // InternalUSE.g:451:4: rule__AssociationClass__Group__0
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
    // InternalUSE.g:460:1: entryRuleAttributesBase : ruleAttributesBase EOF ;
    public final void entryRuleAttributesBase() throws RecognitionException {
        try {
            // InternalUSE.g:461:1: ( ruleAttributesBase EOF )
            // InternalUSE.g:462:1: ruleAttributesBase EOF
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
    // InternalUSE.g:469:1: ruleAttributesBase : ( ( rule__AttributesBase__Group__0 ) ) ;
    public final void ruleAttributesBase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:473:2: ( ( ( rule__AttributesBase__Group__0 ) ) )
            // InternalUSE.g:474:2: ( ( rule__AttributesBase__Group__0 ) )
            {
            // InternalUSE.g:474:2: ( ( rule__AttributesBase__Group__0 ) )
            // InternalUSE.g:475:3: ( rule__AttributesBase__Group__0 )
            {
             before(grammarAccess.getAttributesBaseAccess().getGroup()); 
            // InternalUSE.g:476:3: ( rule__AttributesBase__Group__0 )
            // InternalUSE.g:476:4: rule__AttributesBase__Group__0
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
    // InternalUSE.g:485:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalUSE.g:486:1: ( ruleAttribute EOF )
            // InternalUSE.g:487:1: ruleAttribute EOF
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
    // InternalUSE.g:494:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:498:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalUSE.g:499:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalUSE.g:499:2: ( ( rule__Attribute__Group__0 ) )
            // InternalUSE.g:500:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalUSE.g:501:3: ( rule__Attribute__Group__0 )
            // InternalUSE.g:501:4: rule__Attribute__Group__0
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
    // InternalUSE.g:510:1: entryRuleOperationsBase : ruleOperationsBase EOF ;
    public final void entryRuleOperationsBase() throws RecognitionException {
        try {
            // InternalUSE.g:511:1: ( ruleOperationsBase EOF )
            // InternalUSE.g:512:1: ruleOperationsBase EOF
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
    // InternalUSE.g:519:1: ruleOperationsBase : ( ( rule__OperationsBase__Group__0 ) ) ;
    public final void ruleOperationsBase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:523:2: ( ( ( rule__OperationsBase__Group__0 ) ) )
            // InternalUSE.g:524:2: ( ( rule__OperationsBase__Group__0 ) )
            {
            // InternalUSE.g:524:2: ( ( rule__OperationsBase__Group__0 ) )
            // InternalUSE.g:525:3: ( rule__OperationsBase__Group__0 )
            {
             before(grammarAccess.getOperationsBaseAccess().getGroup()); 
            // InternalUSE.g:526:3: ( rule__OperationsBase__Group__0 )
            // InternalUSE.g:526:4: rule__OperationsBase__Group__0
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
    // InternalUSE.g:535:1: entryRuleOperationType : ruleOperationType EOF ;
    public final void entryRuleOperationType() throws RecognitionException {
        try {
            // InternalUSE.g:536:1: ( ruleOperationType EOF )
            // InternalUSE.g:537:1: ruleOperationType EOF
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
    // InternalUSE.g:544:1: ruleOperationType : ( ( rule__OperationType__Alternatives ) ) ;
    public final void ruleOperationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:548:2: ( ( ( rule__OperationType__Alternatives ) ) )
            // InternalUSE.g:549:2: ( ( rule__OperationType__Alternatives ) )
            {
            // InternalUSE.g:549:2: ( ( rule__OperationType__Alternatives ) )
            // InternalUSE.g:550:3: ( rule__OperationType__Alternatives )
            {
             before(grammarAccess.getOperationTypeAccess().getAlternatives()); 
            // InternalUSE.g:551:3: ( rule__OperationType__Alternatives )
            // InternalUSE.g:551:4: rule__OperationType__Alternatives
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
    // InternalUSE.g:560:1: entryRuleOperationQuery : ruleOperationQuery EOF ;
    public final void entryRuleOperationQuery() throws RecognitionException {
        try {
            // InternalUSE.g:561:1: ( ruleOperationQuery EOF )
            // InternalUSE.g:562:1: ruleOperationQuery EOF
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
    // InternalUSE.g:569:1: ruleOperationQuery : ( ( rule__OperationQuery__Group__0 ) ) ;
    public final void ruleOperationQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:573:2: ( ( ( rule__OperationQuery__Group__0 ) ) )
            // InternalUSE.g:574:2: ( ( rule__OperationQuery__Group__0 ) )
            {
            // InternalUSE.g:574:2: ( ( rule__OperationQuery__Group__0 ) )
            // InternalUSE.g:575:3: ( rule__OperationQuery__Group__0 )
            {
             before(grammarAccess.getOperationQueryAccess().getGroup()); 
            // InternalUSE.g:576:3: ( rule__OperationQuery__Group__0 )
            // InternalUSE.g:576:4: rule__OperationQuery__Group__0
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
    // InternalUSE.g:585:1: entryRuleOperationComplex : ruleOperationComplex EOF ;
    public final void entryRuleOperationComplex() throws RecognitionException {
        try {
            // InternalUSE.g:586:1: ( ruleOperationComplex EOF )
            // InternalUSE.g:587:1: ruleOperationComplex EOF
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
    // InternalUSE.g:594:1: ruleOperationComplex : ( ( rule__OperationComplex__Group__0 ) ) ;
    public final void ruleOperationComplex() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:598:2: ( ( ( rule__OperationComplex__Group__0 ) ) )
            // InternalUSE.g:599:2: ( ( rule__OperationComplex__Group__0 ) )
            {
            // InternalUSE.g:599:2: ( ( rule__OperationComplex__Group__0 ) )
            // InternalUSE.g:600:3: ( rule__OperationComplex__Group__0 )
            {
             before(grammarAccess.getOperationComplexAccess().getGroup()); 
            // InternalUSE.g:601:3: ( rule__OperationComplex__Group__0 )
            // InternalUSE.g:601:4: rule__OperationComplex__Group__0
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
    // InternalUSE.g:610:1: entryRuleOperationDeclaration : ruleOperationDeclaration EOF ;
    public final void entryRuleOperationDeclaration() throws RecognitionException {
        try {
            // InternalUSE.g:611:1: ( ruleOperationDeclaration EOF )
            // InternalUSE.g:612:1: ruleOperationDeclaration EOF
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
    // InternalUSE.g:619:1: ruleOperationDeclaration : ( ( rule__OperationDeclaration__Group__0 ) ) ;
    public final void ruleOperationDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:623:2: ( ( ( rule__OperationDeclaration__Group__0 ) ) )
            // InternalUSE.g:624:2: ( ( rule__OperationDeclaration__Group__0 ) )
            {
            // InternalUSE.g:624:2: ( ( rule__OperationDeclaration__Group__0 ) )
            // InternalUSE.g:625:3: ( rule__OperationDeclaration__Group__0 )
            {
             before(grammarAccess.getOperationDeclarationAccess().getGroup()); 
            // InternalUSE.g:626:3: ( rule__OperationDeclaration__Group__0 )
            // InternalUSE.g:626:4: rule__OperationDeclaration__Group__0
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
    // InternalUSE.g:635:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalUSE.g:636:1: ( ruleParameter EOF )
            // InternalUSE.g:637:1: ruleParameter EOF
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
    // InternalUSE.g:644:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:648:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalUSE.g:649:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalUSE.g:649:2: ( ( rule__Parameter__Group__0 ) )
            // InternalUSE.g:650:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalUSE.g:651:3: ( rule__Parameter__Group__0 )
            // InternalUSE.g:651:4: rule__Parameter__Group__0
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
    // InternalUSE.g:660:1: entryRuleConstraintsBase : ruleConstraintsBase EOF ;
    public final void entryRuleConstraintsBase() throws RecognitionException {
        try {
            // InternalUSE.g:661:1: ( ruleConstraintsBase EOF )
            // InternalUSE.g:662:1: ruleConstraintsBase EOF
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
    // InternalUSE.g:669:1: ruleConstraintsBase : ( ( rule__ConstraintsBase__Group__0 ) ) ;
    public final void ruleConstraintsBase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:673:2: ( ( ( rule__ConstraintsBase__Group__0 ) ) )
            // InternalUSE.g:674:2: ( ( rule__ConstraintsBase__Group__0 ) )
            {
            // InternalUSE.g:674:2: ( ( rule__ConstraintsBase__Group__0 ) )
            // InternalUSE.g:675:3: ( rule__ConstraintsBase__Group__0 )
            {
             before(grammarAccess.getConstraintsBaseAccess().getGroup()); 
            // InternalUSE.g:676:3: ( rule__ConstraintsBase__Group__0 )
            // InternalUSE.g:676:4: rule__ConstraintsBase__Group__0
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
    // InternalUSE.g:685:1: entryRuleConstrainsGeneral : ruleConstrainsGeneral EOF ;
    public final void entryRuleConstrainsGeneral() throws RecognitionException {
        try {
            // InternalUSE.g:686:1: ( ruleConstrainsGeneral EOF )
            // InternalUSE.g:687:1: ruleConstrainsGeneral EOF
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
    // InternalUSE.g:694:1: ruleConstrainsGeneral : ( ( rule__ConstrainsGeneral__Group__0 ) ) ;
    public final void ruleConstrainsGeneral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:698:2: ( ( ( rule__ConstrainsGeneral__Group__0 ) ) )
            // InternalUSE.g:699:2: ( ( rule__ConstrainsGeneral__Group__0 ) )
            {
            // InternalUSE.g:699:2: ( ( rule__ConstrainsGeneral__Group__0 ) )
            // InternalUSE.g:700:3: ( rule__ConstrainsGeneral__Group__0 )
            {
             before(grammarAccess.getConstrainsGeneralAccess().getGroup()); 
            // InternalUSE.g:701:3: ( rule__ConstrainsGeneral__Group__0 )
            // InternalUSE.g:701:4: rule__ConstrainsGeneral__Group__0
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
    // InternalUSE.g:710:1: entryRuleContextsType : ruleContextsType EOF ;
    public final void entryRuleContextsType() throws RecognitionException {
        try {
            // InternalUSE.g:711:1: ( ruleContextsType EOF )
            // InternalUSE.g:712:1: ruleContextsType EOF
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
    // InternalUSE.g:719:1: ruleContextsType : ( ( rule__ContextsType__Alternatives ) ) ;
    public final void ruleContextsType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:723:2: ( ( ( rule__ContextsType__Alternatives ) ) )
            // InternalUSE.g:724:2: ( ( rule__ContextsType__Alternatives ) )
            {
            // InternalUSE.g:724:2: ( ( rule__ContextsType__Alternatives ) )
            // InternalUSE.g:725:3: ( rule__ContextsType__Alternatives )
            {
             before(grammarAccess.getContextsTypeAccess().getAlternatives()); 
            // InternalUSE.g:726:3: ( rule__ContextsType__Alternatives )
            // InternalUSE.g:726:4: rule__ContextsType__Alternatives
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
    // InternalUSE.g:735:1: entryRuleInvariantContext : ruleInvariantContext EOF ;
    public final void entryRuleInvariantContext() throws RecognitionException {
        try {
            // InternalUSE.g:736:1: ( ruleInvariantContext EOF )
            // InternalUSE.g:737:1: ruleInvariantContext EOF
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
    // InternalUSE.g:744:1: ruleInvariantContext : ( ( rule__InvariantContext__Group__0 ) ) ;
    public final void ruleInvariantContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:748:2: ( ( ( rule__InvariantContext__Group__0 ) ) )
            // InternalUSE.g:749:2: ( ( rule__InvariantContext__Group__0 ) )
            {
            // InternalUSE.g:749:2: ( ( rule__InvariantContext__Group__0 ) )
            // InternalUSE.g:750:3: ( rule__InvariantContext__Group__0 )
            {
             before(grammarAccess.getInvariantContextAccess().getGroup()); 
            // InternalUSE.g:751:3: ( rule__InvariantContext__Group__0 )
            // InternalUSE.g:751:4: rule__InvariantContext__Group__0
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
    // InternalUSE.g:760:1: entryRuleInvariantDefinition : ruleInvariantDefinition EOF ;
    public final void entryRuleInvariantDefinition() throws RecognitionException {
        try {
            // InternalUSE.g:761:1: ( ruleInvariantDefinition EOF )
            // InternalUSE.g:762:1: ruleInvariantDefinition EOF
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
    // InternalUSE.g:769:1: ruleInvariantDefinition : ( ( rule__InvariantDefinition__Group__0 ) ) ;
    public final void ruleInvariantDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:773:2: ( ( ( rule__InvariantDefinition__Group__0 ) ) )
            // InternalUSE.g:774:2: ( ( rule__InvariantDefinition__Group__0 ) )
            {
            // InternalUSE.g:774:2: ( ( rule__InvariantDefinition__Group__0 ) )
            // InternalUSE.g:775:3: ( rule__InvariantDefinition__Group__0 )
            {
             before(grammarAccess.getInvariantDefinitionAccess().getGroup()); 
            // InternalUSE.g:776:3: ( rule__InvariantDefinition__Group__0 )
            // InternalUSE.g:776:4: rule__InvariantDefinition__Group__0
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
    // InternalUSE.g:785:1: entryRuleOperationContext : ruleOperationContext EOF ;
    public final void entryRuleOperationContext() throws RecognitionException {
        try {
            // InternalUSE.g:786:1: ( ruleOperationContext EOF )
            // InternalUSE.g:787:1: ruleOperationContext EOF
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
    // InternalUSE.g:794:1: ruleOperationContext : ( ( rule__OperationContext__Group__0 ) ) ;
    public final void ruleOperationContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:798:2: ( ( ( rule__OperationContext__Group__0 ) ) )
            // InternalUSE.g:799:2: ( ( rule__OperationContext__Group__0 ) )
            {
            // InternalUSE.g:799:2: ( ( rule__OperationContext__Group__0 ) )
            // InternalUSE.g:800:3: ( rule__OperationContext__Group__0 )
            {
             before(grammarAccess.getOperationContextAccess().getGroup()); 
            // InternalUSE.g:801:3: ( rule__OperationContext__Group__0 )
            // InternalUSE.g:801:4: rule__OperationContext__Group__0
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
    // InternalUSE.g:810:1: entryRuleOperationConstraints : ruleOperationConstraints EOF ;
    public final void entryRuleOperationConstraints() throws RecognitionException {
        try {
            // InternalUSE.g:811:1: ( ruleOperationConstraints EOF )
            // InternalUSE.g:812:1: ruleOperationConstraints EOF
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
    // InternalUSE.g:819:1: ruleOperationConstraints : ( ( rule__OperationConstraints__Group__0 ) ) ;
    public final void ruleOperationConstraints() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:823:2: ( ( ( rule__OperationConstraints__Group__0 ) ) )
            // InternalUSE.g:824:2: ( ( rule__OperationConstraints__Group__0 ) )
            {
            // InternalUSE.g:824:2: ( ( rule__OperationConstraints__Group__0 ) )
            // InternalUSE.g:825:3: ( rule__OperationConstraints__Group__0 )
            {
             before(grammarAccess.getOperationConstraintsAccess().getGroup()); 
            // InternalUSE.g:826:3: ( rule__OperationConstraints__Group__0 )
            // InternalUSE.g:826:4: rule__OperationConstraints__Group__0
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
    // InternalUSE.g:835:1: entryRuleConditionType : ruleConditionType EOF ;
    public final void entryRuleConditionType() throws RecognitionException {
        try {
            // InternalUSE.g:836:1: ( ruleConditionType EOF )
            // InternalUSE.g:837:1: ruleConditionType EOF
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
    // InternalUSE.g:844:1: ruleConditionType : ( ( rule__ConditionType__Alternatives ) ) ;
    public final void ruleConditionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:848:2: ( ( ( rule__ConditionType__Alternatives ) ) )
            // InternalUSE.g:849:2: ( ( rule__ConditionType__Alternatives ) )
            {
            // InternalUSE.g:849:2: ( ( rule__ConditionType__Alternatives ) )
            // InternalUSE.g:850:3: ( rule__ConditionType__Alternatives )
            {
             before(grammarAccess.getConditionTypeAccess().getAlternatives()); 
            // InternalUSE.g:851:3: ( rule__ConditionType__Alternatives )
            // InternalUSE.g:851:4: rule__ConditionType__Alternatives
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
    // InternalUSE.g:860:1: entryRulePrecondition : rulePrecondition EOF ;
    public final void entryRulePrecondition() throws RecognitionException {
        try {
            // InternalUSE.g:861:1: ( rulePrecondition EOF )
            // InternalUSE.g:862:1: rulePrecondition EOF
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
    // InternalUSE.g:869:1: rulePrecondition : ( ( rule__Precondition__Group__0 ) ) ;
    public final void rulePrecondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:873:2: ( ( ( rule__Precondition__Group__0 ) ) )
            // InternalUSE.g:874:2: ( ( rule__Precondition__Group__0 ) )
            {
            // InternalUSE.g:874:2: ( ( rule__Precondition__Group__0 ) )
            // InternalUSE.g:875:3: ( rule__Precondition__Group__0 )
            {
             before(grammarAccess.getPreconditionAccess().getGroup()); 
            // InternalUSE.g:876:3: ( rule__Precondition__Group__0 )
            // InternalUSE.g:876:4: rule__Precondition__Group__0
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
    // InternalUSE.g:885:1: entryRulePostcondition : rulePostcondition EOF ;
    public final void entryRulePostcondition() throws RecognitionException {
        try {
            // InternalUSE.g:886:1: ( rulePostcondition EOF )
            // InternalUSE.g:887:1: rulePostcondition EOF
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
    // InternalUSE.g:894:1: rulePostcondition : ( ( rule__Postcondition__Group__0 ) ) ;
    public final void rulePostcondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:898:2: ( ( ( rule__Postcondition__Group__0 ) ) )
            // InternalUSE.g:899:2: ( ( rule__Postcondition__Group__0 ) )
            {
            // InternalUSE.g:899:2: ( ( rule__Postcondition__Group__0 ) )
            // InternalUSE.g:900:3: ( rule__Postcondition__Group__0 )
            {
             before(grammarAccess.getPostconditionAccess().getGroup()); 
            // InternalUSE.g:901:3: ( rule__Postcondition__Group__0 )
            // InternalUSE.g:901:4: rule__Postcondition__Group__0
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
    // InternalUSE.g:910:1: entryRuleOCLExpression : ruleOCLExpression EOF ;
    public final void entryRuleOCLExpression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalUSE.g:914:1: ( ruleOCLExpression EOF )
            // InternalUSE.g:915:1: ruleOCLExpression EOF
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
    // InternalUSE.g:925:1: ruleOCLExpression : ( RULE_STRING ) ;
    public final void ruleOCLExpression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:930:2: ( ( RULE_STRING ) )
            // InternalUSE.g:931:2: ( RULE_STRING )
            {
            // InternalUSE.g:931:2: ( RULE_STRING )
            // InternalUSE.g:932:3: RULE_STRING
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
    // InternalUSE.g:942:1: rule__Multiplicity__MinValueAlternatives_0_0 : ( ( '*' ) | ( ruleIntToString ) );
    public final void rule__Multiplicity__MinValueAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:946:1: ( ( '*' ) | ( ruleIntToString ) )
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
                    // InternalUSE.g:947:2: ( '*' )
                    {
                    // InternalUSE.g:947:2: ( '*' )
                    // InternalUSE.g:948:3: '*'
                    {
                     before(grammarAccess.getMultiplicityAccess().getMinValueAsteriskKeyword_0_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getMinValueAsteriskKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:953:2: ( ruleIntToString )
                    {
                    // InternalUSE.g:953:2: ( ruleIntToString )
                    // InternalUSE.g:954:3: ruleIntToString
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
    // InternalUSE.g:963:1: rule__Multiplicity__MaxValueAlternatives_1_1_0 : ( ( '*' ) | ( ruleIntToString ) );
    public final void rule__Multiplicity__MaxValueAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:967:1: ( ( '*' ) | ( ruleIntToString ) )
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
                    // InternalUSE.g:968:2: ( '*' )
                    {
                    // InternalUSE.g:968:2: ( '*' )
                    // InternalUSE.g:969:3: '*'
                    {
                     before(grammarAccess.getMultiplicityAccess().getMaxValueAsteriskKeyword_1_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getMaxValueAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:974:2: ( ruleIntToString )
                    {
                    // InternalUSE.g:974:2: ( ruleIntToString )
                    // InternalUSE.g:975:3: ruleIntToString
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
    // InternalUSE.g:984:1: rule__Multiplicity__MinValueAlternatives_2_1_0 : ( ( '*' ) | ( ruleIntToString ) );
    public final void rule__Multiplicity__MinValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:988:1: ( ( '*' ) | ( ruleIntToString ) )
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
                    // InternalUSE.g:989:2: ( '*' )
                    {
                    // InternalUSE.g:989:2: ( '*' )
                    // InternalUSE.g:990:3: '*'
                    {
                     before(grammarAccess.getMultiplicityAccess().getMinValueAsteriskKeyword_2_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getMinValueAsteriskKeyword_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:995:2: ( ruleIntToString )
                    {
                    // InternalUSE.g:995:2: ( ruleIntToString )
                    // InternalUSE.g:996:3: ruleIntToString
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
    // InternalUSE.g:1005:1: rule__Multiplicity__MaxValueAlternatives_2_2_1_0 : ( ( '*' ) | ( ruleIntToString ) );
    public final void rule__Multiplicity__MaxValueAlternatives_2_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1009:1: ( ( '*' ) | ( ruleIntToString ) )
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
                    // InternalUSE.g:1010:2: ( '*' )
                    {
                    // InternalUSE.g:1010:2: ( '*' )
                    // InternalUSE.g:1011:3: '*'
                    {
                     before(grammarAccess.getMultiplicityAccess().getMaxValueAsteriskKeyword_2_2_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getMaxValueAsteriskKeyword_2_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:1016:2: ( ruleIntToString )
                    {
                    // InternalUSE.g:1016:2: ( ruleIntToString )
                    // InternalUSE.g:1017:3: ruleIntToString
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
    // InternalUSE.g:1026:1: rule__IntToString__Alternatives : ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) | ( '8' ) | ( '9' ) );
    public final void rule__IntToString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1030:1: ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) | ( '8' ) | ( '9' ) )
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
                    // InternalUSE.g:1031:2: ( '0' )
                    {
                    // InternalUSE.g:1031:2: ( '0' )
                    // InternalUSE.g:1032:3: '0'
                    {
                     before(grammarAccess.getIntToStringAccess().getDigitZeroKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getIntToStringAccess().getDigitZeroKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:1037:2: ( '1' )
                    {
                    // InternalUSE.g:1037:2: ( '1' )
                    // InternalUSE.g:1038:3: '1'
                    {
                     before(grammarAccess.getIntToStringAccess().getDigitOneKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getIntToStringAccess().getDigitOneKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUSE.g:1043:2: ( '2' )
                    {
                    // InternalUSE.g:1043:2: ( '2' )
                    // InternalUSE.g:1044:3: '2'
                    {
                     before(grammarAccess.getIntToStringAccess().getDigitTwoKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getIntToStringAccess().getDigitTwoKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUSE.g:1049:2: ( '3' )
                    {
                    // InternalUSE.g:1049:2: ( '3' )
                    // InternalUSE.g:1050:3: '3'
                    {
                     before(grammarAccess.getIntToStringAccess().getDigitThreeKeyword_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getIntToStringAccess().getDigitThreeKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUSE.g:1055:2: ( '4' )
                    {
                    // InternalUSE.g:1055:2: ( '4' )
                    // InternalUSE.g:1056:3: '4'
                    {
                     before(grammarAccess.getIntToStringAccess().getDigitFourKeyword_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getIntToStringAccess().getDigitFourKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalUSE.g:1061:2: ( '5' )
                    {
                    // InternalUSE.g:1061:2: ( '5' )
                    // InternalUSE.g:1062:3: '5'
                    {
                     before(grammarAccess.getIntToStringAccess().getDigitFiveKeyword_5()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getIntToStringAccess().getDigitFiveKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalUSE.g:1067:2: ( '6' )
                    {
                    // InternalUSE.g:1067:2: ( '6' )
                    // InternalUSE.g:1068:3: '6'
                    {
                     before(grammarAccess.getIntToStringAccess().getDigitSixKeyword_6()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getIntToStringAccess().getDigitSixKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalUSE.g:1073:2: ( '7' )
                    {
                    // InternalUSE.g:1073:2: ( '7' )
                    // InternalUSE.g:1074:3: '7'
                    {
                     before(grammarAccess.getIntToStringAccess().getDigitSevenKeyword_7()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getIntToStringAccess().getDigitSevenKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalUSE.g:1079:2: ( '8' )
                    {
                    // InternalUSE.g:1079:2: ( '8' )
                    // InternalUSE.g:1080:3: '8'
                    {
                     before(grammarAccess.getIntToStringAccess().getDigitEightKeyword_8()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getIntToStringAccess().getDigitEightKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalUSE.g:1085:2: ( '9' )
                    {
                    // InternalUSE.g:1085:2: ( '9' )
                    // InternalUSE.g:1086:3: '9'
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
    // InternalUSE.g:1095:1: rule__DefaultType__Alternatives : ( ( 'Integer' ) | ( 'String' ) | ( 'Real' ) | ( 'Boolean' ) );
    public final void rule__DefaultType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1099:1: ( ( 'Integer' ) | ( 'String' ) | ( 'Real' ) | ( 'Boolean' ) )
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
                    // InternalUSE.g:1100:2: ( 'Integer' )
                    {
                    // InternalUSE.g:1100:2: ( 'Integer' )
                    // InternalUSE.g:1101:3: 'Integer'
                    {
                     before(grammarAccess.getDefaultTypeAccess().getIntegerKeyword_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getDefaultTypeAccess().getIntegerKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:1106:2: ( 'String' )
                    {
                    // InternalUSE.g:1106:2: ( 'String' )
                    // InternalUSE.g:1107:3: 'String'
                    {
                     before(grammarAccess.getDefaultTypeAccess().getStringKeyword_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getDefaultTypeAccess().getStringKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUSE.g:1112:2: ( 'Real' )
                    {
                    // InternalUSE.g:1112:2: ( 'Real' )
                    // InternalUSE.g:1113:3: 'Real'
                    {
                     before(grammarAccess.getDefaultTypeAccess().getRealKeyword_2()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getDefaultTypeAccess().getRealKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUSE.g:1118:2: ( 'Boolean' )
                    {
                    // InternalUSE.g:1118:2: ( 'Boolean' )
                    // InternalUSE.g:1119:3: 'Boolean'
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


    // $ANTLR start "rule__AllTypes__Alternatives"
    // InternalUSE.g:1128:1: rule__AllTypes__Alternatives : ( ( ruleCollectionType ) | ( ruleSimpleTypes ) );
    public final void rule__AllTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1132:1: ( ( ruleCollectionType ) | ( ruleSimpleTypes ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=26 && LA8_0<=28)) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID||(LA8_0>=22 && LA8_0<=25)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalUSE.g:1133:2: ( ruleCollectionType )
                    {
                    // InternalUSE.g:1133:2: ( ruleCollectionType )
                    // InternalUSE.g:1134:3: ruleCollectionType
                    {
                     before(grammarAccess.getAllTypesAccess().getCollectionTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCollectionType();

                    state._fsp--;

                     after(grammarAccess.getAllTypesAccess().getCollectionTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:1139:2: ( ruleSimpleTypes )
                    {
                    // InternalUSE.g:1139:2: ( ruleSimpleTypes )
                    // InternalUSE.g:1140:3: ruleSimpleTypes
                    {
                     before(grammarAccess.getAllTypesAccess().getSimpleTypesParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleTypes();

                    state._fsp--;

                     after(grammarAccess.getAllTypesAccess().getSimpleTypesParserRuleCall_1()); 

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
    // $ANTLR end "rule__AllTypes__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalUSE.g:1149:1: rule__Type__Alternatives : ( ( ruleClass ) | ( ruleAssociation ) | ( ruleAssociationClass ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1153:1: ( ( ruleClass ) | ( ruleAssociation ) | ( ruleAssociationClass ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==40) ) {
                    alt9=1;
                }
                else if ( (LA9_1==47) ) {
                    alt9=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case 40:
                {
                alt9=1;
                }
                break;
            case 29:
            case 30:
            case 31:
                {
                alt9=2;
                }
                break;
            case 47:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalUSE.g:1154:2: ( ruleClass )
                    {
                    // InternalUSE.g:1154:2: ( ruleClass )
                    // InternalUSE.g:1155:3: ruleClass
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
                    // InternalUSE.g:1160:2: ( ruleAssociation )
                    {
                    // InternalUSE.g:1160:2: ( ruleAssociation )
                    // InternalUSE.g:1161:3: ruleAssociation
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
                    // InternalUSE.g:1166:2: ( ruleAssociationClass )
                    {
                    // InternalUSE.g:1166:2: ( ruleAssociationClass )
                    // InternalUSE.g:1167:3: ruleAssociationClass
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


    // $ANTLR start "rule__CollectionType__CollectionAlternatives_0_0"
    // InternalUSE.g:1176:1: rule__CollectionType__CollectionAlternatives_0_0 : ( ( 'Set' ) | ( 'Bag' ) | ( 'Sequence' ) );
    public final void rule__CollectionType__CollectionAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1180:1: ( ( 'Set' ) | ( 'Bag' ) | ( 'Sequence' ) )
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
                    // InternalUSE.g:1181:2: ( 'Set' )
                    {
                    // InternalUSE.g:1181:2: ( 'Set' )
                    // InternalUSE.g:1182:3: 'Set'
                    {
                     before(grammarAccess.getCollectionTypeAccess().getCollectionSetKeyword_0_0_0()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getCollectionTypeAccess().getCollectionSetKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:1187:2: ( 'Bag' )
                    {
                    // InternalUSE.g:1187:2: ( 'Bag' )
                    // InternalUSE.g:1188:3: 'Bag'
                    {
                     before(grammarAccess.getCollectionTypeAccess().getCollectionBagKeyword_0_0_1()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getCollectionTypeAccess().getCollectionBagKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUSE.g:1193:2: ( 'Sequence' )
                    {
                    // InternalUSE.g:1193:2: ( 'Sequence' )
                    // InternalUSE.g:1194:3: 'Sequence'
                    {
                     before(grammarAccess.getCollectionTypeAccess().getCollectionSequenceKeyword_0_0_2()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getCollectionTypeAccess().getCollectionSequenceKeyword_0_0_2()); 

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
    // $ANTLR end "rule__CollectionType__CollectionAlternatives_0_0"


    // $ANTLR start "rule__AllClass__Alternatives"
    // InternalUSE.g:1203:1: rule__AllClass__Alternatives : ( ( ruleClass ) | ( ruleAssociationClass ) );
    public final void rule__AllClass__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1207:1: ( ( ruleClass ) | ( ruleAssociationClass ) )
            int alt11=2;
            switch ( input.LA(1) ) {
            case 59:
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==40) ) {
                    alt11=1;
                }
                else if ( (LA11_1==47) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case 40:
                {
                alt11=1;
                }
                break;
            case 47:
                {
                alt11=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalUSE.g:1208:2: ( ruleClass )
                    {
                    // InternalUSE.g:1208:2: ( ruleClass )
                    // InternalUSE.g:1209:3: ruleClass
                    {
                     before(grammarAccess.getAllClassAccess().getClassParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClass();

                    state._fsp--;

                     after(grammarAccess.getAllClassAccess().getClassParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:1214:2: ( ruleAssociationClass )
                    {
                    // InternalUSE.g:1214:2: ( ruleAssociationClass )
                    // InternalUSE.g:1215:3: ruleAssociationClass
                    {
                     before(grammarAccess.getAllClassAccess().getAssociationClassParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAssociationClass();

                    state._fsp--;

                     after(grammarAccess.getAllClassAccess().getAssociationClassParserRuleCall_1()); 

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
    // $ANTLR end "rule__AllClass__Alternatives"


    // $ANTLR start "rule__SimpleTypes__Alternatives"
    // InternalUSE.g:1224:1: rule__SimpleTypes__Alternatives : ( ( ( rule__SimpleTypes__DefaultTypeAssignment_0 ) ) | ( ( rule__SimpleTypes__ReferendedAssignment_1 ) ) );
    public final void rule__SimpleTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1228:1: ( ( ( rule__SimpleTypes__DefaultTypeAssignment_0 ) ) | ( ( rule__SimpleTypes__ReferendedAssignment_1 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=22 && LA12_0<=25)) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalUSE.g:1229:2: ( ( rule__SimpleTypes__DefaultTypeAssignment_0 ) )
                    {
                    // InternalUSE.g:1229:2: ( ( rule__SimpleTypes__DefaultTypeAssignment_0 ) )
                    // InternalUSE.g:1230:3: ( rule__SimpleTypes__DefaultTypeAssignment_0 )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getDefaultTypeAssignment_0()); 
                    // InternalUSE.g:1231:3: ( rule__SimpleTypes__DefaultTypeAssignment_0 )
                    // InternalUSE.g:1231:4: rule__SimpleTypes__DefaultTypeAssignment_0
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
                    // InternalUSE.g:1235:2: ( ( rule__SimpleTypes__ReferendedAssignment_1 ) )
                    {
                    // InternalUSE.g:1235:2: ( ( rule__SimpleTypes__ReferendedAssignment_1 ) )
                    // InternalUSE.g:1236:3: ( rule__SimpleTypes__ReferendedAssignment_1 )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getReferendedAssignment_1()); 
                    // InternalUSE.g:1237:3: ( rule__SimpleTypes__ReferendedAssignment_1 )
                    // InternalUSE.g:1237:4: rule__SimpleTypes__ReferendedAssignment_1
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
    // InternalUSE.g:1245:1: rule__Association__TypeAssociationAlternatives_0_0 : ( ( 'association' ) | ( 'aggregation' ) | ( 'composition' ) );
    public final void rule__Association__TypeAssociationAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1249:1: ( ( 'association' ) | ( 'aggregation' ) | ( 'composition' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt13=1;
                }
                break;
            case 30:
                {
                alt13=2;
                }
                break;
            case 31:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalUSE.g:1250:2: ( 'association' )
                    {
                    // InternalUSE.g:1250:2: ( 'association' )
                    // InternalUSE.g:1251:3: 'association'
                    {
                     before(grammarAccess.getAssociationAccess().getTypeAssociationAssociationKeyword_0_0_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getAssociationAccess().getTypeAssociationAssociationKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:1256:2: ( 'aggregation' )
                    {
                    // InternalUSE.g:1256:2: ( 'aggregation' )
                    // InternalUSE.g:1257:3: 'aggregation'
                    {
                     before(grammarAccess.getAssociationAccess().getTypeAssociationAggregationKeyword_0_0_1()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getAssociationAccess().getTypeAssociationAggregationKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUSE.g:1262:2: ( 'composition' )
                    {
                    // InternalUSE.g:1262:2: ( 'composition' )
                    // InternalUSE.g:1263:3: 'composition'
                    {
                     before(grammarAccess.getAssociationAccess().getTypeAssociationCompositionKeyword_0_0_2()); 
                    match(input,31,FOLLOW_2); 
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
    // InternalUSE.g:1272:1: rule__OperationType__Alternatives : ( ( ruleOperationComplex ) | ( ruleOperationQuery ) );
    public final void rule__OperationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1276:1: ( ( ruleOperationComplex ) | ( ruleOperationQuery ) )
            int alt14=2;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalUSE.g:1277:2: ( ruleOperationComplex )
                    {
                    // InternalUSE.g:1277:2: ( ruleOperationComplex )
                    // InternalUSE.g:1278:3: ruleOperationComplex
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
                    // InternalUSE.g:1283:2: ( ruleOperationQuery )
                    {
                    // InternalUSE.g:1283:2: ( ruleOperationQuery )
                    // InternalUSE.g:1284:3: ruleOperationQuery
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
    // InternalUSE.g:1293:1: rule__ContextsType__Alternatives : ( ( ruleInvariantContext ) | ( ruleOperationContext ) );
    public final void rule__ContextsType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1297:1: ( ( ruleInvariantContext ) | ( ruleOperationContext ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==54) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==RULE_ID) ) {
                    int LA15_2 = input.LA(3);

                    if ( (LA15_2==EOF||LA15_2==49||(LA15_2>=54 && LA15_2<=55)) ) {
                        alt15=1;
                    }
                    else if ( (LA15_2==56) ) {
                        alt15=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalUSE.g:1298:2: ( ruleInvariantContext )
                    {
                    // InternalUSE.g:1298:2: ( ruleInvariantContext )
                    // InternalUSE.g:1299:3: ruleInvariantContext
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
                    // InternalUSE.g:1304:2: ( ruleOperationContext )
                    {
                    // InternalUSE.g:1304:2: ( ruleOperationContext )
                    // InternalUSE.g:1305:3: ruleOperationContext
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
    // InternalUSE.g:1314:1: rule__ConditionType__Alternatives : ( ( rulePrecondition ) | ( rulePostcondition ) );
    public final void rule__ConditionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1318:1: ( ( rulePrecondition ) | ( rulePostcondition ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==57) ) {
                alt16=1;
            }
            else if ( (LA16_0==58) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalUSE.g:1319:2: ( rulePrecondition )
                    {
                    // InternalUSE.g:1319:2: ( rulePrecondition )
                    // InternalUSE.g:1320:3: rulePrecondition
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
                    // InternalUSE.g:1325:2: ( rulePostcondition )
                    {
                    // InternalUSE.g:1325:2: ( rulePostcondition )
                    // InternalUSE.g:1326:3: rulePostcondition
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
    // InternalUSE.g:1335:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1339:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalUSE.g:1340:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalUSE.g:1347:1: rule__Model__Group__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1351:1: ( ( 'model' ) )
            // InternalUSE.g:1352:1: ( 'model' )
            {
            // InternalUSE.g:1352:1: ( 'model' )
            // InternalUSE.g:1353:2: 'model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalUSE.g:1362:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1366:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalUSE.g:1367:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalUSE.g:1374:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1378:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalUSE.g:1379:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalUSE.g:1379:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalUSE.g:1380:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalUSE.g:1381:2: ( rule__Model__NameAssignment_1 )
            // InternalUSE.g:1381:3: rule__Model__NameAssignment_1
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
    // InternalUSE.g:1389:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1393:1: ( rule__Model__Group__2__Impl )
            // InternalUSE.g:1394:2: rule__Model__Group__2__Impl
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
    // InternalUSE.g:1400:1: rule__Model__Group__2__Impl : ( ( rule__Model__Group_2__0 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1404:1: ( ( ( rule__Model__Group_2__0 ) ) )
            // InternalUSE.g:1405:1: ( ( rule__Model__Group_2__0 ) )
            {
            // InternalUSE.g:1405:1: ( ( rule__Model__Group_2__0 ) )
            // InternalUSE.g:1406:2: ( rule__Model__Group_2__0 )
            {
             before(grammarAccess.getModelAccess().getGroup_2()); 
            // InternalUSE.g:1407:2: ( rule__Model__Group_2__0 )
            // InternalUSE.g:1407:3: rule__Model__Group_2__0
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
    // InternalUSE.g:1416:1: rule__Model__Group_2__0 : rule__Model__Group_2__0__Impl rule__Model__Group_2__1 ;
    public final void rule__Model__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1420:1: ( rule__Model__Group_2__0__Impl rule__Model__Group_2__1 )
            // InternalUSE.g:1421:2: rule__Model__Group_2__0__Impl rule__Model__Group_2__1
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
    // InternalUSE.g:1428:1: rule__Model__Group_2__0__Impl : ( ( rule__Model__EnumsAssignment_2_0 )* ) ;
    public final void rule__Model__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1432:1: ( ( ( rule__Model__EnumsAssignment_2_0 )* ) )
            // InternalUSE.g:1433:1: ( ( rule__Model__EnumsAssignment_2_0 )* )
            {
            // InternalUSE.g:1433:1: ( ( rule__Model__EnumsAssignment_2_0 )* )
            // InternalUSE.g:1434:2: ( rule__Model__EnumsAssignment_2_0 )*
            {
             before(grammarAccess.getModelAccess().getEnumsAssignment_2_0()); 
            // InternalUSE.g:1435:2: ( rule__Model__EnumsAssignment_2_0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==37) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalUSE.g:1435:3: rule__Model__EnumsAssignment_2_0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__EnumsAssignment_2_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalUSE.g:1443:1: rule__Model__Group_2__1 : rule__Model__Group_2__1__Impl rule__Model__Group_2__2 ;
    public final void rule__Model__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1447:1: ( rule__Model__Group_2__1__Impl rule__Model__Group_2__2 )
            // InternalUSE.g:1448:2: rule__Model__Group_2__1__Impl rule__Model__Group_2__2
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
    // InternalUSE.g:1455:1: rule__Model__Group_2__1__Impl : ( ( rule__Model__PackagedElementAssignment_2_1 )* ) ;
    public final void rule__Model__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1459:1: ( ( ( rule__Model__PackagedElementAssignment_2_1 )* ) )
            // InternalUSE.g:1460:1: ( ( rule__Model__PackagedElementAssignment_2_1 )* )
            {
            // InternalUSE.g:1460:1: ( ( rule__Model__PackagedElementAssignment_2_1 )* )
            // InternalUSE.g:1461:2: ( rule__Model__PackagedElementAssignment_2_1 )*
            {
             before(grammarAccess.getModelAccess().getPackagedElementAssignment_2_1()); 
            // InternalUSE.g:1462:2: ( rule__Model__PackagedElementAssignment_2_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=29 && LA18_0<=31)||LA18_0==40||LA18_0==47||LA18_0==59) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalUSE.g:1462:3: rule__Model__PackagedElementAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Model__PackagedElementAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalUSE.g:1470:1: rule__Model__Group_2__2 : rule__Model__Group_2__2__Impl ;
    public final void rule__Model__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1474:1: ( rule__Model__Group_2__2__Impl )
            // InternalUSE.g:1475:2: rule__Model__Group_2__2__Impl
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
    // InternalUSE.g:1481:1: rule__Model__Group_2__2__Impl : ( ( rule__Model__ConstraintsAssignment_2_2 )? ) ;
    public final void rule__Model__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1485:1: ( ( ( rule__Model__ConstraintsAssignment_2_2 )? ) )
            // InternalUSE.g:1486:1: ( ( rule__Model__ConstraintsAssignment_2_2 )? )
            {
            // InternalUSE.g:1486:1: ( ( rule__Model__ConstraintsAssignment_2_2 )? )
            // InternalUSE.g:1487:2: ( rule__Model__ConstraintsAssignment_2_2 )?
            {
             before(grammarAccess.getModelAccess().getConstraintsAssignment_2_2()); 
            // InternalUSE.g:1488:2: ( rule__Model__ConstraintsAssignment_2_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==53) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUSE.g:1488:3: rule__Model__ConstraintsAssignment_2_2
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
    // InternalUSE.g:1497:1: rule__Multiplicity__Group__0 : rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1 ;
    public final void rule__Multiplicity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1501:1: ( rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1 )
            // InternalUSE.g:1502:2: rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1
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
    // InternalUSE.g:1509:1: rule__Multiplicity__Group__0__Impl : ( ( rule__Multiplicity__MinValueAssignment_0 ) ) ;
    public final void rule__Multiplicity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1513:1: ( ( ( rule__Multiplicity__MinValueAssignment_0 ) ) )
            // InternalUSE.g:1514:1: ( ( rule__Multiplicity__MinValueAssignment_0 ) )
            {
            // InternalUSE.g:1514:1: ( ( rule__Multiplicity__MinValueAssignment_0 ) )
            // InternalUSE.g:1515:2: ( rule__Multiplicity__MinValueAssignment_0 )
            {
             before(grammarAccess.getMultiplicityAccess().getMinValueAssignment_0()); 
            // InternalUSE.g:1516:2: ( rule__Multiplicity__MinValueAssignment_0 )
            // InternalUSE.g:1516:3: rule__Multiplicity__MinValueAssignment_0
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
    // InternalUSE.g:1524:1: rule__Multiplicity__Group__1 : rule__Multiplicity__Group__1__Impl rule__Multiplicity__Group__2 ;
    public final void rule__Multiplicity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1528:1: ( rule__Multiplicity__Group__1__Impl rule__Multiplicity__Group__2 )
            // InternalUSE.g:1529:2: rule__Multiplicity__Group__1__Impl rule__Multiplicity__Group__2
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
    // InternalUSE.g:1536:1: rule__Multiplicity__Group__1__Impl : ( ( rule__Multiplicity__Group_1__0 )? ) ;
    public final void rule__Multiplicity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1540:1: ( ( ( rule__Multiplicity__Group_1__0 )? ) )
            // InternalUSE.g:1541:1: ( ( rule__Multiplicity__Group_1__0 )? )
            {
            // InternalUSE.g:1541:1: ( ( rule__Multiplicity__Group_1__0 )? )
            // InternalUSE.g:1542:2: ( rule__Multiplicity__Group_1__0 )?
            {
             before(grammarAccess.getMultiplicityAccess().getGroup_1()); 
            // InternalUSE.g:1543:2: ( rule__Multiplicity__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUSE.g:1543:3: rule__Multiplicity__Group_1__0
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
    // InternalUSE.g:1551:1: rule__Multiplicity__Group__2 : rule__Multiplicity__Group__2__Impl ;
    public final void rule__Multiplicity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1555:1: ( rule__Multiplicity__Group__2__Impl )
            // InternalUSE.g:1556:2: rule__Multiplicity__Group__2__Impl
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
    // InternalUSE.g:1562:1: rule__Multiplicity__Group__2__Impl : ( ( rule__Multiplicity__Group_2__0 )* ) ;
    public final void rule__Multiplicity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1566:1: ( ( ( rule__Multiplicity__Group_2__0 )* ) )
            // InternalUSE.g:1567:1: ( ( rule__Multiplicity__Group_2__0 )* )
            {
            // InternalUSE.g:1567:1: ( ( rule__Multiplicity__Group_2__0 )* )
            // InternalUSE.g:1568:2: ( rule__Multiplicity__Group_2__0 )*
            {
             before(grammarAccess.getMultiplicityAccess().getGroup_2()); 
            // InternalUSE.g:1569:2: ( rule__Multiplicity__Group_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==34) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalUSE.g:1569:3: rule__Multiplicity__Group_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Multiplicity__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalUSE.g:1578:1: rule__Multiplicity__Group_1__0 : rule__Multiplicity__Group_1__0__Impl rule__Multiplicity__Group_1__1 ;
    public final void rule__Multiplicity__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1582:1: ( rule__Multiplicity__Group_1__0__Impl rule__Multiplicity__Group_1__1 )
            // InternalUSE.g:1583:2: rule__Multiplicity__Group_1__0__Impl rule__Multiplicity__Group_1__1
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
    // InternalUSE.g:1590:1: rule__Multiplicity__Group_1__0__Impl : ( '..' ) ;
    public final void rule__Multiplicity__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1594:1: ( ( '..' ) )
            // InternalUSE.g:1595:1: ( '..' )
            {
            // InternalUSE.g:1595:1: ( '..' )
            // InternalUSE.g:1596:2: '..'
            {
             before(grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalUSE.g:1605:1: rule__Multiplicity__Group_1__1 : rule__Multiplicity__Group_1__1__Impl ;
    public final void rule__Multiplicity__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1609:1: ( rule__Multiplicity__Group_1__1__Impl )
            // InternalUSE.g:1610:2: rule__Multiplicity__Group_1__1__Impl
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
    // InternalUSE.g:1616:1: rule__Multiplicity__Group_1__1__Impl : ( ( rule__Multiplicity__MaxValueAssignment_1_1 ) ) ;
    public final void rule__Multiplicity__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1620:1: ( ( ( rule__Multiplicity__MaxValueAssignment_1_1 ) ) )
            // InternalUSE.g:1621:1: ( ( rule__Multiplicity__MaxValueAssignment_1_1 ) )
            {
            // InternalUSE.g:1621:1: ( ( rule__Multiplicity__MaxValueAssignment_1_1 ) )
            // InternalUSE.g:1622:2: ( rule__Multiplicity__MaxValueAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicityAccess().getMaxValueAssignment_1_1()); 
            // InternalUSE.g:1623:2: ( rule__Multiplicity__MaxValueAssignment_1_1 )
            // InternalUSE.g:1623:3: rule__Multiplicity__MaxValueAssignment_1_1
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
    // InternalUSE.g:1632:1: rule__Multiplicity__Group_2__0 : rule__Multiplicity__Group_2__0__Impl rule__Multiplicity__Group_2__1 ;
    public final void rule__Multiplicity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1636:1: ( rule__Multiplicity__Group_2__0__Impl rule__Multiplicity__Group_2__1 )
            // InternalUSE.g:1637:2: rule__Multiplicity__Group_2__0__Impl rule__Multiplicity__Group_2__1
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
    // InternalUSE.g:1644:1: rule__Multiplicity__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Multiplicity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1648:1: ( ( ',' ) )
            // InternalUSE.g:1649:1: ( ',' )
            {
            // InternalUSE.g:1649:1: ( ',' )
            // InternalUSE.g:1650:2: ','
            {
             before(grammarAccess.getMultiplicityAccess().getCommaKeyword_2_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalUSE.g:1659:1: rule__Multiplicity__Group_2__1 : rule__Multiplicity__Group_2__1__Impl rule__Multiplicity__Group_2__2 ;
    public final void rule__Multiplicity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1663:1: ( rule__Multiplicity__Group_2__1__Impl rule__Multiplicity__Group_2__2 )
            // InternalUSE.g:1664:2: rule__Multiplicity__Group_2__1__Impl rule__Multiplicity__Group_2__2
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
    // InternalUSE.g:1671:1: rule__Multiplicity__Group_2__1__Impl : ( ( rule__Multiplicity__MinValueAssignment_2_1 ) ) ;
    public final void rule__Multiplicity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1675:1: ( ( ( rule__Multiplicity__MinValueAssignment_2_1 ) ) )
            // InternalUSE.g:1676:1: ( ( rule__Multiplicity__MinValueAssignment_2_1 ) )
            {
            // InternalUSE.g:1676:1: ( ( rule__Multiplicity__MinValueAssignment_2_1 ) )
            // InternalUSE.g:1677:2: ( rule__Multiplicity__MinValueAssignment_2_1 )
            {
             before(grammarAccess.getMultiplicityAccess().getMinValueAssignment_2_1()); 
            // InternalUSE.g:1678:2: ( rule__Multiplicity__MinValueAssignment_2_1 )
            // InternalUSE.g:1678:3: rule__Multiplicity__MinValueAssignment_2_1
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
    // InternalUSE.g:1686:1: rule__Multiplicity__Group_2__2 : rule__Multiplicity__Group_2__2__Impl ;
    public final void rule__Multiplicity__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1690:1: ( rule__Multiplicity__Group_2__2__Impl )
            // InternalUSE.g:1691:2: rule__Multiplicity__Group_2__2__Impl
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
    // InternalUSE.g:1697:1: rule__Multiplicity__Group_2__2__Impl : ( ( rule__Multiplicity__Group_2_2__0 )? ) ;
    public final void rule__Multiplicity__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1701:1: ( ( ( rule__Multiplicity__Group_2_2__0 )? ) )
            // InternalUSE.g:1702:1: ( ( rule__Multiplicity__Group_2_2__0 )? )
            {
            // InternalUSE.g:1702:1: ( ( rule__Multiplicity__Group_2_2__0 )? )
            // InternalUSE.g:1703:2: ( rule__Multiplicity__Group_2_2__0 )?
            {
             before(grammarAccess.getMultiplicityAccess().getGroup_2_2()); 
            // InternalUSE.g:1704:2: ( rule__Multiplicity__Group_2_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUSE.g:1704:3: rule__Multiplicity__Group_2_2__0
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
    // InternalUSE.g:1713:1: rule__Multiplicity__Group_2_2__0 : rule__Multiplicity__Group_2_2__0__Impl rule__Multiplicity__Group_2_2__1 ;
    public final void rule__Multiplicity__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1717:1: ( rule__Multiplicity__Group_2_2__0__Impl rule__Multiplicity__Group_2_2__1 )
            // InternalUSE.g:1718:2: rule__Multiplicity__Group_2_2__0__Impl rule__Multiplicity__Group_2_2__1
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
    // InternalUSE.g:1725:1: rule__Multiplicity__Group_2_2__0__Impl : ( '..' ) ;
    public final void rule__Multiplicity__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1729:1: ( ( '..' ) )
            // InternalUSE.g:1730:1: ( '..' )
            {
            // InternalUSE.g:1730:1: ( '..' )
            // InternalUSE.g:1731:2: '..'
            {
             before(grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_2_2_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalUSE.g:1740:1: rule__Multiplicity__Group_2_2__1 : rule__Multiplicity__Group_2_2__1__Impl ;
    public final void rule__Multiplicity__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1744:1: ( rule__Multiplicity__Group_2_2__1__Impl )
            // InternalUSE.g:1745:2: rule__Multiplicity__Group_2_2__1__Impl
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
    // InternalUSE.g:1751:1: rule__Multiplicity__Group_2_2__1__Impl : ( ( rule__Multiplicity__MaxValueAssignment_2_2_1 ) ) ;
    public final void rule__Multiplicity__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1755:1: ( ( ( rule__Multiplicity__MaxValueAssignment_2_2_1 ) ) )
            // InternalUSE.g:1756:1: ( ( rule__Multiplicity__MaxValueAssignment_2_2_1 ) )
            {
            // InternalUSE.g:1756:1: ( ( rule__Multiplicity__MaxValueAssignment_2_2_1 ) )
            // InternalUSE.g:1757:2: ( rule__Multiplicity__MaxValueAssignment_2_2_1 )
            {
             before(grammarAccess.getMultiplicityAccess().getMaxValueAssignment_2_2_1()); 
            // InternalUSE.g:1758:2: ( rule__Multiplicity__MaxValueAssignment_2_2_1 )
            // InternalUSE.g:1758:3: rule__Multiplicity__MaxValueAssignment_2_2_1
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


    // $ANTLR start "rule__CollectionType__Group__0"
    // InternalUSE.g:1767:1: rule__CollectionType__Group__0 : rule__CollectionType__Group__0__Impl rule__CollectionType__Group__1 ;
    public final void rule__CollectionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1771:1: ( rule__CollectionType__Group__0__Impl rule__CollectionType__Group__1 )
            // InternalUSE.g:1772:2: rule__CollectionType__Group__0__Impl rule__CollectionType__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__CollectionType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectionType__Group__1();

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
    // $ANTLR end "rule__CollectionType__Group__0"


    // $ANTLR start "rule__CollectionType__Group__0__Impl"
    // InternalUSE.g:1779:1: rule__CollectionType__Group__0__Impl : ( ( rule__CollectionType__CollectionAssignment_0 ) ) ;
    public final void rule__CollectionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1783:1: ( ( ( rule__CollectionType__CollectionAssignment_0 ) ) )
            // InternalUSE.g:1784:1: ( ( rule__CollectionType__CollectionAssignment_0 ) )
            {
            // InternalUSE.g:1784:1: ( ( rule__CollectionType__CollectionAssignment_0 ) )
            // InternalUSE.g:1785:2: ( rule__CollectionType__CollectionAssignment_0 )
            {
             before(grammarAccess.getCollectionTypeAccess().getCollectionAssignment_0()); 
            // InternalUSE.g:1786:2: ( rule__CollectionType__CollectionAssignment_0 )
            // InternalUSE.g:1786:3: rule__CollectionType__CollectionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CollectionType__CollectionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCollectionTypeAccess().getCollectionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionType__Group__0__Impl"


    // $ANTLR start "rule__CollectionType__Group__1"
    // InternalUSE.g:1794:1: rule__CollectionType__Group__1 : rule__CollectionType__Group__1__Impl rule__CollectionType__Group__2 ;
    public final void rule__CollectionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1798:1: ( rule__CollectionType__Group__1__Impl rule__CollectionType__Group__2 )
            // InternalUSE.g:1799:2: rule__CollectionType__Group__1__Impl rule__CollectionType__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__CollectionType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectionType__Group__2();

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
    // $ANTLR end "rule__CollectionType__Group__1"


    // $ANTLR start "rule__CollectionType__Group__1__Impl"
    // InternalUSE.g:1806:1: rule__CollectionType__Group__1__Impl : ( '(' ) ;
    public final void rule__CollectionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1810:1: ( ( '(' ) )
            // InternalUSE.g:1811:1: ( '(' )
            {
            // InternalUSE.g:1811:1: ( '(' )
            // InternalUSE.g:1812:2: '('
            {
             before(grammarAccess.getCollectionTypeAccess().getLeftParenthesisKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCollectionTypeAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionType__Group__1__Impl"


    // $ANTLR start "rule__CollectionType__Group__2"
    // InternalUSE.g:1821:1: rule__CollectionType__Group__2 : rule__CollectionType__Group__2__Impl rule__CollectionType__Group__3 ;
    public final void rule__CollectionType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1825:1: ( rule__CollectionType__Group__2__Impl rule__CollectionType__Group__3 )
            // InternalUSE.g:1826:2: rule__CollectionType__Group__2__Impl rule__CollectionType__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__CollectionType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectionType__Group__3();

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
    // $ANTLR end "rule__CollectionType__Group__2"


    // $ANTLR start "rule__CollectionType__Group__2__Impl"
    // InternalUSE.g:1833:1: rule__CollectionType__Group__2__Impl : ( ( rule__CollectionType__TypeAssignment_2 )* ) ;
    public final void rule__CollectionType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1837:1: ( ( ( rule__CollectionType__TypeAssignment_2 )* ) )
            // InternalUSE.g:1838:1: ( ( rule__CollectionType__TypeAssignment_2 )* )
            {
            // InternalUSE.g:1838:1: ( ( rule__CollectionType__TypeAssignment_2 )* )
            // InternalUSE.g:1839:2: ( rule__CollectionType__TypeAssignment_2 )*
            {
             before(grammarAccess.getCollectionTypeAccess().getTypeAssignment_2()); 
            // InternalUSE.g:1840:2: ( rule__CollectionType__TypeAssignment_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||(LA23_0>=22 && LA23_0<=25)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalUSE.g:1840:3: rule__CollectionType__TypeAssignment_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__CollectionType__TypeAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getCollectionTypeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionType__Group__2__Impl"


    // $ANTLR start "rule__CollectionType__Group__3"
    // InternalUSE.g:1848:1: rule__CollectionType__Group__3 : rule__CollectionType__Group__3__Impl ;
    public final void rule__CollectionType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1852:1: ( rule__CollectionType__Group__3__Impl )
            // InternalUSE.g:1853:2: rule__CollectionType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CollectionType__Group__3__Impl();

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
    // $ANTLR end "rule__CollectionType__Group__3"


    // $ANTLR start "rule__CollectionType__Group__3__Impl"
    // InternalUSE.g:1859:1: rule__CollectionType__Group__3__Impl : ( ')' ) ;
    public final void rule__CollectionType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1863:1: ( ( ')' ) )
            // InternalUSE.g:1864:1: ( ')' )
            {
            // InternalUSE.g:1864:1: ( ')' )
            // InternalUSE.g:1865:2: ')'
            {
             before(grammarAccess.getCollectionTypeAccess().getRightParenthesisKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCollectionTypeAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionType__Group__3__Impl"


    // $ANTLR start "rule__Enum__Group__0"
    // InternalUSE.g:1875:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1879:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // InternalUSE.g:1880:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalUSE.g:1887:1: rule__Enum__Group__0__Impl : ( 'enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1891:1: ( ( 'enum' ) )
            // InternalUSE.g:1892:1: ( 'enum' )
            {
            // InternalUSE.g:1892:1: ( 'enum' )
            // InternalUSE.g:1893:2: 'enum'
            {
             before(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalUSE.g:1902:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1906:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // InternalUSE.g:1907:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalUSE.g:1914:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__NameAssignment_1 )? ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1918:1: ( ( ( rule__Enum__NameAssignment_1 )? ) )
            // InternalUSE.g:1919:1: ( ( rule__Enum__NameAssignment_1 )? )
            {
            // InternalUSE.g:1919:1: ( ( rule__Enum__NameAssignment_1 )? )
            // InternalUSE.g:1920:2: ( rule__Enum__NameAssignment_1 )?
            {
             before(grammarAccess.getEnumAccess().getNameAssignment_1()); 
            // InternalUSE.g:1921:2: ( rule__Enum__NameAssignment_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUSE.g:1921:3: rule__Enum__NameAssignment_1
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
    // InternalUSE.g:1929:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1933:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // InternalUSE.g:1934:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
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
    // InternalUSE.g:1941:1: rule__Enum__Group__2__Impl : ( '{' ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1945:1: ( ( '{' ) )
            // InternalUSE.g:1946:1: ( '{' )
            {
            // InternalUSE.g:1946:1: ( '{' )
            // InternalUSE.g:1947:2: '{'
            {
             before(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,38,FOLLOW_2); 
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
    // InternalUSE.g:1956:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl rule__Enum__Group__4 ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1960:1: ( rule__Enum__Group__3__Impl rule__Enum__Group__4 )
            // InternalUSE.g:1961:2: rule__Enum__Group__3__Impl rule__Enum__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalUSE.g:1968:1: rule__Enum__Group__3__Impl : ( ( ( rule__Enum__ElementsAssignment_3 ) ) ( ( rule__Enum__ElementsAssignment_3 )* ) ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1972:1: ( ( ( ( rule__Enum__ElementsAssignment_3 ) ) ( ( rule__Enum__ElementsAssignment_3 )* ) ) )
            // InternalUSE.g:1973:1: ( ( ( rule__Enum__ElementsAssignment_3 ) ) ( ( rule__Enum__ElementsAssignment_3 )* ) )
            {
            // InternalUSE.g:1973:1: ( ( ( rule__Enum__ElementsAssignment_3 ) ) ( ( rule__Enum__ElementsAssignment_3 )* ) )
            // InternalUSE.g:1974:2: ( ( rule__Enum__ElementsAssignment_3 ) ) ( ( rule__Enum__ElementsAssignment_3 )* )
            {
            // InternalUSE.g:1974:2: ( ( rule__Enum__ElementsAssignment_3 ) )
            // InternalUSE.g:1975:3: ( rule__Enum__ElementsAssignment_3 )
            {
             before(grammarAccess.getEnumAccess().getElementsAssignment_3()); 
            // InternalUSE.g:1976:3: ( rule__Enum__ElementsAssignment_3 )
            // InternalUSE.g:1976:4: rule__Enum__ElementsAssignment_3
            {
            pushFollow(FOLLOW_17);
            rule__Enum__ElementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getElementsAssignment_3()); 

            }

            // InternalUSE.g:1979:2: ( ( rule__Enum__ElementsAssignment_3 )* )
            // InternalUSE.g:1980:3: ( rule__Enum__ElementsAssignment_3 )*
            {
             before(grammarAccess.getEnumAccess().getElementsAssignment_3()); 
            // InternalUSE.g:1981:3: ( rule__Enum__ElementsAssignment_3 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalUSE.g:1981:4: rule__Enum__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Enum__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalUSE.g:1990:1: rule__Enum__Group__4 : rule__Enum__Group__4__Impl ;
    public final void rule__Enum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:1994:1: ( rule__Enum__Group__4__Impl )
            // InternalUSE.g:1995:2: rule__Enum__Group__4__Impl
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
    // InternalUSE.g:2001:1: rule__Enum__Group__4__Impl : ( '}' ) ;
    public final void rule__Enum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2005:1: ( ( '}' ) )
            // InternalUSE.g:2006:1: ( '}' )
            {
            // InternalUSE.g:2006:1: ( '}' )
            // InternalUSE.g:2007:2: '}'
            {
             before(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_4()); 
            match(input,39,FOLLOW_2); 
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
    // InternalUSE.g:2017:1: rule__EnumElement__Group__0 : rule__EnumElement__Group__0__Impl rule__EnumElement__Group__1 ;
    public final void rule__EnumElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2021:1: ( rule__EnumElement__Group__0__Impl rule__EnumElement__Group__1 )
            // InternalUSE.g:2022:2: rule__EnumElement__Group__0__Impl rule__EnumElement__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalUSE.g:2029:1: rule__EnumElement__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__EnumElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2033:1: ( ( RULE_ID ) )
            // InternalUSE.g:2034:1: ( RULE_ID )
            {
            // InternalUSE.g:2034:1: ( RULE_ID )
            // InternalUSE.g:2035:2: RULE_ID
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
    // InternalUSE.g:2044:1: rule__EnumElement__Group__1 : rule__EnumElement__Group__1__Impl ;
    public final void rule__EnumElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2048:1: ( rule__EnumElement__Group__1__Impl )
            // InternalUSE.g:2049:2: rule__EnumElement__Group__1__Impl
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
    // InternalUSE.g:2055:1: rule__EnumElement__Group__1__Impl : ( ( ',' )? ) ;
    public final void rule__EnumElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2059:1: ( ( ( ',' )? ) )
            // InternalUSE.g:2060:1: ( ( ',' )? )
            {
            // InternalUSE.g:2060:1: ( ( ',' )? )
            // InternalUSE.g:2061:2: ( ',' )?
            {
             before(grammarAccess.getEnumElementAccess().getCommaKeyword_1()); 
            // InternalUSE.g:2062:2: ( ',' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==34) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalUSE.g:2062:3: ','
                    {
                    match(input,34,FOLLOW_2); 

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
    // InternalUSE.g:2071:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2075:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalUSE.g:2076:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalUSE.g:2083:1: rule__Class__Group__0__Impl : ( ( rule__Class__AbstractAssignment_0 )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2087:1: ( ( ( rule__Class__AbstractAssignment_0 )? ) )
            // InternalUSE.g:2088:1: ( ( rule__Class__AbstractAssignment_0 )? )
            {
            // InternalUSE.g:2088:1: ( ( rule__Class__AbstractAssignment_0 )? )
            // InternalUSE.g:2089:2: ( rule__Class__AbstractAssignment_0 )?
            {
             before(grammarAccess.getClassAccess().getAbstractAssignment_0()); 
            // InternalUSE.g:2090:2: ( rule__Class__AbstractAssignment_0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==59) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUSE.g:2090:3: rule__Class__AbstractAssignment_0
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
    // InternalUSE.g:2098:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2102:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalUSE.g:2103:2: rule__Class__Group__1__Impl rule__Class__Group__2
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
    // InternalUSE.g:2110:1: rule__Class__Group__1__Impl : ( 'class' ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2114:1: ( ( 'class' ) )
            // InternalUSE.g:2115:1: ( 'class' )
            {
            // InternalUSE.g:2115:1: ( 'class' )
            // InternalUSE.g:2116:2: 'class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalUSE.g:2125:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2129:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalUSE.g:2130:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalUSE.g:2137:1: rule__Class__Group__2__Impl : ( ( rule__Class__NameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2141:1: ( ( ( rule__Class__NameAssignment_2 ) ) )
            // InternalUSE.g:2142:1: ( ( rule__Class__NameAssignment_2 ) )
            {
            // InternalUSE.g:2142:1: ( ( rule__Class__NameAssignment_2 ) )
            // InternalUSE.g:2143:2: ( rule__Class__NameAssignment_2 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_2()); 
            // InternalUSE.g:2144:2: ( rule__Class__NameAssignment_2 )
            // InternalUSE.g:2144:3: rule__Class__NameAssignment_2
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
    // InternalUSE.g:2152:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2156:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalUSE.g:2157:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalUSE.g:2164:1: rule__Class__Group__3__Impl : ( ( rule__Class__Group_3__0 )? ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2168:1: ( ( ( rule__Class__Group_3__0 )? ) )
            // InternalUSE.g:2169:1: ( ( rule__Class__Group_3__0 )? )
            {
            // InternalUSE.g:2169:1: ( ( rule__Class__Group_3__0 )? )
            // InternalUSE.g:2170:2: ( rule__Class__Group_3__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_3()); 
            // InternalUSE.g:2171:2: ( rule__Class__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==42) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalUSE.g:2171:3: rule__Class__Group_3__0
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
    // InternalUSE.g:2179:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2183:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalUSE.g:2184:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalUSE.g:2191:1: rule__Class__Group__4__Impl : ( ( rule__Class__AttributesAssignment_4 )? ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2195:1: ( ( ( rule__Class__AttributesAssignment_4 )? ) )
            // InternalUSE.g:2196:1: ( ( rule__Class__AttributesAssignment_4 )? )
            {
            // InternalUSE.g:2196:1: ( ( rule__Class__AttributesAssignment_4 )? )
            // InternalUSE.g:2197:2: ( rule__Class__AttributesAssignment_4 )?
            {
             before(grammarAccess.getClassAccess().getAttributesAssignment_4()); 
            // InternalUSE.g:2198:2: ( rule__Class__AttributesAssignment_4 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==48) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalUSE.g:2198:3: rule__Class__AttributesAssignment_4
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
    // InternalUSE.g:2206:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2210:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalUSE.g:2211:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalUSE.g:2218:1: rule__Class__Group__5__Impl : ( ( rule__Class__OperationsAssignment_5 )? ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2222:1: ( ( ( rule__Class__OperationsAssignment_5 )? ) )
            // InternalUSE.g:2223:1: ( ( rule__Class__OperationsAssignment_5 )? )
            {
            // InternalUSE.g:2223:1: ( ( rule__Class__OperationsAssignment_5 )? )
            // InternalUSE.g:2224:2: ( rule__Class__OperationsAssignment_5 )?
            {
             before(grammarAccess.getClassAccess().getOperationsAssignment_5()); 
            // InternalUSE.g:2225:2: ( rule__Class__OperationsAssignment_5 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==50) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalUSE.g:2225:3: rule__Class__OperationsAssignment_5
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
    // InternalUSE.g:2233:1: rule__Class__Group__6 : rule__Class__Group__6__Impl rule__Class__Group__7 ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2237:1: ( rule__Class__Group__6__Impl rule__Class__Group__7 )
            // InternalUSE.g:2238:2: rule__Class__Group__6__Impl rule__Class__Group__7
            {
            pushFollow(FOLLOW_20);
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
    // InternalUSE.g:2245:1: rule__Class__Group__6__Impl : ( ( rule__Class__ConstraintsAssignment_6 )? ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2249:1: ( ( ( rule__Class__ConstraintsAssignment_6 )? ) )
            // InternalUSE.g:2250:1: ( ( rule__Class__ConstraintsAssignment_6 )? )
            {
            // InternalUSE.g:2250:1: ( ( rule__Class__ConstraintsAssignment_6 )? )
            // InternalUSE.g:2251:2: ( rule__Class__ConstraintsAssignment_6 )?
            {
             before(grammarAccess.getClassAccess().getConstraintsAssignment_6()); 
            // InternalUSE.g:2252:2: ( rule__Class__ConstraintsAssignment_6 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==53) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUSE.g:2252:3: rule__Class__ConstraintsAssignment_6
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
    // InternalUSE.g:2260:1: rule__Class__Group__7 : rule__Class__Group__7__Impl ;
    public final void rule__Class__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2264:1: ( rule__Class__Group__7__Impl )
            // InternalUSE.g:2265:2: rule__Class__Group__7__Impl
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
    // InternalUSE.g:2271:1: rule__Class__Group__7__Impl : ( 'end' ) ;
    public final void rule__Class__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2275:1: ( ( 'end' ) )
            // InternalUSE.g:2276:1: ( 'end' )
            {
            // InternalUSE.g:2276:1: ( 'end' )
            // InternalUSE.g:2277:2: 'end'
            {
             before(grammarAccess.getClassAccess().getEndKeyword_7()); 
            match(input,41,FOLLOW_2); 
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
    // InternalUSE.g:2287:1: rule__Class__Group_3__0 : rule__Class__Group_3__0__Impl rule__Class__Group_3__1 ;
    public final void rule__Class__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2291:1: ( rule__Class__Group_3__0__Impl rule__Class__Group_3__1 )
            // InternalUSE.g:2292:2: rule__Class__Group_3__0__Impl rule__Class__Group_3__1
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
    // InternalUSE.g:2299:1: rule__Class__Group_3__0__Impl : ( '<' ) ;
    public final void rule__Class__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2303:1: ( ( '<' ) )
            // InternalUSE.g:2304:1: ( '<' )
            {
            // InternalUSE.g:2304:1: ( '<' )
            // InternalUSE.g:2305:2: '<'
            {
             before(grammarAccess.getClassAccess().getLessThanSignKeyword_3_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalUSE.g:2314:1: rule__Class__Group_3__1 : rule__Class__Group_3__1__Impl ;
    public final void rule__Class__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2318:1: ( rule__Class__Group_3__1__Impl )
            // InternalUSE.g:2319:2: rule__Class__Group_3__1__Impl
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
    // InternalUSE.g:2325:1: rule__Class__Group_3__1__Impl : ( ( ( rule__Class__GeneralizationAssignment_3_1 ) ) ( ( rule__Class__GeneralizationAssignment_3_1 )* ) ) ;
    public final void rule__Class__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2329:1: ( ( ( ( rule__Class__GeneralizationAssignment_3_1 ) ) ( ( rule__Class__GeneralizationAssignment_3_1 )* ) ) )
            // InternalUSE.g:2330:1: ( ( ( rule__Class__GeneralizationAssignment_3_1 ) ) ( ( rule__Class__GeneralizationAssignment_3_1 )* ) )
            {
            // InternalUSE.g:2330:1: ( ( ( rule__Class__GeneralizationAssignment_3_1 ) ) ( ( rule__Class__GeneralizationAssignment_3_1 )* ) )
            // InternalUSE.g:2331:2: ( ( rule__Class__GeneralizationAssignment_3_1 ) ) ( ( rule__Class__GeneralizationAssignment_3_1 )* )
            {
            // InternalUSE.g:2331:2: ( ( rule__Class__GeneralizationAssignment_3_1 ) )
            // InternalUSE.g:2332:3: ( rule__Class__GeneralizationAssignment_3_1 )
            {
             before(grammarAccess.getClassAccess().getGeneralizationAssignment_3_1()); 
            // InternalUSE.g:2333:3: ( rule__Class__GeneralizationAssignment_3_1 )
            // InternalUSE.g:2333:4: rule__Class__GeneralizationAssignment_3_1
            {
            pushFollow(FOLLOW_17);
            rule__Class__GeneralizationAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGeneralizationAssignment_3_1()); 

            }

            // InternalUSE.g:2336:2: ( ( rule__Class__GeneralizationAssignment_3_1 )* )
            // InternalUSE.g:2337:3: ( rule__Class__GeneralizationAssignment_3_1 )*
            {
             before(grammarAccess.getClassAccess().getGeneralizationAssignment_3_1()); 
            // InternalUSE.g:2338:3: ( rule__Class__GeneralizationAssignment_3_1 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalUSE.g:2338:4: rule__Class__GeneralizationAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Class__GeneralizationAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalUSE.g:2348:1: rule__Generalization__Group__0 : rule__Generalization__Group__0__Impl rule__Generalization__Group__1 ;
    public final void rule__Generalization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2352:1: ( rule__Generalization__Group__0__Impl rule__Generalization__Group__1 )
            // InternalUSE.g:2353:2: rule__Generalization__Group__0__Impl rule__Generalization__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalUSE.g:2360:1: rule__Generalization__Group__0__Impl : ( ( rule__Generalization__GeneralAssignment_0 ) ) ;
    public final void rule__Generalization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2364:1: ( ( ( rule__Generalization__GeneralAssignment_0 ) ) )
            // InternalUSE.g:2365:1: ( ( rule__Generalization__GeneralAssignment_0 ) )
            {
            // InternalUSE.g:2365:1: ( ( rule__Generalization__GeneralAssignment_0 ) )
            // InternalUSE.g:2366:2: ( rule__Generalization__GeneralAssignment_0 )
            {
             before(grammarAccess.getGeneralizationAccess().getGeneralAssignment_0()); 
            // InternalUSE.g:2367:2: ( rule__Generalization__GeneralAssignment_0 )
            // InternalUSE.g:2367:3: rule__Generalization__GeneralAssignment_0
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
    // InternalUSE.g:2375:1: rule__Generalization__Group__1 : rule__Generalization__Group__1__Impl ;
    public final void rule__Generalization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2379:1: ( rule__Generalization__Group__1__Impl )
            // InternalUSE.g:2380:2: rule__Generalization__Group__1__Impl
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
    // InternalUSE.g:2386:1: rule__Generalization__Group__1__Impl : ( ( ',' )? ) ;
    public final void rule__Generalization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2390:1: ( ( ( ',' )? ) )
            // InternalUSE.g:2391:1: ( ( ',' )? )
            {
            // InternalUSE.g:2391:1: ( ( ',' )? )
            // InternalUSE.g:2392:2: ( ',' )?
            {
             before(grammarAccess.getGeneralizationAccess().getCommaKeyword_1()); 
            // InternalUSE.g:2393:2: ( ',' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==34) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalUSE.g:2393:3: ','
                    {
                    match(input,34,FOLLOW_2); 

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
    // InternalUSE.g:2402:1: rule__Association__Group__0 : rule__Association__Group__0__Impl rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2406:1: ( rule__Association__Group__0__Impl rule__Association__Group__1 )
            // InternalUSE.g:2407:2: rule__Association__Group__0__Impl rule__Association__Group__1
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
    // InternalUSE.g:2414:1: rule__Association__Group__0__Impl : ( ( rule__Association__TypeAssociationAssignment_0 ) ) ;
    public final void rule__Association__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2418:1: ( ( ( rule__Association__TypeAssociationAssignment_0 ) ) )
            // InternalUSE.g:2419:1: ( ( rule__Association__TypeAssociationAssignment_0 ) )
            {
            // InternalUSE.g:2419:1: ( ( rule__Association__TypeAssociationAssignment_0 ) )
            // InternalUSE.g:2420:2: ( rule__Association__TypeAssociationAssignment_0 )
            {
             before(grammarAccess.getAssociationAccess().getTypeAssociationAssignment_0()); 
            // InternalUSE.g:2421:2: ( rule__Association__TypeAssociationAssignment_0 )
            // InternalUSE.g:2421:3: rule__Association__TypeAssociationAssignment_0
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
    // InternalUSE.g:2429:1: rule__Association__Group__1 : rule__Association__Group__1__Impl rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2433:1: ( rule__Association__Group__1__Impl rule__Association__Group__2 )
            // InternalUSE.g:2434:2: rule__Association__Group__1__Impl rule__Association__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalUSE.g:2441:1: rule__Association__Group__1__Impl : ( ( rule__Association__NameAssignment_1 ) ) ;
    public final void rule__Association__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2445:1: ( ( ( rule__Association__NameAssignment_1 ) ) )
            // InternalUSE.g:2446:1: ( ( rule__Association__NameAssignment_1 ) )
            {
            // InternalUSE.g:2446:1: ( ( rule__Association__NameAssignment_1 ) )
            // InternalUSE.g:2447:2: ( rule__Association__NameAssignment_1 )
            {
             before(grammarAccess.getAssociationAccess().getNameAssignment_1()); 
            // InternalUSE.g:2448:2: ( rule__Association__NameAssignment_1 )
            // InternalUSE.g:2448:3: rule__Association__NameAssignment_1
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
    // InternalUSE.g:2456:1: rule__Association__Group__2 : rule__Association__Group__2__Impl rule__Association__Group__3 ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2460:1: ( rule__Association__Group__2__Impl rule__Association__Group__3 )
            // InternalUSE.g:2461:2: rule__Association__Group__2__Impl rule__Association__Group__3
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
    // InternalUSE.g:2468:1: rule__Association__Group__2__Impl : ( 'between' ) ;
    public final void rule__Association__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2472:1: ( ( 'between' ) )
            // InternalUSE.g:2473:1: ( 'between' )
            {
            // InternalUSE.g:2473:1: ( 'between' )
            // InternalUSE.g:2474:2: 'between'
            {
             before(grammarAccess.getAssociationAccess().getBetweenKeyword_2()); 
            match(input,43,FOLLOW_2); 
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
    // InternalUSE.g:2483:1: rule__Association__Group__3 : rule__Association__Group__3__Impl rule__Association__Group__4 ;
    public final void rule__Association__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2487:1: ( rule__Association__Group__3__Impl rule__Association__Group__4 )
            // InternalUSE.g:2488:2: rule__Association__Group__3__Impl rule__Association__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalUSE.g:2495:1: rule__Association__Group__3__Impl : ( ( ( rule__Association__AssociationEndsAssignment_3 ) ) ( ( rule__Association__AssociationEndsAssignment_3 )* ) ) ;
    public final void rule__Association__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2499:1: ( ( ( ( rule__Association__AssociationEndsAssignment_3 ) ) ( ( rule__Association__AssociationEndsAssignment_3 )* ) ) )
            // InternalUSE.g:2500:1: ( ( ( rule__Association__AssociationEndsAssignment_3 ) ) ( ( rule__Association__AssociationEndsAssignment_3 )* ) )
            {
            // InternalUSE.g:2500:1: ( ( ( rule__Association__AssociationEndsAssignment_3 ) ) ( ( rule__Association__AssociationEndsAssignment_3 )* ) )
            // InternalUSE.g:2501:2: ( ( rule__Association__AssociationEndsAssignment_3 ) ) ( ( rule__Association__AssociationEndsAssignment_3 )* )
            {
            // InternalUSE.g:2501:2: ( ( rule__Association__AssociationEndsAssignment_3 ) )
            // InternalUSE.g:2502:3: ( rule__Association__AssociationEndsAssignment_3 )
            {
             before(grammarAccess.getAssociationAccess().getAssociationEndsAssignment_3()); 
            // InternalUSE.g:2503:3: ( rule__Association__AssociationEndsAssignment_3 )
            // InternalUSE.g:2503:4: rule__Association__AssociationEndsAssignment_3
            {
            pushFollow(FOLLOW_17);
            rule__Association__AssociationEndsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getAssociationEndsAssignment_3()); 

            }

            // InternalUSE.g:2506:2: ( ( rule__Association__AssociationEndsAssignment_3 )* )
            // InternalUSE.g:2507:3: ( rule__Association__AssociationEndsAssignment_3 )*
            {
             before(grammarAccess.getAssociationAccess().getAssociationEndsAssignment_3()); 
            // InternalUSE.g:2508:3: ( rule__Association__AssociationEndsAssignment_3 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalUSE.g:2508:4: rule__Association__AssociationEndsAssignment_3
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Association__AssociationEndsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalUSE.g:2517:1: rule__Association__Group__4 : rule__Association__Group__4__Impl ;
    public final void rule__Association__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2521:1: ( rule__Association__Group__4__Impl )
            // InternalUSE.g:2522:2: rule__Association__Group__4__Impl
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
    // InternalUSE.g:2528:1: rule__Association__Group__4__Impl : ( 'end' ) ;
    public final void rule__Association__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2532:1: ( ( 'end' ) )
            // InternalUSE.g:2533:1: ( 'end' )
            {
            // InternalUSE.g:2533:1: ( 'end' )
            // InternalUSE.g:2534:2: 'end'
            {
             before(grammarAccess.getAssociationAccess().getEndKeyword_4()); 
            match(input,41,FOLLOW_2); 
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
    // InternalUSE.g:2544:1: rule__AssociationEnd__Group__0 : rule__AssociationEnd__Group__0__Impl rule__AssociationEnd__Group__1 ;
    public final void rule__AssociationEnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2548:1: ( rule__AssociationEnd__Group__0__Impl rule__AssociationEnd__Group__1 )
            // InternalUSE.g:2549:2: rule__AssociationEnd__Group__0__Impl rule__AssociationEnd__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalUSE.g:2556:1: rule__AssociationEnd__Group__0__Impl : ( ( rule__AssociationEnd__TypeAssignment_0 ) ) ;
    public final void rule__AssociationEnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2560:1: ( ( ( rule__AssociationEnd__TypeAssignment_0 ) ) )
            // InternalUSE.g:2561:1: ( ( rule__AssociationEnd__TypeAssignment_0 ) )
            {
            // InternalUSE.g:2561:1: ( ( rule__AssociationEnd__TypeAssignment_0 ) )
            // InternalUSE.g:2562:2: ( rule__AssociationEnd__TypeAssignment_0 )
            {
             before(grammarAccess.getAssociationEndAccess().getTypeAssignment_0()); 
            // InternalUSE.g:2563:2: ( rule__AssociationEnd__TypeAssignment_0 )
            // InternalUSE.g:2563:3: rule__AssociationEnd__TypeAssignment_0
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
    // InternalUSE.g:2571:1: rule__AssociationEnd__Group__1 : rule__AssociationEnd__Group__1__Impl rule__AssociationEnd__Group__2 ;
    public final void rule__AssociationEnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2575:1: ( rule__AssociationEnd__Group__1__Impl rule__AssociationEnd__Group__2 )
            // InternalUSE.g:2576:2: rule__AssociationEnd__Group__1__Impl rule__AssociationEnd__Group__2
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
    // InternalUSE.g:2583:1: rule__AssociationEnd__Group__1__Impl : ( '[' ) ;
    public final void rule__AssociationEnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2587:1: ( ( '[' ) )
            // InternalUSE.g:2588:1: ( '[' )
            {
            // InternalUSE.g:2588:1: ( '[' )
            // InternalUSE.g:2589:2: '['
            {
             before(grammarAccess.getAssociationEndAccess().getLeftSquareBracketKeyword_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalUSE.g:2598:1: rule__AssociationEnd__Group__2 : rule__AssociationEnd__Group__2__Impl rule__AssociationEnd__Group__3 ;
    public final void rule__AssociationEnd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2602:1: ( rule__AssociationEnd__Group__2__Impl rule__AssociationEnd__Group__3 )
            // InternalUSE.g:2603:2: rule__AssociationEnd__Group__2__Impl rule__AssociationEnd__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalUSE.g:2610:1: rule__AssociationEnd__Group__2__Impl : ( ( rule__AssociationEnd__MulAssignment_2 ) ) ;
    public final void rule__AssociationEnd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2614:1: ( ( ( rule__AssociationEnd__MulAssignment_2 ) ) )
            // InternalUSE.g:2615:1: ( ( rule__AssociationEnd__MulAssignment_2 ) )
            {
            // InternalUSE.g:2615:1: ( ( rule__AssociationEnd__MulAssignment_2 ) )
            // InternalUSE.g:2616:2: ( rule__AssociationEnd__MulAssignment_2 )
            {
             before(grammarAccess.getAssociationEndAccess().getMulAssignment_2()); 
            // InternalUSE.g:2617:2: ( rule__AssociationEnd__MulAssignment_2 )
            // InternalUSE.g:2617:3: rule__AssociationEnd__MulAssignment_2
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
    // InternalUSE.g:2625:1: rule__AssociationEnd__Group__3 : rule__AssociationEnd__Group__3__Impl rule__AssociationEnd__Group__4 ;
    public final void rule__AssociationEnd__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2629:1: ( rule__AssociationEnd__Group__3__Impl rule__AssociationEnd__Group__4 )
            // InternalUSE.g:2630:2: rule__AssociationEnd__Group__3__Impl rule__AssociationEnd__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalUSE.g:2637:1: rule__AssociationEnd__Group__3__Impl : ( ']' ) ;
    public final void rule__AssociationEnd__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2641:1: ( ( ']' ) )
            // InternalUSE.g:2642:1: ( ']' )
            {
            // InternalUSE.g:2642:1: ( ']' )
            // InternalUSE.g:2643:2: ']'
            {
             before(grammarAccess.getAssociationEndAccess().getRightSquareBracketKeyword_3()); 
            match(input,45,FOLLOW_2); 
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
    // InternalUSE.g:2652:1: rule__AssociationEnd__Group__4 : rule__AssociationEnd__Group__4__Impl rule__AssociationEnd__Group__5 ;
    public final void rule__AssociationEnd__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2656:1: ( rule__AssociationEnd__Group__4__Impl rule__AssociationEnd__Group__5 )
            // InternalUSE.g:2657:2: rule__AssociationEnd__Group__4__Impl rule__AssociationEnd__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalUSE.g:2664:1: rule__AssociationEnd__Group__4__Impl : ( ( rule__AssociationEnd__Group_4__0 )? ) ;
    public final void rule__AssociationEnd__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2668:1: ( ( ( rule__AssociationEnd__Group_4__0 )? ) )
            // InternalUSE.g:2669:1: ( ( rule__AssociationEnd__Group_4__0 )? )
            {
            // InternalUSE.g:2669:1: ( ( rule__AssociationEnd__Group_4__0 )? )
            // InternalUSE.g:2670:2: ( rule__AssociationEnd__Group_4__0 )?
            {
             before(grammarAccess.getAssociationEndAccess().getGroup_4()); 
            // InternalUSE.g:2671:2: ( rule__AssociationEnd__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==46) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalUSE.g:2671:3: rule__AssociationEnd__Group_4__0
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
    // InternalUSE.g:2679:1: rule__AssociationEnd__Group__5 : rule__AssociationEnd__Group__5__Impl ;
    public final void rule__AssociationEnd__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2683:1: ( rule__AssociationEnd__Group__5__Impl )
            // InternalUSE.g:2684:2: rule__AssociationEnd__Group__5__Impl
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
    // InternalUSE.g:2690:1: rule__AssociationEnd__Group__5__Impl : ( ( rule__AssociationEnd__OrderedAssignment_5 )? ) ;
    public final void rule__AssociationEnd__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2694:1: ( ( ( rule__AssociationEnd__OrderedAssignment_5 )? ) )
            // InternalUSE.g:2695:1: ( ( rule__AssociationEnd__OrderedAssignment_5 )? )
            {
            // InternalUSE.g:2695:1: ( ( rule__AssociationEnd__OrderedAssignment_5 )? )
            // InternalUSE.g:2696:2: ( rule__AssociationEnd__OrderedAssignment_5 )?
            {
             before(grammarAccess.getAssociationEndAccess().getOrderedAssignment_5()); 
            // InternalUSE.g:2697:2: ( rule__AssociationEnd__OrderedAssignment_5 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==60) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalUSE.g:2697:3: rule__AssociationEnd__OrderedAssignment_5
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
    // InternalUSE.g:2706:1: rule__AssociationEnd__Group_4__0 : rule__AssociationEnd__Group_4__0__Impl rule__AssociationEnd__Group_4__1 ;
    public final void rule__AssociationEnd__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2710:1: ( rule__AssociationEnd__Group_4__0__Impl rule__AssociationEnd__Group_4__1 )
            // InternalUSE.g:2711:2: rule__AssociationEnd__Group_4__0__Impl rule__AssociationEnd__Group_4__1
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
    // InternalUSE.g:2718:1: rule__AssociationEnd__Group_4__0__Impl : ( 'role' ) ;
    public final void rule__AssociationEnd__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2722:1: ( ( 'role' ) )
            // InternalUSE.g:2723:1: ( 'role' )
            {
            // InternalUSE.g:2723:1: ( 'role' )
            // InternalUSE.g:2724:2: 'role'
            {
             before(grammarAccess.getAssociationEndAccess().getRoleKeyword_4_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalUSE.g:2733:1: rule__AssociationEnd__Group_4__1 : rule__AssociationEnd__Group_4__1__Impl ;
    public final void rule__AssociationEnd__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2737:1: ( rule__AssociationEnd__Group_4__1__Impl )
            // InternalUSE.g:2738:2: rule__AssociationEnd__Group_4__1__Impl
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
    // InternalUSE.g:2744:1: rule__AssociationEnd__Group_4__1__Impl : ( ( rule__AssociationEnd__RoleAssignment_4_1 ) ) ;
    public final void rule__AssociationEnd__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2748:1: ( ( ( rule__AssociationEnd__RoleAssignment_4_1 ) ) )
            // InternalUSE.g:2749:1: ( ( rule__AssociationEnd__RoleAssignment_4_1 ) )
            {
            // InternalUSE.g:2749:1: ( ( rule__AssociationEnd__RoleAssignment_4_1 ) )
            // InternalUSE.g:2750:2: ( rule__AssociationEnd__RoleAssignment_4_1 )
            {
             before(grammarAccess.getAssociationEndAccess().getRoleAssignment_4_1()); 
            // InternalUSE.g:2751:2: ( rule__AssociationEnd__RoleAssignment_4_1 )
            // InternalUSE.g:2751:3: rule__AssociationEnd__RoleAssignment_4_1
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
    // InternalUSE.g:2760:1: rule__AssociationClass__Group__0 : rule__AssociationClass__Group__0__Impl rule__AssociationClass__Group__1 ;
    public final void rule__AssociationClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2764:1: ( rule__AssociationClass__Group__0__Impl rule__AssociationClass__Group__1 )
            // InternalUSE.g:2765:2: rule__AssociationClass__Group__0__Impl rule__AssociationClass__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalUSE.g:2772:1: rule__AssociationClass__Group__0__Impl : ( ( rule__AssociationClass__AbstractAssignment_0 )? ) ;
    public final void rule__AssociationClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2776:1: ( ( ( rule__AssociationClass__AbstractAssignment_0 )? ) )
            // InternalUSE.g:2777:1: ( ( rule__AssociationClass__AbstractAssignment_0 )? )
            {
            // InternalUSE.g:2777:1: ( ( rule__AssociationClass__AbstractAssignment_0 )? )
            // InternalUSE.g:2778:2: ( rule__AssociationClass__AbstractAssignment_0 )?
            {
             before(grammarAccess.getAssociationClassAccess().getAbstractAssignment_0()); 
            // InternalUSE.g:2779:2: ( rule__AssociationClass__AbstractAssignment_0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==59) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalUSE.g:2779:3: rule__AssociationClass__AbstractAssignment_0
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
    // InternalUSE.g:2787:1: rule__AssociationClass__Group__1 : rule__AssociationClass__Group__1__Impl rule__AssociationClass__Group__2 ;
    public final void rule__AssociationClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2791:1: ( rule__AssociationClass__Group__1__Impl rule__AssociationClass__Group__2 )
            // InternalUSE.g:2792:2: rule__AssociationClass__Group__1__Impl rule__AssociationClass__Group__2
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
    // InternalUSE.g:2799:1: rule__AssociationClass__Group__1__Impl : ( 'associationclass' ) ;
    public final void rule__AssociationClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2803:1: ( ( 'associationclass' ) )
            // InternalUSE.g:2804:1: ( 'associationclass' )
            {
            // InternalUSE.g:2804:1: ( 'associationclass' )
            // InternalUSE.g:2805:2: 'associationclass'
            {
             before(grammarAccess.getAssociationClassAccess().getAssociationclassKeyword_1()); 
            match(input,47,FOLLOW_2); 
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
    // InternalUSE.g:2814:1: rule__AssociationClass__Group__2 : rule__AssociationClass__Group__2__Impl rule__AssociationClass__Group__3 ;
    public final void rule__AssociationClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2818:1: ( rule__AssociationClass__Group__2__Impl rule__AssociationClass__Group__3 )
            // InternalUSE.g:2819:2: rule__AssociationClass__Group__2__Impl rule__AssociationClass__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalUSE.g:2826:1: rule__AssociationClass__Group__2__Impl : ( ( rule__AssociationClass__NameAssignment_2 ) ) ;
    public final void rule__AssociationClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2830:1: ( ( ( rule__AssociationClass__NameAssignment_2 ) ) )
            // InternalUSE.g:2831:1: ( ( rule__AssociationClass__NameAssignment_2 ) )
            {
            // InternalUSE.g:2831:1: ( ( rule__AssociationClass__NameAssignment_2 ) )
            // InternalUSE.g:2832:2: ( rule__AssociationClass__NameAssignment_2 )
            {
             before(grammarAccess.getAssociationClassAccess().getNameAssignment_2()); 
            // InternalUSE.g:2833:2: ( rule__AssociationClass__NameAssignment_2 )
            // InternalUSE.g:2833:3: rule__AssociationClass__NameAssignment_2
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
    // InternalUSE.g:2841:1: rule__AssociationClass__Group__3 : rule__AssociationClass__Group__3__Impl rule__AssociationClass__Group__4 ;
    public final void rule__AssociationClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2845:1: ( rule__AssociationClass__Group__3__Impl rule__AssociationClass__Group__4 )
            // InternalUSE.g:2846:2: rule__AssociationClass__Group__3__Impl rule__AssociationClass__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalUSE.g:2853:1: rule__AssociationClass__Group__3__Impl : ( ( rule__AssociationClass__Group_3__0 )? ) ;
    public final void rule__AssociationClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2857:1: ( ( ( rule__AssociationClass__Group_3__0 )? ) )
            // InternalUSE.g:2858:1: ( ( rule__AssociationClass__Group_3__0 )? )
            {
            // InternalUSE.g:2858:1: ( ( rule__AssociationClass__Group_3__0 )? )
            // InternalUSE.g:2859:2: ( rule__AssociationClass__Group_3__0 )?
            {
             before(grammarAccess.getAssociationClassAccess().getGroup_3()); 
            // InternalUSE.g:2860:2: ( rule__AssociationClass__Group_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==42) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalUSE.g:2860:3: rule__AssociationClass__Group_3__0
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
    // InternalUSE.g:2868:1: rule__AssociationClass__Group__4 : rule__AssociationClass__Group__4__Impl rule__AssociationClass__Group__5 ;
    public final void rule__AssociationClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2872:1: ( rule__AssociationClass__Group__4__Impl rule__AssociationClass__Group__5 )
            // InternalUSE.g:2873:2: rule__AssociationClass__Group__4__Impl rule__AssociationClass__Group__5
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
    // InternalUSE.g:2880:1: rule__AssociationClass__Group__4__Impl : ( 'between' ) ;
    public final void rule__AssociationClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2884:1: ( ( 'between' ) )
            // InternalUSE.g:2885:1: ( 'between' )
            {
            // InternalUSE.g:2885:1: ( 'between' )
            // InternalUSE.g:2886:2: 'between'
            {
             before(grammarAccess.getAssociationClassAccess().getBetweenKeyword_4()); 
            match(input,43,FOLLOW_2); 
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
    // InternalUSE.g:2895:1: rule__AssociationClass__Group__5 : rule__AssociationClass__Group__5__Impl rule__AssociationClass__Group__6 ;
    public final void rule__AssociationClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2899:1: ( rule__AssociationClass__Group__5__Impl rule__AssociationClass__Group__6 )
            // InternalUSE.g:2900:2: rule__AssociationClass__Group__5__Impl rule__AssociationClass__Group__6
            {
            pushFollow(FOLLOW_28);
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
    // InternalUSE.g:2907:1: rule__AssociationClass__Group__5__Impl : ( ( ( rule__AssociationClass__AssociationEndsAssignment_5 ) ) ( ( rule__AssociationClass__AssociationEndsAssignment_5 )* ) ) ;
    public final void rule__AssociationClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2911:1: ( ( ( ( rule__AssociationClass__AssociationEndsAssignment_5 ) ) ( ( rule__AssociationClass__AssociationEndsAssignment_5 )* ) ) )
            // InternalUSE.g:2912:1: ( ( ( rule__AssociationClass__AssociationEndsAssignment_5 ) ) ( ( rule__AssociationClass__AssociationEndsAssignment_5 )* ) )
            {
            // InternalUSE.g:2912:1: ( ( ( rule__AssociationClass__AssociationEndsAssignment_5 ) ) ( ( rule__AssociationClass__AssociationEndsAssignment_5 )* ) )
            // InternalUSE.g:2913:2: ( ( rule__AssociationClass__AssociationEndsAssignment_5 ) ) ( ( rule__AssociationClass__AssociationEndsAssignment_5 )* )
            {
            // InternalUSE.g:2913:2: ( ( rule__AssociationClass__AssociationEndsAssignment_5 ) )
            // InternalUSE.g:2914:3: ( rule__AssociationClass__AssociationEndsAssignment_5 )
            {
             before(grammarAccess.getAssociationClassAccess().getAssociationEndsAssignment_5()); 
            // InternalUSE.g:2915:3: ( rule__AssociationClass__AssociationEndsAssignment_5 )
            // InternalUSE.g:2915:4: rule__AssociationClass__AssociationEndsAssignment_5
            {
            pushFollow(FOLLOW_17);
            rule__AssociationClass__AssociationEndsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAssociationClassAccess().getAssociationEndsAssignment_5()); 

            }

            // InternalUSE.g:2918:2: ( ( rule__AssociationClass__AssociationEndsAssignment_5 )* )
            // InternalUSE.g:2919:3: ( rule__AssociationClass__AssociationEndsAssignment_5 )*
            {
             before(grammarAccess.getAssociationClassAccess().getAssociationEndsAssignment_5()); 
            // InternalUSE.g:2920:3: ( rule__AssociationClass__AssociationEndsAssignment_5 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalUSE.g:2920:4: rule__AssociationClass__AssociationEndsAssignment_5
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__AssociationClass__AssociationEndsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalUSE.g:2929:1: rule__AssociationClass__Group__6 : rule__AssociationClass__Group__6__Impl rule__AssociationClass__Group__7 ;
    public final void rule__AssociationClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2933:1: ( rule__AssociationClass__Group__6__Impl rule__AssociationClass__Group__7 )
            // InternalUSE.g:2934:2: rule__AssociationClass__Group__6__Impl rule__AssociationClass__Group__7
            {
            pushFollow(FOLLOW_28);
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
    // InternalUSE.g:2941:1: rule__AssociationClass__Group__6__Impl : ( ( rule__AssociationClass__AttributesAssignment_6 )? ) ;
    public final void rule__AssociationClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2945:1: ( ( ( rule__AssociationClass__AttributesAssignment_6 )? ) )
            // InternalUSE.g:2946:1: ( ( rule__AssociationClass__AttributesAssignment_6 )? )
            {
            // InternalUSE.g:2946:1: ( ( rule__AssociationClass__AttributesAssignment_6 )? )
            // InternalUSE.g:2947:2: ( rule__AssociationClass__AttributesAssignment_6 )?
            {
             before(grammarAccess.getAssociationClassAccess().getAttributesAssignment_6()); 
            // InternalUSE.g:2948:2: ( rule__AssociationClass__AttributesAssignment_6 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==48) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalUSE.g:2948:3: rule__AssociationClass__AttributesAssignment_6
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
    // InternalUSE.g:2956:1: rule__AssociationClass__Group__7 : rule__AssociationClass__Group__7__Impl rule__AssociationClass__Group__8 ;
    public final void rule__AssociationClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2960:1: ( rule__AssociationClass__Group__7__Impl rule__AssociationClass__Group__8 )
            // InternalUSE.g:2961:2: rule__AssociationClass__Group__7__Impl rule__AssociationClass__Group__8
            {
            pushFollow(FOLLOW_28);
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
    // InternalUSE.g:2968:1: rule__AssociationClass__Group__7__Impl : ( ( rule__AssociationClass__OperationsAssignment_7 )? ) ;
    public final void rule__AssociationClass__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2972:1: ( ( ( rule__AssociationClass__OperationsAssignment_7 )? ) )
            // InternalUSE.g:2973:1: ( ( rule__AssociationClass__OperationsAssignment_7 )? )
            {
            // InternalUSE.g:2973:1: ( ( rule__AssociationClass__OperationsAssignment_7 )? )
            // InternalUSE.g:2974:2: ( rule__AssociationClass__OperationsAssignment_7 )?
            {
             before(grammarAccess.getAssociationClassAccess().getOperationsAssignment_7()); 
            // InternalUSE.g:2975:2: ( rule__AssociationClass__OperationsAssignment_7 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==50) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalUSE.g:2975:3: rule__AssociationClass__OperationsAssignment_7
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
    // InternalUSE.g:2983:1: rule__AssociationClass__Group__8 : rule__AssociationClass__Group__8__Impl rule__AssociationClass__Group__9 ;
    public final void rule__AssociationClass__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2987:1: ( rule__AssociationClass__Group__8__Impl rule__AssociationClass__Group__9 )
            // InternalUSE.g:2988:2: rule__AssociationClass__Group__8__Impl rule__AssociationClass__Group__9
            {
            pushFollow(FOLLOW_28);
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
    // InternalUSE.g:2995:1: rule__AssociationClass__Group__8__Impl : ( ( rule__AssociationClass__ConstraintsAssignment_8 )? ) ;
    public final void rule__AssociationClass__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:2999:1: ( ( ( rule__AssociationClass__ConstraintsAssignment_8 )? ) )
            // InternalUSE.g:3000:1: ( ( rule__AssociationClass__ConstraintsAssignment_8 )? )
            {
            // InternalUSE.g:3000:1: ( ( rule__AssociationClass__ConstraintsAssignment_8 )? )
            // InternalUSE.g:3001:2: ( rule__AssociationClass__ConstraintsAssignment_8 )?
            {
             before(grammarAccess.getAssociationClassAccess().getConstraintsAssignment_8()); 
            // InternalUSE.g:3002:2: ( rule__AssociationClass__ConstraintsAssignment_8 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==53) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalUSE.g:3002:3: rule__AssociationClass__ConstraintsAssignment_8
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
    // InternalUSE.g:3010:1: rule__AssociationClass__Group__9 : rule__AssociationClass__Group__9__Impl ;
    public final void rule__AssociationClass__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3014:1: ( rule__AssociationClass__Group__9__Impl )
            // InternalUSE.g:3015:2: rule__AssociationClass__Group__9__Impl
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
    // InternalUSE.g:3021:1: rule__AssociationClass__Group__9__Impl : ( 'end' ) ;
    public final void rule__AssociationClass__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3025:1: ( ( 'end' ) )
            // InternalUSE.g:3026:1: ( 'end' )
            {
            // InternalUSE.g:3026:1: ( 'end' )
            // InternalUSE.g:3027:2: 'end'
            {
             before(grammarAccess.getAssociationClassAccess().getEndKeyword_9()); 
            match(input,41,FOLLOW_2); 
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
    // InternalUSE.g:3037:1: rule__AssociationClass__Group_3__0 : rule__AssociationClass__Group_3__0__Impl rule__AssociationClass__Group_3__1 ;
    public final void rule__AssociationClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3041:1: ( rule__AssociationClass__Group_3__0__Impl rule__AssociationClass__Group_3__1 )
            // InternalUSE.g:3042:2: rule__AssociationClass__Group_3__0__Impl rule__AssociationClass__Group_3__1
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
    // InternalUSE.g:3049:1: rule__AssociationClass__Group_3__0__Impl : ( '<' ) ;
    public final void rule__AssociationClass__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3053:1: ( ( '<' ) )
            // InternalUSE.g:3054:1: ( '<' )
            {
            // InternalUSE.g:3054:1: ( '<' )
            // InternalUSE.g:3055:2: '<'
            {
             before(grammarAccess.getAssociationClassAccess().getLessThanSignKeyword_3_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalUSE.g:3064:1: rule__AssociationClass__Group_3__1 : rule__AssociationClass__Group_3__1__Impl ;
    public final void rule__AssociationClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3068:1: ( rule__AssociationClass__Group_3__1__Impl )
            // InternalUSE.g:3069:2: rule__AssociationClass__Group_3__1__Impl
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
    // InternalUSE.g:3075:1: rule__AssociationClass__Group_3__1__Impl : ( ( ( rule__AssociationClass__GeneralizationAssignment_3_1 ) ) ( ( rule__AssociationClass__GeneralizationAssignment_3_1 )* ) ) ;
    public final void rule__AssociationClass__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3079:1: ( ( ( ( rule__AssociationClass__GeneralizationAssignment_3_1 ) ) ( ( rule__AssociationClass__GeneralizationAssignment_3_1 )* ) ) )
            // InternalUSE.g:3080:1: ( ( ( rule__AssociationClass__GeneralizationAssignment_3_1 ) ) ( ( rule__AssociationClass__GeneralizationAssignment_3_1 )* ) )
            {
            // InternalUSE.g:3080:1: ( ( ( rule__AssociationClass__GeneralizationAssignment_3_1 ) ) ( ( rule__AssociationClass__GeneralizationAssignment_3_1 )* ) )
            // InternalUSE.g:3081:2: ( ( rule__AssociationClass__GeneralizationAssignment_3_1 ) ) ( ( rule__AssociationClass__GeneralizationAssignment_3_1 )* )
            {
            // InternalUSE.g:3081:2: ( ( rule__AssociationClass__GeneralizationAssignment_3_1 ) )
            // InternalUSE.g:3082:3: ( rule__AssociationClass__GeneralizationAssignment_3_1 )
            {
             before(grammarAccess.getAssociationClassAccess().getGeneralizationAssignment_3_1()); 
            // InternalUSE.g:3083:3: ( rule__AssociationClass__GeneralizationAssignment_3_1 )
            // InternalUSE.g:3083:4: rule__AssociationClass__GeneralizationAssignment_3_1
            {
            pushFollow(FOLLOW_17);
            rule__AssociationClass__GeneralizationAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationClassAccess().getGeneralizationAssignment_3_1()); 

            }

            // InternalUSE.g:3086:2: ( ( rule__AssociationClass__GeneralizationAssignment_3_1 )* )
            // InternalUSE.g:3087:3: ( rule__AssociationClass__GeneralizationAssignment_3_1 )*
            {
             before(grammarAccess.getAssociationClassAccess().getGeneralizationAssignment_3_1()); 
            // InternalUSE.g:3088:3: ( rule__AssociationClass__GeneralizationAssignment_3_1 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalUSE.g:3088:4: rule__AssociationClass__GeneralizationAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__AssociationClass__GeneralizationAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalUSE.g:3098:1: rule__AttributesBase__Group__0 : rule__AttributesBase__Group__0__Impl rule__AttributesBase__Group__1 ;
    public final void rule__AttributesBase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3102:1: ( rule__AttributesBase__Group__0__Impl rule__AttributesBase__Group__1 )
            // InternalUSE.g:3103:2: rule__AttributesBase__Group__0__Impl rule__AttributesBase__Group__1
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
    // InternalUSE.g:3110:1: rule__AttributesBase__Group__0__Impl : ( 'attributes' ) ;
    public final void rule__AttributesBase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3114:1: ( ( 'attributes' ) )
            // InternalUSE.g:3115:1: ( 'attributes' )
            {
            // InternalUSE.g:3115:1: ( 'attributes' )
            // InternalUSE.g:3116:2: 'attributes'
            {
             before(grammarAccess.getAttributesBaseAccess().getAttributesKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalUSE.g:3125:1: rule__AttributesBase__Group__1 : rule__AttributesBase__Group__1__Impl ;
    public final void rule__AttributesBase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3129:1: ( rule__AttributesBase__Group__1__Impl )
            // InternalUSE.g:3130:2: rule__AttributesBase__Group__1__Impl
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
    // InternalUSE.g:3136:1: rule__AttributesBase__Group__1__Impl : ( ( rule__AttributesBase__AttributesAssignment_1 )* ) ;
    public final void rule__AttributesBase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3140:1: ( ( ( rule__AttributesBase__AttributesAssignment_1 )* ) )
            // InternalUSE.g:3141:1: ( ( rule__AttributesBase__AttributesAssignment_1 )* )
            {
            // InternalUSE.g:3141:1: ( ( rule__AttributesBase__AttributesAssignment_1 )* )
            // InternalUSE.g:3142:2: ( rule__AttributesBase__AttributesAssignment_1 )*
            {
             before(grammarAccess.getAttributesBaseAccess().getAttributesAssignment_1()); 
            // InternalUSE.g:3143:2: ( rule__AttributesBase__AttributesAssignment_1 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_ID) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalUSE.g:3143:3: rule__AttributesBase__AttributesAssignment_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__AttributesBase__AttributesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
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
    // InternalUSE.g:3152:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3156:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalUSE.g:3157:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalUSE.g:3164:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3168:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalUSE.g:3169:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalUSE.g:3169:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalUSE.g:3170:2: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // InternalUSE.g:3171:2: ( rule__Attribute__NameAssignment_0 )
            // InternalUSE.g:3171:3: rule__Attribute__NameAssignment_0
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
    // InternalUSE.g:3179:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3183:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalUSE.g:3184:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalUSE.g:3191:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3195:1: ( ( ':' ) )
            // InternalUSE.g:3196:1: ( ':' )
            {
            // InternalUSE.g:3196:1: ( ':' )
            // InternalUSE.g:3197:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalUSE.g:3206:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3210:1: ( rule__Attribute__Group__2__Impl )
            // InternalUSE.g:3211:2: rule__Attribute__Group__2__Impl
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
    // InternalUSE.g:3217:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3221:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // InternalUSE.g:3222:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // InternalUSE.g:3222:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // InternalUSE.g:3223:2: ( rule__Attribute__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            // InternalUSE.g:3224:2: ( rule__Attribute__TypeAssignment_2 )
            // InternalUSE.g:3224:3: rule__Attribute__TypeAssignment_2
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
    // InternalUSE.g:3233:1: rule__OperationsBase__Group__0 : rule__OperationsBase__Group__0__Impl rule__OperationsBase__Group__1 ;
    public final void rule__OperationsBase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3237:1: ( rule__OperationsBase__Group__0__Impl rule__OperationsBase__Group__1 )
            // InternalUSE.g:3238:2: rule__OperationsBase__Group__0__Impl rule__OperationsBase__Group__1
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
    // InternalUSE.g:3245:1: rule__OperationsBase__Group__0__Impl : ( 'operations' ) ;
    public final void rule__OperationsBase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3249:1: ( ( 'operations' ) )
            // InternalUSE.g:3250:1: ( 'operations' )
            {
            // InternalUSE.g:3250:1: ( 'operations' )
            // InternalUSE.g:3251:2: 'operations'
            {
             before(grammarAccess.getOperationsBaseAccess().getOperationsKeyword_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalUSE.g:3260:1: rule__OperationsBase__Group__1 : rule__OperationsBase__Group__1__Impl ;
    public final void rule__OperationsBase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3264:1: ( rule__OperationsBase__Group__1__Impl )
            // InternalUSE.g:3265:2: rule__OperationsBase__Group__1__Impl
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
    // InternalUSE.g:3271:1: rule__OperationsBase__Group__1__Impl : ( ( rule__OperationsBase__OperationsAssignment_1 )* ) ;
    public final void rule__OperationsBase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3275:1: ( ( ( rule__OperationsBase__OperationsAssignment_1 )* ) )
            // InternalUSE.g:3276:1: ( ( rule__OperationsBase__OperationsAssignment_1 )* )
            {
            // InternalUSE.g:3276:1: ( ( rule__OperationsBase__OperationsAssignment_1 )* )
            // InternalUSE.g:3277:2: ( rule__OperationsBase__OperationsAssignment_1 )*
            {
             before(grammarAccess.getOperationsBaseAccess().getOperationsAssignment_1()); 
            // InternalUSE.g:3278:2: ( rule__OperationsBase__OperationsAssignment_1 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_ID) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalUSE.g:3278:3: rule__OperationsBase__OperationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__OperationsBase__OperationsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // InternalUSE.g:3287:1: rule__OperationQuery__Group__0 : rule__OperationQuery__Group__0__Impl rule__OperationQuery__Group__1 ;
    public final void rule__OperationQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3291:1: ( rule__OperationQuery__Group__0__Impl rule__OperationQuery__Group__1 )
            // InternalUSE.g:3292:2: rule__OperationQuery__Group__0__Impl rule__OperationQuery__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalUSE.g:3299:1: rule__OperationQuery__Group__0__Impl : ( ( rule__OperationQuery__OperationDeclarationAssignment_0 ) ) ;
    public final void rule__OperationQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3303:1: ( ( ( rule__OperationQuery__OperationDeclarationAssignment_0 ) ) )
            // InternalUSE.g:3304:1: ( ( rule__OperationQuery__OperationDeclarationAssignment_0 ) )
            {
            // InternalUSE.g:3304:1: ( ( rule__OperationQuery__OperationDeclarationAssignment_0 ) )
            // InternalUSE.g:3305:2: ( rule__OperationQuery__OperationDeclarationAssignment_0 )
            {
             before(grammarAccess.getOperationQueryAccess().getOperationDeclarationAssignment_0()); 
            // InternalUSE.g:3306:2: ( rule__OperationQuery__OperationDeclarationAssignment_0 )
            // InternalUSE.g:3306:3: rule__OperationQuery__OperationDeclarationAssignment_0
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
    // InternalUSE.g:3314:1: rule__OperationQuery__Group__1 : rule__OperationQuery__Group__1__Impl rule__OperationQuery__Group__2 ;
    public final void rule__OperationQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3318:1: ( rule__OperationQuery__Group__1__Impl rule__OperationQuery__Group__2 )
            // InternalUSE.g:3319:2: rule__OperationQuery__Group__1__Impl rule__OperationQuery__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalUSE.g:3326:1: rule__OperationQuery__Group__1__Impl : ( '=' ) ;
    public final void rule__OperationQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3330:1: ( ( '=' ) )
            // InternalUSE.g:3331:1: ( '=' )
            {
            // InternalUSE.g:3331:1: ( '=' )
            // InternalUSE.g:3332:2: '='
            {
             before(grammarAccess.getOperationQueryAccess().getEqualsSignKeyword_1()); 
            match(input,51,FOLLOW_2); 
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
    // InternalUSE.g:3341:1: rule__OperationQuery__Group__2 : rule__OperationQuery__Group__2__Impl rule__OperationQuery__Group__3 ;
    public final void rule__OperationQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3345:1: ( rule__OperationQuery__Group__2__Impl rule__OperationQuery__Group__3 )
            // InternalUSE.g:3346:2: rule__OperationQuery__Group__2__Impl rule__OperationQuery__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalUSE.g:3353:1: rule__OperationQuery__Group__2__Impl : ( ( rule__OperationQuery__OperationbodyAssignment_2 ) ) ;
    public final void rule__OperationQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3357:1: ( ( ( rule__OperationQuery__OperationbodyAssignment_2 ) ) )
            // InternalUSE.g:3358:1: ( ( rule__OperationQuery__OperationbodyAssignment_2 ) )
            {
            // InternalUSE.g:3358:1: ( ( rule__OperationQuery__OperationbodyAssignment_2 ) )
            // InternalUSE.g:3359:2: ( rule__OperationQuery__OperationbodyAssignment_2 )
            {
             before(grammarAccess.getOperationQueryAccess().getOperationbodyAssignment_2()); 
            // InternalUSE.g:3360:2: ( rule__OperationQuery__OperationbodyAssignment_2 )
            // InternalUSE.g:3360:3: rule__OperationQuery__OperationbodyAssignment_2
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
    // InternalUSE.g:3368:1: rule__OperationQuery__Group__3 : rule__OperationQuery__Group__3__Impl ;
    public final void rule__OperationQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3372:1: ( rule__OperationQuery__Group__3__Impl )
            // InternalUSE.g:3373:2: rule__OperationQuery__Group__3__Impl
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
    // InternalUSE.g:3379:1: rule__OperationQuery__Group__3__Impl : ( ( rule__OperationQuery__ConditionsAssignment_3 )* ) ;
    public final void rule__OperationQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3383:1: ( ( ( rule__OperationQuery__ConditionsAssignment_3 )* ) )
            // InternalUSE.g:3384:1: ( ( rule__OperationQuery__ConditionsAssignment_3 )* )
            {
            // InternalUSE.g:3384:1: ( ( rule__OperationQuery__ConditionsAssignment_3 )* )
            // InternalUSE.g:3385:2: ( rule__OperationQuery__ConditionsAssignment_3 )*
            {
             before(grammarAccess.getOperationQueryAccess().getConditionsAssignment_3()); 
            // InternalUSE.g:3386:2: ( rule__OperationQuery__ConditionsAssignment_3 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=57 && LA46_0<=58)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalUSE.g:3386:3: rule__OperationQuery__ConditionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__OperationQuery__ConditionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalUSE.g:3395:1: rule__OperationComplex__Group__0 : rule__OperationComplex__Group__0__Impl rule__OperationComplex__Group__1 ;
    public final void rule__OperationComplex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3399:1: ( rule__OperationComplex__Group__0__Impl rule__OperationComplex__Group__1 )
            // InternalUSE.g:3400:2: rule__OperationComplex__Group__0__Impl rule__OperationComplex__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalUSE.g:3407:1: rule__OperationComplex__Group__0__Impl : ( ( rule__OperationComplex__OperationDeclarationAssignment_0 ) ) ;
    public final void rule__OperationComplex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3411:1: ( ( ( rule__OperationComplex__OperationDeclarationAssignment_0 ) ) )
            // InternalUSE.g:3412:1: ( ( rule__OperationComplex__OperationDeclarationAssignment_0 ) )
            {
            // InternalUSE.g:3412:1: ( ( rule__OperationComplex__OperationDeclarationAssignment_0 ) )
            // InternalUSE.g:3413:2: ( rule__OperationComplex__OperationDeclarationAssignment_0 )
            {
             before(grammarAccess.getOperationComplexAccess().getOperationDeclarationAssignment_0()); 
            // InternalUSE.g:3414:2: ( rule__OperationComplex__OperationDeclarationAssignment_0 )
            // InternalUSE.g:3414:3: rule__OperationComplex__OperationDeclarationAssignment_0
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
    // InternalUSE.g:3422:1: rule__OperationComplex__Group__1 : rule__OperationComplex__Group__1__Impl rule__OperationComplex__Group__2 ;
    public final void rule__OperationComplex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3426:1: ( rule__OperationComplex__Group__1__Impl rule__OperationComplex__Group__2 )
            // InternalUSE.g:3427:2: rule__OperationComplex__Group__1__Impl rule__OperationComplex__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalUSE.g:3434:1: rule__OperationComplex__Group__1__Impl : ( ( rule__OperationComplex__Group_1__0 )? ) ;
    public final void rule__OperationComplex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3438:1: ( ( ( rule__OperationComplex__Group_1__0 )? ) )
            // InternalUSE.g:3439:1: ( ( rule__OperationComplex__Group_1__0 )? )
            {
            // InternalUSE.g:3439:1: ( ( rule__OperationComplex__Group_1__0 )? )
            // InternalUSE.g:3440:2: ( rule__OperationComplex__Group_1__0 )?
            {
             before(grammarAccess.getOperationComplexAccess().getGroup_1()); 
            // InternalUSE.g:3441:2: ( rule__OperationComplex__Group_1__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==52) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalUSE.g:3441:3: rule__OperationComplex__Group_1__0
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
    // InternalUSE.g:3449:1: rule__OperationComplex__Group__2 : rule__OperationComplex__Group__2__Impl ;
    public final void rule__OperationComplex__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3453:1: ( rule__OperationComplex__Group__2__Impl )
            // InternalUSE.g:3454:2: rule__OperationComplex__Group__2__Impl
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
    // InternalUSE.g:3460:1: rule__OperationComplex__Group__2__Impl : ( ( rule__OperationComplex__ConditionsAssignment_2 )* ) ;
    public final void rule__OperationComplex__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3464:1: ( ( ( rule__OperationComplex__ConditionsAssignment_2 )* ) )
            // InternalUSE.g:3465:1: ( ( rule__OperationComplex__ConditionsAssignment_2 )* )
            {
            // InternalUSE.g:3465:1: ( ( rule__OperationComplex__ConditionsAssignment_2 )* )
            // InternalUSE.g:3466:2: ( rule__OperationComplex__ConditionsAssignment_2 )*
            {
             before(grammarAccess.getOperationComplexAccess().getConditionsAssignment_2()); 
            // InternalUSE.g:3467:2: ( rule__OperationComplex__ConditionsAssignment_2 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=57 && LA48_0<=58)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalUSE.g:3467:3: rule__OperationComplex__ConditionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__OperationComplex__ConditionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // InternalUSE.g:3476:1: rule__OperationComplex__Group_1__0 : rule__OperationComplex__Group_1__0__Impl rule__OperationComplex__Group_1__1 ;
    public final void rule__OperationComplex__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3480:1: ( rule__OperationComplex__Group_1__0__Impl rule__OperationComplex__Group_1__1 )
            // InternalUSE.g:3481:2: rule__OperationComplex__Group_1__0__Impl rule__OperationComplex__Group_1__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalUSE.g:3488:1: rule__OperationComplex__Group_1__0__Impl : ( 'begin' ) ;
    public final void rule__OperationComplex__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3492:1: ( ( 'begin' ) )
            // InternalUSE.g:3493:1: ( 'begin' )
            {
            // InternalUSE.g:3493:1: ( 'begin' )
            // InternalUSE.g:3494:2: 'begin'
            {
             before(grammarAccess.getOperationComplexAccess().getBeginKeyword_1_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalUSE.g:3503:1: rule__OperationComplex__Group_1__1 : rule__OperationComplex__Group_1__1__Impl rule__OperationComplex__Group_1__2 ;
    public final void rule__OperationComplex__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3507:1: ( rule__OperationComplex__Group_1__1__Impl rule__OperationComplex__Group_1__2 )
            // InternalUSE.g:3508:2: rule__OperationComplex__Group_1__1__Impl rule__OperationComplex__Group_1__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalUSE.g:3515:1: rule__OperationComplex__Group_1__1__Impl : ( ( rule__OperationComplex__OperationbodyAssignment_1_1 )? ) ;
    public final void rule__OperationComplex__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3519:1: ( ( ( rule__OperationComplex__OperationbodyAssignment_1_1 )? ) )
            // InternalUSE.g:3520:1: ( ( rule__OperationComplex__OperationbodyAssignment_1_1 )? )
            {
            // InternalUSE.g:3520:1: ( ( rule__OperationComplex__OperationbodyAssignment_1_1 )? )
            // InternalUSE.g:3521:2: ( rule__OperationComplex__OperationbodyAssignment_1_1 )?
            {
             before(grammarAccess.getOperationComplexAccess().getOperationbodyAssignment_1_1()); 
            // InternalUSE.g:3522:2: ( rule__OperationComplex__OperationbodyAssignment_1_1 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_STRING) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalUSE.g:3522:3: rule__OperationComplex__OperationbodyAssignment_1_1
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
    // InternalUSE.g:3530:1: rule__OperationComplex__Group_1__2 : rule__OperationComplex__Group_1__2__Impl ;
    public final void rule__OperationComplex__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3534:1: ( rule__OperationComplex__Group_1__2__Impl )
            // InternalUSE.g:3535:2: rule__OperationComplex__Group_1__2__Impl
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
    // InternalUSE.g:3541:1: rule__OperationComplex__Group_1__2__Impl : ( 'end' ) ;
    public final void rule__OperationComplex__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3545:1: ( ( 'end' ) )
            // InternalUSE.g:3546:1: ( 'end' )
            {
            // InternalUSE.g:3546:1: ( 'end' )
            // InternalUSE.g:3547:2: 'end'
            {
             before(grammarAccess.getOperationComplexAccess().getEndKeyword_1_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalUSE.g:3557:1: rule__OperationDeclaration__Group__0 : rule__OperationDeclaration__Group__0__Impl rule__OperationDeclaration__Group__1 ;
    public final void rule__OperationDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3561:1: ( rule__OperationDeclaration__Group__0__Impl rule__OperationDeclaration__Group__1 )
            // InternalUSE.g:3562:2: rule__OperationDeclaration__Group__0__Impl rule__OperationDeclaration__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalUSE.g:3569:1: rule__OperationDeclaration__Group__0__Impl : ( ( rule__OperationDeclaration__NameAssignment_0 ) ) ;
    public final void rule__OperationDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3573:1: ( ( ( rule__OperationDeclaration__NameAssignment_0 ) ) )
            // InternalUSE.g:3574:1: ( ( rule__OperationDeclaration__NameAssignment_0 ) )
            {
            // InternalUSE.g:3574:1: ( ( rule__OperationDeclaration__NameAssignment_0 ) )
            // InternalUSE.g:3575:2: ( rule__OperationDeclaration__NameAssignment_0 )
            {
             before(grammarAccess.getOperationDeclarationAccess().getNameAssignment_0()); 
            // InternalUSE.g:3576:2: ( rule__OperationDeclaration__NameAssignment_0 )
            // InternalUSE.g:3576:3: rule__OperationDeclaration__NameAssignment_0
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
    // InternalUSE.g:3584:1: rule__OperationDeclaration__Group__1 : rule__OperationDeclaration__Group__1__Impl rule__OperationDeclaration__Group__2 ;
    public final void rule__OperationDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3588:1: ( rule__OperationDeclaration__Group__1__Impl rule__OperationDeclaration__Group__2 )
            // InternalUSE.g:3589:2: rule__OperationDeclaration__Group__1__Impl rule__OperationDeclaration__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalUSE.g:3596:1: rule__OperationDeclaration__Group__1__Impl : ( '(' ) ;
    public final void rule__OperationDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3600:1: ( ( '(' ) )
            // InternalUSE.g:3601:1: ( '(' )
            {
            // InternalUSE.g:3601:1: ( '(' )
            // InternalUSE.g:3602:2: '('
            {
             before(grammarAccess.getOperationDeclarationAccess().getLeftParenthesisKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalUSE.g:3611:1: rule__OperationDeclaration__Group__2 : rule__OperationDeclaration__Group__2__Impl rule__OperationDeclaration__Group__3 ;
    public final void rule__OperationDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3615:1: ( rule__OperationDeclaration__Group__2__Impl rule__OperationDeclaration__Group__3 )
            // InternalUSE.g:3616:2: rule__OperationDeclaration__Group__2__Impl rule__OperationDeclaration__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalUSE.g:3623:1: rule__OperationDeclaration__Group__2__Impl : ( ( rule__OperationDeclaration__ParametersAssignment_2 )* ) ;
    public final void rule__OperationDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3627:1: ( ( ( rule__OperationDeclaration__ParametersAssignment_2 )* ) )
            // InternalUSE.g:3628:1: ( ( rule__OperationDeclaration__ParametersAssignment_2 )* )
            {
            // InternalUSE.g:3628:1: ( ( rule__OperationDeclaration__ParametersAssignment_2 )* )
            // InternalUSE.g:3629:2: ( rule__OperationDeclaration__ParametersAssignment_2 )*
            {
             before(grammarAccess.getOperationDeclarationAccess().getParametersAssignment_2()); 
            // InternalUSE.g:3630:2: ( rule__OperationDeclaration__ParametersAssignment_2 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_ID) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalUSE.g:3630:3: rule__OperationDeclaration__ParametersAssignment_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__OperationDeclaration__ParametersAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // InternalUSE.g:3638:1: rule__OperationDeclaration__Group__3 : rule__OperationDeclaration__Group__3__Impl rule__OperationDeclaration__Group__4 ;
    public final void rule__OperationDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3642:1: ( rule__OperationDeclaration__Group__3__Impl rule__OperationDeclaration__Group__4 )
            // InternalUSE.g:3643:2: rule__OperationDeclaration__Group__3__Impl rule__OperationDeclaration__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalUSE.g:3650:1: rule__OperationDeclaration__Group__3__Impl : ( ')' ) ;
    public final void rule__OperationDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3654:1: ( ( ')' ) )
            // InternalUSE.g:3655:1: ( ')' )
            {
            // InternalUSE.g:3655:1: ( ')' )
            // InternalUSE.g:3656:2: ')'
            {
             before(grammarAccess.getOperationDeclarationAccess().getRightParenthesisKeyword_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalUSE.g:3665:1: rule__OperationDeclaration__Group__4 : rule__OperationDeclaration__Group__4__Impl ;
    public final void rule__OperationDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3669:1: ( rule__OperationDeclaration__Group__4__Impl )
            // InternalUSE.g:3670:2: rule__OperationDeclaration__Group__4__Impl
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
    // InternalUSE.g:3676:1: rule__OperationDeclaration__Group__4__Impl : ( ( rule__OperationDeclaration__Group_4__0 )? ) ;
    public final void rule__OperationDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3680:1: ( ( ( rule__OperationDeclaration__Group_4__0 )? ) )
            // InternalUSE.g:3681:1: ( ( rule__OperationDeclaration__Group_4__0 )? )
            {
            // InternalUSE.g:3681:1: ( ( rule__OperationDeclaration__Group_4__0 )? )
            // InternalUSE.g:3682:2: ( rule__OperationDeclaration__Group_4__0 )?
            {
             before(grammarAccess.getOperationDeclarationAccess().getGroup_4()); 
            // InternalUSE.g:3683:2: ( rule__OperationDeclaration__Group_4__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==49) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalUSE.g:3683:3: rule__OperationDeclaration__Group_4__0
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
    // InternalUSE.g:3692:1: rule__OperationDeclaration__Group_4__0 : rule__OperationDeclaration__Group_4__0__Impl rule__OperationDeclaration__Group_4__1 ;
    public final void rule__OperationDeclaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3696:1: ( rule__OperationDeclaration__Group_4__0__Impl rule__OperationDeclaration__Group_4__1 )
            // InternalUSE.g:3697:2: rule__OperationDeclaration__Group_4__0__Impl rule__OperationDeclaration__Group_4__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalUSE.g:3704:1: rule__OperationDeclaration__Group_4__0__Impl : ( ':' ) ;
    public final void rule__OperationDeclaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3708:1: ( ( ':' ) )
            // InternalUSE.g:3709:1: ( ':' )
            {
            // InternalUSE.g:3709:1: ( ':' )
            // InternalUSE.g:3710:2: ':'
            {
             before(grammarAccess.getOperationDeclarationAccess().getColonKeyword_4_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalUSE.g:3719:1: rule__OperationDeclaration__Group_4__1 : rule__OperationDeclaration__Group_4__1__Impl ;
    public final void rule__OperationDeclaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3723:1: ( rule__OperationDeclaration__Group_4__1__Impl )
            // InternalUSE.g:3724:2: rule__OperationDeclaration__Group_4__1__Impl
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
    // InternalUSE.g:3730:1: rule__OperationDeclaration__Group_4__1__Impl : ( ( rule__OperationDeclaration__ReturnTypeAssignment_4_1 ) ) ;
    public final void rule__OperationDeclaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3734:1: ( ( ( rule__OperationDeclaration__ReturnTypeAssignment_4_1 ) ) )
            // InternalUSE.g:3735:1: ( ( rule__OperationDeclaration__ReturnTypeAssignment_4_1 ) )
            {
            // InternalUSE.g:3735:1: ( ( rule__OperationDeclaration__ReturnTypeAssignment_4_1 ) )
            // InternalUSE.g:3736:2: ( rule__OperationDeclaration__ReturnTypeAssignment_4_1 )
            {
             before(grammarAccess.getOperationDeclarationAccess().getReturnTypeAssignment_4_1()); 
            // InternalUSE.g:3737:2: ( rule__OperationDeclaration__ReturnTypeAssignment_4_1 )
            // InternalUSE.g:3737:3: rule__OperationDeclaration__ReturnTypeAssignment_4_1
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
    // InternalUSE.g:3746:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3750:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalUSE.g:3751:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalUSE.g:3758:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3762:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // InternalUSE.g:3763:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // InternalUSE.g:3763:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // InternalUSE.g:3764:2: ( rule__Parameter__NameAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            // InternalUSE.g:3765:2: ( rule__Parameter__NameAssignment_0 )
            // InternalUSE.g:3765:3: rule__Parameter__NameAssignment_0
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
    // InternalUSE.g:3773:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3777:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalUSE.g:3778:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalUSE.g:3785:1: rule__Parameter__Group__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3789:1: ( ( ':' ) )
            // InternalUSE.g:3790:1: ( ':' )
            {
            // InternalUSE.g:3790:1: ( ':' )
            // InternalUSE.g:3791:2: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalUSE.g:3800:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3804:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalUSE.g:3805:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalUSE.g:3812:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__TypeAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3816:1: ( ( ( rule__Parameter__TypeAssignment_2 ) ) )
            // InternalUSE.g:3817:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            {
            // InternalUSE.g:3817:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            // InternalUSE.g:3818:2: ( rule__Parameter__TypeAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_2()); 
            // InternalUSE.g:3819:2: ( rule__Parameter__TypeAssignment_2 )
            // InternalUSE.g:3819:3: rule__Parameter__TypeAssignment_2
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
    // InternalUSE.g:3827:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3831:1: ( rule__Parameter__Group__3__Impl )
            // InternalUSE.g:3832:2: rule__Parameter__Group__3__Impl
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
    // InternalUSE.g:3838:1: rule__Parameter__Group__3__Impl : ( ( ',' )? ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3842:1: ( ( ( ',' )? ) )
            // InternalUSE.g:3843:1: ( ( ',' )? )
            {
            // InternalUSE.g:3843:1: ( ( ',' )? )
            // InternalUSE.g:3844:2: ( ',' )?
            {
             before(grammarAccess.getParameterAccess().getCommaKeyword_3()); 
            // InternalUSE.g:3845:2: ( ',' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==34) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalUSE.g:3845:3: ','
                    {
                    match(input,34,FOLLOW_2); 

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
    // InternalUSE.g:3854:1: rule__ConstraintsBase__Group__0 : rule__ConstraintsBase__Group__0__Impl rule__ConstraintsBase__Group__1 ;
    public final void rule__ConstraintsBase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3858:1: ( rule__ConstraintsBase__Group__0__Impl rule__ConstraintsBase__Group__1 )
            // InternalUSE.g:3859:2: rule__ConstraintsBase__Group__0__Impl rule__ConstraintsBase__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalUSE.g:3866:1: rule__ConstraintsBase__Group__0__Impl : ( 'constraints' ) ;
    public final void rule__ConstraintsBase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3870:1: ( ( 'constraints' ) )
            // InternalUSE.g:3871:1: ( 'constraints' )
            {
            // InternalUSE.g:3871:1: ( 'constraints' )
            // InternalUSE.g:3872:2: 'constraints'
            {
             before(grammarAccess.getConstraintsBaseAccess().getConstraintsKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalUSE.g:3881:1: rule__ConstraintsBase__Group__1 : rule__ConstraintsBase__Group__1__Impl ;
    public final void rule__ConstraintsBase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3885:1: ( rule__ConstraintsBase__Group__1__Impl )
            // InternalUSE.g:3886:2: rule__ConstraintsBase__Group__1__Impl
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
    // InternalUSE.g:3892:1: rule__ConstraintsBase__Group__1__Impl : ( ( rule__ConstraintsBase__InvariantsAssignment_1 )* ) ;
    public final void rule__ConstraintsBase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3896:1: ( ( ( rule__ConstraintsBase__InvariantsAssignment_1 )* ) )
            // InternalUSE.g:3897:1: ( ( rule__ConstraintsBase__InvariantsAssignment_1 )* )
            {
            // InternalUSE.g:3897:1: ( ( rule__ConstraintsBase__InvariantsAssignment_1 )* )
            // InternalUSE.g:3898:2: ( rule__ConstraintsBase__InvariantsAssignment_1 )*
            {
             before(grammarAccess.getConstraintsBaseAccess().getInvariantsAssignment_1()); 
            // InternalUSE.g:3899:2: ( rule__ConstraintsBase__InvariantsAssignment_1 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==55) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalUSE.g:3899:3: rule__ConstraintsBase__InvariantsAssignment_1
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__ConstraintsBase__InvariantsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
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
    // InternalUSE.g:3908:1: rule__ConstrainsGeneral__Group__0 : rule__ConstrainsGeneral__Group__0__Impl rule__ConstrainsGeneral__Group__1 ;
    public final void rule__ConstrainsGeneral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3912:1: ( rule__ConstrainsGeneral__Group__0__Impl rule__ConstrainsGeneral__Group__1 )
            // InternalUSE.g:3913:2: rule__ConstrainsGeneral__Group__0__Impl rule__ConstrainsGeneral__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalUSE.g:3920:1: rule__ConstrainsGeneral__Group__0__Impl : ( 'constraints' ) ;
    public final void rule__ConstrainsGeneral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3924:1: ( ( 'constraints' ) )
            // InternalUSE.g:3925:1: ( 'constraints' )
            {
            // InternalUSE.g:3925:1: ( 'constraints' )
            // InternalUSE.g:3926:2: 'constraints'
            {
             before(grammarAccess.getConstrainsGeneralAccess().getConstraintsKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalUSE.g:3935:1: rule__ConstrainsGeneral__Group__1 : rule__ConstrainsGeneral__Group__1__Impl ;
    public final void rule__ConstrainsGeneral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3939:1: ( rule__ConstrainsGeneral__Group__1__Impl )
            // InternalUSE.g:3940:2: rule__ConstrainsGeneral__Group__1__Impl
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
    // InternalUSE.g:3946:1: rule__ConstrainsGeneral__Group__1__Impl : ( ( rule__ConstrainsGeneral__ContextsAssignment_1 )* ) ;
    public final void rule__ConstrainsGeneral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3950:1: ( ( ( rule__ConstrainsGeneral__ContextsAssignment_1 )* ) )
            // InternalUSE.g:3951:1: ( ( rule__ConstrainsGeneral__ContextsAssignment_1 )* )
            {
            // InternalUSE.g:3951:1: ( ( rule__ConstrainsGeneral__ContextsAssignment_1 )* )
            // InternalUSE.g:3952:2: ( rule__ConstrainsGeneral__ContextsAssignment_1 )*
            {
             before(grammarAccess.getConstrainsGeneralAccess().getContextsAssignment_1()); 
            // InternalUSE.g:3953:2: ( rule__ConstrainsGeneral__ContextsAssignment_1 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==54) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalUSE.g:3953:3: rule__ConstrainsGeneral__ContextsAssignment_1
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__ConstrainsGeneral__ContextsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
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
    // InternalUSE.g:3962:1: rule__InvariantContext__Group__0 : rule__InvariantContext__Group__0__Impl rule__InvariantContext__Group__1 ;
    public final void rule__InvariantContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3966:1: ( rule__InvariantContext__Group__0__Impl rule__InvariantContext__Group__1 )
            // InternalUSE.g:3967:2: rule__InvariantContext__Group__0__Impl rule__InvariantContext__Group__1
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
    // InternalUSE.g:3974:1: rule__InvariantContext__Group__0__Impl : ( 'context' ) ;
    public final void rule__InvariantContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3978:1: ( ( 'context' ) )
            // InternalUSE.g:3979:1: ( 'context' )
            {
            // InternalUSE.g:3979:1: ( 'context' )
            // InternalUSE.g:3980:2: 'context'
            {
             before(grammarAccess.getInvariantContextAccess().getContextKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalUSE.g:3989:1: rule__InvariantContext__Group__1 : rule__InvariantContext__Group__1__Impl rule__InvariantContext__Group__2 ;
    public final void rule__InvariantContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:3993:1: ( rule__InvariantContext__Group__1__Impl rule__InvariantContext__Group__2 )
            // InternalUSE.g:3994:2: rule__InvariantContext__Group__1__Impl rule__InvariantContext__Group__2
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
    // InternalUSE.g:4001:1: rule__InvariantContext__Group__1__Impl : ( ( rule__InvariantContext__Group_1__0 )? ) ;
    public final void rule__InvariantContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4005:1: ( ( ( rule__InvariantContext__Group_1__0 )? ) )
            // InternalUSE.g:4006:1: ( ( rule__InvariantContext__Group_1__0 )? )
            {
            // InternalUSE.g:4006:1: ( ( rule__InvariantContext__Group_1__0 )? )
            // InternalUSE.g:4007:2: ( rule__InvariantContext__Group_1__0 )?
            {
             before(grammarAccess.getInvariantContextAccess().getGroup_1()); 
            // InternalUSE.g:4008:2: ( rule__InvariantContext__Group_1__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                int LA55_1 = input.LA(2);

                if ( (LA55_1==49) ) {
                    alt55=1;
                }
            }
            switch (alt55) {
                case 1 :
                    // InternalUSE.g:4008:3: rule__InvariantContext__Group_1__0
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
    // InternalUSE.g:4016:1: rule__InvariantContext__Group__2 : rule__InvariantContext__Group__2__Impl rule__InvariantContext__Group__3 ;
    public final void rule__InvariantContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4020:1: ( rule__InvariantContext__Group__2__Impl rule__InvariantContext__Group__3 )
            // InternalUSE.g:4021:2: rule__InvariantContext__Group__2__Impl rule__InvariantContext__Group__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalUSE.g:4028:1: rule__InvariantContext__Group__2__Impl : ( ( rule__InvariantContext__ClassnameAssignment_2 ) ) ;
    public final void rule__InvariantContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4032:1: ( ( ( rule__InvariantContext__ClassnameAssignment_2 ) ) )
            // InternalUSE.g:4033:1: ( ( rule__InvariantContext__ClassnameAssignment_2 ) )
            {
            // InternalUSE.g:4033:1: ( ( rule__InvariantContext__ClassnameAssignment_2 ) )
            // InternalUSE.g:4034:2: ( rule__InvariantContext__ClassnameAssignment_2 )
            {
             before(grammarAccess.getInvariantContextAccess().getClassnameAssignment_2()); 
            // InternalUSE.g:4035:2: ( rule__InvariantContext__ClassnameAssignment_2 )
            // InternalUSE.g:4035:3: rule__InvariantContext__ClassnameAssignment_2
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
    // InternalUSE.g:4043:1: rule__InvariantContext__Group__3 : rule__InvariantContext__Group__3__Impl ;
    public final void rule__InvariantContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4047:1: ( rule__InvariantContext__Group__3__Impl )
            // InternalUSE.g:4048:2: rule__InvariantContext__Group__3__Impl
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
    // InternalUSE.g:4054:1: rule__InvariantContext__Group__3__Impl : ( ( rule__InvariantContext__InvariantsAssignment_3 )* ) ;
    public final void rule__InvariantContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4058:1: ( ( ( rule__InvariantContext__InvariantsAssignment_3 )* ) )
            // InternalUSE.g:4059:1: ( ( rule__InvariantContext__InvariantsAssignment_3 )* )
            {
            // InternalUSE.g:4059:1: ( ( rule__InvariantContext__InvariantsAssignment_3 )* )
            // InternalUSE.g:4060:2: ( rule__InvariantContext__InvariantsAssignment_3 )*
            {
             before(grammarAccess.getInvariantContextAccess().getInvariantsAssignment_3()); 
            // InternalUSE.g:4061:2: ( rule__InvariantContext__InvariantsAssignment_3 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==55) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalUSE.g:4061:3: rule__InvariantContext__InvariantsAssignment_3
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__InvariantContext__InvariantsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop56;
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
    // InternalUSE.g:4070:1: rule__InvariantContext__Group_1__0 : rule__InvariantContext__Group_1__0__Impl rule__InvariantContext__Group_1__1 ;
    public final void rule__InvariantContext__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4074:1: ( rule__InvariantContext__Group_1__0__Impl rule__InvariantContext__Group_1__1 )
            // InternalUSE.g:4075:2: rule__InvariantContext__Group_1__0__Impl rule__InvariantContext__Group_1__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalUSE.g:4082:1: rule__InvariantContext__Group_1__0__Impl : ( ( rule__InvariantContext__VariablenameAssignment_1_0 ) ) ;
    public final void rule__InvariantContext__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4086:1: ( ( ( rule__InvariantContext__VariablenameAssignment_1_0 ) ) )
            // InternalUSE.g:4087:1: ( ( rule__InvariantContext__VariablenameAssignment_1_0 ) )
            {
            // InternalUSE.g:4087:1: ( ( rule__InvariantContext__VariablenameAssignment_1_0 ) )
            // InternalUSE.g:4088:2: ( rule__InvariantContext__VariablenameAssignment_1_0 )
            {
             before(grammarAccess.getInvariantContextAccess().getVariablenameAssignment_1_0()); 
            // InternalUSE.g:4089:2: ( rule__InvariantContext__VariablenameAssignment_1_0 )
            // InternalUSE.g:4089:3: rule__InvariantContext__VariablenameAssignment_1_0
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
    // InternalUSE.g:4097:1: rule__InvariantContext__Group_1__1 : rule__InvariantContext__Group_1__1__Impl ;
    public final void rule__InvariantContext__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4101:1: ( rule__InvariantContext__Group_1__1__Impl )
            // InternalUSE.g:4102:2: rule__InvariantContext__Group_1__1__Impl
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
    // InternalUSE.g:4108:1: rule__InvariantContext__Group_1__1__Impl : ( ':' ) ;
    public final void rule__InvariantContext__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4112:1: ( ( ':' ) )
            // InternalUSE.g:4113:1: ( ':' )
            {
            // InternalUSE.g:4113:1: ( ':' )
            // InternalUSE.g:4114:2: ':'
            {
             before(grammarAccess.getInvariantContextAccess().getColonKeyword_1_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalUSE.g:4124:1: rule__InvariantDefinition__Group__0 : rule__InvariantDefinition__Group__0__Impl rule__InvariantDefinition__Group__1 ;
    public final void rule__InvariantDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4128:1: ( rule__InvariantDefinition__Group__0__Impl rule__InvariantDefinition__Group__1 )
            // InternalUSE.g:4129:2: rule__InvariantDefinition__Group__0__Impl rule__InvariantDefinition__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalUSE.g:4136:1: rule__InvariantDefinition__Group__0__Impl : ( 'inv' ) ;
    public final void rule__InvariantDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4140:1: ( ( 'inv' ) )
            // InternalUSE.g:4141:1: ( 'inv' )
            {
            // InternalUSE.g:4141:1: ( 'inv' )
            // InternalUSE.g:4142:2: 'inv'
            {
             before(grammarAccess.getInvariantDefinitionAccess().getInvKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalUSE.g:4151:1: rule__InvariantDefinition__Group__1 : rule__InvariantDefinition__Group__1__Impl rule__InvariantDefinition__Group__2 ;
    public final void rule__InvariantDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4155:1: ( rule__InvariantDefinition__Group__1__Impl rule__InvariantDefinition__Group__2 )
            // InternalUSE.g:4156:2: rule__InvariantDefinition__Group__1__Impl rule__InvariantDefinition__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalUSE.g:4163:1: rule__InvariantDefinition__Group__1__Impl : ( ( rule__InvariantDefinition__NameAssignment_1 )? ) ;
    public final void rule__InvariantDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4167:1: ( ( ( rule__InvariantDefinition__NameAssignment_1 )? ) )
            // InternalUSE.g:4168:1: ( ( rule__InvariantDefinition__NameAssignment_1 )? )
            {
            // InternalUSE.g:4168:1: ( ( rule__InvariantDefinition__NameAssignment_1 )? )
            // InternalUSE.g:4169:2: ( rule__InvariantDefinition__NameAssignment_1 )?
            {
             before(grammarAccess.getInvariantDefinitionAccess().getNameAssignment_1()); 
            // InternalUSE.g:4170:2: ( rule__InvariantDefinition__NameAssignment_1 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalUSE.g:4170:3: rule__InvariantDefinition__NameAssignment_1
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
    // InternalUSE.g:4178:1: rule__InvariantDefinition__Group__2 : rule__InvariantDefinition__Group__2__Impl rule__InvariantDefinition__Group__3 ;
    public final void rule__InvariantDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4182:1: ( rule__InvariantDefinition__Group__2__Impl rule__InvariantDefinition__Group__3 )
            // InternalUSE.g:4183:2: rule__InvariantDefinition__Group__2__Impl rule__InvariantDefinition__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalUSE.g:4190:1: rule__InvariantDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__InvariantDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4194:1: ( ( ':' ) )
            // InternalUSE.g:4195:1: ( ':' )
            {
            // InternalUSE.g:4195:1: ( ':' )
            // InternalUSE.g:4196:2: ':'
            {
             before(grammarAccess.getInvariantDefinitionAccess().getColonKeyword_2()); 
            match(input,49,FOLLOW_2); 
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
    // InternalUSE.g:4205:1: rule__InvariantDefinition__Group__3 : rule__InvariantDefinition__Group__3__Impl ;
    public final void rule__InvariantDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4209:1: ( rule__InvariantDefinition__Group__3__Impl )
            // InternalUSE.g:4210:2: rule__InvariantDefinition__Group__3__Impl
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
    // InternalUSE.g:4216:1: rule__InvariantDefinition__Group__3__Impl : ( ( rule__InvariantDefinition__OclexpressionAssignment_3 ) ) ;
    public final void rule__InvariantDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4220:1: ( ( ( rule__InvariantDefinition__OclexpressionAssignment_3 ) ) )
            // InternalUSE.g:4221:1: ( ( rule__InvariantDefinition__OclexpressionAssignment_3 ) )
            {
            // InternalUSE.g:4221:1: ( ( rule__InvariantDefinition__OclexpressionAssignment_3 ) )
            // InternalUSE.g:4222:2: ( rule__InvariantDefinition__OclexpressionAssignment_3 )
            {
             before(grammarAccess.getInvariantDefinitionAccess().getOclexpressionAssignment_3()); 
            // InternalUSE.g:4223:2: ( rule__InvariantDefinition__OclexpressionAssignment_3 )
            // InternalUSE.g:4223:3: rule__InvariantDefinition__OclexpressionAssignment_3
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
    // InternalUSE.g:4232:1: rule__OperationContext__Group__0 : rule__OperationContext__Group__0__Impl rule__OperationContext__Group__1 ;
    public final void rule__OperationContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4236:1: ( rule__OperationContext__Group__0__Impl rule__OperationContext__Group__1 )
            // InternalUSE.g:4237:2: rule__OperationContext__Group__0__Impl rule__OperationContext__Group__1
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
    // InternalUSE.g:4244:1: rule__OperationContext__Group__0__Impl : ( 'context' ) ;
    public final void rule__OperationContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4248:1: ( ( 'context' ) )
            // InternalUSE.g:4249:1: ( 'context' )
            {
            // InternalUSE.g:4249:1: ( 'context' )
            // InternalUSE.g:4250:2: 'context'
            {
             before(grammarAccess.getOperationContextAccess().getContextKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalUSE.g:4259:1: rule__OperationContext__Group__1 : rule__OperationContext__Group__1__Impl rule__OperationContext__Group__2 ;
    public final void rule__OperationContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4263:1: ( rule__OperationContext__Group__1__Impl rule__OperationContext__Group__2 )
            // InternalUSE.g:4264:2: rule__OperationContext__Group__1__Impl rule__OperationContext__Group__2
            {
            pushFollow(FOLLOW_43);
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
    // InternalUSE.g:4271:1: rule__OperationContext__Group__1__Impl : ( ( rule__OperationContext__ClassnameAssignment_1 ) ) ;
    public final void rule__OperationContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4275:1: ( ( ( rule__OperationContext__ClassnameAssignment_1 ) ) )
            // InternalUSE.g:4276:1: ( ( rule__OperationContext__ClassnameAssignment_1 ) )
            {
            // InternalUSE.g:4276:1: ( ( rule__OperationContext__ClassnameAssignment_1 ) )
            // InternalUSE.g:4277:2: ( rule__OperationContext__ClassnameAssignment_1 )
            {
             before(grammarAccess.getOperationContextAccess().getClassnameAssignment_1()); 
            // InternalUSE.g:4278:2: ( rule__OperationContext__ClassnameAssignment_1 )
            // InternalUSE.g:4278:3: rule__OperationContext__ClassnameAssignment_1
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
    // InternalUSE.g:4286:1: rule__OperationContext__Group__2 : rule__OperationContext__Group__2__Impl ;
    public final void rule__OperationContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4290:1: ( rule__OperationContext__Group__2__Impl )
            // InternalUSE.g:4291:2: rule__OperationContext__Group__2__Impl
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
    // InternalUSE.g:4297:1: rule__OperationContext__Group__2__Impl : ( ( rule__OperationContext__ConstrainsAssignment_2 ) ) ;
    public final void rule__OperationContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4301:1: ( ( ( rule__OperationContext__ConstrainsAssignment_2 ) ) )
            // InternalUSE.g:4302:1: ( ( rule__OperationContext__ConstrainsAssignment_2 ) )
            {
            // InternalUSE.g:4302:1: ( ( rule__OperationContext__ConstrainsAssignment_2 ) )
            // InternalUSE.g:4303:2: ( rule__OperationContext__ConstrainsAssignment_2 )
            {
             before(grammarAccess.getOperationContextAccess().getConstrainsAssignment_2()); 
            // InternalUSE.g:4304:2: ( rule__OperationContext__ConstrainsAssignment_2 )
            // InternalUSE.g:4304:3: rule__OperationContext__ConstrainsAssignment_2
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
    // InternalUSE.g:4313:1: rule__OperationConstraints__Group__0 : rule__OperationConstraints__Group__0__Impl rule__OperationConstraints__Group__1 ;
    public final void rule__OperationConstraints__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4317:1: ( rule__OperationConstraints__Group__0__Impl rule__OperationConstraints__Group__1 )
            // InternalUSE.g:4318:2: rule__OperationConstraints__Group__0__Impl rule__OperationConstraints__Group__1
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
    // InternalUSE.g:4325:1: rule__OperationConstraints__Group__0__Impl : ( '::' ) ;
    public final void rule__OperationConstraints__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4329:1: ( ( '::' ) )
            // InternalUSE.g:4330:1: ( '::' )
            {
            // InternalUSE.g:4330:1: ( '::' )
            // InternalUSE.g:4331:2: '::'
            {
             before(grammarAccess.getOperationConstraintsAccess().getColonColonKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalUSE.g:4340:1: rule__OperationConstraints__Group__1 : rule__OperationConstraints__Group__1__Impl rule__OperationConstraints__Group__2 ;
    public final void rule__OperationConstraints__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4344:1: ( rule__OperationConstraints__Group__1__Impl rule__OperationConstraints__Group__2 )
            // InternalUSE.g:4345:2: rule__OperationConstraints__Group__1__Impl rule__OperationConstraints__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalUSE.g:4352:1: rule__OperationConstraints__Group__1__Impl : ( ( rule__OperationConstraints__OperationDeclarationAssignment_1 ) ) ;
    public final void rule__OperationConstraints__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4356:1: ( ( ( rule__OperationConstraints__OperationDeclarationAssignment_1 ) ) )
            // InternalUSE.g:4357:1: ( ( rule__OperationConstraints__OperationDeclarationAssignment_1 ) )
            {
            // InternalUSE.g:4357:1: ( ( rule__OperationConstraints__OperationDeclarationAssignment_1 ) )
            // InternalUSE.g:4358:2: ( rule__OperationConstraints__OperationDeclarationAssignment_1 )
            {
             before(grammarAccess.getOperationConstraintsAccess().getOperationDeclarationAssignment_1()); 
            // InternalUSE.g:4359:2: ( rule__OperationConstraints__OperationDeclarationAssignment_1 )
            // InternalUSE.g:4359:3: rule__OperationConstraints__OperationDeclarationAssignment_1
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
    // InternalUSE.g:4367:1: rule__OperationConstraints__Group__2 : rule__OperationConstraints__Group__2__Impl ;
    public final void rule__OperationConstraints__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4371:1: ( rule__OperationConstraints__Group__2__Impl )
            // InternalUSE.g:4372:2: rule__OperationConstraints__Group__2__Impl
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
    // InternalUSE.g:4378:1: rule__OperationConstraints__Group__2__Impl : ( ( ( rule__OperationConstraints__ConditionsAssignment_2 ) ) ( ( rule__OperationConstraints__ConditionsAssignment_2 )* ) ) ;
    public final void rule__OperationConstraints__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4382:1: ( ( ( ( rule__OperationConstraints__ConditionsAssignment_2 ) ) ( ( rule__OperationConstraints__ConditionsAssignment_2 )* ) ) )
            // InternalUSE.g:4383:1: ( ( ( rule__OperationConstraints__ConditionsAssignment_2 ) ) ( ( rule__OperationConstraints__ConditionsAssignment_2 )* ) )
            {
            // InternalUSE.g:4383:1: ( ( ( rule__OperationConstraints__ConditionsAssignment_2 ) ) ( ( rule__OperationConstraints__ConditionsAssignment_2 )* ) )
            // InternalUSE.g:4384:2: ( ( rule__OperationConstraints__ConditionsAssignment_2 ) ) ( ( rule__OperationConstraints__ConditionsAssignment_2 )* )
            {
            // InternalUSE.g:4384:2: ( ( rule__OperationConstraints__ConditionsAssignment_2 ) )
            // InternalUSE.g:4385:3: ( rule__OperationConstraints__ConditionsAssignment_2 )
            {
             before(grammarAccess.getOperationConstraintsAccess().getConditionsAssignment_2()); 
            // InternalUSE.g:4386:3: ( rule__OperationConstraints__ConditionsAssignment_2 )
            // InternalUSE.g:4386:4: rule__OperationConstraints__ConditionsAssignment_2
            {
            pushFollow(FOLLOW_34);
            rule__OperationConstraints__ConditionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOperationConstraintsAccess().getConditionsAssignment_2()); 

            }

            // InternalUSE.g:4389:2: ( ( rule__OperationConstraints__ConditionsAssignment_2 )* )
            // InternalUSE.g:4390:3: ( rule__OperationConstraints__ConditionsAssignment_2 )*
            {
             before(grammarAccess.getOperationConstraintsAccess().getConditionsAssignment_2()); 
            // InternalUSE.g:4391:3: ( rule__OperationConstraints__ConditionsAssignment_2 )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=57 && LA58_0<=58)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalUSE.g:4391:4: rule__OperationConstraints__ConditionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__OperationConstraints__ConditionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop58;
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
    // InternalUSE.g:4401:1: rule__Precondition__Group__0 : rule__Precondition__Group__0__Impl rule__Precondition__Group__1 ;
    public final void rule__Precondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4405:1: ( rule__Precondition__Group__0__Impl rule__Precondition__Group__1 )
            // InternalUSE.g:4406:2: rule__Precondition__Group__0__Impl rule__Precondition__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalUSE.g:4413:1: rule__Precondition__Group__0__Impl : ( 'pre' ) ;
    public final void rule__Precondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4417:1: ( ( 'pre' ) )
            // InternalUSE.g:4418:1: ( 'pre' )
            {
            // InternalUSE.g:4418:1: ( 'pre' )
            // InternalUSE.g:4419:2: 'pre'
            {
             before(grammarAccess.getPreconditionAccess().getPreKeyword_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalUSE.g:4428:1: rule__Precondition__Group__1 : rule__Precondition__Group__1__Impl rule__Precondition__Group__2 ;
    public final void rule__Precondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4432:1: ( rule__Precondition__Group__1__Impl rule__Precondition__Group__2 )
            // InternalUSE.g:4433:2: rule__Precondition__Group__1__Impl rule__Precondition__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalUSE.g:4440:1: rule__Precondition__Group__1__Impl : ( ( rule__Precondition__NameAssignment_1 )? ) ;
    public final void rule__Precondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4444:1: ( ( ( rule__Precondition__NameAssignment_1 )? ) )
            // InternalUSE.g:4445:1: ( ( rule__Precondition__NameAssignment_1 )? )
            {
            // InternalUSE.g:4445:1: ( ( rule__Precondition__NameAssignment_1 )? )
            // InternalUSE.g:4446:2: ( rule__Precondition__NameAssignment_1 )?
            {
             before(grammarAccess.getPreconditionAccess().getNameAssignment_1()); 
            // InternalUSE.g:4447:2: ( rule__Precondition__NameAssignment_1 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalUSE.g:4447:3: rule__Precondition__NameAssignment_1
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
    // InternalUSE.g:4455:1: rule__Precondition__Group__2 : rule__Precondition__Group__2__Impl rule__Precondition__Group__3 ;
    public final void rule__Precondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4459:1: ( rule__Precondition__Group__2__Impl rule__Precondition__Group__3 )
            // InternalUSE.g:4460:2: rule__Precondition__Group__2__Impl rule__Precondition__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalUSE.g:4467:1: rule__Precondition__Group__2__Impl : ( ':' ) ;
    public final void rule__Precondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4471:1: ( ( ':' ) )
            // InternalUSE.g:4472:1: ( ':' )
            {
            // InternalUSE.g:4472:1: ( ':' )
            // InternalUSE.g:4473:2: ':'
            {
             before(grammarAccess.getPreconditionAccess().getColonKeyword_2()); 
            match(input,49,FOLLOW_2); 
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
    // InternalUSE.g:4482:1: rule__Precondition__Group__3 : rule__Precondition__Group__3__Impl ;
    public final void rule__Precondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4486:1: ( rule__Precondition__Group__3__Impl )
            // InternalUSE.g:4487:2: rule__Precondition__Group__3__Impl
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
    // InternalUSE.g:4493:1: rule__Precondition__Group__3__Impl : ( ( rule__Precondition__OclexpressionAssignment_3 ) ) ;
    public final void rule__Precondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4497:1: ( ( ( rule__Precondition__OclexpressionAssignment_3 ) ) )
            // InternalUSE.g:4498:1: ( ( rule__Precondition__OclexpressionAssignment_3 ) )
            {
            // InternalUSE.g:4498:1: ( ( rule__Precondition__OclexpressionAssignment_3 ) )
            // InternalUSE.g:4499:2: ( rule__Precondition__OclexpressionAssignment_3 )
            {
             before(grammarAccess.getPreconditionAccess().getOclexpressionAssignment_3()); 
            // InternalUSE.g:4500:2: ( rule__Precondition__OclexpressionAssignment_3 )
            // InternalUSE.g:4500:3: rule__Precondition__OclexpressionAssignment_3
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
    // InternalUSE.g:4509:1: rule__Postcondition__Group__0 : rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1 ;
    public final void rule__Postcondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4513:1: ( rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1 )
            // InternalUSE.g:4514:2: rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalUSE.g:4521:1: rule__Postcondition__Group__0__Impl : ( 'post' ) ;
    public final void rule__Postcondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4525:1: ( ( 'post' ) )
            // InternalUSE.g:4526:1: ( 'post' )
            {
            // InternalUSE.g:4526:1: ( 'post' )
            // InternalUSE.g:4527:2: 'post'
            {
             before(grammarAccess.getPostconditionAccess().getPostKeyword_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalUSE.g:4536:1: rule__Postcondition__Group__1 : rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2 ;
    public final void rule__Postcondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4540:1: ( rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2 )
            // InternalUSE.g:4541:2: rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalUSE.g:4548:1: rule__Postcondition__Group__1__Impl : ( ( rule__Postcondition__NameAssignment_1 )? ) ;
    public final void rule__Postcondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4552:1: ( ( ( rule__Postcondition__NameAssignment_1 )? ) )
            // InternalUSE.g:4553:1: ( ( rule__Postcondition__NameAssignment_1 )? )
            {
            // InternalUSE.g:4553:1: ( ( rule__Postcondition__NameAssignment_1 )? )
            // InternalUSE.g:4554:2: ( rule__Postcondition__NameAssignment_1 )?
            {
             before(grammarAccess.getPostconditionAccess().getNameAssignment_1()); 
            // InternalUSE.g:4555:2: ( rule__Postcondition__NameAssignment_1 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalUSE.g:4555:3: rule__Postcondition__NameAssignment_1
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
    // InternalUSE.g:4563:1: rule__Postcondition__Group__2 : rule__Postcondition__Group__2__Impl rule__Postcondition__Group__3 ;
    public final void rule__Postcondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4567:1: ( rule__Postcondition__Group__2__Impl rule__Postcondition__Group__3 )
            // InternalUSE.g:4568:2: rule__Postcondition__Group__2__Impl rule__Postcondition__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalUSE.g:4575:1: rule__Postcondition__Group__2__Impl : ( ':' ) ;
    public final void rule__Postcondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4579:1: ( ( ':' ) )
            // InternalUSE.g:4580:1: ( ':' )
            {
            // InternalUSE.g:4580:1: ( ':' )
            // InternalUSE.g:4581:2: ':'
            {
             before(grammarAccess.getPostconditionAccess().getColonKeyword_2()); 
            match(input,49,FOLLOW_2); 
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
    // InternalUSE.g:4590:1: rule__Postcondition__Group__3 : rule__Postcondition__Group__3__Impl ;
    public final void rule__Postcondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4594:1: ( rule__Postcondition__Group__3__Impl )
            // InternalUSE.g:4595:2: rule__Postcondition__Group__3__Impl
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
    // InternalUSE.g:4601:1: rule__Postcondition__Group__3__Impl : ( ( rule__Postcondition__OclexpressionAssignment_3 ) ) ;
    public final void rule__Postcondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4605:1: ( ( ( rule__Postcondition__OclexpressionAssignment_3 ) ) )
            // InternalUSE.g:4606:1: ( ( rule__Postcondition__OclexpressionAssignment_3 ) )
            {
            // InternalUSE.g:4606:1: ( ( rule__Postcondition__OclexpressionAssignment_3 ) )
            // InternalUSE.g:4607:2: ( rule__Postcondition__OclexpressionAssignment_3 )
            {
             before(grammarAccess.getPostconditionAccess().getOclexpressionAssignment_3()); 
            // InternalUSE.g:4608:2: ( rule__Postcondition__OclexpressionAssignment_3 )
            // InternalUSE.g:4608:3: rule__Postcondition__OclexpressionAssignment_3
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
    // InternalUSE.g:4617:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4621:1: ( ( RULE_ID ) )
            // InternalUSE.g:4622:2: ( RULE_ID )
            {
            // InternalUSE.g:4622:2: ( RULE_ID )
            // InternalUSE.g:4623:3: RULE_ID
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
    // InternalUSE.g:4632:1: rule__Model__EnumsAssignment_2_0 : ( ruleEnum ) ;
    public final void rule__Model__EnumsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4636:1: ( ( ruleEnum ) )
            // InternalUSE.g:4637:2: ( ruleEnum )
            {
            // InternalUSE.g:4637:2: ( ruleEnum )
            // InternalUSE.g:4638:3: ruleEnum
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
    // InternalUSE.g:4647:1: rule__Model__PackagedElementAssignment_2_1 : ( ruleType ) ;
    public final void rule__Model__PackagedElementAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4651:1: ( ( ruleType ) )
            // InternalUSE.g:4652:2: ( ruleType )
            {
            // InternalUSE.g:4652:2: ( ruleType )
            // InternalUSE.g:4653:3: ruleType
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
    // InternalUSE.g:4662:1: rule__Model__ConstraintsAssignment_2_2 : ( ruleConstrainsGeneral ) ;
    public final void rule__Model__ConstraintsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4666:1: ( ( ruleConstrainsGeneral ) )
            // InternalUSE.g:4667:2: ( ruleConstrainsGeneral )
            {
            // InternalUSE.g:4667:2: ( ruleConstrainsGeneral )
            // InternalUSE.g:4668:3: ruleConstrainsGeneral
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
    // InternalUSE.g:4677:1: rule__Multiplicity__MinValueAssignment_0 : ( ( rule__Multiplicity__MinValueAlternatives_0_0 ) ) ;
    public final void rule__Multiplicity__MinValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4681:1: ( ( ( rule__Multiplicity__MinValueAlternatives_0_0 ) ) )
            // InternalUSE.g:4682:2: ( ( rule__Multiplicity__MinValueAlternatives_0_0 ) )
            {
            // InternalUSE.g:4682:2: ( ( rule__Multiplicity__MinValueAlternatives_0_0 ) )
            // InternalUSE.g:4683:3: ( rule__Multiplicity__MinValueAlternatives_0_0 )
            {
             before(grammarAccess.getMultiplicityAccess().getMinValueAlternatives_0_0()); 
            // InternalUSE.g:4684:3: ( rule__Multiplicity__MinValueAlternatives_0_0 )
            // InternalUSE.g:4684:4: rule__Multiplicity__MinValueAlternatives_0_0
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
    // InternalUSE.g:4692:1: rule__Multiplicity__MaxValueAssignment_1_1 : ( ( rule__Multiplicity__MaxValueAlternatives_1_1_0 ) ) ;
    public final void rule__Multiplicity__MaxValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4696:1: ( ( ( rule__Multiplicity__MaxValueAlternatives_1_1_0 ) ) )
            // InternalUSE.g:4697:2: ( ( rule__Multiplicity__MaxValueAlternatives_1_1_0 ) )
            {
            // InternalUSE.g:4697:2: ( ( rule__Multiplicity__MaxValueAlternatives_1_1_0 ) )
            // InternalUSE.g:4698:3: ( rule__Multiplicity__MaxValueAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultiplicityAccess().getMaxValueAlternatives_1_1_0()); 
            // InternalUSE.g:4699:3: ( rule__Multiplicity__MaxValueAlternatives_1_1_0 )
            // InternalUSE.g:4699:4: rule__Multiplicity__MaxValueAlternatives_1_1_0
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
    // InternalUSE.g:4707:1: rule__Multiplicity__MinValueAssignment_2_1 : ( ( rule__Multiplicity__MinValueAlternatives_2_1_0 ) ) ;
    public final void rule__Multiplicity__MinValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4711:1: ( ( ( rule__Multiplicity__MinValueAlternatives_2_1_0 ) ) )
            // InternalUSE.g:4712:2: ( ( rule__Multiplicity__MinValueAlternatives_2_1_0 ) )
            {
            // InternalUSE.g:4712:2: ( ( rule__Multiplicity__MinValueAlternatives_2_1_0 ) )
            // InternalUSE.g:4713:3: ( rule__Multiplicity__MinValueAlternatives_2_1_0 )
            {
             before(grammarAccess.getMultiplicityAccess().getMinValueAlternatives_2_1_0()); 
            // InternalUSE.g:4714:3: ( rule__Multiplicity__MinValueAlternatives_2_1_0 )
            // InternalUSE.g:4714:4: rule__Multiplicity__MinValueAlternatives_2_1_0
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
    // InternalUSE.g:4722:1: rule__Multiplicity__MaxValueAssignment_2_2_1 : ( ( rule__Multiplicity__MaxValueAlternatives_2_2_1_0 ) ) ;
    public final void rule__Multiplicity__MaxValueAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4726:1: ( ( ( rule__Multiplicity__MaxValueAlternatives_2_2_1_0 ) ) )
            // InternalUSE.g:4727:2: ( ( rule__Multiplicity__MaxValueAlternatives_2_2_1_0 ) )
            {
            // InternalUSE.g:4727:2: ( ( rule__Multiplicity__MaxValueAlternatives_2_2_1_0 ) )
            // InternalUSE.g:4728:3: ( rule__Multiplicity__MaxValueAlternatives_2_2_1_0 )
            {
             before(grammarAccess.getMultiplicityAccess().getMaxValueAlternatives_2_2_1_0()); 
            // InternalUSE.g:4729:3: ( rule__Multiplicity__MaxValueAlternatives_2_2_1_0 )
            // InternalUSE.g:4729:4: rule__Multiplicity__MaxValueAlternatives_2_2_1_0
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


    // $ANTLR start "rule__CollectionType__CollectionAssignment_0"
    // InternalUSE.g:4737:1: rule__CollectionType__CollectionAssignment_0 : ( ( rule__CollectionType__CollectionAlternatives_0_0 ) ) ;
    public final void rule__CollectionType__CollectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4741:1: ( ( ( rule__CollectionType__CollectionAlternatives_0_0 ) ) )
            // InternalUSE.g:4742:2: ( ( rule__CollectionType__CollectionAlternatives_0_0 ) )
            {
            // InternalUSE.g:4742:2: ( ( rule__CollectionType__CollectionAlternatives_0_0 ) )
            // InternalUSE.g:4743:3: ( rule__CollectionType__CollectionAlternatives_0_0 )
            {
             before(grammarAccess.getCollectionTypeAccess().getCollectionAlternatives_0_0()); 
            // InternalUSE.g:4744:3: ( rule__CollectionType__CollectionAlternatives_0_0 )
            // InternalUSE.g:4744:4: rule__CollectionType__CollectionAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__CollectionType__CollectionAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getCollectionTypeAccess().getCollectionAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionType__CollectionAssignment_0"


    // $ANTLR start "rule__CollectionType__TypeAssignment_2"
    // InternalUSE.g:4752:1: rule__CollectionType__TypeAssignment_2 : ( ruleSimpleTypes ) ;
    public final void rule__CollectionType__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4756:1: ( ( ruleSimpleTypes ) )
            // InternalUSE.g:4757:2: ( ruleSimpleTypes )
            {
            // InternalUSE.g:4757:2: ( ruleSimpleTypes )
            // InternalUSE.g:4758:3: ruleSimpleTypes
            {
             before(grammarAccess.getCollectionTypeAccess().getTypeSimpleTypesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleTypes();

            state._fsp--;

             after(grammarAccess.getCollectionTypeAccess().getTypeSimpleTypesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionType__TypeAssignment_2"


    // $ANTLR start "rule__SimpleTypes__DefaultTypeAssignment_0"
    // InternalUSE.g:4767:1: rule__SimpleTypes__DefaultTypeAssignment_0 : ( ruleDefaultType ) ;
    public final void rule__SimpleTypes__DefaultTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4771:1: ( ( ruleDefaultType ) )
            // InternalUSE.g:4772:2: ( ruleDefaultType )
            {
            // InternalUSE.g:4772:2: ( ruleDefaultType )
            // InternalUSE.g:4773:3: ruleDefaultType
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
    // InternalUSE.g:4782:1: rule__SimpleTypes__ReferendedAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SimpleTypes__ReferendedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4786:1: ( ( ( RULE_ID ) ) )
            // InternalUSE.g:4787:2: ( ( RULE_ID ) )
            {
            // InternalUSE.g:4787:2: ( ( RULE_ID ) )
            // InternalUSE.g:4788:3: ( RULE_ID )
            {
             before(grammarAccess.getSimpleTypesAccess().getReferendedAllClassAndEnumCrossReference_1_0()); 
            // InternalUSE.g:4789:3: ( RULE_ID )
            // InternalUSE.g:4790:4: RULE_ID
            {
             before(grammarAccess.getSimpleTypesAccess().getReferendedAllClassAndEnumIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSimpleTypesAccess().getReferendedAllClassAndEnumIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSimpleTypesAccess().getReferendedAllClassAndEnumCrossReference_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Enum__NameAssignment_1"
    // InternalUSE.g:4801:1: rule__Enum__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4805:1: ( ( RULE_ID ) )
            // InternalUSE.g:4806:2: ( RULE_ID )
            {
            // InternalUSE.g:4806:2: ( RULE_ID )
            // InternalUSE.g:4807:3: RULE_ID
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
    // InternalUSE.g:4816:1: rule__Enum__ElementsAssignment_3 : ( ruleEnumElement ) ;
    public final void rule__Enum__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4820:1: ( ( ruleEnumElement ) )
            // InternalUSE.g:4821:2: ( ruleEnumElement )
            {
            // InternalUSE.g:4821:2: ( ruleEnumElement )
            // InternalUSE.g:4822:3: ruleEnumElement
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
    // InternalUSE.g:4831:1: rule__Class__AbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__Class__AbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4835:1: ( ( ( 'abstract' ) ) )
            // InternalUSE.g:4836:2: ( ( 'abstract' ) )
            {
            // InternalUSE.g:4836:2: ( ( 'abstract' ) )
            // InternalUSE.g:4837:3: ( 'abstract' )
            {
             before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_0_0()); 
            // InternalUSE.g:4838:3: ( 'abstract' )
            // InternalUSE.g:4839:4: 'abstract'
            {
             before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_0_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalUSE.g:4850:1: rule__Class__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4854:1: ( ( RULE_ID ) )
            // InternalUSE.g:4855:2: ( RULE_ID )
            {
            // InternalUSE.g:4855:2: ( RULE_ID )
            // InternalUSE.g:4856:3: RULE_ID
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
    // InternalUSE.g:4865:1: rule__Class__GeneralizationAssignment_3_1 : ( ruleGeneralization ) ;
    public final void rule__Class__GeneralizationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4869:1: ( ( ruleGeneralization ) )
            // InternalUSE.g:4870:2: ( ruleGeneralization )
            {
            // InternalUSE.g:4870:2: ( ruleGeneralization )
            // InternalUSE.g:4871:3: ruleGeneralization
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
    // InternalUSE.g:4880:1: rule__Class__AttributesAssignment_4 : ( ruleAttributesBase ) ;
    public final void rule__Class__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4884:1: ( ( ruleAttributesBase ) )
            // InternalUSE.g:4885:2: ( ruleAttributesBase )
            {
            // InternalUSE.g:4885:2: ( ruleAttributesBase )
            // InternalUSE.g:4886:3: ruleAttributesBase
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
    // InternalUSE.g:4895:1: rule__Class__OperationsAssignment_5 : ( ruleOperationsBase ) ;
    public final void rule__Class__OperationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4899:1: ( ( ruleOperationsBase ) )
            // InternalUSE.g:4900:2: ( ruleOperationsBase )
            {
            // InternalUSE.g:4900:2: ( ruleOperationsBase )
            // InternalUSE.g:4901:3: ruleOperationsBase
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
    // InternalUSE.g:4910:1: rule__Class__ConstraintsAssignment_6 : ( ruleConstraintsBase ) ;
    public final void rule__Class__ConstraintsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4914:1: ( ( ruleConstraintsBase ) )
            // InternalUSE.g:4915:2: ( ruleConstraintsBase )
            {
            // InternalUSE.g:4915:2: ( ruleConstraintsBase )
            // InternalUSE.g:4916:3: ruleConstraintsBase
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
    // InternalUSE.g:4925:1: rule__Generalization__GeneralAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Generalization__GeneralAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4929:1: ( ( ( RULE_ID ) ) )
            // InternalUSE.g:4930:2: ( ( RULE_ID ) )
            {
            // InternalUSE.g:4930:2: ( ( RULE_ID ) )
            // InternalUSE.g:4931:3: ( RULE_ID )
            {
             before(grammarAccess.getGeneralizationAccess().getGeneralAllClassCrossReference_0_0()); 
            // InternalUSE.g:4932:3: ( RULE_ID )
            // InternalUSE.g:4933:4: RULE_ID
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


    // $ANTLR start "rule__Association__TypeAssociationAssignment_0"
    // InternalUSE.g:4944:1: rule__Association__TypeAssociationAssignment_0 : ( ( rule__Association__TypeAssociationAlternatives_0_0 ) ) ;
    public final void rule__Association__TypeAssociationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4948:1: ( ( ( rule__Association__TypeAssociationAlternatives_0_0 ) ) )
            // InternalUSE.g:4949:2: ( ( rule__Association__TypeAssociationAlternatives_0_0 ) )
            {
            // InternalUSE.g:4949:2: ( ( rule__Association__TypeAssociationAlternatives_0_0 ) )
            // InternalUSE.g:4950:3: ( rule__Association__TypeAssociationAlternatives_0_0 )
            {
             before(grammarAccess.getAssociationAccess().getTypeAssociationAlternatives_0_0()); 
            // InternalUSE.g:4951:3: ( rule__Association__TypeAssociationAlternatives_0_0 )
            // InternalUSE.g:4951:4: rule__Association__TypeAssociationAlternatives_0_0
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
    // InternalUSE.g:4959:1: rule__Association__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Association__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4963:1: ( ( RULE_ID ) )
            // InternalUSE.g:4964:2: ( RULE_ID )
            {
            // InternalUSE.g:4964:2: ( RULE_ID )
            // InternalUSE.g:4965:3: RULE_ID
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
    // InternalUSE.g:4974:1: rule__Association__AssociationEndsAssignment_3 : ( ruleAssociationEnd ) ;
    public final void rule__Association__AssociationEndsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4978:1: ( ( ruleAssociationEnd ) )
            // InternalUSE.g:4979:2: ( ruleAssociationEnd )
            {
            // InternalUSE.g:4979:2: ( ruleAssociationEnd )
            // InternalUSE.g:4980:3: ruleAssociationEnd
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
    // InternalUSE.g:4989:1: rule__AssociationEnd__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AssociationEnd__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:4993:1: ( ( ( RULE_ID ) ) )
            // InternalUSE.g:4994:2: ( ( RULE_ID ) )
            {
            // InternalUSE.g:4994:2: ( ( RULE_ID ) )
            // InternalUSE.g:4995:3: ( RULE_ID )
            {
             before(grammarAccess.getAssociationEndAccess().getTypeAllClassCrossReference_0_0()); 
            // InternalUSE.g:4996:3: ( RULE_ID )
            // InternalUSE.g:4997:4: RULE_ID
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
    // InternalUSE.g:5008:1: rule__AssociationEnd__MulAssignment_2 : ( ruleMultiplicity ) ;
    public final void rule__AssociationEnd__MulAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5012:1: ( ( ruleMultiplicity ) )
            // InternalUSE.g:5013:2: ( ruleMultiplicity )
            {
            // InternalUSE.g:5013:2: ( ruleMultiplicity )
            // InternalUSE.g:5014:3: ruleMultiplicity
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
    // InternalUSE.g:5023:1: rule__AssociationEnd__RoleAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__AssociationEnd__RoleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5027:1: ( ( RULE_ID ) )
            // InternalUSE.g:5028:2: ( RULE_ID )
            {
            // InternalUSE.g:5028:2: ( RULE_ID )
            // InternalUSE.g:5029:3: RULE_ID
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
    // InternalUSE.g:5038:1: rule__AssociationEnd__OrderedAssignment_5 : ( ( 'ordered' ) ) ;
    public final void rule__AssociationEnd__OrderedAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5042:1: ( ( ( 'ordered' ) ) )
            // InternalUSE.g:5043:2: ( ( 'ordered' ) )
            {
            // InternalUSE.g:5043:2: ( ( 'ordered' ) )
            // InternalUSE.g:5044:3: ( 'ordered' )
            {
             before(grammarAccess.getAssociationEndAccess().getOrderedOrderedKeyword_5_0()); 
            // InternalUSE.g:5045:3: ( 'ordered' )
            // InternalUSE.g:5046:4: 'ordered'
            {
             before(grammarAccess.getAssociationEndAccess().getOrderedOrderedKeyword_5_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalUSE.g:5057:1: rule__AssociationClass__AbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__AssociationClass__AbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5061:1: ( ( ( 'abstract' ) ) )
            // InternalUSE.g:5062:2: ( ( 'abstract' ) )
            {
            // InternalUSE.g:5062:2: ( ( 'abstract' ) )
            // InternalUSE.g:5063:3: ( 'abstract' )
            {
             before(grammarAccess.getAssociationClassAccess().getAbstractAbstractKeyword_0_0()); 
            // InternalUSE.g:5064:3: ( 'abstract' )
            // InternalUSE.g:5065:4: 'abstract'
            {
             before(grammarAccess.getAssociationClassAccess().getAbstractAbstractKeyword_0_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalUSE.g:5076:1: rule__AssociationClass__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__AssociationClass__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5080:1: ( ( RULE_ID ) )
            // InternalUSE.g:5081:2: ( RULE_ID )
            {
            // InternalUSE.g:5081:2: ( RULE_ID )
            // InternalUSE.g:5082:3: RULE_ID
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
    // InternalUSE.g:5091:1: rule__AssociationClass__GeneralizationAssignment_3_1 : ( ruleGeneralization ) ;
    public final void rule__AssociationClass__GeneralizationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5095:1: ( ( ruleGeneralization ) )
            // InternalUSE.g:5096:2: ( ruleGeneralization )
            {
            // InternalUSE.g:5096:2: ( ruleGeneralization )
            // InternalUSE.g:5097:3: ruleGeneralization
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
    // InternalUSE.g:5106:1: rule__AssociationClass__AssociationEndsAssignment_5 : ( ruleAssociationEnd ) ;
    public final void rule__AssociationClass__AssociationEndsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5110:1: ( ( ruleAssociationEnd ) )
            // InternalUSE.g:5111:2: ( ruleAssociationEnd )
            {
            // InternalUSE.g:5111:2: ( ruleAssociationEnd )
            // InternalUSE.g:5112:3: ruleAssociationEnd
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
    // InternalUSE.g:5121:1: rule__AssociationClass__AttributesAssignment_6 : ( ruleAttributesBase ) ;
    public final void rule__AssociationClass__AttributesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5125:1: ( ( ruleAttributesBase ) )
            // InternalUSE.g:5126:2: ( ruleAttributesBase )
            {
            // InternalUSE.g:5126:2: ( ruleAttributesBase )
            // InternalUSE.g:5127:3: ruleAttributesBase
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
    // InternalUSE.g:5136:1: rule__AssociationClass__OperationsAssignment_7 : ( ruleOperationsBase ) ;
    public final void rule__AssociationClass__OperationsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5140:1: ( ( ruleOperationsBase ) )
            // InternalUSE.g:5141:2: ( ruleOperationsBase )
            {
            // InternalUSE.g:5141:2: ( ruleOperationsBase )
            // InternalUSE.g:5142:3: ruleOperationsBase
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
    // InternalUSE.g:5151:1: rule__AssociationClass__ConstraintsAssignment_8 : ( ruleConstraintsBase ) ;
    public final void rule__AssociationClass__ConstraintsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5155:1: ( ( ruleConstraintsBase ) )
            // InternalUSE.g:5156:2: ( ruleConstraintsBase )
            {
            // InternalUSE.g:5156:2: ( ruleConstraintsBase )
            // InternalUSE.g:5157:3: ruleConstraintsBase
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
    // InternalUSE.g:5166:1: rule__AttributesBase__AttributesAssignment_1 : ( ruleAttribute ) ;
    public final void rule__AttributesBase__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5170:1: ( ( ruleAttribute ) )
            // InternalUSE.g:5171:2: ( ruleAttribute )
            {
            // InternalUSE.g:5171:2: ( ruleAttribute )
            // InternalUSE.g:5172:3: ruleAttribute
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
    // InternalUSE.g:5181:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5185:1: ( ( RULE_ID ) )
            // InternalUSE.g:5186:2: ( RULE_ID )
            {
            // InternalUSE.g:5186:2: ( RULE_ID )
            // InternalUSE.g:5187:3: RULE_ID
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
    // InternalUSE.g:5196:1: rule__Attribute__TypeAssignment_2 : ( ruleAllTypes ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5200:1: ( ( ruleAllTypes ) )
            // InternalUSE.g:5201:2: ( ruleAllTypes )
            {
            // InternalUSE.g:5201:2: ( ruleAllTypes )
            // InternalUSE.g:5202:3: ruleAllTypes
            {
             before(grammarAccess.getAttributeAccess().getTypeAllTypesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAllTypes();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeAllTypesParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalUSE.g:5211:1: rule__OperationsBase__OperationsAssignment_1 : ( ruleOperationType ) ;
    public final void rule__OperationsBase__OperationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5215:1: ( ( ruleOperationType ) )
            // InternalUSE.g:5216:2: ( ruleOperationType )
            {
            // InternalUSE.g:5216:2: ( ruleOperationType )
            // InternalUSE.g:5217:3: ruleOperationType
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
    // InternalUSE.g:5226:1: rule__OperationQuery__OperationDeclarationAssignment_0 : ( ruleOperationDeclaration ) ;
    public final void rule__OperationQuery__OperationDeclarationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5230:1: ( ( ruleOperationDeclaration ) )
            // InternalUSE.g:5231:2: ( ruleOperationDeclaration )
            {
            // InternalUSE.g:5231:2: ( ruleOperationDeclaration )
            // InternalUSE.g:5232:3: ruleOperationDeclaration
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
    // InternalUSE.g:5241:1: rule__OperationQuery__OperationbodyAssignment_2 : ( ruleOCLExpression ) ;
    public final void rule__OperationQuery__OperationbodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5245:1: ( ( ruleOCLExpression ) )
            // InternalUSE.g:5246:2: ( ruleOCLExpression )
            {
            // InternalUSE.g:5246:2: ( ruleOCLExpression )
            // InternalUSE.g:5247:3: ruleOCLExpression
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
    // InternalUSE.g:5256:1: rule__OperationQuery__ConditionsAssignment_3 : ( ruleConditionType ) ;
    public final void rule__OperationQuery__ConditionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5260:1: ( ( ruleConditionType ) )
            // InternalUSE.g:5261:2: ( ruleConditionType )
            {
            // InternalUSE.g:5261:2: ( ruleConditionType )
            // InternalUSE.g:5262:3: ruleConditionType
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
    // InternalUSE.g:5271:1: rule__OperationComplex__OperationDeclarationAssignment_0 : ( ruleOperationDeclaration ) ;
    public final void rule__OperationComplex__OperationDeclarationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5275:1: ( ( ruleOperationDeclaration ) )
            // InternalUSE.g:5276:2: ( ruleOperationDeclaration )
            {
            // InternalUSE.g:5276:2: ( ruleOperationDeclaration )
            // InternalUSE.g:5277:3: ruleOperationDeclaration
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
    // InternalUSE.g:5286:1: rule__OperationComplex__OperationbodyAssignment_1_1 : ( ruleOCLExpression ) ;
    public final void rule__OperationComplex__OperationbodyAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5290:1: ( ( ruleOCLExpression ) )
            // InternalUSE.g:5291:2: ( ruleOCLExpression )
            {
            // InternalUSE.g:5291:2: ( ruleOCLExpression )
            // InternalUSE.g:5292:3: ruleOCLExpression
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
    // InternalUSE.g:5301:1: rule__OperationComplex__ConditionsAssignment_2 : ( ruleConditionType ) ;
    public final void rule__OperationComplex__ConditionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5305:1: ( ( ruleConditionType ) )
            // InternalUSE.g:5306:2: ( ruleConditionType )
            {
            // InternalUSE.g:5306:2: ( ruleConditionType )
            // InternalUSE.g:5307:3: ruleConditionType
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
    // InternalUSE.g:5316:1: rule__OperationDeclaration__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__OperationDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5320:1: ( ( RULE_ID ) )
            // InternalUSE.g:5321:2: ( RULE_ID )
            {
            // InternalUSE.g:5321:2: ( RULE_ID )
            // InternalUSE.g:5322:3: RULE_ID
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
    // InternalUSE.g:5331:1: rule__OperationDeclaration__ParametersAssignment_2 : ( ruleParameter ) ;
    public final void rule__OperationDeclaration__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5335:1: ( ( ruleParameter ) )
            // InternalUSE.g:5336:2: ( ruleParameter )
            {
            // InternalUSE.g:5336:2: ( ruleParameter )
            // InternalUSE.g:5337:3: ruleParameter
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
    // InternalUSE.g:5346:1: rule__OperationDeclaration__ReturnTypeAssignment_4_1 : ( ruleAllTypes ) ;
    public final void rule__OperationDeclaration__ReturnTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5350:1: ( ( ruleAllTypes ) )
            // InternalUSE.g:5351:2: ( ruleAllTypes )
            {
            // InternalUSE.g:5351:2: ( ruleAllTypes )
            // InternalUSE.g:5352:3: ruleAllTypes
            {
             before(grammarAccess.getOperationDeclarationAccess().getReturnTypeAllTypesParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAllTypes();

            state._fsp--;

             after(grammarAccess.getOperationDeclarationAccess().getReturnTypeAllTypesParserRuleCall_4_1_0()); 

            }


            }

        }
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
    // InternalUSE.g:5361:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5365:1: ( ( RULE_ID ) )
            // InternalUSE.g:5366:2: ( RULE_ID )
            {
            // InternalUSE.g:5366:2: ( RULE_ID )
            // InternalUSE.g:5367:3: RULE_ID
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
    // InternalUSE.g:5376:1: rule__Parameter__TypeAssignment_2 : ( ruleAllTypes ) ;
    public final void rule__Parameter__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5380:1: ( ( ruleAllTypes ) )
            // InternalUSE.g:5381:2: ( ruleAllTypes )
            {
            // InternalUSE.g:5381:2: ( ruleAllTypes )
            // InternalUSE.g:5382:3: ruleAllTypes
            {
             before(grammarAccess.getParameterAccess().getTypeAllTypesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAllTypes();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeAllTypesParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalUSE.g:5391:1: rule__ConstraintsBase__InvariantsAssignment_1 : ( ruleInvariantDefinition ) ;
    public final void rule__ConstraintsBase__InvariantsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5395:1: ( ( ruleInvariantDefinition ) )
            // InternalUSE.g:5396:2: ( ruleInvariantDefinition )
            {
            // InternalUSE.g:5396:2: ( ruleInvariantDefinition )
            // InternalUSE.g:5397:3: ruleInvariantDefinition
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
    // InternalUSE.g:5406:1: rule__ConstrainsGeneral__ContextsAssignment_1 : ( ruleContextsType ) ;
    public final void rule__ConstrainsGeneral__ContextsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5410:1: ( ( ruleContextsType ) )
            // InternalUSE.g:5411:2: ( ruleContextsType )
            {
            // InternalUSE.g:5411:2: ( ruleContextsType )
            // InternalUSE.g:5412:3: ruleContextsType
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
    // InternalUSE.g:5421:1: rule__InvariantContext__VariablenameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__InvariantContext__VariablenameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5425:1: ( ( RULE_ID ) )
            // InternalUSE.g:5426:2: ( RULE_ID )
            {
            // InternalUSE.g:5426:2: ( RULE_ID )
            // InternalUSE.g:5427:3: RULE_ID
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
    // InternalUSE.g:5436:1: rule__InvariantContext__ClassnameAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__InvariantContext__ClassnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5440:1: ( ( ( RULE_ID ) ) )
            // InternalUSE.g:5441:2: ( ( RULE_ID ) )
            {
            // InternalUSE.g:5441:2: ( ( RULE_ID ) )
            // InternalUSE.g:5442:3: ( RULE_ID )
            {
             before(grammarAccess.getInvariantContextAccess().getClassnameAllClassCrossReference_2_0()); 
            // InternalUSE.g:5443:3: ( RULE_ID )
            // InternalUSE.g:5444:4: RULE_ID
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
    // InternalUSE.g:5455:1: rule__InvariantContext__InvariantsAssignment_3 : ( ruleInvariantDefinition ) ;
    public final void rule__InvariantContext__InvariantsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5459:1: ( ( ruleInvariantDefinition ) )
            // InternalUSE.g:5460:2: ( ruleInvariantDefinition )
            {
            // InternalUSE.g:5460:2: ( ruleInvariantDefinition )
            // InternalUSE.g:5461:3: ruleInvariantDefinition
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
    // InternalUSE.g:5470:1: rule__InvariantDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InvariantDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5474:1: ( ( RULE_ID ) )
            // InternalUSE.g:5475:2: ( RULE_ID )
            {
            // InternalUSE.g:5475:2: ( RULE_ID )
            // InternalUSE.g:5476:3: RULE_ID
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
    // InternalUSE.g:5485:1: rule__InvariantDefinition__OclexpressionAssignment_3 : ( ruleOCLExpression ) ;
    public final void rule__InvariantDefinition__OclexpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5489:1: ( ( ruleOCLExpression ) )
            // InternalUSE.g:5490:2: ( ruleOCLExpression )
            {
            // InternalUSE.g:5490:2: ( ruleOCLExpression )
            // InternalUSE.g:5491:3: ruleOCLExpression
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
    // InternalUSE.g:5500:1: rule__OperationContext__ClassnameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__OperationContext__ClassnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5504:1: ( ( ( RULE_ID ) ) )
            // InternalUSE.g:5505:2: ( ( RULE_ID ) )
            {
            // InternalUSE.g:5505:2: ( ( RULE_ID ) )
            // InternalUSE.g:5506:3: ( RULE_ID )
            {
             before(grammarAccess.getOperationContextAccess().getClassnameAllClassCrossReference_1_0()); 
            // InternalUSE.g:5507:3: ( RULE_ID )
            // InternalUSE.g:5508:4: RULE_ID
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
    // InternalUSE.g:5519:1: rule__OperationContext__ConstrainsAssignment_2 : ( ruleOperationConstraints ) ;
    public final void rule__OperationContext__ConstrainsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5523:1: ( ( ruleOperationConstraints ) )
            // InternalUSE.g:5524:2: ( ruleOperationConstraints )
            {
            // InternalUSE.g:5524:2: ( ruleOperationConstraints )
            // InternalUSE.g:5525:3: ruleOperationConstraints
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
    // InternalUSE.g:5534:1: rule__OperationConstraints__OperationDeclarationAssignment_1 : ( ruleOperationDeclaration ) ;
    public final void rule__OperationConstraints__OperationDeclarationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5538:1: ( ( ruleOperationDeclaration ) )
            // InternalUSE.g:5539:2: ( ruleOperationDeclaration )
            {
            // InternalUSE.g:5539:2: ( ruleOperationDeclaration )
            // InternalUSE.g:5540:3: ruleOperationDeclaration
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
    // InternalUSE.g:5549:1: rule__OperationConstraints__ConditionsAssignment_2 : ( ruleConditionType ) ;
    public final void rule__OperationConstraints__ConditionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5553:1: ( ( ruleConditionType ) )
            // InternalUSE.g:5554:2: ( ruleConditionType )
            {
            // InternalUSE.g:5554:2: ( ruleConditionType )
            // InternalUSE.g:5555:3: ruleConditionType
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
    // InternalUSE.g:5564:1: rule__Precondition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Precondition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5568:1: ( ( RULE_ID ) )
            // InternalUSE.g:5569:2: ( RULE_ID )
            {
            // InternalUSE.g:5569:2: ( RULE_ID )
            // InternalUSE.g:5570:3: RULE_ID
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
    // InternalUSE.g:5579:1: rule__Precondition__OclexpressionAssignment_3 : ( ruleOCLExpression ) ;
    public final void rule__Precondition__OclexpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5583:1: ( ( ruleOCLExpression ) )
            // InternalUSE.g:5584:2: ( ruleOCLExpression )
            {
            // InternalUSE.g:5584:2: ( ruleOCLExpression )
            // InternalUSE.g:5585:3: ruleOCLExpression
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
    // InternalUSE.g:5594:1: rule__Postcondition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Postcondition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5598:1: ( ( RULE_ID ) )
            // InternalUSE.g:5599:2: ( RULE_ID )
            {
            // InternalUSE.g:5599:2: ( RULE_ID )
            // InternalUSE.g:5600:3: RULE_ID
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
    // InternalUSE.g:5609:1: rule__Postcondition__OclexpressionAssignment_3 : ( ruleOCLExpression ) ;
    public final void rule__Postcondition__OclexpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUSE.g:5613:1: ( ( ruleOCLExpression ) )
            // InternalUSE.g:5614:2: ( ruleOCLExpression )
            {
            // InternalUSE.g:5614:2: ( ruleOCLExpression )
            // InternalUSE.g:5615:3: ruleOCLExpression
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


    protected DFA14 dfa14 = new DFA14(this);
    static final String dfa_1s = "\50\uffff";
    static final String dfa_2s = "\4\uffff\1\10\17\uffff\5\10\16\uffff\1\10";
    static final String dfa_3s = "\1\5\1\43\1\5\1\61\3\5\2\uffff\3\43\5\5\3\43\24\5";
    static final String dfa_4s = "\1\5\1\43\1\44\1\61\1\72\2\34\2\uffff\3\43\5\44\3\43\5\72\16\44\1\72";
    static final String dfa_5s = "\7\uffff\1\2\1\1\37\uffff";
    static final String dfa_6s = "\50\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2",
            "\1\3\36\uffff\1\4",
            "\1\5",
            "\1\10\43\uffff\1\10\7\uffff\1\6\1\uffff\1\7\2\10\3\uffff\2\10",
            "\1\20\20\uffff\1\14\1\15\1\16\1\17\1\11\1\12\1\13",
            "\1\30\20\uffff\1\24\1\25\1\26\1\27\1\21\1\22\1\23",
            "",
            "",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\3\34\uffff\1\32\1\uffff\1\4",
            "\1\3\34\uffff\1\32\1\uffff\1\4",
            "\1\3\34\uffff\1\32\1\uffff\1\4",
            "\1\3\34\uffff\1\32\1\uffff\1\4",
            "\1\3\34\uffff\1\32\1\uffff\1\4",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\10\43\uffff\1\10\11\uffff\1\7\2\10\3\uffff\2\10",
            "\1\10\43\uffff\1\10\11\uffff\1\7\2\10\3\uffff\2\10",
            "\1\10\43\uffff\1\10\11\uffff\1\7\2\10\3\uffff\2\10",
            "\1\10\43\uffff\1\10\11\uffff\1\7\2\10\3\uffff\2\10",
            "\1\10\43\uffff\1\10\11\uffff\1\7\2\10\3\uffff\2\10",
            "\1\40\20\uffff\1\34\1\35\1\36\1\37\12\uffff\1\41",
            "\1\3\36\uffff\1\4",
            "\1\46\20\uffff\1\42\1\43\1\44\1\45\12\uffff\1\47",
            "\1\40\20\uffff\1\34\1\35\1\36\1\37\12\uffff\1\41",
            "\1\40\20\uffff\1\34\1\35\1\36\1\37\12\uffff\1\41",
            "\1\40\20\uffff\1\34\1\35\1\36\1\37\12\uffff\1\41",
            "\1\40\20\uffff\1\34\1\35\1\36\1\37\12\uffff\1\41",
            "\1\40\20\uffff\1\34\1\35\1\36\1\37\12\uffff\1\41",
            "\1\3\34\uffff\1\32\1\uffff\1\4",
            "\1\46\20\uffff\1\42\1\43\1\44\1\45\12\uffff\1\47",
            "\1\46\20\uffff\1\42\1\43\1\44\1\45\12\uffff\1\47",
            "\1\46\20\uffff\1\42\1\43\1\44\1\45\12\uffff\1\47",
            "\1\46\20\uffff\1\42\1\43\1\44\1\45\12\uffff\1\47",
            "\1\46\20\uffff\1\42\1\43\1\44\1\45\12\uffff\1\47",
            "\1\10\43\uffff\1\10\11\uffff\1\7\2\10\3\uffff\2\10"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1272:1: rule__OperationType__Alternatives : ( ( ruleOperationComplex ) | ( ruleOperationQuery ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000003FF002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x08208120E0000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x08008100E0000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000003FF800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001003C00020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003C00022L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000004000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0800010000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0025060000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x1000400000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x08008100E0000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0025020000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000001FC00020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0610000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000000020L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0002000000000020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0100000000000000L});

}