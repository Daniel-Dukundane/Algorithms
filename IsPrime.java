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
            // If the number is less than 2, it is not prime
               if(number < 2){
                return false;
              }

            // Loop through the numbers from 2 to number-1
            // If the number is divisible by any of these numbers, it is not prime
            for (int i = 2; i <= number-1 ; i++){
           
              if(number % i == 0){
                return false;
              }
            }
            
            // If the number is not divisible by any of the numbers, it is prime
            return true;
          }
}
