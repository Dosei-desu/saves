//trying to make a binary search engine

//code borrowed from : https://en.wikipedia.org/wiki/Binary_search_algorithm#Procedure 
//and modified to fit this specific example

int[] scrambledArray = new int[50];

int target = 9;

void setup(){
  for(int n = 0; n < scrambledArray.length; n++){
    scrambledArray[n] = (int)random(15);
  }
  scrambledArray = sort(scrambledArray);
  
  int res = binarySearch(scrambledArray,target);
  //check an array for a specific number using binary search
  if(res == -1){
    println("Target Not Found.");
  }else{
    println("Target is number "+res+" on the list.");
    int i = 1;
    while(scrambledArray[res+i] == target && res+i < scrambledArray.length-1){
      println("Target is also number "+(res+i)+" on the list.");
      i++;
    }
  }
}

int binarySearch(int[] _array, int _target){
  println(_array);
  println(""); //spacer
  for(int n = 0; n < _array.length; n++){
    int L = 0;
    int R = n;
    while(L <= R){
      int m = floor((L + R)/2);
      if(_array[m] < _target){
        L = m + 1;
      }else if(_array[m] > _target){
        R = m - 1;
      }else{
        return m;
      }
    }    
  }
  return -1; //not found
}
