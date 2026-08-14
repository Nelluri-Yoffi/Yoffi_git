import java.util.ArrayList;
class Restaurant {
    public static void main(String args[]) {

        ArrayList<String> waiting = new ArrayList<String>();
        waiting.add("Rahul");
        waiting.add("Priya");
        waiting.add("Aman");
        waiting.add("Neha");
        System.out.println("Waiting List:");
        for (int i = 0; i < waiting.size(); i++) {
            System.out.println(waiting.get(i));
        }
        System.out.println("\n" + waiting.get(0) + " got a table!");
        waiting.remove(0);
        System.out.println("\nRemaining Waiting List:");
        for (int i = 0; i < waiting.size(); i++) {
            System.out.println(waiting.get(i));
        }
    }
}