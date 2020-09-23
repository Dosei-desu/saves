//type a 5-letter word

ArrayList<String> fiveLetterWord = new ArrayList<String>(); 
int counter = 0;


void setup(){
  size(800,800);
}

void draw(){
  translate(width/2,height/2);
  background(255);
  
  typeWord();
  compareWord();
}


void typeWord(){
  constrain(counter,0,5);
  fill(0);
  textAlign(CENTER,BOTTOM);
  textSize(25);
  if(counter >= 1) text(fiveLetterWord.get(0),-50,0);
  if(counter >= 2) text(fiveLetterWord.get(1),-25,0);
  if(counter >= 3) text(fiveLetterWord.get(2),0,0);
  if(counter >= 4) text(fiveLetterWord.get(3),25,0);
  if(counter >= 5) text(fiveLetterWord.get(4),50,0);
}

void keyPressed(){
  if(key != keyCode && counter < 5){
    String temp = ""+key;
    fiveLetterWord.add(temp.toUpperCase());
    counter += 1;
  }
  if(keyCode == BACKSPACE){
    fiveLetterWord.removeAll(fiveLetterWord);
    counter = 0;
  }
}

void compareWord(){  
  //if word == "WORLD"
  if(counter >= 5){
    if(fiveLetterWord.get(0).equals("W") &&
    fiveLetterWord.get(1).equals("O") &&
    fiveLetterWord.get(2).equals("R") &&
    fiveLetterWord.get(3).equals("L") &&
    fiveLetterWord.get(4).equals("D"))
    {
      fill(0);
      textAlign(CENTER,BOTTOM);
      textSize(25);
      text("H E L L O",0,-50);
    }
  }
  //if word == "HELLO"
  if(counter >= 5){
    if(fiveLetterWord.get(0).equals("H") &&
    fiveLetterWord.get(1).equals("E") &&
    fiveLetterWord.get(2).equals("L") &&
    fiveLetterWord.get(3).equals("L") &&
    fiveLetterWord.get(4).equals("O"))
    {
      fill(0);
      textAlign(CENTER,BOTTOM);
      textSize(25);
      text("W O R L D",0,50);
    }
  }
}
