import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int k, a, b;
        k = scanner.nextInt();
        for(int i = 1;i <= k;i++){
            a = scanner.nextInt();
            b = scanner.nextInt();
            a = a + b;
            System.out.println("Case #" + i + ": " + a);
        }
    }
}