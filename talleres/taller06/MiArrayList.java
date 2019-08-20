import java.util.ArrayList;
public class MiArrayList {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private char elements[]; 

    public char[] getElements() {
        return elements;
    }
    
    public MiArrayList() {
        size = 0; // elementos insertados por el usuario
        elements = new char[DEFAULT_CAPACITY];    
    }     

    public int size() {
        return this.size;
    }   
    public void add(char e) { 
        if ( size ==  elements.length) {                // O(1)
           char[] nuevo = new char[elements.length*2];    // O(1)
           for (int i = 0; i < elements.length; i++)    // O(n)
             nuevo[i] = elements[i];                    // O(n)
           elements = nuevo;                            // O(1)
        }
        elements[size] = e; // magia O(1)              // O(1)   
        size++;                                        // O(1)
    }     
    
    public char get(int i) {
        return elements[i];
    }
    
    public void del(int index){ 
       if(index<elements.length)
       {
           char[] nuevo = new char[elements.length-1];
           for(int i=0;i<elements.length-1;i++)
           {
               if(i!=index)
               nuevo[i]=elements[i];
           }
       }
    }


}
