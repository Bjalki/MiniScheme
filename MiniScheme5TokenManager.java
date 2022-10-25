/* MiniScheme5TokenManager.java */
/* Generated By:JavaCC: Do not edit this line. MiniScheme5TokenManager.java */
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/** Token Manager. */
@SuppressWarnings ("unused")
public class MiniScheme5TokenManager implements MiniScheme5Constants {

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x1f7ff100L) != 0L)
         {
            jjmatchedKind = 29;
            return 7;
         }
         if ((active0 & 0x60L) != 0L)
            return 1;
         if ((active0 & 0x800080L) != 0L)
            return 7;
         return -1;
      case 1:
         if ((active0 & 0x1f6bf100L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 1;
            return 7;
         }
         if ((active0 & 0x140000L) != 0L)
            return 7;
         return -1;
      case 2:
         if ((active0 & 0x1f42f100L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 2;
            return 7;
         }
         if ((active0 & 0x290000L) != 0L)
            return 7;
         return -1;
      case 3:
         if ((active0 & 0xf00e100L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 3;
            return 7;
         }
         if ((active0 & 0x10421000L) != 0L)
            return 7;
         return -1;
      case 4:
         if ((active0 & 0x700c100L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 4;
            return 7;
         }
         if ((active0 & 0x8002000L) != 0L)
            return 7;
         return -1;
      case 5:
         if ((active0 & 0x3004100L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 5;
            return 7;
         }
         if ((active0 & 0x4008000L) != 0L)
            return 7;
         return -1;
      case 6:
         if ((active0 & 0x3000100L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 6;
            return 7;
         }
         if ((active0 & 0x4000L) != 0L)
            return 7;
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 40:
         return jjStopAtPos(0, 32);
      case 41:
         return jjStopAtPos(0, 33);
      case 42:
         return jjStartNfaWithStates_0(0, 7, 7);
      case 43:
         return jjStartNfaWithStates_0(0, 5, 1);
      case 45:
         return jjStartNfaWithStates_0(0, 6, 1);
      case 60:
         return jjStartNfaWithStates_0(0, 23, 7);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x10000000L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x1040000L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x4010000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x204000L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 113:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0xc000000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x3d000L);
      case 102:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(1, 18, 7);
         break;
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x1080000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x12200000L);
      case 113:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000L);
      case 114:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(1, 20, 7);
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
      case 100:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(2, 19, 7);
         break;
      case 102:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x8002000L);
      case 109:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000100L);
      case 116:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(2, 16, 7);
         else if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(2, 21, 7);
         return jjMoveStringLiteralDfa3_0(active0, 0x1020000L);
      case 118:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000L);
      case 119:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 33:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(3, 17, 7);
         break;
      case 63:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(3, 22, 7);
         break;
      case 98:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000000L);
      case 100:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(3, 12, 7);
         break;
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000000L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x2004000L);
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000L);
      case 115:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(3, 28, 7);
         break;
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x2100L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 63:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(4, 27, 7);
         break;
      case 100:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000000L);
      case 101:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(4, 13, 7);
         return jjMoveStringLiteralDfa5_0(active0, 0x2000000L);
      case 103:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000000L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x4100L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(5, 26, 7);
         return jjMoveStringLiteralDfa6_0(active0, 0x2000000L);
      case 101:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(5, 15, 7);
         return jjMoveStringLiteralDfa6_0(active0, 0x1000100L);
      case 110:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(6, 14, 7);
         break;
      case 110:
         return jjMoveStringLiteralDfa7_0(active0, 0x2000100L);
      case 114:
         return jjMoveStringLiteralDfa7_0(active0, 0x1000000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 63:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(7, 24, 7);
         else if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(7, 25, 7);
         break;
      case 116:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(7, 8, 7);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 8;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xf7ffec7200000000L & l) != 0L)
                  {
                     if (kind > 31)
                        kind = 31;
                  }
                  else if (curChar == 35)
                     { jjAddStates(0, 1); }
                  if ((0xf400847200000000L & l) != 0L)
                  {
                     if (kind > 29)
                        kind = 29;
                     { jjCheckNAdd(7); }
                  }
                  else if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 9)
                        kind = 9;
                     { jjCheckNAdd(1); }
                  }
                  else if ((0x280000000000L & l) != 0L)
                     { jjCheckNAdd(1); }
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 9)
                     kind = 9;
                  { jjCheckNAdd(1); }
                  break;
               case 2:
                  if ((0xf7ffec7200000000L & l) != 0L && kind > 31)
                     kind = 31;
                  break;
               case 3:
                  if (curChar == 35)
                     { jjAddStates(0, 1); }
                  break;
               case 6:
                  if ((0xf400847200000000L & l) == 0L)
                     break;
                  if (kind > 29)
                     kind = 29;
                  { jjCheckNAdd(7); }
                  break;
               case 7:
                  if ((0xf7ffec7200000000L & l) == 0L)
                     break;
                  if (kind > 29)
                     kind = 29;
                  { jjCheckNAdd(7); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x47fffffec0000001L & l) != 0L)
                  {
                     if (kind > 31)
                        kind = 31;
                  }
                  if ((0x47fffffec0000000L & l) != 0L)
                  {
                     if (kind > 29)
                        kind = 29;
                     { jjCheckNAdd(7); }
                  }
                  break;
               case 2:
                  if ((0x47fffffec0000001L & l) != 0L && kind > 31)
                     kind = 31;
                  break;
               case 4:
                  if (curChar == 102 && kind > 11)
                     kind = 11;
                  break;
               case 5:
                  if (curChar == 116 && kind > 11)
                     kind = 11;
                  break;
               case 6:
                  if ((0x47fffffec0000000L & l) == 0L)
                     break;
                  if (kind > 29)
                     kind = 29;
                  { jjCheckNAdd(7); }
                  break;
               case 7:
                  if ((0x47fffffec0000001L & l) == 0L)
                     break;
                  if (kind > 29)
                     kind = 29;
                  { jjCheckNAdd(7); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 8 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\53", "\55", "\52", 
"\161\165\157\164\151\145\156\164", null, null, null, "\162\145\141\144", "\167\162\151\164\145", 
"\156\145\167\154\151\156\145", "\144\145\146\151\156\145", "\154\145\164", "\163\145\164\41", "\151\146", 
"\141\156\144", "\157\162", "\156\157\164", "\145\161\166\77", "\74", 
"\151\156\164\145\147\145\162\77", "\142\157\157\154\145\141\156\77", "\154\141\155\142\144\141", 
"\160\141\151\162\77", "\143\157\156\163", null, null, null, "\50", "\51", };
static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}
static final int[] jjnextStates = {
   4, 5, 
};

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(Exception e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

    /** Constructor. */
    public MiniScheme5TokenManager(SimpleCharStream stream){

      if (input_stream != null)
        throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);

    input_stream = stream;
  }

  /** Constructor. */
  public MiniScheme5TokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  
  static public void ReInit(SimpleCharStream stream)
  {


    jjmatchedPos =
    jjnewStateCnt =
    0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  static private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 8; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  static public void ReInit(SimpleCharStream stream, int lexState)
  
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public static void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }


/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x3fffffbe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
static final long[] jjtoSpecial = {
   0x0L, 
};
static final long[] jjtoMore = {
   0x0L, 
};
    static protected SimpleCharStream  input_stream;

    static private final int[] jjrounds = new int[8];
    static private final int[] jjstateSet = new int[2 * 8];
    private static final StringBuilder jjimage = new StringBuilder();
    private static StringBuilder image = jjimage;
    private static int jjimageLen;
    private static int lengthOfMatch;
    static protected int curChar;
}
