public class Person {
    String name;
    public Person(){}
    public Person(String s){
        name=s;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    public void setName(String news){
        name=news;
    }

    @Override
    public boolean equals(Object obj) {
        Person p=(Person) obj;
        if(this.name==p.name){
            return true;
        }
        return  false;

    }
}
