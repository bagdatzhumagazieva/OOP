public class Cube implements Shapes_3D {

    int a;
    public Cube(int a){
        this.a=a;
    }
    @Override
    public double surface_Area() {
        return 6*a*a;
    }

    @Override
    public double volume() {
        return a*a*a;
    }

    @Override
    public void getArea() {
        System.out.println("The area of Cube is: "+surface_Area());
    }

    @Override
    public void getVolume() {
        System.out.println("The volume of cube is: "+volume());
    }
}
