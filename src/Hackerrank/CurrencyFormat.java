package Hackerrank;

import java.util.*;
import java.text.*;

public class CurrencyFormat {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        double inputDouble = sc.nextDouble();
        
        NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        System.out.println("US: " + us.format(inputDouble));
        System.out.println("India: " + india.format(inputDouble));
        System.out.println("China: " + china.format(inputDouble));
        System.out.println("France: " + france.format(inputDouble));
    }
}