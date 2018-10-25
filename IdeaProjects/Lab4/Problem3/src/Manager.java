import java.util.ArrayList;

public class Manager extends Employee implements Comparable,Cloneable {

    private ArrayList<Employee> list;
    private int bonus;
    public boolean ok=false;

    public Manager(String iName, double iSalary,String d, String iNumber, int iBonus){
        super(iName,d,iSalary,iNumber);
        bonus=iBonus;
        list=new ArrayList<Employee>();
    }

    public int getBonus() {
        return bonus;
    }
    public String toString(){
        return super.toString()+bonus;
    }

    @Override
    public int compareTo(Object o) {
        Manager m=(Manager) o;
        if(this.getSalary()==((Manager) o).getSalary()){
            if(bonus>((Manager) o).bonus){
                return 1;
            }
            else if(bonus<((Manager) o).bonus) return -1;

        }
        return 0;
    }
     public Manager(){}
    @Override
    public Manager DoClone() {
        Manager m=new Manager();
        m.bonus=bonus;
        m.name=super.name;
        m.setHireDate(super.getHireDate());
        m.setInsuranceNumber(super.getInsuranceNumber());
        m.setSalary(super.getSalary());
        return m;
    }
}
