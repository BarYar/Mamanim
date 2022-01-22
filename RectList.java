/**
 *This Class represent a linked list of RectNode objects (RectangleA)
 * This class has 1 instance variables:
 * _head - Reference to the head of the linked list
 * @author Bar Yaron
 * @version 29/01/22
 */
public class RectList {
    
    // Instance Variable
    RectNode _head;

    /**
     * Constructor for the RectList, sets the Head to null
     * Time Complexity - O(1) - Doing a known amount of actions - setting the head to null
     * Space Complexity - O(1) - Set the head to null - known amount(null) of space was created.
     */
    public RectList()
    {   
        this._head = null;
    }

    /**
     * Adding the r to the end of the list, if r in list, then it doesn't add it.
     * Time Complexity - O(n) - Iterating over an unknown size of RectList
     * Space Complexity - O(1) - Creating a known size object(newNode)
     * @param r The rectangle to be added
     */
    public void addRect(RectangleA r)
    {
        if(this._head == null)
            this._head = new RectNode(r);
        else
        {
            RectNode temp = this._head;
            boolean exist = false;
            
            while(temp.getNext() != null && exist == false)
            {
                if(temp.getRect().equals(r))
                {
                    exist = true;
                }
                temp = temp.getNext();
            }
            
            if(exist == false)
            {
                RectNode newNode = new RectNode(r);
                temp.setNext(newNode);
            }
        }
    }

    /**
     * Returning how many Rectangles in this RectList RectNodes with this point.
     * Time Complexity - O(n) - Iterating over an unknown size of RectList.
     * Space Complexity - O(1) - We don't create a unknown size Object.
     * @param p The Point to be checked if it exist in the RectList
     * @return How many rectangles with this Point
     */
    public int howManyWithPoint(Point p)
    {
        int count  = 0;
        for(RectNode temp = _head; temp!= null; temp = temp.getNext())
        {
            if(temp.getRect().getPointSW().equals(p))
                count++;
        }
        return count;
    }

    /**
     * Returning the longest diagonal of the Rectangles in the RectNodes of the RectList
     * Time Complexity - O(n) - Iterating over an unknown size of RectList.
     * Space Complexity - O(1) - We don't create a unknown size Object.
     * @return the longest diagonal of the Rectangles in the RectNodes of the RectList
     */
    public double longestDiagonal()
    {
        double longestDiagonal  = 0;
        for(RectNode temp = _head; temp!= null; temp = temp.getNext())
        {
            if(temp.getRect().getDiagonalLength() > longestDiagonal)
                longestDiagonal = temp.getRect().getDiagonalLength();
        }
        return longestDiagonal;
    }
    
    /**
     * Returning the SW point most left rectangle in the RectNodes of the RectList
     * Time Complexity - O(n) - Iterating over an unknown size of RectList.
     * Space Complexity - O(1) - We create only one object in the method
     * @return the SW point most left rectangle in the RectNodes of the RectList
     */
    public Point mostLeftRect()
    {
        Point mostLeftPointSW = null;
        for(RectNode temp = _head; temp!= null; temp = temp.getNext())
        {
            if(mostLeftPointSW == null)
                mostLeftPointSW = temp.getRect().getPointSW();
            else
                if(temp.getRect().getPointSW().isLeft(mostLeftPointSW))
                    mostLeftPointSW = temp.getRect().getPointSW();

        }
        return mostLeftPointSW; // There is no need in creating a new point for preventing aliasing, since according to the API the getPointSW returns a copy of the point
    }

    /**
     * Returning the NE point highest rectangle in the RectNodes of the RectList
     * Time Complexity - O(n) - Iterating over an unknown size of RectList.
     * Space Complexity - O(1) - We create only one object in the method
     * @return the NE point highest rectangle in the RectNodes of the RectList
     */
    public Point highestRect()
    {
        Point highestPointNE = null;
        for(RectNode temp = _head; temp!= null; temp = temp.getNext())
        {
            if(highestPointNE == null)
                highestPointNE = temp.getRect().getPointNE();
            else
                if(temp.getRect().getPointNE().isAbove(highestPointNE))
                    highestPointNE = temp.getRect().getPointNE();

        }
        return highestPointNE; // There is no need in creating a new point for preventing aliasing, since according to the API the getPointNE returns a copy of the point
    }

    /**
     * Method for getting the X of the most right RectangleA - used for the minimalContainer method - to get the right boundary of the rectangle
     * Time Complexity - O(n) - Iterating over an unknown size of RectList.
     * Space Complexity - O(1) - We create only one primitive in the method
     * @return the X of the most right RectangleA
     */
    private int mostRightRectX()
    {
        int xOfMostRightRect = -1;
        for(RectNode temp = _head; temp!= null; temp = temp.getNext())
        {
            if(temp.getRect().getPointNE().getX() > xOfMostRightRect)
                xOfMostRightRect = temp.getRect().getPointNE().getX();
        }
        return xOfMostRightRect;
    }

    /**
     * Method for getting the Y of the lowest RectangleA - used for the minimalContainer method - to get the bottom of the rectangle
     * Time Complexity - O(n) - Iterating over an unknown size of RectList.
     * Space Complexity - O(1) - We create only one primitive in the method
     * @return the Y of the lowest RectangleA
    */
    private int lowestRectY()
    {
        int yOfLowestRect = Integer.MAX_VALUE;
        for(RectNode temp = _head; temp!= null; temp = temp.getNext())
        {
            if(temp.getRect().getPointSW().getY() < yOfLowestRect)
                yOfLowestRect = temp.getRect().getPointSW().getY();
        }
        return yOfLowestRect;
    }

    /**
     * method for getting the smallest Rectangle area that all of the Rectangles in the RectList are in it
     * Time Complexity - O(n) - Iterating over an unknown size of RectList 4 times, it's still O(n) since we're iterating a known amount of times(4) on an unknown size.
     * Space Complexity - O(1) - We create 2 primitives and 3 objects in the method (known amount of objects).
     * @return the smallest Rectangle area that all of the Rectangles in the RectList are in it
     */
    public RectangleA minimalContainer()
    {
        // Getting the points of the Rectangle from the edges of all of the Rectangles in the RectNodes of the RectList
        Point mostLeftRectPoint = mostLeftRect(); 
        if (mostLeftRectPoint != null)
        {
            Point sw = new Point(mostLeftRect().getX(),lowestRectY());
            Point ne = new Point(mostRightRectX(),highestRect().getY());
            return new RectangleA(sw, ne);
        }
        return null;
    }

    /**
     * Returns the toString of the class
     * Time Complexity - O(n) - Iterating over an unknown size of RectList.
     * Space Complexity - O(n) - We're creating the Rectangle toString n amount of times.
     * @return the toString of the class
     */
    public String toString()
    {
        int count = 0;
        String str = "";
        for(RectNode temp = _head; temp!= null; temp = temp.getNext())
        {
            count ++;
            str += count + ". " + temp.getRect().toString() + "\n";
        }
        String finalStr = "The list has " + count +" rectangles.\n"+ str;
        return finalStr;
    }
}
