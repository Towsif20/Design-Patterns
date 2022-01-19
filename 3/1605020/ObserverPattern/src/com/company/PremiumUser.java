package com.company;

public class PremiumUser implements User
{
    String server;

    public PremiumUser()
    {
        server = "abc";
    }

    public String getServer()
    {
        return server;
    }

    public void setServer(String server)
    {
        this.server = server;
    }

    @Override
    public void notify(String message)
    {
        System.out.println(message);
    }
}
