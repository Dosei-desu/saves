import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //users
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("Kris","digBick#ttuB",666));
        users.add(new User("Kirbs","digSmol",0));
        users.add(new User("test","test",1000));
        users.add(new User("Søren","pandaPenis",12));

        login(users);
    }

    public static void login(ArrayList<User> users){
        Scanner input = new Scanner(System.in);
        boolean running = true;
        boolean endFlag = false;

        while(running){
            //writing detection
            System.out.println("Type in your username:");
            String userName = input.nextLine();
            System.out.println("Type in your password:");
            String passWord = input.nextLine();

            if(compare(userName, "q") || compare(passWord, "q")) {
                System.out.println("Shutting down.");
                endFlag = true;
            }
            //compare machine
            boolean flag = false;
            for (int i = 0; i < users.size(); i++) {
                if (compare(userName, users.get(i).getName()) && compare(passWord, users.get(i).getPass())) {
                    flag = true;
                    System.out.println("\nWelcome "+ users.get(i).getName()+".\n0 -------- Logout"+
                    "\nNum < 0 -- Withdraw that amount\nNum > 0 -- Deposit that amount\n");
                    account(users.get(i),users);
                }
            }
            if(!flag && !endFlag){
                System.out.println("Incorrect password or username!");
                login(users);
            }
            running = false;
        }
    }

    public static void account(User data, ArrayList<User> users){
        Scanner input = new Scanner(System.in);

        System.out.println("\nYour balance is at: " + data.getBalance()+"\n");

        int num = input.nextInt();
        if (num == 0) {
            System.out.println("...Logging out...");
            login(users);
        }else if(num < 0){
            num *= -1;
            data.withdraw(num);
            account(data,users);
        }else if(num > 0){
            data.deposit(num);
            account(data,users);
        }
    }

    public static boolean compare(String word1, String word2){
        if(word1.equals(word2)) return true;
        return false;
    }
}

//TASK:
/*
Login system and a system:
Create a login system for users.

Login:
Prompt the user with a login screen asking for first user name then password.
If both are correct the user have access to the system.

System:
The system is a simple banking application that lets the users deposit and
withdraw money. For every user create an object with a predefined amount of
money. The system have to run real-time meaning until you quit it.



Consider the following & hints:
- A user cannot withdraw more money then the account contain
- A user cannot insert negative numbers to an account
- Might be a good idea to store the passwords in an object using an array list
 */