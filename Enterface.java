interface Shape{
    int r= 45;
    String name = "Geometry";
    int area(int l, int b);
}
class Rectangle implements Shape{
    public int area(int l, int b){
        return l*b;
    }
}
class Enterface{
    public static void main(String args[]){
    Rectangle rec = new Rectangle();
    int result = rec.area(3,4);
    System.out.println(result);
    }
}
