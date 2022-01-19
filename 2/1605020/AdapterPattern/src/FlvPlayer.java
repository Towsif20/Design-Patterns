public class FlvPlayer implements AdvancedMediaPlayer
{

    @Override
    public void playVlc(Media media)
    {

    }

    @Override
    public void playMp4(Media media)
    {

    }

    @Override
    public void playFlv(Media media)
    {
        System.out.println("Playing flv file: " + media.getName() + "\tduration: " + media.getDuration());
    }
}
