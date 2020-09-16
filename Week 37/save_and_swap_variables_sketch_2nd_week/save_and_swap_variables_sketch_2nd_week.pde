int a = 7;
int b = 14;
int save;

void setup() {
  size(500,500);
  textAlign(CENTER,CENTER);
  
  save = a;
  a = b;
  b = save;
}
void draw() {
  background(255);
  textSize(20);
  fill(255,0,0);
  text("a = "+a,250,200);
  text("b = "+b,250,+300);
  println("a = "+a);
  println("b = "+b);
}

void mousePressed() {
  if (save == a) {
    save = b;
    b = a;
    a = save;
  } else if (save == b) {
    save = a;
    a = b;
    b = save;
  }
}
