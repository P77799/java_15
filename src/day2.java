
import java.util.Scanner;
public class day2{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name=sc.nextLine();
        System.out.println("enter your age");

        int age=sc.nextInt();
        if (age>18){
            System.out.println( "Hey "+name+ " you are eligible to caste vote");
        }
        else {
            System.out.println("you are not eligible to caste vote");
        }

    }
}