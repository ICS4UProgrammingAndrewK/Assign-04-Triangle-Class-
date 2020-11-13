import java.util.*;
import java.lang.Math;
public class myTriangle {

  private double sideLength1;
  private double sideLength2;
  private double sideLength3;

  public TriangleClass() {
    sideLength1 = 1;
    sideLength2 = 2;
    sideLength3 = 3;
  }
  public void SetSide(double sideLength1, double sideLength2, double sideLength3) {
    sideLength1 = sideA;
    sideLength2 = sideB;
    sideLength3 = sideC;
  }
  
  public double SemiPerimeter() {
    
    //declare var
    double SemiPerimeter = 0;
    
    //calculate SemiPerimeter
    SemiPerimeter = (sideLength1 + sideLength2 + sideLength3) /2;
    
    // this return the SemiPerimeter
    return SemiPerimeter;
  }
  
  public double Area(double SemiPerimeter) {
    
    //declare var
    double Area = 0;
    
    //calculate Area per
    Area = Math.sqrt (sideLength1 + sideLength2 + sideLength3);
    return Area; 
  }
  
  public double Triangle(Sides) {
    if (sideLength1 > sideLength2 & sideLength1 > sideLength3) {
      double longestSide - sideLength1;
      
    } else if (sideLength2 > sideLength1 & sideLength2 > sideLength3) {
      double longestSide = sideLength2;
      
    } else {
      double longestSide = sideLength3;
    }
  }
  
  public String Name() {
    String name = "";
    
    if (sideLength3 == sideLength1 && sideLength3 == sideLength2) {
      name = "Equilateral Triangle";
        
    } else if (sideLength3 == sideLength2 || sideLength3 == sideLength2 || sideLength1 == sideLength2) {
      name = "Isosceles Triangle";
        
    } else  {
      name = "Scalene Triangle";
    }
      return name;
    }
  }
  
}