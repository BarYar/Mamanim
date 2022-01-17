/**
 * @author Bar Yaron
 * @version 15/01/22
 */
public class Ex14 {
    /**
     * This function gets two integers (x and y) and an array and it returns the the min distance between x and y in the array, if one of x or y isn't in the array then it returns Integer.MAX_VALUE
     * The Time complexity of this function is O(n) since it iterates over the entire array once and the size of the array is unknown.
     * The Space complexity of this function is O(1) since it uses the given parameters and doesn't create parameters (arrays) with unknown size.
     * @param a the given array
     * @param x the first integer
     * @param y the second integer
     * @return the min distance between x and y in the array, if one of x or y isn't in the array then it returns Integer.MAX_VALUE
     */
    public static int findMinDiff (int[] a, int x, int y)
    {
        int minDiff = Integer.MAX_VALUE;
        int lastXLoc = -1, lastYLoc = -1;

        for(int i = 0; i < a.length; i++)
        {
            if (a[i] == x)
                lastXLoc = i;
            if (a[i] == y)
                lastYLoc = i;
            if(lastXLoc >= 0 && lastYLoc >= 0 && minDiff > Math.abs(lastYLoc - lastXLoc))
                minDiff = Math.abs(lastYLoc - lastXLoc);
        }

        return minDiff;
    }
    

    /**
     * This function gets a circular sorted array and a num and it checks if num is inside the circular sorted array
     * The Time complexity of this function is O(log2n) since it is logarithmic algorithm - the searched range is divided by 2 each time
     * The Space complexity of this function is O(1) since it uses the given parameters and doesn't create parameters (arrays) with unknown size.
     * @param mat The circular sorted array
     * @param num the number to look for in the circular sorted array
     * @return Whether num is inside the circular sorted array
     */
    public static boolean search(int [][] mat, int num)
    {
        if(mat[0][0] == num) //edge case- first num / size of 1X1
        {
            return true;
        }
        int high = mat.length / 2; // Used  for: 1.checking if the size of the divided matrix is still valid - if high == 0 -it means we're in the last level. 2. for checking the high 
        int midRow = 0, midCol = 0, lowRow = 0, lowCol = 0; // The checked number location

        while(high > 0)
        {
            midRow = lowRow + high;
            midCol = lowCol + high;
            if(mat[midRow][midCol] == num)
            {
                return true;
            }
            if(mat[midRow][midCol] > num) // quarter 1, quarter 2
            {
                if(mat[lowRow][midCol] == num)
                {
                    return true;
                }
                else
                {
                    if(mat[lowRow][midCol] < num) // updates for quarter 1
                    {
                        lowCol = midCol;
                    }
                    high = high / 2; // updates for quarter 1 and 2
                }
                
            }
            else // quarter 3, quarter 4
            {
                if(mat[midRow][lowCol] == num)
                    return true;
                else
                {
                    if(mat[midRow][lowCol] > num) // updates for quarter 3
                    {
                        lowCol = midCol;
                    }

                    high = high / 2; // updates for quarter 3 and 4
                    lowRow = midRow;
                }
            }
        } 
        return false; 
    }


    /**
     * This function checks if we can split this array to two groups with the same size and with equal sum
     * @param arr the given array
     * @return if we can split this array to two groups with the same size and with equal sum
     */
    public static boolean equalSplit (int[] arr) 
    {
        int sum = sumOfArray(arr, 0);
        if(sum % 2 != 0 || arr.length % 2 != 0)
            return false;
        //Edge cases
        if(arr.length == 2) // size of array is 2
            return arr[0] == arr[1];
        if (arr.length == 0) // size of array is 0
            return true;
        return equalSplit(arr, sum/2 - arr[0], 1, 1, 1);
    }

    /**
     * Overloading of the equalSplit - checks in each level (the amount of levels is the array length / 2 : e.g for array.length = 6 the we'll have 3 levels)
     * @param arr the given array
     * @param requiredSum the requiredSum for the current level
     * @param i the location in the current level
     * @param firstLoc the first location in the current level
     * @param level the current level
     * @return if we can split this array to two groups with the same size and with equal sum
     */
    private static boolean equalSplit(int[]arr,int requiredSum ,int i, int firstLoc ,int level)
    {
        // Final level
        if(level == (arr.length / 2) -1)
        {
            if (i == arr.length -1)
                return arr[i] == requiredSum;
            else
            {
                if (arr[i] == requiredSum)
                    return true; 
                else
                    return equalSplit(arr, requiredSum, i+1, firstLoc,level); // Next cell in current level
            }
        }
        else
        {
            if (i == arr.length -1)
                return equalSplit(arr, requiredSum - arr[i], 1, firstLoc + 1, level + 1); // Final location in current level
            else
                return equalSplit(arr, requiredSum, i+1, firstLoc,level) || equalSplit(arr, requiredSum - arr[i], firstLoc + 1, firstLoc + 1, level + 1); // Next cell in current level or current cell next level
        }
            
    }

    // Returns the sum of the array
    private static int sumOfArray(int[]arr, int i)
    {
        if(i < arr.length)
            return arr[i] + sumOfArray(arr, i + 1);
        return 0;
    }

    /**
     * Checking if n is special
     * @param n the number to be checked
     * @return if n is special
     */
    public static boolean isSpecial (int n)
    {
        return  n > 0 ? isSpecial(n, 2) : false;
    }
    
    /**
     * Overloading of isSpecial
     * @param loc the current location of the original n
     * @param everyXNum every everyXNum will be removed
     * @return
     */
    public static boolean isSpecial (int loc ,int everyXNum)
    {
        if(loc < everyXNum)
            return true;
        else
            if(loc % everyXNum == 0 )
                return false;
            else
            {
                loc = loc - loc / everyXNum;
                return isSpecial(loc, everyXNum + 1);
            }
    }
     
}
