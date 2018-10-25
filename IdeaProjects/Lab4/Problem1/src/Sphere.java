public class Sphere implements  Shapes_3D {
    double r;
    public Sphere(double r){
        this.r=r;
    }
    @Override
    public double volume() {
        return (4*Shapes_3D.PI*r*r*r)/3;
    }

    @Override
    public double surface_Area() {
        return 4*r*r*Shapes_3D.PI;
    }

    @Override
    public void getVolume() {
       System.out.println("The volume of sphere is: "+volume());
    }


    @Override
    public void getArea() {
      System.out.println("The area of sphere is: "+surface_Area());
    }
}
