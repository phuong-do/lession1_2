package Lession3;

import java.util.Scanner;

public class Activity32 {
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);
        int n;
        int a = 0, b = 1, c = 1;
        System.out.print("nhap n:");
        n = Scanner.nextInt();
        System.out.print("0,1,1,");
        for(int i = 3; i<n; i = i+1){

            a = b;
            b = c;
            c = a + b;
            if (n-i == 1){
                System.out.print(c);
            }
            else {
                System.out.print(c+ ",");
            }
        }
    }
}
