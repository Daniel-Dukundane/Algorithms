/**
 * This class includes a method to find the maximum value in an array of doubles.
 *
 * @author Daniel Dukundane
 * @version 1.0
 * File: MaxValue.java
 * Created: Feb 2025
 * Tutorial: Structy Course
 *
 * Description: This class contains a method to determine the maximum value in a given array of doubles.
 * The method initializes the maximum value to the smallest possible double value.
 * It then iterates through the array, updating the maximum value whenever a larger value is found.
 * Finally, it returns the maximum value found in the array.
 */
public class MaxValue {

    public static void main(String[] args) {
        double[] arr = {1, -2, 3, 4, 5};
        System.out.println(maxValue(arr));
    }

    public static double maxValue(double[] arr) {
        // Let me the max value be the smallest possible value
        double max = Double.NEGATIVE_INFINITY;

        // Loop through the array
        for(double value : arr) {
            // If the value is greater than the current max value, update the max value
            if(value > max) {
                max = value;
            }
        }
        return max;
    }
}