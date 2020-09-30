//Week 40 - Exercise 5
//Text File Analyser

/*
"Text file analyser"

Analyse this file:
https://drive.google.com/file/d/1sOXbGhG65ndtFWPvOTsFb-INiy85P6Gt/view?usp=sharing

Create a config file looking like this:

fileToLoad = <input_file_name_here>
stringToFind = <some_string>

In addition you need to count the actual words in the file using code. It's ok not to
be 100% correct. We will talk about that after the exercise.
Bonus: Also delete all duplicates of words.
*/
 

void setup(){
  runner();
}

void runner(){
  String[] importedText = loadStrings("Yourfile.txt");
  
  String joinedText = join(importedText, " ");
  
  String[] splitText = split(joinedText, " ");
  
  ArrayList<String> cleanText = new ArrayList<String>();
  
  for(int n = 0; n < splitText.length; n++){
    if(splitText[n].length() >= 1){
      if(splitText[n].charAt(0) >= 'a' && splitText[n].charAt(0) <= 'z' || splitText[n].charAt(0) >= 'A' && splitText[n].charAt(0) <= 'Z'){ //if first letter is between a-z
        cleanText.add(splitText[n]);
      }
    }
  }
  
  for(int n = 0; n < cleanText.size(); n++){
    println(cleanText.get(n));
  }
  println(""); //spacer
  println("Number of words: "+cleanText.size());
  
  if(searchFunction(cleanText,"Machine")){ //here we call the search function
    println("Word found!");
  }else{
    println("Word not found ( T_T)");
  }
}

boolean searchFunction(ArrayList<String> list, String word){
  for(int n = 0; n < list.size(); n++){
    if(list.get(n).toUpperCase().equals(word.toUpperCase())){
      println("Word is found at index number: "+n);
      return true;
    }
  }
  return false;
}
