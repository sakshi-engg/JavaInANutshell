package Java8_Features;

/**
 * Example1
 */
/**
 * InnerExample1
 */
public class Example1 {

    public static void main(String[] args) {
     SingleParameter p = name -> "hello"+name;
	System.out.println(p.singleArgument("Ahan"));

    My person = () -> {  System.out.println("Function Defination/ Single Abstract Implemented Method of Interface"); };
    person.myInterMethod();
    }
}
 interface SingleParameter {
	public String singleArgument(String name);
 }

 /**
  * InnerExample1
  */
  interface My{
    void myInterMethod();
}



