package javaLearningsAndAssignments.Polymorphism;

public class OverLoading {
    float area;
    void area(float side)
    {
        area=side*side;
        System.out.println("The area of the square is "+area+" sq units");
    }
    void area(float length, float breath)
    {
        area=length*breath;
        System.out.println("The area of the rectangle is "+area+" sq units");
    }
    public static void main(String[] args) {
        OverLoading ol=new OverLoading();
        ol.area(234.56f);
        ol.area(456.343f,678.32f);

    }
}
