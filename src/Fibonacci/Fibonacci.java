package Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int f1 = 0;
        int f2 = 1;
        int fn;
        while (f2 < 144) {
            fn = f1 + f2;
            if (f2 > 144){
                break;
            }
            System.out.println(fn);
            f1 = f2;
            f2 = fn;
        }



    }
}
