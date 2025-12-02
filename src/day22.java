
import java.util.Scanner;
public class day22{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int choice;
        int quantity;
        int total=0;
        do{
            System.out.println("-----------Restaurant menue---------");
            System.out.println("0- bill");
            System.out.println("1- Burger rs300");
            System.out.println("2- momo rs100");
            System.out.println("3- pizza rs 500");
            System.out.println("Enter the choice");
            choice=sc.nextInt();

            switch(choice)
            {
                case 1:System.out.println("Enter the quantity");
                    quantity=sc.nextInt();
                    total+=300*quantity;
                    break;
                case 2:System.out.println(" you have choosen a momo Enter the quantity");
                    quantity=sc.nextInt();
                    total+=100*quantity;
                    break;
                case 3:System.out.println(" you have choosen a pizza Enter the quantity");
                    quantity=sc.nextInt();
                    total+=500*quantity;
                    break;

                case 0:System.out.println("BIll payment");
                    System.out.println("total bill:"+total);
                    break;

                default:System.out.println("invalid Syntax");




            }
        }
        while(choice!=0);

    }


}
