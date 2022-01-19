import java.util.LinkedList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        boolean opened = false;
        ShakeShack shack = new ShakeShack();
        Milkshake milkshake = null;
        MilkshakeMeal meal = null;
        MilkshakeMealBuilder builder = null;

        LinkedList<MilkshakeMeal> orders = null;

        while (true)
        {
            Scanner scanner = new Scanner(System.in);
            char choice = scanner.next().charAt(0);
            if(choice == 'O')
            {
                if(!opened)
                {
                    opened = true;
                    orders = new LinkedList<>();
                }

                else
                {
                    System.out.println("already an order under process\n" +
                            "Please decide if you want to add anything more\n");

                }

                while (true)
                {
                    System.out.println("1. Choco shake\n" +
                            "2. Strawberry shake\n" +
                            "3. Coffee shake\n" +
                            "4. Vanilla shake\n" +
                            "5. Zero shake\n");

                    int ch = scanner.nextInt();

                    boolean lactosefree = false;
                    String type = "";

                    if(ch == 1)
                        type = "chocolate";

                    else if(ch == 2)
                        type = "strawberry";

                    else if(ch == 3)
                        type = "coffee";

                    else if(ch == 4)
                        type = "vanilla";

                    else if(ch == 5)
                        type = "zero";

                    else
                        break;

                    System.out.println("Do you want to take lactose free shake? if yes press 'y'\n" +
                            " otherwise press any key to continue");

                    char ch2 = scanner.next().charAt(0);

                    if(ch2 == 'y')
                        lactosefree = true;

                    milkshake = shack.createShake(type,lactosefree);

                    builder = new MilkshakeMealBuilder();

                    builder = builder.withBaseShake(milkshake);

                    System.out.println("Choose your favourite tppingsS\n" +
                            "\n1. no topping\n" +
                            "2. candy topping\n" +
                            "3. cookie topping\n");

                    ch = scanner.nextInt();

                    if(ch == 2)
                        type = "candy";
                    else if(ch == 3)
                        type = "cookie";

                    builder = builder.withTopping(type);

                    meal = new MilkshakeMeal(builder);

                    orders.add(meal);

                    System.out.println(orders);

                }
            }

            else if(choice == 'E')
            {
                if(opened)
                {
                    System.out.println(orders);
                    orders.clear();
                    orders = null;
                    opened = false;
                }

                else
                {
                    System.out.println("can't exit from a non existing order\n");
                }

            }

            else
                break;
        }
    }
}
