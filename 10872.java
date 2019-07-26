import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Main m = new Main();
        System.out.print(m.fact(scan.nextInt()));
    }
    int fact(int n){
        int k = 1;
        for(int i = 2;i <= n;i++)
            k *= i;
        return k;
    }
}