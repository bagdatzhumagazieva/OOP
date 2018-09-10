import java.util.Map;
import  java.util.Scanner;
public class E {

    public static void main(String[] args) {
        // write your code here

        Scanner cs=new Scanner(System.in);
        int k=1,l=0;
        int n=cs.nextInt();
        while (k<n){
            k<<=1;
            l++;
        }
        System.out.println(l);
    }
}
 