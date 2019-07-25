import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        int array[][] = new int [n][3];
        
        for(int i = 0;i < n;i++){
            st = new StringTokenizer(br.readLine());
            array[i][0] = Integer.parseInt(st.nextToken());
            array[i][1] = Integer.parseInt(st.nextToken());
        }
        
        for(int i = 0;i < n;i++){
            int k = 0;
            for(int j = 0;j < n;j++){
                if(i == j) continue;
                if(array[i][0] < array[j][0] && array[i][1] < array[j][1])
                    k++;
            }
            array[i][2] = k + 1;
        }
        
        for(int i = 0;i < n;i++){
            bw.write(array[i][2] + " ");
        }
        
        bw.flush();
        bw.close();
    }
}