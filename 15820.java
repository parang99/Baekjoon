import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s1 = Integer.parseInt(st.nextToken());
        int s2 = Integer.parseInt(st.nextToken());
        
        int i, a, b;
        for(i = 0;i < s1;i++){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if(a != b)
                break;
        }
        if(i != s1)
            bw.write("Wrong Answer");
        else{
            for(i = 0;i < s2;i++){
                st = new StringTokenizer(br.readLine());
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());
                if(a != b)
                    break;
            }
            if(i == s2)
                bw.write("Accepted");
            else
                bw.write("Why Wrong!!!");
        }
        
        bw.flush();
        bw.close();
    }
}