
/**  kilroy             
 *               _____   here
 *         was  /     \    
 *     ____    /(.) (.)\    ____
 * ---/    \------| |------/    \---
 *    |/\/\/      | |      |/\/\/
 *                \_/  
 *   created by B.A.
 */

public class maman14newtestersEx14FindMinDiffTester extends Ex14
{
    public static void main(String args[])
    {
        int[] arr = {1, 3, 5, 4, 8, 2, 4, 3, 6, 5};
        int num, num2;
        System.out.println("***** Qst 1 - diffMinNum *****\n**time complexity should be O(n)**");
        System.out.print("Array: ");
        for (int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
            
        num = findMinDiff(arr, 1, 6);
        num2 = findMinDiff(arr, 6, 1);
        System.out.print("\n\nTest #1 - 1 & 6:.....");
        if (num == num2 && num == 8)
            System.out.println("OK");
        else
            System.out.println("Error - your distance is: " + num +" or " + num2 + " Expect: 8");
            
        num = findMinDiff(arr, 3, 4);
        num2 = findMinDiff(arr, 4, 3);
        System.out.print("Test #2 - 3 & 4:.....");
        if (num == num2 && num == 1)
            System.out.println("OK");
        else
            System.out.println("Error - your distance is: " + num +" or " + num2 + " Expect: 1");
            
        num = findMinDiff(arr, 8, 6);
        num2 = findMinDiff(arr, 6, 8);
        System.out.print("Test #3 - 6 & 8:.....");
        if (num == num2 && num == 4)
            System.out.println("OK");
        else
            System.out.println("Error - your distance is: " + num +" or " + num2 + " Expect: 4");
            
        num = findMinDiff(arr, 7, 8);
        num2 = findMinDiff(arr, 8, 7);
        System.out.print("Test #4 - 7 & 8:.....");
        if (num == num2 && num == 2147483647)
            System.out.println("OK");
        else
            System.out.println("Error - your distance is: " + num +" or " + num2 + " Expect: 2147483647");
            
        num = findMinDiff(arr, 9, 7);
        num2 = findMinDiff(arr, 7, 9);
        System.out.print("Test #5 - 7 & 9:.....");
        if (num == num2 && num == 2147483647)
            System.out.println("OK");
        else
            System.out.println("Error - your distance is: " + num +" or " + num2 + " Expect: 2147483647");
            
        num = findMinDiff(arr, 5, 6);
        num2 = findMinDiff(arr, 6, 5);
        System.out.print("Test #6 - 6 & 5:.....");
        if (num == num2 && num == 1)
            System.out.println("OK");
        else
            System.out.println("Error - your distance is: " + num +" or " + num2 + " Expect: 1");
            
        num = findMinDiff(arr, 1, 3);
        num2 = findMinDiff(arr, 3, 1);
        System.out.print("Test #7 - 1 & 3:.....");
        if (num == num2 && num == 1)
            System.out.println("OK");
        else
            System.out.println("Error - your distance is: " + num +" or " + num2 + " Expect: 1");
            
        num = findMinDiff(arr, 3, 5);
        num2 = findMinDiff(arr, 5, 3);
        System.out.print("Test #8 - 3 & 5:.....");
        if (num == num2 && num == 1)
            System.out.println("OK");
        else
            System.out.println("Error - your distance is: " + num +" or " + num2 + " Expect: 1");
    }
}

