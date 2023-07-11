import java.util.Scanner;

public class Ass02_Craps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            System.out.println("Welcome to Craps Game!");
            System.out.println("-----------------------");
            int point = rollDice();
            boolean gameWon = false;

            if (point == 7 || point == 11) {
                System.out.println("You rolled a natural! You win!");
                gameWon = true;
            } else if (point == 2 || point == 3 || point == 12) {
                System.out.println("You rolled craps! You lose!");
            } else {
                System.out.println("Point is set to " + point);
                gameWon = rollForPoint(point);
            }

            if (gameWon) {
                System.out.print("Do you want to play again? (y/n): ");
                String playAgainInput = scanner.next();
                playAgain = playAgainInput.equalsIgnoreCase("y");
            } else {
                playAgain = false;
            }

            System.out.println("-----------------------");
        }

        System.out.println("Thank you for playing Craps Game!");
        scanner.close();
    }

    public static int rollDice() {
        int die1 = (int) (Math.random() * 6) + 1;
        int die2 = (int) (Math.random() * 6) + 1;
        int sum = die1 + die2;

        System.out.println("Rolling the dice...");
        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        System.out.println("Sum: " + sum);

        return sum;
    }

    public static boolean rollForPoint(int point) {
        boolean gameWon = false;

        while (true) {
            int roll = rollDice();

            if (roll == point) {
                System.out.println("You made the point! You win!");
                gameWon = true;
                break;
            } else if (roll == 7) {
                System.out.println("You rolled a seven! You lose!");
                break;
            } else {
                System.out.println("Trying for the point...");
            }
        }

        return gameWon;
    }
}