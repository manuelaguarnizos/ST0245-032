class puntos
{
    public arbol arbol;
    public int len=0;
    public arbol encontrado;
    public String tostring()
    {
        return tostringaux(arbol);
    }
    private String tostringaux(arbol a)
    {
        String d="";
        String c="";
        if(len==0)
        {
            return "";
        }
        if(a.hasizq())
        {
            d=tostringaux(a.izq);
        }
        if(a.hasder())
        {
            c=tostringaux(a.der);
        }
        return d+c+a.getA()+" ";
    }
    public void insertion(int a)
    {
        if(len==0)
        {
            arbol=new arbol(a);
            len++;
        }
        else
        {
            insertionaux(a,arbol);
            len++;
        }
    }
    private arbol insertionaux(int a,arbol b)
    {
        if(a<b.getA())
        {
            try
            {
                int d=b.izq.getA();
                return insertionaux(a,b.izq);
            }
            catch(Exception e)
            {
                arbol g=new arbol(a);
                b.izq=g;
            }
        }
        else
        {
            try
            {
                int d=b.der.getA();
                return insertionaux(a,b.der);
            }
            catch(Exception e)
            {
                arbol g=new arbol(a);
                b.der=g;
            }
        }
        return arbol;
    }
    public boolean find(int a)
    {
        if(len==0)
        {
            return false;
        }
        else
        {
            return findaux(a,arbol);
        }
    }
    private boolean findaux(int a,arbol b)
    {
        if(b.getA()==a)
        {
            encontrado=b;
            return true;
        }
        else
        {
        if(a<b.getA())
        {
            try
            {
                int d=b.izq.getA();
                return findaux(a,b.izq);
            }
            catch(Exception e)
            {
                return false;
            }
        }
        else
        {
            try
            {
                int d=b.der.getA();
                return findaux(a,b.der);
            }
            catch(Exception e)
            {
                return false;
            }
        }
        }
    }
}