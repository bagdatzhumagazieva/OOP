public class Cylinder implements  Shapes_3D {

     private double r,h;

    public  Cylinder(double r,double h){
        this.r=r;
        this.h=h;
    }
    @Override
    public double surface_Area() {
        return 2*Shapes_3D.PI*r*h;
    }

    @Override
    public double volume() {
        return r*r*h*Shapes_3D.PI;
    }

    @Override
    public void getArea() {
        System.out.println("The area of cylinder is: " +surface_Area());
    }

    @Override
    public void getVolume() {
        System.out.println("The volume of cylinder is: "+volume());
    }
}
