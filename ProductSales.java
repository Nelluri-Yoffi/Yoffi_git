import java.util.HashMap;

class ProductSales {
    public static void main(String[] args) {
        String[] products = {
            "iPhone", "Laptop", "iPhone", "AirPods",
            "Laptop", "iPhone", "Mouse", "AirPods"
        };
        HashMap<String, Integer> sales = new HashMap<>();
        for (String product:products) {
            if (sales.containsKey(product)) {
                sales.put(product, sales.get(product) + 1);
            }
            else {
                sales.put(product, 1);
            }
        }
            String mostSold = "";
        int highest = 0;
        for (String product : sales.keySet()) {
            if (sales.get(product) > highest) {
                highest = sales.get(product);
                mostSold = product;
            }
        }
        System.out.println("Most sold product: " + mostSold);
        System.out.println("Times sold: " + highest);
    }
}