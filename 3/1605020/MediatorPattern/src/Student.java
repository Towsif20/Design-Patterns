public class Student extends Participant
{
    public Student(ExamController examController, int id)
    {
        super(examController);
        this.id = id;
    }

    @Override
    public int getId()
    {
        return id;
    }

    public void send(String message)
    {
        examController.send(this,message);
    }

    public void Notify(String message)
    {
        System.out.println(message);
    }
}
