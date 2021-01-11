package Task14_Hash_MapHashSet.task.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Storage storage1 = new Storage("Первый склад", "Гроького 35а");
        Storage storage2 = new Storage("Второй склад", "Елькина 15");

        Product milk = new Product("87", "молоко", 60);
        Product tea = new Product("80", "чай", 100);
        Product tomato = new Product("50", "томаты", 100);

        Map<Storage, Map<Product, Integer>> storageMap1 = new HashMap<>();
        HashMap<Product, Integer> productMap1 = new HashMap<>();

        productMap1.put(milk, 20);
        productMap1.put(tea, 10);

        HashMap<Product, Integer> productMap2 = new HashMap<>();
        productMap1.put(tomato, 10);

        searchProduct(storageMap1, "87");
    }

    static void searchProduct(Map<Storage, Map<Product, Integer>> map, String serialNo) {
        for (Storage s : map.keySet()) {
            Map<Product, Integer> productMap = map.get(s);
            Integer amount = productMap.get(new Product(serialNo));

            if (amount!=null){
                System.out.println("На складе "+ s.getName() + " найдено "+amount+" едениц товара");
            }
        }


    }


}
