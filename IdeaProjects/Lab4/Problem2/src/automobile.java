public class automobile extends vehicle {


    public automobile(String n, int v) {
        super(n, v);
    }
    public String getName(){
        return super.getName();
    }
    public void WhatItDo(){
        System.out.print(getName());
        super.WhatItDo();
        System.out.print(" with the speed "+getSpeed());
    }
}
