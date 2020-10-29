import java.util.ArrayList;

public class Airline {
    private ArrayList<Destination> destinations = new ArrayList<>();
    private ArrayList<Reservation> reservations = new ArrayList<>();

    Airline()
    {
        destinations.add(new Destination("Jylland", 'A', 450, 451));
        destinations.add(new Destination("Sverige", 'A', 243, 267));
        destinations.add(new Destination("Spanien", 'B', 1392, 692));
        destinations.add(new Destination("Østrig", 'B', 1791, 1034));
        destinations.add(new Destination("Holland", 'B', 679, 354));
        destinations.add(new Destination("Kina", 'A', 8421, 399));
    }

    public void showDestinations()
    {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        sb.append("The destinations are:\n");
        for(Destination d : destinations)
        {
            count++;
            sb.append("\n(").append(count).append(") ").append(d.getName());
        }
        sb.append("\n(0) Return to menu.").append("\n\nChoose destination...");
        System.out.println(sb.toString());
    }

    public ArrayList<Destination> getDestinations() {
        return destinations;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public void addReservation(Reservation r)
    {
        reservations.add(r);
    }
}
