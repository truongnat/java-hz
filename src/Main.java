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


    }
}