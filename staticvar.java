class Mobile{

    String brand;
    int price;
    static String name;
}

class staticvar{
    public static void main(String args[]){
    Mobile obj1 = new Mobile();
    obj1.brand ="Samsung";
    obj1.price = 25000;
    Mobile.name = "Smartphone";

    Mobile obj2 = new Mobile();
    obj2.brand ="Asus";
    obj2.price = 25000;
    Mobile.name = "Smartphone";

    Mobile obj3 = new Mobile();
    obj3.brand ="Motorola";
    obj3.price = 25000;
    Mobile.name = "Smartphone";

    Mobile obj[] = new Mobile[3];
    obj[0] = obj1;
    obj[1] = obj2;
    obj[2] = obj3;
    for(Mobile mob: obj){
         System.out.println(mob.brand+ " : "+ mob.price+ " : " +mob.name);
    }

    }
}