import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0;i < n;i++){
            int score = 0;
            int k = 0;
            String s = scan.next();
            for(int j = 0;j < s.length();j++){
                if(s.charAt(j) == 'O')
                    score += (++k);
                else if(s.charAt(j) == 'X')
                    k = 0;
                else ;
            }
            System.out.println(score);
        }
    }
}