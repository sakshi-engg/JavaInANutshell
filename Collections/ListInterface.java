import java.util.*;
class ListInterface{  
    public static void arrayListBasics(){

    //ArrayList 1 
    List <Integer> li = new ArrayList<Integer>();
    li.add(9);
    li.add(8);
    li.add(80);
        System.out.println(li);

    li.add(65);
    System.out.println(li);
       
    //ArrayList 2
   List <Integer> newLi = new ArrayList<Integer>();
    newLi.add(87);
    newLi.add(34);
        System.out.println(newLi);

        Iterator itr=li.iterator();  
            while(itr.hasNext()){  
            System.out.println(itr.next());  
        }  

        //Size of an Arraylist - n+n/2+1
        System.out.println(li.size());
    }
           

    //Simple way to add Elements
    // List<String> l =  Arrays.asList("Adding Elements using java 8 features", "Element 1", "2");
    // l.forEach(System.out::print);

    

    public static void stackDemo(){
        Stack <String> st = new Stack<>();
        st.push("Giraffe");
        st.pop();
        st.push("Gorilla");
        st.push("Giraffe");
        st.push("Zebra");
        System.out.println(st.peek());
        st.pop();
        System.out.println(st);
    }

public static void countries(){
    LinkedList <String> ctry = new LinkedList<>();
    ctry.add("India");
    ctry.add("USA");
    ctry.add("Poland");
    ctry.add("Russia");
    ctry.add("Ukraine");
    System.out.println(ctry);

    // Collections.sort(ctry);
    
    System.out.println("Sorting the LinkedList Alphabaetically: ");
    System.out.println();

    ctry.remove(ctry);
    System.out.println(ctry);
    
    printList(ctry);
}

public static void printList(List<String> ctry){
   
    for(String element: ctry){
        // int i = element.length();
        // System.out.println(i);
        System.out.println("Elements in linkedlist at position:" +element);
    }

    System.out.println("Iterating through Iterator: ");
    Iterator itr=ctry.iterator();  
    while(itr.hasNext()){  
    System.out.println(itr.next());  
   }  
 }

public static void main(String args[]){  
//  arrayListBasics();
//  stackDemo();
 countries();
  }  
}  