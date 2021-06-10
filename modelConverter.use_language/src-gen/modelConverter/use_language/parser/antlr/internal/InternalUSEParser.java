package modelConverter.use_language.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import modelConverter.use_language.services.USEGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalUSEParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'*'", "'..'", "','", "'Integer'", "'String'", "'Real'", "'Boolean'", "'Set'", "'Bag'", "'Sequence'", "'('", "')'", "'enum'", "'{'", "'}'", "'abstract'", "'class'", "'<'", "'end'", "'association'", "'aggregation'", "'composition'", "'between'", "'['", "']'", "'role'", "'ordered'", "'associationclass'", "'attributes'", "':'", "'init'", "'derive'", "'derived'", "'operations'", "'='", "';'", "'begin'", "'statemachines'", "'psm'", "'states'", "'transitions'", "'initial'", "'final'", "'->'", "'constraints'", "'context'", "'inv'", "'::'", "'pre'", "'post'", "'UnlimitedNatural'", "'OclAny'", "'OclInvalid'", "'OclVoid'", "'Collection'", "'OrderedSet'", "'Map'", "'Tuple'", "'/'", "'+'", "'-'", "'>'", "'>='", "'<='", "':='", "'<>'", "'and'", "'and2'", "'implies'", "'implies2'", "'or'", "'or2'", "'xor'", "'xor2'", "'.'", "'?.'", "'?->'", "'not'", "'not2'", "'++'", "'|?'", "'|1'", "'?'", "'@'", "'Lambda'", "'<-'", "'true'", "'false'", "'invalid'", "'null'", "'if'", "'then'", "'else'", "'endif'", "'elseif'", "'let'", "'in'", "'|'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=5;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=7;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

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



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private USEGrammarAccess grammarAccess;

        public InternalUSEParser(TokenStream input, USEGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ModelUSE";
       	}

       	@Override
       	protected USEGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModelUSE"
    // InternalUSE.g:70:1: entryRuleModelUSE returns [EObject current=null] : iv_ruleModelUSE= ruleModelUSE EOF ;
    public final EObject entryRuleModelUSE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelUSE = null;


        try {
            // InternalUSE.g:70:49: (iv_ruleModelUSE= ruleModelUSE EOF )
            // InternalUSE.g:71:2: iv_ruleModelUSE= ruleModelUSE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelUSERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModelUSE=ruleModelUSE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModelUSE; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelUSE"


    // $ANTLR start "ruleModelUSE"
    // InternalUSE.g:77:1: ruleModelUSE returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_enums_2_0= ruleEnum ) )* ( (lv_packagedElement_3_0= ruleType ) )* ( (lv_constraints_4_0= ruleConstrainsGeneral ) )? ) ) ;
    public final EObject ruleModelUSE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_enums_2_0 = null;

        EObject lv_packagedElement_3_0 = null;

        EObject lv_constraints_4_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:83:2: ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_enums_2_0= ruleEnum ) )* ( (lv_packagedElement_3_0= ruleType ) )* ( (lv_constraints_4_0= ruleConstrainsGeneral ) )? ) ) )
            // InternalUSE.g:84:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_enums_2_0= ruleEnum ) )* ( (lv_packagedElement_3_0= ruleType ) )* ( (lv_constraints_4_0= ruleConstrainsGeneral ) )? ) )
            {
            // InternalUSE.g:84:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_enums_2_0= ruleEnum ) )* ( (lv_packagedElement_3_0= ruleType ) )* ( (lv_constraints_4_0= ruleConstrainsGeneral ) )? ) )
            // InternalUSE.g:85:3: otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_enums_2_0= ruleEnum ) )* ( (lv_packagedElement_3_0= ruleType ) )* ( (lv_constraints_4_0= ruleConstrainsGeneral ) )? )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getModelUSEAccess().getModelKeyword_0());
              		
            }
            // InternalUSE.g:89:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUSE.g:90:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUSE.g:90:4: (lv_name_1_0= RULE_ID )
            // InternalUSE.g:91:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getModelUSEAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getModelUSERule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalUSE.g:107:3: ( ( (lv_enums_2_0= ruleEnum ) )* ( (lv_packagedElement_3_0= ruleType ) )* ( (lv_constraints_4_0= ruleConstrainsGeneral ) )? )
            // InternalUSE.g:108:4: ( (lv_enums_2_0= ruleEnum ) )* ( (lv_packagedElement_3_0= ruleType ) )* ( (lv_constraints_4_0= ruleConstrainsGeneral ) )?
            {
            // InternalUSE.g:108:4: ( (lv_enums_2_0= ruleEnum ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==24) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUSE.g:109:5: (lv_enums_2_0= ruleEnum )
            	    {
            	    // InternalUSE.g:109:5: (lv_enums_2_0= ruleEnum )
            	    // InternalUSE.g:110:6: lv_enums_2_0= ruleEnum
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getModelUSEAccess().getEnumsEnumParserRuleCall_2_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_enums_2_0=ruleEnum();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getModelUSERule());
            	      						}
            	      						add(
            	      							current,
            	      							"enums",
            	      							lv_enums_2_0,
            	      							"modelConverter.use_language.USE.Enum");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalUSE.g:127:4: ( (lv_packagedElement_3_0= ruleType ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=27 && LA2_0<=28)||(LA2_0>=31 && LA2_0<=33)||LA2_0==39) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalUSE.g:128:5: (lv_packagedElement_3_0= ruleType )
            	    {
            	    // InternalUSE.g:128:5: (lv_packagedElement_3_0= ruleType )
            	    // InternalUSE.g:129:6: lv_packagedElement_3_0= ruleType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getModelUSEAccess().getPackagedElementTypeParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_packagedElement_3_0=ruleType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getModelUSERule());
            	      						}
            	      						add(
            	      							current,
            	      							"packagedElement",
            	      							lv_packagedElement_3_0,
            	      							"modelConverter.use_language.USE.Type");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalUSE.g:146:4: ( (lv_constraints_4_0= ruleConstrainsGeneral ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==56) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalUSE.g:147:5: (lv_constraints_4_0= ruleConstrainsGeneral )
                    {
                    // InternalUSE.g:147:5: (lv_constraints_4_0= ruleConstrainsGeneral )
                    // InternalUSE.g:148:6: lv_constraints_4_0= ruleConstrainsGeneral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getModelUSEAccess().getConstraintsConstrainsGeneralParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_constraints_4_0=ruleConstrainsGeneral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getModelUSERule());
                      						}
                      						set(
                      							current,
                      							"constraints",
                      							lv_constraints_4_0,
                      							"modelConverter.use_language.USE.ConstrainsGeneral");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelUSE"


    // $ANTLR start "entryRuleMultiplicity"
    // InternalUSE.g:170:1: entryRuleMultiplicity returns [EObject current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final EObject entryRuleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicity = null;


        try {
            // InternalUSE.g:170:53: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // InternalUSE.g:171:2: iv_ruleMultiplicity= ruleMultiplicity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicity=ruleMultiplicity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicity; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicity"


    // $ANTLR start "ruleMultiplicity"
    // InternalUSE.g:177:1: ruleMultiplicity returns [EObject current=null] : ( ( ( (lv_minValue_0_1= '*' | lv_minValue_0_2= ruleIntToString ) ) ) (otherlv_1= '..' ( ( (lv_maxValue_2_1= '*' | lv_maxValue_2_2= ruleIntToString ) ) ) )? (otherlv_3= ',' ( ( (lv_minValue_4_1= '*' | lv_minValue_4_2= ruleIntToString ) ) ) (otherlv_5= '..' ( ( (lv_maxValue_6_1= '*' | lv_maxValue_6_2= ruleIntToString ) ) ) )? )* ) ;
    public final EObject ruleMultiplicity() throws RecognitionException {
        EObject current = null;

        Token lv_minValue_0_1=null;
        Token otherlv_1=null;
        Token lv_maxValue_2_1=null;
        Token otherlv_3=null;
        Token lv_minValue_4_1=null;
        Token otherlv_5=null;
        Token lv_maxValue_6_1=null;
        AntlrDatatypeRuleToken lv_minValue_0_2 = null;

        AntlrDatatypeRuleToken lv_maxValue_2_2 = null;

        AntlrDatatypeRuleToken lv_minValue_4_2 = null;

        AntlrDatatypeRuleToken lv_maxValue_6_2 = null;



        	enterRule();

        try {
            // InternalUSE.g:183:2: ( ( ( ( (lv_minValue_0_1= '*' | lv_minValue_0_2= ruleIntToString ) ) ) (otherlv_1= '..' ( ( (lv_maxValue_2_1= '*' | lv_maxValue_2_2= ruleIntToString ) ) ) )? (otherlv_3= ',' ( ( (lv_minValue_4_1= '*' | lv_minValue_4_2= ruleIntToString ) ) ) (otherlv_5= '..' ( ( (lv_maxValue_6_1= '*' | lv_maxValue_6_2= ruleIntToString ) ) ) )? )* ) )
            // InternalUSE.g:184:2: ( ( ( (lv_minValue_0_1= '*' | lv_minValue_0_2= ruleIntToString ) ) ) (otherlv_1= '..' ( ( (lv_maxValue_2_1= '*' | lv_maxValue_2_2= ruleIntToString ) ) ) )? (otherlv_3= ',' ( ( (lv_minValue_4_1= '*' | lv_minValue_4_2= ruleIntToString ) ) ) (otherlv_5= '..' ( ( (lv_maxValue_6_1= '*' | lv_maxValue_6_2= ruleIntToString ) ) ) )? )* )
            {
            // InternalUSE.g:184:2: ( ( ( (lv_minValue_0_1= '*' | lv_minValue_0_2= ruleIntToString ) ) ) (otherlv_1= '..' ( ( (lv_maxValue_2_1= '*' | lv_maxValue_2_2= ruleIntToString ) ) ) )? (otherlv_3= ',' ( ( (lv_minValue_4_1= '*' | lv_minValue_4_2= ruleIntToString ) ) ) (otherlv_5= '..' ( ( (lv_maxValue_6_1= '*' | lv_maxValue_6_2= ruleIntToString ) ) ) )? )* )
            // InternalUSE.g:185:3: ( ( (lv_minValue_0_1= '*' | lv_minValue_0_2= ruleIntToString ) ) ) (otherlv_1= '..' ( ( (lv_maxValue_2_1= '*' | lv_maxValue_2_2= ruleIntToString ) ) ) )? (otherlv_3= ',' ( ( (lv_minValue_4_1= '*' | lv_minValue_4_2= ruleIntToString ) ) ) (otherlv_5= '..' ( ( (lv_maxValue_6_1= '*' | lv_maxValue_6_2= ruleIntToString ) ) ) )? )*
            {
            // InternalUSE.g:185:3: ( ( (lv_minValue_0_1= '*' | lv_minValue_0_2= ruleIntToString ) ) )
            // InternalUSE.g:186:4: ( (lv_minValue_0_1= '*' | lv_minValue_0_2= ruleIntToString ) )
            {
            // InternalUSE.g:186:4: ( (lv_minValue_0_1= '*' | lv_minValue_0_2= ruleIntToString ) )
            // InternalUSE.g:187:5: (lv_minValue_0_1= '*' | lv_minValue_0_2= ruleIntToString )
            {
            // InternalUSE.g:187:5: (lv_minValue_0_1= '*' | lv_minValue_0_2= ruleIntToString )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_INT) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalUSE.g:188:6: lv_minValue_0_1= '*'
                    {
                    lv_minValue_0_1=(Token)match(input,12,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_minValue_0_1, grammarAccess.getMultiplicityAccess().getMinValueAsteriskKeyword_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMultiplicityRule());
                      						}
                      						addWithLastConsumed(current, "minValue", lv_minValue_0_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalUSE.g:199:6: lv_minValue_0_2= ruleIntToString
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMultiplicityAccess().getMinValueIntToStringParserRuleCall_0_0_1());
                      					
                    }
                    pushFollow(FOLLOW_6);
                    lv_minValue_0_2=ruleIntToString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMultiplicityRule());
                      						}
                      						add(
                      							current,
                      							"minValue",
                      							lv_minValue_0_2,
                      							"modelConverter.use_language.USE.IntToString");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }

            // InternalUSE.g:217:3: (otherlv_1= '..' ( ( (lv_maxValue_2_1= '*' | lv_maxValue_2_2= ruleIntToString ) ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalUSE.g:218:4: otherlv_1= '..' ( ( (lv_maxValue_2_1= '*' | lv_maxValue_2_2= ruleIntToString ) ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_1_0());
                      			
                    }
                    // InternalUSE.g:222:4: ( ( (lv_maxValue_2_1= '*' | lv_maxValue_2_2= ruleIntToString ) ) )
                    // InternalUSE.g:223:5: ( (lv_maxValue_2_1= '*' | lv_maxValue_2_2= ruleIntToString ) )
                    {
                    // InternalUSE.g:223:5: ( (lv_maxValue_2_1= '*' | lv_maxValue_2_2= ruleIntToString ) )
                    // InternalUSE.g:224:6: (lv_maxValue_2_1= '*' | lv_maxValue_2_2= ruleIntToString )
                    {
                    // InternalUSE.g:224:6: (lv_maxValue_2_1= '*' | lv_maxValue_2_2= ruleIntToString )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==12) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==RULE_INT) ) {
                        alt5=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalUSE.g:225:7: lv_maxValue_2_1= '*'
                            {
                            lv_maxValue_2_1=(Token)match(input,12,FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_maxValue_2_1, grammarAccess.getMultiplicityAccess().getMaxValueAsteriskKeyword_1_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getMultiplicityRule());
                              							}
                              							addWithLastConsumed(current, "maxValue", lv_maxValue_2_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalUSE.g:236:7: lv_maxValue_2_2= ruleIntToString
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getMultiplicityAccess().getMaxValueIntToStringParserRuleCall_1_1_0_1());
                              						
                            }
                            pushFollow(FOLLOW_8);
                            lv_maxValue_2_2=ruleIntToString();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getMultiplicityRule());
                              							}
                              							add(
                              								current,
                              								"maxValue",
                              								lv_maxValue_2_2,
                              								"modelConverter.use_language.USE.IntToString");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalUSE.g:255:3: (otherlv_3= ',' ( ( (lv_minValue_4_1= '*' | lv_minValue_4_2= ruleIntToString ) ) ) (otherlv_5= '..' ( ( (lv_maxValue_6_1= '*' | lv_maxValue_6_2= ruleIntToString ) ) ) )? )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==14) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalUSE.g:256:4: otherlv_3= ',' ( ( (lv_minValue_4_1= '*' | lv_minValue_4_2= ruleIntToString ) ) ) (otherlv_5= '..' ( ( (lv_maxValue_6_1= '*' | lv_maxValue_6_2= ruleIntToString ) ) ) )?
            	    {
            	    otherlv_3=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getMultiplicityAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalUSE.g:260:4: ( ( (lv_minValue_4_1= '*' | lv_minValue_4_2= ruleIntToString ) ) )
            	    // InternalUSE.g:261:5: ( (lv_minValue_4_1= '*' | lv_minValue_4_2= ruleIntToString ) )
            	    {
            	    // InternalUSE.g:261:5: ( (lv_minValue_4_1= '*' | lv_minValue_4_2= ruleIntToString ) )
            	    // InternalUSE.g:262:6: (lv_minValue_4_1= '*' | lv_minValue_4_2= ruleIntToString )
            	    {
            	    // InternalUSE.g:262:6: (lv_minValue_4_1= '*' | lv_minValue_4_2= ruleIntToString )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==12) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==RULE_INT) ) {
            	        alt7=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalUSE.g:263:7: lv_minValue_4_1= '*'
            	            {
            	            lv_minValue_4_1=(Token)match(input,12,FOLLOW_6); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_minValue_4_1, grammarAccess.getMultiplicityAccess().getMinValueAsteriskKeyword_2_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getMultiplicityRule());
            	              							}
            	              							addWithLastConsumed(current, "minValue", lv_minValue_4_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalUSE.g:274:7: lv_minValue_4_2= ruleIntToString
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getMultiplicityAccess().getMinValueIntToStringParserRuleCall_2_1_0_1());
            	              						
            	            }
            	            pushFollow(FOLLOW_6);
            	            lv_minValue_4_2=ruleIntToString();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getMultiplicityRule());
            	              							}
            	              							add(
            	              								current,
            	              								"minValue",
            	              								lv_minValue_4_2,
            	              								"modelConverter.use_language.USE.IntToString");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalUSE.g:292:4: (otherlv_5= '..' ( ( (lv_maxValue_6_1= '*' | lv_maxValue_6_2= ruleIntToString ) ) ) )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==13) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalUSE.g:293:5: otherlv_5= '..' ( ( (lv_maxValue_6_1= '*' | lv_maxValue_6_2= ruleIntToString ) ) )
            	            {
            	            otherlv_5=(Token)match(input,13,FOLLOW_7); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_5, grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_2_2_0());
            	              				
            	            }
            	            // InternalUSE.g:297:5: ( ( (lv_maxValue_6_1= '*' | lv_maxValue_6_2= ruleIntToString ) ) )
            	            // InternalUSE.g:298:6: ( (lv_maxValue_6_1= '*' | lv_maxValue_6_2= ruleIntToString ) )
            	            {
            	            // InternalUSE.g:298:6: ( (lv_maxValue_6_1= '*' | lv_maxValue_6_2= ruleIntToString ) )
            	            // InternalUSE.g:299:7: (lv_maxValue_6_1= '*' | lv_maxValue_6_2= ruleIntToString )
            	            {
            	            // InternalUSE.g:299:7: (lv_maxValue_6_1= '*' | lv_maxValue_6_2= ruleIntToString )
            	            int alt8=2;
            	            int LA8_0 = input.LA(1);

            	            if ( (LA8_0==12) ) {
            	                alt8=1;
            	            }
            	            else if ( (LA8_0==RULE_INT) ) {
            	                alt8=2;
            	            }
            	            else {
            	                if (state.backtracking>0) {state.failed=true; return current;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 8, 0, input);

            	                throw nvae;
            	            }
            	            switch (alt8) {
            	                case 1 :
            	                    // InternalUSE.g:300:8: lv_maxValue_6_1= '*'
            	                    {
            	                    lv_maxValue_6_1=(Token)match(input,12,FOLLOW_8); if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      								newLeafNode(lv_maxValue_6_1, grammarAccess.getMultiplicityAccess().getMaxValueAsteriskKeyword_2_2_1_0_0());
            	                      							
            	                    }
            	                    if ( state.backtracking==0 ) {

            	                      								if (current==null) {
            	                      									current = createModelElement(grammarAccess.getMultiplicityRule());
            	                      								}
            	                      								addWithLastConsumed(current, "maxValue", lv_maxValue_6_1, null);
            	                      							
            	                    }

            	                    }
            	                    break;
            	                case 2 :
            	                    // InternalUSE.g:311:8: lv_maxValue_6_2= ruleIntToString
            	                    {
            	                    if ( state.backtracking==0 ) {

            	                      								newCompositeNode(grammarAccess.getMultiplicityAccess().getMaxValueIntToStringParserRuleCall_2_2_1_0_1());
            	                      							
            	                    }
            	                    pushFollow(FOLLOW_8);
            	                    lv_maxValue_6_2=ruleIntToString();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      								if (current==null) {
            	                      									current = createModelElementForParent(grammarAccess.getMultiplicityRule());
            	                      								}
            	                      								add(
            	                      									current,
            	                      									"maxValue",
            	                      									lv_maxValue_6_2,
            	                      									"modelConverter.use_language.USE.IntToString");
            	                      								afterParserOrEnumRuleCall();
            	                      							
            	                    }

            	                    }
            	                    break;

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicity"


    // $ANTLR start "entryRuleIntToString"
    // InternalUSE.g:335:1: entryRuleIntToString returns [String current=null] : iv_ruleIntToString= ruleIntToString EOF ;
    public final String entryRuleIntToString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntToString = null;


        try {
            // InternalUSE.g:335:51: (iv_ruleIntToString= ruleIntToString EOF )
            // InternalUSE.g:336:2: iv_ruleIntToString= ruleIntToString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntToStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntToString=ruleIntToString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntToString.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntToString"


    // $ANTLR start "ruleIntToString"
    // InternalUSE.g:342:1: ruleIntToString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleIntToString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalUSE.g:348:2: (this_INT_0= RULE_INT )
            // InternalUSE.g:349:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_INT_0, grammarAccess.getIntToStringAccess().getINTTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntToString"


    // $ANTLR start "entryRuleDefaultType"
    // InternalUSE.g:359:1: entryRuleDefaultType returns [String current=null] : iv_ruleDefaultType= ruleDefaultType EOF ;
    public final String entryRuleDefaultType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDefaultType = null;


        try {
            // InternalUSE.g:359:51: (iv_ruleDefaultType= ruleDefaultType EOF )
            // InternalUSE.g:360:2: iv_ruleDefaultType= ruleDefaultType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefaultType=ruleDefaultType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultType.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefaultType"


    // $ANTLR start "ruleDefaultType"
    // InternalUSE.g:366:1: ruleDefaultType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Integer' | kw= 'String' | kw= 'Real' | kw= 'Boolean' ) ;
    public final AntlrDatatypeRuleToken ruleDefaultType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUSE.g:372:2: ( (kw= 'Integer' | kw= 'String' | kw= 'Real' | kw= 'Boolean' ) )
            // InternalUSE.g:373:2: (kw= 'Integer' | kw= 'String' | kw= 'Real' | kw= 'Boolean' )
            {
            // InternalUSE.g:373:2: (kw= 'Integer' | kw= 'String' | kw= 'Real' | kw= 'Boolean' )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt11=1;
                }
                break;
            case 16:
                {
                alt11=2;
                }
                break;
            case 17:
                {
                alt11=3;
                }
                break;
            case 18:
                {
                alt11=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalUSE.g:374:3: kw= 'Integer'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDefaultTypeAccess().getIntegerKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUSE.g:380:3: kw= 'String'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDefaultTypeAccess().getStringKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUSE.g:386:3: kw= 'Real'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDefaultTypeAccess().getRealKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalUSE.g:392:3: kw= 'Boolean'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDefaultTypeAccess().getBooleanKeyword_3());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefaultType"


    // $ANTLR start "entryRuleAllTypes"
    // InternalUSE.g:401:1: entryRuleAllTypes returns [EObject current=null] : iv_ruleAllTypes= ruleAllTypes EOF ;
    public final EObject entryRuleAllTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllTypes = null;


        try {
            // InternalUSE.g:401:49: (iv_ruleAllTypes= ruleAllTypes EOF )
            // InternalUSE.g:402:2: iv_ruleAllTypes= ruleAllTypes EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAllTypesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAllTypes=ruleAllTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAllTypes; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAllTypes"


    // $ANTLR start "ruleAllTypes"
    // InternalUSE.g:408:1: ruleAllTypes returns [EObject current=null] : (this_CollectionType_0= ruleCollectionType | this_SimpleTypes_1= ruleSimpleTypes ) ;
    public final EObject ruleAllTypes() throws RecognitionException {
        EObject current = null;

        EObject this_CollectionType_0 = null;

        EObject this_SimpleTypes_1 = null;



        	enterRule();

        try {
            // InternalUSE.g:414:2: ( (this_CollectionType_0= ruleCollectionType | this_SimpleTypes_1= ruleSimpleTypes ) )
            // InternalUSE.g:415:2: (this_CollectionType_0= ruleCollectionType | this_SimpleTypes_1= ruleSimpleTypes )
            {
            // InternalUSE.g:415:2: (this_CollectionType_0= ruleCollectionType | this_SimpleTypes_1= ruleSimpleTypes )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=19 && LA12_0<=21)) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID||(LA12_0>=15 && LA12_0<=18)) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalUSE.g:416:3: this_CollectionType_0= ruleCollectionType
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAllTypesAccess().getCollectionTypeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CollectionType_0=ruleCollectionType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CollectionType_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUSE.g:428:3: this_SimpleTypes_1= ruleSimpleTypes
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAllTypesAccess().getSimpleTypesParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SimpleTypes_1=ruleSimpleTypes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SimpleTypes_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAllTypes"


    // $ANTLR start "entryRuleType"
    // InternalUSE.g:443:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalUSE.g:443:45: (iv_ruleType= ruleType EOF )
            // InternalUSE.g:444:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalUSE.g:450:1: ruleType returns [EObject current=null] : (this_Class_0= ruleClass | this_Association_1= ruleAssociation | this_AssociationClass_2= ruleAssociationClass ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_Association_1 = null;

        EObject this_AssociationClass_2 = null;



        	enterRule();

        try {
            // InternalUSE.g:456:2: ( (this_Class_0= ruleClass | this_Association_1= ruleAssociation | this_AssociationClass_2= ruleAssociationClass ) )
            // InternalUSE.g:457:2: (this_Class_0= ruleClass | this_Association_1= ruleAssociation | this_AssociationClass_2= ruleAssociationClass )
            {
            // InternalUSE.g:457:2: (this_Class_0= ruleClass | this_Association_1= ruleAssociation | this_AssociationClass_2= ruleAssociationClass )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==28) ) {
                    alt13=1;
                }
                else if ( (LA13_1==39) ) {
                    alt13=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                alt13=1;
                }
                break;
            case 31:
            case 32:
            case 33:
                {
                alt13=2;
                }
                break;
            case 39:
                {
                alt13=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalUSE.g:458:3: this_Class_0= ruleClass
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getClassParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Class_0=ruleClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Class_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUSE.g:470:3: this_Association_1= ruleAssociation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getAssociationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Association_1=ruleAssociation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Association_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUSE.g:482:3: this_AssociationClass_2= ruleAssociationClass
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getAssociationClassParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AssociationClass_2=ruleAssociationClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AssociationClass_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleCollectionType"
    // InternalUSE.g:497:1: entryRuleCollectionType returns [EObject current=null] : iv_ruleCollectionType= ruleCollectionType EOF ;
    public final EObject entryRuleCollectionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionType = null;


        try {
            // InternalUSE.g:497:55: (iv_ruleCollectionType= ruleCollectionType EOF )
            // InternalUSE.g:498:2: iv_ruleCollectionType= ruleCollectionType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCollectionType=ruleCollectionType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionType"


    // $ANTLR start "ruleCollectionType"
    // InternalUSE.g:504:1: ruleCollectionType returns [EObject current=null] : ( ( ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'Bag' | lv_collection_0_3= 'Sequence' ) ) ) otherlv_1= '(' ( (lv_type_2_0= ruleSimpleTypes ) )* otherlv_3= ')' ) ;
    public final EObject ruleCollectionType() throws RecognitionException {
        EObject current = null;

        Token lv_collection_0_1=null;
        Token lv_collection_0_2=null;
        Token lv_collection_0_3=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:510:2: ( ( ( ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'Bag' | lv_collection_0_3= 'Sequence' ) ) ) otherlv_1= '(' ( (lv_type_2_0= ruleSimpleTypes ) )* otherlv_3= ')' ) )
            // InternalUSE.g:511:2: ( ( ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'Bag' | lv_collection_0_3= 'Sequence' ) ) ) otherlv_1= '(' ( (lv_type_2_0= ruleSimpleTypes ) )* otherlv_3= ')' )
            {
            // InternalUSE.g:511:2: ( ( ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'Bag' | lv_collection_0_3= 'Sequence' ) ) ) otherlv_1= '(' ( (lv_type_2_0= ruleSimpleTypes ) )* otherlv_3= ')' )
            // InternalUSE.g:512:3: ( ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'Bag' | lv_collection_0_3= 'Sequence' ) ) ) otherlv_1= '(' ( (lv_type_2_0= ruleSimpleTypes ) )* otherlv_3= ')'
            {
            // InternalUSE.g:512:3: ( ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'Bag' | lv_collection_0_3= 'Sequence' ) ) )
            // InternalUSE.g:513:4: ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'Bag' | lv_collection_0_3= 'Sequence' ) )
            {
            // InternalUSE.g:513:4: ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'Bag' | lv_collection_0_3= 'Sequence' ) )
            // InternalUSE.g:514:5: (lv_collection_0_1= 'Set' | lv_collection_0_2= 'Bag' | lv_collection_0_3= 'Sequence' )
            {
            // InternalUSE.g:514:5: (lv_collection_0_1= 'Set' | lv_collection_0_2= 'Bag' | lv_collection_0_3= 'Sequence' )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt14=1;
                }
                break;
            case 20:
                {
                alt14=2;
                }
                break;
            case 21:
                {
                alt14=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalUSE.g:515:6: lv_collection_0_1= 'Set'
                    {
                    lv_collection_0_1=(Token)match(input,19,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_collection_0_1, grammarAccess.getCollectionTypeAccess().getCollectionSetKeyword_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCollectionTypeRule());
                      						}
                      						setWithLastConsumed(current, "collection", lv_collection_0_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalUSE.g:526:6: lv_collection_0_2= 'Bag'
                    {
                    lv_collection_0_2=(Token)match(input,20,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_collection_0_2, grammarAccess.getCollectionTypeAccess().getCollectionBagKeyword_0_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCollectionTypeRule());
                      						}
                      						setWithLastConsumed(current, "collection", lv_collection_0_2, null);
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalUSE.g:537:6: lv_collection_0_3= 'Sequence'
                    {
                    lv_collection_0_3=(Token)match(input,21,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_collection_0_3, grammarAccess.getCollectionTypeAccess().getCollectionSequenceKeyword_0_0_2());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCollectionTypeRule());
                      						}
                      						setWithLastConsumed(current, "collection", lv_collection_0_3, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCollectionTypeAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalUSE.g:554:3: ( (lv_type_2_0= ruleSimpleTypes ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||(LA15_0>=15 && LA15_0<=18)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalUSE.g:555:4: (lv_type_2_0= ruleSimpleTypes )
            	    {
            	    // InternalUSE.g:555:4: (lv_type_2_0= ruleSimpleTypes )
            	    // InternalUSE.g:556:5: lv_type_2_0= ruleSimpleTypes
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getCollectionTypeAccess().getTypeSimpleTypesParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_type_2_0=ruleSimpleTypes();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getCollectionTypeRule());
            	      					}
            	      					add(
            	      						current,
            	      						"type",
            	      						lv_type_2_0,
            	      						"modelConverter.use_language.USE.SimpleTypes");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_3=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getCollectionTypeAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionType"


    // $ANTLR start "entryRuleAllClass"
    // InternalUSE.g:581:1: entryRuleAllClass returns [EObject current=null] : iv_ruleAllClass= ruleAllClass EOF ;
    public final EObject entryRuleAllClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllClass = null;


        try {
            // InternalUSE.g:581:49: (iv_ruleAllClass= ruleAllClass EOF )
            // InternalUSE.g:582:2: iv_ruleAllClass= ruleAllClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAllClassRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAllClass=ruleAllClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAllClass; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAllClass"


    // $ANTLR start "ruleAllClass"
    // InternalUSE.g:588:1: ruleAllClass returns [EObject current=null] : (this_Class_0= ruleClass | this_AssociationClass_1= ruleAssociationClass ) ;
    public final EObject ruleAllClass() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_AssociationClass_1 = null;



        	enterRule();

        try {
            // InternalUSE.g:594:2: ( (this_Class_0= ruleClass | this_AssociationClass_1= ruleAssociationClass ) )
            // InternalUSE.g:595:2: (this_Class_0= ruleClass | this_AssociationClass_1= ruleAssociationClass )
            {
            // InternalUSE.g:595:2: (this_Class_0= ruleClass | this_AssociationClass_1= ruleAssociationClass )
            int alt16=2;
            switch ( input.LA(1) ) {
            case 27:
                {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==39) ) {
                    alt16=2;
                }
                else if ( (LA16_1==28) ) {
                    alt16=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                alt16=1;
                }
                break;
            case 39:
                {
                alt16=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalUSE.g:596:3: this_Class_0= ruleClass
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAllClassAccess().getClassParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Class_0=ruleClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Class_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUSE.g:608:3: this_AssociationClass_1= ruleAssociationClass
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAllClassAccess().getAssociationClassParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AssociationClass_1=ruleAssociationClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AssociationClass_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAllClass"


    // $ANTLR start "entryRuleSimpleTypes"
    // InternalUSE.g:623:1: entryRuleSimpleTypes returns [EObject current=null] : iv_ruleSimpleTypes= ruleSimpleTypes EOF ;
    public final EObject entryRuleSimpleTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleTypes = null;


        try {
            // InternalUSE.g:623:52: (iv_ruleSimpleTypes= ruleSimpleTypes EOF )
            // InternalUSE.g:624:2: iv_ruleSimpleTypes= ruleSimpleTypes EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleTypesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimpleTypes=ruleSimpleTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleTypes; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleTypes"


    // $ANTLR start "ruleSimpleTypes"
    // InternalUSE.g:630:1: ruleSimpleTypes returns [EObject current=null] : ( ( (lv_defaultType_0_0= ruleDefaultType ) ) | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleSimpleTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_defaultType_0_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:636:2: ( ( ( (lv_defaultType_0_0= ruleDefaultType ) ) | ( (otherlv_1= RULE_ID ) ) ) )
            // InternalUSE.g:637:2: ( ( (lv_defaultType_0_0= ruleDefaultType ) ) | ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalUSE.g:637:2: ( ( (lv_defaultType_0_0= ruleDefaultType ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=15 && LA17_0<=18)) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalUSE.g:638:3: ( (lv_defaultType_0_0= ruleDefaultType ) )
                    {
                    // InternalUSE.g:638:3: ( (lv_defaultType_0_0= ruleDefaultType ) )
                    // InternalUSE.g:639:4: (lv_defaultType_0_0= ruleDefaultType )
                    {
                    // InternalUSE.g:639:4: (lv_defaultType_0_0= ruleDefaultType )
                    // InternalUSE.g:640:5: lv_defaultType_0_0= ruleDefaultType
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSimpleTypesAccess().getDefaultTypeDefaultTypeParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_defaultType_0_0=ruleDefaultType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSimpleTypesRule());
                      					}
                      					set(
                      						current,
                      						"defaultType",
                      						lv_defaultType_0_0,
                      						"modelConverter.use_language.USE.DefaultType");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:658:3: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalUSE.g:658:3: ( (otherlv_1= RULE_ID ) )
                    // InternalUSE.g:659:4: (otherlv_1= RULE_ID )
                    {
                    // InternalUSE.g:659:4: (otherlv_1= RULE_ID )
                    // InternalUSE.g:660:5: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSimpleTypesRule());
                      					}
                      				
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getSimpleTypesAccess().getReferendedAllClassAndEnumCrossReference_1_0());
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleTypes"


    // $ANTLR start "entryRuleEnum"
    // InternalUSE.g:678:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // InternalUSE.g:678:45: (iv_ruleEnum= ruleEnum EOF )
            // InternalUSE.g:679:2: iv_ruleEnum= ruleEnum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnum=ruleEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnum; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // InternalUSE.g:685:1: ruleEnum returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )+ otherlv_4= '}' ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:691:2: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )+ otherlv_4= '}' ) )
            // InternalUSE.g:692:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )+ otherlv_4= '}' )
            {
            // InternalUSE.g:692:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )+ otherlv_4= '}' )
            // InternalUSE.g:693:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
              		
            }
            // InternalUSE.g:697:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUSE.g:698:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalUSE.g:698:4: (lv_name_1_0= RULE_ID )
                    // InternalUSE.g:699:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_1_0, grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEnumRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_1_0,
                      						"org.eclipse.xtext.common.Terminals.ID");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalUSE.g:719:3: ( (lv_elements_3_0= ruleEnumElement ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalUSE.g:720:4: (lv_elements_3_0= ruleEnumElement )
            	    {
            	    // InternalUSE.g:720:4: (lv_elements_3_0= ruleEnumElement )
            	    // InternalUSE.g:721:5: lv_elements_3_0= ruleEnumElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEnumAccess().getElementsEnumElementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_elements_3_0=ruleEnumElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEnumRule());
            	      					}
            	      					add(
            	      						current,
            	      						"elements",
            	      						lv_elements_3_0,
            	      						"modelConverter.use_language.USE.EnumElement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            otherlv_4=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleEnumElement"
    // InternalUSE.g:746:1: entryRuleEnumElement returns [String current=null] : iv_ruleEnumElement= ruleEnumElement EOF ;
    public final String entryRuleEnumElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnumElement = null;


        try {
            // InternalUSE.g:746:51: (iv_ruleEnumElement= ruleEnumElement EOF )
            // InternalUSE.g:747:2: iv_ruleEnumElement= ruleEnumElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumElement=ruleEnumElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumElement.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumElement"


    // $ANTLR start "ruleEnumElement"
    // InternalUSE.g:753:1: ruleEnumElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= ',' )? ) ;
    public final AntlrDatatypeRuleToken ruleEnumElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalUSE.g:759:2: ( (this_ID_0= RULE_ID (kw= ',' )? ) )
            // InternalUSE.g:760:2: (this_ID_0= RULE_ID (kw= ',' )? )
            {
            // InternalUSE.g:760:2: (this_ID_0= RULE_ID (kw= ',' )? )
            // InternalUSE.g:761:3: this_ID_0= RULE_ID (kw= ',' )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getEnumElementAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalUSE.g:768:3: (kw= ',' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==14) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUSE.g:769:4: kw= ','
                    {
                    kw=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getEnumElementAccess().getCommaKeyword_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumElement"


    // $ANTLR start "entryRuleClass"
    // InternalUSE.g:779:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalUSE.g:779:46: (iv_ruleClass= ruleClass EOF )
            // InternalUSE.g:780:2: iv_ruleClass= ruleClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClass; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalUSE.g:786:1: ruleClass returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? ( (lv_attributes_5_0= ruleAttributesBase ) )? ( (lv_operations_6_0= ruleOperationsBase ) )? ( (lv_constraints_7_0= ruleConstraintsBase ) )? ( (lv_statemachines_8_0= ruleStateMachinesBase ) )? otherlv_9= 'end' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_9=null;
        EObject lv_generalization_4_0 = null;

        EObject lv_attributes_5_0 = null;

        EObject lv_operations_6_0 = null;

        EObject lv_constraints_7_0 = null;

        EObject lv_statemachines_8_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:792:2: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? ( (lv_attributes_5_0= ruleAttributesBase ) )? ( (lv_operations_6_0= ruleOperationsBase ) )? ( (lv_constraints_7_0= ruleConstraintsBase ) )? ( (lv_statemachines_8_0= ruleStateMachinesBase ) )? otherlv_9= 'end' ) )
            // InternalUSE.g:793:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? ( (lv_attributes_5_0= ruleAttributesBase ) )? ( (lv_operations_6_0= ruleOperationsBase ) )? ( (lv_constraints_7_0= ruleConstraintsBase ) )? ( (lv_statemachines_8_0= ruleStateMachinesBase ) )? otherlv_9= 'end' )
            {
            // InternalUSE.g:793:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? ( (lv_attributes_5_0= ruleAttributesBase ) )? ( (lv_operations_6_0= ruleOperationsBase ) )? ( (lv_constraints_7_0= ruleConstraintsBase ) )? ( (lv_statemachines_8_0= ruleStateMachinesBase ) )? otherlv_9= 'end' )
            // InternalUSE.g:794:3: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? ( (lv_attributes_5_0= ruleAttributesBase ) )? ( (lv_operations_6_0= ruleOperationsBase ) )? ( (lv_constraints_7_0= ruleConstraintsBase ) )? ( (lv_statemachines_8_0= ruleStateMachinesBase ) )? otherlv_9= 'end'
            {
            // InternalUSE.g:794:3: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUSE.g:795:4: (lv_abstract_0_0= 'abstract' )
                    {
                    // InternalUSE.g:795:4: (lv_abstract_0_0= 'abstract' )
                    // InternalUSE.g:796:5: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,27,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_abstract_0_0, grammarAccess.getClassAccess().getAbstractAbstractKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getClassRule());
                      					}
                      					setWithLastConsumed(current, "abstract", lv_abstract_0_0 != null, "abstract");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
              		
            }
            // InternalUSE.g:812:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUSE.g:813:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUSE.g:813:4: (lv_name_2_0= RULE_ID )
            // InternalUSE.g:814:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getClassRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalUSE.g:830:3: (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalUSE.g:831:4: otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getClassAccess().getLessThanSignKeyword_3_0());
                      			
                    }
                    // InternalUSE.g:835:4: ( (lv_generalization_4_0= ruleGeneralization ) )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_ID) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalUSE.g:836:5: (lv_generalization_4_0= ruleGeneralization )
                    	    {
                    	    // InternalUSE.g:836:5: (lv_generalization_4_0= ruleGeneralization )
                    	    // InternalUSE.g:837:6: lv_generalization_4_0= ruleGeneralization
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getClassAccess().getGeneralizationGeneralizationParserRuleCall_3_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_16);
                    	    lv_generalization_4_0=ruleGeneralization();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getClassRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"generalization",
                    	      							lv_generalization_4_0,
                    	      							"modelConverter.use_language.USE.Generalization");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt22 >= 1 ) break loop22;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(22, input);
                                throw eee;
                        }
                        cnt22++;
                    } while (true);


                    }
                    break;

            }

            // InternalUSE.g:855:3: ( (lv_attributes_5_0= ruleAttributesBase ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUSE.g:856:4: (lv_attributes_5_0= ruleAttributesBase )
                    {
                    // InternalUSE.g:856:4: (lv_attributes_5_0= ruleAttributesBase )
                    // InternalUSE.g:857:5: lv_attributes_5_0= ruleAttributesBase
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributesBaseParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_17);
                    lv_attributes_5_0=ruleAttributesBase();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getClassRule());
                      					}
                      					set(
                      						current,
                      						"attributes",
                      						lv_attributes_5_0,
                      						"modelConverter.use_language.USE.AttributesBase");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalUSE.g:874:3: ( (lv_operations_6_0= ruleOperationsBase ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==45) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUSE.g:875:4: (lv_operations_6_0= ruleOperationsBase )
                    {
                    // InternalUSE.g:875:4: (lv_operations_6_0= ruleOperationsBase )
                    // InternalUSE.g:876:5: lv_operations_6_0= ruleOperationsBase
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getClassAccess().getOperationsOperationsBaseParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_18);
                    lv_operations_6_0=ruleOperationsBase();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getClassRule());
                      					}
                      					set(
                      						current,
                      						"operations",
                      						lv_operations_6_0,
                      						"modelConverter.use_language.USE.OperationsBase");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalUSE.g:893:3: ( (lv_constraints_7_0= ruleConstraintsBase ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==56) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalUSE.g:894:4: (lv_constraints_7_0= ruleConstraintsBase )
                    {
                    // InternalUSE.g:894:4: (lv_constraints_7_0= ruleConstraintsBase )
                    // InternalUSE.g:895:5: lv_constraints_7_0= ruleConstraintsBase
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getClassAccess().getConstraintsConstraintsBaseParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_19);
                    lv_constraints_7_0=ruleConstraintsBase();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getClassRule());
                      					}
                      					set(
                      						current,
                      						"constraints",
                      						lv_constraints_7_0,
                      						"modelConverter.use_language.USE.ConstraintsBase");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalUSE.g:912:3: ( (lv_statemachines_8_0= ruleStateMachinesBase ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==49) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUSE.g:913:4: (lv_statemachines_8_0= ruleStateMachinesBase )
                    {
                    // InternalUSE.g:913:4: (lv_statemachines_8_0= ruleStateMachinesBase )
                    // InternalUSE.g:914:5: lv_statemachines_8_0= ruleStateMachinesBase
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getClassAccess().getStatemachinesStateMachinesBaseParserRuleCall_7_0());
                      				
                    }
                    pushFollow(FOLLOW_20);
                    lv_statemachines_8_0=ruleStateMachinesBase();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getClassRule());
                      					}
                      					set(
                      						current,
                      						"statemachines",
                      						lv_statemachines_8_0,
                      						"modelConverter.use_language.USE.StateMachinesBase");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getClassAccess().getEndKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleGeneralization"
    // InternalUSE.g:939:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalUSE.g:939:55: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalUSE.g:940:2: iv_ruleGeneralization= ruleGeneralization EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGeneralizationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGeneralization=ruleGeneralization();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGeneralization; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneralization"


    // $ANTLR start "ruleGeneralization"
    // InternalUSE.g:946:1: ruleGeneralization returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUSE.g:952:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? ) )
            // InternalUSE.g:953:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? )
            {
            // InternalUSE.g:953:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? )
            // InternalUSE.g:954:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )?
            {
            // InternalUSE.g:954:3: ( (otherlv_0= RULE_ID ) )
            // InternalUSE.g:955:4: (otherlv_0= RULE_ID )
            {
            // InternalUSE.g:955:4: (otherlv_0= RULE_ID )
            // InternalUSE.g:956:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGeneralizationRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getGeneralizationAccess().getGeneralAllClassCrossReference_0_0());
              				
            }

            }


            }

            // InternalUSE.g:970:3: (otherlv_1= ',' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==14) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalUSE.g:971:4: otherlv_1= ','
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getGeneralizationAccess().getCommaKeyword_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeneralization"


    // $ANTLR start "entryRuleAssociation"
    // InternalUSE.g:980:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalUSE.g:980:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalUSE.g:981:2: iv_ruleAssociation= ruleAssociation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssociationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssociation=ruleAssociation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssociation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // InternalUSE.g:987:1: ruleAssociation returns [EObject current=null] : ( ( ( (lv_typeAssociation_0_1= 'association' | lv_typeAssociation_0_2= 'aggregation' | lv_typeAssociation_0_3= 'composition' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_associationEnds_3_0= ruleAssociationEnd ) )+ otherlv_4= 'end' ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token lv_typeAssociation_0_1=null;
        Token lv_typeAssociation_0_2=null;
        Token lv_typeAssociation_0_3=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_associationEnds_3_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:993:2: ( ( ( ( (lv_typeAssociation_0_1= 'association' | lv_typeAssociation_0_2= 'aggregation' | lv_typeAssociation_0_3= 'composition' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_associationEnds_3_0= ruleAssociationEnd ) )+ otherlv_4= 'end' ) )
            // InternalUSE.g:994:2: ( ( ( (lv_typeAssociation_0_1= 'association' | lv_typeAssociation_0_2= 'aggregation' | lv_typeAssociation_0_3= 'composition' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_associationEnds_3_0= ruleAssociationEnd ) )+ otherlv_4= 'end' )
            {
            // InternalUSE.g:994:2: ( ( ( (lv_typeAssociation_0_1= 'association' | lv_typeAssociation_0_2= 'aggregation' | lv_typeAssociation_0_3= 'composition' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_associationEnds_3_0= ruleAssociationEnd ) )+ otherlv_4= 'end' )
            // InternalUSE.g:995:3: ( ( (lv_typeAssociation_0_1= 'association' | lv_typeAssociation_0_2= 'aggregation' | lv_typeAssociation_0_3= 'composition' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_associationEnds_3_0= ruleAssociationEnd ) )+ otherlv_4= 'end'
            {
            // InternalUSE.g:995:3: ( ( (lv_typeAssociation_0_1= 'association' | lv_typeAssociation_0_2= 'aggregation' | lv_typeAssociation_0_3= 'composition' ) ) )
            // InternalUSE.g:996:4: ( (lv_typeAssociation_0_1= 'association' | lv_typeAssociation_0_2= 'aggregation' | lv_typeAssociation_0_3= 'composition' ) )
            {
            // InternalUSE.g:996:4: ( (lv_typeAssociation_0_1= 'association' | lv_typeAssociation_0_2= 'aggregation' | lv_typeAssociation_0_3= 'composition' ) )
            // InternalUSE.g:997:5: (lv_typeAssociation_0_1= 'association' | lv_typeAssociation_0_2= 'aggregation' | lv_typeAssociation_0_3= 'composition' )
            {
            // InternalUSE.g:997:5: (lv_typeAssociation_0_1= 'association' | lv_typeAssociation_0_2= 'aggregation' | lv_typeAssociation_0_3= 'composition' )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt29=1;
                }
                break;
            case 32:
                {
                alt29=2;
                }
                break;
            case 33:
                {
                alt29=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalUSE.g:998:6: lv_typeAssociation_0_1= 'association'
                    {
                    lv_typeAssociation_0_1=(Token)match(input,31,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_typeAssociation_0_1, grammarAccess.getAssociationAccess().getTypeAssociationAssociationKeyword_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAssociationRule());
                      						}
                      						setWithLastConsumed(current, "typeAssociation", lv_typeAssociation_0_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalUSE.g:1009:6: lv_typeAssociation_0_2= 'aggregation'
                    {
                    lv_typeAssociation_0_2=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_typeAssociation_0_2, grammarAccess.getAssociationAccess().getTypeAssociationAggregationKeyword_0_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAssociationRule());
                      						}
                      						setWithLastConsumed(current, "typeAssociation", lv_typeAssociation_0_2, null);
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalUSE.g:1020:6: lv_typeAssociation_0_3= 'composition'
                    {
                    lv_typeAssociation_0_3=(Token)match(input,33,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_typeAssociation_0_3, grammarAccess.getAssociationAccess().getTypeAssociationCompositionKeyword_0_0_2());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAssociationRule());
                      						}
                      						setWithLastConsumed(current, "typeAssociation", lv_typeAssociation_0_3, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            // InternalUSE.g:1033:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUSE.g:1034:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUSE.g:1034:4: (lv_name_1_0= RULE_ID )
            // InternalUSE.g:1035:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAssociationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAssociationAccess().getBetweenKeyword_2());
              		
            }
            // InternalUSE.g:1055:3: ( (lv_associationEnds_3_0= ruleAssociationEnd ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalUSE.g:1056:4: (lv_associationEnds_3_0= ruleAssociationEnd )
            	    {
            	    // InternalUSE.g:1056:4: (lv_associationEnds_3_0= ruleAssociationEnd )
            	    // InternalUSE.g:1057:5: lv_associationEnds_3_0= ruleAssociationEnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAssociationAccess().getAssociationEndsAssociationEndParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_associationEnds_3_0=ruleAssociationEnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getAssociationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"associationEnds",
            	      						lv_associationEnds_3_0,
            	      						"modelConverter.use_language.USE.AssociationEnd");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            otherlv_4=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAssociationAccess().getEndKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleAssociationEnd"
    // InternalUSE.g:1082:1: entryRuleAssociationEnd returns [EObject current=null] : iv_ruleAssociationEnd= ruleAssociationEnd EOF ;
    public final EObject entryRuleAssociationEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationEnd = null;


        try {
            // InternalUSE.g:1082:55: (iv_ruleAssociationEnd= ruleAssociationEnd EOF )
            // InternalUSE.g:1083:2: iv_ruleAssociationEnd= ruleAssociationEnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssociationEndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssociationEnd=ruleAssociationEnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssociationEnd; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssociationEnd"


    // $ANTLR start "ruleAssociationEnd"
    // InternalUSE.g:1089:1: ruleAssociationEnd returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_mul_2_0= ruleMultiplicity ) ) otherlv_3= ']' (otherlv_4= 'role' ( (lv_role_5_0= RULE_ID ) ) )? ( (lv_ordered_6_0= 'ordered' ) )? ) ;
    public final EObject ruleAssociationEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_role_5_0=null;
        Token lv_ordered_6_0=null;
        EObject lv_mul_2_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1095:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_mul_2_0= ruleMultiplicity ) ) otherlv_3= ']' (otherlv_4= 'role' ( (lv_role_5_0= RULE_ID ) ) )? ( (lv_ordered_6_0= 'ordered' ) )? ) )
            // InternalUSE.g:1096:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_mul_2_0= ruleMultiplicity ) ) otherlv_3= ']' (otherlv_4= 'role' ( (lv_role_5_0= RULE_ID ) ) )? ( (lv_ordered_6_0= 'ordered' ) )? )
            {
            // InternalUSE.g:1096:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_mul_2_0= ruleMultiplicity ) ) otherlv_3= ']' (otherlv_4= 'role' ( (lv_role_5_0= RULE_ID ) ) )? ( (lv_ordered_6_0= 'ordered' ) )? )
            // InternalUSE.g:1097:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_mul_2_0= ruleMultiplicity ) ) otherlv_3= ']' (otherlv_4= 'role' ( (lv_role_5_0= RULE_ID ) ) )? ( (lv_ordered_6_0= 'ordered' ) )?
            {
            // InternalUSE.g:1097:3: ( (otherlv_0= RULE_ID ) )
            // InternalUSE.g:1098:4: (otherlv_0= RULE_ID )
            {
            // InternalUSE.g:1098:4: (otherlv_0= RULE_ID )
            // InternalUSE.g:1099:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAssociationEndRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getAssociationEndAccess().getTypeAllClassCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAssociationEndAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalUSE.g:1117:3: ( (lv_mul_2_0= ruleMultiplicity ) )
            // InternalUSE.g:1118:4: (lv_mul_2_0= ruleMultiplicity )
            {
            // InternalUSE.g:1118:4: (lv_mul_2_0= ruleMultiplicity )
            // InternalUSE.g:1119:5: lv_mul_2_0= ruleMultiplicity
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssociationEndAccess().getMulMultiplicityParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_mul_2_0=ruleMultiplicity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssociationEndRule());
              					}
              					set(
              						current,
              						"mul",
              						lv_mul_2_0,
              						"modelConverter.use_language.USE.Multiplicity");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAssociationEndAccess().getRightSquareBracketKeyword_3());
              		
            }
            // InternalUSE.g:1140:3: (otherlv_4= 'role' ( (lv_role_5_0= RULE_ID ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==37) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUSE.g:1141:4: otherlv_4= 'role' ( (lv_role_5_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getAssociationEndAccess().getRoleKeyword_4_0());
                      			
                    }
                    // InternalUSE.g:1145:4: ( (lv_role_5_0= RULE_ID ) )
                    // InternalUSE.g:1146:5: (lv_role_5_0= RULE_ID )
                    {
                    // InternalUSE.g:1146:5: (lv_role_5_0= RULE_ID )
                    // InternalUSE.g:1147:6: lv_role_5_0= RULE_ID
                    {
                    lv_role_5_0=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_role_5_0, grammarAccess.getAssociationEndAccess().getRoleIDTerminalRuleCall_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAssociationEndRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"role",
                      							lv_role_5_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalUSE.g:1164:3: ( (lv_ordered_6_0= 'ordered' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==38) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalUSE.g:1165:4: (lv_ordered_6_0= 'ordered' )
                    {
                    // InternalUSE.g:1165:4: (lv_ordered_6_0= 'ordered' )
                    // InternalUSE.g:1166:5: lv_ordered_6_0= 'ordered'
                    {
                    lv_ordered_6_0=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_ordered_6_0, grammarAccess.getAssociationEndAccess().getOrderedOrderedKeyword_5_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getAssociationEndRule());
                      					}
                      					setWithLastConsumed(current, "ordered", lv_ordered_6_0 != null, "ordered");
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssociationEnd"


    // $ANTLR start "entryRuleAssociationClass"
    // InternalUSE.g:1182:1: entryRuleAssociationClass returns [EObject current=null] : iv_ruleAssociationClass= ruleAssociationClass EOF ;
    public final EObject entryRuleAssociationClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationClass = null;


        try {
            // InternalUSE.g:1182:57: (iv_ruleAssociationClass= ruleAssociationClass EOF )
            // InternalUSE.g:1183:2: iv_ruleAssociationClass= ruleAssociationClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssociationClassRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssociationClass=ruleAssociationClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssociationClass; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssociationClass"


    // $ANTLR start "ruleAssociationClass"
    // InternalUSE.g:1189:1: ruleAssociationClass returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'associationclass' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? otherlv_5= 'between' ( (lv_associationEnds_6_0= ruleAssociationEnd ) )+ ( (lv_attributes_7_0= ruleAttributesBase ) )? ( (lv_operations_8_0= ruleOperationsBase ) )? ( (lv_constraints_9_0= ruleConstraintsBase ) )? ( (lv_statemachines_10_0= ruleStateMachinesBase ) )? otherlv_11= 'end' ) ;
    public final EObject ruleAssociationClass() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_11=null;
        EObject lv_generalization_4_0 = null;

        EObject lv_associationEnds_6_0 = null;

        EObject lv_attributes_7_0 = null;

        EObject lv_operations_8_0 = null;

        EObject lv_constraints_9_0 = null;

        EObject lv_statemachines_10_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1195:2: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'associationclass' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? otherlv_5= 'between' ( (lv_associationEnds_6_0= ruleAssociationEnd ) )+ ( (lv_attributes_7_0= ruleAttributesBase ) )? ( (lv_operations_8_0= ruleOperationsBase ) )? ( (lv_constraints_9_0= ruleConstraintsBase ) )? ( (lv_statemachines_10_0= ruleStateMachinesBase ) )? otherlv_11= 'end' ) )
            // InternalUSE.g:1196:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'associationclass' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? otherlv_5= 'between' ( (lv_associationEnds_6_0= ruleAssociationEnd ) )+ ( (lv_attributes_7_0= ruleAttributesBase ) )? ( (lv_operations_8_0= ruleOperationsBase ) )? ( (lv_constraints_9_0= ruleConstraintsBase ) )? ( (lv_statemachines_10_0= ruleStateMachinesBase ) )? otherlv_11= 'end' )
            {
            // InternalUSE.g:1196:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'associationclass' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? otherlv_5= 'between' ( (lv_associationEnds_6_0= ruleAssociationEnd ) )+ ( (lv_attributes_7_0= ruleAttributesBase ) )? ( (lv_operations_8_0= ruleOperationsBase ) )? ( (lv_constraints_9_0= ruleConstraintsBase ) )? ( (lv_statemachines_10_0= ruleStateMachinesBase ) )? otherlv_11= 'end' )
            // InternalUSE.g:1197:3: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'associationclass' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? otherlv_5= 'between' ( (lv_associationEnds_6_0= ruleAssociationEnd ) )+ ( (lv_attributes_7_0= ruleAttributesBase ) )? ( (lv_operations_8_0= ruleOperationsBase ) )? ( (lv_constraints_9_0= ruleConstraintsBase ) )? ( (lv_statemachines_10_0= ruleStateMachinesBase ) )? otherlv_11= 'end'
            {
            // InternalUSE.g:1197:3: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==27) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalUSE.g:1198:4: (lv_abstract_0_0= 'abstract' )
                    {
                    // InternalUSE.g:1198:4: (lv_abstract_0_0= 'abstract' )
                    // InternalUSE.g:1199:5: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,27,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_abstract_0_0, grammarAccess.getAssociationClassAccess().getAbstractAbstractKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getAssociationClassRule());
                      					}
                      					setWithLastConsumed(current, "abstract", lv_abstract_0_0 != null, "abstract");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,39,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAssociationClassAccess().getAssociationclassKeyword_1());
              		
            }
            // InternalUSE.g:1215:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUSE.g:1216:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUSE.g:1216:4: (lv_name_2_0= RULE_ID )
            // InternalUSE.g:1217:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getAssociationClassAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAssociationClassRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalUSE.g:1233:3: (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==29) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalUSE.g:1234:4: otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getAssociationClassAccess().getLessThanSignKeyword_3_0());
                      			
                    }
                    // InternalUSE.g:1238:4: ( (lv_generalization_4_0= ruleGeneralization ) )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==RULE_ID) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalUSE.g:1239:5: (lv_generalization_4_0= ruleGeneralization )
                    	    {
                    	    // InternalUSE.g:1239:5: (lv_generalization_4_0= ruleGeneralization )
                    	    // InternalUSE.g:1240:6: lv_generalization_4_0= ruleGeneralization
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getAssociationClassAccess().getGeneralizationGeneralizationParserRuleCall_3_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_29);
                    	    lv_generalization_4_0=ruleGeneralization();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getAssociationClassRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"generalization",
                    	      							lv_generalization_4_0,
                    	      							"modelConverter.use_language.USE.Generalization");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt34 >= 1 ) break loop34;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(34, input);
                                throw eee;
                        }
                        cnt34++;
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getAssociationClassAccess().getBetweenKeyword_4());
              		
            }
            // InternalUSE.g:1262:3: ( (lv_associationEnds_6_0= ruleAssociationEnd ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalUSE.g:1263:4: (lv_associationEnds_6_0= ruleAssociationEnd )
            	    {
            	    // InternalUSE.g:1263:4: (lv_associationEnds_6_0= ruleAssociationEnd )
            	    // InternalUSE.g:1264:5: lv_associationEnds_6_0= ruleAssociationEnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAssociationClassAccess().getAssociationEndsAssociationEndParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_associationEnds_6_0=ruleAssociationEnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getAssociationClassRule());
            	      					}
            	      					add(
            	      						current,
            	      						"associationEnds",
            	      						lv_associationEnds_6_0,
            	      						"modelConverter.use_language.USE.AssociationEnd");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);

            // InternalUSE.g:1281:3: ( (lv_attributes_7_0= ruleAttributesBase ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==40) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalUSE.g:1282:4: (lv_attributes_7_0= ruleAttributesBase )
                    {
                    // InternalUSE.g:1282:4: (lv_attributes_7_0= ruleAttributesBase )
                    // InternalUSE.g:1283:5: lv_attributes_7_0= ruleAttributesBase
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAssociationClassAccess().getAttributesAttributesBaseParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_17);
                    lv_attributes_7_0=ruleAttributesBase();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getAssociationClassRule());
                      					}
                      					set(
                      						current,
                      						"attributes",
                      						lv_attributes_7_0,
                      						"modelConverter.use_language.USE.AttributesBase");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalUSE.g:1300:3: ( (lv_operations_8_0= ruleOperationsBase ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==45) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalUSE.g:1301:4: (lv_operations_8_0= ruleOperationsBase )
                    {
                    // InternalUSE.g:1301:4: (lv_operations_8_0= ruleOperationsBase )
                    // InternalUSE.g:1302:5: lv_operations_8_0= ruleOperationsBase
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAssociationClassAccess().getOperationsOperationsBaseParserRuleCall_7_0());
                      				
                    }
                    pushFollow(FOLLOW_18);
                    lv_operations_8_0=ruleOperationsBase();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getAssociationClassRule());
                      					}
                      					set(
                      						current,
                      						"operations",
                      						lv_operations_8_0,
                      						"modelConverter.use_language.USE.OperationsBase");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalUSE.g:1319:3: ( (lv_constraints_9_0= ruleConstraintsBase ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==56) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalUSE.g:1320:4: (lv_constraints_9_0= ruleConstraintsBase )
                    {
                    // InternalUSE.g:1320:4: (lv_constraints_9_0= ruleConstraintsBase )
                    // InternalUSE.g:1321:5: lv_constraints_9_0= ruleConstraintsBase
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAssociationClassAccess().getConstraintsConstraintsBaseParserRuleCall_8_0());
                      				
                    }
                    pushFollow(FOLLOW_19);
                    lv_constraints_9_0=ruleConstraintsBase();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getAssociationClassRule());
                      					}
                      					set(
                      						current,
                      						"constraints",
                      						lv_constraints_9_0,
                      						"modelConverter.use_language.USE.ConstraintsBase");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalUSE.g:1338:3: ( (lv_statemachines_10_0= ruleStateMachinesBase ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==49) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalUSE.g:1339:4: (lv_statemachines_10_0= ruleStateMachinesBase )
                    {
                    // InternalUSE.g:1339:4: (lv_statemachines_10_0= ruleStateMachinesBase )
                    // InternalUSE.g:1340:5: lv_statemachines_10_0= ruleStateMachinesBase
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAssociationClassAccess().getStatemachinesStateMachinesBaseParserRuleCall_9_0());
                      				
                    }
                    pushFollow(FOLLOW_20);
                    lv_statemachines_10_0=ruleStateMachinesBase();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getAssociationClassRule());
                      					}
                      					set(
                      						current,
                      						"statemachines",
                      						lv_statemachines_10_0,
                      						"modelConverter.use_language.USE.StateMachinesBase");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getAssociationClassAccess().getEndKeyword_10());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssociationClass"


    // $ANTLR start "entryRuleAttributesBase"
    // InternalUSE.g:1365:1: entryRuleAttributesBase returns [EObject current=null] : iv_ruleAttributesBase= ruleAttributesBase EOF ;
    public final EObject entryRuleAttributesBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributesBase = null;


        try {
            // InternalUSE.g:1365:55: (iv_ruleAttributesBase= ruleAttributesBase EOF )
            // InternalUSE.g:1366:2: iv_ruleAttributesBase= ruleAttributesBase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributesBaseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAttributesBase=ruleAttributesBase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributesBase; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributesBase"


    // $ANTLR start "ruleAttributesBase"
    // InternalUSE.g:1372:1: ruleAttributesBase returns [EObject current=null] : (otherlv_0= 'attributes' ( (lv_attributes_1_0= ruleAttribute ) )* ) ;
    public final EObject ruleAttributesBase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_attributes_1_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1378:2: ( (otherlv_0= 'attributes' ( (lv_attributes_1_0= ruleAttribute ) )* ) )
            // InternalUSE.g:1379:2: (otherlv_0= 'attributes' ( (lv_attributes_1_0= ruleAttribute ) )* )
            {
            // InternalUSE.g:1379:2: (otherlv_0= 'attributes' ( (lv_attributes_1_0= ruleAttribute ) )* )
            // InternalUSE.g:1380:3: otherlv_0= 'attributes' ( (lv_attributes_1_0= ruleAttribute ) )*
            {
            otherlv_0=(Token)match(input,40,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAttributesBaseAccess().getAttributesKeyword_0());
              		
            }
            // InternalUSE.g:1384:3: ( (lv_attributes_1_0= ruleAttribute ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalUSE.g:1385:4: (lv_attributes_1_0= ruleAttribute )
            	    {
            	    // InternalUSE.g:1385:4: (lv_attributes_1_0= ruleAttribute )
            	    // InternalUSE.g:1386:5: lv_attributes_1_0= ruleAttribute
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAttributesBaseAccess().getAttributesAttributeParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_30);
            	    lv_attributes_1_0=ruleAttribute();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getAttributesBaseRule());
            	      					}
            	      					add(
            	      						current,
            	      						"attributes",
            	      						lv_attributes_1_0,
            	      						"modelConverter.use_language.USE.Attribute");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributesBase"


    // $ANTLR start "entryRuleAttribute"
    // InternalUSE.g:1407:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalUSE.g:1407:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalUSE.g:1408:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalUSE.g:1414:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAllTypes ) ) (otherlv_3= 'init' otherlv_4= ':' ( (lv_initOCL_5_0= ruleExpCS ) ) )? ( (otherlv_6= 'derive' | otherlv_7= 'derived' ) otherlv_8= ':' ( (lv_deriveOCL_9_0= ruleExpCS ) ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_type_2_0 = null;

        EObject lv_initOCL_5_0 = null;

        EObject lv_deriveOCL_9_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1420:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAllTypes ) ) (otherlv_3= 'init' otherlv_4= ':' ( (lv_initOCL_5_0= ruleExpCS ) ) )? ( (otherlv_6= 'derive' | otherlv_7= 'derived' ) otherlv_8= ':' ( (lv_deriveOCL_9_0= ruleExpCS ) ) )? ) )
            // InternalUSE.g:1421:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAllTypes ) ) (otherlv_3= 'init' otherlv_4= ':' ( (lv_initOCL_5_0= ruleExpCS ) ) )? ( (otherlv_6= 'derive' | otherlv_7= 'derived' ) otherlv_8= ':' ( (lv_deriveOCL_9_0= ruleExpCS ) ) )? )
            {
            // InternalUSE.g:1421:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAllTypes ) ) (otherlv_3= 'init' otherlv_4= ':' ( (lv_initOCL_5_0= ruleExpCS ) ) )? ( (otherlv_6= 'derive' | otherlv_7= 'derived' ) otherlv_8= ':' ( (lv_deriveOCL_9_0= ruleExpCS ) ) )? )
            // InternalUSE.g:1422:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAllTypes ) ) (otherlv_3= 'init' otherlv_4= ':' ( (lv_initOCL_5_0= ruleExpCS ) ) )? ( (otherlv_6= 'derive' | otherlv_7= 'derived' ) otherlv_8= ':' ( (lv_deriveOCL_9_0= ruleExpCS ) ) )?
            {
            // InternalUSE.g:1422:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUSE.g:1423:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUSE.g:1423:4: (lv_name_0_0= RULE_ID )
            // InternalUSE.g:1424:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAttributeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
              		
            }
            // InternalUSE.g:1444:3: ( (lv_type_2_0= ruleAllTypes ) )
            // InternalUSE.g:1445:4: (lv_type_2_0= ruleAllTypes )
            {
            // InternalUSE.g:1445:4: (lv_type_2_0= ruleAllTypes )
            // InternalUSE.g:1446:5: lv_type_2_0= ruleAllTypes
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeAccess().getTypeAllTypesParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_33);
            lv_type_2_0=ruleAllTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAttributeRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"modelConverter.use_language.USE.AllTypes");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUSE.g:1463:3: (otherlv_3= 'init' otherlv_4= ':' ( (lv_initOCL_5_0= ruleExpCS ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==42) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalUSE.g:1464:4: otherlv_3= 'init' otherlv_4= ':' ( (lv_initOCL_5_0= ruleExpCS ) )
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getInitKeyword_3_0());
                      			
                    }
                    otherlv_4=(Token)match(input,41,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getColonKeyword_3_1());
                      			
                    }
                    // InternalUSE.g:1472:4: ( (lv_initOCL_5_0= ruleExpCS ) )
                    // InternalUSE.g:1473:5: (lv_initOCL_5_0= ruleExpCS )
                    {
                    // InternalUSE.g:1473:5: (lv_initOCL_5_0= ruleExpCS )
                    // InternalUSE.g:1474:6: lv_initOCL_5_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAttributeAccess().getInitOCLExpCSParserRuleCall_3_2_0());
                      					
                    }
                    pushFollow(FOLLOW_35);
                    lv_initOCL_5_0=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAttributeRule());
                      						}
                      						set(
                      							current,
                      							"initOCL",
                      							lv_initOCL_5_0,
                      							"modelConverter.use_language.USE.ExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalUSE.g:1492:3: ( (otherlv_6= 'derive' | otherlv_7= 'derived' ) otherlv_8= ':' ( (lv_deriveOCL_9_0= ruleExpCS ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=43 && LA44_0<=44)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalUSE.g:1493:4: (otherlv_6= 'derive' | otherlv_7= 'derived' ) otherlv_8= ':' ( (lv_deriveOCL_9_0= ruleExpCS ) )
                    {
                    // InternalUSE.g:1493:4: (otherlv_6= 'derive' | otherlv_7= 'derived' )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==43) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==44) ) {
                        alt43=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalUSE.g:1494:5: otherlv_6= 'derive'
                            {
                            otherlv_6=(Token)match(input,43,FOLLOW_31); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getDeriveKeyword_4_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalUSE.g:1499:5: otherlv_7= 'derived'
                            {
                            otherlv_7=(Token)match(input,44,FOLLOW_31); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getDerivedKeyword_4_0_1());
                              				
                            }

                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,41,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getColonKeyword_4_1());
                      			
                    }
                    // InternalUSE.g:1508:4: ( (lv_deriveOCL_9_0= ruleExpCS ) )
                    // InternalUSE.g:1509:5: (lv_deriveOCL_9_0= ruleExpCS )
                    {
                    // InternalUSE.g:1509:5: (lv_deriveOCL_9_0= ruleExpCS )
                    // InternalUSE.g:1510:6: lv_deriveOCL_9_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAttributeAccess().getDeriveOCLExpCSParserRuleCall_4_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_deriveOCL_9_0=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAttributeRule());
                      						}
                      						set(
                      							current,
                      							"deriveOCL",
                      							lv_deriveOCL_9_0,
                      							"modelConverter.use_language.USE.ExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleOperationsBase"
    // InternalUSE.g:1532:1: entryRuleOperationsBase returns [EObject current=null] : iv_ruleOperationsBase= ruleOperationsBase EOF ;
    public final EObject entryRuleOperationsBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationsBase = null;


        try {
            // InternalUSE.g:1532:55: (iv_ruleOperationsBase= ruleOperationsBase EOF )
            // InternalUSE.g:1533:2: iv_ruleOperationsBase= ruleOperationsBase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationsBaseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperationsBase=ruleOperationsBase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationsBase; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationsBase"


    // $ANTLR start "ruleOperationsBase"
    // InternalUSE.g:1539:1: ruleOperationsBase returns [EObject current=null] : (otherlv_0= 'operations' ( (lv_operations_1_0= ruleOperationType ) )* ) ;
    public final EObject ruleOperationsBase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_operations_1_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1545:2: ( (otherlv_0= 'operations' ( (lv_operations_1_0= ruleOperationType ) )* ) )
            // InternalUSE.g:1546:2: (otherlv_0= 'operations' ( (lv_operations_1_0= ruleOperationType ) )* )
            {
            // InternalUSE.g:1546:2: (otherlv_0= 'operations' ( (lv_operations_1_0= ruleOperationType ) )* )
            // InternalUSE.g:1547:3: otherlv_0= 'operations' ( (lv_operations_1_0= ruleOperationType ) )*
            {
            otherlv_0=(Token)match(input,45,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOperationsBaseAccess().getOperationsKeyword_0());
              		
            }
            // InternalUSE.g:1551:3: ( (lv_operations_1_0= ruleOperationType ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_ID) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalUSE.g:1552:4: (lv_operations_1_0= ruleOperationType )
            	    {
            	    // InternalUSE.g:1552:4: (lv_operations_1_0= ruleOperationType )
            	    // InternalUSE.g:1553:5: lv_operations_1_0= ruleOperationType
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getOperationsBaseAccess().getOperationsOperationTypeParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_30);
            	    lv_operations_1_0=ruleOperationType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getOperationsBaseRule());
            	      					}
            	      					add(
            	      						current,
            	      						"operations",
            	      						lv_operations_1_0,
            	      						"modelConverter.use_language.USE.OperationType");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationsBase"


    // $ANTLR start "entryRuleOperationType"
    // InternalUSE.g:1574:1: entryRuleOperationType returns [EObject current=null] : iv_ruleOperationType= ruleOperationType EOF ;
    public final EObject entryRuleOperationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationType = null;


        try {
            // InternalUSE.g:1574:54: (iv_ruleOperationType= ruleOperationType EOF )
            // InternalUSE.g:1575:2: iv_ruleOperationType= ruleOperationType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperationType=ruleOperationType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationType"


    // $ANTLR start "ruleOperationType"
    // InternalUSE.g:1581:1: ruleOperationType returns [EObject current=null] : (this_OperationComplex_0= ruleOperationComplex | this_OperationQuery_1= ruleOperationQuery ) ;
    public final EObject ruleOperationType() throws RecognitionException {
        EObject current = null;

        EObject this_OperationComplex_0 = null;

        EObject this_OperationQuery_1 = null;



        	enterRule();

        try {
            // InternalUSE.g:1587:2: ( (this_OperationComplex_0= ruleOperationComplex | this_OperationQuery_1= ruleOperationQuery ) )
            // InternalUSE.g:1588:2: (this_OperationComplex_0= ruleOperationComplex | this_OperationQuery_1= ruleOperationQuery )
            {
            // InternalUSE.g:1588:2: (this_OperationComplex_0= ruleOperationComplex | this_OperationQuery_1= ruleOperationQuery )
            int alt46=2;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // InternalUSE.g:1589:3: this_OperationComplex_0= ruleOperationComplex
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperationTypeAccess().getOperationComplexParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_OperationComplex_0=ruleOperationComplex();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_OperationComplex_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUSE.g:1601:3: this_OperationQuery_1= ruleOperationQuery
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperationTypeAccess().getOperationQueryParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_OperationQuery_1=ruleOperationQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_OperationQuery_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationType"


    // $ANTLR start "entryRuleOperationQuery"
    // InternalUSE.g:1616:1: entryRuleOperationQuery returns [EObject current=null] : iv_ruleOperationQuery= ruleOperationQuery EOF ;
    public final EObject entryRuleOperationQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationQuery = null;


        try {
            // InternalUSE.g:1616:55: (iv_ruleOperationQuery= ruleOperationQuery EOF )
            // InternalUSE.g:1617:2: iv_ruleOperationQuery= ruleOperationQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperationQuery=ruleOperationQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationQuery; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationQuery"


    // $ANTLR start "ruleOperationQuery"
    // InternalUSE.g:1623:1: ruleOperationQuery returns [EObject current=null] : ( ( (lv_operationDeclaration_0_0= ruleOperationDeclaration ) ) otherlv_1= '=' ( (lv_operationbody_2_0= ruleExpCS ) ) (otherlv_3= ';' )? ( (lv_conditions_4_0= ruleConditionType ) )* ) ;
    public final EObject ruleOperationQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operationDeclaration_0_0 = null;

        EObject lv_operationbody_2_0 = null;

        EObject lv_conditions_4_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1629:2: ( ( ( (lv_operationDeclaration_0_0= ruleOperationDeclaration ) ) otherlv_1= '=' ( (lv_operationbody_2_0= ruleExpCS ) ) (otherlv_3= ';' )? ( (lv_conditions_4_0= ruleConditionType ) )* ) )
            // InternalUSE.g:1630:2: ( ( (lv_operationDeclaration_0_0= ruleOperationDeclaration ) ) otherlv_1= '=' ( (lv_operationbody_2_0= ruleExpCS ) ) (otherlv_3= ';' )? ( (lv_conditions_4_0= ruleConditionType ) )* )
            {
            // InternalUSE.g:1630:2: ( ( (lv_operationDeclaration_0_0= ruleOperationDeclaration ) ) otherlv_1= '=' ( (lv_operationbody_2_0= ruleExpCS ) ) (otherlv_3= ';' )? ( (lv_conditions_4_0= ruleConditionType ) )* )
            // InternalUSE.g:1631:3: ( (lv_operationDeclaration_0_0= ruleOperationDeclaration ) ) otherlv_1= '=' ( (lv_operationbody_2_0= ruleExpCS ) ) (otherlv_3= ';' )? ( (lv_conditions_4_0= ruleConditionType ) )*
            {
            // InternalUSE.g:1631:3: ( (lv_operationDeclaration_0_0= ruleOperationDeclaration ) )
            // InternalUSE.g:1632:4: (lv_operationDeclaration_0_0= ruleOperationDeclaration )
            {
            // InternalUSE.g:1632:4: (lv_operationDeclaration_0_0= ruleOperationDeclaration )
            // InternalUSE.g:1633:5: lv_operationDeclaration_0_0= ruleOperationDeclaration
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOperationQueryAccess().getOperationDeclarationOperationDeclarationParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_36);
            lv_operationDeclaration_0_0=ruleOperationDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOperationQueryRule());
              					}
              					set(
              						current,
              						"operationDeclaration",
              						lv_operationDeclaration_0_0,
              						"modelConverter.use_language.USE.OperationDeclaration");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,46,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getOperationQueryAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalUSE.g:1654:3: ( (lv_operationbody_2_0= ruleExpCS ) )
            // InternalUSE.g:1655:4: (lv_operationbody_2_0= ruleExpCS )
            {
            // InternalUSE.g:1655:4: (lv_operationbody_2_0= ruleExpCS )
            // InternalUSE.g:1656:5: lv_operationbody_2_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOperationQueryAccess().getOperationbodyExpCSParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_37);
            lv_operationbody_2_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOperationQueryRule());
              					}
              					set(
              						current,
              						"operationbody",
              						lv_operationbody_2_0,
              						"modelConverter.use_language.USE.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUSE.g:1673:3: (otherlv_3= ';' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==47) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalUSE.g:1674:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,47,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getOperationQueryAccess().getSemicolonKeyword_3());
                      			
                    }

                    }
                    break;

            }

            // InternalUSE.g:1679:3: ( (lv_conditions_4_0= ruleConditionType ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=60 && LA48_0<=61)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalUSE.g:1680:4: (lv_conditions_4_0= ruleConditionType )
            	    {
            	    // InternalUSE.g:1680:4: (lv_conditions_4_0= ruleConditionType )
            	    // InternalUSE.g:1681:5: lv_conditions_4_0= ruleConditionType
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getOperationQueryAccess().getConditionsConditionTypeParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_38);
            	    lv_conditions_4_0=ruleConditionType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getOperationQueryRule());
            	      					}
            	      					add(
            	      						current,
            	      						"conditions",
            	      						lv_conditions_4_0,
            	      						"modelConverter.use_language.USE.ConditionType");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationQuery"


    // $ANTLR start "entryRuleOperationComplex"
    // InternalUSE.g:1702:1: entryRuleOperationComplex returns [EObject current=null] : iv_ruleOperationComplex= ruleOperationComplex EOF ;
    public final EObject entryRuleOperationComplex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationComplex = null;


        try {
            // InternalUSE.g:1702:57: (iv_ruleOperationComplex= ruleOperationComplex EOF )
            // InternalUSE.g:1703:2: iv_ruleOperationComplex= ruleOperationComplex EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationComplexRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperationComplex=ruleOperationComplex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationComplex; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationComplex"


    // $ANTLR start "ruleOperationComplex"
    // InternalUSE.g:1709:1: ruleOperationComplex returns [EObject current=null] : ( ( (lv_operationDeclaration_0_0= ruleOperationDeclaration ) ) (otherlv_1= 'begin' ( (lv_operationbody_2_0= ruleBeginEnd ) )? otherlv_3= 'end' )? ( (lv_conditions_4_0= ruleConditionType ) )* ) ;
    public final EObject ruleOperationComplex() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operationDeclaration_0_0 = null;

        AntlrDatatypeRuleToken lv_operationbody_2_0 = null;

        EObject lv_conditions_4_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1715:2: ( ( ( (lv_operationDeclaration_0_0= ruleOperationDeclaration ) ) (otherlv_1= 'begin' ( (lv_operationbody_2_0= ruleBeginEnd ) )? otherlv_3= 'end' )? ( (lv_conditions_4_0= ruleConditionType ) )* ) )
            // InternalUSE.g:1716:2: ( ( (lv_operationDeclaration_0_0= ruleOperationDeclaration ) ) (otherlv_1= 'begin' ( (lv_operationbody_2_0= ruleBeginEnd ) )? otherlv_3= 'end' )? ( (lv_conditions_4_0= ruleConditionType ) )* )
            {
            // InternalUSE.g:1716:2: ( ( (lv_operationDeclaration_0_0= ruleOperationDeclaration ) ) (otherlv_1= 'begin' ( (lv_operationbody_2_0= ruleBeginEnd ) )? otherlv_3= 'end' )? ( (lv_conditions_4_0= ruleConditionType ) )* )
            // InternalUSE.g:1717:3: ( (lv_operationDeclaration_0_0= ruleOperationDeclaration ) ) (otherlv_1= 'begin' ( (lv_operationbody_2_0= ruleBeginEnd ) )? otherlv_3= 'end' )? ( (lv_conditions_4_0= ruleConditionType ) )*
            {
            // InternalUSE.g:1717:3: ( (lv_operationDeclaration_0_0= ruleOperationDeclaration ) )
            // InternalUSE.g:1718:4: (lv_operationDeclaration_0_0= ruleOperationDeclaration )
            {
            // InternalUSE.g:1718:4: (lv_operationDeclaration_0_0= ruleOperationDeclaration )
            // InternalUSE.g:1719:5: lv_operationDeclaration_0_0= ruleOperationDeclaration
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOperationComplexAccess().getOperationDeclarationOperationDeclarationParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_39);
            lv_operationDeclaration_0_0=ruleOperationDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOperationComplexRule());
              					}
              					set(
              						current,
              						"operationDeclaration",
              						lv_operationDeclaration_0_0,
              						"modelConverter.use_language.USE.OperationDeclaration");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUSE.g:1736:3: (otherlv_1= 'begin' ( (lv_operationbody_2_0= ruleBeginEnd ) )? otherlv_3= 'end' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==48) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalUSE.g:1737:4: otherlv_1= 'begin' ( (lv_operationbody_2_0= ruleBeginEnd ) )? otherlv_3= 'end'
                    {
                    otherlv_1=(Token)match(input,48,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getOperationComplexAccess().getBeginKeyword_1_0());
                      			
                    }
                    // InternalUSE.g:1741:4: ( (lv_operationbody_2_0= ruleBeginEnd ) )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==RULE_STRING) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalUSE.g:1742:5: (lv_operationbody_2_0= ruleBeginEnd )
                            {
                            // InternalUSE.g:1742:5: (lv_operationbody_2_0= ruleBeginEnd )
                            // InternalUSE.g:1743:6: lv_operationbody_2_0= ruleBeginEnd
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getOperationComplexAccess().getOperationbodyBeginEndParserRuleCall_1_1_0());
                              					
                            }
                            pushFollow(FOLLOW_20);
                            lv_operationbody_2_0=ruleBeginEnd();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getOperationComplexRule());
                              						}
                              						set(
                              							current,
                              							"operationbody",
                              							lv_operationbody_2_0,
                              							"modelConverter.use_language.USE.BeginEnd");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,30,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getOperationComplexAccess().getEndKeyword_1_2());
                      			
                    }

                    }
                    break;

            }

            // InternalUSE.g:1765:3: ( (lv_conditions_4_0= ruleConditionType ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=60 && LA51_0<=61)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalUSE.g:1766:4: (lv_conditions_4_0= ruleConditionType )
            	    {
            	    // InternalUSE.g:1766:4: (lv_conditions_4_0= ruleConditionType )
            	    // InternalUSE.g:1767:5: lv_conditions_4_0= ruleConditionType
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getOperationComplexAccess().getConditionsConditionTypeParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_38);
            	    lv_conditions_4_0=ruleConditionType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getOperationComplexRule());
            	      					}
            	      					add(
            	      						current,
            	      						"conditions",
            	      						lv_conditions_4_0,
            	      						"modelConverter.use_language.USE.ConditionType");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationComplex"


    // $ANTLR start "entryRuleOperationDeclaration"
    // InternalUSE.g:1788:1: entryRuleOperationDeclaration returns [EObject current=null] : iv_ruleOperationDeclaration= ruleOperationDeclaration EOF ;
    public final EObject entryRuleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDeclaration = null;


        try {
            // InternalUSE.g:1788:61: (iv_ruleOperationDeclaration= ruleOperationDeclaration EOF )
            // InternalUSE.g:1789:2: iv_ruleOperationDeclaration= ruleOperationDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperationDeclaration=ruleOperationDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationDeclaration"


    // $ANTLR start "ruleOperationDeclaration"
    // InternalUSE.g:1795:1: ruleOperationDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) )* otherlv_3= ')' (otherlv_4= ':' ( (lv_returnType_5_0= ruleAllTypes ) ) )? ) ;
    public final EObject ruleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_returnType_5_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1801:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) )* otherlv_3= ')' (otherlv_4= ':' ( (lv_returnType_5_0= ruleAllTypes ) ) )? ) )
            // InternalUSE.g:1802:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) )* otherlv_3= ')' (otherlv_4= ':' ( (lv_returnType_5_0= ruleAllTypes ) ) )? )
            {
            // InternalUSE.g:1802:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) )* otherlv_3= ')' (otherlv_4= ':' ( (lv_returnType_5_0= ruleAllTypes ) ) )? )
            // InternalUSE.g:1803:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) )* otherlv_3= ')' (otherlv_4= ':' ( (lv_returnType_5_0= ruleAllTypes ) ) )?
            {
            // InternalUSE.g:1803:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUSE.g:1804:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUSE.g:1804:4: (lv_name_0_0= RULE_ID )
            // InternalUSE.g:1805:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getOperationDeclarationAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getOperationDeclarationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getOperationDeclarationAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalUSE.g:1825:3: ( (lv_parameters_2_0= ruleParameter ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==RULE_ID) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalUSE.g:1826:4: (lv_parameters_2_0= ruleParameter )
            	    {
            	    // InternalUSE.g:1826:4: (lv_parameters_2_0= ruleParameter )
            	    // InternalUSE.g:1827:5: lv_parameters_2_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getOperationDeclarationAccess().getParametersParameterParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_41);
            	    lv_parameters_2_0=ruleParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getOperationDeclarationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"parameters",
            	      						lv_parameters_2_0,
            	      						"modelConverter.use_language.USE.Parameter");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            otherlv_3=(Token)match(input,23,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getOperationDeclarationAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalUSE.g:1848:3: (otherlv_4= ':' ( (lv_returnType_5_0= ruleAllTypes ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==41) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalUSE.g:1849:4: otherlv_4= ':' ( (lv_returnType_5_0= ruleAllTypes ) )
                    {
                    otherlv_4=(Token)match(input,41,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getOperationDeclarationAccess().getColonKeyword_4_0());
                      			
                    }
                    // InternalUSE.g:1853:4: ( (lv_returnType_5_0= ruleAllTypes ) )
                    // InternalUSE.g:1854:5: (lv_returnType_5_0= ruleAllTypes )
                    {
                    // InternalUSE.g:1854:5: (lv_returnType_5_0= ruleAllTypes )
                    // InternalUSE.g:1855:6: lv_returnType_5_0= ruleAllTypes
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOperationDeclarationAccess().getReturnTypeAllTypesParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_returnType_5_0=ruleAllTypes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOperationDeclarationRule());
                      						}
                      						set(
                      							current,
                      							"returnType",
                      							lv_returnType_5_0,
                      							"modelConverter.use_language.USE.AllTypes");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationDeclaration"


    // $ANTLR start "entryRuleParameter"
    // InternalUSE.g:1877:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalUSE.g:1877:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalUSE.g:1878:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalUSE.g:1884:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAllTypes ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1890:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAllTypes ) ) (otherlv_3= ',' )? ) )
            // InternalUSE.g:1891:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAllTypes ) ) (otherlv_3= ',' )? )
            {
            // InternalUSE.g:1891:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAllTypes ) ) (otherlv_3= ',' )? )
            // InternalUSE.g:1892:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAllTypes ) ) (otherlv_3= ',' )?
            {
            // InternalUSE.g:1892:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUSE.g:1893:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUSE.g:1893:4: (lv_name_0_0= RULE_ID )
            // InternalUSE.g:1894:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getParameterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
              		
            }
            // InternalUSE.g:1914:3: ( (lv_type_2_0= ruleAllTypes ) )
            // InternalUSE.g:1915:4: (lv_type_2_0= ruleAllTypes )
            {
            // InternalUSE.g:1915:4: (lv_type_2_0= ruleAllTypes )
            // InternalUSE.g:1916:5: lv_type_2_0= ruleAllTypes
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterAccess().getTypeAllTypesParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_type_2_0=ruleAllTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"modelConverter.use_language.USE.AllTypes");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUSE.g:1933:3: (otherlv_3= ',' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==14) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalUSE.g:1934:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getCommaKeyword_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleStateMachinesBase"
    // InternalUSE.g:1943:1: entryRuleStateMachinesBase returns [EObject current=null] : iv_ruleStateMachinesBase= ruleStateMachinesBase EOF ;
    public final EObject entryRuleStateMachinesBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMachinesBase = null;


        try {
            // InternalUSE.g:1943:58: (iv_ruleStateMachinesBase= ruleStateMachinesBase EOF )
            // InternalUSE.g:1944:2: iv_ruleStateMachinesBase= ruleStateMachinesBase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateMachinesBaseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStateMachinesBase=ruleStateMachinesBase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateMachinesBase; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateMachinesBase"


    // $ANTLR start "ruleStateMachinesBase"
    // InternalUSE.g:1950:1: ruleStateMachinesBase returns [EObject current=null] : (otherlv_0= 'statemachines' ( (lv_statemachines_1_0= ruleStateMachine ) )* ) ;
    public final EObject ruleStateMachinesBase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_statemachines_1_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1956:2: ( (otherlv_0= 'statemachines' ( (lv_statemachines_1_0= ruleStateMachine ) )* ) )
            // InternalUSE.g:1957:2: (otherlv_0= 'statemachines' ( (lv_statemachines_1_0= ruleStateMachine ) )* )
            {
            // InternalUSE.g:1957:2: (otherlv_0= 'statemachines' ( (lv_statemachines_1_0= ruleStateMachine ) )* )
            // InternalUSE.g:1958:3: otherlv_0= 'statemachines' ( (lv_statemachines_1_0= ruleStateMachine ) )*
            {
            otherlv_0=(Token)match(input,49,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStateMachinesBaseAccess().getStatemachinesKeyword_0());
              		
            }
            // InternalUSE.g:1962:3: ( (lv_statemachines_1_0= ruleStateMachine ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==50) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalUSE.g:1963:4: (lv_statemachines_1_0= ruleStateMachine )
            	    {
            	    // InternalUSE.g:1963:4: (lv_statemachines_1_0= ruleStateMachine )
            	    // InternalUSE.g:1964:5: lv_statemachines_1_0= ruleStateMachine
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getStateMachinesBaseAccess().getStatemachinesStateMachineParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_43);
            	    lv_statemachines_1_0=ruleStateMachine();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getStateMachinesBaseRule());
            	      					}
            	      					add(
            	      						current,
            	      						"statemachines",
            	      						lv_statemachines_1_0,
            	      						"modelConverter.use_language.USE.StateMachine");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateMachinesBase"


    // $ANTLR start "entryRuleStateMachine"
    // InternalUSE.g:1985:1: entryRuleStateMachine returns [EObject current=null] : iv_ruleStateMachine= ruleStateMachine EOF ;
    public final EObject entryRuleStateMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMachine = null;


        try {
            // InternalUSE.g:1985:53: (iv_ruleStateMachine= ruleStateMachine EOF )
            // InternalUSE.g:1986:2: iv_ruleStateMachine= ruleStateMachine EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateMachineRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStateMachine=ruleStateMachine();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateMachine; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // InternalUSE.g:1992:1: ruleStateMachine returns [EObject current=null] : (otherlv_0= 'psm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'states' ( (lv_states_3_0= ruleState ) )+ otherlv_4= 'transitions' ( (lv_transitions_5_0= ruleTransition ) )* otherlv_6= 'end' ) ;
    public final EObject ruleStateMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_states_3_0 = null;

        EObject lv_transitions_5_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1998:2: ( (otherlv_0= 'psm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'states' ( (lv_states_3_0= ruleState ) )+ otherlv_4= 'transitions' ( (lv_transitions_5_0= ruleTransition ) )* otherlv_6= 'end' ) )
            // InternalUSE.g:1999:2: (otherlv_0= 'psm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'states' ( (lv_states_3_0= ruleState ) )+ otherlv_4= 'transitions' ( (lv_transitions_5_0= ruleTransition ) )* otherlv_6= 'end' )
            {
            // InternalUSE.g:1999:2: (otherlv_0= 'psm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'states' ( (lv_states_3_0= ruleState ) )+ otherlv_4= 'transitions' ( (lv_transitions_5_0= ruleTransition ) )* otherlv_6= 'end' )
            // InternalUSE.g:2000:3: otherlv_0= 'psm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'states' ( (lv_states_3_0= ruleState ) )+ otherlv_4= 'transitions' ( (lv_transitions_5_0= ruleTransition ) )* otherlv_6= 'end'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStateMachineAccess().getPsmKeyword_0());
              		
            }
            // InternalUSE.g:2004:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUSE.g:2005:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUSE.g:2005:4: (lv_name_1_0= RULE_ID )
            // InternalUSE.g:2006:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStateMachineRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,51,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getStateMachineAccess().getStatesKeyword_2());
              		
            }
            // InternalUSE.g:2026:3: ( (lv_states_3_0= ruleState ) )+
            int cnt56=0;
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==RULE_ID) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalUSE.g:2027:4: (lv_states_3_0= ruleState )
            	    {
            	    // InternalUSE.g:2027:4: (lv_states_3_0= ruleState )
            	    // InternalUSE.g:2028:5: lv_states_3_0= ruleState
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_45);
            	    lv_states_3_0=ruleState();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	      					}
            	      					add(
            	      						current,
            	      						"states",
            	      						lv_states_3_0,
            	      						"modelConverter.use_language.USE.State");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt56 >= 1 ) break loop56;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(56, input);
                        throw eee;
                }
                cnt56++;
            } while (true);

            otherlv_4=(Token)match(input,52,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getStateMachineAccess().getTransitionsKeyword_4());
              		
            }
            // InternalUSE.g:2049:3: ( (lv_transitions_5_0= ruleTransition ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==RULE_ID) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalUSE.g:2050:4: (lv_transitions_5_0= ruleTransition )
            	    {
            	    // InternalUSE.g:2050:4: (lv_transitions_5_0= ruleTransition )
            	    // InternalUSE.g:2051:5: lv_transitions_5_0= ruleTransition
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_transitions_5_0=ruleTransition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	      					}
            	      					add(
            	      						current,
            	      						"transitions",
            	      						lv_transitions_5_0,
            	      						"modelConverter.use_language.USE.Transition");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            otherlv_6=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getStateMachineAccess().getEndKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleState"
    // InternalUSE.g:2076:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalUSE.g:2076:46: (iv_ruleState= ruleState EOF )
            // InternalUSE.g:2077:2: iv_ruleState= ruleState EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleState; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalUSE.g:2083:1: ruleState returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= ':' ( (lv_isInitial_2_0= 'initial' ) ) ) | (otherlv_3= ':' ( (lv_isFinal_4_0= 'final' ) ) ) | (otherlv_5= '[' ( (lv_invariant_6_0= ruleExpCS ) ) otherlv_7= ']' ) )? ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_isInitial_2_0=null;
        Token otherlv_3=null;
        Token lv_isFinal_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_invariant_6_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:2089:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= ':' ( (lv_isInitial_2_0= 'initial' ) ) ) | (otherlv_3= ':' ( (lv_isFinal_4_0= 'final' ) ) ) | (otherlv_5= '[' ( (lv_invariant_6_0= ruleExpCS ) ) otherlv_7= ']' ) )? ) )
            // InternalUSE.g:2090:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= ':' ( (lv_isInitial_2_0= 'initial' ) ) ) | (otherlv_3= ':' ( (lv_isFinal_4_0= 'final' ) ) ) | (otherlv_5= '[' ( (lv_invariant_6_0= ruleExpCS ) ) otherlv_7= ']' ) )? )
            {
            // InternalUSE.g:2090:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= ':' ( (lv_isInitial_2_0= 'initial' ) ) ) | (otherlv_3= ':' ( (lv_isFinal_4_0= 'final' ) ) ) | (otherlv_5= '[' ( (lv_invariant_6_0= ruleExpCS ) ) otherlv_7= ']' ) )? )
            // InternalUSE.g:2091:3: ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= ':' ( (lv_isInitial_2_0= 'initial' ) ) ) | (otherlv_3= ':' ( (lv_isFinal_4_0= 'final' ) ) ) | (otherlv_5= '[' ( (lv_invariant_6_0= ruleExpCS ) ) otherlv_7= ']' ) )?
            {
            // InternalUSE.g:2091:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUSE.g:2092:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUSE.g:2092:4: (lv_name_0_0= RULE_ID )
            // InternalUSE.g:2093:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStateRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalUSE.g:2109:3: ( (otherlv_1= ':' ( (lv_isInitial_2_0= 'initial' ) ) ) | (otherlv_3= ':' ( (lv_isFinal_4_0= 'final' ) ) ) | (otherlv_5= '[' ( (lv_invariant_6_0= ruleExpCS ) ) otherlv_7= ']' ) )?
            int alt58=4;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==41) ) {
                int LA58_1 = input.LA(2);

                if ( (LA58_1==53) ) {
                    alt58=1;
                }
                else if ( (LA58_1==54) ) {
                    alt58=2;
                }
            }
            else if ( (LA58_0==35) ) {
                alt58=3;
            }
            switch (alt58) {
                case 1 :
                    // InternalUSE.g:2110:4: (otherlv_1= ':' ( (lv_isInitial_2_0= 'initial' ) ) )
                    {
                    // InternalUSE.g:2110:4: (otherlv_1= ':' ( (lv_isInitial_2_0= 'initial' ) ) )
                    // InternalUSE.g:2111:5: otherlv_1= ':' ( (lv_isInitial_2_0= 'initial' ) )
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getStateAccess().getColonKeyword_1_0_0());
                      				
                    }
                    // InternalUSE.g:2115:5: ( (lv_isInitial_2_0= 'initial' ) )
                    // InternalUSE.g:2116:6: (lv_isInitial_2_0= 'initial' )
                    {
                    // InternalUSE.g:2116:6: (lv_isInitial_2_0= 'initial' )
                    // InternalUSE.g:2117:7: lv_isInitial_2_0= 'initial'
                    {
                    lv_isInitial_2_0=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_isInitial_2_0, grammarAccess.getStateAccess().getIsInitialInitialKeyword_1_0_1_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getStateRule());
                      							}
                      							setWithLastConsumed(current, "isInitial", lv_isInitial_2_0 != null, "initial");
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:2131:4: (otherlv_3= ':' ( (lv_isFinal_4_0= 'final' ) ) )
                    {
                    // InternalUSE.g:2131:4: (otherlv_3= ':' ( (lv_isFinal_4_0= 'final' ) ) )
                    // InternalUSE.g:2132:5: otherlv_3= ':' ( (lv_isFinal_4_0= 'final' ) )
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getStateAccess().getColonKeyword_1_1_0());
                      				
                    }
                    // InternalUSE.g:2136:5: ( (lv_isFinal_4_0= 'final' ) )
                    // InternalUSE.g:2137:6: (lv_isFinal_4_0= 'final' )
                    {
                    // InternalUSE.g:2137:6: (lv_isFinal_4_0= 'final' )
                    // InternalUSE.g:2138:7: lv_isFinal_4_0= 'final'
                    {
                    lv_isFinal_4_0=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_isFinal_4_0, grammarAccess.getStateAccess().getIsFinalFinalKeyword_1_1_1_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getStateRule());
                      							}
                      							setWithLastConsumed(current, "isFinal", lv_isFinal_4_0 != null, "final");
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalUSE.g:2152:4: (otherlv_5= '[' ( (lv_invariant_6_0= ruleExpCS ) ) otherlv_7= ']' )
                    {
                    // InternalUSE.g:2152:4: (otherlv_5= '[' ( (lv_invariant_6_0= ruleExpCS ) ) otherlv_7= ']' )
                    // InternalUSE.g:2153:5: otherlv_5= '[' ( (lv_invariant_6_0= ruleExpCS ) ) otherlv_7= ']'
                    {
                    otherlv_5=(Token)match(input,35,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getStateAccess().getLeftSquareBracketKeyword_1_2_0());
                      				
                    }
                    // InternalUSE.g:2157:5: ( (lv_invariant_6_0= ruleExpCS ) )
                    // InternalUSE.g:2158:6: (lv_invariant_6_0= ruleExpCS )
                    {
                    // InternalUSE.g:2158:6: (lv_invariant_6_0= ruleExpCS )
                    // InternalUSE.g:2159:7: lv_invariant_6_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getStateAccess().getInvariantExpCSParserRuleCall_1_2_1_0());
                      						
                    }
                    pushFollow(FOLLOW_24);
                    lv_invariant_6_0=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getStateRule());
                      							}
                      							set(
                      								current,
                      								"invariant",
                      								lv_invariant_6_0,
                      								"modelConverter.use_language.USE.ExpCS");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getStateAccess().getRightSquareBracketKeyword_1_2_2());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalUSE.g:2186:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalUSE.g:2186:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalUSE.g:2187:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalUSE.g:2193:1: ruleTransition returns [EObject current=null] : ( ( (lv_source_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_target_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= '[' ( (lv_precondition_5_0= ruleExpCS ) ) otherlv_6= ']' )? ( (otherlv_7= RULE_ID ) ) otherlv_8= '(' otherlv_9= ')' (otherlv_10= '[' ( (lv_postcondition_11_0= ruleExpCS ) ) otherlv_12= ']' )? otherlv_13= '}' )? ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token lv_source_0_0=null;
        Token otherlv_1=null;
        Token lv_target_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_precondition_5_0 = null;

        EObject lv_postcondition_11_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:2199:2: ( ( ( (lv_source_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_target_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= '[' ( (lv_precondition_5_0= ruleExpCS ) ) otherlv_6= ']' )? ( (otherlv_7= RULE_ID ) ) otherlv_8= '(' otherlv_9= ')' (otherlv_10= '[' ( (lv_postcondition_11_0= ruleExpCS ) ) otherlv_12= ']' )? otherlv_13= '}' )? ) )
            // InternalUSE.g:2200:2: ( ( (lv_source_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_target_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= '[' ( (lv_precondition_5_0= ruleExpCS ) ) otherlv_6= ']' )? ( (otherlv_7= RULE_ID ) ) otherlv_8= '(' otherlv_9= ')' (otherlv_10= '[' ( (lv_postcondition_11_0= ruleExpCS ) ) otherlv_12= ']' )? otherlv_13= '}' )? )
            {
            // InternalUSE.g:2200:2: ( ( (lv_source_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_target_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= '[' ( (lv_precondition_5_0= ruleExpCS ) ) otherlv_6= ']' )? ( (otherlv_7= RULE_ID ) ) otherlv_8= '(' otherlv_9= ')' (otherlv_10= '[' ( (lv_postcondition_11_0= ruleExpCS ) ) otherlv_12= ']' )? otherlv_13= '}' )? )
            // InternalUSE.g:2201:3: ( (lv_source_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_target_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= '[' ( (lv_precondition_5_0= ruleExpCS ) ) otherlv_6= ']' )? ( (otherlv_7= RULE_ID ) ) otherlv_8= '(' otherlv_9= ')' (otherlv_10= '[' ( (lv_postcondition_11_0= ruleExpCS ) ) otherlv_12= ']' )? otherlv_13= '}' )?
            {
            // InternalUSE.g:2201:3: ( (lv_source_0_0= RULE_ID ) )
            // InternalUSE.g:2202:4: (lv_source_0_0= RULE_ID )
            {
            // InternalUSE.g:2202:4: (lv_source_0_0= RULE_ID )
            // InternalUSE.g:2203:5: lv_source_0_0= RULE_ID
            {
            lv_source_0_0=(Token)match(input,RULE_ID,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_source_0_0, grammarAccess.getTransitionAccess().getSourceIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTransitionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"source",
              						lv_source_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,55,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1());
              		
            }
            // InternalUSE.g:2223:3: ( (lv_target_2_0= RULE_ID ) )
            // InternalUSE.g:2224:4: (lv_target_2_0= RULE_ID )
            {
            // InternalUSE.g:2224:4: (lv_target_2_0= RULE_ID )
            // InternalUSE.g:2225:5: lv_target_2_0= RULE_ID
            {
            lv_target_2_0=(Token)match(input,RULE_ID,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_target_2_0, grammarAccess.getTransitionAccess().getTargetIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTransitionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"target",
              						lv_target_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalUSE.g:2241:3: (otherlv_3= '{' (otherlv_4= '[' ( (lv_precondition_5_0= ruleExpCS ) ) otherlv_6= ']' )? ( (otherlv_7= RULE_ID ) ) otherlv_8= '(' otherlv_9= ')' (otherlv_10= '[' ( (lv_postcondition_11_0= ruleExpCS ) ) otherlv_12= ']' )? otherlv_13= '}' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==25) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalUSE.g:2242:4: otherlv_3= '{' (otherlv_4= '[' ( (lv_precondition_5_0= ruleExpCS ) ) otherlv_6= ']' )? ( (otherlv_7= RULE_ID ) ) otherlv_8= '(' otherlv_9= ')' (otherlv_10= '[' ( (lv_postcondition_11_0= ruleExpCS ) ) otherlv_12= ']' )? otherlv_13= '}'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_3_0());
                      			
                    }
                    // InternalUSE.g:2246:4: (otherlv_4= '[' ( (lv_precondition_5_0= ruleExpCS ) ) otherlv_6= ']' )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==35) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // InternalUSE.g:2247:5: otherlv_4= '[' ( (lv_precondition_5_0= ruleExpCS ) ) otherlv_6= ']'
                            {
                            otherlv_4=(Token)match(input,35,FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_3_1_0());
                              				
                            }
                            // InternalUSE.g:2251:5: ( (lv_precondition_5_0= ruleExpCS ) )
                            // InternalUSE.g:2252:6: (lv_precondition_5_0= ruleExpCS )
                            {
                            // InternalUSE.g:2252:6: (lv_precondition_5_0= ruleExpCS )
                            // InternalUSE.g:2253:7: lv_precondition_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTransitionAccess().getPreconditionExpCSParserRuleCall_3_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_24);
                            lv_precondition_5_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTransitionRule());
                              							}
                              							set(
                              								current,
                              								"precondition",
                              								lv_precondition_5_0,
                              								"modelConverter.use_language.USE.ExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            otherlv_6=(Token)match(input,36,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_3_1_2());
                              				
                            }

                            }
                            break;

                    }

                    // InternalUSE.g:2275:4: ( (otherlv_7= RULE_ID ) )
                    // InternalUSE.g:2276:5: (otherlv_7= RULE_ID )
                    {
                    // InternalUSE.g:2276:5: (otherlv_7= RULE_ID )
                    // InternalUSE.g:2277:6: otherlv_7= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTransitionRule());
                      						}
                      					
                    }
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getOperationOperationDeclarationCrossReference_3_2_0());
                      					
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,22,FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_3_3());
                      			
                    }
                    otherlv_9=(Token)match(input,23,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getRightParenthesisKeyword_3_4());
                      			
                    }
                    // InternalUSE.g:2299:4: (otherlv_10= '[' ( (lv_postcondition_11_0= ruleExpCS ) ) otherlv_12= ']' )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==35) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // InternalUSE.g:2300:5: otherlv_10= '[' ( (lv_postcondition_11_0= ruleExpCS ) ) otherlv_12= ']'
                            {
                            otherlv_10=(Token)match(input,35,FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_10, grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_3_5_0());
                              				
                            }
                            // InternalUSE.g:2304:5: ( (lv_postcondition_11_0= ruleExpCS ) )
                            // InternalUSE.g:2305:6: (lv_postcondition_11_0= ruleExpCS )
                            {
                            // InternalUSE.g:2305:6: (lv_postcondition_11_0= ruleExpCS )
                            // InternalUSE.g:2306:7: lv_postcondition_11_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTransitionAccess().getPostconditionExpCSParserRuleCall_3_5_1_0());
                              						
                            }
                            pushFollow(FOLLOW_24);
                            lv_postcondition_11_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTransitionRule());
                              							}
                              							set(
                              								current,
                              								"postcondition",
                              								lv_postcondition_11_0,
                              								"modelConverter.use_language.USE.ExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            otherlv_12=(Token)match(input,36,FOLLOW_54); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_12, grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_3_5_2());
                              				
                            }

                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_3_6());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleConstraintsBase"
    // InternalUSE.g:2337:1: entryRuleConstraintsBase returns [EObject current=null] : iv_ruleConstraintsBase= ruleConstraintsBase EOF ;
    public final EObject entryRuleConstraintsBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintsBase = null;


        try {
            // InternalUSE.g:2337:56: (iv_ruleConstraintsBase= ruleConstraintsBase EOF )
            // InternalUSE.g:2338:2: iv_ruleConstraintsBase= ruleConstraintsBase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstraintsBaseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstraintsBase=ruleConstraintsBase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstraintsBase; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraintsBase"


    // $ANTLR start "ruleConstraintsBase"
    // InternalUSE.g:2344:1: ruleConstraintsBase returns [EObject current=null] : (otherlv_0= 'constraints' ( (lv_invariants_1_0= ruleInvariantDefinition ) )* ) ;
    public final EObject ruleConstraintsBase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_invariants_1_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:2350:2: ( (otherlv_0= 'constraints' ( (lv_invariants_1_0= ruleInvariantDefinition ) )* ) )
            // InternalUSE.g:2351:2: (otherlv_0= 'constraints' ( (lv_invariants_1_0= ruleInvariantDefinition ) )* )
            {
            // InternalUSE.g:2351:2: (otherlv_0= 'constraints' ( (lv_invariants_1_0= ruleInvariantDefinition ) )* )
            // InternalUSE.g:2352:3: otherlv_0= 'constraints' ( (lv_invariants_1_0= ruleInvariantDefinition ) )*
            {
            otherlv_0=(Token)match(input,56,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConstraintsBaseAccess().getConstraintsKeyword_0());
              		
            }
            // InternalUSE.g:2356:3: ( (lv_invariants_1_0= ruleInvariantDefinition ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==58) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalUSE.g:2357:4: (lv_invariants_1_0= ruleInvariantDefinition )
            	    {
            	    // InternalUSE.g:2357:4: (lv_invariants_1_0= ruleInvariantDefinition )
            	    // InternalUSE.g:2358:5: lv_invariants_1_0= ruleInvariantDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getConstraintsBaseAccess().getInvariantsInvariantDefinitionParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_55);
            	    lv_invariants_1_0=ruleInvariantDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getConstraintsBaseRule());
            	      					}
            	      					add(
            	      						current,
            	      						"invariants",
            	      						lv_invariants_1_0,
            	      						"modelConverter.use_language.USE.InvariantDefinition");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraintsBase"


    // $ANTLR start "entryRuleConstrainsGeneral"
    // InternalUSE.g:2379:1: entryRuleConstrainsGeneral returns [EObject current=null] : iv_ruleConstrainsGeneral= ruleConstrainsGeneral EOF ;
    public final EObject entryRuleConstrainsGeneral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstrainsGeneral = null;


        try {
            // InternalUSE.g:2379:58: (iv_ruleConstrainsGeneral= ruleConstrainsGeneral EOF )
            // InternalUSE.g:2380:2: iv_ruleConstrainsGeneral= ruleConstrainsGeneral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstrainsGeneralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstrainsGeneral=ruleConstrainsGeneral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstrainsGeneral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstrainsGeneral"


    // $ANTLR start "ruleConstrainsGeneral"
    // InternalUSE.g:2386:1: ruleConstrainsGeneral returns [EObject current=null] : (otherlv_0= 'constraints' ( (lv_contexts_1_0= ruleContextsType ) )* ) ;
    public final EObject ruleConstrainsGeneral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_contexts_1_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:2392:2: ( (otherlv_0= 'constraints' ( (lv_contexts_1_0= ruleContextsType ) )* ) )
            // InternalUSE.g:2393:2: (otherlv_0= 'constraints' ( (lv_contexts_1_0= ruleContextsType ) )* )
            {
            // InternalUSE.g:2393:2: (otherlv_0= 'constraints' ( (lv_contexts_1_0= ruleContextsType ) )* )
            // InternalUSE.g:2394:3: otherlv_0= 'constraints' ( (lv_contexts_1_0= ruleContextsType ) )*
            {
            otherlv_0=(Token)match(input,56,FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConstrainsGeneralAccess().getConstraintsKeyword_0());
              		
            }
            // InternalUSE.g:2398:3: ( (lv_contexts_1_0= ruleContextsType ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==57) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalUSE.g:2399:4: (lv_contexts_1_0= ruleContextsType )
            	    {
            	    // InternalUSE.g:2399:4: (lv_contexts_1_0= ruleContextsType )
            	    // InternalUSE.g:2400:5: lv_contexts_1_0= ruleContextsType
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getConstrainsGeneralAccess().getContextsContextsTypeParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_56);
            	    lv_contexts_1_0=ruleContextsType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getConstrainsGeneralRule());
            	      					}
            	      					add(
            	      						current,
            	      						"contexts",
            	      						lv_contexts_1_0,
            	      						"modelConverter.use_language.USE.ContextsType");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstrainsGeneral"


    // $ANTLR start "entryRuleContextsType"
    // InternalUSE.g:2421:1: entryRuleContextsType returns [EObject current=null] : iv_ruleContextsType= ruleContextsType EOF ;
    public final EObject entryRuleContextsType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextsType = null;


        try {
            // InternalUSE.g:2421:53: (iv_ruleContextsType= ruleContextsType EOF )
            // InternalUSE.g:2422:2: iv_ruleContextsType= ruleContextsType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContextsTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContextsType=ruleContextsType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContextsType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContextsType"


    // $ANTLR start "ruleContextsType"
    // InternalUSE.g:2428:1: ruleContextsType returns [EObject current=null] : (this_InvariantContext_0= ruleInvariantContext | this_OperationContext_1= ruleOperationContext ) ;
    public final EObject ruleContextsType() throws RecognitionException {
        EObject current = null;

        EObject this_InvariantContext_0 = null;

        EObject this_OperationContext_1 = null;



        	enterRule();

        try {
            // InternalUSE.g:2434:2: ( (this_InvariantContext_0= ruleInvariantContext | this_OperationContext_1= ruleOperationContext ) )
            // InternalUSE.g:2435:2: (this_InvariantContext_0= ruleInvariantContext | this_OperationContext_1= ruleOperationContext )
            {
            // InternalUSE.g:2435:2: (this_InvariantContext_0= ruleInvariantContext | this_OperationContext_1= ruleOperationContext )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==57) ) {
                int LA64_1 = input.LA(2);

                if ( (LA64_1==RULE_ID) ) {
                    int LA64_2 = input.LA(3);

                    if ( (LA64_2==EOF||LA64_2==41||(LA64_2>=57 && LA64_2<=58)) ) {
                        alt64=1;
                    }
                    else if ( (LA64_2==59) ) {
                        alt64=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalUSE.g:2436:3: this_InvariantContext_0= ruleInvariantContext
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getContextsTypeAccess().getInvariantContextParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_InvariantContext_0=ruleInvariantContext();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_InvariantContext_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUSE.g:2448:3: this_OperationContext_1= ruleOperationContext
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getContextsTypeAccess().getOperationContextParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_OperationContext_1=ruleOperationContext();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_OperationContext_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContextsType"


    // $ANTLR start "entryRuleInvariantContext"
    // InternalUSE.g:2463:1: entryRuleInvariantContext returns [EObject current=null] : iv_ruleInvariantContext= ruleInvariantContext EOF ;
    public final EObject entryRuleInvariantContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariantContext = null;


        try {
            // InternalUSE.g:2463:57: (iv_ruleInvariantContext= ruleInvariantContext EOF )
            // InternalUSE.g:2464:2: iv_ruleInvariantContext= ruleInvariantContext EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvariantContextRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInvariantContext=ruleInvariantContext();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvariantContext; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInvariantContext"


    // $ANTLR start "ruleInvariantContext"
    // InternalUSE.g:2470:1: ruleInvariantContext returns [EObject current=null] : (otherlv_0= 'context' ( ( (lv_variablename_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (otherlv_3= RULE_ID ) ) ( (lv_invariants_4_0= ruleInvariantDefinition ) )* ) ;
    public final EObject ruleInvariantContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_variablename_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_invariants_4_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:2476:2: ( (otherlv_0= 'context' ( ( (lv_variablename_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (otherlv_3= RULE_ID ) ) ( (lv_invariants_4_0= ruleInvariantDefinition ) )* ) )
            // InternalUSE.g:2477:2: (otherlv_0= 'context' ( ( (lv_variablename_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (otherlv_3= RULE_ID ) ) ( (lv_invariants_4_0= ruleInvariantDefinition ) )* )
            {
            // InternalUSE.g:2477:2: (otherlv_0= 'context' ( ( (lv_variablename_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (otherlv_3= RULE_ID ) ) ( (lv_invariants_4_0= ruleInvariantDefinition ) )* )
            // InternalUSE.g:2478:3: otherlv_0= 'context' ( ( (lv_variablename_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (otherlv_3= RULE_ID ) ) ( (lv_invariants_4_0= ruleInvariantDefinition ) )*
            {
            otherlv_0=(Token)match(input,57,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInvariantContextAccess().getContextKeyword_0());
              		
            }
            // InternalUSE.g:2482:3: ( ( (lv_variablename_1_0= RULE_ID ) ) otherlv_2= ':' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_ID) ) {
                int LA65_1 = input.LA(2);

                if ( (LA65_1==41) ) {
                    alt65=1;
                }
            }
            switch (alt65) {
                case 1 :
                    // InternalUSE.g:2483:4: ( (lv_variablename_1_0= RULE_ID ) ) otherlv_2= ':'
                    {
                    // InternalUSE.g:2483:4: ( (lv_variablename_1_0= RULE_ID ) )
                    // InternalUSE.g:2484:5: (lv_variablename_1_0= RULE_ID )
                    {
                    // InternalUSE.g:2484:5: (lv_variablename_1_0= RULE_ID )
                    // InternalUSE.g:2485:6: lv_variablename_1_0= RULE_ID
                    {
                    lv_variablename_1_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_variablename_1_0, grammarAccess.getInvariantContextAccess().getVariablenameIDTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getInvariantContextRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"variablename",
                      							lv_variablename_1_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,41,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getInvariantContextAccess().getColonKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalUSE.g:2506:3: ( (otherlv_3= RULE_ID ) )
            // InternalUSE.g:2507:4: (otherlv_3= RULE_ID )
            {
            // InternalUSE.g:2507:4: (otherlv_3= RULE_ID )
            // InternalUSE.g:2508:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInvariantContextRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getInvariantContextAccess().getClassnameAllClassCrossReference_2_0());
              				
            }

            }


            }

            // InternalUSE.g:2522:3: ( (lv_invariants_4_0= ruleInvariantDefinition ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==58) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalUSE.g:2523:4: (lv_invariants_4_0= ruleInvariantDefinition )
            	    {
            	    // InternalUSE.g:2523:4: (lv_invariants_4_0= ruleInvariantDefinition )
            	    // InternalUSE.g:2524:5: lv_invariants_4_0= ruleInvariantDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getInvariantContextAccess().getInvariantsInvariantDefinitionParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_55);
            	    lv_invariants_4_0=ruleInvariantDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getInvariantContextRule());
            	      					}
            	      					add(
            	      						current,
            	      						"invariants",
            	      						lv_invariants_4_0,
            	      						"modelConverter.use_language.USE.InvariantDefinition");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInvariantContext"


    // $ANTLR start "entryRuleInvariantDefinition"
    // InternalUSE.g:2545:1: entryRuleInvariantDefinition returns [EObject current=null] : iv_ruleInvariantDefinition= ruleInvariantDefinition EOF ;
    public final EObject entryRuleInvariantDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariantDefinition = null;


        try {
            // InternalUSE.g:2545:60: (iv_ruleInvariantDefinition= ruleInvariantDefinition EOF )
            // InternalUSE.g:2546:2: iv_ruleInvariantDefinition= ruleInvariantDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvariantDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInvariantDefinition=ruleInvariantDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvariantDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInvariantDefinition"


    // $ANTLR start "ruleInvariantDefinition"
    // InternalUSE.g:2552:1: ruleInvariantDefinition returns [EObject current=null] : (otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleExpCS ) ) ) ;
    public final EObject ruleInvariantDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_oclexpression_3_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:2558:2: ( (otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleExpCS ) ) ) )
            // InternalUSE.g:2559:2: (otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleExpCS ) ) )
            {
            // InternalUSE.g:2559:2: (otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleExpCS ) ) )
            // InternalUSE.g:2560:3: otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInvariantDefinitionAccess().getInvKeyword_0());
              		
            }
            // InternalUSE.g:2564:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_ID) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalUSE.g:2565:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalUSE.g:2565:4: (lv_name_1_0= RULE_ID )
                    // InternalUSE.g:2566:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_1_0, grammarAccess.getInvariantDefinitionAccess().getNameIDTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getInvariantDefinitionRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_1_0,
                      						"org.eclipse.xtext.common.Terminals.ID");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,41,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getInvariantDefinitionAccess().getColonKeyword_2());
              		
            }
            // InternalUSE.g:2586:3: ( (lv_oclexpression_3_0= ruleExpCS ) )
            // InternalUSE.g:2587:4: (lv_oclexpression_3_0= ruleExpCS )
            {
            // InternalUSE.g:2587:4: (lv_oclexpression_3_0= ruleExpCS )
            // InternalUSE.g:2588:5: lv_oclexpression_3_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInvariantDefinitionAccess().getOclexpressionExpCSParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_oclexpression_3_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInvariantDefinitionRule());
              					}
              					set(
              						current,
              						"oclexpression",
              						lv_oclexpression_3_0,
              						"modelConverter.use_language.USE.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInvariantDefinition"


    // $ANTLR start "entryRuleOperationContext"
    // InternalUSE.g:2609:1: entryRuleOperationContext returns [EObject current=null] : iv_ruleOperationContext= ruleOperationContext EOF ;
    public final EObject entryRuleOperationContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationContext = null;


        try {
            // InternalUSE.g:2609:57: (iv_ruleOperationContext= ruleOperationContext EOF )
            // InternalUSE.g:2610:2: iv_ruleOperationContext= ruleOperationContext EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationContextRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperationContext=ruleOperationContext();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationContext; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationContext"


    // $ANTLR start "ruleOperationContext"
    // InternalUSE.g:2616:1: ruleOperationContext returns [EObject current=null] : (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) ( (lv_constrains_2_0= ruleOperationConstraints ) ) ) ;
    public final EObject ruleOperationContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_constrains_2_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:2622:2: ( (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) ( (lv_constrains_2_0= ruleOperationConstraints ) ) ) )
            // InternalUSE.g:2623:2: (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) ( (lv_constrains_2_0= ruleOperationConstraints ) ) )
            {
            // InternalUSE.g:2623:2: (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) ( (lv_constrains_2_0= ruleOperationConstraints ) ) )
            // InternalUSE.g:2624:3: otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) ( (lv_constrains_2_0= ruleOperationConstraints ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOperationContextAccess().getContextKeyword_0());
              		
            }
            // InternalUSE.g:2628:3: ( (otherlv_1= RULE_ID ) )
            // InternalUSE.g:2629:4: (otherlv_1= RULE_ID )
            {
            // InternalUSE.g:2629:4: (otherlv_1= RULE_ID )
            // InternalUSE.g:2630:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getOperationContextRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getOperationContextAccess().getClassnameAllClassCrossReference_1_0());
              				
            }

            }


            }

            // InternalUSE.g:2644:3: ( (lv_constrains_2_0= ruleOperationConstraints ) )
            // InternalUSE.g:2645:4: (lv_constrains_2_0= ruleOperationConstraints )
            {
            // InternalUSE.g:2645:4: (lv_constrains_2_0= ruleOperationConstraints )
            // InternalUSE.g:2646:5: lv_constrains_2_0= ruleOperationConstraints
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOperationContextAccess().getConstrainsOperationConstraintsParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_constrains_2_0=ruleOperationConstraints();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOperationContextRule());
              					}
              					set(
              						current,
              						"constrains",
              						lv_constrains_2_0,
              						"modelConverter.use_language.USE.OperationConstraints");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationContext"


    // $ANTLR start "entryRuleOperationConstraints"
    // InternalUSE.g:2667:1: entryRuleOperationConstraints returns [EObject current=null] : iv_ruleOperationConstraints= ruleOperationConstraints EOF ;
    public final EObject entryRuleOperationConstraints() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationConstraints = null;


        try {
            // InternalUSE.g:2667:61: (iv_ruleOperationConstraints= ruleOperationConstraints EOF )
            // InternalUSE.g:2668:2: iv_ruleOperationConstraints= ruleOperationConstraints EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationConstraintsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperationConstraints=ruleOperationConstraints();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationConstraints; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationConstraints"


    // $ANTLR start "ruleOperationConstraints"
    // InternalUSE.g:2674:1: ruleOperationConstraints returns [EObject current=null] : (otherlv_0= '::' ( (lv_operationDeclaration_1_0= ruleOperationDeclaration ) ) ( (lv_conditions_2_0= ruleConditionType ) )+ ) ;
    public final EObject ruleOperationConstraints() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_operationDeclaration_1_0 = null;

        EObject lv_conditions_2_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:2680:2: ( (otherlv_0= '::' ( (lv_operationDeclaration_1_0= ruleOperationDeclaration ) ) ( (lv_conditions_2_0= ruleConditionType ) )+ ) )
            // InternalUSE.g:2681:2: (otherlv_0= '::' ( (lv_operationDeclaration_1_0= ruleOperationDeclaration ) ) ( (lv_conditions_2_0= ruleConditionType ) )+ )
            {
            // InternalUSE.g:2681:2: (otherlv_0= '::' ( (lv_operationDeclaration_1_0= ruleOperationDeclaration ) ) ( (lv_conditions_2_0= ruleConditionType ) )+ )
            // InternalUSE.g:2682:3: otherlv_0= '::' ( (lv_operationDeclaration_1_0= ruleOperationDeclaration ) ) ( (lv_conditions_2_0= ruleConditionType ) )+
            {
            otherlv_0=(Token)match(input,59,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOperationConstraintsAccess().getColonColonKeyword_0());
              		
            }
            // InternalUSE.g:2686:3: ( (lv_operationDeclaration_1_0= ruleOperationDeclaration ) )
            // InternalUSE.g:2687:4: (lv_operationDeclaration_1_0= ruleOperationDeclaration )
            {
            // InternalUSE.g:2687:4: (lv_operationDeclaration_1_0= ruleOperationDeclaration )
            // InternalUSE.g:2688:5: lv_operationDeclaration_1_0= ruleOperationDeclaration
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOperationConstraintsAccess().getOperationDeclarationOperationDeclarationParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_59);
            lv_operationDeclaration_1_0=ruleOperationDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOperationConstraintsRule());
              					}
              					set(
              						current,
              						"operationDeclaration",
              						lv_operationDeclaration_1_0,
              						"modelConverter.use_language.USE.OperationDeclaration");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUSE.g:2705:3: ( (lv_conditions_2_0= ruleConditionType ) )+
            int cnt68=0;
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( ((LA68_0>=60 && LA68_0<=61)) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalUSE.g:2706:4: (lv_conditions_2_0= ruleConditionType )
            	    {
            	    // InternalUSE.g:2706:4: (lv_conditions_2_0= ruleConditionType )
            	    // InternalUSE.g:2707:5: lv_conditions_2_0= ruleConditionType
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getOperationConstraintsAccess().getConditionsConditionTypeParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_38);
            	    lv_conditions_2_0=ruleConditionType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getOperationConstraintsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"conditions",
            	      						lv_conditions_2_0,
            	      						"modelConverter.use_language.USE.ConditionType");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt68 >= 1 ) break loop68;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(68, input);
                        throw eee;
                }
                cnt68++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationConstraints"


    // $ANTLR start "entryRuleConditionType"
    // InternalUSE.g:2728:1: entryRuleConditionType returns [EObject current=null] : iv_ruleConditionType= ruleConditionType EOF ;
    public final EObject entryRuleConditionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionType = null;


        try {
            // InternalUSE.g:2728:54: (iv_ruleConditionType= ruleConditionType EOF )
            // InternalUSE.g:2729:2: iv_ruleConditionType= ruleConditionType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConditionType=ruleConditionType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionType"


    // $ANTLR start "ruleConditionType"
    // InternalUSE.g:2735:1: ruleConditionType returns [EObject current=null] : (this_Precondition_0= rulePrecondition | this_Postcondition_1= rulePostcondition ) ;
    public final EObject ruleConditionType() throws RecognitionException {
        EObject current = null;

        EObject this_Precondition_0 = null;

        EObject this_Postcondition_1 = null;



        	enterRule();

        try {
            // InternalUSE.g:2741:2: ( (this_Precondition_0= rulePrecondition | this_Postcondition_1= rulePostcondition ) )
            // InternalUSE.g:2742:2: (this_Precondition_0= rulePrecondition | this_Postcondition_1= rulePostcondition )
            {
            // InternalUSE.g:2742:2: (this_Precondition_0= rulePrecondition | this_Postcondition_1= rulePostcondition )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==60) ) {
                alt69=1;
            }
            else if ( (LA69_0==61) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalUSE.g:2743:3: this_Precondition_0= rulePrecondition
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConditionTypeAccess().getPreconditionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Precondition_0=rulePrecondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Precondition_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUSE.g:2755:3: this_Postcondition_1= rulePostcondition
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConditionTypeAccess().getPostconditionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Postcondition_1=rulePostcondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Postcondition_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionType"


    // $ANTLR start "entryRulePrecondition"
    // InternalUSE.g:2770:1: entryRulePrecondition returns [EObject current=null] : iv_rulePrecondition= rulePrecondition EOF ;
    public final EObject entryRulePrecondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecondition = null;


        try {
            // InternalUSE.g:2770:53: (iv_rulePrecondition= rulePrecondition EOF )
            // InternalUSE.g:2771:2: iv_rulePrecondition= rulePrecondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPreconditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrecondition=rulePrecondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrecondition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrecondition"


    // $ANTLR start "rulePrecondition"
    // InternalUSE.g:2777:1: rulePrecondition returns [EObject current=null] : (otherlv_0= 'pre' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleExpCS ) ) ) ;
    public final EObject rulePrecondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_oclexpression_3_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:2783:2: ( (otherlv_0= 'pre' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleExpCS ) ) ) )
            // InternalUSE.g:2784:2: (otherlv_0= 'pre' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleExpCS ) ) )
            {
            // InternalUSE.g:2784:2: (otherlv_0= 'pre' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleExpCS ) ) )
            // InternalUSE.g:2785:3: otherlv_0= 'pre' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,60,FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPreconditionAccess().getPreKeyword_0());
              		
            }
            // InternalUSE.g:2789:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_ID) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalUSE.g:2790:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalUSE.g:2790:4: (lv_name_1_0= RULE_ID )
                    // InternalUSE.g:2791:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_1_0, grammarAccess.getPreconditionAccess().getNameIDTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPreconditionRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_1_0,
                      						"org.eclipse.xtext.common.Terminals.ID");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,41,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPreconditionAccess().getColonKeyword_2());
              		
            }
            // InternalUSE.g:2811:3: ( (lv_oclexpression_3_0= ruleExpCS ) )
            // InternalUSE.g:2812:4: (lv_oclexpression_3_0= ruleExpCS )
            {
            // InternalUSE.g:2812:4: (lv_oclexpression_3_0= ruleExpCS )
            // InternalUSE.g:2813:5: lv_oclexpression_3_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPreconditionAccess().getOclexpressionExpCSParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_oclexpression_3_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPreconditionRule());
              					}
              					set(
              						current,
              						"oclexpression",
              						lv_oclexpression_3_0,
              						"modelConverter.use_language.USE.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrecondition"


    // $ANTLR start "entryRulePostcondition"
    // InternalUSE.g:2834:1: entryRulePostcondition returns [EObject current=null] : iv_rulePostcondition= rulePostcondition EOF ;
    public final EObject entryRulePostcondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostcondition = null;


        try {
            // InternalUSE.g:2834:54: (iv_rulePostcondition= rulePostcondition EOF )
            // InternalUSE.g:2835:2: iv_rulePostcondition= rulePostcondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostconditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePostcondition=rulePostcondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostcondition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePostcondition"


    // $ANTLR start "rulePostcondition"
    // InternalUSE.g:2841:1: rulePostcondition returns [EObject current=null] : (otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleExpCS ) ) ) ;
    public final EObject rulePostcondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_oclexpression_3_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:2847:2: ( (otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleExpCS ) ) ) )
            // InternalUSE.g:2848:2: (otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleExpCS ) ) )
            {
            // InternalUSE.g:2848:2: (otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleExpCS ) ) )
            // InternalUSE.g:2849:3: otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPostconditionAccess().getPostKeyword_0());
              		
            }
            // InternalUSE.g:2853:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_ID) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalUSE.g:2854:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalUSE.g:2854:4: (lv_name_1_0= RULE_ID )
                    // InternalUSE.g:2855:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_1_0, grammarAccess.getPostconditionAccess().getNameIDTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPostconditionRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_1_0,
                      						"org.eclipse.xtext.common.Terminals.ID");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,41,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPostconditionAccess().getColonKeyword_2());
              		
            }
            // InternalUSE.g:2875:3: ( (lv_oclexpression_3_0= ruleExpCS ) )
            // InternalUSE.g:2876:4: (lv_oclexpression_3_0= ruleExpCS )
            {
            // InternalUSE.g:2876:4: (lv_oclexpression_3_0= ruleExpCS )
            // InternalUSE.g:2877:5: lv_oclexpression_3_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPostconditionAccess().getOclexpressionExpCSParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_oclexpression_3_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPostconditionRule());
              					}
              					set(
              						current,
              						"oclexpression",
              						lv_oclexpression_3_0,
              						"modelConverter.use_language.USE.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePostcondition"


    // $ANTLR start "entryRuleBeginEnd"
    // InternalUSE.g:2898:1: entryRuleBeginEnd returns [String current=null] : iv_ruleBeginEnd= ruleBeginEnd EOF ;
    public final String entryRuleBeginEnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBeginEnd = null;


        try {
            // InternalUSE.g:2898:48: (iv_ruleBeginEnd= ruleBeginEnd EOF )
            // InternalUSE.g:2899:2: iv_ruleBeginEnd= ruleBeginEnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBeginEndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBeginEnd=ruleBeginEnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBeginEnd.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBeginEnd"


    // $ANTLR start "ruleBeginEnd"
    // InternalUSE.g:2905:1: ruleBeginEnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleBeginEnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalUSE.g:2911:2: (this_STRING_0= RULE_STRING )
            // InternalUSE.g:2912:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_STRING_0, grammarAccess.getBeginEndAccess().getSTRINGTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBeginEnd"


    // $ANTLR start "entryRulePrimitiveTypeIdentifier"
    // InternalUSE.g:2922:1: entryRulePrimitiveTypeIdentifier returns [String current=null] : iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF ;
    public final String entryRulePrimitiveTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveTypeIdentifier = null;


        try {
            // InternalUSE.g:2922:63: (iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF )
            // InternalUSE.g:2923:2: iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeIdentifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveTypeIdentifier=rulePrimitiveTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveTypeIdentifier.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveTypeIdentifier"


    // $ANTLR start "rulePrimitiveTypeIdentifier"
    // InternalUSE.g:2929:1: rulePrimitiveTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUSE.g:2935:2: ( (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) )
            // InternalUSE.g:2936:2: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            {
            // InternalUSE.g:2936:2: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            int alt72=8;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt72=1;
                }
                break;
            case 15:
                {
                alt72=2;
                }
                break;
            case 17:
                {
                alt72=3;
                }
                break;
            case 16:
                {
                alt72=4;
                }
                break;
            case 62:
                {
                alt72=5;
                }
                break;
            case 63:
                {
                alt72=6;
                }
                break;
            case 64:
                {
                alt72=7;
                }
                break;
            case 65:
                {
                alt72=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // InternalUSE.g:2937:3: kw= 'Boolean'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getBooleanKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUSE.g:2943:3: kw= 'Integer'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getIntegerKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUSE.g:2949:3: kw= 'Real'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getRealKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalUSE.g:2955:3: kw= 'String'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getStringKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalUSE.g:2961:3: kw= 'UnlimitedNatural'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getUnlimitedNaturalKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalUSE.g:2967:3: kw= 'OclAny'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclAnyKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalUSE.g:2973:3: kw= 'OclInvalid'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclInvalidKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalUSE.g:2979:3: kw= 'OclVoid'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclVoidKeyword_7());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveTypeIdentifier"


    // $ANTLR start "entryRulePrimitiveTypeCS"
    // InternalUSE.g:2988:1: entryRulePrimitiveTypeCS returns [EObject current=null] : iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF ;
    public final EObject entryRulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypeCS = null;


        try {
            // InternalUSE.g:2988:56: (iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF )
            // InternalUSE.g:2989:2: iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveTypeCS=rulePrimitiveTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveTypeCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveTypeCS"


    // $ANTLR start "rulePrimitiveTypeCS"
    // InternalUSE.g:2995:1: rulePrimitiveTypeCS returns [EObject current=null] : ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) ;
    public final EObject rulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:3001:2: ( ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) )
            // InternalUSE.g:3002:2: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            {
            // InternalUSE.g:3002:2: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            // InternalUSE.g:3003:3: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            {
            // InternalUSE.g:3003:3: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            // InternalUSE.g:3004:4: lv_name_0_0= rulePrimitiveTypeIdentifier
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getPrimitiveTypeCSAccess().getNamePrimitiveTypeIdentifierParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_name_0_0=rulePrimitiveTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getPrimitiveTypeCSRule());
              				}
              				set(
              					current,
              					"name",
              					lv_name_0_0,
              					"modelConverter.use_language.USE.PrimitiveTypeIdentifier");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveTypeCS"


    // $ANTLR start "entryRuleCollectionTypeIdentifier"
    // InternalUSE.g:3024:1: entryRuleCollectionTypeIdentifier returns [String current=null] : iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF ;
    public final String entryRuleCollectionTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCollectionTypeIdentifier = null;


        try {
            // InternalUSE.g:3024:64: (iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF )
            // InternalUSE.g:3025:2: iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeIdentifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCollectionTypeIdentifier=ruleCollectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionTypeIdentifier.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionTypeIdentifier"


    // $ANTLR start "ruleCollectionTypeIdentifier"
    // InternalUSE.g:3031:1: ruleCollectionTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) ;
    public final AntlrDatatypeRuleToken ruleCollectionTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUSE.g:3037:2: ( (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) )
            // InternalUSE.g:3038:2: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            {
            // InternalUSE.g:3038:2: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            int alt73=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt73=1;
                }
                break;
            case 20:
                {
                alt73=2;
                }
                break;
            case 21:
                {
                alt73=3;
                }
                break;
            case 66:
                {
                alt73=4;
                }
                break;
            case 67:
                {
                alt73=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // InternalUSE.g:3039:3: kw= 'Set'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSetKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUSE.g:3045:3: kw= 'Bag'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getBagKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUSE.g:3051:3: kw= 'Sequence'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSequenceKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalUSE.g:3057:3: kw= 'Collection'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getCollectionKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalUSE.g:3063:3: kw= 'OrderedSet'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getOrderedSetKeyword_4());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionTypeIdentifier"


    // $ANTLR start "entryRuleCollectionTypeCS"
    // InternalUSE.g:3072:1: entryRuleCollectionTypeCS returns [EObject current=null] : iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF ;
    public final EObject entryRuleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionTypeCS = null;


        try {
            // InternalUSE.g:3072:57: (iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF )
            // InternalUSE.g:3073:2: iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCollectionTypeCS=ruleCollectionTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionTypeCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionTypeCS"


    // $ANTLR start "ruleCollectionTypeCS"
    // InternalUSE.g:3079:1: ruleCollectionTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )? ) ;
    public final EObject ruleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_ownedCollectionMultiplicity_3_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:3085:2: ( ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )? ) )
            // InternalUSE.g:3086:2: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )? )
            {
            // InternalUSE.g:3086:2: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )? )
            // InternalUSE.g:3087:3: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )?
            {
            // InternalUSE.g:3087:3: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) )
            // InternalUSE.g:3088:4: (lv_name_0_0= ruleCollectionTypeIdentifier )
            {
            // InternalUSE.g:3088:4: (lv_name_0_0= ruleCollectionTypeIdentifier )
            // InternalUSE.g:3089:5: lv_name_0_0= ruleCollectionTypeIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getNameCollectionTypeIdentifierParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_60);
            lv_name_0_0=ruleCollectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"modelConverter.use_language.USE.CollectionTypeIdentifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUSE.g:3106:3: (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==22) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalUSE.g:3107:4: otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getCollectionTypeCSAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalUSE.g:3111:4: ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) )
                    // InternalUSE.g:3112:5: (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS )
                    {
                    // InternalUSE.g:3112:5: (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS )
                    // InternalUSE.g:3113:6: lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeTypeExpWithoutMultiplicityCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_62);
                    lv_ownedType_2_0=ruleTypeExpWithoutMultiplicityCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedType",
                      							lv_ownedType_2_0,
                      							"modelConverter.use_language.USE.TypeExpWithoutMultiplicityCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUSE.g:3130:4: ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==35) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // InternalUSE.g:3131:5: (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS )
                            {
                            // InternalUSE.g:3131:5: (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS )
                            // InternalUSE.g:3132:6: lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedCollectionMultiplicityMultiplicityCSParserRuleCall_1_2_0());
                              					
                            }
                            pushFollow(FOLLOW_52);
                            lv_ownedCollectionMultiplicity_3_0=ruleMultiplicityCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
                              						}
                              						set(
                              							current,
                              							"ownedCollectionMultiplicity",
                              							lv_ownedCollectionMultiplicity_3_0,
                              							"modelConverter.use_language.USE.MultiplicityCS");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getCollectionTypeCSAccess().getRightParenthesisKeyword_1_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionTypeCS"


    // $ANTLR start "entryRuleMapTypeCS"
    // InternalUSE.g:3158:1: entryRuleMapTypeCS returns [EObject current=null] : iv_ruleMapTypeCS= ruleMapTypeCS EOF ;
    public final EObject entryRuleMapTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapTypeCS = null;


        try {
            // InternalUSE.g:3158:50: (iv_ruleMapTypeCS= ruleMapTypeCS EOF )
            // InternalUSE.g:3159:2: iv_ruleMapTypeCS= ruleMapTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapTypeCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMapTypeCS=ruleMapTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapTypeCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapTypeCS"


    // $ANTLR start "ruleMapTypeCS"
    // InternalUSE.g:3165:1: ruleMapTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? ) ;
    public final EObject ruleMapTypeCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedKeyType_2_0 = null;

        EObject lv_ownedValueType_4_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:3171:2: ( ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? ) )
            // InternalUSE.g:3172:2: ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? )
            {
            // InternalUSE.g:3172:2: ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? )
            // InternalUSE.g:3173:3: ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )?
            {
            // InternalUSE.g:3173:3: ( (lv_name_0_0= 'Map' ) )
            // InternalUSE.g:3174:4: (lv_name_0_0= 'Map' )
            {
            // InternalUSE.g:3174:4: (lv_name_0_0= 'Map' )
            // InternalUSE.g:3175:5: lv_name_0_0= 'Map'
            {
            lv_name_0_0=(Token)match(input,68,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getMapTypeCSAccess().getNameMapKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMapTypeCSRule());
              					}
              					setWithLastConsumed(current, "name", lv_name_0_0, "Map");
              				
            }

            }


            }

            // InternalUSE.g:3187:3: (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==22) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalUSE.g:3188:4: otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getMapTypeCSAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalUSE.g:3192:4: ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) )
                    // InternalUSE.g:3193:5: (lv_ownedKeyType_2_0= ruleTypeExpCS )
                    {
                    // InternalUSE.g:3193:5: (lv_ownedKeyType_2_0= ruleTypeExpCS )
                    // InternalUSE.g:3194:6: lv_ownedKeyType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMapTypeCSAccess().getOwnedKeyTypeTypeExpCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_63);
                    lv_ownedKeyType_2_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMapTypeCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedKeyType",
                      							lv_ownedKeyType_2_0,
                      							"modelConverter.use_language.USE.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,14,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getMapTypeCSAccess().getCommaKeyword_1_2());
                      			
                    }
                    // InternalUSE.g:3215:4: ( (lv_ownedValueType_4_0= ruleTypeExpCS ) )
                    // InternalUSE.g:3216:5: (lv_ownedValueType_4_0= ruleTypeExpCS )
                    {
                    // InternalUSE.g:3216:5: (lv_ownedValueType_4_0= ruleTypeExpCS )
                    // InternalUSE.g:3217:6: lv_ownedValueType_4_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMapTypeCSAccess().getOwnedValueTypeTypeExpCSParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_52);
                    lv_ownedValueType_4_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMapTypeCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedValueType",
                      							lv_ownedValueType_4_0,
                      							"modelConverter.use_language.USE.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getMapTypeCSAccess().getRightParenthesisKeyword_1_4());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapTypeCS"


    // $ANTLR start "entryRuleTupleTypeCS"
    // InternalUSE.g:3243:1: entryRuleTupleTypeCS returns [EObject current=null] : iv_ruleTupleTypeCS= ruleTupleTypeCS EOF ;
    public final EObject entryRuleTupleTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleTypeCS = null;


        try {
            // InternalUSE.g:3243:52: (iv_ruleTupleTypeCS= ruleTupleTypeCS EOF )
            // InternalUSE.g:3244:2: iv_ruleTupleTypeCS= ruleTupleTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleTypeCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTupleTypeCS=ruleTupleTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleTypeCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTupleTypeCS"


    // $ANTLR start "ruleTupleTypeCS"
    // InternalUSE.g:3250:1: ruleTupleTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? ) ;
    public final EObject ruleTupleTypeCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:3256:2: ( ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? ) )
            // InternalUSE.g:3257:2: ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? )
            {
            // InternalUSE.g:3257:2: ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? )
            // InternalUSE.g:3258:3: ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )?
            {
            // InternalUSE.g:3258:3: ( (lv_name_0_0= 'Tuple' ) )
            // InternalUSE.g:3259:4: (lv_name_0_0= 'Tuple' )
            {
            // InternalUSE.g:3259:4: (lv_name_0_0= 'Tuple' )
            // InternalUSE.g:3260:5: lv_name_0_0= 'Tuple'
            {
            lv_name_0_0=(Token)match(input,69,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getTupleTypeCSAccess().getNameTupleKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTupleTypeCSRule());
              					}
              					setWithLastConsumed(current, "name", lv_name_0_0, "Tuple");
              				
            }

            }


            }

            // InternalUSE.g:3272:3: (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==22) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalUSE.g:3273:4: otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTupleTypeCSAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalUSE.g:3277:4: ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==RULE_ID) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // InternalUSE.g:3278:5: ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )*
                            {
                            // InternalUSE.g:3278:5: ( (lv_ownedParts_2_0= ruleTuplePartCS ) )
                            // InternalUSE.g:3279:6: (lv_ownedParts_2_0= ruleTuplePartCS )
                            {
                            // InternalUSE.g:3279:6: (lv_ownedParts_2_0= ruleTuplePartCS )
                            // InternalUSE.g:3280:7: lv_ownedParts_2_0= ruleTuplePartCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_64);
                            lv_ownedParts_2_0=ruleTuplePartCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTupleTypeCSRule());
                              							}
                              							add(
                              								current,
                              								"ownedParts",
                              								lv_ownedParts_2_0,
                              								"modelConverter.use_language.USE.TuplePartCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalUSE.g:3297:5: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )*
                            loop77:
                            do {
                                int alt77=2;
                                int LA77_0 = input.LA(1);

                                if ( (LA77_0==14) ) {
                                    alt77=1;
                                }


                                switch (alt77) {
                            	case 1 :
                            	    // InternalUSE.g:3298:6: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) )
                            	    {
                            	    otherlv_3=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_3, grammarAccess.getTupleTypeCSAccess().getCommaKeyword_1_1_1_0());
                            	      					
                            	    }
                            	    // InternalUSE.g:3302:6: ( (lv_ownedParts_4_0= ruleTuplePartCS ) )
                            	    // InternalUSE.g:3303:7: (lv_ownedParts_4_0= ruleTuplePartCS )
                            	    {
                            	    // InternalUSE.g:3303:7: (lv_ownedParts_4_0= ruleTuplePartCS )
                            	    // InternalUSE.g:3304:8: lv_ownedParts_4_0= ruleTuplePartCS
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_64);
                            	    lv_ownedParts_4_0=ruleTuplePartCS();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getTupleTypeCSRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"ownedParts",
                            	      									lv_ownedParts_4_0,
                            	      									"modelConverter.use_language.USE.TuplePartCS");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop77;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getTupleTypeCSAccess().getRightParenthesisKeyword_1_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTupleTypeCS"


    // $ANTLR start "entryRuleTuplePartCS"
    // InternalUSE.g:3332:1: entryRuleTuplePartCS returns [EObject current=null] : iv_ruleTuplePartCS= ruleTuplePartCS EOF ;
    public final EObject entryRuleTuplePartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuplePartCS = null;


        try {
            // InternalUSE.g:3332:52: (iv_ruleTuplePartCS= ruleTuplePartCS EOF )
            // InternalUSE.g:3333:2: iv_ruleTuplePartCS= ruleTuplePartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTuplePartCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTuplePartCS=ruleTuplePartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTuplePartCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTuplePartCS"


    // $ANTLR start "ruleTuplePartCS"
    // InternalUSE.g:3339:1: ruleTuplePartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject ruleTuplePartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:3345:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) )
            // InternalUSE.g:3346:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            {
            // InternalUSE.g:3346:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            // InternalUSE.g:3347:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            {
            // InternalUSE.g:3347:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalUSE.g:3348:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalUSE.g:3348:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalUSE.g:3349:5: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTuplePartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_31);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTuplePartCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"modelConverter.use_language.USE.UnrestrictedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTuplePartCSAccess().getColonKeyword_1());
              		
            }
            // InternalUSE.g:3370:3: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            // InternalUSE.g:3371:4: (lv_ownedType_2_0= ruleTypeExpCS )
            {
            // InternalUSE.g:3371:4: (lv_ownedType_2_0= ruleTypeExpCS )
            // InternalUSE.g:3372:5: lv_ownedType_2_0= ruleTypeExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTuplePartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_ownedType_2_0=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTuplePartCSRule());
              					}
              					set(
              						current,
              						"ownedType",
              						lv_ownedType_2_0,
              						"modelConverter.use_language.USE.TypeExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTuplePartCS"


    // $ANTLR start "entryRuleBinaryOperatorName"
    // InternalUSE.g:3393:1: entryRuleBinaryOperatorName returns [String current=null] : iv_ruleBinaryOperatorName= ruleBinaryOperatorName EOF ;
    public final String entryRuleBinaryOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOperatorName = null;


        try {
            // InternalUSE.g:3393:58: (iv_ruleBinaryOperatorName= ruleBinaryOperatorName EOF )
            // InternalUSE.g:3394:2: iv_ruleBinaryOperatorName= ruleBinaryOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinaryOperatorNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBinaryOperatorName=ruleBinaryOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinaryOperatorName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryOperatorName"


    // $ANTLR start "ruleBinaryOperatorName"
    // InternalUSE.g:3400:1: ruleBinaryOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName | this_EssentialOCLNavigationOperatorName_1= ruleEssentialOCLNavigationOperatorName ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLInfixOperatorName_0 = null;

        AntlrDatatypeRuleToken this_EssentialOCLNavigationOperatorName_1 = null;



        	enterRule();

        try {
            // InternalUSE.g:3406:2: ( (this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName | this_EssentialOCLNavigationOperatorName_1= ruleEssentialOCLNavigationOperatorName ) )
            // InternalUSE.g:3407:2: (this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName | this_EssentialOCLNavigationOperatorName_1= ruleEssentialOCLNavigationOperatorName )
            {
            // InternalUSE.g:3407:2: (this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName | this_EssentialOCLNavigationOperatorName_1= ruleEssentialOCLNavigationOperatorName )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==12||LA80_0==29||LA80_0==46||(LA80_0>=70 && LA80_0<=85)) ) {
                alt80=1;
            }
            else if ( (LA80_0==55||(LA80_0>=86 && LA80_0<=88)) ) {
                alt80=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // InternalUSE.g:3408:3: this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBinaryOperatorNameAccess().getEssentialOCLInfixOperatorNameParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EssentialOCLInfixOperatorName_0=ruleEssentialOCLInfixOperatorName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_EssentialOCLInfixOperatorName_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUSE.g:3419:3: this_EssentialOCLNavigationOperatorName_1= ruleEssentialOCLNavigationOperatorName
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBinaryOperatorNameAccess().getEssentialOCLNavigationOperatorNameParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EssentialOCLNavigationOperatorName_1=ruleEssentialOCLNavigationOperatorName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_EssentialOCLNavigationOperatorName_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryOperatorName"


    // $ANTLR start "entryRuleEssentialOCLInfixOperatorName"
    // InternalUSE.g:3433:1: entryRuleEssentialOCLInfixOperatorName returns [String current=null] : iv_ruleEssentialOCLInfixOperatorName= ruleEssentialOCLInfixOperatorName EOF ;
    public final String entryRuleEssentialOCLInfixOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLInfixOperatorName = null;


        try {
            // InternalUSE.g:3433:69: (iv_ruleEssentialOCLInfixOperatorName= ruleEssentialOCLInfixOperatorName EOF )
            // InternalUSE.g:3434:2: iv_ruleEssentialOCLInfixOperatorName= ruleEssentialOCLInfixOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLInfixOperatorNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEssentialOCLInfixOperatorName=ruleEssentialOCLInfixOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLInfixOperatorName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEssentialOCLInfixOperatorName"


    // $ANTLR start "ruleEssentialOCLInfixOperatorName"
    // InternalUSE.g:3440:1: ruleEssentialOCLInfixOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= ':=' | kw= '<>' | kw= 'and' | kw= 'and2' | kw= 'implies' | kw= 'implies2' | kw= 'or' | kw= 'or2' | kw= 'xor' | kw= 'xor2' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLInfixOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUSE.g:3446:2: ( (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= ':=' | kw= '<>' | kw= 'and' | kw= 'and2' | kw= 'implies' | kw= 'implies2' | kw= 'or' | kw= 'or2' | kw= 'xor' | kw= 'xor2' ) )
            // InternalUSE.g:3447:2: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= ':=' | kw= '<>' | kw= 'and' | kw= 'and2' | kw= 'implies' | kw= 'implies2' | kw= 'or' | kw= 'or2' | kw= 'xor' | kw= 'xor2' )
            {
            // InternalUSE.g:3447:2: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= ':=' | kw= '<>' | kw= 'and' | kw= 'and2' | kw= 'implies' | kw= 'implies2' | kw= 'or' | kw= 'or2' | kw= 'xor' | kw= 'xor2' )
            int alt81=19;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt81=1;
                }
                break;
            case 70:
                {
                alt81=2;
                }
                break;
            case 71:
                {
                alt81=3;
                }
                break;
            case 72:
                {
                alt81=4;
                }
                break;
            case 73:
                {
                alt81=5;
                }
                break;
            case 29:
                {
                alt81=6;
                }
                break;
            case 74:
                {
                alt81=7;
                }
                break;
            case 75:
                {
                alt81=8;
                }
                break;
            case 46:
                {
                alt81=9;
                }
                break;
            case 76:
                {
                alt81=10;
                }
                break;
            case 77:
                {
                alt81=11;
                }
                break;
            case 78:
                {
                alt81=12;
                }
                break;
            case 79:
                {
                alt81=13;
                }
                break;
            case 80:
                {
                alt81=14;
                }
                break;
            case 81:
                {
                alt81=15;
                }
                break;
            case 82:
                {
                alt81=16;
                }
                break;
            case 83:
                {
                alt81=17;
                }
                break;
            case 84:
                {
                alt81=18;
                }
                break;
            case 85:
                {
                alt81=19;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // InternalUSE.g:3448:3: kw= '*'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getAsteriskKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUSE.g:3454:3: kw= '/'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getSolidusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUSE.g:3460:3: kw= '+'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getPlusSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalUSE.g:3466:3: kw= '-'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getHyphenMinusKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalUSE.g:3472:3: kw= '>'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getGreaterThanSignKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalUSE.g:3478:3: kw= '<'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getLessThanSignKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalUSE.g:3484:3: kw= '>='
                    {
                    kw=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getGreaterThanSignEqualsSignKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalUSE.g:3490:3: kw= '<='
                    {
                    kw=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getLessThanSignEqualsSignKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalUSE.g:3496:3: kw= '='
                    {
                    kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getEqualsSignKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalUSE.g:3502:3: kw= ':='
                    {
                    kw=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getColonEqualsSignKeyword_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalUSE.g:3508:3: kw= '<>'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getLessThanSignGreaterThanSignKeyword_10());
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalUSE.g:3514:3: kw= 'and'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getAndKeyword_11());
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalUSE.g:3520:3: kw= 'and2'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getAnd2Keyword_12());
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalUSE.g:3526:3: kw= 'implies'
                    {
                    kw=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getImpliesKeyword_13());
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalUSE.g:3532:3: kw= 'implies2'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getImplies2Keyword_14());
                      		
                    }

                    }
                    break;
                case 16 :
                    // InternalUSE.g:3538:3: kw= 'or'
                    {
                    kw=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getOrKeyword_15());
                      		
                    }

                    }
                    break;
                case 17 :
                    // InternalUSE.g:3544:3: kw= 'or2'
                    {
                    kw=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getOr2Keyword_16());
                      		
                    }

                    }
                    break;
                case 18 :
                    // InternalUSE.g:3550:3: kw= 'xor'
                    {
                    kw=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getXorKeyword_17());
                      		
                    }

                    }
                    break;
                case 19 :
                    // InternalUSE.g:3556:3: kw= 'xor2'
                    {
                    kw=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getXor2Keyword_18());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEssentialOCLInfixOperatorName"


    // $ANTLR start "entryRuleEssentialOCLNavigationOperatorName"
    // InternalUSE.g:3565:1: entryRuleEssentialOCLNavigationOperatorName returns [String current=null] : iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF ;
    public final String entryRuleEssentialOCLNavigationOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLNavigationOperatorName = null;


        try {
            // InternalUSE.g:3565:74: (iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF )
            // InternalUSE.g:3566:2: iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLNavigationOperatorNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEssentialOCLNavigationOperatorName=ruleEssentialOCLNavigationOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLNavigationOperatorName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEssentialOCLNavigationOperatorName"


    // $ANTLR start "ruleEssentialOCLNavigationOperatorName"
    // InternalUSE.g:3572:1: ruleEssentialOCLNavigationOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLNavigationOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUSE.g:3578:2: ( (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' ) )
            // InternalUSE.g:3579:2: (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' )
            {
            // InternalUSE.g:3579:2: (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' )
            int alt82=4;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt82=1;
                }
                break;
            case 55:
                {
                alt82=2;
                }
                break;
            case 87:
                {
                alt82=3;
                }
                break;
            case 88:
                {
                alt82=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // InternalUSE.g:3580:3: kw= '.'
                    {
                    kw=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getFullStopKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUSE.g:3586:3: kw= '->'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getHyphenMinusGreaterThanSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUSE.g:3592:3: kw= '?.'
                    {
                    kw=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getQuestionMarkFullStopKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalUSE.g:3598:3: kw= '?->'
                    {
                    kw=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getQuestionMarkHyphenMinusGreaterThanSignKeyword_3());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEssentialOCLNavigationOperatorName"


    // $ANTLR start "entryRuleUnaryOperatorName"
    // InternalUSE.g:3607:1: entryRuleUnaryOperatorName returns [String current=null] : iv_ruleUnaryOperatorName= ruleUnaryOperatorName EOF ;
    public final String entryRuleUnaryOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperatorName = null;


        try {
            // InternalUSE.g:3607:57: (iv_ruleUnaryOperatorName= ruleUnaryOperatorName EOF )
            // InternalUSE.g:3608:2: iv_ruleUnaryOperatorName= ruleUnaryOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryOperatorNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnaryOperatorName=ruleUnaryOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryOperatorName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryOperatorName"


    // $ANTLR start "ruleUnaryOperatorName"
    // InternalUSE.g:3614:1: ruleUnaryOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnaryOperatorName_0= ruleEssentialOCLUnaryOperatorName ;
    public final AntlrDatatypeRuleToken ruleUnaryOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnaryOperatorName_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:3620:2: (this_EssentialOCLUnaryOperatorName_0= ruleEssentialOCLUnaryOperatorName )
            // InternalUSE.g:3621:2: this_EssentialOCLUnaryOperatorName_0= ruleEssentialOCLUnaryOperatorName
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getUnaryOperatorNameAccess().getEssentialOCLUnaryOperatorNameParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_EssentialOCLUnaryOperatorName_0=ruleEssentialOCLUnaryOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EssentialOCLUnaryOperatorName_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryOperatorName"


    // $ANTLR start "entryRuleEssentialOCLUnaryOperatorName"
    // InternalUSE.g:3634:1: entryRuleEssentialOCLUnaryOperatorName returns [String current=null] : iv_ruleEssentialOCLUnaryOperatorName= ruleEssentialOCLUnaryOperatorName EOF ;
    public final String entryRuleEssentialOCLUnaryOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnaryOperatorName = null;


        try {
            // InternalUSE.g:3634:69: (iv_ruleEssentialOCLUnaryOperatorName= ruleEssentialOCLUnaryOperatorName EOF )
            // InternalUSE.g:3635:2: iv_ruleEssentialOCLUnaryOperatorName= ruleEssentialOCLUnaryOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnaryOperatorNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEssentialOCLUnaryOperatorName=ruleEssentialOCLUnaryOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnaryOperatorName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEssentialOCLUnaryOperatorName"


    // $ANTLR start "ruleEssentialOCLUnaryOperatorName"
    // InternalUSE.g:3641:1: ruleEssentialOCLUnaryOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= 'not' | kw= 'not2' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnaryOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUSE.g:3647:2: ( (kw= '-' | kw= 'not' | kw= 'not2' ) )
            // InternalUSE.g:3648:2: (kw= '-' | kw= 'not' | kw= 'not2' )
            {
            // InternalUSE.g:3648:2: (kw= '-' | kw= 'not' | kw= 'not2' )
            int alt83=3;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt83=1;
                }
                break;
            case 89:
                {
                alt83=2;
                }
                break;
            case 90:
                {
                alt83=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // InternalUSE.g:3649:3: kw= '-'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLUnaryOperatorNameAccess().getHyphenMinusKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUSE.g:3655:3: kw= 'not'
                    {
                    kw=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLUnaryOperatorNameAccess().getNotKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUSE.g:3661:3: kw= 'not2'
                    {
                    kw=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLUnaryOperatorNameAccess().getNot2Keyword_2());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEssentialOCLUnaryOperatorName"


    // $ANTLR start "entryRuleEssentialOCLUnrestrictedName"
    // InternalUSE.g:3670:1: entryRuleEssentialOCLUnrestrictedName returns [String current=null] : iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF ;
    public final String entryRuleEssentialOCLUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnrestrictedName = null;


        try {
            // InternalUSE.g:3670:68: (iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF )
            // InternalUSE.g:3671:2: iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnrestrictedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEssentialOCLUnrestrictedName=ruleEssentialOCLUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnrestrictedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEssentialOCLUnrestrictedName"


    // $ANTLR start "ruleEssentialOCLUnrestrictedName"
    // InternalUSE.g:3677:1: ruleEssentialOCLUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalUSE.g:3683:2: (this_ID_0= RULE_ID )
            // InternalUSE.g:3684:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_ID_0, grammarAccess.getEssentialOCLUnrestrictedNameAccess().getIDTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEssentialOCLUnrestrictedName"


    // $ANTLR start "entryRuleUnrestrictedName"
    // InternalUSE.g:3694:1: entryRuleUnrestrictedName returns [String current=null] : iv_ruleUnrestrictedName= ruleUnrestrictedName EOF ;
    public final String entryRuleUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnrestrictedName = null;


        try {
            // InternalUSE.g:3694:56: (iv_ruleUnrestrictedName= ruleUnrestrictedName EOF )
            // InternalUSE.g:3695:2: iv_ruleUnrestrictedName= ruleUnrestrictedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnrestrictedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnrestrictedName=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnrestrictedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnrestrictedName"


    // $ANTLR start "ruleUnrestrictedName"
    // InternalUSE.g:3701:1: ruleUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName ;
    public final AntlrDatatypeRuleToken ruleUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnrestrictedName_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:3707:2: (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName )
            // InternalUSE.g:3708:2: this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getUnrestrictedNameAccess().getEssentialOCLUnrestrictedNameParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_EssentialOCLUnrestrictedName_0=ruleEssentialOCLUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EssentialOCLUnrestrictedName_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnrestrictedName"


    // $ANTLR start "entryRuleCollectionPatternCS"
    // InternalUSE.g:3721:1: entryRuleCollectionPatternCS returns [EObject current=null] : iv_ruleCollectionPatternCS= ruleCollectionPatternCS EOF ;
    public final EObject entryRuleCollectionPatternCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionPatternCS = null;


        try {
            // InternalUSE.g:3721:60: (iv_ruleCollectionPatternCS= ruleCollectionPatternCS EOF )
            // InternalUSE.g:3722:2: iv_ruleCollectionPatternCS= ruleCollectionPatternCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionPatternCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCollectionPatternCS=ruleCollectionPatternCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionPatternCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionPatternCS"


    // $ANTLR start "ruleCollectionPatternCS"
    // InternalUSE.g:3728:1: ruleCollectionPatternCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= RULE_ID ) ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleCollectionPatternCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_restVariableName_6_0=null;
        Token otherlv_7=null;
        EObject lv_ownedType_0_0 = null;

        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:3734:2: ( ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= RULE_ID ) ) ) )? otherlv_7= '}' ) )
            // InternalUSE.g:3735:2: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= RULE_ID ) ) ) )? otherlv_7= '}' )
            {
            // InternalUSE.g:3735:2: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= RULE_ID ) ) ) )? otherlv_7= '}' )
            // InternalUSE.g:3736:3: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= RULE_ID ) ) ) )? otherlv_7= '}'
            {
            // InternalUSE.g:3736:3: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) )
            // InternalUSE.g:3737:4: (lv_ownedType_0_0= ruleCollectionTypeCS )
            {
            // InternalUSE.g:3737:4: (lv_ownedType_0_0= ruleCollectionTypeCS )
            // InternalUSE.g:3738:5: lv_ownedType_0_0= ruleCollectionTypeCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getOwnedTypeCollectionTypeCSParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_ownedType_0_0=ruleCollectionTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCollectionPatternCSRule());
              					}
              					set(
              						current,
              						"ownedType",
              						lv_ownedType_0_0,
              						"modelConverter.use_language.USE.CollectionTypeCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCollectionPatternCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalUSE.g:3759:3: ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= RULE_ID ) ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==RULE_ID||LA85_0==41) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalUSE.g:3760:4: ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= RULE_ID ) ) )
                    {
                    // InternalUSE.g:3760:4: ( (lv_ownedParts_2_0= rulePatternExpCS ) )
                    // InternalUSE.g:3761:5: (lv_ownedParts_2_0= rulePatternExpCS )
                    {
                    // InternalUSE.g:3761:5: (lv_ownedParts_2_0= rulePatternExpCS )
                    // InternalUSE.g:3762:6: lv_ownedParts_2_0= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getOwnedPartsPatternExpCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_66);
                    lv_ownedParts_2_0=rulePatternExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCollectionPatternCSRule());
                      						}
                      						add(
                      							current,
                      							"ownedParts",
                      							lv_ownedParts_2_0,
                      							"modelConverter.use_language.USE.PatternExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUSE.g:3779:4: (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==14) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // InternalUSE.g:3780:5: otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FOLLOW_57); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getCollectionPatternCSAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalUSE.g:3784:5: ( (lv_ownedParts_4_0= rulePatternExpCS ) )
                    	    // InternalUSE.g:3785:6: (lv_ownedParts_4_0= rulePatternExpCS )
                    	    {
                    	    // InternalUSE.g:3785:6: (lv_ownedParts_4_0= rulePatternExpCS )
                    	    // InternalUSE.g:3786:7: lv_ownedParts_4_0= rulePatternExpCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getOwnedPartsPatternExpCSParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_66);
                    	    lv_ownedParts_4_0=rulePatternExpCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getCollectionPatternCSRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ownedParts",
                    	      								lv_ownedParts_4_0,
                    	      								"modelConverter.use_language.USE.PatternExpCS");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop84;
                        }
                    } while (true);

                    // InternalUSE.g:3804:4: (otherlv_5= '++' ( (lv_restVariableName_6_0= RULE_ID ) ) )
                    // InternalUSE.g:3805:5: otherlv_5= '++' ( (lv_restVariableName_6_0= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,91,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getCollectionPatternCSAccess().getPlusSignPlusSignKeyword_2_2_0());
                      				
                    }
                    // InternalUSE.g:3809:5: ( (lv_restVariableName_6_0= RULE_ID ) )
                    // InternalUSE.g:3810:6: (lv_restVariableName_6_0= RULE_ID )
                    {
                    // InternalUSE.g:3810:6: (lv_restVariableName_6_0= RULE_ID )
                    // InternalUSE.g:3811:7: lv_restVariableName_6_0= RULE_ID
                    {
                    lv_restVariableName_6_0=(Token)match(input,RULE_ID,FOLLOW_54); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_restVariableName_6_0, grammarAccess.getCollectionPatternCSAccess().getRestVariableNameIDTerminalRuleCall_2_2_1_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getCollectionPatternCSRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"restVariableName",
                      								lv_restVariableName_6_0,
                      								"org.eclipse.xtext.common.Terminals.ID");
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getCollectionPatternCSAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionPatternCS"


    // $ANTLR start "entryRulePatternExpCS"
    // InternalUSE.g:3837:1: entryRulePatternExpCS returns [EObject current=null] : iv_rulePatternExpCS= rulePatternExpCS EOF ;
    public final EObject entryRulePatternExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternExpCS = null;


        try {
            // InternalUSE.g:3837:53: (iv_rulePatternExpCS= rulePatternExpCS EOF )
            // InternalUSE.g:3838:2: iv_rulePatternExpCS= rulePatternExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPatternExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePatternExpCS=rulePatternExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePatternExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatternExpCS"


    // $ANTLR start "rulePatternExpCS"
    // InternalUSE.g:3844:1: rulePatternExpCS returns [EObject current=null] : ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject rulePatternExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_patternVariableName_0_0 = null;

        EObject lv_ownedPatternType_2_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:3850:2: ( ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) ) )
            // InternalUSE.g:3851:2: ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) )
            {
            // InternalUSE.g:3851:2: ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) )
            // InternalUSE.g:3852:3: ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) )
            {
            // InternalUSE.g:3852:3: ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_ID) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalUSE.g:3853:4: (lv_patternVariableName_0_0= ruleUnrestrictedName )
                    {
                    // InternalUSE.g:3853:4: (lv_patternVariableName_0_0= ruleUnrestrictedName )
                    // InternalUSE.g:3854:5: lv_patternVariableName_0_0= ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPatternExpCSAccess().getPatternVariableNameUnrestrictedNameParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_31);
                    lv_patternVariableName_0_0=ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getPatternExpCSRule());
                      					}
                      					set(
                      						current,
                      						"patternVariableName",
                      						lv_patternVariableName_0_0,
                      						"modelConverter.use_language.USE.UnrestrictedName");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,41,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPatternExpCSAccess().getColonKeyword_1());
              		
            }
            // InternalUSE.g:3875:3: ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) )
            // InternalUSE.g:3876:4: (lv_ownedPatternType_2_0= ruleTypeExpCS )
            {
            // InternalUSE.g:3876:4: (lv_ownedPatternType_2_0= ruleTypeExpCS )
            // InternalUSE.g:3877:5: lv_ownedPatternType_2_0= ruleTypeExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPatternExpCSAccess().getOwnedPatternTypeTypeExpCSParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_ownedPatternType_2_0=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPatternExpCSRule());
              					}
              					set(
              						current,
              						"ownedPatternType",
              						lv_ownedPatternType_2_0,
              						"modelConverter.use_language.USE.TypeExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatternExpCS"


    // $ANTLR start "entryRuleTypeExpCS"
    // InternalUSE.g:3898:1: entryRuleTypeExpCS returns [EObject current=null] : iv_ruleTypeExpCS= ruleTypeExpCS EOF ;
    public final EObject entryRuleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpCS = null;


        try {
            // InternalUSE.g:3898:50: (iv_ruleTypeExpCS= ruleTypeExpCS EOF )
            // InternalUSE.g:3899:2: iv_ruleTypeExpCS= ruleTypeExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeExpCS=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeExpCS"


    // $ANTLR start "ruleTypeExpCS"
    // InternalUSE.g:3905:1: ruleTypeExpCS returns [EObject current=null] : (this_TypeExpWithoutMultiplicityCS_0= ruleTypeExpWithoutMultiplicityCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? ) ;
    public final EObject ruleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeExpWithoutMultiplicityCS_0 = null;

        EObject lv_ownedMultiplicity_1_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:3911:2: ( (this_TypeExpWithoutMultiplicityCS_0= ruleTypeExpWithoutMultiplicityCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? ) )
            // InternalUSE.g:3912:2: (this_TypeExpWithoutMultiplicityCS_0= ruleTypeExpWithoutMultiplicityCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? )
            {
            // InternalUSE.g:3912:2: (this_TypeExpWithoutMultiplicityCS_0= ruleTypeExpWithoutMultiplicityCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? )
            // InternalUSE.g:3913:3: this_TypeExpWithoutMultiplicityCS_0= ruleTypeExpWithoutMultiplicityCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeExpCSAccess().getTypeExpWithoutMultiplicityCSParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_67);
            this_TypeExpWithoutMultiplicityCS_0=ruleTypeExpWithoutMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_TypeExpWithoutMultiplicityCS_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalUSE.g:3924:3: ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==35) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalUSE.g:3925:4: (lv_ownedMultiplicity_1_0= ruleMultiplicityCS )
                    {
                    // InternalUSE.g:3925:4: (lv_ownedMultiplicity_1_0= ruleMultiplicityCS )
                    // InternalUSE.g:3926:5: lv_ownedMultiplicity_1_0= ruleMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTypeExpCSAccess().getOwnedMultiplicityMultiplicityCSParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_ownedMultiplicity_1_0=ruleMultiplicityCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTypeExpCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedMultiplicity",
                      						lv_ownedMultiplicity_1_0,
                      						"modelConverter.use_language.USE.MultiplicityCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeExpCS"


    // $ANTLR start "entryRuleTypeExpWithoutMultiplicityCS"
    // InternalUSE.g:3947:1: entryRuleTypeExpWithoutMultiplicityCS returns [EObject current=null] : iv_ruleTypeExpWithoutMultiplicityCS= ruleTypeExpWithoutMultiplicityCS EOF ;
    public final EObject entryRuleTypeExpWithoutMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpWithoutMultiplicityCS = null;


        try {
            // InternalUSE.g:3947:69: (iv_ruleTypeExpWithoutMultiplicityCS= ruleTypeExpWithoutMultiplicityCS EOF )
            // InternalUSE.g:3948:2: iv_ruleTypeExpWithoutMultiplicityCS= ruleTypeExpWithoutMultiplicityCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeExpWithoutMultiplicityCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeExpWithoutMultiplicityCS=ruleTypeExpWithoutMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeExpWithoutMultiplicityCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeExpWithoutMultiplicityCS"


    // $ANTLR start "ruleTypeExpWithoutMultiplicityCS"
    // InternalUSE.g:3954:1: ruleTypeExpWithoutMultiplicityCS returns [EObject current=null] : (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) ;
    public final EObject ruleTypeExpWithoutMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeNameExpCS_0 = null;

        EObject this_TypeLiteralCS_1 = null;

        EObject this_CollectionPatternCS_2 = null;



        	enterRule();

        try {
            // InternalUSE.g:3960:2: ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) )
            // InternalUSE.g:3961:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS )
            {
            // InternalUSE.g:3961:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS )
            int alt88=3;
            alt88 = dfa88.predict(input);
            switch (alt88) {
                case 1 :
                    // InternalUSE.g:3962:3: this_TypeNameExpCS_0= ruleTypeNameExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeExpWithoutMultiplicityCSAccess().getTypeNameExpCSParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeNameExpCS_0=ruleTypeNameExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeNameExpCS_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUSE.g:3974:3: this_TypeLiteralCS_1= ruleTypeLiteralCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeExpWithoutMultiplicityCSAccess().getTypeLiteralCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeLiteralCS_1=ruleTypeLiteralCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeLiteralCS_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUSE.g:3986:3: this_CollectionPatternCS_2= ruleCollectionPatternCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeExpWithoutMultiplicityCSAccess().getCollectionPatternCSParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CollectionPatternCS_2=ruleCollectionPatternCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CollectionPatternCS_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeExpWithoutMultiplicityCS"


    // $ANTLR start "entryRuleTypeLiteralCS"
    // InternalUSE.g:4001:1: entryRuleTypeLiteralCS returns [EObject current=null] : iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF ;
    public final EObject entryRuleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralCS = null;


        try {
            // InternalUSE.g:4001:54: (iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF )
            // InternalUSE.g:4002:2: iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeLiteralCS=ruleTypeLiteralCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeLiteralCS"


    // $ANTLR start "ruleTypeLiteralCS"
    // InternalUSE.g:4008:1: ruleTypeLiteralCS returns [EObject current=null] : (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS ) ;
    public final EObject ruleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveTypeCS_0 = null;

        EObject this_CollectionTypeCS_1 = null;

        EObject this_MapTypeCS_2 = null;

        EObject this_TupleTypeCS_3 = null;



        	enterRule();

        try {
            // InternalUSE.g:4014:2: ( (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS ) )
            // InternalUSE.g:4015:2: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS )
            {
            // InternalUSE.g:4015:2: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS )
            int alt89=4;
            switch ( input.LA(1) ) {
            case 15:
            case 16:
            case 17:
            case 18:
            case 62:
            case 63:
            case 64:
            case 65:
                {
                alt89=1;
                }
                break;
            case 19:
            case 20:
            case 21:
            case 66:
            case 67:
                {
                alt89=2;
                }
                break;
            case 68:
                {
                alt89=3;
                }
                break;
            case 69:
                {
                alt89=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // InternalUSE.g:4016:3: this_PrimitiveTypeCS_0= rulePrimitiveTypeCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getPrimitiveTypeCSParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimitiveTypeCS_0=rulePrimitiveTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrimitiveTypeCS_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUSE.g:4028:3: this_CollectionTypeCS_1= ruleCollectionTypeCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getCollectionTypeCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CollectionTypeCS_1=ruleCollectionTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CollectionTypeCS_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUSE.g:4040:3: this_MapTypeCS_2= ruleMapTypeCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getMapTypeCSParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MapTypeCS_2=ruleMapTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MapTypeCS_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalUSE.g:4052:3: this_TupleTypeCS_3= ruleTupleTypeCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getTupleTypeCSParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TupleTypeCS_3=ruleTupleTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TupleTypeCS_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeLiteralCS"


    // $ANTLR start "entryRuleTypeLiteralExpCS"
    // InternalUSE.g:4067:1: entryRuleTypeLiteralExpCS returns [EObject current=null] : iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF ;
    public final EObject entryRuleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralExpCS = null;


        try {
            // InternalUSE.g:4067:57: (iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF )
            // InternalUSE.g:4068:2: iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeLiteralExpCS=ruleTypeLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeLiteralExpCS"


    // $ANTLR start "ruleTypeLiteralExpCS"
    // InternalUSE.g:4074:1: ruleTypeLiteralExpCS returns [EObject current=null] : ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) ) ;
    public final EObject ruleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedType_0_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:4080:2: ( ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) ) )
            // InternalUSE.g:4081:2: ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) )
            {
            // InternalUSE.g:4081:2: ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) )
            // InternalUSE.g:4082:3: (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS )
            {
            // InternalUSE.g:4082:3: (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS )
            // InternalUSE.g:4083:4: lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getTypeLiteralExpCSAccess().getOwnedTypeTypeLiteralWithMultiplicityCSParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_ownedType_0_0=ruleTypeLiteralWithMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getTypeLiteralExpCSRule());
              				}
              				set(
              					current,
              					"ownedType",
              					lv_ownedType_0_0,
              					"modelConverter.use_language.USE.TypeLiteralWithMultiplicityCS");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeLiteralExpCS"


    // $ANTLR start "entryRuleTypeLiteralWithMultiplicityCS"
    // InternalUSE.g:4103:1: entryRuleTypeLiteralWithMultiplicityCS returns [EObject current=null] : iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF ;
    public final EObject entryRuleTypeLiteralWithMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralWithMultiplicityCS = null;


        try {
            // InternalUSE.g:4103:70: (iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF )
            // InternalUSE.g:4104:2: iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeLiteralWithMultiplicityCS=ruleTypeLiteralWithMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralWithMultiplicityCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeLiteralWithMultiplicityCS"


    // $ANTLR start "ruleTypeLiteralWithMultiplicityCS"
    // InternalUSE.g:4110:1: ruleTypeLiteralWithMultiplicityCS returns [EObject current=null] : (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? ) ;
    public final EObject ruleTypeLiteralWithMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeLiteralCS_0 = null;

        EObject lv_ownedMultiplicity_1_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:4116:2: ( (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? ) )
            // InternalUSE.g:4117:2: (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? )
            {
            // InternalUSE.g:4117:2: (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? )
            // InternalUSE.g:4118:3: this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSAccess().getTypeLiteralCSParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_67);
            this_TypeLiteralCS_0=ruleTypeLiteralCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_TypeLiteralCS_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalUSE.g:4129:3: ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==35) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalUSE.g:4130:4: (lv_ownedMultiplicity_1_0= ruleMultiplicityCS )
                    {
                    // InternalUSE.g:4130:4: (lv_ownedMultiplicity_1_0= ruleMultiplicityCS )
                    // InternalUSE.g:4131:5: lv_ownedMultiplicity_1_0= ruleMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSAccess().getOwnedMultiplicityMultiplicityCSParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_ownedMultiplicity_1_0=ruleMultiplicityCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTypeLiteralWithMultiplicityCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedMultiplicity",
                      						lv_ownedMultiplicity_1_0,
                      						"modelConverter.use_language.USE.MultiplicityCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeLiteralWithMultiplicityCS"


    // $ANTLR start "entryRuleTypeNameExpCS"
    // InternalUSE.g:4152:1: entryRuleTypeNameExpCS returns [EObject current=null] : iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF ;
    public final EObject entryRuleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeNameExpCS = null;


        try {
            // InternalUSE.g:4152:54: (iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF )
            // InternalUSE.g:4153:2: iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeNameExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeNameExpCS=ruleTypeNameExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeNameExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeNameExpCS"


    // $ANTLR start "ruleTypeNameExpCS"
    // InternalUSE.g:4159:1: ruleTypeNameExpCS returns [EObject current=null] : ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? ) ;
    public final EObject ruleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedPathName_0_0 = null;

        EObject lv_ownedCurlyBracketedClause_1_0 = null;

        EObject lv_ownedPatternGuard_3_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:4165:2: ( ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? ) )
            // InternalUSE.g:4166:2: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? )
            {
            // InternalUSE.g:4166:2: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? )
            // InternalUSE.g:4167:3: ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )?
            {
            // InternalUSE.g:4167:3: ( (lv_ownedPathName_0_0= rulePathNameCS ) )
            // InternalUSE.g:4168:4: (lv_ownedPathName_0_0= rulePathNameCS )
            {
            // InternalUSE.g:4168:4: (lv_ownedPathName_0_0= rulePathNameCS )
            // InternalUSE.g:4169:5: lv_ownedPathName_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getOwnedPathNamePathNameCSParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_50);
            lv_ownedPathName_0_0=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypeNameExpCSRule());
              					}
              					set(
              						current,
              						"ownedPathName",
              						lv_ownedPathName_0_0,
              						"modelConverter.use_language.USE.PathNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUSE.g:4186:3: ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==25) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalUSE.g:4187:4: ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )?
                    {
                    // InternalUSE.g:4187:4: ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) )
                    // InternalUSE.g:4188:5: (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS )
                    {
                    // InternalUSE.g:4188:5: (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS )
                    // InternalUSE.g:4189:6: lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getOwnedCurlyBracketedClauseCurlyBracketedClauseCSParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_50);
                    lv_ownedCurlyBracketedClause_1_0=ruleCurlyBracketedClauseCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTypeNameExpCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedCurlyBracketedClause",
                      							lv_ownedCurlyBracketedClause_1_0,
                      							"modelConverter.use_language.USE.CurlyBracketedClauseCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUSE.g:4206:4: (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==25) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // InternalUSE.g:4207:5: otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}'
                            {
                            otherlv_2=(Token)match(input,25,FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getTypeNameExpCSAccess().getLeftCurlyBracketKeyword_1_1_0());
                              				
                            }
                            // InternalUSE.g:4211:5: ( (lv_ownedPatternGuard_3_0= ruleExpCS ) )
                            // InternalUSE.g:4212:6: (lv_ownedPatternGuard_3_0= ruleExpCS )
                            {
                            // InternalUSE.g:4212:6: (lv_ownedPatternGuard_3_0= ruleExpCS )
                            // InternalUSE.g:4213:7: lv_ownedPatternGuard_3_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getOwnedPatternGuardExpCSParserRuleCall_1_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_54);
                            lv_ownedPatternGuard_3_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTypeNameExpCSRule());
                              							}
                              							set(
                              								current,
                              								"ownedPatternGuard",
                              								lv_ownedPatternGuard_3_0,
                              								"modelConverter.use_language.USE.ExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            otherlv_4=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getTypeNameExpCSAccess().getRightCurlyBracketKeyword_1_1_2());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeNameExpCS"


    // $ANTLR start "entryRuleCurlyBracketedClauseCS"
    // InternalUSE.g:4240:1: entryRuleCurlyBracketedClauseCS returns [EObject current=null] : iv_ruleCurlyBracketedClauseCS= ruleCurlyBracketedClauseCS EOF ;
    public final EObject entryRuleCurlyBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCurlyBracketedClauseCS = null;


        try {
            // InternalUSE.g:4240:63: (iv_ruleCurlyBracketedClauseCS= ruleCurlyBracketedClauseCS EOF )
            // InternalUSE.g:4241:2: iv_ruleCurlyBracketedClauseCS= ruleCurlyBracketedClauseCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCurlyBracketedClauseCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCurlyBracketedClauseCS=ruleCurlyBracketedClauseCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCurlyBracketedClauseCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCurlyBracketedClauseCS"


    // $ANTLR start "ruleCurlyBracketedClauseCS"
    // InternalUSE.g:4247:1: ruleCurlyBracketedClauseCS returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleCurlyBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:4253:2: ( ( () otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? otherlv_5= '}' ) )
            // InternalUSE.g:4254:2: ( () otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? otherlv_5= '}' )
            {
            // InternalUSE.g:4254:2: ( () otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? otherlv_5= '}' )
            // InternalUSE.g:4255:3: () otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? otherlv_5= '}'
            {
            // InternalUSE.g:4255:3: ()
            // InternalUSE.g:4256:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCurlyBracketedClauseCSAccess().getCurlyBracketedClauseCSAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,25,FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCurlyBracketedClauseCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalUSE.g:4269:3: ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==RULE_ID||LA94_0==RULE_STRING) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalUSE.g:4270:4: ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )*
                    {
                    // InternalUSE.g:4270:4: ( (lv_ownedParts_2_0= ruleShadowPartCS ) )
                    // InternalUSE.g:4271:5: (lv_ownedParts_2_0= ruleShadowPartCS )
                    {
                    // InternalUSE.g:4271:5: (lv_ownedParts_2_0= ruleShadowPartCS )
                    // InternalUSE.g:4272:6: lv_ownedParts_2_0= ruleShadowPartCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCurlyBracketedClauseCSAccess().getOwnedPartsShadowPartCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_69);
                    lv_ownedParts_2_0=ruleShadowPartCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCurlyBracketedClauseCSRule());
                      						}
                      						add(
                      							current,
                      							"ownedParts",
                      							lv_ownedParts_2_0,
                      							"modelConverter.use_language.USE.ShadowPartCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUSE.g:4289:4: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )*
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==14) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // InternalUSE.g:4290:5: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FOLLOW_70); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getCurlyBracketedClauseCSAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalUSE.g:4294:5: ( (lv_ownedParts_4_0= ruleShadowPartCS ) )
                    	    // InternalUSE.g:4295:6: (lv_ownedParts_4_0= ruleShadowPartCS )
                    	    {
                    	    // InternalUSE.g:4295:6: (lv_ownedParts_4_0= ruleShadowPartCS )
                    	    // InternalUSE.g:4296:7: lv_ownedParts_4_0= ruleShadowPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getCurlyBracketedClauseCSAccess().getOwnedPartsShadowPartCSParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_69);
                    	    lv_ownedParts_4_0=ruleShadowPartCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getCurlyBracketedClauseCSRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ownedParts",
                    	      								lv_ownedParts_4_0,
                    	      								"modelConverter.use_language.USE.ShadowPartCS");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop93;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getCurlyBracketedClauseCSAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCurlyBracketedClauseCS"


    // $ANTLR start "entryRuleShadowPartCS"
    // InternalUSE.g:4323:1: entryRuleShadowPartCS returns [EObject current=null] : iv_ruleShadowPartCS= ruleShadowPartCS EOF ;
    public final EObject entryRuleShadowPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShadowPartCS = null;


        try {
            // InternalUSE.g:4323:53: (iv_ruleShadowPartCS= ruleShadowPartCS EOF )
            // InternalUSE.g:4324:2: iv_ruleShadowPartCS= ruleShadowPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShadowPartCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShadowPartCS=ruleShadowPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShadowPartCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShadowPartCS"


    // $ANTLR start "ruleShadowPartCS"
    // InternalUSE.g:4330:1: ruleShadowPartCS returns [EObject current=null] : ( ( ( (lv_referredProperty_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) ) | ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) ) ) ;
    public final EObject ruleShadowPartCS() throws RecognitionException {
        EObject current = null;

        Token lv_referredProperty_0_0=null;
        Token otherlv_1=null;
        EObject lv_ownedInitExpression_2_1 = null;

        EObject lv_ownedInitExpression_2_2 = null;

        EObject lv_ownedInitExpression_3_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:4336:2: ( ( ( ( (lv_referredProperty_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) ) | ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) ) ) )
            // InternalUSE.g:4337:2: ( ( ( (lv_referredProperty_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) ) | ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) ) )
            {
            // InternalUSE.g:4337:2: ( ( ( (lv_referredProperty_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) ) | ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) ) )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==RULE_ID) ) {
                alt96=1;
            }
            else if ( (LA96_0==RULE_STRING) ) {
                alt96=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // InternalUSE.g:4338:3: ( ( (lv_referredProperty_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) )
                    {
                    // InternalUSE.g:4338:3: ( ( (lv_referredProperty_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) )
                    // InternalUSE.g:4339:4: ( (lv_referredProperty_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) )
                    {
                    // InternalUSE.g:4339:4: ( (lv_referredProperty_0_0= RULE_ID ) )
                    // InternalUSE.g:4340:5: (lv_referredProperty_0_0= RULE_ID )
                    {
                    // InternalUSE.g:4340:5: (lv_referredProperty_0_0= RULE_ID )
                    // InternalUSE.g:4341:6: lv_referredProperty_0_0= RULE_ID
                    {
                    lv_referredProperty_0_0=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_referredProperty_0_0, grammarAccess.getShadowPartCSAccess().getReferredPropertyIDTerminalRuleCall_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getShadowPartCSRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"referredProperty",
                      							lv_referredProperty_0_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,46,FOLLOW_71); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getShadowPartCSAccess().getEqualsSignKeyword_0_1());
                      			
                    }
                    // InternalUSE.g:4361:4: ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) )
                    // InternalUSE.g:4362:5: ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) )
                    {
                    // InternalUSE.g:4362:5: ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) )
                    // InternalUSE.g:4363:6: (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS )
                    {
                    // InternalUSE.g:4363:6: (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS )
                    int alt95=2;
                    switch ( input.LA(1) ) {
                    case RULE_INT:
                    case RULE_STRING:
                    case 12:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                    case 69:
                    case 72:
                    case 89:
                    case 90:
                    case 96:
                    case 98:
                    case 99:
                    case 100:
                    case 101:
                    case 102:
                    case 107:
                        {
                        alt95=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA95_2 = input.LA(2);

                        if ( (LA95_2==EOF||LA95_2==12||LA95_2==14||LA95_2==22||(LA95_2>=25 && LA95_2<=26)||LA95_2==29||LA95_2==35||LA95_2==46||LA95_2==55||LA95_2==59||(LA95_2>=70 && LA95_2<=88)||LA95_2==95) ) {
                            alt95=1;
                        }
                        else if ( (LA95_2==41) ) {
                            alt95=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 95, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 41:
                        {
                        alt95=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 95, 0, input);

                        throw nvae;
                    }

                    switch (alt95) {
                        case 1 :
                            // InternalUSE.g:4364:7: lv_ownedInitExpression_2_1= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getShadowPartCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_2_0_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_ownedInitExpression_2_1=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getShadowPartCSRule());
                              							}
                              							set(
                              								current,
                              								"ownedInitExpression",
                              								lv_ownedInitExpression_2_1,
                              								"modelConverter.use_language.USE.ExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalUSE.g:4380:7: lv_ownedInitExpression_2_2= rulePatternExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getShadowPartCSAccess().getOwnedInitExpressionPatternExpCSParserRuleCall_0_2_0_1());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_ownedInitExpression_2_2=rulePatternExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getShadowPartCSRule());
                              							}
                              							set(
                              								current,
                              								"ownedInitExpression",
                              								lv_ownedInitExpression_2_2,
                              								"modelConverter.use_language.USE.PatternExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:4400:3: ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) )
                    {
                    // InternalUSE.g:4400:3: ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) )
                    // InternalUSE.g:4401:4: (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS )
                    {
                    // InternalUSE.g:4401:4: (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS )
                    // InternalUSE.g:4402:5: lv_ownedInitExpression_3_0= ruleStringLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getShadowPartCSAccess().getOwnedInitExpressionStringLiteralExpCSParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_ownedInitExpression_3_0=ruleStringLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getShadowPartCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedInitExpression",
                      						lv_ownedInitExpression_3_0,
                      						"modelConverter.use_language.USE.StringLiteralExpCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShadowPartCS"


    // $ANTLR start "entryRuleStringLiteralExpCS"
    // InternalUSE.g:4423:1: entryRuleStringLiteralExpCS returns [EObject current=null] : iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF ;
    public final EObject entryRuleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpCS = null;


        try {
            // InternalUSE.g:4423:59: (iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF )
            // InternalUSE.g:4424:2: iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteralExpCS=ruleStringLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteralExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteralExpCS"


    // $ANTLR start "ruleStringLiteralExpCS"
    // InternalUSE.g:4430:1: ruleStringLiteralExpCS returns [EObject current=null] : ( (lv_segments_0_0= ruleStringLiteral ) )+ ;
    public final EObject ruleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_segments_0_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:4436:2: ( ( (lv_segments_0_0= ruleStringLiteral ) )+ )
            // InternalUSE.g:4437:2: ( (lv_segments_0_0= ruleStringLiteral ) )+
            {
            // InternalUSE.g:4437:2: ( (lv_segments_0_0= ruleStringLiteral ) )+
            int cnt97=0;
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==RULE_STRING) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // InternalUSE.g:4438:3: (lv_segments_0_0= ruleStringLiteral )
            	    {
            	    // InternalUSE.g:4438:3: (lv_segments_0_0= ruleStringLiteral )
            	    // InternalUSE.g:4439:4: lv_segments_0_0= ruleStringLiteral
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getStringLiteralExpCSAccess().getSegmentsStringLiteralParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_72);
            	    lv_segments_0_0=ruleStringLiteral();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getStringLiteralExpCSRule());
            	      				}
            	      				add(
            	      					current,
            	      					"segments",
            	      					lv_segments_0_0,
            	      					"modelConverter.use_language.USE.StringLiteral");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt97 >= 1 ) break loop97;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(97, input);
                        throw eee;
                }
                cnt97++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteralExpCS"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalUSE.g:4459:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // InternalUSE.g:4459:53: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalUSE.g:4460:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalUSE.g:4466:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalUSE.g:4472:2: (this_STRING_0= RULE_STRING )
            // InternalUSE.g:4473:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_STRING_0, grammarAccess.getStringLiteralAccess().getSTRINGTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleMultiplicityBoundsCS"
    // InternalUSE.g:4483:1: entryRuleMultiplicityBoundsCS returns [EObject current=null] : iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF ;
    public final EObject entryRuleMultiplicityBoundsCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityBoundsCS = null;


        try {
            // InternalUSE.g:4483:61: (iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF )
            // InternalUSE.g:4484:2: iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityBoundsCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicityBoundsCS=ruleMultiplicityBoundsCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityBoundsCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicityBoundsCS"


    // $ANTLR start "ruleMultiplicityBoundsCS"
    // InternalUSE.g:4490:1: ruleMultiplicityBoundsCS returns [EObject current=null] : ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? ) ;
    public final EObject ruleMultiplicityBoundsCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_lowerBound_0_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_2_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:4496:2: ( ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? ) )
            // InternalUSE.g:4497:2: ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? )
            {
            // InternalUSE.g:4497:2: ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? )
            // InternalUSE.g:4498:3: ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )?
            {
            // InternalUSE.g:4498:3: ( (lv_lowerBound_0_0= ruleLOWER ) )
            // InternalUSE.g:4499:4: (lv_lowerBound_0_0= ruleLOWER )
            {
            // InternalUSE.g:4499:4: (lv_lowerBound_0_0= ruleLOWER )
            // InternalUSE.g:4500:5: lv_lowerBound_0_0= ruleLOWER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMultiplicityBoundsCSAccess().getLowerBoundLOWERParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_73);
            lv_lowerBound_0_0=ruleLOWER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMultiplicityBoundsCSRule());
              					}
              					set(
              						current,
              						"lowerBound",
              						lv_lowerBound_0_0,
              						"modelConverter.use_language.USE.LOWER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUSE.g:4517:3: (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==13) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalUSE.g:4518:4: otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getMultiplicityBoundsCSAccess().getFullStopFullStopKeyword_1_0());
                      			
                    }
                    // InternalUSE.g:4522:4: ( (lv_upperBound_2_0= ruleUPPER ) )
                    // InternalUSE.g:4523:5: (lv_upperBound_2_0= ruleUPPER )
                    {
                    // InternalUSE.g:4523:5: (lv_upperBound_2_0= ruleUPPER )
                    // InternalUSE.g:4524:6: lv_upperBound_2_0= ruleUPPER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMultiplicityBoundsCSAccess().getUpperBoundUPPERParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_upperBound_2_0=ruleUPPER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMultiplicityBoundsCSRule());
                      						}
                      						set(
                      							current,
                      							"upperBound",
                      							lv_upperBound_2_0,
                      							"modelConverter.use_language.USE.UPPER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicityBoundsCS"


    // $ANTLR start "entryRuleMultiplicityCS"
    // InternalUSE.g:4546:1: entryRuleMultiplicityCS returns [EObject current=null] : iv_ruleMultiplicityCS= ruleMultiplicityCS EOF ;
    public final EObject entryRuleMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityCS = null;


        try {
            // InternalUSE.g:4546:55: (iv_ruleMultiplicityCS= ruleMultiplicityCS EOF )
            // InternalUSE.g:4547:2: iv_ruleMultiplicityCS= ruleMultiplicityCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicityCS=ruleMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicityCS"


    // $ANTLR start "ruleMultiplicityCS"
    // InternalUSE.g:4553:1: ruleMultiplicityCS returns [EObject current=null] : (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) ( ( (lv_symbol_3_1= '|?' | lv_symbol_3_2= '|1' ) ) )? otherlv_4= ']' ) ;
    public final EObject ruleMultiplicityCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_symbol_3_1=null;
        Token lv_symbol_3_2=null;
        Token otherlv_4=null;
        EObject this_MultiplicityBoundsCS_1 = null;

        EObject this_MultiplicityStringCS_2 = null;



        	enterRule();

        try {
            // InternalUSE.g:4559:2: ( (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) ( ( (lv_symbol_3_1= '|?' | lv_symbol_3_2= '|1' ) ) )? otherlv_4= ']' ) )
            // InternalUSE.g:4560:2: (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) ( ( (lv_symbol_3_1= '|?' | lv_symbol_3_2= '|1' ) ) )? otherlv_4= ']' )
            {
            // InternalUSE.g:4560:2: (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) ( ( (lv_symbol_3_1= '|?' | lv_symbol_3_2= '|1' ) ) )? otherlv_4= ']' )
            // InternalUSE.g:4561:3: otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) ( ( (lv_symbol_3_1= '|?' | lv_symbol_3_2= '|1' ) ) )? otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMultiplicityCSAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalUSE.g:4565:3: (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==RULE_INT) ) {
                alt99=1;
            }
            else if ( (LA99_0==12||LA99_0==71||LA99_0==94) ) {
                alt99=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // InternalUSE.g:4566:4: this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getMultiplicityCSAccess().getMultiplicityBoundsCSParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_75);
                    this_MultiplicityBoundsCS_1=ruleMultiplicityBoundsCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_MultiplicityBoundsCS_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalUSE.g:4578:4: this_MultiplicityStringCS_2= ruleMultiplicityStringCS
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getMultiplicityCSAccess().getMultiplicityStringCSParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_75);
                    this_MultiplicityStringCS_2=ruleMultiplicityStringCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_MultiplicityStringCS_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalUSE.g:4590:3: ( ( (lv_symbol_3_1= '|?' | lv_symbol_3_2= '|1' ) ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( ((LA101_0>=92 && LA101_0<=93)) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalUSE.g:4591:4: ( (lv_symbol_3_1= '|?' | lv_symbol_3_2= '|1' ) )
                    {
                    // InternalUSE.g:4591:4: ( (lv_symbol_3_1= '|?' | lv_symbol_3_2= '|1' ) )
                    // InternalUSE.g:4592:5: (lv_symbol_3_1= '|?' | lv_symbol_3_2= '|1' )
                    {
                    // InternalUSE.g:4592:5: (lv_symbol_3_1= '|?' | lv_symbol_3_2= '|1' )
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==92) ) {
                        alt100=1;
                    }
                    else if ( (LA100_0==93) ) {
                        alt100=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 100, 0, input);

                        throw nvae;
                    }
                    switch (alt100) {
                        case 1 :
                            // InternalUSE.g:4593:6: lv_symbol_3_1= '|?'
                            {
                            lv_symbol_3_1=(Token)match(input,92,FOLLOW_24); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_symbol_3_1, grammarAccess.getMultiplicityCSAccess().getSymbolVerticalLineQuestionMarkKeyword_2_0_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getMultiplicityCSRule());
                              						}
                              						setWithLastConsumed(current, "symbol", lv_symbol_3_1, null);
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalUSE.g:4604:6: lv_symbol_3_2= '|1'
                            {
                            lv_symbol_3_2=(Token)match(input,93,FOLLOW_24); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_symbol_3_2, grammarAccess.getMultiplicityCSAccess().getSymbol1Keyword_2_0_1());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getMultiplicityCSRule());
                              						}
                              						setWithLastConsumed(current, "symbol", lv_symbol_3_2, null);
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getMultiplicityCSAccess().getRightSquareBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicityCS"


    // $ANTLR start "entryRuleMultiplicityStringCS"
    // InternalUSE.g:4625:1: entryRuleMultiplicityStringCS returns [EObject current=null] : iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF ;
    public final EObject entryRuleMultiplicityStringCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityStringCS = null;


        try {
            // InternalUSE.g:4625:61: (iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF )
            // InternalUSE.g:4626:2: iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityStringCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicityStringCS=ruleMultiplicityStringCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityStringCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicityStringCS"


    // $ANTLR start "ruleMultiplicityStringCS"
    // InternalUSE.g:4632:1: ruleMultiplicityStringCS returns [EObject current=null] : ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) ) ;
    public final EObject ruleMultiplicityStringCS() throws RecognitionException {
        EObject current = null;

        Token lv_stringBounds_0_1=null;
        Token lv_stringBounds_0_2=null;
        Token lv_stringBounds_0_3=null;


        	enterRule();

        try {
            // InternalUSE.g:4638:2: ( ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) ) )
            // InternalUSE.g:4639:2: ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) )
            {
            // InternalUSE.g:4639:2: ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) )
            // InternalUSE.g:4640:3: ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) )
            {
            // InternalUSE.g:4640:3: ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) )
            // InternalUSE.g:4641:4: (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' )
            {
            // InternalUSE.g:4641:4: (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' )
            int alt102=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt102=1;
                }
                break;
            case 71:
                {
                alt102=2;
                }
                break;
            case 94:
                {
                alt102=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // InternalUSE.g:4642:5: lv_stringBounds_0_1= '*'
                    {
                    lv_stringBounds_0_1=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_stringBounds_0_1, grammarAccess.getMultiplicityStringCSAccess().getStringBoundsAsteriskKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMultiplicityStringCSRule());
                      					}
                      					setWithLastConsumed(current, "stringBounds", lv_stringBounds_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalUSE.g:4653:5: lv_stringBounds_0_2= '+'
                    {
                    lv_stringBounds_0_2=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_stringBounds_0_2, grammarAccess.getMultiplicityStringCSAccess().getStringBoundsPlusSignKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMultiplicityStringCSRule());
                      					}
                      					setWithLastConsumed(current, "stringBounds", lv_stringBounds_0_2, null);
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalUSE.g:4664:5: lv_stringBounds_0_3= '?'
                    {
                    lv_stringBounds_0_3=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_stringBounds_0_3, grammarAccess.getMultiplicityStringCSAccess().getStringBoundsQuestionMarkKeyword_0_2());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMultiplicityStringCSRule());
                      					}
                      					setWithLastConsumed(current, "stringBounds", lv_stringBounds_0_3, null);
                      				
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicityStringCS"


    // $ANTLR start "entryRulePathNameCS"
    // InternalUSE.g:4680:1: entryRulePathNameCS returns [EObject current=null] : iv_rulePathNameCS= rulePathNameCS EOF ;
    public final EObject entryRulePathNameCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathNameCS = null;


        try {
            // InternalUSE.g:4680:51: (iv_rulePathNameCS= rulePathNameCS EOF )
            // InternalUSE.g:4681:2: iv_rulePathNameCS= rulePathNameCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPathNameCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePathNameCS=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePathNameCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePathNameCS"


    // $ANTLR start "rulePathNameCS"
    // InternalUSE.g:4687:1: rulePathNameCS returns [EObject current=null] : ( ( (lv_ownedPathElements_0_0= RULE_ID ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= RULE_ID ) ) )* ) ;
    public final EObject rulePathNameCS() throws RecognitionException {
        EObject current = null;

        Token lv_ownedPathElements_0_0=null;
        Token otherlv_1=null;
        Token lv_ownedPathElements_2_0=null;


        	enterRule();

        try {
            // InternalUSE.g:4693:2: ( ( ( (lv_ownedPathElements_0_0= RULE_ID ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= RULE_ID ) ) )* ) )
            // InternalUSE.g:4694:2: ( ( (lv_ownedPathElements_0_0= RULE_ID ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= RULE_ID ) ) )* )
            {
            // InternalUSE.g:4694:2: ( ( (lv_ownedPathElements_0_0= RULE_ID ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= RULE_ID ) ) )* )
            // InternalUSE.g:4695:3: ( (lv_ownedPathElements_0_0= RULE_ID ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= RULE_ID ) ) )*
            {
            // InternalUSE.g:4695:3: ( (lv_ownedPathElements_0_0= RULE_ID ) )
            // InternalUSE.g:4696:4: (lv_ownedPathElements_0_0= RULE_ID )
            {
            // InternalUSE.g:4696:4: (lv_ownedPathElements_0_0= RULE_ID )
            // InternalUSE.g:4697:5: lv_ownedPathElements_0_0= RULE_ID
            {
            lv_ownedPathElements_0_0=(Token)match(input,RULE_ID,FOLLOW_76); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_ownedPathElements_0_0, grammarAccess.getPathNameCSAccess().getOwnedPathElementsIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPathNameCSRule());
              					}
              					addWithLastConsumed(
              						current,
              						"ownedPathElements",
              						lv_ownedPathElements_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalUSE.g:4713:3: (otherlv_1= '::' ( (lv_ownedPathElements_2_0= RULE_ID ) ) )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==59) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // InternalUSE.g:4714:4: otherlv_1= '::' ( (lv_ownedPathElements_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,59,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getPathNameCSAccess().getColonColonKeyword_1_0());
            	      			
            	    }
            	    // InternalUSE.g:4718:4: ( (lv_ownedPathElements_2_0= RULE_ID ) )
            	    // InternalUSE.g:4719:5: (lv_ownedPathElements_2_0= RULE_ID )
            	    {
            	    // InternalUSE.g:4719:5: (lv_ownedPathElements_2_0= RULE_ID )
            	    // InternalUSE.g:4720:6: lv_ownedPathElements_2_0= RULE_ID
            	    {
            	    lv_ownedPathElements_2_0=(Token)match(input,RULE_ID,FOLLOW_76); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_ownedPathElements_2_0, grammarAccess.getPathNameCSAccess().getOwnedPathElementsIDTerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getPathNameCSRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"ownedPathElements",
            	      							lv_ownedPathElements_2_0,
            	      							"org.eclipse.xtext.common.Terminals.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop103;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePathNameCS"


    // $ANTLR start "entryRuleUPPER"
    // InternalUSE.g:4741:1: entryRuleUPPER returns [String current=null] : iv_ruleUPPER= ruleUPPER EOF ;
    public final String entryRuleUPPER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUPPER = null;


        try {
            // InternalUSE.g:4741:45: (iv_ruleUPPER= ruleUPPER EOF )
            // InternalUSE.g:4742:2: iv_ruleUPPER= ruleUPPER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUPPERRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUPPER=ruleUPPER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUPPER.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUPPER"


    // $ANTLR start "ruleUPPER"
    // InternalUSE.g:4748:1: ruleUPPER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IntToString_0= ruleIntToString | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleUPPER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IntToString_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:4754:2: ( (this_IntToString_0= ruleIntToString | kw= '*' ) )
            // InternalUSE.g:4755:2: (this_IntToString_0= ruleIntToString | kw= '*' )
            {
            // InternalUSE.g:4755:2: (this_IntToString_0= ruleIntToString | kw= '*' )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==RULE_INT) ) {
                alt104=1;
            }
            else if ( (LA104_0==12) ) {
                alt104=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }
            switch (alt104) {
                case 1 :
                    // InternalUSE.g:4756:3: this_IntToString_0= ruleIntToString
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUPPERAccess().getIntToStringParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IntToString_0=ruleIntToString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_IntToString_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUSE.g:4767:3: kw= '*'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUPPERAccess().getAsteriskKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUPPER"


    // $ANTLR start "entryRuleLOWER"
    // InternalUSE.g:4776:1: entryRuleLOWER returns [String current=null] : iv_ruleLOWER= ruleLOWER EOF ;
    public final String entryRuleLOWER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLOWER = null;


        try {
            // InternalUSE.g:4776:45: (iv_ruleLOWER= ruleLOWER EOF )
            // InternalUSE.g:4777:2: iv_ruleLOWER= ruleLOWER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLOWERRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLOWER=ruleLOWER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLOWER.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLOWER"


    // $ANTLR start "ruleLOWER"
    // InternalUSE.g:4783:1: ruleLOWER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IntToString_0= ruleIntToString ;
    public final AntlrDatatypeRuleToken ruleLOWER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IntToString_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:4789:2: (this_IntToString_0= ruleIntToString )
            // InternalUSE.g:4790:2: this_IntToString_0= ruleIntToString
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getLOWERAccess().getIntToStringParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_IntToString_0=ruleIntToString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_IntToString_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLOWER"


    // $ANTLR start "entryRuleExpCS"
    // InternalUSE.g:4803:1: entryRuleExpCS returns [EObject current=null] : iv_ruleExpCS= ruleExpCS EOF ;
    public final EObject entryRuleExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpCS = null;


        try {
            // InternalUSE.g:4803:46: (iv_ruleExpCS= ruleExpCS EOF )
            // InternalUSE.g:4804:2: iv_ruleExpCS= ruleExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpCS=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpCS"


    // $ANTLR start "ruleExpCS"
    // InternalUSE.g:4810:1: ruleExpCS returns [EObject current=null] : ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS ) ;
    public final EObject ruleExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrefixedPrimaryExpCS_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_ownedRight_3_0 = null;

        EObject this_PrefixedLetExpCS_4 = null;



        	enterRule();

        try {
            // InternalUSE.g:4816:2: ( ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS ) )
            // InternalUSE.g:4817:2: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS )
            {
            // InternalUSE.g:4817:2: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS )
            int alt106=2;
            alt106 = dfa106.predict(input);
            switch (alt106) {
                case 1 :
                    // InternalUSE.g:4818:3: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
                    {
                    // InternalUSE.g:4818:3: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
                    // InternalUSE.g:4819:4: this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpCSAccess().getPrefixedPrimaryExpCSParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_77);
                    this_PrefixedPrimaryExpCS_0=rulePrefixedPrimaryExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_PrefixedPrimaryExpCS_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalUSE.g:4830:4: ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==12||LA105_0==29||LA105_0==46||LA105_0==55||(LA105_0>=70 && LA105_0<=88)) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // InternalUSE.g:4831:5: () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) )
                            {
                            // InternalUSE.g:4831:5: ()
                            // InternalUSE.g:4832:6: 
                            {
                            if ( state.backtracking==0 ) {

                              						/* */
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						current = forceCreateModelElementAndSet(
                              							grammarAccess.getExpCSAccess().getInfixExpCSOwnedLeftAction_0_1_0(),
                              							current);
                              					
                            }

                            }

                            // InternalUSE.g:4841:5: ( (lv_operator_2_0= ruleBinaryOperatorName ) )
                            // InternalUSE.g:4842:6: (lv_operator_2_0= ruleBinaryOperatorName )
                            {
                            // InternalUSE.g:4842:6: (lv_operator_2_0= ruleBinaryOperatorName )
                            // InternalUSE.g:4843:7: lv_operator_2_0= ruleBinaryOperatorName
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getExpCSAccess().getOperatorBinaryOperatorNameParserRuleCall_0_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_34);
                            lv_operator_2_0=ruleBinaryOperatorName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getExpCSRule());
                              							}
                              							set(
                              								current,
                              								"operator",
                              								lv_operator_2_0,
                              								"modelConverter.use_language.USE.BinaryOperatorName");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalUSE.g:4860:5: ( (lv_ownedRight_3_0= ruleExpCS ) )
                            // InternalUSE.g:4861:6: (lv_ownedRight_3_0= ruleExpCS )
                            {
                            // InternalUSE.g:4861:6: (lv_ownedRight_3_0= ruleExpCS )
                            // InternalUSE.g:4862:7: lv_ownedRight_3_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getExpCSAccess().getOwnedRightExpCSParserRuleCall_0_1_2_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_ownedRight_3_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getExpCSRule());
                              							}
                              							set(
                              								current,
                              								"ownedRight",
                              								lv_ownedRight_3_0,
                              								"modelConverter.use_language.USE.ExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:4882:3: this_PrefixedLetExpCS_4= rulePrefixedLetExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpCSAccess().getPrefixedLetExpCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrefixedLetExpCS_4=rulePrefixedLetExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrefixedLetExpCS_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpCS"


    // $ANTLR start "entryRulePrefixedLetExpCS"
    // InternalUSE.g:4897:1: entryRulePrefixedLetExpCS returns [EObject current=null] : iv_rulePrefixedLetExpCS= rulePrefixedLetExpCS EOF ;
    public final EObject entryRulePrefixedLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedLetExpCS = null;


        try {
            // InternalUSE.g:4897:57: (iv_rulePrefixedLetExpCS= rulePrefixedLetExpCS EOF )
            // InternalUSE.g:4898:2: iv_rulePrefixedLetExpCS= rulePrefixedLetExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixedLetExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrefixedLetExpCS=rulePrefixedLetExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixedLetExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrefixedLetExpCS"


    // $ANTLR start "rulePrefixedLetExpCS"
    // InternalUSE.g:4904:1: rulePrefixedLetExpCS returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS ) ;
    public final EObject rulePrefixedLetExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedRight_2_0 = null;

        EObject this_LetExpCS_3 = null;



        	enterRule();

        try {
            // InternalUSE.g:4910:2: ( ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS ) )
            // InternalUSE.g:4911:2: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS )
            {
            // InternalUSE.g:4911:2: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==72||(LA107_0>=89 && LA107_0<=90)) ) {
                alt107=1;
            }
            else if ( (LA107_0==107) ) {
                alt107=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }
            switch (alt107) {
                case 1 :
                    // InternalUSE.g:4912:3: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) )
                    {
                    // InternalUSE.g:4912:3: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) )
                    // InternalUSE.g:4913:4: () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) )
                    {
                    // InternalUSE.g:4913:4: ()
                    // InternalUSE.g:4914:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrefixedLetExpCSAccess().getPrefixExpCSAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalUSE.g:4923:4: ( (lv_name_1_0= ruleUnaryOperatorName ) )
                    // InternalUSE.g:4924:5: (lv_name_1_0= ruleUnaryOperatorName )
                    {
                    // InternalUSE.g:4924:5: (lv_name_1_0= ruleUnaryOperatorName )
                    // InternalUSE.g:4925:6: lv_name_1_0= ruleUnaryOperatorName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrefixedLetExpCSAccess().getNameUnaryOperatorNameParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_34);
                    lv_name_1_0=ruleUnaryOperatorName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrefixedLetExpCSRule());
                      						}
                      						set(
                      							current,
                      							"name",
                      							lv_name_1_0,
                      							"modelConverter.use_language.USE.UnaryOperatorName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUSE.g:4942:4: ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) )
                    // InternalUSE.g:4943:5: (lv_ownedRight_2_0= rulePrefixedLetExpCS )
                    {
                    // InternalUSE.g:4943:5: (lv_ownedRight_2_0= rulePrefixedLetExpCS )
                    // InternalUSE.g:4944:6: lv_ownedRight_2_0= rulePrefixedLetExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrefixedLetExpCSAccess().getOwnedRightPrefixedLetExpCSParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_ownedRight_2_0=rulePrefixedLetExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrefixedLetExpCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedRight",
                      							lv_ownedRight_2_0,
                      							"modelConverter.use_language.USE.PrefixedLetExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:4963:3: this_LetExpCS_3= ruleLetExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrefixedLetExpCSAccess().getLetExpCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LetExpCS_3=ruleLetExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LetExpCS_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrefixedLetExpCS"


    // $ANTLR start "entryRulePrefixedPrimaryExpCS"
    // InternalUSE.g:4978:1: entryRulePrefixedPrimaryExpCS returns [EObject current=null] : iv_rulePrefixedPrimaryExpCS= rulePrefixedPrimaryExpCS EOF ;
    public final EObject entryRulePrefixedPrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedPrimaryExpCS = null;


        try {
            // InternalUSE.g:4978:61: (iv_rulePrefixedPrimaryExpCS= rulePrefixedPrimaryExpCS EOF )
            // InternalUSE.g:4979:2: iv_rulePrefixedPrimaryExpCS= rulePrefixedPrimaryExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrefixedPrimaryExpCS=rulePrefixedPrimaryExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixedPrimaryExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrefixedPrimaryExpCS"


    // $ANTLR start "rulePrefixedPrimaryExpCS"
    // InternalUSE.g:4985:1: rulePrefixedPrimaryExpCS returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS ) ;
    public final EObject rulePrefixedPrimaryExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedRight_2_0 = null;

        EObject this_PrimaryExpCS_3 = null;



        	enterRule();

        try {
            // InternalUSE.g:4991:2: ( ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS ) )
            // InternalUSE.g:4992:2: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS )
            {
            // InternalUSE.g:4992:2: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==72||(LA108_0>=89 && LA108_0<=90)) ) {
                alt108=1;
            }
            else if ( ((LA108_0>=RULE_ID && LA108_0<=RULE_STRING)||LA108_0==12||(LA108_0>=15 && LA108_0<=22)||(LA108_0>=62 && LA108_0<=69)||LA108_0==96||(LA108_0>=98 && LA108_0<=102)) ) {
                alt108=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }
            switch (alt108) {
                case 1 :
                    // InternalUSE.g:4993:3: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) )
                    {
                    // InternalUSE.g:4993:3: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) )
                    // InternalUSE.g:4994:4: () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) )
                    {
                    // InternalUSE.g:4994:4: ()
                    // InternalUSE.g:4995:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrefixedPrimaryExpCSAccess().getPrefixExpCSAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalUSE.g:5004:4: ( (lv_name_1_0= ruleUnaryOperatorName ) )
                    // InternalUSE.g:5005:5: (lv_name_1_0= ruleUnaryOperatorName )
                    {
                    // InternalUSE.g:5005:5: (lv_name_1_0= ruleUnaryOperatorName )
                    // InternalUSE.g:5006:6: lv_name_1_0= ruleUnaryOperatorName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSAccess().getNameUnaryOperatorNameParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_61);
                    lv_name_1_0=ruleUnaryOperatorName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrefixedPrimaryExpCSRule());
                      						}
                      						set(
                      							current,
                      							"name",
                      							lv_name_1_0,
                      							"modelConverter.use_language.USE.UnaryOperatorName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUSE.g:5023:4: ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) )
                    // InternalUSE.g:5024:5: (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS )
                    {
                    // InternalUSE.g:5024:5: (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS )
                    // InternalUSE.g:5025:6: lv_ownedRight_2_0= rulePrefixedPrimaryExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSAccess().getOwnedRightPrefixedPrimaryExpCSParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_ownedRight_2_0=rulePrefixedPrimaryExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrefixedPrimaryExpCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedRight",
                      							lv_ownedRight_2_0,
                      							"modelConverter.use_language.USE.PrefixedPrimaryExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:5044:3: this_PrimaryExpCS_3= rulePrimaryExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSAccess().getPrimaryExpCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExpCS_3=rulePrimaryExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrimaryExpCS_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrefixedPrimaryExpCS"


    // $ANTLR start "entryRulePrimaryExpCS"
    // InternalUSE.g:5059:1: entryRulePrimaryExpCS returns [EObject current=null] : iv_rulePrimaryExpCS= rulePrimaryExpCS EOF ;
    public final EObject entryRulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpCS = null;


        try {
            // InternalUSE.g:5059:53: (iv_rulePrimaryExpCS= rulePrimaryExpCS EOF )
            // InternalUSE.g:5060:2: iv_rulePrimaryExpCS= rulePrimaryExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpCS=rulePrimaryExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpCS"


    // $ANTLR start "rulePrimaryExpCS"
    // InternalUSE.g:5066:1: rulePrimaryExpCS returns [EObject current=null] : (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_MapLiteralExpCS_4= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_6= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_7= ruleTypeLiteralExpCS | this_NameExpCS_8= ruleNameExpCS ) ;
    public final EObject rulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_NestedExpCS_0 = null;

        EObject this_IfExpCS_1 = null;

        EObject this_PrimitiveLiteralExpCS_2 = null;

        EObject this_TupleLiteralExpCS_3 = null;

        EObject this_MapLiteralExpCS_4 = null;

        EObject this_CollectionLiteralExpCS_5 = null;

        EObject this_LambdaLiteralExpCS_6 = null;

        EObject this_TypeLiteralExpCS_7 = null;

        EObject this_NameExpCS_8 = null;



        	enterRule();

        try {
            // InternalUSE.g:5072:2: ( (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_MapLiteralExpCS_4= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_6= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_7= ruleTypeLiteralExpCS | this_NameExpCS_8= ruleNameExpCS ) )
            // InternalUSE.g:5073:2: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_MapLiteralExpCS_4= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_6= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_7= ruleTypeLiteralExpCS | this_NameExpCS_8= ruleNameExpCS )
            {
            // InternalUSE.g:5073:2: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_MapLiteralExpCS_4= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_6= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_7= ruleTypeLiteralExpCS | this_NameExpCS_8= ruleNameExpCS )
            int alt109=9;
            alt109 = dfa109.predict(input);
            switch (alt109) {
                case 1 :
                    // InternalUSE.g:5074:3: this_NestedExpCS_0= ruleNestedExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getNestedExpCSParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NestedExpCS_0=ruleNestedExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NestedExpCS_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUSE.g:5086:3: this_IfExpCS_1= ruleIfExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getIfExpCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IfExpCS_1=ruleIfExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IfExpCS_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUSE.g:5098:3: this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getPrimitiveLiteralExpCSParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimitiveLiteralExpCS_2=rulePrimitiveLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrimitiveLiteralExpCS_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalUSE.g:5110:3: this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getTupleLiteralExpCSParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TupleLiteralExpCS_3=ruleTupleLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TupleLiteralExpCS_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalUSE.g:5122:3: this_MapLiteralExpCS_4= ruleMapLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getMapLiteralExpCSParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MapLiteralExpCS_4=ruleMapLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MapLiteralExpCS_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalUSE.g:5134:3: this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getCollectionLiteralExpCSParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CollectionLiteralExpCS_5=ruleCollectionLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CollectionLiteralExpCS_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalUSE.g:5146:3: this_LambdaLiteralExpCS_6= ruleLambdaLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getLambdaLiteralExpCSParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LambdaLiteralExpCS_6=ruleLambdaLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LambdaLiteralExpCS_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalUSE.g:5158:3: this_TypeLiteralExpCS_7= ruleTypeLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getTypeLiteralExpCSParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeLiteralExpCS_7=ruleTypeLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeLiteralExpCS_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalUSE.g:5170:3: this_NameExpCS_8= ruleNameExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getNameExpCSParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NameExpCS_8=ruleNameExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NameExpCS_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpCS"


    // $ANTLR start "entryRulePrimitiveLiteralExpCS"
    // InternalUSE.g:5185:1: entryRulePrimitiveLiteralExpCS returns [EObject current=null] : iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF ;
    public final EObject entryRulePrimitiveLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveLiteralExpCS = null;


        try {
            // InternalUSE.g:5185:62: (iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF )
            // InternalUSE.g:5186:2: iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveLiteralExpCS=rulePrimitiveLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveLiteralExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveLiteralExpCS"


    // $ANTLR start "rulePrimitiveLiteralExpCS"
    // InternalUSE.g:5192:1: rulePrimitiveLiteralExpCS returns [EObject current=null] : (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) ;
    public final EObject rulePrimitiveLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteralExpCS_0 = null;

        EObject this_StringLiteralExpCS_1 = null;

        EObject this_BooleanLiteralExpCS_2 = null;

        EObject this_UnlimitedNaturalLiteralExpCS_3 = null;

        EObject this_InvalidLiteralExpCS_4 = null;

        EObject this_NullLiteralExpCS_5 = null;



        	enterRule();

        try {
            // InternalUSE.g:5198:2: ( (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) )
            // InternalUSE.g:5199:2: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            {
            // InternalUSE.g:5199:2: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            int alt110=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt110=1;
                }
                break;
            case RULE_STRING:
                {
                alt110=2;
                }
                break;
            case 98:
            case 99:
                {
                alt110=3;
                }
                break;
            case 12:
                {
                alt110=4;
                }
                break;
            case 100:
                {
                alt110=5;
                }
                break;
            case 101:
                {
                alt110=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }

            switch (alt110) {
                case 1 :
                    // InternalUSE.g:5200:3: this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getNumberLiteralExpCSParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NumberLiteralExpCS_0=ruleNumberLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NumberLiteralExpCS_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUSE.g:5212:3: this_StringLiteralExpCS_1= ruleStringLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getStringLiteralExpCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StringLiteralExpCS_1=ruleStringLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringLiteralExpCS_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUSE.g:5224:3: this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getBooleanLiteralExpCSParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanLiteralExpCS_2=ruleBooleanLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanLiteralExpCS_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalUSE.g:5236:3: this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UnlimitedNaturalLiteralExpCS_3=ruleUnlimitedNaturalLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UnlimitedNaturalLiteralExpCS_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalUSE.g:5248:3: this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getInvalidLiteralExpCSParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_InvalidLiteralExpCS_4=ruleInvalidLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_InvalidLiteralExpCS_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalUSE.g:5260:3: this_NullLiteralExpCS_5= ruleNullLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getNullLiteralExpCSParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NullLiteralExpCS_5=ruleNullLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NullLiteralExpCS_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveLiteralExpCS"


    // $ANTLR start "entryRuleNameExpCS"
    // InternalUSE.g:5275:1: entryRuleNameExpCS returns [EObject current=null] : iv_ruleNameExpCS= ruleNameExpCS EOF ;
    public final EObject entryRuleNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExpCS = null;


        try {
            // InternalUSE.g:5275:50: (iv_ruleNameExpCS= ruleNameExpCS EOF )
            // InternalUSE.g:5276:2: iv_ruleNameExpCS= ruleNameExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNameExpCS=ruleNameExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNameExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNameExpCS"


    // $ANTLR start "ruleNameExpCS"
    // InternalUSE.g:5282:1: ruleNameExpCS returns [EObject current=null] : ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) ( (lv_pre_5_0= 'pre' ) ) )? ) ;
    public final EObject ruleNameExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_isPre_4_0=null;
        Token lv_pre_5_0=null;
        EObject lv_ownedPathName_0_0 = null;

        EObject lv_ownedSquareBracketedClauses_1_0 = null;

        EObject lv_ownedRoundBracketedClause_2_0 = null;

        EObject lv_ownedCurlyBracketedClause_3_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:5288:2: ( ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) ( (lv_pre_5_0= 'pre' ) ) )? ) )
            // InternalUSE.g:5289:2: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) ( (lv_pre_5_0= 'pre' ) ) )? )
            {
            // InternalUSE.g:5289:2: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) ( (lv_pre_5_0= 'pre' ) ) )? )
            // InternalUSE.g:5290:3: ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) ( (lv_pre_5_0= 'pre' ) ) )?
            {
            // InternalUSE.g:5290:3: ( (lv_ownedPathName_0_0= rulePathNameCS ) )
            // InternalUSE.g:5291:4: (lv_ownedPathName_0_0= rulePathNameCS )
            {
            // InternalUSE.g:5291:4: (lv_ownedPathName_0_0= rulePathNameCS )
            // InternalUSE.g:5292:5: lv_ownedPathName_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedPathNamePathNameCSParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_78);
            lv_ownedPathName_0_0=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNameExpCSRule());
              					}
              					set(
              						current,
              						"ownedPathName",
              						lv_ownedPathName_0_0,
              						"modelConverter.use_language.USE.PathNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUSE.g:5309:3: ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==35) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // InternalUSE.g:5310:4: (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS )
            	    {
            	    // InternalUSE.g:5310:4: (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS )
            	    // InternalUSE.g:5311:5: lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedSquareBracketedClausesSquareBracketedClauseCSParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_78);
            	    lv_ownedSquareBracketedClauses_1_0=ruleSquareBracketedClauseCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getNameExpCSRule());
            	      					}
            	      					add(
            	      						current,
            	      						"ownedSquareBracketedClauses",
            	      						lv_ownedSquareBracketedClauses_1_0,
            	      						"modelConverter.use_language.USE.SquareBracketedClauseCS");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop111;
                }
            } while (true);

            // InternalUSE.g:5328:3: ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==22) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalUSE.g:5329:4: (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS )
                    {
                    // InternalUSE.g:5329:4: (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS )
                    // InternalUSE.g:5330:5: lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedRoundBracketedClauseRoundBracketedClauseCSParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_79);
                    lv_ownedRoundBracketedClause_2_0=ruleRoundBracketedClauseCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getNameExpCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedRoundBracketedClause",
                      						lv_ownedRoundBracketedClause_2_0,
                      						"modelConverter.use_language.USE.RoundBracketedClauseCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalUSE.g:5347:3: ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==25) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalUSE.g:5348:4: (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS )
                    {
                    // InternalUSE.g:5348:4: (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS )
                    // InternalUSE.g:5349:5: lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedCurlyBracketedClauseCurlyBracketedClauseCSParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_80);
                    lv_ownedCurlyBracketedClause_3_0=ruleCurlyBracketedClauseCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getNameExpCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedCurlyBracketedClause",
                      						lv_ownedCurlyBracketedClause_3_0,
                      						"modelConverter.use_language.USE.CurlyBracketedClauseCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalUSE.g:5366:3: ( ( (lv_isPre_4_0= '@' ) ) ( (lv_pre_5_0= 'pre' ) ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==95) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalUSE.g:5367:4: ( (lv_isPre_4_0= '@' ) ) ( (lv_pre_5_0= 'pre' ) )
                    {
                    // InternalUSE.g:5367:4: ( (lv_isPre_4_0= '@' ) )
                    // InternalUSE.g:5368:5: (lv_isPre_4_0= '@' )
                    {
                    // InternalUSE.g:5368:5: (lv_isPre_4_0= '@' )
                    // InternalUSE.g:5369:6: lv_isPre_4_0= '@'
                    {
                    lv_isPre_4_0=(Token)match(input,95,FOLLOW_81); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isPre_4_0, grammarAccess.getNameExpCSAccess().getIsPreCommercialAtKeyword_4_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNameExpCSRule());
                      						}
                      						setWithLastConsumed(current, "isPre", lv_isPre_4_0 != null, "@");
                      					
                    }

                    }


                    }

                    // InternalUSE.g:5381:4: ( (lv_pre_5_0= 'pre' ) )
                    // InternalUSE.g:5382:5: (lv_pre_5_0= 'pre' )
                    {
                    // InternalUSE.g:5382:5: (lv_pre_5_0= 'pre' )
                    // InternalUSE.g:5383:6: lv_pre_5_0= 'pre'
                    {
                    lv_pre_5_0=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_pre_5_0, grammarAccess.getNameExpCSAccess().getPrePreKeyword_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNameExpCSRule());
                      						}
                      						setWithLastConsumed(current, "pre", lv_pre_5_0 != null, "pre");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNameExpCS"


    // $ANTLR start "entryRuleSquareBracketedClauseCS"
    // InternalUSE.g:5400:1: entryRuleSquareBracketedClauseCS returns [EObject current=null] : iv_ruleSquareBracketedClauseCS= ruleSquareBracketedClauseCS EOF ;
    public final EObject entryRuleSquareBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSquareBracketedClauseCS = null;


        try {
            // InternalUSE.g:5400:64: (iv_ruleSquareBracketedClauseCS= ruleSquareBracketedClauseCS EOF )
            // InternalUSE.g:5401:2: iv_ruleSquareBracketedClauseCS= ruleSquareBracketedClauseCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSquareBracketedClauseCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSquareBracketedClauseCS=ruleSquareBracketedClauseCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSquareBracketedClauseCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSquareBracketedClauseCS"


    // $ANTLR start "ruleSquareBracketedClauseCS"
    // InternalUSE.g:5407:1: ruleSquareBracketedClauseCS returns [EObject current=null] : (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleSquareBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedTerms_1_0 = null;

        EObject lv_ownedTerms_3_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:5413:2: ( (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' ) )
            // InternalUSE.g:5414:2: (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' )
            {
            // InternalUSE.g:5414:2: (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' )
            // InternalUSE.g:5415:3: otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSquareBracketedClauseCSAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalUSE.g:5419:3: ( (lv_ownedTerms_1_0= ruleExpCS ) )
            // InternalUSE.g:5420:4: (lv_ownedTerms_1_0= ruleExpCS )
            {
            // InternalUSE.g:5420:4: (lv_ownedTerms_1_0= ruleExpCS )
            // InternalUSE.g:5421:5: lv_ownedTerms_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSquareBracketedClauseCSAccess().getOwnedTermsExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_82);
            lv_ownedTerms_1_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSquareBracketedClauseCSRule());
              					}
              					add(
              						current,
              						"ownedTerms",
              						lv_ownedTerms_1_0,
              						"modelConverter.use_language.USE.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUSE.g:5438:3: (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )*
            loop115:
            do {
                int alt115=2;
                int LA115_0 = input.LA(1);

                if ( (LA115_0==14) ) {
                    alt115=1;
                }


                switch (alt115) {
            	case 1 :
            	    // InternalUSE.g:5439:4: otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) )
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSquareBracketedClauseCSAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalUSE.g:5443:4: ( (lv_ownedTerms_3_0= ruleExpCS ) )
            	    // InternalUSE.g:5444:5: (lv_ownedTerms_3_0= ruleExpCS )
            	    {
            	    // InternalUSE.g:5444:5: (lv_ownedTerms_3_0= ruleExpCS )
            	    // InternalUSE.g:5445:6: lv_ownedTerms_3_0= ruleExpCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSquareBracketedClauseCSAccess().getOwnedTermsExpCSParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_82);
            	    lv_ownedTerms_3_0=ruleExpCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSquareBracketedClauseCSRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedTerms",
            	      							lv_ownedTerms_3_0,
            	      							"modelConverter.use_language.USE.ExpCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop115;
                }
            } while (true);

            otherlv_4=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSquareBracketedClauseCSAccess().getRightSquareBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSquareBracketedClauseCS"


    // $ANTLR start "entryRuleCollectionLiteralExpCS"
    // InternalUSE.g:5471:1: entryRuleCollectionLiteralExpCS returns [EObject current=null] : iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF ;
    public final EObject entryRuleCollectionLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralExpCS = null;


        try {
            // InternalUSE.g:5471:63: (iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF )
            // InternalUSE.g:5472:2: iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCollectionLiteralExpCS=ruleCollectionLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionLiteralExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionLiteralExpCS"


    // $ANTLR start "ruleCollectionLiteralExpCS"
    // InternalUSE.g:5478:1: ruleCollectionLiteralExpCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleCollectionLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedType_0_0 = null;

        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:5484:2: ( ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' ) )
            // InternalUSE.g:5485:2: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' )
            {
            // InternalUSE.g:5485:2: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' )
            // InternalUSE.g:5486:3: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}'
            {
            // InternalUSE.g:5486:3: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) )
            // InternalUSE.g:5487:4: (lv_ownedType_0_0= ruleCollectionTypeCS )
            {
            // InternalUSE.g:5487:4: (lv_ownedType_0_0= ruleCollectionTypeCS )
            // InternalUSE.g:5488:5: lv_ownedType_0_0= ruleCollectionTypeCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedTypeCollectionTypeCSParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_ownedType_0_0=ruleCollectionTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCollectionLiteralExpCSRule());
              					}
              					set(
              						current,
              						"ownedType",
              						lv_ownedType_0_0,
              						"modelConverter.use_language.USE.CollectionTypeCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_83); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalUSE.g:5509:3: ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( ((LA117_0>=RULE_ID && LA117_0<=RULE_STRING)||LA117_0==12||(LA117_0>=15 && LA117_0<=22)||LA117_0==41||(LA117_0>=62 && LA117_0<=69)||LA117_0==72||(LA117_0>=89 && LA117_0<=90)||LA117_0==96||(LA117_0>=98 && LA117_0<=102)||LA117_0==107) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalUSE.g:5510:4: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    {
                    // InternalUSE.g:5510:4: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) )
                    // InternalUSE.g:5511:5: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    {
                    // InternalUSE.g:5511:5: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    // InternalUSE.g:5512:6: lv_ownedParts_2_0= ruleCollectionLiteralPartCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_69);
                    lv_ownedParts_2_0=ruleCollectionLiteralPartCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCollectionLiteralExpCSRule());
                      						}
                      						add(
                      							current,
                      							"ownedParts",
                      							lv_ownedParts_2_0,
                      							"modelConverter.use_language.USE.CollectionLiteralPartCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUSE.g:5529:4: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    loop116:
                    do {
                        int alt116=2;
                        int LA116_0 = input.LA(1);

                        if ( (LA116_0==14) ) {
                            alt116=1;
                        }


                        switch (alt116) {
                    	case 1 :
                    	    // InternalUSE.g:5530:5: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FOLLOW_71); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getCollectionLiteralExpCSAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalUSE.g:5534:5: ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    // InternalUSE.g:5535:6: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    {
                    	    // InternalUSE.g:5535:6: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    // InternalUSE.g:5536:7: lv_ownedParts_4_0= ruleCollectionLiteralPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_69);
                    	    lv_ownedParts_4_0=ruleCollectionLiteralPartCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getCollectionLiteralExpCSRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ownedParts",
                    	      								lv_ownedParts_4_0,
                    	      								"modelConverter.use_language.USE.CollectionLiteralPartCS");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop116;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getCollectionLiteralExpCSAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionLiteralExpCS"


    // $ANTLR start "entryRuleCollectionLiteralPartCS"
    // InternalUSE.g:5563:1: entryRuleCollectionLiteralPartCS returns [EObject current=null] : iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF ;
    public final EObject entryRuleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralPartCS = null;


        try {
            // InternalUSE.g:5563:64: (iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF )
            // InternalUSE.g:5564:2: iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionLiteralPartCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCollectionLiteralPartCS=ruleCollectionLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionLiteralPartCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionLiteralPartCS"


    // $ANTLR start "ruleCollectionLiteralPartCS"
    // InternalUSE.g:5570:1: ruleCollectionLiteralPartCS returns [EObject current=null] : ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) ) ;
    public final EObject ruleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedExpression_0_0 = null;

        EObject lv_ownedLastExpression_2_0 = null;

        EObject lv_ownedExpression_3_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:5576:2: ( ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) ) )
            // InternalUSE.g:5577:2: ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) )
            {
            // InternalUSE.g:5577:2: ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) )
            int alt119=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
            case 12:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 72:
            case 89:
            case 90:
            case 96:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 107:
                {
                alt119=1;
                }
                break;
            case RULE_ID:
                {
                int LA119_2 = input.LA(2);

                if ( (LA119_2==EOF||(LA119_2>=12 && LA119_2<=14)||LA119_2==22||(LA119_2>=25 && LA119_2<=26)||LA119_2==29||LA119_2==35||LA119_2==46||LA119_2==55||LA119_2==59||(LA119_2>=70 && LA119_2<=88)||LA119_2==95) ) {
                    alt119=1;
                }
                else if ( (LA119_2==41) ) {
                    alt119=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 119, 2, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                alt119=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;
            }

            switch (alt119) {
                case 1 :
                    // InternalUSE.g:5578:3: ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? )
                    {
                    // InternalUSE.g:5578:3: ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? )
                    // InternalUSE.g:5579:4: ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )?
                    {
                    // InternalUSE.g:5579:4: ( (lv_ownedExpression_0_0= ruleExpCS ) )
                    // InternalUSE.g:5580:5: (lv_ownedExpression_0_0= ruleExpCS )
                    {
                    // InternalUSE.g:5580:5: (lv_ownedExpression_0_0= ruleExpCS )
                    // InternalUSE.g:5581:6: lv_ownedExpression_0_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getOwnedExpressionExpCSParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_73);
                    lv_ownedExpression_0_0=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCollectionLiteralPartCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedExpression",
                      							lv_ownedExpression_0_0,
                      							"modelConverter.use_language.USE.ExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUSE.g:5598:4: (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )?
                    int alt118=2;
                    int LA118_0 = input.LA(1);

                    if ( (LA118_0==13) ) {
                        alt118=1;
                    }
                    switch (alt118) {
                        case 1 :
                            // InternalUSE.g:5599:5: otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) )
                            {
                            otherlv_1=(Token)match(input,13,FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralPartCSAccess().getFullStopFullStopKeyword_0_1_0());
                              				
                            }
                            // InternalUSE.g:5603:5: ( (lv_ownedLastExpression_2_0= ruleExpCS ) )
                            // InternalUSE.g:5604:6: (lv_ownedLastExpression_2_0= ruleExpCS )
                            {
                            // InternalUSE.g:5604:6: (lv_ownedLastExpression_2_0= ruleExpCS )
                            // InternalUSE.g:5605:7: lv_ownedLastExpression_2_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getOwnedLastExpressionExpCSParserRuleCall_0_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_ownedLastExpression_2_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getCollectionLiteralPartCSRule());
                              							}
                              							set(
                              								current,
                              								"ownedLastExpression",
                              								lv_ownedLastExpression_2_0,
                              								"modelConverter.use_language.USE.ExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:5625:3: ( (lv_ownedExpression_3_0= rulePatternExpCS ) )
                    {
                    // InternalUSE.g:5625:3: ( (lv_ownedExpression_3_0= rulePatternExpCS ) )
                    // InternalUSE.g:5626:4: (lv_ownedExpression_3_0= rulePatternExpCS )
                    {
                    // InternalUSE.g:5626:4: (lv_ownedExpression_3_0= rulePatternExpCS )
                    // InternalUSE.g:5627:5: lv_ownedExpression_3_0= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getOwnedExpressionPatternExpCSParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_ownedExpression_3_0=rulePatternExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCollectionLiteralPartCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedExpression",
                      						lv_ownedExpression_3_0,
                      						"modelConverter.use_language.USE.PatternExpCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionLiteralPartCS"


    // $ANTLR start "entryRuleLambdaLiteralExpCS"
    // InternalUSE.g:5648:1: entryRuleLambdaLiteralExpCS returns [EObject current=null] : iv_ruleLambdaLiteralExpCS= ruleLambdaLiteralExpCS EOF ;
    public final EObject entryRuleLambdaLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLambdaLiteralExpCS = null;


        try {
            // InternalUSE.g:5648:59: (iv_ruleLambdaLiteralExpCS= ruleLambdaLiteralExpCS EOF )
            // InternalUSE.g:5649:2: iv_ruleLambdaLiteralExpCS= ruleLambdaLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLambdaLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLambdaLiteralExpCS=ruleLambdaLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLambdaLiteralExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLambdaLiteralExpCS"


    // $ANTLR start "ruleLambdaLiteralExpCS"
    // InternalUSE.g:5655:1: ruleLambdaLiteralExpCS returns [EObject current=null] : (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' ) ;
    public final EObject ruleLambdaLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedExpressionCS_2_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:5661:2: ( (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' ) )
            // InternalUSE.g:5662:2: (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' )
            {
            // InternalUSE.g:5662:2: (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' )
            // InternalUSE.g:5663:3: otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,96,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLambdaLiteralExpCSAccess().getLambdaKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,25,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLambdaLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalUSE.g:5671:3: ( (lv_ownedExpressionCS_2_0= ruleExpCS ) )
            // InternalUSE.g:5672:4: (lv_ownedExpressionCS_2_0= ruleExpCS )
            {
            // InternalUSE.g:5672:4: (lv_ownedExpressionCS_2_0= ruleExpCS )
            // InternalUSE.g:5673:5: lv_ownedExpressionCS_2_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLambdaLiteralExpCSAccess().getOwnedExpressionCSExpCSParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_54);
            lv_ownedExpressionCS_2_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLambdaLiteralExpCSRule());
              					}
              					set(
              						current,
              						"ownedExpressionCS",
              						lv_ownedExpressionCS_2_0,
              						"modelConverter.use_language.USE.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getLambdaLiteralExpCSAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLambdaLiteralExpCS"


    // $ANTLR start "entryRuleMapLiteralExpCS"
    // InternalUSE.g:5698:1: entryRuleMapLiteralExpCS returns [EObject current=null] : iv_ruleMapLiteralExpCS= ruleMapLiteralExpCS EOF ;
    public final EObject entryRuleMapLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapLiteralExpCS = null;


        try {
            // InternalUSE.g:5698:56: (iv_ruleMapLiteralExpCS= ruleMapLiteralExpCS EOF )
            // InternalUSE.g:5699:2: iv_ruleMapLiteralExpCS= ruleMapLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMapLiteralExpCS=ruleMapLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapLiteralExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapLiteralExpCS"


    // $ANTLR start "ruleMapLiteralExpCS"
    // InternalUSE.g:5705:1: ruleMapLiteralExpCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleMapLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedType_0_0 = null;

        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:5711:2: ( ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' ) )
            // InternalUSE.g:5712:2: ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' )
            {
            // InternalUSE.g:5712:2: ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' )
            // InternalUSE.g:5713:3: ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}'
            {
            // InternalUSE.g:5713:3: ( (lv_ownedType_0_0= ruleMapTypeCS ) )
            // InternalUSE.g:5714:4: (lv_ownedType_0_0= ruleMapTypeCS )
            {
            // InternalUSE.g:5714:4: (lv_ownedType_0_0= ruleMapTypeCS )
            // InternalUSE.g:5715:5: lv_ownedType_0_0= ruleMapTypeCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMapLiteralExpCSAccess().getOwnedTypeMapTypeCSParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_ownedType_0_0=ruleMapTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMapLiteralExpCSRule());
              					}
              					set(
              						current,
              						"ownedType",
              						lv_ownedType_0_0,
              						"modelConverter.use_language.USE.MapTypeCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_84); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMapLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalUSE.g:5736:3: ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( ((LA121_0>=RULE_ID && LA121_0<=RULE_STRING)||LA121_0==12||(LA121_0>=15 && LA121_0<=22)||(LA121_0>=62 && LA121_0<=69)||LA121_0==72||(LA121_0>=89 && LA121_0<=90)||LA121_0==96||(LA121_0>=98 && LA121_0<=102)||LA121_0==107) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalUSE.g:5737:4: ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )*
                    {
                    // InternalUSE.g:5737:4: ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) )
                    // InternalUSE.g:5738:5: (lv_ownedParts_2_0= ruleMapLiteralPartCS )
                    {
                    // InternalUSE.g:5738:5: (lv_ownedParts_2_0= ruleMapLiteralPartCS )
                    // InternalUSE.g:5739:6: lv_ownedParts_2_0= ruleMapLiteralPartCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMapLiteralExpCSAccess().getOwnedPartsMapLiteralPartCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_69);
                    lv_ownedParts_2_0=ruleMapLiteralPartCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMapLiteralExpCSRule());
                      						}
                      						add(
                      							current,
                      							"ownedParts",
                      							lv_ownedParts_2_0,
                      							"modelConverter.use_language.USE.MapLiteralPartCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUSE.g:5756:4: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )*
                    loop120:
                    do {
                        int alt120=2;
                        int LA120_0 = input.LA(1);

                        if ( (LA120_0==14) ) {
                            alt120=1;
                        }


                        switch (alt120) {
                    	case 1 :
                    	    // InternalUSE.g:5757:5: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FOLLOW_34); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getMapLiteralExpCSAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalUSE.g:5761:5: ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) )
                    	    // InternalUSE.g:5762:6: (lv_ownedParts_4_0= ruleMapLiteralPartCS )
                    	    {
                    	    // InternalUSE.g:5762:6: (lv_ownedParts_4_0= ruleMapLiteralPartCS )
                    	    // InternalUSE.g:5763:7: lv_ownedParts_4_0= ruleMapLiteralPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMapLiteralExpCSAccess().getOwnedPartsMapLiteralPartCSParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_69);
                    	    lv_ownedParts_4_0=ruleMapLiteralPartCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getMapLiteralExpCSRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ownedParts",
                    	      								lv_ownedParts_4_0,
                    	      								"modelConverter.use_language.USE.MapLiteralPartCS");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop120;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMapLiteralExpCSAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapLiteralExpCS"


    // $ANTLR start "entryRuleMapLiteralPartCS"
    // InternalUSE.g:5790:1: entryRuleMapLiteralPartCS returns [EObject current=null] : iv_ruleMapLiteralPartCS= ruleMapLiteralPartCS EOF ;
    public final EObject entryRuleMapLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapLiteralPartCS = null;


        try {
            // InternalUSE.g:5790:57: (iv_ruleMapLiteralPartCS= ruleMapLiteralPartCS EOF )
            // InternalUSE.g:5791:2: iv_ruleMapLiteralPartCS= ruleMapLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapLiteralPartCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMapLiteralPartCS=ruleMapLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapLiteralPartCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapLiteralPartCS"


    // $ANTLR start "ruleMapLiteralPartCS"
    // InternalUSE.g:5797:1: ruleMapLiteralPartCS returns [EObject current=null] : ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) ) ;
    public final EObject ruleMapLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedKey_0_0 = null;

        EObject lv_ownedValue_2_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:5803:2: ( ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) ) )
            // InternalUSE.g:5804:2: ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) )
            {
            // InternalUSE.g:5804:2: ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) )
            // InternalUSE.g:5805:3: ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) )
            {
            // InternalUSE.g:5805:3: ( (lv_ownedKey_0_0= ruleExpCS ) )
            // InternalUSE.g:5806:4: (lv_ownedKey_0_0= ruleExpCS )
            {
            // InternalUSE.g:5806:4: (lv_ownedKey_0_0= ruleExpCS )
            // InternalUSE.g:5807:5: lv_ownedKey_0_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMapLiteralPartCSAccess().getOwnedKeyExpCSParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_85);
            lv_ownedKey_0_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMapLiteralPartCSRule());
              					}
              					set(
              						current,
              						"ownedKey",
              						lv_ownedKey_0_0,
              						"modelConverter.use_language.USE.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,97,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMapLiteralPartCSAccess().getLessThanSignHyphenMinusKeyword_1());
              		
            }
            // InternalUSE.g:5828:3: ( (lv_ownedValue_2_0= ruleExpCS ) )
            // InternalUSE.g:5829:4: (lv_ownedValue_2_0= ruleExpCS )
            {
            // InternalUSE.g:5829:4: (lv_ownedValue_2_0= ruleExpCS )
            // InternalUSE.g:5830:5: lv_ownedValue_2_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMapLiteralPartCSAccess().getOwnedValueExpCSParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_ownedValue_2_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMapLiteralPartCSRule());
              					}
              					set(
              						current,
              						"ownedValue",
              						lv_ownedValue_2_0,
              						"modelConverter.use_language.USE.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapLiteralPartCS"


    // $ANTLR start "entryRuleTupleLiteralExpCS"
    // InternalUSE.g:5851:1: entryRuleTupleLiteralExpCS returns [EObject current=null] : iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF ;
    public final EObject entryRuleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralExpCS = null;


        try {
            // InternalUSE.g:5851:58: (iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF )
            // InternalUSE.g:5852:2: iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTupleLiteralExpCS=ruleTupleLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleLiteralExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTupleLiteralExpCS"


    // $ANTLR start "ruleTupleLiteralExpCS"
    // InternalUSE.g:5858:1: ruleTupleLiteralExpCS returns [EObject current=null] : (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:5864:2: ( (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) )
            // InternalUSE.g:5865:2: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            {
            // InternalUSE.g:5865:2: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            // InternalUSE.g:5866:3: otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTupleLiteralExpCSAccess().getTupleKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTupleLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalUSE.g:5874:3: ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) )
            // InternalUSE.g:5875:4: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            {
            // InternalUSE.g:5875:4: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            // InternalUSE.g:5876:5: lv_ownedParts_2_0= ruleTupleLiteralPartCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_69);
            lv_ownedParts_2_0=ruleTupleLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTupleLiteralExpCSRule());
              					}
              					add(
              						current,
              						"ownedParts",
              						lv_ownedParts_2_0,
              						"modelConverter.use_language.USE.TupleLiteralPartCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUSE.g:5893:3: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )*
            loop122:
            do {
                int alt122=2;
                int LA122_0 = input.LA(1);

                if ( (LA122_0==14) ) {
                    alt122=1;
                }


                switch (alt122) {
            	case 1 :
            	    // InternalUSE.g:5894:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    {
            	    otherlv_3=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getTupleLiteralExpCSAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalUSE.g:5898:4: ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    // InternalUSE.g:5899:5: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    {
            	    // InternalUSE.g:5899:5: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    // InternalUSE.g:5900:6: lv_ownedParts_4_0= ruleTupleLiteralPartCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_69);
            	    lv_ownedParts_4_0=ruleTupleLiteralPartCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTupleLiteralExpCSRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedParts",
            	      							lv_ownedParts_4_0,
            	      							"modelConverter.use_language.USE.TupleLiteralPartCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop122;
                }
            } while (true);

            otherlv_5=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTupleLiteralExpCSAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTupleLiteralExpCS"


    // $ANTLR start "entryRuleTupleLiteralPartCS"
    // InternalUSE.g:5926:1: entryRuleTupleLiteralPartCS returns [EObject current=null] : iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF ;
    public final EObject entryRuleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralPartCS = null;


        try {
            // InternalUSE.g:5926:59: (iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF )
            // InternalUSE.g:5927:2: iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleLiteralPartCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTupleLiteralPartCS=ruleTupleLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleLiteralPartCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTupleLiteralPartCS"


    // $ANTLR start "ruleTupleLiteralPartCS"
    // InternalUSE.g:5933:1: ruleTupleLiteralPartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) ) ;
    public final EObject ruleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_ownedInitExpression_4_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:5939:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) ) )
            // InternalUSE.g:5940:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )
            {
            // InternalUSE.g:5940:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )
            // InternalUSE.g:5941:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
            {
            // InternalUSE.g:5941:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalUSE.g:5942:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalUSE.g:5942:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalUSE.g:5943:5: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_86);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTupleLiteralPartCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"modelConverter.use_language.USE.UnrestrictedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUSE.g:5960:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==41) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // InternalUSE.g:5961:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTupleLiteralPartCSAccess().getColonKeyword_1_0());
                      			
                    }
                    // InternalUSE.g:5965:4: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalUSE.g:5966:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalUSE.g:5966:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalUSE.g:5967:6: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_36);
                    lv_ownedType_2_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTupleLiteralPartCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedType",
                      							lv_ownedType_2_0,
                      							"modelConverter.use_language.USE.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,46,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTupleLiteralPartCSAccess().getEqualsSignKeyword_2());
              		
            }
            // InternalUSE.g:5989:3: ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
            // InternalUSE.g:5990:4: (lv_ownedInitExpression_4_0= ruleExpCS )
            {
            // InternalUSE.g:5990:4: (lv_ownedInitExpression_4_0= ruleExpCS )
            // InternalUSE.g:5991:5: lv_ownedInitExpression_4_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getOwnedInitExpressionExpCSParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_ownedInitExpression_4_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTupleLiteralPartCSRule());
              					}
              					set(
              						current,
              						"ownedInitExpression",
              						lv_ownedInitExpression_4_0,
              						"modelConverter.use_language.USE.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTupleLiteralPartCS"


    // $ANTLR start "entryRuleNumberLiteralExpCS"
    // InternalUSE.g:6012:1: entryRuleNumberLiteralExpCS returns [EObject current=null] : iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF ;
    public final EObject entryRuleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteralExpCS = null;


        try {
            // InternalUSE.g:6012:59: (iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF )
            // InternalUSE.g:6013:2: iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumberLiteralExpCS=ruleNumberLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteralExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberLiteralExpCS"


    // $ANTLR start "ruleNumberLiteralExpCS"
    // InternalUSE.g:6019:1: ruleNumberLiteralExpCS returns [EObject current=null] : ( (lv_value_0_0= ruleIntToString ) ) ;
    public final EObject ruleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:6025:2: ( ( (lv_value_0_0= ruleIntToString ) ) )
            // InternalUSE.g:6026:2: ( (lv_value_0_0= ruleIntToString ) )
            {
            // InternalUSE.g:6026:2: ( (lv_value_0_0= ruleIntToString ) )
            // InternalUSE.g:6027:3: (lv_value_0_0= ruleIntToString )
            {
            // InternalUSE.g:6027:3: (lv_value_0_0= ruleIntToString )
            // InternalUSE.g:6028:4: lv_value_0_0= ruleIntToString
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getNumberLiteralExpCSAccess().getValueIntToStringParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleIntToString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getNumberLiteralExpCSRule());
              				}
              				set(
              					current,
              					"value",
              					lv_value_0_0,
              					"modelConverter.use_language.USE.IntToString");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberLiteralExpCS"


    // $ANTLR start "entryRuleBooleanLiteralExpCS"
    // InternalUSE.g:6048:1: entryRuleBooleanLiteralExpCS returns [EObject current=null] : iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF ;
    public final EObject entryRuleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpCS = null;


        try {
            // InternalUSE.g:6048:60: (iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF )
            // InternalUSE.g:6049:2: iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteralExpCS=ruleBooleanLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteralExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanLiteralExpCS"


    // $ANTLR start "ruleBooleanLiteralExpCS"
    // InternalUSE.g:6055:1: ruleBooleanLiteralExpCS returns [EObject current=null] : ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) ) ;
    public final EObject ruleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_0_0=null;
        Token lv_symbol_1_0=null;


        	enterRule();

        try {
            // InternalUSE.g:6061:2: ( ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) ) )
            // InternalUSE.g:6062:2: ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) )
            {
            // InternalUSE.g:6062:2: ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) )
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==98) ) {
                alt124=1;
            }
            else if ( (LA124_0==99) ) {
                alt124=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;
            }
            switch (alt124) {
                case 1 :
                    // InternalUSE.g:6063:3: ( (lv_symbol_0_0= 'true' ) )
                    {
                    // InternalUSE.g:6063:3: ( (lv_symbol_0_0= 'true' ) )
                    // InternalUSE.g:6064:4: (lv_symbol_0_0= 'true' )
                    {
                    // InternalUSE.g:6064:4: (lv_symbol_0_0= 'true' )
                    // InternalUSE.g:6065:5: lv_symbol_0_0= 'true'
                    {
                    lv_symbol_0_0=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_symbol_0_0, grammarAccess.getBooleanLiteralExpCSAccess().getSymbolTrueKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBooleanLiteralExpCSRule());
                      					}
                      					setWithLastConsumed(current, "symbol", lv_symbol_0_0, "true");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:6078:3: ( (lv_symbol_1_0= 'false' ) )
                    {
                    // InternalUSE.g:6078:3: ( (lv_symbol_1_0= 'false' ) )
                    // InternalUSE.g:6079:4: (lv_symbol_1_0= 'false' )
                    {
                    // InternalUSE.g:6079:4: (lv_symbol_1_0= 'false' )
                    // InternalUSE.g:6080:5: lv_symbol_1_0= 'false'
                    {
                    lv_symbol_1_0=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_symbol_1_0, grammarAccess.getBooleanLiteralExpCSAccess().getSymbolFalseKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBooleanLiteralExpCSRule());
                      					}
                      					setWithLastConsumed(current, "symbol", lv_symbol_1_0, "false");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanLiteralExpCS"


    // $ANTLR start "entryRuleUnlimitedNaturalLiteralExpCS"
    // InternalUSE.g:6096:1: entryRuleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpCS = null;


        try {
            // InternalUSE.g:6096:69: (iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF )
            // InternalUSE.g:6097:2: iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnlimitedNaturalLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnlimitedNaturalLiteralExpCS=ruleUnlimitedNaturalLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnlimitedNaturalLiteralExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnlimitedNaturalLiteralExpCS"


    // $ANTLR start "ruleUnlimitedNaturalLiteralExpCS"
    // InternalUSE.g:6103:1: ruleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUSE.g:6109:2: ( ( () otherlv_1= '*' ) )
            // InternalUSE.g:6110:2: ( () otherlv_1= '*' )
            {
            // InternalUSE.g:6110:2: ( () otherlv_1= '*' )
            // InternalUSE.g:6111:3: () otherlv_1= '*'
            {
            // InternalUSE.g:6111:3: ()
            // InternalUSE.g:6112:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getAsteriskKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnlimitedNaturalLiteralExpCS"


    // $ANTLR start "entryRuleInvalidLiteralExpCS"
    // InternalUSE.g:6129:1: entryRuleInvalidLiteralExpCS returns [EObject current=null] : iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF ;
    public final EObject entryRuleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvalidLiteralExpCS = null;


        try {
            // InternalUSE.g:6129:60: (iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF )
            // InternalUSE.g:6130:2: iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvalidLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInvalidLiteralExpCS=ruleInvalidLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvalidLiteralExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInvalidLiteralExpCS"


    // $ANTLR start "ruleInvalidLiteralExpCS"
    // InternalUSE.g:6136:1: ruleInvalidLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'invalid' ) ;
    public final EObject ruleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUSE.g:6142:2: ( ( () otherlv_1= 'invalid' ) )
            // InternalUSE.g:6143:2: ( () otherlv_1= 'invalid' )
            {
            // InternalUSE.g:6143:2: ( () otherlv_1= 'invalid' )
            // InternalUSE.g:6144:3: () otherlv_1= 'invalid'
            {
            // InternalUSE.g:6144:3: ()
            // InternalUSE.g:6145:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getInvalidLiteralExpCSAccess().getInvalidLiteralExpCSAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,100,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInvalidLiteralExpCSAccess().getInvalidKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInvalidLiteralExpCS"


    // $ANTLR start "entryRuleNullLiteralExpCS"
    // InternalUSE.g:6162:1: entryRuleNullLiteralExpCS returns [EObject current=null] : iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF ;
    public final EObject entryRuleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpCS = null;


        try {
            // InternalUSE.g:6162:57: (iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF )
            // InternalUSE.g:6163:2: iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNullLiteralExpCS=ruleNullLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteralExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNullLiteralExpCS"


    // $ANTLR start "ruleNullLiteralExpCS"
    // InternalUSE.g:6169:1: ruleNullLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUSE.g:6175:2: ( ( () otherlv_1= 'null' ) )
            // InternalUSE.g:6176:2: ( () otherlv_1= 'null' )
            {
            // InternalUSE.g:6176:2: ( () otherlv_1= 'null' )
            // InternalUSE.g:6177:3: () otherlv_1= 'null'
            {
            // InternalUSE.g:6177:3: ()
            // InternalUSE.g:6178:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNullLiteralExpCSAccess().getNullLiteralExpCSAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,101,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNullLiteralExpCSAccess().getNullKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNullLiteralExpCS"


    // $ANTLR start "entryRuleNestedExpCS"
    // InternalUSE.g:6195:1: entryRuleNestedExpCS returns [EObject current=null] : iv_ruleNestedExpCS= ruleNestedExpCS EOF ;
    public final EObject entryRuleNestedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedExpCS = null;


        try {
            // InternalUSE.g:6195:52: (iv_ruleNestedExpCS= ruleNestedExpCS EOF )
            // InternalUSE.g:6196:2: iv_ruleNestedExpCS= ruleNestedExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNestedExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNestedExpCS=ruleNestedExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNestedExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNestedExpCS"


    // $ANTLR start "ruleNestedExpCS"
    // InternalUSE.g:6202:1: ruleNestedExpCS returns [EObject current=null] : (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' ) ;
    public final EObject ruleNestedExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedExpression_1_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:6208:2: ( (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' ) )
            // InternalUSE.g:6209:2: (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' )
            {
            // InternalUSE.g:6209:2: (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' )
            // InternalUSE.g:6210:3: otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNestedExpCSAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUSE.g:6214:3: ( (lv_ownedExpression_1_0= ruleExpCS ) )
            // InternalUSE.g:6215:4: (lv_ownedExpression_1_0= ruleExpCS )
            {
            // InternalUSE.g:6215:4: (lv_ownedExpression_1_0= ruleExpCS )
            // InternalUSE.g:6216:5: lv_ownedExpression_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNestedExpCSAccess().getOwnedExpressionExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_52);
            lv_ownedExpression_1_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNestedExpCSRule());
              					}
              					set(
              						current,
              						"ownedExpression",
              						lv_ownedExpression_1_0,
              						"modelConverter.use_language.USE.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getNestedExpCSAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNestedExpCS"


    // $ANTLR start "entryRuleIfExpCS"
    // InternalUSE.g:6241:1: entryRuleIfExpCS returns [EObject current=null] : iv_ruleIfExpCS= ruleIfExpCS EOF ;
    public final EObject entryRuleIfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpCS = null;


        try {
            // InternalUSE.g:6241:48: (iv_ruleIfExpCS= ruleIfExpCS EOF )
            // InternalUSE.g:6242:2: iv_ruleIfExpCS= ruleIfExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfExpCS=ruleIfExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfExpCS"


    // $ANTLR start "ruleIfExpCS"
    // InternalUSE.g:6248:1: ruleIfExpCS returns [EObject current=null] : (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' ) ;
    public final EObject ruleIfExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_ownedCondition_1_1 = null;

        EObject lv_ownedCondition_1_2 = null;

        EObject lv_ownedThenExpression_3_0 = null;

        EObject lv_ownedIfThenExpressions_4_0 = null;

        EObject lv_ownedElseExpression_6_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:6254:2: ( (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' ) )
            // InternalUSE.g:6255:2: (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' )
            {
            // InternalUSE.g:6255:2: (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' )
            // InternalUSE.g:6256:3: otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif'
            {
            otherlv_0=(Token)match(input,102,FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfExpCSAccess().getIfKeyword_0());
              		
            }
            // InternalUSE.g:6260:3: ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) )
            // InternalUSE.g:6261:4: ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) )
            {
            // InternalUSE.g:6261:4: ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) )
            // InternalUSE.g:6262:5: (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS )
            {
            // InternalUSE.g:6262:5: (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS )
            int alt125=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
            case 12:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 72:
            case 89:
            case 90:
            case 96:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 107:
                {
                alt125=1;
                }
                break;
            case RULE_ID:
                {
                int LA125_2 = input.LA(2);

                if ( (LA125_2==12||LA125_2==22||LA125_2==25||LA125_2==29||LA125_2==35||LA125_2==46||LA125_2==55||LA125_2==59||(LA125_2>=70 && LA125_2<=88)||LA125_2==95||LA125_2==103) ) {
                    alt125=1;
                }
                else if ( (LA125_2==41) ) {
                    alt125=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 125, 2, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                alt125=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;
            }

            switch (alt125) {
                case 1 :
                    // InternalUSE.g:6263:6: lv_ownedCondition_1_1= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedConditionExpCSParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_87);
                    lv_ownedCondition_1_1=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfExpCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedCondition",
                      							lv_ownedCondition_1_1,
                      							"modelConverter.use_language.USE.ExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalUSE.g:6279:6: lv_ownedCondition_1_2= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedConditionPatternExpCSParserRuleCall_1_0_1());
                      					
                    }
                    pushFollow(FOLLOW_87);
                    lv_ownedCondition_1_2=rulePatternExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfExpCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedCondition",
                      							lv_ownedCondition_1_2,
                      							"modelConverter.use_language.USE.PatternExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,103,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfExpCSAccess().getThenKeyword_2());
              		
            }
            // InternalUSE.g:6301:3: ( (lv_ownedThenExpression_3_0= ruleExpCS ) )
            // InternalUSE.g:6302:4: (lv_ownedThenExpression_3_0= ruleExpCS )
            {
            // InternalUSE.g:6302:4: (lv_ownedThenExpression_3_0= ruleExpCS )
            // InternalUSE.g:6303:5: lv_ownedThenExpression_3_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedThenExpressionExpCSParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_88);
            lv_ownedThenExpression_3_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfExpCSRule());
              					}
              					set(
              						current,
              						"ownedThenExpression",
              						lv_ownedThenExpression_3_0,
              						"modelConverter.use_language.USE.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUSE.g:6320:3: ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )*
            loop126:
            do {
                int alt126=2;
                int LA126_0 = input.LA(1);

                if ( (LA126_0==106) ) {
                    alt126=1;
                }


                switch (alt126) {
            	case 1 :
            	    // InternalUSE.g:6321:4: (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS )
            	    {
            	    // InternalUSE.g:6321:4: (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS )
            	    // InternalUSE.g:6322:5: lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedIfThenExpressionsElseIfThenExpCSParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_88);
            	    lv_ownedIfThenExpressions_4_0=ruleElseIfThenExpCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getIfExpCSRule());
            	      					}
            	      					add(
            	      						current,
            	      						"ownedIfThenExpressions",
            	      						lv_ownedIfThenExpressions_4_0,
            	      						"modelConverter.use_language.USE.ElseIfThenExpCS");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop126;
                }
            } while (true);

            otherlv_5=(Token)match(input,104,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getIfExpCSAccess().getElseKeyword_5());
              		
            }
            // InternalUSE.g:6343:3: ( (lv_ownedElseExpression_6_0= ruleExpCS ) )
            // InternalUSE.g:6344:4: (lv_ownedElseExpression_6_0= ruleExpCS )
            {
            // InternalUSE.g:6344:4: (lv_ownedElseExpression_6_0= ruleExpCS )
            // InternalUSE.g:6345:5: lv_ownedElseExpression_6_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedElseExpressionExpCSParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_89);
            lv_ownedElseExpression_6_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfExpCSRule());
              					}
              					set(
              						current,
              						"ownedElseExpression",
              						lv_ownedElseExpression_6_0,
              						"modelConverter.use_language.USE.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,105,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getIfExpCSAccess().getEndifKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfExpCS"


    // $ANTLR start "entryRuleElseIfThenExpCS"
    // InternalUSE.g:6370:1: entryRuleElseIfThenExpCS returns [EObject current=null] : iv_ruleElseIfThenExpCS= ruleElseIfThenExpCS EOF ;
    public final EObject entryRuleElseIfThenExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseIfThenExpCS = null;


        try {
            // InternalUSE.g:6370:56: (iv_ruleElseIfThenExpCS= ruleElseIfThenExpCS EOF )
            // InternalUSE.g:6371:2: iv_ruleElseIfThenExpCS= ruleElseIfThenExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElseIfThenExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleElseIfThenExpCS=ruleElseIfThenExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElseIfThenExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElseIfThenExpCS"


    // $ANTLR start "ruleElseIfThenExpCS"
    // InternalUSE.g:6377:1: ruleElseIfThenExpCS returns [EObject current=null] : (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ) ;
    public final EObject ruleElseIfThenExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedCondition_1_0 = null;

        EObject lv_ownedThenExpression_3_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:6383:2: ( (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ) )
            // InternalUSE.g:6384:2: (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) )
            {
            // InternalUSE.g:6384:2: (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) )
            // InternalUSE.g:6385:3: otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,106,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getElseIfThenExpCSAccess().getElseifKeyword_0());
              		
            }
            // InternalUSE.g:6389:3: ( (lv_ownedCondition_1_0= ruleExpCS ) )
            // InternalUSE.g:6390:4: (lv_ownedCondition_1_0= ruleExpCS )
            {
            // InternalUSE.g:6390:4: (lv_ownedCondition_1_0= ruleExpCS )
            // InternalUSE.g:6391:5: lv_ownedCondition_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getElseIfThenExpCSAccess().getOwnedConditionExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_87);
            lv_ownedCondition_1_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getElseIfThenExpCSRule());
              					}
              					set(
              						current,
              						"ownedCondition",
              						lv_ownedCondition_1_0,
              						"modelConverter.use_language.USE.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,103,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getElseIfThenExpCSAccess().getThenKeyword_2());
              		
            }
            // InternalUSE.g:6412:3: ( (lv_ownedThenExpression_3_0= ruleExpCS ) )
            // InternalUSE.g:6413:4: (lv_ownedThenExpression_3_0= ruleExpCS )
            {
            // InternalUSE.g:6413:4: (lv_ownedThenExpression_3_0= ruleExpCS )
            // InternalUSE.g:6414:5: lv_ownedThenExpression_3_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getElseIfThenExpCSAccess().getOwnedThenExpressionExpCSParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_ownedThenExpression_3_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getElseIfThenExpCSRule());
              					}
              					set(
              						current,
              						"ownedThenExpression",
              						lv_ownedThenExpression_3_0,
              						"modelConverter.use_language.USE.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElseIfThenExpCS"


    // $ANTLR start "entryRuleLetExpCS"
    // InternalUSE.g:6435:1: entryRuleLetExpCS returns [EObject current=null] : iv_ruleLetExpCS= ruleLetExpCS EOF ;
    public final EObject entryRuleLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExpCS = null;


        try {
            // InternalUSE.g:6435:49: (iv_ruleLetExpCS= ruleLetExpCS EOF )
            // InternalUSE.g:6436:2: iv_ruleLetExpCS= ruleLetExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLetExpCS=ruleLetExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLetExpCS"


    // $ANTLR start "ruleLetExpCS"
    // InternalUSE.g:6442:1: ruleLetExpCS returns [EObject current=null] : (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) ) ;
    public final EObject ruleLetExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedVariables_1_0 = null;

        EObject lv_ownedVariables_3_0 = null;

        EObject lv_ownedInExpression_5_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:6448:2: ( (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) ) )
            // InternalUSE.g:6449:2: (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) )
            {
            // InternalUSE.g:6449:2: (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) )
            // InternalUSE.g:6450:3: otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,107,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLetExpCSAccess().getLetKeyword_0());
              		
            }
            // InternalUSE.g:6454:3: ( (lv_ownedVariables_1_0= ruleLetVariableCS ) )
            // InternalUSE.g:6455:4: (lv_ownedVariables_1_0= ruleLetVariableCS )
            {
            // InternalUSE.g:6455:4: (lv_ownedVariables_1_0= ruleLetVariableCS )
            // InternalUSE.g:6456:5: lv_ownedVariables_1_0= ruleLetVariableCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetExpCSAccess().getOwnedVariablesLetVariableCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_90);
            lv_ownedVariables_1_0=ruleLetVariableCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetExpCSRule());
              					}
              					add(
              						current,
              						"ownedVariables",
              						lv_ownedVariables_1_0,
              						"modelConverter.use_language.USE.LetVariableCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUSE.g:6473:3: (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )*
            loop127:
            do {
                int alt127=2;
                int LA127_0 = input.LA(1);

                if ( (LA127_0==14) ) {
                    alt127=1;
                }


                switch (alt127) {
            	case 1 :
            	    // InternalUSE.g:6474:4: otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) )
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getLetExpCSAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalUSE.g:6478:4: ( (lv_ownedVariables_3_0= ruleLetVariableCS ) )
            	    // InternalUSE.g:6479:5: (lv_ownedVariables_3_0= ruleLetVariableCS )
            	    {
            	    // InternalUSE.g:6479:5: (lv_ownedVariables_3_0= ruleLetVariableCS )
            	    // InternalUSE.g:6480:6: lv_ownedVariables_3_0= ruleLetVariableCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLetExpCSAccess().getOwnedVariablesLetVariableCSParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_90);
            	    lv_ownedVariables_3_0=ruleLetVariableCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLetExpCSRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedVariables",
            	      							lv_ownedVariables_3_0,
            	      							"modelConverter.use_language.USE.LetVariableCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop127;
                }
            } while (true);

            otherlv_4=(Token)match(input,108,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getLetExpCSAccess().getInKeyword_3());
              		
            }
            // InternalUSE.g:6502:3: ( (lv_ownedInExpression_5_0= ruleExpCS ) )
            // InternalUSE.g:6503:4: (lv_ownedInExpression_5_0= ruleExpCS )
            {
            // InternalUSE.g:6503:4: (lv_ownedInExpression_5_0= ruleExpCS )
            // InternalUSE.g:6504:5: lv_ownedInExpression_5_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetExpCSAccess().getOwnedInExpressionExpCSParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_ownedInExpression_5_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetExpCSRule());
              					}
              					set(
              						current,
              						"ownedInExpression",
              						lv_ownedInExpression_5_0,
              						"modelConverter.use_language.USE.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLetExpCS"


    // $ANTLR start "entryRuleLetVariableCS"
    // InternalUSE.g:6525:1: entryRuleLetVariableCS returns [EObject current=null] : iv_ruleLetVariableCS= ruleLetVariableCS EOF ;
    public final EObject entryRuleLetVariableCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetVariableCS = null;


        try {
            // InternalUSE.g:6525:54: (iv_ruleLetVariableCS= ruleLetVariableCS EOF )
            // InternalUSE.g:6526:2: iv_ruleLetVariableCS= ruleLetVariableCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetVariableCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLetVariableCS=ruleLetVariableCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetVariableCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLetVariableCS"


    // $ANTLR start "ruleLetVariableCS"
    // InternalUSE.g:6532:1: ruleLetVariableCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) ) ;
    public final EObject ruleLetVariableCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedRoundBracketedClause_1_0 = null;

        EObject lv_ownedType_3_0 = null;

        EObject lv_ownedInitExpression_5_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:6538:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) ) )
            // InternalUSE.g:6539:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )
            {
            // InternalUSE.g:6539:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )
            // InternalUSE.g:6540:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
            {
            // InternalUSE.g:6540:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalUSE.g:6541:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalUSE.g:6541:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalUSE.g:6542:5: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetVariableCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_91);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"modelConverter.use_language.USE.UnrestrictedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUSE.g:6559:3: ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==22) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // InternalUSE.g:6560:4: (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS )
                    {
                    // InternalUSE.g:6560:4: (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS )
                    // InternalUSE.g:6561:5: lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedRoundBracketedClauseRoundBracketedClauseCSParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_86);
                    lv_ownedRoundBracketedClause_1_0=ruleRoundBracketedClauseCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedRoundBracketedClause",
                      						lv_ownedRoundBracketedClause_1_0,
                      						"modelConverter.use_language.USE.RoundBracketedClauseCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalUSE.g:6578:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==41) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalUSE.g:6579:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    {
                    otherlv_2=(Token)match(input,41,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getLetVariableCSAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalUSE.g:6583:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalUSE.g:6584:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalUSE.g:6584:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalUSE.g:6585:6: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_36);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedType",
                      							lv_ownedType_3_0,
                      							"modelConverter.use_language.USE.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,46,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getLetVariableCSAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalUSE.g:6607:3: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
            // InternalUSE.g:6608:4: (lv_ownedInitExpression_5_0= ruleExpCS )
            {
            // InternalUSE.g:6608:4: (lv_ownedInitExpression_5_0= ruleExpCS )
            // InternalUSE.g:6609:5: lv_ownedInitExpression_5_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedInitExpressionExpCSParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_ownedInitExpression_5_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
              					}
              					set(
              						current,
              						"ownedInitExpression",
              						lv_ownedInitExpression_5_0,
              						"modelConverter.use_language.USE.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLetVariableCS"


    // $ANTLR start "entryRuleRoundBracketedClauseCS"
    // InternalUSE.g:6630:1: entryRuleRoundBracketedClauseCS returns [EObject current=null] : iv_ruleRoundBracketedClauseCS= ruleRoundBracketedClauseCS EOF ;
    public final EObject entryRuleRoundBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoundBracketedClauseCS = null;


        try {
            // InternalUSE.g:6630:63: (iv_ruleRoundBracketedClauseCS= ruleRoundBracketedClauseCS EOF )
            // InternalUSE.g:6631:2: iv_ruleRoundBracketedClauseCS= ruleRoundBracketedClauseCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRoundBracketedClauseCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRoundBracketedClauseCS=ruleRoundBracketedClauseCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRoundBracketedClauseCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoundBracketedClauseCS"


    // $ANTLR start "ruleRoundBracketedClauseCS"
    // InternalUSE.g:6637:1: ruleRoundBracketedClauseCS returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )? otherlv_4= ')' ) ;
    public final EObject ruleRoundBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_ownedArguments_2_0 = null;

        EObject lv_ownedArguments_3_1 = null;

        EObject lv_ownedArguments_3_2 = null;

        EObject lv_ownedArguments_3_3 = null;



        	enterRule();

        try {
            // InternalUSE.g:6643:2: ( ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )? otherlv_4= ')' ) )
            // InternalUSE.g:6644:2: ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )? otherlv_4= ')' )
            {
            // InternalUSE.g:6644:2: ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )? otherlv_4= ')' )
            // InternalUSE.g:6645:3: () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )? otherlv_4= ')'
            {
            // InternalUSE.g:6645:3: ()
            // InternalUSE.g:6646:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRoundBracketedClauseCSAccess().getRoundBracketedClauseCSAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_92); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRoundBracketedClauseCSAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalUSE.g:6659:3: ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( ((LA132_0>=RULE_ID && LA132_0<=RULE_STRING)||LA132_0==12||(LA132_0>=15 && LA132_0<=22)||LA132_0==41||(LA132_0>=62 && LA132_0<=69)||LA132_0==72||(LA132_0>=89 && LA132_0<=90)||LA132_0==96||(LA132_0>=98 && LA132_0<=102)||LA132_0==107) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // InternalUSE.g:6660:4: ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )*
                    {
                    // InternalUSE.g:6660:4: ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) )
                    // InternalUSE.g:6661:5: (lv_ownedArguments_2_0= ruleNavigatingArgCS )
                    {
                    // InternalUSE.g:6661:5: (lv_ownedArguments_2_0= ruleNavigatingArgCS )
                    // InternalUSE.g:6662:6: lv_ownedArguments_2_0= ruleNavigatingArgCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingArgCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_93);
                    lv_ownedArguments_2_0=ruleNavigatingArgCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRoundBracketedClauseCSRule());
                      						}
                      						add(
                      							current,
                      							"ownedArguments",
                      							lv_ownedArguments_2_0,
                      							"modelConverter.use_language.USE.NavigatingArgCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUSE.g:6679:4: ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )*
                    loop131:
                    do {
                        int alt131=2;
                        int LA131_0 = input.LA(1);

                        if ( (LA131_0==14||LA131_0==47||LA131_0==109) ) {
                            alt131=1;
                        }


                        switch (alt131) {
                    	case 1 :
                    	    // InternalUSE.g:6680:5: ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) )
                    	    {
                    	    // InternalUSE.g:6680:5: ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) )
                    	    // InternalUSE.g:6681:6: (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS )
                    	    {
                    	    // InternalUSE.g:6681:6: (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS )
                    	    int alt130=3;
                    	    switch ( input.LA(1) ) {
                    	    case 14:
                    	        {
                    	        alt130=1;
                    	        }
                    	        break;
                    	    case 47:
                    	        {
                    	        alt130=2;
                    	        }
                    	        break;
                    	    case 109:
                    	        {
                    	        alt130=3;
                    	        }
                    	        break;
                    	    default:
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 130, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt130) {
                    	        case 1 :
                    	            // InternalUSE.g:6682:7: lv_ownedArguments_3_1= ruleNavigatingCommaArgCS
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              							newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingCommaArgCSParserRuleCall_2_1_0_0());
                    	              						
                    	            }
                    	            pushFollow(FOLLOW_93);
                    	            lv_ownedArguments_3_1=ruleNavigatingCommaArgCS();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							if (current==null) {
                    	              								current = createModelElementForParent(grammarAccess.getRoundBracketedClauseCSRule());
                    	              							}
                    	              							add(
                    	              								current,
                    	              								"ownedArguments",
                    	              								lv_ownedArguments_3_1,
                    	              								"modelConverter.use_language.USE.NavigatingCommaArgCS");
                    	              							afterParserOrEnumRuleCall();
                    	              						
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalUSE.g:6698:7: lv_ownedArguments_3_2= ruleNavigatingSemiArgCS
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              							newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingSemiArgCSParserRuleCall_2_1_0_1());
                    	              						
                    	            }
                    	            pushFollow(FOLLOW_93);
                    	            lv_ownedArguments_3_2=ruleNavigatingSemiArgCS();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							if (current==null) {
                    	              								current = createModelElementForParent(grammarAccess.getRoundBracketedClauseCSRule());
                    	              							}
                    	              							add(
                    	              								current,
                    	              								"ownedArguments",
                    	              								lv_ownedArguments_3_2,
                    	              								"modelConverter.use_language.USE.NavigatingSemiArgCS");
                    	              							afterParserOrEnumRuleCall();
                    	              						
                    	            }

                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalUSE.g:6714:7: lv_ownedArguments_3_3= ruleNavigatingBarArgCS
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              							newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingBarArgCSParserRuleCall_2_1_0_2());
                    	              						
                    	            }
                    	            pushFollow(FOLLOW_93);
                    	            lv_ownedArguments_3_3=ruleNavigatingBarArgCS();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							if (current==null) {
                    	              								current = createModelElementForParent(grammarAccess.getRoundBracketedClauseCSRule());
                    	              							}
                    	              							add(
                    	              								current,
                    	              								"ownedArguments",
                    	              								lv_ownedArguments_3_3,
                    	              								"modelConverter.use_language.USE.NavigatingBarArgCS");
                    	              							afterParserOrEnumRuleCall();
                    	              						
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop131;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRoundBracketedClauseCSAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoundBracketedClauseCS"


    // $ANTLR start "entryRuleNavigatingBarArgCS"
    // InternalUSE.g:6741:1: entryRuleNavigatingBarArgCS returns [EObject current=null] : iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF ;
    public final EObject entryRuleNavigatingBarArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingBarArgCS = null;


        try {
            // InternalUSE.g:6741:59: (iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF )
            // InternalUSE.g:6742:2: iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingBarArgCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNavigatingBarArgCS=ruleNavigatingBarArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingBarArgCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNavigatingBarArgCS"


    // $ANTLR start "ruleNavigatingBarArgCS"
    // InternalUSE.g:6748:1: ruleNavigatingBarArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) ;
    public final EObject ruleNavigatingBarArgCS() throws RecognitionException {
        EObject current = null;

        Token lv_prefix_0_0=null;
        Token lv_symbolT_2_0=null;
        Token lv_symbolIE_4_0=null;
        EObject lv_ownedNameExpression_1_0 = null;

        EObject lv_ownedType_3_0 = null;

        EObject lv_ownedInitExpression_5_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:6754:2: ( ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) )
            // InternalUSE.g:6755:2: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            {
            // InternalUSE.g:6755:2: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            // InternalUSE.g:6756:3: ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            {
            // InternalUSE.g:6756:3: ( (lv_prefix_0_0= '|' ) )
            // InternalUSE.g:6757:4: (lv_prefix_0_0= '|' )
            {
            // InternalUSE.g:6757:4: (lv_prefix_0_0= '|' )
            // InternalUSE.g:6758:5: lv_prefix_0_0= '|'
            {
            lv_prefix_0_0=(Token)match(input,109,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingBarArgCSAccess().getPrefixVerticalLineKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getNavigatingBarArgCSRule());
              					}
              					setWithLastConsumed(current, "prefix", lv_prefix_0_0, "|");
              				
            }

            }


            }

            // InternalUSE.g:6770:3: ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) )
            // InternalUSE.g:6771:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            {
            // InternalUSE.g:6771:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            // InternalUSE.g:6772:5: lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_42);
            lv_ownedNameExpression_1_0=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNavigatingBarArgCSRule());
              					}
              					set(
              						current,
              						"ownedNameExpression",
              						lv_ownedNameExpression_1_0,
              						"modelConverter.use_language.USE.NavigatingArgExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUSE.g:6789:3: ( ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==41) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalUSE.g:6790:4: ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    {
                    // InternalUSE.g:6790:4: ( (lv_symbolT_2_0= ':' ) )
                    // InternalUSE.g:6791:5: (lv_symbolT_2_0= ':' )
                    {
                    // InternalUSE.g:6791:5: (lv_symbolT_2_0= ':' )
                    // InternalUSE.g:6792:6: lv_symbolT_2_0= ':'
                    {
                    lv_symbolT_2_0=(Token)match(input,41,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_symbolT_2_0, grammarAccess.getNavigatingBarArgCSAccess().getSymbolTColonKeyword_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNavigatingBarArgCSRule());
                      						}
                      						setWithLastConsumed(current, "symbolT", lv_symbolT_2_0, ":");
                      					
                    }

                    }


                    }

                    // InternalUSE.g:6804:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalUSE.g:6805:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalUSE.g:6805:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalUSE.g:6806:6: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_94);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNavigatingBarArgCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedType",
                      							lv_ownedType_3_0,
                      							"modelConverter.use_language.USE.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUSE.g:6823:4: ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    int alt133=2;
                    int LA133_0 = input.LA(1);

                    if ( (LA133_0==46) ) {
                        alt133=1;
                    }
                    switch (alt133) {
                        case 1 :
                            // InternalUSE.g:6824:5: ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            {
                            // InternalUSE.g:6824:5: ( (lv_symbolIE_4_0= '=' ) )
                            // InternalUSE.g:6825:6: (lv_symbolIE_4_0= '=' )
                            {
                            // InternalUSE.g:6825:6: (lv_symbolIE_4_0= '=' )
                            // InternalUSE.g:6826:7: lv_symbolIE_4_0= '='
                            {
                            lv_symbolIE_4_0=(Token)match(input,46,FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_symbolIE_4_0, grammarAccess.getNavigatingBarArgCSAccess().getSymbolIEEqualsSignKeyword_2_2_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getNavigatingBarArgCSRule());
                              							}
                              							setWithLastConsumed(current, "symbolIE", lv_symbolIE_4_0, "=");
                              						
                            }

                            }


                            }

                            // InternalUSE.g:6838:5: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            // InternalUSE.g:6839:6: (lv_ownedInitExpression_5_0= ruleExpCS )
                            {
                            // InternalUSE.g:6839:6: (lv_ownedInitExpression_5_0= ruleExpCS )
                            // InternalUSE.g:6840:7: lv_ownedInitExpression_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_2_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_ownedInitExpression_5_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getNavigatingBarArgCSRule());
                              							}
                              							set(
                              								current,
                              								"ownedInitExpression",
                              								lv_ownedInitExpression_5_0,
                              								"modelConverter.use_language.USE.ExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNavigatingBarArgCS"


    // $ANTLR start "entryRuleNavigatingCommaArgCS"
    // InternalUSE.g:6863:1: entryRuleNavigatingCommaArgCS returns [EObject current=null] : iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF ;
    public final EObject entryRuleNavigatingCommaArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingCommaArgCS = null;


        try {
            // InternalUSE.g:6863:61: (iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF )
            // InternalUSE.g:6864:2: iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingCommaArgCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNavigatingCommaArgCS=ruleNavigatingCommaArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingCommaArgCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNavigatingCommaArgCS"


    // $ANTLR start "ruleNavigatingCommaArgCS"
    // InternalUSE.g:6870:1: ruleNavigatingCommaArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )? ) ;
    public final EObject ruleNavigatingCommaArgCS() throws RecognitionException {
        EObject current = null;

        Token lv_prefix_0_0=null;
        Token lv_symbolCI_2_0=null;
        Token lv_symbolIE_4_0=null;
        Token lv_symbolT_6_0=null;
        Token lv_symbolCI_8_0=null;
        Token lv_symbolIE_10_0=null;
        Token lv_symbolT_12_0=null;
        Token lv_symbolCI_14_0=null;
        Token lv_symbolIE_16_0=null;
        EObject lv_ownedNameExpression_1_0 = null;

        EObject lv_ownedCoIterator_3_0 = null;

        EObject lv_ownedInitExpression_5_0 = null;

        EObject lv_ownedType_7_0 = null;

        EObject lv_ownedCoIterator_9_0 = null;

        EObject lv_ownedInitExpression_11_0 = null;

        EObject lv_ownedType_13_0 = null;

        EObject lv_ownedCoIterator_15_0 = null;

        EObject lv_ownedInitExpression_17_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:6876:2: ( ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )? ) )
            // InternalUSE.g:6877:2: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )? )
            {
            // InternalUSE.g:6877:2: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )? )
            // InternalUSE.g:6878:3: ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )?
            {
            // InternalUSE.g:6878:3: ( (lv_prefix_0_0= ',' ) )
            // InternalUSE.g:6879:4: (lv_prefix_0_0= ',' )
            {
            // InternalUSE.g:6879:4: (lv_prefix_0_0= ',' )
            // InternalUSE.g:6880:5: lv_prefix_0_0= ','
            {
            lv_prefix_0_0=(Token)match(input,14,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingCommaArgCSAccess().getPrefixCommaKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getNavigatingCommaArgCSRule());
              					}
              					setWithLastConsumed(current, "prefix", lv_prefix_0_0, ",");
              				
            }

            }


            }

            // InternalUSE.g:6892:3: ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) )
            // InternalUSE.g:6893:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            {
            // InternalUSE.g:6893:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            // InternalUSE.g:6894:5: lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_95);
            lv_ownedNameExpression_1_0=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
              					}
              					set(
              						current,
              						"ownedNameExpression",
              						lv_ownedNameExpression_1_0,
              						"modelConverter.use_language.USE.NavigatingArgExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUSE.g:6911:3: ( ( ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )?
            int alt140=4;
            alt140 = dfa140.predict(input);
            switch (alt140) {
                case 1 :
                    // InternalUSE.g:6912:4: ( ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )
                    {
                    // InternalUSE.g:6912:4: ( ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )
                    // InternalUSE.g:6913:5: ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    {
                    // InternalUSE.g:6913:5: ( (lv_symbolCI_2_0= '<-' ) )
                    // InternalUSE.g:6914:6: (lv_symbolCI_2_0= '<-' )
                    {
                    // InternalUSE.g:6914:6: (lv_symbolCI_2_0= '<-' )
                    // InternalUSE.g:6915:7: lv_symbolCI_2_0= '<-'
                    {
                    lv_symbolCI_2_0=(Token)match(input,97,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_symbolCI_2_0, grammarAccess.getNavigatingCommaArgCSAccess().getSymbolCILessThanSignHyphenMinusKeyword_2_0_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getNavigatingCommaArgCSRule());
                      							}
                      							setWithLastConsumed(current, "symbolCI", lv_symbolCI_2_0, "<-");
                      						
                    }

                    }


                    }

                    // InternalUSE.g:6927:5: ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) )
                    // InternalUSE.g:6928:6: (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS )
                    {
                    // InternalUSE.g:6928:6: (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS )
                    // InternalUSE.g:6929:7: lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_94);
                    lv_ownedCoIterator_3_0=ruleCoIteratorVariableCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                      							}
                      							set(
                      								current,
                      								"ownedCoIterator",
                      								lv_ownedCoIterator_3_0,
                      								"modelConverter.use_language.USE.CoIteratorVariableCS");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalUSE.g:6946:5: ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    int alt135=2;
                    int LA135_0 = input.LA(1);

                    if ( (LA135_0==46) ) {
                        alt135=1;
                    }
                    switch (alt135) {
                        case 1 :
                            // InternalUSE.g:6947:6: ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            {
                            // InternalUSE.g:6947:6: ( (lv_symbolIE_4_0= '=' ) )
                            // InternalUSE.g:6948:7: (lv_symbolIE_4_0= '=' )
                            {
                            // InternalUSE.g:6948:7: (lv_symbolIE_4_0= '=' )
                            // InternalUSE.g:6949:8: lv_symbolIE_4_0= '='
                            {
                            lv_symbolIE_4_0=(Token)match(input,46,FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_symbolIE_4_0, grammarAccess.getNavigatingCommaArgCSAccess().getSymbolIEEqualsSignKeyword_2_0_2_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getNavigatingCommaArgCSRule());
                              								}
                              								setWithLastConsumed(current, "symbolIE", lv_symbolIE_4_0, "=");
                              							
                            }

                            }


                            }

                            // InternalUSE.g:6961:6: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            // InternalUSE.g:6962:7: (lv_ownedInitExpression_5_0= ruleExpCS )
                            {
                            // InternalUSE.g:6962:7: (lv_ownedInitExpression_5_0= ruleExpCS )
                            // InternalUSE.g:6963:8: lv_ownedInitExpression_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_0_2_1_0());
                              							
                            }
                            pushFollow(FOLLOW_2);
                            lv_ownedInitExpression_5_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedInitExpression",
                              									lv_ownedInitExpression_5_0,
                              									"modelConverter.use_language.USE.ExpCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:6983:4: ( ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? )
                    {
                    // InternalUSE.g:6983:4: ( ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? )
                    // InternalUSE.g:6984:5: ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )?
                    {
                    // InternalUSE.g:6984:5: ( (lv_symbolT_6_0= ':' ) )
                    // InternalUSE.g:6985:6: (lv_symbolT_6_0= ':' )
                    {
                    // InternalUSE.g:6985:6: (lv_symbolT_6_0= ':' )
                    // InternalUSE.g:6986:7: lv_symbolT_6_0= ':'
                    {
                    lv_symbolT_6_0=(Token)match(input,41,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_symbolT_6_0, grammarAccess.getNavigatingCommaArgCSAccess().getSymbolTColonKeyword_2_1_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getNavigatingCommaArgCSRule());
                      							}
                      							setWithLastConsumed(current, "symbolT", lv_symbolT_6_0, ":");
                      						
                    }

                    }


                    }

                    // InternalUSE.g:6998:5: ( (lv_ownedType_7_0= ruleTypeExpCS ) )
                    // InternalUSE.g:6999:6: (lv_ownedType_7_0= ruleTypeExpCS )
                    {
                    // InternalUSE.g:6999:6: (lv_ownedType_7_0= ruleTypeExpCS )
                    // InternalUSE.g:7000:7: lv_ownedType_7_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_96);
                    lv_ownedType_7_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                      							}
                      							set(
                      								current,
                      								"ownedType",
                      								lv_ownedType_7_0,
                      								"modelConverter.use_language.USE.TypeExpCS");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalUSE.g:7017:5: ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )?
                    int alt136=2;
                    int LA136_0 = input.LA(1);

                    if ( (LA136_0==97) ) {
                        alt136=1;
                    }
                    switch (alt136) {
                        case 1 :
                            // InternalUSE.g:7018:6: ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) )
                            {
                            // InternalUSE.g:7018:6: ( (lv_symbolCI_8_0= '<-' ) )
                            // InternalUSE.g:7019:7: (lv_symbolCI_8_0= '<-' )
                            {
                            // InternalUSE.g:7019:7: (lv_symbolCI_8_0= '<-' )
                            // InternalUSE.g:7020:8: lv_symbolCI_8_0= '<-'
                            {
                            lv_symbolCI_8_0=(Token)match(input,97,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_symbolCI_8_0, grammarAccess.getNavigatingCommaArgCSAccess().getSymbolCILessThanSignHyphenMinusKeyword_2_1_2_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getNavigatingCommaArgCSRule());
                              								}
                              								setWithLastConsumed(current, "symbolCI", lv_symbolCI_8_0, "<-");
                              							
                            }

                            }


                            }

                            // InternalUSE.g:7032:6: ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) )
                            // InternalUSE.g:7033:7: (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS )
                            {
                            // InternalUSE.g:7033:7: (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS )
                            // InternalUSE.g:7034:8: lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_1_2_1_0());
                              							
                            }
                            pushFollow(FOLLOW_94);
                            lv_ownedCoIterator_9_0=ruleCoIteratorVariableCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedCoIterator",
                              									lv_ownedCoIterator_9_0,
                              									"modelConverter.use_language.USE.CoIteratorVariableCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalUSE.g:7052:5: ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )?
                    int alt137=2;
                    int LA137_0 = input.LA(1);

                    if ( (LA137_0==46) ) {
                        alt137=1;
                    }
                    switch (alt137) {
                        case 1 :
                            // InternalUSE.g:7053:6: ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) )
                            {
                            // InternalUSE.g:7053:6: ( (lv_symbolIE_10_0= '=' ) )
                            // InternalUSE.g:7054:7: (lv_symbolIE_10_0= '=' )
                            {
                            // InternalUSE.g:7054:7: (lv_symbolIE_10_0= '=' )
                            // InternalUSE.g:7055:8: lv_symbolIE_10_0= '='
                            {
                            lv_symbolIE_10_0=(Token)match(input,46,FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_symbolIE_10_0, grammarAccess.getNavigatingCommaArgCSAccess().getSymbolIEEqualsSignKeyword_2_1_3_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getNavigatingCommaArgCSRule());
                              								}
                              								setWithLastConsumed(current, "symbolIE", lv_symbolIE_10_0, "=");
                              							
                            }

                            }


                            }

                            // InternalUSE.g:7067:6: ( (lv_ownedInitExpression_11_0= ruleExpCS ) )
                            // InternalUSE.g:7068:7: (lv_ownedInitExpression_11_0= ruleExpCS )
                            {
                            // InternalUSE.g:7068:7: (lv_ownedInitExpression_11_0= ruleExpCS )
                            // InternalUSE.g:7069:8: lv_ownedInitExpression_11_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_1_3_1_0());
                              							
                            }
                            pushFollow(FOLLOW_2);
                            lv_ownedInitExpression_11_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedInitExpression",
                              									lv_ownedInitExpression_11_0,
                              									"modelConverter.use_language.USE.ExpCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalUSE.g:7089:4: ( ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) )
                    {
                    // InternalUSE.g:7089:4: ( ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) )
                    // InternalUSE.g:7090:5: ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) )
                    {
                    // InternalUSE.g:7090:5: ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )?
                    int alt138=2;
                    int LA138_0 = input.LA(1);

                    if ( (LA138_0==41) ) {
                        alt138=1;
                    }
                    switch (alt138) {
                        case 1 :
                            // InternalUSE.g:7091:6: ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) )
                            {
                            // InternalUSE.g:7091:6: ( (lv_symbolT_12_0= ':' ) )
                            // InternalUSE.g:7092:7: (lv_symbolT_12_0= ':' )
                            {
                            // InternalUSE.g:7092:7: (lv_symbolT_12_0= ':' )
                            // InternalUSE.g:7093:8: lv_symbolT_12_0= ':'
                            {
                            lv_symbolT_12_0=(Token)match(input,41,FOLLOW_61); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_symbolT_12_0, grammarAccess.getNavigatingCommaArgCSAccess().getSymbolTColonKeyword_2_2_0_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getNavigatingCommaArgCSRule());
                              								}
                              								setWithLastConsumed(current, "symbolT", lv_symbolT_12_0, ":");
                              							
                            }

                            }


                            }

                            // InternalUSE.g:7105:6: ( (lv_ownedType_13_0= ruleTypeExpCS ) )
                            // InternalUSE.g:7106:7: (lv_ownedType_13_0= ruleTypeExpCS )
                            {
                            // InternalUSE.g:7106:7: (lv_ownedType_13_0= ruleTypeExpCS )
                            // InternalUSE.g:7107:8: lv_ownedType_13_0= ruleTypeExpCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_2_0_1_0());
                              							
                            }
                            pushFollow(FOLLOW_97);
                            lv_ownedType_13_0=ruleTypeExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedType",
                              									lv_ownedType_13_0,
                              									"modelConverter.use_language.USE.TypeExpCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalUSE.g:7125:5: ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )?
                    int alt139=2;
                    int LA139_0 = input.LA(1);

                    if ( (LA139_0==97) ) {
                        alt139=1;
                    }
                    switch (alt139) {
                        case 1 :
                            // InternalUSE.g:7126:6: ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) )
                            {
                            // InternalUSE.g:7126:6: ( (lv_symbolCI_14_0= '<-' ) )
                            // InternalUSE.g:7127:7: (lv_symbolCI_14_0= '<-' )
                            {
                            // InternalUSE.g:7127:7: (lv_symbolCI_14_0= '<-' )
                            // InternalUSE.g:7128:8: lv_symbolCI_14_0= '<-'
                            {
                            lv_symbolCI_14_0=(Token)match(input,97,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_symbolCI_14_0, grammarAccess.getNavigatingCommaArgCSAccess().getSymbolCILessThanSignHyphenMinusKeyword_2_2_1_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getNavigatingCommaArgCSRule());
                              								}
                              								setWithLastConsumed(current, "symbolCI", lv_symbolCI_14_0, "<-");
                              							
                            }

                            }


                            }

                            // InternalUSE.g:7140:6: ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) )
                            // InternalUSE.g:7141:7: (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS )
                            {
                            // InternalUSE.g:7141:7: (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS )
                            // InternalUSE.g:7142:8: lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_2_1_1_0());
                              							
                            }
                            pushFollow(FOLLOW_98);
                            lv_ownedCoIterator_15_0=ruleCoIteratorVariableCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedCoIterator",
                              									lv_ownedCoIterator_15_0,
                              									"modelConverter.use_language.USE.CoIteratorVariableCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalUSE.g:7160:5: ( (lv_symbolIE_16_0= 'in' ) )
                    // InternalUSE.g:7161:6: (lv_symbolIE_16_0= 'in' )
                    {
                    // InternalUSE.g:7161:6: (lv_symbolIE_16_0= 'in' )
                    // InternalUSE.g:7162:7: lv_symbolIE_16_0= 'in'
                    {
                    lv_symbolIE_16_0=(Token)match(input,108,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_symbolIE_16_0, grammarAccess.getNavigatingCommaArgCSAccess().getSymbolIEInKeyword_2_2_2_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getNavigatingCommaArgCSRule());
                      							}
                      							setWithLastConsumed(current, "symbolIE", lv_symbolIE_16_0, "in");
                      						
                    }

                    }


                    }

                    // InternalUSE.g:7174:5: ( (lv_ownedInitExpression_17_0= ruleExpCS ) )
                    // InternalUSE.g:7175:6: (lv_ownedInitExpression_17_0= ruleExpCS )
                    {
                    // InternalUSE.g:7175:6: (lv_ownedInitExpression_17_0= ruleExpCS )
                    // InternalUSE.g:7176:7: lv_ownedInitExpression_17_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_2_3_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_ownedInitExpression_17_0=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                      							}
                      							set(
                      								current,
                      								"ownedInitExpression",
                      								lv_ownedInitExpression_17_0,
                      								"modelConverter.use_language.USE.ExpCS");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNavigatingCommaArgCS"


    // $ANTLR start "entryRuleNavigatingSemiArgCS"
    // InternalUSE.g:7199:1: entryRuleNavigatingSemiArgCS returns [EObject current=null] : iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF ;
    public final EObject entryRuleNavigatingSemiArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingSemiArgCS = null;


        try {
            // InternalUSE.g:7199:60: (iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF )
            // InternalUSE.g:7200:2: iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingSemiArgCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNavigatingSemiArgCS=ruleNavigatingSemiArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingSemiArgCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNavigatingSemiArgCS"


    // $ANTLR start "ruleNavigatingSemiArgCS"
    // InternalUSE.g:7206:1: ruleNavigatingSemiArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) ;
    public final EObject ruleNavigatingSemiArgCS() throws RecognitionException {
        EObject current = null;

        Token lv_prefix_0_0=null;
        Token lv_symbolT_2_0=null;
        Token lv_symbolIE_4_0=null;
        EObject lv_ownedNameExpression_1_0 = null;

        EObject lv_ownedType_3_0 = null;

        EObject lv_ownedInitExpression_5_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:7212:2: ( ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) )
            // InternalUSE.g:7213:2: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            {
            // InternalUSE.g:7213:2: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            // InternalUSE.g:7214:3: ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            {
            // InternalUSE.g:7214:3: ( (lv_prefix_0_0= ';' ) )
            // InternalUSE.g:7215:4: (lv_prefix_0_0= ';' )
            {
            // InternalUSE.g:7215:4: (lv_prefix_0_0= ';' )
            // InternalUSE.g:7216:5: lv_prefix_0_0= ';'
            {
            lv_prefix_0_0=(Token)match(input,47,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingSemiArgCSAccess().getPrefixSemicolonKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getNavigatingSemiArgCSRule());
              					}
              					setWithLastConsumed(current, "prefix", lv_prefix_0_0, ";");
              				
            }

            }


            }

            // InternalUSE.g:7228:3: ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) )
            // InternalUSE.g:7229:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            {
            // InternalUSE.g:7229:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            // InternalUSE.g:7230:5: lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_42);
            lv_ownedNameExpression_1_0=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNavigatingSemiArgCSRule());
              					}
              					set(
              						current,
              						"ownedNameExpression",
              						lv_ownedNameExpression_1_0,
              						"modelConverter.use_language.USE.NavigatingArgExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUSE.g:7247:3: ( ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==41) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // InternalUSE.g:7248:4: ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    {
                    // InternalUSE.g:7248:4: ( (lv_symbolT_2_0= ':' ) )
                    // InternalUSE.g:7249:5: (lv_symbolT_2_0= ':' )
                    {
                    // InternalUSE.g:7249:5: (lv_symbolT_2_0= ':' )
                    // InternalUSE.g:7250:6: lv_symbolT_2_0= ':'
                    {
                    lv_symbolT_2_0=(Token)match(input,41,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_symbolT_2_0, grammarAccess.getNavigatingSemiArgCSAccess().getSymbolTColonKeyword_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNavigatingSemiArgCSRule());
                      						}
                      						setWithLastConsumed(current, "symbolT", lv_symbolT_2_0, ":");
                      					
                    }

                    }


                    }

                    // InternalUSE.g:7262:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalUSE.g:7263:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalUSE.g:7263:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalUSE.g:7264:6: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_94);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNavigatingSemiArgCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedType",
                      							lv_ownedType_3_0,
                      							"modelConverter.use_language.USE.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUSE.g:7281:4: ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    int alt141=2;
                    int LA141_0 = input.LA(1);

                    if ( (LA141_0==46) ) {
                        alt141=1;
                    }
                    switch (alt141) {
                        case 1 :
                            // InternalUSE.g:7282:5: ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            {
                            // InternalUSE.g:7282:5: ( (lv_symbolIE_4_0= '=' ) )
                            // InternalUSE.g:7283:6: (lv_symbolIE_4_0= '=' )
                            {
                            // InternalUSE.g:7283:6: (lv_symbolIE_4_0= '=' )
                            // InternalUSE.g:7284:7: lv_symbolIE_4_0= '='
                            {
                            lv_symbolIE_4_0=(Token)match(input,46,FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_symbolIE_4_0, grammarAccess.getNavigatingSemiArgCSAccess().getSymbolIEEqualsSignKeyword_2_2_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getNavigatingSemiArgCSRule());
                              							}
                              							setWithLastConsumed(current, "symbolIE", lv_symbolIE_4_0, "=");
                              						
                            }

                            }


                            }

                            // InternalUSE.g:7296:5: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            // InternalUSE.g:7297:6: (lv_ownedInitExpression_5_0= ruleExpCS )
                            {
                            // InternalUSE.g:7297:6: (lv_ownedInitExpression_5_0= ruleExpCS )
                            // InternalUSE.g:7298:7: lv_ownedInitExpression_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_2_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_ownedInitExpression_5_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getNavigatingSemiArgCSRule());
                              							}
                              							set(
                              								current,
                              								"ownedInitExpression",
                              								lv_ownedInitExpression_5_0,
                              								"modelConverter.use_language.USE.ExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNavigatingSemiArgCS"


    // $ANTLR start "entryRuleNavigatingArgCS"
    // InternalUSE.g:7321:1: entryRuleNavigatingArgCS returns [EObject current=null] : iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF ;
    public final EObject entryRuleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgCS = null;


        try {
            // InternalUSE.g:7321:56: (iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF )
            // InternalUSE.g:7322:2: iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingArgCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNavigatingArgCS=ruleNavigatingArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingArgCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNavigatingArgCS"


    // $ANTLR start "ruleNavigatingArgCS"
    // InternalUSE.g:7328:1: ruleNavigatingArgCS returns [EObject current=null] : ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? ) | ( ( (lv_symbolT_17_0= ':' ) ) ( (lv_ownedType_18_0= ruleTypeExpCS ) ) ) ) ;
    public final EObject ruleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        Token lv_symbolCI_1_0=null;
        Token lv_symbolIE_3_0=null;
        Token lv_symbolT_5_0=null;
        Token lv_symbolCI_7_0=null;
        Token lv_symbolIE_9_0=null;
        Token lv_symbolT_11_0=null;
        Token lv_symbolCI_13_0=null;
        Token lv_symbolIE_15_0=null;
        Token lv_symbolT_17_0=null;
        EObject lv_ownedNameExpression_0_0 = null;

        EObject lv_ownedCoIterator_2_0 = null;

        EObject lv_ownedInitExpression_4_0 = null;

        EObject lv_ownedType_6_0 = null;

        EObject lv_ownedCoIterator_8_0 = null;

        EObject lv_ownedInitExpression_10_0 = null;

        EObject lv_ownedType_12_0 = null;

        EObject lv_ownedCoIterator_14_0 = null;

        EObject lv_ownedInitExpression_16_0 = null;

        EObject lv_ownedType_18_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:7334:2: ( ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? ) | ( ( (lv_symbolT_17_0= ':' ) ) ( (lv_ownedType_18_0= ruleTypeExpCS ) ) ) ) )
            // InternalUSE.g:7335:2: ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? ) | ( ( (lv_symbolT_17_0= ':' ) ) ( (lv_ownedType_18_0= ruleTypeExpCS ) ) ) )
            {
            // InternalUSE.g:7335:2: ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? ) | ( ( (lv_symbolT_17_0= ':' ) ) ( (lv_ownedType_18_0= ruleTypeExpCS ) ) ) )
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( ((LA149_0>=RULE_ID && LA149_0<=RULE_STRING)||LA149_0==12||(LA149_0>=15 && LA149_0<=22)||(LA149_0>=62 && LA149_0<=69)||LA149_0==72||(LA149_0>=89 && LA149_0<=90)||LA149_0==96||(LA149_0>=98 && LA149_0<=102)||LA149_0==107) ) {
                alt149=1;
            }
            else if ( (LA149_0==41) ) {
                alt149=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 149, 0, input);

                throw nvae;
            }
            switch (alt149) {
                case 1 :
                    // InternalUSE.g:7336:3: ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? )
                    {
                    // InternalUSE.g:7336:3: ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? )
                    // InternalUSE.g:7337:4: ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )?
                    {
                    // InternalUSE.g:7337:4: ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) )
                    // InternalUSE.g:7338:5: (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS )
                    {
                    // InternalUSE.g:7338:5: (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS )
                    // InternalUSE.g:7339:6: lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_95);
                    lv_ownedNameExpression_0_0=ruleNavigatingArgExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedNameExpression",
                      							lv_ownedNameExpression_0_0,
                      							"modelConverter.use_language.USE.NavigatingArgExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUSE.g:7356:4: ( ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )?
                    int alt148=4;
                    alt148 = dfa148.predict(input);
                    switch (alt148) {
                        case 1 :
                            // InternalUSE.g:7357:5: ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? )
                            {
                            // InternalUSE.g:7357:5: ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? )
                            // InternalUSE.g:7358:6: ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )?
                            {
                            // InternalUSE.g:7358:6: ( (lv_symbolCI_1_0= '<-' ) )
                            // InternalUSE.g:7359:7: (lv_symbolCI_1_0= '<-' )
                            {
                            // InternalUSE.g:7359:7: (lv_symbolCI_1_0= '<-' )
                            // InternalUSE.g:7360:8: lv_symbolCI_1_0= '<-'
                            {
                            lv_symbolCI_1_0=(Token)match(input,97,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_symbolCI_1_0, grammarAccess.getNavigatingArgCSAccess().getSymbolCILessThanSignHyphenMinusKeyword_0_1_0_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getNavigatingArgCSRule());
                              								}
                              								setWithLastConsumed(current, "symbolCI", lv_symbolCI_1_0, "<-");
                              							
                            }

                            }


                            }

                            // InternalUSE.g:7372:6: ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) )
                            // InternalUSE.g:7373:7: (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS )
                            {
                            // InternalUSE.g:7373:7: (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS )
                            // InternalUSE.g:7374:8: lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_0_1_0());
                              							
                            }
                            pushFollow(FOLLOW_94);
                            lv_ownedCoIterator_2_0=ruleCoIteratorVariableCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedCoIterator",
                              									lv_ownedCoIterator_2_0,
                              									"modelConverter.use_language.USE.CoIteratorVariableCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalUSE.g:7391:6: ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )?
                            int alt143=2;
                            int LA143_0 = input.LA(1);

                            if ( (LA143_0==46) ) {
                                alt143=1;
                            }
                            switch (alt143) {
                                case 1 :
                                    // InternalUSE.g:7392:7: ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
                                    {
                                    // InternalUSE.g:7392:7: ( (lv_symbolIE_3_0= '=' ) )
                                    // InternalUSE.g:7393:8: (lv_symbolIE_3_0= '=' )
                                    {
                                    // InternalUSE.g:7393:8: (lv_symbolIE_3_0= '=' )
                                    // InternalUSE.g:7394:9: lv_symbolIE_3_0= '='
                                    {
                                    lv_symbolIE_3_0=(Token)match(input,46,FOLLOW_34); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(lv_symbolIE_3_0, grammarAccess.getNavigatingArgCSAccess().getSymbolIEEqualsSignKeyword_0_1_0_2_0_0());
                                      								
                                    }
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElement(grammarAccess.getNavigatingArgCSRule());
                                      									}
                                      									setWithLastConsumed(current, "symbolIE", lv_symbolIE_3_0, "=");
                                      								
                                    }

                                    }


                                    }

                                    // InternalUSE.g:7406:7: ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
                                    // InternalUSE.g:7407:8: (lv_ownedInitExpression_4_0= ruleExpCS )
                                    {
                                    // InternalUSE.g:7407:8: (lv_ownedInitExpression_4_0= ruleExpCS )
                                    // InternalUSE.g:7408:9: lv_ownedInitExpression_4_0= ruleExpCS
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_0_2_1_0());
                                      								
                                    }
                                    pushFollow(FOLLOW_2);
                                    lv_ownedInitExpression_4_0=ruleExpCS();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                                      									}
                                      									set(
                                      										current,
                                      										"ownedInitExpression",
                                      										lv_ownedInitExpression_4_0,
                                      										"modelConverter.use_language.USE.ExpCS");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalUSE.g:7428:5: ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? )
                            {
                            // InternalUSE.g:7428:5: ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? )
                            // InternalUSE.g:7429:6: ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )?
                            {
                            // InternalUSE.g:7429:6: ( (lv_symbolT_5_0= ':' ) )
                            // InternalUSE.g:7430:7: (lv_symbolT_5_0= ':' )
                            {
                            // InternalUSE.g:7430:7: (lv_symbolT_5_0= ':' )
                            // InternalUSE.g:7431:8: lv_symbolT_5_0= ':'
                            {
                            lv_symbolT_5_0=(Token)match(input,41,FOLLOW_61); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_symbolT_5_0, grammarAccess.getNavigatingArgCSAccess().getSymbolTColonKeyword_0_1_1_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getNavigatingArgCSRule());
                              								}
                              								setWithLastConsumed(current, "symbolT", lv_symbolT_5_0, ":");
                              							
                            }

                            }


                            }

                            // InternalUSE.g:7443:6: ( (lv_ownedType_6_0= ruleTypeExpCS ) )
                            // InternalUSE.g:7444:7: (lv_ownedType_6_0= ruleTypeExpCS )
                            {
                            // InternalUSE.g:7444:7: (lv_ownedType_6_0= ruleTypeExpCS )
                            // InternalUSE.g:7445:8: lv_ownedType_6_0= ruleTypeExpCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_0_1_1_1_0());
                              							
                            }
                            pushFollow(FOLLOW_96);
                            lv_ownedType_6_0=ruleTypeExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedType",
                              									lv_ownedType_6_0,
                              									"modelConverter.use_language.USE.TypeExpCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalUSE.g:7462:6: ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )?
                            int alt144=2;
                            int LA144_0 = input.LA(1);

                            if ( (LA144_0==97) ) {
                                alt144=1;
                            }
                            switch (alt144) {
                                case 1 :
                                    // InternalUSE.g:7463:7: ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) )
                                    {
                                    // InternalUSE.g:7463:7: ( (lv_symbolCI_7_0= '<-' ) )
                                    // InternalUSE.g:7464:8: (lv_symbolCI_7_0= '<-' )
                                    {
                                    // InternalUSE.g:7464:8: (lv_symbolCI_7_0= '<-' )
                                    // InternalUSE.g:7465:9: lv_symbolCI_7_0= '<-'
                                    {
                                    lv_symbolCI_7_0=(Token)match(input,97,FOLLOW_3); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(lv_symbolCI_7_0, grammarAccess.getNavigatingArgCSAccess().getSymbolCILessThanSignHyphenMinusKeyword_0_1_1_2_0_0());
                                      								
                                    }
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElement(grammarAccess.getNavigatingArgCSRule());
                                      									}
                                      									setWithLastConsumed(current, "symbolCI", lv_symbolCI_7_0, "<-");
                                      								
                                    }

                                    }


                                    }

                                    // InternalUSE.g:7477:7: ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) )
                                    // InternalUSE.g:7478:8: (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS )
                                    {
                                    // InternalUSE.g:7478:8: (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS )
                                    // InternalUSE.g:7479:9: lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_1_2_1_0());
                                      								
                                    }
                                    pushFollow(FOLLOW_94);
                                    lv_ownedCoIterator_8_0=ruleCoIteratorVariableCS();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                                      									}
                                      									set(
                                      										current,
                                      										"ownedCoIterator",
                                      										lv_ownedCoIterator_8_0,
                                      										"modelConverter.use_language.USE.CoIteratorVariableCS");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }

                            // InternalUSE.g:7497:6: ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )?
                            int alt145=2;
                            int LA145_0 = input.LA(1);

                            if ( (LA145_0==46) ) {
                                alt145=1;
                            }
                            switch (alt145) {
                                case 1 :
                                    // InternalUSE.g:7498:7: ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) )
                                    {
                                    // InternalUSE.g:7498:7: ( (lv_symbolIE_9_0= '=' ) )
                                    // InternalUSE.g:7499:8: (lv_symbolIE_9_0= '=' )
                                    {
                                    // InternalUSE.g:7499:8: (lv_symbolIE_9_0= '=' )
                                    // InternalUSE.g:7500:9: lv_symbolIE_9_0= '='
                                    {
                                    lv_symbolIE_9_0=(Token)match(input,46,FOLLOW_34); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(lv_symbolIE_9_0, grammarAccess.getNavigatingArgCSAccess().getSymbolIEEqualsSignKeyword_0_1_1_3_0_0());
                                      								
                                    }
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElement(grammarAccess.getNavigatingArgCSRule());
                                      									}
                                      									setWithLastConsumed(current, "symbolIE", lv_symbolIE_9_0, "=");
                                      								
                                    }

                                    }


                                    }

                                    // InternalUSE.g:7512:7: ( (lv_ownedInitExpression_10_0= ruleExpCS ) )
                                    // InternalUSE.g:7513:8: (lv_ownedInitExpression_10_0= ruleExpCS )
                                    {
                                    // InternalUSE.g:7513:8: (lv_ownedInitExpression_10_0= ruleExpCS )
                                    // InternalUSE.g:7514:9: lv_ownedInitExpression_10_0= ruleExpCS
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_1_3_1_0());
                                      								
                                    }
                                    pushFollow(FOLLOW_2);
                                    lv_ownedInitExpression_10_0=ruleExpCS();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                                      									}
                                      									set(
                                      										current,
                                      										"ownedInitExpression",
                                      										lv_ownedInitExpression_10_0,
                                      										"modelConverter.use_language.USE.ExpCS");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalUSE.g:7534:5: ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) )
                            {
                            // InternalUSE.g:7534:5: ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) )
                            // InternalUSE.g:7535:6: ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) )
                            {
                            // InternalUSE.g:7535:6: ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )?
                            int alt146=2;
                            int LA146_0 = input.LA(1);

                            if ( (LA146_0==41) ) {
                                alt146=1;
                            }
                            switch (alt146) {
                                case 1 :
                                    // InternalUSE.g:7536:7: ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) )
                                    {
                                    // InternalUSE.g:7536:7: ( (lv_symbolT_11_0= ':' ) )
                                    // InternalUSE.g:7537:8: (lv_symbolT_11_0= ':' )
                                    {
                                    // InternalUSE.g:7537:8: (lv_symbolT_11_0= ':' )
                                    // InternalUSE.g:7538:9: lv_symbolT_11_0= ':'
                                    {
                                    lv_symbolT_11_0=(Token)match(input,41,FOLLOW_61); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(lv_symbolT_11_0, grammarAccess.getNavigatingArgCSAccess().getSymbolTColonKeyword_0_1_2_0_0_0());
                                      								
                                    }
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElement(grammarAccess.getNavigatingArgCSRule());
                                      									}
                                      									setWithLastConsumed(current, "symbolT", lv_symbolT_11_0, ":");
                                      								
                                    }

                                    }


                                    }

                                    // InternalUSE.g:7550:7: ( (lv_ownedType_12_0= ruleTypeExpCS ) )
                                    // InternalUSE.g:7551:8: (lv_ownedType_12_0= ruleTypeExpCS )
                                    {
                                    // InternalUSE.g:7551:8: (lv_ownedType_12_0= ruleTypeExpCS )
                                    // InternalUSE.g:7552:9: lv_ownedType_12_0= ruleTypeExpCS
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_0_1_2_0_1_0());
                                      								
                                    }
                                    pushFollow(FOLLOW_97);
                                    lv_ownedType_12_0=ruleTypeExpCS();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                                      									}
                                      									set(
                                      										current,
                                      										"ownedType",
                                      										lv_ownedType_12_0,
                                      										"modelConverter.use_language.USE.TypeExpCS");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }

                            // InternalUSE.g:7570:6: ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )?
                            int alt147=2;
                            int LA147_0 = input.LA(1);

                            if ( (LA147_0==97) ) {
                                alt147=1;
                            }
                            switch (alt147) {
                                case 1 :
                                    // InternalUSE.g:7571:7: ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) )
                                    {
                                    // InternalUSE.g:7571:7: ( (lv_symbolCI_13_0= '<-' ) )
                                    // InternalUSE.g:7572:8: (lv_symbolCI_13_0= '<-' )
                                    {
                                    // InternalUSE.g:7572:8: (lv_symbolCI_13_0= '<-' )
                                    // InternalUSE.g:7573:9: lv_symbolCI_13_0= '<-'
                                    {
                                    lv_symbolCI_13_0=(Token)match(input,97,FOLLOW_3); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(lv_symbolCI_13_0, grammarAccess.getNavigatingArgCSAccess().getSymbolCILessThanSignHyphenMinusKeyword_0_1_2_1_0_0());
                                      								
                                    }
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElement(grammarAccess.getNavigatingArgCSRule());
                                      									}
                                      									setWithLastConsumed(current, "symbolCI", lv_symbolCI_13_0, "<-");
                                      								
                                    }

                                    }


                                    }

                                    // InternalUSE.g:7585:7: ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) )
                                    // InternalUSE.g:7586:8: (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS )
                                    {
                                    // InternalUSE.g:7586:8: (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS )
                                    // InternalUSE.g:7587:9: lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_2_1_1_0());
                                      								
                                    }
                                    pushFollow(FOLLOW_98);
                                    lv_ownedCoIterator_14_0=ruleCoIteratorVariableCS();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                                      									}
                                      									set(
                                      										current,
                                      										"ownedCoIterator",
                                      										lv_ownedCoIterator_14_0,
                                      										"modelConverter.use_language.USE.CoIteratorVariableCS");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }

                            // InternalUSE.g:7605:6: ( (lv_symbolIE_15_0= 'in' ) )
                            // InternalUSE.g:7606:7: (lv_symbolIE_15_0= 'in' )
                            {
                            // InternalUSE.g:7606:7: (lv_symbolIE_15_0= 'in' )
                            // InternalUSE.g:7607:8: lv_symbolIE_15_0= 'in'
                            {
                            lv_symbolIE_15_0=(Token)match(input,108,FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_symbolIE_15_0, grammarAccess.getNavigatingArgCSAccess().getSymbolIEInKeyword_0_1_2_2_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getNavigatingArgCSRule());
                              								}
                              								setWithLastConsumed(current, "symbolIE", lv_symbolIE_15_0, "in");
                              							
                            }

                            }


                            }

                            // InternalUSE.g:7619:6: ( (lv_ownedInitExpression_16_0= ruleExpCS ) )
                            // InternalUSE.g:7620:7: (lv_ownedInitExpression_16_0= ruleExpCS )
                            {
                            // InternalUSE.g:7620:7: (lv_ownedInitExpression_16_0= ruleExpCS )
                            // InternalUSE.g:7621:8: lv_ownedInitExpression_16_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_2_3_0());
                              							
                            }
                            pushFollow(FOLLOW_2);
                            lv_ownedInitExpression_16_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedInitExpression",
                              									lv_ownedInitExpression_16_0,
                              									"modelConverter.use_language.USE.ExpCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUSE.g:7642:3: ( ( (lv_symbolT_17_0= ':' ) ) ( (lv_ownedType_18_0= ruleTypeExpCS ) ) )
                    {
                    // InternalUSE.g:7642:3: ( ( (lv_symbolT_17_0= ':' ) ) ( (lv_ownedType_18_0= ruleTypeExpCS ) ) )
                    // InternalUSE.g:7643:4: ( (lv_symbolT_17_0= ':' ) ) ( (lv_ownedType_18_0= ruleTypeExpCS ) )
                    {
                    // InternalUSE.g:7643:4: ( (lv_symbolT_17_0= ':' ) )
                    // InternalUSE.g:7644:5: (lv_symbolT_17_0= ':' )
                    {
                    // InternalUSE.g:7644:5: (lv_symbolT_17_0= ':' )
                    // InternalUSE.g:7645:6: lv_symbolT_17_0= ':'
                    {
                    lv_symbolT_17_0=(Token)match(input,41,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_symbolT_17_0, grammarAccess.getNavigatingArgCSAccess().getSymbolTColonKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNavigatingArgCSRule());
                      						}
                      						setWithLastConsumed(current, "symbolT", lv_symbolT_17_0, ":");
                      					
                    }

                    }


                    }

                    // InternalUSE.g:7657:4: ( (lv_ownedType_18_0= ruleTypeExpCS ) )
                    // InternalUSE.g:7658:5: (lv_ownedType_18_0= ruleTypeExpCS )
                    {
                    // InternalUSE.g:7658:5: (lv_ownedType_18_0= ruleTypeExpCS )
                    // InternalUSE.g:7659:6: lv_ownedType_18_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_ownedType_18_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedType",
                      							lv_ownedType_18_0,
                      							"modelConverter.use_language.USE.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNavigatingArgCS"


    // $ANTLR start "entryRuleNavigatingArgExpCS"
    // InternalUSE.g:7681:1: entryRuleNavigatingArgExpCS returns [EObject current=null] : iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF ;
    public final EObject entryRuleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgExpCS = null;


        try {
            // InternalUSE.g:7681:59: (iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF )
            // InternalUSE.g:7682:2: iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingArgExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNavigatingArgExpCS=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingArgExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNavigatingArgExpCS"


    // $ANTLR start "ruleNavigatingArgExpCS"
    // InternalUSE.g:7688:1: ruleNavigatingArgExpCS returns [EObject current=null] : this_ExpCS_0= ruleExpCS ;
    public final EObject ruleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_ExpCS_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:7694:2: (this_ExpCS_0= ruleExpCS )
            // InternalUSE.g:7695:2: this_ExpCS_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getNavigatingArgExpCSAccess().getExpCSParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_ExpCS_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_ExpCS_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNavigatingArgExpCS"


    // $ANTLR start "entryRuleCoIteratorVariableCS"
    // InternalUSE.g:7709:1: entryRuleCoIteratorVariableCS returns [EObject current=null] : iv_ruleCoIteratorVariableCS= ruleCoIteratorVariableCS EOF ;
    public final EObject entryRuleCoIteratorVariableCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoIteratorVariableCS = null;


        try {
            // InternalUSE.g:7709:61: (iv_ruleCoIteratorVariableCS= ruleCoIteratorVariableCS EOF )
            // InternalUSE.g:7710:2: iv_ruleCoIteratorVariableCS= ruleCoIteratorVariableCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCoIteratorVariableCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCoIteratorVariableCS=ruleCoIteratorVariableCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCoIteratorVariableCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCoIteratorVariableCS"


    // $ANTLR start "ruleCoIteratorVariableCS"
    // InternalUSE.g:7716:1: ruleCoIteratorVariableCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? ) ;
    public final EObject ruleCoIteratorVariableCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:7722:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? ) )
            // InternalUSE.g:7723:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? )
            {
            // InternalUSE.g:7723:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? )
            // InternalUSE.g:7724:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            {
            // InternalUSE.g:7724:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalUSE.g:7725:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalUSE.g:7725:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalUSE.g:7726:5: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCoIteratorVariableCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_42);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCoIteratorVariableCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"modelConverter.use_language.USE.UnrestrictedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUSE.g:7743:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==41) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // InternalUSE.g:7744:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getCoIteratorVariableCSAccess().getColonKeyword_1_0());
                      			
                    }
                    // InternalUSE.g:7748:4: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalUSE.g:7749:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalUSE.g:7749:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalUSE.g:7750:6: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCoIteratorVariableCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_ownedType_2_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCoIteratorVariableCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedType",
                      							lv_ownedType_2_0,
                      							"modelConverter.use_language.USE.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCoIteratorVariableCS"

    // $ANTLR start synpred125_InternalUSE
    public final void synpred125_InternalUSE_fragment() throws RecognitionException {   
        EObject this_TypeLiteralCS_1 = null;


        // InternalUSE.g:3974:3: (this_TypeLiteralCS_1= ruleTypeLiteralCS )
        // InternalUSE.g:3974:3: this_TypeLiteralCS_1= ruleTypeLiteralCS
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_TypeLiteralCS_1=ruleTypeLiteralCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred125_InternalUSE

    // $ANTLR start synpred146_InternalUSE
    public final void synpred146_InternalUSE_fragment() throws RecognitionException {   
        EObject this_PrefixedPrimaryExpCS_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_ownedRight_3_0 = null;


        // InternalUSE.g:4818:3: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) )
        // InternalUSE.g:4818:3: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
        {
        // InternalUSE.g:4818:3: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
        // InternalUSE.g:4819:4: this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
        {
        if ( state.backtracking==0 ) {

          				/* */
          			
        }
        pushFollow(FOLLOW_77);
        this_PrefixedPrimaryExpCS_0=rulePrefixedPrimaryExpCS();

        state._fsp--;
        if (state.failed) return ;
        // InternalUSE.g:4830:4: ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
        int alt171=2;
        int LA171_0 = input.LA(1);

        if ( (LA171_0==12||LA171_0==29||LA171_0==46||LA171_0==55||(LA171_0>=70 && LA171_0<=88)) ) {
            alt171=1;
        }
        switch (alt171) {
            case 1 :
                // InternalUSE.g:4831:5: () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) )
                {
                // InternalUSE.g:4831:5: ()
                // InternalUSE.g:4832:6: 
                {
                if ( state.backtracking==0 ) {

                  						/* */
                  					
                }

                }

                // InternalUSE.g:4841:5: ( (lv_operator_2_0= ruleBinaryOperatorName ) )
                // InternalUSE.g:4842:6: (lv_operator_2_0= ruleBinaryOperatorName )
                {
                // InternalUSE.g:4842:6: (lv_operator_2_0= ruleBinaryOperatorName )
                // InternalUSE.g:4843:7: lv_operator_2_0= ruleBinaryOperatorName
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getExpCSAccess().getOperatorBinaryOperatorNameParserRuleCall_0_1_1_0());
                  						
                }
                pushFollow(FOLLOW_34);
                lv_operator_2_0=ruleBinaryOperatorName();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalUSE.g:4860:5: ( (lv_ownedRight_3_0= ruleExpCS ) )
                // InternalUSE.g:4861:6: (lv_ownedRight_3_0= ruleExpCS )
                {
                // InternalUSE.g:4861:6: (lv_ownedRight_3_0= ruleExpCS )
                // InternalUSE.g:4862:7: lv_ownedRight_3_0= ruleExpCS
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getExpCSAccess().getOwnedRightExpCSParserRuleCall_0_1_2_0());
                  						
                }
                pushFollow(FOLLOW_2);
                lv_ownedRight_3_0=ruleExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred146_InternalUSE

    // $ANTLR start synpred152_InternalUSE
    public final void synpred152_InternalUSE_fragment() throws RecognitionException {   
        EObject this_TupleLiteralExpCS_3 = null;


        // InternalUSE.g:5110:3: (this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS )
        // InternalUSE.g:5110:3: this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_TupleLiteralExpCS_3=ruleTupleLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred152_InternalUSE

    // $ANTLR start synpred153_InternalUSE
    public final void synpred153_InternalUSE_fragment() throws RecognitionException {   
        EObject this_MapLiteralExpCS_4 = null;


        // InternalUSE.g:5122:3: (this_MapLiteralExpCS_4= ruleMapLiteralExpCS )
        // InternalUSE.g:5122:3: this_MapLiteralExpCS_4= ruleMapLiteralExpCS
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_MapLiteralExpCS_4=ruleMapLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred153_InternalUSE

    // $ANTLR start synpred154_InternalUSE
    public final void synpred154_InternalUSE_fragment() throws RecognitionException {   
        EObject this_CollectionLiteralExpCS_5 = null;


        // InternalUSE.g:5134:3: (this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS )
        // InternalUSE.g:5134:3: this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_CollectionLiteralExpCS_5=ruleCollectionLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred154_InternalUSE

    // $ANTLR start synpred156_InternalUSE
    public final void synpred156_InternalUSE_fragment() throws RecognitionException {   
        EObject this_TypeLiteralExpCS_7 = null;


        // InternalUSE.g:5158:3: (this_TypeLiteralExpCS_7= ruleTypeLiteralExpCS )
        // InternalUSE.g:5158:3: this_TypeLiteralExpCS_7= ruleTypeLiteralExpCS
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_TypeLiteralExpCS_7=ruleTypeLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred156_InternalUSE

    // $ANTLR start synpred188_InternalUSE
    public final void synpred188_InternalUSE_fragment() throws RecognitionException {   
        Token lv_symbolCI_2_0=null;
        Token lv_symbolIE_4_0=null;
        EObject lv_ownedCoIterator_3_0 = null;

        EObject lv_ownedInitExpression_5_0 = null;


        // InternalUSE.g:6912:4: ( ( ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) )
        // InternalUSE.g:6912:4: ( ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )
        {
        // InternalUSE.g:6912:4: ( ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )
        // InternalUSE.g:6913:5: ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
        {
        // InternalUSE.g:6913:5: ( (lv_symbolCI_2_0= '<-' ) )
        // InternalUSE.g:6914:6: (lv_symbolCI_2_0= '<-' )
        {
        // InternalUSE.g:6914:6: (lv_symbolCI_2_0= '<-' )
        // InternalUSE.g:6915:7: lv_symbolCI_2_0= '<-'
        {
        lv_symbolCI_2_0=(Token)match(input,97,FOLLOW_3); if (state.failed) return ;

        }


        }

        // InternalUSE.g:6927:5: ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) )
        // InternalUSE.g:6928:6: (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS )
        {
        // InternalUSE.g:6928:6: (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS )
        // InternalUSE.g:6929:7: lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_0_1_0());
          						
        }
        pushFollow(FOLLOW_94);
        lv_ownedCoIterator_3_0=ruleCoIteratorVariableCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalUSE.g:6946:5: ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
        int alt179=2;
        int LA179_0 = input.LA(1);

        if ( (LA179_0==46) ) {
            alt179=1;
        }
        switch (alt179) {
            case 1 :
                // InternalUSE.g:6947:6: ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                {
                // InternalUSE.g:6947:6: ( (lv_symbolIE_4_0= '=' ) )
                // InternalUSE.g:6948:7: (lv_symbolIE_4_0= '=' )
                {
                // InternalUSE.g:6948:7: (lv_symbolIE_4_0= '=' )
                // InternalUSE.g:6949:8: lv_symbolIE_4_0= '='
                {
                lv_symbolIE_4_0=(Token)match(input,46,FOLLOW_34); if (state.failed) return ;

                }


                }

                // InternalUSE.g:6961:6: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                // InternalUSE.g:6962:7: (lv_ownedInitExpression_5_0= ruleExpCS )
                {
                // InternalUSE.g:6962:7: (lv_ownedInitExpression_5_0= ruleExpCS )
                // InternalUSE.g:6963:8: lv_ownedInitExpression_5_0= ruleExpCS
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_0_2_1_0());
                  							
                }
                pushFollow(FOLLOW_2);
                lv_ownedInitExpression_5_0=ruleExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred188_InternalUSE

    // $ANTLR start synpred191_InternalUSE
    public final void synpred191_InternalUSE_fragment() throws RecognitionException {   
        Token lv_symbolT_6_0=null;
        Token lv_symbolCI_8_0=null;
        Token lv_symbolIE_10_0=null;
        EObject lv_ownedType_7_0 = null;

        EObject lv_ownedCoIterator_9_0 = null;

        EObject lv_ownedInitExpression_11_0 = null;


        // InternalUSE.g:6983:4: ( ( ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) )
        // InternalUSE.g:6983:4: ( ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? )
        {
        // InternalUSE.g:6983:4: ( ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? )
        // InternalUSE.g:6984:5: ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )?
        {
        // InternalUSE.g:6984:5: ( (lv_symbolT_6_0= ':' ) )
        // InternalUSE.g:6985:6: (lv_symbolT_6_0= ':' )
        {
        // InternalUSE.g:6985:6: (lv_symbolT_6_0= ':' )
        // InternalUSE.g:6986:7: lv_symbolT_6_0= ':'
        {
        lv_symbolT_6_0=(Token)match(input,41,FOLLOW_61); if (state.failed) return ;

        }


        }

        // InternalUSE.g:6998:5: ( (lv_ownedType_7_0= ruleTypeExpCS ) )
        // InternalUSE.g:6999:6: (lv_ownedType_7_0= ruleTypeExpCS )
        {
        // InternalUSE.g:6999:6: (lv_ownedType_7_0= ruleTypeExpCS )
        // InternalUSE.g:7000:7: lv_ownedType_7_0= ruleTypeExpCS
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_1_0());
          						
        }
        pushFollow(FOLLOW_96);
        lv_ownedType_7_0=ruleTypeExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalUSE.g:7017:5: ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )?
        int alt180=2;
        int LA180_0 = input.LA(1);

        if ( (LA180_0==97) ) {
            alt180=1;
        }
        switch (alt180) {
            case 1 :
                // InternalUSE.g:7018:6: ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) )
                {
                // InternalUSE.g:7018:6: ( (lv_symbolCI_8_0= '<-' ) )
                // InternalUSE.g:7019:7: (lv_symbolCI_8_0= '<-' )
                {
                // InternalUSE.g:7019:7: (lv_symbolCI_8_0= '<-' )
                // InternalUSE.g:7020:8: lv_symbolCI_8_0= '<-'
                {
                lv_symbolCI_8_0=(Token)match(input,97,FOLLOW_3); if (state.failed) return ;

                }


                }

                // InternalUSE.g:7032:6: ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) )
                // InternalUSE.g:7033:7: (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS )
                {
                // InternalUSE.g:7033:7: (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS )
                // InternalUSE.g:7034:8: lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_1_2_1_0());
                  							
                }
                pushFollow(FOLLOW_94);
                lv_ownedCoIterator_9_0=ruleCoIteratorVariableCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalUSE.g:7052:5: ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )?
        int alt181=2;
        int LA181_0 = input.LA(1);

        if ( (LA181_0==46) ) {
            alt181=1;
        }
        switch (alt181) {
            case 1 :
                // InternalUSE.g:7053:6: ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) )
                {
                // InternalUSE.g:7053:6: ( (lv_symbolIE_10_0= '=' ) )
                // InternalUSE.g:7054:7: (lv_symbolIE_10_0= '=' )
                {
                // InternalUSE.g:7054:7: (lv_symbolIE_10_0= '=' )
                // InternalUSE.g:7055:8: lv_symbolIE_10_0= '='
                {
                lv_symbolIE_10_0=(Token)match(input,46,FOLLOW_34); if (state.failed) return ;

                }


                }

                // InternalUSE.g:7067:6: ( (lv_ownedInitExpression_11_0= ruleExpCS ) )
                // InternalUSE.g:7068:7: (lv_ownedInitExpression_11_0= ruleExpCS )
                {
                // InternalUSE.g:7068:7: (lv_ownedInitExpression_11_0= ruleExpCS )
                // InternalUSE.g:7069:8: lv_ownedInitExpression_11_0= ruleExpCS
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_1_3_1_0());
                  							
                }
                pushFollow(FOLLOW_2);
                lv_ownedInitExpression_11_0=ruleExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred191_InternalUSE

    // $ANTLR start synpred194_InternalUSE
    public final void synpred194_InternalUSE_fragment() throws RecognitionException {   
        Token lv_symbolT_12_0=null;
        Token lv_symbolCI_14_0=null;
        Token lv_symbolIE_16_0=null;
        EObject lv_ownedType_13_0 = null;

        EObject lv_ownedCoIterator_15_0 = null;

        EObject lv_ownedInitExpression_17_0 = null;


        // InternalUSE.g:7089:4: ( ( ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )
        // InternalUSE.g:7089:4: ( ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) )
        {
        // InternalUSE.g:7089:4: ( ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) )
        // InternalUSE.g:7090:5: ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) )
        {
        // InternalUSE.g:7090:5: ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )?
        int alt182=2;
        int LA182_0 = input.LA(1);

        if ( (LA182_0==41) ) {
            alt182=1;
        }
        switch (alt182) {
            case 1 :
                // InternalUSE.g:7091:6: ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) )
                {
                // InternalUSE.g:7091:6: ( (lv_symbolT_12_0= ':' ) )
                // InternalUSE.g:7092:7: (lv_symbolT_12_0= ':' )
                {
                // InternalUSE.g:7092:7: (lv_symbolT_12_0= ':' )
                // InternalUSE.g:7093:8: lv_symbolT_12_0= ':'
                {
                lv_symbolT_12_0=(Token)match(input,41,FOLLOW_61); if (state.failed) return ;

                }


                }

                // InternalUSE.g:7105:6: ( (lv_ownedType_13_0= ruleTypeExpCS ) )
                // InternalUSE.g:7106:7: (lv_ownedType_13_0= ruleTypeExpCS )
                {
                // InternalUSE.g:7106:7: (lv_ownedType_13_0= ruleTypeExpCS )
                // InternalUSE.g:7107:8: lv_ownedType_13_0= ruleTypeExpCS
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_2_0_1_0());
                  							
                }
                pushFollow(FOLLOW_97);
                lv_ownedType_13_0=ruleTypeExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalUSE.g:7125:5: ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )?
        int alt183=2;
        int LA183_0 = input.LA(1);

        if ( (LA183_0==97) ) {
            alt183=1;
        }
        switch (alt183) {
            case 1 :
                // InternalUSE.g:7126:6: ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) )
                {
                // InternalUSE.g:7126:6: ( (lv_symbolCI_14_0= '<-' ) )
                // InternalUSE.g:7127:7: (lv_symbolCI_14_0= '<-' )
                {
                // InternalUSE.g:7127:7: (lv_symbolCI_14_0= '<-' )
                // InternalUSE.g:7128:8: lv_symbolCI_14_0= '<-'
                {
                lv_symbolCI_14_0=(Token)match(input,97,FOLLOW_3); if (state.failed) return ;

                }


                }

                // InternalUSE.g:7140:6: ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) )
                // InternalUSE.g:7141:7: (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS )
                {
                // InternalUSE.g:7141:7: (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS )
                // InternalUSE.g:7142:8: lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_2_1_1_0());
                  							
                }
                pushFollow(FOLLOW_98);
                lv_ownedCoIterator_15_0=ruleCoIteratorVariableCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalUSE.g:7160:5: ( (lv_symbolIE_16_0= 'in' ) )
        // InternalUSE.g:7161:6: (lv_symbolIE_16_0= 'in' )
        {
        // InternalUSE.g:7161:6: (lv_symbolIE_16_0= 'in' )
        // InternalUSE.g:7162:7: lv_symbolIE_16_0= 'in'
        {
        lv_symbolIE_16_0=(Token)match(input,108,FOLLOW_34); if (state.failed) return ;

        }


        }

        // InternalUSE.g:7174:5: ( (lv_ownedInitExpression_17_0= ruleExpCS ) )
        // InternalUSE.g:7175:6: (lv_ownedInitExpression_17_0= ruleExpCS )
        {
        // InternalUSE.g:7175:6: (lv_ownedInitExpression_17_0= ruleExpCS )
        // InternalUSE.g:7176:7: lv_ownedInitExpression_17_0= ruleExpCS
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_2_3_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_ownedInitExpression_17_0=ruleExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred194_InternalUSE

    // $ANTLR start synpred198_InternalUSE
    public final void synpred198_InternalUSE_fragment() throws RecognitionException {   
        Token lv_symbolCI_1_0=null;
        Token lv_symbolIE_3_0=null;
        EObject lv_ownedCoIterator_2_0 = null;

        EObject lv_ownedInitExpression_4_0 = null;


        // InternalUSE.g:7357:5: ( ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) )
        // InternalUSE.g:7357:5: ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? )
        {
        // InternalUSE.g:7357:5: ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? )
        // InternalUSE.g:7358:6: ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )?
        {
        // InternalUSE.g:7358:6: ( (lv_symbolCI_1_0= '<-' ) )
        // InternalUSE.g:7359:7: (lv_symbolCI_1_0= '<-' )
        {
        // InternalUSE.g:7359:7: (lv_symbolCI_1_0= '<-' )
        // InternalUSE.g:7360:8: lv_symbolCI_1_0= '<-'
        {
        lv_symbolCI_1_0=(Token)match(input,97,FOLLOW_3); if (state.failed) return ;

        }


        }

        // InternalUSE.g:7372:6: ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) )
        // InternalUSE.g:7373:7: (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS )
        {
        // InternalUSE.g:7373:7: (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS )
        // InternalUSE.g:7374:8: lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_0_1_0());
          							
        }
        pushFollow(FOLLOW_94);
        lv_ownedCoIterator_2_0=ruleCoIteratorVariableCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalUSE.g:7391:6: ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )?
        int alt185=2;
        int LA185_0 = input.LA(1);

        if ( (LA185_0==46) ) {
            alt185=1;
        }
        switch (alt185) {
            case 1 :
                // InternalUSE.g:7392:7: ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
                {
                // InternalUSE.g:7392:7: ( (lv_symbolIE_3_0= '=' ) )
                // InternalUSE.g:7393:8: (lv_symbolIE_3_0= '=' )
                {
                // InternalUSE.g:7393:8: (lv_symbolIE_3_0= '=' )
                // InternalUSE.g:7394:9: lv_symbolIE_3_0= '='
                {
                lv_symbolIE_3_0=(Token)match(input,46,FOLLOW_34); if (state.failed) return ;

                }


                }

                // InternalUSE.g:7406:7: ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
                // InternalUSE.g:7407:8: (lv_ownedInitExpression_4_0= ruleExpCS )
                {
                // InternalUSE.g:7407:8: (lv_ownedInitExpression_4_0= ruleExpCS )
                // InternalUSE.g:7408:9: lv_ownedInitExpression_4_0= ruleExpCS
                {
                if ( state.backtracking==0 ) {

                  									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_0_2_1_0());
                  								
                }
                pushFollow(FOLLOW_2);
                lv_ownedInitExpression_4_0=ruleExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred198_InternalUSE

    // $ANTLR start synpred201_InternalUSE
    public final void synpred201_InternalUSE_fragment() throws RecognitionException {   
        Token lv_symbolT_5_0=null;
        Token lv_symbolCI_7_0=null;
        Token lv_symbolIE_9_0=null;
        EObject lv_ownedType_6_0 = null;

        EObject lv_ownedCoIterator_8_0 = null;

        EObject lv_ownedInitExpression_10_0 = null;


        // InternalUSE.g:7428:5: ( ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) )
        // InternalUSE.g:7428:5: ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? )
        {
        // InternalUSE.g:7428:5: ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? )
        // InternalUSE.g:7429:6: ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )?
        {
        // InternalUSE.g:7429:6: ( (lv_symbolT_5_0= ':' ) )
        // InternalUSE.g:7430:7: (lv_symbolT_5_0= ':' )
        {
        // InternalUSE.g:7430:7: (lv_symbolT_5_0= ':' )
        // InternalUSE.g:7431:8: lv_symbolT_5_0= ':'
        {
        lv_symbolT_5_0=(Token)match(input,41,FOLLOW_61); if (state.failed) return ;

        }


        }

        // InternalUSE.g:7443:6: ( (lv_ownedType_6_0= ruleTypeExpCS ) )
        // InternalUSE.g:7444:7: (lv_ownedType_6_0= ruleTypeExpCS )
        {
        // InternalUSE.g:7444:7: (lv_ownedType_6_0= ruleTypeExpCS )
        // InternalUSE.g:7445:8: lv_ownedType_6_0= ruleTypeExpCS
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_0_1_1_1_0());
          							
        }
        pushFollow(FOLLOW_96);
        lv_ownedType_6_0=ruleTypeExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalUSE.g:7462:6: ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )?
        int alt186=2;
        int LA186_0 = input.LA(1);

        if ( (LA186_0==97) ) {
            alt186=1;
        }
        switch (alt186) {
            case 1 :
                // InternalUSE.g:7463:7: ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) )
                {
                // InternalUSE.g:7463:7: ( (lv_symbolCI_7_0= '<-' ) )
                // InternalUSE.g:7464:8: (lv_symbolCI_7_0= '<-' )
                {
                // InternalUSE.g:7464:8: (lv_symbolCI_7_0= '<-' )
                // InternalUSE.g:7465:9: lv_symbolCI_7_0= '<-'
                {
                lv_symbolCI_7_0=(Token)match(input,97,FOLLOW_3); if (state.failed) return ;

                }


                }

                // InternalUSE.g:7477:7: ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) )
                // InternalUSE.g:7478:8: (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS )
                {
                // InternalUSE.g:7478:8: (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS )
                // InternalUSE.g:7479:9: lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS
                {
                if ( state.backtracking==0 ) {

                  									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_1_2_1_0());
                  								
                }
                pushFollow(FOLLOW_94);
                lv_ownedCoIterator_8_0=ruleCoIteratorVariableCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalUSE.g:7497:6: ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )?
        int alt187=2;
        int LA187_0 = input.LA(1);

        if ( (LA187_0==46) ) {
            alt187=1;
        }
        switch (alt187) {
            case 1 :
                // InternalUSE.g:7498:7: ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) )
                {
                // InternalUSE.g:7498:7: ( (lv_symbolIE_9_0= '=' ) )
                // InternalUSE.g:7499:8: (lv_symbolIE_9_0= '=' )
                {
                // InternalUSE.g:7499:8: (lv_symbolIE_9_0= '=' )
                // InternalUSE.g:7500:9: lv_symbolIE_9_0= '='
                {
                lv_symbolIE_9_0=(Token)match(input,46,FOLLOW_34); if (state.failed) return ;

                }


                }

                // InternalUSE.g:7512:7: ( (lv_ownedInitExpression_10_0= ruleExpCS ) )
                // InternalUSE.g:7513:8: (lv_ownedInitExpression_10_0= ruleExpCS )
                {
                // InternalUSE.g:7513:8: (lv_ownedInitExpression_10_0= ruleExpCS )
                // InternalUSE.g:7514:9: lv_ownedInitExpression_10_0= ruleExpCS
                {
                if ( state.backtracking==0 ) {

                  									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_1_3_1_0());
                  								
                }
                pushFollow(FOLLOW_2);
                lv_ownedInitExpression_10_0=ruleExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred201_InternalUSE

    // $ANTLR start synpred204_InternalUSE
    public final void synpred204_InternalUSE_fragment() throws RecognitionException {   
        Token lv_symbolT_11_0=null;
        Token lv_symbolCI_13_0=null;
        Token lv_symbolIE_15_0=null;
        EObject lv_ownedType_12_0 = null;

        EObject lv_ownedCoIterator_14_0 = null;

        EObject lv_ownedInitExpression_16_0 = null;


        // InternalUSE.g:7534:5: ( ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )
        // InternalUSE.g:7534:5: ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) )
        {
        // InternalUSE.g:7534:5: ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) )
        // InternalUSE.g:7535:6: ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) )
        {
        // InternalUSE.g:7535:6: ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )?
        int alt188=2;
        int LA188_0 = input.LA(1);

        if ( (LA188_0==41) ) {
            alt188=1;
        }
        switch (alt188) {
            case 1 :
                // InternalUSE.g:7536:7: ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) )
                {
                // InternalUSE.g:7536:7: ( (lv_symbolT_11_0= ':' ) )
                // InternalUSE.g:7537:8: (lv_symbolT_11_0= ':' )
                {
                // InternalUSE.g:7537:8: (lv_symbolT_11_0= ':' )
                // InternalUSE.g:7538:9: lv_symbolT_11_0= ':'
                {
                lv_symbolT_11_0=(Token)match(input,41,FOLLOW_61); if (state.failed) return ;

                }


                }

                // InternalUSE.g:7550:7: ( (lv_ownedType_12_0= ruleTypeExpCS ) )
                // InternalUSE.g:7551:8: (lv_ownedType_12_0= ruleTypeExpCS )
                {
                // InternalUSE.g:7551:8: (lv_ownedType_12_0= ruleTypeExpCS )
                // InternalUSE.g:7552:9: lv_ownedType_12_0= ruleTypeExpCS
                {
                if ( state.backtracking==0 ) {

                  									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_0_1_2_0_1_0());
                  								
                }
                pushFollow(FOLLOW_97);
                lv_ownedType_12_0=ruleTypeExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalUSE.g:7570:6: ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )?
        int alt189=2;
        int LA189_0 = input.LA(1);

        if ( (LA189_0==97) ) {
            alt189=1;
        }
        switch (alt189) {
            case 1 :
                // InternalUSE.g:7571:7: ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) )
                {
                // InternalUSE.g:7571:7: ( (lv_symbolCI_13_0= '<-' ) )
                // InternalUSE.g:7572:8: (lv_symbolCI_13_0= '<-' )
                {
                // InternalUSE.g:7572:8: (lv_symbolCI_13_0= '<-' )
                // InternalUSE.g:7573:9: lv_symbolCI_13_0= '<-'
                {
                lv_symbolCI_13_0=(Token)match(input,97,FOLLOW_3); if (state.failed) return ;

                }


                }

                // InternalUSE.g:7585:7: ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) )
                // InternalUSE.g:7586:8: (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS )
                {
                // InternalUSE.g:7586:8: (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS )
                // InternalUSE.g:7587:9: lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS
                {
                if ( state.backtracking==0 ) {

                  									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_2_1_1_0());
                  								
                }
                pushFollow(FOLLOW_98);
                lv_ownedCoIterator_14_0=ruleCoIteratorVariableCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalUSE.g:7605:6: ( (lv_symbolIE_15_0= 'in' ) )
        // InternalUSE.g:7606:7: (lv_symbolIE_15_0= 'in' )
        {
        // InternalUSE.g:7606:7: (lv_symbolIE_15_0= 'in' )
        // InternalUSE.g:7607:8: lv_symbolIE_15_0= 'in'
        {
        lv_symbolIE_15_0=(Token)match(input,108,FOLLOW_34); if (state.failed) return ;

        }


        }

        // InternalUSE.g:7619:6: ( (lv_ownedInitExpression_16_0= ruleExpCS ) )
        // InternalUSE.g:7620:7: (lv_ownedInitExpression_16_0= ruleExpCS )
        {
        // InternalUSE.g:7620:7: (lv_ownedInitExpression_16_0= ruleExpCS )
        // InternalUSE.g:7621:8: lv_ownedInitExpression_16_0= ruleExpCS
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_2_3_0());
          							
        }
        pushFollow(FOLLOW_2);
        lv_ownedInitExpression_16_0=ruleExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred204_InternalUSE

    // Delegated rules

    public final boolean synpred156_InternalUSE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred156_InternalUSE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred154_InternalUSE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred154_InternalUSE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred188_InternalUSE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred188_InternalUSE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred191_InternalUSE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred191_InternalUSE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred198_InternalUSE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred198_InternalUSE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred194_InternalUSE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred194_InternalUSE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred152_InternalUSE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred152_InternalUSE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred201_InternalUSE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred201_InternalUSE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred125_InternalUSE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred125_InternalUSE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred146_InternalUSE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred146_InternalUSE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred153_InternalUSE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred153_InternalUSE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred204_InternalUSE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred204_InternalUSE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA46 dfa46 = new DFA46(this);
    protected DFA88 dfa88 = new DFA88(this);
    protected DFA106 dfa106 = new DFA106(this);
    protected DFA109 dfa109 = new DFA109(this);
    protected DFA140 dfa140 = new DFA140(this);
    protected DFA148 dfa148 = new DFA148(this);
    static final String dfa_1s = "\50\uffff";
    static final String dfa_2s = "\4\uffff\1\7\17\uffff\5\7\16\uffff\1\7";
    static final String dfa_3s = "\1\4\1\26\1\4\1\51\3\4\2\uffff\3\26\5\4\3\26\24\4";
    static final String dfa_4s = "\1\4\1\26\1\27\1\51\1\75\2\25\2\uffff\3\26\5\27\3\26\5\75\16\27\1\75";
    static final String dfa_5s = "\7\uffff\1\1\1\2\37\uffff";
    static final String dfa_6s = "\50\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2",
            "\1\3\22\uffff\1\4",
            "\1\5",
            "\1\7\31\uffff\1\7\12\uffff\1\6\4\uffff\1\10\1\uffff\2\7\6\uffff\1\7\3\uffff\2\7",
            "\1\20\12\uffff\1\14\1\15\1\16\1\17\1\11\1\12\1\13",
            "\1\30\12\uffff\1\24\1\25\1\26\1\27\1\21\1\22\1\23",
            "",
            "",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\3\11\uffff\1\32\10\uffff\1\4",
            "\1\3\11\uffff\1\32\10\uffff\1\4",
            "\1\3\11\uffff\1\32\10\uffff\1\4",
            "\1\3\11\uffff\1\32\10\uffff\1\4",
            "\1\3\11\uffff\1\32\10\uffff\1\4",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\7\31\uffff\1\7\17\uffff\1\10\1\uffff\2\7\6\uffff\1\7\3\uffff\2\7",
            "\1\7\31\uffff\1\7\17\uffff\1\10\1\uffff\2\7\6\uffff\1\7\3\uffff\2\7",
            "\1\7\31\uffff\1\7\17\uffff\1\10\1\uffff\2\7\6\uffff\1\7\3\uffff\2\7",
            "\1\7\31\uffff\1\7\17\uffff\1\10\1\uffff\2\7\6\uffff\1\7\3\uffff\2\7",
            "\1\7\31\uffff\1\7\17\uffff\1\10\1\uffff\2\7\6\uffff\1\7\3\uffff\2\7",
            "\1\40\12\uffff\1\34\1\35\1\36\1\37\4\uffff\1\41",
            "\1\3\22\uffff\1\4",
            "\1\46\12\uffff\1\42\1\43\1\44\1\45\4\uffff\1\47",
            "\1\40\12\uffff\1\34\1\35\1\36\1\37\4\uffff\1\41",
            "\1\40\12\uffff\1\34\1\35\1\36\1\37\4\uffff\1\41",
            "\1\40\12\uffff\1\34\1\35\1\36\1\37\4\uffff\1\41",
            "\1\40\12\uffff\1\34\1\35\1\36\1\37\4\uffff\1\41",
            "\1\40\12\uffff\1\34\1\35\1\36\1\37\4\uffff\1\41",
            "\1\3\11\uffff\1\32\10\uffff\1\4",
            "\1\46\12\uffff\1\42\1\43\1\44\1\45\4\uffff\1\47",
            "\1\46\12\uffff\1\42\1\43\1\44\1\45\4\uffff\1\47",
            "\1\46\12\uffff\1\42\1\43\1\44\1\45\4\uffff\1\47",
            "\1\46\12\uffff\1\42\1\43\1\44\1\45\4\uffff\1\47",
            "\1\46\12\uffff\1\42\1\43\1\44\1\45\4\uffff\1\47",
            "\1\7\31\uffff\1\7\17\uffff\1\10\1\uffff\2\7\6\uffff\1\7\3\uffff\2\7"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1588:2: (this_OperationComplex_0= ruleOperationComplex | this_OperationQuery_1= ruleOperationQuery )";
        }
    }
    static final String dfa_8s = "\22\uffff";
    static final String dfa_9s = "\1\4\11\uffff\5\0\3\uffff";
    static final String dfa_10s = "\1\105\11\uffff\5\0\3\uffff";
    static final String dfa_11s = "\1\uffff\1\1\1\2\16\uffff\1\3";
    static final String dfa_12s = "\12\uffff\1\0\1\1\1\2\1\3\1\4\3\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\12\uffff\4\2\1\12\1\13\1\14\50\uffff\4\2\1\15\1\16\2\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA88 extends DFA {

        public DFA88(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 88;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "3961:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA88_10 = input.LA(1);

                         
                        int index88_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalUSE()) ) {s = 2;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index88_10);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA88_11 = input.LA(1);

                         
                        int index88_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalUSE()) ) {s = 2;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index88_11);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA88_12 = input.LA(1);

                         
                        int index88_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalUSE()) ) {s = 2;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index88_12);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA88_13 = input.LA(1);

                         
                        int index88_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalUSE()) ) {s = 2;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index88_13);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA88_14 = input.LA(1);

                         
                        int index88_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalUSE()) ) {s = 2;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index88_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 88, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\37\uffff";
    static final String dfa_15s = "\1\4\3\0\33\uffff";
    static final String dfa_16s = "\1\153\3\0\33\uffff";
    static final String dfa_17s = "\4\uffff\1\1\31\uffff\1\2";
    static final String dfa_18s = "\1\uffff\1\0\1\1\1\2\33\uffff}>";
    static final String[] dfa_19s = {
            "\3\4\5\uffff\1\4\2\uffff\10\4\47\uffff\10\4\2\uffff\1\1\20\uffff\1\2\1\3\5\uffff\1\4\1\uffff\5\4\4\uffff\1\36",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA106 extends DFA {

        public DFA106(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 106;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "4817:2: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA106_1 = input.LA(1);

                         
                        int index106_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred146_InternalUSE()) ) {s = 4;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index106_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA106_2 = input.LA(1);

                         
                        int index106_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred146_InternalUSE()) ) {s = 4;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index106_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA106_3 = input.LA(1);

                         
                        int index106_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred146_InternalUSE()) ) {s = 4;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index106_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 106, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_20s = "\36\uffff";
    static final String dfa_21s = "\1\4\11\uffff\7\0\15\uffff";
    static final String dfa_22s = "\1\146\11\uffff\7\0\15\uffff";
    static final String dfa_23s = "\1\uffff\1\1\1\2\1\3\15\uffff\1\7\1\10\7\uffff\1\11\1\4\1\5\1\6";
    static final String dfa_24s = "\12\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\15\uffff}>";
    static final String[] dfa_25s = {
            "\1\32\2\3\5\uffff\1\3\2\uffff\4\22\1\14\1\15\1\16\1\1\47\uffff\4\22\1\17\1\20\1\13\1\12\32\uffff\1\21\1\uffff\4\3\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA109 extends DFA {

        public DFA109(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 109;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "5073:2: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_MapLiteralExpCS_4= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_6= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_7= ruleTypeLiteralExpCS | this_NameExpCS_8= ruleNameExpCS )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA109_10 = input.LA(1);

                         
                        int index109_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred152_InternalUSE()) ) {s = 27;}

                        else if ( (synpred156_InternalUSE()) ) {s = 18;}

                         
                        input.seek(index109_10);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA109_11 = input.LA(1);

                         
                        int index109_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred153_InternalUSE()) ) {s = 28;}

                        else if ( (synpred156_InternalUSE()) ) {s = 18;}

                         
                        input.seek(index109_11);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA109_12 = input.LA(1);

                         
                        int index109_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalUSE()) ) {s = 29;}

                        else if ( (synpred156_InternalUSE()) ) {s = 18;}

                         
                        input.seek(index109_12);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA109_13 = input.LA(1);

                         
                        int index109_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalUSE()) ) {s = 29;}

                        else if ( (synpred156_InternalUSE()) ) {s = 18;}

                         
                        input.seek(index109_13);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA109_14 = input.LA(1);

                         
                        int index109_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalUSE()) ) {s = 29;}

                        else if ( (synpred156_InternalUSE()) ) {s = 18;}

                         
                        input.seek(index109_14);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA109_15 = input.LA(1);

                         
                        int index109_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalUSE()) ) {s = 29;}

                        else if ( (synpred156_InternalUSE()) ) {s = 18;}

                         
                        input.seek(index109_15);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA109_16 = input.LA(1);

                         
                        int index109_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalUSE()) ) {s = 29;}

                        else if ( (synpred156_InternalUSE()) ) {s = 18;}

                         
                        input.seek(index109_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 109, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_26s = "\13\uffff";
    static final String dfa_27s = "\1\4\12\uffff";
    static final String dfa_28s = "\1\16\2\0\10\uffff";
    static final String dfa_29s = "\1\155\2\0\10\uffff";
    static final String dfa_30s = "\3\uffff\1\3\1\4\4\uffff\1\1\1\2";
    static final String dfa_31s = "\1\uffff\1\0\1\1\10\uffff}>";
    static final String[] dfa_32s = {
            "\1\4\10\uffff\1\4\21\uffff\1\2\5\uffff\1\4\61\uffff\1\1\12\uffff\1\3\1\4",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA140 extends DFA {

        public DFA140(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 140;
            this.eot = dfa_26;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "6911:3: ( ( ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA140_1 = input.LA(1);

                         
                        int index140_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred188_InternalUSE()) ) {s = 9;}

                        else if ( (synpred194_InternalUSE()) ) {s = 3;}

                         
                        input.seek(index140_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA140_2 = input.LA(1);

                         
                        int index140_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred191_InternalUSE()) ) {s = 10;}

                        else if ( (synpred194_InternalUSE()) ) {s = 3;}

                         
                        input.seek(index140_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 140, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA148 extends DFA {

        public DFA148(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 148;
            this.eot = dfa_26;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "7356:4: ( ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA148_1 = input.LA(1);

                         
                        int index148_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred198_InternalUSE()) ) {s = 9;}

                        else if ( (synpred204_InternalUSE()) ) {s = 3;}

                         
                        input.seek(index148_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA148_2 = input.LA(1);

                         
                        int index148_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred201_InternalUSE()) ) {s = 10;}

                        else if ( (synpred204_InternalUSE()) ) {s = 3;}

                         
                        input.seek(index148_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 148, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0100008399000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0100008398000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000878010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0102210060000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0102210040000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0102200040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0102000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0002000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000420000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000000003F8010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00001C0000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0xC0000000007F9070L,0x0000087D0600013FL});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x3000800000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x3001000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000020800000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000804000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0xC0000000007F9070L,0x0000007D0600013FL});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000800800000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000020004000010L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000004000L,0x0000000008000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000004000050L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0xC0000200007F9070L,0x0000087D0600013FL});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000001020L,0x0000000040000080L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000001000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0080400020001002L,0x0000000001FFFFC0L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000802400002L,0x0000000080000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000002000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000001000004000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0xC0000200047F9070L,0x0000087D0600013FL});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0xC0000000047F9070L,0x0000087D0600013FL});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000420000000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000050000000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000004000L,0x0000100000000000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000420000400000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0xC000020000FF9070L,0x0000087D0600013FL});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000800000804000L,0x0000200000000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000020000000002L,0x0000100200000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000400000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000000L,0x0000100200000000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});

}