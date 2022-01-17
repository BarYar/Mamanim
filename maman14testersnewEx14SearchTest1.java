
/**
 *  Harel Erlich
 *  15/12/2021
 *    ███████████████████████████████
             ▀█▄▀▄▀████▀   ▀█▄▀▄▀████▀
               ▀█▄█▄█▀        ▀█▄█▄█▀
 */
public class maman14testersnewEx14SearchTest1 extends Ex14 {
    public static void main (String [] args) {
        System.out.println ("**search test **\n**time complexity should be O(log n), space complexity should be O(1)**\n");
        System.out.println ("**array size 16x16**\n");
        //check array size 16x16
        int [][] array4 = {{1,2,5,6,17,18,21,22,65,66,69,70,81,82,85,86},
                            {4,3,8,7,20,19,24,23,68,67,72,71,84,83,88,87},
                            {13,14,9,10,29,30,25,26,77,78,73,74,93,94,89,90},
                            {16,15,12,11,32,31,28,27,80,79,76,75,96,95,92,91},
                            {49,50,53,54,33,34,37,38,113,114,117,118,97,98,101,102},
                            {52,51,56,55,36,35,40,39,116,115,120,119,100,99,104,103},
                            {61,62,57,58,45,46,41,42,125,126,121,122,109,110,105,106},
                            {64,63,60,59,48,47,44,43,128,127,124,123,112,111,108,107},
                            {211,212,215,216,227,228,231,232,129,130,151,152,163,164,167,168},
                            {214,213,218,217,230,229,234,233,150,140,154,153,166,165,170,169},
                            {223,224,219,220,239,240,235,236,159,160,155,156,175,176,171,172},
                            {226,225,222,221,242,241,238,237,162,161,158,157,178,177,174,173},
                            {259,260,263,264,243,244,247,248,195,196,199,200,179,180,183,184},
                            {262,261,266,265,246,245,250,249,198,197,202,201,182,181,186,185},
                            {271,272,267,268,255,256,251,252,207,208,203,204,191,192,187,188},
                            {274,273,270,269,258,257,254,253,210,209,206,205,194,193,190,189}};
                            
        String s4 = "";
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4.length; j++) {
                if (j == array4.length - 1) {//end of the row
                    s4 += array4[i][j] + "\n";
                }    
                else { 
                    s4 += array4[i][j] + " ";
                }
            }   
        }    
        
        System.out.println (s4);
        
        if (search(array4,257)) {
            System.out.println ("Number: 257 --- OK\n");
        }
        else {
            System.out.println ("Number: 257 ---ERROR\n");
        }
        
        if (search(array4,158)) {
            System.out.println ("Number: 158 ---OK\n");
        }
        else {
            System.out.println ("Number: 158 ---ERROR\n");
        }
        
        if (search(array4,191)) {
            System.out.println ("Number: 191 ---OK\n");
        }
        else {
            System.out.println ("Number: 191 ---ERROR\n");
        }
        
        if (search(array4,22)) {
            System.out.println ("Number: 22 ---OK\n");
        }
        else {
            System.out.println ("Number: 22 ---ERROR\n");
        }
        
        if (search(array4,70)) {
            System.out.println ("Number: 70 ---OK\n");
        }
        else {
            System.out.println ("Number: 70 ---ERROR\n");
        }
        
        if (search(array4,240)) {
            System.out.println ("Number: 240 ---OK\n");
        }
        else {
            System.out.println ("Number: 240 ---ERROR\n");
        }
        
        if (search(array4,228)) {
            System.out.println ("Number: 228 ---OK\n");
        }
        else {
            System.out.println ("Number: 228 ---ERROR\n");
        }
        
        if (search(array4,130)) {
            System.out.println ("Number: 130 ---OK\n");
        }
        else {
            System.out.println ("Number: 130 ---ERROR\n");
        }
        
        if (search(array4,14)) {
            System.out.println ("Number: 140 ---OK\n");
        }
        else {
            System.out.println ("Number: 140 ---ERROR\n");
        }
        
        if (search(array4,56)) {
            System.out.println ("Number: 56 ---OK\n");
        }
        else {
            System.out.println ("Number: 56 ---ERROR\n");
        }
        
        if (search(array4,5)) {
            System.out.println ("Number: 5 ---OK\n");
        }
        else {
            System.out.println ("Number: 5 ---ERROR\n");
        }
        
        if (search(array4,234)) {
            System.out.println ("Number: 234 ---OK\n");
        }
        else {
            System.out.println ("Number: 234 ---ERROR\n");
        }
        
        if (search(array4,40)) {
            System.out.println ("Number: 40 ---OK\n");
        }
        else {
            System.out.println ("Number: 40 ---ERROR\n");
        }
        
        if (search(array4,14)) {
            System.out.println ("Number: 14 ---OK\n");
        }
        else {
            System.out.println ("Number: 14 ---ERROR\n");
        }
        
        if (search(array4,98)) {
            System.out.println ("Number: 98 ---OK\n");
        }
        else {
            System.out.println ("Number: 98 ---ERROR\n");
        }
        
        if (search(array4,214)) {
            System.out.println ("Number: 214 ---OK\n");
        }
        else {
            System.out.println ("Number: 214 ---ERROR\n");
        }
        
        if (search(array4,176)) {
            System.out.println ("Number: 176 ---OK\n");
        }
        else {
            System.out.println ("Number: 176 ---ERROR\n");
        }
        
        if (search(array4,21)) {
            System.out.println ("Number: 21 --- OK\n");
        }
        else {
            System.out.println ("Number: 21 ---ERROR\n");
        }
        
        if (search(array4,15)) {
            System.out.println ("Number: 15 ---OK\n");
        }
        else {
            System.out.println ("Number: 15 ---ERROR\n");
        }
        
        if (search(array4,189)) {
            System.out.println ("Number: 189 ---OK\n");
        }
        else {
            System.out.println ("Number: 189 ---ERROR\n");
        }
        
        if (search(array4,274)) {
            System.out.println ("Number: 274 ---OK\n");
        }
        else {
            System.out.println ("Number: 274 ---ERROR\n");
        }
        
        if (search(array4,1)) {
            System.out.println ("Number: 1 ---OK\n");
        }
        else {
            System.out.println ("Number: 1 ---ERROR\n");
        }
        
        if (search(array4,86)) {
            System.out.println ("Number: 86 ---OK\n");
        }
        else {
            System.out.println ("Number: 86 ---ERROR\n");
        }
        
        if (search(array4,129)) {
            System.out.println ("Number: 129 ---OK\n");
        }
        else {
            System.out.println ("Number: 129 ---ERROR\n");
        }
        
        if (search(array4,235)) {
            System.out.println ("Number: 235 ---OK\n");
        }
        else {
            System.out.println ("Number: 235 ---ERROR\n");
        }
        
        if (!search(array4,0)) {
            System.out.println ("Number: 0 ---OK\n");
        }
        else {
            System.out.println ("Number: 0 ---ERROR\n");
        }
        
        if (!search(array4,275)) {
            System.out.println ("Number: 275 ---OK\n");
        }
        else {
            System.out.println ("Number: 275 ---ERROR\n");
        }
        
        
        //check array size 8x8 
        int [][] array1 = new int [][] {{1,2,5,6,17,18,21,22},{4,3,8,7,20,19,24,23},{13,14,9,10,29,30,25,26},{16,15,12,11,32,31,28,27},
                                     {49,50,53,54,33,34,37,38},{52,51,56,55,36,35,40,39},{61,62,57,58,45,46,41,42},{64,63,60,59,48,47,44,43}};
        
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
        
        if (search(array1,3)) {
            System.out.println ("Number: 3 --- OK\n");
        }
        else {
            System.out.println ("Number: 3 ---ERROR\n");
        }
        
        if (search(array1,15)) {
            System.out.println ("Number: 15 ---OK\n");
        }
        else {
            System.out.println ("Number: 15 ---ERROR\n");
        }
        
        if (search(array1,19)) {
            System.out.println ("Number: 19 ---OK\n");
        }
        else {
            System.out.println ("Number: 19 ---ERROR\n");
        }
        
        if (search(array1,22)) {
            System.out.println ("Number: 22 ---OK\n");
        }
        else {
            System.out.println ("Number: 22 ---ERROR\n");
        }
        
        if (search(array1,7)) {
            System.out.println ("Number: 7 ---OK\n");
        }
        else {
            System.out.println ("Number: 7 ---ERROR\n");
        }
        
        if (search(array1,24)) {
            System.out.println ("Number: 24 ---OK\n");
        }
        else {
            System.out.println ("Number: 24 ---ERROR\n");
        }
        
        if (search(array1,28)) {
            System.out.println ("Number: 28 ---OK\n");
        }
        else {
            System.out.println ("Number: 28 ---ERROR\n");
        }
        
        if (search(array1,32)) {
            System.out.println ("Number: 32 ---OK\n");
        }
        else {
            System.out.println ("Number: 32 ---ERROR\n");
        }
        
        if (search(array1,49)) {
            System.out.println ("Number: 49 ---OK\n");
        }
        else {
            System.out.println ("Number: 49 ---ERROR\n");
        }
        
        if (search(array1,56)) {
            System.out.println ("Number: 56 ---OK\n");
        }
        else {
            System.out.println ("Number: 56 ---ERROR\n");
        }
        
        if (search(array1,57)) {
            System.out.println ("Number: 57 ---OK\n");
        }
        else {
            System.out.println ("Number: 57 ---ERROR\n");
        }
        
        if (search(array1,34)) {
            System.out.println ("Number: 34 ---OK\n");
        }
        else {
            System.out.println ("Number: 34 ---ERROR\n");
        }
        
        if (search(array1,40)) {
            System.out.println ("Number: 40 ---OK\n");
        }
        else {
            System.out.println ("Number: 40 ---ERROR\n");
        }
        
        if (search(array1,43)) {
            System.out.println ("Number: 43 ---OK\n");
        }
        else {
            System.out.println ("Number: 43 ---ERROR\n");
        }
        
        if (search(array1,48)) {
            System.out.println ("Number: 48 ---OK\n");
        }
        else {
            System.out.println ("Number: 48 ---ERROR\n");
        }
        
        if (search(array1,60)) {
            System.out.println ("Number: 60 ---OK\n");
        }
        else {
            System.out.println ("Number: 60 ---ERROR\n");
        }
        
        if (search(array1,64)) {
            System.out.println ("Number: 64 ---OK\n");
        }
        else {
            System.out.println ("Number: 64 ---ERROR\n");
        }
        
        if (!search(array1,0)) {
            System.out.println ("Number: 0 ---OK\n");
        }
        else {
            System.out.println ("Number: 0 ---ERROR\n");
        }
        
        if (!search(array1,65)) {
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
        
        if (search(array2,8)) {
            System.out.println ("Number: 8 ---OK\n");
        }
        else {
            System.out.println ("Number: 8 ---ERROR\n");
        }
        
        if (search(array2,1)) {
            System.out.println ("Number: 1 ---OK\n");
        }
        else {
            System.out.println ("Number: 1 ---ERROR\n");
        }
        
        if (search(array2,12)) {
            System.out.println ("Number: 12 ---OK\n");
        }
        else {
            System.out.println ("Number: 12 ---ERROR\n");
        }
        
        if (search(array2,16)) {
            System.out.println ("Number: 16 ---OK\n");
        }
        else {
            System.out.println ("Number: 16 ---ERROR\n");
        }
        
        if (search(array2,11)) {
            System.out.println ("Number: 11 ---OK\n");
        }
        else {
            System.out.println ("Number: 11 ---ERROR\n");
        }
        
        if (search(array2,4)) {
            System.out.println ("Number: 4 ---OK\n");
        }
        else {
            System.out.println ("Number: 4 ---ERROR\n");
        }
        
        if (!search(array2,0)) {
            System.out.println ("Number: 0 ---OK\n");
        }
        else {
            System.out.println ("Number: 0 ---ERROR\n");
        }
        
        if (!search(array2,17)) {
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
        
        if (search(array3,1)) {
            System.out.println ("Number: 1 ---OK\n");
        }
        else {
            System.out.println ("Number: 1 ---ERROR\n");
        }
        
        if (search(array3,2)) {
            System.out.println ("Number: 2 ---OK\n");
        }
        else {
            System.out.println ("Number: 2 ---ERROR\n");
        }
        
        if (search(array3,3)) {
            System.out.println ("Number: 3 ---OK\n");
        }
        else {
            System.out.println ("Number: 3 ---ERROR\n");
        }
        
        if (search(array3,4)) {
            System.out.println ("Number: 4 ---OK\n");
        }
        else {
            System.out.println ("Number: 4 ---ERROR\n");
        }
        
        if (!search(array3,0)) {
            System.out.println ("Number: 0 ---OK\n");
        }
        else {
            System.out.println ("Number: 0 ---ERROR\n");
        }
        
        if (!search(array3,5)) {
            System.out.println ("Number: 5 ---OK\n");
        }
        else {
            System.out.println ("Number: 5 ---ERROR\n");
        }
        
        
        //check array size 1x1
        int [][] array5 = new int [][] {{1}};
        System.out.println ("**array size 1x1**\n");
        
        System.out.println ("1\n");
        if (search(array5,1)) {
            System.out.println ("Number: 1 ---OK\n");
        }
        else {
            System.out.println ("Number: 1 ---ERROR\n");
        }
        
        if (!search(array5,0)) {
            System.out.println ("Number: 0 ---OK\n");
        }
        else {
            System.out.println ("Number: 0 ---ERROR\n");
        }
        
        if (!search(array5,5)) {
            System.out.println ("Number: 2 ---OK\n");
        }
        else {
            System.out.println ("Number: 2 ---ERROR\n");
        }
        
    }
}//mischief managed  ¯\_(ツ)_/¯
