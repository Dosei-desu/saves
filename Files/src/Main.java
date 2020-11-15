import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ConsoleColour c = new ConsoleColour(); //helpful colour-coding by August

        File file = new File("test.txt");

//------fileWriter

        String testString = "This\nis\na\ntest";
        try {
            FileWriter writer = new FileWriter(file);

            writer.write(testString);
            /*
            //alternate way using .charAt and a for-i loop
            for (int i = 0; i < testString.length(); i++) {
                writer.write(testString.charAt(i));
            }
            */

            writer.close(); //it's important to close streams so they don't keep running

            System.out.println(c.GREEN+"Finished writing to file\n"+c.RESET);
        }
        catch(IOException ex){ //FileReader and FileWriter don't seem to work without some way to catch IOExceptions
            System.out.println(c.RED+"IO error: "+ex+c.RESET); //ex in this case returns error text
        }


//------fileReader

        try{
            FileReader reader = new FileReader(file); //path not defined equals ".text.txt" (i.e. a file in main)

            int num;

            //sets num to .read() while .read() isn't == to -1 (not sure why this argument works, but it does)
            while( (num = reader.read()) != -1){ //.read() spits out integers
                System.out.print((char)num); //typecasts int to char to make it legible
            }

            reader.close();

            System.out.println(c.GREEN+"\nFinished reading a file with FileWriter\n"+c.RESET);
        }
        catch (FileNotFoundException ex){ //Necessary catch, since this exception will occur if you read a non-existent file
            System.out.println(c.RED+"File not found error: "+ex+c.RESET);
        }
        catch (IOException ex){ //FileReader and FileWriter don't seem to work without some way to catch IOExceptions
            System.out.println(c.RED+"IO error: "+ex+c.RESET);
        }


//------reading with scanner

        try {
            Scanner input = new Scanner(file); //takes in file path as argument

            while (input.hasNextLine()) { //checks if the input has another line
                String text = input.nextLine();
                System.out.println(text);
            }

            input.close();

            System.out.println(c.GREEN + "Finished reading a file with Scanner\n" + c.RESET);
        }
        catch(FileNotFoundException ex){ //Necessary catch, since this exception will occur if you read a non-existent file
            System.out.println(c.RED+"File not found error: "+ex+c.RESET);
        }
    }
}

//Helpful links:
/*
https://www.codejava.net/java-se/file-io/java-io-filereader-and-filewriter-examples
https://www.w3schools.com/java/java_files_create.asp
 */