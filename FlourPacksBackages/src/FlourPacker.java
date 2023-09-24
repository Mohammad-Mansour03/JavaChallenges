public class FlourPacker
{
    // write your code here

    public static void main (String args[])
    {
        System.out.println(canPack(2 , 10 , 20));
    }//the end of main function
  /*  public static boolean canPack (int bigCount  , int smallCount , int goal)
    {
        //bigCount ==> the count of big flour bags (5 kilos each bag)

        //smallCount ==> the count of small flour bags (1 kilo each bag)

        //goal ==> the goal amount of kilos of flour needed to assemble a package

        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;

      while (bigCount > 0 || smallCount > 0)
       {
           if (bigCount > 0 && goal >= 5)
           {
               goal -=5;

               bigCount--;
           }

           else
           if (smallCount > 0 && goal > 0)
           {
               goal -=1;

               smallCount--;
           }

           else
               break;
       }

       // System.out.println(goal);
        if (goal == 0)
            return true;

        else
            return false;
    }//the end of method canPack
*/ // Solution 1

    public static boolean canPack (int bigCount , int smallCount , int goal)
    {
        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;

        while (bigCount > 0 && goal >= 5)
        {
            goal -=5;

            bigCount--;
        }

        return smallCount >= goal;

    }//the end of method

}//the end of the class