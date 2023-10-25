import java.util.Random;

class B1DiceGame extends ConsoleProgram {

  /**
  * Description: Simulate the rolling of 100 pairs of dice. 
  * @author: C.Tarla
  */
  
  public void run() {
    for (int counter = 0; counter <= 100; counter++){
        Random ranDiceRoll1 = new Random();
        Random ranDiceRoll2 = new Random();
        int intDiceRoll1 = ranDiceRoll1.nextInt((7 - 1) + 1) + 1;
        int intDiceRoll2 = ranDiceRoll2.nextInt((7 - 1) + 1) + 1;

        if (intDiceRoll1 + intDiceRoll2 == 2){
            System.out.println(intDiceRoll1 + " and " + intDiceRoll2 
            + " add up to snake eyes!");
        } else if (intDiceRoll1 + intDiceRoll2 == 7){
            System.out.println(intDiceRoll1 + " and " + intDiceRoll2 
            + " add up to lucky seven!");
        }
    }
    
  }
}
