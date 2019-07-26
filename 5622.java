import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        // ABC DEF GHI JKL  MNO   PQRS  TUV   WXYZ  OTHERS
        // 0~2 3~5 6~8 9~11 12~14 15~18 19~21 22~25 
        // 3   4   5    6     7     8     9     10  11
        int t[] = {3, 4, 5, 6, 7, 8, 9, 10, 11};
        int time = 0;
        for(int i = 0;i < str.length();i++){
            int c = str.charAt(i) - 'A';
            int cal = c / 3;
            if(c == 18 || c == 21 || c == 24){
                time += t[cal - 1];
            }
            else if(c == 25){
                time += 10; //t[7];
            }
            else if(cal <= 7){
                time += t[cal];
            }
            else{
                time += 11; //t[8];
            }
        }
        System.out.print(time);
    }
}