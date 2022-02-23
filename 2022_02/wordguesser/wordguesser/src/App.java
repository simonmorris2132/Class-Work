import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String guesses[] = {"coding", "internet", "strawman"};

        boolean weArePlaying = true;

        while (weArePlaying) {
            System.out.println("Welcome to the Word Guesser game\n");
            int randomNumber = random.nextInt(guesses.length);
            char randomWordToGuess[] = guesses[randomNumber].toCharArray();
            int amountOfGuesses = randomWordToGuess.length;
            char playerGuess[] = new char[amountOfGuesses];

            for (int i = 0; i < playerGuess.length; i++) {
                playerGuess[i] = '_';
            }

            boolean wordIsGuessed = false;
            int tries = 0;
    
            while (!wordIsGuessed && tries != amountOfGuesses) {
                System.out.println("Current Guesses: ");
                System.out.print(playerGuess);
                System.out.printf("You have %d amount of tries left.\n", amountOfGuesses-tries);
                System.out.println("Enter a single character: ");
                char input = scanner.nextLine().charAt(0);
                tries++;
            }

        }


    }
}
