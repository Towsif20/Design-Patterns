import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        AudioPlayer audioPlayer = new AudioPlayer();

        List<Media> playList = null;

        int choice;
        String name, type;
        double duration;
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.println("1. create playlist");
            System.out.println("2. add media to current playlist");
            System.out.println("3. show current playlist");
            System.out.println("4. create another playlist");

            choice = scanner.nextInt();

            if (choice == 1)
            {
                if (playList == null)
                {
                    playList = new ArrayList<>();

                    System.out.println("Playlist created");
                    //audioPlayer.setPlayList(playList);

                } else
                {
                    System.out.println("Already a playlist running, press 4 for a new one");
                }
            }

            if (choice == 2)
            {
                if (playList != null)
                {
                    System.out.println("Enter name");
                    name = scanner.next();

                    System.out.println("Enter type");
                    type = scanner.next();

                    System.out.println("Enter duration");
                    duration = scanner.nextDouble();

                    playList.add(new Media(name, type, duration));
                    //audioPlayer.setPlayList(playList);
                }

                else
                {
                    System.out.println("No playlist available");
                }
            }

            if (choice == 3)
            {
                if (playList != null)
                {
                    if (playList.size() == 0)
                    {
                        System.out.println("playlist empty");
                    }
                    for (int i=0;i<playList.size();i++)
                    {
                        //System.out.println(playList.get(i));
                        audioPlayer.play(playList.get(i));
                    }
                }

                else
                {
                    System.out.println("No playlist available");
                }

            }

            if (choice == 4)
            {
                if (playList == null)
                {
                    System.out.println("No playlist yet\nNew playlist created");

                    playList = new ArrayList<>();
                }

                else
                {
                    System.out.println("Enter elapsed time");

                    duration = scanner.nextDouble();

                    double time = 0;

                    for (int i=0;i<playList.size();i++)
                    {
                        time += playList.get(i).getDuration();
                    }

                    if (duration >= time)
                    {
                        System.out.println("New playlist created");

                        playList.clear();
                    }

                    else
                    {
                        System.out.println("new playlist not available");
                    }
                }
            }


        }
    }
}





















