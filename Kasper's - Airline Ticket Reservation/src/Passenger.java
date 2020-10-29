public class Passenger {
    String name;
    String ticketClass;
    // boarding/ticket nr.

    // do some string manipulation to convert case.
    // or make it a list selection back in Console. makes more sense but this was quick and dirty.

    public Passenger(String name, String ticketClass) {
        this.name = name;
        this.ticketClass = ticketClass;
    }

    @Override
    public String toString()
    {
        return name + "\n" + ticketClass;
    }
}
