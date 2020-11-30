import processing.core.PApplet;

public class test extends PApplet {
    private final int x = width*4;
    private final int y = height*4;

    public static void main(String[] args) {
        PApplet.main("test");
    }
    
    public void settings() {
        size(x, y);
    }

    public void setup() {
        System.out.println("This is a processing start template");
    }

    public void draw() {
        background(255);
        ellipse(mouseX,mouseY,x/8,y/8);

    }
}
