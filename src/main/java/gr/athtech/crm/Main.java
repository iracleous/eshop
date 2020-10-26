package gr.athtech.crm;

import gr.athtech.crm.collection.impl.CustomerInventoryImpl;
import gr.athtech.crm.collection.impl.ProductInventoryImpl;
import gr.athtech.crm.model.Customer;
import gr.athtech.crm.model.Product;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setAge(30);
        customer.setName("David");
        System.out.println(customer);

        CustomerInventoryImpl customerInventory = new CustomerInventoryImpl();
        try {
            customerInventory.add(customer);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(customerInventory);

        ProductInventoryImpl inventory = new ProductInventoryImpl();

        addProductWithTry(inventory, new Product
                ("Chips", "AW1234","Tsakiris", (float) 1.30));
        addProductWithTry(inventory, new Product
                ("x1", "ss","Tsakiris", (float) 1.30));
        addProductWithTry(inventory,new Product
                ("Chocolate", "ss","Tsakiris", (float) 1.30));

        System.out.println(inventory);
        try {
            inventory.updatePrice(1, 1.35f);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(inventory);
        try {
            inventory.remove(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(inventory);
    }






    private static void addProductWithTry(ProductInventoryImpl inventory, Product product) {
        try {
            inventory.add(product);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
