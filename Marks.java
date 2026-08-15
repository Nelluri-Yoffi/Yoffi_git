import java.util.HashMap;
class Marks {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Alice", 90);
        marks.put("Bob", 85);
        marks.put("Charlie", 95);
        System.out.println("All marks: " + marks);
        System.out.println("Alice's marks: " + marks.get("Alice"));
        System.out.println("Bob's marks: " + marks.get("Bob"));
        if (marks.containsKey("Charlie")) {
            System.out.println("Charlie is present");
        }
    }
}