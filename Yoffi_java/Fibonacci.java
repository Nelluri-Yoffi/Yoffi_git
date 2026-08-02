class Fibonacci
{
    public static void main(String[] args) 
    {
       int i=0;
       int j=1;
       int n;
       int k;
       for (n=0;n<=10;n++)
        {
            System.out.print(i+",");
            k=i+j;
            i=j;
            j=k;
        } 
    }
}