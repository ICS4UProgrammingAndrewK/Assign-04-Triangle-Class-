import java.util.*;
/**
 * Class Untitled
 */
public class TriangleMain {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    
    //call my triangle
    TriangleClass triangleClass = new TriangleClass();
    
    //this
    System.out.println("Enter the first length: ");
    double sideLength1 = userInput.nextDouble();
    
    System.out.println("Enter the second length: ");
    double sideLength2 = userInput.nextDouble();
    
    System.out.println("Enter the third length: ");
    double sideLength3 = userInput.nextDouble();
    mytriangle.SetSide(sideLength1,sideLength2,sideLength3);
    
    double SemiPerimeter = Triangle.SemiPerimeter();
    
    // Display
    System.out.println("The SemiPerimeter is" + SemiPerimeter + "units");
    System.out.println("The Area is:" + TriangleClass.Area(SemiPerimeter));
    myTriangle();
  }
}