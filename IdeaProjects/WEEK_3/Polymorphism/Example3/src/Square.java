public class Square extends AbstractShape {
    private double a;
    public Square(double a){
        this.a=a;
    }
     double res;
    @Override
    public void length() {
        res=4*a;
        System.out.println("The length of square is "+res);
    }

    @Override
    public String name() {
        return "The name of Figure is Square";
    }
}
