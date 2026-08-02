//My first program
class AmazonUser{
    String name;
    String email;
    void setName(String a){
        name = a;
    }
    void setEmail(String b){
        email = b;
    }
    String getName(){
        return name;
    }
    String getEmail(){
        return email;
    }
}
class Customer extends AmazonUser{
    String product;
    int quantity;
    void setProduct(String x){
        product = x;
    }
    void setQuantity(int y){
        quantity = y;
    }
    String getProduct(){
        return product;
    }
    int getQuantity(){
        return quantity;
    }
}
class PrimeCustomer extends Customer{
    float price;
    String address;
    void setPrice(float x){
        price = x;
    }
    void setAddress(String y){
        address = y;
    }
    float getPrice(){
        return price;
    }
    String getAddress(){
        return address;
    }
}
public class Amazon{
    public static void main(String args[]){
        PrimeCustomer c1 = new PrimeCustomer();
        c1.setName("Yoffi");
        c1.setEmail("nelluriyoffi@gmail.com");
        c1.setProduct("puma speedcats");
        c1.setQuantity(1);
        c1.setPrice(9999.9f);
        c1.setAddress("167/168,phase1,praneeth natures bounty");
        System.out.println("Name : " + c1.getName());
        System.out.println("Email : " + c1.getEmail());
        System.out.println("Product : " + c1.getProduct());
        System.out.println("Quantity : " + c1.getQuantity());
        System.out.println("Price : " + c1.getPrice());
        System.out.println("Delivery Address : " + c1.getAddress());
    }
}