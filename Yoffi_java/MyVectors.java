import java.util.Vector;
class MyVectors{
    public static void main(String[] args) {
        Vector myVector= new Vector(5,3);
        myVector.add("Harshini");
        myVector.add("Amu");
        myVector.add("Aafreen");
        myVector.add("Harshini");
        myVector.add("Amu");
        myVector.add("Aafreen");
        System.out.println(myVector.size());
        System.out.println(myVector.capacity());
    }
}