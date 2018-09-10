import java.util.Scanner;

public class E_two {

    public static void main(String[] args) {
	// write your code here

        Scanner cs=new Scanner(System.in);
        int a=cs.nextInt();
        int b=cs.nextInt();
        if(a>b) System.out.println(1);
        else if(a<b) System.out.println(2);
        else System.out.println(0);

    }
}
