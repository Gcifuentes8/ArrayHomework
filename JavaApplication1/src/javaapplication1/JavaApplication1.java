/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author class
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Number of Students: ");

        int numOfStudent = keyboard.nextInt();
        double students[] = new double[numOfStudent];

        double total = 0.0;
        double secondTotal = 0.0;

        for (int i = 0; i < numOfStudent; i++) {

            System.out.println("Grade of Student: " + i + " : ");
            students[i] = keyboard.nextDouble();

            total += students[i];
            secondTotal += (Math.pow(students[i], 2));

        }
        double average = total / students.length;
        System.out.println("The average number is: " + average);

        double standardDev = Math.sqrt((secondTotal / numOfStudent) - (Math.pow(average, 2)));
        System.out.println("Standard deviation is: " + standardDev);

    }
}
