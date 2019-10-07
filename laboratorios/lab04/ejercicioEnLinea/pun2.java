import java.util.ArrayList;
import java.util.Scanner;
public class pun2
{
    public static void main()
    {
        puntos ar=new puntos();
        Scanner a=new Scanner(System.in);
        ArrayList<Integer> b=new ArrayList();
        while(true)
        {
            int c=0;
            try{c=a.nextInt();}
            catch(Exception e){break;}
            if(c>=0)
            {
                b.add(c);
            }
            else
            {
                break;
            }
        }
        for(int i=0;i<b.size();i++)
        {
            ar.insertion(b.get(i));
        }
        String[] s=ar.toString().split(" ");
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i]);
        }
    }
}