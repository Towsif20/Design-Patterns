import java.util.List;

public abstract class ExamController
{
    public abstract void send(Participant participant, String message);
    public abstract void send(Participant participant, String message, List<Student> students, List<Integer> marks);
}
