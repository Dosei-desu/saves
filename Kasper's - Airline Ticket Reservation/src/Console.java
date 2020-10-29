import java.lang.reflect.Array;
import java.util.Scanner;

public class Console {
    boolean running = true;
    Airline airline;

    Console(Airline airline)
    {
        this.airline = airline;
    }

    public void startConsole(){
        while(running)
        {
            System.out.println("Welcome to Flyv Længe A/S!\n\n" +
                    "(1) Make reservation\n" +
                    "(2) Show list of reservations\n" +
                    "(0) Quit\n\n" +
                    "Choose a <number> and hit \"enter\":");
            selections();
        }
    }

    public void selections()
    {
        // make input restrictions.
        // I'm think RegEx with Strings to avoid TypeMismatch.
        Scanner input = new Scanner(System.in);

        String select = input.nextLine();

        if(select.equals("1"))
        {
            airline.showDestinations();
            String dest = input.nextLine();
            if(!dest.equals("0"))
            {
                System.out.println("How many ticket?\nType 0 to return to main menu.");
                int amount = Integer.parseInt(input.nextLine());
                if(amount != 0)
                {
                    Passenger[] passengers = new Passenger[amount];
                    for(int i = 0; i < amount; ++i)
                    {
                        System.out.println("Name of passenger no. " + (i+1));
                        String name = input.nextLine();
                        // this needs heavy restricting. it's quick and dirty.
                        System.out.println("Choose class:\nEconomy\nBusiness");
                        String ticketClass = input.nextLine();
                        passengers[i] = new Passenger(name, ticketClass);
                    }
                    airline.addReservation(new Reservation(airline.getDestinations().get(Integer.parseInt(dest)-1), passengers));
                    System.out.println("Reservation complete!\nThank you, come again!");
                }
            }
        }
        else if(select.equals("2"))
        {
            for(Reservation r : airline.getReservations())
            {
                System.out.println(r.toString());
            }
        }
        else if(select.equals("0"))
        {
            running = false;
            System.out.println("Quitting...");
        }
    }
}
