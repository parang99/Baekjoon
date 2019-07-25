import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int num[] = new int [10];
       
        do{
            int k = n % 10;
            if(k == 6)
                num[9]++;
            else
                num[k]++;
            n /= 10;
        } while(n != 0);
        
        if(num[9] % 2 == 0)
            num[9] /= 2;
        else
            num[9] = num[9] / 2 + 1;
        
        int max = 0;
        for(int i:num){
            if(max < i)
                max = i;
        }
        
        bw.write(max + "\n");
        
        bw.flush();
        bw.close();
    }
}