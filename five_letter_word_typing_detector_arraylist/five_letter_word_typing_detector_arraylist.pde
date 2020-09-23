//five letter word typing detector w/ arraylist

ArrayList<String> fiveLetterWord = new ArrayList<String>(); 
int counter = 0;
color bgCol = color(0,0,0);
color txtCol = color(0,200,0);


void setup(){
  size(400,400);
}

void draw(){
  translate(width/2,height/2);
  background(bgCol);
  strokeWeight(2);
  
  typeWord();
  compareWord();
}


void typeWord(){
  constrain(counter,0,5);
  fill(txtCol);
  textAlign(CENTER,BOTTOM);
  textSize(25);
  if(counter >= 1) text(fiveLetterWord.get(0),-50,0);
  if(counter >= 2) text(fiveLetterWord.get(1),-25,0);
  if(counter >= 3) text(fiveLetterWord.get(2),0,0);
  if(counter >= 4) text(fiveLetterWord.get(3),25,0);
  if(counter >= 5) text(fiveLetterWord.get(4),50,0);
}

void keyPressed(){
  //DECLARE MACHINE----------------------------
  if(key != keyCode && counter < 5){
    String temp = ""+key;
    fiveLetterWord.add(temp.toUpperCase());
    counter += 1;
  }
  //--------------------------------------------
  //reset
  if(keyCode == BACKSPACE){ 
    reset();
  }
}

void reset(){
  fiveLetterWord.removeAll(fiveLetterWord);
  counter = 0;
  bgCol = color(0,0,0);
  txtCol = color(0,200,0);
}

boolean compareHelper(String _1, String _2, String _3, String _4, String _5){
  if(fiveLetterWord.get(0).equals(_1) &&
    fiveLetterWord.get(1).equals(_2) &&
    fiveLetterWord.get(2).equals(_3) &&
    fiveLetterWord.get(3).equals(_4) &&
    fiveLetterWord.get(4).equals(_5))
  {
    return true;
  }
  return false;
}

void compareWord(){  
  textAlign(CENTER,BOTTOM);
  textSize(25);
  
  if(counter >= 5){ //only compare when the ArrayList is full (to avoid outOfBounds errors)
  //---------------------------------------------------------------------------------------  
    //if word == "WORLD"
    if(compareHelper("W","O","R","L","D")){
      txtCol = color(75,75,255);
      fill(txtCol);
      text("H E L L O",0,-50);
    }else
    
    //if word == "HELLO"
    if(compareHelper("H","E","L","L","O")){
      txtCol = color(75,75,255);
      fill(txtCol);
      text("W O R L D",0,50);
    }else
    
    //if word == "HELL+"
    if(compareHelper("H","E","L","L","+")){
      txtCol = color(0,0,0);
      bgCol = color(200,0,0);
      fill(txtCol);
      text("W E L C O M E",0,-100);
      text("T O",0,-50);
    }else

    //if word == "HEAVE(N)"
    if(compareHelper("H","E","A","V","E")){
      txtCol = color(150);
      bgCol = color(207,238,250);
      fill(txtCol);
      text("N",75,0);
      text("S T A I R W A Y",15,-100);
      text("T O",10,-50);
      staircaseShape(-125,-50,5);
      staircaseShape(150,100,5);
    }else
    if(compareHelper("A","L","E","X","I") || compareHelper("I","B","A","R","R")){
      txtCol = color(200,0,0);
      bgCol = color(255, 192, 203);
      fill(txtCol);
      if(compareHelper("A","L","E","X","I")){
        text("S",75,0);
      }else{
        text("A",75,0);
        stroke(txtCol);
        strokeWeight(5);
        line(-55,-12.5,85,-12.5);
        text("A L E X I S",10,-50);
      }
      heartShape(-85,25,2);
    }else
    
    //if word == "HEll'"
    if(compareHelper("H","E","L","L","'")){
      txtCol = color(0,0,0);
      bgCol = color(200,0,0);
      fill(txtCol);
      stroke(txtCol);
      strokeWeight(5);
      text("W E L C O M E",0,-100);
      text("T O",0,-50);
      line(-65,-12.5,65,-12.5);
      text("H E C K",0,50);
    }else
    
    //if word == "RYAN+"
    if(compareHelper("R","Y","A","N","+") || compareHelper("K","I","R","B","Y")){
      txtCol = color(255);
      bgCol = color(150);
      fill(txtCol);
      stroke(txtCol);
      strokeWeight(5);
      text("C O D I N G",0,-100);
      text("S E N S E I",0,-50);
      line(-65,-12.5,65,-12.5);
      text("Z E R O I N D E X",0,50);
      text("dogVision = true;",0,150);
    }else
    
    //if word == "KRIS+"
    if(compareHelper("K","R","I","S","+") || compareHelper("P","A","U","L","Y")){
      txtCol = color(255,94,19);
      bgCol = color(0);
      fill(txtCol);
      stroke(txtCol);
      strokeWeight(5);
      text("C R E A T O R :",0,-50);
      line(-65,-12.5,65,-12.5);
      text("S A T U R N",0,50);
      text("No, not the planet...",0,150);
      saturn(-150,-100,50);
    }else
    
    //if word == "EXIT'"
    if(compareHelper("E","X","I","T","'")){
      exit();
    }else
    
    //if word == "RESET"
    if(compareHelper("R","E","S","E","T")){
      reset();
    }else
    {
      fill(200,0,0);
      stroke(200,0,0);
      strokeWeight(5);
      line(-65,-12.5,65,-12.5);
      text("N O T",0,-50);
      text("F O U N D",0,50);
    }
  //---------------------------------------------------------------------------------------  
  }
}

