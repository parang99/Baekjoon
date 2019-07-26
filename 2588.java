import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int a, b, c, d;
        a = m * (n % 10);
        n /= 10;
        b = m * (n % 10);
        n /= 10;
        c = m * (n % 10);
        d = a + b * 10 + c * 100;
        System.out.print(a + "\n" + b + "\n" + c + "\n" + d);
    }
}