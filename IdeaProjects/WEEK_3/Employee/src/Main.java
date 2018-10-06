import java.util.ArrayList;

public class Main {
    public static void main(String [] args){
        Person p1  = new Person("Sholpan");
        Person p2 = new Person("Sholpan");

        if(p1.equals(p2)){
            System.out.println("p1 and p2 have same names");
        }
        else {
            System.out.println("p1 and p2 have different names");
        }
        Person e1=new Employee("Bagdat",12000.0,5,"kazakh");
        Person e2=new Employee("Bagdat",12000.0,4,"kazakh");
        if(e1.equals(e2)){
            System.out.println("They have same name and salary ");
        }
        else {
            System.out.println("One of them no match each other");
        }
        ArrayList<Employee> employees =new ArrayList<>();
        employees.add(new Manager("Aiman",15000.0,5,"russia",15000));
        employees.add(new Manager("Sholpan",45000.0,10,"uzbek",2000));
        employees.add(new Manager("Aibek",56000.0,12,"kirgiz",23000));
        for(int i=0;i<employees.size();i++){
            System.out.println(employees.get(i).toString("Hello World!"));
        }
        for(int i=0; i<employees.size();i++){
            if(employees.get(i).equals(employees.get(1))){
                System.out.println("The second employee's bonus is matched with  "+i);
            }
            else {
                System.out.println("The second employee's bonus isn't matched with  "+i);
            }
        }



    }
}
