import  java.util.Scanner;
public class A {

    public static void main(String[] args) {
        // write your code here

        Scanner cs=new Scanner(System.in);
        int a=cs.nextInt();
        int b=cs.nextInt();
        for(int i=a; i<=b; i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}