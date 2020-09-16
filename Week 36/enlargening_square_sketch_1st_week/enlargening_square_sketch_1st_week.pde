//variables
  //size increment
int z = (int)random(0,250);
  //x
int x1 = 200-z;
int x2 = 250;
int x3 = 300+z;
int x4 = 250;
  //y
int y1 = 250;
int y2 = 200-z;
int y3 = 250;
int y4 = 300+z;

//setup
void setup(){
  size(500,500);
  background(0);
}

//sketch
void draw(){
  //line colour
  stroke(255,0,0);
  //spade
  line(x1,y1,x2,y2);
  line(x2,y2,x3,y3);
  line(x3,y3,x4,y4);
  line(x4,y4,x1,y1);
}
