import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int q = 2;
        
        if(n == 1)
            ; // 1의 소인수는 존재x
        
        while(n > 1){
            for(int i = q;i <= n;i++){
                if(n % i == 0){
                    q = i;
                    break;
                }
            }
            n = n / q;
            bw.write(q + "\n");
        }
      
        bw.flush();
        bw.close();
    }
}