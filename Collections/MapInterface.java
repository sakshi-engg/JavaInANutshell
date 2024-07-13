import java.util.*;  
public class MapInterface {  

    public static void hashMap(){
        Map map=new HashMap();  
        //Adding elements to map  
        map.put(1,"Amit");  
        map.put(5,"Rahul");  
        map.put(2,"Jai");  
        map.put(6,"Amit");  
        //Traversing Map  
        Set set=map.entrySet();//Converting to Set so that we can traverse  
        Iterator itr=set.iterator();   
        while(itr.hasNext()){  
            //Converting to Map.Entry so that we can get key and value separately  
            Map.Entry entry=(Map.Entry)itr.next();  
            System.out.println(entry.getKey()+" "+entry.getValue());  
        }  
    }
public static void main(String[] args) {  
   hashMap();

   //'compareTo()'
   Integer x = 2;
   Integer a =1;
   System.out.print(x.compareTo(a));
}  
}