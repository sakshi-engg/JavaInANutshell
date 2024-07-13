public class Prime_Number {

//The prime numbers from 1 to 100 are: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.
// Why is 1 not a prime number? 1 is not a prime number because it has only one factor, namely 1. 

//check if a given number is prime or not 

    public static boolean isPrime (int n){
        boolean isPrime = true;
        for(int i = 2; i<= n-1 ; i++){
            if(n % i == 0){
                isPrime = false; //not a prime number ex: 4%2
                return isPrime;
                // return false;
            }
        }   
        isPrime = true;  //out of for loop Not divisible by any number except 1 & itself ie. 'n'
        return isPrime; 
        // return true;
    }

    public static boolean isPrimeOptimized (int n){
       boolean isPrime = true;
        for(int  i = 2; i <= Math.sqrt(n); i++){ //Skip the repeated factors 
                                                 //Example: 6 -> 1*6 , 2*3, 3*2, 6*1
            if(n % i == 0){                       //  2 to 5
                isPrime = false;
             return isPrime;
            }
        }
        return true;
    }

    public static void printPrime(int n){
        for(int i = 2; i<=n; i++){
           if( isPrimeOptimized(i))
           {
            System.out.print(" "+ i);
        }
    }
}
    public static void main(String[] args) {
        // Prime_Number obj = new Prime_Number();
        // boolean result = isPrime(16);
        // isPrimeOptimized(28);
        printPrime(30);
        System.out.println();
    }
}
