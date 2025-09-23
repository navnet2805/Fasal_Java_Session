package Encapsulation;

public class ATM {

    static int cash = 100;
    private int balance = 10000;

    public void getbalance()
    {
        System.out.println("The updated balance is : "+this.balance);
    }

    public void setbalance(int userBalance)
    {
        this.balance -= userBalance;
    }
}


