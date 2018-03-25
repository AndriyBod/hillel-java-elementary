package ua.od.hillel;

import ua.od.hillel.tools.Calc;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello Jar.");
        Calc calc=new Calc();
        System.out.println(calc.add(22,33.0));
    }
}