void saturn(float _x, float _y, float _size){
  noStroke();
  fill(255,94,19);
  circle(_x,_y,_size);
  noFill();
  strokeWeight(2.5*_size/25);
  stroke(255,94,19);
  beginShape();
  vertex(_x-_size/4, _y);
  bezierVertex(_x-_size*1.35, _y+_size/4, _x, _y+_size/3, _x, _y);
  bezierVertex(_x+_size*1.5, _y+_size/4, _x, _y+_size/3, _x, _y);
  vertex(_x, _y);
  
  vertex(_x+_size/4, _y);
  endShape();
}

void heartShape(float _x, float _y, float _size){
  noStroke();
  fill(255,0,0);
  pushMatrix();
  translate(_x,_y);
  beginShape();
  scale(_size);
  vertex(50, 15);
  bezierVertex(50, -5, 100, 5, 50, 45);
  vertex(50, 15);
  bezierVertex(50, -5, 0, 5, 50, 45);
  endShape();
  popMatrix();
}

void staircaseShape(float _x, float _y, float _size){
  //https://print-graph-paper.com/virtual-graph-paper
  strokeWeight(2);
  stroke(txtCol);
  noFill();
  beginShape();
  vertex(_x,_y);
  vertex(_x+5*_size,_y-5*_size);
  vertex(_x+5*_size,_y-8*_size);
  vertex(_x+2*_size,_y-10*_size);
  vertex(_x+2*_size,_y-13*_size);
  vertex(_x-1*_size,_y-15*_size);
  vertex(_x-1*_size,_y-18*_size);
  vertex(_x-4*_size,_y-20*_size);
  vertex(_x-9*_size,_y-15*_size);
  vertex(_x-6*_size,_y-13*_size);
  vertex(_x-6*_size,_y-10*_size);
  vertex(_x-3*_size,_y-8*_size);
  vertex(_x-3*_size,_y-5*_size);
  vertex(_x,_y-3*_size);
  endShape(CLOSE);
  line(_x,_y-3*_size,_x+5*_size,_y-8*_size);
  line(_x-3*_size,_y-5*_size,_x+2*_size,_y-10*_size);
  line(_x-3*_size,_y-8*_size,_x+2*_size,_y-13*_size);
  line(_x-6*_size,_y-10*_size,_x-1*_size,_y-15*_size);
  line(_x-6*_size,_y-13*_size,_x-1*_size,_y-18*_size);
  line(_x,_y,_x-9*_size,_y-6*_size);
  line(_x-9*_size,_y-6*_size,_x-9*_size,_y-15*_size);
}
