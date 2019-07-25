import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        int m = 0;
        
        for(int i = 1;i < n;i++){
            int sum = i;
            int copy = i;
            do{ sum = sum + copy % 10;
                copy /= 10;
            } while(copy != 0);
            if(sum == n){
                m = i;
                break;
            }
        }
        
        System.out.print(m);
    }
}