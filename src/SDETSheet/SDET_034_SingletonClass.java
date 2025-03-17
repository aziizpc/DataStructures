package SDETSheet;

class Main {

    // Private static instance
    private static Main variable = null;
    private String str; 							// Non-static variable

    // Private constructor to prevent direct instantiation
    private Main(String str) {
        this.str = str;
    }

    // Static method to get the single instance
    public static Main getInstance(String str) {
        if (variable == null) { 					// Create the instance only once
            variable = new Main(str);
        }
        return variable;
    }

    // Getter and Setter for 'str'
    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    // Main method to test
    public static void main(String[] args) {

        // Dynamic input
        String input = "hello world";

        // Create Singleton instance
        Main x = Main.getInstance(input);
        Main y = Main.getInstance("ignored input"); 	// Ignored due to Singleton
        Main z = Main.getInstance("ignored input"); 	// Ignored

        // Modify string value
        x.setStr(x.getStr().toUpperCase()); 			// Update the value

        // Print results
        System.out.println(x.getStr()); 				// HELLO WORLD
        System.out.println(y.getStr()); 				// HELLO WORLD
        System.out.println(z.getStr()); 				// HELLO WORLD
    }
}