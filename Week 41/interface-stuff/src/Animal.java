public interface Animal {
    public String animalType();
    public String animalNoise();

    default public int legs() {
        return 0;
    }
    public boolean breathing();

    default public boolean talking(){
        return false;
    }
    default public boolean walking(){
        return false;
    }
    default public boolean flying(){
        return false;
    }
    default public boolean swimming(){
        return false;
    }

    public void setAlive(boolean isAlive);

    public void stats();
}
