public class Destination {
    String name;
    char destinationClass;
    int lnKm;
    int origPrice;

    public Destination(String name, char destinationClass, int lnKm, int origPrice) {
        this.name = name;
        this.destinationClass = destinationClass;
        this.lnKm = lnKm;
        this.origPrice = origPrice;
    }

    public String getName()
    {
        return this.name;
    }
}
