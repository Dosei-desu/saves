//variables
  //face
  int face_x1;
  int face_y1;
  int face_wiff = 150;
  //nose
  int nose_x1;
  int nose_y1;
  int nose_wiff = 10;
  //eyes
  int eye_wiff = 25;
  int iris_wiff = 5;
    //left eye
    int e1x1;
    int e1y1;
    //right eye
    int e2x1;
    int e2y1;
  //mouth
  int m_x1;
  int m_x2;
  int m_y1;
  int m_y2;
  
void setup(){
  size(500,500);
}

void draw(){
  background(0);
  //face
  face_x1 = mouseX;
  face_y1 = mouseY;
  //nose
  nose_x1 = mouseX;
  nose_y1 = mouseY;
  nose_wiff = 10;
  //eyes
    //left eye
    e1x1 = mouseX-50;
    e1y1 = mouseY-50;
    //right eye
    e2x1 = mouseX+50;
    e2y1 = mouseY-50;
  //mouth
  m_x1 = mouseX-50;
  m_x2 = mouseX+50;
  m_y1 = mouseY+50;
  m_y2 = mouseY+50;
  //face
  fill(255,0,0);
  circle(face_x1,face_y1,face_wiff);
  //nose
  fill(0);
  circle(nose_x1, nose_y1, nose_wiff);
  //eyes
  fill(255);
  circle(e1x1,e1y1,eye_wiff);
  circle(e2x1,e2y1,eye_wiff);
    //irises
    fill(0);
    circle(e1x1,e1y1,iris_wiff);
    circle(e2x1,e2y1,iris_wiff);
  //mouth
  stroke(0);
  line(m_x1,m_y1,m_x2,m_y2);
}
