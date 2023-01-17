public class Dog {
    private String name; // Note that this instance variable is private
    // Thus, this instance variable cannot be accessed by other classes
  
    public Dog(String name) {
        this.name = name;
    }
    
    // This is known as a getter method (or accessor method)
    // Getter methods allow access to the values of instance variables, without letting other places know
    // the EXACT names of the instance variables
    // Getters must always be public methods, with a return type matching the type of the instance variable
    public String getName() {
        return name;
    }
    
    // This is known as a setter method (or mutator method)
    // Setters let other classes reset the value of a private instance variable
    // Setters often are void methods (no return type), and have a single parameter of the same type as the
    // private instance variable they are setting
    public void setName(String newName) {
        name = newName;
    }
  
    public static void main(String[] args) {
        Dog myDog = new Dog("Lassie");
        myDog.setName("Cujo");
        System.out.println(myDog.getName());
    }
  
}