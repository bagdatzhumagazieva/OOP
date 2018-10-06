public class Manager extends Employee {

    private int bonus;
    public Manager(String name, double salary, int year, String insuranceNumber,int bonus) {
        super(name, salary, year, insuranceNumber);
        this.bonus=bonus;
    }

    private boolean ok;
    public boolean equals(Object obj){
        Manager m=(Manager) obj;
        if(super.equals(m)){
            if(this.bonus==m.bonus){
                ok=true;
            }
            else {
                ok=false;
            }
        }
        return ok;
    }
    public String toString(String word){
        return word;
    }

}
