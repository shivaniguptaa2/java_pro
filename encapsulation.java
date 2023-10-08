class student{
    private int age;
    private String name;
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
class encapsulation{
    public static void main(String args[]){
        student stud = new student();
       // stud.age = setAge();
       stud.setAge(23);
       stud.setName("Kajri");
       int a = stud.getAge();
       //System.out.println(a);
    
       if(a>16){
            a = a-16;
            System.out.println("My name is "+stud.getName()+ " and I'm sweet sixteen with "+a+ " years of experience." );
       }else{
            System.out.println("My name is "+stud.getName()+ " and I'm "+stud.getAge()+ " years old.");
       }
    }
}