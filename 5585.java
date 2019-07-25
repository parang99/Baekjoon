import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int money = Integer.parseInt(br.readLine());
        int c = 0;
        money = 1000 - money;
        int m[] = {500, 100, 50, 10, 5, 1};
        for(int i = 0;i < 6;i++){
            while(money >= m[i]){
                c++;
                money -= m[i];
            }
        }
        bw.write(c + "\n");
        
        bw.flush();
        bw.close();
    }
}