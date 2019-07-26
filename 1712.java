import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int x, y, z;
        x = scan.nextInt();
        y = scan.nextInt();
        z = scan.nextInt();
        
        long money = 0; // money = sell - make = zn - yn - x;
        int n = 1;
        
        // y의 기울기가 z보다 크거나 같으면 만나지 않음
        if(y >= z)
            n = -1;
        
        // money가 0초과하는 n 구하기
        while(n > 0){
            money = (z - y) * n;
            if(money > x)
                break;
            n++;
        }
        System.out.print(n);
    }
}