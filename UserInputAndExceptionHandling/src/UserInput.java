import java.util.Scanner;

public class UserInput
{
    public static void main (String args[])
    {
        int currentYear = 2023;

        try
        {
            System.out.println(readDataByConsole(currentYear));
        }//the end of try body

        catch (NullPointerException | ArithmeticException e)
        {
            System.out.println(readDataByScanner(currentYear));
        }//the end of catch body

    }//the end of main


    public static String readDataByConsole (int currentYear)
    {

        String studentName = System.console().readLine("Please enter your Name :");

        String universityName = System.console().readLine("Please enter your university name :");

        String dateOfBirthCo = System.console().readLine("Please enter the year when you are birth :");

        int age = currentYear - Integer.parseInt(dateOfBirthCo);

        return "your name is : " + studentName + "\nthe university name is : " + universityName
                + "\nyour age is : " + age;
    }

    public static String readDataByScanner (int currentYear)
    {
        /*Scanner scanner = new Scanner (System.in);

        System.out.println("Plz , enter your name");
        String name = scanner.nextLine();

        System.out.println("plz , enter your university name");
        String uniName = scanner.nextLine();

        int dateOfBirth;

        do
        {
            System.out.println("plz , enter when you are born");
            dateOfBirth = scanner.nextInt();
        }while (dateOfBirth > 2023 || dateOfBirth < 1950 || dateOfBirth < 0);

        int age = currentYear - dateOfBirth;


        return "Your name is : " + name + "   your university is:  " + uniName + " your age is:  " + age;*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Name ");

        String name = scanner.nextLine();

        System.out.println("Enter Your university name ");

        String uniName = scanner.nextLine();

        int age = 0;

        boolean validData = false;

        do
        {
            System.out.println("Enter the date of birth between " + (currentYear - 125) + "-"
                    + currentYear);
            try
            {
                age = checkData(currentYear , scanner.nextLine());

                validData = (age == -1) ? false :true;//validData = age >= 0; validData = age != -1;
            }//the end of try code block

            catch (NumberFormatException userException)
            {
                System.out.println("No any character is allowed !!!!!");
            }//the end of catch code block

        }while (!validData);//the end of do while loop

        return "Your name is : " + name + "\nyour university is:  " + uniName + "\nyour age is:  " + age;

    }//the end of method readDataByScanner

    public static int checkData (int currentYear , String dateOfBirth)
    {
        int dob = Integer.parseInt(dateOfBirth);

        int minYears = currentYear - 125;

        if (dob > currentYear || dob < minYears)
            return -1;

        return currentYear - dob;

    }//the end of method checkData

}//the end of the class
