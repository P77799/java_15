import java.util.Scanner;
public class day3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String name = "citamole";
            int available = 20;
            int price = 100;
            System.out.println("which medicine do u want");
            String medi = sc.nextLine();
            System.out.println(name + "  available: " + available + " pieces. Price per piece is: " + price);
            System.out.println("how many piece of citamole u want??");
            int want = sc.nextInt();
            String check = (available >= want) ? "available" : "more then20 is unavailable";
            System.out.println(check);
            int calc = want * price;

            System.out.println("your total price is: " + calc);
        }

        }
