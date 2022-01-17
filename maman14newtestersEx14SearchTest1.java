
/**
 *  Harel Erlich
 *  15/12/2021
 */
public class maman14newtestersEx14SearchTest1 extends Ex14 {
    public static void main (String [] args) {
        //check array size 8x8 
        String ans = "";
        int [][] array1 = new int [][] {{1,2,5,6,17,18,21,22},{4,3,8,7,20,19,24,23},{13,14,9,10,29,30,25,26},{16,15,12,11,32,31,28,27},
                                     {49,50,53,54,33,34,37,38},{52,51,56,55,36,35,40,39},{61,62,57,58,45,46,41,42},{64,63,60,59,48,47,44,43}};
        System.out.println ("**search test 1**\n**time complexity should be O(log n)**\n");
        System.out.println ("**array size 8x8**\n");
        
        String s = "";
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (j == array1.length - 1) {//end of the row
                    s += array1[i][j] + "\n";
                }    
                else { 
                    s += array1[i][j] + " ";
                }
            }   
        }
        
        System.out.println (s);
        
        if (search(array1,3) == true) {
            System.out.println ("Number: 3 --- OK\n");
        }
        else {
            System.out.println ("Number: 3 ---ERROR\n");
        }
        
        if (search(array1,15) == true) {
            System.out.println ("Number: 15 ---OK\n");
        }
        else {
            System.out.println ("Number: 15 ---ERROR\n");
        }
        
        if (search(array1,19) == true) {
            System.out.println ("Number: 19 ---OK\n");
        }
        else {
            System.out.println ("Number: 19 ---ERROR\n");
        }
        
        if (search(array1,22) == true) {
            System.out.println ("Number: 22 ---OK\n");
        }
        else {
            System.out.println ("Number: 22 ---ERROR\n");
        }
        
        if (search(array1,7) == true) {
            System.out.println ("Number: 7 ---OK\n");
        }
        else {
            System.out.println ("Number: 7 ---ERROR\n");
        }
        
        if (search(array1,24) == true) {
            System.out.println ("Number: 24 ---OK\n");
        }
        else {
            System.out.println ("Number: 24 ---ERROR\n");
        }
        
        if (search(array1,28) == true) {
            System.out.println ("Number: 28 ---OK\n");
        }
        else {
            System.out.println ("Number: 28 ---ERROR\n");
        }
        
        if (search(array1,32) == true) {
            System.out.println ("Number: 32 ---OK\n");
        }
        else {
            System.out.println ("Number: 32 ---ERROR\n");
        }
        
        if (search(array1,49) == true) {
            System.out.println ("Number: 49 ---OK\n");
        }
        else {
            System.out.println ("Number: 49 ---ERROR\n");
        }
        
        if (search(array1,56) == true) {
            System.out.println ("Number: 56 ---OK\n");
        }
        else {
            System.out.println ("Number: 56 ---ERROR\n");
        }
        
        if (search(array1,57) == true) {
            System.out.println ("Number: 57 ---OK\n");
        }
        else {
            System.out.println ("Number: 57 ---ERROR\n");
        }
        
        if (search(array1,34) == true) {
            System.out.println ("Number: 34 ---OK\n");
        }
        else {
            System.out.println ("Number: 34 ---ERROR\n");
        }
        
        if (search(array1,40) == true) {
            System.out.println ("Number: 40 ---OK\n");
        }
        else {
            System.out.println ("Number: 40 ---ERROR\n");
        }
        
        if (search(array1,43) == true) {
            System.out.println ("Number: 43 ---OK\n");
        }
        else {
            System.out.println ("Number: 43 ---ERROR\n");
        }
        
        if (search(array1,48) == true) {
            System.out.println ("Number: 48 ---OK\n");
        }
        else {
            System.out.println ("Number: 48 ---ERROR\n");
        }
        
        if (search(array1,60) == true) {
            System.out.println ("Number: 60 ---OK\n");
        }
        else {
            System.out.println ("Number: 60 ---ERROR\n");
        }
        
        if (search(array1,64) == true) {
            System.out.println ("Number: 64 ---OK\n");
        }
        else {
            System.out.println ("Number: 64 ---ERROR\n");
        }
        
        if (search(array1,0) == false) {
            System.out.println ("Number: 0 ---OK\n");
        }
        else {
            System.out.println ("Number: 0 ---ERROR\n");
        }
        
        if (search(array1,65) == false) {
            System.out.println ("Number: 65 ---OK\n");
        }
        else {
            System.out.println ("Number: 65 ---ERROR\n");
        }
        
        //check array size 4x4 
        int [][] array2 = new int [][] {{1,2,5,6}, {4,3,8,7}, {13,14,9,10}, {16,15,12,11}};
        System.out.println ("**array size 4x4**\n");
        
        String s2 = "";
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (j == array2.length - 1) {//end of the row
                    s2 += array2[i][j] + "\n";
                }    
                else { 
                    s2 += array2[i][j] + " ";
                }
            }   
        }
        
        System.out.println (s2);
        
        if (search(array2,8) == true) {
            System.out.println ("Number: 8 ---OK\n");
        }
        else {
            System.out.println ("Number: 8 ---ERROR\n");
        }
        
        if (search(array2,1) == true) {
            System.out.println ("Number: 1 ---OK\n");
        }
        else {
            System.out.println ("Number: 1 ---ERROR\n");
        }
        
        if (search(array2,12) == true) {
            System.out.println ("Number: 12 ---OK\n");
        }
        else {
            System.out.println ("Number: 12 ---ERROR\n");
        }
        
        if (search(array2,16) == true) {
            System.out.println ("Number: 16 ---OK\n");
        }
        else {
            System.out.println ("Number: 16 ---ERROR\n");
        }
        
        if (search(array2,11) == true) {
            System.out.println ("Number: 11 ---OK\n");
        }
        else {
            System.out.println ("Number: 11 ---ERROR\n");
        }
        
        if (search(array2,4) == true) {
            System.out.println ("Number: 4 ---OK\n");
        }
        else {
            System.out.println ("Number: 4 ---ERROR\n");
        }
        
        if (search(array2,0) == false) {
            System.out.println ("Number: 0 ---OK\n");
        }
        else {
            System.out.println ("Number: 0 ---ERROR\n");
        }
        
        if (search(array2,17) == false) {
            System.out.println ("Number: 17 ---OK\n");
        }
        else {
            System.out.println ("Number: 17 ---ERROR\n");
        }
        
        //check array size 2x2
        int [][] array3 = new int [][] {{1,2}, {4,3}};
        System.out.println ("**array size 2x2**\n");
        
        String s3 = "";
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3.length; j++) {
                if (j == array3.length - 1) {//end of the row
                    s3 += array3[i][j] + "\n";
                }    
                else { 
                    s3 += array3[i][j] + " ";
                }
            }   
        }
        
        System.out.println (s3);
        
        if (search(array3,1) == true) {
            System.out.println ("Number: 1 ---OK\n");
        }
        else {
            System.out.println ("Number: 1 ---ERROR\n");
        }
        
        if (search(array3,2) == true) {
            System.out.println ("Number: 2 ---OK\n");
        }
        else {
            System.out.println ("Number: 2 ---ERROR\n");
        }
        
        if (search(array3,3) == true) {
            System.out.println ("Number: 3 ---OK\n");
        }
        else {
            System.out.println ("Number: 3 ---ERROR\n");
        }
        
        if (search(array3,4) == true) {
            System.out.println ("Number: 4 ---OK\n");
        }
        else {
            System.out.println ("Number: 4 ---ERROR\n");
        }
        
        if (search(array3,0) == false) {
            System.out.println ("Number: 0 ---OK\n");
        }
        else {
            System.out.println ("Number: 0 ---ERROR\n");
        }
        
        if (search(array3,5) == false) {
            System.out.println ("Number: 5 ---OK\n");
        }
        else {
            System.out.println ("Number: 5 ---ERROR\n");
        }
    }
}