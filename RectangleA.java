
/**
 * The RectangleA class represents a Rectangle
 * This class has 2 instance variables int width, int height and Point pointSW.
 * @author Bar Yaron
 * @version 23/11/21
 */
public class RectangleA {

    private int _width;
    private int _height;
    private Point _pointSW;

    // Constructors
    /** Constructor with the width and the height as parameters
     * @param width the width of the rectangle
     * @param height the height of the rectangle
     */
    public RectangleA(int width, int height)
    {
        this._width = width > 0 ? width : 1; // If width isn't > 0 then it sets it to 0
        this._height = height > 0 ? height : 1; // If height isn't > 0 then it sets it to 0
        this._pointSW = new Point(0 , 0);
    }

    /** Constructor with the width, the height and the South West point as parameters
     * @param p the South West point of the rectangle
     * @param width the width of the rectangle
     * @param height the height of the rectangle
     */
    public RectangleA(Point p, int width, int height)
    {
        this._width = width > 0 ? width : 1; // If width isn't > 0 then it sets it to 0
        this._height = height > 0 ? height : 1; // If height isn't > 0 then it sets it to 0
        this._pointSW = p;
    }

    /** Constructor with the South West point and the North East point as parameters
     * @param sw the South West point of the rectangle
     * @param ne the North East point of the rectangle
     */
    public RectangleA(Point sw, Point ne)
    {
        this(sw, ne.getX() - sw.getX(), ne.getY() - sw.getY()); // The width and the height are the x and y distances accordingly
    }

    /** Copy constructor - Copies the given Rectangle and creates a new one
     * @param r The rectangle to be copied
     */
    public RectangleA(RectangleA r)
    {
        this(r.getPointSW(), r.getWidth(), r.getHeight()); // There is no Aliasing since the get returns a new Point
    }

    /** get the width of the Rectangle
     * @return the width of the Rectangle
     */
    public int getWidth()
    {
        return this._width;
    }

    /** get the height of the Rectangle
     * @return the height of the Rectangle
     */
    public int getHeight()
    {
        return this._height;
    }

    /** get the South West point of the Rectangle
     * @return the South West point of the Rectangle
     */
    public Point getPointSW()
    {
        return new Point(this._pointSW);
    }

    /** Sets the width of the Rectangle
     * @param w the width to be set
     */
    public void setWidth(int w)
    {
        this._width = w  > 0 ? w : this._width; // If the width isn't > 0  then it sets it to 0
    }

    /** Sets the height of the Rectangle
     * @param h the height to be set
     */
    public void setHeight(int h)
    {
        this._height = h  > 0 ? h : this._height; // If the height isn't > 0  then it sets it to 0
    }

    /** Sets the South West point of the Rectangle
     * @param p the point to be set
     */
    public void setPointSW(Point p)
    {
        this._pointSW = new Point(p);
    }

    /** Returns the string of RectangleA
     * @return the string of the RectangleA
     */
    public String toString()
    {
        return "Width=" + this._width + " Height=" + this._height + " PointSW=" + this._pointSW; 
    }

    /** get the perimeter of the Rectangle
     * @return the perimeter of the Rectangle
     */
    public int getPerimeter()
    {
        return (this._width * 2 + this._height * 2);
    }

    /** get the area of the Rectangle
     * @return the area of the Rectangle
     */
    public int getArea()
    {
        return (this._width * this._height);
    }
    
    /** Moving this RectangleA in the x and y axis according to the deltaX and deltaY parameters
     * @param deltaX the delta x of the movement
     * @param deltaY the delta y of the movement
     */
    public void move(int deltaX, int deltaY)
    {
        this._pointSW.move(deltaX, deltaY);
    }

    /** returns this RectangleA and other are equal
     * @param other the Rectangle to be compared to
     * @return whether this RectangleA is equal to the other RectangleA(boolean)
     */
    public boolean equals(RectangleA other)
    {
        return this._width == other._width && this._height == other._height && this._pointSW.equals(other.getPointSW());
    }

    /** Returns the length of the diagonal
     * @return the length of the diagonal
     */
    public double getDiagonalLength()
    {
        return Math.sqrt(Math.pow(this._height, 2) + Math.pow(this._width, 2)); // Pythagorean theorem
    }

    /** Returns if this ReactangleA area is larger than other
     * @param other the Rectangle to be compared to
     * @return if this ReactangleA area is larger than other(boolean)
     */
    public boolean isLarger(RectangleA other)
    {
        return this.getArea() > other.getArea();
    }

    /** Returns the North East point of the RectangleA
     * @return the North East Point of the RectangleA
     */
    public Point getPointNE()
    {   
        return new Point(this._pointSW.getX() + this._width, this._pointSW.getY() + this._height); // Creating the North East point by using the SW point, the width and the height
    }

    /** Change the sides of the ReactangleA - height become width and vice versa
     */
    public void changeSides()
    {
        int temp = this._width;
        this._width = this._height;
        this._height = temp;
    }

    /** Private methods for isIn method, checks if point from this RectangleA is inside r 
     * @param r The RectangleA to be compared to 
     * @param loc the location: SW/ NE
     * @return
     */
    private boolean isRectangleAPointInsideR(RectangleA r, String loc)
    {
        int pointX = 0, pointY = 0;
        switch(loc){
            case "SW":
                pointX = this._pointSW.getX();
                pointY = this._pointSW.getY();
                break;
            case "NE":
                pointX = this.getPointNE().getX();
                pointY = this.getPointNE().getY();
                break;
        }
        /**  I didn't use the isAbove, isUnder, isLeft and isRight methods because they're making the code longer and more complicated
         For example - the first condition would look like this if used those methods (I would use Point p instead pointX and pointY):  
         p.isRight(r.getPointSW()) ||  (!p.isRight(r.getPointSW()) && (!p.isLeft(r.getPointSW()) instead of: pointX >= r.getPointSW().getX()
         I could've made xEquals and yEquals methods in Point but it wouldn't help because they're private */
        return pointX >= r.getPointSW().getX() && pointX <= r.getPointNE().getX() && pointY >= r.getPointSW().getY() && pointY <= r.getPointNE().getY(); // If the point is within this range then the point is inside the rectangle
    }

    /** Checks if this ReactangleA is inside r(including shared edges)
     * @param r The RectangleA to be compared to 
     * @return whether this RectangleA is inside other RectangleA(boolean)
     */
    public boolean isIn(RectangleA r)
    {
        return isRectangleAPointInsideR(r, "SW") && isRectangleAPointInsideR(r, "NE"); // If the SW and the NE points are inside the Rectangle r then this entire Rectangle is inside r
    }

    /** Checks if there is a lap between this reactangleA and r
     * @param r The RectangleA to be compared to 
     * @return whether this RectangleA overlaps other RectangleA(boolean)
     */
    public boolean overlap(RectangleA r)
    {
        // Same explanation as in isRectangleAPointInsideR
        return this.getPointNE().getX() >= r.getPointSW().getX() && this._pointSW.getX() <= r.getPointNE().getX() && this._pointSW.getY() <= r.getPointNE().getY() && this.getPointNE().getY() >= r.getPointSW().getY(); // If the SW and the NE points are within this range than the Rectangles overlap
    }

}// class RectangleA
