package com.company;

public class RegularUser implements User
{
    public RegularUser()
    {
        //default server
        server = "abc";
    }

    String server;

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
