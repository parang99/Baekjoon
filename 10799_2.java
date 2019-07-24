import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
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
        bw.write(piece + "\n"); // if no enter, error?
        bw.flush();
        bw.close();
    }
}