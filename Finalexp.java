class Browser{    //final class Browser
    public void feature(){
        System.out.println("Password Manager");
    }
    public void show(){ // final public void show()
        System.out.println("Feature of Browser");
    }
}
class Chrome extends Browser{
    public void show(){
        System.out.println("Feature of chorome");
    }
}
class Finalexp{
    public static void main(String args[]){
        Chrome obj = new Chrome();
        obj.feature();
        obj.show();
    }
}