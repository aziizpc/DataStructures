package SDETSheet;

public class SDET_023_DecimalToHex {
	
	public static String toHex(int num) {

        StringBuilder ans = new StringBuilder();

        char[] map = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        while (num != 0){
            char c = map[(num & 15)];
            ans.insert(0, c);
            num >>>= 4;
        }

        return ans.toString();
        
    }
	
	public static void main(String[] args) {
		
		int num = 8501;		
		System.out.println(toHex(num));
		
		num = 26;
		System.out.println(toHex(num));
		
		num = -1;
		System.out.println(toHex(num));
		
	}

}