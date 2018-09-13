import  java.util.Scanner;
public class Method {
    public int k;
    public int cnt=0;
    int[] ans=new int[k*2];
    Scanner sc=new Scanner(System.in);
    public  void f(int[] n,int[] ans, int k){
        for(int i=0; i<k; i++){
            n[i]=sc.nextInt();
            for(int j=0; j<2; j++){
                ans[cnt] = n[i];
                cnt++;
            }

    }
   //  System.out.print(arr.Func().toString());
    } public void res(int cnt,int [] ans){
        for(int i=0; i<cnt; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
