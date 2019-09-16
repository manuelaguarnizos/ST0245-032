import java.util.LinkedList;
import java.util.Scanner;
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        mainlab3.main(a.nextInt());
        LinkedList<String> s=punto2.p1(a.nextLine());
        for(int i=0;i<s.size();i++)
        {
            System.out.print(s.get(i));
        }
    }
}
