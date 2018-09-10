import java.util.Map;
import java.util.Scanner;
public class C {

    static double f(double a,double b){
        double res;
        res=Math.pow(a,b);
        return  res;
    }
    public static void main(String[] args) {
        // write your code here
        double a,b;
        Scanner cs = new Scanner(System.in);
        a=cs.nextDouble();
        b=cs.nextDouble();

        System.out.print(f(a,b));

    }
}
 