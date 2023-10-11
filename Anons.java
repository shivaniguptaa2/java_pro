class Ano{
    public void show(){
        System.out.println("In show");
    }
    public Ano(){
        System.out.println("Object Created");
    }
}
class Anons{
    public static void main(String args[]){
        //Ano obj;            //also create object in this way
        //obj = new Ano();        // in two steps
        //new Ano();          // this will also create object but there is no name or refernce, so called Anonymus object
        new Ano().show();           // T    this will create the obj and call the show() but the same obj can not be used again
        //new Ano().show();       // as here it will again create new object and call show() 
        //obj.show();
    }
}