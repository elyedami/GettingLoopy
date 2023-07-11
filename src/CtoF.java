import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;

        do {
            System.out.print("Enter a temperature in Celsius: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Invalid input. Enter a valid temperature in Celsius: ");
                scanner.next();
            }
            celsius = scanner.nextDouble();
        } while (celsius < -273.15);

        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        scanner.close();
    }
}