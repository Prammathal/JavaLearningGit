package javaLearningsAndAssignments;

public class ASCIIToCharacter {
    public static void main(String[] args) {
        char ch = 'd';
        int ascii = ch;
        //Add ASCII value with 3
        int ascii3 = ascii + 3;
        //Find the character for the ASCII value
        char ch3 = (char) ascii3;
        //Print the character for the ASCII value
        System.out.println("The character for the AsCII value " + ascii3 + " is :" + ch3);
    }
}

