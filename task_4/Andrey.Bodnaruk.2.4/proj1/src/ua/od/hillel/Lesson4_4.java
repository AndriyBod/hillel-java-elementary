//Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
package ua.od.hillel;
public class Lesson4_4 {
    public static void main(String[] args) {
        int a=1;
        for (int i = 0; i < 20; i++) {
            a*=2;
            System.out.println(a);
        }
    }
}
