package gr.athtech.crm;

import gr.athtech.crm.collection.Inventory;
import gr.athtech.crm.model.Product;

public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        addProductWithTry(inventory, new Product
                ("Chips", "AW1234","Tsakiris", (float) 1.30));
        addProductWithTry(inventory, new Product
                ("x1", "ss","Tsakiris", (float) 1.30));
        addProductWithTry(inventory,new Product
                ("Chocolate", "ss","Tsakiris", (float) 1.30));

        System.out.println(inventory);
        try {
            inventory.updateProductPrice(1, 1.35f);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(inventory);
        try {
            inventory.removeProduct(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(inventory);
    }

    private static void addProductWithTry(Inventory inventory, Product product) {
        try {
            inventory.addProduct(product);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
