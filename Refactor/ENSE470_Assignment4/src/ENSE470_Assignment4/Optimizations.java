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
     */dddd
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


