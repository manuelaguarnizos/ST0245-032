import java.util.ArrayList;
import java.util.Stack;
public class p2 
{
    public void p2(Stack<nevera> a,ArrayList<sol> b)
    {
        for(int i=0;i<b.size();i++)
        {
        int j=0;
        while(b.get(i).getN()<=j)
        {
            nevera g=a.pop();
            System.out.println("Nevera: "+g.getCod()+""+g.getDes()+" a la tienda: "+b.get(i).getTie());
        }
    }
    }
    public Stack creador()
    {
        Stack<nevera> a=new Stack();
        for(int i=0;i<300;i++)
        {
            nevera b=new nevera((int)(Math.random()*100),(int)Math.random()*100);
            a.push(b);
        }
        return a;
    }
    public Stack creadors()
    {
        Stack<sol> a=new Stack();
        for(int i=0;i<300;i++)
        {
            sol b=new sol((int)(Math.random()*100),(int)Math.random()*100);
            a.push(b);
        }
        return a;
    }
}

