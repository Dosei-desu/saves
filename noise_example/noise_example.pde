float time = 0.0;
float increment = 0.01;

void setup(){
  size(400,400);
}

void draw(){
  translate(width/2,height/2);
  background(0);
  
  float n = noise(time) * width/2;
  //float n = sin(time) * width/2;
  
  fill(255,0,0);
  ellipse(0,0,n*20,n*20);
  fill(0);
  ellipse(0,0,n*19,n*19);
  fill(255,0,0);
  ellipse(0,0,n*18,n*18);
  fill(0);
  ellipse(0,0,n*17,n*17);
  fill(255,0,0);
  ellipse(0,0,n*16,n*16);
  fill(0);
  ellipse(0,0,n*15,n*15);
  fill(255,0,0);
  ellipse(0,0,n*14,n*14);
  fill(0);
  ellipse(0,0,n*13,n*13);
  fill(255,0,0);
  ellipse(0,0,n*12,n*12);
  fill(0);
  ellipse(0,0,n*11,n*11);
  fill(255,0,0);
  ellipse(0,0,n*10,n*10);
  fill(0);
  ellipse(0,0,n*9,n*9);
  fill(255,0,0);
  ellipse(0,0,n*8,n*8);
  fill(0);
  ellipse(0,0,n*7,n*7);
  fill(255,0,0);
  ellipse(0,0,n*6,n*6);
  fill(0);
  ellipse(0,0,n*5,n*5);
  fill(255,0,0);
  ellipse(0,0,n*4,n*4);
  fill(0);
  ellipse(0,0,n*3,n*3);
  fill(255,0,0);
  ellipse(0, 0/4,n*2,n*2);
  fill(0);
  ellipse(0,0,n,n);
  
  time += increment;
}
