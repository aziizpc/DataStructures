package Hackerrank;

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class BigInteger_Basics1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        BigInteger b1 = new BigInteger(s1);
        BigInteger b2 = new BigInteger(s2);
        
        System.out.println(b1.add(b2));
        System.out.println(b1.multiply(b2));
        
    }
}