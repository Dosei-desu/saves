//document and use:
/*
text()
textAlign(CENTER or LEFT or RIGHT)
substring()    and replace()   and     trim()
split()
join()
loadStrings() // text file or url
splitTokens()
*/

void setup(){
  size(800,800);
  translate(width/2,height/2);
  
  //text()
  line(0,-height,0,height);
  line(-width,0,width,0);
  textSize(25);
  fill(0);
  text("Hello",0,0);
  
  //textAlign()
  textAlign(RIGHT,TOP);
  line(-width,25,width,25);
  text("Hello",0,25);
  textAlign(CENTER,BOTTOM);
  line(-width,75,width,75);
  text("Hello",0,75);
  
  //substring()
  String xWord = "     Skole Ole";
  println(xWord.substring(11,14));
  //replace()
  println(xWord.replace('e','3'));
  //trim()
  println(trim(xWord));
  
  println(""); //spacer
  
  //split()
  String skOl = "Skole Ole Fra Hold C";
  println("Pre-split: "+skOl);
  String[] skOl_list = split(skOl, " "); //splits skOl on every space
  println("0: "+skOl_list[0], "- 1: "+skOl_list[1],"- 2: "+skOl_list[2],"- 3: "+skOl_list[3],"- 4: "+skOl_list[4]);
  //join()
  String skOl_join = join(skOl_list,'_');
  println("Post-join: "+skOl_join);
  
  println(""); //spacer
  
  //loadStrings()
  String[] importedText = loadStrings("list.txt"); //can also take website links: String[] lines = loadStrings("http://endless.horse");
  println("Imported list length: "+importedText.length);
  println(importedText);
  
  println(""); //spacer
  
  //splitTokens()
  String xText = "This is a   poorly          formatted example    sentence";
  String[] splitT = splitTokens(xText+"... that has now been fixed.");
  println(splitT);
  println("And here is the word on place number 5: "+splitT[4]);
}
