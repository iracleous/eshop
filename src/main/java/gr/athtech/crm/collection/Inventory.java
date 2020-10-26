package gr.athtech.crm.collection;



public interface Inventory<T> {

      void add(T t) throws Exception;
      T get(int index) throws Exception ;
     void remove (int index) throws Exception ;

}
