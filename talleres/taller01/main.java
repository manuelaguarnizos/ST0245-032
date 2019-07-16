
/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class main
{
    public void main()
    {
        Punto a=new Punto(30,10);
        System.out.println("Radio Polar: " + a.radioPolar());
        System.out.println("Angulo Polar: " + Math.toDegrees(a.anguloPolar()));
        System.out.println("Angulo Polar: " + a.distanciaEuclidiana(new Punto(15,45)));
        System.out.println();
        Fecha b=new Fecha(14,3,2003);
        Fecha c=new Fecha(12,3,2009);
        System.out.println(b);
        System.out.println(c);
        System.out.println(b.comparar(c));
    }
}
