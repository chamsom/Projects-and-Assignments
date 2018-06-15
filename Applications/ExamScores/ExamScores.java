import java.util.*;

public class ExamScores
{
  public static void main(String[] args)
  {
  System.out.println("Please input exam scores as integers and then input a negative number to end your inputs.");

  Scanner kb = new Scanner(System.in);

  int userInput = kb.nextInt();
  int gradeA = 0;
  int gradeB = 0;
  int gradeC = 0;
  int gradeD = 0;
  int gradeF = 0;
  int count = 0;

  while (userInput > 0) {
    if (userInput >= 90) {
      gradeA++;
    }

    else if ((userInput >= 80 && userInput <= 89)) {
      gradeB++;
    }

    else if ((userInput >= 70 && userInput <= 79)) {
      gradeC++;
    }

    else if ((userInput >= 60 && userInput <= 69)) {
      gradeD++;
    }

    else if ((userInput >= 0 && userInput <= 59)) {
      gradeF++;
    }

    userInput = kb.nextInt();
    count++;
  }

  System.out.println("Total number of grades: " + count);
  System.out.println("Total number of A's = " + gradeA);
  System.out.println("Total number of B's = " + gradeB);
  System.out.println("Total number of C's = " + gradeC);
  System.out.println("Total number of D's = " + gradeD);
  System.out.println("Total number of F's = " + gradeF);

  }
}
