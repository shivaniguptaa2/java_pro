enum Drxn{
    North, South, East, West;
}
class enumexp{
    public static void main(String args[]){
        Drxn[] dir = Drxn.North;
       // System.out.println(dir.ordinal());
        // for(Drxn d: dir){
        //     System.out.println(d);
        // }
        switch(dir){
            case North:
                System.out.println("In North");
                break;
            
            case South:
                System.out.println("In sOUTH");
                break;
            
            case East:
                System.out.println("In East");
                break;

            case West:
                System.out.println("In West");
                break;    
            
            default:
                System.out.println("DONE");
        }
    }
}