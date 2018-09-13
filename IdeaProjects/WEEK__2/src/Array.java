
import  java.util.Scanner;
public class Array {


    public  static  void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int[] n=new int[k];
        int [] ans=new int[k*2];
        Method m = new Method();
        m.f(n, ans, k);
        m.res(k*2,ans);
    }

}
