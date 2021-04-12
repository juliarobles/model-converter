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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'*'", "'..'", "','", "'Integer'", "'String'", "'Real'", "'Boolean'", "'enum'", "'{'", "'}'", "'abstract'", "'class'", "'<'", "'attributes'", "'end'", "'associationclass'", "'between'", "'operations'", "'['", "']'", "'role'", "'ordered'", "'association'", "'aggregation'", "'composition'", "':'", "'='", "'begin'", "'('", "')'", "'constraints'", "'context'", "'inv'", "'::'", "'pre'", "'post'"
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
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=6;
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
    // InternalUSE.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_packagedElement_2_0= ruleEnumeration ) )* ( (lv_packagedElement_3_0= ruleType ) )* ( (lv_constraints_4_0= ruleConstrainsGeneral ) )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_packagedElement_2_0 = null;

        EObject lv_packagedElement_3_0 = null;

        EObject lv_constraints_4_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:77:2: ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_packagedElement_2_0= ruleEnumeration ) )* ( (lv_packagedElement_3_0= ruleType ) )* ( (lv_constraints_4_0= ruleConstrainsGeneral ) )? ) )
            // InternalUSE.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_packagedElement_2_0= ruleEnumeration ) )* ( (lv_packagedElement_3_0= ruleType ) )* ( (lv_constraints_4_0= ruleConstrainsGeneral ) )? )
            {
            // InternalUSE.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_packagedElement_2_0= ruleEnumeration ) )* ( (lv_packagedElement_3_0= ruleType ) )* ( (lv_constraints_4_0= ruleConstrainsGeneral ) )? )
            // InternalUSE.g:79:3: otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_packagedElement_2_0= ruleEnumeration ) )* ( (lv_packagedElement_3_0= ruleType ) )* ( (lv_constraints_4_0= ruleConstrainsGeneral ) )?
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

            // InternalUSE.g:101:3: ( (lv_packagedElement_2_0= ruleEnumeration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUSE.g:102:4: (lv_packagedElement_2_0= ruleEnumeration )
            	    {
            	    // InternalUSE.g:102:4: (lv_packagedElement_2_0= ruleEnumeration )
            	    // InternalUSE.g:103:5: lv_packagedElement_2_0= ruleEnumeration
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getPackagedElementEnumerationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_packagedElement_2_0=ruleEnumeration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"packagedElement",
            	    						lv_packagedElement_2_0,
            	    						"modelConverter.use_language.USE.Enumeration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalUSE.g:120:3: ( (lv_packagedElement_3_0= ruleType ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=22 && LA2_0<=23)||LA2_0==27||(LA2_0>=34 && LA2_0<=36)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalUSE.g:121:4: (lv_packagedElement_3_0= ruleType )
            	    {
            	    // InternalUSE.g:121:4: (lv_packagedElement_3_0= ruleType )
            	    // InternalUSE.g:122:5: lv_packagedElement_3_0= ruleType
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getPackagedElementTypeParserRuleCall_3_0());
            	    				
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

            // InternalUSE.g:139:3: ( (lv_constraints_4_0= ruleConstrainsGeneral ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==42) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalUSE.g:140:4: (lv_constraints_4_0= ruleConstrainsGeneral )
                    {
                    // InternalUSE.g:140:4: (lv_constraints_4_0= ruleConstrainsGeneral )
                    // InternalUSE.g:141:5: lv_constraints_4_0= ruleConstrainsGeneral
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getConstraintsConstrainsGeneralParserRuleCall_4_0());
                    				
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
    // InternalUSE.g:162:1: entryRuleMultiplicity returns [String current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final String entryRuleMultiplicity() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiplicity = null;


        try {
            // InternalUSE.g:162:52: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // InternalUSE.g:163:2: iv_ruleMultiplicity= ruleMultiplicity EOF
            {
             newCompositeNode(grammarAccess.getMultiplicityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicity=ruleMultiplicity();

            state._fsp--;

             current =iv_ruleMultiplicity.getText(); 
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
    // InternalUSE.g:169:1: ruleMultiplicity returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '*' | this_INT_1= RULE_INT ) (kw= '..' (kw= '*' | this_INT_4= RULE_INT ) )? (kw= ',' (kw= '*' | this_INT_7= RULE_INT ) (kw= '..' (kw= '*' | this_INT_10= RULE_INT ) )? )* ) ;
    public final AntlrDatatypeRuleToken ruleMultiplicity() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_4=null;
        Token this_INT_7=null;
        Token this_INT_10=null;


        	enterRule();

        try {
            // InternalUSE.g:175:2: ( ( (kw= '*' | this_INT_1= RULE_INT ) (kw= '..' (kw= '*' | this_INT_4= RULE_INT ) )? (kw= ',' (kw= '*' | this_INT_7= RULE_INT ) (kw= '..' (kw= '*' | this_INT_10= RULE_INT ) )? )* ) )
            // InternalUSE.g:176:2: ( (kw= '*' | this_INT_1= RULE_INT ) (kw= '..' (kw= '*' | this_INT_4= RULE_INT ) )? (kw= ',' (kw= '*' | this_INT_7= RULE_INT ) (kw= '..' (kw= '*' | this_INT_10= RULE_INT ) )? )* )
            {
            // InternalUSE.g:176:2: ( (kw= '*' | this_INT_1= RULE_INT ) (kw= '..' (kw= '*' | this_INT_4= RULE_INT ) )? (kw= ',' (kw= '*' | this_INT_7= RULE_INT ) (kw= '..' (kw= '*' | this_INT_10= RULE_INT ) )? )* )
            // InternalUSE.g:177:3: (kw= '*' | this_INT_1= RULE_INT ) (kw= '..' (kw= '*' | this_INT_4= RULE_INT ) )? (kw= ',' (kw= '*' | this_INT_7= RULE_INT ) (kw= '..' (kw= '*' | this_INT_10= RULE_INT ) )? )*
            {
            // InternalUSE.g:177:3: (kw= '*' | this_INT_1= RULE_INT )
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
                    // InternalUSE.g:178:4: kw= '*'
                    {
                    kw=(Token)match(input,12,FOLLOW_6); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getMultiplicityAccess().getAsteriskKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUSE.g:184:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_6); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getMultiplicityAccess().getINTTerminalRuleCall_0_1());
                    			

                    }
                    break;

            }

            // InternalUSE.g:192:3: (kw= '..' (kw= '*' | this_INT_4= RULE_INT ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalUSE.g:193:4: kw= '..' (kw= '*' | this_INT_4= RULE_INT )
                    {
                    kw=(Token)match(input,13,FOLLOW_7); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_1_0());
                    			
                    // InternalUSE.g:198:4: (kw= '*' | this_INT_4= RULE_INT )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==12) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==RULE_INT) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalUSE.g:199:5: kw= '*'
                            {
                            kw=(Token)match(input,12,FOLLOW_8); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getMultiplicityAccess().getAsteriskKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalUSE.g:205:5: this_INT_4= RULE_INT
                            {
                            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_8); 

                            					current.merge(this_INT_4);
                            				

                            					newLeafNode(this_INT_4, grammarAccess.getMultiplicityAccess().getINTTerminalRuleCall_1_1_1());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalUSE.g:214:3: (kw= ',' (kw= '*' | this_INT_7= RULE_INT ) (kw= '..' (kw= '*' | this_INT_10= RULE_INT ) )? )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==14) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalUSE.g:215:4: kw= ',' (kw= '*' | this_INT_7= RULE_INT ) (kw= '..' (kw= '*' | this_INT_10= RULE_INT ) )?
            	    {
            	    kw=(Token)match(input,14,FOLLOW_7); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getMultiplicityAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalUSE.g:220:4: (kw= '*' | this_INT_7= RULE_INT )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==12) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==RULE_INT) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalUSE.g:221:5: kw= '*'
            	            {
            	            kw=(Token)match(input,12,FOLLOW_6); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getMultiplicityAccess().getAsteriskKeyword_2_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalUSE.g:227:5: this_INT_7= RULE_INT
            	            {
            	            this_INT_7=(Token)match(input,RULE_INT,FOLLOW_6); 

            	            					current.merge(this_INT_7);
            	            				

            	            					newLeafNode(this_INT_7, grammarAccess.getMultiplicityAccess().getINTTerminalRuleCall_2_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalUSE.g:235:4: (kw= '..' (kw= '*' | this_INT_10= RULE_INT ) )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==13) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalUSE.g:236:5: kw= '..' (kw= '*' | this_INT_10= RULE_INT )
            	            {
            	            kw=(Token)match(input,13,FOLLOW_7); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_2_2_0());
            	            				
            	            // InternalUSE.g:241:5: (kw= '*' | this_INT_10= RULE_INT )
            	            int alt8=2;
            	            int LA8_0 = input.LA(1);

            	            if ( (LA8_0==12) ) {
            	                alt8=1;
            	            }
            	            else if ( (LA8_0==RULE_INT) ) {
            	                alt8=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 8, 0, input);

            	                throw nvae;
            	            }
            	            switch (alt8) {
            	                case 1 :
            	                    // InternalUSE.g:242:6: kw= '*'
            	                    {
            	                    kw=(Token)match(input,12,FOLLOW_8); 

            	                    						current.merge(kw);
            	                    						newLeafNode(kw, grammarAccess.getMultiplicityAccess().getAsteriskKeyword_2_2_1_0());
            	                    					

            	                    }
            	                    break;
            	                case 2 :
            	                    // InternalUSE.g:248:6: this_INT_10= RULE_INT
            	                    {
            	                    this_INT_10=(Token)match(input,RULE_INT,FOLLOW_8); 

            	                    						current.merge(this_INT_10);
            	                    					

            	                    						newLeafNode(this_INT_10, grammarAccess.getMultiplicityAccess().getINTTerminalRuleCall_2_2_1_1());
            	                    					

            	                    }
            	                    break;

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


    // $ANTLR start "entryRuleDefaultType"
    // InternalUSE.g:262:1: entryRuleDefaultType returns [String current=null] : iv_ruleDefaultType= ruleDefaultType EOF ;
    public final String entryRuleDefaultType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDefaultType = null;


        try {
            // InternalUSE.g:262:51: (iv_ruleDefaultType= ruleDefaultType EOF )
            // InternalUSE.g:263:2: iv_ruleDefaultType= ruleDefaultType EOF
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
    // InternalUSE.g:269:1: ruleDefaultType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Integer' | kw= 'String' | kw= 'Real' | kw= 'Boolean' ) ;
    public final AntlrDatatypeRuleToken ruleDefaultType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUSE.g:275:2: ( (kw= 'Integer' | kw= 'String' | kw= 'Real' | kw= 'Boolean' ) )
            // InternalUSE.g:276:2: (kw= 'Integer' | kw= 'String' | kw= 'Real' | kw= 'Boolean' )
            {
            // InternalUSE.g:276:2: (kw= 'Integer' | kw= 'String' | kw= 'Real' | kw= 'Boolean' )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalUSE.g:277:3: kw= 'Integer'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDefaultTypeAccess().getIntegerKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalUSE.g:283:3: kw= 'String'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDefaultTypeAccess().getStringKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalUSE.g:289:3: kw= 'Real'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDefaultTypeAccess().getRealKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalUSE.g:295:3: kw= 'Boolean'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

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
    // InternalUSE.g:304:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalUSE.g:304:45: (iv_ruleType= ruleType EOF )
            // InternalUSE.g:305:2: iv_ruleType= ruleType EOF
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
    // InternalUSE.g:311:1: ruleType returns [EObject current=null] : (this_Class_0= ruleClass | this_AssociationType_1= ruleAssociationType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_AssociationType_1 = null;



        	enterRule();

        try {
            // InternalUSE.g:317:2: ( (this_Class_0= ruleClass | this_AssociationType_1= ruleAssociationType ) )
            // InternalUSE.g:318:2: (this_Class_0= ruleClass | this_AssociationType_1= ruleAssociationType )
            {
            // InternalUSE.g:318:2: (this_Class_0= ruleClass | this_AssociationType_1= ruleAssociationType )
            int alt12=2;
            switch ( input.LA(1) ) {
            case 22:
                {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==23) ) {
                    alt12=1;
                }
                else if ( (LA12_1==27) ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                alt12=1;
                }
                break;
            case 27:
            case 34:
            case 35:
            case 36:
                {
                alt12=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalUSE.g:319:3: this_Class_0= ruleClass
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
                    // InternalUSE.g:328:3: this_AssociationType_1= ruleAssociationType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getAssociationTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssociationType_1=ruleAssociationType();

                    state._fsp--;


                    			current = this_AssociationType_1;
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


    // $ANTLR start "entryRuleAssociationType"
    // InternalUSE.g:340:1: entryRuleAssociationType returns [EObject current=null] : iv_ruleAssociationType= ruleAssociationType EOF ;
    public final EObject entryRuleAssociationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationType = null;


        try {
            // InternalUSE.g:340:56: (iv_ruleAssociationType= ruleAssociationType EOF )
            // InternalUSE.g:341:2: iv_ruleAssociationType= ruleAssociationType EOF
            {
             newCompositeNode(grammarAccess.getAssociationTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociationType=ruleAssociationType();

            state._fsp--;

             current =iv_ruleAssociationType; 
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
    // $ANTLR end "entryRuleAssociationType"


    // $ANTLR start "ruleAssociationType"
    // InternalUSE.g:347:1: ruleAssociationType returns [EObject current=null] : (this_AssociationBasic_0= ruleAssociationBasic | this_AssociationClass_1= ruleAssociationClass | this_Aggregation_2= ruleAggregation | this_Composition_3= ruleComposition ) ;
    public final EObject ruleAssociationType() throws RecognitionException {
        EObject current = null;

        EObject this_AssociationBasic_0 = null;

        EObject this_AssociationClass_1 = null;

        EObject this_Aggregation_2 = null;

        EObject this_Composition_3 = null;



        	enterRule();

        try {
            // InternalUSE.g:353:2: ( (this_AssociationBasic_0= ruleAssociationBasic | this_AssociationClass_1= ruleAssociationClass | this_Aggregation_2= ruleAggregation | this_Composition_3= ruleComposition ) )
            // InternalUSE.g:354:2: (this_AssociationBasic_0= ruleAssociationBasic | this_AssociationClass_1= ruleAssociationClass | this_Aggregation_2= ruleAggregation | this_Composition_3= ruleComposition )
            {
            // InternalUSE.g:354:2: (this_AssociationBasic_0= ruleAssociationBasic | this_AssociationClass_1= ruleAssociationClass | this_Aggregation_2= ruleAggregation | this_Composition_3= ruleComposition )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt13=1;
                }
                break;
            case 22:
            case 27:
                {
                alt13=2;
                }
                break;
            case 35:
                {
                alt13=3;
                }
                break;
            case 36:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalUSE.g:355:3: this_AssociationBasic_0= ruleAssociationBasic
                    {

                    			newCompositeNode(grammarAccess.getAssociationTypeAccess().getAssociationBasicParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssociationBasic_0=ruleAssociationBasic();

                    state._fsp--;


                    			current = this_AssociationBasic_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUSE.g:364:3: this_AssociationClass_1= ruleAssociationClass
                    {

                    			newCompositeNode(grammarAccess.getAssociationTypeAccess().getAssociationClassParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssociationClass_1=ruleAssociationClass();

                    state._fsp--;


                    			current = this_AssociationClass_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUSE.g:373:3: this_Aggregation_2= ruleAggregation
                    {

                    			newCompositeNode(grammarAccess.getAssociationTypeAccess().getAggregationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Aggregation_2=ruleAggregation();

                    state._fsp--;


                    			current = this_Aggregation_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalUSE.g:382:3: this_Composition_3= ruleComposition
                    {

                    			newCompositeNode(grammarAccess.getAssociationTypeAccess().getCompositionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Composition_3=ruleComposition();

                    state._fsp--;


                    			current = this_Composition_3;
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
    // $ANTLR end "ruleAssociationType"


    // $ANTLR start "entryRuleEnumeration"
    // InternalUSE.g:394:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalUSE.g:394:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalUSE.g:395:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             newCompositeNode(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;

             current =iv_ruleEnumeration; 
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
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalUSE.g:401:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_ownedLiteral_3_0= ruleOwnedLiteral ) )+ otherlv_4= '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedLiteral_3_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:407:2: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_ownedLiteral_3_0= ruleOwnedLiteral ) )+ otherlv_4= '}' ) )
            // InternalUSE.g:408:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_ownedLiteral_3_0= ruleOwnedLiteral ) )+ otherlv_4= '}' )
            {
            // InternalUSE.g:408:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_ownedLiteral_3_0= ruleOwnedLiteral ) )+ otherlv_4= '}' )
            // InternalUSE.g:409:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_ownedLiteral_3_0= ruleOwnedLiteral ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getEnumKeyword_0());
            		
            // InternalUSE.g:413:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUSE.g:414:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalUSE.g:414:4: (lv_name_1_0= RULE_ID )
                    // InternalUSE.g:415:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEnumerationRule());
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

            otherlv_2=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUSE.g:435:3: ( (lv_ownedLiteral_3_0= ruleOwnedLiteral ) )+
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
            	    // InternalUSE.g:436:4: (lv_ownedLiteral_3_0= ruleOwnedLiteral )
            	    {
            	    // InternalUSE.g:436:4: (lv_ownedLiteral_3_0= ruleOwnedLiteral )
            	    // InternalUSE.g:437:5: lv_ownedLiteral_3_0= ruleOwnedLiteral
            	    {

            	    					newCompositeNode(grammarAccess.getEnumerationAccess().getOwnedLiteralOwnedLiteralParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_ownedLiteral_3_0=ruleOwnedLiteral();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedLiteral",
            	    						lv_ownedLiteral_3_0,
            	    						"modelConverter.use_language.USE.OwnedLiteral");
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

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleOwnedLiteral"
    // InternalUSE.g:462:1: entryRuleOwnedLiteral returns [EObject current=null] : iv_ruleOwnedLiteral= ruleOwnedLiteral EOF ;
    public final EObject entryRuleOwnedLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedLiteral = null;


        try {
            // InternalUSE.g:462:53: (iv_ruleOwnedLiteral= ruleOwnedLiteral EOF )
            // InternalUSE.g:463:2: iv_ruleOwnedLiteral= ruleOwnedLiteral EOF
            {
             newCompositeNode(grammarAccess.getOwnedLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOwnedLiteral=ruleOwnedLiteral();

            state._fsp--;

             current =iv_ruleOwnedLiteral; 
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
    // $ANTLR end "entryRuleOwnedLiteral"


    // $ANTLR start "ruleOwnedLiteral"
    // InternalUSE.g:469:1: ruleOwnedLiteral returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' )? ) ;
    public final EObject ruleOwnedLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUSE.g:475:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' )? ) )
            // InternalUSE.g:476:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' )? )
            {
            // InternalUSE.g:476:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' )? )
            // InternalUSE.g:477:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' )?
            {
            // InternalUSE.g:477:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUSE.g:478:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUSE.g:478:4: (lv_name_0_0= RULE_ID )
            // InternalUSE.g:479:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getOwnedLiteralAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOwnedLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUSE.g:495:3: (otherlv_1= ',' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==14) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalUSE.g:496:4: otherlv_1= ','
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getOwnedLiteralAccess().getCommaKeyword_1());
                    			

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
    // $ANTLR end "ruleOwnedLiteral"


    // $ANTLR start "entryRuleClass"
    // InternalUSE.g:505:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalUSE.g:505:46: (iv_ruleClass= ruleClass EOF )
            // InternalUSE.g:506:2: iv_ruleClass= ruleClass EOF
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
    // InternalUSE.g:512:1: ruleClass returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? (otherlv_5= 'attributes' ( (lv_ownedAttribute_6_0= ruleAttribute ) )* )? ( (lv_ownedOperation_7_0= ruleOperationsBase ) )? ( (lv_constraints_8_0= ruleConstraintsBase ) )? otherlv_9= 'end' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        EObject lv_generalization_4_0 = null;

        EObject lv_ownedAttribute_6_0 = null;

        AntlrDatatypeRuleToken lv_ownedOperation_7_0 = null;

        EObject lv_constraints_8_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:518:2: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? (otherlv_5= 'attributes' ( (lv_ownedAttribute_6_0= ruleAttribute ) )* )? ( (lv_ownedOperation_7_0= ruleOperationsBase ) )? ( (lv_constraints_8_0= ruleConstraintsBase ) )? otherlv_9= 'end' ) )
            // InternalUSE.g:519:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? (otherlv_5= 'attributes' ( (lv_ownedAttribute_6_0= ruleAttribute ) )* )? ( (lv_ownedOperation_7_0= ruleOperationsBase ) )? ( (lv_constraints_8_0= ruleConstraintsBase ) )? otherlv_9= 'end' )
            {
            // InternalUSE.g:519:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? (otherlv_5= 'attributes' ( (lv_ownedAttribute_6_0= ruleAttribute ) )* )? ( (lv_ownedOperation_7_0= ruleOperationsBase ) )? ( (lv_constraints_8_0= ruleConstraintsBase ) )? otherlv_9= 'end' )
            // InternalUSE.g:520:3: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )? (otherlv_5= 'attributes' ( (lv_ownedAttribute_6_0= ruleAttribute ) )* )? ( (lv_ownedOperation_7_0= ruleOperationsBase ) )? ( (lv_constraints_8_0= ruleConstraintsBase ) )? otherlv_9= 'end'
            {
            // InternalUSE.g:520:3: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUSE.g:521:4: (lv_abstract_0_0= 'abstract' )
                    {
                    // InternalUSE.g:521:4: (lv_abstract_0_0= 'abstract' )
                    // InternalUSE.g:522:5: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,22,FOLLOW_12); 

                    					newLeafNode(lv_abstract_0_0, grammarAccess.getClassAccess().getAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassRule());
                    					}
                    					setWithLastConsumed(current, "abstract", lv_abstract_0_0 != null, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
            		
            // InternalUSE.g:538:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUSE.g:539:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUSE.g:539:4: (lv_name_2_0= RULE_ID )
            // InternalUSE.g:540:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            // InternalUSE.g:556:3: (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+ )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUSE.g:557:4: otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )+
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getClassAccess().getLessThanSignKeyword_3_0());
                    			
                    // InternalUSE.g:561:4: ( (lv_generalization_4_0= ruleGeneralization ) )+
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
                    	    // InternalUSE.g:562:5: (lv_generalization_4_0= ruleGeneralization )
                    	    {
                    	    // InternalUSE.g:562:5: (lv_generalization_4_0= ruleGeneralization )
                    	    // InternalUSE.g:563:6: lv_generalization_4_0= ruleGeneralization
                    	    {

                    	    						newCompositeNode(grammarAccess.getClassAccess().getGeneralizationGeneralizationParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
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

            // InternalUSE.g:581:3: (otherlv_5= 'attributes' ( (lv_ownedAttribute_6_0= ruleAttribute ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUSE.g:582:4: otherlv_5= 'attributes' ( (lv_ownedAttribute_6_0= ruleAttribute ) )*
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getClassAccess().getAttributesKeyword_4_0());
                    			
                    // InternalUSE.g:586:4: ( (lv_ownedAttribute_6_0= ruleAttribute ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==RULE_ID) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalUSE.g:587:5: (lv_ownedAttribute_6_0= ruleAttribute )
                    	    {
                    	    // InternalUSE.g:587:5: (lv_ownedAttribute_6_0= ruleAttribute )
                    	    // InternalUSE.g:588:6: lv_ownedAttribute_6_0= ruleAttribute
                    	    {

                    	    						newCompositeNode(grammarAccess.getClassAccess().getOwnedAttributeAttributeParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
                    	    lv_ownedAttribute_6_0=ruleAttribute();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getClassRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"ownedAttribute",
                    	    							lv_ownedAttribute_6_0,
                    	    							"modelConverter.use_language.USE.Attribute");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalUSE.g:606:3: ( (lv_ownedOperation_7_0= ruleOperationsBase ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUSE.g:607:4: (lv_ownedOperation_7_0= ruleOperationsBase )
                    {
                    // InternalUSE.g:607:4: (lv_ownedOperation_7_0= ruleOperationsBase )
                    // InternalUSE.g:608:5: lv_ownedOperation_7_0= ruleOperationsBase
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getOwnedOperationOperationsBaseParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_ownedOperation_7_0=ruleOperationsBase();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClassRule());
                    					}
                    					set(
                    						current,
                    						"ownedOperation",
                    						lv_ownedOperation_7_0,
                    						"modelConverter.use_language.USE.OperationsBase");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUSE.g:625:3: ( (lv_constraints_8_0= ruleConstraintsBase ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalUSE.g:626:4: (lv_constraints_8_0= ruleConstraintsBase )
                    {
                    // InternalUSE.g:626:4: (lv_constraints_8_0= ruleConstraintsBase )
                    // InternalUSE.g:627:5: lv_constraints_8_0= ruleConstraintsBase
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getConstraintsConstraintsBaseParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_constraints_8_0=ruleConstraintsBase();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClassRule());
                    					}
                    					set(
                    						current,
                    						"constraints",
                    						lv_constraints_8_0,
                    						"modelConverter.use_language.USE.ConstraintsBase");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getClassAccess().getEndKeyword_7());
            		

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


    // $ANTLR start "entryRuleAssociationClass"
    // InternalUSE.g:652:1: entryRuleAssociationClass returns [EObject current=null] : iv_ruleAssociationClass= ruleAssociationClass EOF ;
    public final EObject entryRuleAssociationClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationClass = null;


        try {
            // InternalUSE.g:652:57: (iv_ruleAssociationClass= ruleAssociationClass EOF )
            // InternalUSE.g:653:2: iv_ruleAssociationClass= ruleAssociationClass EOF
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
    // InternalUSE.g:659:1: ruleAssociationClass returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'associationclass' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )* )? otherlv_5= 'between' ( (lv_memberEnds_6_0= ruleMemberEnd ) )+ (otherlv_7= 'attributes' ( (lv_ownedAttribute_8_0= ruleAttribute ) )* )? (otherlv_9= 'operations' ( (lv_operations_10_0= ruleOperationType ) )* )? ( (lv_constraints_11_0= ruleConstraintsBase ) )? otherlv_12= 'end' ) ;
    public final EObject ruleAssociationClass() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        EObject lv_generalization_4_0 = null;

        EObject lv_memberEnds_6_0 = null;

        EObject lv_ownedAttribute_8_0 = null;

        EObject lv_operations_10_0 = null;

        EObject lv_constraints_11_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:665:2: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'associationclass' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )* )? otherlv_5= 'between' ( (lv_memberEnds_6_0= ruleMemberEnd ) )+ (otherlv_7= 'attributes' ( (lv_ownedAttribute_8_0= ruleAttribute ) )* )? (otherlv_9= 'operations' ( (lv_operations_10_0= ruleOperationType ) )* )? ( (lv_constraints_11_0= ruleConstraintsBase ) )? otherlv_12= 'end' ) )
            // InternalUSE.g:666:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'associationclass' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )* )? otherlv_5= 'between' ( (lv_memberEnds_6_0= ruleMemberEnd ) )+ (otherlv_7= 'attributes' ( (lv_ownedAttribute_8_0= ruleAttribute ) )* )? (otherlv_9= 'operations' ( (lv_operations_10_0= ruleOperationType ) )* )? ( (lv_constraints_11_0= ruleConstraintsBase ) )? otherlv_12= 'end' )
            {
            // InternalUSE.g:666:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'associationclass' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )* )? otherlv_5= 'between' ( (lv_memberEnds_6_0= ruleMemberEnd ) )+ (otherlv_7= 'attributes' ( (lv_ownedAttribute_8_0= ruleAttribute ) )* )? (otherlv_9= 'operations' ( (lv_operations_10_0= ruleOperationType ) )* )? ( (lv_constraints_11_0= ruleConstraintsBase ) )? otherlv_12= 'end' )
            // InternalUSE.g:667:3: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'associationclass' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )* )? otherlv_5= 'between' ( (lv_memberEnds_6_0= ruleMemberEnd ) )+ (otherlv_7= 'attributes' ( (lv_ownedAttribute_8_0= ruleAttribute ) )* )? (otherlv_9= 'operations' ( (lv_operations_10_0= ruleOperationType ) )* )? ( (lv_constraints_11_0= ruleConstraintsBase ) )? otherlv_12= 'end'
            {
            // InternalUSE.g:667:3: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==22) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUSE.g:668:4: (lv_abstract_0_0= 'abstract' )
                    {
                    // InternalUSE.g:668:4: (lv_abstract_0_0= 'abstract' )
                    // InternalUSE.g:669:5: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,22,FOLLOW_18); 

                    					newLeafNode(lv_abstract_0_0, grammarAccess.getAssociationClassAccess().getAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAssociationClassRule());
                    					}
                    					setWithLastConsumed(current, "abstract", lv_abstract_0_0 != null, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationClassAccess().getAssociationclassKeyword_1());
            		
            // InternalUSE.g:685:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUSE.g:686:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUSE.g:686:4: (lv_name_2_0= RULE_ID )
            // InternalUSE.g:687:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            // InternalUSE.g:703:3: (otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==24) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalUSE.g:704:4: otherlv_3= '<' ( (lv_generalization_4_0= ruleGeneralization ) )*
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_20); 

                    				newLeafNode(otherlv_3, grammarAccess.getAssociationClassAccess().getLessThanSignKeyword_3_0());
                    			
                    // InternalUSE.g:708:4: ( (lv_generalization_4_0= ruleGeneralization ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==RULE_ID) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalUSE.g:709:5: (lv_generalization_4_0= ruleGeneralization )
                    	    {
                    	    // InternalUSE.g:709:5: (lv_generalization_4_0= ruleGeneralization )
                    	    // InternalUSE.g:710:6: lv_generalization_4_0= ruleGeneralization
                    	    {

                    	    						newCompositeNode(grammarAccess.getAssociationClassAccess().getGeneralizationGeneralizationParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_20);
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
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getAssociationClassAccess().getBetweenKeyword_4());
            		
            // InternalUSE.g:732:3: ( (lv_memberEnds_6_0= ruleMemberEnd ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalUSE.g:733:4: (lv_memberEnds_6_0= ruleMemberEnd )
            	    {
            	    // InternalUSE.g:733:4: (lv_memberEnds_6_0= ruleMemberEnd )
            	    // InternalUSE.g:734:5: lv_memberEnds_6_0= ruleMemberEnd
            	    {

            	    					newCompositeNode(grammarAccess.getAssociationClassAccess().getMemberEndsMemberEndParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_memberEnds_6_0=ruleMemberEnd();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAssociationClassRule());
            	    					}
            	    					add(
            	    						current,
            	    						"memberEnds",
            	    						lv_memberEnds_6_0,
            	    						"modelConverter.use_language.USE.MemberEnd");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);

            // InternalUSE.g:751:3: (otherlv_7= 'attributes' ( (lv_ownedAttribute_8_0= ruleAttribute ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==25) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalUSE.g:752:4: otherlv_7= 'attributes' ( (lv_ownedAttribute_8_0= ruleAttribute ) )*
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_15); 

                    				newLeafNode(otherlv_7, grammarAccess.getAssociationClassAccess().getAttributesKeyword_6_0());
                    			
                    // InternalUSE.g:756:4: ( (lv_ownedAttribute_8_0= ruleAttribute ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==RULE_ID) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalUSE.g:757:5: (lv_ownedAttribute_8_0= ruleAttribute )
                    	    {
                    	    // InternalUSE.g:757:5: (lv_ownedAttribute_8_0= ruleAttribute )
                    	    // InternalUSE.g:758:6: lv_ownedAttribute_8_0= ruleAttribute
                    	    {

                    	    						newCompositeNode(grammarAccess.getAssociationClassAccess().getOwnedAttributeAttributeParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
                    	    lv_ownedAttribute_8_0=ruleAttribute();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAssociationClassRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"ownedAttribute",
                    	    							lv_ownedAttribute_8_0,
                    	    							"modelConverter.use_language.USE.Attribute");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalUSE.g:776:3: (otherlv_9= 'operations' ( (lv_operations_10_0= ruleOperationType ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==29) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUSE.g:777:4: otherlv_9= 'operations' ( (lv_operations_10_0= ruleOperationType ) )*
                    {
                    otherlv_9=(Token)match(input,29,FOLLOW_21); 

                    				newLeafNode(otherlv_9, grammarAccess.getAssociationClassAccess().getOperationsKeyword_7_0());
                    			
                    // InternalUSE.g:781:4: ( (lv_operations_10_0= ruleOperationType ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==RULE_ID) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalUSE.g:782:5: (lv_operations_10_0= ruleOperationType )
                    	    {
                    	    // InternalUSE.g:782:5: (lv_operations_10_0= ruleOperationType )
                    	    // InternalUSE.g:783:6: lv_operations_10_0= ruleOperationType
                    	    {

                    	    						newCompositeNode(grammarAccess.getAssociationClassAccess().getOperationsOperationTypeParserRuleCall_7_1_0());
                    	    					
                    	    pushFollow(FOLLOW_21);
                    	    lv_operations_10_0=ruleOperationType();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAssociationClassRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"operations",
                    	    							lv_operations_10_0,
                    	    							"modelConverter.use_language.USE.OperationType");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalUSE.g:801:3: ( (lv_constraints_11_0= ruleConstraintsBase ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==42) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalUSE.g:802:4: (lv_constraints_11_0= ruleConstraintsBase )
                    {
                    // InternalUSE.g:802:4: (lv_constraints_11_0= ruleConstraintsBase )
                    // InternalUSE.g:803:5: lv_constraints_11_0= ruleConstraintsBase
                    {

                    					newCompositeNode(grammarAccess.getAssociationClassAccess().getConstraintsConstraintsBaseParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_constraints_11_0=ruleConstraintsBase();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAssociationClassRule());
                    					}
                    					set(
                    						current,
                    						"constraints",
                    						lv_constraints_11_0,
                    						"modelConverter.use_language.USE.ConstraintsBase");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getAssociationClassAccess().getEndKeyword_9());
            		

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


    // $ANTLR start "entryRuleGeneralization"
    // InternalUSE.g:828:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalUSE.g:828:55: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalUSE.g:829:2: iv_ruleGeneralization= ruleGeneralization EOF
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
    // InternalUSE.g:835:1: ruleGeneralization returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUSE.g:841:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? ) )
            // InternalUSE.g:842:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? )
            {
            // InternalUSE.g:842:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? )
            // InternalUSE.g:843:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )?
            {
            // InternalUSE.g:843:3: ( (otherlv_0= RULE_ID ) )
            // InternalUSE.g:844:4: (otherlv_0= RULE_ID )
            {
            // InternalUSE.g:844:4: (otherlv_0= RULE_ID )
            // InternalUSE.g:845:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getGeneralizationAccess().getGeneralAllClassCrossReference_0_0());
            				

            }


            }

            // InternalUSE.g:856:3: (otherlv_1= ',' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==14) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalUSE.g:857:4: otherlv_1= ','
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
    // InternalUSE.g:866:1: entryRuleSimpleTypes returns [EObject current=null] : iv_ruleSimpleTypes= ruleSimpleTypes EOF ;
    public final EObject entryRuleSimpleTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleTypes = null;


        try {
            // InternalUSE.g:866:52: (iv_ruleSimpleTypes= ruleSimpleTypes EOF )
            // InternalUSE.g:867:2: iv_ruleSimpleTypes= ruleSimpleTypes EOF
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
    // InternalUSE.g:873:1: ruleSimpleTypes returns [EObject current=null] : ( ruleDefaultType | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleSimpleTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUSE.g:879:2: ( ( ruleDefaultType | ( (otherlv_1= RULE_ID ) ) ) )
            // InternalUSE.g:880:2: ( ruleDefaultType | ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalUSE.g:880:2: ( ruleDefaultType | ( (otherlv_1= RULE_ID ) ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=15 && LA34_0<=18)) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_ID) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalUSE.g:881:3: ruleDefaultType
                    {

                    			newCompositeNode(grammarAccess.getSimpleTypesAccess().getDefaultTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    ruleDefaultType();

                    state._fsp--;


                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUSE.g:889:3: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalUSE.g:889:3: ( (otherlv_1= RULE_ID ) )
                    // InternalUSE.g:890:4: (otherlv_1= RULE_ID )
                    {
                    // InternalUSE.g:890:4: (otherlv_1= RULE_ID )
                    // InternalUSE.g:891:5: otherlv_1= RULE_ID
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
    // InternalUSE.g:906:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalUSE.g:906:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalUSE.g:907:2: iv_ruleAssociation= ruleAssociation EOF
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
    // InternalUSE.g:913:1: ruleAssociation returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'between' ( (lv_memberEnds_2_0= ruleMemberEnd ) )+ ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_memberEnds_2_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:919:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'between' ( (lv_memberEnds_2_0= ruleMemberEnd ) )+ ) )
            // InternalUSE.g:920:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'between' ( (lv_memberEnds_2_0= ruleMemberEnd ) )+ )
            {
            // InternalUSE.g:920:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'between' ( (lv_memberEnds_2_0= ruleMemberEnd ) )+ )
            // InternalUSE.g:921:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'between' ( (lv_memberEnds_2_0= ruleMemberEnd ) )+
            {
            // InternalUSE.g:921:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUSE.g:922:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUSE.g:922:4: (lv_name_0_0= RULE_ID )
            // InternalUSE.g:923:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationAccess().getBetweenKeyword_1());
            		
            // InternalUSE.g:943:3: ( (lv_memberEnds_2_0= ruleMemberEnd ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalUSE.g:944:4: (lv_memberEnds_2_0= ruleMemberEnd )
            	    {
            	    // InternalUSE.g:944:4: (lv_memberEnds_2_0= ruleMemberEnd )
            	    // InternalUSE.g:945:5: lv_memberEnds_2_0= ruleMemberEnd
            	    {

            	    					newCompositeNode(grammarAccess.getAssociationAccess().getMemberEndsMemberEndParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_memberEnds_2_0=ruleMemberEnd();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAssociationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"memberEnds",
            	    						lv_memberEnds_2_0,
            	    						"modelConverter.use_language.USE.MemberEnd");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
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
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleMemberEnd"
    // InternalUSE.g:966:1: entryRuleMemberEnd returns [EObject current=null] : iv_ruleMemberEnd= ruleMemberEnd EOF ;
    public final EObject entryRuleMemberEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberEnd = null;


        try {
            // InternalUSE.g:966:50: (iv_ruleMemberEnd= ruleMemberEnd EOF )
            // InternalUSE.g:967:2: iv_ruleMemberEnd= ruleMemberEnd EOF
            {
             newCompositeNode(grammarAccess.getMemberEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMemberEnd=ruleMemberEnd();

            state._fsp--;

             current =iv_ruleMemberEnd; 
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
    // $ANTLR end "entryRuleMemberEnd"


    // $ANTLR start "ruleMemberEnd"
    // InternalUSE.g:973:1: ruleMemberEnd returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_mul_2_0= ruleMultiplicity ) ) otherlv_3= ']' (otherlv_4= 'role' ( (lv_role_5_0= RULE_ID ) ) )? ( (lv_ordered_6_0= 'ordered' ) )? ) ;
    public final EObject ruleMemberEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_role_5_0=null;
        Token lv_ordered_6_0=null;
        AntlrDatatypeRuleToken lv_mul_2_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:979:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_mul_2_0= ruleMultiplicity ) ) otherlv_3= ']' (otherlv_4= 'role' ( (lv_role_5_0= RULE_ID ) ) )? ( (lv_ordered_6_0= 'ordered' ) )? ) )
            // InternalUSE.g:980:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_mul_2_0= ruleMultiplicity ) ) otherlv_3= ']' (otherlv_4= 'role' ( (lv_role_5_0= RULE_ID ) ) )? ( (lv_ordered_6_0= 'ordered' ) )? )
            {
            // InternalUSE.g:980:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_mul_2_0= ruleMultiplicity ) ) otherlv_3= ']' (otherlv_4= 'role' ( (lv_role_5_0= RULE_ID ) ) )? ( (lv_ordered_6_0= 'ordered' ) )? )
            // InternalUSE.g:981:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_mul_2_0= ruleMultiplicity ) ) otherlv_3= ']' (otherlv_4= 'role' ( (lv_role_5_0= RULE_ID ) ) )? ( (lv_ordered_6_0= 'ordered' ) )?
            {
            // InternalUSE.g:981:3: ( (otherlv_0= RULE_ID ) )
            // InternalUSE.g:982:4: (otherlv_0= RULE_ID )
            {
            // InternalUSE.g:982:4: (otherlv_0= RULE_ID )
            // InternalUSE.g:983:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemberEndRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_0, grammarAccess.getMemberEndAccess().getTypeAllClassCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getMemberEndAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalUSE.g:998:3: ( (lv_mul_2_0= ruleMultiplicity ) )
            // InternalUSE.g:999:4: (lv_mul_2_0= ruleMultiplicity )
            {
            // InternalUSE.g:999:4: (lv_mul_2_0= ruleMultiplicity )
            // InternalUSE.g:1000:5: lv_mul_2_0= ruleMultiplicity
            {

            					newCompositeNode(grammarAccess.getMemberEndAccess().getMulMultiplicityParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
            lv_mul_2_0=ruleMultiplicity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMemberEndRule());
            					}
            					set(
            						current,
            						"mul",
            						lv_mul_2_0,
            						"modelConverter.use_language.USE.Multiplicity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getMemberEndAccess().getRightSquareBracketKeyword_3());
            		
            // InternalUSE.g:1021:3: (otherlv_4= 'role' ( (lv_role_5_0= RULE_ID ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==32) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalUSE.g:1022:4: otherlv_4= 'role' ( (lv_role_5_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getMemberEndAccess().getRoleKeyword_4_0());
                    			
                    // InternalUSE.g:1026:4: ( (lv_role_5_0= RULE_ID ) )
                    // InternalUSE.g:1027:5: (lv_role_5_0= RULE_ID )
                    {
                    // InternalUSE.g:1027:5: (lv_role_5_0= RULE_ID )
                    // InternalUSE.g:1028:6: lv_role_5_0= RULE_ID
                    {
                    lv_role_5_0=(Token)match(input,RULE_ID,FOLLOW_27); 

                    						newLeafNode(lv_role_5_0, grammarAccess.getMemberEndAccess().getRoleIDTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMemberEndRule());
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

            // InternalUSE.g:1045:3: ( (lv_ordered_6_0= 'ordered' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==33) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalUSE.g:1046:4: (lv_ordered_6_0= 'ordered' )
                    {
                    // InternalUSE.g:1046:4: (lv_ordered_6_0= 'ordered' )
                    // InternalUSE.g:1047:5: lv_ordered_6_0= 'ordered'
                    {
                    lv_ordered_6_0=(Token)match(input,33,FOLLOW_2); 

                    					newLeafNode(lv_ordered_6_0, grammarAccess.getMemberEndAccess().getOrderedOrderedKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMemberEndRule());
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
    // $ANTLR end "ruleMemberEnd"


    // $ANTLR start "entryRuleAssociationBasic"
    // InternalUSE.g:1063:1: entryRuleAssociationBasic returns [EObject current=null] : iv_ruleAssociationBasic= ruleAssociationBasic EOF ;
    public final EObject entryRuleAssociationBasic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationBasic = null;


        try {
            // InternalUSE.g:1063:57: (iv_ruleAssociationBasic= ruleAssociationBasic EOF )
            // InternalUSE.g:1064:2: iv_ruleAssociationBasic= ruleAssociationBasic EOF
            {
             newCompositeNode(grammarAccess.getAssociationBasicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociationBasic=ruleAssociationBasic();

            state._fsp--;

             current =iv_ruleAssociationBasic; 
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
    // $ANTLR end "entryRuleAssociationBasic"


    // $ANTLR start "ruleAssociationBasic"
    // InternalUSE.g:1070:1: ruleAssociationBasic returns [EObject current=null] : (otherlv_0= 'association' this_Association_1= ruleAssociation otherlv_2= 'end' ) ;
    public final EObject ruleAssociationBasic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Association_1 = null;



        	enterRule();

        try {
            // InternalUSE.g:1076:2: ( (otherlv_0= 'association' this_Association_1= ruleAssociation otherlv_2= 'end' ) )
            // InternalUSE.g:1077:2: (otherlv_0= 'association' this_Association_1= ruleAssociation otherlv_2= 'end' )
            {
            // InternalUSE.g:1077:2: (otherlv_0= 'association' this_Association_1= ruleAssociation otherlv_2= 'end' )
            // InternalUSE.g:1078:3: otherlv_0= 'association' this_Association_1= ruleAssociation otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAssociationBasicAccess().getAssociationKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAssociationBasicAccess().getAssociationParserRuleCall_1());
            		
            pushFollow(FOLLOW_17);
            this_Association_1=ruleAssociation();

            state._fsp--;


            			current = this_Association_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getAssociationBasicAccess().getEndKeyword_2());
            		

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
    // $ANTLR end "ruleAssociationBasic"


    // $ANTLR start "entryRuleAggregation"
    // InternalUSE.g:1098:1: entryRuleAggregation returns [EObject current=null] : iv_ruleAggregation= ruleAggregation EOF ;
    public final EObject entryRuleAggregation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregation = null;


        try {
            // InternalUSE.g:1098:52: (iv_ruleAggregation= ruleAggregation EOF )
            // InternalUSE.g:1099:2: iv_ruleAggregation= ruleAggregation EOF
            {
             newCompositeNode(grammarAccess.getAggregationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAggregation=ruleAggregation();

            state._fsp--;

             current =iv_ruleAggregation; 
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
    // $ANTLR end "entryRuleAggregation"


    // $ANTLR start "ruleAggregation"
    // InternalUSE.g:1105:1: ruleAggregation returns [EObject current=null] : (otherlv_0= 'aggregation' this_Association_1= ruleAssociation otherlv_2= 'end' ) ;
    public final EObject ruleAggregation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Association_1 = null;



        	enterRule();

        try {
            // InternalUSE.g:1111:2: ( (otherlv_0= 'aggregation' this_Association_1= ruleAssociation otherlv_2= 'end' ) )
            // InternalUSE.g:1112:2: (otherlv_0= 'aggregation' this_Association_1= ruleAssociation otherlv_2= 'end' )
            {
            // InternalUSE.g:1112:2: (otherlv_0= 'aggregation' this_Association_1= ruleAssociation otherlv_2= 'end' )
            // InternalUSE.g:1113:3: otherlv_0= 'aggregation' this_Association_1= ruleAssociation otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAggregationAccess().getAggregationKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAggregationAccess().getAssociationParserRuleCall_1());
            		
            pushFollow(FOLLOW_17);
            this_Association_1=ruleAssociation();

            state._fsp--;


            			current = this_Association_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getAggregationAccess().getEndKeyword_2());
            		

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
    // $ANTLR end "ruleAggregation"


    // $ANTLR start "entryRuleComposition"
    // InternalUSE.g:1133:1: entryRuleComposition returns [EObject current=null] : iv_ruleComposition= ruleComposition EOF ;
    public final EObject entryRuleComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComposition = null;


        try {
            // InternalUSE.g:1133:52: (iv_ruleComposition= ruleComposition EOF )
            // InternalUSE.g:1134:2: iv_ruleComposition= ruleComposition EOF
            {
             newCompositeNode(grammarAccess.getCompositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComposition=ruleComposition();

            state._fsp--;

             current =iv_ruleComposition; 
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
    // $ANTLR end "entryRuleComposition"


    // $ANTLR start "ruleComposition"
    // InternalUSE.g:1140:1: ruleComposition returns [EObject current=null] : (otherlv_0= 'composition' this_Association_1= ruleAssociation otherlv_2= 'end' ) ;
    public final EObject ruleComposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Association_1 = null;



        	enterRule();

        try {
            // InternalUSE.g:1146:2: ( (otherlv_0= 'composition' this_Association_1= ruleAssociation otherlv_2= 'end' ) )
            // InternalUSE.g:1147:2: (otherlv_0= 'composition' this_Association_1= ruleAssociation otherlv_2= 'end' )
            {
            // InternalUSE.g:1147:2: (otherlv_0= 'composition' this_Association_1= ruleAssociation otherlv_2= 'end' )
            // InternalUSE.g:1148:3: otherlv_0= 'composition' this_Association_1= ruleAssociation otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCompositionAccess().getCompositionKeyword_0());
            		

            			newCompositeNode(grammarAccess.getCompositionAccess().getAssociationParserRuleCall_1());
            		
            pushFollow(FOLLOW_17);
            this_Association_1=ruleAssociation();

            state._fsp--;


            			current = this_Association_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getCompositionAccess().getEndKeyword_2());
            		

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
    // $ANTLR end "ruleComposition"


    // $ANTLR start "entryRuleAttribute"
    // InternalUSE.g:1168:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalUSE.g:1168:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalUSE.g:1169:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalUSE.g:1175:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleSimpleTypes ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1181:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleSimpleTypes ) ) ) )
            // InternalUSE.g:1182:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleSimpleTypes ) ) )
            {
            // InternalUSE.g:1182:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleSimpleTypes ) ) )
            // InternalUSE.g:1183:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleSimpleTypes ) )
            {
            // InternalUSE.g:1183:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUSE.g:1184:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUSE.g:1184:4: (lv_name_0_0= RULE_ID )
            // InternalUSE.g:1185:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_28); 

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

            otherlv_1=(Token)match(input,37,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
            		
            // InternalUSE.g:1205:3: ( (lv_type_2_0= ruleSimpleTypes ) )
            // InternalUSE.g:1206:4: (lv_type_2_0= ruleSimpleTypes )
            {
            // InternalUSE.g:1206:4: (lv_type_2_0= ruleSimpleTypes )
            // InternalUSE.g:1207:5: lv_type_2_0= ruleSimpleTypes
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
    // InternalUSE.g:1228:1: entryRuleOperationsBase returns [String current=null] : iv_ruleOperationsBase= ruleOperationsBase EOF ;
    public final String entryRuleOperationsBase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperationsBase = null;


        try {
            // InternalUSE.g:1228:54: (iv_ruleOperationsBase= ruleOperationsBase EOF )
            // InternalUSE.g:1229:2: iv_ruleOperationsBase= ruleOperationsBase EOF
            {
             newCompositeNode(grammarAccess.getOperationsBaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationsBase=ruleOperationsBase();

            state._fsp--;

             current =iv_ruleOperationsBase.getText(); 
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
    // InternalUSE.g:1235:1: ruleOperationsBase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'operations' ;
    public final AntlrDatatypeRuleToken ruleOperationsBase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUSE.g:1241:2: (kw= 'operations' )
            // InternalUSE.g:1242:2: kw= 'operations'
            {
            kw=(Token)match(input,29,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getOperationsBaseAccess().getOperationsKeyword());
            	

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
    // InternalUSE.g:1250:1: entryRuleOperationType returns [EObject current=null] : iv_ruleOperationType= ruleOperationType EOF ;
    public final EObject entryRuleOperationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationType = null;


        try {
            // InternalUSE.g:1250:54: (iv_ruleOperationType= ruleOperationType EOF )
            // InternalUSE.g:1251:2: iv_ruleOperationType= ruleOperationType EOF
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
    // InternalUSE.g:1257:1: ruleOperationType returns [EObject current=null] : (this_OperationBasic_0= ruleOperationBasic | this_OperationComplex_1= ruleOperationComplex ) ;
    public final EObject ruleOperationType() throws RecognitionException {
        EObject current = null;

        EObject this_OperationBasic_0 = null;

        EObject this_OperationComplex_1 = null;



        	enterRule();

        try {
            // InternalUSE.g:1263:2: ( (this_OperationBasic_0= ruleOperationBasic | this_OperationComplex_1= ruleOperationComplex ) )
            // InternalUSE.g:1264:2: (this_OperationBasic_0= ruleOperationBasic | this_OperationComplex_1= ruleOperationComplex )
            {
            // InternalUSE.g:1264:2: (this_OperationBasic_0= ruleOperationBasic | this_OperationComplex_1= ruleOperationComplex )
            int alt38=2;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // InternalUSE.g:1265:3: this_OperationBasic_0= ruleOperationBasic
                    {

                    			newCompositeNode(grammarAccess.getOperationTypeAccess().getOperationBasicParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationBasic_0=ruleOperationBasic();

                    state._fsp--;


                    			current = this_OperationBasic_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUSE.g:1274:3: this_OperationComplex_1= ruleOperationComplex
                    {

                    			newCompositeNode(grammarAccess.getOperationTypeAccess().getOperationComplexParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationComplex_1=ruleOperationComplex();

                    state._fsp--;


                    			current = this_OperationComplex_1;
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


    // $ANTLR start "entryRuleOperationBasic"
    // InternalUSE.g:1286:1: entryRuleOperationBasic returns [EObject current=null] : iv_ruleOperationBasic= ruleOperationBasic EOF ;
    public final EObject entryRuleOperationBasic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationBasic = null;


        try {
            // InternalUSE.g:1286:55: (iv_ruleOperationBasic= ruleOperationBasic EOF )
            // InternalUSE.g:1287:2: iv_ruleOperationBasic= ruleOperationBasic EOF
            {
             newCompositeNode(grammarAccess.getOperationBasicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationBasic=ruleOperationBasic();

            state._fsp--;

             current =iv_ruleOperationBasic; 
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
    // $ANTLR end "entryRuleOperationBasic"


    // $ANTLR start "ruleOperationBasic"
    // InternalUSE.g:1293:1: ruleOperationBasic returns [EObject current=null] : (this_OperationDeclaration_0= ruleOperationDeclaration (otherlv_1= '=' ( (lv_oclexpression_2_0= ruleOCLExpression ) ) )? ( (lv_conditions_3_0= ruleConditionType ) )* ) ;
    public final EObject ruleOperationBasic() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_OperationDeclaration_0 = null;

        AntlrDatatypeRuleToken lv_oclexpression_2_0 = null;

        EObject lv_conditions_3_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1299:2: ( (this_OperationDeclaration_0= ruleOperationDeclaration (otherlv_1= '=' ( (lv_oclexpression_2_0= ruleOCLExpression ) ) )? ( (lv_conditions_3_0= ruleConditionType ) )* ) )
            // InternalUSE.g:1300:2: (this_OperationDeclaration_0= ruleOperationDeclaration (otherlv_1= '=' ( (lv_oclexpression_2_0= ruleOCLExpression ) ) )? ( (lv_conditions_3_0= ruleConditionType ) )* )
            {
            // InternalUSE.g:1300:2: (this_OperationDeclaration_0= ruleOperationDeclaration (otherlv_1= '=' ( (lv_oclexpression_2_0= ruleOCLExpression ) ) )? ( (lv_conditions_3_0= ruleConditionType ) )* )
            // InternalUSE.g:1301:3: this_OperationDeclaration_0= ruleOperationDeclaration (otherlv_1= '=' ( (lv_oclexpression_2_0= ruleOCLExpression ) ) )? ( (lv_conditions_3_0= ruleConditionType ) )*
            {

            			newCompositeNode(grammarAccess.getOperationBasicAccess().getOperationDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_OperationDeclaration_0=ruleOperationDeclaration();

            state._fsp--;


            			current = this_OperationDeclaration_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalUSE.g:1309:3: (otherlv_1= '=' ( (lv_oclexpression_2_0= ruleOCLExpression ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==38) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalUSE.g:1310:4: otherlv_1= '=' ( (lv_oclexpression_2_0= ruleOCLExpression ) )
                    {
                    otherlv_1=(Token)match(input,38,FOLLOW_31); 

                    				newLeafNode(otherlv_1, grammarAccess.getOperationBasicAccess().getEqualsSignKeyword_1_0());
                    			
                    // InternalUSE.g:1314:4: ( (lv_oclexpression_2_0= ruleOCLExpression ) )
                    // InternalUSE.g:1315:5: (lv_oclexpression_2_0= ruleOCLExpression )
                    {
                    // InternalUSE.g:1315:5: (lv_oclexpression_2_0= ruleOCLExpression )
                    // InternalUSE.g:1316:6: lv_oclexpression_2_0= ruleOCLExpression
                    {

                    						newCompositeNode(grammarAccess.getOperationBasicAccess().getOclexpressionOCLExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_oclexpression_2_0=ruleOCLExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperationBasicRule());
                    						}
                    						set(
                    							current,
                    							"oclexpression",
                    							lv_oclexpression_2_0,
                    							"modelConverter.use_language.USE.OCLExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUSE.g:1334:3: ( (lv_conditions_3_0= ruleConditionType ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=46 && LA40_0<=47)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalUSE.g:1335:4: (lv_conditions_3_0= ruleConditionType )
            	    {
            	    // InternalUSE.g:1335:4: (lv_conditions_3_0= ruleConditionType )
            	    // InternalUSE.g:1336:5: lv_conditions_3_0= ruleConditionType
            	    {

            	    					newCompositeNode(grammarAccess.getOperationBasicAccess().getConditionsConditionTypeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_conditions_3_0=ruleConditionType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOperationBasicRule());
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
    // $ANTLR end "ruleOperationBasic"


    // $ANTLR start "entryRuleOperationComplex"
    // InternalUSE.g:1357:1: entryRuleOperationComplex returns [EObject current=null] : iv_ruleOperationComplex= ruleOperationComplex EOF ;
    public final EObject entryRuleOperationComplex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationComplex = null;


        try {
            // InternalUSE.g:1357:57: (iv_ruleOperationComplex= ruleOperationComplex EOF )
            // InternalUSE.g:1358:2: iv_ruleOperationComplex= ruleOperationComplex EOF
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
    // InternalUSE.g:1364:1: ruleOperationComplex returns [EObject current=null] : (this_OperationDeclaration_0= ruleOperationDeclaration otherlv_1= 'begin' ( (lv_operationbody_2_0= ruleOCLExpression ) )? otherlv_3= 'end' ( (lv_conditions_4_0= ruleConditionType ) )* ) ;
    public final EObject ruleOperationComplex() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_OperationDeclaration_0 = null;

        AntlrDatatypeRuleToken lv_operationbody_2_0 = null;

        EObject lv_conditions_4_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1370:2: ( (this_OperationDeclaration_0= ruleOperationDeclaration otherlv_1= 'begin' ( (lv_operationbody_2_0= ruleOCLExpression ) )? otherlv_3= 'end' ( (lv_conditions_4_0= ruleConditionType ) )* ) )
            // InternalUSE.g:1371:2: (this_OperationDeclaration_0= ruleOperationDeclaration otherlv_1= 'begin' ( (lv_operationbody_2_0= ruleOCLExpression ) )? otherlv_3= 'end' ( (lv_conditions_4_0= ruleConditionType ) )* )
            {
            // InternalUSE.g:1371:2: (this_OperationDeclaration_0= ruleOperationDeclaration otherlv_1= 'begin' ( (lv_operationbody_2_0= ruleOCLExpression ) )? otherlv_3= 'end' ( (lv_conditions_4_0= ruleConditionType ) )* )
            // InternalUSE.g:1372:3: this_OperationDeclaration_0= ruleOperationDeclaration otherlv_1= 'begin' ( (lv_operationbody_2_0= ruleOCLExpression ) )? otherlv_3= 'end' ( (lv_conditions_4_0= ruleConditionType ) )*
            {

            			newCompositeNode(grammarAccess.getOperationComplexAccess().getOperationDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            this_OperationDeclaration_0=ruleOperationDeclaration();

            state._fsp--;


            			current = this_OperationDeclaration_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,39,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationComplexAccess().getBeginKeyword_1());
            		
            // InternalUSE.g:1384:3: ( (lv_operationbody_2_0= ruleOCLExpression ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_STRING) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalUSE.g:1385:4: (lv_operationbody_2_0= ruleOCLExpression )
                    {
                    // InternalUSE.g:1385:4: (lv_operationbody_2_0= ruleOCLExpression )
                    // InternalUSE.g:1386:5: lv_operationbody_2_0= ruleOCLExpression
                    {

                    					newCompositeNode(grammarAccess.getOperationComplexAccess().getOperationbodyOCLExpressionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_17);
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

            otherlv_3=(Token)match(input,26,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationComplexAccess().getEndKeyword_3());
            		
            // InternalUSE.g:1407:3: ( (lv_conditions_4_0= ruleConditionType ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=46 && LA42_0<=47)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalUSE.g:1408:4: (lv_conditions_4_0= ruleConditionType )
            	    {
            	    // InternalUSE.g:1408:4: (lv_conditions_4_0= ruleConditionType )
            	    // InternalUSE.g:1409:5: lv_conditions_4_0= ruleConditionType
            	    {

            	    					newCompositeNode(grammarAccess.getOperationComplexAccess().getConditionsConditionTypeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_32);
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
    // InternalUSE.g:1430:1: entryRuleOperationDeclaration returns [EObject current=null] : iv_ruleOperationDeclaration= ruleOperationDeclaration EOF ;
    public final EObject entryRuleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDeclaration = null;


        try {
            // InternalUSE.g:1430:61: (iv_ruleOperationDeclaration= ruleOperationDeclaration EOF )
            // InternalUSE.g:1431:2: iv_ruleOperationDeclaration= ruleOperationDeclaration EOF
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
    // InternalUSE.g:1437:1: ruleOperationDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_ownedParameter_2_0= ruleOwnedParameter ) )* otherlv_3= ')' (otherlv_4= ':' ( (lv_returnType_5_0= ruleSimpleTypes ) ) )? ) ;
    public final EObject ruleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_ownedParameter_2_0 = null;

        EObject lv_returnType_5_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1443:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_ownedParameter_2_0= ruleOwnedParameter ) )* otherlv_3= ')' (otherlv_4= ':' ( (lv_returnType_5_0= ruleSimpleTypes ) ) )? ) )
            // InternalUSE.g:1444:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_ownedParameter_2_0= ruleOwnedParameter ) )* otherlv_3= ')' (otherlv_4= ':' ( (lv_returnType_5_0= ruleSimpleTypes ) ) )? )
            {
            // InternalUSE.g:1444:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_ownedParameter_2_0= ruleOwnedParameter ) )* otherlv_3= ')' (otherlv_4= ':' ( (lv_returnType_5_0= ruleSimpleTypes ) ) )? )
            // InternalUSE.g:1445:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_ownedParameter_2_0= ruleOwnedParameter ) )* otherlv_3= ')' (otherlv_4= ':' ( (lv_returnType_5_0= ruleSimpleTypes ) ) )?
            {
            // InternalUSE.g:1445:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUSE.g:1446:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUSE.g:1446:4: (lv_name_0_0= RULE_ID )
            // InternalUSE.g:1447:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_35); 

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

            otherlv_1=(Token)match(input,40,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationDeclarationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalUSE.g:1467:3: ( (lv_ownedParameter_2_0= ruleOwnedParameter ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalUSE.g:1468:4: (lv_ownedParameter_2_0= ruleOwnedParameter )
            	    {
            	    // InternalUSE.g:1468:4: (lv_ownedParameter_2_0= ruleOwnedParameter )
            	    // InternalUSE.g:1469:5: lv_ownedParameter_2_0= ruleOwnedParameter
            	    {

            	    					newCompositeNode(grammarAccess.getOperationDeclarationAccess().getOwnedParameterOwnedParameterParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_36);
            	    lv_ownedParameter_2_0=ruleOwnedParameter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOperationDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedParameter",
            	    						lv_ownedParameter_2_0,
            	    						"modelConverter.use_language.USE.OwnedParameter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            otherlv_3=(Token)match(input,41,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationDeclarationAccess().getRightParenthesisKeyword_3());
            		
            // InternalUSE.g:1490:3: (otherlv_4= ':' ( (lv_returnType_5_0= ruleSimpleTypes ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==37) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalUSE.g:1491:4: otherlv_4= ':' ( (lv_returnType_5_0= ruleSimpleTypes ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_29); 

                    				newLeafNode(otherlv_4, grammarAccess.getOperationDeclarationAccess().getColonKeyword_4_0());
                    			
                    // InternalUSE.g:1495:4: ( (lv_returnType_5_0= ruleSimpleTypes ) )
                    // InternalUSE.g:1496:5: (lv_returnType_5_0= ruleSimpleTypes )
                    {
                    // InternalUSE.g:1496:5: (lv_returnType_5_0= ruleSimpleTypes )
                    // InternalUSE.g:1497:6: lv_returnType_5_0= ruleSimpleTypes
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


    // $ANTLR start "entryRuleOwnedParameter"
    // InternalUSE.g:1519:1: entryRuleOwnedParameter returns [EObject current=null] : iv_ruleOwnedParameter= ruleOwnedParameter EOF ;
    public final EObject entryRuleOwnedParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedParameter = null;


        try {
            // InternalUSE.g:1519:55: (iv_ruleOwnedParameter= ruleOwnedParameter EOF )
            // InternalUSE.g:1520:2: iv_ruleOwnedParameter= ruleOwnedParameter EOF
            {
             newCompositeNode(grammarAccess.getOwnedParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOwnedParameter=ruleOwnedParameter();

            state._fsp--;

             current =iv_ruleOwnedParameter; 
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
    // $ANTLR end "entryRuleOwnedParameter"


    // $ANTLR start "ruleOwnedParameter"
    // InternalUSE.g:1526:1: ruleOwnedParameter returns [EObject current=null] : (this_Attribute_0= ruleAttribute (otherlv_1= ',' )? ) ;
    public final EObject ruleOwnedParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Attribute_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1532:2: ( (this_Attribute_0= ruleAttribute (otherlv_1= ',' )? ) )
            // InternalUSE.g:1533:2: (this_Attribute_0= ruleAttribute (otherlv_1= ',' )? )
            {
            // InternalUSE.g:1533:2: (this_Attribute_0= ruleAttribute (otherlv_1= ',' )? )
            // InternalUSE.g:1534:3: this_Attribute_0= ruleAttribute (otherlv_1= ',' )?
            {

            			newCompositeNode(grammarAccess.getOwnedParameterAccess().getAttributeParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_Attribute_0=ruleAttribute();

            state._fsp--;


            			current = this_Attribute_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalUSE.g:1542:3: (otherlv_1= ',' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==14) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalUSE.g:1543:4: otherlv_1= ','
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getOwnedParameterAccess().getCommaKeyword_1());
                    			

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
    // $ANTLR end "ruleOwnedParameter"


    // $ANTLR start "entryRuleConstraintsBase"
    // InternalUSE.g:1552:1: entryRuleConstraintsBase returns [EObject current=null] : iv_ruleConstraintsBase= ruleConstraintsBase EOF ;
    public final EObject entryRuleConstraintsBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintsBase = null;


        try {
            // InternalUSE.g:1552:56: (iv_ruleConstraintsBase= ruleConstraintsBase EOF )
            // InternalUSE.g:1553:2: iv_ruleConstraintsBase= ruleConstraintsBase EOF
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
    // InternalUSE.g:1559:1: ruleConstraintsBase returns [EObject current=null] : (otherlv_0= 'constraints' ( (lv_invariants_1_0= ruleInvariantDefinition ) )* ) ;
    public final EObject ruleConstraintsBase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_invariants_1_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1565:2: ( (otherlv_0= 'constraints' ( (lv_invariants_1_0= ruleInvariantDefinition ) )* ) )
            // InternalUSE.g:1566:2: (otherlv_0= 'constraints' ( (lv_invariants_1_0= ruleInvariantDefinition ) )* )
            {
            // InternalUSE.g:1566:2: (otherlv_0= 'constraints' ( (lv_invariants_1_0= ruleInvariantDefinition ) )* )
            // InternalUSE.g:1567:3: otherlv_0= 'constraints' ( (lv_invariants_1_0= ruleInvariantDefinition ) )*
            {
            otherlv_0=(Token)match(input,42,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintsBaseAccess().getConstraintsKeyword_0());
            		
            // InternalUSE.g:1571:3: ( (lv_invariants_1_0= ruleInvariantDefinition ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==44) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalUSE.g:1572:4: (lv_invariants_1_0= ruleInvariantDefinition )
            	    {
            	    // InternalUSE.g:1572:4: (lv_invariants_1_0= ruleInvariantDefinition )
            	    // InternalUSE.g:1573:5: lv_invariants_1_0= ruleInvariantDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getConstraintsBaseAccess().getInvariantsInvariantDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_38);
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
    // InternalUSE.g:1594:1: entryRuleConstrainsGeneral returns [EObject current=null] : iv_ruleConstrainsGeneral= ruleConstrainsGeneral EOF ;
    public final EObject entryRuleConstrainsGeneral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstrainsGeneral = null;


        try {
            // InternalUSE.g:1594:58: (iv_ruleConstrainsGeneral= ruleConstrainsGeneral EOF )
            // InternalUSE.g:1595:2: iv_ruleConstrainsGeneral= ruleConstrainsGeneral EOF
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
    // InternalUSE.g:1601:1: ruleConstrainsGeneral returns [EObject current=null] : (otherlv_0= 'constraints' ( (lv_contexts_1_0= ruleContextsType ) )* ) ;
    public final EObject ruleConstrainsGeneral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_contexts_1_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1607:2: ( (otherlv_0= 'constraints' ( (lv_contexts_1_0= ruleContextsType ) )* ) )
            // InternalUSE.g:1608:2: (otherlv_0= 'constraints' ( (lv_contexts_1_0= ruleContextsType ) )* )
            {
            // InternalUSE.g:1608:2: (otherlv_0= 'constraints' ( (lv_contexts_1_0= ruleContextsType ) )* )
            // InternalUSE.g:1609:3: otherlv_0= 'constraints' ( (lv_contexts_1_0= ruleContextsType ) )*
            {
            otherlv_0=(Token)match(input,42,FOLLOW_39); 

            			newLeafNode(otherlv_0, grammarAccess.getConstrainsGeneralAccess().getConstraintsKeyword_0());
            		
            // InternalUSE.g:1613:3: ( (lv_contexts_1_0= ruleContextsType ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==43) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalUSE.g:1614:4: (lv_contexts_1_0= ruleContextsType )
            	    {
            	    // InternalUSE.g:1614:4: (lv_contexts_1_0= ruleContextsType )
            	    // InternalUSE.g:1615:5: lv_contexts_1_0= ruleContextsType
            	    {

            	    					newCompositeNode(grammarAccess.getConstrainsGeneralAccess().getContextsContextsTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_39);
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
    // InternalUSE.g:1636:1: entryRuleContextsType returns [EObject current=null] : iv_ruleContextsType= ruleContextsType EOF ;
    public final EObject entryRuleContextsType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextsType = null;


        try {
            // InternalUSE.g:1636:53: (iv_ruleContextsType= ruleContextsType EOF )
            // InternalUSE.g:1637:2: iv_ruleContextsType= ruleContextsType EOF
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
    // InternalUSE.g:1643:1: ruleContextsType returns [EObject current=null] : (this_InvariantContext_0= ruleInvariantContext | this_OperationContext_1= ruleOperationContext ) ;
    public final EObject ruleContextsType() throws RecognitionException {
        EObject current = null;

        EObject this_InvariantContext_0 = null;

        EObject this_OperationContext_1 = null;



        	enterRule();

        try {
            // InternalUSE.g:1649:2: ( (this_InvariantContext_0= ruleInvariantContext | this_OperationContext_1= ruleOperationContext ) )
            // InternalUSE.g:1650:2: (this_InvariantContext_0= ruleInvariantContext | this_OperationContext_1= ruleOperationContext )
            {
            // InternalUSE.g:1650:2: (this_InvariantContext_0= ruleInvariantContext | this_OperationContext_1= ruleOperationContext )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==43) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==RULE_ID) ) {
                    int LA48_2 = input.LA(3);

                    if ( (LA48_2==EOF||LA48_2==37||(LA48_2>=43 && LA48_2<=44)) ) {
                        alt48=1;
                    }
                    else if ( (LA48_2==45) ) {
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
                    // InternalUSE.g:1651:3: this_InvariantContext_0= ruleInvariantContext
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
                    // InternalUSE.g:1660:3: this_OperationContext_1= ruleOperationContext
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
    // InternalUSE.g:1672:1: entryRuleInvariantContext returns [EObject current=null] : iv_ruleInvariantContext= ruleInvariantContext EOF ;
    public final EObject entryRuleInvariantContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariantContext = null;


        try {
            // InternalUSE.g:1672:57: (iv_ruleInvariantContext= ruleInvariantContext EOF )
            // InternalUSE.g:1673:2: iv_ruleInvariantContext= ruleInvariantContext EOF
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
    // InternalUSE.g:1679:1: ruleInvariantContext returns [EObject current=null] : (otherlv_0= 'context' ( ( (lv_variablename_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (otherlv_3= RULE_ID ) ) ( (lv_invariants_4_0= ruleInvariantDefinition ) )* ) ;
    public final EObject ruleInvariantContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_variablename_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_invariants_4_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1685:2: ( (otherlv_0= 'context' ( ( (lv_variablename_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (otherlv_3= RULE_ID ) ) ( (lv_invariants_4_0= ruleInvariantDefinition ) )* ) )
            // InternalUSE.g:1686:2: (otherlv_0= 'context' ( ( (lv_variablename_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (otherlv_3= RULE_ID ) ) ( (lv_invariants_4_0= ruleInvariantDefinition ) )* )
            {
            // InternalUSE.g:1686:2: (otherlv_0= 'context' ( ( (lv_variablename_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (otherlv_3= RULE_ID ) ) ( (lv_invariants_4_0= ruleInvariantDefinition ) )* )
            // InternalUSE.g:1687:3: otherlv_0= 'context' ( ( (lv_variablename_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (otherlv_3= RULE_ID ) ) ( (lv_invariants_4_0= ruleInvariantDefinition ) )*
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInvariantContextAccess().getContextKeyword_0());
            		
            // InternalUSE.g:1691:3: ( ( (lv_variablename_1_0= RULE_ID ) ) otherlv_2= ':' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==37) ) {
                    alt49=1;
                }
            }
            switch (alt49) {
                case 1 :
                    // InternalUSE.g:1692:4: ( (lv_variablename_1_0= RULE_ID ) ) otherlv_2= ':'
                    {
                    // InternalUSE.g:1692:4: ( (lv_variablename_1_0= RULE_ID ) )
                    // InternalUSE.g:1693:5: (lv_variablename_1_0= RULE_ID )
                    {
                    // InternalUSE.g:1693:5: (lv_variablename_1_0= RULE_ID )
                    // InternalUSE.g:1694:6: lv_variablename_1_0= RULE_ID
                    {
                    lv_variablename_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

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

                    otherlv_2=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getInvariantContextAccess().getColonKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalUSE.g:1715:3: ( (otherlv_3= RULE_ID ) )
            // InternalUSE.g:1716:4: (otherlv_3= RULE_ID )
            {
            // InternalUSE.g:1716:4: (otherlv_3= RULE_ID )
            // InternalUSE.g:1717:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInvariantContextRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(otherlv_3, grammarAccess.getInvariantContextAccess().getClassnameAllClassCrossReference_2_0());
            				

            }


            }

            // InternalUSE.g:1728:3: ( (lv_invariants_4_0= ruleInvariantDefinition ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==44) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalUSE.g:1729:4: (lv_invariants_4_0= ruleInvariantDefinition )
            	    {
            	    // InternalUSE.g:1729:4: (lv_invariants_4_0= ruleInvariantDefinition )
            	    // InternalUSE.g:1730:5: lv_invariants_4_0= ruleInvariantDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getInvariantContextAccess().getInvariantsInvariantDefinitionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_38);
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
    // InternalUSE.g:1751:1: entryRuleInvariantDefinition returns [EObject current=null] : iv_ruleInvariantDefinition= ruleInvariantDefinition EOF ;
    public final EObject entryRuleInvariantDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariantDefinition = null;


        try {
            // InternalUSE.g:1751:60: (iv_ruleInvariantDefinition= ruleInvariantDefinition EOF )
            // InternalUSE.g:1752:2: iv_ruleInvariantDefinition= ruleInvariantDefinition EOF
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
    // InternalUSE.g:1758:1: ruleInvariantDefinition returns [EObject current=null] : (otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclExpression_3_0= ruleOCLExpression ) ) ) ;
    public final EObject ruleInvariantDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_oclExpression_3_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1764:2: ( (otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclExpression_3_0= ruleOCLExpression ) ) ) )
            // InternalUSE.g:1765:2: (otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclExpression_3_0= ruleOCLExpression ) ) )
            {
            // InternalUSE.g:1765:2: (otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclExpression_3_0= ruleOCLExpression ) ) )
            // InternalUSE.g:1766:3: otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclExpression_3_0= ruleOCLExpression ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getInvariantDefinitionAccess().getInvKeyword_0());
            		
            // InternalUSE.g:1770:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalUSE.g:1771:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalUSE.g:1771:4: (lv_name_1_0= RULE_ID )
                    // InternalUSE.g:1772:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

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

            otherlv_2=(Token)match(input,37,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getInvariantDefinitionAccess().getColonKeyword_2());
            		
            // InternalUSE.g:1792:3: ( (lv_oclExpression_3_0= ruleOCLExpression ) )
            // InternalUSE.g:1793:4: (lv_oclExpression_3_0= ruleOCLExpression )
            {
            // InternalUSE.g:1793:4: (lv_oclExpression_3_0= ruleOCLExpression )
            // InternalUSE.g:1794:5: lv_oclExpression_3_0= ruleOCLExpression
            {

            					newCompositeNode(grammarAccess.getInvariantDefinitionAccess().getOclExpressionOCLExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_oclExpression_3_0=ruleOCLExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInvariantDefinitionRule());
            					}
            					set(
            						current,
            						"oclExpression",
            						lv_oclExpression_3_0,
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
    // InternalUSE.g:1815:1: entryRuleOperationContext returns [EObject current=null] : iv_ruleOperationContext= ruleOperationContext EOF ;
    public final EObject entryRuleOperationContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationContext = null;


        try {
            // InternalUSE.g:1815:57: (iv_ruleOperationContext= ruleOperationContext EOF )
            // InternalUSE.g:1816:2: iv_ruleOperationContext= ruleOperationContext EOF
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
    // InternalUSE.g:1822:1: ruleOperationContext returns [EObject current=null] : (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) ( (lv_constrains_2_0= ruleOperationConstraints ) ) ) ;
    public final EObject ruleOperationContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_constrains_2_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1828:2: ( (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) ( (lv_constrains_2_0= ruleOperationConstraints ) ) ) )
            // InternalUSE.g:1829:2: (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) ( (lv_constrains_2_0= ruleOperationConstraints ) ) )
            {
            // InternalUSE.g:1829:2: (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) ( (lv_constrains_2_0= ruleOperationConstraints ) ) )
            // InternalUSE.g:1830:3: otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) ( (lv_constrains_2_0= ruleOperationConstraints ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationContextAccess().getContextKeyword_0());
            		
            // InternalUSE.g:1834:3: ( (otherlv_1= RULE_ID ) )
            // InternalUSE.g:1835:4: (otherlv_1= RULE_ID )
            {
            // InternalUSE.g:1835:4: (otherlv_1= RULE_ID )
            // InternalUSE.g:1836:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationContextRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_41); 

            					newLeafNode(otherlv_1, grammarAccess.getOperationContextAccess().getClassnameAllClassCrossReference_1_0());
            				

            }


            }

            // InternalUSE.g:1847:3: ( (lv_constrains_2_0= ruleOperationConstraints ) )
            // InternalUSE.g:1848:4: (lv_constrains_2_0= ruleOperationConstraints )
            {
            // InternalUSE.g:1848:4: (lv_constrains_2_0= ruleOperationConstraints )
            // InternalUSE.g:1849:5: lv_constrains_2_0= ruleOperationConstraints
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
    // InternalUSE.g:1870:1: entryRuleOperationConstraints returns [EObject current=null] : iv_ruleOperationConstraints= ruleOperationConstraints EOF ;
    public final EObject entryRuleOperationConstraints() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationConstraints = null;


        try {
            // InternalUSE.g:1870:61: (iv_ruleOperationConstraints= ruleOperationConstraints EOF )
            // InternalUSE.g:1871:2: iv_ruleOperationConstraints= ruleOperationConstraints EOF
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
    // InternalUSE.g:1877:1: ruleOperationConstraints returns [EObject current=null] : (otherlv_0= '::' this_OperationDeclaration_1= ruleOperationDeclaration ( (lv_conditions_2_0= ruleConditionType ) )+ ) ;
    public final EObject ruleOperationConstraints() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_OperationDeclaration_1 = null;

        EObject lv_conditions_2_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1883:2: ( (otherlv_0= '::' this_OperationDeclaration_1= ruleOperationDeclaration ( (lv_conditions_2_0= ruleConditionType ) )+ ) )
            // InternalUSE.g:1884:2: (otherlv_0= '::' this_OperationDeclaration_1= ruleOperationDeclaration ( (lv_conditions_2_0= ruleConditionType ) )+ )
            {
            // InternalUSE.g:1884:2: (otherlv_0= '::' this_OperationDeclaration_1= ruleOperationDeclaration ( (lv_conditions_2_0= ruleConditionType ) )+ )
            // InternalUSE.g:1885:3: otherlv_0= '::' this_OperationDeclaration_1= ruleOperationDeclaration ( (lv_conditions_2_0= ruleConditionType ) )+
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationConstraintsAccess().getColonColonKeyword_0());
            		

            			newCompositeNode(grammarAccess.getOperationConstraintsAccess().getOperationDeclarationParserRuleCall_1());
            		
            pushFollow(FOLLOW_42);
            this_OperationDeclaration_1=ruleOperationDeclaration();

            state._fsp--;


            			current = this_OperationDeclaration_1;
            			afterParserOrEnumRuleCall();
            		
            // InternalUSE.g:1897:3: ( (lv_conditions_2_0= ruleConditionType ) )+
            int cnt52=0;
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=46 && LA52_0<=47)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalUSE.g:1898:4: (lv_conditions_2_0= ruleConditionType )
            	    {
            	    // InternalUSE.g:1898:4: (lv_conditions_2_0= ruleConditionType )
            	    // InternalUSE.g:1899:5: lv_conditions_2_0= ruleConditionType
            	    {

            	    					newCompositeNode(grammarAccess.getOperationConstraintsAccess().getConditionsConditionTypeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_32);
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
    // InternalUSE.g:1920:1: entryRuleConditionType returns [EObject current=null] : iv_ruleConditionType= ruleConditionType EOF ;
    public final EObject entryRuleConditionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionType = null;


        try {
            // InternalUSE.g:1920:54: (iv_ruleConditionType= ruleConditionType EOF )
            // InternalUSE.g:1921:2: iv_ruleConditionType= ruleConditionType EOF
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
    // InternalUSE.g:1927:1: ruleConditionType returns [EObject current=null] : (this_Precondition_0= rulePrecondition | this_Postcondition_1= rulePostcondition ) ;
    public final EObject ruleConditionType() throws RecognitionException {
        EObject current = null;

        EObject this_Precondition_0 = null;

        EObject this_Postcondition_1 = null;



        	enterRule();

        try {
            // InternalUSE.g:1933:2: ( (this_Precondition_0= rulePrecondition | this_Postcondition_1= rulePostcondition ) )
            // InternalUSE.g:1934:2: (this_Precondition_0= rulePrecondition | this_Postcondition_1= rulePostcondition )
            {
            // InternalUSE.g:1934:2: (this_Precondition_0= rulePrecondition | this_Postcondition_1= rulePostcondition )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==46) ) {
                alt53=1;
            }
            else if ( (LA53_0==47) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalUSE.g:1935:3: this_Precondition_0= rulePrecondition
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
                    // InternalUSE.g:1944:3: this_Postcondition_1= rulePostcondition
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
    // InternalUSE.g:1956:1: entryRulePrecondition returns [EObject current=null] : iv_rulePrecondition= rulePrecondition EOF ;
    public final EObject entryRulePrecondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecondition = null;


        try {
            // InternalUSE.g:1956:53: (iv_rulePrecondition= rulePrecondition EOF )
            // InternalUSE.g:1957:2: iv_rulePrecondition= rulePrecondition EOF
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
    // InternalUSE.g:1963:1: rulePrecondition returns [EObject current=null] : (otherlv_0= 'pre' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) ) ) ;
    public final EObject rulePrecondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_oclexpression_3_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:1969:2: ( (otherlv_0= 'pre' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) ) ) )
            // InternalUSE.g:1970:2: (otherlv_0= 'pre' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) ) )
            {
            // InternalUSE.g:1970:2: (otherlv_0= 'pre' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) ) )
            // InternalUSE.g:1971:3: otherlv_0= 'pre' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getPreconditionAccess().getPreKeyword_0());
            		
            // InternalUSE.g:1975:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalUSE.g:1976:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalUSE.g:1976:4: (lv_name_1_0= RULE_ID )
                    // InternalUSE.g:1977:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

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

            otherlv_2=(Token)match(input,37,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getPreconditionAccess().getColonKeyword_2());
            		
            // InternalUSE.g:1997:3: ( (lv_oclexpression_3_0= ruleOCLExpression ) )
            // InternalUSE.g:1998:4: (lv_oclexpression_3_0= ruleOCLExpression )
            {
            // InternalUSE.g:1998:4: (lv_oclexpression_3_0= ruleOCLExpression )
            // InternalUSE.g:1999:5: lv_oclexpression_3_0= ruleOCLExpression
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
    // InternalUSE.g:2020:1: entryRulePostcondition returns [EObject current=null] : iv_rulePostcondition= rulePostcondition EOF ;
    public final EObject entryRulePostcondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostcondition = null;


        try {
            // InternalUSE.g:2020:54: (iv_rulePostcondition= rulePostcondition EOF )
            // InternalUSE.g:2021:2: iv_rulePostcondition= rulePostcondition EOF
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
    // InternalUSE.g:2027:1: rulePostcondition returns [EObject current=null] : (otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) ) ) ;
    public final EObject rulePostcondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_oclexpression_3_0 = null;



        	enterRule();

        try {
            // InternalUSE.g:2033:2: ( (otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) ) ) )
            // InternalUSE.g:2034:2: (otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) ) )
            {
            // InternalUSE.g:2034:2: (otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) ) )
            // InternalUSE.g:2035:3: otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_oclexpression_3_0= ruleOCLExpression ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getPostconditionAccess().getPostKeyword_0());
            		
            // InternalUSE.g:2039:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalUSE.g:2040:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalUSE.g:2040:4: (lv_name_1_0= RULE_ID )
                    // InternalUSE.g:2041:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

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

            otherlv_2=(Token)match(input,37,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getPostconditionAccess().getColonKeyword_2());
            		
            // InternalUSE.g:2061:3: ( (lv_oclexpression_3_0= ruleOCLExpression ) )
            // InternalUSE.g:2062:4: (lv_oclexpression_3_0= ruleOCLExpression )
            {
            // InternalUSE.g:2062:4: (lv_oclexpression_3_0= ruleOCLExpression )
            // InternalUSE.g:2063:5: lv_oclexpression_3_0= ruleOCLExpression
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
    // InternalUSE.g:2084:1: entryRuleOCLExpression returns [String current=null] : iv_ruleOCLExpression= ruleOCLExpression EOF ;
    public final String entryRuleOCLExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOCLExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalUSE.g:2086:2: (iv_ruleOCLExpression= ruleOCLExpression EOF )
            // InternalUSE.g:2087:2: iv_ruleOCLExpression= ruleOCLExpression EOF
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
    // InternalUSE.g:2096:1: ruleOCLExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleOCLExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalUSE.g:2103:2: (this_STRING_0= RULE_STRING )
            // InternalUSE.g:2104:2: this_STRING_0= RULE_STRING
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
    static final String dfa_2s = "\4\uffff\1\7\11\uffff\5\7\1\uffff";
    static final String dfa_3s = "\1\4\1\50\1\4\1\45\3\4\2\uffff\13\4";
    static final String dfa_4s = "\1\4\1\50\1\51\1\45\1\57\2\22\2\uffff\5\51\5\57\1\51";
    static final String dfa_5s = "\7\uffff\1\1\1\2\13\uffff";
    static final String dfa_6s = "\24\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2",
            "\1\3\44\uffff\1\4",
            "\1\5",
            "\1\7\25\uffff\1\7\12\uffff\1\6\1\7\1\10\2\uffff\1\7\3\uffff\2\7",
            "\1\15\12\uffff\1\11\1\12\1\13\1\14",
            "\1\22\12\uffff\1\16\1\17\1\20\1\21",
            "",
            "",
            "\1\3\11\uffff\1\23\32\uffff\1\4",
            "\1\3\11\uffff\1\23\32\uffff\1\4",
            "\1\3\11\uffff\1\23\32\uffff\1\4",
            "\1\3\11\uffff\1\23\32\uffff\1\4",
            "\1\3\11\uffff\1\23\32\uffff\1\4",
            "\1\7\25\uffff\1\7\13\uffff\1\7\1\10\2\uffff\1\7\3\uffff\2\7",
            "\1\7\25\uffff\1\7\13\uffff\1\7\1\10\2\uffff\1\7\3\uffff\2\7",
            "\1\7\25\uffff\1\7\13\uffff\1\7\1\10\2\uffff\1\7\3\uffff\2\7",
            "\1\7\25\uffff\1\7\13\uffff\1\7\1\10\2\uffff\1\7\3\uffff\2\7",
            "\1\7\25\uffff\1\7\13\uffff\1\7\1\10\2\uffff\1\7\3\uffff\2\7",
            "\1\3\44\uffff\1\4"
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
            return "1264:2: (this_OperationBasic_0= ruleOperationBasic | this_OperationComplex_1= ruleOperationComplex )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000041C08C80002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000041C08C00002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000040027000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000040026000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000040024000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000040004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000040004000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000078010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000C04000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000C00000000000L});

}