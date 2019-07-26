import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a[] = new int[8];
        int n = 0;
        
        for(int i = 0;i < a.length;i++){
            a[i] = scan.nextInt();
        }
        if(a[0] == 1){
            n = 1;
            for(int i = 1;i < a.length;i++){
                if(a[i - 1] > a[i]){
                    n = 0;
                    break;
                }
            }
        }
        else if(a[0] == 8){
            n = 2;
            for(int i = 1;i < a.length;i++){
                if(a[i - 1] < a[i]){
                    n = 0;
                    break;
                }
            }
        }
        else
            ;
        
        if(n == 0)
            System.out.print("mixed");
        else if(n == 1)
            System.out.print("ascending");
        else // n == 2
            System.out.print("descending");
        
    }
}