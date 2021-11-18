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

public class PointTest
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int xPoint, yPoint;
        Point p1, p2, p3, p4, p5, p6, p7;
        
        p1 = new Point(1, 2);
        
        
        System.out.println("Constructur Test");
        System.out.println("----------------");
        
        System.out.println("first constructur check");
        System.out.println("-----------------------");
        
        System.out.println("Your point: " + p1);
        System.out.println("Currect point: (1,2)\n\n");
        
        
        //**********************************************
        System.out.println("secound constructur check - copy constractor");
        System.out.println("--------------------------------------------");
        
        p2 = new Point(p1);
        System.out.println("Your point: " + p2);
        System.out.println("Currect point: (1,2)\n\n");
        
        
        //**********************************************
        System.out.println("Methods Test");
        System.out.println("------------\n");
        
        System.out.println("get Methods");
        System.out.println("-----------\n");
        System.out.println("Your X: " + p1.getX());
        System.out.println("Currect X: 1");
        System.out.println("Your Y: " + p1.getY());
        System.out.println("Currect Y: 2");
    
        
        //**********************************************
        System.out.println("set Methods");
        System.out.println("-----------\n");
        p2.setX(3);
        p2.setY(4);
        System.out.println("Your set point: " + p2);
        System.out.println("Currect set point: (3,4)\n\n");
        
        
        //**********************************************
        System.out.println("equals method");
        System.out.println("-------------");
        
        p2 = new Point(p1);
        System.out.println("Valid: " + p1.equals(p2));
        p2.setX(3);
        System.out.println("Invalid X: " + p1.equals(p2));
        p2.setX(1);
        p2.setY(4);
        System.out.println("Invalid Y: " + p1.isAbove(p2));
        p2.setX(3);
        System.out.println("Invalid X & Y: " + p1.isAbove(p2) + "\n\n");
        
        
        //**********************************************
        p1 = new Point(2, 2);
        p2 = new Point(1, 2);
        p3 = new Point(1, 1);
        p4 = new Point(2, 1);
        p5 = new Point(3, 2);
        p6 = new Point(3, 3);
        p7 = new Point(2, 3);
        
        System.out.println("isUnder method");
        System.out.println("--------------");
        System.out.println("Your method: " + p1.isUnder(p2) + " "  + p1.isUnder(p3) + " " + p1.isUnder(p4) + " " + p1.isUnder(p5) + " " + p1.isUnder(p6) + " " + p1.isUnder(p7));
        System.out.println("Cureect method: false false false false true true\n");
        
        System.out.println("isAbove method");
        System.out.println("--------------");
        System.out.println("Your method: " + p1.isAbove(p2) + " "  + p1.isAbove(p3) + " " + p1.isAbove(p4) + " " + p1.isAbove(p5) + " " + p1.isAbove(p6) + " " + p1.isAbove(p7));
        System.out.println("Cureect method: false true true false false false\n");
        
        System.out.println("isLeft method");
        System.out.println("--------------");
        System.out.println("Your method: " + p1.isLeft(p2) + " "  + p1.isLeft(p3) + " " + p1.isLeft(p4) + " " + p1.isLeft(p5) + " " + p1.isLeft(p6) + " " + p1.isLeft(p7));
        System.out.println("Cureect method: false false false true true false\n");
        
        System.out.println("isRight method");
        System.out.println("--------------");
        System.out.println("Your method: " + p1.isRight(p2) + " "  + p1.isRight(p3) + " " + p1.isRight(p4) + " " + p1.isRight(p5) + " " + p1.isRight(p6) + " " + p1.isRight(p7));
        System.out.println("Cureect method: true true false false false false\n\n");
        
        
        //**********************************************
        System.out.println("move method (+3 +4)");
        System.out.println("-------------------");
        System.out.println("Point position: " + p1);
    
        p1.move(3, 4);
        System.out.println("Point new location: " + p1);
        
        
        //**********************************************
        System.out.println("\n\ndistance method");
        System.out.println("---------------");
        p1 = new Point(2, 2);
        p2 = new Point(5, 6);
        System.out.println("Your Distance: " + p1.distance(p2));
        System.out.println("Currect Distance: 5.0");
        
    }
}//End of class