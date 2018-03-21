package ua.od.hillel;

import java.util.Scanner;

public class Lesson5_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int c=sc.nextInt();
        int [][] a=new int[s][c];
        a[0][0]=1;
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < c; j++) {
                if (i==0&&j==0)a[i][j]=a[i][j];
                else if (j==0)a[i][j]=a[i-1][c-1]+1;

                else a[i][j]=a[i][j-1]+1;
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();

        }
        int [][] b=new int[s][c];
        b[0][0]=1;
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < c; j++) {
                if (i==0&&j==0)b[i][j]=b[i][j];
                else if (j==0)b[i][j]=b[i-1][c-1]+1;
                else b[i][j]=b[i][j-1]+1;
                System.out.print(b[i][j]+"\t");
            }
            System.out.println();

        }
    }
}