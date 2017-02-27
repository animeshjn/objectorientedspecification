package assignment5;
//Animesh Jain G01043755 SWE619 Assignment5 
//Problem 1: Modification to existing File, Test cases in TreeTest.java
import java.util.InputMismatchException;
import java.util.Scanner;

class Tree {

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
	public Tree(int val) {
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

	// Main method to test the implementation
	public static void main(String[] args) {
		// Requires:
		// Modifies:
		// Effects:
		try {
			Tree t = new Tree(8);
			Scanner scanner = new Scanner(System.in);
			//boolean continueLoop = true; // determines if more input is needed
			for (int i = 1; i < 9; ++i) {
				try // read
				{
					System.out.print("Please enter a random integer : ");
					int stackInt = scanner.nextInt();
					t.add(Integer.valueOf(stackInt));
				} // end try
				catch (InputMismatchException inputMismatchException) {
					// Known Input Mismatch Exception
					System.err.printf("\nException: %s\n", inputMismatchException);
					scanner.nextLine(); // discard input so user can try again
					System.out.println("You must enter integers. Please try again.\n");
				} catch (Exception unknownException) { // unknown Exception
					System.err.println("Exeption: " + unknownException.getMessage());
					System.out.println("Some problem with your input");
					scanner.nextLine(); // discard input so user can try again
				} // end catch
			}

			System.out.println("Values in order = " + t.inOrder());
			scanner.close();
		} catch (StackOverflowError e) {
			System.out.println("Tree too big, Stack over flow : " + e.getMessage());
		} catch (Exception unknown) {
			System.out.println("Unexcpected Exception encountered");
			System.out.println(" " + unknown.getMessage());
		}
	}
}
