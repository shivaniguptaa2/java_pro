interface Geometry{
    public void show();
}
interface Shape extends Geometry{
    int r= 45;
    String name = "Geometry";
    int area(int l, int b);
}
class Rectangle implements Shape{
    public int area(int l, int b){
        return l*b;
    }
    public void show(){
        System.out.println("This method was defined in Geometry and is defined in Rectangle");
    }
}
class Area extends Rectangle{
    public Area(){
        System.out.println("In Area Class");
    }
}

class Enterface{
    public static void main(String args[]){
    Shape obj = new Shape();// shape is abstract can not be instanciated, as it is also interface it is abstract by nature.
    Rectangle rec = new Rectangle();
    int result = rec.area(3,4);
    System.out.println(result);
    }
}
