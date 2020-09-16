//arrow-key-controlled square

//variables
float x1 = 400;
float y1 = 0;

//g-force
float speed1 = 0;
float gs = 0.5;

//sideway momentum
float speed2 = 0;

void setup(){
 size(800,800); 
 background(0);
}

void draw(){
 //background refresh
 
 //player
 rectMode(CENTER);
 stroke(200,0,0);
 fill(255,0,0);
 circle(x1,y1,50);
 
 //g-force
 speed1 = speed1 + gs;
 y1 = speed1 + y1;
 
 //sideways momentum
 x1 = speed2 + x1;
 
 //controls
   //UP
 if(keyPressed == true && keyCode == UP){
   y1 = y1 - 10;
 }
   //DOWN
 if(keyPressed == true && keyCode == DOWN){
   y1 = y1 + 10;
 }
   //LEFT
 if(keyPressed == true && keyCode == LEFT){
   speed2 = 0;
   x1 = x1 - 10;
 }
   //RIGHT
 if(keyPressed == true && keyCode == RIGHT){
   speed2 = 0;
   x1 = x1 + 10;
 }
 
 //boundaries
   //left wall
 if(x1-25 < 0){
   speed2 = 0;
   speed2 = speed2 * -0.5;
   speed2 = speed2 + 5;
   x1 = 25;
 }
   //right wall
 if(x1+25 > 800){
   speed2 = 0;
   speed2 = speed2 * -0.5;
   speed2 = speed2 - 5;
   x1 = 775;
 }
   //ceiling
 if(y1-25 < 0){
   speed1 = speed1 * -0.9;
   y1 = 25;
 }
   //floor
 if(y1+25 > 800){
   speed1 = speed1 * -0.9;
   y1 = 775;
 }
}
