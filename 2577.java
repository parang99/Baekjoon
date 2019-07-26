import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a, b;
        int len;
        int arr[] = new int[10];
        a = 1;
        for(int i = 0;i < 3;i++){
            b = scan.nextInt();
            a *= b;
        }
        len = (int)(Math.log10(a) + 1);
        for(int i = 0;i < len;i++){
            arr[a % 10]++;
            a /= 10;
        }
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}