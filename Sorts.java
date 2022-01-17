public class Sorts {

    public static void selectionSort(int[]arr)
    {
        for (int i = 0 ; i< arr.length; i++)
        {
            int numLoc = selMinNumLoc(arr, i);
            swap(arr, numLoc, i);
        }
    }

    public static int selMinNumLoc(int[]arr, int loc)
    {
        int minNum = arr[loc], minLoc = loc;
        for (; loc < arr.length; loc++)
        {
            if (arr[loc] < minNum)
            {
                minLoc = loc;
                minNum = arr[loc];  
            }
        }
        return minLoc; 
    }

    public static void swap(int[]arr, int loc1, int loc2)
    {
        int temp = arr[loc1];
        arr[loc1] = arr[loc2];
        arr[loc2] = temp;
    }

    public static void insertionSort(int[]arr)
    {
        int cur;
        if (arr.length > 0)
        {
            for (int i = 1 ; i < arr.length; i++)
            {
                cur = arr[i];
                for (int j = i - 1; j >= 0; j--)
                {
                    if(cur < arr[j] && j != 0)
                        arr [j+1] = arr[j];
                    else
                        arr[j] = cur;
                }
            }
        }
    }

    public static void bubbleSort(int []arr)
    {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - 1; j++)
            {
                if(arr[j+1] < arr[j])
                    swap(arr, j, j+1);
            }
    }

    public static boolean isPalindrome(String str)
    {
        if(str.charAt(0) != str.charAt(str.length() -1))
            return false;
        else
            if(str.length() <= 2)
                return true;
            else
               return isPalindrome(str.substring(1, str.length() -1));
    }

    public static int minArrayReq(int[]arr)
    {
        if (arr.length == 1)
            return arr[0];
        else
        {
            int [] newArr = new int[arr.length -1];
            for (int i=1; i< arr.length; i++)
            {
                newArr[i-1] = arr[i];
            }
            int comp = minArrayReq(newArr);
            return comp < arr[0] ? comp : arr[0];
        }
            
    }

    public static void selectionSortReq(int[]arr)
    {
        if(arr.length > 1)
        {
            int min = minArrayReq(arr);
            int [] newArr = new int[arr.length -1];
            for (int i=1; i< arr.length; i++)
            {
                newArr[i-1] = arr[i];
            }
        }
    }

    public static void printArray(int []arr)
    {
        for(int i=0; i< arr.length; i++)
        {
            if (i < arr.length - 1)
                System.out.print(arr[i] + ", ");
            else
                System.out.println(arr[i]);
        }
    }

    public static boolean binarySearch(int []arr, int num)
    {
        int l = 0, r = arr.length -  1;
        int m = arr.length/ 2;
        while(r - l > 1)
        {
            if(arr[m] > num)
            {
                r = m;
                m = m / 2;
            }
            else
            {
                if(arr[m] < num)
                {
                    l = m;
                    m = m + m / 2;
                }
                else
                    return true;
            }
        }
        return false;

    }

    




    public static void main(String[]args)
    {
        int [] arr1 = {15, 22, 33, 7, -1, 22, -5, 5, 6, 7};
        int arr[] = { 2, 3, 4, 10, 40 };
        System.out.println(binarySearch(arr, 10));
        System.out.println(minArrayReq(arr1));
        System.out.println(isPalindrome("abcba"));
        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome("abcd"));
        selectionSort(arr1);
        printArray(arr1);
        int [] arr2 = {15, 22, 33, 7, -1, 22, -4, 5, 6, 7};
        insertionSort(arr2);
        printArray(arr1);
        int [] arr3 = {15, 22, 33, 7, -1, 22, -4, 5, 6, 7};
        bubbleSort(arr3);
        printArray(arr3);
    }
    
}
