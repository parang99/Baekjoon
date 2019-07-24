import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        int day = scan.nextInt();
        int days[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String weeks[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        
        for(int i = 0;i < month;i++)
            day += days[i];
        System.out.print(weeks[day % 7]);
    }    
}