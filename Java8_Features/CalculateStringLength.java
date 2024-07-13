package Java8_Features;

public class CalculateStringLength {
    public static void main(String[] args) {
        Function f = str -> str.length();
        System.out.println(f.apply("sakshi"));
    }
}

 interface Function{
    public int apply(String str);
}

// class MyFun implements Function{
//     public int apply(String str){
//         return str.length();
//     }
// }

