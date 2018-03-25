//Добавить к калькулятору возможность ввода операции и чисел из консоли. В начале выводите сообщение
// "Введите операцию:", дальше пользователь вводит операцию, далее "Введите первое число:" - вводит,
// "Введите второе число: " - пользователь вводит.
package ua.od.hillel;

import java.util.Scanner;

public class Lesson3_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите операцию: ");
        String a=sc.next();
        System.out.print("Введите первое число");
        int firstOperand =sc.nextInt();
        System.out.print("Введите второе число");
        int secondOperand =sc.nextInt();
        int d=0;
        switch (a){
            case "/":d=firstOperand/secondOperand;break;
            case "*": d=firstOperand*secondOperand;break;
            case "+": d=firstOperand+secondOperand;break;
            case "-": d=firstOperand-secondOperand;break;
            case "%": d=firstOperand%secondOperand;break;
            case "||": d=Math.abs(firstOperand);break;
        }
        System.out.println("Результат: "+d);
    }
}
