package Java8_Features;

import java.util.TreeSet;

public class Test1 {
    public static void main(String args[]){
        TreeSet<StringBuffer> ts = new TreeSet<StringBuffer>
            ((s1, s2) -> s1.length() - s2.length());
        StringBuffer sb1 = new StringBuffer("AAA");
        StringBuffer sb2 = new StringBuffer("BBBBB");
        StringBuffer sb3 = new StringBuffer("C");
        StringBuffer sb4 = new StringBuffer("DDDD");
        StringBuffer sb5 = new StringBuffer("EE");
        ts.add(sb1);
        ts.add(sb2);
        ts.add(sb3);
        ts.add(sb4);
        ts.add(sb5);
        System.out.println(ts);
    }
}
