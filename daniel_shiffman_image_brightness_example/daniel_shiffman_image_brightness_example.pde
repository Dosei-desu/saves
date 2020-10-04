//changed the original photo and made the light controllable by WASD

int px = 0, py = 0;
boolean w = false, a = false, s = false, d = false;

PImage img;

void setup() {
  size(1500,900);
  frameRate(30);
  img = loadImage("penguin.png");
  img.loadPixels();
  // Only need to load the pixels[] array once, because we're only
  // manipulating pixels[] inside draw(), not drawing shapes.
  loadPixels();
}

void draw() {

  for (int x = 0; x < img.width; x++) {
    for (int y = 0; y < img.height; y++ ) {
      // Calculate the 1D location from a 2D grid
      int loc = x + y*img.width;
      // Get the R,G,B values from image
      float r,g,b;
      r = red (img.pixels[loc]);
      g = green (img.pixels[loc]);
      b = blue (img.pixels[loc]);
      // Calculate an amount to change brightness based on proximity to the mouse
      float maxdist = 125;//dist(0,0,width,height);
      float d = dist(x, y, px, py);
      float adjustbrightness = 255*(maxdist-d)/maxdist;
      r += adjustbrightness;
      g += adjustbrightness;
      b += adjustbrightness;
      // Constrain RGB to make sure they are within 0-255 color range
      r = constrain(r, 0, 255);
      g = constrain(g, 0, 255);
      b = constrain(b, 0, 255);
      // Make a new color and set pixel in the window
      color c = color(r, g, b);
      //color c = color(r); //greyscale
      pixels[y*width + x] = c;
    }
  }
  updatePixels();
  controls();
}

void controls(){
  int speed = 15;
  
  if(px < 0) px = 0;
  if(px > width) px = width;
  if(py < 0) py = 0;
  if(py > height) py = height;
  
  if(w && !s) py -= speed;
  if(s && !w) py += speed;
  if(a && !d) px -= speed;
  if(d && !a) px += speed;
}

void keyPressed(){
  switch(key){
    //up
    case 'w':  
      w = true;
      break;
    //up
    case 'W':  
      w = true;
      break;
    //down
    case 's':  
      s = true;
      break;
    //down
    case 'S':  
      s = true;
      break;
    //left
    case 'a':  
      a = true;
      break;
    //left
    case 'A':  
      a = true;
      break;
    //right
    case 'd':  
      d = true;
      break;
    //right
    case 'D':  
      d = true;
      break;
  }
}

void keyReleased(){
  switch(key){
    //up
    case 'w':  
      w = false;
      break;
    //up
    case 'W':  
      w = false;
      break;
    //down
    case 's':  
      s = false;
      break;
    //down
    case 'S':  
      s = false;
      break;
    //left
    case 'a':  
      a = false;
      break;
    //left
    case 'A':  
      a = false;
      break;
    //right
    case 'd':  
      d = false;
      break;
    //right
    case 'D':  
      d = false;
      break;
  }
}
