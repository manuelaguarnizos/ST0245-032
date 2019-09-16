import java.util.LinkedList;
public class punto2
{
    public static LinkedList p1(String a)
    {
        LinkedList<String> b=new LinkedList();
        String c="";
        String d=a;
        int i=0;
        while(i!=a.length())
        {
            if(a.charAt(i)!='['&&a.charAt(i)!=']')
            {
                c+=a.charAt(i);
            }
            else 
            {
                if(c.length()!=0) 
                {
                    b.add(c);
                    c="";
                }
                if(a.charAt(i)=='[')
                {
                    i++;
                    while(i<a.length()&&(a.charAt(i)!=']'&&a.charAt(i)!='['))
                    {
                        c+=a.charAt(i);
                        i++;
                    }
                    b.addFirst(c);
                    c="";
                    continue;
                }
                else
                {
                    i++;
                    while(i<a.length()&&(a.charAt(i)!=']'&&a.charAt(i)!='['))
                    {
                        c+=a.charAt(i);
                        i++;
                    }
                    b.addLast(c);
                    c="";
                    continue;
                }
            }
            i++;
        }
        return b;
    }
}
