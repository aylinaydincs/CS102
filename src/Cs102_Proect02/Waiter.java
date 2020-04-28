package Cs102_Proect02;

import java.util.ArrayList;

public class Waiter extends Employee {
    private double orderRate;
    ArrayList<Order> orders = new ArrayList<Order>();

    public Waiter(String name) {
        super(name);
        this.orderRate = 0.1;
    }


    public double calculateExpense() {
        double expense =0;
        for(int i=0;i<orders.size();i++){
            expense += orders.get(i).calculateTotalPrice()*orderRate;
        }
        return expense;
    }
    public void createOrder(Order order){
        orders.add(order);
    }
    public ArrayList<Order> getOrdersReceived(){
        return orders;
    }
}
