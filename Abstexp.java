abstract class Car{
    public abstract void drive();
    public void music(){
        System.out.println("Playing Music...");
    }
}
abstract class Wagnor extends Car{
    public abstract void drive();
}
class AdvancedWagnor extends Wagnor{
    public void drive(){
        System.out.println("Driving...");
    }
}
public class Abstexp{
    public static void main(String args[]){
        Car obj = new AdvancedWagnor();
        obj.music();
        obj.drive();
    }
}

//Abstract class can not be instanciated. Abstract class can have abstract method as well as normal method.
//Abstract methods cannot have a body.
//Abstract methods are implemented in other inherited class which inherited the abstract class.
//Abstract methods can only be in Abstract class but viceversa is not true.