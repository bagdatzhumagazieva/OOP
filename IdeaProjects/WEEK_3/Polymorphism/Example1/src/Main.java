public class Main {


    public static void main(String [] args){
        Student studentObject=new Student();
        Employee employeeObject = new Employee();
        Person ref=studentObject;
        String name=((Student) ref).getName();
        System.out.println(name);
         ref=employeeObject;
         name=((Employee) ref).getName();
         System.out.println(name);
    }

}
