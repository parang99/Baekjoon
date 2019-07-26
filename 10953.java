import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int k, a, b;
        String s;
        k = scanner.nextInt();
        for(int i = 0;i < k;i++){
            s = scanner.next();
            String split[] = s.split(",");
            a = Integer.parseInt(split[0]);
            b = Integer.parseInt(split[1]);
            System.out.println(a + b);
        }
    }
}