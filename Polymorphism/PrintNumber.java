package javaLearningsAndAssignments.Polymorphism;

public class PrintNumber
{
    public void println(String strPrint)
    {
        System.out.println("Print String: " +strPrint);
    }

    public void println(int intPrint)
    {
        System.out.println("Print Integer: " +intPrint);
    }

    public void println(double dblPrint){
        System.out.println("Print double: "+dblPrint);
    }
    public void println(float floatPrint){
        System.out.println("Print float: "+floatPrint);
    }
    public void println(char charPrint){
        System.out.println("Print Char: "+charPrint);
    }

    public static void main(String[] args) {
        PrintNumber printNumber = new PrintNumber();
        printNumber.println("Prammathal");
        printNumber.println(5000);
        printNumber.println(300.5078777878788787);
        printNumber.println(700.687f);
        printNumber.println('A');
    }
}
