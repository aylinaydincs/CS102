package Cs102_Proect02;

import java.util.ArrayList;

public class Order {
    private ArrayList<Product> order = new ArrayList<Product>();

    public Order() {

    }
    public void addProduct(Product product){
        order.add(product);
    }

    //After creating GUI for Restaurant App this method become useless
    /*public void listOrder(){
        if(order.size() == 0){
            System.out.println("You have not ordered anything yet!");
        }
        for(int i=0;i<order.size();i++){
            System.out.println(order.get(i).toString());
        }
    }*/

    public ArrayList<Product> getOrderedProducts() {
        return order;
    }
    public double calculateTotalPrice(){
        double price=0;
        for(int i=0;i<order.size();i++){
            price += order.get(i).getSellingPrice();
        }
        return price;

    }
}
