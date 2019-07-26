import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(a > b)
            if(b > c)
                System.out.print(b);
            else if(a > c)
                System.out.print(c);
            else
                System.out.print(a);
        else // b >= a
            if(a > c)
                System.out.print(a);
            else if(b > c)
                System.out.print(c);
            else
                System.out.print(b);
    }
}