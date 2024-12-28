class prno
{
  public static void main(String[] args)
  {
    int size=args.length;
    int[] array = new int [size];
    for(int i=0;i<size;i++)
    {
        array[i]=Integer.parseInt(args[i]);
     }
     for(int i=0;i<array.length;i++)
     {
          boolean isprime = true;
          for(int j=2;j<array[i];j++)
          {
             if(array[i]%j==0)
             {
                isprime = false;
                break;
               }
           }
        if(isprime)
        System.out.println(array[i] +"are the prime no in the array");
     }
   }
 }
 
 /* 
 javac slip1_1.java
    java prno 5 15 6 7
  */
