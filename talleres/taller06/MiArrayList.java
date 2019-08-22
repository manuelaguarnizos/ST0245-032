public class MiArrayList {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private char elements[]; 

    public void setElements(char[] elements) {
        this.elements=elements;
    }
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
        if ( size >=  elements.length) {                // O(1)
           char[] nuevo = new char[elements.length*2];    // O(1)
           for (int i = 0; i < elements.length; i++)    // O(n)
             nuevo[i] = elements[i];                    // O(n)
           elements = nuevo;                            // O(1)
        }
        elements[size] = e; // magia O(1)              // O(1)   
        size++;                                        // O(1)
    }   
    public void addindex(char e,int index) { 
        if ( size >=  elements.length) {               
           char[] nuevo = new char[elements.length*2];    
           for (int i = 0, y=0; i < nuevo.length; i++,y++)  
           {
             if(i!=index&&y<elements.length)
             {
                 nuevo[i] = elements[y];
             } 
             else if(i==index)
             {
                 i++;
                 y--;
                 nuevo[i]=e;
             }
             else nuevo[i]='0';
           }
           elements = nuevo;                           
        }
        else elements[size]=e;
        size++;
        
    }  
   
    
    public char get(int i) {
        return elements[i];
    }
    
    public void del(int index){ 
       if(index<elements.length)
       {
           char[] nuevo;
           nuevo = new char[elements.length-1];
           for(int i=0,y=0;i<elements.length-1;i++,y++)
           {
               if(i!=index) nuevo[i]=elements[y];
               else y++;nuevo[i]=elements[y];
           }
           elements=nuevo;
       }
       else throw new IndexOutOfBoundsException("la posición que quieres cambiar no está contenida por el arreglo");
       size--;
    }

}