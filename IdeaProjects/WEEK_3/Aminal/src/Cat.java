public class Cat extends Animal {
    public String color="Black";

    public  Cat(String color){
        super();

    }
    public String getColor(String newcolour){

         String s = "The color of cat is " + newcolour;
        return s;
    }
    public void setColor(String newcolor){
        color=newcolor;
    }
    public  void setColor(int age,String anynewcolor){
        color=anynewcolor;
        System.out.println("The age of cat "+age);
    }

}
