import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TentaArrayList {
	
	public static void main(String[] args) {
        
        ArrayList<Integer> List = new ArrayList<Integer>();
        
        List.add(0);
        List.add(50);
        List.add(100);
        List.add(150);

                
        System.out.println( "The largest value is: " + Collections.max(List) );
        
        Last(args);
        Alphabet();
        Text(args);

       }
	
	public static void Last(String[] args) {
		ArrayList<String> Last = new ArrayList<String>();
		Last.add("Sushi");
		Last.add("Tacos");
		Last.add("Steak");
		
		for (String x : Last) {
			System.out.println("The last letter of the word is:" + x.charAt(x.length()-1));
			
		}
	}
	

	public static void Alphabet() {
    	
    	ArrayList<String> Words = new ArrayList<String>();
    	Words.add("Duck");
    	Words.add("Elephant");
    	Words.add("Wolf");
    	Words.add("Giraffe");
    	Words.add("Bunny");
    	
    	Collections.sort(Words);
    	for(int i=0; i<Words.size(); i++)
    	    System.out.println(Words.get(i));
    }
    
    		
    public static void Text(String[] args) {
    	
    	ArrayList<String> list = new ArrayList<String>();
         list.add("Pineapple");
         list.add("Apple");
         list.add("Banana");
         list.add("Grapefruit");

         System.out.println("ArrayList contains the string: " 
         +list.contains("Pineapple"));


}
     

    }   
 