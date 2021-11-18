/**  kilroy             
 *               _____   here
 *         was  /     \    
 *     ____    /(.) (.)\    ____
 * ---/    \------| |------/    \---
 *    |/\/\/      | |      |/\/\/
 *                \_/  
 *   created by B.A.
 *   version: v1.2
 */

import java.util.Scanner;
public class RectangleATest
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int xPoint = 0, yPoint = 0, width = 0, height = 0;
        
        Point p1 = new Point(3, 2);
        Point sw;
        Point ne;
        Point tempP;
        
        
        //********************************************************************
        System.out.println("Constructur Test");
        System.out.println("----------------");
        
        System.out.println("first constructur check");
        System.out.println("-----------------------");
        
        RectangleA rec1 = new RectangleA(0, 0);
        System.out.println("Invalid width and height:");
        System.out.println("Your rec: " + rec1);
        System.out.println("Currect : Width=1 Height=1 PointSW=(0,0)\n");
        
        rec1 = new RectangleA(2, 0);
        System.out.println("Invalid height:");
        System.out.println("Your rec: " + rec1);
        System.out.println("Currect : Width=2 Height=1 PointSW=(0,0)\n");
        
        rec1 = new RectangleA(0, 2);
        System.out.println("Invalid width:");
        System.out.println("Your rec: " + rec1);
        System.out.println("Currect : Width=1 Height=2 PointSW=(0,0)\n");
        
        rec1 = new RectangleA(2, 2);
        System.out.println("Valid width and height:");
        System.out.println("Your rec: " + rec1);
        System.out.println("Currect : Width=2 Height=2 PointSW=(0,0)" + "\n\n");
        
        //********************************************************************
        System.out.println("secound constructur check");
        System.out.println("-------------------------");
        
        RectangleA rec2 = new RectangleA(p1, 0, 0);
        System.out.println("Invalid width and height:");
        System.out.println("Your rec: " + rec2);
        System.out.println("Currect : Width=1 Height=1 PointSW=(3,2)\n");
        
        rec2 = new RectangleA(p1, 2, 0);
        System.out.println("Invalid height:");
        System.out.println("Your rec: " + rec2);
        System.out.println("Currect : Width=2 Height=1 PointSW=(3,2)\n");
        
        rec2 = new RectangleA(p1, 0, 2);
        System.out.println("Invalid width:");
        System.out.println("Your rec: " + rec2);
        System.out.println("Currect : Width=1 Height=2 PointSW=(3,2)\n");
        
        rec2 = new RectangleA(p1, 2, 2);
        System.out.println("Valid width and height:");
        System.out.println("Your rec: " + rec2);
        System.out.println("Currect : Width=2 Height=2 PointSW=(3,2)" + "\n\n");
               
        
        //*********************************************************************
        System.out.println("third constructur check");
        System.out.println("-----------------------");
        sw = new Point(1, 3);
        ne = new Point(3, 7);
        
        RectangleA rec3 = new RectangleA(sw, ne);
        
        System.out.println("Your rec: " + rec3);
        System.out.println("Currect : Width=2 Height=4 PointSW=(1,3)" + "\n\n");
        
        
        //*********************************************************************
        System.out.println("fourth constructur check - copy counstructur");
        System.out.println("--------------------------------------------");
        
        RectangleA rec4 = new RectangleA(rec3);
        
        System.out.println("Your rec: " + rec4);
        System.out.println("Currect : Width=2 Height=4 PointSW=(1,3)" + "\n\n\n");
        
        
        //*********************************************************************
        System.out.println("Methods Test");
        System.out.println("------------\n");
        
    
        System.out.println("getWidth & getHeight");
        System.out.println("--------------------");
        System.out.println("Rec info: " + rec1);
        System.out.println("getWidth: " + rec1.getWidth());
        System.out.println("getHeight: " + rec1.getHeight() + "\n\n");
        
        
        //*********************************
        System.out.println("setWidth & setHeight");
        System.out.println("--------------------");
        System.out.println("Rec info: " + rec1);
        rec1.setWidth(0);
        System.out.println("Invalid width.\nYour width: " + rec1.getWidth() + " Currect width: 2");
        rec1.setWidth(3);
        System.out.println("Valid width.\nYour width: " + rec1.getWidth() + " Currect width: 3");
        rec1.setHeight(0);
        System.out.println("Invalid height.\nYour height: " + rec1.getHeight() + " Currect height: 2");
        rec1.setHeight(3);
        System.out.println("Valid height.\nYour height: " + rec1.getHeight() + " Currect height: 3\n\n");
        
        
        //*********************************
        System.out.println("getPointSW & setPointSW");
        System.out.println("---------------");
        tempP = new Point(3, 7);
        rec1.setPointSW(tempP);
        System.out.println("Your pointSW: " + rec1.getPointSW());
        System.out.println("Currect pointSW: (3,7)\n\n");
        
       
        
        //initial rec1
        sw = new Point(3,2);
        rec1 = new RectangleA(sw, 3, 4);
        
        System.out.println("getPointNE");
        System.out.println("----------");
        System.out.println("Your pointNE: " + rec1.getPointNE());
        System.out.println("Currect pointNE: (6,6)\n\n");
        
        
        //*********************************
        System.out.println("getPerimeter");
        System.out.println("------------");
        System.out.println("Your perimeter: " + rec1.getPerimeter());
        System.out.println("Currect perimeter: 14\n\n");

        
        //*********************************
        System.out.println("getArea");
        System.out.println("-------");
        System.out.println("Your Area: " + rec1.getArea());
        System.out.println("Currect Area: 12\n\n");
        
        
        //*********************************
        System.out.println("move (+3, +4)");
        System.out.println("-------------");
        System.out.println("Current pointSW: " + rec1.getPointSW());
        rec1.move(3, 4);
        System.out.println("Your pointSW: " + rec1.getPointSW());
        System.out.println("Currect pointSW: (6,6)\n\n");

        
        //initial rec2
        sw = new Point(4, 3);
        ne = new Point(6, 5);
        rec2 = new RectangleA(sw, ne);
        
        
        System.out.println("equals");
        System.out.println("------");
        System.out.println("Your answer: " + rec1.equals(rec2));
        System.out.println("Currect answer: false\n");
        System.out.println("Your answer: " + rec3.equals(rec4));
        System.out.println("Currect answer: true \n\n");
        
        
        //*********************************
        System.out.println("getDiagonalLength");
        System.out.println("-----------------");
        System.out.println("Diagonal: " + rec1.getDiagonalLength());
        System.out.println("currect answer: 5.0 \n\n");
        
        
        //*********************************
        System.out.println("isLarger");
        System.out.println("--------");
        System.out.println("Your answer: " + rec1.isLarger(rec2));
        System.out.println("currect answer: true\n");
        System.out.println("Your answer: " + rec3.isLarger(rec4));
        System.out.println("currect answer: false \n\n");
        
        
        //*********************************
        System.out.println("changeSides");
        System.out.println("-----------");
        System.out.println("Current rec: " + rec1);
        rec1.changeSides();
        System.out.println("Your rec: " + rec1);
        System.out.println("currect answer: Width=4 Height=3 PointSW=(6,6)\n\n");
                
        
        //***************************************************
        //rec to compare
        sw = new Point(4, 4);
        ne = new Point(7, 8);
        RectangleA origin = new RectangleA(sw, ne);
        
        //common vertex 
        sw = new Point(2, 8);
        ne = new Point(4, 9);
        rec1 = new RectangleA(sw, ne);
        
        sw = new Point(7, 8);
        ne = new Point(9, 9);
        rec2 = new RectangleA(sw, ne);
        
        sw = new Point(7, 3);
        ne = new Point(9, 4);
        rec3 = new RectangleA(sw, ne);
        
        sw = new Point(2, 3);
        ne = new Point(4, 4);
        rec4 = new RectangleA(sw, ne);
        
        
        System.out.println("Common vertexs rectangle");
        System.out.println("------------------------");
        System.out.println("isIn");
        System.out.println("----");
        System.out.println("Yours answer: " + rec1.isIn(origin) + " " + rec2.isIn(origin) + " " + rec3.isIn(origin) + " " + rec4.isIn(origin));
        System.out.println("Currect answer: false false false false\n");
        System.out.println("overleap");
        System.out.println("--------");
        System.out.println("Yours answer: " + rec1.overlap(origin) + " " + rec2.overlap(origin) + " " + rec3.overlap(origin) + " " + rec4.overlap(origin));
        System.out.println("Currect answer: true true true true\n\n");
        
        
        //common sides
        sw = new Point(4, 8);
        ne = new Point(6, 11);
        rec1 = new RectangleA(sw, ne);
        
        sw = new Point(7, 7);
        ne = new Point(10, 9);
        rec2 = new RectangleA(sw, ne);
        
        sw = new Point(5, 2);
        ne = new Point(6, 4);
        rec3 = new RectangleA(sw, ne);
        
        sw = new Point(2, 4);
        ne = new Point(4, 8);
        rec4 = new RectangleA(sw, ne);
        
        
        System.out.println("Common sides rectangle");
        System.out.println("------------------------");
        System.out.println("isIn");
        System.out.println("----");
        System.out.println("Yours answer: " + rec1.isIn(origin) + " " + rec2.isIn(origin) + " " + rec3.isIn(origin) + " " + rec4.isIn(origin));
        System.out.println("Currect answer: false false false false\n");
        System.out.println("overleap");
        System.out.println("--------");
        System.out.println("Yours answer: " + rec1.overlap(origin) + " " + rec2.overlap(origin) + " " + rec3.overlap(origin) + " " + rec4.overlap(origin));
        System.out.println("Currect answer: true true true true\n\n");
        
        
        //Half inside
        sw = new Point(3, 7);
        ne = new Point(5, 10);
        rec1 = new RectangleA(sw, ne);
        
        sw = new Point(6, 5);
        ne = new Point(9, 7);
        rec2 = new RectangleA(sw, ne);
        
        sw = new Point(4, 3);
        ne = new Point(7, 5);
        rec3 = new RectangleA(sw, ne);
        
        sw = new Point(6, 3);
        ne = new Point(8, 9);
        rec4 = new RectangleA(sw, ne);
        
        System.out.println("half inside rectangle");
        System.out.println("------------------------");
        System.out.println("isIn");
        System.out.println("----");
        System.out.println("Yours answer: " + rec1.isIn(origin) + " " + rec2.isIn(origin) + " " + rec3.isIn(origin) + " " + rec4.isIn(origin));
        System.out.println("Currect answer: false false false false\n");
        System.out.println("overleap");
        System.out.println("--------");
        System.out.println("Yours answer: " + rec1.overlap(origin) + " " + rec2.overlap(origin) + " " + rec3.overlap(origin)  + " " + rec4.overlap(origin));
        System.out.println("Currect answer: true true true true\n\n");
        
        
        //full inside
        sw = new Point(4, 7);
        ne = new Point(5, 8);
        rec1 = new RectangleA(sw, ne);
        
        sw = new Point(5, 5);
        ne = new Point(6, 7);
        rec2 = new RectangleA(sw, ne);
        
        sw = new Point(6, 4);
        ne = new Point(7, 5);
        rec3 = new RectangleA(sw, ne);
        
        sw = new Point(4, 4);
        ne = new Point(7, 8);
        rec4 = new RectangleA(sw, ne);
        
        
        System.out.println("Full inside rectangle");
        System.out.println("---------------------");
        System.out.println("isIn");
        System.out.println("----");
        System.out.println("Yours answer: " + rec1.isIn(origin) + " " + rec2.isIn(origin) + " " + rec3.isIn(origin) + " " + rec4.isIn(origin));
        System.out.println("Currect answer: true true true true\n");
        
        System.out.println("overleap");
        System.out.println("--------");
        System.out.println("Yours answer: " + rec1.overlap(origin) + " " + rec2.overlap(origin) + " " + rec3.overlap(origin) + " " + rec4.overlap(origin));
        System.out.println("Currect answer: true true true true\n\n");
        
         
        //uncommon
        sw = new Point(1, 9);
        ne = new Point(3, 11);
        rec1 = new RectangleA(sw, ne);
        
        sw = new Point(8, 8);
        ne = new Point(10, 10);
        rec2 = new RectangleA(sw, ne);
        
        sw = new Point(8, 1);
        ne = new Point(10, 3);
        rec3 = new RectangleA(sw, ne);
        
        sw = new Point(0, 0);
        ne = new Point(2, 2);
        rec4 = new RectangleA(sw, ne);
        
        
        System.out.println("Uncommon");
        System.out.println("--------");
        System.out.println("isIn");
        System.out.println("----");
        System.out.println("Yours answer: " + rec1.isIn(origin) + " " + rec2.isIn(origin) + " " + rec3.isIn(origin) + " " + rec4.isIn(origin));
        System.out.println("Currect answer: false false false false\n");
        
        System.out.println("overleap");
        System.out.println("--------");
        System.out.println("Yours answer: " + rec1.overlap(origin) + " " + rec2.overlap(origin) + " " + rec3.overlap(origin) + " " + rec4.overlap(origin));
        System.out.println("Currect answer: false false false false\n\n");
        
        
        
        //overlap
        sw = new Point(3, 3);
        ne = new Point(8, 9);
        rec1 = new RectangleA(sw, ne);
        
        System.out.println("Larger rectangle");
        System.out.println("----------------");
        System.out.println("isIn");
        System.out.println("----");
        System.out.println("yours answer: " + rec1.isIn(origin));
        System.out.println("currect answer: false \n");
        
        System.out.println("Overleap");
        System.out.println("--------");
        System.out.println("Yours answer: " + rec1.overlap(origin));
        System.out.println("Currect answer: true");
    }
}