public class Car {
    // Below is the constructor for the class Car, constructors share names with their respective class
    public Car() {
        System.out.println("I'm the constructor!");  // All code in the constructor is executed when it is called
    }
    
    // Below is the main method of the class Car, every class should have a main method
    public static void main(String[] args) {
        Car honda = new Car();  // This creates a new instance of Car that the variable honda references
        // The new keyword tells Java to create the new instance of Car, and an error will be thrown without it
        System.out.println(honda);  // By default, this will print the memory address that honda refers to
    }
}

/* Access Modifiers
 *
 *                  Class   Package     Child Class     Global
 * public:          o       o           o               o
 * protected:       o       o           o               x
 * (no modifier):   o       o           x               x
 * private:         o       x           x               x
 * 
 * These determine which other parts of a program can interact with the given class
 * Thus, public lets any part of the program interact with the given class,
 * while private means that the class can only be interacted with from inside of it
 * 
 */