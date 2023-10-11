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
        Ano obj;
        obj = new Ano();
    }
}