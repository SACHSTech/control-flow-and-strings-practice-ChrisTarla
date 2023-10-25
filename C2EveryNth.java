class C2EveryNth extends ConsoleProgram {

  /**
  * Description: Given a non-empty string and an int, return the string made 
  * starting with character 0, and then every Nth char of the string. 
  * @author: C.Tarla
  */
  
  public void run() {
    String strUserString;
    int intUserLength;
    int intN;

    strUserString = readLine("What is your string? ");
    intN = readInt("What is your N value? ");
    intUserLength = strUserString.length();
    
    for (int count = 0; count < intUserLength; count++){
        if(count%intN == 0){
            System.out.print(strUserString.substring(count, count+1));
        }
    }
  }
}
