public class Sphere extends Shapes {
    public double s_a,v,a;
    public double radius;
    final static double PI = 3.14159;
    public Sphere(double r){
        radius=r;
    }

    public double surfaceArea(){

        s_a=4*PI*radius*radius;
        return s_a;
    }

    public double volume(){

        v=(4/3)*PI*radius*radius*radius;
    return v;
    }

    public double area(){
        a=4*PI*radius*radius;
        return a;
    }

}
