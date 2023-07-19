
import java.util.Scanner;

class InvalidDimensionsException extends Exception {
  public InvalidDimensionsException(String e) {
    super(e);
  }
}

abstract class shapes {
  public abstract void perimeter();

  public abstract void area();
}

class Triangle extends shapes {
  double side1, side2, side3;

  public void perimeter() {
    System.out.println("the perimeter is : " + (side1 + side2 + side3));
  }

  public void area() {
    double s = (side1 + side2 + side3) / 2;
    double area = s * (s - side1) * (s - side2) * (s - side3);
    System.out.println("the area is : " + Math.sqrt(area));
  }
}

class Rectangle extends shapes {
  double length, breadth;

  public void perimeter() {
    System.out.println("the perimeter is : " + 2 * (length + breadth));
  }

  public void area() {
    System.out.println("the area is : " + length * breadth);
  }
}

class Circle1 extends shapes {
  double radius;

  public void perimeter() {
    System.out.println("the perimeter of a circle: " + (2 * 3.14 * radius));

  }

  public void area() {
    System.out.println("the area of a circle: " + (3.14 * radius * radius));
  }
}

public class shape {
  public static void main(String args[]) throws InvalidDimensionsException {
    Scanner s = new Scanner(System.in);
    System.out.println("enter the shape");
    String a = s.nextLine();
    if (a.equalsIgnoreCase("circle")) {
      System.out.println("enter the radius");
      double r = s.nextDouble();
      Circle1 c = new Circle1();
      try {
        if (r <= 0)
          throw new InvalidDimensionsException("the entered values are not invalid");
        c.radius = r;
        c.area();
        c.perimeter();
      } catch (InvalidDimensionsException e) {
        System.out.println(e);
      }
    } else if (a.equalsIgnoreCase("rectangle")) {
      System.out.println("enter the length");
      double l = s.nextDouble();
      System.out.println("enter the breadth");
      double b = s.nextDouble();
      Rectangle R = new Rectangle();
      try {
        if (l <= 0 || b <= 0)
          throw new InvalidDimensionsException("entered values are not valid");
        R.length = l;
        R.breadth = b;
        R.area();
        R.perimeter();
      } catch (InvalidDimensionsException e) {
        System.out.println(e);
      }

    } else if (a.equalsIgnoreCase("triangle")) {
      System.out.println("enter the side1");
      double side1 = s.nextDouble();
      System.out.println("enter the side2");
      double side2 = s.nextDouble();
      System.out.println("enter the side3");
      double side3 = s.nextDouble();
      Triangle t = new Triangle();
      try {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0)
          throw new InvalidDimensionsException("entered values are not valid");
        t.side1 = side1;
        t.side2 = side2;
        t.side3 = side3;
        t.area();
        t.perimeter();
      } catch (InvalidDimensionsException e) {
        System.out.println(e);
      }
    }
  }

}