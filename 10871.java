import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        scan.nextLine();
        int k;
        for(int i = 0;i < n;i++){
            k = scan.nextInt();
            if(k < x)
                System.out.print(k + " ");
        }
    }
}