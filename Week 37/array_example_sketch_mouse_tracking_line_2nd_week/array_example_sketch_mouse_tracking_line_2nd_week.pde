int size = 20;
int[] x = new int[size];
int[] y = new int[size];

void setup(){
  size(800,800);
}

void draw(){
  background(255);
  int n = size -1;
  while(n > 0){
    x[n] = x[n-1];
    y[n] = y[n-1];
    n = n -1;
  }
  x[0] = mouseX;
  y[0] = mouseY;
  
  n = 0;
  while(n < size -1){
    strokeWeight(5);
    stroke(255,0,0);
    line(x[n],y[n],x[n+1],y[n+1]);
    n = n +1;
  }
}
