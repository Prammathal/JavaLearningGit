package javaLearningsAndAssignments;

public class OperatorsPgm {
    public static void areaAndPerimeterOfRectangle()
    {
        int l=5;
        int b=7;
        //Calculate the area and perimeter of the rectangle
        int area=l*b;
        int perimtr=2*(l+b);
        //Print the area and perimeter of the rectangle
        System.out.println("The area of rectangle is: " +area);
        System.out.println("The perimeter of rectangle is: " +perimtr);
    }
    public static void perimeterOfTriangle()
    {
        int a=2;
        int b=3;
        int c=5;
        //Calculate the perimeter of the triangle
        int perimtr=a+b+c;
        //Print the perimeter of the triangle
        System.out.println("The perimeter of triangle is: " +perimtr);
    }
    public static void FahrenheitToCelsius()
    {
     double f=90,c;
     //Calculate FahrenheitToCelsius
        c=(f-32)*5/9;
        //Print FahrenheitToCelsius
        System.out.println("The Celsius temperature is: "+c);
    }

    public static void main(String[] args) {
        areaAndPerimeterOfRectangle();
        perimeterOfTriangle();
        FahrenheitToCelsius();


    }
}
