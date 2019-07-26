import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        
        for(int i = m;i <= n;i++){
            boolean prime = true;
            if(i == 1) continue;
            if(i % 2 == 0) {
                if(i == 2)
                    System.out.println(i);
                continue;
            }
            for(int j = 3;j * j <= i;j += 2){
                if(i % j == 0){
                    prime = false;
                    break;
                }
            }
            if(prime)
                System.out.println(i);
        }
    }
}