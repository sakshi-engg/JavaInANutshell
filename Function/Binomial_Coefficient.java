public class Binomial_Coefficient {

    public static int factorial(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact = fact * i; 
        }        
        return fact;
    }

     public static int binFactorial(int n, int r){
        int nfact = factorial(n); //n!
        int rfact = factorial(r);  //r!
        int nmr_fact = factorial(n-r);  //(n-r)!
       int result= nfact/(rfact*nmr_fact);
         return result;
    }

    public static void main(String[] args) {
       Binomial_Coefficient obj = new Binomial_Coefficient();
       int result = binFactorial(5, 2);
       System.err.println("Binomial Coefficient " +result);

    }
}
