import java.util.ArrayList;
/**
 * Esta clase es una implementación de un grafo usando listas de adyacencia
 * 
 * @author Mauricio Toro 
 * @version 1
 */
public class grafolist extends grafo
{
   public ArrayList<ArrayList<Integer>> vertices;
   public ArrayList<ArrayList<Integer>> weights;
   public ArrayList<Integer> v;
   public ArrayList<String> vi;
   
   public grafolist(int size)
   {
       super(size);
       vertices = new ArrayList<ArrayList<Integer>>();
       weights = new ArrayList<ArrayList<Integer>>();
       v=new ArrayList();
       vi=new ArrayList();
       for (int i = 0; i < size; i++)
       {
        ArrayList<Integer> arcs = new ArrayList<Integer>();
        ArrayList<Integer> ws = new ArrayList<Integer>();
        vertices.add(arcs);
        weights.add(ws);
        v.add(0);
        vi.add("");
       }
   }
   public int getv(int source)
   {
       return v.get(source);
   }
   public void setv(int source, int w)
   {
       v.set(source,w);
   }
   
   public void addArc(int source, int destination, int weight)
   {
        vertices.get(source).add(destination);
        weights.get(source).add(weight);
   }
   
   public int getWeight(int source, int destination)
   {
      for (int j = 0; j < size; j++)
      {
        if (vertices.get(source).get(j) == destination)
            return weights.get(source).get(j);
      }
      return -1;
   }
   public void setWeight(int source, int destination,int w)
   {
      for (int i= 0; i < vertices.get(source).size(); i++)
      {
        if (vertices.get(source).get(i) == destination)
        {
            weights.get(source).set(i,w);
        }
      }
   }
  
   @Override
   public ArrayList<Integer> getSuccessors(int vertice)
   {
       return vertices.get(vertice);
   }
}