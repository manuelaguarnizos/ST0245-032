import java.io.FileNotFoundException;
import java.util.ArrayList;
public class pruebita 
{
    public static lista b;
    public static void main(lector a,int[] cols,int empieza,int termina) throws FileNotFoundException
    {
        b=a.l;
        double[] supercols=new double[6];
        double[] superfilas=new double[6];;
        for(int i=0;i<6;i++)
        {
            double maxgain=0;
            if(cols[i]!=0) continue;
            for(int j=empieza;j<=termina;j++)
            {
                double tarriba=0;
                double tabajo=0;
                double sisarriba=0;
                double nosarriba=0;
                double sisabajo=0;
                double nosabajo=0;
                for(int k=empieza;k<=termina;k++)
                {
                    if(b.get(k).getDatos().arr[i]>b.get(j).getDatos().arr[i])
                    {
                        if(b.get(k).getDatos().label.equals("yes"))
                        {
                            sisarriba++;
                        }
                        else
                        {
                            nosarriba++;
                        }
                        tarriba++;
                    }
                    else
                    {
                        if(b.get(k).getDatos().label.equals("yes"))
                        {
                            sisabajo++;
                        }
                        else
                        {
                            nosabajo++;
                        }
                        tabajo++;
                    }  
                }
                double entropiaarr=operaciones.entropia(sisarriba,nosarriba,tarriba);
                double entropiaaba=operaciones.entropia(sisabajo, nosabajo, tabajo);
                double gain=operaciones.gain(entropiaarr, entropiaaba, tarriba, tabajo, a);
                if(gain>maxgain)
                {
                    maxgain=gain;
                    supercols[i]=b.get(j).getDatos().arr[i];
                    superfilas[i]=j;
                }
            }
        }
        double mayor=0;
        int numcol=0;
        for(int i=0;i<supercols.length;i++)
        {
            if(mayor<supercols[i])
            {
                mayor=supercols[i];
                numcol=i;
            }
        }
        cols[numcol]=numcol;
        pruebita.main(a, cols, empieza, (int) superfilas[numcol]);
        pruebita.main(a, cols, (int) (superfilas[numcol]+1), termina);
    }
}
