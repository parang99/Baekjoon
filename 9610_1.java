import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int q1 = 0, q2 = 0, q3 = 0, q4 = 0, axis = 0;
        
        
        for(int i = 0;i < n;i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            
            if(x == 0 || y == 0)
                axis++;
            else if(x > 0 && y > 0)
                q1++;
            else if(x < 0 && y > 0)
                q2++;
            else if(x < 0 && y < 0)
                q3++;
            else if(x > 0 && y < 0)
                q4++;
            else
                ;
        }
        System.out.println("Q1: " + q1 + "\n" + "Q2: " + q2);
        System.out.print("Q3: " + q3 + "\n" + "Q4: " + q4 + "\n" + "AXIS: " + axis);
    }
}