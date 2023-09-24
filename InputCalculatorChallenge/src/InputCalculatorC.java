import java.util.Scanner;

public class InputCalculatorC
{
    public static void main (String args[])
    {
        inputThenPrintSumAndAverage();
    }//the end of main method

    public static void inputThenPrintSumAndAverage ()
    {
        Scanner scanner = new Scanner (System.in);

        String data;

        int number = 0;

        int sum = 0;

        long avg = 0L;

        int count = 0;

        while (true)
        {
            data = scanner.nextLine();

            try
            {
                number = Integer.parseInt(data);

                sum += number;

                count++;
            }//the end of try

            catch (NumberFormatException nfe)
            {
                break;
            }//the end of catch

        }//the end of while

        if (sum == 0)
            System.out.println("SUM = " + sum + " AVG = " + avg);

        else
        {
            avg = Math.round((double)sum / count);

            System.out.println("SUM = " + sum + " AVG = " + avg);
        }


    }//the end of method

}//the end of the class
