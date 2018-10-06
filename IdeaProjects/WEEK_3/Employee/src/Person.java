public class Person {

    public String name;
    public Person(String name){
        this.name=name;
    }
    public boolean equals(Object obj){
        Person p = (Person) obj;
        if(this.name == p.name)
            return true;
        return false;
    }

    public String toString(String smth){
        return smth;
    }
}
