package gr.athtech.crm.collection;


import java.util.ArrayList;

public abstract class InventoryImpl<T> implements Inventory<T>{

    private ArrayList<T> list;

    public InventoryImpl() {
        list =  new ArrayList<>();
    }
    // Create,Add  Read,Get,Retrieve Update,Change  Delete,Remove

    @Override
    public void add(T product) throws Exception{
        validateT(product);
        list.add(product);
    }

    @Override
    public T get(int index) throws Exception {
        validateIndex(index);
        return list.get(index);
    }



    @Override
    public void remove(int index) throws Exception {
        validateIndex(index);
        list.remove(index);
    }

    private void validateT(T product) throws Exception {
        //validation
        if (product == null)
            throw new Exception("Null item was given");

    }
    private void validateIndex(int index) throws Exception {
        if (index < 0 || index >= list.size())
            throw new Exception("Index out of bounds");
    }

    @Override
    public String toString() {
        return "inventory{" +
                "list=" + list +
                '}';
    }
    
    
}
