import java.util.Scanner;
import java.util.Random;

public class dag8 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int numberToGuess = rand.nextInt(100) + 1;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Enter a number from 1–100 or (-1) to exit:");

        while (true) {
            int userGuess = sc.nextInt();

            if (userGuess < 0) {
                System.out.println("GAME OVER!!!");
                System.out.println("THE NUMBER WAS:"+numberToGuess);
                break;
            }
            else if (userGuess > numberToGuess) {
                System.out.println("Too high!!!");
            }
            else if (userGuess < numberToGuess) {
                System.out.println("Too low!!!");
            }
            else {
                System.out.println("You guessed right!!!");
                break;
            }
        }

        sc.close();
    }
}