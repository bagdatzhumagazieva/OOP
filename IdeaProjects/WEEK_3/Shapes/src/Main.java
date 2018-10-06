public class Main {

    public static void main(String [] args){

        Shapes myCylinder=new Cylinder(7,8);
        Shapes mySphere=new Sphere(8);
        Shapes myCube= new Cube(4);
        System.out.println("The surface area of my cube is "+myCube.surfaceArea());
        System.out.println("The volume of my sphere is "+mySphere.volume());
        System.out.println("The area of my cylinder is "+myCylinder.area());

    }
}
