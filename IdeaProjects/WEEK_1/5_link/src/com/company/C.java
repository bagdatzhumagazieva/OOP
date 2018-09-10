import java.util.Map;
import  java.util.Scanner;
public class C {

    public static void main(String[] args) {
        // write your code here

        Scanner cs=new Scanner(System.in);
        int k=1,l=0;
        int n=cs.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=cs.nextInt();
            if(a[i]>0){
                l++;
            }
        }
        System.out.println(l);
    }
}
 