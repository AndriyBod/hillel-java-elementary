package ua.od.hillel;
import java.util.Scanner;
public class Main3 {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        String[] cards = {
                "6 ♥", "7 ♥", "8 ♥", "9 ♥", "10 ♥", "J ♥", "Q ♥", "K ♥", "A ♥",
                "6 ♦", "7 ♦", "8 ♦", "9 ♦", "10 ♦", "J ♦", "Q ♦", "K ♦", "A ♦",
                "6 ♠", "7 ♠", "8 ♠", "9 ♠", "10 ♠", "J ♠", "Q ♠", "K ♠", "A ♠",
                "6 ♣", "7 ♣", "8 ♣", "9 ♣", "10 ♣", "J ♣", "Q ♣", "K ♣", "A ♣"
        };
        int[] cost = {
                6, 7, 8, 9, 10, 10, 10, 10, 11,
                6, 7, 8, 9, 10, 10, 10, 10, 11,
                6, 7, 8, 9, 10, 10, 10, 10, 11,
                6, 7, 8, 9, 10, 10, 10, 10, 11};
        int[] deck= createDeck();
        shaffleDeck(deck);
        exit:
        while(true){
            for (int i = 0; i < args.length; i++) {
                System.out.println("Would you like one card mone:");// начальное состояние в любом случае
                Scanner sc = new Scanner(System.in);
                String str= sc.next();
                switch(str){
                    case "exit":break exit;
                    case "y":break; //хоть один - игра идет
                    case "n":break;// все - конец
                }
            }

            }
        }

    public static int[] createDeck(){
            int[] deck = new int[36];
            for (int i = 0; i < 36; i++) {
                deck[i] = i;
            }
        return deck;
    }
        public static void shaffleDeck(int[] deck) {
            for (int i = 0; i < deck.length; i++) {

                int newIndex=(int)(Math.random())*(deck.length-1);
                int card = deck[i];
                deck[i]=deck[newIndex];
                deck[newIndex]=card;
            return ;
        }
    }
}
