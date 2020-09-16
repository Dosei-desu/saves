//sketch
void setup(){
size(500,500);
background(0);
}

void draw(){
//stroke colour
stroke(255,0,0);
//cross
line(0,0,500,500);
line(0,500,500,0);
//circles
noFill();
circle(250,250,50);
circle(250,250,100);
circle(250,250,150);
circle(250,250,200);
circle(250,250,250);
circle(250,250,300);
circle(250,250,350);
circle(250,250,400);
circle(250,250,450);
circle(250,250,500);
circle(250,250,550);
circle(250,250,600);
circle(250,250,650);
circle(250,250,700);
//plus
line(0,250,500,250);
line(250,0,250,500);
//mouse-following red line
fill(255,0,0);
circle(mouseX,mouseY,15);
}
