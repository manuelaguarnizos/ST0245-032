/**
 *
 * @author jroldan11
 */
public class Taller4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println("---------Punto1---------");
        for(int i=1;i<21;i++)
        {
            int[] arri=new int[i];
            arri=puntos.arrint(i*1000);
            long t=System.currentTimeMillis();
            int b=puntos.p1(arri,0);
            b++;
            long tiempo=System.currentTimeMillis();
            System.out.println("En "+i+" se demora "+(tiempo-t));
        }
        System.out.println("---------Punto2---------");
        for(int i=12;i<32;i++)
        {
            double[] arr=new double[i];
            arr=puntos.arrd(i);
            long t=System.currentTimeMillis();
            boolean c=puntos.volSum(0,arr,i);
            long tiempo=System.currentTimeMillis();
            System.out.println("En "+i+" se demora "+(tiempo-t));
        }
        
        
    }
    
}