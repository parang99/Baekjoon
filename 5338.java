import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("       _.-;;-._\n\'-..-\'|   ||   |\n\'-..-\'|_.-;;-._|\n\'-..-\'|   ||   |\n\'-..-\'|_.-\'\'-._|\n");
        bw.flush();
        bw.close();
    }
}

