import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int a = 0;
        int b = 10;
        for(;b < str.length() + 1;a += 10, b += 10){
            System.out.println(str.substring(a, b));
        }
        System.out.println(str.substring(a, str.length()));
    }
}