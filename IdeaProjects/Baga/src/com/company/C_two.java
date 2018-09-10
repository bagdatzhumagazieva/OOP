import java.util.Scanner;

public class C_two {

    public static void main(String[] args) {
	// write your code here

        Scanner cs=new Scanner(System.in);
        int a=cs.nextInt();
        int b=cs.nextInt();

        if(a==1 && b!=1 || a!=1 && b==1)
        {
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }
    }
}
