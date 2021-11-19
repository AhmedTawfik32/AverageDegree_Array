/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avgdegreearray;

import java.util.Scanner;

/**
 *
 * @author AhmedTawfik
 */
public class AvgDegreeArray {

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Please enter the number of degrees: ");
        int degreesNumber = input.nextInt();

        double[] degrees = fillArray(degreesNumber);

        System.out.println("The average degree is: " + avgDegree(degrees));

    }

    public static double[] fillArray(int rowSize) {
        double[] degrees = new double[rowSize];

        for (int i = 0; i < degrees.length; i++) {
            System.out.println("Please enter the degree of item " + (i + 1 + ": "));
            degrees[i] = input.nextDouble();
        }
        return degrees;
    }

    public static double avgDegree(double[] degrees) {

        double sum = 0;

        for (int i = 0; i < degrees.length; i++) {
            sum += degrees[i];
        }

        return sum / degrees.length;
    }
}
