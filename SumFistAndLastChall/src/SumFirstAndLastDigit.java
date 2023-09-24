public class SumFirstAndLastDigit
{
    public static void main (String args[])
    {
       System.out.println(sumFirstAndLastDigit(555558));
    }//the end of main method

    public static int sumFirstAndLastDigit (int number)
    {
        if (number < 0)
            return -1;

        int sum = 0; // store the sum of the first digit of number and the last digit

        sum = sum + number % 10; // store the last digit of number

        while (number >= 10)
            number /=10;//truncate the last digit of number until reaching the first digit

        sum += number;//adding the first digit of number to the variable sum

        return sum;

    }

}
