import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int count = 0;
        while(scan.hasNext()){
            scan.next();
            count++;
        }
        System.out.print(count);
    }
}