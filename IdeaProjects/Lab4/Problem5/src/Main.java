public class Main {
    public static  void main(String args[])
    {
        int a[] = {0,8,-3,20,12,43,-6,17,4};
        MinMax m = new MinMax();
        int result[] = m.minmax(a);
        System.out.println("Maximum : "+result[0]+"\nMinimum : "+result[1] );
        MinMax.Inner inner = new MinMax.Inner();
        inner.my_method();
    }
}
