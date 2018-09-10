import  java.util.Scanner;
public class M {

    public static void main(String[] args) {
        // write your code here

        Scanner cs=new Scanner(System.in);
        int k=0;
        int n=cs.nextInt();
        for(int i=1; i<=n; i++){
            int x=cs.nextInt();
            if(x==0) k++;
        }
        System.out.print(k);
    }
}
 