/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller11;

/**
 *
 * @author jroldan11
 */
public class reco 
{
    public boolean prof(grafoma a,int b,int c)
    {
        int[] d=a.getSuccessors(b);
        if(d.length==0)
        {
            return false;
        }
        else if(a.contains(d,c))
        {
           return true;
        }
        else
        {
            for(int i=0;i<d.length;i++)
            {
                prof(a,d[i],c);
            }
        }
        return false;
    }
    public void profolista(grafolist a,int b,int c)
    {
        int[] d=a.getSuccessors(b);
        if(d.length==0)
        {
            System.out.println("no se conecta");
        }
        else if(a.contains(d, c))
        {
           System.out.println("si se conectan");
        }
        else
        {
            for(int i=0;i<d.length;i++)
            {
                profolista(a,d[i],c);
            }
        }
    }
    public boolean ampllista(grafolist a,int b,int c)
    {
        int[] d=a.getSuccessors(b);
        if(d.length==0)
        {
            return false;
        }
        else if(a.contains(d, c))
        {
           return true;
        }
        else
        {
            boolean[] visitado= ampllistaux(a,b,c,d,0);
            return mayor(visitado);
        }
    }
    public boolean[] ampllistaux(grafolist a,int b,int c,int[] d,int p)
    {
        boolean[] v=new boolean[a.l.size()];
        try
            {
                if(!a.contains(d, c))
                {
                    for(int i=0;i<d.length;i++) 
                    {
                        ampllistaux(a,d[i],c,a.getSuccessors(d[i]),i);
                    }
                }
                else if(a.contains(d, c))
                {
                    v[p]=true;
                }   
            }
            catch(Exception e){v[p]=false;}
        return v;
    }
    public boolean mayor(boolean[] a)
    {
        int b=0;
        int c=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]) b++;
            else c++;
        }
        return b>c;
    }
}