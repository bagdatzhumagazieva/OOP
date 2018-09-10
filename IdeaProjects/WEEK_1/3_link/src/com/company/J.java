import  java.util.Scanner;
public class J {

    public static void main(String[] args) {
        // write your code here

        Scanner cs=new Scanner(System.in);
        int k=0;
        for(int i=1; i<=100; i++){
            int x=cs.nextInt();
            k=k+x;
        }
        System.out.print(k);
    }
}
 