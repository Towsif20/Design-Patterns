package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
	// write your code here

        Server server = new Server();

        PremiumUser premiumUser = new PremiumUser();

        RegularUser regularUser = new RegularUser();

        server.setPremiumUser(premiumUser);
        server.setRegularUser(regularUser);

        //server.setCurrentState("operational", 1);

        Scanner scanner = new Scanner(System.in);
        int choice, type;

        while (true)
        {
            System.out.println("What type of user are you?");
            System.out.println("1. Premium user");
            System.out.println("2. Regular user");

            type = scanner.nextInt();

            System.out.println("Change state into : ");



            if (server.getCurrentState().equalsIgnoreCase(State.OPERATIONAL))
            {
                System.out.println("1. "+ State.PARTIALLY_DOWN);
                System.out.println("2. "  + State.FULLY_DOWN);

                choice = scanner.nextInt();

                if (choice == 1)
                {
                    server.setCurrentState(State.PARTIALLY_DOWN, type);
                }

                if (choice == 2)
                {
                    server.setCurrentState(State.FULLY_DOWN, type);
                }
            }

            else if (server.getCurrentState().equalsIgnoreCase(State.PARTIALLY_DOWN))
            {
                System.out.println("1. "+ State.OPERATIONAL);
                System.out.println("2. "  + State.FULLY_DOWN);

                choice = scanner.nextInt();

                if (choice == 1)
                {
                    server.setCurrentState(State.OPERATIONAL, type);
                }

                if (choice == 2)
                {
                    server.setCurrentState(State.FULLY_DOWN, type);
                }
            }

            else if (server.getCurrentState().equalsIgnoreCase(State.FULLY_DOWN))
            {
                System.out.println("1. "  + State.OPERATIONAL);
                System.out.println("2. "+ State.PARTIALLY_DOWN);

                choice = scanner.nextInt();

                if (choice == 1)
                {
                    server.setCurrentState(State.OPERATIONAL, type);
                }

                if (choice == 2)
                {
                    server.setCurrentState(State.PARTIALLY_DOWN, type);
                }
            }


        }
    }
}
