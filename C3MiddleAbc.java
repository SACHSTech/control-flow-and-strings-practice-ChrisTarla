class C3MiddleAbc extends ConsoleProgram {

  /**
  * Description: 
  * @author: C.Tarla
  */
  
  public void run() {
    String strUserString;
    int intStrMiddle;
    int intIndexOf = -1;

    strUserString = readLine("What is your string? ");
    intStrMiddle = strUserString.length()/2;
    intIndexOf = strUserString.indexOf("abc") + 1;
    
    if((intIndexOf == intStrMiddle || intIndexOf == intStrMiddle + 1 || 
            intIndexOf == intStrMiddle - 1)) {
        System.out.println("true");
    } else {
        System.out.println("false");
    }
  }
}
