public class Circle extends  AbstractShape {
    static double PI=3.14;
    private double r;
    public Circle(double r){
        this.r=r;
    }
    private double res;
    @Override
    public void length() {
        res=2*PI*r;
        System.out.println("The length of circle is "+res);
    }

    @Override
    public String name() {
        return "The name of Figure is Circle";
    }
}
