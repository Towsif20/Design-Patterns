public class MediaAdapter implements MediaPlayer
{
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType)
    {
        if (audioType.equalsIgnoreCase("mp4"))
            advancedMediaPlayer = new Mp4Player();

        if (audioType.equalsIgnoreCase("vlc"))
            advancedMediaPlayer = new VlcPlayer();

        if (audioType.equalsIgnoreCase("flv"))
            advancedMediaPlayer = new FlvPlayer();
    }

    @Override
    public void play(Media media)
    {
        String audioType = media.getType();
        String fileName = media.getName();

        if (audioType.equalsIgnoreCase("mp4"))
            advancedMediaPlayer.playMp4(media);

        if (audioType.equalsIgnoreCase("vlc"))
            advancedMediaPlayer.playVlc(media);

        if (audioType.equalsIgnoreCase("flv"))
            advancedMediaPlayer.playFlv(media);
    }
}
