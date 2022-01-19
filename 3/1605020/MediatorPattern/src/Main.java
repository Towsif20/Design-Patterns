import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ConcreteExamController examController = new ConcreteExamController();

        Examiner examiner = new Examiner(examController, 100);

        List<Student> students = new ArrayList<>();

        for (int i=0;i<5;i++)
        {
            students.add(new Student(examController, i+1));
        }

        List<Integer> marks = new ArrayList<>();

        Random random = new Random();

        for (int i=0;i<5;i++)
        {
            marks.add(random.nextInt(80)  + 20);
        }
        examController.setExaminer(examiner);
        examController.setStudents(students);

        examiner.send("marks", students, marks);

        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            int choice;
            System.out.println("1. apply for recheck\nany other key to exit");
            choice = scanner.nextInt();

            if (choice == 1)
            {
                System.out.println("Enter the student id");

                int id = scanner.nextInt();

                while (id > 5)
                {
                    System.out.println("Enter valid id");
                    id = scanner.nextInt();
                }

                id--;

                students.get(id).send("Re examine");
                examiner.send("marks", students, marks);
            }

            else
            {
                break;
            }
        }
    }
}