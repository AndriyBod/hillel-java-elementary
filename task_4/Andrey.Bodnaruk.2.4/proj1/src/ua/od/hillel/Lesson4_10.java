//Вывести первые 5 минимальных элементов массива
package ua.od.hillel;

public class Lesson4_10 {
    public static void main(String[] args) {
        int[] a = new int[20];
        int min=0, j=0;

        for (int i = 0; i < 20; i++) {
            a[i] = (int) (Math.random() * 20);
            System.out.print(a[i] + " ");
            min+=a[i];}
            min=min/20;
        System.out.println(" min="+min+" ");
        for (int i = 0; i < 20; i++) {
            if (a[i]<min){
            while(j<5) {
                System.out.println(a[i] + " a[" + i + "] ");
                break;
            }j++;
            }
        }

    }
}
