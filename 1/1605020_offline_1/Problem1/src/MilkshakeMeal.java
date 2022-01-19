public class MilkshakeMeal
{
    Milkshake milkshake;
    String topping;
    int added_price;
    String addedPriceReason;

    public MilkshakeMeal(MilkshakeMealBuilder builder)
    {
        this.milkshake = builder.milkshake;
        this.topping = builder.topping;

        added_price = 0;
        addedPriceReason = "";

        if(topping.equalsIgnoreCase("candy"))
        {
            added_price += 40;
            addedPriceReason = "for adding candy on top\n";
        }

        if(topping.equalsIgnoreCase("cookie"))
        {
            added_price += 50;
            addedPriceReason = "for adding cookie on top\n";
        }
    }

    @Override
    public String toString()
    {
        return  milkshake +
                "\ntopping='" + topping + '\'' +
                "\nadditional price " + added_price +" " + addedPriceReason +
                "\n total price = " + (milkshake.getTotalShakePrice()+added_price) +"\n\n";
    }
}
