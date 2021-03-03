package javaLearningsAndAssignments;

import java.util.*;

public class LoopAssignmentLevel1 {
    public static void  printIntUsingLoop()
    {
        int value[]=new int[10];
        int sum=0;
        double average;
        Scanner scan=new Scanner(System.in);
        //Get input from user
        for (int i=0;i<10;i++)
        {
            System.out.println("Please enter the value");
            value[i]=scan.nextInt();
            sum=sum+value[i];
        }

        average=sum/10;
        System.out.println("The average value is: "+average);
    }
    public static void printLeftTriangleShape()
    {
        //Print *s as left aligned triangle

        for (int i=0;i<4;i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
           System.out.println("\n");
        }
    }
    public static void printInvertedPyramidShape() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        for (int i=rows;i >=1;i--)
        {
            // Printing spaces
            for (int j=rows-i; j>=1; j--)
            {
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++)
            {
                if (j % 2 == 0)
                {
                    System.out.print(0);
                }
                else {
                    System.out.print(1);
                }
            }
            System.out.println("\n");
        }
    }
    public static void printDiamondShape()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        //Print *s as a diamond
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(" ");
            }
            for(int j=2;j<(2*i-1);j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void multiplicationTable()
    {
        //Print the multiplication table
       int[] num={24,50,29};
        for(int j=0;j<num.length;j++)
        {
            for(int i=1;i<=10;i++)
            {
                System.out.printf("%d * %d = %d \n", i, num[j], num[j] * i);
            }
            System.out.println("\n");
        }
    }
    public static void asciiValuesAndCharacter()
    {
        //Print the ascii value and their equivalent character
        for(int i=0;i<=255;i++)
        {
            System.out.println(" The ASCII value of " + (char)i + " = " + i);
        }
    }
    public static void calculateFactorial()
    {
        int fact=1;
        System.out.println("Please enter the number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        for(int i=1;i<=number;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
    public static int findGCD(int a, int b)
    {
        while(b != 0)
        {
            if(a > b)
            {
                a = a - b;
            }
            else
            {
                b = b - a;
            }
        }
        return a;
    }
    static boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void PrintAvgAndProduct()
    {
        ArrayList<Integer> inputNums = new ArrayList<>();

        while(true)
        {
            System.out.println("Please enter the number");
            Scanner sc=new Scanner(System.in);
            String val = sc.nextLine();
            if(tryParseInt(val))
            {
                inputNums.add(Integer.parseInt(val));
            }
            else if(val.equalsIgnoreCase("q") )
            {
                int sum = 0;
                int prod = 1;
                for (int i = 0; i<inputNums.toArray().length; i++) {
                    sum = sum + inputNums.get(i);
                    prod = prod * inputNums.get(i);
                }

                System.out.println("Average = " + sum/inputNums.toArray().length);
                System.out.println("Product = " + prod);
            }
            else
            {
                System.out.println("Invalid input");
                break;
            }
        }
    }
    public static void infiniteLoop()
    {
        int i = 0;
        while(true)
        {
            System.out.println("Loop Index = " + i++);
        }
    }
    public static  void main(String[] args) {
        //printIntUsingLoop();
        //printLeftTriangleShape();
        //printDiamondShape();
        //printInvertedPyramidShape();
        //multiplicationTable();
        //asciiValuesAndCharacter();
       // calculateFactorial();
        //PrintAvgAndProduct();
        infiniteLoop();

    }
}
