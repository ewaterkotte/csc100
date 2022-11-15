// Title: Module8CodeReading
// Author: Eric Waterkotte
// Date: 11/10/2021

class Main {
  public static void main(String[] args) {
    doIt();
    shoutIt("say hello!");
    int squared = squareUp(3);
    int sumOfThree = addThese(5, 22, 3);
    int mysteryVar = mystery(3);
    
    System.out.println(squared);
    System.out.println(sumOfThree);
    System.out.println(mysteryVar);
  }
  
  //Method #1 (aka function #1)
  public static void doIt(){
    System.out.println("Do what? ");
  }

  //Method #2 
  public static void shoutIt(String aWord){
    String aWordToShout = aWord.toUpperCase();
    System.out.println(aWordToShout);
  }
  
  //Method #3
  public static int squareUp(int x){
    return x * x;
  }
  
  //Method #4
  public static int addThese(int x, int y, int z){
    return x + y + z;
  }

  // Method #5
  public static int mystery(int n){
    int result = n;
    
    for(int i=0; i < n; i++){
      result = result * n;
    }
    
    return result;
  }

}
