import java.util.Scanner;

class Password_Strength_Meter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        boolean showSystemProperties = false;


        //default false - if all true then strong
        boolean upper = false;
        boolean lower = false;
        boolean numbers = false;
        boolean symbols = false;
        boolean length16 = false;


        //Prompt
        System.out.println("\n\n\nWelcome to the Password Checker");
        System.out.println("This program will check how strong your Password is");
        System.out.println("\nSecurity.org recommends that passwords should contain:" +
                "\n 16 for extra protection" +
                "\n Uppercase and lowercase letters" +
                "\n Numbers" +
                "\n Symbols");

        System.out.println("\n\nEnter your sample Password to see how strong it is: ");
        String Password = sc.nextLine();
        char[] pw = Password.toCharArray();


        //Length
        int length = Password.length();
        if (length >= 16)
            {length16 = true;}


        //Numbers Uppercase Lowercase
        for (int i = 0; i < pw.length; i++)
        {

            if (Password.contains(String.valueOf(i)))
            {
                numbers = true;
            }

            if (Character.isUpperCase(pw[i]))
            {
                upper = true;
            }

            if (Character.isLowerCase(pw[i]))
            {
                lower = true;
            }

        }


        //Symbols
       if (Password.contains("!") || Password.contains("@") || Password.contains("#") ||
           Password.contains("$") || Password.contains("%") || Password.contains("^") ||
           Password.contains("&") || Password.contains("(") || Password.contains(")") ||
           Password.contains("-") || Password.contains("_") || Password.contains("+") ||
           Password.contains("=") || Password.contains(".") || Password.contains(",") ||
           Password.contains("[") || Password.contains("{") || Password.contains("]") ||
           Password.contains("}") || Password.contains("\\") || Password.contains("|") ||
           Password.contains(";") || Password.contains(":") || Password.contains("'") ||
           Password.contains("\"") || Password.contains("/") || Password.contains("?") ||
           Password.contains("<") || Password.contains(">") || Password.contains("~") )
       {
           symbols = true;
        }


       //Check with o/p
       if (upper && lower && numbers && symbols && length16)
       {System.out.println("Extremely Strong Password!");}
       else System.out.print("Weak Password... ");

       if (!length16)
       {System.out.print("Remember Minimum Length Should be 16! ");}

       if (!upper || !lower)
       {System.out.print("Uppercase And Lowercase Letters add Variation! ");}

       if (!numbers || !symbols)
       {System.out.print("Numbers and Symbols are Vital!");}

       showSystemProperties = true;

        //Resolution
        if (showSystemProperties)
        {
            System.out.println("\n\n\n");
            System.out.println("Java Version: " + System.getProperty("java.version") + " by " + System.getProperty("java.vendor"));
            System.out.println("User: " + System.getProperty("user.name"));  //<-- TURNED OFF FOR PRIVACY IN THE VIDEO
            System.out.print("Operating System: " + System.getProperty("os.name"));
            System.out.println(" " + System.getProperty("os.version"));
            System.out.println ("By: Blu");
            System.out.println ("Coded for Hack Club High Seas on November 24th 2024");

        }
    }
}
