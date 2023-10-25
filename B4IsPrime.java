class B4IsPrime extends ConsoleProgram {

  /**
  * Description: A program that determines whether an inputted number is 
  * prime or composite. 
  * @author: C.Tarla
  */
  
  public void run() {
    int intUserInt;        
    String strNumberIs = "";
    boolean composite = false;

    intUserInt = readInt("What is your integer? ");

    for (int counter = 2; counter < intUserInt; counter++){
        if (intUserInt%counter == 0){
            composite = true;
        }
    }

    if(composite == true) {
        strNumberIs = "composite";
    }
    else {
        strNumberIs = "prime";
    }

    System.out.println("is a " + strNumberIs + " number");

  }
}
