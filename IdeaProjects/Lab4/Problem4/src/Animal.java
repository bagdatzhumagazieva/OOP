public class Animal implements SetAble {
    String name;
    Animal(){

    }
    public Animal(String n){
        name=n;
    }

    @Override
    public void CanMove() {
        System.out.println(" can move by the speed "+SetAble.speed+"m/s");
    }
}
