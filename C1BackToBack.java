class C1BackToBack extends ConsoleProgram {

  /**
  * Description: Given a string, the last letter will be pasted in the front and 
  * at the end of the string. 
  * @author: C.Tarla
  */
  
  public void run() {
    String strUserString;
    int intLength;
    String strLastLetter;

    strUserString = readLine("What is your string? ");
    intLength = strUserString.length();
    strLastLetter = strUserString.substring(intLength - 1);
    System.out.println(strLastLetter + strUserString + strLastLetter);

  }
}
