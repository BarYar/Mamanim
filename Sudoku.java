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
                this._9x9[i][j] = new Square3x3();
    }

    /** Coyt constructor of values from Square3x3 array
     * @param square3x3Array the Square3x3 array that will be copied 
     */
    public Sudoku(Square3x3[][] square3x3Array)
    {
        this._9x9 = new Square3x3[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                this._9x9[i][j] = new Square3x3(square3x3Array[i][j]);

    }

    /** Private method for the isValid method that checks if all the values of the array are true and afterwards
     * it sets them to false
     * @param values the values array 
     * @return whether all the values of the array are true
     */
    private boolean allValuesAreTrue(boolean[]values)
    {
        for (int i = 1 ; i < values.length; i++)
        {
            if (!values[i])
                return false;
            values[i] = false;
        }
        return true;
    }

    /** This method checks if the Sudoku board is valid
     * @return if the board is valid
     */
    public boolean isValid()
    {
        int i = 0, j = 0; 
        for (; i < 3; i++)
            for (; j < 3; j++)
                if (!this._9x9[i][j].allThere())
                    return false;
        boolean values[] = new boolean [10];
        for (i = 0; i < 9; i++)
        {
            for(j = 0; j < 3 ; j++)
                this._9x9[i / 3][j].whosThereRow(i % 3, values);
            if (!allValuesAreTrue(values))
                return false;
        }
        for (i = 0; i < 9; i++)
        {
            for(j = 0; j < 3 ; j++)
                this._9x9[j][i / 3].whosThereCol(i % 3, values);
            if (!allValuesAreTrue(values))
                return false;
        }
        return true;        
    }

}
