import java.util.ArrayList;
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
                a[y]=l.get(i).getSource();
                y++;
            }
        }
        return a;
    }

    @Override
    public int getWeight(int source, int destination) {
        return l.get(source).getWeight();
    }
    
}