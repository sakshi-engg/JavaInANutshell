package Exception_Handling;
public class ExceptionHandlingBasics {

    // try-catch 
    public static int arithmeticException(int a, int b) {
        try {
            int c = a / b;
            return c;
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
            return -1; // Or handle the exception scenario as needed
        }
    }

    //throw keyword - forciably throw an exception. On purpose throw an exception 
    public static void throwKeyword() {
        int i =10, j=20, k=0;
       
        try{
        k = i*j;
        if(k>200){
            System.out.println("Forciably executing an exception");

            throw new ArithmeticException();
        }
         System.out.println(new ArithmeticException());
         
        } catch(ArithmeticException e){
            System.out.println(e.getMessage());
     } finally{
        System.out.println("Finally Block Comes along with catch-block");
     }
}

//Single try - Multiple catch blocks

public static void mulCatchBlock(){
    int i =10, j=0, k=0;
       
        try{
        k = i/j;
        if(k<200){
            System.out.println("Forciably executing an exception");

            throw new ArithmeticException("Generating Exception");
        }
         System.out.println("........."+new ArithmeticException());
       
         // try - block isn't executed , When exception is raised the normal flow is halted & catch block is executed to maintain the continuity

        } catch(ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Arithmetic Exception");
        } catch(ArrayStoreException e){
            System.out.println(e.getMessage());
            System.out.println("Array Store Exception");
        } catch(Exception e){
            System.out.println(e.getMessage());
        System.out.println("Base Class Exception is executed");
     }
}


//Handling Exception using if-else block

public static void case1(int x, int y){
    if(y!=0){
        System.out.println("Division using if-else block: "+(x/y));
    } else{
        System.out.println("Y can't be zero");
    }
}

//Handling Exception using try-catch block

public static void case2(int x, int y){
    try{
        System.out.println("Division in Try: "+(x/y)); //EXECUTED & printed - java.lang.ArithmeticException: / by zero
    } catch(ArithmeticException e){
        System.out.println(e.toString());
        System.out.println("Arithmetic Exception is Raised!"); //EXECUTED & PRINTED
    }
}


    public static void main(String[] args) {
        // System.out.println(arithmeticException(3, 0));
        // throwKeyword();
        // mulCatchBlock();
        case1(2,0);
        case2(2,0);
    }
}
