public class Horse implements CanMove {
    private int v;
    public Horse(int speed){
        v=speed;
    }
    public int getV(){
        return v;
    }
    @Override
    public void WhatItDoes() {
        System.out.println("The hourse goes by the speed "+getV());
    }
}
