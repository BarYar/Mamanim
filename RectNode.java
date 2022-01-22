/**
 * The RectNode class represents an intersection in a linked list of rectangles.
 * This class has 2 instance variables:
 * _rect - The rectangle
 * _next - Reference to the next rectangle
 * @author Bar Yaron
 * @version 29/01/22
 */
public class RectNode {

    // Instance Variables
    RectangleA _rect;
    RectNode _next;

    // Constructors
    /**
     * Constructor with the RectangleA as parameter, it sets next to null
     * @param r the RectangleA (_rect) parameter
     * Time Complexity - O(1) - Doing a known amount of actions
     * Space Complexity - O(1) - creating a known amount of objects
     */
    public RectNode(RectangleA r)
    {
        this._rect = new RectangleA(r);
        this._next = null;
    }

    /**
     * Constructor with the RectangleA as parameter and reference of the next Node.
     * @param r the RectangleA (_rect) parameter
     * @param n The _next Reference
     * Time Complexity - O(1) - Doing a known amount of actions
     * Space Complexity - O(1) - creating a known amount of objects
     */
    public RectNode(RectangleA r, RectNode n)
    {
        this(r);
        this._next = n;
    }

    /**
     * Constructor with RectNode as parameter - copy constructor
     * @param r
     * Time Complexity - O(1) - Doing a known amount of actions
     * Space Complexity - O(1) - creating a known amount of objects
     */
    public RectNode(RectNode r)
    {
        this._rect = r.getRect(); // There is no need in creating a new RectangleA for preventing aliasing, since getRect is creating a new one
        this._next = r.getNext();
    }

    // Getters and Setters
    /**
     * Get the RectangleA of the RectNode
     * @return the RectangleA of the RectNode
     * Time Complexity - O(1) - Doing a known amount of actions
     * Space Complexity - O(1) - creating a known amount of objects
     */
    public RectangleA getRect()
    {
        return new RectangleA(this._rect);
    }

    /**
     * Get the next of the RectNode
     * @return the next of the RectNode
     * Time Complexity - O(1) - Doing a known amount of actions
     * Space Complexity - O(1) - creating a known amount of objects
     */
    public RectNode getNext()
    {
        return this._next;
    }

    /**
     * Set the RectangleA of the RectNode
     * @param r the RectangleA to be set
     * Time Complexity - O(1) - Doing a known amount of actions
     * Space Complexity - O(1) - creating a known amount of objects
     */
    public void setRect(RectangleA r)
    {
        this._rect =  new RectangleA(r);
    }

    /**
     * Set the Next RectNode Reference
     * @param next the next RectNode to be set
     * Time Complexity - O(1) - Doing a known amount of actions
     * Space Complexity - O(1) - creating a known amount of objects
     */
    public void setNext(RectNode next)
    {
        this._next = next;
    }

}