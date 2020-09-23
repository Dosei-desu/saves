//made by Kristian (Datamatiker 2020 team C)

//I made a few changes to suit my own preferences

ArrayList <Particle> particles;
float magnitude = 150; //decides how close particles have to be to spark a line to each other
int opacity = 50; //decided how the opacity works
int number = 20; //number of particles



void setup() {
  //size(600,600);
  fullScreen();
  frameRate(30);
  background(0);
  particles = new ArrayList();
  for (int i = 0; i < number; i++) {
    particles.add(new Particle(random(width), random(height)));
  }
}

void draw() {
  noStroke();
  fill (0,0,0,opacity);
  rect(0,0,width,height);
  //frameCount(30);
  for (Particle p : particles) {
    p.updateParticle();
  }
  for (Particle p : particles) {
    p.displayParticle();
  }
  checkCollisions();
}
  
void checkCollisions() {
  
  ArrayList <Particle> toDie = new ArrayList();
  ArrayList <Particle> toDouble = new ArrayList();
  for( int i = 0; i < particles.size(); i++) {
    Particle q = particles.get(i);
    for (int j = i+1; j < particles.size(); j++) {
      Particle e = particles.get(j);
      PVector qe = new PVector(q.x-e.x, q.y-e.y);
      if (qe.mag() < magnitude) {
        strokeWeight(1);
        line(q.x, q.y, e.x, e.y);

        /* //currently crashed the simulation
        float similarity = q.velx * e.velx + q.vely * e.vely;
        
        //println(similarity);
        if (similarity > 1 && similarity < 1.3) {
          toDouble.add(new Particle((q.x + e.y) / 2, (q.y + e.y)/2));
        }
        if (similarity < -0.5) {
          toDie.add(e);
        }
        */
        
        
      }
    }
  }
  particles.removeAll(toDie);
  particles.addAll(toDouble);
}

void keyPressed(){
  if(key == 'r' || key == 'R'){
    exit();
  }
  if(key == ' ' || key == ' '){
    for (int i = 0; i < 10; i++) {
    particles.add(new Particle(random(width), random(height)));
  }
  }
}
