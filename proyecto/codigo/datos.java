public class datos 
{
    String label;
    double ph;
    double st;
    double sm;
    double i;
    double et;
    double eh;
    public datos(String[] s)
    {
        ph=Double.parseDouble(s[0]);
        st=Double.parseDouble(s[1]);
        sm=Double.parseDouble(s[2]);
        i=Double.parseDouble(s[3]);
        et=Double.parseDouble(s[4]);
        eh=Double.parseDouble(s[5]);
        label=s[s.length-1];
    }

    public String getLabel() {
        return label;
    }

    public double getPh() {
        return ph;
    }

    public double getSt() {
        return st;
    }

    public double getSm() {
        return sm;
    }

    public double getI() {
        return i;
    }

    public double getEt() {
        return et;
    }

    public double getEh() {
        return eh;
    }
    
}
