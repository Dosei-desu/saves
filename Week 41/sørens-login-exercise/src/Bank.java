import java.util.ArrayList;
import java.util.Scanner;


public class Bank {
    User u1 = new User("user1","pass1", 100);
    ArrayList<User> users = new ArrayList<User>();
    users.add(new User("user1","pass1", 100));

    public void loginSequence(){
        Scanner input = new Scanner(System.in);
        boolean running = true;


        while (running) {
            System.out.println("Input Username");
            String userName = input.nextLine();
            System.out.println("Enter Password");
            String passWord = input.nextLine();


            if (userName.equals(u1.getName()) && passWord.equals(u1.getPass()))  {
                    System.out.println("login sucess");
                    System.out.println("Your current ballance is " + u1.getWallet());
                    menu();
                   // running = false;

            } else {
                System.out.println("Wrong Password");
            }
        }
    }


    public void deposit(){
        Scanner input = new Scanner(System.in);

        System.out.println("input amout to deposit");
        int deposit = input.nextInt();

        if (deposit > 0) {
            u1.setWallet(u1.getWallet() + deposit);
            System.out.println("new amount: " + u1.getWallet());
        } else {
            System.out.println("Amount most be positive");
            deposit();
        }


    }
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

    public void menu() {
        boolean running = true;
        int menu = 0;
        Scanner input = new Scanner(System.in);

        while (running) {

            System.out.println("what do you want to do, press nr");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check wallet");
            System.out.println("4. Logout");
            menu = input.nextInt();
            if (menu == 1) {
                deposit();
            }
            if (menu == 2) {
                withdraw();
            }
            if (menu == 3) {
                System.out.println("Your current ballance is " + u1.getWallet());
            }
            if (menu == 4) {
                loginSequence();
            }
        }
    }
}

