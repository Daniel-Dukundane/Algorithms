/**
 * MaxValue
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