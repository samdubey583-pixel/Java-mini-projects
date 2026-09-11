import java.util.Random;
import java.util.Scanner;

public class slotMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = 100;
        int bet;
        int payout;
        String[] row; // to store symbols for later
        String playAgain;

        System.out.println("**************************");
        System.out.println("Welcome to slot machine 🎰");
        System.out.println("Symbols: 🍇 🍉 🔔 ⭐ 🍒 ");
        // System.out.print("Enter amount to be deposited: ");
        // balance = scanner.nextInt();
        System.out.println("**************************");


        while (balance > 0) {
            System.out.println("Your current balance is $" + balance);
            System.out.print("place bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            if (bet > balance) {
                System.out.println("Insufficient funds");
                continue;
            }
            else if (bet <= 0) {
                System.out.println("Betting amount can't be negative");
                continue;
            }
            else {
                balance -= bet;
            }
            System.out.println("Spinning...");
            row = spinrow();// the row here was emptybefore think it like this(row = ["🍉", "🔔", "⭐"]
            printRow(row);
            payout = getpayout(row,bet);

            if (payout > 0){
                System.out.println("You win $" + payout);
                balance += payout;
            }
            else {
                System.out.println("You lose");
            }
            System.out.print("Do you wanna play again (y/n): ");
            playAgain=scanner.nextLine().toLowerCase();

            if(!playAgain.equals("y")){
                break;
            }
        }
        System.out.println("Game over ! Your final balance is $" + balance);
        scanner.close();
    }

    static String[] spinrow() {
        Random random = new Random();

        String[] symbols = {"🍇", "🍉", "🔔", "⭐", "🍒"};
        String[] row = new String[3]; // creates empty array named row that can hold 3 string elements

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }
    static void printRow(String[] row) {
        System.out.println("***************");
        System.out.println(" " + String.join(" | ", row)); // we are prinitng out row but using string join method
        System.out.println("***************");
    }
    static int getpayout(String[] row , int bet){
        if(row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "🍒" -> bet * 3;
                case "🍇" -> bet * 4;
                case "🍉" -> bet * 5;
                case "⭐" -> bet * 10;
                case "🔔" -> bet * 20;
                default -> 0;
            };
        }
            if(row[0].equals(row[1])){
                return switch (row[0]){
                    case "🍒" -> bet * 2;
                    case "🍇" -> bet * 3;
                    case "🍉" -> bet * 4;
                    case "⭐" -> bet * 5;
                    case "🔔" -> bet * 10;
                    default -> 0;
                };
            }
            else if (row[1].equals(row[2])){
                return switch (row[1]){
                    case "🍒" -> bet * 2;
                    case "🍇" -> bet * 3;
                    case "🍉" -> bet * 4;
                    case "⭐" -> bet * 5;
                    case "🔔" -> bet * 10;
                    default -> 0;
                };
            }
        return 0;
    }
}

