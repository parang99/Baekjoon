import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int sum[] = new int [2];
        for(int i = 0;i < 2;i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0;j < 4;j++){
                sum[i] += Integer.parseInt(st.nextToken());
            }
        }
        if(sum[0] >= sum[1])
            bw.write(sum[0] + "\n");
        else
            bw.write(sum[1] + "\n");
        
        bw.flush();
        bw.close();
    }
}