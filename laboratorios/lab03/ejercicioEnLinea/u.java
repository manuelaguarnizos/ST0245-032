import java.util.Stack;
public class u
{
    public static Stack<Integer>[] a(int a)
    {
        Stack<Integer>[] s= (Stack<Integer>[]) new Stack[a];
        for(int i=0;i<a;i++)
            {
                Stack<Integer> b=new Stack();
                b.push(i);
                s[i]=b;
            }
        return s;
    }
    public static Stack<Integer> inv(Stack<Integer> a)
    {
        Stack<Integer> b=new Stack();
        for (int i = 0; i < a.size(); i++) {
            b.push(a.pop());
        }
        return b;
    }
    public static Stack<Integer>[] onto(Stack<Integer>[] a,int uno,int dos)
    {
        int i=0;
        while(!a[i].contains(uno))
        {
            i++;
        }
        int j=0;
        while(!a[j].contains(dos))
        {
            j++;
        }
        if(a[i].peek()==uno&&a[j].peek()==dos)
        {
            a[j].push(a[i].pop());
        }
        else if(a[i].peek()!=uno&&a[j].peek()==dos)
        {
            while(a[i].peek()!=uno)
            {
                int d=a[i].pop();
                Stack<Integer> s=new Stack();
                s=a[d];
                a[d]=null;
                a[d].push(d);
                s=inv(s);
                for(int t=0;t<s.size();t++)
                {
                    a[d].push(s.pop());
                }
            }
            a[j].push(a[i].pop());
        }
        else
        {
            while(a[i].peek()!=uno)
            {
                Stack<Integer> s=new Stack();
                int d=a[i].pop();
                s=a[d];
                a[d]=null;
                a[d].push(d);
                s=inv(s);
                for(int t=0;t<s.size();t++)
                {
                    a[d].push(s.pop());
                }
            }
            while(a[j].peek()!=dos)
            {
                Stack<Integer> s=new Stack();
                int d=a[j].pop();
                s=a[d];
                a[d]=null;
                a[d].push(d);
                s=inv(s);
                for(int t=0;t<s.size();t++)
                {
                    a[d].push(s.pop());
                }
            }
            a[j].push(a[i].pop());
        }
        return a;
    }
    public static Stack<Integer>[] ponto(Stack<Integer>[] a,int uno,int dos)
    {
        int i=0;
        while(!a[i].contains(uno))
        {
            i++;
        }
        int j=0;
        while(!a[j].contains(dos))
        {
            j++;
        }
        if(a[dos].peek()==dos)
        {
            a[uno]=inv(a[uno]);
            while(!a[uno].isEmpty())
            {
                a[dos].push(a[uno].pop());
            }
        }
        else
        {
            while(a[j].peek()!=dos)
            {
                Stack<Integer> s=new Stack();
                int d=a[j].pop();
                s=a[d];
                a[d]=null;
                a[d].push(d);
                s=inv(s);
                for(int t=0;t<s.size();t++)
                {
                    a[d].push(s.pop());
                }
            }
            a[uno]=inv(a[uno]);
            while(!a[uno].isEmpty())
            {
                a[dos].push(a[uno].pop());
            }
        }
        System.out.println(a[j].toString());
        return a;
    }
    public static Stack<Integer>[] over(Stack<Integer>[] a,int uno,int dos)
    {
        int i=0;
        while(!a[i].contains(uno))
        {
            i++;
        }
        int j=0;
        while(!a[j].contains(dos))
        {
            j++;
        }
        if(a[i].peek()==uno)
        {
            a[j].push(a[i].pop());
        }
        else 
        {
            while(a[i].peek()!=uno)
            {
                int d=a[i].pop();
                Stack<Integer> s=a[d];
                a[d]=null;
                a[d].push(d);
                s=inv(s);
                for(int t=0;t<s.size();t++)
                {
                    a[d].push(s.pop());
                }
            }
            a[j].push(a[i].pop());
        }
        return a;
    }
    public static Stack<Integer>[] pover(Stack<Integer>[] a,int uno,int dos)
    {
        int i=0;
        while(!a[i].contains(uno))
        {
            i++;
        }
        int j=0;
        while(!a[j].contains(dos))
        {
            j++;
        }
        a[i]=inv(a[i]);
        while(!a[i].isEmpty())
        {
            a[j].push(a[i].pop());
        }
        return a;
    }
    
}