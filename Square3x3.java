/**
 * The Square3x3 class represents a 2 dimensional array of ints with size of 3x3
 * This class has 1 instance variable
 * @author Bar Yaron
 * @version 11/12/21
 */
public class Square3x3 {
    
    private int[][] _3x3 = new int[3][3];

    // Constructors
    /** Constructor that enters -1 to every cell in the Square
     */
    public Square3x3()
    {
        // Iterating over the size of the array
        for (int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
                _3x3[i][j] = -1;
        }
    }

    /** Copy constructor from array- copies the values from the other array if it has values in the cell,
     * otherwise it sets the cell to -1
     * @param array the copied array
     */
    public Square3x3(int[][]array)
    {
        for (int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
                _3x3[i][j] = i < array.length && j < array[i].length ? array[i][j] : -1; // if array has value in [i][j] then it sets it to the value, otherwise to -1
        }
    }

    /** Copy constructor from Square3x3- copies the values from the other Square3x3
     * @param other the Square3x3 that will be copied
     */
    public Square3x3(Square3x3 other)
    {
        for (int row = 0;row < 3; row++)
        {
            for (int col = 0; col < 3; col++)
            {
                this._3x3[row][col] = other.getCell(row, col); // Copy the cell from other by using the getCell method
            }
        }
    }

    /** Private method for the getter and setter, checks if the location is valid (0-2)
     */
    private boolean isValidLocation(int row, int col)
    {
        return row >= 0 && row < 3 && col >= 0 && col < 3; 
    }

    /** Returns the cell at the given location if the location is valid, otherwise it returns -1
     * @param row the row of the location
     * @param col the column of the location
     * @return the cell value
     */
    public int getCell(int row, int col)
    {
        return this.isValidLocation(row, col) ? this._3x3[row][col] : -1;
    }

    /** Sets the cell at the given location if the location is valid, 
     * otherwise the value of the cell remain as it is now
     * @param row the row of the location
     * @param col the column of the location
     * @param value the value to be set to the cell
     */
    public void setXY(int row, int col, int value)
    {
        if (this.isValidLocation(row, col))
            this._3x3[row][col] = value;
    }

    /** Returns the string of Square3x3
     * @return the string of the Square3x3
     */
    public String toString()
    {
        String s = "";
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (j < 2)
                    s += _3x3[i][j] + "\t"; // Adding tab between each character, other than the last one
                else
                    s += _3x3[i][j] + "\n"; // Creating new line if it's the last character
            }        
        }
        return s;
    }

    /** Checks if all the numbers from 1 to 9 are in the array, 
     * checks that the right values exist only once.
     * @return if the above conditions are true(boolean).
     */
    public boolean allThere()
    {
        boolean [] val_exist = new boolean[9];
        for(int i=0; i < 3; i++)
        {
            for(int j=0; j < 3; j++)
            {
                if (this._3x3[i][j] >9 || this._3x3[i][j] <1) // If one of the number isn't valid (1-9), then entire _3x3 is invalid (it has 9 cells)
                    return false;
                else if (val_exist[this._3x3[i][j] - 1]) // If the cell is true, then entire _3x3 is invalid (it has 9 cells)
                    return false;
                else 
                    val_exist[this._3x3[i][j] - 1] = true;
            }
        }
        return true; // If we finished iterating over the array and there is no false case, then all of the values exist
    }

    /** Checks if this _3x3 has a number between 1 and 9 in the given row, 
     * if so then it sets the value of the array in the number to true
     * @param row the row to be checked
     * @param values the values array
     */
    public void whosThereRow(int row, boolean[]values)
    {
        for(int i=0; i < 3; i++) // Iterating over the row
        {
            if (this._3x3[row][i] >= 1 && this._3x3[row][i] <= 9)
                values[this._3x3[row][i]] = true;
        }
    }

    /** Checks if this _3x3 has a number between 1 and 9 in the given column, 
     * if so then it sets the value of the array in the number to true
     * @param col the col to be checked
     * @param values the values array
     */
    public void whosThereCol(int col, boolean[]values)
    {
        for(int i=0; i < 3;i++) // Iterating over the column
        {
            if (this._3x3[i][col] >= 1 && this._3x3[i][col] <= 9)
                values[this._3x3[i][col]] = true;
        } 
    }
}// class Square3x3

