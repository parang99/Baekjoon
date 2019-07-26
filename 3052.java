import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[10];
        int brr[] = new int[10];
        int b = 0;
        int k = -1;
        for(int i = 0;i < arr.length;i++){
            arr[i] = scan.nextInt();
        }
        for(int i = 0;i < arr.length;i++){
            b = arr[i] % 42;
            int j = 0;
            for(;j <= k;j++){
                if(b == brr[j])
                    break;
            }
            if(j > k)
                brr[++k] = b;
        }
        System.out.print(k + 1);
    }
}