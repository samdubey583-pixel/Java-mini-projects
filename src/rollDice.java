import java.util.Random;
import java.util.Scanner;

public class rollDice {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int noOfDice;
        int total = 0;

        System.out.println("Dice roller");
        System.out.print("Enter the number of dice to be rolled: ");
        noOfDice = scanner.nextInt();

        if (noOfDice > 0){

            for(int i = 0 ; i < noOfDice ; i++ ){
                int roll = random.nextInt(1,7);
                printDie(roll);
                System.out.println("You rolled: "+ roll);
                total += roll;
            }
            System.out.println("Total is: " + total);
        }
        else{
            System.out.println("Number of dice cannot be negative");
        }
    }
    static void printDie (int roll){
        String die1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;
        String die2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;
        String die3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;
        String die4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;
        String die5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;
        String die6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;
        switch(roll){
            case 1 -> System.out.println(die1);
            case 2 -> System.out.println(die2);
            case 3->  System.out.println(die3);
            case 4->  System.out.println(die4);
            case 5->  System.out.println(die5);
            case 6->  System.out.println(die6);
            default -> System.out.println("Invalid roll");
        }
    }
}
