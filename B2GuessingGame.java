import java.util.Random;

class B2GuessingGame extends ConsoleProgram {

  /**
  * Description: A Guessing Game program that gives you 5 tries to guess a 
  * randomly generated number. 
  * @author: C.Tarla
  */
  
  public void run() {
    int intUserGuess;
    Random ranSecretNumber = new Random();
    
    int intSecretNumber = ranSecretNumber.nextInt((100 - 1) + 1) + 1;
    intUserGuess = readInt("Guess the number: ");
    
    for (int counter = 0; counter <= 3; counter++){
        if (intUserGuess < intSecretNumber){
            intUserGuess = readInt("Too low, guess again: ");
        } else if (intUserGuess > intSecretNumber){
            intUserGuess = readInt("Too high, guess again: ");
        } else if (intUserGuess == intSecretNumber){
            System.out.println("Congrautulations!");
        }
    }
    if (intUserGuess != intSecretNumber){
        System.out.println("Nice try!");
    }
  }
}
