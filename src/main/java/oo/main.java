package oo;

import java.util.ArrayList;
import java.util.Random;

public class main {

    public static void main(String[] args) {
        Store store = new Store();
        store.restock();
        store.sell(7);
        System.out.println(store.getProducts());
        store.restock();
        System.out.println(store.getProducts());
        store.sell(13);
        System.out.println(store.getProducts());
        store.restock();
        System.out.println(store.getProducts());
    }

}
