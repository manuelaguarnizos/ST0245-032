import java.util.Stack;
public class puntos 
{
    
    public int p1(String s)
    {
        Stack<Integer> a=new Stack<>();
        Stack<String> b=new Stack<>();
        String[] arr=s.split(" ");
        for(String t:arr)
        {
            if(t.equals("+")) b.push(t);
            else if(t.equals("-"))b.push(t);
            else if(t.equals("*"))b.push(t);
            else if(t.equals("/")) b.push(t);
            else
            {
                try{a.push(Integer.parseInt(t));}
                catch(Exception e){}
            }
        }
        int resultado=p1aux(a,b);
        return resultado;
    }
    private int p1aux(Stack<Integer> a,Stack<String> b)
    {
        if(b.isEmpty()&&a.isEmpty()) return 0;
        else if(b.isEmpty()&&!a.isEmpty()) return a.pop();
        else if(!b.isEmpty()&&a.isEmpty()) return 0;
        else
        {
            String s=b.pop();
            if(s.equals("+")) return a.pop()+p1aux(a,b);
            else if(s.equals("-")) return a.pop()-p1aux(a,b);
            else if(s.equals("*")) return a.pop()*p1aux(a,b);
            else return a.pop()/p1aux(a,b);
        }
    }
    public Stack invertir(Stack s)
    {
        Stack a=new Stack();
        for(int i=0;i<s.size();i++)
        {
            a.push(s.pop());
        }
        return a;
    }
}