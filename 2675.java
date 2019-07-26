import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0;i < n;i++){
            int k = scan.nextInt();
            String str = scan.next();
            String p = "";
            for(int j = 0;j < str.length();j++)
                for(int l = 0;l < k;l++)
                    p = p.concat(str.charAt(j) + "");
            System.out.println(p);
        }
    }
}