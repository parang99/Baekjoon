import java.util.StringTokenizer;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        
        while(s != null){
            StringTokenizer st = new StringTokenizer(s);
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            
            int eat = 0;
            int coupon = 0;
            int plus = 0;
            eat = coupon = n;
            while(coupon >= k){
                plus = coupon / k;
                eat += plus;
                coupon = coupon % k + plus;
            }
            bw.write(eat + "\n");
            s = br.readLine();
        }
        bw.flush();
        bw.close();
    }
}