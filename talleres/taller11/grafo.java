
import java.util.ArrayList;

public abstract class grafo
{
	int size;
	public grafo(int vertices) {
		size = vertices;
	}
	public abstract void addArc(int source, int destination, int weight);

	public abstract int[] getSuccessors(int vertex);
	
	public abstract int getWeight(int source, int destination);

	public int size() {
		return size;
	}
}