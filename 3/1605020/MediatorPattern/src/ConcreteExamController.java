import java.util.List;

public class ConcreteExamController extends ExamController
{
    private List<Student> students;
    private Examiner examiner;

    public void setStudents(List<Student> students)
    {
        this.students = students;
    }

    public void setExaminer(Examiner examiner)
    {
        this.examiner = examiner;
    }

    @Override
    public void send(Participant participant, String message)
    {
        if (message.equalsIgnoreCase("Re examine"))
        {
            System.out.println("recheck request from student ID: " + participant.getId());

            examiner.Notify(message, participant.getId()-1);
        }

        else
        {
            System.out.println(message);
        }
    }

    @Override
    public void send(Participant participant, String message, List<Student> students, List<Integer> marks)
    {
        if (message.equalsIgnoreCase("Marks"))
        {
            for (int i=0;i<students.size();i++)
            {
                //System.out.println("ID: " + students.get(i).getId() + " marks: " + marks.get(i));
                students.get(i).Notify("ID: " + students.get(i).getId() + " marks: " + marks.get(i));
            }


        }

        else
        {
            System.out.println(message);
        }
    }
}
