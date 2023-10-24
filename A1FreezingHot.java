class A1FreezingHot extends ConsoleProgram {

  /**
  * Description: Given two temperatures via user input, output 
  * true if one is less than 0 and the other is greater than 100.
  * @author: C.Tarla 
  */
  
  public void run() {
    int intTemp1;
    int intTemp2;

    intTemp1 = readInt("What is your first temperature? ");
    intTemp2 = readInt("What is your second temperature? ");

    if (intTemp1 < 0 && intTemp2 > 100){
        System.out.println("true");
    } else if (intTemp1 > 100 && intTemp2 < 0){
        System.out.println("true");
    } else {
        System.out.println("false");
    }
    
  }
}
