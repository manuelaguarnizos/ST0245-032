import java.io.*;
import java.util.*;
public class p1 
{
    public static grafo lector(String a)throws FileNotFoundException
    {
        Scanner b=new Scanner(new File(a));
        b.nextLine();
        ArrayList<String[]> c=new ArrayList();
        ArrayList<String[]> e=new ArrayList();
        int i=0;
        int f=0;
        while(b.hasNextLine())
        {
            String[] s=b.nextLine().split(" ");
            i++;
            if(s.length>4)
            {
                f++;
            }
            if(f==0)
            {
                c.add(s);
            }
            else
            {
                e.add(s);
            }
        }
        grafolist d=new grafolist(i);
        for(int j=0;j<e.size();j++)
        {
            d.addArc(Integer.parseInt(e.get(j)[0]),Integer.parseInt(e.get(j)[1]), Integer.parseInt(e.get(j)[2]));
        }
        for(int j=1;j<=c.size();j++)
        {
            d.vi.add(j,c.get(j)[c.size()-1]);
        }
        return d;
    }
}
