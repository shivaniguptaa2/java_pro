class number{
    public static void main(String args[])
    {
        int num[][] = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                num[i][j] = (int)(Math.random()*10);
                //System.out.println(num[i][j]);
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }
}