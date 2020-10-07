public class Hawk implements Animal{
    private boolean breathing = true;

    //characteristics
    @Override
    public String animalType(){
        return "Hawk ";
    }

    @Override
    public String animalNoise(){
        return "Schreeee";
    }

    @Override
    public int legs() {
        return 2;
    }
    @Override
    public boolean breathing() {
        return this.breathing;
    }

    //movement type
    @Override
    public boolean flying() {
        return true;
    }

    //is alive?
    @Override
    public void setAlive(boolean isAlive) {
        if(!isAlive){
            this.breathing = false;
            System.out.println("\nHawk is dead.");
        }else{
            System.out.println("Hawk is alive.");
        }
    }

    //these are my stats
    @Override
    public void stats(){
        if(breathing) System.out.println("I am a Hawk and these are my stats:");
        else System.out.println("I was a Hawk and these were my stats:");
        System.out.println("Number of legs: "+legs()+"\nIs breathing: "+breathing()+
                "\nCan talk: "+talking()+"\nCan walk: "+walking()+"\nCan fly: "+flying()+"\nCan swim: "+swimming()+
                "\n------------------------------------------------");
    }
}
