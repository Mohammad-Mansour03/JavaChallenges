public class GreatestCommonDivisor
{
    // write your code here

    public static void main (String args[])
    {
    System.out.println(getGreatestCommonDivisor(8 , 10));
    }

   /* public static int getGreatestCommonDivisor (int number1 , int number2)
    {
//        if (number1 < 10 || number2 < 10)
//            return -1;

        int gcd = 1;

      int smallerNum = ((number1 < number2)? number1 : number2);

        for (int i = 2 ; i <= smallerNum  ; i++)
        {
            if (number1 % i == 0 && number2 % i == 0)
                gcd = i;
        }

        return gcd;
    }//the end of method
*/
   public static int getGreatestCommonDivisor(int first, int second) {

//       if (first < 10 || second < 10) {
//           return -1;
//       }
       while (first != second) {
           if (first > second)
               first = first - second;
           else {
               second = second - first;
           }
       }
       return first;
   }
}//the end of the class