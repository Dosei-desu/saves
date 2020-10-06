import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while(running){
            //keyboard input
            String typing = input.nextLine();
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