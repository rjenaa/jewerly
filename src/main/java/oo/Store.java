package oo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;


public class Store {
    private String name;
    private String owner_name;
    ArrayList<Necklace> products = new ArrayList<Necklace>();
    private int counter = 0;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public ArrayList<Necklace> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Necklace> products) {
        this.products = products;
    }

    public void sell(int item_id) {
        int key = 0;
        for (Necklace product : products) {
            if (item_id == product.getItem_id()) {
                key = product.getItem_id();
                setCounter(counter+=1);
            }
        }
        products.remove(key);
    }
    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", owner_name='" + owner_name + '\'' +
                ", products=" + products +
                '}';
    }

    public void restock(){
        int size = products.size();
        Random restock = new Random();
        String[] name = {"Rose Gold", "Pearl", "Diamond"};
        for (int i = 0; i < 21; i++) {
            int random_index = restock.nextInt(3);
            try {
                if (products.get(i) == null) {
                }
            }
            catch (Exception a){
                if (random_index == 0){
                    products.add(new Necklace(999.99, name[random_index], i + getCounter(), new Date(2020, 6, 28)));
                }
                else if(random_index == 1){
                        products.add(new Necklace(1499.99, name[random_index], i + getCounter(), new Date(2020, 7, 20)));

                }
                else{
                    products.add(new Necklace(1999.99, name[random_index], i + getCounter(), new Date(2020, 3, 3)));

                }
            }
        }

    }

}
