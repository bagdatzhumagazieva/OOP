import  java.util.Scanner;
public class K {

    public static void main(String[] args) {
        // write your code here

        Scanner cs=new Scanner(System.in);
        int k=0;
        int n=cs.nextInt();
        for(int i=1; i<=n; i++){
            int x=cs.nextInt();
            k=k+x;
        }
        System.out.print(k);
    }
}
 