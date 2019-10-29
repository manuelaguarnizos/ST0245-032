import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class lector 
{
    public double entro=0;
    public lista l=new lista();
    public void lector(String v) throws FileNotFoundException
    {
        File a=new File(v);
        Scanner b=new Scanner(a);
        b.nextLine();
        double mayorph=-300,mayoret=-300, mayoreh=-300, mayori=-300, mayorsm=-300, mayorst=-300;
        double menorph=1000000,menorst=1000000,menorsm=1000000,menori=1000000,menoret=1000000,menoreh=1000000;
        int nos=0;
        int sis=0;
        while(b.hasNext())
        {
            String[] c=b.nextLine().split(",");
            datos d=new datos(c);
            if(d.label.equals("yes")) sis++;
            else nos++;
        }
        entro=operaciones.entropia(sis, nos,l.dondevamos);
        b.close();
    }
    
}
