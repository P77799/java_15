import java.util.Scanner;

public class day17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income:");
        float income = sc.nextFloat();
        System.out.println("Total tax amount:");

        if (income == 500000) {
            float total = income * 0.01f;
            System.out.println("You should pay: " + total);
        }
        else if (income >= 500001 && income <= 700000) {
            float total = income * 0.10f;
            System.out.println("You should pay: " + total);
        }
        else if (income >= 700001 && income <= 1000000) {
            float total = income * 0.20f;
            System.out.println("You should pay: " + total);
        }
        else if (income >= 1000001 && income <= 2000000) {
            float total = income * 0.30f;
            System.out.println("You should pay: " + total);
        }
        else if (income >= 2000001 && income <= 5000000) {
            float total = income * 0.36f;
            System.out.println("You should pay: " + total);
        }
        else if (income > 5000000) {
            float total = income * 0.39f;
            System.out.println("You should pay: " + total);
        }
        else {
            System.out.println("Invalid income!");
        }
    }
}
