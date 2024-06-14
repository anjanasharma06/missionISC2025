import java.util.Scanner;

public class InheritBankAcc
 {
    public static int nextAccNo=1;
    String name;
    int accNo;
    double balance;
    
    public InheritBankAcc( String name, double balance){
        this.name=name;
        this.accNo=nextAccNo;
        ++nextAccNo;
        this.balance=balance;
    }
    public double getBalance()
    {
        return balance;
    }
    public void deposit(int amt)
    {
        balance=balance+amt;
        System.out.println("Total balance :"+balance);
    }
    public void withdraw(int amt)
    {
        if((balance-amt)>100)
        balance=balance-amt;
        else
        System.out.println("not much amont left so cant withdraw it");
    }
    public void display()
    {
        
        System.out.println("Account no.:"+accNo);
        System.out.println("Account balance:"+(balance/100));
    }
}


 class SavingAcc extends InheritBankAcc
{
    double RoI;
    public SavingAcc(String name, double balance,double RoI)
    {
        super(name,balance);
        this.RoI=RoI;
    }
    public void addInterest(int month){
        double interest;
        interest= balance*(RoI/100.0)*(month/12.0);
        balance=balance+interest;
    } 
} 


class Main45{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        String name=sc.nextLine();
        System.out.println("Enter the balance");
        double balance=sc.nextDouble();
        System.out.println("Enter the rate of interest");
        double RoI=sc.nextDouble();
        SavingAcc sa=new SavingAcc(name, balance, RoI);
        sa.getBalance();
        sa.deposit(10000);
        sa.withdraw(11000);
        sa.addInterest(10);
        sa.display();
    }
}
