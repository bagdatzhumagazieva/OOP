public  class Cylinder extends  Shapes {

    public  double s_a,v,a;
    public double heigh,radius;
    final static double PI = 3.14159;
    public Cylinder(double h,double r){
            heigh =h;
            radius=r;
    }
  public double surfaceArea(){

        s_a=2*PI*radius*heigh;
        return s_a;
    }

    public double volume(){

        v=PI*radius*radius*heigh;
        return  v;
  }
  public double area(){
        a=2*PI*radius*radius+2*3.14*radius*heigh;
        return a;
  }



}
