public class Dog extends  Animal {
    public String color="Grey";
    public int age;
    public  int getAge(int x){
        age=x;
        return x;
    }
    public int getAge(int heigh,int newage){
        age=newage;
        return newage;
    }

}
