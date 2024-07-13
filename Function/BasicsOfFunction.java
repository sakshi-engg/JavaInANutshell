public class BasicsOfFunction{
  public static void printHello(){
    // void datatype does not take any input and doesn't return anything 
    System.out.println("Hello");
    return;
    }

    public static int printHelloInt(){
        return 67;
    }

    public static  char printHelloChar(){
        // char ch = 'a';

        return 'c' ;
    }

    public static String printHelloString(){
        return "Sakshi";
    }

    public static boolean printBool(){
        return false;
    }

    public static void datatypes(){
        int a = 2;
        char ch = 'a';
        String s = "sakshi";
        float f = 8.887888888888f;
        double d = 3.4;
        boolean bl = true;
        long ll = 222222222;
        System.out.println(a);
        System.out.println(ch);
        System.out.println(s);
        System.out.println(f);
        System.out.println(d);
        System.out.println(bl);
        System.out.println(ll);
    }

    public static void main(String[] args) {
     printHello();
     int a = printHelloInt();
     System.out.println(a);
     char data[] = {'a', 'b', 'c'};
     String str = new String(data);
     System.out.println(str);
     datatypes();
     printHelloChar();
     printHelloString();
     printBool();
    }
    
}