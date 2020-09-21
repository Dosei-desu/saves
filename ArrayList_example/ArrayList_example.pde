ArrayList<String> names = new ArrayList<String>();

names.add("bob");
names.add("marie");
names.add("julie");

for(String n: names){
  println(n); 
}

//ArrayList uses different syntax than array: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
for(int n = 0; n < names.size(); n++){
  println(n+" "+names.get(n));
}


//with a custom class and objects
class exampleClass{
  private String exampleName;
  
  exampleClass(String _name){
    this.exampleName = _name;
  }
  
  void setName(String _name){
    this.exampleName = _name;
  }
  
  String getName(){
    return this.exampleName; 
  }
}

ArrayList<exampleClass> example = new ArrayList<exampleClass>();

example.add(new exampleClass("ex one"));
example.add(new exampleClass("ex two"));

example.get(0).setName("ex three"); //uses .get(n) to find specific location in index


for(exampleClass n: example){
  println(n.getName()); 
}
