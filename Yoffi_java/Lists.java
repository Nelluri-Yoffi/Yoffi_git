import java.util.ArrayList;
class Lists {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println(fruits);
        System.out.println("First fruit: " + fruits.get(0));
        fruits.set(1, "Mango");
        fruits.remove(2);
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }
    }
}