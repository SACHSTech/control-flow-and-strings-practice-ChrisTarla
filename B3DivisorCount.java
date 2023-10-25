class B3DivisorCount extends ConsoleProgram {

  /**
  * Description: Print all the divisors of an inputted integer. 
  * @author: C.Tarla
  */
  
  public void run() {
    int intUserInt;

    intUserInt = readInt("What is your integer? ");

    for (int counter = 1; counter <= intUserInt; counter++){
        if (intUserInt%counter == 0){
            System.out.println(counter);
        }
    }
    
  }
}
