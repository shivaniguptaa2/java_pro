enum Laptop{
    Macbook(2000), Lenevo(500), Acer(550), Dell(600), HP(450);

    private int price;

    private Laptop(int price){
        this.price = price;
    }
    
    public void  setprice(int price){
        this.price = price;
    }

    public int getprice(){
        return price;
    }
}
enum Random { //enum can not be abstract 
    rapid, race;
    static final int rose= 5; // variables can be static and final 
                                //methods can not be abstract as the enum class cannot be abstract
}
class Enumcls{
    public static void main (String args[]){
        // Laptop lap = Laptop.Macbook;
        // System.out.println(lap.getprice());
        Random r = Random.rapid;
       // Random.rose = 7;
        System.out.println(Random.rose);
    }
}

//Enum is a class, which have the object inside it. and it have private constructor, default and parameterised one both
// it can have methods as well.
//We cannot inherit the enum class