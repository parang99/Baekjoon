import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("문제의 정답\n");
        bw.flush();
        bw.close();
    }
}