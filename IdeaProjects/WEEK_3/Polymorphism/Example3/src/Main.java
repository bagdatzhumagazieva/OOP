public class Main {

    public static void main(String [] arg){
        AbstractShape circle=new Circle(5.3);
        circle.length();
        System.out.println(circle.name());
        AbstractShape sq=new Square(5.3);
        sq.length();
        System.out.println(sq.name());
    }
}
