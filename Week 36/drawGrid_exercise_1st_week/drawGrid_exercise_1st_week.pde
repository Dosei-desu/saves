//draw a grid #!

void setup(){
  size(800,800);
  background(0,0,255);
}

void draw(){
  stroke(50,228,78);
  strokeWeight(2);
  drawGrid(50,50,25,25); //drawGrid(columns,rows,width,height);
}

void drawGrid(int col, int row, int gWidth, int gHeight){
  //counter variables (declare inside void object to make code cleaner!)
  int count1 = 0; 
  int count2 = 0;
  //column spawner
  while(count1 < col){
     line(gWidth*count1,0,gWidth*count1,gHeight*row);
     count1 = count1 + 1;
  }
  //row spawner
  while(count2 < row){
     line(0,gHeight*count2,gWidth*col,gHeight*count2);
     count2 = count2 + 1;
  }
}
