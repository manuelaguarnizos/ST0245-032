public class arbol 
{
    arbol der;
    arbol izq;
    int a;
    public arbol(int a)
    {
        this.a=a;
    }

    public arbol getDer() {
        return der;
    }

    public void setDer(arbol der) {
        this.der = der;
    }

    public arbol getIzq() {
        return izq;
    }

    public void setIzq(arbol izq) {
        this.izq = izq;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    public boolean hasder() {
        if(der==null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean hasizq() {
        if(izq==null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
}