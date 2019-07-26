import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int a, b;
        for(int i = 0;i < k;i++){
            a = scanner.nextInt();
            b = scanner.nextInt();
            System.out.println(a + b);
        }
    }
}