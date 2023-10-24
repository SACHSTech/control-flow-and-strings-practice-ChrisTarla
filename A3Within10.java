class A3Within10 extends ConsoleProgram {

  /**
  * Description: Given 2 int values via user input, 
  * output whichever value is nearest to the value 10, 
  * or output 0 in the event of a tie.
  * @author: C.Tarla
  */
  
  public void run() {
    int intValue1;
    int intValue2;
    int intAbsValue1;
    int intAbsValue2;

    intValue1 = readInt("What is your first integer? ");
    intValue2 = readInt("What is your second integer? ");
    intAbsValue1 = Math.abs(intValue1 - 10);
    intAbsValue2 = Math.abs(intValue2 - 10); 

    if (intAbsValue1 < intAbsValue2){
        System.out.println(intValue1);
    } else if (intAbsValue2 < intAbsValue1){
        System.out.println(intValue2);
    } else if (intAbsValue1 == intAbsValue2){
        System.out.println("0");
    } 
    
  }
}
