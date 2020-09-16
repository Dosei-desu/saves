//taxi exercise - Week 38

//taxis

//array description {"<taxi name>",<x>,<y>}
String[] taxis = {
  "Taxi-1 0 50", //taxis[0]
  "Taxi-2 0 100", //1
  "Taxi-3 0 150", //2
  "Taxi-4 0 200" //3
};


String[] temp1 = taxis[0].split(" "); //"temp = {"Taxi-1","0","50"};
String[] temp2 = taxis[1].split(" ");
String[] temp3 = taxis[2].split(" ");
String[] temp4 = taxis[3].split(" ");

int taxi1X = parseInt(temp1[1]);
int taxi2X = parseInt(temp2[1]);
int taxi3X = parseInt(temp3[1]);
int taxi4X = parseInt(temp4[1]);

int taxi1Y = parseInt(temp1[2]);
int taxi2Y = parseInt(temp2[2]);
int taxi3Y = parseInt(temp3[2]);
int taxi4Y = parseInt(temp4[2]);

int speed = 25;

void setup(){
  size(500,500);
}

void draw(){
  background(200);
  
  rectMode(CENTER);
  rect(taxi1X,taxi1Y,50,25); //taxi 1 
  rect(taxi2X,taxi2Y,50,25); //taxi 2 
  rect(taxi3X,taxi3Y,50,25); //taxi 3 
  rect(taxi4X,taxi4Y,50,25); //taxi 4 

}

void keyPressed(){ //'bokstav / tal' - "ord / sætning"
  if(key == '1'){
    taxi1X += speed;
  }
  if(key == '2'){
    taxi2X += speed;
  }
  if(key == '3'){
    taxi3X += speed;
  }
  if(key == '4'){
    taxi4X += speed;
  }
}
