import java.util.Scanner;

public class main {
//main method, is where the program starts

        public static void main(String[] args) {
        //program starts here...
        Person bob = new Person();
        //system.in standard takes in on driver
        Scanner scanner = new Scanner(System.in);

        String name;
         while(true) {
             name = scanner.nextLine();
             if (!name.equals("Fuck")) {
                 break;
             } else {
                 System.out.println("Du må ikke skrive 'fuck'!!");
             }
         }








        bob.setName(name);

        //sout tab
        System.out.println(bob.getName());



    }

}





