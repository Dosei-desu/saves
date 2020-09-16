//rando rainbow drawing sketch
color lurr;
float randoC1;
float randoC2;
float randoC3;

void setup(){
  size(800,800);
  background(229,193,157);
}

void draw(){
 //brush colour
 randoC1 = random(0,255);
 randoC2 = random(0,255);
 randoC3 = random(0,255);
 lurr = color(randoC1,randoC2,randoC3);
 //brush
 strokeWeight(25);
 stroke(lurr);
 if(mousePressed == true){
   line(pmouseX,pmouseY,mouseX,mouseY);
 }
}
