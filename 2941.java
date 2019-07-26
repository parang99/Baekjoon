import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char ch[] = str.toCharArray();
        int count = 0;
        for(int i = 0;i < ch.length;i++){
            count++;
            switch(ch[i]){
                case 'c':    //c= //c- 
                    if((i + 1 < ch.length) && (ch[i + 1] == '=' || ch[i + 1] == '-'))
                        i++;
                    break;
                case 'd':    //dz= //d-  
                    if(i + 2 < ch.length && ch[i + 1] == 'z' && ch[i + 2] == '=')
                        i += 2;
                    if(i + 1 < ch.length && ch[i + 1] == '-')
                        i++;
                    break;
                case 'l':    //lj //nj
                case 'n':
                    if((i + 1 < ch.length) && ch[i + 1] == 'j')
                        i++;
                    break;
                case 's':    //s= //z=
                case 'z':
                    if((i + 1 < ch.length) && ch[i + 1] == '=')
                        i++;
                    break;
            }
        }
        System.out.print(count);
    }
}