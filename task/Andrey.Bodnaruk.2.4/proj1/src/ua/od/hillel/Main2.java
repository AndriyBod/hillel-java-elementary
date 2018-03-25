package ua.od.hillel;

public class Main2 {

    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
        System.out.println(a+" "+b+" "+c);//123
        //java -cp out Main 123 127 672
//        short a=128;
//        short b=20;
//        int res= addNumbers(a,b);
//        System.out.println("res: "+res);
      }
      public static int addNumbers(short x, short y){
        return  x/y;
      }
}