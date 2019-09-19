import java.util.LinkedList;
public class hash
{
    private LinkedList<Pair>[] tabla;
    public hash()
    {
        tabla=new LinkedList[10];
        for(int i=0;i<10;i++)
        {
            Pair a=new Pair("",0);
            tabla[i].add(a);
        }
    }
    public int function(String s)
    {
        int a=0;
        for(int i=0;i<s.length();i++)
        {
            a+=(int)s.charAt(0);
        }
        return a%10;
    }
    public int[] get(String s)
    {
        int a=function(s);
        int[] b=new int[tabla[a].size()];
        for(int i=0,y=0;i<tabla[a].size()&&y<b.length;i++)
        {
            if(tabla[a].get(i).getA().equals(s))
            {
                b[y]=tabla[a].get(i).getB();
                y++;
            }
        }
        return b;
    }
    public void add(String s,int i)
    {
        Pair pair=new Pair(s,i);
        int a=function(s);
        tabla[a].addLast(pair);
    }
}