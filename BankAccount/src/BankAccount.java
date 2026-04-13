import java.util.Date;

public class BankAccount {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    //Default Constructor
    public BankAccount(){
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    public BankAccount(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new Date();
    }

    public double getMonthlyInterestRate(){
        return 1.0 * this.annualInterestRate / 12;
    }

    public double withdraw(double amount){
        return this.balance -= amount;
    }

    public double deposit(double amount){
        return this.balance += amount;
    }

    public Date getDate(){
        return this.dateCreated;
    }

    @Override
    public String toString(){
        return "Account ID: " + this.id + "\nCurrent balance: " + this.balance + "\nMonthly Interest Rate: " + this.getMonthlyInterestRate();
    }

}
