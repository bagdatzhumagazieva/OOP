import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        // write your code here

        Scanner cs=new Scanner(System.in);
        int a=cs.nextInt();
        if(a%4==0 && a%100!=0 || a%400==0){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
 