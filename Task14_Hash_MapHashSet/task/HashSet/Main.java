package Task14_Hash_MapHashSet.task.HashSet;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Product> productsSet = new HashSet<>();
        productsSet.add(new Product("123", "Milk", 45));
        productsSet.add(new Product("111", "FIFO", 200));

       boolean result= productsSet.add(new Product("123", "Banana", 15));
        System.out.println(result);
        System.out.println(productsSet.toString() );


    }
}
