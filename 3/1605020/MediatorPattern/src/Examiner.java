import java.util.List;
import java.util.Random;

public class Examiner extends Participant
{
    List<Integer> marks;
    private int count = 0;

    public Examiner(ExamController examController, int id)
    {
        super(examController);
        this.id = id;
    }

    public void send(String msg, List<Student> students,List<Integer> marks)
    {
        this.marks = marks;
        examController.send(this, msg, students, marks);
    }

    public void Notify(String message, int i)
    {
        if (message.equalsIgnoreCase("Re examine"))
        {

            Random random = new Random();

            boolean change = random.nextBoolean();

            if (!change)
            {
                //System.out.println("marks unchanged");
                examController.send(this, "marks unchanged");
                count++;
                if (count >= 4)
                {
                    count = 0;
                    change = true;
                }
            }

            if (change)
            {
                count = 0;

                int m = marks.get(i);

                boolean incr = random.nextBoolean();

                if (incr)
                {
                    int t = m;
                    m += random.nextInt(100-t)%15;

                    marks.set(i, m);
                    //System.out.println("Marks increased. updated marks: " + marks.get(i));
                    examController.send(this, "Marks increased\n" +
                            "previous marks: " + t + "\nupdated marks: " + marks.get(i));
                }

                else
                {
                    int t = m;
                    m -= random.nextInt(t)%15;

                    marks.set(i, m);
                    //System.out.println("Marks decreased. updated marks: " + marks.get(i));
                    examController.send(this, "Marks decreased\n" +
                            "previous marks: " + t + "\nupdated marks: " + marks.get(i));
                }
            }
        }
    }

    @Override
    public int getId()
    {
        return id;
    }
}
