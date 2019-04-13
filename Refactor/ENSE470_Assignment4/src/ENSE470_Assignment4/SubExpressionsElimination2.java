
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


public class SubExpressionsElimination2 {
/*
-----------------------------------------------------------------------------
    public void exampleNoElimination() {
        Random gen = new Random();
        double d = gen.nextDouble();
        double lim = gen.nextDouble();
        double max = gen.nextDouble();
        double sx = gen.nextDouble();
        double sy = gen.nextDouble();
        double x = d * (lim / max) * sx;
        double y = d * (lim / max) * sy;
    }

    public void exampleElimination() {
        Random gen = new Random();
        double d = gen.nextDouble();
        double lim = gen.nextDouble();
        double max = gen.nextDouble();
        double sx = gen.nextDouble();
        double sy = gen.nextDouble();
        double se = d * (lim / max);
        double x = se * sx;
        double y = se * sy;
    }
-----------------------------------------------------------------------------
Refactor #6 : Encapsulate Variable
Several different variables being declared without being encapsulate properly, so I redeclared the variable so
that only this class and its methods can use the variables.
*/

    Random gen;
    private double d, lim, max, sx, sy;
    private double se;
    private double x;
    private double y;


    public void exampleNoElimination() {
      gen = new Random();
      d = gen.nextDouble();
      lim = gen.nextDouble();
      max = gen.nextDouble();
      sx = gen.nextDouble();
      sy = gen.nextDouble();
      x = d * (lim / max) * sx;
      y = d * (lim / max) * sy;
    }

    public void exampleElimination() {
      gen = new Random();
      d = gen.nextDouble();
      lim = gen.nextDouble();
      max = gen.nextDouble();
      sx = gen.nextDouble();
      sy = gen.nextDouble();
      se = d * (lim / max);
      x = se * sx;
      y = se * sy;
    }
}
