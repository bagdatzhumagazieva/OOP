import  java.util.Scanner;
 public class StarTriangle {

    public  int width;

    public StarTriangle(int width) {
    this.width=width;
    }
    public  String toString(){
        int cnt=0;
        String s="";
        for(int i=0; i<width; i++){
            cnt++;
            for(int j=0; j<cnt; j++){
                s+="[*]";

            }
            s+="\n";
        }
        return  s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        StarTriangle small=new StarTriangle(x);
        System.out.println(small.toString());
    }
}
