public abstract class Participant
{
    ExamController examController;
    int id;

    public Participant(ExamController examController)
    {
        this.examController = examController;
    }

    public abstract int getId();
}
