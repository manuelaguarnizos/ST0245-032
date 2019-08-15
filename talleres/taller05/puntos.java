/** Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class puntos
{
    public static int suma(int[] a)
    {
        int b=0;
        int i=0;
        while(i<a.length)
        {
            b+=a[i];
            i++;
        }
        return b;
    }
    public static int[] arrint(int n)
    {
        int [] a= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=(int)(99999*i*i);
        }
        return a;
    }
    public static void Ordenar(int[] nums )
    {      
        int size= nums.length;
        for(int i=0; i<size; i++)
        {
            int x= nums[i];
            int t= i-1;
            while(t>=0 && nums[t]> x)
            {
                nums[t+1]= nums[t];
                t=t-1;                
            }
            nums[t+1]=x;
        }        
    }
}