public class Strawberry_shake extends Milkshake
{
    public Strawberry_shake()
    {
        super();

        ingredients.add("strawberry_syrup");
        ingredients.add("Strawberry icecream");

        base_price = 200;
    }

    @Override
    public String toString()
    {
        return "\nStrawberry_shake \n" + super.toString();
    }
}
