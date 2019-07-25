
/**
 * Write a description of class punto1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class punto1 
{
    public static int mcd(int a,int b)
    {
        if(b==0) return a;
        else return mcd(b,a%b);
    }
}