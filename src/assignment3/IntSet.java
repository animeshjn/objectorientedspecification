package assignment3;

import java.util.Collections;
import java.util.Vector;
import java.util.concurrent.ThreadLocalRandom;

public class IntSet {
	//Overview: IntSets are mutable, unbounded sets of integers

	private Vector<Integer> elements; // the representation state
	//Abstract State: SortedSet
	
	
	public IntSet() {
		//Requires: no input
		//Modifies: this 
		//Effects:  initializes elements to empty
		super();

		elements=new Vector<Integer>();
		
	}
	public void insert (int x) {
	 //Requires: integer Input x
	 //Modifies:  this 
    //Effects: Adds x to the elements of this in sorted way
	Integer y = new Integer(x);
	
	if (getIndex(y) < 0) 
		elements.add(y);
	
	Collections.sort(elements);	
	}
	private int getIndex(Integer x) {
	 //Requires: Integer x to be found
	// Modifies: None
	// Effects: If x is in this, return index where x appears
	// else return -1
	for (int i=0; i < elements.size(); i++)
	if (x.equals(elements.get(i))) return i;
	return -1; }

	
	public void remove (int x) {
		//Requires: Integer value
		//Modifies: this
		//Effects: Remove x from this
		int i = getIndex(new Integer(x));
		if (i < 0) return;
		elements.set(i, elements.lastElement());
		elements.remove(elements.size() - 1); 
		Collections.sort(elements);
	}
	
	
		public int choose() throws EmptyException {
			 //Requires: -
			//Modifies: -
			//Effects: If this empty throw EmptyException else return arbitrary element of this
			if (elements.size() == 0) throw new EmptyException("IntSet.choose");
			return ((Integer) elements.get(ThreadLocalRandom.current().nextInt(0, elements.size())).intValue()); 
		
		}
		 
		@Override
		public String toString() {
			//Requires: -
			//Modifies: -
			//Effects: outputs the members of IntSet to String 
			return elements.toString();
		}
		
		@Override
		public boolean equals(Object ob) {
			//Requires: Object to be compared with
			//Modifies: -
			//Effects: outputs true if two IntSets are same
			return elements.equals(ob);
		}

		
public class EmptyException extends Exception {

			public EmptyException(String string) {
				//Requires: String message
				//Modifies: this
				//Effects: Initializes the exception object with given message.
				super(string);
			}
			public EmptyException() {
				//Requires: -
				//Modifies: this
				//Effects: Initializes the exception object.
				super();
			}
			/***
			 *
			 *
			 * 
			 ***/
			private static final long serialVersionUID = 1L;
		}

}
