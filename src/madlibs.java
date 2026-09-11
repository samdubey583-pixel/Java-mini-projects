import java.util.Scanner;
public class madlibs {
    public static void  main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Input adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Input noun (animal/person): ");
        noun1 = scanner.nextLine();
        System.out.print("Input adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.print("Input verb (activity ending in ing): ");
        verb1 = scanner.nextLine();
        System.out.print("Input adjective (description): ");
        adjective3 = scanner.nextLine();


        System.out.println("\nI went to a " + adjective1 +" mall.");
        System.out.println("There i met a " + noun1 +".");
        System.out.println(noun1 + " was very " + adjective2 + " and was " + verb1);
        System.out.println("It was " + adjective3);

        scanner.close();
    }

}
