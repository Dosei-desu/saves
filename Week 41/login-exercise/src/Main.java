//Changes to be made:
/*
- Make the users part of an array so that you only need one if statement
- Make a logout function
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;
        Login userOne = new Login();
        Login userTwo = new Login();
        userOne.name("Kris");
        userOne.pass("uniC0rnF4rts");
        userTwo.name("Kasper");
        userTwo.pass("y3ll0w");

        while(running) {
            //keyboard input
            String typing = input.nextLine();
            if (typing.equals("q")) {
                System.out.println("Shutting down.");
                running = false;
            } else {
                //login checker
                if (typing.toLowerCase().equals(userOne.getName().toLowerCase())) {
                    System.out.println("Name matches database!");
                    userOne.setNameCheck(true);
                } else if (typing.toLowerCase().equals(userTwo.getName().toLowerCase())) {
                    System.out.println("Name matches database!");
                    userTwo.setNameCheck(true);
                }
            }
            //password checkers
            if (userOne.getNameCheck()) {
                if (typing.equals(userOne.getPass())) {
                    System.out.println("Password correct!\nWelcome " + userOne.getName() + ".");
                    userOne.setLoggedIn(true);
                }
            }
            if (userTwo.getNameCheck()) {
                if (typing.equals(userTwo.getPass())) {
                    System.out.println("Password correct!\nWelcome " + userTwo.getName() + ".");
                    userTwo.setLoggedIn(true);
                }
            }
            //account stuff (withdraw / deposit / view balance)
            if (userOne.isLoggedIn()) {
                System.out.println("Your current balance is: " + userOne.viewAccount());
                int num = input.nextInt();
                if (num < 0) {
                    userOne.withdraw(num * -1);
                } else {
                    userOne.deposit(num);
                }
            }
            if (userTwo.isLoggedIn()) {
                System.out.println("Your current balance is: " + userTwo.viewAccount());
                int num = input.nextInt();
                if (num < 0) {
                    userTwo.withdraw(num * -1);
                } else {
                    userTwo.deposit(num);
                }
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