import java.util.Map;
import  java.util.Scanner;
public class G {

    public static void main(String[] args) {
        // write your code here

        Scanner cs = new Scanner(System.in);
        int k = 0, n = cs.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = cs.nextInt();
        }
        for(int i=n-1; i>=0; i--){
            System.out.print(a[i]+" ");
        }

    }
}
 