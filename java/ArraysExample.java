class ArraysExample {
    public static void main(String[] args) {
        String[] bandInstruments = {"bass", "guitar", "electric keyboard", "drums"};
        System.out.println(bandInstruments[2]);
        bandInstruments[2] = "melodica";
        System.out.println(bandInstruments[2]);  // Arrays are mutable, so this will return "melodica"
        System.out.println(bandInstruments.length);
    
        String[] quartetInstruments = new String[4];  // Declare an empty array of Strings of length 4
        quartetInstruments[0] = "violin"; // Populate the empty array by setting each index to a value
        quartetInstruments[1] = "violin";
        quartetInstruments[2] = "viola";
        quartetInstruments[3] = "cello";
        
        // Traverse arrays using for loops like so
        for (int i = 0; i < quartetInstruments.length; i++) {
            System.out.println(quartetInstruments[i]);
        }

        // Alternatively, use a for-each loop like so (equivalent to the above for loop in this instance)
        for (String instrument: quartetInstruments) {
            System.out.println(instrument);
        }

        // Another example of everything done from scratch myself for practice
        String[] favoriteMovies = new String[5];
        favoriteMovies[0] = "Everything Everywhere All At Once";
        favoriteMovies[1] = "Puss In Boots: The Last Wish";
        favoriteMovies[2] = "Whiplash";
        favoriteMovies[3] = "声の形 (A Silent Voice)";
        favoriteMovies[4] = "Interstellar";

        for (String movie: favoriteMovies) {
            System.out.println("I love ".concat(movie).concat("!")); // Note that we can call methods on String literals, and repeatedly call methods to build Strings
        }
     
    }
}