import java.util.Scanner;

public class ClassAverageCalculator{
    int sum;
    int grade;

    int gradeCounter = 0;

    double average;
    Scanner input = new Scanner(System.in);

    public void classAverage() {

        while (gradeCounter < 10) {
            System.out.println("Enter Grade");
            grade = input.nextInt();
            sum  = sum  + grade;
            gradeCounter++;
        }
        average = (double) sum / gradeCounter;
        System.out.printf("The total grade is: %d%n", sum);
        System.out.printf("The class Average is: %f%n", average);
    }

}

