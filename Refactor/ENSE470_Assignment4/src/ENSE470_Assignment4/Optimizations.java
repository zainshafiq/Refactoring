//---------- Optimizations.java ----------

package ENSE470_Assignment4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package optimizations;

import java.util.Random;

/**
 *
 * @author luigibenedicenti
 *
 * @modified kcyow March 14th 2019
 *
 */

public class Optimizations {
/*
-----------------------------------------------------------------
static long tBeg, tEnd;
-----------------------------------------------------------------
Refactor #3 : Rename Variable
I renamed tBeg and tEnd as timeBeginning and timeEnd for a better meaning
*/

static long timeBeginning, timeEnd;
static int testSize = 1000;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    /*
    ----------------------------------------------------------------------------------------------------
        System.out.println("Optimization example program\n\n");
        StrengthReduction test1 = new StrengthReduction();
        tBeg = System.nanoTime();
        test1.recursiveSum(testSize);
        tEnd = System.nanoTime();
        System.out.println("Strength reduction\n Recursive time:" + (tEnd - tBeg));
        
        tBeg = System.nanoTime();
        test1.unreducedSum(testSize);
        tEnd = System.nanoTime();
        System.out.println(" Iterative time:" + (tEnd - tBeg));

        tBeg = System.nanoTime();
        test1.reducedSum(testSize);
        tEnd = System.nanoTime();
        System.out.println(" Direct time:" + (tEnd - tBeg));

        SubExpressionsElimination test2 = new SubExpressionsElimination();
        tBeg = System.nanoTime();
        test2.exampleNoElimination();
        tEnd = System.nanoTime();
        System.out.println("\n\nSub Expression elimination (preassigned numbers)\n Before time:" + (tEnd - tBeg));

        tBeg = System.nanoTime();
        test2.exampleElimination();
        tEnd = System.nanoTime();
        System.out.println(" After time:" + (tEnd - tBeg));

        SubExpressionsElimination2 test3 = new SubExpressionsElimination2();
        // Initialize random number generator: do it in the class or here?
        // Random rd = new Random();
        tBeg = System.nanoTime();
         test3.exampleNoElimination();
        tEnd = System.nanoTime();
        System.out.println("\n\nSub Expression elimination (random numbers)\n Before time:" + (tEnd - tBeg));

        tBeg = System.nanoTime();
        test3.exampleElimination();
        tEnd = System.nanoTime();
        System.out.println(" After time:" + (tEnd - tBeg));

        SubExpressionsElimination3 test4 = new SubExpressionsElimination3();
        tBeg = System.nanoTime();
        test4.exampleNoElimination();
        tEnd = System.nanoTime();
        System.out.println("\n\nSub Expression elimination (random numbers in constructor)\n Before time:" + (tEnd - tBeg));

        tBeg = System.nanoTime();
        test4.exampleElimination();
        tEnd = System.nanoTime();
        System.out.println(" After time:" + (tEnd - tBeg));

        CodeMotion test5 = new CodeMotion();
        // Note that the default constructor is lazy and initializes only when the class is needed in this case
        tBeg = System.nanoTime();
         test5.codeInsideLoop();
        tEnd = System.nanoTime();
        System.out.println("\n\nCode Motion\n Before time:" + (tEnd - tBeg));

        tBeg = System.nanoTime();
        test5.codeOutsideLoop();
        tEnd = System.nanoTime();
        System.out.println(" After time:" + (tEnd - tBeg));

        ArrayListvsLinkedList test6 = new ArrayListvsLinkedList();
        tBeg = System.nanoTime();
        test6.arrayListCreation();
        tEnd = System.nanoTime();
        System.out.println("\n\nArrayLists vs LinkedLists\n ArrayList Creation:" + (tEnd - tBeg));

        tBeg = System.nanoTime();
        test6.arrayListCreation();
        tEnd = System.nanoTime();
        System.out.println(" LinkedList Creation:" + (tEnd - tBeg));

        tBeg = System.nanoTime();
        test6.arrayListAccess();
        tEnd = System.nanoTime();
         System.out.println(" ArrayList Access:" + (tEnd - tBeg));

        tBeg = System.nanoTime();
        test6.arrayListAccess();
        tEnd = System.nanoTime();
        System.out.println(" LinkedList Access:" + (tEnd - tBeg));

        StringOperations test7 = new StringOperations();
        tBeg = System.nanoTime();
        test7.usingPlus();
        tEnd = System.nanoTime();
        System.out.println("\n\nString Operations\n Using + :" + (tEnd - tBeg));

        tBeg = System.nanoTime();
        test7.usingStringBuffer();
        tEnd = System.nanoTime();
        System.out.println(" Using StringBuffer :" + (tEnd - tBeg));

        System.out.println("\n\nTests complete, end of program");
        ----------------------------------------------------------------------------------------------------
        Refactor #4 : Extract Method
        Instead of declared and call all different test codes, I decided to extract the codes and separate them into different methods/functions.
        By this, I can only use the main function only to call said methods/functions.
        */
        
