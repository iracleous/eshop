package gr.athtech.crm.collection;

import gr.athtech.crm.model.Product;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> products;

    public Inventory() {
        products =  new ArrayList<>();
    }
    // Create,Add  Read,Get,Retrieve Update,Change  Delete,Remove

    public void addProduct(Product product) throws Exception{
        validateProduct(product);
        products.add(product);
    }

    public Product getProduct(int index) throws Exception {
        validateIndex(index);
        return products.get(index);
    }

     public void updateProductPrice(int index, float price)  throws Exception{
        validateIndex(index);
        products.get(index).setPrice(price);
    }

    public void removeProduct(int index) throws Exception {
        validateIndex(index);
        products.remove(index);
    }

    private void validateProduct(Product product) throws Exception {
        //validation
        if (product == null)
            throw new Exception("Null product was given");
        //validation 2
        if (product.getName().equals("x"))
            throw new Exception("You cannot name the product x");
    }
    private void validateIndex(int index) throws Exception {
        if (index < 0 || index >= products.size())
            throw new Exception("Index out of bounds");
    }

    @Override
    public String toString() {
        return "gr.athtech.crm.collection.Inventory{" +
                "products=" + products +
                '}';
    }
}
