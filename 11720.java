import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String str = scan.nextLine();
        int result = 0;
        String[] s = str.split("");
        for(int i = 0;i < n;i++){
            result += Integer.parseInt(s[i]);
        }
        System.out.print(result);
    }
}