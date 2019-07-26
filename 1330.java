import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        if(m == n){
            System.out.print("==");
        }
        else if(m > n){
            System.out.print(">");
        }
        else{
            System.out.print("<");
        }
    }
}