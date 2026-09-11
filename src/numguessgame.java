import java.util.Random;
import java.util.Scanner;

public class numguessgame {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess;
        int attempts=0;
        int randomNumber;
        int min = 1;
        int max = 101;

        randomNumber = random.nextInt(min , max);

        System.out.println("Number guessing game");
        System.out.printf("Guess a number between %d and %d\n" , min , max);

        do{
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("TOO LOW!");
            } else if (guess > randomNumber) {
                System.out.println("TOO HIGH!");
            }
            else{
                System.out.println("You won!");
                System.out.printf("Number of attempts %d\n",attempts);
            }
        }while(randomNumber != guess);

        scanner.close();
    }

}
