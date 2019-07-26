import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        while(n % 5 != 0 && n > 0){
            count++;
            n -= 3;
        }
        if(n % 5 == 0)
            count += n / 5;
        else
            count = -1;
        System.out.print(count);
    }
}