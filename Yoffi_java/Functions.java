class Functions
{
    public static void main (String[] args)
    {
    int i=5;
    int j=7;
    Functions myFun= new Functions();

    int c= myFun.add(i,j);
    System.out.println("Output Value is "+c);
    }
    public int add(int i,int j)
    {
        return i+j;
    }

}
