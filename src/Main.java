public class Main {
    public static void main(String[] args) {
        //============ Hello world ============//
        System.out.println("Hello world!");

        //============ Log ============//
        System.out.println(3);
        System.out.println(358);
        System.out.println(50000);

        //============ Variables ============//
        String name = "John";
        System.out.println(name);


        //============ Data types ============//
        byte myByte = 1;                    // Stores whole numbers from -128 to 127
        short myShort = 10;                 // 	Stores whole numbers from -32,768 to 32,767
        int myNum = 5;                      // 	Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long myLong = 100;                  // 	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float myFloatNum = 5.99f;           // Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        double myDoubleNum = 10000.000222d; // Stores fractional numbers. Sufficient for storing 15 decimal digits
        char myLetter = 'D';                // Stores a single character/letter or ASCII values
        boolean myBool = true;              // Stores true or false values
        String myText = "Hello";            // String

        //============ Type Casting ============//

        // Widening Casting (automatically) - converting a smaller type to a larger type size
        // byte -> short -> char -> int -> long -> float -> double


        int myInt = 9;
        double toDouble = myInt; // Automatic casting: int to double

        // Narrowing Casting (manually) - converting a larger type to a smaller size type
        // double -> float -> long -> int -> char -> short -> byte

        double myDouble = 9.78d;
        int toInt = (int) myDouble; // Manual casting: double to int

        //============ Operators ============//

        // Arithmetic operators

        int Addition = 10 + 10;
        int Subtraction = 10 -10;
        int Multiplication = 10 * 10;
        int Division = 10 / 10;
        int Modulus = 10 % 10;
        int Increment = ++Addition;
        int Decrement = --Addition;


        // Assignment operators

        int Assignment = 5;
        Assignment += 5;
        Assignment -= 5;
        Assignment *= 5;
        Assignment /= 5;
        Assignment &= 5;
        Assignment |= 5;
        Assignment ^= 5;
        Assignment >>= 5;
        Assignment <<= 5;

        // Comparison operators

        int Comparison = 1;
        int Comparison2 = 2;

       boolean c1 = Comparison == Comparison2;
       boolean c2 = Comparison != Comparison2;
       boolean c3 = Comparison > Comparison2;
       boolean c4 = Comparison < Comparison2;
       boolean c5 = Comparison >= Comparison2;
       boolean c6 = Comparison <= Comparison2;

        // Logical operators
        int Logical = 1;
        int Logical2 = 2;
        boolean l1 = Logical == 1 && Logical2 == 2;
        boolean l2 = Logical == 1 || Logical2 == 2;
        boolean l3 = !(Logical == 1 && Logical2 == 2);


        //============ String ============//
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        String txt2 = "Hello World";

        System.out.println(txt2.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt2.toLowerCase());   // Outputs "hello world"

        String txt3 = "Please locate where 'locate' occurs!";
        System.out.println(txt3.indexOf("locate")); // Outputs 7

        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName));

        String x = "10";
        String y = "20";
        String z = x + y;  // z will be 1020 (a String)

        String x1 = "10";
        int y1 = 20;
        String z1 = x + y;  // z will be 1020 (a String)

        //============ Strings - Special Characters ============//

        String SpecialCharacters = "We are the so-called \"Vikings\" from the north.";

        //============ Math ============//

        int max1 = Math.max(5, 10);
        int min1 = Math.min(5, 10);
        double sqrt = Math.sqrt(64);
        int abs1 = Math.abs(1);
        double ran1 = Math.random();
        int ran2 = (int)(Math.random() * 101);  // 0 to 100

        //============ If/else Statements ============//

        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }


        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);


        //============ Switch Statements ============//

        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }


        //============ While Loop ============//

        int loop = 0;
        while (loop < 5) {
            System.out.println(loop);
            loop++;
        }

        int doLoop = 0;
        do {
            System.out.println(doLoop);
            doLoop++;
        }
        while (doLoop < 5);


        //============ For Loop ============//


        for (int fl = 0; fl < 5; fl++) {
            System.out.println(fl);
        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }

        //============ For Loop - Break ============//

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }


        //============ Array ============//

        String[] arrCars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(arrCars[0]);

        for (int i = 0; i < arrCars.length; i++) {
            System.out.println(arrCars[i]);
        }

        for (String i : arrCars) {
            System.out.println(i);
        }

        // break
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        // continue

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }


        //============ Multi-Dimensional Arrays ============//

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}