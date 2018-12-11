package rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        //Setting Up
        String[] options = new String[]{"Rock", "Paper", "Scissors"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String userChoice;
        int userScore = 0;
        int computerScore = 0;

        while(true){
        
        //Randomly Generated CPU Choice
        int randNum = random.nextInt(3);

        //Ask For User's Choice
        System.out.println("Enter a choice: (Rock, Paper or Scissors)");
        userChoice = scanner.next();

        //Compare With CPU To See Winner
        System.out.println("The computer chose: " + options[randNum]);
        
        if (userChoice.equals(options[randNum])) {
            System.out.println("It's a tie!");
        } else if (userChoice.equals("Rock")) {
            if (options[randNum].equals("Scissors")) {
                userScore += 100;
                System.out.println("You win!");
            } else if (options[randNum].equals("Paper")) {
                computerScore += 100;
                System.out.println("You lose!");
            }
        } else if (userChoice.equals("Paper")) {
            if (options[randNum].equals("Scissors")) {
                computerScore += 100;
                System.out.println("You lose!");
            } else if (options[randNum].equals("Rock")) {
                userScore += 100;
                System.out.println("You win!");
            }
        } else if (userChoice.equals("Scissors")) {
            if (options[randNum].equals("Paper")) {
                userScore += 100;
                System.out.println("You win!");
            } else if (options[randNum].equals("Rock")) {
                computerScore += 100;
                System.out.println("You lose!");
            }
        } 

        System.out.println("Your score: " + userScore);
        System.out.println("Computer score: " + computerScore);
        
        
        }
    }

}
