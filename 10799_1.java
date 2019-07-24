import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int left = 0;
        int piece = 0;
        
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if(c == '('){ // start
                left++;
            }
            else if(c == ')'){
                left--;
                if(s.charAt(i - 1) == '('){ // laser
                    piece += left;
                }
                else{ // end
                    piece++;
                }
            }
            else ;
        }
        System.out.print(piece);
    }
}