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
public class StringOperations {

    static final int N = 10000;

    /*
    -----------------------------------------------------------------------

    public void usingPlus() {
        String s1 = "";
        for (int i = 1; i <= N; i++) {
            s1 = s1 + "*";
        }
    }

    public void usingStringBuffer() {
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= N; i++) {
            sb.append("*");
        }
        String s2 = sb.toString();
    }
    ----------------------------------------------------------------------

    Refactor #2 ; Extract Variable
    String s1 and s2 being extracted and declared outside of both method
    (usingPlus() , usingStringBuffer()) for so that we can use the data variable reusability
     */

    private String s1;
    private String s2;
 
    public void usingPlus() {
        for (int i = 1; i <= N; i++) {
            s1 = s1 + "*";
        }
    }

    public void usingStringBuffer() {
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= N; i++) {
            sb.append("*");
        }
        s2 = sb.toString();
    }
}
