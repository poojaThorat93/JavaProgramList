package CollectionTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class ListTest {
	public static void main(String [] args)
	{/*
		//******************** Array List ***************** 
		ArrayList<String> name = new ArrayList <String>();
		name.add("pooja");
		name.add("sahil");
		name.add("namasvi");
		name.remove(2);
		
		System.out.println(name.contains("pooja"));// return True 
		//name.clear();// clear data
		//System.out.println(name.isEmpty());// return True -  as we clear all data 
		
		
		//**** using Iterator ****
		Iterator itr = name.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		
		//**** using ForLoop ****
		for(int i =0; i<=name.size()-1; i++)
		{
			System.out.println(name.get(i));	
		}
		
		//**** using For Each Loop ****
		for(String s : name) {
			System.out.println(s);
		}*/
		
		
		//****************************** LinkedList *******************************
		
		LinkedList <String> City =  new LinkedList <String>();
		City.add("Pune");
		City.add("Delhi");
		// we can use Iteretor , Forloop ,For each loop.
		//**** using For Each Loop ****
		for(String c : City) {
			System.out.println(c);
		}
	}
	
	
	
	
	
	

}
