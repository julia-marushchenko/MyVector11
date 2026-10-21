/**
 *  Java program to create, read, update, and delete Vector instance.
 */

package com.mycollections;

import java.util.Vector;

/**
 *  Main class.
 */
public class Main {

    // JVM entry.
    public static void main(String[] args) {

        // Create.
        Vector<Double> myVector = new Vector<>();

        // Print the empty instance of vector.
        System.out.println(myVector); // Output: []

        // Update.
        myVector.add(2.1);
        myVector.add(4.8);
        myVector.add(9.0);
        myVector.add(3.6);
        myVector.add(2.7);
        myVector.add(7.3);
        myVector.add(8.4);

        // Print.
        System.out.println(myVector); // Output: [2.1, 4.8, 9.0, 3.6, 2.7, 7.3, 8.4]

        // Delete the last element of myVector.
        myVector.removeLast();

        // Print.
        System.out.println(myVector); // Output: [2.1, 4.8, 9.0, 3.6, 2.7, 7.3]

        // Clear.
        myVector.clear();

    }
}