        System.out.println("Optimization example program\n\n");

        test1(); //Test 1

        test2(); //Test 2

        test3(); //Test 3

        test4(); //Test 4

        test5(); //Test 5

        test6(); //Test 6

        test7(); //Test 7

        System.out.println("\n\nTests complete, end of program");
    }

    //Test 1
    public static void test1() {
      StrengthReduction test1 = new StrengthReduction();
      timeBeginning = System.nanoTime();
      test1.recursiveSum(testSize);
      timeEnd = System.nanoTime();
      System.out.println("Strength reduction\n Recursive time:" + (timeEnd - timeBeginning));

      timeBeginning = System.nanoTime();
      test1.unreducedSum(testSize);
      timeEnd = System.nanoTime();
      System.out.println(" Iterative time:" + (timeEnd - timeBeginning));

      timeBeginning = System.nanoTime();
      test1.reducedSum(testSize);
      timeEnd = System.nanoTime();
      System.out.println(" Direct time:" + (timeEnd - timeBeginning));
    }

    //Test 2
    public static void test2() {
      SubExpressionsElimination test2 = new SubExpressionsElimination();
      timeBeginning = System.nanoTime();
      test2.exampleNoElimination();
      timeEnd = System.nanoTime();
       System.out.println("\n\nSub Expression elimination (preassigned numbers)\n Before time:" + (timeEnd - timeBeginning));

      timeBeginning = System.nanoTime();
      test2.exampleElimination();
      timeEnd = System.nanoTime();
      System.out.println(" After time:" + (timeEnd - timeBeginning));
    }

    //Test 3
    public static void test3() {
      SubExpressionsElimination2 test3 = new SubExpressionsElimination2();
      // Initialize random number generator: do it in the class or here?
      // Random rd = new Random();
      timeBeginning = System.nanoTime();
      test3.exampleNoElimination();
      timeEnd = System.nanoTime();
      System.out.println("\n\nSub Expression elimination (random numbers)\n Before time:" + (timeEnd - timeBeginning));

      timeBeginning = System.nanoTime();
      test3.exampleElimination();
      timeEnd = System.nanoTime();
      System.out.println(" After time:" + (timeEnd - timeBeginning));
    }
    
    //Test 4
    public static void test4() {
      SubExpressionsElimination3 test4 = new SubExpressionsElimination3();
      timeBeginning = System.nanoTime();
      test4.exampleNoElimination();
      timeEnd = System.nanoTime();
      System.out.println("\n\nSub Expression elimination (random numbers in constructor)\n Before time:" + (timeEnd - timeBeginning));

      timeBeginning = System.nanoTime();
      test4.exampleElimination();
      timeEnd = System.nanoTime();
      System.out.println(" After time:" + (timeEnd - timeBeginning));
    }

    //Test 5
    public static void test5() {
      CodeMotion test5 = new CodeMotion();
      // Note that the default constructor is lazy and initializes only when the class is needed in this case
      timeBeginning = System.nanoTime();
      test5.codeInsideLoop();
      timeEnd = System.nanoTime();
      System.out.println("\n\nCode Motion\n Before time:" + (timeEnd - timeBeginning));

  

        


