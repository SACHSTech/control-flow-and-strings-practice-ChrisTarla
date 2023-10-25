class D1GramsToPounds extends ConsoleProgram {

  /**
  * Description: Outputs a formatted table that shows a conversion from 
  * grams to pounds from 100 to 1000 grams.
  * @author: C.Tarla
  */
  
  public void run() {
    int intGrams = 100;
    double dblPounds;

    System.out.printf("%10S %10S %n", "Grams", "Pounds");
    System.out.println("----------------------------");

    for (intGrams = 100; intGrams <= 1000; intGrams+= 100){
        dblPounds = intGrams * 0.002205;
        System.out.printf("%9d %11.4f %n", intGrams, dblPounds);

    }

  }
}
