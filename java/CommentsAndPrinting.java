public class CommentsAndPrinting {
    /*
    This is the main method:
    */
    public static void main(String[] args) {
        // This will end with a new line
        System.out.println("Hello world!");
        // This won't end with a new line
        System.out.print("Howdy y'all!");
        System.out.println("Hey friends!");
        // This will print the result of 1 + 2
        System.out.print("1 + 2 = " + addNumbers(1, 2));
    }

    /*This method takes in two whole numbers and then returns their sum*/
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}
