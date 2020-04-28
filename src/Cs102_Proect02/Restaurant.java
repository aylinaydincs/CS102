package Cs102_Proect02;

import java.util.ArrayList;
import java.util.Random;

public class Restaurant {

    private ArrayList<Employee> employees = new ArrayList<>();
    private ArrayList<Product> products = new ArrayList<>();

    public Restaurant() {
        initEmployees();
        initProducts();
    }

    private void initEmployees() {

        addCook("Monica", 100);

        addWaiter("Ross");
        addWaiter("Phobe");
        addWaiter("Rachel");
    }

    private void initProducts() {

        // Parameters for Product Constructor:
        // Product Name, Selling Price, Purchase Price and Utility Cost

        products.add(new MainDish("Pizza", 6, 2, 2));
        products.add(new MainDish("Burger", 5, 1.5, 2));

        products.add(new Beverage("Coke", 2, 0.5));
        products.add(new Beverage("Lemonade", 2, 0.3));

        products.add(new Dessert("Tiramusu", 4, 1, 1));
        products.add(new Dessert("Cake", 3, 0.5, 1));
        products.add(new Dessert("Ice Cream", 3, 0.5, 0.5));

        ArrayList<Product> HGproducts = new ArrayList<>();
        HGproducts.add(new MainDish("Pizza", 6, 2, 2));
        HGproducts.add(new Beverage("Coke", 2, 0.5));
        HGproducts.add(new Dessert("Tiramusu", 4, 1, 1));
        products.add(new MenuProduct("Hunger Games Menu", HGproducts));

        ArrayList<Product> Kidsproducts = new ArrayList<>();
        Kidsproducts.add(new MainDish("Burger", 5, 1.5, 2));
        Kidsproducts.add(new Beverage("Lemonade", 2, 0.3));
        Kidsproducts.add(new Dessert("Ice Cream", 3, 0.5, 0.5));
        products.add(new MenuProduct("Kids Menu", Kidsproducts));
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addCook(String name, double salary) {
        Employee cook = new Cook(name, salary);
        employees.add(cook);
    }

    public void addWaiter(String name) {
        Employee waiter = new Waiter(name);
        employees.add(waiter);
    }

    public Waiter assignWaiter() {
        int waiter =0;
        int count = 0;
        for (int i=0;i<employees.size();i++){
            if (employees.get(i) instanceof Waiter){
                count++;
            }
        }
        Random rand = new Random ();
        int randomWaiter = rand.nextInt(count);
        int n =0;
        for (int i=0;i<employees.size();i++){
            if (employees.get(i) instanceof Waiter){
               n++;
            }
            if(randomWaiter == n){
                waiter = i;
            }
        }
        return (Waiter)employees.get(waiter) ;

    }
    public double calculateExpenses(){
        Order money =new Order();
        double expense = 0;
        for (int i =0; i<employees.size();i++){
            expense+=employees.get(i).calculateExpense();
        }
        for (int i =0; i<employees.size();i++){
            if(employees.get(i) instanceof Waiter){
                for (int j=0; j< ((Waiter) employees.get(i)).getOrdersReceived().size();j++){
                    expense+= money.calculateTotalPrice();
                }
            }
        }
        return expense;
    }
}






