public class Lab2 {
    public static void main(String[] args) 
    {
      for(int i=100000;i<102000;i+=100)
      {
          int[] a=punto1.arr(i);
          long b=System.currentTimeMillis();
          punto1.InsertionSort(a);
          long c=System.currentTimeMillis();
          System.out.println(c-b);
      }
      System.out.println("Ahora MergeSort");
      for(int i=100000;i<102000;i+=100)
      {
          int[] a=punto1.arr(i);
          long b=System.currentTimeMillis();
          punto1.mergeSort(a);
          long c=System.currentTimeMillis();
          System.out.println(c-b);
      }
    }
}
