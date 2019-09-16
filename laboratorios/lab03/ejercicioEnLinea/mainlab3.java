import java.util.Scanner;
import java.util.Stack;
public class mainlab3
{
    public static void main(int y)
    {
        Stack<Integer>[] s=u.a(y);
        Scanner a=new Scanner(System.in);
        while(true)
        {
            String b=a.nextLine();
            if(b.equals("quit"))
            {
                break;
            }
            String[] arr=b.split(" ");
            int uno=Integer.parseInt(arr[1]);
            int dos=Integer.parseInt(arr[3]);
            String op1=arr[0];
            String op2=arr[2];
            if(op1.equals("move"))
            {
                if(op2.equals("onto"))
                {
                    s=u.onto(s, uno, dos);
                }
                else
                {
                    s=u.over(s, uno, dos);
                }
            }
            else
            {
                if(op2.equals("onto"))
                {
                    s=u.ponto(s, uno, dos);
                }
                else
                {
                    s=u.pover(s, uno, dos);
                }
            }
        }
        for(int j=0;j<s.length;j++)
            {
                if(!s[j].isEmpty())
                {
                    String str=s[j].toString();
                    str=str.substring(1,str.length()-1);
                    str=str.replaceAll(","," ");
                    System.out.println(j+": "+str);
                }
                else 
                {
                    System.out.println(j+": ");
                }
            }       
        System.out.println("¡Gracias!");
    }
}
