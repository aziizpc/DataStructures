package SDETSheet;

public class SDET_009_NearestPrime {
    
    public static int nearestPrime(int k){
        
        if (checkPrime(k)) return k;
        
        else {
            int p = (k - 1);
            int q = (k + 1);
            while (true){
                if (checkPrime(p)) return p;
                if (checkPrime(q)) return q;
                p--; q++;
            }
        }
    }
    
    public static boolean checkPrime(int k){
        if (k <= 1) return false;
        for (int i = 2 ; i <= Math.sqrt(k) ; i++){
            if (k % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        
        int n = 1000;        
        System.out.println(nearestPrime(n));
        
        n = 2345;        
        System.out.println(nearestPrime(n));
        
        n = 7654;        
        System.out.println(nearestPrime(n));
    }
}