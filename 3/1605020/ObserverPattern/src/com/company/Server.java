package com.company;

import java.util.Random;
import java.util.Scanner;

public class Server
{
    PremiumUser premiumUser;
    RegularUser regularUser;

    String currentState;
    String previousState;

    public Server()
    {
        currentState = State.OPERATIONAL;
    }

    public void setPremiumUser(PremiumUser premiumUser)
    {
        this.premiumUser = premiumUser;
    }

    public void setRegularUser(RegularUser regularUser)
    {
        this.regularUser = regularUser;
    }

    public void setCurrentState(String currentState, int userType)
    {
        this.previousState = this.currentState;

        this.currentState = currentState;

        if (userType == 1)
            notifyPremiumUser();

        if (userType == 2)
            notifyRegularUser();

    }

    public String getCurrentState()
    {
        return currentState;
    }

    public void notifyPremiumUser()
    {
        if (previousState.equalsIgnoreCase(State.OPERATIONAL))
        {
            if (currentState.equalsIgnoreCase((State.PARTIALLY_DOWN)))
            {
                Scanner scanner = new Scanner(System.in);

                System.out.println("1. use abc and def both");
                System.out.println("2. use def only");

                int choice = scanner.nextInt();

                String message = "";

                if(choice == 1)
                {
                    premiumUser.setServer("abcdef");
                    message = "using abc and def both";
                }

                if (choice == 2)
                {
                    premiumUser.setServer("def");
                    message = "using def only";
                }

                premiumUser.notify(message);
            }

            if (currentState.equalsIgnoreCase(State.FULLY_DOWN))
            {
                String message = "using def only";

                premiumUser.notify(message);
            }
        }

        if (previousState.equalsIgnoreCase((State.PARTIALLY_DOWN)))
        {
            if (currentState.equalsIgnoreCase(State.OPERATIONAL))
            {

            }

            if (currentState.equalsIgnoreCase(State.FULLY_DOWN))
            {
                if (premiumUser.getServer().equalsIgnoreCase("abcdef"))
                {
                    premiumUser.setServer("def");

                    premiumUser.notify("All tasks shifted to DEF server");
                }
            }
        }

    }

    public void notifyRegularUser()
    {
        if (previousState.equalsIgnoreCase(State.OPERATIONAL))
        {
            if (currentState.equalsIgnoreCase(State.PARTIALLY_DOWN))
            {
                Scanner scanner = new Scanner(System.in);

                System.out.println("1. Continue with limited functionality");
                System.out.println("2. Transfer to DEF server for $20 per hour");

                int choice = scanner.nextInt();

                if (choice == 1)
                {
                    regularUser.notify("Continuing with limited functionality on ABC server");
                }

                if (choice == 2)
                {
                    regularUser.setServer("abcdef");
                    regularUser.notify("Enjoying full functionality with DEF server");
                }
            }

            if (currentState.equalsIgnoreCase(State.FULLY_DOWN))
            {
                Scanner scanner = new Scanner(System.in);

                System.out.println("1. Transfer to DEF server for $20 per hour");

                int choice = scanner.nextInt();

                if (choice == 1)
                {
                    regularUser.setServer("def");
                    regularUser.notify("Enjoying full functionality with DEF server");
                }

                else
                {
                    regularUser.notify("All data lost");
                }
            }
        }

        if (previousState.equalsIgnoreCase(State.PARTIALLY_DOWN))
        {
            if (currentState.equalsIgnoreCase(State.OPERATIONAL))
            {
                if (!regularUser.getServer().equalsIgnoreCase("abc"))
                {
                    Random random = new Random();

                    int rand = ((random.nextInt() % 10) + 1)  * 20;

                    regularUser.notify("Bill : $" + rand);
                }
            }
        }

        if (previousState.equalsIgnoreCase(State.FULLY_DOWN))
        {
            if (currentState.equalsIgnoreCase(State.OPERATIONAL))
            {
                if (!regularUser.getServer().equalsIgnoreCase("abc"))
                {
                    Random random = new Random();

                    int rand = ((random.nextInt() % 10) + 1)  * 20;

                    regularUser.notify("Bill : $" + rand);
                }
            }
        }
    }

}
