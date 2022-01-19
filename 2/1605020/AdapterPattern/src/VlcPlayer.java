public class VlcPlayer implements AdvancedMediaPlayer
{


    @Override
    public void playVlc(Media media)
    {
        System.out.println("Playing vlc file: " + media.getName() + "\tduration: " + media.getDuration());
    }

    @Override
    public void playMp4(Media media)
    {

    }

    @Override
    public void playFlv(Media media)
    {

    }
}
