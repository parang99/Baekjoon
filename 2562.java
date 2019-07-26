import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int n = 1;
        int max = num;
        for(int i = 2;i < 10;i++){
            num = scan.nextInt(); 
            if(max < num){
                max = num;
                n = i;
            }
        }
        System.out.print(max + "\n" + n);
    }
}