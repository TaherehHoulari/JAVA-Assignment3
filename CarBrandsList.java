import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;


/**
 * Assignment3 
 * @author SeyedehTahereh Houlari 
 * @see List
 * @see Set
 * @see IntStream
 * @see Arrays
 * @see Collection
 * @see Collections
 * @see HashSet
 * @see LinkedList
 * @version 1.0
 * @since 11
 */

public class CarBrandsList {


	
	//Create a method named printList()
	public void printList() {
		return;
	}
	
	//Create a method named printReversedList()
	public void printReversedList() {
		return;
	}
	
	/**
	 * the main program of the CarBrandsList, all the code is written in one class.
	 * @param args no arguments 
	 */
	public static void main(String[] args) {
		 // rides is added to list1
		String[] rides = {"cardillac", "toyota", "suzuki", "chevrolet", "hyundai", "mercedies", "keke"};
		 // rides2 is added to list2
		String[] rides2 = {"volvo", "subaru", "volkswagen", "nissan", "cardillac", "toyota", "honda"};
		
		//use the asList method
		List<String> list1= Arrays.asList(rides);
		List<String> list2= Arrays.asList(rides2);
		
		// use the LinkedList constructor that takes a Collection argument
		LinkedList<String>linkedlist= new LinkedList<String>(list1);
		LinkedList<String>linkedlist2= new LinkedList<String>(list2);
	
		//Add the elements in list2 to list1 using the addAll method
		linkedlist.addAll(linkedlist2);
		
		//using the printList method to print out the updated content of linkedlist
		System.out.printf("List is: %n");
		for(String obj : linkedlist) {
		System.out.printf("%s ",obj);
		}

		//Using a toUpperCase() method, convert all the elements in linkedlist to upper case.
		IntStream.range(0, linkedlist.size()).forEach(x -> linkedlist.set(x, linkedlist.get(x).toUpperCase()));
		System.out.printf("%n%nThis is showing the Car Brands in uppercase letters...%n" + linkedlist);

		//Using sublist to delete car brands (in positions) 5 to 7 from the list
		linkedlist.subList(5,8).clear();
		System.out.printf("%n%nDeleting car brands 5 to 7...%n"+ "List is: %n" + linkedlist);


		
		System.out.printf("%n%nHere is the current list of car brands...%n" + "List is:%n" + linkedlist);
		
		//Using the printReversedList method to print the reverse of the Linkedlist.
		Collections.reverse(linkedlist);
		System.out.printf("%n%nReversed List:%n");
		for(String obj4 : linkedlist) {
		System.out.printf("%s ",obj4);
		}
		
		
		//sort the list in alphabetical order
		Collections.sort(linkedlist);
		System.out.printf("%n%nSorted car brands in alphabetical order...%n"+ "List is:%n" + linkedlist);


		printNonDuplicates(linkedlist);	
	}

	//use the printNonDuplicates method to eliminate all duplicated elements
	private static void printNonDuplicates(Collection<String> obj2) {
        Set<String> set = new HashSet<>(obj2);
        
		System.out.printf("%n%nRemoving duplicate car brands...%n"+"Non-duplicates are: ");
		for(String obj3 : set) {
			System.out.printf("%s ", obj3);
		}
		System.out.println("");
			
		}
		
	}
	


