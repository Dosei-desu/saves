public class Tuna implements Animal{
    private boolean breathing = true;

    //characteristics
    @Override
    public String animalType(){
        return "Tuna ";
    }

    @Override
    public String animalNoise(){
        return "*blop blop*";
    }

    @Override
    public boolean breathing() {
        return this.breathing;
    }

    //movement type
    @Override
    public boolean swimming() {
        return true;
    }

    //is alive?
    @Override
    public void setAlive(boolean isAlive) {
        if(!isAlive){
            this.breathing = false;
            System.out.println("\nTuna is dead.");
        }else{
            System.out.println("Tuna is alive.");
        }
    }

    //these are my stats
    @Override
    public void stats(){
        if(breathing) System.out.println("I am a Tuna and these are my stats:");
        else System.out.println("I was a Tuna and these were my stats:");
        System.out.println("Number of legs: "+legs()+"\nIs breathing: "+breathing()+
                "\nCan talk: "+talking()+"\nCan walk: "+walking()+"\nCan fly: "+flying()+"\nCan swim: "+swimming()+
                "\n------------------------------------------------");
    }
}
