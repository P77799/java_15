import java.util.Scanner;
public class day13 {
    public static int add(int a, int b) {
        return a + b;


    }

    public static int subtract(int a, int b) {
        return a - b;

    }

    public static int multiply(int a, int b) {
        return a * b;

    }

    public static int divide(int a, int b) {
        return a / b;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("enter two num");
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println("1-ADDITION");
            System.out.println("2-SUBTRACTION");
            System.out.println("3-MULTIPLY");
            System.out.println("4-DIVISION");
            System.out.println("5-EXITE");

            System.out.println("CHOOSE A NUM :");
            int userchoice = sc.nextInt();
            if (userchoice == 1) {
                System.out.println("ADDITION :" + add(x, y));


            } else if (userchoice == 2) {
                System.out.println("SUBTRACTION:" + subtract(x, y));

            } else if (userchoice == 3) {
                System.out.println("multiply: " + multiply(x, y));

            } else if (userchoice == 4) {
                System.out.println("Division" + divide(x, y));

            } else if (userchoice == 5) {
                System.out.println("thanks for using ");
                break;
            }
        }
    }
}
