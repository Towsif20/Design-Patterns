import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Component root = new Drive("root");

        Scanner scanner = new Scanner(System.in);

        List<Component> drives = new ArrayList<>();
        List<Component> folders = new ArrayList<>();
        List<Component> files = new ArrayList<>();

        int choice;
        String s;

        while (true)
        {
            System.out.println("1. Create Drive");
            System.out.println("2. Create Folder");
            System.out.println("3. Create File");
            System.out.println("4. Remove Drive");
            System.out.println("5. Remove Folder");
            System.out.println("6. Remove File");

            System.out.println("7. List a drive");
            System.out.println("8. List a folder");
            System.out.println("9. Details of a drive");
            System.out.println("10. Details of a folder");
            System.out.println("11. Details of a file");
            System.out.println("12. Exit");

            choice = scanner.nextInt();

            if(choice == 1)
            {
                System.out.println("Enter drive name");
                s = scanner.next();
                Component drive = new Drive(s);
                System.out.println("Enter the parent drive name\nPress 0 for root");
                s = scanner.next();

                if(s.equalsIgnoreCase("0"))
                {
                    root.addComponent(drive);
                    drives.add(drive);
                }

                else
                {
                    boolean found = false;
                    for(int i=0;i<drives.size();i++)
                    {
                        if(drives.get(i).getName().equalsIgnoreCase(s))
                        {
                            drives.get(i).addComponent(drive);
                            found = true;
                            drives.add(drive);
                            break;
                        }
                    }

                    if (found == false)
                    {
                        System.out.println("No such drive found");
                    }
                }


            }

            if(choice == 2)
            {
                System.out.println("Enter folder name");
                s = scanner.next();

                Component folder = new Folder(s);

                int ch;

                System.out.println("1. for inside a drive\n2. for inside a folder");

                ch = scanner.nextInt();

                if(ch == 1)
                {
                    System.out.println("Enter the drive name");
                    s = scanner.next();

                    boolean found = false;

                    for (int i=0;i<drives.size();i++)
                    {
                        if (drives.get(i).getName().equalsIgnoreCase(s))
                        {
                            drives.get(i).addComponent(folder);
                            folders.add(folder);
                            found = true;

                            break;
                        }
                    }

                    if (!found)
                    {
                        System.out.println("No such drive found");
                    }
                }

                if (ch == 2)
                {
                    System.out.println("Enter the folder name");
                    s = scanner.next();
                    boolean found = false;

                    for (int i=0;i<folders.size();i++)
                    {
                        if (folders.get(i).getName().equalsIgnoreCase(s))
                        {
                            folders.get(i).addComponent(folder);
                            folders.add(folder);

                            found = true;
                            break;
                        }
                    }

                    if (!found)
                    {
                        System.out.println("No such folder found");
                    }
                }
            }

            if (choice == 3)
            {
                System.out.println("Enter the file name");
                s = scanner.next();

                Component file = new File(s);

                int ch;

                System.out.println("1. For inside a drive\n2. For inside a folder");

                ch = scanner.nextInt();

                if(ch == 1)
                {
                    System.out.println("Enter the drive name");
                    s = scanner.next();

                    boolean found = false;

                    for (int i=0;i<drives.size();i++)
                    {
                        if (drives.get(i).getName().equalsIgnoreCase(s))
                        {
                            drives.get(i).addComponent(file);
                            files.add(file);
                            found = true;

                            break;
                        }
                    }

                    if (!found)
                    {
                        System.out.println("No such drive found");
                    }
                }

                if (ch == 2)
                {
                    System.out.println("Enter the folder name");
                    s = scanner.next();
                    boolean found = false;

                    for (int i=0;i<folders.size();i++)
                    {
                        if (folders.get(i).getName().equalsIgnoreCase(s))
                        {
                            folders.get(i).addComponent(file);
                            files.add(file);

                            found = true;
                            break;
                        }
                    }

                    if (!found)
                    {
                        System.out.println("No such folder found");
                    }
                }
            }

            if(choice == 4)
            {
                System.out.println("Enter drive name");
                s = scanner.next();
                boolean found = false;
                for(int i=0;i<drives.size();i++)
                {

                    if(drives.get(i).getName().equalsIgnoreCase(s))
                    {
                        Component temp = drives.get(i);

                        for (int j=0;j<temp.getChildren().size();j++)
                        {
                            temp.getChildren().get(j).setParent(null);
                        }
                        for (int j=0;j<folders.size();j++)
                        {
                            if (folders.get(j).getParent() == null)
                                folders.remove(j);
                        }
                        for (int j=0;j<files.size();j++)
                        {
                            if (files.get(j).getParent() == null)
                                files.remove(j);
                        }

                        temp.remove();
                        drives.remove(temp);
                        System.out.println("Drive " + s + " removed");
                        found = true;
                        break;
                    }
                }

                if (!found)
                {
                    System.out.println("No such drive found");
                }

            }

            if (choice == 5)
            {
                System.out.println("Enter folder name");

                s = scanner.next();

                boolean found = false;
                for(int i=0;i<folders.size();i++)
                {

                    if(folders.get(i).getName().equalsIgnoreCase(s))
                    {
                        Component temp = folders.get(i);

                        for (int j=0;j<temp.getChildren().size();j++)
                        {
                            temp.getChildren().get(j).setParent(null);
                        }
                        for (int j=0;j<folders.size();j++)
                        {
                            if (folders.get(j).getParent() == null)
                                folders.remove(j);
                        }
                        for (int j=0;j<files.size();j++)
                        {
                            if (files.get(j).getParent() == null)
                                files.remove(j);
                        }

                        temp.remove();
                        folders.remove(temp);
                        System.out.println("Folder " + s + " removed");
                        found = true;
                        break;
                    }
                }

                if (!found)
                {
                    System.out.println("No such folder found");
                }
            }

            if (choice == 6)
            {
                System.out.println("Enter file name");

                s = scanner.next();

                boolean found = false;
                for(int i=0;i<files.size();i++)
                {

                    if(files.get(i).getName().equalsIgnoreCase(s))
                    {
                        Component temp = files.get(i);
                        temp.remove();
                        files.remove(temp);
                        System.out.println("File " + s + " removed");
                        found = true;
                        break;
                    }
                }

                if (!found)
                {
                    System.out.println("No such file found");
                }
            }

            if (choice == 7)
            {
                System.out.println("Enter drive name");

                s = scanner.next();

                boolean found = false;
                for(int i=0;i<drives.size();i++)
                {

                    if(drives.get(i).getName().equalsIgnoreCase(s))
                    {
                        Component temp = drives.get(i);
                        temp.list();

                        found = true;
                        break;
                    }
                }

                if (!found)
                {
                    System.out.println("No such drive found");
                }

            }

            if (choice == 8)
            {
                System.out.println("Enter folder name");

                s = scanner.next();

                boolean found = false;
                for(int i=0;i<folders.size();i++)
                {

                    if(folders.get(i).getName().equalsIgnoreCase(s))
                    {
                        Component temp = folders.get(i);
                        temp.list();

                        found = true;
                        break;
                    }
                }

                if (!found)
                {
                    System.out.println("No such folder found");
                }
            }

            if (choice == 9)
            {
                System.out.println("Enter drive name");

                s = scanner.next();

                boolean found = false;
                for(int i=0;i<drives.size();i++)
                {

                    if(drives.get(i).getName().equalsIgnoreCase(s))
                    {
                        Component temp = drives.get(i);
                        temp.details();

                        found = true;
                        break;
                    }
                }

                if (!found)
                {
                    System.out.println("No such drive found");
                }

            }

            if (choice == 10)
            {
                System.out.println("Enter folder name");

                s = scanner.next();

                boolean found = false;
                for(int i=0;i<folders.size();i++)
                {

                    if(folders.get(i).getName().equalsIgnoreCase(s))
                    {
                        Component temp = folders.get(i);
                        temp.details();

                        found = true;
                        break;
                    }
                }

                if (!found)
                {
                    System.out.println("No such folder found");
                }
            }

            if (choice == 11)
            {
                System.out.println("Enter file name");

                s = scanner.next();

                boolean found = false;
                for(int i=0;i<files.size();i++)
                {

                    if(files.get(i).getName().equalsIgnoreCase(s))
                    {
                        Component temp = files.get(i);
                        temp.details();

                        found = true;
                        break;
                    }
                }

                if (!found)
                {
                    System.out.println("No such folder found");
                }
            }

            if (choice == 12)
                break;


        }
    }
}
