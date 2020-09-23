//type a 5-letter word

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
