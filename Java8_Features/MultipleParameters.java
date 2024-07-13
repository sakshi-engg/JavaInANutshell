package Java8_Features;

//Lambda Expression works on single Interface

public class MultipleParameters {
    public static void main(String[] args) {
        
        Add a = (int x, int y)  -> {System.out.println(x+y);};
        a.add(4,5);

        Sub b = (int x, int y) -> {System.out.println(x-y);};
        b.sub(2,2);
    }
}

interface Add{
    void add(int a, int b);
}

interface Sub{
    void sub(int a, int b);
}
