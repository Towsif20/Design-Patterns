public class Teacher extends Participant
{
    public Teacher(ExamController examController, int id)
    {
        super(examController);
        this.id = id;
    }

    @Override
    public int getId()
    {
        return id;
    }
}
