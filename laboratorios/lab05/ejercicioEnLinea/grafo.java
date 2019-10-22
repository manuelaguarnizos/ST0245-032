import java.util.ArrayList;

public abstract class grafo
{
	int size;
	public grafo(int vertices) {
		size = vertices;
	}
	public abstract void addArc(int source, int destination, int weight);

	public abstract ArrayList getSuccessors(int vertex);
	
	public abstract int getWeight(int source, int destination);
        
        public abstract int getv(int source);
        
        public abstract void setv(int source, int w);
        
        public abstract void setWeight(int source, int destination,int weight);
        
	public int size() {
		return size;
	}
}