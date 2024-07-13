public class Decimal_to_Binary {
    //convert the decimal to binary -> (7)₁₀ ~ (111)₂  

    public void decNum(int bNum){
        int num = bNum;
        int power = 0;
        int resultBinary = 0;
        while(bNum > 0){
           int rem = bNum % 2; //remainder
          resultBinary =  resultBinary + (int)(rem * Math.pow(10,power));
            power++;
            bNum = bNum/2; //Quotient
        }
        System.out.println("Binary equivalent of "+num+" Decimal number is "+resultBinary);
    }
    public static void main(String[] args) {
        Decimal_to_Binary obj = new Decimal_to_Binary();
       obj . decNum(4);
    }
}
