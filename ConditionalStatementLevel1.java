package javaLearningsAndAssignments;

import java.util.Scanner;

public class ConditionalStatementLevel1 {
    public static void findTheGreatestNum()
    {
        int a,b;
        //Get two inputs from the user
        System.out.println("Enter the first value:");
        Scanner scan=new Scanner(System.in);
        a=scan.nextInt();
        System.out.println("Enter the second value:");
        b=scan.nextInt();
        //Check and print whether the given shape is square or not
        if(a>b)
            System.out.println("The greatest number is: " +a);
        else
            System.out.println("The greatest number is: " +b);
    }
    public  static  void squareCheck()
    {

        //Get two inputs from the user
        System.out.println("Enter the first value:");
        Scanner scan=new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Enter the second value:");
        int b=scan.nextInt();
        //Check and print whether the given shape is square or not
        if(a==b)
            System.out.println("The given shape is square");
        else
            System.out.println("The given shape is not square");
    }
    public static void  discountForPurchasedItem()
    {
        int costPerUnit=100;
        double discount=0;
        //Get the num of quantity from user
        System.out.println("Enter the number of product :");
        Scanner scan=new Scanner(System.in);
        int quantity=scan.nextInt();
        //calculate purchased price
        double price=costPerUnit*quantity;
        if(price>1000) {
           discount = (price *10) / 100;
        }
        double totalPrice = price - discount;
        //Print the total price
        System.out.println("The total price is: "+totalPrice);
    }
    public  static  void calculateBonus()
    {
        System.out.println("Enter the salary:");
        Scanner scan=new Scanner(System.in);
        double salary=scan.nextDouble();
        System.out.println("Enter the years of service: ");
        double yearsOfService=scan.nextDouble();
        //Calculate and print the bonus of the employee
        if(yearsOfService>5)
        {
            double bonus=(salary*5)/100;
            System.out.println("The net bonus amount is: "+bonus);
        }
        else
            System.out.println("You don't have bonus.");

    }
    public static void gradingSystem() {
        int mark;
        String grade="";
        //Get the mark from the user
        System.out.println("Enter the mark:");
        Scanner scan = new Scanner(System.in);
        mark = scan.nextInt();
        if (mark < 25)
            grade = "F";
        else if (mark >=25 &&  mark < 45)
            grade = "E";
        else if (mark >=45 && mark < 50)
            grade = "D";
        else if (mark >= 50 && mark < 60)
            grade = "C";
        else if (mark >= 60 && mark < 80)
            grade = "B";
        else if (mark >= 80)
            grade = "A";
        //Print the grade for the corresponding mark
        System.out.println("The grade for " + mark + " is :" + grade);
    }
    public static void findOldestAndYoungest()
    {
        int age1,age2,age3;
        int oldest;
        int youngst;
        System.out.println("Enter the age of sam:");
        Scanner scan = new Scanner(System.in);
        age1=scan.nextInt();
        System.out.println("Enter the age of riya:");
        age2=scan.nextInt();
        System.out.println("Enter the age of diya:");
        age3=scan.nextInt();
        if(age1>age2 && age1>age3)
        {
            oldest=age1;
        }
        else if(age2>age3 && age2>age1)
        {
            oldest=age2;
        }
        else
           oldest=age3;
        if(age1<age2 && age1<age3)
        {
            youngst=age1;
        }
        else if(age2<age3 && age2<age1)
        {
            youngst=age2;
        }
        else
            youngst=age3;
        System.out.println("The oldest age is: "+oldest);
        System.out.println("The youngest age is: "+youngst);
    }
    public static void findAbsoluteValue()
    {
        int a,b;
        //Get two inputs from the user
        System.out.println("Enter the first value:");
        Scanner scan=new Scanner(System.in);
        a=scan.nextInt();
        System.out.println("Enter the second value:");
        b=scan.nextInt();
        //Print the absolute of the given input
        System.out.println("The absolute value of " +a+ "is: "+Math.abs(a));
        System.out.println("The absolute value of " +b+ "is: "+Math.abs(b));
    }
    public static void checkThePercentage()
    {
        int noOfClassesHeld,noOfClassesAttended;
        float percentage;
        //Get the input from the user
        System.out.println("Enter the number of classes held:");
        Scanner scan=new Scanner(System.in);
        noOfClassesHeld=scan.nextInt();
        System.out.println("Enter the number of classes Attended:");
        noOfClassesAttended=scan.nextInt();
        System.out.println("classes held:"+noOfClassesHeld);
        System.out.println("attended:"+noOfClassesAttended);
        //Calculate the percentage
        percentage=(noOfClassesAttended*100)/noOfClassesHeld;
        //Print the percentage and check whether the student is allowed to the exam or not
        if(percentage>75)
        {
            System.out.println("Student is allowed to sit in the exam");
        }
        System.out.println("The percentage of classes attended is: "+percentage+"%");
        System.out.println("Student is not allowed to sit in the exam");

    }
    public static void medicalCheck() {
        String medicalCause;
        System.out.println("Do you have medical cause?(Y/N)");
        Scanner scan = new Scanner(System.in);
        String status = scan.nextLine();
        //Check and print the medical status of the student
        if (status.equalsIgnoreCase("Y")) {
            System.out.println("You need to sit for the medical check.");
        }
        else if(status.equalsIgnoreCase("N"))
        {

            System.out.println("You need not to sit for the medical check.");
        }
        else
            System.out.println("Please enter the valid character");
    }

    public static void findValuesForExpressions()
    {
        int x=2,y=5,z=0;
        //Calculate the values
        if(x==2)
            System.out.println("The x is equal to 2");
        if(x!=5)
            System.out.println("The x is not equal to 5");
        if(x!=5 && y>=5)
            System.out.println("The x is not equal to 5 and the y is greater than or equal to 5");
        if(z!=0 ||x==2)
            System.out.println("The z is not equal to zero or the x is equal to 2");
        if(!(y<10))
            System.out.println("The y is greater than 10");
    }
    public static void findUpperAndLowerCase()
    {
        char ch;
        //Get a char from the user
        System.out.println("Please enter a character:");
        Scanner scan=new Scanner(System.in);
        ch=scan.next().charAt(0);
        if(Character.isLowerCase(ch))
            System.out.println("The given character "+ch +" is a lowercase letter");
        else if(Character.isUpperCase(ch))
            System.out.println("The given character "+ch +" is a uppercase letter");
        else
            System.out.println("Please enter a valid character.");
    }
    public static void main(String[] args) {
        squareCheck();
        findTheGreatestNum();
        discountForPurchasedItem();
        calculateBonus();
        gradingSystem();
        findOldestAndYoungest();
        findAbsoluteValue();
        checkThePercentage();
        medicalCheck();
        findValuesForExpressions();
        findUpperAndLowerCase();


    }

}
