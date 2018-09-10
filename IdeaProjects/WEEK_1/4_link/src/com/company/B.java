import  java.util.Scanner;
public class B {

    public static void main(String[] args) {
        // write your code here

        Scanner cs=new Scanner(System.in);
        int k=0;
        int n=cs.nextInt();
        for(int i=2; i<=n; i++){
            if(n%i==0){
                System.out.print(i);
                break;
            }}
    }
}
 