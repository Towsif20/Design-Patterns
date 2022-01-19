public class AudioPlayer implements MediaPlayer
{
    MediaAdapter mediaAdapter;



    @Override
    public void play(Media media)
    {
        String audioType = media.getType();
        String fileName = media.getName();

        if (audioType.equalsIgnoreCase("mp3"))
        {
            System.out.println("playing mp3 file " + fileName + "\tduration: " + media.getDuration());
        }

        else if (audioType.equalsIgnoreCase("vlc")
                || audioType.equalsIgnoreCase("mp4")
                || audioType.equalsIgnoreCase("flv"))
        {
            mediaAdapter = new MediaAdapter(audioType);

            mediaAdapter.play(media);
        } else
        {
            System.out.println("invalid media format\n" + audioType + " not supported");
        }
    }
}
