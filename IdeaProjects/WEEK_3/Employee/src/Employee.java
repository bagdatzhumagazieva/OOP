public class Employee extends Person {

    public double salary;
    private  int year;
    private String insuranceNumber;

    public Employee(String name, double salary, int year, String insuranceNumber) {
        super(name);
        this.salary=salary;
        this.year=year;
        this.insuranceNumber=insuranceNumber;

    }
    private boolean ok;
    public boolean equals(Object obj) {
        Employee e = (Employee) obj;
        if (super.equals(e)) {
            if (this.salary == e.salary) {
                ok= true;
            }
          else  ok= false;
        }
        return ok;
    }
   public String toString(String evth){
        return evth;
   }

}
