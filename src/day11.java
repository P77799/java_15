
import java.util.Scanner;

public class day11{
    public static void main(String[] args){
        int perkm=15;
        int permin=1;

        Scanner sc=new Scanner(System.in);

        System.out.println("can u tell me the distance of your destination in km: ");
        int dis=sc.nextInt();
        System.out.println("can u tell me the time in minutes does it take to reach your destination: ");
        int time=sc.nextInt();
        int price=dis*perkm+permin*time;
        sc.nextLine();
        System.out.println("Are you a local passenger? (yes/no): ");
        String locals = sc.nextLine();
        System.out.println("local passeger will get 10% discount and non local will get 5% ");
        double disprice=locals.equalsIgnoreCase("yes")?price*0.10:price*0.05;
        System.out.println("discount price: "+disprice);
        double totalprice=price-disprice;
        System.out.println("total price: "+totalprice);





    }

}


