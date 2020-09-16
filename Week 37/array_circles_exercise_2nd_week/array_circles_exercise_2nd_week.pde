int size = 10;
int[] x = new int[size];
int[] y = new int[size];

void setup() {
  size(800, 800);
  for (int n = 0; n < size; n = n +1) {
    x[n] = -100;
    y[n] = -100;
  }
}

void draw() {
  background(255);
  for (int n = 0; n < size -1; n = n +1) {
    strokeWeight(5);
    stroke(255, 0, 0);
    circle(x[n], y[n], 25);
    circle(x[n+1], y[n+1], 25);
    line(x[n], y[n], x[n+1], y[n+1]); //adds a line between points
  }
}

void mousePressed() {
  int n = size -1;
  while (n > 0) {
    x[n] = x[n-1];
    y[n] = y[n-1];
    n = n -1;
  }
  x[0] = mouseX;
  y[0] = mouseY;
  n = 0;
}
