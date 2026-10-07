public class Exercise3{
    public static void main(String[] args){
        double price = 49.99;
        int quantity = 3;
        double orderValue = quantity*price;
        System.out.println("Order Value: " + orderValue);
        System.out.println("Order Value (int): " + ((int)orderValue));
        int x = 10;
        double y = (double) x;
        System.out.println("x: "+ x +" y: "+ y);
    }
}