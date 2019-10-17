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
import java.util.LinkedList;
public class grafolist extends grafo
{
    LinkedList<par> l;
    int vertices;
    public grafolist(int vertices) {
        super(vertices);
        this.vertices=vertices;
        l=new LinkedList();
    }

    @Override
    public void addArc(int source, int destination, int weight) {
        l.add(new par(source,destination,weight));
    }

    @Override
    public int[] getSuccessors(int vertex) {
        int[] a=new int[vertices];
        for(int i=0,y=0;i<vertices;i++)
        {
            if(l.get(i).getSource()==vertex)
            {
                a[y]=l.get(i).getDestination();
                y++;
            }
        }
        return a;
    }
    public boolean contains(int[] a,int b)
    {
        for(int i=0;i<a.length;i++)
        {
            if(l.get(i).getDestination()==b)
            {
                return true;
            }
        }
        return false;
    }
    @Override
    public int getWeight(int source, int destination) {
        return l.get(source).getWeight();
    }
    
}