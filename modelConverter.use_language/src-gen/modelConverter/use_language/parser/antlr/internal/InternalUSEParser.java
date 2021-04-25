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

@SuppressWarnings("all")
public class InternalUSEParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_INT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'*'", "'..'", "','", "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "'Integer'", "'String'", "'Real'", "'Boolean'", "'enum'", "'{'", "'}'", "'abstract'", "'class'", "'<'", "'end'", "'association'", "'aggregation'", "'composition'", "'between'", "'['", "']'", "'role'", "'ordered'", "'associationclass'", "'attributes'", "':'", "'operations'", "'='", "'begin'", "'('", "')'", "'constraints'", "'context'", "'inv'", "'::'", "'pre'", "'post'"
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
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
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

        public InternalUSEParser(TokenStream input, USEGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected USEGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalUSE.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalUSE.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalUSE.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalUSE.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_enums_2_0= ruleEnum ) )* ( (lv_packagedElement_3_0= ruleType ) )* ( (lv_constraints_4_0= ruleConstrainsGeneral ) )? ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_enums_2_0 = null;

        EObject lv_packagedElement_3_0 = null;

        EObject lv_constraints_4_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:77:2: ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_enums_2_0= ruleEnum ) )* ( (lv_packagedElement_3_0= ruleType ) )* ( (lv_constraints_4_0= ruleConstrainsGeneral ) )? ) ) )
            // InternalUSE.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_enums_2_0= ruleEnum ) )* ( (lv_packagedElement_3_0= ruleType ) )* ( (lv_constraints_4_0= ruleConstrainsGeneral ) )? ) )
            {
            // InternalUSE.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_enums_2_0= ruleEnum ) )* ( (lv_packagedElement_3_0= ruleType ) )* ( (lv_constraints_4_0= ruleConstrainsGeneral ) )? ) )
            // InternalUSE.g:79:3: otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_enums_2_0= ruleEnum ) )* ( (lv_packagedElement_3_0= ruleType ) )* ( (lv_constraints_4_0= ruleConstrainsGeneral ) )? )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
            		
            // InternalUSE.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUSE.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUSE.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalUSE.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUSE.g:101:3: ( ( (lv_enums_2_0= ruleEnum ) )* ( (lv_packagedElement_3_0= ruleType ) )* ( (lv_constraints_4_0= ruleConstrainsGeneral ) )? )
            // InternalUSE.g:102:4: ( (lv_enums_2_0= ruleEnum ) )* ( (lv_packagedElement_3_0= ruleType ) )* ( (lv_constraints_4_0= ruleConstrainsGeneral ) )?
            {
            // InternalUSE.g:102:4: ( (lv_enums_2_0= ruleEnum ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==29) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUSE.g:103:5: (lv_enums_2_0= ruleEnum )
            	    {
            	    // InternalUSE.g:103:5: (lv_enums_2_0= ruleEnum )
            	    // InternalUSE.g:104:6: lv_enums_2_0= ruleEnum
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getEnumsEnumParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_enums_2_0=ruleEnum();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"enums",
            	    							lv_enums_2_0,
            	    							"modelConverter.use_language.USE.Enum");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalUSE.g:121:4: ( (lv_packagedElement_3_0= ruleType ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=32 && LA2_0<=33)||(LA2_0>=36 && LA2_0<=38)||LA2_0==44) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalUSE.g:122:5: (lv_packagedElement_3_0= ruleType )
            	    {
            	    // InternalUSE.g:122:5: (lv_packagedElement_3_0= ruleType )
            	    // InternalUSE.g:123:6: lv_packagedElement_3_0= ruleType
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getPackagedElementTypeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_packagedElement_3_0=ruleType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"packagedElement",
            	    							lv_packagedElement_3_0,
            	    							"modelConverter.use_language.USE.Type");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalUSE.g:140:4: ( (lv_constraints_4_0= ruleConstrainsGeneral ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==52) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalUSE.g:141:5: (lv_constraints_4_0= ruleConstrainsGeneral )
                    {
                    // InternalUSE.g:141:5: (lv_constraints_4_0= ruleConstrainsGeneral )
                    // InternalUSE.g:142:6: lv_constraints_4_0= ruleConstrainsGeneral
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getConstraintsConstrainsGeneralParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_constraints_4_0=ruleConstrainsGeneral();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelRule());
                    						}
                    						set(
                    							current,
                    							"constraints",
                    							lv_constraints_4_0,
                    							"modelConverter.use_language.USE.ConstrainsGeneral");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleMultiplicity"
    // InternalUSE.g:164:1: entryRuleMultiplicity returns [EObject current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final EObject entryRuleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicity = null;


        try {
            // InternalUSE.g:164:53: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // InternalUSE.g:165:2: iv_ruleMultiplicity= ruleMultiplicity EOF
            {
             newCompositeNode(grammarAccess.getMultiplicityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicity=ruleMultiplicity();

            state._fsp--;

             current =iv_ruleMultiplicity; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUSE.g:171:1: ruleMultiplicity returns [EObject current=null] : ( ( ( (lv_minValue_0_1= '*' | lv_minValue_0_2= ruleIntToString ) ) ) (otherlv_1= '..' ( ( (lv_maxValue_2_1= '*' | lv_maxValue_2_2= ruleIntToString ) ) ) )? (otherlv_3= ',' ( ( (lv_minValue_4_1= '*' | lv_minValue_4_2= ruleIntToString ) ) ) (otherlv_5= '..' ( ( (lv_maxValue_6_1= '*' | lv_maxValue_6_2= ruleIntToString ) ) ) )? )* ) ;
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
            // InternalUSE.g:177:2: ( ( ( ( (lv_minValue_0_1= '*' | lv_minValue_0_2= ruleIntToString ) ) ) (otherlv_1= '..' ( ( (lv_maxValue_2_1= '*' | lv_maxValue_2_2= ruleIntToString ) ) ) )? (otherlv_3= ',' ( ( (lv_minValue_4_1= '*' | lv_minValue_4_2= ruleIntToString ) ) ) (otherlv_5= '..' ( ( (lv_maxValue_6_1= '*' | lv_maxValue_6_2= ruleIntToString ) ) ) )? )* ) )
            // InternalUSE.g:178:2: ( ( ( (lv_minValue_0_1= '*' | lv_minValue_0_2= ruleIntToString ) ) ) (otherlv_1= '..' ( ( (lv_maxValue_2_1= '*' | lv_maxValue_2_2= ruleIntToString ) ) ) )? (otherlv_3= ',' ( ( (lv_minValue_4_1= '*' | lv_minValue_4_2= ruleIntToString ) ) ) (otherlv_5= '..' ( ( (lv_maxValue_6_1= '*' | lv_maxValue_6_2= ruleIntToString ) ) ) )? )* )
            {
            // InternalUSE.g:178:2: ( ( ( (lv_minValue_0_1= '*' | lv_minValue_0_2= ruleIntToString ) ) ) (otherlv_1= '..' ( ( (lv_maxValue_2_1= '*' | lv_maxValue_2_2= ruleIntToString ) ) ) )? (otherlv_3= ',' ( ( (lv_minValue_4_1= '*' | lv_minValue_4_2= ruleIntToString ) ) ) (otherlv_5= '..' ( ( (lv_maxValue_6_1= '*' | lv_maxValue_6_2= ruleIntToString ) ) ) )? )* )
            // InternalUSE.g:179:3: ( ( (lv_minValue_0_1= '*' | lv_minValue_0_2= ruleIntToString ) ) ) (otherlv_1= '..' ( ( (lv_maxValue_2_1= '*' | lv_maxValue_2_2= ruleIntToString ) ) ) )? (otherlv_3= ',' ( ( (lv_minValue_4_1= '*' | lv_minValue_4_2= ruleIntToString ) ) ) (otherlv_5= '..' ( ( (lv_maxValue_6_1= '*' | lv_maxValue_6_2= ruleIntToString ) ) ) )? )*
            {
            // InternalUSE.g:179:3: ( ( (lv_minValue_0_1= '*' | lv_minValue_0_2= ruleIntToString ) ) )
            // InternalUSE.g:180:4: ( (lv_minValue_0_1= '*' | lv_minValue_0_2= ruleIntToString ) )
            {
            // InternalUSE.g:180:4: ( (lv_minValue_0_1= '*' | lv_minValue_0_2= ruleIntToString ) )
            // InternalUSE.g:181:5: (lv_minValue_0_1= '*' | lv_minValue_0_2= ruleIntToString )
            {
            // InternalUSE.g:181:5: (lv_minValue_0_1= '*' | lv_minValue_0_2= ruleIntToString )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=15 && LA4_0<=24)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalUSE.g:182:6: lv_minValue_0_1= '*'
                    {
                    lv_minValue_0_1=(Token)match(input,12,FOLLOW_6); 

                    						newLeafNode(lv_minValue_0_1, grammarAccess.getMultiplicityAccess().getMinValueAsteriskKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMultiplicityRule());
                    						}
                    						addWithLastConsumed(current, "minValue", lv_minValue_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalUSE.g:193:6: lv_minValue_0_2= ruleIntToString
                    {

                    						newCompositeNode(grammarAccess.getMultiplicityAccess().getMinValueIntToStringParserRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_6);
                    lv_minValue_0_2=ruleIntToString();

                    state._fsp--;


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
                    break;

            }


            }


            }

            // InternalUSE.g:211:3: (otherlv_1= '..' ( ( (lv_maxValue_2_1= '*' | lv_maxValue_2_2= ruleIntToString ) ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalUSE.g:212:4: otherlv_1= '..' ( ( (lv_maxValue_2_1= '*' | lv_maxValue_2_2= ruleIntToString ) ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_1_0());
                    			
                    // InternalUSE.g:216:4: ( ( (lv_maxValue_2_1= '*' | lv_maxValue_2_2= ruleIntToString ) ) )
                    // InternalUSE.g:217:5: ( (lv_maxValue_2_1= '*' | lv_maxValue_2_2= ruleIntToString ) )
                    {
                    // InternalUSE.g:217:5: ( (lv_maxValue_2_1= '*' | lv_maxValue_2_2= ruleIntToString ) )
                    // InternalUSE.g:218:6: (lv_maxValue_2_1= '*' | lv_maxValue_2_2= ruleIntToString )
                    {
                    // InternalUSE.g:218:6: (lv_maxValue_2_1= '*' | lv_maxValue_2_2= ruleIntToString )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==12) ) {
                        alt5=1;
                    }
                    else if ( ((LA5_0>=15 && LA5_0<=24)) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalUSE.g:219:7: lv_maxValue_2_1= '*'
                            {
                            lv_maxValue_2_1=(Token)match(input,12,FOLLOW_8); 

                            							newLeafNode(lv_maxValue_2_1, grammarAccess.getMultiplicityAccess().getMaxValueAsteriskKeyword_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMultiplicityRule());
                            							}
                            							addWithLastConsumed(current, "maxValue", lv_maxValue_2_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalUSE.g:230:7: lv_maxValue_2_2= ruleIntToString
                            {

                            							newCompositeNode(grammarAccess.getMultiplicityAccess().getMaxValueIntToStringParserRuleCall_1_1_0_1());
                            						
                            pushFollow(FOLLOW_8);
                            lv_maxValue_2_2=ruleIntToString();

                            state._fsp--;


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
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalUSE.g:249:3: (otherlv_3= ',' ( ( (lv_minValue_4_1= '*' | lv_minValue_4_2= ruleIntToString ) ) ) (otherlv_5= '..' ( ( (lv_maxValue_6_1= '*' | lv_maxValue_6_2= ruleIntToString ) ) ) )? )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==14) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalUSE.g:250:4: otherlv_3= ',' ( ( (lv_minValue_4_1= '*' | lv_minValue_4_2= ruleIntToString ) ) ) (otherlv_5= '..' ( ( (lv_maxValue_6_1= '*' | lv_maxValue_6_2= ruleIntToString ) ) ) )?
            	    {
            	    otherlv_3=(Token)match(input,14,FOLLOW_7); 

            	    				newLeafNode(otherlv_3, grammarAccess.getMultiplicityAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalUSE.g:254:4: ( ( (lv_minValue_4_1= '*' | lv_minValue_4_2= ruleIntToString ) ) )
            	    // InternalUSE.g:255:5: ( (lv_minValue_4_1= '*' | lv_minValue_4_2= ruleIntToString ) )
            	    {
            	    // InternalUSE.g:255:5: ( (lv_minValue_4_1= '*' | lv_minValue_4_2= ruleIntToString ) )
            	    // InternalUSE.g:256:6: (lv_minValue_4_1= '*' | lv_minValue_4_2= ruleIntToString )
            	    {
            	    // InternalUSE.g:256:6: (lv_minValue_4_1= '*' | lv_minValue_4_2= ruleIntToString )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==12) ) {
            	        alt7=1;
            	    }
            	    else if ( ((LA7_0>=15 && LA7_0<=24)) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalUSE.g:257:7: lv_minValue_4_1= '*'
            	            {
            	            lv_minValue_4_1=(Token)match(input,12,FOLLOW_6); 

            	            							newLeafNode(lv_minValue_4_1, grammarAccess.getMultiplicityAccess().getMinValueAsteriskKeyword_2_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicityRule());
            	            							}
            	            							addWithLastConsumed(current, "minValue", lv_minValue_4_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalUSE.g:268:7: lv_minValue_4_2= ruleIntToString
            	            {

            	            							newCompositeNode(grammarAccess.getMultiplicityAccess().getMinValueIntToStringParserRuleCall_2_1_0_1());
            	            						
            	            pushFollow(FOLLOW_6);
            	            lv_minValue_4_2=ruleIntToString();

            	            state._fsp--;


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
            	            break;

            	    }


            	    }


            	    }

            	    // InternalUSE.g:286:4: (otherlv_5= '..' ( ( (lv_maxValue_6_1= '*' | lv_maxValue_6_2= ruleIntToString ) ) ) )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==13) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalUSE.g:287:5: otherlv_5= '..' ( ( (lv_maxValue_6_1= '*' | lv_maxValue_6_2= ruleIntToString ) ) )
            	            {
            	            otherlv_5=(Token)match(input,13,FOLLOW_7); 

            	            					newLeafNode(otherlv_5, grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_2_2_0());
            	            				
            	            // InternalUSE.g:291:5: ( ( (lv_maxValue_6_1= '*' | lv_maxValue_6_2= ruleIntToString ) ) )
            	            // InternalUSE.g:292:6: ( (lv_maxValue_6_1= '*' | lv_maxValue_6_2= ruleIntToString ) )
            	            {
            	            // InternalUSE.g:292:6: ( (lv_maxValue_6_1= '*' | lv_maxValue_6_2= ruleIntToString ) )
            	            // InternalUSE.g:293:7: (lv_maxValue_6_1= '*' | lv_maxValue_6_2= ruleIntToString )
            	            {
            	            // InternalUSE.g:293:7: (lv_maxValue_6_1= '*' | lv_maxValue_6_2= ruleIntToString )
            	            int alt8=2;
            	            int LA8_0 = input.LA(1);

            	            if ( (LA8_0==12) ) {
            	                alt8=1;
            	            }
            	            else if ( ((LA8_0>=15 && LA8_0<=24)) ) {
            	                alt8=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 8, 0, input);

            	                throw nvae;
            	            }
            	            switch (alt8) {
            	                case 1 :
            	                    // InternalUSE.g:294:8: lv_maxValue_6_1= '*'
            	                    {
            	                    lv_maxValue_6_1=(Token)match(input,12,FOLLOW_8); 

            	                    								newLeafNode(lv_maxValue_6_1, grammarAccess.getMultiplicityAccess().getMaxValueAsteriskKeyword_2_2_1_0_0());
            	                    							

            	                    								if (current==null) {
            	                    									current = createModelElement(grammarAccess.getMultiplicityRule());
            	                    								}
            	                    								addWithLastConsumed(current, "maxValue", lv_maxValue_6_1, null);
            	                    							

            	                    }
            	                    break;
            	                case 2 :
            	                    // InternalUSE.g:305:8: lv_maxValue_6_2= ruleIntToString
            	                    {

            	                    								newCompositeNode(grammarAccess.getMultiplicityAccess().getMaxValueIntToStringParserRuleCall_2_2_1_0_1());
            	                    							
            	                    pushFollow(FOLLOW_8);
            	                    lv_maxValue_6_2=ruleIntToString();

            	                    state._fsp--;


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


            	leaveRule();

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
    // InternalUSE.g:329:1: entryRuleIntToString returns [String current=null] : iv_ruleIntToString= ruleIntToString EOF ;
    public final String entryRuleIntToString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntToString = null;


        try {
            // InternalUSE.g:329:51: (iv_ruleIntToString= ruleIntToString EOF )
            // InternalUSE.g:330:2: iv_ruleIntToString= ruleIntToString EOF
            {
             newCompositeNode(grammarAccess.getIntToStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntToString=ruleIntToString();

            state._fsp--;

             current =iv_ruleIntToString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUSE.g:336:1: ruleIntToString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ ;
    public final AntlrDatatypeRuleToken ruleIntToString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUSE.g:342:2: ( (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ )
            // InternalUSE.g:343:2: (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+
            {
            // InternalUSE.g:343:2: (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=11;
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
                case 19:
                    {
                    alt11=5;
                    }
                    break;
                case 20:
                    {
                    alt11=6;
                    }
                    break;
                case 21:
                    {
                    alt11=7;
                    }
                    break;
                case 22:
                    {
                    alt11=8;
                    }
                    break;
                case 23:
                    {
                    alt11=9;
                    }
                    break;
                case 24:
                    {
                    alt11=10;
                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // InternalUSE.g:344:3: kw= '0'
            	    {
            	    kw=(Token)match(input,15,FOLLOW_9); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getIntToStringAccess().getDigitZeroKeyword_0());
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalUSE.g:350:3: kw= '1'
            	    {
            	    kw=(Token)match(input,16,FOLLOW_9); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getIntToStringAccess().getDigitOneKeyword_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalUSE.g:356:3: kw= '2'
            	    {
            	    kw=(Token)match(input,17,FOLLOW_9); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getIntToStringAccess().getDigitTwoKeyword_2());
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalUSE.g:362:3: kw= '3'
            	    {
            	    kw=(Token)match(input,18,FOLLOW_9); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getIntToStringAccess().getDigitThreeKeyword_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalUSE.g:368:3: kw= '4'
            	    {
            	    kw=(Token)match(input,19,FOLLOW_9); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getIntToStringAccess().getDigitFourKeyword_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalUSE.g:374:3: kw= '5'
            	    {
            	    kw=(Token)match(input,20,FOLLOW_9); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getIntToStringAccess().getDigitFiveKeyword_5());
            	    		

            	    }
            	    break;
            	case 7 :
            	    // InternalUSE.g:380:3: kw= '6'
            	    {
            	    kw=(Token)match(input,21,FOLLOW_9); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getIntToStringAccess().getDigitSixKeyword_6());
            	    		

            	    }
            	    break;
            	case 8 :
            	    // InternalUSE.g:386:3: kw= '7'
            	    {
            	    kw=(Token)match(input,22,FOLLOW_9); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getIntToStringAccess().getDigitSevenKeyword_7());
            	    		

            	    }
            	    break;
            	case 9 :
            	    // InternalUSE.g:392:3: kw= '8'
            	    {
            	    kw=(Token)match(input,23,FOLLOW_9); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getIntToStringAccess().getDigitEightKeyword_8());
            	    		

            	    }
            	    break;
            	case 10 :
            	    // InternalUSE.g:398:3: kw= '9'
            	    {
            	    kw=(Token)match(input,24,FOLLOW_9); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getIntToStringAccess().getDigitNineKeyword_9());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }


            	leaveRule();

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
    // InternalUSE.g:407:1: entryRuleDefaultType returns [String current=null] : iv_ruleDefaultType= ruleDefaultType EOF ;
    public final String entryRuleDefaultType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDefaultType = null;


        try {
            // InternalUSE.g:407:51: (iv_ruleDefaultType= ruleDefaultType EOF )
            // InternalUSE.g:408:2: iv_ruleDefaultType= ruleDefaultType EOF
            {
             newCompositeNode(grammarAccess.getDefaultTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefaultType=ruleDefaultType();

            state._fsp--;

             current =iv_ruleDefaultType.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUSE.g:414:1: ruleDefaultType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Integer' | kw= 'String' | kw= 'Real' | kw= 'Boolean' ) ;
    public final AntlrDatatypeRuleToken ruleDefaultType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUSE.g:420:2: ( (kw= 'Integer' | kw= 'String' | kw= 'Real' | kw= 'Boolean' ) )
            // InternalUSE.g:421:2: (kw= 'Integer' | kw= 'String' | kw= 'Real' | kw= 'Boolean' )
            {
            // InternalUSE.g:421:2: (kw= 'Integer' | kw= 'String' | kw= 'Real' | kw= 'Boolean' )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt12=1;
                }
                break;
            case 26:
                {
                alt12=2;
                }
                break;
            case 27:
                {
                alt12=3;
                }
                break;
            case 28:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalUSE.g:422:3: kw= 'Integer'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDefaultTypeAccess().getIntegerKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalUSE.g:428:3: kw= 'String'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDefaultTypeAccess().getStringKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalUSE.g:434:3: kw= 'Real'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDefaultTypeAccess().getRealKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalUSE.g:440:3: kw= 'Boolean'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDefaultTypeAccess().getBooleanKeyword_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleType"
    // InternalUSE.g:449:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalUSE.g:449:45: (iv_ruleType= ruleType EOF )
            // InternalUSE.g:450:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUSE.g:456:1: ruleType returns [EObject current=null] : (this_Class_0= ruleClass | this_Association_1= ruleAssociation | this_AssociationClass_2= ruleAssociationClass ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_Association_1 = null;

        EObject this_AssociationClass_2 = null;



        	enterRule();

        try {
            // InternalUSE.g:462:2: ( (this_Class_0= ruleClass | this_Association_1= ruleAssociation | this_AssociationClass_2= ruleAssociationClass ) )
            // InternalUSE.g:463:2: (this_Class_0= ruleClass | this_Association_1= ruleAssociation | this_AssociationClass_2= ruleAssociationClass )
            {
            // InternalUSE.g:463:2: (this_Class_0= ruleClass | this_Association_1= ruleAssociation | this_AssociationClass_2= ruleAssociationClass )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==44) ) {
                    alt13=3;
                }
                else if ( (LA13_1==33) ) {
                    alt13=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                alt13=1;
                }
                break;
            case 36:
            case 37:
            case 38:
                {
                alt13=2;
                }
                break;
            case 44:
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
                    // InternalUSE.g:464:3: this_Class_0= ruleClass
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getClassParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Class_0=ruleClass();

                    state._fsp--;


                    			current = this_Class_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUSE.g:473:3: this_Association_1= ruleAssociation
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getAssociationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Association_1=ruleAssociation();

                    state._fsp--;


                    			current = this_Association_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUSE.g:482:3: this_AssociationClass_2= ruleAssociationClass
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getAssociationClassParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssociationClass_2=ruleAssociationClass();

                    state._fsp--;


                    			current = this_AssociationClass_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleEnum"
    // InternalUSE.g:494:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // InternalUSE.g:494:45: (iv_ruleEnum= ruleEnum EOF )
            // InternalUSE.g:495:2: iv_ruleEnum= ruleEnum EOF
            {
             newCompositeNode(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnum=ruleEnum();

            state._fsp--;

             current =iv_ruleEnum; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUSE.g:501:1: ruleEnum returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )+ otherlv_4= '}' ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:507:2: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )+ otherlv_4= '}' ) )
            // InternalUSE.g:508:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )+ otherlv_4= '}' )
            {
            // InternalUSE.g:508:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )+ otherlv_4= '}' )
            // InternalUSE.g:509:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
            		
            // InternalUSE.g:513:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUSE.g:514:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalUSE.g:514:4: (lv_name_1_0= RULE_ID )
                    // InternalUSE.g:515:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0());
                    				

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
                    break;

            }

            otherlv_2=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUSE.g:535:3: ( (lv_elements_3_0= ruleEnumElement ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalUSE.g:536:4: (lv_elements_3_0= ruleEnumElement )
            	    {
            	    // InternalUSE.g:536:4: (lv_elements_3_0= ruleEnumElement )
            	    // InternalUSE.g:537:5: lv_elements_3_0= ruleEnumElement
            	    {

            	    					newCompositeNode(grammarAccess.getEnumAccess().getElementsEnumElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_elements_3_0=ruleEnumElement();

            	    state._fsp--;


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
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            otherlv_4=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalUSE.g:562:1: entryRuleEnumElement returns [String current=null] : iv_ruleEnumElement= ruleEnumElement EOF ;
    public final String entryRuleEnumElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnumElement = null;


        try {
            // InternalUSE.g:562:51: (iv_ruleEnumElement= ruleEnumElement EOF )
            // InternalUSE.g:563:2: iv_ruleEnumElement= ruleEnumElement EOF
            {
             newCompositeNode(grammarAccess.getEnumElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumElement=ruleEnumElement();

            state._fsp--;

             current =iv_ruleEnumElement.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUSE.g:569:1: ruleEnumElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= ',' )? ) ;
    public final AntlrDatatypeRuleToken ruleEnumElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalUSE.g:575:2: ( (this_ID_0= RULE_ID (kw= ',' )? ) )
            // InternalUSE.g:576:2: (this_ID_0= RULE_ID (kw= ',' )? )
            {
            // InternalUSE.g:576:2: (this_ID_0= RULE_ID (kw= ',' )? )
            // InternalUSE.g:577:3: this_ID_0= RULE_ID (kw= ',' )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getEnumElementAccess().getIDTerminalRuleCall_0());
            		
            // InternalUSE.g:584:3: (kw= ',' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==14) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalUSE.g:585:4: kw= ','
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEnumElementAccess().getCommaKeyword_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalUSE.g:595:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalUSE.g:595:46: (iv_ruleClass= ruleClass EOF )
            // InternalUSE.g:596:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUSE.g:602:1: ruleClass returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? ( (lv_attributes_5_0= ruleAttributesBase ) )? ( (lv_operations_6_0= ruleOperationsBase ) )? ( (lv_constraints_7_0= ruleConstraintsBase ) )? otherlv_8= 'end' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_8=null;
        EObject lv_generalization_4_0 = null;

        EObject lv_attributes_5_0 = null;

        EObject lv_operations_6_0 = null;

        EObject lv_constraints_7_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:608:2: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? ( (lv_attributes_5_0= ruleAttributesBase ) )? ( (lv_operations_6_0= ruleOperationsBase ) )? ( (lv_constraints_7_0= ruleConstraintsBase ) )? otherlv_8= 'end' ) )
            // InternalUSE.g:609:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? ( (lv_attributes_5_0= ruleAttributesBase ) )? ( (lv_operations_6_0= ruleOperationsBase ) )? ( (lv_constraints_7_0= ruleConstraintsBase ) )? otherlv_8= 'end' )
            {
            // InternalUSE.g:609:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? ( (lv_attributes_5_0= ruleAttributesBase ) )? ( (lv_operations_6_0= ruleOperationsBase ) )? ( (lv_constraints_7_0= ruleConstraintsBase ) )? otherlv_8= 'end' )
            // InternalUSE.g:610:3: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? ( (lv_attributes_5_0= ruleAttributesBase ) )? ( (lv_operations_6_0= ruleOperationsBase ) )? ( (lv_constraints_7_0= ruleConstraintsBase ) )? otherlv_8= 'end'
            {
            // InternalUSE.g:610:3: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUSE.g:611:4: (lv_abstract_0_0= 'abstract' )
                    {
                    // InternalUSE.g:611:4: (lv_abstract_0_0= 'abstract' )
                    // InternalUSE.g:612:5: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,32,FOLLOW_13); 

                    					newLeafNode(lv_abstract_0_0, grammarAccess.getClassAccess().getAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassRule());
                    					}
                    					setWithLastConsumed(current, "abstract", lv_abstract_0_0 != null, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
            		
            // InternalUSE.g:628:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUSE.g:629:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUSE.g:629:4: (lv_name_2_0= RULE_ID )
            // InternalUSE.g:630:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_2_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0());
            				

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

            // InternalUSE.g:646:3: (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUSE.g:647:4: otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getClassAccess().getLessThanSignKeyword_3_0());
                    			
                    // InternalUSE.g:651:4: ( (lv_generalization_4_0= ruleGeneralization ) )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_ID) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalUSE.g:652:5: (lv_generalization_4_0= ruleGeneralization )
                    	    {
                    	    // InternalUSE.g:652:5: (lv_generalization_4_0= ruleGeneralization )
                    	    // InternalUSE.g:653:6: lv_generalization_4_0= ruleGeneralization
                    	    {

                    	    						newCompositeNode(grammarAccess.getClassAccess().getGeneralizationGeneralizationParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
                    	    lv_generalization_4_0=ruleGeneralization();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);


                    }
                    break;

            }

            // InternalUSE.g:671:3: ( (lv_attributes_5_0= ruleAttributesBase ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==45) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUSE.g:672:4: (lv_attributes_5_0= ruleAttributesBase )
                    {
                    // InternalUSE.g:672:4: (lv_attributes_5_0= ruleAttributesBase )
                    // InternalUSE.g:673:5: lv_attributes_5_0= ruleAttributesBase
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributesBaseParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_attributes_5_0=ruleAttributesBase();

                    state._fsp--;


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
                    break;

            }

            // InternalUSE.g:690:3: ( (lv_operations_6_0= ruleOperationsBase ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==47) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUSE.g:691:4: (lv_operations_6_0= ruleOperationsBase )
                    {
                    // InternalUSE.g:691:4: (lv_operations_6_0= ruleOperationsBase )
                    // InternalUSE.g:692:5: lv_operations_6_0= ruleOperationsBase
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getOperationsOperationsBaseParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_operations_6_0=ruleOperationsBase();

                    state._fsp--;


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
                    break;

            }

            // InternalUSE.g:709:3: ( (lv_constraints_7_0= ruleConstraintsBase ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==52) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUSE.g:710:4: (lv_constraints_7_0= ruleConstraintsBase )
                    {
                    // InternalUSE.g:710:4: (lv_constraints_7_0= ruleConstraintsBase )
                    // InternalUSE.g:711:5: lv_constraints_7_0= ruleConstraintsBase
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getConstraintsConstraintsBaseParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_18);
                    lv_constraints_7_0=ruleConstraintsBase();

                    state._fsp--;


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
                    break;

            }

            otherlv_8=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getClassAccess().getEndKeyword_7());
            		

            }


            }


            	leaveRule();

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
    // InternalUSE.g:736:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalUSE.g:736:55: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalUSE.g:737:2: iv_ruleGeneralization= ruleGeneralization EOF
            {
             newCompositeNode(grammarAccess.getGeneralizationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneralization=ruleGeneralization();

            state._fsp--;

             current =iv_ruleGeneralization; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUSE.g:743:1: ruleGeneralization returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUSE.g:749:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? ) )
            // InternalUSE.g:750:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? )
            {
            // InternalUSE.g:750:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? )
            // InternalUSE.g:751:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )?
            {
            // InternalUSE.g:751:3: ( (otherlv_0= RULE_ID ) )
            // InternalUSE.g:752:4: (otherlv_0= RULE_ID )
            {
            // InternalUSE.g:752:4: (otherlv_0= RULE_ID )
            // InternalUSE.g:753:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getGeneralizationAccess().getGeneralAllClassCrossReference_0_0());
            				

            }


            }

            // InternalUSE.g:764:3: (otherlv_1= ',' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==14) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalUSE.g:765:4: otherlv_1= ','
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getGeneralizationAccess().getCommaKeyword_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleSimpleTypes"
    // InternalUSE.g:774:1: entryRuleSimpleTypes returns [EObject current=null] : iv_ruleSimpleTypes= ruleSimpleTypes EOF ;
    public final EObject entryRuleSimpleTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleTypes = null;


        try {
            // InternalUSE.g:774:52: (iv_ruleSimpleTypes= ruleSimpleTypes EOF )
            // InternalUSE.g:775:2: iv_ruleSimpleTypes= ruleSimpleTypes EOF
            {
             newCompositeNode(grammarAccess.getSimpleTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleTypes=ruleSimpleTypes();

            state._fsp--;

             current =iv_ruleSimpleTypes; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUSE.g:781:1: ruleSimpleTypes returns [EObject current=null] : ( ( (lv_defaultType_0_0= ruleDefaultType ) ) | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleSimpleTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_defaultType_0_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:787:2: ( ( ( (lv_defaultType_0_0= ruleDefaultType ) ) | ( (otherlv_1= RULE_ID ) ) ) )
            // InternalUSE.g:788:2: ( ( (lv_defaultType_0_0= ruleDefaultType ) ) | ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalUSE.g:788:2: ( ( (lv_defaultType_0_0= ruleDefaultType ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=25 && LA24_0<=28)) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_ID) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalUSE.g:789:3: ( (lv_defaultType_0_0= ruleDefaultType ) )
                    {
                    // InternalUSE.g:789:3: ( (lv_defaultType_0_0= ruleDefaultType ) )
                    // InternalUSE.g:790:4: (lv_defaultType_0_0= ruleDefaultType )
                    {
                    // InternalUSE.g:790:4: (lv_defaultType_0_0= ruleDefaultType )
                    // InternalUSE.g:791:5: lv_defaultType_0_0= ruleDefaultType
                    {

                    					newCompositeNode(grammarAccess.getSimpleTypesAccess().getDefaultTypeDefaultTypeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_defaultType_0_0=ruleDefaultType();

                    state._fsp--;


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
                    break;
                case 2 :
                    // InternalUSE.g:809:3: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalUSE.g:809:3: ( (otherlv_1= RULE_ID ) )
                    // InternalUSE.g:810:4: (otherlv_1= RULE_ID )
                    {
                    // InternalUSE.g:810:4: (otherlv_1= RULE_ID )
                    // InternalUSE.g:811:5: otherlv_1= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimpleTypesRule());
                    					}
                    				
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_1, grammarAccess.getSimpleTypesAccess().getReferendedAllClassCrossReference_1_0());
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleAssociation"
    // InternalUSE.g:826:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalUSE.g:826:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalUSE.g:827:2: iv_ruleAssociation= ruleAssociation EOF
            {
             newCompositeNode(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociation=ruleAssociation();

            state._fsp--;

             current =iv_ruleAssociation; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUSE.g:833:1: ruleAssociation returns [EObject current=null] : ( ( ( (lv_typeAssociation_0_1= 'association' | lv_typeAssociation_0_2= 'aggregation' | lv_typeAssociation_0_3= 'composition' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_associationEnds_3_0= ruleAssociationEnd ) )+ otherlv_4= 'end' ) ;
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
            // InternalUSE.g:839:2: ( ( ( ( (lv_typeAssociation_0_1= 'association' | lv_typeAssociation_0_2= 'aggregation' | lv_typeAssociation_0_3= 'composition' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_associationEnds_3_0= ruleAssociationEnd ) )+ otherlv_4= 'end' ) )
            // InternalUSE.g:840:2: ( ( ( (lv_typeAssociation_0_1= 'association' | lv_typeAssociation_0_2= 'aggregation' | lv_typeAssociation_0_3= 'composition' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_associationEnds_3_0= ruleAssociationEnd ) )+ otherlv_4= 'end' )
            {
            // InternalUSE.g:840:2: ( ( ( (lv_typeAssociation_0_1= 'association' | lv_typeAssociation_0_2= 'aggregation' | lv_typeAssociation_0_3= 'composition' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_associationEnds_3_0= ruleAssociationEnd ) )+ otherlv_4= 'end' )
            // InternalUSE.g:841:3: ( ( (lv_typeAssociation_0_1= 'association' | lv_typeAssociation_0_2= 'aggregation' | lv_typeAssociation_0_3= 'composition' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_associationEnds_3_0= ruleAssociationEnd ) )+ otherlv_4= 'end'
            {
            // InternalUSE.g:841:3: ( ( (lv_typeAssociation_0_1= 'association' | lv_typeAssociation_0_2= 'aggregation' | lv_typeAssociation_0_3= 'composition' ) ) )
            // InternalUSE.g:842:4: ( (lv_typeAssociation_0_1= 'association' | lv_typeAssociation_0_2= 'aggregation' | lv_typeAssociation_0_3= 'composition' ) )
            {
            // InternalUSE.g:842:4: ( (lv_typeAssociation_0_1= 'association' | lv_typeAssociation_0_2= 'aggregation' | lv_typeAssociation_0_3= 'composition' ) )
            // InternalUSE.g:843:5: (lv_typeAssociation_0_1= 'association' | lv_typeAssociation_0_2= 'aggregation' | lv_typeAssociation_0_3= 'composition' )
            {
            // InternalUSE.g:843:5: (lv_typeAssociation_0_1= 'association' | lv_typeAssociation_0_2= 'aggregation' | lv_typeAssociation_0_3= 'composition' )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt25=1;
                }
                break;
            case 37:
                {
                alt25=2;
                }
                break;
            case 38:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalUSE.g:844:6: lv_typeAssociation_0_1= 'association'
                    {
                    lv_typeAssociation_0_1=(Token)match(input,36,FOLLOW_3); 

                    						newLeafNode(lv_typeAssociation_0_1, grammarAccess.getAssociationAccess().getTypeAssociationAssociationKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssociationRule());
                    						}
                    						setWithLastConsumed(current, "typeAssociation", lv_typeAssociation_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalUSE.g:855:6: lv_typeAssociation_0_2= 'aggregation'
                    {
                    lv_typeAssociation_0_2=(Token)match(input,37,FOLLOW_3); 

                    						newLeafNode(lv_typeAssociation_0_2, grammarAccess.getAssociationAccess().getTypeAssociationAggregationKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssociationRule());
                    						}
                    						setWithLastConsumed(current, "typeAssociation", lv_typeAssociation_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalUSE.g:866:6: lv_typeAssociation_0_3= 'composition'
                    {
                    lv_typeAssociation_0_3=(Token)match(input,38,FOLLOW_3); 

                    						newLeafNode(lv_typeAssociation_0_3, grammarAccess.getAssociationAccess().getTypeAssociationCompositionKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssociationRule());
                    						}
                    						setWithLastConsumed(current, "typeAssociation", lv_typeAssociation_0_3, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalUSE.g:879:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUSE.g:880:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUSE.g:880:4: (lv_name_1_0= RULE_ID )
            // InternalUSE.g:881:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            otherlv_2=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAssociationAccess().getBetweenKeyword_2());
            		
            // InternalUSE.g:901:3: ( (lv_associationEnds_3_0= ruleAssociationEnd ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalUSE.g:902:4: (lv_associationEnds_3_0= ruleAssociationEnd )
            	    {
            	    // InternalUSE.g:902:4: (lv_associationEnds_3_0= ruleAssociationEnd )
            	    // InternalUSE.g:903:5: lv_associationEnds_3_0= ruleAssociationEnd
            	    {

            	    					newCompositeNode(grammarAccess.getAssociationAccess().getAssociationEndsAssociationEndParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_associationEnds_3_0=ruleAssociationEnd();

            	    state._fsp--;


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
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            otherlv_4=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAssociationAccess().getEndKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalUSE.g:928:1: entryRuleAssociationEnd returns [EObject current=null] : iv_ruleAssociationEnd= ruleAssociationEnd EOF ;
    public final EObject entryRuleAssociationEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationEnd = null;


        try {
            // InternalUSE.g:928:55: (iv_ruleAssociationEnd= ruleAssociationEnd EOF )
            // InternalUSE.g:929:2: iv_ruleAssociationEnd= ruleAssociationEnd EOF
            {
             newCompositeNode(grammarAccess.getAssociationEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociationEnd=ruleAssociationEnd();

            state._fsp--;

             current =iv_ruleAssociationEnd; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUSE.g:935:1: ruleAssociationEnd returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_mul_2_0= ruleMultiplicity ) ) otherlv_3= ']' (otherlv_4= 'role' ( (lv_role_5_0= RULE_ID ) ) )? ( (lv_ordered_6_0= 'ordered' ) )? ) ;
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
            // InternalUSE.g:941:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_mul_2_0= ruleMultiplicity ) ) otherlv_3= ']' (otherlv_4= 'role' ( (lv_role_5_0= RULE_ID ) ) )? ( (lv_ordered_6_0= 'ordered' ) )? ) )
            // InternalUSE.g:942:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_mul_2_0= ruleMultiplicity ) ) otherlv_3= ']' (otherlv_4= 'role' ( (lv_role_5_0= RULE_ID ) ) )? ( (lv_ordered_6_0= 'ordered' ) )? )
            {
            // InternalUSE.g:942:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_mul_2_0= ruleMultiplicity ) ) otherlv_3= ']' (otherlv_4= 'role' ( (lv_role_5_0= RULE_ID ) ) )? ( (lv_ordered_6_0= 'ordered' ) )? )
            // InternalUSE.g:943:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_mul_2_0= ruleMultiplicity ) ) otherlv_3= ']' (otherlv_4= 'role' ( (lv_role_5_0= RULE_ID ) ) )? ( (lv_ordered_6_0= 'ordered' ) )?
            {
            // InternalUSE.g:943:3: ( (otherlv_0= RULE_ID ) )
            // InternalUSE.g:944:4: (otherlv_0= RULE_ID )
            {
            // InternalUSE.g:944:4: (otherlv_0= RULE_ID )
            // InternalUSE.g:945:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationEndRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_0, grammarAccess.getAssociationEndAccess().getTypeAllClassCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationEndAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalUSE.g:960:3: ( (lv_mul_2_0= ruleMultiplicity ) )
            // InternalUSE.g:961:4: (lv_mul_2_0= ruleMultiplicity )
            {
            // InternalUSE.g:961:4: (lv_mul_2_0= ruleMultiplicity )
            // InternalUSE.g:962:5: lv_mul_2_0= ruleMultiplicity
            {

            					newCompositeNode(grammarAccess.getAssociationEndAccess().getMulMultiplicityParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_mul_2_0=ruleMultiplicity();

            state._fsp--;


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

            otherlv_3=(Token)match(input,41,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getAssociationEndAccess().getRightSquareBracketKeyword_3());
            		
            // InternalUSE.g:983:3: (otherlv_4= 'role' ( (lv_role_5_0= RULE_ID ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==42) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUSE.g:984:4: otherlv_4= 'role' ( (lv_role_5_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,42,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getAssociationEndAccess().getRoleKeyword_4_0());
                    			
                    // InternalUSE.g:988:4: ( (lv_role_5_0= RULE_ID ) )
                    // InternalUSE.g:989:5: (lv_role_5_0= RULE_ID )
                    {
                    // InternalUSE.g:989:5: (lv_role_5_0= RULE_ID )
                    // InternalUSE.g:990:6: lv_role_5_0= RULE_ID
                    {
                    lv_role_5_0=(Token)match(input,RULE_ID,FOLLOW_24); 

                    						newLeafNode(lv_role_5_0, grammarAccess.getAssociationEndAccess().getRoleIDTerminalRuleCall_4_1_0());
                    					

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
                    break;

            }

            // InternalUSE.g:1007:3: ( (lv_ordered_6_0= 'ordered' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==43) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalUSE.g:1008:4: (lv_ordered_6_0= 'ordered' )
                    {
                    // InternalUSE.g:1008:4: (lv_ordered_6_0= 'ordered' )
                    // InternalUSE.g:1009:5: lv_ordered_6_0= 'ordered'
                    {
                    lv_ordered_6_0=(Token)match(input,43,FOLLOW_2); 

                    					newLeafNode(lv_ordered_6_0, grammarAccess.getAssociationEndAccess().getOrderedOrderedKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAssociationEndRule());
                    					}
                    					setWithLastConsumed(current, "ordered", lv_ordered_6_0 != null, "ordered");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalUSE.g:1025:1: entryRuleAssociationClass returns [EObject current=null] : iv_ruleAssociationClass= ruleAssociationClass EOF ;
    public final EObject entryRuleAssociationClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationClass = null;


        try {
            // InternalUSE.g:1025:57: (iv_ruleAssociationClass= ruleAssociationClass EOF )
            // InternalUSE.g:1026:2: iv_ruleAssociationClass= ruleAssociationClass EOF
            {
             newCompositeNode(grammarAccess.getAssociationClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociationClass=ruleAssociationClass();

            state._fsp--;

             current =iv_ruleAssociationClass; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUSE.g:1032:1: ruleAssociationClass returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'associationclass' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? otherlv_5= 'between' ( (lv_associationEnds_6_0= ruleAssociationEnd ) )+ ( (lv_attributes_7_0= ruleAttributesBase ) )? ( (lv_operations_8_0= ruleOperationsBase ) )? ( (lv_constraints_9_0= ruleConstraintsBase ) )? otherlv_10= 'end' ) ;
    public final EObject ruleAssociationClass() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_10=null;
        EObject lv_generalization_4_0 = null;

        EObject lv_associationEnds_6_0 = null;

        EObject lv_attributes_7_0 = null;

        EObject lv_operations_8_0 = null;

        EObject lv_constraints_9_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1038:2: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'associationclass' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? otherlv_5= 'between' ( (lv_associationEnds_6_0= ruleAssociationEnd ) )+ ( (lv_attributes_7_0= ruleAttributesBase ) )? ( (lv_operations_8_0= ruleOperationsBase ) )? ( (lv_constraints_9_0= ruleConstraintsBase ) )? otherlv_10= 'end' ) )
            // InternalUSE.g:1039:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'associationclass' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? otherlv_5= 'between' ( (lv_associationEnds_6_0= ruleAssociationEnd ) )+ ( (lv_attributes_7_0= ruleAttributesBase ) )? ( (lv_operations_8_0= ruleOperationsBase ) )? ( (lv_constraints_9_0= ruleConstraintsBase ) )? otherlv_10= 'end' )
            {
            // InternalUSE.g:1039:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'associationclass' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? otherlv_5= 'between' ( (lv_associationEnds_6_0= ruleAssociationEnd ) )+ ( (lv_attributes_7_0= ruleAttributesBase ) )? ( (lv_operations_8_0= ruleOperationsBase ) )? ( (lv_constraints_9_0= ruleConstraintsBase ) )? otherlv_10= 'end' )
            // InternalUSE.g:1040:3: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'associationclass' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? otherlv_5= 'between' ( (lv_associationEnds_6_0= ruleAssociationEnd ) )+ ( (lv_attributes_7_0= ruleAttributesBase ) )? ( (lv_operations_8_0= ruleOperationsBase ) )? ( (lv_constraints_9_0= ruleConstraintsBase ) )? otherlv_10= 'end'
            {
            // InternalUSE.g:1040:3: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalUSE.g:1041:4: (lv_abstract_0_0= 'abstract' )
                    {
                    // InternalUSE.g:1041:4: (lv_abstract_0_0= 'abstract' )
                    // InternalUSE.g:1042:5: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,32,FOLLOW_25); 

                    					newLeafNode(lv_abstract_0_0, grammarAccess.getAssociationClassAccess().getAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAssociationClassRule());
                    					}
                    					setWithLastConsumed(current, "abstract", lv_abstract_0_0 != null, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationClassAccess().getAssociationclassKeyword_1());
            		
            // InternalUSE.g:1058:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUSE.g:1059:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUSE.g:1059:4: (lv_name_2_0= RULE_ID )
            // InternalUSE.g:1060:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_2_0, grammarAccess.getAssociationClassAccess().getNameIDTerminalRuleCall_2_0());
            				

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

            // InternalUSE.g:1076:3: (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==34) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUSE.g:1077:4: otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getAssociationClassAccess().getLessThanSignKeyword_3_0());
                    			
                    // InternalUSE.g:1081:4: ( (lv_generalization_4_0= ruleGeneralization ) )+
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
                    	    // InternalUSE.g:1082:5: (lv_generalization_4_0= ruleGeneralization )
                    	    {
                    	    // InternalUSE.g:1082:5: (lv_generalization_4_0= ruleGeneralization )
                    	    // InternalUSE.g:1083:6: lv_generalization_4_0= ruleGeneralization
                    	    {

                    	    						newCompositeNode(grammarAccess.getAssociationClassAccess().getGeneralizationGeneralizationParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_27);
                    	    lv_generalization_4_0=ruleGeneralization();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    if ( cnt30 >= 1 ) break loop30;
                                EarlyExitException eee =
                                    new EarlyExitException(30, input);
                                throw eee;
                        }
                        cnt30++;
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getAssociationClassAccess().getBetweenKeyword_4());
            		
            // InternalUSE.g:1105:3: ( (lv_associationEnds_6_0= ruleAssociationEnd ) )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalUSE.g:1106:4: (lv_associationEnds_6_0= ruleAssociationEnd )
            	    {
            	    // InternalUSE.g:1106:4: (lv_associationEnds_6_0= ruleAssociationEnd )
            	    // InternalUSE.g:1107:5: lv_associationEnds_6_0= ruleAssociationEnd
            	    {

            	    					newCompositeNode(grammarAccess.getAssociationClassAccess().getAssociationEndsAssociationEndParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_associationEnds_6_0=ruleAssociationEnd();

            	    state._fsp--;


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
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);

            // InternalUSE.g:1124:3: ( (lv_attributes_7_0= ruleAttributesBase ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==45) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalUSE.g:1125:4: (lv_attributes_7_0= ruleAttributesBase )
                    {
                    // InternalUSE.g:1125:4: (lv_attributes_7_0= ruleAttributesBase )
                    // InternalUSE.g:1126:5: lv_attributes_7_0= ruleAttributesBase
                    {

                    					newCompositeNode(grammarAccess.getAssociationClassAccess().getAttributesAttributesBaseParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_attributes_7_0=ruleAttributesBase();

                    state._fsp--;


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
                    break;

            }

            // InternalUSE.g:1143:3: ( (lv_operations_8_0= ruleOperationsBase ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==47) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalUSE.g:1144:4: (lv_operations_8_0= ruleOperationsBase )
                    {
                    // InternalUSE.g:1144:4: (lv_operations_8_0= ruleOperationsBase )
                    // InternalUSE.g:1145:5: lv_operations_8_0= ruleOperationsBase
                    {

                    					newCompositeNode(grammarAccess.getAssociationClassAccess().getOperationsOperationsBaseParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_operations_8_0=ruleOperationsBase();

                    state._fsp--;


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
                    break;

            }

            // InternalUSE.g:1162:3: ( (lv_constraints_9_0= ruleConstraintsBase ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==52) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalUSE.g:1163:4: (lv_constraints_9_0= ruleConstraintsBase )
                    {
                    // InternalUSE.g:1163:4: (lv_constraints_9_0= ruleConstraintsBase )
                    // InternalUSE.g:1164:5: lv_constraints_9_0= ruleConstraintsBase
                    {

                    					newCompositeNode(grammarAccess.getAssociationClassAccess().getConstraintsConstraintsBaseParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_18);
                    lv_constraints_9_0=ruleConstraintsBase();

                    state._fsp--;


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
                    break;

            }

            otherlv_10=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getAssociationClassAccess().getEndKeyword_9());
            		

            }


            }


            	leaveRule();

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
    // InternalUSE.g:1189:1: entryRuleAttributesBase returns [EObject current=null] : iv_ruleAttributesBase= ruleAttributesBase EOF ;
    public final EObject entryRuleAttributesBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributesBase = null;


        try {
            // InternalUSE.g:1189:55: (iv_ruleAttributesBase= ruleAttributesBase EOF )
            // InternalUSE.g:1190:2: iv_ruleAttributesBase= ruleAttributesBase EOF
            {
             newCompositeNode(grammarAccess.getAttributesBaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributesBase=ruleAttributesBase();

            state._fsp--;

             current =iv_ruleAttributesBase; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUSE.g:1196:1: ruleAttributesBase returns [EObject current=null] : (otherlv_0= 'attributes' ( (lv_attributes_1_0= ruleAttribute ) )* ) ;
    public final EObject ruleAttributesBase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_attributes_1_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1202:2: ( (otherlv_0= 'attributes' ( (lv_attributes_1_0= ruleAttribute ) )* ) )
            // InternalUSE.g:1203:2: (otherlv_0= 'attributes' ( (lv_attributes_1_0= ruleAttribute ) )* )
            {
            // InternalUSE.g:1203:2: (otherlv_0= 'attributes' ( (lv_attributes_1_0= ruleAttribute ) )* )
            // InternalUSE.g:1204:3: otherlv_0= 'attributes' ( (lv_attributes_1_0= ruleAttribute ) )*
            {
            otherlv_0=(Token)match(input,45,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributesBaseAccess().getAttributesKeyword_0());
            		
            // InternalUSE.g:1208:3: ( (lv_attributes_1_0= ruleAttribute ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalUSE.g:1209:4: (lv_attributes_1_0= ruleAttribute )
            	    {
            	    // InternalUSE.g:1209:4: (lv_attributes_1_0= ruleAttribute )
            	    // InternalUSE.g:1210:5: lv_attributes_1_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getAttributesBaseAccess().getAttributesAttributeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_attributes_1_0=ruleAttribute();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }


            	leaveRule();

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
    // InternalUSE.g:1231:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalUSE.g:1231:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalUSE.g:1232:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUSE.g:1238:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleSimpleTypes ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1244:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleSimpleTypes ) ) ) )
            // InternalUSE.g:1245:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleSimpleTypes ) ) )
            {
            // InternalUSE.g:1245:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleSimpleTypes ) ) )
            // InternalUSE.g:1246:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleSimpleTypes ) )
            {
            // InternalUSE.g:1246:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUSE.g:1247:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUSE.g:1247:4: (lv_name_0_0= RULE_ID )
            // InternalUSE.g:1248:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0());
            				

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

            otherlv_1=(Token)match(input,46,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
            		
            // InternalUSE.g:1268:3: ( (lv_type_2_0= ruleSimpleTypes ) )
            // InternalUSE.g:1269:4: (lv_type_2_0= ruleSimpleTypes )
            {
            // InternalUSE.g:1269:4: (lv_type_2_0= ruleSimpleTypes )
            // InternalUSE.g:1270:5: lv_type_2_0= ruleSimpleTypes
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeSimpleTypesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleSimpleTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"modelConverter.use_language.USE.SimpleTypes");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalUSE.g:1291:1: entryRuleOperationsBase returns [EObject current=null] : iv_ruleOperationsBase= ruleOperationsBase EOF ;
    public final EObject entryRuleOperationsBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationsBase = null;


        try {
            // InternalUSE.g:1291:55: (iv_ruleOperationsBase= ruleOperationsBase EOF )
            // InternalUSE.g:1292:2: iv_ruleOperationsBase= ruleOperationsBase EOF
            {
             newCompositeNode(grammarAccess.getOperationsBaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationsBase=ruleOperationsBase();

            state._fsp--;

             current =iv_ruleOperationsBase; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUSE.g:1298:1: ruleOperationsBase returns [EObject current=null] : (otherlv_0= 'operations' ( (lv_operations_1_0= ruleOperationType ) )* ) ;
    public final EObject ruleOperationsBase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_operations_1_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1304:2: ( (otherlv_0= 'operations' ( (lv_operations_1_0= ruleOperationType ) )* ) )
            // InternalUSE.g:1305:2: (otherlv_0= 'operations' ( (lv_operations_1_0= ruleOperationType ) )* )
            {
            // InternalUSE.g:1305:2: (otherlv_0= 'operations' ( (lv_operations_1_0= ruleOperationType ) )* )
            // InternalUSE.g:1306:3: otherlv_0= 'operations' ( (lv_operations_1_0= ruleOperationType ) )*
            {
            otherlv_0=(Token)match(input,47,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationsBaseAccess().getOperationsKeyword_0());
            		
            // InternalUSE.g:1310:3: ( (lv_operations_1_0= ruleOperationType ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalUSE.g:1311:4: (lv_operations_1_0= ruleOperationType )
            	    {
            	    // InternalUSE.g:1311:4: (lv_operations_1_0= ruleOperationType )
            	    // InternalUSE.g:1312:5: lv_operations_1_0= ruleOperationType
            	    {

            	    					newCompositeNode(grammarAccess.getOperationsBaseAccess().getOperationsOperationTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_operations_1_0=ruleOperationType();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }


            }


            	leaveRule();

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
    // InternalUSE.g:1333:1: entryRuleOperationType returns [EObject current=null] : iv_ruleOperationType= ruleOperationType EOF ;
    public final EObject entryRuleOperationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationType = null;


        try {
            // InternalUSE.g:1333:54: (iv_ruleOperationType= ruleOperationType EOF )
            // InternalUSE.g:1334:2: iv_ruleOperationType= ruleOperationType EOF
            {
             newCompositeNode(grammarAccess.getOperationTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationType=ruleOperationType();

            state._fsp--;

             current =iv_ruleOperationType; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUSE.g:1340:1: ruleOperationType returns [EObject current=null] : (this_OperationComplex_0= ruleOperationComplex | this_OperationQuery_1= ruleOperationQuery ) ;
    public final EObject ruleOperationType() throws RecognitionException {
        EObject current = null;

        EObject this_OperationComplex_0 = null;

        EObject this_OperationQuery_1 = null;



        	enterRule();

        try {
            // InternalUSE.g:1346:2: ( (this_OperationComplex_0= ruleOperationComplex | this_OperationQuery_1= ruleOperationQuery ) )
            // InternalUSE.g:1347:2: (this_OperationComplex_0= ruleOperationComplex | this_OperationQuery_1= ruleOperationQuery )
            {
            // InternalUSE.g:1347:2: (this_OperationComplex_0= ruleOperationComplex | this_OperationQuery_1= ruleOperationQuery )
            int alt38=2;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // InternalUSE.g:1348:3: this_OperationComplex_0= ruleOperationComplex
                    {

                    			newCompositeNode(grammarAccess.getOperationTypeAccess().getOperationComplexParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationComplex_0=ruleOperationComplex();

                    state._fsp--;


                    			current = this_OperationComplex_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUSE.g:1357:3: this_OperationQuery_1= ruleOperationQuery
                    {

                    			newCompositeNode(grammarAccess.getOperationTypeAccess().getOperationQueryParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationQuery_1=ruleOperationQuery();

                    state._fsp--;


                    			current = this_OperationQuery_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalUSE.g:1369:1: entryRuleOperationQuery returns [EObject current=null] : iv_ruleOperationQuery= ruleOperationQuery EOF ;
    public final EObject entryRuleOperationQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationQuery = null;


        try {
            // InternalUSE.g:1369:55: (iv_ruleOperationQuery= ruleOperationQuery EOF )
            // InternalUSE.g:1370:2: iv_ruleOperationQuery= ruleOperationQuery EOF
            {
             newCompositeNode(grammarAccess.getOperationQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationQuery=ruleOperationQuery();

            state._fsp--;

             current =iv_ruleOperationQuery; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUSE.g:1376:1: ruleOperationQuery returns [EObject current=null] : ( ( (lv_operationDeclaration_0_0= ruleOperationDeclaration ) ) otherlv_1= '=' ( (lv_operationbody_2_0= ruleOCLExpression ) ) ( (lv_conditions_3_0= ruleConditionType ) )* ) ;
    public final EObject ruleOperationQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_operationDeclaration_0_0 = null;

        AntlrDatatypeRuleToken lv_operationbody_2_0 = null;

        EObject lv_conditions_3_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1382:2: ( ( ( (lv_operationDeclaration_0_0= ruleOperationDeclaration ) ) otherlv_1= '=' ( (lv_operationbody_2_0= ruleOCLExpression ) ) ( (lv_conditions_3_0= ruleConditionType ) )* ) )
            // InternalUSE.g:1383:2: ( ( (lv_operationDeclaration_0_0= ruleOperationDeclaration ) ) otherlv_1= '=' ( (lv_operationbody_2_0= ruleOCLExpression ) ) ( (lv_conditions_3_0= ruleConditionType ) )* )
            {
            // InternalUSE.g:1383:2: ( ( (lv_operationDeclaration_0_0= ruleOperationDeclaration ) ) otherlv_1= '=' ( (lv_operationbody_2_0= ruleOCLExpression ) ) ( (lv_conditions_3_0= ruleConditionType ) )* )
            // InternalUSE.g:1384:3: ( (lv_operationDeclaration_0_0= ruleOperationDeclaration ) ) otherlv_1= '=' ( (lv_operationbody_2_0= ruleOCLExpression ) ) ( (lv_conditions_3_0= ruleConditionType ) )*
            {
            // InternalUSE.g:1384:3: ( (lv_operationDeclaration_0_0= ruleOperationDeclaration ) )
            // InternalUSE.g:1385:4: (lv_operationDeclaration_0_0= ruleOperationDeclaration )
            {
            // InternalUSE.g:1385:4: (lv_operationDeclaration_0_0= ruleOperationDeclaration )
            // InternalUSE.g:1386:5: lv_operationDeclaration_0_0= ruleOperationDeclaration
            {

            					newCompositeNode(grammarAccess.getOperationQueryAccess().getOperationDeclarationOperationDeclarationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
            lv_operationDeclaration_0_0=ruleOperationDeclaration();

            state._fsp--;


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

            otherlv_1=(Token)match(input,48,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationQueryAccess().getEqualsSignKeyword_1());
            		
            // InternalUSE.g:1407:3: ( (lv_operationbody_2_0= ruleOCLExpression ) )
            // InternalUSE.g:1408:4: (lv_operationbody_2_0= ruleOCLExpression )
            {
            // InternalUSE.g:1408:4: (lv_operationbody_2_0= ruleOCLExpression )
            // InternalUSE.g:1409:5: lv_operationbody_2_0= ruleOCLExpression
            {

            					newCompositeNode(grammarAccess.getOperationQueryAccess().getOperationbodyOCLExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_33);
            lv_operationbody_2_0=ruleOCLExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationQueryRule());
            					}
            					set(
            						current,
            						"operationbody",
            						lv_operationbody_2_0,
            						"modelConverter.use_language.USE.OCLExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUSE.g:1426:3: ( (lv_conditions_3_0= ruleConditionType ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=56 && LA39_0<=57)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalUSE.g:1427:4: (lv_conditions_3_0= ruleConditionType )
            	    {
            	    // InternalUSE.g:1427:4: (lv_conditions_3_0= ruleConditionType )
            	    // InternalUSE.g:1428:5: lv_conditions_3_0= ruleConditionType
            	    {

            	    					newCompositeNode(grammarAccess.getOperationQueryAccess().getConditionsConditionTypeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_conditions_3_0=ruleConditionType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOperationQueryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"conditions",
            	    						lv_conditions_3_0,
            	    						"modelConverter.use_language.USE.ConditionType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }


            }


            	leaveRule();

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
    // InternalUSE.g:1449:1: entryRuleOperationComplex returns [EObject current=null] : iv_ruleOperationComplex= ruleOperationComplex EOF ;
    public final EObject entryRuleOperationComplex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationComplex = null;


        try {
            // InternalUSE.g:1449:57: (iv_ruleOperationComplex= ruleOperationComplex EOF )
            // InternalUSE.g:1450:2: iv_ruleOperationComplex= ruleOperationComplex EOF
            {
             newCompositeNode(grammarAccess.getOperationComplexRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationComplex=ruleOperationComplex();

            state._fsp--;

             current =iv_ruleOperationComplex; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUSE.g:1456:1: ruleOperationComplex returns [EObject current=null] : ( ( (lv_operationDeclaration_0_0= ruleOperationDeclaration ) ) (otherlv_1= 'begin' ( (lv_operationbody_2_0= ruleOCLExpression ) )? otherlv_3= 'end' )? ( (lv_conditions_4_0= ruleConditionType ) )* ) ;
    public final EObject ruleOperationComplex() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operationDeclaration_0_0 = null;

        AntlrDatatypeRuleToken lv_operationbody_2_0 = null;

        EObject lv_conditions_4_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1462:2: ( ( ( (lv_operationDeclaration_0_0= ruleOperationDeclaration ) ) (otherlv_1= 'begin' ( (lv_operationbody_2_0= ruleOCLExpression ) )? otherlv_3= 'end' )? ( (lv_conditions_4_0= ruleConditionType ) )* ) )
            // InternalUSE.g:1463:2: ( ( (lv_operationDeclaration_0_0= ruleOperationDeclaration ) ) (otherlv_1= 'begin' ( (lv_operationbody_2_0= ruleOCLExpression ) )? otherlv_3= 'end' )? ( (lv_conditions_4_0= ruleConditionType ) )* )
            {
            // InternalUSE.g:1463:2: ( ( (lv_operationDeclaration_0_0= ruleOperationDeclaration ) ) (otherlv_1= 'begin' ( (lv_operationbody_2_0= ruleOCLExpression ) )? otherlv_3= 'end' )? ( (lv_conditions_4_0= ruleConditionType ) )* )
            // InternalUSE.g:1464:3: ( (lv_operationDeclaration_0_0= ruleOperationDeclaration ) ) (otherlv_1= 'begin' ( (lv_operationbody_2_0= ruleOCLExpression ) )? otherlv_3= 'end' )? ( (lv_conditions_4_0= ruleConditionType ) )*
            {
            // InternalUSE.g:1464:3: ( (lv_operationDeclaration_0_0= ruleOperationDeclaration ) )
            // InternalUSE.g:1465:4: (lv_operationDeclaration_0_0= ruleOperationDeclaration )
            {
            // InternalUSE.g:1465:4: (lv_operationDeclaration_0_0= ruleOperationDeclaration )
            // InternalUSE.g:1466:5: lv_operationDeclaration_0_0= ruleOperationDeclaration
            {

            					newCompositeNode(grammarAccess.getOperationComplexAccess().getOperationDeclarationOperationDeclarationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_34);
            lv_operationDeclaration_0_0=ruleOperationDeclaration();

            state._fsp--;


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

            // InternalUSE.g:1483:3: (otherlv_1= 'begin' ( (lv_operationbody_2_0= ruleOCLExpression ) )? otherlv_3= 'end' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==49) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalUSE.g:1484:4: otherlv_1= 'begin' ( (lv_operationbody_2_0= ruleOCLExpression ) )? otherlv_3= 'end'
                    {
                    otherlv_1=(Token)match(input,49,FOLLOW_35); 

                    				newLeafNode(otherlv_1, grammarAccess.getOperationComplexAccess().getBeginKeyword_1_0());
                    			
                    // InternalUSE.g:1488:4: ( (lv_operationbody_2_0= ruleOCLExpression ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==RULE_STRING) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalUSE.g:1489:5: (lv_operationbody_2_0= ruleOCLExpression )
                            {
                            // InternalUSE.g:1489:5: (lv_operationbody_2_0= ruleOCLExpression )
                            // InternalUSE.g:1490:6: lv_operationbody_2_0= ruleOCLExpression
                            {

                            						newCompositeNode(grammarAccess.getOperationComplexAccess().getOperationbodyOCLExpressionParserRuleCall_1_1_0());
                            					
                            pushFollow(FOLLOW_18);
                            lv_operationbody_2_0=ruleOCLExpression();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getOperationComplexRule());
                            						}
                            						set(
                            							current,
                            							"operationbody",
                            							lv_operationbody_2_0,
                            							"modelConverter.use_language.USE.OCLExpression");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,35,FOLLOW_33); 

                    				newLeafNode(otherlv_3, grammarAccess.getOperationComplexAccess().getEndKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalUSE.g:1512:3: ( (lv_conditions_4_0= ruleConditionType ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=56 && LA42_0<=57)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalUSE.g:1513:4: (lv_conditions_4_0= ruleConditionType )
            	    {
            	    // InternalUSE.g:1513:4: (lv_conditions_4_0= ruleConditionType )
            	    // InternalUSE.g:1514:5: lv_conditions_4_0= ruleConditionType
            	    {

            	    					newCompositeNode(grammarAccess.getOperationComplexAccess().getConditionsConditionTypeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_conditions_4_0=ruleConditionType();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }


            }


            	leaveRule();

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
    // InternalUSE.g:1535:1: entryRuleOperationDeclaration returns [EObject current=null] : iv_ruleOperationDeclaration= ruleOperationDeclaration EOF ;
    public final EObject entryRuleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDeclaration = null;


        try {
            // InternalUSE.g:1535:61: (iv_ruleOperationDeclaration= ruleOperationDeclaration EOF )
            // InternalUSE.g:1536:2: iv_ruleOperationDeclaration= ruleOperationDeclaration EOF
            {
             newCompositeNode(grammarAccess.getOperationDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationDeclaration=ruleOperationDeclaration();

            state._fsp--;

             current =iv_ruleOperationDeclaration; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUSE.g:1542:1: ruleOperationDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) )* otherlv_3= ')' (otherlv_4= ':' ( (lv_returnType_5_0= ruleSimpleTypes ) ) )? ) ;
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
            // InternalUSE.g:1548:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) )* otherlv_3= ')' (otherlv_4= ':' ( (lv_returnType_5_0= ruleSimpleTypes ) ) )? ) )
            // InternalUSE.g:1549:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) )* otherlv_3= ')' (otherlv_4= ':' ( (lv_returnType_5_0= ruleSimpleTypes ) ) )? )
            {
            // InternalUSE.g:1549:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) )* otherlv_3= ')' (otherlv_4= ':' ( (lv_returnType_5_0= ruleSimpleTypes ) ) )? )
            // InternalUSE.g:1550:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) )* otherlv_3= ')' (otherlv_4= ':' ( (lv_returnType_5_0= ruleSimpleTypes ) ) )?
            {
            // InternalUSE.g:1550:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUSE.g:1551:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUSE.g:1551:4: (lv_name_0_0= RULE_ID )
            // InternalUSE.g:1552:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(lv_name_0_0, grammarAccess.getOperationDeclarationAccess().getNameIDTerminalRuleCall_0_0());
            				

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

            otherlv_1=(Token)match(input,50,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationDeclarationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalUSE.g:1572:3: ( (lv_parameters_2_0= ruleParameter ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalUSE.g:1573:4: (lv_parameters_2_0= ruleParameter )
            	    {
            	    // InternalUSE.g:1573:4: (lv_parameters_2_0= ruleParameter )
            	    // InternalUSE.g:1574:5: lv_parameters_2_0= ruleParameter
            	    {

            	    					newCompositeNode(grammarAccess.getOperationDeclarationAccess().getParametersParameterParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_37);
            	    lv_parameters_2_0=ruleParameter();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            otherlv_3=(Token)match(input,51,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationDeclarationAccess().getRightParenthesisKeyword_3());
            		
            // InternalUSE.g:1595:3: (otherlv_4= ':' ( (lv_returnType_5_0= ruleSimpleTypes ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==46) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalUSE.g:1596:4: otherlv_4= ':' ( (lv_returnType_5_0= ruleSimpleTypes ) )
                    {
                    otherlv_4=(Token)match(input,46,FOLLOW_30); 

                    				newLeafNode(otherlv_4, grammarAccess.getOperationDeclarationAccess().getColonKeyword_4_0());
                    			
                    // InternalUSE.g:1600:4: ( (lv_returnType_5_0= ruleSimpleTypes ) )
                    // InternalUSE.g:1601:5: (lv_returnType_5_0= ruleSimpleTypes )
                    {
                    // InternalUSE.g:1601:5: (lv_returnType_5_0= ruleSimpleTypes )
                    // InternalUSE.g:1602:6: lv_returnType_5_0= ruleSimpleTypes
                    {

                    						newCompositeNode(grammarAccess.getOperationDeclarationAccess().getReturnTypeSimpleTypesParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_returnType_5_0=ruleSimpleTypes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperationDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"returnType",
                    							lv_returnType_5_0,
                    							"modelConverter.use_language.USE.SimpleTypes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalUSE.g:1624:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalUSE.g:1624:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalUSE.g:1625:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUSE.g:1631:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleSimpleTypes ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1637:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleSimpleTypes ) ) (otherlv_3= ',' )? ) )
            // InternalUSE.g:1638:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleSimpleTypes ) ) (otherlv_3= ',' )? )
            {
            // InternalUSE.g:1638:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleSimpleTypes ) ) (otherlv_3= ',' )? )
            // InternalUSE.g:1639:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleSimpleTypes ) ) (otherlv_3= ',' )?
            {
            // InternalUSE.g:1639:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUSE.g:1640:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUSE.g:1640:4: (lv_name_0_0= RULE_ID )
            // InternalUSE.g:1641:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0());
            				

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

            otherlv_1=(Token)match(input,46,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
            		
            // InternalUSE.g:1661:3: ( (lv_type_2_0= ruleSimpleTypes ) )
            // InternalUSE.g:1662:4: (lv_type_2_0= ruleSimpleTypes )
            {
            // InternalUSE.g:1662:4: (lv_type_2_0= ruleSimpleTypes )
            // InternalUSE.g:1663:5: lv_type_2_0= ruleSimpleTypes
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeSimpleTypesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_type_2_0=ruleSimpleTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"modelConverter.use_language.USE.SimpleTypes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUSE.g:1680:3: (otherlv_3= ',' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==14) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalUSE.g:1681:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getCommaKeyword_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleConstraintsBase"
    // InternalUSE.g:1690:1: entryRuleConstraintsBase returns [EObject current=null] : iv_ruleConstraintsBase= ruleConstraintsBase EOF ;
    public final EObject entryRuleConstraintsBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintsBase = null;


        try {
            // InternalUSE.g:1690:56: (iv_ruleConstraintsBase= ruleConstraintsBase EOF )
            // InternalUSE.g:1691:2: iv_ruleConstraintsBase= ruleConstraintsBase EOF
            {
             newCompositeNode(grammarAccess.getConstraintsBaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraintsBase=ruleConstraintsBase();

            state._fsp--;

             current =iv_ruleConstraintsBase; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUSE.g:1697:1: ruleConstraintsBase returns [EObject current=null] : (otherlv_0= 'constraints' ( (lv_invariants_1_0= ruleInvariantDefinition ) )* ) ;
    public final EObject ruleConstraintsBase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_invariants_1_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1703:2: ( (otherlv_0= 'constraints' ( (lv_invariants_1_0= ruleInvariantDefinition ) )* ) )
            // InternalUSE.g:1704:2: (otherlv_0= 'constraints' ( (lv_invariants_1_0= ruleInvariantDefinition ) )* )
            {
            // InternalUSE.g:1704:2: (otherlv_0= 'constraints' ( (lv_invariants_1_0= ruleInvariantDefinition ) )* )
            // InternalUSE.g:1705:3: otherlv_0= 'constraints' ( (lv_invariants_1_0= ruleInvariantDefinition ) )*
            {
            otherlv_0=(Token)match(input,52,FOLLOW_39); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintsBaseAccess().getConstraintsKeyword_0());
            		
            // InternalUSE.g:1709:3: ( (lv_invariants_1_0= ruleInvariantDefinition ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==54) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalUSE.g:1710:4: (lv_invariants_1_0= ruleInvariantDefinition )
            	    {
            	    // InternalUSE.g:1710:4: (lv_invariants_1_0= ruleInvariantDefinition )
            	    // InternalUSE.g:1711:5: lv_invariants_1_0= ruleInvariantDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getConstraintsBaseAccess().getInvariantsInvariantDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_39);
            	    lv_invariants_1_0=ruleInvariantDefinition();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            }


            }


            	leaveRule();

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
    // InternalUSE.g:1732:1: entryRuleConstrainsGeneral returns [EObject current=null] : iv_ruleConstrainsGeneral= ruleConstrainsGeneral EOF ;
    public final EObject entryRuleConstrainsGeneral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstrainsGeneral = null;


        try {
            // InternalUSE.g:1732:58: (iv_ruleConstrainsGeneral= ruleConstrainsGeneral EOF )
            // InternalUSE.g:1733:2: iv_ruleConstrainsGeneral= ruleConstrainsGeneral EOF
            {
             newCompositeNode(grammarAccess.getConstrainsGeneralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstrainsGeneral=ruleConstrainsGeneral();

            state._fsp--;

             current =iv_ruleConstrainsGeneral; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUSE.g:1739:1: ruleConstrainsGeneral returns [EObject current=null] : (otherlv_0= 'constraints' ( (lv_contexts_1_0= ruleContextsType ) )* ) ;
    public final EObject ruleConstrainsGeneral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_contexts_1_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1745:2: ( (otherlv_0= 'constraints' ( (lv_contexts_1_0= ruleContextsType ) )* ) )
            // InternalUSE.g:1746:2: (otherlv_0= 'constraints' ( (lv_contexts_1_0= ruleContextsType ) )* )
            {
            // InternalUSE.g:1746:2: (otherlv_0= 'constraints' ( (lv_contexts_1_0= ruleContextsType ) )* )
            // InternalUSE.g:1747:3: otherlv_0= 'constraints' ( (lv_contexts_1_0= ruleContextsType ) )*
            {
            otherlv_0=(Token)match(input,52,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getConstrainsGeneralAccess().getConstraintsKeyword_0());
            		
            // InternalUSE.g:1751:3: ( (lv_contexts_1_0= ruleContextsType ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==53) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalUSE.g:1752:4: (lv_contexts_1_0= ruleContextsType )
            	    {
            	    // InternalUSE.g:1752:4: (lv_contexts_1_0= ruleContextsType )
            	    // InternalUSE.g:1753:5: lv_contexts_1_0= ruleContextsType
            	    {

            	    					newCompositeNode(grammarAccess.getConstrainsGeneralAccess().getContextsContextsTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_40);
            	    lv_contexts_1_0=ruleContextsType();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }


            }


            	leaveRule();

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
    // InternalUSE.g:1774:1: entryRuleContextsType returns [EObject current=null] : iv_ruleContextsType= ruleContextsType EOF ;
    public final EObject entryRuleContextsType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextsType = null;


        try {
            // InternalUSE.g:1774:53: (iv_ruleContextsType= ruleContextsType EOF )
            // InternalUSE.g:1775:2: iv_ruleContextsType= ruleContextsType EOF
            {
             newCompositeNode(grammarAccess.getContextsTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextsType=ruleContextsType();

            state._fsp--;

             current =iv_ruleContextsType; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUSE.g:1781:1: ruleContextsType returns [EObject current=null] : (this_InvariantContext_0= ruleInvariantContext | this_OperationContext_1= ruleOperationContext ) ;
    public final EObject ruleContextsType() throws RecognitionException {
        EObject current = null;

        EObject this_InvariantContext_0 = null;

        EObject this_OperationContext_1 = null;



        	enterRule();

        try {
            // InternalUSE.g:1787:2: ( (this_InvariantContext_0= ruleInvariantContext | this_OperationContext_1= ruleOperationContext ) )
            // InternalUSE.g:1788:2: (this_InvariantContext_0= ruleInvariantContext | this_OperationContext_1= ruleOperationContext )
            {
            // InternalUSE.g:1788:2: (this_InvariantContext_0= ruleInvariantContext | this_OperationContext_1= ruleOperationContext )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==53) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==RULE_ID) ) {
                    int LA48_2 = input.LA(3);

                    if ( (LA48_2==EOF||LA48_2==46||(LA48_2>=53 && LA48_2<=54)) ) {
                        alt48=1;
                    }
                    else if ( (LA48_2==55) ) {
                        alt48=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalUSE.g:1789:3: this_InvariantContext_0= ruleInvariantContext
                    {

                    			newCompositeNode(grammarAccess.getContextsTypeAccess().getInvariantContextParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_InvariantContext_0=ruleInvariantContext();

                    state._fsp--;


                    			current = this_InvariantContext_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUSE.g:1798:3: this_OperationContext_1= ruleOperationContext
                    {

                    			newCompositeNode(grammarAccess.getContextsTypeAccess().getOperationContextParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationContext_1=ruleOperationContext();

                    state._fsp--;


                    			current = this_OperationContext_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalUSE.g:1810:1: entryRuleInvariantContext returns [EObject current=null] : iv_ruleInvariantContext= ruleInvariantContext EOF ;
    public final EObject entryRuleInvariantContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariantContext = null;


        try {
            // InternalUSE.g:1810:57: (iv_ruleInvariantContext= ruleInvariantContext EOF )
            // InternalUSE.g:1811:2: iv_ruleInvariantContext= ruleInvariantContext EOF
            {
             newCompositeNode(grammarAccess.getInvariantContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInvariantContext=ruleInvariantContext();

            state._fsp--;

             current =iv_ruleInvariantContext; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUSE.g:1817:1: ruleInvariantContext returns [EObject current=null] : (otherlv_0= 'context' ( ( (lv_variablename_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (otherlv_3= RULE_ID ) ) ( (lv_invariants_4_0= ruleInvariantDefinition ) )* ) ;
    public final EObject ruleInvariantContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_variablename_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_invariants_4_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1823:2: ( (otherlv_0= 'context' ( ( (lv_variablename_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (otherlv_3= RULE_ID ) ) ( (lv_invariants_4_0= ruleInvariantDefinition ) )* ) )
            // InternalUSE.g:1824:2: (otherlv_0= 'context' ( ( (lv_variablename_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (otherlv_3= RULE_ID ) ) ( (lv_invariants_4_0= ruleInvariantDefinition ) )* )
            {
            // InternalUSE.g:1824:2: (otherlv_0= 'context' ( ( (lv_variablename_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (otherlv_3= RULE_ID ) ) ( (lv_invariants_4_0= ruleInvariantDefinition ) )* )
            // InternalUSE.g:1825:3: otherlv_0= 'context' ( ( (lv_variablename_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (otherlv_3= RULE_ID ) ) ( (lv_invariants_4_0= ruleInvariantDefinition ) )*
            {
            otherlv_0=(Token)match(input,53,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInvariantContextAccess().getContextKeyword_0());
            		
            // InternalUSE.g:1829:3: ( ( (lv_variablename_1_0= RULE_ID ) ) otherlv_2= ':' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==46) ) {
                    alt49=1;
                }
            }
            switch (alt49) {
                case 1 :
                    // InternalUSE.g:1830:4: ( (lv_variablename_1_0= RULE_ID ) ) otherlv_2= ':'
                    {
                    // InternalUSE.g:1830:4: ( (lv_variablename_1_0= RULE_ID ) )
                    // InternalUSE.g:1831:5: (lv_variablename_1_0= RULE_ID )
                    {
                    // InternalUSE.g:1831:5: (lv_variablename_1_0= RULE_ID )
                    // InternalUSE.g:1832:6: lv_variablename_1_0= RULE_ID
                    {
                    lv_variablename_1_0=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(lv_variablename_1_0, grammarAccess.getInvariantContextAccess().getVariablenameIDTerminalRuleCall_1_0_0());
                    					

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

                    otherlv_2=(Token)match(input,46,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getInvariantContextAccess().getColonKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalUSE.g:1853:3: ( (otherlv_3= RULE_ID ) )
            // InternalUSE.g:1854:4: (otherlv_3= RULE_ID )
            {
            // InternalUSE.g:1854:4: (otherlv_3= RULE_ID )
            // InternalUSE.g:1855:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInvariantContextRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_39); 

            					newLeafNode(otherlv_3, grammarAccess.getInvariantContextAccess().getClassnameAllClassCrossReference_2_0());
            				

            }


            }

            // InternalUSE.g:1866:3: ( (lv_invariants_4_0= ruleInvariantDefinition ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==54) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalUSE.g:1867:4: (lv_invariants_4_0= ruleInvariantDefinition )
            	    {
            	    // InternalUSE.g:1867:4: (lv_invariants_4_0= ruleInvariantDefinition )
            	    // InternalUSE.g:1868:5: lv_invariants_4_0= ruleInvariantDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getInvariantContextAccess().getInvariantsInvariantDefinitionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_39);
            	    lv_invariants_4_0=ruleInvariantDefinition();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            }


            }


            	leaveRule();

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
    // InternalUSE.g:1889:1: entryRuleInvariantDefinition returns [EObject current=null] : iv_ruleInvariantDefinition= ruleInvariantDefinition EOF ;
    public final EObject entryRuleInvariantDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariantDefinition = null;


        try {
            // InternalUSE.g:1889:60: (iv_ruleInvariantDefinition= ruleInvariantDefinition EOF )
            // InternalUSE.g:1890:2: iv_ruleInvariantDefinition= ruleInvariantDefinition EOF
            {
             newCompositeNode(grammarAccess.getInvariantDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInvariantDefinition=ruleInvariantDefinition();

            state._fsp--;

             current =iv_ruleInvariantDefinition; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUSE.g:1896:1: ruleInvariantDefinition returns [EObject current=null] : (otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) ) ) ;
    public final EObject ruleInvariantDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_oclexpression_3_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1902:2: ( (otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) ) ) )
            // InternalUSE.g:1903:2: (otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) ) )
            {
            // InternalUSE.g:1903:2: (otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) ) )
            // InternalUSE.g:1904:3: otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_41); 

            			newLeafNode(otherlv_0, grammarAccess.getInvariantDefinitionAccess().getInvKeyword_0());
            		
            // InternalUSE.g:1908:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalUSE.g:1909:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalUSE.g:1909:4: (lv_name_1_0= RULE_ID )
                    // InternalUSE.g:1910:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_29); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getInvariantDefinitionAccess().getNameIDTerminalRuleCall_1_0());
                    				

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
                    break;

            }

            otherlv_2=(Token)match(input,46,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getInvariantDefinitionAccess().getColonKeyword_2());
            		
            // InternalUSE.g:1930:3: ( (lv_oclexpression_3_0= ruleOCLExpression ) )
            // InternalUSE.g:1931:4: (lv_oclexpression_3_0= ruleOCLExpression )
            {
            // InternalUSE.g:1931:4: (lv_oclexpression_3_0= ruleOCLExpression )
            // InternalUSE.g:1932:5: lv_oclexpression_3_0= ruleOCLExpression
            {

            					newCompositeNode(grammarAccess.getInvariantDefinitionAccess().getOclexpressionOCLExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_oclexpression_3_0=ruleOCLExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInvariantDefinitionRule());
            					}
            					set(
            						current,
            						"oclexpression",
            						lv_oclexpression_3_0,
            						"modelConverter.use_language.USE.OCLExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalUSE.g:1953:1: entryRuleOperationContext returns [EObject current=null] : iv_ruleOperationContext= ruleOperationContext EOF ;
    public final EObject entryRuleOperationContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationContext = null;


        try {
            // InternalUSE.g:1953:57: (iv_ruleOperationContext= ruleOperationContext EOF )
            // InternalUSE.g:1954:2: iv_ruleOperationContext= ruleOperationContext EOF
            {
             newCompositeNode(grammarAccess.getOperationContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationContext=ruleOperationContext();

            state._fsp--;

             current =iv_ruleOperationContext; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUSE.g:1960:1: ruleOperationContext returns [EObject current=null] : (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) ( (lv_constrains_2_0= ruleOperationConstraints ) ) ) ;
    public final EObject ruleOperationContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_constrains_2_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1966:2: ( (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) ( (lv_constrains_2_0= ruleOperationConstraints ) ) ) )
            // InternalUSE.g:1967:2: (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) ( (lv_constrains_2_0= ruleOperationConstraints ) ) )
            {
            // InternalUSE.g:1967:2: (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) ( (lv_constrains_2_0= ruleOperationConstraints ) ) )
            // InternalUSE.g:1968:3: otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) ( (lv_constrains_2_0= ruleOperationConstraints ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationContextAccess().getContextKeyword_0());
            		
            // InternalUSE.g:1972:3: ( (otherlv_1= RULE_ID ) )
            // InternalUSE.g:1973:4: (otherlv_1= RULE_ID )
            {
            // InternalUSE.g:1973:4: (otherlv_1= RULE_ID )
            // InternalUSE.g:1974:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationContextRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_42); 

            					newLeafNode(otherlv_1, grammarAccess.getOperationContextAccess().getClassnameAllClassCrossReference_1_0());
            				

            }


            }

            // InternalUSE.g:1985:3: ( (lv_constrains_2_0= ruleOperationConstraints ) )
            // InternalUSE.g:1986:4: (lv_constrains_2_0= ruleOperationConstraints )
            {
            // InternalUSE.g:1986:4: (lv_constrains_2_0= ruleOperationConstraints )
            // InternalUSE.g:1987:5: lv_constrains_2_0= ruleOperationConstraints
            {

            					newCompositeNode(grammarAccess.getOperationContextAccess().getConstrainsOperationConstraintsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_constrains_2_0=ruleOperationConstraints();

            state._fsp--;


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


            	leaveRule();

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
    // InternalUSE.g:2008:1: entryRuleOperationConstraints returns [EObject current=null] : iv_ruleOperationConstraints= ruleOperationConstraints EOF ;
    public final EObject entryRuleOperationConstraints() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationConstraints = null;


        try {
            // InternalUSE.g:2008:61: (iv_ruleOperationConstraints= ruleOperationConstraints EOF )
            // InternalUSE.g:2009:2: iv_ruleOperationConstraints= ruleOperationConstraints EOF
            {
             newCompositeNode(grammarAccess.getOperationConstraintsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationConstraints=ruleOperationConstraints();

            state._fsp--;

             current =iv_ruleOperationConstraints; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUSE.g:2015:1: ruleOperationConstraints returns [EObject current=null] : (otherlv_0= '::' ( (lv_operationDeclaration_1_0= ruleOperationDeclaration ) ) ( (lv_conditions_2_0= ruleConditionType ) )+ ) ;
    public final EObject ruleOperationConstraints() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_operationDeclaration_1_0 = null;

        EObject lv_conditions_2_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:2021:2: ( (otherlv_0= '::' ( (lv_operationDeclaration_1_0= ruleOperationDeclaration ) ) ( (lv_conditions_2_0= ruleConditionType ) )+ ) )
            // InternalUSE.g:2022:2: (otherlv_0= '::' ( (lv_operationDeclaration_1_0= ruleOperationDeclaration ) ) ( (lv_conditions_2_0= ruleConditionType ) )+ )
            {
            // InternalUSE.g:2022:2: (otherlv_0= '::' ( (lv_operationDeclaration_1_0= ruleOperationDeclaration ) ) ( (lv_conditions_2_0= ruleConditionType ) )+ )
            // InternalUSE.g:2023:3: otherlv_0= '::' ( (lv_operationDeclaration_1_0= ruleOperationDeclaration ) ) ( (lv_conditions_2_0= ruleConditionType ) )+
            {
            otherlv_0=(Token)match(input,55,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationConstraintsAccess().getColonColonKeyword_0());
            		
            // InternalUSE.g:2027:3: ( (lv_operationDeclaration_1_0= ruleOperationDeclaration ) )
            // InternalUSE.g:2028:4: (lv_operationDeclaration_1_0= ruleOperationDeclaration )
            {
            // InternalUSE.g:2028:4: (lv_operationDeclaration_1_0= ruleOperationDeclaration )
            // InternalUSE.g:2029:5: lv_operationDeclaration_1_0= ruleOperationDeclaration
            {

            					newCompositeNode(grammarAccess.getOperationConstraintsAccess().getOperationDeclarationOperationDeclarationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_43);
            lv_operationDeclaration_1_0=ruleOperationDeclaration();

            state._fsp--;


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

            // InternalUSE.g:2046:3: ( (lv_conditions_2_0= ruleConditionType ) )+
            int cnt52=0;
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=56 && LA52_0<=57)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalUSE.g:2047:4: (lv_conditions_2_0= ruleConditionType )
            	    {
            	    // InternalUSE.g:2047:4: (lv_conditions_2_0= ruleConditionType )
            	    // InternalUSE.g:2048:5: lv_conditions_2_0= ruleConditionType
            	    {

            	    					newCompositeNode(grammarAccess.getOperationConstraintsAccess().getConditionsConditionTypeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_conditions_2_0=ruleConditionType();

            	    state._fsp--;


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
            	    break;

            	default :
            	    if ( cnt52 >= 1 ) break loop52;
                        EarlyExitException eee =
                            new EarlyExitException(52, input);
                        throw eee;
                }
                cnt52++;
            } while (true);


            }


            }


            	leaveRule();

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
    // InternalUSE.g:2069:1: entryRuleConditionType returns [EObject current=null] : iv_ruleConditionType= ruleConditionType EOF ;
    public final EObject entryRuleConditionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionType = null;


        try {
            // InternalUSE.g:2069:54: (iv_ruleConditionType= ruleConditionType EOF )
            // InternalUSE.g:2070:2: iv_ruleConditionType= ruleConditionType EOF
            {
             newCompositeNode(grammarAccess.getConditionTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionType=ruleConditionType();

            state._fsp--;

             current =iv_ruleConditionType; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUSE.g:2076:1: ruleConditionType returns [EObject current=null] : (this_Precondition_0= rulePrecondition | this_Postcondition_1= rulePostcondition ) ;
    public final EObject ruleConditionType() throws RecognitionException {
        EObject current = null;

        EObject this_Precondition_0 = null;

        EObject this_Postcondition_1 = null;



        	enterRule();

        try {
            // InternalUSE.g:2082:2: ( (this_Precondition_0= rulePrecondition | this_Postcondition_1= rulePostcondition ) )
            // InternalUSE.g:2083:2: (this_Precondition_0= rulePrecondition | this_Postcondition_1= rulePostcondition )
            {
            // InternalUSE.g:2083:2: (this_Precondition_0= rulePrecondition | this_Postcondition_1= rulePostcondition )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==56) ) {
                alt53=1;
            }
            else if ( (LA53_0==57) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalUSE.g:2084:3: this_Precondition_0= rulePrecondition
                    {

                    			newCompositeNode(grammarAccess.getConditionTypeAccess().getPreconditionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Precondition_0=rulePrecondition();

                    state._fsp--;


                    			current = this_Precondition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUSE.g:2093:3: this_Postcondition_1= rulePostcondition
                    {

                    			newCompositeNode(grammarAccess.getConditionTypeAccess().getPostconditionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Postcondition_1=rulePostcondition();

                    state._fsp--;


                    			current = this_Postcondition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalUSE.g:2105:1: entryRulePrecondition returns [EObject current=null] : iv_rulePrecondition= rulePrecondition EOF ;
    public final EObject entryRulePrecondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecondition = null;


        try {
            // InternalUSE.g:2105:53: (iv_rulePrecondition= rulePrecondition EOF )
            // InternalUSE.g:2106:2: iv_rulePrecondition= rulePrecondition EOF
            {
             newCompositeNode(grammarAccess.getPreconditionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrecondition=rulePrecondition();

            state._fsp--;

             current =iv_rulePrecondition; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUSE.g:2112:1: rulePrecondition returns [EObject current=null] : (otherlv_0= 'pre' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) ) ) ;
    public final EObject rulePrecondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_oclexpression_3_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:2118:2: ( (otherlv_0= 'pre' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) ) ) )
            // InternalUSE.g:2119:2: (otherlv_0= 'pre' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) ) )
            {
            // InternalUSE.g:2119:2: (otherlv_0= 'pre' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) ) )
            // InternalUSE.g:2120:3: otherlv_0= 'pre' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_41); 

            			newLeafNode(otherlv_0, grammarAccess.getPreconditionAccess().getPreKeyword_0());
            		
            // InternalUSE.g:2124:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalUSE.g:2125:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalUSE.g:2125:4: (lv_name_1_0= RULE_ID )
                    // InternalUSE.g:2126:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_29); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getPreconditionAccess().getNameIDTerminalRuleCall_1_0());
                    				

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
                    break;

            }

            otherlv_2=(Token)match(input,46,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getPreconditionAccess().getColonKeyword_2());
            		
            // InternalUSE.g:2146:3: ( (lv_oclexpression_3_0= ruleOCLExpression ) )
            // InternalUSE.g:2147:4: (lv_oclexpression_3_0= ruleOCLExpression )
            {
            // InternalUSE.g:2147:4: (lv_oclexpression_3_0= ruleOCLExpression )
            // InternalUSE.g:2148:5: lv_oclexpression_3_0= ruleOCLExpression
            {

            					newCompositeNode(grammarAccess.getPreconditionAccess().getOclexpressionOCLExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_oclexpression_3_0=ruleOCLExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreconditionRule());
            					}
            					set(
            						current,
            						"oclexpression",
            						lv_oclexpression_3_0,
            						"modelConverter.use_language.USE.OCLExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalUSE.g:2169:1: entryRulePostcondition returns [EObject current=null] : iv_rulePostcondition= rulePostcondition EOF ;
    public final EObject entryRulePostcondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostcondition = null;


        try {
            // InternalUSE.g:2169:54: (iv_rulePostcondition= rulePostcondition EOF )
            // InternalUSE.g:2170:2: iv_rulePostcondition= rulePostcondition EOF
            {
             newCompositeNode(grammarAccess.getPostconditionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePostcondition=rulePostcondition();

            state._fsp--;

             current =iv_rulePostcondition; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalUSE.g:2176:1: rulePostcondition returns [EObject current=null] : (otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) ) ) ;
    public final EObject rulePostcondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_oclexpression_3_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:2182:2: ( (otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) ) ) )
            // InternalUSE.g:2183:2: (otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) ) )
            {
            // InternalUSE.g:2183:2: (otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) ) )
            // InternalUSE.g:2184:3: otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_41); 

            			newLeafNode(otherlv_0, grammarAccess.getPostconditionAccess().getPostKeyword_0());
            		
            // InternalUSE.g:2188:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalUSE.g:2189:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalUSE.g:2189:4: (lv_name_1_0= RULE_ID )
                    // InternalUSE.g:2190:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_29); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getPostconditionAccess().getNameIDTerminalRuleCall_1_0());
                    				

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
                    break;

            }

            otherlv_2=(Token)match(input,46,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getPostconditionAccess().getColonKeyword_2());
            		
            // InternalUSE.g:2210:3: ( (lv_oclexpression_3_0= ruleOCLExpression ) )
            // InternalUSE.g:2211:4: (lv_oclexpression_3_0= ruleOCLExpression )
            {
            // InternalUSE.g:2211:4: (lv_oclexpression_3_0= ruleOCLExpression )
            // InternalUSE.g:2212:5: lv_oclexpression_3_0= ruleOCLExpression
            {

            					newCompositeNode(grammarAccess.getPostconditionAccess().getOclexpressionOCLExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_oclexpression_3_0=ruleOCLExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPostconditionRule());
            					}
            					set(
            						current,
            						"oclexpression",
            						lv_oclexpression_3_0,
            						"modelConverter.use_language.USE.OCLExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleOCLExpression"
    // InternalUSE.g:2233:1: entryRuleOCLExpression returns [String current=null] : iv_ruleOCLExpression= ruleOCLExpression EOF ;
    public final String entryRuleOCLExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOCLExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalUSE.g:2235:2: (iv_ruleOCLExpression= ruleOCLExpression EOF )
            // InternalUSE.g:2236:2: iv_ruleOCLExpression= ruleOCLExpression EOF
            {
             newCompositeNode(grammarAccess.getOCLExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOCLExpression=ruleOCLExpression();

            state._fsp--;

             current =iv_ruleOCLExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleOCLExpression"


    // $ANTLR start "ruleOCLExpression"
    // InternalUSE.g:2245:1: ruleOCLExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleOCLExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalUSE.g:2252:2: (this_STRING_0= RULE_STRING )
            // InternalUSE.g:2253:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getOCLExpressionAccess().getSTRINGTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleOCLExpression"

    // Delegated rules


    protected DFA38 dfa38 = new DFA38(this);
    static final String dfa_1s = "\24\uffff";
    static final String dfa_2s = "\4\uffff\1\10\11\uffff\5\10\1\uffff";
    static final String dfa_3s = "\1\4\1\62\1\4\1\56\3\4\2\uffff\13\4";
    static final String dfa_4s = "\1\4\1\62\1\63\1\56\1\71\2\34\2\uffff\5\63\5\71\1\63";
    static final String dfa_5s = "\7\uffff\1\2\1\1\13\uffff";
    static final String dfa_6s = "\24\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2",
            "\1\3\56\uffff\1\4",
            "\1\5",
            "\1\10\36\uffff\1\10\12\uffff\1\6\1\uffff\1\7\1\10\2\uffff\1\10\3\uffff\2\10",
            "\1\15\24\uffff\1\11\1\12\1\13\1\14",
            "\1\22\24\uffff\1\16\1\17\1\20\1\21",
            "",
            "",
            "\1\3\11\uffff\1\23\44\uffff\1\4",
            "\1\3\11\uffff\1\23\44\uffff\1\4",
            "\1\3\11\uffff\1\23\44\uffff\1\4",
            "\1\3\11\uffff\1\23\44\uffff\1\4",
            "\1\3\11\uffff\1\23\44\uffff\1\4",
            "\1\10\36\uffff\1\10\14\uffff\1\7\1\10\2\uffff\1\10\3\uffff\2\10",
            "\1\10\36\uffff\1\10\14\uffff\1\7\1\10\2\uffff\1\10\3\uffff\2\10",
            "\1\10\36\uffff\1\10\14\uffff\1\7\1\10\2\uffff\1\10\3\uffff\2\10",
            "\1\10\36\uffff\1\10\14\uffff\1\7\1\10\2\uffff\1\10\3\uffff\2\10",
            "\1\10\36\uffff\1\10\14\uffff\1\7\1\10\2\uffff\1\10\3\uffff\2\10",
            "\1\3\56\uffff\1\4"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1347:2: (this_OperationComplex_0= ruleOperationComplex | this_OperationQuery_1= ruleOperationQuery )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0010107320000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0010107300000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001FF9000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001FF8002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0010A00C00000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0010A00800000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0010800800000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0010000800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000001E000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0302000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800000020L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0008000000000010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0300000000000000L});

}