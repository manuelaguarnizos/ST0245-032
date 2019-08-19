public class adn
{
    public static int adn(String a,String b){
        if(a.length()==0^b.length()==0)
        {
            return 0;
        }
        else 
        {
            String c=b.replace(a.substring(0,1), "");
            if(!c.equals(b)) return 1+adn(a.substring(1),c);
            else return adn(a.substring(1),b);
        }
    }
    public static int formas(int n){
        if(n <= 2) return n;
        return formas(n-1) +formas(n-2);
    }
}
