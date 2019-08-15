/**
 * Punto 1, Taller 5.
 * 
 * @author Miguel Roldan y Manuela Guarnizo 
 * @version 13 de agosto del 2019
 */
public class Punto1
{

    /**
     * PUNTO1: Ordenar, a este metodo se le pasa como parámetro un arreglo de numeros e imprime los numeros en orden ascendente, es decir de menor a mayor. 
     * COMPLEJIDAD ASINTÓTICA: O(n^2)
     */
    
    

    /**
     * PUNTO2:  Sumar, a este método se le pasa como parametro un arreglo de numeros y retorna la suma de todos los elementos del arreglo.
     * COMPLEJIDAD ASINTÓTICA: O(n)
     */    
    public static void main(String args[]) {
        //suma
        for(int i=19000;i<19020;i++)
        {
            int[] arri=puntos.arrint((int) (i*9999*Math.random()));
            long t=System.currentTimeMillis();
            int b=puntos.suma(arri);
            b++;
            long tiempo=System.currentTimeMillis();
            System.out.println("En "+i+" se demora "+(tiempo-t));
        }
        //ordenaR
        for(int i=50;i<70;i++)
        {
            int[] arri=puntos.arrint((int) (i*99*Math.random()));
            long t=System.currentTimeMillis();
            puntos.Ordenar(arri);
            long tiempo=System.currentTimeMillis();
            System.out.println("En "+i+" se demora "+(tiempo-t));
        }
    }
}