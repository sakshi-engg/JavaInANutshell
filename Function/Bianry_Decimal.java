public class Bianry_Decimal {

        public static void binDec(int n){
            int binaryNum = n;
            int dec = 0;
            int pow = 0;             
    while( n > 0){
        
        int lastDigit = n % 10;
        dec = dec + lastDigit * (int)Math.pow(2, pow); //logic (101 = right to left calculation(lastDigit) = 1*[pow(2,2)] + 0*[pow(2,1)] + 1*[pow(2,0)])
        pow++;
        n = n / 10;
      }
    System.out.println("Decimal Equivalent of " + binaryNum +" Binary Number is "+dec);
    }
    public static void main(String[] args) {
        binDec(101);
    }
}
