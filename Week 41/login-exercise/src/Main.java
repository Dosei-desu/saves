//Changes to be made:
/*
- Make a logout function
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        //users
        ArrayList<Login> users = new ArrayList<Login>();
        users.add(new Login("Kris","uniC0rnF4rts",100));
        users.add(new Login("Kasper","y3ll0w",0));
        users.add(new Login("A","B",100000));

        //Login user[] = {new Login("Kris","uniC0rnF4rts"), new Login("Kasper","y3ll0w")};

        while(running) {
            System.out.println("Please enter username:");
            //keyboard input
            String typing = input.nextLine();

            //login checker
            for (int i = 0; i < users.size(); i++) {
                if (typing.toLowerCase().equals(users.get(i).getName().toLowerCase())) {
                    System.out.println("Name matches database!");
                    users.get(i).setNameCheck(true);
                    System.out.println("Please enter password:");
                }
            }
            //password checkers
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getNameCheck()) {
                    if (typing.equals(users.get(i).getPass())) {
                        System.out.println("Password correct!\nWelcome " + users.get(i).getName() + ".");
                        users.get(i).setLoggedIn(true);
                    }
                }
            }
            //account stuff (withdraw / deposit / view balance)
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).isLoggedIn()) {
                    System.out.println("Your current balance is: " + users.get(i).viewAccount());
                    int num = input.nextInt();
                    if (num < 0) {
                        users.get(i).withdraw(num * -1);
                    } else {
                        users.get(i).deposit(num);
                    }
                }
            }

            //close cmd
            if (typing.equals("q")) {
                System.out.println("Shutting down.");
                running = false;
            }
        }
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