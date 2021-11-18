
/**
 * Name: Bar Yaron
 * The RectangleA class represents a Rectangle
 * This class has 2 instance variables int width, int height and Point pointSW.
 */
public class RectangleA {

    // instance variables
    private int _width;
    private int _height;
    private Point _pointSW;

    // Constructors
    public RectangleA(int width, int height)
    {
        this._width = width > 0 ? width : 1;
        this._height = height > 0 ? height : 1;
        this._pointSW = new Point(0 , 0);
    }

    public RectangleA(Point p, int width, int height)
    {
        this._width = width > 0 ? width : 1;
        this._height = height > 0 ? height : 1;
        this._pointSW = p;
    }

    public RectangleA(Point sw, Point ne)
    {
        this(sw, ne.getX() - sw.getX(), ne.getY() - sw.getY() );
    }

    public RectangleA(RectangleA r)
    {
        this(new Point(r.getPointSW()), r.getWidth(), r.getHeight());
    }

    // Getters and Setters
    public int getWidth()
    {
        return this._width;
    }

    public int getHeight()
    {
        return this._height;
    }

    public Point getPointSW()
    {
        return new Point(this._pointSW);
    }

    public void setWidth(int w)
    {
        this._width = w  > 0 ? w : this._width;
    }

    public void setHeight(int h)
    {
        this._height = h  > 0 ? h : this._height;
    }

    public void setPointSW(Point p)
    {
        this._pointSW = p;
    }

    // toString method
    public String toString()
    {
        return "Width=" + this._width + " Height=" + this._height + " PointSW=" + this._pointSW; 
    }

    // Returns the perimeter of the rectangle
    public int getPerimeter()
    {
        return (this._width * 2 + this._height * 2);
    }

    // Returns the area of the rectangle
    public int getArea()
    {
        return (this._width * this._height);
    }
    
    // Moving the this RectangleA in the x and y axis according to the deltaX and deltaY parameters
    public void move(int deltaX, int deltaY)
    {
        this._pointSW.move(deltaX, deltaY);
    }

    // Checks if this RectangleA and other are equal
    public boolean equals(RectangleA other)
    {
        return this._width == other._width && this._height == other._height && this._pointSW.equals(other.getPointSW());
    }

    // Returns the length of the diagonal
    public double getDiagonalLength()
    {
        return Math.sqrt(Math.pow(this._height, 2) + Math.pow(this._width, 2));
    }

    // Returns if this ReactangleA area is larger than other
    public boolean isLarger(RectangleA other)
    {
        return this.getArea() > other.getArea();
    }

    // Returns the North East point of the RectangleA
    public Point getPointNE()
    {   
        Point ne = new Point(this._pointSW.getX() + this._width, this._pointSW.getY() + this._height);
        return ne;
    }

    // Change the sides of the ReactangleA - height become width and vice versa
    public void changeSides()
    {
        int temp = this._width;
        this._width = this._height;
        this._height = temp;
    }

    // Private methods for isIn method, checks if point from this RectangleA is inside r 
    // loc is the location: SW/ NE
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
        return pointX >= r.getPointSW().getX() && pointX <= r.getPointNE().getX() && pointY >= r.getPointSW().getY() && pointY <= r.getPointNE().getY();
    }

    // Checks if this ReactangleA is inside r(including shared edges)
    public boolean isIn(RectangleA r)
    {
        return isRectangleAPointInsideR(r, "SW") && isRectangleAPointInsideR(r, "NE");
    }

    // Checks if there is a lap between this reactangleA and r
    public boolean overlap(RectangleA r)
    {
        return this.getPointNE().getX() >= r.getPointSW().getX() && this._pointSW.getX() <= r.getPointNE().getX() && this._pointSW.getY() <= r.getPointNE().getY() && this.getPointNE().getY() >= r.getPointSW().getY();
    }

}// class RectangleA
