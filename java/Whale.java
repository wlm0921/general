class Whale {
    // The two lines below create two instance fields for Whale, every Whale instance will have these attributes
    // The instance fields of a class can be initialized to a specific value just like in Python by assigning values to them when they are defined
    String whaleSpecies;  // String whaleSpecies = "narwhal" would initialize whaleSpecies to "narwhal"
    int whaleWeight;
    
    public Whale(String name, int whaleWeight) {
        whaleSpecies = name;  // If the parameter and instance field have different names we can assign them properly like this
        this.whaleWeight = whaleWeight;  // If they share a name, we use the this keyword to assign the value, like self in Python
    }

    // Non-static methods are methods that belong to a class (and lack the static keyword)
    public void weight() {
        System.out.println(this.whaleWeight);  // You don't have to include "this." here, but I chose to anyways
    }
    
    // The toString method overrides how an object is printed to the console by System.out.println()
    public String toString(){
        return "This is a " + whaleSpecies + " whale which weighs about " + whaleWeight + " pounds.";
    }
    
    public static void main(String[] args){
        // The two lines below both create a Whale object (a reference to an instance of the class)
        // Saying that whale1 and whale2 are reference data types means that both of them are actually pointers to the memory address of a specific instance of Whale
        Whale whale1 = new Whale("narwhal", 2100);
        Whale whale2 = new Whale("beluga", 3000);
        System.out.println(whale1);  // Note that the toString method above is what makes the output like this
        System.out.println(whale2);  // Without the toString method, this would output the memory address of the object
        whale1.weight();  // Non-static methods must be invoked by an object of the class
        whale2.weight();
    }
}