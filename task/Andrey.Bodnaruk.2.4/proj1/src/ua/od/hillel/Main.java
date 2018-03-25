package ua.od.hillel;

public class Main {

    public static void main(String[] args) {
        int a=22;
        int count=a++;
        System.out.println(count);
        for(int i=0; i< count; i++){
            System.out.println(i);
        }
    }
}