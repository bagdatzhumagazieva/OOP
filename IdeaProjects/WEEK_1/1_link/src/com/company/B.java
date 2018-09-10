import java.util.Scanner;
public class B {

    public static void main(String[] args) {
        // write your code here
        Scanner cs=new Scanner(System.in);
        int a=cs.nextInt();

        System.out.println("The next number for the number "+a+" is "+(a+1)+".");
        System.out.print("The previous number for the number "+a+" is "+(a-1)+".");
    }
}
