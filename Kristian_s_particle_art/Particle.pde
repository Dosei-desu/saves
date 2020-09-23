class Particle {

  float x, y, velx, vely;
  
  Particle(){
  
  }
  
  Particle(float x, float y){
    this.x = x;
    this.y = y;
    this.velx = random(-1,1);
    this.vely = random(-1,1);
  
  }
  
  void updateParticle() {
    this.velx += random(-1, 1);
    this.vely += random(-1, 1);
    
    this.x += this.velx;
    this.y += this.vely;
    this.x = (this.x + width) % width;
    this.y = (this.y + height) % height;
  }
  
  void displayParticle() {
    stroke(255-vely*100, 200-velx-vely*50, 255-velx*75,random(200,255));
    fill(255,200,50,255);
    //ellipse(x,y,20,20); 
  }
}
