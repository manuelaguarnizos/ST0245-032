
 

/**
 *
 * @author jroldan11
 */
public class puntos 
{
    public static int p1(int[] a,int c)//lineal
    {
        if(c==a.length) return  0;//c1
        else return a[c]+p1(a,c+1); // T(n)=(T(n-1)*c2)+c1(creo)
        
    }
    public static boolean volSum (int s, double[] vols, double volMax) //es parabólico
    {

        if (s >= vols.length) return (volMax == 0); //c1

        if (volSum(s + 1, vols, volMax - vols[s])) return true;

        if (volSum(s + 1, vols, volMax)) return true;
       
        return false;
    }
    public static int[] arrint(int n)
    {
        int[] a= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=(int)(Math.random()*234857923)+1;
        }
        return a;
    }
    public static double[] arrd(int n)
    {
        double[] a= new double[n];
        for(int i=0;i<n;i++)
        {
            a[i]=Math.random()*5000;
        }
        return a;
    }
    
    
}