import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int n = scan.nextInt();
            int k = scan.nextInt();
            
            int eat = 0;
            int coupon = 0;
            int plus = 0;
            eat = coupon = n;
            while(coupon >= k){
                plus = coupon / k;
                eat += plus;
                coupon = coupon % k + plus;
            }
            System.out.println(eat);
        }
    }
}