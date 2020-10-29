import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    //MAIN:-------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        console();
    }
    //CONSOLE:----------------------------------------------------------------------------------------------------------
    public static void console(){
        Scanner input = new Scanner(System.in);

        System.out.println("\nPlease enter command:");
        String text = input.nextLine();

        showTime(text); //write: "show time" (capitalisation doesn't matter)
        showDate(text); //write: "show date" (capitalisation doesn't matter)
        calculate(text, input); //write: "calc" or "calculate" (capitalisation doesn't matter)

        if(!compare(text,"Quit")){ //handles the comparison in the console rather than in a separate child function
                                   //that way I don't need to use booleans, as the compare function provides that
            console();
        }
    }
    //CONSOLE FUNCTIONS:------------------------------------------------------------------------------------------------
    public static void showTime(String text){ //It's showtime!
        if(compare(text,"Show Time")){
            SimpleDateFormat dt = new SimpleDateFormat("kk:mm:ss");
            System.out.println(dt.format(new Date()));
        }
    }

    public static void showDate(String text){
        if(compare(text,"Show Date")){
            SimpleDateFormat dt = new SimpleDateFormat("dd-MM-yyyy");
            System.out.println(dt.format(new Date()));
        }
    }

    public static void calculate(String text, Scanner input){
        if(compare(text,"Calc") || compare(text,"Calculate")){
            //code taken from: https://www.tutorialspoint.com/basic-calculator-program-using-java
            //modified it a bit to make it shorter, but just cba to write out the code myself
            double ans;
            char op;
            System.out.print("Enter equation (with spaces):\n");
            try {
                double num1 = input.nextDouble();
                op = input.next().charAt(0);
                double num2 = input.nextDouble();

                switch (op) {
                    case '+':
                        ans = num1 + num2;
                        break;
                    case '-':
                        ans = num1 - num2;
                        break;
                    case '*':
                        ans = num1 * num2;
                        break;
                    case '/':
                        ans = num1 / num2;
                        break;
                    default:
                        System.out.print("Incorrect operator type!\n");
                        return;
                }
                System.out.print(ans + "\n");
            }
            catch (InputMismatchException ex){
                System.out.println("Incorrect formatting! Remember to use spaces!");
                console();
            }
        }
    }
    //SEPARATE FUNCTIONS:-----------------------------------------------------------------------------------------------
    public static boolean compare(String text, String command){ //takes two strings and return TRUE if they're equal
        if(text.toLowerCase().equals(command.toLowerCase())){
            return true;
        }
        return false;
    }
}
