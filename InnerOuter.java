class Outer{ // Outer class can't be made static static class Outer will give error.
    int number;

    public void outer(){
        System.out.println("In outer class");
    }

    static class Inner{  // when we make class static there will  be no need of outter's obj to instanaciate the class
        public void inner(){
            System.out.println("In Inner class");
        }
    }
}
class InnerOuter{
    public static void main(String args[]){
        Outer obj = new Outer();
        obj.outer();

        //To access inner method, need to make obj of Inner, for this will be needing obj, object of Outer.
       // obj.inner(); // this will give error .

       //Outer.Inner  obj1 = obj.new Inner(); // way to instanciate the inner class.
       Outer.Inner obj1 = new Outer.Inner(); // way to instanciate when the inner class is static
       obj1.inner();
    }
}
//when you complile InnerOuter class there will be three .class file will be generated. 3rd one is Outer$Inner.class