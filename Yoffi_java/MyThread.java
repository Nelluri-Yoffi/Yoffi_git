class A extends Thread{
    public void run(){
        for (int i=1;i<=5;i++)
        {
            System.out.println("From A: i="+i);
        }
        System.out.println("Exit from A");
    }
}
class B extends Thread{
    public void run(){
        for (int j=1;j<=5;j++)
        {
            System.out.println("From B: j="+j);
        }
        System.out.println("Exit from B");
    }
}
class C extends Thread{
    public void run(){
        for (int k=1;k<=5;k++)
        {
            System.out.println("From C: k="+k);
        }
        System.out.println("Exit from C");
    }
}
class MyThread{
    public static void main(String[] args) {
        A myA= new A();
        B myB= new B();
        C myC= new C();
        myA.start();
        try{
        myA.wait(1000000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        myB.start();
        myC.start();

    }
}