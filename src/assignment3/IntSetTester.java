package assignment3;


import java.util.SortedSet;
import java.util.TreeSet;

import assignment3.IntSet.EmptyException;

public class IntSetTester{

	SortedSet<Integer> ints;

	
public static void main(String args[]){
	System.out.println("Tester method started.. ");
	//CREATE OBJECT TO BEGIN TESTING
	IntSet object=new IntSet();
	System.out.println("Created empty IntSet");
	//CHECK VALUES
	System.out.println("TEST 1");
	System.out.println("Elements initial="+object.toString()); //Test 1: Object should be initially empty
	try{
		System.out.println("TEST 2");
		//Test2: Calling Choose method in empty IntSet
		System.out.println("Choose Method Called :"+object.choose() );
	}catch (EmptyException e) {
		// TODO: handle exception
		//Test2: Calling Choose method in empty IntSet
		System.err.println("Exception: Empty set cannot choose values: "+e.getMessage());
	}
	//Should not return null
	System.out.println("TEST 3");
	System.out.println("Insert: 2");
	//INSERT MORE VALUES
	object.insert(2);
	System.out.println("Insert: 1");
	object.insert(1);
	System.out.println("Insert: 20");
	object.insert(20);
	System.out.println("Elements:"+object.toString());
	//Test3 : Should return elements in sorted order even if insertion is done in random order 
	System.out.println("Insert: 15,3,8");
	object.insert(15);
	object.insert(3);
	object.insert(8);
	//CHECK VALUES
	System.out.println("Insertion complete");
	System.out.println("TEST 4: "+"Should return elements in sorted order even if insertion is done in random order");
	//Test4 : Should return elements in sorted order even if insertion is done in random order
	System.out.println(object.toString());
	
	try { //Test5 : Choose method called on non empty set
		System.out.println("Choose method called on non empty set arbitrary chosen element:"+object.choose());
	} catch (EmptyException e) {
		
		e.printStackTrace();
	}
	System.out.println("Test for removal / sorted");
	
	
	System.out.println("Remove 3");
	//REMOVE VALUES
	object.remove(3);// Test 6: Removal should be done properly 
	System.out.println("Final elements");
	System.out.println(object.toString()); //Test 7 : FInal elements should be sorted
	
}
}
