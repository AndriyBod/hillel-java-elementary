//Найти все счастливые билеты от 100000 до 999999:
//билет счастливый если сумма первых трех цифр равна сумме трех последних
//например,123312: 1+2+3==3+1+2
package ua.od.hillel;

public class Lesson4_8 {
    public static void main(String[] args) {
        int i=100000;
        while(i<1000000){
            int a=i/100000;
            int b=(i/10000)%10;
            int c=(i/1000)%10;
            int d=(i/100)%10;
            int e=(i/10)%10;
            int f=i%10;
            if(a+b+c==d+e+f){
            System.out.println(i+"\n"+a+" "+b+" "+c+" "+d+" "+e+" "+f);
            }
            i++;

        }
    }
}
