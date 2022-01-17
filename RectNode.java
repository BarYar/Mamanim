/**
 * The RectNode class represents an intersection in a linked list of rectangles.
 * This class has 2 instance variables:
 * _rect - The rectangle
 * _next - Reference to the next rectangle
 * All of the methods in this class complexity:
 * Time Complexity - O(1) - they're creating or getting or setting objects - they're doing a known amount of actions
 * Space Complexity - they're creating or getting or setting objects - if they're creating an object,  they're creating a known amount of objects
 * @author Bar Yaron
 * @version 29/1/22
 */
public class RectNode {

    // Instance Variables
    RectangleA _rect;
    RectNode _next;

    // Constructors
    /**
     * Constructor with the RectangleA as parameter, it sets next to null
     * @param r the RectangleA (_rect) parameter
     */
    public RectNode(RectangleA r)
    {
        this._rect =  new RectangleA(r);
        this._next = null;
    }

    /**
     * Constructor with the RectangleA as parameter and reference of the next Node.
     * @param r the RectangleA (_rect) parameter
     * @param n The _next Reference
     */
    public RectNode(RectangleA r, RectNode n)
    {
        this(r);
        this._next = n;
    }

    /**
     * Constructor with RectNode as parameter - copy constructor
     * @param r
     */
    public RectNode(RectNode r)
    {
        this._rect = new RectangleA(r.getRect());
        this._next = r.getNext();
    }

    // Getters and Setters
    /**
     * Get the RectangleA of the RectNode
     * @return the RectangleA of the RectNode
     */
    public RectangleA getRect()
    {
        return new RectangleA(this._rect);
    }

    /**
     * Get the next of the RectNode
     * @return the next of the RectNode
     */
    public RectNode getNext()
    {
        return this._next;
    }

    /**
     * Set the RectangleA of the RectNode
     * @param r the RectangleA to be set
     */
    public void setRect(RectangleA r)
    {
        this._rect =  new RectangleA(r);
    }

    /**
     * Set the Next RectNode Reference
     * @param next the next RectNode to be set
     */
    public void setNext(RectNode next)
    {
        this._next = next;
    }

}