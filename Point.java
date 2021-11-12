/**
 * Name: Bar Yaron
 * The point class represents point in a cartesian system.
 * This class has 2 instance variables int x and int y.
 */
public class Point{

    // instance variables
    private int _x;
    private int _y;

    // Coordinates constructor
    public Point(int x, int y)
    {
        this._x = x;
        this._y = y;
    }

    // Copy constructor
    public Point(Point other)
    {
        this._x = other.getX();
        this._y = other.getY();
    }

    // getters and setters
    public int getX()
    {
        return this._x;
    }
    public int getY()
    {
        return this._y;
    }
    public void setX(int num)
    {
        this._x = num;
    }
    public void setY(int num)
    {
        this._y = num;
    }

    // toString Method
    public String toString()
    {
        return "(" + this._x + "," + this._y + ")";
    }

    // Returns whether an object is equal to the other object
    public boolean equals(Point other)
    {
        return this._x == other.getX() && this._y == other.getY();
    }

    // Returns whether this point is above the other point
    public boolean isAbove(Point other)
    {
        return this._y > other.getY();
    }

    // Returns whether this point is under the other point
    public boolean isUnder(Point other)
    {
        return !this.isAbove(other);
    }

    // Returns whether this point is to the left of the other point
    public boolean isLeft(Point other)
    {
        return this._x < other.getX();
    }

    // Returns whether this point to the right of the other point
    public boolean isRight(Point other)
    {
        return !this.isLeft(other);
    }

    // Moving the point on the x and y axis with the deltas
    public void move(int deltaX, int deltaY)
    {
        this._x += deltaX;
        this._y += deltaY;
    }

    // Returns the distance between this point and the other point
    public double distance(Point other)
    {
        return Math.sqrt(Math.pow(this._y - other.getY(), 2) + Math.pow(this._x - other.getX(), 2));
    }

}// class Point