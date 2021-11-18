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
        this._pointSW = new Point(r.getPointSW());
        this._pointNE = new Point(r.getPointNE());
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
        return new Point(this._pointSW);
    }

    public Point getPointNE()
    {   
        return new Point(this._pointNE);  
    }

    public void setHeight(int h)
    {
        if (h > 0)
            this._pointNE.setY(this._pointSW.getY() + h);
    }

    public void setWidth(int w)
    {
        if (w > 0)
            this._pointNE.setX(this._pointSW.getX() + w);
    }

    public void setPointSW(Point p)
    {
        int xDiff = p.getX() - this._pointSW.getX();
        int yDiff = p.getY() - this._pointSW.getY();
        Point updatedNE = new Point(this._pointNE.getX() + xDiff, this._pointNE.getY() + yDiff);
        this.setPointNE(updatedNE);
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
        this._pointNE.move(deltaX, deltaY);
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

    // Change the sides of the ReactangleB - height become width and vice versa
    public void changeSides()
    {
        int temp = this.getWidth();
        this.setWidth(this.getHeight());
        this.setHeight(temp);
    }

    // Private methods for isIn method, checks if point from this RectangleB is inside r 
    // loc is the location: SW / NE
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
        return pointX >= r.getPointSW().getX() && pointX <= r.getPointNE().getX() && pointY >= r.getPointSW().getY() && pointY <= r.getPointNE().getY();
    }

    // Checks if this ReactangleB is inside r(including shared edges)
    public boolean isIn(RectangleB r)
    {
        return isRectangleBPointInsideR(r, "SW") && isRectangleBPointInsideR(r, "NE");
    }

    // Checks if there is a lap between this reactangleB and r
    public boolean overlap(RectangleB r)
    {
        return this._pointNE.getX() >= r.getPointSW().getX() && this._pointSW.getX() <= r.getPointNE().getX() && this._pointSW.getY() <= r.getPointNE().getY() && this._pointNE.getY() >= r.getPointSW().getY();
    }
}// class RectangleB
