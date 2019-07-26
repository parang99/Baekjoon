import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int a, b, c;
        
        c = m % 10;
        b = (m / 10) % 10;
        a = m / 100;
        m = a + b * 10 + c * 100;
        
        c = n % 10;
        b = (n / 10) % 10;
        a = n / 100;
        n = a + b * 10 + c * 100;
        
        if(m > n)
            System.out.print(m);
        else
            System.out.print(n);
    }
}