import java.util.Random;
import java.util.Scanner;

public class rpsGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String [] choices = {"rock" , "paper" , "scissor"};
        String playerChoice;
        String compChoice;
        String isPlaying = "yes";

        do{System.out.print("Enter your move (rock , paper , scissor): ");
        playerChoice=scanner.nextLine().toLowerCase();

        if(!playerChoice.equalsIgnoreCase("rock") &&
                !playerChoice.equalsIgnoreCase("paper") &&
                !playerChoice.equalsIgnoreCase("scissor")){
            System.out.println("Invalid move");
            continue;
        }

        compChoice=choices[random.nextInt(3)];
        System.out.print("Computer's move: " + compChoice);
        System.out.println();

        if(playerChoice.equalsIgnoreCase(compChoice)){
            System.out.println("TIE!");
        }
        else if(playerChoice.equals("rock") && compChoice.equals("scissor") ||
                playerChoice.equals("paper") && compChoice.equals("rock") ||
                playerChoice.equals("scissor") && compChoice.equals("paper")){

            System.out.println("YOU WIN!");
        }
        else{
            System.out.println("YOU LOSE!");
        }
        System.out.print("Do you want to play again (yes/no): ");
        isPlaying=scanner.nextLine().toLowerCase();
        System.out.println();}
        while (isPlaying.equals("yes"));

        System.out.println("Thanks for playing");
        scanner.close();
    }
}
