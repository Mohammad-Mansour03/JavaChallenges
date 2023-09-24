import java.math.BigDecimal;

public class DecimalComparator
{
    public static boolean areEqualByThreeDecimalPlaces (double num1  , double num2)
    {
        BigDecimal bNum1 = BigDecimal.valueOf(num1);//convert the first double number to big decimal number

        BigDecimal bNum2 = BigDecimal.valueOf(num2);//convert the second double number to big decimal

        BigDecimal c = bNum1.multiply(BigDecimal.valueOf(1000));//multiply the first big decimal number by 1000

        BigDecimal d = bNum2.multiply(BigDecimal.valueOf(1000));//multiply the second big decimal number by 1000

       return (c == d);//check if the first big decimal is equal to the second number

    }//the end of the function if two double number are equal

    public static void main (String args[])
    {

       // System.out.println(Math.round((int)(3.1756 * 1000)));


        System.out.println(areEqualByThreeDecimalPlaces(2.001 , 2.002));
    }//the end of main function


}//the end of the class decimal comparator