//Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
package ua.od.hillel;
public class Lesson4_2 {
    public static void main(String[] args) {
        int[] a=new int[55];
        a[0]=1;
        for (int i = 0; i < 55; i++) {
            if (i==0){
                a[i]=1;
            }
            else {
                a[i]=a[i-1]+2;
            }
            System.out.println(a[i]);
        }
    }
}
