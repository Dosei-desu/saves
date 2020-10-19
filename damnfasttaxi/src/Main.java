import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner cmd = new Scanner(System.in);
        taxiConsole(10,cmd);
        consoleInterface();
    }

    //takes a number and adds that number of Taxi objects to an ArrayList
    //also handles the method calls for each individual Taxi object
    public static void taxiConsole(int taxiNum, Scanner input){
        ArrayList<Taxi> taxis = new ArrayList<Taxi>();
        //initialises all Taxi objects
        for (int n = 0; n < taxiNum; n++) {
            taxis.add(n, new Taxi(false,false,false));
        }

        int num = input.nextInt();
        if(num == 1){

        }
    }

    //made this its own method, since it just looks prettier that way in my opinion
    public static void consoleInterface(){
        System.out.println(
            "Welcome to Damn Fast Taxis\n" +
            "(1)Start a taxi\n" +
            "(2)Stop a taxi\n" +
            "(3)Pause a ride\n" +
            "(4)Ask for price\n" +
            "(5)Free ride\n" +
            "Choose a <number> and hit “enter”:"
        );
    }

    //method that handles the bill and takes in a variable for time to calculate cost
    public static void bill(double time){
        double perSecCost = 2.25; //decided to make this a variable so it can be changed if necessary
        System.out.println(
            "\nDamn Fast Taxis\n" +
            "---------------\n" +
            "Time: "+time+" seconds\n" +
            "Price per second: "+perSecCost+" dollar\n" +
            "Total price: "+(perSecCost*time)+" dollar\n" +
            "Press any key to continue..."
        );
    }
}

//Task:
/*
You are hired to code a Taxi central for the company called “Damn Fast Taxis”.
The company wants a console program that allows them to manage 10 taxis.
The company needs to start, stop, pause, ask for a price, and free-ride methods.
The company should be able to start, stop etc. as many taxis as they want, but always 1 at a time.
The program should run forever until ended.
 */

//Console interface:
/*
Welcome to Damn Fast Taxis
(1)Start a taxi
(2)Stop a taxi
(3)Pause a ride
(4)Ask for price
(5)Free ride
Choose a <number> and hit “enter”:
 */

//Methods:
/*
Start : will start a taxi
Stop : will stop a taxi
Pause : will pause a taxi
Ask for price : will ask for a taxi, and then give the current price
Free ride : will enable a taxi to run for free until the end of the duration
 */

//Time measurement:
/*
Time should be measured in seconds with 1 decimal.
Example:
10.5 seconds
5.1 seconds
Price per second 2.25 dollar
Example: 5.1 seconds * 2.25 dollars = 11,475 dollars total
 */

//Bill:
/*
Damn Fast Taxis
---------------
Time: 34.5 seconds
Price per second: 2.25 dollar
Total price: 77.625 dollar
Press any key to continue...
 */

//Technical requirements:
/*
The use of methods
To remove all redundancy in the code
To write a solution that without too much effort can be extended to 15 taxis
To comment your code
 */