public class Deer implements Animal{
    private boolean breathing = true;

    //characteristics
    @Override
    public String animalType(){
        return "Deer ";
    }

    @Override
    public String animalNoise(){
        return "*deer noise*";
    }

    @Override
    public int legs() {
        return 4;
    }
    @Override
    public boolean breathing() {
        return this.breathing;
    }

    //movement type
    @Override
    public boolean walking() {
        return true;
    }

    //is alive?
    @Override
    public void setAlive(boolean isAlive) {
        if(!isAlive){
            this.breathing = false;
            System.out.println("\nDeer is dead.");
        }else{
            System.out.println("Deer is alive.");
        }
    }

    //these are my stats
    @Override
    public void stats(){
        System.out.println("------------------------------------------------");
        if(breathing) System.out.println("I am a Deer and these are my stats:");
        else System.out.println("I was a Deer and these were my stats:");
        System.out.println("Number of legs: "+legs()+"\nIs breathing: "+breathing()+
                "\nCan talk: "+talking()+"\nCan walk: "+walking()+"\nCan fly: "+flying()+"\nCan swim: "+swimming()+
                "\n------------------------------------------------");
    }
}
