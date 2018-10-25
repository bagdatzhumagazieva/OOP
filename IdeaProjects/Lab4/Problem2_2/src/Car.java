public class Car implements CanMove {

    private int v;
    public Car(int speed){
        speed=v;
    }

    int getV(){
        return v;
    }
    @Override
    public void WhatItDoes() {
        System.out.println("The car goes with the speed "+getV());
    }
}
