//Перевести число в двоичную систему счисления
package ua.od.hillel;
import java.util.Scanner;
public class Lesson4_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=a;
        int c=a;
        int d;
        int i=0;
        while (b!=0){
            b=b/2;
            i++;
        }
        int[] w=new int[i];
        for (int j = 0; j < i; j++) {
            d=c%2;
            c=c/2;
            w[j]=d;
        }
        for (int j = i-1; j >= 0; j--) {
            System.out.print(w[j]+" ");
        }
    }
}