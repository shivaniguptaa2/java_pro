class Ano{
    public void show(){
        System.out.println("In Ano Show");
    }
}
class Anonimus{
    public static void main(String args[]){
        Ano obj1 = new Ano(); // yeh h aam jindagi 
        Ano obj = new Ano(){          // yeh h mentos wali zindagi
          public void show(){           // this is anonymus inner class as we complile this we got Anonimus$1.class
        System.out.println("In new Ano Show"); // this will override the function of Ano class 
    }                                            // this is called anonymus class as this don't have any class name.
        };
        obj.show();  // this will call new ano show
        obj1.show(); // this will call ano show
    }
}