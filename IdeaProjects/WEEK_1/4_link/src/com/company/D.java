import java.util.Map;
import  java.util.Scanner;
public class D {

    public static void main(String[] args) {
        // write your code here

        Scanner cs=new Scanner(System.in);
        int k=0;
        int n=cs.nextInt();
        while (n!=0)
        {
            k+=n%2;
            n/=2;
        }
        if(k==1){
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}