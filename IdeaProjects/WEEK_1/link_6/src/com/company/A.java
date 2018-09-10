import java.util.Map;
import java.util.Scanner;
public class A {

    static int f(int a,int b, int c, int d){
        int res;
        a=Math.min(a,b);
        c=Math.min(c,d);
        res=Math.min(a,c);
        return  res;
    }
    public static void main(String[] args) {
        // write your code here
        int a,b,c,d;
        Scanner cs = new Scanner(System.in);
        a=cs.nextInt();
        b=cs.nextInt();
        c=cs.nextInt();
        d=cs.nextInt();
        int res=f(a,b,c,d);
        System.out.print(res);

    }
}
 