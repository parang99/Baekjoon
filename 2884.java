import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int m = scan.nextInt();
        
        if(m < 45){
            h--;
            m = m + 15;
        }
        else
            m -= 45;
        if(h == -1)
            h = 23;
        System.out.print(h + " " + m);
    }
}