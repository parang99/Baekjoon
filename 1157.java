import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        str = str.toUpperCase();
        int arr[] = new int [26];
        for(int i = 0;i < str.length();i++){
            arr[str.charAt(i) - 'A']++;
        }
        int max = 0;
        int b = 0;
        for(int i = 1;i < arr.length;i++){
            if(arr[max] == arr[i])
                b = 1;
            else if(arr[max] < arr[i]){
                max = i;
                b = 0;
            }
            else ;
        }
        if(b == 0)
            System.out.print((char)(max + 'A'));
        else
            System.out.print("?");
    }
}