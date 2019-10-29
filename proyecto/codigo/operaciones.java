public class operaciones {
    public static double  entropia(double si,double no,double total)
    {
        if(si==0^no==0^total==0)
        {
            return 0;
        }
        double a=(si/total*(Math.log(si/total) / Math.log(2)));
        double b=(no/total*(Math.log(no/total) / Math.log(2)));
        double c=-a-b;
        return c;
    }
    public static double gain(double entropiaarriba,double entropiaabajo,double totalarriba,double totalabajo,lector c)
    {
        if(c.entro==0^c.l.dondevamos==0) return 0;
        double d=c.entro-((totalarriba/c.l.dondevamos)*entropiaarriba)-((totalabajo/c.l.dondevamos)*entropiaabajo);
        return d;
    }
    public static void split()
    {
        
    }
    public static void gainratio()
    {
        
    }
}
