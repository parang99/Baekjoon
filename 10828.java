import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = "";
        Stack s = new Stack();
        int k = 0;
        for(int i = 0;i < n;i++){
            str = scan.next();
            if(str.equals("push")){
                k = scan.nextInt();
                s.push(k);
            }
            else if(str.equals("pop"))
                s.pop();
            else if(str.equals("size"))
                s.size();
            else if(str.equals("empty"))
                s.empty();
            else if(str.equals("top"))
                s.top();
            else ;
        }
    }
}
class Stack{
    private int array[] = new int[10000];
    private int index = -1;
    
    public void push(int k){
        array[++index] = k;
    }
    public void pop(){
        if(index == -1)
            System.out.println(index);
        else{
            System.out.println(array[index]);
            index--;
        }
    }
    public void size(){
        System.out.println(index + 1);
    }
    public void empty(){
        if(index == -1)
            System.out.println("1");
        else
            System.out.println("0");
    }
    public void top(){
        if(index == -1)
            System.out.println(index);
        else
            System.out.println(array[index]);
    }
}