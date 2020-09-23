//Coiling Rope screensaver

//inspired by Kristian's particle screensaver sketch

//controls
/*
- Mouse Left : randomise rotation speed and y incrementation
- Mouse Right : reset
- Mouse Middle : exit
*/

float y = 0;
float size = 50;
float rot = 0;
float incrRot = random(0.005,0.01);
float incrY = random(0.05, 0.1);
color colourChoice = color(random(255),random(255),random(255));

void setup(){
  fullScreen();
  frameRate(60);
  background(0);
}

void draw(){
  spinner(width/2,height/2);
  spinner(width,height);
  spinner(0,0);
  spinner(width,0);
  spinner(0,height);
  
  fill(0,0,0,1);
  noStroke();
  rectMode(CENTER);
  rect(width/2,height/2,width,height);
  
  //increment
  rot += incrRot;
  y += incrY;
}

void spinner(float _x, float _y){
  pushMatrix();
  translate(_x,_y);
  //---
  rotate(rot);
  fill(colourChoice);
  stroke(0);
  circle(0,y,size);
  //---
  popMatrix();
  if(y > 1100){
    reset();
  }
}

void reset(){
  y = 0;
  rot = 0;
  colourChoice = color(random(255),random(255),random(255));
  incrRot = random(0.005,0.01);
  incrY = random(0.05, 0.1);
  background(0);
}

void mouseClicked(){
  if(mouseButton == RIGHT){
    reset();
  }
  if(mouseButton == LEFT){
    incrRot = random(0.005,0.01);
    incrY = random(0.05, 0.1);
  }
  if(mouseButton == CENTER){
    exit();
  }
}
