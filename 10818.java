import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int num, min, max;
        num = scan.nextInt();
        min = max = num;
        for(int i = 1;i < n;i++){
            num = scan.nextInt();
            if(min > num)
                min = num;
            if(max < num)
                max = num;
        }
        System.out.print(min + " " + max);
    }
}