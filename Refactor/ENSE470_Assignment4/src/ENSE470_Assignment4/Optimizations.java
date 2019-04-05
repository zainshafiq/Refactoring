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
