public class Taxi {
    private boolean started = false;
    private boolean paused = false;
    private boolean free = false;
    private double time = 0;

    Taxi(boolean started, boolean paused, boolean free){
        this.started = started;
        this.paused = paused;
        this.free = free;
    }

    public void measureTime(){
        long startTime = 0, endTime = 0;
        if(started) {
            startTime = System.currentTimeMillis();
        }else if(startTime > 0 && !started) {
            endTime = System.currentTimeMillis();
            this.time = (endTime - startTime)/1000;
            System.out.println("Duration: "+this.time);
        }
    }

    public void setStarted(boolean flag){
        this.started = flag;
    }

    public void setPaused(boolean flag){
        this.paused = flag;
    }

    public void setFree(boolean flag){
        this.free = flag;
    }

    public void setTime(double num){
        this.time = num;
    }
}
