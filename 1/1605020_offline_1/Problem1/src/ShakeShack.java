public class ShakeShack
{
    public Milkshake createShake(String type, boolean lactoseFree)
    {
        Milkshake milkshake = null;
        if(type.equalsIgnoreCase("chocolate"))
            milkshake = new Choco_shake();

        if(type.equalsIgnoreCase("coffee"))
            milkshake = new Coffee_shake();

        if(type.equalsIgnoreCase("vanilla"))
            milkshake = new Vanilla_shake();

        if(type.equalsIgnoreCase("strawberry"))
            milkshake = new Strawberry_shake();

        if(type.equalsIgnoreCase("zero"))
            milkshake = new Zero_shake();

        if(lactoseFree)
            milkshake.makeLactoseFree();

        return milkshake;
    }
}
