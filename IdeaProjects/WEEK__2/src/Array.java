import  java.util.Scanner;
public class Array {
    int k;
    int [] n=new int[k];
    int [] ans=new int[k*2];
    public  Array(int k){
        this.k=k;
    }
    /*public  String Func(){
        String s="";
         for(int i=0; i<k; i++){
             s=(n[i]+" "+n[i]+" ");
         }
            return  s.toString();
    }*/

    public  static  void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int[] n=new int[k];
        int [] ans=new int[k*2];
        Array arr=new Array(k);
        for(int i=0; i<k; i++){
            n[i]=sc.nextInt();
            System.out.print(n[i]+" "+n[i]+" ");
      //  System.out.print(arr.Func().toString());
        }


    }

}
