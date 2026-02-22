 public class Laptop{
    String brand;
    int ram;
    int price;

    Laptop(String brand,int ram,int price){
        this.brand=brand;
        this.ram=ram;
        this.price=price;


    }
    void info(){
        System.out.println("brand nama: "+brand +", ram:"+ram+"gb "+" ,Price:"+ price);
    }
        public static void main(String[]args){
            Laptop l1= new Laptop("dell",7,45000);
            Laptop l2=new Laptop("asus",9,50000);
            Laptop l3=new Laptop("mac",10,60000);

            if(l1.ram>9){
                l1.info();

            }
            if(l2.ram>9){
                l2.info();

            }
            if(l3.ram>9){
                l3.info();

            }








        }
    }


