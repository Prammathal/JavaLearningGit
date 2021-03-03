package javaLearningsAndAssignments;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AssignmentsOfArray {
    public static void randomUniqueCarNumber()
    {
        int noOfCars;
        //Get the number of cars from the user
        System.out.println("Please enter the number of cars:");
        Scanner scan=new Scanner(System.in);
        noOfCars=scan.nextInt();
        //Generate the 4 digits random numbers
        Random r=new Random();
        for(int i=0;i<noOfCars;i++) {
           String carNum="MH" +r.nextInt(9999);
           //Print the car number
            System.out.println("The car number is:" +carNum);
        }
    }
    public static void findDayOfTheWeek()
    {
        String[] day={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println("Please enter a number to find the day of the week : ");
        Scanner scan=new Scanner(System.in);
        int input=scan.nextInt();
        //Print the day
        if(input>0 && input<8)
        System.out.println("The corresponding day for the input "+input+" is: "+day[input-1]);
        else
            System.out.println("Invalid input to find the day of the week");
    }
    public static void findHighestLowestAvg()
    {
        int sum=0,highestGrade,lowestGrade;
        float average;
        //Get inputs fro user
        System.out.println("Please enter the number of grades :" );
        Scanner scan=new Scanner(System.in);
        int noOfGrades=scan.nextInt();
        int grade[]=new int[noOfGrades];
        for(int i=0;i<noOfGrades;i++)
        {
            System.out.println("Please enter the grade value:");
            grade[i]=scan.nextInt();
        }
        //Calculate highest,lowest and average grade values
        for(int i=0;i<noOfGrades;i++) {
            sum=sum+grade[i];
        }
        average=sum/noOfGrades;
        Arrays.sort(grade);
        //Print the average ,highest and lowest mark
        System.out.println("The average is:"+average);
        System.out.println("The lowest grade value is: "+grade[0]);
        System.out.println("The highest grade value is: "+grade[noOfGrades-1]);
    }
    public static void main(String[] args) {
        randomUniqueCarNumber();
        findDayOfTheWeek();
        findHighestLowestAvg();


    }

}
