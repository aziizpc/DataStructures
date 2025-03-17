package SDETSheet;

public class SDET_039_TrickyCalculation {
	
	public static void main(String[] args) {
        int x = 3; // 2
        int y = 4; // 4
        int z = 5; // 5

        int result = x++ / --y + ++z * x-- - z-- + --x * ++y;
        System.out.println(result);
        
        // 3 / 3 + 6 * 4 - 6 + 2 * 4
        
        // 1 + 24 - 6 + 8 = 25 - 6 + 8 = 19 + 8 = 27
    }

}