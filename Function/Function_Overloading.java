public class Function_Overloading {
    //Function Overloading means same name but different number of parameters 
    //Function Overloading with parameters 

        public static int sum(int a, int b ){
            return a+b;
        }

        public static int sum(int a, int b , int c){
            // return a+b;
             return a+b+c;
        }

        //Function overloading with same name but different datatypes 
        public static float sum(int a, float b ){
            float resullt = (float)(a+b);
            return resullt;
        }

        public static float sum(double a, double b ){
            float resullt = (float)(a+b);
            return resullt;
        }


    public static void main(String[] args) {
        Function_Overloading obj = new Function_Overloading();
      int a =  sum(4,5);
       int b = sum(5,6,8);
       float c = sum(5, 5.88f);
       double d = sum(5.777777, 5.88f);
       System.out.println(a+" "+b+" "+c+" "+d);
    }    
}
