class add{
    public int add(int n1, int n2){
        int r=n1+n2;
        return r;
    }
    public int add(int n1, int n2, int n3){
        int r = n1+n2+n3;
        return r;
    }
}
public class calculator{
    public static void main(String args[]){
        int n1=8, n2=10, n3=15;
        add obj = new add();
        int result = obj.add(n1,n2);
        System.out.println(result);
        result = obj.add(n1,n2,n3);
        System.out.println(result);
        int num[] = new int[5];
        for(int i=0;i<4;i++){
            num[i] = i+1;
        }
        for(int i=0;i<4;i++){
            System.out.println(num[i]);
        }
    }
}       