public class Taxi {
    private boolean started;
    private boolean paused;
    private boolean free;
    private float time = 0;
    private boolean available = true;
    private double perSecCost = 2.25;
    private long startTime;
    private long endTime;

    Taxi(boolean started, boolean paused, boolean free){
        this.started = started;
        this.paused = paused;
        this.free = free;
    }

    public boolean getIsFree(){
        return this.free;
    }

    public boolean getPaused(){
        return this.paused;
    }

    public void setStarted(boolean flag){
        this.started = flag;
        if(flag){
            startTime = System.currentTimeMillis();
            available = false;
            paused = false;
        }
        if(this.time == 0 && !flag){
            available = true;
        }
        if(!flag){
            if(paused){
                startTime = 0;
                endTime = 0;
            }else{
                endTime = System.currentTimeMillis();
            }
            paused = false;
            time += (endTime - startTime)/1000;
        }
    }

    public void setPaused(boolean flag){
        this.paused = flag;
        if(flag){
            endTime = System.currentTimeMillis();
            time += (endTime - startTime)/1000;
        }
        if(!flag && started){
            startTime = System.currentTimeMillis();
        }
    }

    public void setFree(boolean flag){
        this.free = flag;
    }

    public double getPerSecCost(){
        return perSecCost;
    }

    public boolean getAvailability(){
        return available;
    }

    //method that handles the bill and takes in a variable for time to calculate cost
    public void getBill(){
        if(free){
            perSecCost = 0;
        }else{
            perSecCost = 2.25;
        }
        float cost = (float)Math.round(perSecCost*this.time);
        System.out.println(
            "\nDamn Fast Taxis\n" +
            "---------------\n" +
            "Time: "+this.time+" seconds"
        );
        if(free){
            System.out.println("This ride was free.\n");
        }else{
            System.out.println(
                "Price per second: "+perSecCost+" dollar\n" +
                "Total price: "+cost+" dollars\n"
            );
        }
        this.time = 0;
        this.free = false;
        this.perSecCost = 2.25;
    }
}
