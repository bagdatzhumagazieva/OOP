import java.util.Map;
import  java.util.Scanner;
public class F {

    public static void main(String[] args) {
        // write your code here

        Scanner cs = new Scanner(System.in);
        int k = 0, n = cs.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = cs.nextInt();
        }
        for(int i=1; i<n-1; i++){
            if(a[i]>a[i-1] && a[i]>a[i+1])
                k++;
        }
        System.out.println(k);

    }
}