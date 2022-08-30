public class Homework {
    public static void main(String[] args) {

        // SYNTAX/GETTING STARTED
        System.out.println("Hello World!");
        System.out.println("I'm learning Java");
        System.out.println("It is awesome");



// OUTPUTS
        System.out.println(3 + 3);

        System.out.print("Hello World!");
        System.out.print("I will print on the same line");

        System.out.println("/n");


//COMMENTS
        //this is a comment
        /* beginning of multiple line comment
        end of multiple line comment */

//VARIABLES
        String name = "Karem";
        System.out.println("Hello " + name);

        int myNum = 22;
        System.out.println(myNum);

        //Assign variable later
        int myNum2;
        myNum2 = 15;
        System.out.println(myNum2);

        //changing value of my numb

        int myNum3 = 33;
        myNum3 = 35;
        System.out.println(myNum3);

        //final int myNum4 = 33;
        //myNum4 = 38;
        //System.out.println(myNum4);
        //The result would be 33. By using "final", it is unchangable

        int Num = 22;
        float myFloatNum = 33.5f;
        char myLetter = 'F';
        boolean myBool = false;
        String myText = "Karem";


//PRINT VARIABLES
        String firstName = "Karem";
        String lastName =  "Abdulkarem";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        int x = 5;
        int y = 10;
        System.out.println(x + y);


//DECLARING MANY VARIABLES
        //method 1
        int a = 10;
        int b = 40;
        int c = 50;
        System.out.println(a + b + c);

        //method 2
        int d = 2, e = 3, f = 5;
        System.out.println(d + e + f);

        //You can also assign 1 number to multiple values
        int g, h, i;
        g = h = i = 50;
        System.out.println(g + h + i);


//Identifiers
        //good
        int minsPerHour = 60;
        //bad
        int m = 60;


//Data Types
        // Integer (whole number)
        int Numb = 20;
        // Floating point number
        float FloatNum = 10.99f;
        // Character
        char Letter = 'K';
        // Boolean
        boolean Bool = true;
        // String
        String Text = "Hello World";


//NUMBERS
        int number = 10000;
        float floatNum = 10.32f;
        double doubleNum = 10.32d;


//BOOLEAN
        boolean iPlaySoccer = true;
        boolean imSevenFoot = false;
        System.out.println(iPlaySoccer);
        System.out.println(imSevenFoot);



//Characters
        char firstLetterofName = 'K';
        char myGrade = 'A';


    }
}
