import java.util.Scanner;
public class A {

    public static void main(String[] args) {
        // write your code here

        Scanner cs=new Scanner(System.in);
        int k=0;
        int n=cs.nextInt();
        for(int i=1; i*i<=n; i++){
            System.out.print(i*i+" ");
        }
    }
}
 