import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int sum = 0;
        for(int i = 0;i < 5;i++){
            int n = Integer.parseInt(br.readLine());
            if(n < 40)
                sum += 40;
            else
                sum += n;
        }
        
        bw.write(sum / 5 + "\n");
        
        bw.flush();
        bw.close();
    }
}