import java.util.Scanner;

public class tempconverter {
    public static void main(String[] args){
        // TEMPERATURE CONVERTER

        Scanner scanner = new Scanner(System.in);
        double temp;
        double newtemp;
        String unit;

        System.out.println("Temperature converter program");

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Convert to Celsius or Fahrenheit (C or F): ");
        unit = scanner.nextLine().toUpperCase(); // method chaining scanner.nextLine();

        newtemp = (unit.equals("C")) ? (temp - 32) * 5/9 : (temp * 9/5) + 32;

        System.out.printf("The temperature is %.2f° %s\n", newtemp , unit);

        scanner.close();
    }
}
