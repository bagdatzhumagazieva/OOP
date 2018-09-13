import  java.util.Scanner;
public class Data {

    private  double sum=0;
    private  double maxi=-1000;
    public   int k=0;

    public  Data(){

    }
    public  void addToData(int n){
        if(maxi<n){
            maxi=n;
        }
        sum=sum+n;
        k++;
    }
    public  String res(){
        return  "Average= " +sum/k +"\n"+"Maximum= "+maxi;
    }
    public  static  void main(String[] args){
        System.out.println("Enter number (Q to quit ):");
        Scanner sc=new Scanner(System.in);
        Data d=new Data();
        int n;
        String s=sc.next();
        while (!s.equals("Q")){
            System.out.println("Enter number (Q to quit ):");
            n=Integer.parseInt(s);
            d.addToData(n);
            s=sc.next();
        }
        if(s.equals("Q")){
            System.out.println(d.res());
        }
    }

}
