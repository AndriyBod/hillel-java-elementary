//Найти минимальный и максимальный элемент массива
package ua.od.hillel;

public class Lesson4_6 {
    public static void main(String[] args) {
        int[] a=new int[20];
        for (int i = 0; i < 20; i++) {
            a[i]=(int)(Math.random()*100);
        }
        for (int i = 0; i < 20; i++) {
        System.out.print(a[i]+" ");
        }
        int max=a[0];
        int min=a[0];
        int b=0;
        int c=0;
        for (int i = 0; i < 20; i++) {
            if(a[i]>max){
                max=a[i];
                b=i;
            }
            if(a[i]<min){
                min=a[i];
                c=i;
            }
        }
        System.out.print("\n");
        System.out.println("max="+max+" a["+b+"]");
        System.out.println("min="+min+" a["+c+"]");
    }
}
