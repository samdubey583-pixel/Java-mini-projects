import java.util.Scanner;
public class shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String item;
        int quantity;
        double price;
        char currency = '₹';
        double total;

        System.out.print("What would you like to buy?: ");
        item = scanner.nextLine();
        System.out.print("how many would you like to buy?: ");
        quantity=scanner.nextInt();
        System.out.print("What is the price?: ");
        price= scanner.nextInt();

        total=price*quantity;

        System.out.println("You purchased " + quantity + " " + item + "/s.");
        System.out.println("The total is " + currency + total);

        scanner.close();
    }
}
