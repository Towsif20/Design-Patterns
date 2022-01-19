public class MilkshakeMealBuilder
{
    Milkshake milkshake;
    String topping;


    public MilkshakeMealBuilder withBaseShake(Milkshake milkshake)
    {
        this.milkshake = milkshake;

        return this;
    }

    public MilkshakeMealBuilder withTopping(String topping)
    {
        this.topping = topping;

        return this;
    }


}
