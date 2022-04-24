package cs102.assignment05;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<Product>();

        products.add(new Skirt(5, "M&S", "red", 20, "skirt"));
        products.get(0).setPrice(40);
        Skirt skirt = new Skirt (5, "M&S", "red", 20, "skirt");


        Vegetable pepper = new Vegetable(18, 0.5, false, "pepper");
        pepper.setKgs(10);
        products.add(pepper);


        DishWashing tablet = new DishWashing("C");
        tablet.setLts(30);
        tablet.setPrice(25);
        tablet.setLiquid(false);
        tablet.setName("tablet");
        products.add(tablet);


        Trousers jean = new Trousers(30, "blue", "B");
        jean.setName("jean");
        jean.setPrice(50.99);
        jean.setQuantity(10);
        products.add(jean);


        Dairy milk = new Dairy(25, 1, true, "milk");
        milk.setExpirationDate("2020-03-27");
        milk.setPrice(2.95);
        products.add(milk);



        double total = 0;
        for(int i=0;i< products.size();i++){
            total+=products.get(i).calculateTotalPrice();
        }
        System.out.println("Purchased Cloth Items" + "\n");
        for(int i=0;i<products.size();i++){

            if(products.get(i).getType().equalsIgnoreCase("cloth")){
                System.out.println(products.get(i).toString());

            }
        }
        System.out.println("--------------------------------------------");
        System.out.println("Purchased Detergent Items" + "\n");
        for(int i=0;i<products.size();i++){

            if(products.get(i).getType().equalsIgnoreCase("cleaning")){
                System.out.println(products.get(i).toString());

            }
        }
        System.out.println("--------------------------------------------");
        System.out.println("Purchased Food Items" +"\n");
        for(int i=0;i<products.size();i++){

            if(products.get(i).getType().equalsIgnoreCase("food")){
                System.out.println(products.get(i).toString());

            }
        }
        System.out.println("--------------------------------------------");
        System.out.printf ("Total : %.13f\n",total);




    }
}

