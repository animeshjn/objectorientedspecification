package assignment4;
/*ANIMESH JAIN ASSIGNMENT4 LINESEGMENT G01043755*/
public class LineSegmentClient {
/*OVerview:
 * this is the client class to call the LineSegment class and calculate its length 
 * */
	public static void main(String args[]) {
	//Effects: client call to the line segment calculate method
	LineSegment l1= new LineSegment(10,10,10,15);
	
	System.out.println("Given StartX "+l1.getStartX());
	System.out.println("Given StartY "+l1.getStartY());
	System.out.println("Given EndX "+l1.getEndX());
	System.out.println("Given EndY "+l1.getEndY());
	System.out.println("Calculated length of line is: "+l1.calculateLength());
	
	
	}

}
