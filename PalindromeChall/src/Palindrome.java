public class Palindrome
{
    public static void main (String args[])
    {
        System.out.println (isPalindrome(-1221));

    }//the end of main function
        public static boolean isPalindrome (int number)
        {

           number = Math.abs(number);

           int reverse = 0;

           int tempNum = number;

           while (number > 0)
           {
               reverse = reverse * 10 + number % 10;

               number /=10;
           }

           return (tempNum == reverse);

        }//the end of method



}//the end of the class
