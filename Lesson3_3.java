//Тот же калькулятор, только операция и числа вводятся как параметры из командной строки в "Edit Configuration".
// (попробуйте после того как запустили в IDE запустить приложение из консоли с передачей параметров).

public class Lesson3_3 {
    public static void main(String[] args) {

        for (int i = 0; i < args.length ; i++) {
            System.out.print(args[i]);
        }
        System.out.println("");
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[2]);
        int d=0;
        switch (args[1]){
            case "/":d=a/b;break;
            case "*": d=a*b;break;
            case "+": d=a+b;break;
            case "-": d=a-b;break;
            case "%": d=a%b;break;
            case "//": d=Math.abs(a);break;
        }
        System.out.println(d);
    }

}