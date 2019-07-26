/*연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때 이다.*/
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int y = scan.nextInt();
        if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
            System.out.print("1");
        else
            System.out.print("0");
    }
}