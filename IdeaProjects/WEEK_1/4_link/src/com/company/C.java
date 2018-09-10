import java.util.Map;
import  java.util.Scanner;
public class C {

    public static void main(String[] args) {
        // write your code here

        Scanner cs=new Scanner(System.in);
        int k=1;
        int n=cs.nextInt();
        while (k<=n)
        {
            System.out.print(k+" ");
            k=k*2;
        }
    }
}
 