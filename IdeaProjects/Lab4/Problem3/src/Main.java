import org.omg.CORBA.MARSHAL;

import java.text.ParseException;
import java.util.EnumMap;

public class Main {

   public static void main(String [] args) throws ParseException {
      Person e1=new Employee("Baga",22500,"kazakh","24/10/2018");
      Person e2=new Employee("Baga",23000,"kazakh","23/10/2018");
      if(e1.equals(e2))
      {
      System.out.println("they are equals");
      }
      else System.out.println("they are not equal");

      Manager m1=new Manager("Dina",22500,"20/09/2018","kazakh",5000);
      Manager m2=new Manager("Dina",21000,"12/10/2018","kazakh",2000);
      System.out.println(m1.compareTo(m2));
      System.out.println(m2.compareTo(m1));
      Manager m3=m2.DoClone();
//      m3.setSalary(23000);
//      m3.setName("Akma");
//      m3.setInsuranceNumber("kazakh");
      System.out.println(m3.getName()+" "+m3.getSalary()+" "+m3.getInsuranceNumber());




   }
}
