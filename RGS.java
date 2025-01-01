import java.util.*;
public class RGS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess The Random Number");
        int n;
        int r;

        do{
            r = (int)(Math.random()*100);
            System.out.println("Enter a number 01-99");
            n = sc.nextInt();
            if (r==n){
                System.out.println("your guess is right");
            } else if (r > n) {
                System.out.println("your guess is low");
            } else if (r < n) {
                System.out.println("your guess is high");
            }
        }while (r != n && n >= 0);

        if (n < 0) {
            System.out.println("Your stoped the program");
        }
    }
}
