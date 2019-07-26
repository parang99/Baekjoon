import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int a[] = new int[26];
        
        for(int i = 0;i < a.length;i++){
            a[i] = -1;
        }
        
        for(int i = 0;i < str.length();i++){
            if(a[str.charAt(i) - 'a'] == -1)
                a[str.charAt(i) - 'a'] = i;
        }
        
        for(int i = 0;i < a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
}