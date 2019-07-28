import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int c;
        while((c = br.read()) != -1){
            bw.write(c);
        }

        bw.write("\n");
        
        bw.flush();
        bw.close();
    }
}