import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //number of taxis
        int taxiNum = 10;

        //creates empty Taxi ArrayList
        ArrayList<Taxi> taxis = new ArrayList<Taxi>();
        //initialises all Taxi objects
        for (int n = 0; n < taxiNum; n++) {
            taxis.add(n, new Taxi(false,false,false));
        }

        //scanner stuff
        Scanner cmd = new Scanner(System.in);

        //handles the taxi console business
        taxiConsole(taxis,taxiNum,cmd);

    }

    //takes a number and adds that number of Taxi objects to an ArrayList
    //also handles the method calls for each individual Taxi object
    public static void taxiConsole(ArrayList<Taxi> taxis, int taxiNum, Scanner input){
        //shows interface
        consoleInterface();
        //scanner which looks for int inputs
        int num = input.nextInt();

        //start a ride
        if(num == 1){
            taxiAvailability(taxis, taxiNum, input);
        }
        //stop a ride
        if(num == 2){
            taxiStopper(taxis, taxiNum, input);
        }
        //pause a ride
        if(num == 3){
            taxiPause(taxis, taxiNum, input);
        }
        //ask for price (prints all ride prices)
        if(num == 4){
            for (int n = 0; n < taxis.size(); n++) {
                System.out.println("Taxi num: "+(n+1));
                if(taxis.get(n).getIsFree() == true){
                    System.out.println("Is currently free.");
                }else {
                    System.out.println(taxis.get(n).getPerSecCost() + " dollars per second.");
                }
            }
            System.out.println(""); //spacer
            taxiConsole(taxis,taxiNum,input);
        }
        //make a ride free (once the ride is stopped it returns to normal price)
        if(num == 5){
            freeRide(taxis,taxiNum,input);
        }
        //stop program
        if(num < 1 || num > 5){
            System.out.println("Shutting down...");
        }
    }

    public static void taxiAvailability(ArrayList<Taxi> taxis, int taxiNum, Scanner input){
        for (int n = 0; n < taxis.size(); n++) {
            System.out.println("Taxi num: "+(n+1));
            System.out.println("Available: "+taxis.get(n).getAvailability());
            if(taxis.get(n).getPaused()) {
                System.out.println("This ride is  paused.");
            }
            if(taxis.get(n).getIsFree()){
                System.out.println("This ride is free.");
            }
        }
        int num = input.nextInt();
        for (int n = 0; n < taxis.size(); n++) {
            if(num <= 0 || num > taxis.size()+1){
                System.out.println("Returning to main menu...\n");
                taxiConsole(taxis, taxiNum, input);
            }
            if(num == (n+1)){
                if(taxis.get(n).getPaused() == true){
                    taxis.get(n).setStarted(true);
                    System.out.println("Taxi num "+(n+1)+" is continuing its trip.\n");
                    taxiConsole(taxis, taxiNum, input);
                }else if(taxis.get(n).getAvailability() == false){
                    System.out.println("Taxi num: "+(n+1)+" is not available!\n");
                    taxiAvailability(taxis, taxiNum, input);
                }else {
                    taxis.get(n).setStarted(true);
                    System.out.println("Taxi num " + (n + 1) + " is started.\n");
                    taxiConsole(taxis, taxiNum, input);
                }
            }
        }
    }

    public static void taxiStopper(ArrayList<Taxi> taxis, int taxiNum, Scanner input){
        System.out.println("\nChoose a taxi to stop:");
        for (int n = 0; n < taxis.size(); n++) {
            if(taxis.get(n).getAvailability() == false){
                System.out.println("Taxi num: "+(n+1)+"\nCurrently running.");
            }
        }
        int num = input.nextInt();
        for (int n = 0; n < taxis.size(); n++) {
            if(num <= 0 || num > taxis.size()+1){
                System.out.println("Returning to main menu...\n");
                taxiConsole(taxis, taxiNum, input);
            }
            if(num == (n+1)){
                if(taxis.get(n).getAvailability() == true){
                    System.out.println("Taxi num: "+(n+1)+" is not available!\n");
                    taxiStopper(taxis,taxiNum,input);
                }else {
                    taxis.get(n).setStarted(false);
                    System.out.println("Taxi num " + (n + 1) + " has stopped.\n");
                    taxis.get(n).getBill();
                    taxiConsole(taxis, taxiNum, input);
                }
            }
        }
    }

    public static void taxiPause(ArrayList<Taxi> taxis, int taxiNum, Scanner input){
        System.out.println("\nChoose a taxi to stop:");
        for (int n = 0; n < taxis.size(); n++) {
            if(taxis.get(n).getAvailability() == false){
                System.out.println("Taxi num: "+(n+1)+"\nCurrently running.");
            }
        }
        int num = input.nextInt();
        for (int n = 0; n < taxis.size(); n++) {
            if(num <= 0 || num > taxis.size()+1){
                System.out.println("Returning to main menu...\n");
                taxiConsole(taxis, taxiNum, input);
            }
            if(num == (n+1)){
                if(taxis.get(n).getAvailability() == true){
                    System.out.println("Taxi num: "+(n+1)+" is not available!\n");
                    taxiStopper(taxis,taxiNum,input);
                }else {
                    taxis.get(n).setPaused(true);
                    System.out.println("Taxi num "+(n+1)+" has paused its trip.\n");
                    taxiConsole(taxis, taxiNum, input);
                }
            }
        }
    }

    public static void freeRide(ArrayList<Taxi> taxis, int taxiNum, Scanner input){
        for (int n = 0; n < taxis.size(); n++) {
            System.out.println("Taxi num: "+(n+1));
            if(taxis.get(n).getIsFree()){
                System.out.println("Is currently free.\n");
            }else{
                System.out.println("Currently costs: "+taxis.get(n).getPerSecCost()+" dollars per second.");
            }
        }
        int num = input.nextInt();
        for (int n = 0; n < taxis.size(); n++) {
            if(num <= 0 || num > taxis.size()+1){
                System.out.println("Returning to main menu...\n");
                taxiConsole(taxis, taxiNum, input);
            }
            if(num == (n+1)){
                if(taxis.get(n).getIsFree() == true){
                    System.out.println("Taxi num: "+(n+1)+" is already free!\n");
                    freeRide(taxis,taxiNum,input);
                }else{
                    taxis.get(n).setFree(true);
                    System.out.println("Taxi num "+(n+1)+" has become a free ride.\n");
                    taxiConsole(taxis, taxiNum, input);
                }
            }
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