import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int q1 = 0, q2 = 0, q3 = 0, q4 = 0, axis = 0;
        
        for(int i = 0;i < n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
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
        bw.write("Q1: " + q1 + "\n" + "Q2: " + q2 + "\n");
        bw.write("Q3: " + q3 + "\n" + "Q4: " + q4 + "\n" + "AXIS: " + axis);
        bw.flush();
        bw.close();
    }
}