public class Bob implements Animal{
    private boolean breathing = true;

    //characteristics
    @Override
    public String animalType(){
        return "Human ";
    }

    @Override
    public String animalNoise(){
        return "I am Bob, destroyer of worlds!";
    }

    @Override
    public int legs() {
        return 2;
    }
    @Override
    public boolean breathing() {
        return this.breathing;
    }
    @Override
    public boolean talking() {
        return true;
    }

    //movement type
    @Override
    public boolean walking() {
        return true;
    }
    @Override
    public boolean swimming() {
        return true;
    }

    //is alive?
    @Override
    public void setAlive(boolean isAlive) {
        if(!isAlive){
            this.breathing = false;
            System.out.println("\nBob is dead.");
        }else{
            System.out.println("Bob is alive.");
        }
    }

    //these are my stats
    @Override
    public void stats(){
        if(breathing) System.out.println("My name is Bob and these are my stats:");
        else System.out.println("My name was Bob and these were my stats:");
        System.out.println("Number of legs: "+legs()+"\nIs breathing: "+breathing()+
                "\nCan talk: "+talking()+"\nCan walk: "+walking()+"\nCan fly: "+flying()+"\nCan swim: "+swimming()+
                "\n------------------------------------------------");
    }
}
