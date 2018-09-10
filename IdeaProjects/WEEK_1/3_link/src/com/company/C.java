import  java.util.Scanner;
public class C {

    public static void main(String[] args) {
        // write your code here

        Scanner cs=new Scanner(System.in);
        int b=cs.nextInt();
        int p;

        for(int i=2; i<=b; i++) {
            if (b % i == 0) {
                System.out.print(i);
                break;
            }
        }

    }
}
 