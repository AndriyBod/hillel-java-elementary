//Задача "Чаевые".
//        входные данные: сумма, которую вы должны заплатить и уровень сервиса
//        в зависимости от уровня сервиса посчитайте количество денег, которое вы должны оставить:
//        - terrible (0%)
//        - poor (5%)
//        - good (10%)
//        - great (15%)
//        - excellent (20%)
import java.util.Scanner;
public class Lesson3_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < args.length; i++) {
            System.out.print("Качество Обслуживания: "+args[i]+"\n");
        }
        System.out.print("Сумма: ");
        double a = sc.nextDouble();
        double d = 0;
        switch (args[0]) {
            case "terrible":
                d = (a);
                break;
            case "poor":
                d = (a/100)*105;
                break;
            case "good":
                d = (a/100)*110;
                break;
            case "great":
                d = (a/100)*115;
                break;
            case "excellent":
                d = (a/100)*120;
                break;
        }
        System.out.println(d);
    }
}