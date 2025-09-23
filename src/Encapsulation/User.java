package Encapsulation;

import static Encapsulation.ATM.cash;

public class User extends ATM {

    public void withdraw(int amountToWithdraw)
    {
        System.out.println("The amount is withdrawn successfully");
        setbalance(amountToWithdraw);
    }
    public static void main(String[] args) {
        User obj = new User();
        obj.getbalance();
        obj.withdraw(1000);
        obj.getbalance();


    }
}
