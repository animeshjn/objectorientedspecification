package assignment4;
/*ANIMESH JAIN ASSIGNMENT4 LINESEGMENT (JUNIT TEST CASE ) G01043755*/
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LineSegmentTest {
	/*OVERVIEW: 
	 * this class is the unit test class which uses JUnit test cases 
	 * in the effect to check the LineSegment class and its calculate length method
	 * 
	 * */
	
	//Instances
	LineSegment l;
	//used as the object to be tested
	@Before
	public void setUp() {
		//Requires:-
		//Modifies: LineSegment, this
		//Effects: sets the values to the lineSegment object in instance 
		l = new LineSegment(10, 10, 10, 15);
		l.setStartX(10);
		l.setEndX(10);
		l.setStartY(10);
		l.setEndY(15);
	}

	@Test
	public void testCalculateLength() {
		//Requires:-
		//Modifies: LineSegment, this
		//Effects: tests the calculate length method
		double length = l.calculateLength();
		System.out.println(length);
		Assert.assertEquals(5.0, length, 0);

	}

}
