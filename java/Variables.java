public class Variables {
    public static void main(String[] args) {
        // int (Integer)
        int intNum = 6;
        intNum++; // Increment Operator -> intNum now equals 7
        intNum *= 3; // intNum now equals 21
        System.out.println(intNum);

        // double (Like float in Python)
        double doubleNum; // Don't have to assign a value right away
        doubleNum = 14.8;
        doubleNum = 12 - 6.5;
        doubleNum /= 2; // doubleNum now equals 2.75
        System.out.println(doubleNum);

        // boolean
        boolean a = true; // booleans in Java are true or false (note no capitalization)
        a = false;
        System.out.println(a);

        // String (Note capitalization of String, since String is a class)
        String str = "Hello, world!";
        System.out.print(str);

        // char (Stores a single character value)
        char firstLetter = 'a'; // Uses single quotation marks, unlike Strings which use doubles
        System.out.print(firstLetter);

        // Arithmetic Operators
        /*
         * +: Addition
         * -: Subtraction
         * *: Multiplication
         * /: Division
         * %: Modulus (x % y returns the remainder of x / y)
         * ++: Increment (x++ <-> x += 1)
         * --: Decrement (x-- <-> x -= 1)
        */

        // THERE IS NO EXPONENTIATION OPERATOR
        /*
         * Instead, we use the method Math.pow(a, b), which returns a ** b (in Python syntax)
        */

        // Integer Division vs. Double Division
        /*
         * When both inputs to the division operator are ints, Java automatically
         * handles them as integer division (i.e. returns an integer where the remainder
         * of the division is dropped).
         * 
         * In order to perform double division on two int inputs, we must cast one to a double,
         * which will cause Java to implicitly cast the other to a double and perform the
         * desired division operation. This is done by writing:
         * x / (double) y
        */

        // Logical Operators
        /*
         * &&: Logical and
         * ||: Logical or
         * !:  Logical not
        */
    }
}
