public class Choco_shake extends Milkshake
{
    public Choco_shake()
    {
        super();

        ingredients.add("chocolate_syrup");
        ingredients.add("chocolate icecream");

        base_price = 230;
    }

    public String toString()
    {
        return "\nChocolate shake \n" + super.toString();
    }
}
