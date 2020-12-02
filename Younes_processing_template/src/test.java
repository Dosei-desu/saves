import processing.core.PApplet;

import java.awt.*;

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
        background(255);
    }

    public void draw() {
        noStroke();

        if(mousePressed){
            fill(255,0,0);
        }else{
            fill(255,255,255);
        }

        ellipse(mouseX,mouseY,x/16,y/16);
    }
}
