class Methods {

    // public methods can be accessed by any other part of a program, including other classes
    // static methods can be called throughout a program, without having to instantiate an object of the class
    // After these, the return type of the method is given
    // void methods do not return a value, they are procedures
    // Following the return type, the method is named, with the parameters given in the parentheses
    // All code within the curly braces following the method declaration is the method body
    // The main method is executed upon running the code it is included in, without needing to be called

    public static void printSomething() {
      System.out.println("Something!");
    }
  
    public static void printName(String name) {
      System.out.println(name);
    }
    
    public static int findSum(int a, int b) {
      return a + b;
    }
  
    public static void main(String[] args) {
        printSomething();
    
        printName("Moira");
        printName("Ronnie");
    
        int product = findSum(3,4);
        System.out.println(product);
    }
}