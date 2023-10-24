class A2HasTeen extends ConsoleProgram {

  /**
  * Description: Given 3 int values via user input, 
  * output true if 1 or more of them are teen
  * @author: C.Tarla
  */
  
  public void run() {
    int intAge1;
    int intAge2;
    int intAge3;

    intAge1 = readInt("What is your first age? ");
    intAge2 = readInt("What is your second age? ");
    intAge3 = readInt("What is your third age? ");

    if (intAge1 >= 13 && intAge1 <= 19){
        System.out.println("true");
    } else if (intAge2 >= 13 && intAge2 <= 19){
        System.out.println("true");
    } else if (intAge3 >= 13 && intAge3 <= 19){
        System.out.println("true");
    } else {
        System.out.println("false");
    }
    
  }
}
