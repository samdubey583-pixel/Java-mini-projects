import java.util.Scanner;

public class quizGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String [] questions = {"1.Who is soldier boy's son ?",
                               "2.Who is homelander's son?",
                               "3.Who killed terror in comic books?",
                               "4.What is butcher's favourite restaurant?",
                               "5.Who killed the fishes?"};

        String [][] options = {{"1.Ryan" , "2.Homelander" , "3.Bombsight" , "4.Clara"},
                               {"1.Butcher" , "2.Ryan" , "3.Frenchie" , "4.Hughie"},
                               {"1.Black noir" , "2.The deep" , "3.Sister sage" , "4.O Father"},
                               {"1.Pizza hut" , "2.McDonald" , "3.Buca di Beppo" , "4.Burger king"},
                               {"1.The deep" , "2.Homelander" , "3.A-Train" , "4.Black noir"}};

        int [] answers = {2,2,1,3,4};
        int choice;
        int score = 0;

        System.out.println("************************");
        System.out.println("Welcome to THE BOYS quiz");
        System.out.println("************************");

        for(int i = 0 ; i< questions.length ; i++) {
            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Choose your option: ");
            choice = scanner.nextInt();


            if (choice == answers[i]) {
                System.out.println("CORRECT !");
                score++;
            }
            else {
                System.out.println("INCORRECT !");
            }
            System.out.println();
        }
        System.out.printf("Your total score is %d out of " + questions.length , score);
        scanner.close();
    }
}
