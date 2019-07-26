import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
      
        char array[] = new char [s.length()];
        for(int i = 0;i < array.length;i++){
            array[i] = s.charAt(i);
        }
        
        for(int i = 1;i < n;i++){
            s = br.readLine();
            for(int j = 0;j < array.length;j++){
                if(array[j] == '?')
                    continue;
                else if(array[j] != s.charAt(j))
                    array[j] = '?';
                else ;
            }
        }
        
        for(int i = 0;i < array.length;i++){
            bw.write(array[i]);
        }
        bw.write("\n");
        
        bw.flush();
        bw.close();
    }
}