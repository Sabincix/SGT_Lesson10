import java.util.Scanner;

public class Lesson10 {
    public static void main(String[] args) {

        // Application that counts how many coffees we drink over the week

        int[] coffeeArray = new int[7];

        coffeeArray[0] = 3;
        coffeeArray[1] = 4;
        coffeeArray[2] = 12;
        coffeeArray[3] = 2;
        coffeeArray[4] = 1;
        coffeeArray[5] = 0;
        coffeeArray[6] = 1;

        //this is how humans are calculating
//        int totalCoffees = coffeeArray[0] + coffeeArray[1] + ....

        int coffeeCounter = 0;

        //Loops will help us iterate over all elements in an Array

        for (int i = 0; i < coffeeArray.length; i++) {
            coffeeCounter += coffeeArray[i];
        }
        System.out.println("Total number of coffees during the week" +coffeeCounter );

        //2D Arrays
        // {{1},{2},{3}}; 1,2, 3 are rows

        int[][] my2DArray = {{1,2,4,7},{11,12,13,14},{22,23,24,5}};
        System.out.println("This is an element of row index=2 and column index = 3: " + my2DArray[2][3]);



        int[][] taskArray = { {125, 91, 90},
                            {55,  5, 211},
                            {77, 19, 21}};


        //Group task

        System.out.println("");
        System.out.println("This is an element of row index =0 and column =0: " + taskArray [0][0]);
        System.out.println("This is an element of row index =0 and column =1: " + taskArray [0][1]);
        System.out.println("This is an element of row index =0 and column =2: " + taskArray [0][2]);

        System.out.println("This is an element of row index =1 and column =0: " + taskArray [1][0]);
        System.out.println("This is an element of row index =1 and column =1: " + taskArray [1][1]);
        System.out.println("This is an element of row index =1 and column =2: " + taskArray [1][2]);

        System.out.println("This is an element of row index =2 and column =0: " + taskArray [2][0]);
        System.out.println("This is an element of row index =2 and column =1: " + taskArray [2][1]);
        System.out.println("This is an element of row index =2 and column =2: " + taskArray [2][2]);



        int[][] myAnotherArray1 =  { {1,2,4,7},
                                {11,12,13,14},
                                {22,23,24,5}};

        System.out.println("This is an element of row index=2 and column index = 3: " + myAnotherArray1[2][3]);

        // loop inside of a loop. First is row 0 i=0, then starts a second loop,
        // column values = 1,2,4,7 until j < 4

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Indexes: i - " + i + "; j - " + j + "; value " + myAnotherArray1[i][j]);

            }
        }

        //For each loop

        int[] forLoopArray = {5, 6, 7, 1, 1};

        for ( int internalValue : forLoopArray ) {
            System.out.println("For loop element: " + internalValue);
        }
        System.out.println();


        // For Each loop using 2D Array + nested loops
        int[][] complex2DArray = {{5, 6,}, {7, 8}};

        for ( int [] singleRow: complex2DArray) {
            for ( int singleElement : singleRow ) {
                System.out.println(" Just a single element" + singleElement );
            }
        }
        System.out.println();

        //While loop example

        int clockTime = 0;
        while ( clockTime <= 24 ){
            System.out.println("The time is " + clockTime + " o'clock");
            clockTime++;
        }
        System.out.println(); //tukša rinda


        // Pievieno pa 3 h

        clockTime = 0;
        while ( clockTime <= 24 ){
            System.out.println("The time is " + clockTime + " o'clock");
            clockTime += 3;
        }
        System.out.println();


        //Complex example
        boolean runWhileLoop = true;

        while ( runWhileLoop) {
            System.out.println(" variable runWhileLoop is still set to true. Therefore i am running");

            if(clockTime > 100 ) {
                runWhileLoop = false;
            }
            clockTime++;
        }


        //Menu example using while loop
        int menuItem = 99;

        Scanner scanner = new Scanner(System.in);

        while ( menuItem != 0){

            System.out.println("Please select an action you want to do");
            System.out.println("1 - write that you are smart");
            System.out.println("2 - write thet you are pretty");
            System.out.println("3 - write that you are the best!");
            System.out.println("0 - exit the application");

            menuItem = scanner.nextInt();

            if ( menuItem == 1) {
                System.out.println(" You are smart!");
            } else if ( menuItem == 2) {
                System.out.println(" You are pretty!");
            } else if ( menuItem == 3){
                System.out.println("You are the best!");
            }else {
                System.out.println("There is no such option!");
            }
        }


        // WHILE LOOP - this will not run!
        int initialValue = 10;
        while ( initialValue <5 ) {
            System.out.println("While loop, initial value <5");
        }
        //DO WHILE LOOP - will execute at least once!
        do {
            System.out.println("Do while loop. Initial value < 5");
        } while ( initialValue < 5);

        int[][] complexArray = {{5,6}, {7,8}};
        int[] justARow = complexArray[1];


    }
}
