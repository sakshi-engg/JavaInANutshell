package Java8_Features;

public class LambdaExpressionsBasics {
    public static void main(String[] args) {
    //     My person = new My(){
    //     public void myInterMethod(){
    //         System.out.println("Mozo");
    //     }
    // };
    My person = () -> {  System.out.println("Function Defination/ Single Abstract Implemented Method of Interface"); };
    person.myInterMethod();
    }
}

interface My{
    void myInterMethod();
}

