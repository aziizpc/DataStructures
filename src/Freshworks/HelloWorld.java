package Freshworks;

class HelloWorld {
	
    public static void main(String[] args) {
        int c = calc(16);
        System.out.println(c);
    }
    
    public static int calc(int n){
        for (int i = 0 ; i <= n - 2 ; i++){
            int q = n - i;
            int k = n + i;
            boolean a = prime(q);
            boolean b = prime(k);
            
            if (a == true){
                return q;
            }
            else if (b == true){
                return k;
            }
        }
        return 2;
    }
    
    public static boolean prime(int num) {
        boolean flag = true;
        for (int i = 2 ; i <= num / 2 ; i++){
            if (num % i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }
}