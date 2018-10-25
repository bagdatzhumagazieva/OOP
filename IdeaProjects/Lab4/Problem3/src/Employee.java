import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee extends Person implements Cloneable,Comparable {

    private Employee e;
    private double salary;
    private Date hireDate;
    private String insuranceNumber;
    private String dataa;
    public Employee(){}
    public Employee(Manager m){}
    public Employee(String n,double s,String in,String d) throws ParseException{
        super(n);
        salary=s;
        insuranceNumber=in;
        hireDate=new SimpleDateFormat("dd/MM/yyyy").parse(d);
        dataa=d;
    }
    public double getSalary(){
        return salary;
    }
    public Date getHireDate(){
        return hireDate;
    }
    public String getInsuranceNumber(){
        return insuranceNumber;
    }
    public String toString (){
        return super.toString()+" "+getSalary()+" "+getInsuranceNumber()+" "+getHireDate();
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public  void  setHireDate(Date hireDate){
        this.hireDate = hireDate;

    }
    public void setInsuranceNumber(String insuranceNumber){
        this.insuranceNumber=insuranceNumber;
    }


    @Override
    public boolean equals(Object obj) {
        Employee e=(Employee) obj;
        if(super.equals(e)){
            if(this.salary==e.salary && this.hireDate==e.hireDate && this.insuranceNumber==e.insuranceNumber){
                return true;
            }
        }
        return false;
    }
    public boolean isTheSame(Object o){
        Employee e=(Employee) o;
        if(super.equals(e)){
            if(salary==e.getSalary()){
                return true;
            }
        }
        return false;
    }


    public Employee(String iSalary, String iName, double d, String iNumber) {
    }

    @Override
    public int compareTo(Object o) {
        Employee e=(Employee) o;
        if(this.salary>e.getSalary()){
            return 1;
        }
        else if(this.salary<e.getSalary())
            return -1;
        else return 0;
    }
    public Employee DoClone(){
        Employee em=new Employee();
        em.salary=this.salary;
        em.hireDate=this.hireDate;
        em.name=this.name;
        em.insuranceNumber=this.insuranceNumber;
        return em;
    }
}
