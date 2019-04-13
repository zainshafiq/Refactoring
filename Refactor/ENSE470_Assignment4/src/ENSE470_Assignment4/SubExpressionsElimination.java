//---------- SubExpressionsElimination.java ----------

package ENSE470_Assignment4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package optimizations;

/**
 *
 * @author luigibenedicenti
 *
 * @modified kcyow March 14th 2019
 *
 */

public class SubExpressionsElimination {

/*
----------------------------------------------------------------------
    public void exampleNoElimination() {
        double d = 1.112;
        double lim = 2.234;
        double max = 3.3342;
        double sx = 4.4554;
        double sy = 3.224;
        double x = d * (lim / max) * sx;
        double y = d * (lim / max) * sy;
    }

    public void exampleElimination() {
        double d = 1.112;
        double lim = 2.234;
        double max = 3.3342;
        double sx = 4.4554;
        double sy = 3.224;
        double se = d * (lim / max);
        double x = se * sx;
        double y = se * sy;
    }
---------------------------------------------------------------------
Refactor #5 : Extract Variable
Since both method/functions using some similar variables, I extracted them and declared the data outside the function
but inside the class for a better encapsulation.
*/

    private double d = 1.112;
    private double lim = 2.234;
    private double max = 3.3342;
    private double sx = 4.4554;
    private double sy = 3.224;
    private double se;
    private double x;
    private double y;

    public void exampleNoElimination() {
      x = d * (lim / max) * sx;
      y = d * (lim / max) * sy;
    }

    public void exampleElimination() {
      se = d * (lim / max);
      x = se * sx;
      y = se * sy;
    }
}

