public class Reservation {
    // order nr. would be useful
    Destination destination;
    Passenger[] passengers;

    public Reservation(Destination destination, Passenger[] passengers) {
        this.destination = destination;
        this.passengers = passengers;
    }

    @Override
    public String toString()
     {
         StringBuilder sb = new StringBuilder();
         sb.append("Trip to: ").append(destination.getName()).append("\n");
         sb.append("Passengers: \n");
         for(Passenger p : passengers)
         {
             sb.append(p.toString()).append("\n\n");
         }
         return sb.toString();
     }
}
