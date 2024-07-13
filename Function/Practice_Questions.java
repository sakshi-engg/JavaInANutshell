import java.util.Scanner;

public class Practice_Questions {
    public static int input(){
        System.out.println("Enter a number: ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    return a;
}

// Write a Java method to compute the averageof three numbers..
    public static int average(){
        int num1 = input();
        int num2 = input() ;
        int num3 = input();
        int avg = (num1 + num2 + num3)/3;
        return avg;
    }

    public static boolean isEven(){  
        int num = input();
        
            if(num % 2 == 0){
                return true;
            }
        
        return false;
    }

    public static boolean isPalindrome(){
        int pNum = input();
        int originalNum = pNum;
        int rev = 0;
        while(pNum > 0){
        int remainder = pNum % 10; //fetch last digit
        rev = rev * 10 + remainder;
        pNum = pNum / 10 ; //remove last digit

        }

        if (originalNum == rev){
       System.out.println("It's a palindrome number");
        } else{
            return false;
        }
    }

    public static void  sumDigit(){
        int num = input();
        int originalNum = num;
        int sum = 0;
        int lastDigit = 0;
        while( num > 0){
            lastDigit = num % 10 ;
            sum = sum + lastDigit;
            num = num / 10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        // int avg = average();
        // System.out.println("Average of 3 Numbers is "+avg);
    //   System.out.println( "Is it an Even Number: " + isEven());
    // System.out.println(sumDigit());
    // System.out.println("Sum of Digit of "+ originalNum + " is  "+sum);
    sumDigit();
    isPalindrome();
    }
}
