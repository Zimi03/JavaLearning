public class ControlFlowExercise04 {
    public static void main(String[] args){
        double orderValue = 100;
        boolean isPremiumCustomer = false;
        double discountValue = 0;
        if(orderValue < 100){
            discountValue = 0;
        } else {
            if(isPremiumCustomer){
                discountValue = 0.2;
            }else {
                discountValue = 0.1;
            }
        }
        System.out.println("Order value: " + orderValue + "\n" +
                            "is premium customer: " + isPremiumCustomer + "\n" +
                            "Discount: " + (discountValue*100)+"%\n" +
                            "Final value: "+ (orderValue - (orderValue*discountValue)));
        orderValue = 100;
        isPremiumCustomer = true;
        discountValue = 0;
        if(orderValue < 100){
            discountValue = 0;
        } else {
            if(isPremiumCustomer){
                discountValue = 0.2;
            }else {
                discountValue = 0.1;
            }
        }
        System.out.println("\nOrder value: " + orderValue + "\n" +
                "is premium customer: " + isPremiumCustomer + "\n" +
                "Discount: " + (discountValue*100)+"%\n" +
                "Final value: "+ (orderValue - (orderValue*discountValue)));
        orderValue = 90;
        isPremiumCustomer = true;
        discountValue = 0;
        if(orderValue < 100){
            discountValue = 0;
        } else {
            if(isPremiumCustomer){
                discountValue = 0.2;
            }else {
                discountValue = 0.1;
            }
        }
        System.out.println("\nOrder value: " + orderValue + "\n" +
                "is premium customer: " + isPremiumCustomer + "\n" +
                "Discount: " + (discountValue*100)+"%\n" +
                "Final value: "+ (orderValue - (orderValue*discountValue)));
        orderValue = 90;
        isPremiumCustomer = false;
        discountValue = 0;
        if(orderValue < 100){
            discountValue = 0;
        } else {
            if(isPremiumCustomer){
                discountValue = 0.2;
            }else {
                discountValue = 0.1;
            }
        }
        System.out.println("\nOrder value: " + orderValue + "\n" +
                "is premium customer: " + isPremiumCustomer + "\n" +
                "Discount: " + (discountValue*100)+"%\n" +
                "Final value: "+ (orderValue - (orderValue*discountValue)));
    }
}