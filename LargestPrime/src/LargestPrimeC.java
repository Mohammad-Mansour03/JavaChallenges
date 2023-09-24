public class LargestPrimeC
{
    public static void main (String args[])
    {
        System.out.println(getLargestPrime(63));

    }//the end of main method


    public static int getLargestPrime(int number ) {

       /* int largestPrime = -1;

        if (number <= 1)
            return largestPrime;


        for (int i = number; i >= 2; i--) {
            largestPrime = i;

            if (number % i == 0)
            {
                for (int j = 2; j < i; j++)
                {
                    if (i % j == 0)
                    {
                        largestPrime = -1;
                        break;
                    }

                }//check if the (i) is prime number or not

                if (largestPrime != -1)
                    return largestPrime;

            }//check if the (i) factor to the number

        }//check for all factors to the number
        return largestPrime;*/ // nested loop

        if (number <= 1)
            return -1;

      for (int i = number ; i >= 2 ; i--)
      {
          if (number % i == 0)
           number = i;

      }

      return number;


    }//the end of the method


}//the end of class
