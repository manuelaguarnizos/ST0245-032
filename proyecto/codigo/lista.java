public class lista 
{
    nodo[] arr=new nodo[100];
    public static int len=100;
    int dondevamos=0;
    nodo cabeza;
    
    public nodo get(int i)
    {
        if(i<len&&i>-1)return arr[i];
        else return null;
    }
    public void add(datos a)
    {
        if(dondevamos==len)
        {
            addaux(a);
        }
        else
        {
            arr[dondevamos]=new nodo(a);
            dondevamos++;
        }
    }
    public void addaux(datos a)
    {
        nodo[] up=new nodo[len*2];
        for(int i=0;i<len;i++)
        {
            up[i]=arr[i];
        }
        up[dondevamos]=new nodo(a);
        len=len*2;
        arr=up;
        dondevamos++;
    }
    
}
