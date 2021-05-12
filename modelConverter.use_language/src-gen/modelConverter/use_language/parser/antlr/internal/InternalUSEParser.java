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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_INT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'*'", "'..'", "','", "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "'Integer'", "'String'", "'Real'", "'Boolean'", "'Set'", "'Bag'", "'Sequence'", "'('", "')'", "'enum'", "'{'", "'}'", "'abstract'", "'class'", "'<'", "'end'", "'association'", "'aggregation'", "'composition'", "'between'", "'['", "']'", "'role'", "'ordered'", "'associationclass'", "'attributes'", "':'", "'operations'", "'='", "'begin'", "'constraints'", "'context'", "'inv'", "'::'", "'pre'", "'post'"
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

                if ( (LA1_0==34) ) {
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

                if ( ((LA2_0>=37 && LA2_0<=38)||(LA2_0>=41 && LA2_0<=43)||LA2_0==49) ) {
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

            if ( (LA3_0==55) ) {
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


    // $ANTLR start "entryRuleAllTypes"
    // InternalUSE.g:449:1: entryRuleAllTypes returns [EObject current=null] : iv_ruleAllTypes= ruleAllTypes EOF ;
    public final EObject entryRuleAllTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllTypes = null;


        try {
            // InternalUSE.g:449:49: (iv_ruleAllTypes= ruleAllTypes EOF )
            // InternalUSE.g:450:2: iv_ruleAllTypes= ruleAllTypes EOF
            {
             newCompositeNode(grammarAccess.getAllTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllTypes=ruleAllTypes();

            state._fsp--;

             current =iv_ruleAllTypes; 
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
    // $ANTLR end "entryRuleAllTypes"


    // $ANTLR start "ruleAllTypes"
    // InternalUSE.g:456:1: ruleAllTypes returns [EObject current=null] : (this_CollectionType_0= ruleCollectionType | this_SimpleTypes_1= ruleSimpleTypes ) ;
    public final EObject ruleAllTypes() throws RecognitionException {
        EObject current = null;

        EObject this_CollectionType_0 = null;

        EObject this_SimpleTypes_1 = null;



        	enterRule();

        try {
            // InternalUSE.g:462:2: ( (this_CollectionType_0= ruleCollectionType | this_SimpleTypes_1= ruleSimpleTypes ) )
            // InternalUSE.g:463:2: (this_CollectionType_0= ruleCollectionType | this_SimpleTypes_1= ruleSimpleTypes )
            {
            // InternalUSE.g:463:2: (this_CollectionType_0= ruleCollectionType | this_SimpleTypes_1= ruleSimpleTypes )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=29 && LA13_0<=31)) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID||(LA13_0>=25 && LA13_0<=28)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalUSE.g:464:3: this_CollectionType_0= ruleCollectionType
                    {

                    			newCompositeNode(grammarAccess.getAllTypesAccess().getCollectionTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CollectionType_0=ruleCollectionType();

                    state._fsp--;


                    			current = this_CollectionType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUSE.g:473:3: this_SimpleTypes_1= ruleSimpleTypes
                    {

                    			newCompositeNode(grammarAccess.getAllTypesAccess().getSimpleTypesParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleTypes_1=ruleSimpleTypes();

                    state._fsp--;


                    			current = this_SimpleTypes_1;
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
    // $ANTLR end "ruleAllTypes"


    // $ANTLR start "entryRuleType"
    // InternalUSE.g:485:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalUSE.g:485:45: (iv_ruleType= ruleType EOF )
            // InternalUSE.g:486:2: iv_ruleType= ruleType EOF
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
    // InternalUSE.g:492:1: ruleType returns [EObject current=null] : (this_Class_0= ruleClass | this_Association_1= ruleAssociation | this_AssociationClass_2= ruleAssociationClass ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_Association_1 = null;

        EObject this_AssociationClass_2 = null;



        	enterRule();

        try {
            // InternalUSE.g:498:2: ( (this_Class_0= ruleClass | this_Association_1= ruleAssociation | this_AssociationClass_2= ruleAssociationClass ) )
            // InternalUSE.g:499:2: (this_Class_0= ruleClass | this_Association_1= ruleAssociation | this_AssociationClass_2= ruleAssociationClass )
            {
            // InternalUSE.g:499:2: (this_Class_0= ruleClass | this_Association_1= ruleAssociation | this_AssociationClass_2= ruleAssociationClass )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==49) ) {
                    alt14=3;
                }
                else if ( (LA14_1==38) ) {
                    alt14=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
                }
                break;
            case 38:
                {
                alt14=1;
                }
                break;
            case 41:
            case 42:
            case 43:
                {
                alt14=2;
                }
                break;
            case 49:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalUSE.g:500:3: this_Class_0= ruleClass
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
                    // InternalUSE.g:509:3: this_Association_1= ruleAssociation
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
                    // InternalUSE.g:518:3: this_AssociationClass_2= ruleAssociationClass
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


    // $ANTLR start "entryRuleCollectionType"
    // InternalUSE.g:530:1: entryRuleCollectionType returns [EObject current=null] : iv_ruleCollectionType= ruleCollectionType EOF ;
    public final EObject entryRuleCollectionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionType = null;


        try {
            // InternalUSE.g:530:55: (iv_ruleCollectionType= ruleCollectionType EOF )
            // InternalUSE.g:531:2: iv_ruleCollectionType= ruleCollectionType EOF
            {
             newCompositeNode(grammarAccess.getCollectionTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollectionType=ruleCollectionType();

            state._fsp--;

             current =iv_ruleCollectionType; 
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
    // $ANTLR end "entryRuleCollectionType"


    // $ANTLR start "ruleCollectionType"
    // InternalUSE.g:537:1: ruleCollectionType returns [EObject current=null] : ( ( ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'Bag' | lv_collection_0_3= 'Sequence' ) ) ) otherlv_1= '(' ( (lv_type_2_0= ruleSimpleTypes ) )* otherlv_3= ')' ) ;
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
            // InternalUSE.g:543:2: ( ( ( ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'Bag' | lv_collection_0_3= 'Sequence' ) ) ) otherlv_1= '(' ( (lv_type_2_0= ruleSimpleTypes ) )* otherlv_3= ')' ) )
            // InternalUSE.g:544:2: ( ( ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'Bag' | lv_collection_0_3= 'Sequence' ) ) ) otherlv_1= '(' ( (lv_type_2_0= ruleSimpleTypes ) )* otherlv_3= ')' )
            {
            // InternalUSE.g:544:2: ( ( ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'Bag' | lv_collection_0_3= 'Sequence' ) ) ) otherlv_1= '(' ( (lv_type_2_0= ruleSimpleTypes ) )* otherlv_3= ')' )
            // InternalUSE.g:545:3: ( ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'Bag' | lv_collection_0_3= 'Sequence' ) ) ) otherlv_1= '(' ( (lv_type_2_0= ruleSimpleTypes ) )* otherlv_3= ')'
            {
            // InternalUSE.g:545:3: ( ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'Bag' | lv_collection_0_3= 'Sequence' ) ) )
            // InternalUSE.g:546:4: ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'Bag' | lv_collection_0_3= 'Sequence' ) )
            {
            // InternalUSE.g:546:4: ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'Bag' | lv_collection_0_3= 'Sequence' ) )
            // InternalUSE.g:547:5: (lv_collection_0_1= 'Set' | lv_collection_0_2= 'Bag' | lv_collection_0_3= 'Sequence' )
            {
            // InternalUSE.g:547:5: (lv_collection_0_1= 'Set' | lv_collection_0_2= 'Bag' | lv_collection_0_3= 'Sequence' )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt15=1;
                }
                break;
            case 30:
                {
                alt15=2;
                }
                break;
            case 31:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalUSE.g:548:6: lv_collection_0_1= 'Set'
                    {
                    lv_collection_0_1=(Token)match(input,29,FOLLOW_10); 

                    						newLeafNode(lv_collection_0_1, grammarAccess.getCollectionTypeAccess().getCollectionSetKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCollectionTypeRule());
                    						}
                    						setWithLastConsumed(current, "collection", lv_collection_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalUSE.g:559:6: lv_collection_0_2= 'Bag'
                    {
                    lv_collection_0_2=(Token)match(input,30,FOLLOW_10); 

                    						newLeafNode(lv_collection_0_2, grammarAccess.getCollectionTypeAccess().getCollectionBagKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCollectionTypeRule());
                    						}
                    						setWithLastConsumed(current, "collection", lv_collection_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalUSE.g:570:6: lv_collection_0_3= 'Sequence'
                    {
                    lv_collection_0_3=(Token)match(input,31,FOLLOW_10); 

                    						newLeafNode(lv_collection_0_3, grammarAccess.getCollectionTypeAccess().getCollectionSequenceKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCollectionTypeRule());
                    						}
                    						setWithLastConsumed(current, "collection", lv_collection_0_3, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getCollectionTypeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalUSE.g:587:3: ( (lv_type_2_0= ruleSimpleTypes ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||(LA16_0>=25 && LA16_0<=28)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalUSE.g:588:4: (lv_type_2_0= ruleSimpleTypes )
            	    {
            	    // InternalUSE.g:588:4: (lv_type_2_0= ruleSimpleTypes )
            	    // InternalUSE.g:589:5: lv_type_2_0= ruleSimpleTypes
            	    {

            	    					newCompositeNode(grammarAccess.getCollectionTypeAccess().getTypeSimpleTypesParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_type_2_0=ruleSimpleTypes();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_3=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCollectionTypeAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleCollectionType"


    // $ANTLR start "entryRuleAllClass"
    // InternalUSE.g:614:1: entryRuleAllClass returns [EObject current=null] : iv_ruleAllClass= ruleAllClass EOF ;
    public final EObject entryRuleAllClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllClass = null;


        try {
            // InternalUSE.g:614:49: (iv_ruleAllClass= ruleAllClass EOF )
            // InternalUSE.g:615:2: iv_ruleAllClass= ruleAllClass EOF
            {
             newCompositeNode(grammarAccess.getAllClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllClass=ruleAllClass();

            state._fsp--;

             current =iv_ruleAllClass; 
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
    // $ANTLR end "entryRuleAllClass"


    // $ANTLR start "ruleAllClass"
    // InternalUSE.g:621:1: ruleAllClass returns [EObject current=null] : (this_Class_0= ruleClass | this_AssociationClass_1= ruleAssociationClass ) ;
    public final EObject ruleAllClass() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_AssociationClass_1 = null;



        	enterRule();

        try {
            // InternalUSE.g:627:2: ( (this_Class_0= ruleClass | this_AssociationClass_1= ruleAssociationClass ) )
            // InternalUSE.g:628:2: (this_Class_0= ruleClass | this_AssociationClass_1= ruleAssociationClass )
            {
            // InternalUSE.g:628:2: (this_Class_0= ruleClass | this_AssociationClass_1= ruleAssociationClass )
            int alt17=2;
            switch ( input.LA(1) ) {
            case 37:
                {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==38) ) {
                    alt17=1;
                }
                else if ( (LA17_1==49) ) {
                    alt17=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
                }
                break;
            case 38:
                {
                alt17=1;
                }
                break;
            case 49:
                {
                alt17=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalUSE.g:629:3: this_Class_0= ruleClass
                    {

                    			newCompositeNode(grammarAccess.getAllClassAccess().getClassParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Class_0=ruleClass();

                    state._fsp--;


                    			current = this_Class_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUSE.g:638:3: this_AssociationClass_1= ruleAssociationClass
                    {

                    			newCompositeNode(grammarAccess.getAllClassAccess().getAssociationClassParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssociationClass_1=ruleAssociationClass();

                    state._fsp--;


                    			current = this_AssociationClass_1;
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
    // $ANTLR end "ruleAllClass"


    // $ANTLR start "entryRuleSimpleTypes"
    // InternalUSE.g:650:1: entryRuleSimpleTypes returns [EObject current=null] : iv_ruleSimpleTypes= ruleSimpleTypes EOF ;
    public final EObject entryRuleSimpleTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleTypes = null;


        try {
            // InternalUSE.g:650:52: (iv_ruleSimpleTypes= ruleSimpleTypes EOF )
            // InternalUSE.g:651:2: iv_ruleSimpleTypes= ruleSimpleTypes EOF
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
    // InternalUSE.g:657:1: ruleSimpleTypes returns [EObject current=null] : ( ( (lv_defaultType_0_0= ruleDefaultType ) ) | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleSimpleTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_defaultType_0_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:663:2: ( ( ( (lv_defaultType_0_0= ruleDefaultType ) ) | ( (otherlv_1= RULE_ID ) ) ) )
            // InternalUSE.g:664:2: ( ( (lv_defaultType_0_0= ruleDefaultType ) ) | ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalUSE.g:664:2: ( ( (lv_defaultType_0_0= ruleDefaultType ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=25 && LA18_0<=28)) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalUSE.g:665:3: ( (lv_defaultType_0_0= ruleDefaultType ) )
                    {
                    // InternalUSE.g:665:3: ( (lv_defaultType_0_0= ruleDefaultType ) )
                    // InternalUSE.g:666:4: (lv_defaultType_0_0= ruleDefaultType )
                    {
                    // InternalUSE.g:666:4: (lv_defaultType_0_0= ruleDefaultType )
                    // InternalUSE.g:667:5: lv_defaultType_0_0= ruleDefaultType
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
                    // InternalUSE.g:685:3: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalUSE.g:685:3: ( (otherlv_1= RULE_ID ) )
                    // InternalUSE.g:686:4: (otherlv_1= RULE_ID )
                    {
                    // InternalUSE.g:686:4: (otherlv_1= RULE_ID )
                    // InternalUSE.g:687:5: otherlv_1= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimpleTypesRule());
                    					}
                    				
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_1, grammarAccess.getSimpleTypesAccess().getReferendedAllClassAndEnumCrossReference_1_0());
                    				

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


    // $ANTLR start "entryRuleEnum"
    // InternalUSE.g:702:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // InternalUSE.g:702:45: (iv_ruleEnum= ruleEnum EOF )
            // InternalUSE.g:703:2: iv_ruleEnum= ruleEnum EOF
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
    // InternalUSE.g:709:1: ruleEnum returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )+ otherlv_4= '}' ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:715:2: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )+ otherlv_4= '}' ) )
            // InternalUSE.g:716:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )+ otherlv_4= '}' )
            {
            // InternalUSE.g:716:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )+ otherlv_4= '}' )
            // InternalUSE.g:717:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
            		
            // InternalUSE.g:721:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUSE.g:722:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalUSE.g:722:4: (lv_name_1_0= RULE_ID )
                    // InternalUSE.g:723:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            otherlv_2=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUSE.g:743:3: ( (lv_elements_3_0= ruleEnumElement ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalUSE.g:744:4: (lv_elements_3_0= ruleEnumElement )
            	    {
            	    // InternalUSE.g:744:4: (lv_elements_3_0= ruleEnumElement )
            	    // InternalUSE.g:745:5: lv_elements_3_0= ruleEnumElement
            	    {

            	    					newCompositeNode(grammarAccess.getEnumAccess().getElementsEnumElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_14);
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
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            otherlv_4=(Token)match(input,36,FOLLOW_2); 

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
    // InternalUSE.g:770:1: entryRuleEnumElement returns [String current=null] : iv_ruleEnumElement= ruleEnumElement EOF ;
    public final String entryRuleEnumElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnumElement = null;


        try {
            // InternalUSE.g:770:51: (iv_ruleEnumElement= ruleEnumElement EOF )
            // InternalUSE.g:771:2: iv_ruleEnumElement= ruleEnumElement EOF
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
    // InternalUSE.g:777:1: ruleEnumElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= ',' )? ) ;
    public final AntlrDatatypeRuleToken ruleEnumElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalUSE.g:783:2: ( (this_ID_0= RULE_ID (kw= ',' )? ) )
            // InternalUSE.g:784:2: (this_ID_0= RULE_ID (kw= ',' )? )
            {
            // InternalUSE.g:784:2: (this_ID_0= RULE_ID (kw= ',' )? )
            // InternalUSE.g:785:3: this_ID_0= RULE_ID (kw= ',' )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getEnumElementAccess().getIDTerminalRuleCall_0());
            		
            // InternalUSE.g:792:3: (kw= ',' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==14) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUSE.g:793:4: kw= ','
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
    // InternalUSE.g:803:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalUSE.g:803:46: (iv_ruleClass= ruleClass EOF )
            // InternalUSE.g:804:2: iv_ruleClass= ruleClass EOF
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
    // InternalUSE.g:810:1: ruleClass returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? ( (lv_attributes_5_0= ruleAttributesBase ) )? ( (lv_operations_6_0= ruleOperationsBase ) )? ( (lv_constraints_7_0= ruleConstraintsBase ) )? otherlv_8= 'end' ) ;
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
            // InternalUSE.g:816:2: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? ( (lv_attributes_5_0= ruleAttributesBase ) )? ( (lv_operations_6_0= ruleOperationsBase ) )? ( (lv_constraints_7_0= ruleConstraintsBase ) )? otherlv_8= 'end' ) )
            // InternalUSE.g:817:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? ( (lv_attributes_5_0= ruleAttributesBase ) )? ( (lv_operations_6_0= ruleOperationsBase ) )? ( (lv_constraints_7_0= ruleConstraintsBase ) )? otherlv_8= 'end' )
            {
            // InternalUSE.g:817:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? ( (lv_attributes_5_0= ruleAttributesBase ) )? ( (lv_operations_6_0= ruleOperationsBase ) )? ( (lv_constraints_7_0= ruleConstraintsBase ) )? otherlv_8= 'end' )
            // InternalUSE.g:818:3: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? ( (lv_attributes_5_0= ruleAttributesBase ) )? ( (lv_operations_6_0= ruleOperationsBase ) )? ( (lv_constraints_7_0= ruleConstraintsBase ) )? otherlv_8= 'end'
            {
            // InternalUSE.g:818:3: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUSE.g:819:4: (lv_abstract_0_0= 'abstract' )
                    {
                    // InternalUSE.g:819:4: (lv_abstract_0_0= 'abstract' )
                    // InternalUSE.g:820:5: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,37,FOLLOW_15); 

                    					newLeafNode(lv_abstract_0_0, grammarAccess.getClassAccess().getAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassRule());
                    					}
                    					setWithLastConsumed(current, "abstract", lv_abstract_0_0 != null, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
            		
            // InternalUSE.g:836:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUSE.g:837:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUSE.g:837:4: (lv_name_2_0= RULE_ID )
            // InternalUSE.g:838:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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

            // InternalUSE.g:854:3: (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==39) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUSE.g:855:4: otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getClassAccess().getLessThanSignKeyword_3_0());
                    			
                    // InternalUSE.g:859:4: ( (lv_generalization_4_0= ruleGeneralization ) )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==RULE_ID) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalUSE.g:860:5: (lv_generalization_4_0= ruleGeneralization )
                    	    {
                    	    // InternalUSE.g:860:5: (lv_generalization_4_0= ruleGeneralization )
                    	    // InternalUSE.g:861:6: lv_generalization_4_0= ruleGeneralization
                    	    {

                    	    						newCompositeNode(grammarAccess.getClassAccess().getGeneralizationGeneralizationParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
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
                    	    if ( cnt23 >= 1 ) break loop23;
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);


                    }
                    break;

            }

            // InternalUSE.g:879:3: ( (lv_attributes_5_0= ruleAttributesBase ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==50) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUSE.g:880:4: (lv_attributes_5_0= ruleAttributesBase )
                    {
                    // InternalUSE.g:880:4: (lv_attributes_5_0= ruleAttributesBase )
                    // InternalUSE.g:881:5: lv_attributes_5_0= ruleAttributesBase
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributesBaseParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_18);
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

            // InternalUSE.g:898:3: ( (lv_operations_6_0= ruleOperationsBase ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==52) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalUSE.g:899:4: (lv_operations_6_0= ruleOperationsBase )
                    {
                    // InternalUSE.g:899:4: (lv_operations_6_0= ruleOperationsBase )
                    // InternalUSE.g:900:5: lv_operations_6_0= ruleOperationsBase
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getOperationsOperationsBaseParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_19);
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

            // InternalUSE.g:917:3: ( (lv_constraints_7_0= ruleConstraintsBase ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==55) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUSE.g:918:4: (lv_constraints_7_0= ruleConstraintsBase )
                    {
                    // InternalUSE.g:918:4: (lv_constraints_7_0= ruleConstraintsBase )
                    // InternalUSE.g:919:5: lv_constraints_7_0= ruleConstraintsBase
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getConstraintsConstraintsBaseParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_20);
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

            otherlv_8=(Token)match(input,40,FOLLOW_2); 

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
    // InternalUSE.g:944:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalUSE.g:944:55: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalUSE.g:945:2: iv_ruleGeneralization= ruleGeneralization EOF
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
    // InternalUSE.g:951:1: ruleGeneralization returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUSE.g:957:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? ) )
            // InternalUSE.g:958:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? )
            {
            // InternalUSE.g:958:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? )
            // InternalUSE.g:959:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )?
            {
            // InternalUSE.g:959:3: ( (otherlv_0= RULE_ID ) )
            // InternalUSE.g:960:4: (otherlv_0= RULE_ID )
            {
            // InternalUSE.g:960:4: (otherlv_0= RULE_ID )
            // InternalUSE.g:961:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getGeneralizationAccess().getGeneralAllClassCrossReference_0_0());
            				

            }


            }

            // InternalUSE.g:972:3: (otherlv_1= ',' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==14) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalUSE.g:973:4: otherlv_1= ','
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


    // $ANTLR start "entryRuleAssociation"
    // InternalUSE.g:982:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalUSE.g:982:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalUSE.g:983:2: iv_ruleAssociation= ruleAssociation EOF
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
    // InternalUSE.g:989:1: ruleAssociation returns [EObject current=null] : ( ( ( (lv_typeAssociation_0_1= 'association' | lv_typeAssociation_0_2= 'aggregation' | lv_typeAssociation_0_3= 'composition' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_associationEnds_3_0= ruleAssociationEnd ) )+ otherlv_4= 'end' ) ;
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
            // InternalUSE.g:995:2: ( ( ( ( (lv_typeAssociation_0_1= 'association' | lv_typeAssociation_0_2= 'aggregation' | lv_typeAssociation_0_3= 'composition' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_associationEnds_3_0= ruleAssociationEnd ) )+ otherlv_4= 'end' ) )
            // InternalUSE.g:996:2: ( ( ( (lv_typeAssociation_0_1= 'association' | lv_typeAssociation_0_2= 'aggregation' | lv_typeAssociation_0_3= 'composition' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_associationEnds_3_0= ruleAssociationEnd ) )+ otherlv_4= 'end' )
            {
            // InternalUSE.g:996:2: ( ( ( (lv_typeAssociation_0_1= 'association' | lv_typeAssociation_0_2= 'aggregation' | lv_typeAssociation_0_3= 'composition' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_associationEnds_3_0= ruleAssociationEnd ) )+ otherlv_4= 'end' )
            // InternalUSE.g:997:3: ( ( (lv_typeAssociation_0_1= 'association' | lv_typeAssociation_0_2= 'aggregation' | lv_typeAssociation_0_3= 'composition' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_associationEnds_3_0= ruleAssociationEnd ) )+ otherlv_4= 'end'
            {
            // InternalUSE.g:997:3: ( ( (lv_typeAssociation_0_1= 'association' | lv_typeAssociation_0_2= 'aggregation' | lv_typeAssociation_0_3= 'composition' ) ) )
            // InternalUSE.g:998:4: ( (lv_typeAssociation_0_1= 'association' | lv_typeAssociation_0_2= 'aggregation' | lv_typeAssociation_0_3= 'composition' ) )
            {
            // InternalUSE.g:998:4: ( (lv_typeAssociation_0_1= 'association' | lv_typeAssociation_0_2= 'aggregation' | lv_typeAssociation_0_3= 'composition' ) )
            // InternalUSE.g:999:5: (lv_typeAssociation_0_1= 'association' | lv_typeAssociation_0_2= 'aggregation' | lv_typeAssociation_0_3= 'composition' )
            {
            // InternalUSE.g:999:5: (lv_typeAssociation_0_1= 'association' | lv_typeAssociation_0_2= 'aggregation' | lv_typeAssociation_0_3= 'composition' )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt29=1;
                }
                break;
            case 42:
                {
                alt29=2;
                }
                break;
            case 43:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalUSE.g:1000:6: lv_typeAssociation_0_1= 'association'
                    {
                    lv_typeAssociation_0_1=(Token)match(input,41,FOLLOW_3); 

                    						newLeafNode(lv_typeAssociation_0_1, grammarAccess.getAssociationAccess().getTypeAssociationAssociationKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssociationRule());
                    						}
                    						setWithLastConsumed(current, "typeAssociation", lv_typeAssociation_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalUSE.g:1011:6: lv_typeAssociation_0_2= 'aggregation'
                    {
                    lv_typeAssociation_0_2=(Token)match(input,42,FOLLOW_3); 

                    						newLeafNode(lv_typeAssociation_0_2, grammarAccess.getAssociationAccess().getTypeAssociationAggregationKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssociationRule());
                    						}
                    						setWithLastConsumed(current, "typeAssociation", lv_typeAssociation_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalUSE.g:1022:6: lv_typeAssociation_0_3= 'composition'
                    {
                    lv_typeAssociation_0_3=(Token)match(input,43,FOLLOW_3); 

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

            // InternalUSE.g:1035:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUSE.g:1036:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUSE.g:1036:4: (lv_name_1_0= RULE_ID )
            // InternalUSE.g:1037:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 

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

            otherlv_2=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAssociationAccess().getBetweenKeyword_2());
            		
            // InternalUSE.g:1057:3: ( (lv_associationEnds_3_0= ruleAssociationEnd ) )+
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
            	    // InternalUSE.g:1058:4: (lv_associationEnds_3_0= ruleAssociationEnd )
            	    {
            	    // InternalUSE.g:1058:4: (lv_associationEnds_3_0= ruleAssociationEnd )
            	    // InternalUSE.g:1059:5: lv_associationEnds_3_0= ruleAssociationEnd
            	    {

            	    					newCompositeNode(grammarAccess.getAssociationAccess().getAssociationEndsAssociationEndParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_22);
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
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            otherlv_4=(Token)match(input,40,FOLLOW_2); 

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
    // InternalUSE.g:1084:1: entryRuleAssociationEnd returns [EObject current=null] : iv_ruleAssociationEnd= ruleAssociationEnd EOF ;
    public final EObject entryRuleAssociationEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationEnd = null;


        try {
            // InternalUSE.g:1084:55: (iv_ruleAssociationEnd= ruleAssociationEnd EOF )
            // InternalUSE.g:1085:2: iv_ruleAssociationEnd= ruleAssociationEnd EOF
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
    // InternalUSE.g:1091:1: ruleAssociationEnd returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_mul_2_0= ruleMultiplicity ) ) otherlv_3= ']' (otherlv_4= 'role' ( (lv_role_5_0= RULE_ID ) ) )? ( (lv_ordered_6_0= 'ordered' ) )? ) ;
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
            // InternalUSE.g:1097:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_mul_2_0= ruleMultiplicity ) ) otherlv_3= ']' (otherlv_4= 'role' ( (lv_role_5_0= RULE_ID ) ) )? ( (lv_ordered_6_0= 'ordered' ) )? ) )
            // InternalUSE.g:1098:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_mul_2_0= ruleMultiplicity ) ) otherlv_3= ']' (otherlv_4= 'role' ( (lv_role_5_0= RULE_ID ) ) )? ( (lv_ordered_6_0= 'ordered' ) )? )
            {
            // InternalUSE.g:1098:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_mul_2_0= ruleMultiplicity ) ) otherlv_3= ']' (otherlv_4= 'role' ( (lv_role_5_0= RULE_ID ) ) )? ( (lv_ordered_6_0= 'ordered' ) )? )
            // InternalUSE.g:1099:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_mul_2_0= ruleMultiplicity ) ) otherlv_3= ']' (otherlv_4= 'role' ( (lv_role_5_0= RULE_ID ) ) )? ( (lv_ordered_6_0= 'ordered' ) )?
            {
            // InternalUSE.g:1099:3: ( (otherlv_0= RULE_ID ) )
            // InternalUSE.g:1100:4: (otherlv_0= RULE_ID )
            {
            // InternalUSE.g:1100:4: (otherlv_0= RULE_ID )
            // InternalUSE.g:1101:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationEndRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_0, grammarAccess.getAssociationEndAccess().getTypeAllClassCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,45,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationEndAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalUSE.g:1116:3: ( (lv_mul_2_0= ruleMultiplicity ) )
            // InternalUSE.g:1117:4: (lv_mul_2_0= ruleMultiplicity )
            {
            // InternalUSE.g:1117:4: (lv_mul_2_0= ruleMultiplicity )
            // InternalUSE.g:1118:5: lv_mul_2_0= ruleMultiplicity
            {

            					newCompositeNode(grammarAccess.getAssociationEndAccess().getMulMultiplicityParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
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

            otherlv_3=(Token)match(input,46,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getAssociationEndAccess().getRightSquareBracketKeyword_3());
            		
            // InternalUSE.g:1139:3: (otherlv_4= 'role' ( (lv_role_5_0= RULE_ID ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==47) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUSE.g:1140:4: otherlv_4= 'role' ( (lv_role_5_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,47,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getAssociationEndAccess().getRoleKeyword_4_0());
                    			
                    // InternalUSE.g:1144:4: ( (lv_role_5_0= RULE_ID ) )
                    // InternalUSE.g:1145:5: (lv_role_5_0= RULE_ID )
                    {
                    // InternalUSE.g:1145:5: (lv_role_5_0= RULE_ID )
                    // InternalUSE.g:1146:6: lv_role_5_0= RULE_ID
                    {
                    lv_role_5_0=(Token)match(input,RULE_ID,FOLLOW_26); 

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

            // InternalUSE.g:1163:3: ( (lv_ordered_6_0= 'ordered' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==48) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalUSE.g:1164:4: (lv_ordered_6_0= 'ordered' )
                    {
                    // InternalUSE.g:1164:4: (lv_ordered_6_0= 'ordered' )
                    // InternalUSE.g:1165:5: lv_ordered_6_0= 'ordered'
                    {
                    lv_ordered_6_0=(Token)match(input,48,FOLLOW_2); 

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
    // InternalUSE.g:1181:1: entryRuleAssociationClass returns [EObject current=null] : iv_ruleAssociationClass= ruleAssociationClass EOF ;
    public final EObject entryRuleAssociationClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationClass = null;


        try {
            // InternalUSE.g:1181:57: (iv_ruleAssociationClass= ruleAssociationClass EOF )
            // InternalUSE.g:1182:2: iv_ruleAssociationClass= ruleAssociationClass EOF
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
    // InternalUSE.g:1188:1: ruleAssociationClass returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'associationclass' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? otherlv_5= 'between' ( (lv_associationEnds_6_0= ruleAssociationEnd ) )+ ( (lv_attributes_7_0= ruleAttributesBase ) )? ( (lv_operations_8_0= ruleOperationsBase ) )? ( (lv_constraints_9_0= ruleConstraintsBase ) )? otherlv_10= 'end' ) ;
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
            // InternalUSE.g:1194:2: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'associationclass' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? otherlv_5= 'between' ( (lv_associationEnds_6_0= ruleAssociationEnd ) )+ ( (lv_attributes_7_0= ruleAttributesBase ) )? ( (lv_operations_8_0= ruleOperationsBase ) )? ( (lv_constraints_9_0= ruleConstraintsBase ) )? otherlv_10= 'end' ) )
            // InternalUSE.g:1195:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'associationclass' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? otherlv_5= 'between' ( (lv_associationEnds_6_0= ruleAssociationEnd ) )+ ( (lv_attributes_7_0= ruleAttributesBase ) )? ( (lv_operations_8_0= ruleOperationsBase ) )? ( (lv_constraints_9_0= ruleConstraintsBase ) )? otherlv_10= 'end' )
            {
            // InternalUSE.g:1195:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'associationclass' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? otherlv_5= 'between' ( (lv_associationEnds_6_0= ruleAssociationEnd ) )+ ( (lv_attributes_7_0= ruleAttributesBase ) )? ( (lv_operations_8_0= ruleOperationsBase ) )? ( (lv_constraints_9_0= ruleConstraintsBase ) )? otherlv_10= 'end' )
            // InternalUSE.g:1196:3: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'associationclass' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? otherlv_5= 'between' ( (lv_associationEnds_6_0= ruleAssociationEnd ) )+ ( (lv_attributes_7_0= ruleAttributesBase ) )? ( (lv_operations_8_0= ruleOperationsBase ) )? ( (lv_constraints_9_0= ruleConstraintsBase ) )? otherlv_10= 'end'
            {
            // InternalUSE.g:1196:3: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==37) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalUSE.g:1197:4: (lv_abstract_0_0= 'abstract' )
                    {
                    // InternalUSE.g:1197:4: (lv_abstract_0_0= 'abstract' )
                    // InternalUSE.g:1198:5: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,37,FOLLOW_27); 

                    					newLeafNode(lv_abstract_0_0, grammarAccess.getAssociationClassAccess().getAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAssociationClassRule());
                    					}
                    					setWithLastConsumed(current, "abstract", lv_abstract_0_0 != null, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationClassAccess().getAssociationclassKeyword_1());
            		
            // InternalUSE.g:1214:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUSE.g:1215:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUSE.g:1215:4: (lv_name_2_0= RULE_ID )
            // InternalUSE.g:1216:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_28); 

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

            // InternalUSE.g:1232:3: (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==39) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalUSE.g:1233:4: otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getAssociationClassAccess().getLessThanSignKeyword_3_0());
                    			
                    // InternalUSE.g:1237:4: ( (lv_generalization_4_0= ruleGeneralization ) )+
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
                    	    // InternalUSE.g:1238:5: (lv_generalization_4_0= ruleGeneralization )
                    	    {
                    	    // InternalUSE.g:1238:5: (lv_generalization_4_0= ruleGeneralization )
                    	    // InternalUSE.g:1239:6: lv_generalization_4_0= ruleGeneralization
                    	    {

                    	    						newCompositeNode(grammarAccess.getAssociationClassAccess().getGeneralizationGeneralizationParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_29);
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
                    	    if ( cnt34 >= 1 ) break loop34;
                                EarlyExitException eee =
                                    new EarlyExitException(34, input);
                                throw eee;
                        }
                        cnt34++;
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getAssociationClassAccess().getBetweenKeyword_4());
            		
            // InternalUSE.g:1261:3: ( (lv_associationEnds_6_0= ruleAssociationEnd ) )+
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
            	    // InternalUSE.g:1262:4: (lv_associationEnds_6_0= ruleAssociationEnd )
            	    {
            	    // InternalUSE.g:1262:4: (lv_associationEnds_6_0= ruleAssociationEnd )
            	    // InternalUSE.g:1263:5: lv_associationEnds_6_0= ruleAssociationEnd
            	    {

            	    					newCompositeNode(grammarAccess.getAssociationClassAccess().getAssociationEndsAssociationEndParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_17);
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
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);

            // InternalUSE.g:1280:3: ( (lv_attributes_7_0= ruleAttributesBase ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==50) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalUSE.g:1281:4: (lv_attributes_7_0= ruleAttributesBase )
                    {
                    // InternalUSE.g:1281:4: (lv_attributes_7_0= ruleAttributesBase )
                    // InternalUSE.g:1282:5: lv_attributes_7_0= ruleAttributesBase
                    {

                    					newCompositeNode(grammarAccess.getAssociationClassAccess().getAttributesAttributesBaseParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_18);
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

            // InternalUSE.g:1299:3: ( (lv_operations_8_0= ruleOperationsBase ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==52) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalUSE.g:1300:4: (lv_operations_8_0= ruleOperationsBase )
                    {
                    // InternalUSE.g:1300:4: (lv_operations_8_0= ruleOperationsBase )
                    // InternalUSE.g:1301:5: lv_operations_8_0= ruleOperationsBase
                    {

                    					newCompositeNode(grammarAccess.getAssociationClassAccess().getOperationsOperationsBaseParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_19);
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

            // InternalUSE.g:1318:3: ( (lv_constraints_9_0= ruleConstraintsBase ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==55) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalUSE.g:1319:4: (lv_constraints_9_0= ruleConstraintsBase )
                    {
                    // InternalUSE.g:1319:4: (lv_constraints_9_0= ruleConstraintsBase )
                    // InternalUSE.g:1320:5: lv_constraints_9_0= ruleConstraintsBase
                    {

                    					newCompositeNode(grammarAccess.getAssociationClassAccess().getConstraintsConstraintsBaseParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_20);
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

            otherlv_10=(Token)match(input,40,FOLLOW_2); 

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
    // InternalUSE.g:1345:1: entryRuleAttributesBase returns [EObject current=null] : iv_ruleAttributesBase= ruleAttributesBase EOF ;
    public final EObject entryRuleAttributesBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributesBase = null;


        try {
            // InternalUSE.g:1345:55: (iv_ruleAttributesBase= ruleAttributesBase EOF )
            // InternalUSE.g:1346:2: iv_ruleAttributesBase= ruleAttributesBase EOF
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
    // InternalUSE.g:1352:1: ruleAttributesBase returns [EObject current=null] : (otherlv_0= 'attributes' ( (lv_attributes_1_0= ruleAttribute ) )* ) ;
    public final EObject ruleAttributesBase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_attributes_1_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1358:2: ( (otherlv_0= 'attributes' ( (lv_attributes_1_0= ruleAttribute ) )* ) )
            // InternalUSE.g:1359:2: (otherlv_0= 'attributes' ( (lv_attributes_1_0= ruleAttribute ) )* )
            {
            // InternalUSE.g:1359:2: (otherlv_0= 'attributes' ( (lv_attributes_1_0= ruleAttribute ) )* )
            // InternalUSE.g:1360:3: otherlv_0= 'attributes' ( (lv_attributes_1_0= ruleAttribute ) )*
            {
            otherlv_0=(Token)match(input,50,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributesBaseAccess().getAttributesKeyword_0());
            		
            // InternalUSE.g:1364:3: ( (lv_attributes_1_0= ruleAttribute ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalUSE.g:1365:4: (lv_attributes_1_0= ruleAttribute )
            	    {
            	    // InternalUSE.g:1365:4: (lv_attributes_1_0= ruleAttribute )
            	    // InternalUSE.g:1366:5: lv_attributes_1_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getAttributesBaseAccess().getAttributesAttributeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_30);
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
            	    break loop40;
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
    // InternalUSE.g:1387:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalUSE.g:1387:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalUSE.g:1388:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalUSE.g:1394:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAllTypes ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1400:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAllTypes ) ) ) )
            // InternalUSE.g:1401:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAllTypes ) ) )
            {
            // InternalUSE.g:1401:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAllTypes ) ) )
            // InternalUSE.g:1402:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAllTypes ) )
            {
            // InternalUSE.g:1402:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUSE.g:1403:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUSE.g:1403:4: (lv_name_0_0= RULE_ID )
            // InternalUSE.g:1404:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_31); 

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

            otherlv_1=(Token)match(input,51,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
            		
            // InternalUSE.g:1424:3: ( (lv_type_2_0= ruleAllTypes ) )
            // InternalUSE.g:1425:4: (lv_type_2_0= ruleAllTypes )
            {
            // InternalUSE.g:1425:4: (lv_type_2_0= ruleAllTypes )
            // InternalUSE.g:1426:5: lv_type_2_0= ruleAllTypes
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeAllTypesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleAllTypes();

            state._fsp--;


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
    // InternalUSE.g:1447:1: entryRuleOperationsBase returns [EObject current=null] : iv_ruleOperationsBase= ruleOperationsBase EOF ;
    public final EObject entryRuleOperationsBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationsBase = null;


        try {
            // InternalUSE.g:1447:55: (iv_ruleOperationsBase= ruleOperationsBase EOF )
            // InternalUSE.g:1448:2: iv_ruleOperationsBase= ruleOperationsBase EOF
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
    // InternalUSE.g:1454:1: ruleOperationsBase returns [EObject current=null] : (otherlv_0= 'operations' ( (lv_operations_1_0= ruleOperationType ) )* ) ;
    public final EObject ruleOperationsBase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_operations_1_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1460:2: ( (otherlv_0= 'operations' ( (lv_operations_1_0= ruleOperationType ) )* ) )
            // InternalUSE.g:1461:2: (otherlv_0= 'operations' ( (lv_operations_1_0= ruleOperationType ) )* )
            {
            // InternalUSE.g:1461:2: (otherlv_0= 'operations' ( (lv_operations_1_0= ruleOperationType ) )* )
            // InternalUSE.g:1462:3: otherlv_0= 'operations' ( (lv_operations_1_0= ruleOperationType ) )*
            {
            otherlv_0=(Token)match(input,52,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationsBaseAccess().getOperationsKeyword_0());
            		
            // InternalUSE.g:1466:3: ( (lv_operations_1_0= ruleOperationType ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalUSE.g:1467:4: (lv_operations_1_0= ruleOperationType )
            	    {
            	    // InternalUSE.g:1467:4: (lv_operations_1_0= ruleOperationType )
            	    // InternalUSE.g:1468:5: lv_operations_1_0= ruleOperationType
            	    {

            	    					newCompositeNode(grammarAccess.getOperationsBaseAccess().getOperationsOperationTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_30);
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
            	    break loop41;
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
    // InternalUSE.g:1489:1: entryRuleOperationType returns [EObject current=null] : iv_ruleOperationType= ruleOperationType EOF ;
    public final EObject entryRuleOperationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationType = null;


        try {
            // InternalUSE.g:1489:54: (iv_ruleOperationType= ruleOperationType EOF )
            // InternalUSE.g:1490:2: iv_ruleOperationType= ruleOperationType EOF
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
    // InternalUSE.g:1496:1: ruleOperationType returns [EObject current=null] : (this_OperationComplex_0= ruleOperationComplex | this_OperationQuery_1= ruleOperationQuery ) ;
    public final EObject ruleOperationType() throws RecognitionException {
        EObject current = null;

        EObject this_OperationComplex_0 = null;

        EObject this_OperationQuery_1 = null;



        	enterRule();

        try {
            // InternalUSE.g:1502:2: ( (this_OperationComplex_0= ruleOperationComplex | this_OperationQuery_1= ruleOperationQuery ) )
            // InternalUSE.g:1503:2: (this_OperationComplex_0= ruleOperationComplex | this_OperationQuery_1= ruleOperationQuery )
            {
            // InternalUSE.g:1503:2: (this_OperationComplex_0= ruleOperationComplex | this_OperationQuery_1= ruleOperationQuery )
            int alt42=2;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // InternalUSE.g:1504:3: this_OperationComplex_0= ruleOperationComplex
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
                    // InternalUSE.g:1513:3: this_OperationQuery_1= ruleOperationQuery
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
    // InternalUSE.g:1525:1: entryRuleOperationQuery returns [EObject current=null] : iv_ruleOperationQuery= ruleOperationQuery EOF ;
    public final EObject entryRuleOperationQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationQuery = null;


        try {
            // InternalUSE.g:1525:55: (iv_ruleOperationQuery= ruleOperationQuery EOF )
            // InternalUSE.g:1526:2: iv_ruleOperationQuery= ruleOperationQuery EOF
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
    // InternalUSE.g:1532:1: ruleOperationQuery returns [EObject current=null] : ( ( (lv_operationDeclaration_0_0= ruleOperationDeclaration ) ) otherlv_1= '=' ( (lv_operationbody_2_0= ruleOCLExpression ) ) ( (lv_conditions_3_0= ruleConditionType ) )* ) ;
    public final EObject ruleOperationQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_operationDeclaration_0_0 = null;

        AntlrDatatypeRuleToken lv_operationbody_2_0 = null;

        EObject lv_conditions_3_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1538:2: ( ( ( (lv_operationDeclaration_0_0= ruleOperationDeclaration ) ) otherlv_1= '=' ( (lv_operationbody_2_0= ruleOCLExpression ) ) ( (lv_conditions_3_0= ruleConditionType ) )* ) )
            // InternalUSE.g:1539:2: ( ( (lv_operationDeclaration_0_0= ruleOperationDeclaration ) ) otherlv_1= '=' ( (lv_operationbody_2_0= ruleOCLExpression ) ) ( (lv_conditions_3_0= ruleConditionType ) )* )
            {
            // InternalUSE.g:1539:2: ( ( (lv_operationDeclaration_0_0= ruleOperationDeclaration ) ) otherlv_1= '=' ( (lv_operationbody_2_0= ruleOCLExpression ) ) ( (lv_conditions_3_0= ruleConditionType ) )* )
            // InternalUSE.g:1540:3: ( (lv_operationDeclaration_0_0= ruleOperationDeclaration ) ) otherlv_1= '=' ( (lv_operationbody_2_0= ruleOCLExpression ) ) ( (lv_conditions_3_0= ruleConditionType ) )*
            {
            // InternalUSE.g:1540:3: ( (lv_operationDeclaration_0_0= ruleOperationDeclaration ) )
            // InternalUSE.g:1541:4: (lv_operationDeclaration_0_0= ruleOperationDeclaration )
            {
            // InternalUSE.g:1541:4: (lv_operationDeclaration_0_0= ruleOperationDeclaration )
            // InternalUSE.g:1542:5: lv_operationDeclaration_0_0= ruleOperationDeclaration
            {

            					newCompositeNode(grammarAccess.getOperationQueryAccess().getOperationDeclarationOperationDeclarationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_33);
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

            otherlv_1=(Token)match(input,53,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationQueryAccess().getEqualsSignKeyword_1());
            		
            // InternalUSE.g:1563:3: ( (lv_operationbody_2_0= ruleOCLExpression ) )
            // InternalUSE.g:1564:4: (lv_operationbody_2_0= ruleOCLExpression )
            {
            // InternalUSE.g:1564:4: (lv_operationbody_2_0= ruleOCLExpression )
            // InternalUSE.g:1565:5: lv_operationbody_2_0= ruleOCLExpression
            {

            					newCompositeNode(grammarAccess.getOperationQueryAccess().getOperationbodyOCLExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_35);
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

            // InternalUSE.g:1582:3: ( (lv_conditions_3_0= ruleConditionType ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=59 && LA43_0<=60)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalUSE.g:1583:4: (lv_conditions_3_0= ruleConditionType )
            	    {
            	    // InternalUSE.g:1583:4: (lv_conditions_3_0= ruleConditionType )
            	    // InternalUSE.g:1584:5: lv_conditions_3_0= ruleConditionType
            	    {

            	    					newCompositeNode(grammarAccess.getOperationQueryAccess().getConditionsConditionTypeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_35);
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
            	    break loop43;
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
    // InternalUSE.g:1605:1: entryRuleOperationComplex returns [EObject current=null] : iv_ruleOperationComplex= ruleOperationComplex EOF ;
    public final EObject entryRuleOperationComplex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationComplex = null;


        try {
            // InternalUSE.g:1605:57: (iv_ruleOperationComplex= ruleOperationComplex EOF )
            // InternalUSE.g:1606:2: iv_ruleOperationComplex= ruleOperationComplex EOF
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
    // InternalUSE.g:1612:1: ruleOperationComplex returns [EObject current=null] : ( ( (lv_operationDeclaration_0_0= ruleOperationDeclaration ) ) (otherlv_1= 'begin' ( (lv_operationbody_2_0= ruleOCLExpression ) )? otherlv_3= 'end' )? ( (lv_conditions_4_0= ruleConditionType ) )* ) ;
    public final EObject ruleOperationComplex() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operationDeclaration_0_0 = null;

        AntlrDatatypeRuleToken lv_operationbody_2_0 = null;

        EObject lv_conditions_4_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1618:2: ( ( ( (lv_operationDeclaration_0_0= ruleOperationDeclaration ) ) (otherlv_1= 'begin' ( (lv_operationbody_2_0= ruleOCLExpression ) )? otherlv_3= 'end' )? ( (lv_conditions_4_0= ruleConditionType ) )* ) )
            // InternalUSE.g:1619:2: ( ( (lv_operationDeclaration_0_0= ruleOperationDeclaration ) ) (otherlv_1= 'begin' ( (lv_operationbody_2_0= ruleOCLExpression ) )? otherlv_3= 'end' )? ( (lv_conditions_4_0= ruleConditionType ) )* )
            {
            // InternalUSE.g:1619:2: ( ( (lv_operationDeclaration_0_0= ruleOperationDeclaration ) ) (otherlv_1= 'begin' ( (lv_operationbody_2_0= ruleOCLExpression ) )? otherlv_3= 'end' )? ( (lv_conditions_4_0= ruleConditionType ) )* )
            // InternalUSE.g:1620:3: ( (lv_operationDeclaration_0_0= ruleOperationDeclaration ) ) (otherlv_1= 'begin' ( (lv_operationbody_2_0= ruleOCLExpression ) )? otherlv_3= 'end' )? ( (lv_conditions_4_0= ruleConditionType ) )*
            {
            // InternalUSE.g:1620:3: ( (lv_operationDeclaration_0_0= ruleOperationDeclaration ) )
            // InternalUSE.g:1621:4: (lv_operationDeclaration_0_0= ruleOperationDeclaration )
            {
            // InternalUSE.g:1621:4: (lv_operationDeclaration_0_0= ruleOperationDeclaration )
            // InternalUSE.g:1622:5: lv_operationDeclaration_0_0= ruleOperationDeclaration
            {

            					newCompositeNode(grammarAccess.getOperationComplexAccess().getOperationDeclarationOperationDeclarationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_36);
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

            // InternalUSE.g:1639:3: (otherlv_1= 'begin' ( (lv_operationbody_2_0= ruleOCLExpression ) )? otherlv_3= 'end' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==54) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalUSE.g:1640:4: otherlv_1= 'begin' ( (lv_operationbody_2_0= ruleOCLExpression ) )? otherlv_3= 'end'
                    {
                    otherlv_1=(Token)match(input,54,FOLLOW_37); 

                    				newLeafNode(otherlv_1, grammarAccess.getOperationComplexAccess().getBeginKeyword_1_0());
                    			
                    // InternalUSE.g:1644:4: ( (lv_operationbody_2_0= ruleOCLExpression ) )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==RULE_STRING) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalUSE.g:1645:5: (lv_operationbody_2_0= ruleOCLExpression )
                            {
                            // InternalUSE.g:1645:5: (lv_operationbody_2_0= ruleOCLExpression )
                            // InternalUSE.g:1646:6: lv_operationbody_2_0= ruleOCLExpression
                            {

                            						newCompositeNode(grammarAccess.getOperationComplexAccess().getOperationbodyOCLExpressionParserRuleCall_1_1_0());
                            					
                            pushFollow(FOLLOW_20);
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

                    otherlv_3=(Token)match(input,40,FOLLOW_35); 

                    				newLeafNode(otherlv_3, grammarAccess.getOperationComplexAccess().getEndKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalUSE.g:1668:3: ( (lv_conditions_4_0= ruleConditionType ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=59 && LA46_0<=60)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalUSE.g:1669:4: (lv_conditions_4_0= ruleConditionType )
            	    {
            	    // InternalUSE.g:1669:4: (lv_conditions_4_0= ruleConditionType )
            	    // InternalUSE.g:1670:5: lv_conditions_4_0= ruleConditionType
            	    {

            	    					newCompositeNode(grammarAccess.getOperationComplexAccess().getConditionsConditionTypeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_35);
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
    // $ANTLR end "ruleOperationComplex"


    // $ANTLR start "entryRuleOperationDeclaration"
    // InternalUSE.g:1691:1: entryRuleOperationDeclaration returns [EObject current=null] : iv_ruleOperationDeclaration= ruleOperationDeclaration EOF ;
    public final EObject entryRuleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDeclaration = null;


        try {
            // InternalUSE.g:1691:61: (iv_ruleOperationDeclaration= ruleOperationDeclaration EOF )
            // InternalUSE.g:1692:2: iv_ruleOperationDeclaration= ruleOperationDeclaration EOF
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
    // InternalUSE.g:1698:1: ruleOperationDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) )* otherlv_3= ')' (otherlv_4= ':' ( (lv_returnType_5_0= ruleAllTypes ) ) )? ) ;
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
            // InternalUSE.g:1704:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) )* otherlv_3= ')' (otherlv_4= ':' ( (lv_returnType_5_0= ruleAllTypes ) ) )? ) )
            // InternalUSE.g:1705:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) )* otherlv_3= ')' (otherlv_4= ':' ( (lv_returnType_5_0= ruleAllTypes ) ) )? )
            {
            // InternalUSE.g:1705:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) )* otherlv_3= ')' (otherlv_4= ':' ( (lv_returnType_5_0= ruleAllTypes ) ) )? )
            // InternalUSE.g:1706:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) )* otherlv_3= ')' (otherlv_4= ':' ( (lv_returnType_5_0= ruleAllTypes ) ) )?
            {
            // InternalUSE.g:1706:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUSE.g:1707:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUSE.g:1707:4: (lv_name_0_0= RULE_ID )
            // InternalUSE.g:1708:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_1=(Token)match(input,32,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationDeclarationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalUSE.g:1728:3: ( (lv_parameters_2_0= ruleParameter ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalUSE.g:1729:4: (lv_parameters_2_0= ruleParameter )
            	    {
            	    // InternalUSE.g:1729:4: (lv_parameters_2_0= ruleParameter )
            	    // InternalUSE.g:1730:5: lv_parameters_2_0= ruleParameter
            	    {

            	    					newCompositeNode(grammarAccess.getOperationDeclarationAccess().getParametersParameterParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_38);
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
            	    break loop47;
                }
            } while (true);

            otherlv_3=(Token)match(input,33,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationDeclarationAccess().getRightParenthesisKeyword_3());
            		
            // InternalUSE.g:1751:3: (otherlv_4= ':' ( (lv_returnType_5_0= ruleAllTypes ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==51) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalUSE.g:1752:4: otherlv_4= ':' ( (lv_returnType_5_0= ruleAllTypes ) )
                    {
                    otherlv_4=(Token)match(input,51,FOLLOW_32); 

                    				newLeafNode(otherlv_4, grammarAccess.getOperationDeclarationAccess().getColonKeyword_4_0());
                    			
                    // InternalUSE.g:1756:4: ( (lv_returnType_5_0= ruleAllTypes ) )
                    // InternalUSE.g:1757:5: (lv_returnType_5_0= ruleAllTypes )
                    {
                    // InternalUSE.g:1757:5: (lv_returnType_5_0= ruleAllTypes )
                    // InternalUSE.g:1758:6: lv_returnType_5_0= ruleAllTypes
                    {

                    						newCompositeNode(grammarAccess.getOperationDeclarationAccess().getReturnTypeAllTypesParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_returnType_5_0=ruleAllTypes();

                    state._fsp--;


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
    // InternalUSE.g:1780:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalUSE.g:1780:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalUSE.g:1781:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalUSE.g:1787:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAllTypes ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1793:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAllTypes ) ) (otherlv_3= ',' )? ) )
            // InternalUSE.g:1794:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAllTypes ) ) (otherlv_3= ',' )? )
            {
            // InternalUSE.g:1794:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAllTypes ) ) (otherlv_3= ',' )? )
            // InternalUSE.g:1795:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAllTypes ) ) (otherlv_3= ',' )?
            {
            // InternalUSE.g:1795:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUSE.g:1796:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUSE.g:1796:4: (lv_name_0_0= RULE_ID )
            // InternalUSE.g:1797:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_31); 

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

            otherlv_1=(Token)match(input,51,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
            		
            // InternalUSE.g:1817:3: ( (lv_type_2_0= ruleAllTypes ) )
            // InternalUSE.g:1818:4: (lv_type_2_0= ruleAllTypes )
            {
            // InternalUSE.g:1818:4: (lv_type_2_0= ruleAllTypes )
            // InternalUSE.g:1819:5: lv_type_2_0= ruleAllTypes
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeAllTypesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_type_2_0=ruleAllTypes();

            state._fsp--;


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

            // InternalUSE.g:1836:3: (otherlv_3= ',' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==14) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalUSE.g:1837:4: otherlv_3= ','
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
    // InternalUSE.g:1846:1: entryRuleConstraintsBase returns [EObject current=null] : iv_ruleConstraintsBase= ruleConstraintsBase EOF ;
    public final EObject entryRuleConstraintsBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintsBase = null;


        try {
            // InternalUSE.g:1846:56: (iv_ruleConstraintsBase= ruleConstraintsBase EOF )
            // InternalUSE.g:1847:2: iv_ruleConstraintsBase= ruleConstraintsBase EOF
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
    // InternalUSE.g:1853:1: ruleConstraintsBase returns [EObject current=null] : (otherlv_0= 'constraints' ( (lv_invariants_1_0= ruleInvariantDefinition ) )* ) ;
    public final EObject ruleConstraintsBase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_invariants_1_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1859:2: ( (otherlv_0= 'constraints' ( (lv_invariants_1_0= ruleInvariantDefinition ) )* ) )
            // InternalUSE.g:1860:2: (otherlv_0= 'constraints' ( (lv_invariants_1_0= ruleInvariantDefinition ) )* )
            {
            // InternalUSE.g:1860:2: (otherlv_0= 'constraints' ( (lv_invariants_1_0= ruleInvariantDefinition ) )* )
            // InternalUSE.g:1861:3: otherlv_0= 'constraints' ( (lv_invariants_1_0= ruleInvariantDefinition ) )*
            {
            otherlv_0=(Token)match(input,55,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintsBaseAccess().getConstraintsKeyword_0());
            		
            // InternalUSE.g:1865:3: ( (lv_invariants_1_0= ruleInvariantDefinition ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==57) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalUSE.g:1866:4: (lv_invariants_1_0= ruleInvariantDefinition )
            	    {
            	    // InternalUSE.g:1866:4: (lv_invariants_1_0= ruleInvariantDefinition )
            	    // InternalUSE.g:1867:5: lv_invariants_1_0= ruleInvariantDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getConstraintsBaseAccess().getInvariantsInvariantDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_40);
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
    // $ANTLR end "ruleConstraintsBase"


    // $ANTLR start "entryRuleConstrainsGeneral"
    // InternalUSE.g:1888:1: entryRuleConstrainsGeneral returns [EObject current=null] : iv_ruleConstrainsGeneral= ruleConstrainsGeneral EOF ;
    public final EObject entryRuleConstrainsGeneral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstrainsGeneral = null;


        try {
            // InternalUSE.g:1888:58: (iv_ruleConstrainsGeneral= ruleConstrainsGeneral EOF )
            // InternalUSE.g:1889:2: iv_ruleConstrainsGeneral= ruleConstrainsGeneral EOF
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
    // InternalUSE.g:1895:1: ruleConstrainsGeneral returns [EObject current=null] : (otherlv_0= 'constraints' ( (lv_contexts_1_0= ruleContextsType ) )* ) ;
    public final EObject ruleConstrainsGeneral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_contexts_1_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1901:2: ( (otherlv_0= 'constraints' ( (lv_contexts_1_0= ruleContextsType ) )* ) )
            // InternalUSE.g:1902:2: (otherlv_0= 'constraints' ( (lv_contexts_1_0= ruleContextsType ) )* )
            {
            // InternalUSE.g:1902:2: (otherlv_0= 'constraints' ( (lv_contexts_1_0= ruleContextsType ) )* )
            // InternalUSE.g:1903:3: otherlv_0= 'constraints' ( (lv_contexts_1_0= ruleContextsType ) )*
            {
            otherlv_0=(Token)match(input,55,FOLLOW_41); 

            			newLeafNode(otherlv_0, grammarAccess.getConstrainsGeneralAccess().getConstraintsKeyword_0());
            		
            // InternalUSE.g:1907:3: ( (lv_contexts_1_0= ruleContextsType ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==56) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalUSE.g:1908:4: (lv_contexts_1_0= ruleContextsType )
            	    {
            	    // InternalUSE.g:1908:4: (lv_contexts_1_0= ruleContextsType )
            	    // InternalUSE.g:1909:5: lv_contexts_1_0= ruleContextsType
            	    {

            	    					newCompositeNode(grammarAccess.getConstrainsGeneralAccess().getContextsContextsTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_41);
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
            	    break loop51;
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
    // InternalUSE.g:1930:1: entryRuleContextsType returns [EObject current=null] : iv_ruleContextsType= ruleContextsType EOF ;
    public final EObject entryRuleContextsType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextsType = null;


        try {
            // InternalUSE.g:1930:53: (iv_ruleContextsType= ruleContextsType EOF )
            // InternalUSE.g:1931:2: iv_ruleContextsType= ruleContextsType EOF
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
    // InternalUSE.g:1937:1: ruleContextsType returns [EObject current=null] : (this_InvariantContext_0= ruleInvariantContext | this_OperationContext_1= ruleOperationContext ) ;
    public final EObject ruleContextsType() throws RecognitionException {
        EObject current = null;

        EObject this_InvariantContext_0 = null;

        EObject this_OperationContext_1 = null;



        	enterRule();

        try {
            // InternalUSE.g:1943:2: ( (this_InvariantContext_0= ruleInvariantContext | this_OperationContext_1= ruleOperationContext ) )
            // InternalUSE.g:1944:2: (this_InvariantContext_0= ruleInvariantContext | this_OperationContext_1= ruleOperationContext )
            {
            // InternalUSE.g:1944:2: (this_InvariantContext_0= ruleInvariantContext | this_OperationContext_1= ruleOperationContext )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==56) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==RULE_ID) ) {
                    int LA52_2 = input.LA(3);

                    if ( (LA52_2==EOF||LA52_2==51||(LA52_2>=56 && LA52_2<=57)) ) {
                        alt52=1;
                    }
                    else if ( (LA52_2==58) ) {
                        alt52=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalUSE.g:1945:3: this_InvariantContext_0= ruleInvariantContext
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
                    // InternalUSE.g:1954:3: this_OperationContext_1= ruleOperationContext
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
    // InternalUSE.g:1966:1: entryRuleInvariantContext returns [EObject current=null] : iv_ruleInvariantContext= ruleInvariantContext EOF ;
    public final EObject entryRuleInvariantContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariantContext = null;


        try {
            // InternalUSE.g:1966:57: (iv_ruleInvariantContext= ruleInvariantContext EOF )
            // InternalUSE.g:1967:2: iv_ruleInvariantContext= ruleInvariantContext EOF
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
    // InternalUSE.g:1973:1: ruleInvariantContext returns [EObject current=null] : (otherlv_0= 'context' ( ( (lv_variablename_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (otherlv_3= RULE_ID ) ) ( (lv_invariants_4_0= ruleInvariantDefinition ) )* ) ;
    public final EObject ruleInvariantContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_variablename_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_invariants_4_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1979:2: ( (otherlv_0= 'context' ( ( (lv_variablename_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (otherlv_3= RULE_ID ) ) ( (lv_invariants_4_0= ruleInvariantDefinition ) )* ) )
            // InternalUSE.g:1980:2: (otherlv_0= 'context' ( ( (lv_variablename_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (otherlv_3= RULE_ID ) ) ( (lv_invariants_4_0= ruleInvariantDefinition ) )* )
            {
            // InternalUSE.g:1980:2: (otherlv_0= 'context' ( ( (lv_variablename_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (otherlv_3= RULE_ID ) ) ( (lv_invariants_4_0= ruleInvariantDefinition ) )* )
            // InternalUSE.g:1981:3: otherlv_0= 'context' ( ( (lv_variablename_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (otherlv_3= RULE_ID ) ) ( (lv_invariants_4_0= ruleInvariantDefinition ) )*
            {
            otherlv_0=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInvariantContextAccess().getContextKeyword_0());
            		
            // InternalUSE.g:1985:3: ( ( (lv_variablename_1_0= RULE_ID ) ) otherlv_2= ':' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==51) ) {
                    alt53=1;
                }
            }
            switch (alt53) {
                case 1 :
                    // InternalUSE.g:1986:4: ( (lv_variablename_1_0= RULE_ID ) ) otherlv_2= ':'
                    {
                    // InternalUSE.g:1986:4: ( (lv_variablename_1_0= RULE_ID ) )
                    // InternalUSE.g:1987:5: (lv_variablename_1_0= RULE_ID )
                    {
                    // InternalUSE.g:1987:5: (lv_variablename_1_0= RULE_ID )
                    // InternalUSE.g:1988:6: lv_variablename_1_0= RULE_ID
                    {
                    lv_variablename_1_0=(Token)match(input,RULE_ID,FOLLOW_31); 

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

                    otherlv_2=(Token)match(input,51,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getInvariantContextAccess().getColonKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalUSE.g:2009:3: ( (otherlv_3= RULE_ID ) )
            // InternalUSE.g:2010:4: (otherlv_3= RULE_ID )
            {
            // InternalUSE.g:2010:4: (otherlv_3= RULE_ID )
            // InternalUSE.g:2011:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInvariantContextRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_40); 

            					newLeafNode(otherlv_3, grammarAccess.getInvariantContextAccess().getClassnameAllClassCrossReference_2_0());
            				

            }


            }

            // InternalUSE.g:2022:3: ( (lv_invariants_4_0= ruleInvariantDefinition ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==57) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalUSE.g:2023:4: (lv_invariants_4_0= ruleInvariantDefinition )
            	    {
            	    // InternalUSE.g:2023:4: (lv_invariants_4_0= ruleInvariantDefinition )
            	    // InternalUSE.g:2024:5: lv_invariants_4_0= ruleInvariantDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getInvariantContextAccess().getInvariantsInvariantDefinitionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_40);
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
            	    break loop54;
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
    // InternalUSE.g:2045:1: entryRuleInvariantDefinition returns [EObject current=null] : iv_ruleInvariantDefinition= ruleInvariantDefinition EOF ;
    public final EObject entryRuleInvariantDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariantDefinition = null;


        try {
            // InternalUSE.g:2045:60: (iv_ruleInvariantDefinition= ruleInvariantDefinition EOF )
            // InternalUSE.g:2046:2: iv_ruleInvariantDefinition= ruleInvariantDefinition EOF
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
    // InternalUSE.g:2052:1: ruleInvariantDefinition returns [EObject current=null] : (otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) ) ) ;
    public final EObject ruleInvariantDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_oclexpression_3_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:2058:2: ( (otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) ) ) )
            // InternalUSE.g:2059:2: (otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) ) )
            {
            // InternalUSE.g:2059:2: (otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) ) )
            // InternalUSE.g:2060:3: otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_42); 

            			newLeafNode(otherlv_0, grammarAccess.getInvariantDefinitionAccess().getInvKeyword_0());
            		
            // InternalUSE.g:2064:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalUSE.g:2065:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalUSE.g:2065:4: (lv_name_1_0= RULE_ID )
                    // InternalUSE.g:2066:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_31); 

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

            otherlv_2=(Token)match(input,51,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getInvariantDefinitionAccess().getColonKeyword_2());
            		
            // InternalUSE.g:2086:3: ( (lv_oclexpression_3_0= ruleOCLExpression ) )
            // InternalUSE.g:2087:4: (lv_oclexpression_3_0= ruleOCLExpression )
            {
            // InternalUSE.g:2087:4: (lv_oclexpression_3_0= ruleOCLExpression )
            // InternalUSE.g:2088:5: lv_oclexpression_3_0= ruleOCLExpression
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
    // InternalUSE.g:2109:1: entryRuleOperationContext returns [EObject current=null] : iv_ruleOperationContext= ruleOperationContext EOF ;
    public final EObject entryRuleOperationContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationContext = null;


        try {
            // InternalUSE.g:2109:57: (iv_ruleOperationContext= ruleOperationContext EOF )
            // InternalUSE.g:2110:2: iv_ruleOperationContext= ruleOperationContext EOF
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
    // InternalUSE.g:2116:1: ruleOperationContext returns [EObject current=null] : (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) ( (lv_constrains_2_0= ruleOperationConstraints ) ) ) ;
    public final EObject ruleOperationContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_constrains_2_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:2122:2: ( (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) ( (lv_constrains_2_0= ruleOperationConstraints ) ) ) )
            // InternalUSE.g:2123:2: (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) ( (lv_constrains_2_0= ruleOperationConstraints ) ) )
            {
            // InternalUSE.g:2123:2: (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) ( (lv_constrains_2_0= ruleOperationConstraints ) ) )
            // InternalUSE.g:2124:3: otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) ( (lv_constrains_2_0= ruleOperationConstraints ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationContextAccess().getContextKeyword_0());
            		
            // InternalUSE.g:2128:3: ( (otherlv_1= RULE_ID ) )
            // InternalUSE.g:2129:4: (otherlv_1= RULE_ID )
            {
            // InternalUSE.g:2129:4: (otherlv_1= RULE_ID )
            // InternalUSE.g:2130:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationContextRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_43); 

            					newLeafNode(otherlv_1, grammarAccess.getOperationContextAccess().getClassnameAllClassCrossReference_1_0());
            				

            }


            }

            // InternalUSE.g:2141:3: ( (lv_constrains_2_0= ruleOperationConstraints ) )
            // InternalUSE.g:2142:4: (lv_constrains_2_0= ruleOperationConstraints )
            {
            // InternalUSE.g:2142:4: (lv_constrains_2_0= ruleOperationConstraints )
            // InternalUSE.g:2143:5: lv_constrains_2_0= ruleOperationConstraints
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
    // InternalUSE.g:2164:1: entryRuleOperationConstraints returns [EObject current=null] : iv_ruleOperationConstraints= ruleOperationConstraints EOF ;
    public final EObject entryRuleOperationConstraints() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationConstraints = null;


        try {
            // InternalUSE.g:2164:61: (iv_ruleOperationConstraints= ruleOperationConstraints EOF )
            // InternalUSE.g:2165:2: iv_ruleOperationConstraints= ruleOperationConstraints EOF
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
    // InternalUSE.g:2171:1: ruleOperationConstraints returns [EObject current=null] : (otherlv_0= '::' ( (lv_operationDeclaration_1_0= ruleOperationDeclaration ) ) ( (lv_conditions_2_0= ruleConditionType ) )+ ) ;
    public final EObject ruleOperationConstraints() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_operationDeclaration_1_0 = null;

        EObject lv_conditions_2_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:2177:2: ( (otherlv_0= '::' ( (lv_operationDeclaration_1_0= ruleOperationDeclaration ) ) ( (lv_conditions_2_0= ruleConditionType ) )+ ) )
            // InternalUSE.g:2178:2: (otherlv_0= '::' ( (lv_operationDeclaration_1_0= ruleOperationDeclaration ) ) ( (lv_conditions_2_0= ruleConditionType ) )+ )
            {
            // InternalUSE.g:2178:2: (otherlv_0= '::' ( (lv_operationDeclaration_1_0= ruleOperationDeclaration ) ) ( (lv_conditions_2_0= ruleConditionType ) )+ )
            // InternalUSE.g:2179:3: otherlv_0= '::' ( (lv_operationDeclaration_1_0= ruleOperationDeclaration ) ) ( (lv_conditions_2_0= ruleConditionType ) )+
            {
            otherlv_0=(Token)match(input,58,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationConstraintsAccess().getColonColonKeyword_0());
            		
            // InternalUSE.g:2183:3: ( (lv_operationDeclaration_1_0= ruleOperationDeclaration ) )
            // InternalUSE.g:2184:4: (lv_operationDeclaration_1_0= ruleOperationDeclaration )
            {
            // InternalUSE.g:2184:4: (lv_operationDeclaration_1_0= ruleOperationDeclaration )
            // InternalUSE.g:2185:5: lv_operationDeclaration_1_0= ruleOperationDeclaration
            {

            					newCompositeNode(grammarAccess.getOperationConstraintsAccess().getOperationDeclarationOperationDeclarationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_44);
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

            // InternalUSE.g:2202:3: ( (lv_conditions_2_0= ruleConditionType ) )+
            int cnt56=0;
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=59 && LA56_0<=60)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalUSE.g:2203:4: (lv_conditions_2_0= ruleConditionType )
            	    {
            	    // InternalUSE.g:2203:4: (lv_conditions_2_0= ruleConditionType )
            	    // InternalUSE.g:2204:5: lv_conditions_2_0= ruleConditionType
            	    {

            	    					newCompositeNode(grammarAccess.getOperationConstraintsAccess().getConditionsConditionTypeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_35);
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
            	    if ( cnt56 >= 1 ) break loop56;
                        EarlyExitException eee =
                            new EarlyExitException(56, input);
                        throw eee;
                }
                cnt56++;
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
    // InternalUSE.g:2225:1: entryRuleConditionType returns [EObject current=null] : iv_ruleConditionType= ruleConditionType EOF ;
    public final EObject entryRuleConditionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionType = null;


        try {
            // InternalUSE.g:2225:54: (iv_ruleConditionType= ruleConditionType EOF )
            // InternalUSE.g:2226:2: iv_ruleConditionType= ruleConditionType EOF
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
    // InternalUSE.g:2232:1: ruleConditionType returns [EObject current=null] : (this_Precondition_0= rulePrecondition | this_Postcondition_1= rulePostcondition ) ;
    public final EObject ruleConditionType() throws RecognitionException {
        EObject current = null;

        EObject this_Precondition_0 = null;

        EObject this_Postcondition_1 = null;



        	enterRule();

        try {
            // InternalUSE.g:2238:2: ( (this_Precondition_0= rulePrecondition | this_Postcondition_1= rulePostcondition ) )
            // InternalUSE.g:2239:2: (this_Precondition_0= rulePrecondition | this_Postcondition_1= rulePostcondition )
            {
            // InternalUSE.g:2239:2: (this_Precondition_0= rulePrecondition | this_Postcondition_1= rulePostcondition )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==59) ) {
                alt57=1;
            }
            else if ( (LA57_0==60) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalUSE.g:2240:3: this_Precondition_0= rulePrecondition
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
                    // InternalUSE.g:2249:3: this_Postcondition_1= rulePostcondition
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
    // InternalUSE.g:2261:1: entryRulePrecondition returns [EObject current=null] : iv_rulePrecondition= rulePrecondition EOF ;
    public final EObject entryRulePrecondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecondition = null;


        try {
            // InternalUSE.g:2261:53: (iv_rulePrecondition= rulePrecondition EOF )
            // InternalUSE.g:2262:2: iv_rulePrecondition= rulePrecondition EOF
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
    // InternalUSE.g:2268:1: rulePrecondition returns [EObject current=null] : (otherlv_0= 'pre' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) ) ) ;
    public final EObject rulePrecondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_oclexpression_3_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:2274:2: ( (otherlv_0= 'pre' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) ) ) )
            // InternalUSE.g:2275:2: (otherlv_0= 'pre' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) ) )
            {
            // InternalUSE.g:2275:2: (otherlv_0= 'pre' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) ) )
            // InternalUSE.g:2276:3: otherlv_0= 'pre' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_42); 

            			newLeafNode(otherlv_0, grammarAccess.getPreconditionAccess().getPreKeyword_0());
            		
            // InternalUSE.g:2280:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalUSE.g:2281:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalUSE.g:2281:4: (lv_name_1_0= RULE_ID )
                    // InternalUSE.g:2282:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_31); 

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

            otherlv_2=(Token)match(input,51,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getPreconditionAccess().getColonKeyword_2());
            		
            // InternalUSE.g:2302:3: ( (lv_oclexpression_3_0= ruleOCLExpression ) )
            // InternalUSE.g:2303:4: (lv_oclexpression_3_0= ruleOCLExpression )
            {
            // InternalUSE.g:2303:4: (lv_oclexpression_3_0= ruleOCLExpression )
            // InternalUSE.g:2304:5: lv_oclexpression_3_0= ruleOCLExpression
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
    // InternalUSE.g:2325:1: entryRulePostcondition returns [EObject current=null] : iv_rulePostcondition= rulePostcondition EOF ;
    public final EObject entryRulePostcondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostcondition = null;


        try {
            // InternalUSE.g:2325:54: (iv_rulePostcondition= rulePostcondition EOF )
            // InternalUSE.g:2326:2: iv_rulePostcondition= rulePostcondition EOF
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
    // InternalUSE.g:2332:1: rulePostcondition returns [EObject current=null] : (otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) ) ) ;
    public final EObject rulePostcondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_oclexpression_3_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:2338:2: ( (otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) ) ) )
            // InternalUSE.g:2339:2: (otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) ) )
            {
            // InternalUSE.g:2339:2: (otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) ) )
            // InternalUSE.g:2340:3: otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) )
            {
            otherlv_0=(Token)match(input,60,FOLLOW_42); 

            			newLeafNode(otherlv_0, grammarAccess.getPostconditionAccess().getPostKeyword_0());
            		
            // InternalUSE.g:2344:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalUSE.g:2345:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalUSE.g:2345:4: (lv_name_1_0= RULE_ID )
                    // InternalUSE.g:2346:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_31); 

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

            otherlv_2=(Token)match(input,51,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getPostconditionAccess().getColonKeyword_2());
            		
            // InternalUSE.g:2366:3: ( (lv_oclexpression_3_0= ruleOCLExpression ) )
            // InternalUSE.g:2367:4: (lv_oclexpression_3_0= ruleOCLExpression )
            {
            // InternalUSE.g:2367:4: (lv_oclexpression_3_0= ruleOCLExpression )
            // InternalUSE.g:2368:5: lv_oclexpression_3_0= ruleOCLExpression
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
    // InternalUSE.g:2389:1: entryRuleOCLExpression returns [String current=null] : iv_ruleOCLExpression= ruleOCLExpression EOF ;
    public final String entryRuleOCLExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOCLExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalUSE.g:2391:2: (iv_ruleOCLExpression= ruleOCLExpression EOF )
            // InternalUSE.g:2392:2: iv_ruleOCLExpression= ruleOCLExpression EOF
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
    // InternalUSE.g:2401:1: ruleOCLExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleOCLExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalUSE.g:2408:2: (this_STRING_0= RULE_STRING )
            // InternalUSE.g:2409:2: this_STRING_0= RULE_STRING
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


    protected DFA42 dfa42 = new DFA42(this);
    static final String dfa_1s = "\50\uffff";
    static final String dfa_2s = "\4\uffff\1\7\17\uffff\5\7\16\uffff\1\7";
    static final String dfa_3s = "\1\4\1\40\1\4\1\63\3\4\2\uffff\3\40\5\4\3\40\24\4";
    static final String dfa_4s = "\1\4\1\40\1\41\1\63\1\74\2\37\2\uffff\3\40\5\41\3\40\5\74\16\41\1\74";
    static final String dfa_5s = "\7\uffff\1\1\1\2\37\uffff";
    static final String dfa_6s = "\50\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2",
            "\1\3\34\uffff\1\4",
            "\1\5",
            "\1\7\43\uffff\1\7\12\uffff\1\6\1\uffff\1\10\2\7\3\uffff\2\7",
            "\1\20\24\uffff\1\14\1\15\1\16\1\17\1\11\1\12\1\13",
            "\1\30\24\uffff\1\24\1\25\1\26\1\27\1\21\1\22\1\23",
            "",
            "",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\3\11\uffff\1\32\22\uffff\1\4",
            "\1\3\11\uffff\1\32\22\uffff\1\4",
            "\1\3\11\uffff\1\32\22\uffff\1\4",
            "\1\3\11\uffff\1\32\22\uffff\1\4",
            "\1\3\11\uffff\1\32\22\uffff\1\4",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\7\43\uffff\1\7\14\uffff\1\10\2\7\3\uffff\2\7",
            "\1\7\43\uffff\1\7\14\uffff\1\10\2\7\3\uffff\2\7",
            "\1\7\43\uffff\1\7\14\uffff\1\10\2\7\3\uffff\2\7",
            "\1\7\43\uffff\1\7\14\uffff\1\10\2\7\3\uffff\2\7",
            "\1\7\43\uffff\1\7\14\uffff\1\10\2\7\3\uffff\2\7",
            "\1\40\24\uffff\1\34\1\35\1\36\1\37\4\uffff\1\41",
            "\1\3\34\uffff\1\4",
            "\1\46\24\uffff\1\42\1\43\1\44\1\45\4\uffff\1\47",
            "\1\40\24\uffff\1\34\1\35\1\36\1\37\4\uffff\1\41",
            "\1\40\24\uffff\1\34\1\35\1\36\1\37\4\uffff\1\41",
            "\1\40\24\uffff\1\34\1\35\1\36\1\37\4\uffff\1\41",
            "\1\40\24\uffff\1\34\1\35\1\36\1\37\4\uffff\1\41",
            "\1\40\24\uffff\1\34\1\35\1\36\1\37\4\uffff\1\41",
            "\1\3\11\uffff\1\32\22\uffff\1\4",
            "\1\46\24\uffff\1\42\1\43\1\44\1\45\4\uffff\1\47",
            "\1\46\24\uffff\1\42\1\43\1\44\1\45\4\uffff\1\47",
            "\1\46\24\uffff\1\42\1\43\1\44\1\45\4\uffff\1\47",
            "\1\46\24\uffff\1\42\1\43\1\44\1\45\4\uffff\1\47",
            "\1\46\24\uffff\1\42\1\43\1\44\1\45\4\uffff\1\47",
            "\1\7\43\uffff\1\7\14\uffff\1\10\2\7\3\uffff\2\7"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1503:2: (this_OperationComplex_0= ruleOperationComplex | this_OperationQuery_1= ruleOperationQuery )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00820E6400000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00820E6000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001FF9000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001FF8002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000021E000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0094018000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0094010000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0090010000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0080010000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000010000000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000108000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000000FE000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x1840000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000020L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0008000000000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x1800000000000000L});

}