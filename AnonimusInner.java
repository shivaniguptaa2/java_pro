abstract class Ano{
    public abstract void show();
}
public class AnonimusInner{
    public static void main(String args[]){
    Ano obj = new Ano(){
        public void show(){
            System.out.println("In Anonymus Inner class show");
        }   
    };
    obj.show();
    }
}

//this is anonymus inner class which overrided the abstract method of abstract class and also created object.
//Point to be noted here the object of anonymus class is made not the Ano class.
//using Anonymus Inner class we can instanciate and Implement abstract class and abstract method respectively.
// No need to new class which extend the class Ano and define show() explicitely.