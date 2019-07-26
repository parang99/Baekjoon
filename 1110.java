import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int origin, a, b, add, oldnum;
        int newnum = 100;
        int count = 0;
        origin = scan.nextInt();
        oldnum = origin;
        
        while(origin != newnum){
            a = oldnum / 10;
            b = oldnum % 10;
            add = a + b;
            newnum = b * 10 + add % 10;
            count++;
            oldnum = newnum;
        }
       
        System.out.println(count);
    }
}