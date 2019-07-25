
/**
 * Write a description of class punto3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class punto3 
{
    public static void posibles(String a,String b)
    {
        if(0==a.length()) System.out.println(b);
        else 
        {
            posibles(a.substring(1),b+a.charAt(0));
            posibles(a.substring(1),b);
        }
    }
}