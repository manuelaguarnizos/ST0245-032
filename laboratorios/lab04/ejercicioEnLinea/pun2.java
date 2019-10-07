import java.util.Scanner;
public class pun2
{
    public static void main()
    {
        puntos ar=new puntos();
        Scanner a=new Scanner(System.in);
        while(true)
        {
            int c=0;
            try{c=a.nextInt();}
            catch(Exception e){break;}
            if(c>=0)
            {
                ar.insertion(c);
            }
            else
            {
                break;
            }
        }
        System.out.println(ar.tostring());
        String[] s=ar.tostring().split(" ");
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i]);
        }
    }
}