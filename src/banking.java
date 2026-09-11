import java.util.Scanner;

public class banking {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

       double balance = 0;
       int choice = 0;
       boolean isRunning=true;

       while(isRunning){
           System.out.println("****************");
           System.out.println("BANKING PROGRAM");
           System.out.println("****************");
           System.out.println("1. Show balance");
           System.out.println("2. deposit");
           System.out.println("3. withdraw");
           System.out.println("4.Exit");
           System.out.print("Pick your choice: ");
           choice = scanner.nextInt();

           switch(choice){
               case 1 -> showBalance(balance);
               case 2 -> balance += deposit();
               case 3 -> balance -= withdraw(balance);
               case 4 -> isRunning=false;
               default -> System.out.println("Invalid choice");
           }
       }
        System.out.println("****************************");
        System.out.println("Thank you! Have a good day");
        System.out.println("****************************");

        scanner.close();
    }
    static void showBalance (double balance){

        System.out.printf("$%.2f\n",balance);

    }
    static double deposit (){

        double amount = 0;

        System.out.print("Enter amount to be deposited: ");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Enter valid amount!");
            return 0;
        }
        else{
            return amount;
        }
    }
    static double withdraw (double balance){

        double amount; // this variable is diff from prev amount same variable names can be entered

        System.out.print("Enter amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if (amount > balance){
            System.out.println("Insufficient funds");
            return 0;
        }
        else if(amount < 0){
            System.out.println("Amount cannot be neagtive");
            return 0;
        }
        else{
            return amount;
        }

    }
}
