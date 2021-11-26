/**
 * The RectangleB class represents a Rectangle
 * This class has 2 instance variables Point _pointSW, Point _pointNE.
 * @author Bar Yaron
 * @version 23/11/21
 */
public class RectangleB {
    
    private Point _pointSW;
    private Point _pointNE;
    private static final int DEFAULT_X_AND_Y = 1;

    // Constructors
    /** Constructor with the width and the height as parameters
     * @param width the width of the rectangle
     * @param height the height of the rectangle
     */
    public RectangleB(int w, int h)
    {
        this._pointSW = new Point(0,0);
        this._pointNE = new Point(w > 0 ? w : DEFAULT_X_AND_Y, h > 0 ? h : DEFAULT_X_AND_Y); // If the width and the height aren't > 0 then it sets the coordinates to 1
    }

    /** Constructor with the width, the height and the South West point as parameters
     * @param p the South West point of the rectangle
     * @param width the width of the rectangle
     * @param height the height of the rectangle
     */    
    public RectangleB(Point p , int w, int h)
    {
        this._pointSW = new Point(p);
        this._pointNE = new Point(p.getX() + (w > 0 ? w : DEFAULT_X_AND_Y), p.getY() + (h > 0 ? h : DEFAULT_X_AND_Y)); // If the width and the height aren't > 0 then it sets the coordinates to 1
    }

    /** Constructor with the South West point and the North East point as parameters
     * @param sw the South West point of the rectangle
     * @param ne the North East point of the rectangle
     */
    public RectangleB(Point sw, Point ne)
    {
        this._pointSW = new Point(sw);
        this._pointNE = new Point(ne);
    }

    /** Copy constructor - Copies the given Rectangle and creates a new one
     * @param r The rectangle to be copied
     */
    public RectangleB(RectangleB r)
    {
        this._pointSW = r.getPointSW(); // There is no Aliasing since the get returns a new Point
        this._pointNE = r.getPointNE(); // There is no Aliasing since the get returns a new Point
    }

    /** get the width of the Rectangle
     * @return the width of the Rectangle
     */
    public int getWidth()
    {
        return this._pointNE.getX() - this._pointSW.getX();
    }

    /** get the height of the Rectangle
     * @return the height of the Rectangle
     */
    public int getHeight()
    {
        return this._pointNE.getY() - this._pointSW.getY();
    }

    /** get the South West point of the Rectangle
     * @return the South West point of the Rectangle
     */
    public Point getPointSW()
    {
        return new Point(this._pointSW);
    }

    /** Returns the North East point of the RectangleB
     * @return the North East Point of the RectangleB
     */
    public Point getPointNE()
    {   
        return new Point(this._pointNE);  
    }

    /** Sets the width of the Rectangle
     * @param w the width to be set
     */
    public void setWidth(int w)
    {
        if (w > 0)
            this._pointNE.setX(this._pointSW.getX() + w); // if w isn't > 0 then the value remain as it is
    }

    /** Sets the height of the Rectangle
     * @param h the height to be set
     */
    public void setHeight(int h)
    {
        if (h > 0)
            this._pointNE.setY(this._pointSW.getY() + h); // if h isn't > 0 then the value remain as it is
    }

    /** Sets the South West point of the Rectangle
     * @param p the point to be set
     */
    public void setPointSW(Point p)
    {
        int xDiff = p.getX() - this._pointSW.getX(); // The difference between the given point p and this SW in the X
        int yDiff = p.getY() - this._pointSW.getY(); // The difference between the given point p and this SW in the Y 
        this._pointNE = new Point(this._pointNE.getX() + xDiff, this._pointNE.getY() + yDiff); // Updating the NE point according to the sw change (Using xDiff and yDiff), There is no Aliasing since the set creates a new Point 
        this._pointSW = new Point(p);
    }

    /** Returns the string of RectangleB
     * @return the string of the RectangleB
     */
    public String toString()
    {
        return "Width=" + this.getWidth() + " Height=" + this.getHeight() + " PointSW=" + this._pointSW; 
    }

    /** get the perimeter of the Rectangle
     * @return the perimeter of the Rectangle
     */
    public int getPerimeter()
    {
        return (this.getWidth() * 2 + this.getHeight() * 2);
    }

    /** get the area of the Rectangle
     * @return the area of the Rectangle
     */
    public int getArea()
    {
        return (this.getWidth() * this.getHeight());
    }
    
    /** Moving this RectangleB in the x and y axis according to the deltaX and deltaY parameters
     * @param deltaX the delta x of the movement
     * @param deltaY the delta y of the movement
     */
    public void move(int deltaX, int deltaY)
    {
        // We need to move both points according to the deltas
        this._pointSW.move(deltaX, deltaY);
        this._pointNE.move(deltaX, deltaY);
    }

    /** returns this RectangleB and other are equal
     * @param other the Rectangle to be compared to
     * @return whether this RectangleB is equal to the other RectangleB(boolean)
     */
    public boolean equals(RectangleB other)
    {
        return this._pointNE.equals(other.getPointNE()) && this._pointSW.equals(other.getPointSW());
    }

    /** Returns the length of the diagonal
     * @return the length of the diagonal
     */
    public double getDiagonalLength()
    {
        return this._pointSW.distance(this._pointNE);
    }

    /** Returns if this ReactangleB area is larger than other
     * @param other the Rectangle to be compared to
     * @return if this ReactangleB area is larger than other(boolean)
     */
    public boolean isLarger(RectangleB other)
    {
        return this.getArea() > other.getArea();
    }

    /** Change the sides of the ReactangleB - height become width and vice versa
     */
    public void changeSides()
    {
        int temp = this.getWidth();
        this.setWidth(this.getHeight());
        this.setHeight(temp);
    }

    /** Private methods for isIn method, checks if point from this RectangleB is inside r 
     * @param r The RectangleB to be compared to 
     * @param loc the location: SW/ NE
     * @return
     */
    private boolean isRectangleBPointInsideR(RectangleB r, String loc)
    {
        int pointX = 0, pointY = 0;
        switch(loc){
            case "SW":
                pointX = this._pointSW.getX();
                pointY = this._pointSW.getY();
                break;
            case "NE":
                pointX = this._pointNE.getX();
                pointY = this._pointNE.getY();
                break;
        }
        // Same explanation as in RectangleA
        return pointX >= r.getPointSW().getX() && pointX <= r.getPointNE().getX() && pointY >= r.getPointSW().getY() && pointY <= r.getPointNE().getY(); // If the point is within this range then the point is inside the rectangle
    }

    /** Checks if this ReactangleB is inside r(including shared edges)
     * @param r The RectangleB to be compared to 
     * @return whether this RectangleB is inside other RectangleB(boolean)
     */
    public boolean isIn(RectangleB r)
    {
        return isRectangleBPointInsideR(r, "SW") && isRectangleBPointInsideR(r, "NE");
    }

    /** Checks if there is a lap between this reactangleB and r
     * @param r The RectangleB to be compared to 
     * @return whether this RectangleB overlaps other RectangleB(boolean)
     */
    public boolean overlap(RectangleB r)
    {
        // Same explanation as in RectangleA
        return this._pointNE.getX() >= r.getPointSW().getX() && this._pointSW.getX() <= r.getPointNE().getX() && this._pointSW.getY() <= r.getPointNE().getY() && this._pointNE.getY() >= r.getPointSW().getY(); // If the SW and the NE points are within this range than the Rectangles overlap
    }
}// class RectangleB
