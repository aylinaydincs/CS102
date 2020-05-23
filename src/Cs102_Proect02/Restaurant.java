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

    public void addCook(String name, double salary) {
        Employee cook = new Cook(name, salary);
        employees.add(cook);
        for (int i=0;i<employees.size();i++){
            employees.get(i).setId(i+1);
        }
    }

    public void addWaiter(String name) {
        Employee waiter = new Waiter(name);
        employees.add(waiter);
        for (int i=0;i<employees.size();i++){
            employees.get(i).setId(i+1);
        }
    }

    public void listEmployees (){
        for (int i=0;i<employees.size();i++){
            System.out.println(employees.get(i).toString());
        }
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
        int randomWaiter = rand.nextInt(count)+1;
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
        double empexpense = 0;
        double ordexpense = 0;
        for (int i =0; i<employees.size();i++){
            empexpense+=employees.get(i).calculateExpense();
            if(employees.get(i) instanceof Waiter){
                for (int j=0; j< ((Waiter) employees.get(i)).getOrdersReceived().size();j++){
                    for (int k=0;k<((Waiter) employees.get(i)).getOrdersReceived().get(j).getOrderedProducts().size();++k){
                        ordexpense+=((Waiter) employees.get(i)).getOrdersReceived().get(j).getOrderedProducts().get(k).calculateExpense();
                    }
                }
            }
        }
        System.out.println("Employee expenses: " + empexpense);
        System.out.println("Order expenses: " + ordexpense);
        return empexpense + ordexpense;
    }


    public double calculateRevenue(){
        double revenue = 0;
        for (int i =0; i<employees.size();i++){
            if(employees.get(i) instanceof Waiter){
                for (int j=0; j< ((Waiter) employees.get(i)).getOrdersReceived().size();j++){
                    revenue+=((Waiter) employees.get(i)).getOrdersReceived().get(j).calculateTotalPrice();
                }
            }
        }

        return revenue;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
    public ArrayList<Employee> getEmployees(){return employees;}

}






