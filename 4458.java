import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0;i < n;i++){
            String s = br.readLine();
            String str = (s.substring(0, 1)).toUpperCase();
            str = str.concat(s.substring(1));
            bw.write(str + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}