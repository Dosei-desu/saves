//triangle grid attempt
  float a = 0;

drawTriangle[] triArray = new drawTriangle[25];

void setup(){
  background(200);
  size(800,800);
}

void draw(){
  int x = 0, y = 0; 
  rotate(a);
  for(int i = 0; i < 25; i++){
    for(int n = 0; n < 25; n++){
      triArray[n] = new drawTriangle(x,y);
      x += 25;
      if(x > width){
        x = 0;
        y += 25;
      }
      triArray[n].update();
    }
  }
  if(mousePressed){
    a += PI/400;
  }
}

class drawTriangle{ 
  private int x;
  private int y;
  
  drawTriangle(int _x, int _y){
    x = _x;
    y = _y;
  }
  
  void update(){
    fill(200,0,0);
    pushMatrix();
    //-------------------------------
    translate(x,y);
    triangle(x,y+50,x+25,y,x-25,y);
    line(x,y,x,y+50);
    line(x+25,y,x+25,y+50);
    line(x-25,y,x-25,y+50);
    //-------------------------------
    popMatrix();
  }
}
