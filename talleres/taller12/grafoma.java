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
public class grafoma extends grafo
{
    int[][] m;
    int vertices;
    public grafoma(int vertices) {
        super(vertices);
        this.vertices=vertices;
        m=new int[vertices][vertices];
    }

    @Override
    public void addArc(int source, int destination, int weight) {
        m[source][destination]=weight;
    }

    @Override
    public int[] getSuccessors(int vertex) {
        int[] a=new int[vertices];
        for(int i=0, y=0;i<vertices;i++)
        {
            if(m[vertex][i]!=0)
            {
                a[y]=m[vertex][i];
                y++;
            }
        }
        return a;
    }
    public boolean contains(int[] a,int b)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==b)
            {
                return true;
            }
        }
        return false;
    }
    @Override
    public int getWeight(int source, int destination) {
        return m[source][destination];
    }
    
}