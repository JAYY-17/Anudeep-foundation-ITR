public class Pattern1
{
  public static void main(String[] args) 
  {
    int rows= 5;

      for(int i=1;i<=rows;i++)
     {
        for(int j=1;j<=i;j++)
        {
          System.out.print("*"+" ");
        }  
        System.out.println();
     }
/*   *
     * *
     * * * 
     * * * *
     * * * * * 
*/
     System.out.println();
     
     for(int i=1;i<=rows;i++)
     {
        for(int j=i;j<=rows-1;j++)
        {
          System.out.print("*"+" ");
        }  
        System.out.println();
     }
    /*  * * * *
        * * *
        * *
        *
   */ 

     System.out.println();

    int cols=5;
    for(int i=1;i<=rows;i++)
    {
        for(int j=1;j<=cols;j++)
        {
         System.out.print("*"+" ");
        }
        System.out.println();
    }
/*  * * * * *
    * * * * *
    * * * * *
    * * * * *
    * * * * *
 */
   System.out.println();

   for(int i=1;i<=rows;i++)
    {
        for(int j=1;j<=rows;j++)
        {
          if(i==1 || i==rows|| j==1|| j==rows)
          {
            System.out.print("*");
          }
          else
          {
           System.out.print(" ");
          }
         
        }
         System.out.println();
    }
  /*  * * * * * 
      *       *
      *       *  
      *       *
      * * * * *      
  */

     

  }
}

