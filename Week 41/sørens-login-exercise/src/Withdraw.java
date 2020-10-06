import java.util.Scanner;

public class Withdraw extends Bank{

    public void withdraw(){
        Scanner input = new Scanner(System.in);
        System.out.println("Current ballance is " + u1.getWallet());
        System.out.println("input amount to withdraw");

        int withdraw = input.nextInt();

        if(withdraw <= u1.getWallet()){
            u1.setWallet(u1.getWallet() - withdraw);
            System.out.println("New ballance is " + u1.getWallet());
        } else {
            System.out.println("you broke lol");
            System.out.println("Empty wallet?");
            System.out.println("1. Yes");
            System.out.println("2. no");
            int input2 = input.nextInt();
            if (input2 == 1){
                u1.setWallet(0);
                System.out.println("New ballance is " + u1.getWallet());
            } else {
                withdraw();
            }
        }
    }
}
