/**
 * The Sudoku class represents a 2 dimensional array of Square3x3 with size of 3x3
 * This class has 1 instance variable
 * @author Bar Yaron
 * @version 23/11/21
 */
public class Sudoku {
    
    private Square3x3[][] _9x9; 

    // Constructors
    /** Constructor that enters -1 to every cell in the Sudoku
     */
    public Sudoku()
    {
        this._9x9 = new Square3x3[3][3]; 
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                this._9x9[i][j] = new Square3x3(); // Creating a new object in each of the cells in the array
    }

    /** Copy constructor of values from Square3x3 array
     * @param square3x3Array the Square3x3 array that will be copied 
     */
    public Sudoku(Square3x3[][] square3x3Array)
    {
        this._9x9 = new Square3x3[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                this._9x9[i][j] = new Square3x3(square3x3Array[i][j]); // Using the copy constructor of Square3x3

    }

    /** Private method for the isValid method that checks if all the values of the array are true and afterwards
     * it sets them to false
     */
    private boolean allValuesAreTrue(boolean[]values)
    {
        for (int i = 1 ; i < values.length; i++)
        {
            if (!values[i])
                return false;
            values[i] = false; // In false cases it wouldn't reach this code, however it doesn't matter since isValid returns false if allValuesAreTrue false
        }
        return true;
    }

    /** This method checks if the Sudoku board is valid
     * @return if the board is valid
     */
    public boolean isValid()
    {
        int i = 0, j = 0; // Preventing declaration in each loop
        // Checks if all of the values exist in all of the Square3x3
        for (; i < 3; i++)
            for (; j < 3; j++)
                if (!this._9x9[i][j].allThere())
                    return false;
        boolean values[] = new boolean [10];
        // Checking if all of the values exist in each row
        for (i = 0; i < 9; i++)
        {
            for(j = 0; j < 3 ; j++)
                this._9x9[i / 3][j].whosThereRow(i % 3, values);
            if (!allValuesAreTrue(values))
                return false;
        }
        // Checking if all of the values exist in each column
        for (i = 0; i < 9; i++)
        {
            for(j = 0; j < 3 ; j++)
                this._9x9[j][i / 3].whosThereCol(i % 3, values);
            if (!allValuesAreTrue(values))
                return false;
        }
        return true; // If all of the check didn't return false, then I return true        
    }

}
