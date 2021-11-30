/**  kilroy             
 *               _____   here
 *         was  /     \    
 *     ____    /(.) (.)\    ____
 * ---/    \------| |------/    \---
 *    |/\/\/      | |      |/\/\/
 *                \_/  
 *   created by B.A.
 */

import java.util.Scanner;

public class Square3x3TesterNew
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        
        int [][] arrTest3x3 = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        int [][] arrTest3x2x1 = new int[][] {{1,2,3},{4,5},{7}};
        int [][] arrTest1x3x2 = new int[][] {{1},{4,5,6},{7,8}};
        int [][] arrTest2x2 = new int[][] {{1,2},{3,4}};
        int [][] arrTest4x4 = new int[][] {{1,2,3,10},{4,5,6,11},{7,8,9,12}};
        int [][] arrTest3x2 = new int[][] {{1,2,3},{4,5,6}};
        int [][] arrTest2x3 = new int[][] {{1,2},{3,4},{5,6}};
        int [][] arrTest4x2 = new int[][] {{1,2,3,4},{4,5,6,8}};
        int [][] arrTest1x4 = new int[][] {{1},{2},{3},{4}};
        
        Square3x3 square1 = new Square3x3();
        Square3x3 square2 = new Square3x3(arrTest3x3);
        
        String answer = "", answer2 = "";
        
        System.out.println("Square3x3 tester");
        System.out.println("----------------");
        
        System.out.print("First constructur test:.....");
        answer = "";
        answer = square1.toString();
        if (answer.equals("-1\t-1\t-1\n-1\t-1\t-1\n-1\t-1\t-1\n"))
            System.out.println("OK");
        else
            System.out.println("Error - your square:\n" + square1 + "\nExpect:\n -1\t-1\t-1\n-1\t-1\t-1\n-1\t-1\t-1\n");
            
            
            
        System.out.println("\nSecound constructur");
        System.out.println("-------------------");
        System.out.print("test #1 arr3x3:......");
        answer = "";
        answer = square2.toString();
        if (answer.equals("1\t2\t3\n4\t5\t6\n7\t8\t9\n"))
            System.out.println("OK");
        else
            System.out.println("Error - your square:\n" + square2 + "\nExpect:\n 1\t2\t3\n4\t5\t6\n7\t8\t9\n");
        
        
        System.out.print("test #2 arr4x4:......");
        square2 = new Square3x3(arrTest4x4);
        answer = "";
        answer = square2.toString();
        if (answer.equals("1\t2\t3\n4\t5\t6\n7\t8\t9\n"))
            System.out.println("OK");
        else
            System.out.println("Error - your square:\n" + square2 + "\nExpect:\n 1\t2\t3\n4\t5\t6\n7\t8\t9\n");
        
        
        System.out.print("test #3 arr2x2:......");
        square2 = new Square3x3(arrTest2x2);
        answer = "";
        answer = square2.toString();
        if (answer.equals("1\t2\t-1\n3\t4\t-1\n-1\t-1\t-1\n"))
            System.out.println("OK");
        else
            System.out.println("Error - your square:\n" + square2 + "\nExpect:\n 1\t2\t-1\n3\t4\t-1\n-1\t-1\t-1\n");
        
        
        System.out.print("test #4 arr3x2:......");
        square2 = new Square3x3(arrTest3x2);
        answer = "";
        answer = square2.toString();
        if (answer.equals("1\t2\t3\n4\t5\t6\n-1\t-1\t-1\n"))
            System.out.println("OK");
        else
            System.out.println("Error - your square:\n" + square2 + "\nExpect:\n 1\t2\t3\n4\t5\t6\n-1\t-1\t-1\n");
        
                            
        System.out.print("test #5 arr2x3:......");
        square2 = new Square3x3(arrTest2x3);
        answer = "";
        answer = square2.toString();
        if (answer.equals("1\t2\t-1\n3\t4\t-1\n5\t6\t-1\n"))
            System.out.println("OK");
        else
            System.out.println("Error - your square:\n" + square2 + "\nExpect:\n 1\t2\t-1\n3\t4\t-1\n5\t6\t-1\n");
        
                            
        System.out.print("test #6: arr4x2:.....");
        square2 = new Square3x3(arrTest4x2);
        answer = "";
        answer = square2.toString();
        if (answer.equals("1\t2\t3\n4\t5\t6\n-1\t-1\t-1\n"))
            System.out.println("OK");
        else
            System.out.println("Error - your square:\n" + square2 + "\nExpect:\n 1\t2\t3\n4\t5\t6\n-1\t-1\t-1\n");
            
        
        System.out.print("test #7: arr1x4:.....");
        square2 = new Square3x3(arrTest1x4);
        answer = "";
        answer = square2.toString();
        if (answer.equals("1\t-1\t-1\n2\t-1\t-1\n3\t-1\t-1\n"))
            System.out.println("OK");
        else
            System.out.println("Error - your square:\n" + square2 + "\nExpect:\n 1\t-1\t-1\n2\t-1\t-1\n3\t-1\t-1\n");
        
        
        System.out.print("test #8 arr3x2x1:....");
        square2 = new Square3x3(arrTest3x2x1);
        answer = "";
        answer = square2.toString();
        if (answer.equals("1\t2\t3\n4\t5\t-1\n7\t-1\t-1\n"))
            System.out.println("OK");
        else
            System.out.println("Error - your square:\n" + square2 + "\nExpect:\n 1\t2\t3\n4\t5\t-1\n7\t-1\t-1\n");
        
        
        System.out.print("test #9 arr1x3x2:....");
        square2 = new Square3x3(arrTest1x3x2);
        answer = "";
        answer = square2.toString();
        if (answer.equals("1\t-1\t-1\n4\t5\t6\n7\t8\t-1\n"))
            System.out.println("OK");
        else
            System.out.println("Error - your square:\n" + square2 + "\nExpect:\n 1\t-1\t-1\n4\t5\t6\n7\t8\t-1\n");
            
        
        
        System.out.print("\nThird constructur test (copy):.....");
        Square3x3 square3 = new Square3x3(square2);
        answer = "";
        answer = square3.toString();
        if (answer.equals("1\t-1\t-1\n4\t5\t6\n7\t8\t-1\n"))
            System.out.println("OK");
        else
            System.out.println("Error - your square:\n" + square3 + "\nExpect:\n 1\t-1\t-1\n4\t5\t6\n7\t8\t-1\n");
        
        square3= new Square3x3(arrTest3x3);
                            
        //*******************************************************************
        System.out.println("\n\nMethods test");
        System.out.println("------------\n");
        
        //*************************************
        System.out.println("getCell Methods");
        System.out.println("---------------");
        
        System.out.print("All cells:.........");
        answer = "";
        for (int i=0; i<3; i++)
            for(int j=0; j<3; j++)
                answer += square3.getCell(i,j) + " ";

        if (answer.equals("1 2 3 4 5 6 7 8 9 "))
            System.out.println("OK");
        else
            System.out.println("Error - your square: " + answer + "\nExpect:\n 1 2 3 4 5 6 7 8 9\n");
        
        
        System.out.print("outband row\\col:...");
        answer = "";
        answer = square3.getCell(-1,1) + " " + square3.getCell(3,1) + " " +
                 square3.getCell(1,-1) + " " + square3.getCell(1,3) + " " +
                 square3.getCell(-1,-1) + " " + square3.getCell(-1,3) + " " +
                 square3.getCell(3,-1) + " " + square3.getCell(3,3);
        if (answer.equals("-1 -1 -1 -1 -1 -1 -1 -1"))
            System.out.println("OK");
        else
            System.out.println("Error - your square: " + answer + "\nExpect:\n -1 -1 -1 -1 -1 -1 -1 -1\n\n");         
        
        
        //*************************************
        System.out.println("\n*************************************************************************************");
        System.out.println("!!!!!One of the two following tests should get Error and the other should be OK !!!!!");
        System.out.println("*************************************************************************************");
        System.out.print("setXY test #1 - without valid digit check:......");
        square1.setXY(0, 0, 1);
        square1.setXY(1, 1, 2);
        square1.setXY(2, 2, 3);
        square1.setXY(0, 2, 4);
        square1.setXY(2, 0, 5);
        square1.setXY(0, 1, 6);
        square1.setXY(1, 2, 7);
        square1.setXY(1, 0, -3);
        square1.setXY(2, 1, 10);
        square1.setXY(-1, 3, 1);
        square1.setXY(3, -1, 2);
        square1.setXY(-1, 1, 3);
        square1.setXY(3, 1, 4);
        square1.setXY(0, -1, 5);
        square1.setXY(0, 3, 6);
        
        answer = "";
        answer = square1.toString();
        if (answer.equals("1\t6\t4\n-3\t2\t7\n5\t10\t3\n"))
            System.out.println("OK");
        else
            System.out.println("Error - your square: " + square1 + "\nExpect:\n 1\t6\t4\n-3\t2\t7\n5\t10\t3\n");         
        
        System.out.print("setXY test #2- with valid digit check:......");
        if (answer.equals("1\t6\t4\n-1\t2\t7\n5\t-1\t3\n"))
            System.out.println("OK");
        else
            System.out.println("Error - your square:\n" + square1 + "\nExpect:\n 1\t6\t4\n-1\t2\t7\n5\t-1\t3\n");          
                            
        //*************************************
        System.out.print("\nallThere Test #1:.....");
        if (!square1.allThere())
            System.out.println("OK");
        else
            System.out.println("Error - your allThere: " + square1.allThere() + "Expect: false");
        
        System.out.print("allThere Test #2:.....");
        if (square3.allThere())
            System.out.println("OK");
        else
            System.out.println("Error - your allThere: " + square3.allThere() + "Expect: true");
        
        
        //*************************************
        boolean[] digits = new boolean[10];
        boolean flag = true;
        System.out.print("\nwhosThereRow Test #1 :.....");
        for(int i=0; i<3; i++)
            square3.whosThereRow(i, digits);
        
        for(int i=1; i<10 && flag; i++)
            if (!digits[i])
                flag = false;
        
        if(flag)
        System.out.println("OK");
        else
            System.out.println("Error - your whosThereRow: " + flag + "Expect: true");
        
        for(int i=1; i<10; i++)
            digits[i] = false;
        flag = true;
        
        System.out.print("whosThereRow Test #2 :.....");
        for(int i=0; i<3; i++)
            square1.whosThereRow(i, digits);
        
        for(int i=1; i<10 && flag; i++)
            if (!digits[i])
                flag = false;
        
        if(!flag)
        System.out.println("OK");
        else
            System.out.println("Error - your whosThereRow: " + flag + "Expect: false");
        
        for(int i=1; i<10; i++)
            digits[i] = false;
        flag = true;
        
        //*************************************
        System.out.print("\nwhosThereCol Test #1:.....");
        
        for(int i=0; i<3; i++)
            square3.whosThereCol(i, digits);
        
        for(int i=1; i<10 && flag; i++)
            if (!digits[i])
                flag = false;
        
        if(flag)
        System.out.println("OK");
        else
            System.out.println("Error - your whosThereRow: " + flag + "Expect: true");
        
        for(int i=1; i<10; i++)
            digits[i] = false;
        flag = true;
        
        System.out.print("whosThereCol Test #2:.....");
        
        for(int i=0; i<3; i++)
            square1.whosThereCol(i, digits);
        
        for(int i=1; i<10 && flag; i++)
            if (!digits[i])
                flag = false;
        
        if(!flag)
        System.out.println("OK");
        else
            System.out.println("Error - your whosThereRow: " + flag + "Expect: false");
    }  
}//End of class