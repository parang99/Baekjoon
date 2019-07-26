import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        for(int i = 0;i < m;i++){
            int n = scan.nextInt();
            int scores[] = new int[n + 1]; // sum 저장을 위해 n + 1
            for(int j = 0;j < n;j++){ // scores[]에 점수들 저장
                scores[j] = scan.nextInt();
                scores[n] += scores[j]; // scores[n]에 sum 저장
            }
            int average = scores[n] / n;
            int count = 0;
            for(int j = 0;j < n;j++)
                if(scores[j] > average)
                    count++;
            System.out.println(String.format("%.3f", (double)count / n * 100) + "%");
        }
    }
}