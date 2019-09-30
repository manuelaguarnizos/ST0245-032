import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.LinkedList;

public class lector 
{
    public static lista l=new lista();
    public static void lector(String v) throws FileNotFoundException
    {
        File a=new File(v);
        Scanner b=new Scanner(a);
        b.nextLine();
        while(b.hasNext())
        {
            String[] c=b.nextLine().split(",");
            datos d=new datos(c);
            l.add(d);
        }
        b.close();
    }
    
}
