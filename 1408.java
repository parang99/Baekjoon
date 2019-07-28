import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine(), ":");
        int present = Integer.parseInt(st.nextToken()) * 3600;
        present = present + Integer.parseInt(st.nextToken()) * 60;
        present += Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), ":");
        int start = Integer.parseInt(st.nextToken()) * 3600;
        start = start + Integer.parseInt(st.nextToken()) * 60;
        start += Integer.parseInt(st.nextToken());

        if(start < present){
            present = present - 24 * 60 * 60;
        }
        int left = start - present;
        
        int temp = left / 3600;
        left %= 3600;
        
        if(temp == 0)
            bw.write("00:");
        else if(temp < 10)
            bw.write("0" + temp + ":");
        else bw.write(temp + ":");
        
        temp = left / 60;
        left %= 60;
        
        if(temp == 0)
            bw.write("00:");
        else if(temp < 10)
            bw.write("0" + temp + ":");
        else bw.write(temp + ":");
        
        if(left == 0)
            bw.write("00\n");
        else if(left < 10)
            bw.write("0" + left + "\n");
        else bw.write(left + "\n");
        
        bw.flush();
        bw.close();
    }
}