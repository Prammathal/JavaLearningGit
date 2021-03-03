package javaLearningsAndAssignments;

import java.util.Scanner;

public class InputByUser {
    public static void sumAndProduct()
    {
        int a,b,sum,prod;
        //Get two inputs from the user
        System.out.println("Enter the first value:");
        Scanner scan=new Scanner(System.in);
        a=scan.nextInt();
        System.out.println("Enter the second value:");
        b=scan.nextInt();
        //Find the sum and product of the two numbers
        sum =a+b;
        prod=a*b;
        //Print the sum and product of the two numbers
        System.out.println("The sum of "+a+" and "+b+ " is: "+sum);
        System.out.println("The product of "+a+" and "+b+ " is: "+prod);
    }
    public static void areaTypeCast()
    {
        double l,b,area;
        //Get two inputs from the user
        System.out.println("Enter the length :");
        Scanner scan=new Scanner(System.in);
        l=scan.nextDouble();
        System.out.println("Enter the breath :");
        b=scan.nextDouble();
        //Calculate and type cate the area of rectangle
        area=l*b;
        int areaRect=(int)area;
        //Print the area type casted to int value.
        System.out.println("The area of rectangle is : "+area);
    }
    public static void main(String[] args) {
        sumAndProduct();
        areaTypeCast();

    }

}
