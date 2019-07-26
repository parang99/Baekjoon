import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
        int n = Integer.parseInt(br.readLine());
        int yes = 0, no = 0;
        for(int i = 0;i < n;i++){
            int a = Integer.parseInt(br.readLine());
            if(a == 0)
                no++;
            else
                yes++;
        }
        if(no > yes)
            bw.write("Junhee is not cute!\n");
        else
            bw.write("Junhee is cute!\n");
        
        bw.flush();
        bw.close();
    }
}