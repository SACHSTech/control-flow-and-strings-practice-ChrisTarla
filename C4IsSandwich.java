class C4IsSandwich extends ConsoleProgram {

  /**
  * Description: Return the string that is between the first and last appearance 
  * of "bread" in the given string, or output the empty string "" if there are not 
  * two pieces of bread. 
  * @author: C.Tarla
  */
  
  public void run() {
    int intFirstIndexOf = -1;
    int intLastIndexOf = -1;
    String strUserString;

    strUserString = readLine("Enter your string sandwich: ");
    intFirstIndexOf = strUserString.indexOf("bread") + 5;
    intLastIndexOf = strUserString.lastIndexOf("bread");

    if (intFirstIndexOf != -1 && intLastIndexOf != -1 && intLastIndexOf > 5){
      System.out.println(strUserString.substring(intFirstIndexOf, intLastIndexOf));
    } else {
      System.out.println("");
    }
  }
}
