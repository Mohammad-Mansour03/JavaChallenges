public class DiagonalStarC
{
    public static void main (String args[])
    {
        printSquareStar(5);

    }//the end of main method

    public static void printSquareStar (int number)
    {

        if (number < 5)
            System.out.println("Invalid Value");

        else
        {
            for (int i = 1 ; i <= number ; i++)
            {
                for (int j = 1 ; j <= number ; j++)
                {
                    if (i == 1 || j == 1 || i == number || j == number || i == j || j == number - i + 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }

    }//the end of method

}//the end of the class
