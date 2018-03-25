//Найти сумму первых n элементов массива
package ua.od.hillel;
import java.util.Scanner;
public class Lesson4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a=new int[10];
        for (int i = 0; i < 10; i++) {
            a[i]=sc.nextInt();
        }
        int b= sc.nextInt();
        int c=0;
        for (int i = 0; i < b; i++) {
            c+=a[i];
        }
        System.out.println(c);
    }
}
