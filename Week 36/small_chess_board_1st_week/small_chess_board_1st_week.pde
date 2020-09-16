//variables
  //square 1
int x1 = 125;
int y1 = 125;
  //square 2
int x2 = 375;
int y2 = 375;
  //square size
int wiff = 250;

//cursor
color curlurr = color(255,0,0);

//setup
void setup(){
  size(500,500);
}

void draw(){
  //chess board
  background(0);
  fill(255,0,0);
  rectMode(CENTER);
  rect(x1,y1,wiff,wiff);
  rect(x2,y2,wiff,wiff);
  //mouse cursor
  fill(curlurr);
  rect(mouseX,mouseY,25,25);
  if(mouseX>250 && mouseY>250){
    curlurr = color(0);
  }
  if(mouseX<250 && mouseY<250){
    curlurr = color(0);
  }
  if(mouseX<250 && mouseY>250){
    curlurr = color(255,0,0);
  }
  if(mouseX>250 && mouseY<250){
    curlurr = color(255,0,0);
  }
}  
