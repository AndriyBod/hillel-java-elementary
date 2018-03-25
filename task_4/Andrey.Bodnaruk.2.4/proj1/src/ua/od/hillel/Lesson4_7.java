//Найти сумму всех четных и сумму всех нечетных элементов массива
package ua.od.hillel;

public class Lesson4_7 {
    public static void main(String[] args) {
        int[] a=new int[20];
        for (int i = 0; i < 20; i++) {
            a[i]=(int)(Math.random()*100);
        }
        for (int i = 0; i < 20; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.print("\nЧетные: ");
        for (int i = 0; i < 20; i++) {
            if(a[i]%2==0){
                System.out.print(a[i]+" a["+i+"];");

            }
        }
        System.out.print("\nНечетные: ");
        for (int i = 0; i < 20; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " a[" + i + "];");
            }
        }
    }
}