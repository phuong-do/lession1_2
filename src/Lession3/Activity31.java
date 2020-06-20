package Lession3;

import java.util.Scanner;

public class Activity31 {
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);
        int n;
        System.out.print("Nhap n:");
        n = Scanner.nextInt();
        int x = n-1;
        for (int i = 1; i<=n; i = i+1)
        {
            for(int j = 0; j<x ; j =j+1) {
                System.out.print(" ");
            }
            for(int a = 0; a< (n-x); a= a+1){
                System.out.print("*");
            }
            for(int ii = 0; ii < n-x-1; ii= ii + 1){
                System.out.print("*");
            }
            x = x -1;
            System.out.println();
        }

    }
}
