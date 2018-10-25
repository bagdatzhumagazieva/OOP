public abstract class vehicle {
     private  String name;
     private int speed;
     public vehicle(String n, int v){
         name=n;
         speed=v;
     }
     public int getSpeed(){
         return  speed;
     }
     public String getName(){
         return  name;
     }
     public  void WhatItDo(){
         System.out.print(" goes ");
     }
}
