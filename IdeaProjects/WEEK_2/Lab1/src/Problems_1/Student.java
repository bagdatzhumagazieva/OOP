package Problems_1;

public  class Student {
    public  static String name;
    public  static int id=2;
    public  static  int yearOfStudy;
    public Student(String name, int yearOfStudy){
        ++id;
        this.name=name;
        this.yearOfStudy=yearOfStudy;
    }
    public  static  String getName(){
        return  name;
    }
    public static  int getId(){
        return  id;
    }
    static int getYOS(int y){ return  y;}
    public class Main {


    }


}

