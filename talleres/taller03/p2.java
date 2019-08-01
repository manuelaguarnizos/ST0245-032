public class p2
{
    public static String a="";
    public static void per(String b,int i,int j)
    {
        if(i==4) 
        {
        }
        else if(i<4)
        {
            if(j==0&&i==0) a=b;
            else if(j==6&&i<3) 
            {
                i++;
                per(a.substring(i,i+1)+b.replaceAll(a.substring(i,i+1),""),i,0);
            }
            else if(j==6&&i==3)
            {
                i++;
                per(a.substring(i)+b.replaceAll(a.substring(i),""),i++,0);
            }
            if(j<6&&i<4)
            {
                System.out.println(b);
                if(j!=2)per(b.substring(0,1)+b.substring(2)+b.substring(1,2),i,j+1);
                else per(b.substring(0,1)+b.substring(2,3)+b.substring(1,2)+b.substring(3),i,j+1);
            }
        }
    }
}