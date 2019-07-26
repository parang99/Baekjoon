import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] scores = new int[1000];
        int max = 0;
        double mean = 0;
        for(int i = 0;i < n;i++){
            scores[i] = scan.nextInt();
            if(scores[i] > max)
                max = scores[i];
        }
        for(int i = 0;i < n;i++){
            mean += scores[i] * 100.0 / max;
        }
        System.out.print(mean / n);
    }
}