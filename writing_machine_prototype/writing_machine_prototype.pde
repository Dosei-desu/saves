//writing machine prototype
//functions for arraylist: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html

ArrayList<String> typeMachine = new ArrayList<String>(); 
int x = 20;
int y = 45;
  
void settings(){
  size(1200,800);
}

void setup(){
}

void draw(){
  background(254,249,218);
  typeWord();
}

void typeWord(){
  x = 20;
  y = 45;
  fill(0);
  textSize(25);
  textAlign(CENTER,BOTTOM);
  for(int n = 0; n < typeMachine.size(); n++){
    text(typeMachine.get(n),x,y);
    if(x >= 1180){ 
      y += 45;
      x = 0;
    }
    x += 20;
  }
}

void keyPressed(){
  //----------------------------------------------------
  //declare machine
  if(key != 8 && y <= 45 * 17){ //y increment * number of rows (key == 8 is BACKSPACE)
    String temp = ""+key;
    typeMachine.add(temp);
  }
  //----------------------------------------------------
  //delete and clear
  if(keyCode == BACKSPACE && !typeMachine.isEmpty() || keyCode == SHIFT && !typeMachine.isEmpty()){
    typeMachine.remove(typeMachine.size()-1);
  }
  if(keyCode == CONTROL){
    typeMachine.clear();
  }
  println(typeMachine);
}
