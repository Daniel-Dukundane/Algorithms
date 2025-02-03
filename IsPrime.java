/**
 * This class includes a method to check if a number is prime.
 *
 * @author Daniel Dukundane
 * @version 1.0
 * File: IsPrime.java
 * Created: Feb 2025
 * Tutorial: Structy Course
 *
 * Description: This class includes a method to determine if a given number is a prime number.
 * The method checks if the number is less than or equal to 1, returning false in that case.
 * For numbers greater than 1, it checks divisibility from 2 up to the square root of the number.
 * If any divisor is found, the number is not prime; otherwise, it is prime.
 */

import java.lang.Math;
public class IsPrime {
    
        public static void main(String[] args) {
            System.out.println(isPrime(1));
            System.out.println(isPrime(2));
            System.out.println(isPrime(7));
            System.out.println(isPrime(8));
            System.out.println(isPrime(9));
            System.out.println(isPrime(10));
        }
    
        public static boolean isPrime(int number) {
            if (number <= 1) {
              return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
              if (number % i == 0) {
                return false;
              }
            }
            return true;
          }
}
