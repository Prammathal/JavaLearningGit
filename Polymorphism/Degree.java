package javaLearningsAndAssignments.Polymorphism;

public class Degree {
    public void getDegree() {
        System.out.println("I got a degree");
    }

    public static void main(String []args)
    {
        Degree degree = new Degree();
        degree.getDegree();

        UnderGraduate ug = new UnderGraduate();
        ug.getDegree();

        PostGraduate pg = new PostGraduate();
        pg.getDegree();

    }
}
