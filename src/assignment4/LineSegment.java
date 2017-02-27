package assignment4;
/*ANIMESH JAIN ASSIGNMENT4 LINESEGMENT G01043755*/
public class LineSegment {

	// Overview: class implementing the procedures to
	// take two points and calculate the length of line segment formed by them.
	//StartX StartY are coordinates of the start point of line segment
	//endX endY are coordinates of the end point of line segment
	//the calculateLength method returns the length of segment  
	//CLient should call the calculate length method before calling get length
	/*
	 * Representation Invariant
	 *  *startX must not be null.
	 *  *startY must not be null.
	 *  *endX must not be null.
	 *  *endY must not be null.
	 * 	*startX should be double.
	 * 	*startY should be double.
	 *	*endX should be double.
	 *	*endY should be double.
	 */
	/*ABSTRACT FUNCTION:
	 *  AF(r)= 
	 * 	  xSide= endX-startX if endX>startX is true WHERE endX, startX != null
	 *  
	 *  OR xSide=startX-endX if startX>endX is true  WHERE endX, startX !=null
	 *  
	 *     ySide= endY-startY if endY>startY is true WHERE endY,startY != null
	 *  OR ySide= startY-endY if startY>endY is true  WHERE endY,startY !=null
	 * 	
	 *  AND 
	 *  length= SQRT(((xSide)^2)+((ySide)^2)))  
	 * 						
	 * */
	
	// instance variables:
	private double startX;
	private double startY;
	private double endX;
	private double endY;
	private double length;
	
	//Constructors
	public LineSegment(){
		//Requires: 
		//Modifies: this
		//Effects: sets this to the super class values
		super();
	}
	public LineSegment( double startX, double startY, double endX, double endY)
	{super();
	//Requires: startX,startY,  endX, endY
	//Modifies: this
	//Effects: sets the instance variables of this to the user given values: startX,startY,  endX, endY 
	setStartX(startX);
	setStartY(startY);
	setEndX(endX);
	setEndY(endY);
		
	}

	// Methods
	public double calculateLength() { 
		// Requires: All the instance variables to be already set
		// Modifies: This
		// Effect: calculates the length, stores into instance
		// and returns a copy of calculated length
		double xSide;
		double ySide;
		if (startX > endX) {
			xSide = startX - endX;

		} else
			xSide = endX - startX;

		if (startY > endY)
			ySide = startY - endY;
		else
			ySide = endY - startY;

		length = Math.sqrt((Math.pow(xSide, 2)) + (Math.pow(ySide, 2)));
		return new Double(length).doubleValue();

	}

	public double getStartX() {
		// Requires: -
		// Modifies: -
		// Effect: Returns a copy of X coordinate of the start point
		return new Double(startX).doubleValue();
	}

	public void setStartX(double startX) {
		// Requires: X coordinate of start point
		// Modifies: this
		// Effect: Sets a copy of X coordinate of the start point of this
		
		this.startX = new Double(startX).doubleValue();
	}

	public double getStartY() {
		// Requires: -
		// Modifies: -
		// Effect: Returns the Y coordinate of the start point of this 
		return new Double(startY).doubleValue();
	}

	public void setStartY(double startY) {
		// Requires: Y coordinate of start point of this
		// Modifies:this
		// Effect: sets the Y coordinate of start point of this

		this.startY = new Double(startY).doubleValue();
	}

	public double getEndX() {
		// Requires: -
		//Modifies: -
		// Effect: Returns the X coordinate of the end point of this
		return new Double(endX);
	}

	public void setEndX(double endX) {
		// Requires: X coordinate of start point of this
		// Modifies:this
		// Effect: sets the x coordinate of start point of this 

		this.endX = endX;
	}

	public double getEndY() {
		// Requires: -
		// Modifies: -
		// Effect: Returns the Y coordinate of the end point of this
		return new Double(endY);
	}

	public void setEndY(double endY) {
		// Requires: Y coordinate of end point of this
		// Modifies:this
		// Effect: sets the Y coordinate of end point of this 
		this.endY = new Double(endY);
	}

	public double getLength() {
		// Requires: length to be calculated by calculate method
		// Modifies: -
		// Effect: returns the current value of length of this segmment
		return new Double(length).doubleValue();
	}

}
