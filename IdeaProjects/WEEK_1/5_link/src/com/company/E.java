import java.util.Map;
import  java.util.Scanner;
public class E {

    public static void main(String[] args) {
        // write your code here

        Scanner cs = new Scanner(System.in);
        int k = 0, n = cs.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = cs.nextInt();
        }
        for (int i = 1; i < n; i++) {
            if (a[i] * a[i - 1] > 0)
                k++;
        }
        if(k>0) System.out.println("YES");
        else System.out.println("NO");
    }
}
 