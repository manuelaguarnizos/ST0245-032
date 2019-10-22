import java.util.ArrayList;
import java.util.Scanner;
public class p2 
{
    public static String p2()
    {
        Scanner a=new Scanner(System.in);
        int b=Integer.parseInt(a.nextLine());
        grafolist g = new grafolist(b);
        int c=Integer.parseInt(a.nextLine());
        for(int i=0;i<c;i++)
        {
            String[] d=a.nextLine().split(" ");
            if(d.length!=2)
            {
                break;
            }
            else
            {
                g.addArc(Integer.parseInt(d[0]),Integer.parseInt(d[1]), 0);
            }
        }
        int[] uno=new int[g.vertices.size()];
        int[] dos=new int[g.vertices.size()];
        g.setv(0,1);
        uno[0]=1;
        dos[0]=-1;
        for(int i=0;i<g.v.size();i++)
        {
            ArrayList<Integer> t=g.getSuccessors(i);
            for(int j=0;j<t.size();j++)
            {
                if(g.getv(i)==1) 
                {
                    if(dos[t.get(j)]==-1)
                    {
                        return "no bi";
                    }
                    else
                    {
                        dos[t.get(j)]=1;
                        uno[t.get(j)]=-1;
                        g.setv(j, 2);
                    }
                    
                }
                else
                {
                    if(uno[t.get(j)]==-1)
                    {
                        return "no bi";
                    }
                    else
                    {
                        uno[t.get(j)]=1;
                        dos[t.get(j)]=-1;
                        g.setv(j, 2);
                    }
                }
            }
        }
        return "BICOLORABLE";
    }
}
