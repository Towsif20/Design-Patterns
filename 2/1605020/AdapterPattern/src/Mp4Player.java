public class Mp4Player implements AdvancedMediaPlayer
{

    @Override
    public void playVlc(Media media)
    {

    }

    @Override
    public void playMp4(Media media)
    {
        System.out.println("Playing mp4 file: " + media.getName() + "\tduration: " + media.getDuration());
    }

    @Override
    public void playFlv(Media media)
    {

    }
}
