
/**
 * Write a description of class pto1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pto1
{
    public static void main(int n,int t1,int t2,int t3)
    {
        if(n==1) System.out.println("Disco 1 de la torre "+t1+" a "+t3);
        else
        {
            main(n-1,t1,t3,t2);
            System.out.println("Disco "+n+" de la torre "+t1+" a "+t3);
            main(n-1,t2,t1,t3);
        }
    }
}
