//Создайте калькулятор, который выполняет, базовые арифметические операции:
//        - умножение;
//        - деление;
//        - сложение;
//        - вычитание;
//        - остаток от деления (%);
//        - нахождение модуля числа (можно использовать Math.abs)
//        входные данные здесь можно представить как:
//        String operation = "addition";
//        int firstOperand = 15;
//        int secondOperand = 12;
package ua.od.hillel;
import java.util.Scanner;
public class Lesson3_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int firstOperand = 15;
        int secondOperand = 12;
        String a=sc.next();
        int d=0;
        switch (a){
         case "/":d=firstOperand/secondOperand;break;
         case "*": d=firstOperand*secondOperand;break;
         case "+": d=firstOperand+secondOperand;break;
         case "-": d=firstOperand-secondOperand;break;
         case "%": d=firstOperand%secondOperand;break;
         case "||": d=Math.abs(firstOperand);break;
        }
        System.out.println(d);
    }
}
