//variables
int counter = 0;


void setup(){
  size(800,800); 
}

void draw(){
  background(0);
  
  //stick figure
  strokeWeight(5);
  stroke(255,0,0);
  fill(255);
  stickFigure(mouseX,mouseY);
}

void stickFigure(int x, int y){
  circle(x,y-35,40);
  point(x-10,y-35);
  point(x+10,y-35);
  line(x,y-15,x,y+25);
  line(x,y+25,x+25,y+50);
  line(x,y+25,x-25,y+50);
  line(x-25,y,x+25,y);
}
