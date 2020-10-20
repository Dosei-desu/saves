public class Taxi {
    private boolean started = false;
    private boolean paused = false;
    private boolean free = false;
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

    public boolean getStarted(){
        return this.started;
    }

    public boolean getPaused(){
        return this.paused;
    }

    public double getTime(){
        return this.time;
    }

    public void setStarted(boolean flag){
        this.started = flag;
        if(flag){
            startTime = System.currentTimeMillis();
            available = false;
        }
        if(this.time == 0 && !flag){
            available = true;
            time = 0;
        }
        if(!flag){
            endTime = System.currentTimeMillis();
            time += (endTime - startTime)/1000;
        }
    }

    public void setPaused(boolean flag){
        this.paused = flag;
    }

    public void setFree(boolean flag){
        this.free = flag;
    }

    public void setTime(float num){
        if(num == 0) {
            this.time = num;
        }else{
            this.time += num;
        }
    }

    public void getPerSecCost(){
        System.out.println(perSecCost+" dollars.");
    }

    public boolean getAvailability(){
        return available;
    }

    //method that handles the bill and takes in a variable for time to calculate cost
    public void getBill(){
        perSecCost = 2.25; //decided to make this a variable so it can be changed if necessary
        if(free){
            perSecCost = 0;
        }
        float cost = (float)Math.round(perSecCost*this.time);
        System.out.println(
            "\nDamn Fast Taxis\n" +
            "---------------\n" +
            "Time: "+this.time+" seconds\n" +
            "Price per second: "+perSecCost+" dollar\n" +
            "Total price: "+cost+" dollars\n"
        );
    }
}
