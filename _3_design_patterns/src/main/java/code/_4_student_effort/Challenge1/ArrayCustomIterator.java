package code._4_student_effort.Challenge1;

public class ArrayCustomIterator {

    public int[] array;
    private int index;
    public ArrayCustomIterator(int[] arr)
    {
        this.array = arr;
        this.index = 0;
    }
   public  boolean hasNext()
   {
       if(this.index < this.array.length)
          return true;
       else
           return false;
   }
    public int next()
    {
        int val = this.array[this.index++];
        return val;
    }


    public static void main(String[] args)
    {
          int[] arr = new int[]{1,2,3};
          ArrayCustomIterator it = new ArrayCustomIterator(arr);
          while(it.hasNext())
          {
              System.out.println(it.next());
          }

    }
}
