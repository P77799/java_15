import java.util.Scanner;

public class day12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currentbalance = 1000;
        int choice;

        do {

            System.out.println("-------pratik Bank---------");
            System.out.println("1-Deposit");
            System.out.println("2-Withdraw");
            System.out.println("3-Check balance");
            System.out.println("4-To exit");
            System.out.println("choose a num");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("enter the Amount u wanna deposit");
                    int amount = sc.nextInt();
                    currentbalance += amount;
                    System.out.println("you have deposited: " + amount);
                    System.out.println("Total balance :" + currentbalance);
                    break;

                case 2:
                    System.out.println("enter amount u wanna withdraw :");
                    int wamount = sc.nextInt();
                    if (wamount <= currentbalance) {
                        System.out.println("u can withdraw amount upto " + currentbalance);
                        currentbalance -= wamount;
                    } else {
                        System.out.println("Insufficient balance");
                    }
                    break;

                case 3:
                    System.out.println("your total balance is: " + currentbalance);
                    break;

                case 4:
                    System.out.println("end!!!!!");
                    break;
            }

        } while (choice != 4); //  <-- Correct place

    }
}
