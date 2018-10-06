public class Cube extends Shapes {
    public double s_a,v,a;
    public double wall;
    public Cube(double w){
        wall=w;;
    }

    @Override
    public double surfaceArea() {
        s_a=wall*wall;
        return s_a;
    }
    public double volume(){
        v=wall*wall*wall;
        return v;
    }
    public double area(){

        a=wall*wall;
        return  a;
    }
}
