package ENSE470_Assignment4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package optimizations;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author luigibenedicenti
 *
 * @modified kcyow March 14th 2019
 *
*/

public class ArrayListvsLinkedList {

    private ArrayList<Integer> al = new ArrayList<Integer>();
    private LinkedList<Integer> ll = new LinkedList<Integer>();
    private static final int N = 100000; // 1000000

    public void arrayListCreation() {
        for (int i = 1; i <= N; i++) {
            al.add(0, new Integer(i));
        }
    }

    public void linkedListCreation() {
        for (int i = 1; i <= N; i++) {
            ll.add(0, new Integer(i));
        }
    }

    /*
    -------------------------------------------------------------------
    public void arrayListAccess() {
        Object o;
        for (int i = 0; i < N; i++) {
            o = al.get(i);
        }
    }

    public void linkedListAccess() {
        Object o;
        for (int i = 0; i < N; i++) {
            o = ll.get(i);
        }
    }
    ----------------------------------------------------------------------

    Refactor #1 ; Code Smells (Duplicated Code/Object),
    Object 'o' can be extract from both method and declared as a single object that can be used for
    both different classes (arrayListAccess() , linkedlistAccess())
    */

    //Declaring Object

    Object o;

    public void arrayListAccess() {
        for (int i = 0; i < N; i++) {
            o = al.get(i);
        }
    }

    public void linkedListAccess() {
        for (int i = 0; i < N; i++) {
            o = ll.get(i);
        }
    }
}

