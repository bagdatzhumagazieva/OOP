public class Main {

    public static void main(String [] args){
        CanMove h=new Horse(56);
        h.WhatItDoes();
        CanMove c=new Car(45);
        c.WhatItDoes();
        CanMove t=new Train(120);
        t.WhatItDoes();
    }
}
