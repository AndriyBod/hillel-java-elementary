
package ua.od.hillel;
import java.util.Scanner;
public class Lesson5_1 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int s=scanner.nextInt();
        int ss=scanner.nextInt();
        int[][] a=new int[s][ss];
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < ss; j++) {

                a[0][ss / 2] = 1;
                if (i>0&&j==ss-1)a[i][j]=a[i-1][j-1];
                else if (i==0)a[i][j] = a[i][j];
                else if (j==0)a[i][j] = a[i - 1][j+1];
                else if (j==ss-1)a[i][j] = a[i-1][j-1];
                else a[i][j] = a[i - 1][j-1] + a[i - 1][j + 1];
                System.out.print(a[i][j]+"\t");

            }
            System.out.println();
        }
    }
}