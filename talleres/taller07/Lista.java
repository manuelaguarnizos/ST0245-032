class Lista 
{
  public Nodo primer; 
  public int size;
  public Lista(){
     primer =null;
     size = 0;
  }
  private int getAux(Nodo nodo, int i){
     if (i == 0)
       return nodo.dato;
     else
       return getAux(nodo.sig, i-1);
  }
  public int get(int i){
    return getAux(primer,i);
  }
  private String toString(Nodo nodo){
     if (nodo == null) return "]"; 
     else 
     {
        if(nodo.sig!=null)return nodo.dato + "," + toString(nodo.sig);
        else return nodo.dato+toString(nodo.sig);
     }
  }
  public String toString(){
     return "["+toString(primer);
  }
  public void insertar(int e,int index)
  {
      insertaraux(index,e,primer,0);
      size++;
  }
  private void  insertaraux(int index,int n,Nodo a,int i) throws IndexOutOfBoundsException
  {
    if(index>size+1)
    {
        try
        {
            
        }
        catch(IndexOutOfBoundsException o)
        {
            System.out.println("se sale");
            throw o;
        }
    }
    else if(i==size+1)
    {
        
    }
    else if(index==i) 
    {
        Nodo nuevo = new Nodo(n);
        nuevo.sig = a;
        a = nuevo;
    }
    else 
    {
        insertaraux(index,n,primer.sig,i+1);
    }
  }
  public void  insertarAlPrincipio(int e){
    Nodo nuevo = new Nodo(e);
    nuevo.sig = primer;
    primer = nuevo;
    size++;
  }
  public void remover(int index)
  {
      removeraux(index,0,primer);
      size--;
  }
  public void removeraux(int index,int i,Nodo a)
  {
      if(i==size-1)
      {
          
      }
      else
      {
          if(i==index)
          {
              a=a.sig;
              removeraux(index,i+1,a.sig);
          }
          else
          {
              removeraux(index,i+1,a.sig);
          }
      }
  }
  public boolean tiene(int e)
  {
      return tieneaux(e,primer,0);
  }
  private boolean tieneaux(int e,Nodo a,int i)
  {
      if(i==size)
      {
          return false;
      }
      else
      {
          if(a.dato==e) return true;
          else if(a.dato!=e&&i<size) return tieneaux(e,a.sig,i+1);
          else return false;
      }
  }
}