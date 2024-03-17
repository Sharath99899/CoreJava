package collections;
import java.util.Vector;
public class ClassVector 
{
 public static void main(String[] args) 
 {
 
	    Vector<String> vec = new Vector<String>();
        vec.add("Tiger");  
        vec.add("Lion");  
        vec.add("Dog");  
        vec.add("Elephant");
        vec.add("Fox");
        
        
        System.out.println(vec);
        System.out.println(vec.firstElement());
        System.out.println(vec.get(3));
        System.out.println(vec.elementAt(2));	
        System.out.println(vec.size());	
        System.out.println(vec.capacity());
        System.out.println(vec.iterator());		
        System.out.println(vec.subList(1, 4));	
        System.out.println(vec.clone());
        System.out.println(vec.toArray());	
 }
}
