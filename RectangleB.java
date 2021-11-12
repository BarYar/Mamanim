/**
 * Name: Bar Yaron
 * The RectangleB class represents a Rectangle
 * This class has 2 instance variables Point _pointSW, Point _pointNE.
 */
public class RectangleB {
    
    // instance variables
    private Point _pointSW;
    private Point _pointNE;

    // Constructors
    public RectangleB(int w, int h)
    {
        this._pointSW = new Point(0,0);
        this._pointNE = new Point(w > 0 ? w : 1, h > 0 ? h : 1);
    }

    public RectangleB(Point p , int w, int h)
    {
        this._pointSW = p;
        this._pointNE = new Point(p.getX() + (w > 0 ? w : 1), p.getY() + (h > 0 ? h : 1));
    }

    public RectangleB(Point sw, Point ne)
    {
        this._pointSW = sw;
        this._pointNE = ne;
    }

    public RectangleB(RectangleB r)
    {
        this._pointSW = new Point(r.getPointSW().getX(), r.getPointSW().getY());
        this._pointNE = new Point(r.getPointNE().getX(), r.getPointNE().getY());
    }

    // Getters and Setters
    public int getWidth()
    {
        return this._pointNE.getX() - this._pointSW.getX();
    }

    public int getHeight()
    {
        return this._pointNE.getY() - this._pointSW.getY();
    }

    public Point getPointSW()
    {
        return this._pointSW;
    }

    public Point getPointNE()
    {   
        return this._pointNE;  
    }

    public void setHeight(int h)
    {
        this._pointNE.setY(this._pointSW.getY() + h);
    }

    public void setWidth(int w)
    {
        this._pointNE.setX(this._pointSW.getY() + w);
    }

    public void setPointSW(Point p)
    {
        this._pointSW = p;
    }

    public void setPointNE(Point p)
    {
        this._pointNE = p;
    }

    // toString method
    public String toString()
    {
        return "Width=" + this.getWidth() + " Height=" + this.getHeight() + " PointSW=" + this._pointSW; 
    }

    // Returns the perimeter of the rectangle
    public int getPerimeter()
    {
        return (this.getWidth() * 2 + this.getHeight() * 2);
    }

    // Returns the area of the rectangle
    public int getArea()
    {
        return (this.getWidth() * this.getHeight());
    }
    
    // Moving the this RectangleB in the x and y axis according to the deltaX and deltaY parameters
    public void move(int deltaX, int deltaY)
    {
        this._pointSW.move(deltaX, deltaY);
    }

    // Checks if this RectangleB and other are equal
    public boolean equals(RectangleB other)
    {
        return this._pointNE.equals(other.getPointNE()) && this._pointSW.equals(other.getPointSW());
    }

    // Returns the length of the diagonal
    public double getDiagonalLength()
    {
        return Math.sqrt(Math.pow(this.getHeight(), 2) + Math.pow(this.getWidth(), 2));
    }

    // Returns if this ReactangleB area is larger than other
    public boolean isLarger(RectangleB other)
    {
        return this.getArea() > other.getArea();
    }

    // Change the sides of the ReactangleA - height become width and vice versa
    public void changeSides()
    {
        int temp = this.getWidth();
        this.setWidth(this.getHeight());
        this.setHeight(temp);
    }

    // Private methods for isIn and Overlap methods - checks if point (represented by x and y for avoiding creating a new point for some of the use cases)
    private boolean isPointInsideReactangleA(int x, int y)
    {
        return x >= this._pointSW.getX() && x <= this._pointNE.getX() && y >= this._pointSW.getY() && y <= this._pointNE.getY();
    }

    // Checks if r is inside this ReactangleA (including shared edges)
    public boolean isIn(RectangleB r)
    {
        return isPointInsideReactangleA(r.getPointSW().getX(), r.getPointSW().getY()) && isPointInsideReactangleA(r.getPointNE().getX(), r.getPointNE().getY());
    }

    // Checks if there is a lap between this reactangleA and r
    public boolean overlap(RectangleB r)
    {
        return isPointInsideReactangleA(r.getPointSW().getX(), r.getPointSW().getY()) || isPointInsideReactangleA(r.getPointNE().getX(), r.getPointNE().getY()) ||  isPointInsideReactangleA(r.getPointSW().getX() +r.getWidth(), r.getPointSW().getY()) ||  isPointInsideReactangleA(r.getPointSW().getX() , r.getPointSW().getY() + r.getHeight());
    }
}// class RectangleB
