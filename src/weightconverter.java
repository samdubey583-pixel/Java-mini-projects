import java.util.Scanner;
public class weightconverter {
    public static void main(String[] args){

        // WEIGHT CONVERTER

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newweight;
        int choice;

        System.out.println("Weight converter program");
        System.out.println("Choose one option");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");
        System.out.print("Your choice is: ");
        choice = scanner.nextInt();


        if(choice == 1){
            System.out.print("Enter weight in lbs: ");
            weight = scanner.nextDouble();
            newweight = weight * 0.45359237;
            System.out.printf("weight in kgs is %.2f\n" , newweight);
        }
        else if(choice == 2){
            System.out.print("Enter weight in kgs: ");
            weight = scanner.nextDouble();
            newweight = weight * 2.2046;
            System.out.printf("weight in lbs is %.2f\n" , newweight);
        }
        else{
            System.out.print("Not a valid choice");
        }
        scanner.close();
    }
}
