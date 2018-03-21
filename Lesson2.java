import java.util.Scanner;

public class Lesson2 {
    
    /** Main method */
    public static void main(String[] args) {
         minOfThreeNumbers(7, 13, 3);
         minAndMaxOfThreeNumbers(45, 67, 14);
         minAndSimilar(8,7,7);
		 evenOrNot(17, 5, 8);
		 ostatoc(18, 3);
		 niarest(14, 8);
		 arenda(20);
    }
	/*Найти минимальное из 3х чисел*/
	public static void minOfThreeNumbers(int a, int b, int c){
		System.out.println("first");
		int min = (a<b&&a<c)?a:(b<a&&b<c)?b:c;
		System.out.println("min: "+min);
	}
	/*Найти среди 3х чисел максимальное и минимальное*/
	public static void minAndMaxOfThreeNumbers(int a, int b, int c){
		System.out.println("second");
		int min = (a<b&&a<c)?a:(b<a&&b<c)?b:c;
		int max = (a>b&&a>c)?a:(b>a&&b>c)?b:c;
		System.out.println("min: "+min);
		System.out.println("max: "+max);
	}
	/*Найти минимальное из 3х чисел, причем, если минимальных несколько вывести все такие числа*/
	public static void minAndSimilar(int a, int b, int c){
		System.out.println("third");
		int min = (a<b&&a<c)?a:(b<a&&b<c)?b:c;
		System.out.println("min: "+min);
		if (min==a){
		System.out.println("min=a: "+a);
		}
		if (min==b){
		System.out.println("min=b: "+b);
		}
		if (min==c){
		System.out.println("min=c: "+c);
		}
		
	}
	/*Написать программу, которая проверит, является ли число четным или нечетным*/
	    public static void evenOrNot(int a, int b, int c){
			System.out.println("fourth");
			if(a%2==0){
				System.out.println("Numeral a("+a+") is even");
			}else{System.out.println("Numeral a("+a+") is odd");}
			if(b%2==0){
				System.out.println("Numeral b("+b+") is even");
			}else{System.out.println("Numeral b("+b+") is odd");}
			if(c%2==0){
				System.out.println("Numeral c("+c+") is even");
			}else{System.out.println("Numeral c("+c+") is odd");}
    }
	/*Даны 2 числа, определить делится ли первое число на второе без остатка*/
	public static void ostatoc(int a, int b){
		System.out.println("Fifth");
		if(a%b==0){
			System.out.println("Divining");
		}else{System.out.println("Not Divining");}
	}
	/* Найти ближайшее к 10 из 2х заданных чисел. Например, среди чисел 8 и 11 ближайшее к десяти 11*/
	public static void niarest(int a, int b){
		System.out.println("sixth");
		int c, d;
		c=Math.abs(10-a);
		d=Math.abs(10-b);
		int e = (c>d)?b:a;
		System.out.println("Nearest: "+e);
		}
	/*Посчитайте, сколько будет стоить аренда квартиры за заданное число дней, если известно,
	*что за 1 день ее стоимость 40 грн. Причем, если съемщик прожил в ней больше 5 дней, он получит скидку 20 грн,
	*а если больше 7 дней, то скидка составит 50 грн.
	*/
	public static void arenda(int b){
			System.out.println("Ninth");
			int a=40, c;
			int d=b%7;
			c=a*b;
			if(b>5 && b<7){
				c=c-20;
			}
				else if(b>7){
				c=c-(50*(b/7));
					if(d>=5){
						c=c-20;
					}				
				}
			System.out.println("Price: "+c);
			
	}
}