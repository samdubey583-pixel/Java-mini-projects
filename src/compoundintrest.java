import java.util.Scanner;
public class compoundintrest {
    public static void main(String[]args){

        //COMPOUND INTEREST CALCULATOR

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timescompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal=scanner.nextDouble();

        System.out.print("Enter the rate of interest(in %): ");
        rate=scanner.nextDouble() / 100;

        System.out.print("Enter no of times compounded: ");
        timescompounded=scanner.nextInt();

        System.out.print("Enter no years: ");
        years=scanner.nextInt();

        amount= principal * Math.pow(1 + rate/timescompounded , timescompounded * years);
        System.out.printf("The total amount after %d years is $%.2f\n" , years , amount);

        scanner.close();
    }
}
