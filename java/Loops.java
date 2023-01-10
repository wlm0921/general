public class Loops {
    public static void main(String[] args) {
      int num = 0;
      
      // while loop
      while (num < 10) {
        num++;
        if (num > 10) {
          break;  // break ceases execution of the loop entirely
        }
      }

      // do-while loop (ALWAYS runs the do block once, before then evaluating the while boolean and looping)
      do {
        System.out.println("Impossible!");
      } while (2 == 4);
  
      int[] myArray = new int[10];

      // for loop (works like a while loop, but with a local iterator variable)
      for (int i = 0; i < myArray.length; i++) {
        myArray[i] = i;
      }

      // for-each loop (works like a Python for loop, iterates through myArray with x being the iterated element)
      for (int x : myArray) {
        if (x % 2 == 0) {
          continue;  // continue bypasses the current iteration of the loop, but doesn't stop the next iteration
        }
        System.out.println(x);
    }

  }
}