import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
       
        int n = Integer.parseInt(br.readLine());
        for(int i = 0;i < 9;i++){
            n -= Integer.parseInt(br.readLine());
        }

        
        bw.write(n + "\n");
        
        bw.flush();
        bw.close();
    }
}