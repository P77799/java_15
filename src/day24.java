
class Bankaccount{
    private String Name;
    private double balance;

    public void setname(String Name){
        this.Name=Name;
    }
    public String getname(){
        return this.Name;
    }

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited :"+amount);
        }
        else{
            System.out.println("Invalid deposited amount");
        }
    }
    public void withdrawl(double amount){

        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("withdrawl"+ amount);
        }
        else{
            System.out.println("Invalid amount");
        }
    }
    public double showbalance(){
        return balance;
    }

}
public class day24{
    public static void main(String[] args) {
        Bankaccount account = new Bankaccount();
        account.setname("pratik_sir");
        account.deposit(3000);
        account.withdrawl(1000);

        System.out.println("Account holder: " + account.getname());
        System.out.println("Current balance: " + account.showbalance());

    }



}
