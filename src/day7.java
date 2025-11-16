public class day7 {
    public static void main(String[] args) {

        // FIRST TRIANGLE
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Some gaps
        System.out.println();
        System.out.println();

        // SECOND TRIANGLE
        for(int s=5;s>=1;s--){
            for(int h=1;h<=s;h++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
