//Write a program to repeatedly add all the digits until the result has only one digit of a given non-negative number:
//The digital root of 555555 = 5 + 5 + 5 + 5 + 5 + 5 = 30 = 3 + 0 = 3
package ua.od.hillel;

import java.util.Scanner;

public class Lesson4_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input digit:");
        String a=sc.next();
        int e;
        do{
            e=0;
        int c=a.length();
        String[] b= a.split("");
        int[] d=new int[c];
        for (int i = 0; i < c; i++) {
            d[i] = Integer.parseInt(b[i]);
            System.out.print(d[i] + " ");
            e += d[i];
        }
        System.out.println("");
        System.out.println(e);
        a=String.valueOf(e);
        }while(e>=10);
    }
}
