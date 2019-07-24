import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String s = br.readLine();
        int n = Integer.parseInt(s);
        
        for(int i = 0;i < n;i++){
            s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            a += b;
            
            bw.write(a + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}