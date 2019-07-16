
/**
 * Write a description of class Punto2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fecha
{
    int dia, mes, año;

    public Fecha(int dia, int mes, int año) 
    {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int dia() 
    {
        return this.dia;
    }

    public int mes() 
    {
        return this.mes;
    }

    public int anio() 
    {
        return this.año;
    }

    public String comparar(Fecha otra) 
    {
        int fecha1=año*10000+mes*100+dia;
        int fecha2=otra.año*10000+otra.mes*100+otra.dia;
        if(fecha1>fecha2) return "es mayor la fecha:"+fecha1;
        if(fecha1==fecha2) return "son iguales";
        return "es mayor la fecha:"+fecha2;
    }

    public String toString(int dia,int mes,int año) 
    {
        String fecha="";
        fecha+=Integer.toString(dia)+"/";
        fecha+=Integer.toString(mes)+"/";
        fecha+=Integer.toString(año);
        return fecha;
    }
}

