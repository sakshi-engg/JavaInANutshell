import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
    public static void setInterface(){
        // Set <Integer> s = new HashSet<>();
        //Set <Integer> s = new TreeSet<>();
    Set <Integer> s = new LinkedHashSet<>();
        for(int i=30; i>0; i--){
            s.add(i);
        }

        for(int i: s){
            System.out.println(i);
        }
    }

    public static void treeSet(){
        Set <String> n = new TreeSet<>();

        n.add("Vijay");
        n.add("Sanjay");
        n.add("manjay");
        n.add("tajay");

        // System.out.print(n);

        for(String s : n){
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        // setInterface();
        treeSet();
    }
}

