package assignment5;

import java.util.Iterator;

//Animesh Jain G01043755 SWE619 Assignment5 
//Problem 2: Implementing the given tree using Iterator

public class TreeIterator implements Iterable<TreeIterator> {
	
	/*
	 * Overview: Tree class containing left subtree, right subtree and root of
	 * the tree. Type also provides the implementation of in-order traversal
	 * result of the tree.
	 */

	// Instance Variables
	public final int mVal; // Root
	public Tree mLeft; // Left Subtree
	public Tree mRight; // Right Subtree

	// Constructor/Initializer
	public TreeIterator(int val) {
		// Requires:Root of the tree.
		// Modifies:this.
		// Effects: adds the given value as root of this, initializes this.
		mVal = val;
	}

	// Behavior/Methods
	public void add(int val) {
		// Requires: value to be added to this tree.
		// Modifies: this.
		// Effects: Adds the given value to left or right of this tree.
		
		if (val < mVal) {
			if (mLeft == null)
				mLeft = new Tree(val);
			else
				mLeft.add(val);
		} else if (val > mVal) {
			if (mRight == null)
				mRight = new Tree(val);
			else
				mRight.add(val);
		}
	}

	public String inOrder() {
		// Requires:	-
		// Modifies:	-
		// Effects: returns the in-order traversal version of this tree. 
		return ((mLeft == null) ? "" : mLeft.inOrder()) + mVal + " " + ((mRight == null) ? "" : mRight.inOrder());
	}

	@Override
	public String toString() {
		// Requires:	-
		// Modifies:	-
		// Effects: Returns the string representation of this tree (in order traversal).

		return this.inOrder();
	}

	@Override
	public boolean equals(Object ob) {
		// Requires: Object cast-able to type Tree.
		// Modifies: -
		// Effects:	Returns true if the string reperesentation of given tree is same as This.

		Tree comparative = (Tree) ob;
		if (comparative.toString() == this.toString())
			return true;
		else
			return false;
	}

	@Override
	public Iterator<TreeIterator> iterator() {
		// TODO Auto-generated method stub
		return null;// object of iterable inner class
		
		//inner class having iterator implementation , having next , hasNext and constructor
		//implement the inorder using the same.
	}

	
	

}
