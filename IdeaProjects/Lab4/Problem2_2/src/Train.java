public class Train implements CanMove {
    private int v;

    Train(int speed){
        v=speed;
    }
    int getV(){
        return v;
    }
    @Override
    public void WhatItDoes() {
        System.out.println("The train goes with the speed "+getV());
    }
}
