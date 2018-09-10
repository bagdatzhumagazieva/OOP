import  java.util.Scanner;
public class H {

    public static void main(String[] args) {
        // write your code here

        Scanner cs=new Scanner(System.in);
        int b=cs.nextInt();

        for(int i=1; i<=b; i++){
            if(b%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
 