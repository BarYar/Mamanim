/**
 * The point class represents point in a cartesian system.
 * This class has 2 instance variables int x and int y.
 * @author Bar Yaron
 * @version 23/11/21
 */
public class Point{

    private int _x;
    private int _y;

    // Constructors
    /** Coordinates constructor:
     * @param x the x coordinate
     * @param y the y coordinate
     */ 
    public Point(int x, int y)
    {
        this._x = x;
        this._y = y;
    }

    /** Copy constructor:
     * @param other the Point to be copied
     */ 
    public Point(Point other)
    {
        this._x = other.getX();
        this._y = other.getY();
    }

    /** Gets the x
     * @return the x
     */
    public int getX()
    {
        return this._x;
    }

    /** Gets the y
     * @return the y
     */
    public int getY()
    {
        return this._y;
    }

    /** Sets the x
     * @param num the x to be set
     */
    public void setX(int num)
    {
        this._x = num;
    }

    /** Sets the y
     * @param num the y to be set
     */
    public void setY(int num)
    {
        this._y = num;
    }

    /** Returns the string of point
     * @return the string of the Point
     */
    public String toString()
    {
        return "(" + this._x + "," + this._y + ")";
    }

    /** Returns whether this point is equal to the other point
     * @param other the Point to be compared
     * @return whether this point is equal to the other point(boolean)
     */
    public boolean equals(Point other)
    {
        return this._x == other.getX() && this._y == other.getY();
    }

    /** Returns whether this point is above the other point
     * @param other the Point to be compared to 
     * @return whether this point is above the other point(boolean)
     */ 
    public boolean isAbove(Point other)
    {
        return this._y > other.getY();
    }

    /** Returns whether this point is under the other point
     * @param other the Point to be compared to 
     * @return whether this point is under the other point(boolean)
     */ 
    public boolean isUnder(Point other)
    {
        return !this.isAbove(other); // Opposite of isAbove
    }

    /** Returns whether this point is to the left of the other point
     * @param other the Point to be compared to 
     * @return whether this point is to the left of the other point(boolean)
     */ 
    public boolean isLeft(Point other)
    {
        return this._x < other.getX();
    }

    /** Returns whether this point to the right of the other point
     * @param other the Point to be compared to 
     * @return whether this point to the right of the other point(boolean)
     */ 
    public boolean isRight(Point other)
    {
        return !this.isLeft(other); // Opposite of isRight
    }

    /** Moving the point on the x and y axis with the deltas
     * @param deltaX the delta x of the movement
     * @param deltaY the delta y of the movement
     */
    public void move(int deltaX, int deltaY)
    {
        this._x += deltaX;
        this._y += deltaY;
    }

    /** Returns the distance between this point and the other point
     * @param other The point used for the distance measurement
     * @return the distance between other and this point
     */
    public double distance(Point other)
    {
        return Math.sqrt(Math.pow(this._y - other.getY(), 2) + Math.pow(this._x - other.getX(), 2)); // √((y1-y2)^2 +(x1-x2)^2)
    }

}// class Point