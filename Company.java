interface Computer{       //abstract class Computer{
     void code();         // abstract void code();
}
class Desktop implements Computer{   // extends
    public void code(){
        System.out.println("Code, Compile, Run: Faster");
    }
}
class Laptop implements Computer{    //extends
    public void code(){
        System.out.println("Code, Compile, Run");
    }
}
class Developer{
    public void appdev(Computer lap){
        lap.code();
    }
}
public class Company{
    public static void main(String args[]){
    Computer lap = new Laptop();
    Computer desk = new Desktop();
    Developer dev = new Developer();
    dev.appdev(desk);
    }
}

//Beautiful illustraction of need of interface