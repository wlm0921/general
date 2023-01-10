public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println(str.length()); // str.length() outputs the length of the string str
    
        String name = "Code";
        name = name.concat("cademy"); // str1.concat(str2) outputs the concatenation of str1 and str2, without mutating either
        System.out.println(name); 
    
        String flavor1 = "Mango";
        String flavor2 = "Matcha";
        System.out.println(flavor1.equals(flavor2)); // str1.equals(str2) checks for equality (== doesn't work for strings)
    
        // Use str1.equalsIgnoreCase(str2) to compare str1 and str2 while ignoring case

        String letters = "ABCDEFGHIJKLMN";
        System.out.println(letters.indexOf("C")); // str.indexOf("sub") returns the index the substring sub first begins at withing str
        System.out.println(letters.indexOf("EFG")); // E.g. this outputs 4, while letters.indexOf("Z") returns -1 since "Z" isn't in letters
    
        String currency = "Yen";
        System.out.println(currency.charAt(2)); // str.charAt(int) returns the character at index int in str, and returns an error if int is an invalid index for str
    
        String line = "It was the best of times, it was the worst of times.";
        System.out.println(line.substring(26)); // Returns the substring beginning at index 26, through the end of line
        System.out.println(line.substring(7, 24)); // Returns the substring beginning at index 7, through to index 24, including 7 but not 24
    
        String input = "Cricket!";
        System.out.println(input.toUpperCase()); // Converts a string to uppercase
        System.out.println(input.toLowerCase()); // Converts a string to lowercase
  
    }
}