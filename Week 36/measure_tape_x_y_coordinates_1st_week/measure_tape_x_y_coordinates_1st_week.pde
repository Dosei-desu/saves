//Measure-tape for X/Y coordinates

//declare font
PFont f; 

void setup(){
  size(800,800);
  f = createFont("Arial",16,true);
}

void draw(){
  background(255);
  textFont(f,16);
  fill(255,0,0);
  text(mouseX,mouseX+15,mouseY+15);
  text(mouseY,mouseX-30,mouseY-15);
  stroke(255,0,0);
  line(0,mouseY,width,mouseY);
  line(mouseX,0,mouseX,height);
}
